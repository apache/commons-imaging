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
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.BinaryFileParser;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.apache.commons.imaging.formats.jpeg.JpegUtils;
import org.apache.commons.imaging.formats.jpeg.segments.DhtSegment;
import org.apache.commons.imaging.formats.jpeg.segments.DqtSegment;
import org.apache.commons.imaging.formats.jpeg.segments.SofnSegment;
import org.apache.commons.imaging.formats.jpeg.segments.SosSegment;

import static org.apache.commons.imaging.common.BinaryFunctions.*;

public class JpegDecoder extends BinaryFileParser implements JpegUtils.Visitor {
    /*
     * JPEG is an advanced image format that takes significant computation to
     * decode. Keep decoding fast: - Don't allocate memory inside loops,
     * allocate it once and reuse. - Minimize calculations per pixel and per
     * block (using lookup tables for YCbCr->RGB conversion doubled
     * performance). - Math.round() is slow, use (int)(x+0.5f) instead for
     * positive numbers.
     */

    private final DqtSegment.QuantizationTable[] quantizationTables = new DqtSegment.QuantizationTable[4];
    private final DhtSegment.HuffmanTable[] huffmanDCTables = new DhtSegment.HuffmanTable[4];
    private final DhtSegment.HuffmanTable[] huffmanACTables = new DhtSegment.HuffmanTable[4];
    private SofnSegment sofnSegment;
    private SosSegment sosSegment;
    private final float[][] scaledQuantizationTables = new float[4][];
    private BufferedImage image;
    private ImageReadException imageReadException;
    private IOException ioException;
    private final int[] zz = new int[64];
    private final int[] blockInt = new int[64];
    private final float[] block = new float[64];

    public boolean beginSOS() {
        return true;
    }

    public void visitSOS(final int marker, final byte[] markerBytes, final byte[] imageData) {
        final ByteArrayInputStream is = new ByteArrayInputStream(imageData);
        try {
            final int segmentLength = read2Bytes("segmentLength", is, "Not a Valid JPEG File", getByteOrder());
            final byte[] sosSegmentBytes = readBytes("SosSegment",
                    is, segmentLength - 2, "Not a Valid JPEG File");
            sosSegment = new SosSegment(marker, sosSegmentBytes);

            int hMax = 0;
            int vMax = 0;
            for (int i = 0; i < sofnSegment.numberOfComponents; i++) {
                hMax = Math.max(hMax,
                        sofnSegment.getComponents(i).horizontalSamplingFactor);
                vMax = Math.max(vMax,
                        sofnSegment.getComponents(i).verticalSamplingFactor);
            }
            final int hSize = 8 * hMax;
            final int vSize = 8 * vMax;

            final JpegInputStream bitInputStream = new JpegInputStream(is);
            final int xMCUs = (sofnSegment.width + hSize - 1) / hSize;
            final int yMCUs = (sofnSegment.height + vSize - 1) / vSize;
            final Block[] mcu = allocateMCUMemory();
            final Block[] scaledMCU = new Block[mcu.length];
            for (int i = 0; i < scaledMCU.length; i++) {
                scaledMCU[i] = new Block(hSize, vSize);
            }
            final int[] preds = new int[sofnSegment.numberOfComponents];
            ColorModel colorModel;
            WritableRaster raster;
            if (sofnSegment.numberOfComponents == 3) {
                colorModel = new DirectColorModel(24, 0x00ff0000, 0x0000ff00,
                        0x000000ff);
                raster = Raster.createPackedRaster(DataBuffer.TYPE_INT,
                        sofnSegment.width, sofnSegment.height, new int[] {
                                0x00ff0000, 0x0000ff00, 0x000000ff }, null);
            } else if (sofnSegment.numberOfComponents == 1) {
                colorModel = new DirectColorModel(24, 0x00ff0000, 0x0000ff00,
                        0x000000ff);
                raster = Raster.createPackedRaster(DataBuffer.TYPE_INT,
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
            final DataBuffer dataBuffer = raster.getDataBuffer();

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
                                final int Y = scaledMCU[0].samples[srcRowOffset + x2];
                                final int Cb = scaledMCU[1].samples[srcRowOffset + x2];
                                final int Cr = scaledMCU[2].samples[srcRowOffset + x2];
                                final int rgb = YCbCrConverter.convertYCbCrToRGB(Y,
                                        Cb, Cr);
                                dataBuffer.setElem(dstRowOffset + x2, rgb);
                            } else if (mcu.length == 1) {
                                final int Y = scaledMCU[0].samples[srcRowOffset + x2];
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
        } catch (final ImageReadException imageReadEx) {
            imageReadException = imageReadEx;
        } catch (final IOException ioEx) {
            ioException = ioEx;
        } catch (final RuntimeException ex) {
            // Corrupt images can throw NPE and IOOBE
            imageReadException = new ImageReadException("Error parsing JPEG",
                    ex);
        }
    }

    public boolean visitSegment(final int marker, final byte[] markerBytes,
            final int segmentLength, final byte[] segmentLengthBytes, final byte[] segmentData)
            throws ImageReadException, IOException {
        final int[] sofnSegments = {
                JpegConstants.SOF0_MARKER,
                JpegConstants.SOF1_MARKER,
                JpegConstants.SOF2_MARKER,
                JpegConstants.SOF3_MARKER,
                JpegConstants.SOF5_MARKER,
                JpegConstants.SOF6_MARKER,
                JpegConstants.SOF7_MARKER,
                JpegConstants.SOF9_MARKER,
                JpegConstants.SOF10_MARKER,
                JpegConstants.SOF11_MARKER,
                JpegConstants.SOF13_MARKER,
                JpegConstants.SOF14_MARKER,
                JpegConstants.SOF15_MARKER,
        };

        if (Arrays.binarySearch(sofnSegments, marker) >= 0) {
            if (marker != JpegConstants.SOF0_MARKER) {
                throw new ImageReadException("Only sequential, baseline JPEGs "
                        + "are supported at the moment");
            }
            sofnSegment = new SofnSegment(marker, segmentData);
        } else if (marker == JpegConstants.DQT_MARKER) {
            final DqtSegment dqtSegment = new DqtSegment(marker, segmentData);
            for (int i = 0; i < dqtSegment.quantizationTables.size(); i++) {
                final DqtSegment.QuantizationTable table = dqtSegment.quantizationTables
                        .get(i);
                if (0 > table.destinationIdentifier
                        || table.destinationIdentifier >= quantizationTables.length) {
                    throw new ImageReadException(
                            "Invalid quantization table identifier "
                                    + table.destinationIdentifier);
                }
                quantizationTables[table.destinationIdentifier] = table;
                final int[] quantizationMatrixInt = new int[64];
                ZigZag.zigZagToBlock(table.elements, quantizationMatrixInt);
                final float[] quantizationMatrixFloat = new float[64];
                for (int j = 0; j < 64; j++) {
                    quantizationMatrixFloat[j] = quantizationMatrixInt[j];
                }
                Dct.scaleDequantizationMatrix(quantizationMatrixFloat);
                scaledQuantizationTables[table.destinationIdentifier] = quantizationMatrixFloat;
            }
        } else if (marker == JpegConstants.DHT_MARKER) {
            final DhtSegment dhtSegment = new DhtSegment(marker, segmentData);
            for (int i = 0; i < dhtSegment.huffmanTables.size(); i++) {
                final DhtSegment.HuffmanTable table = dhtSegment.huffmanTables.get(i);
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

    private void rescaleMCU(final Block[] dataUnits, final int hSize, final int vSize, final Block[] ret) {
        for (int i = 0; i < dataUnits.length; i++) {
            final Block dataUnit = dataUnits[i];
            if (dataUnit.width == hSize && dataUnit.height == vSize) {
                System.arraycopy(dataUnit.samples, 0, ret[i].samples, 0, hSize
                        * vSize);
            } else {
                final int hScale = hSize / dataUnit.width;
                final int vScale = vSize / dataUnit.height;
                if (hScale == 2 && vScale == 2) {
                    int srcRowOffset = 0;
                    int dstRowOffset = 0;
                    for (int y = 0; y < dataUnit.height; y++) {
                        for (int x = 0; x < hSize; x++) {
                            final int sample = dataUnit.samples[srcRowOffset + (x >> 1)];
                            ret[i].samples[dstRowOffset + x] = sample;
                            ret[i].samples[dstRowOffset + hSize + x] = sample;
                        }
                        srcRowOffset += dataUnit.width;
                        dstRowOffset += 2 * hSize;
                    }
                } else {
                    // FIXME: optimize
                    int dstRowOffset = 0;
                    for (int y = 0; y < vSize; y++) {
                        for (int x = 0; x < hSize; x++) {
                            ret[i].samples[dstRowOffset + x] = dataUnit.samples[(y / vScale)
                                    * dataUnit.width + (x / hScale)];
                        }
                        dstRowOffset += hSize;
                    }
                }
            }
        }
    }

    private Block[] allocateMCUMemory() throws ImageReadException {
        final Block[] mcu = new Block[sosSegment.numberOfComponents];
        for (int i = 0; i < sosSegment.numberOfComponents; i++) {
            final SosSegment.Component scanComponent = sosSegment.getComponents(i);
            SofnSegment.Component frameComponent = null;
            for (int j = 0; j < sofnSegment.numberOfComponents; j++) {
                if (sofnSegment.getComponents(j).componentIdentifier == scanComponent.scanComponentSelector) {
                    frameComponent = sofnSegment.getComponents(j);
                    break;
                }
            }
            if (frameComponent == null) {
                throw new ImageReadException("Invalid component");
            }
            final Block fullBlock = new Block(
                    8 * frameComponent.horizontalSamplingFactor,
                    8 * frameComponent.verticalSamplingFactor);
            mcu[i] = fullBlock;
        }
        return mcu;
    }

    private void readMCU(final JpegInputStream is, final int[] preds, final Block[] mcu)
            throws IOException, ImageReadException {
        for (int i = 0; i < sosSegment.numberOfComponents; i++) {
            final SosSegment.Component scanComponent = sosSegment.getComponents(i);
            SofnSegment.Component frameComponent = null;
            for (int j = 0; j < sofnSegment.numberOfComponents; j++) {
                if (sofnSegment.getComponents(j).componentIdentifier == scanComponent.scanComponentSelector) {
                    frameComponent = sofnSegment.getComponents(j);
                    break;
                }
            }
            if (frameComponent == null) {
                throw new ImageReadException("Invalid component");
            }
            final Block fullBlock = mcu[i];
            for (int y = 0; y < frameComponent.verticalSamplingFactor; y++) {
                for (int x = 0; x < frameComponent.horizontalSamplingFactor; x++) {
                    Arrays.fill(zz, 0);
                    // page 104 of T.81
                    final int t = decode(
                            is,
                            huffmanDCTables[scanComponent.dcCodingTableSelector]);
                    int diff = receive(t, is);
                    diff = extend(diff, t);
                    zz[0] = preds[i] + diff;
                    preds[i] = zz[0];

                    // "Decode_AC_coefficients", figure F.13, page 106 of T.81
                    int k = 1;
                    while (true) {
                        final int rs = decode(
                                is,
                                huffmanACTables[scanComponent.acCodingTableSelector]);
                        final int ssss = rs & 0xf;
                        final int rrrr = rs >> 4;
                        final int r = rrrr;

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

                    final float[] scaledQuantizationTable = scaledQuantizationTables[frameComponent.quantTabDestSelector];
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

    private static int fastRound(final float x) {
        return (int) (x + 0.5f);
    }

    private int extend(int v, final int t) {
        // "EXTEND", section F.2.2.1, figure F.12, page 105 of T.81
        int vt = (1 << (t - 1));
        while (v < vt) {
            vt = (-1 << t) + 1;
            v += vt;
        }
        return v;
    }

    private int receive(final int ssss, final JpegInputStream is) throws IOException,
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

    private int decode(final JpegInputStream is, final DhtSegment.HuffmanTable huffmanTable)
            throws IOException, ImageReadException {
        // "DECODE", section F.2.2.3, figure F.16, page 109 of T.81
        int i = 1;
        int code = is.nextBit();
        while (code > huffmanTable.getMaxCode()[i]) {
            i++;
            code = (code << 1) | is.nextBit();
        }
        int j = huffmanTable.getValPtr()[i];
        j += code - huffmanTable.getMinCode()[i];
        return huffmanTable.getHuffVal()[j];
    }

    public BufferedImage decode(final ByteSource byteSource) throws IOException,
            ImageReadException {
        final JpegUtils jpegUtils = new JpegUtils();
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
