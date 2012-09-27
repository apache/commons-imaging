/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */

package org.apache.commons.imaging.formats.jpeg.decoder;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DirectColorModel;
import java.awt.image.WritableRaster;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.BinaryFileParser;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.formats.jpeg.Block;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.apache.commons.imaging.formats.jpeg.JpegUtils;
import org.apache.commons.imaging.formats.jpeg.ZigZag;
import org.apache.commons.imaging.formats.jpeg.segments.DhtSegment;
import org.apache.commons.imaging.formats.jpeg.segments.DqtSegment;
import org.apache.commons.imaging.formats.jpeg.segments.SofnSegment;
import org.apache.commons.imaging.formats.jpeg.segments.SosSegment;

public class JpegDecoder extends BinaryFileParser implements JpegUtils.Visitor,
        JpegConstants {
    /*
     * JPEG is an advanced image format that takes significant computation to
     * decode. Keep decoding fast: - Don't allocate memory inside loops,
     * allocate it once and reuse. - Minimize calculations per pixel and per
     * block (using lookup tables for YCbCr->RGB conversion doubled
     * performance). - Math.round() is slow, use (int)(x+0.5f) instead for
     * positive numbers.
     */

    private DqtSegment.QuantizationTable[] quantizationTables = new DqtSegment.QuantizationTable[4];
    private DhtSegment.HuffmanTable[] huffmanDCTables = new DhtSegment.HuffmanTable[4];
    private DhtSegment.HuffmanTable[] huffmanACTables = new DhtSegment.HuffmanTable[4];
    private SofnSegment sofnSegment;
    private SosSegment sosSegment;
    private float[][] scaledQuantizationTables = new float[4][];
    private BufferedImage image = null;
    private ImageReadException imageReadException = null;
    private IOException ioException = null;

    public boolean beginSOS() {
        return true;
    }

    public void visitSOS(int marker, byte markerBytes[], byte imageData[]) {
        ByteArrayInputStream is = new ByteArrayInputStream(imageData);
        try {
            int segmentLength = read2Bytes("segmentLength", is,
                    "Not a Valid JPEG File");
            byte[] sosSegmentBytes = readByteArray("SosSegment",
                    segmentLength - 2, is, "Not a Valid JPEG File");
            sosSegment = new SosSegment(marker, sosSegmentBytes);

            int hMax = 0;
            int vMax = 0;
            for (int i = 0; i < sofnSegment.numberOfComponents; i++) {
                hMax = Math.max(hMax,
                        sofnSegment.components[i].horizontalSamplingFactor);
                vMax = Math.max(vMax,
                        sofnSegment.components[i].verticalSamplingFactor);
            }
            int hSize = 8 * hMax;
            int vSize = 8 * vMax;

            JpegInputStream bitInputStream = new JpegInputStream(is);
            int xMCUs = (sofnSegment.width + hSize - 1) / hSize;
            int yMCUs = (sofnSegment.height + vSize - 1) / vSize;
            Block[] mcu = allocateMCUMemory();
            Block[] scaledMCU = new Block[mcu.length];
            for (int i = 0; i < scaledMCU.length; i++) {
                scaledMCU[i] = new Block(hSize, vSize);
            }
            int[] preds = new int[sofnSegment.numberOfComponents];
            ColorModel colorModel;
            WritableRaster raster;
            if (sofnSegment.numberOfComponents == 3) {
                colorModel = new DirectColorModel(24, 0x00ff0000, 0x0000ff00,
                        0x000000ff);
                raster = WritableRaster.createPackedRaster(DataBuffer.TYPE_INT,
                        sofnSegment.width, sofnSegment.height, new int[] {
                                0x00ff0000, 0x0000ff00, 0x000000ff }, null);
            } else if (sofnSegment.numberOfComponents == 1) {
                colorModel = new DirectColorModel(24, 0x00ff0000, 0x0000ff00,
                        0x000000ff);
                raster = WritableRaster.createPackedRaster(DataBuffer.TYPE_INT,
                        sofnSegment.width, sofnSegment.height, new int[] {
                                0x00ff0000, 0x0000ff00, 0x000000ff }, null);
                // FIXME: why do images come out too bright with CS_GRAY?
                // colorModel = new ComponentColorModel(
                // ColorSpace.getInstance(ColorSpace.CS_GRAY), false, true,
                // Transparency.OPAQUE, DataBuffer.TYPE_BYTE);
                // raster = colorModel.createCompatibleWritableRaster(
                // sofnSegment.width, sofnSegment.height);
            } else {
                throw new ImageReadException(sofnSegment.numberOfComponents
                        + " components are invalid or unsupported");
            }
            DataBuffer dataBuffer = raster.getDataBuffer();

            for (int y1 = 0; y1 < vSize * yMCUs; y1 += vSize) {
                for (int x1 = 0; x1 < hSize * xMCUs; x1 += hSize) {
                    readMCU(bitInputStream, preds, mcu);
                    rescaleMCU(mcu, hSize, vSize, scaledMCU);
                    int srcRowOffset = 0;
                    int dstRowOffset = y1 * sofnSegment.width + x1;
                    for (int y2 = 0; y2 < vSize && y1 + y2 < sofnSegment.height; y2++) {
                        for (int x2 = 0; x2 < hSize
                                && x1 + x2 < sofnSegment.width; x2++) {
                            if (scaledMCU.length == 3) {
                                int Y = scaledMCU[0].samples[srcRowOffset + x2];
                                int Cb = scaledMCU[1].samples[srcRowOffset + x2];
                                int Cr = scaledMCU[2].samples[srcRowOffset + x2];
                                int rgb = YCbCrConverter.convertYCbCrToRGB(Y,
                                        Cb, Cr);
                                dataBuffer.setElem(dstRowOffset + x2, rgb);
                            } else if (mcu.length == 1) {
                                int Y = scaledMCU[0].samples[srcRowOffset + x2];
                                dataBuffer.setElem(dstRowOffset + x2, (Y << 16)
                                        | (Y << 8) | Y);
                            } else {
                                throw new ImageReadException(
                                        "Unsupported JPEG with " + mcu.length
                                                + " components");
                            }
                        }
                        srcRowOffset += hSize;
                        dstRowOffset += sofnSegment.width;
                    }
                }
            }
            image = new BufferedImage(colorModel, raster,
                    colorModel.isAlphaPremultiplied(), new Properties());
            // byte[] remainder = super.getStreamBytes(is);
            // for (int i = 0; i < remainder.length; i++)
            // {
            // System.out.println("" + i + " = " +
            // Integer.toHexString(remainder[i]));
            // }
        } catch (ImageReadException imageReadEx) {
            imageReadException = imageReadEx;
        } catch (IOException ioEx) {
            ioException = ioEx;
        } catch (RuntimeException ex) {
            // Corrupt images can throw NPE and IOOBE
            imageReadException = new ImageReadException("Error parsing JPEG",
                    ex);
        }
    }

    public boolean visitSegment(int marker, byte[] markerBytes,
            int segmentLength, byte[] segmentLengthBytes, byte[] segmentData)
            throws ImageReadException, IOException {
        final int[] sofnSegments = { SOF0Marker, SOF1Marker, SOF2Marker,
                SOF3Marker, SOF5Marker, SOF6Marker, SOF7Marker, SOF9Marker,
                SOF10Marker, SOF11Marker, SOF13Marker, SOF14Marker,
                SOF15Marker, };

        if (Arrays.binarySearch(sofnSegments, marker) >= 0) {
            if (marker != SOF0Marker) {
                throw new ImageReadException("Only sequential, baseline JPEGs "
                        + "are supported at the moment");
            }
            sofnSegment = new SofnSegment(marker, segmentData);
        } else if (marker == DQTMarker) {
            DqtSegment dqtSegment = new DqtSegment(marker, segmentData);
            for (int i = 0; i < dqtSegment.quantizationTables.size(); i++) {
                DqtSegment.QuantizationTable table = dqtSegment.quantizationTables
                        .get(i);
                if (0 > table.destinationIdentifier
                        || table.destinationIdentifier >= quantizationTables.length) {
                    throw new ImageReadException(
                            "Invalid quantization table identifier "
                                    + table.destinationIdentifier);
                }
                quantizationTables[table.destinationIdentifier] = table;
                int[] quantizationMatrixInt = new int[64];
                ZigZag.zigZagToBlock(table.elements, quantizationMatrixInt);
                float[] quantizationMatrixFloat = new float[64];
                for (int j = 0; j < 64; j++) {
                    quantizationMatrixFloat[j] = quantizationMatrixInt[j];
                }
                Dct.scaleDequantizationMatrix(quantizationMatrixFloat);
                scaledQuantizationTables[table.destinationIdentifier] = quantizationMatrixFloat;
            }
        } else if (marker == DHTMarker) {
            DhtSegment dhtSegment = new DhtSegment(marker, segmentData);
            for (int i = 0; i < dhtSegment.huffmanTables.size(); i++) {
                DhtSegment.HuffmanTable table = dhtSegment.huffmanTables.get(i);
                DhtSegment.HuffmanTable[] tables;
                if (table.tableClass == 0) {
                    tables = huffmanDCTables;
                } else if (table.tableClass == 1) {
                    tables = huffmanACTables;
                } else {
                    throw new ImageReadException("Invalid huffman table class "
                            + table.tableClass);
                }
                if (0 > table.destinationIdentifier
                        || table.destinationIdentifier >= tables.length) {
                    throw new ImageReadException(
                            "Invalid huffman table identifier "
                                    + table.destinationIdentifier);
                }
                tables[table.destinationIdentifier] = table;
            }
        }
        return true;
    }

    private void rescaleMCU(Block[] dataUnits, int hSize, int vSize, Block[] ret) {
        for (int i = 0; i < dataUnits.length; i++) {
            Block block = dataUnits[i];
            if (block.width == hSize && block.height == vSize) {
                System.arraycopy(block.samples, 0, ret[i].samples, 0, hSize
                        * vSize);
            } else {
                int hScale = hSize / block.width;
                int vScale = vSize / block.height;
                if (hScale == 2 && vScale == 2) {
                    int srcRowOffset = 0;
                    int dstRowOffset = 0;
                    for (int y = 0; y < block.height; y++) {
                        for (int x = 0; x < hSize; x++) {
                            int sample = block.samples[srcRowOffset + (x >> 1)];
                            ret[i].samples[dstRowOffset + x] = sample;
                            ret[i].samples[dstRowOffset + hSize + x] = sample;
                        }
                        srcRowOffset += block.width;
                        dstRowOffset += 2 * hSize;
                    }
                } else {
                    // FIXME: optimize
                    int dstRowOffset = 0;
                    for (int y = 0; y < vSize; y++) {
                        for (int x = 0; x < hSize; x++) {
                            ret[i].samples[dstRowOffset + x] = block.samples[(y / vScale)
                                    * block.width + (x / hScale)];
                        }
                        dstRowOffset += hSize;
                    }
                }
            }
        }
    }

    private Block[] allocateMCUMemory() throws ImageReadException {
        Block[] mcu = new Block[sosSegment.numberOfComponents];
        for (int i = 0; i < sosSegment.numberOfComponents; i++) {
            SosSegment.Component scanComponent = sosSegment.components[i];
            SofnSegment.Component frameComponent = null;
            for (int j = 0; j < sofnSegment.numberOfComponents; j++) {
                if (sofnSegment.components[j].componentIdentifier == scanComponent.scanComponentSelector) {
                    frameComponent = sofnSegment.components[j];
                    break;
                }
            }
            if (frameComponent == null) {
                throw new ImageReadException("Invalid component");
            }
            Block fullBlock = new Block(
                    8 * frameComponent.horizontalSamplingFactor,
                    8 * frameComponent.verticalSamplingFactor);
            mcu[i] = fullBlock;
        }
        return mcu;
    }

    private int[] zz = new int[64];
    private int[] blockInt = new int[64];
    private float[] block = new float[64];

    private void readMCU(JpegInputStream is, int[] preds, Block[] mcu)
            throws IOException, ImageReadException {
        for (int i = 0; i < sosSegment.numberOfComponents; i++) {
            SosSegment.Component scanComponent = sosSegment.components[i];
            SofnSegment.Component frameComponent = null;
            for (int j = 0; j < sofnSegment.numberOfComponents; j++) {
                if (sofnSegment.components[j].componentIdentifier == scanComponent.scanComponentSelector) {
                    frameComponent = sofnSegment.components[j];
                    break;
                }
            }
            if (frameComponent == null) {
                throw new ImageReadException("Invalid component");
            }
            Block fullBlock = mcu[i];
            for (int y = 0; y < frameComponent.verticalSamplingFactor; y++) {
                for (int x = 0; x < frameComponent.horizontalSamplingFactor; x++) {
                    Arrays.fill(zz, 0);
                    // page 104 of T.81
                    int t = decode(
                            is,
                            huffmanDCTables[scanComponent.dcCodingTableSelector]);
                    int diff = receive(t, is);
                    diff = extend(diff, t);
                    zz[0] = preds[i] + diff;
                    preds[i] = zz[0];

                    // "Decode_AC_coefficients", figure F.13, page 106 of T.81
                    int k = 1;
                    while (true) {
                        int rs = decode(
                                is,
                                huffmanACTables[scanComponent.acCodingTableSelector]);
                        int ssss = rs & 0xf;
                        int rrrr = rs >> 4;
                        int r = rrrr;

                        if (ssss == 0) {
                            if (r == 15) {
                                k += 16;
                            } else {
                                break;
                            }
                        } else {
                            k += r;

                            // "Decode_ZZ(k)", figure F.14, page 107 of T.81
                            zz[k] = receive(ssss, is);
                            zz[k] = extend(zz[k], ssss);

                            if (k == 63) {
                                break;
                            } else {
                                k++;
                            }
                        }
                    }

                    final int shift = (1 << (sofnSegment.precision - 1));
                    final int max = (1 << sofnSegment.precision) - 1;

                    float[] scaledQuantizationTable = scaledQuantizationTables[frameComponent.quantTabDestSelector];
                    ZigZag.zigZagToBlock(zz, blockInt);
                    for (int j = 0; j < 64; j++) {
                        block[j] = blockInt[j] * scaledQuantizationTable[j];
                    }
                    Dct.inverseDCT8x8(block);

                    int dstRowOffset = 8 * y * 8
                            * frameComponent.horizontalSamplingFactor + 8 * x;
                    int srcNext = 0;
                    for (int yy = 0; yy < 8; yy++) {
                        for (int xx = 0; xx < 8; xx++) {
                            float sample = block[srcNext++];
                            sample += shift;
                            int result;
                            if (sample < 0) {
                                result = 0;
                            } else if (sample > max) {
                                result = max;
                            } else {
                                result = fastRound(sample);
                            }
                            fullBlock.samples[dstRowOffset + xx] = result;
                        }
                        dstRowOffset += 8 * frameComponent.horizontalSamplingFactor;
                    }
                }
            }
        }
    }

    private static int fastRound(float x) {
        return (int) (x + 0.5f);
    }

    private int extend(int v, int t) {
        // "EXTEND", section F.2.2.1, figure F.12, page 105 of T.81
        int vt = (1 << (t - 1));
        while (v < vt) {
            vt = (-1 << t) + 1;
            v += vt;
        }
        return v;
    }

    private int receive(int ssss, JpegInputStream is) throws IOException,
            ImageReadException {
        // "RECEIVE", section F.2.2.4, figure F.17, page 110 of T.81
        int i = 0;
        int v = 0;
        while (i != ssss) {
            i++;
            v = (v << 1) + is.nextBit();
        }
        return v;
    }

    private int decode(JpegInputStream is, DhtSegment.HuffmanTable huffmanTable)
            throws IOException, ImageReadException {
        // "DECODE", section F.2.2.3, figure F.16, page 109 of T.81
        int i = 1;
        int code = is.nextBit();
        while (code > huffmanTable.maxCode[i]) {
            i++;
            code = (code << 1) | is.nextBit();
        }
        int j = huffmanTable.valPtr[i];
        j += code - huffmanTable.minCode[i];
        int value = huffmanTable.huffVal[j];
        return value;
    }

    public BufferedImage decode(ByteSource byteSource) throws IOException,
            ImageReadException {
        JpegUtils jpegUtils = new JpegUtils();
        jpegUtils.traverseJFIF(byteSource, this);
        if (imageReadException != null) {
            throw imageReadException;
        }
        if (ioException != null) {
            throw ioException;
        }
        return image;
    }
}
