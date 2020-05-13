/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.imaging.formats.tiff.datareaders;

import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_COMPRESSION_CCITT_1D;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_COMPRESSION_CCITT_GROUP_3;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_COMPRESSION_CCITT_GROUP_4;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_COMPRESSION_DEFLATE_PKZIP;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_COMPRESSION_DEFLATE_ADOBE;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_COMPRESSION_LZW;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_COMPRESSION_PACKBITS;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_COMPRESSION_UNCOMPRESSED;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_FLAG_T4_OPTIONS_2D;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_FLAG_T4_OPTIONS_FILL;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_FLAG_T4_OPTIONS_UNCOMPRESSED_MODE;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_FLAG_T6_OPTIONS_UNCOMPRESSED_MODE;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.common.PackBits;
import org.apache.commons.imaging.common.itu_t4.T4AndT6Compression;
import org.apache.commons.imaging.common.mylzw.MyLzwDecompressor;
import org.apache.commons.imaging.common.ZlibDeflate;
import org.apache.commons.imaging.formats.tiff.TiffRasterData;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter;

/**
 * Defines the base class for the TIFF file reader classes. The TIFF format
 * defines two broad organizations for image pixel storage: strips and tiles.
 * This class defines common elements for both representations.
 * <p>
 * <strong>The TIFF Floating-Point Formats </strong>
 * <p>
 * In addition to providing images, TIFF files can supply data in the form of
 * numerical values. As of March 2020 the Commons Imaging library was extended
 * to support some floating-point data formats.
 * <p>
 * Unfortunately, the TIFF floating-point format allows for a lot of different
 * variations. At this time, only the most widely used of these are supported.
 * When this code was written, only a small set of test data products were
 * available. Thus it is likely that developers will wish to extend the
 * range of floating-point data that can be processed as
 * additional test data become available. When implementing extensions to this
 * logic, developers are reminded that image processing requires
 * the handling of literally millions of pixels, so attention to performance
 * is essential to a successful implementation (please see the notes in
 * DataReaderStrips.java for more information).
 * <p>
 * The TIFF floating-point specification is very poorly documented. So these
 * notes are included to provide clarification on at least some aspects of the
 * format. Some documentation and C-code examples are available in "TIFF
 * Technical Note 3, April 8, 2005)".
 * <p>
 * <strong>The Predictor==3 Case</strong>
 * <p>
 * TIFF specifies an extension for a predictor that is intended to improve data
 * compression ratios for floating-point values. This predictor is specified
 * using the TIFF predictor TAG with a value of 3 (see TIFF Technical Note 3).
 * Consider a 4-byte floating point value given in IEEE-754 format. Let f3 be
 * the high-order byte, with f2 the next highest, followed by
 * f1, and f0 for the low-order byte. This designation should not be confused
 * with the in-memory layout of the bytes (little-endian versus big-endian), but
 * rather their numerical values. The sign bit and upper 7 bits of the exponent
 * are given in the high-order byte, followed by the remaining sign bit and the
 * mantissa in the lower.
 * <p>
 * In many real-valued raster data sets, the sign and magnitude (exponent) of
 * the values change slowly. But the bits in the mantissa vary rapidly in a
 * semi-random manner. The information entropy in the mantissa tends to increase
 * in the lowest ordered bytes. Thus, the high-order bytes have more redundancy
 * than the low-order bytes and can compress more efficiently. To exploit this,
 * the TIFF format splits the bytes into groups based on their order-of-magnitude.
 * This splitting process takes place on a ROW-BY-ROW basis (note the emphasis,
 * this point is not clearly documented in the spec). For example, for a row of
 * length 3 pixels -- A, B, and C -- the data for two rows would be given as
 * shown below (again, ignoring endian issues):
 * <pre>
 *   Original:
 *      A3 A2 A1 A0   B3 B2 B1 B0   C3 C2 C1 C0
 *      D3 D3 D1 D0   E3 E2 E2 E0   F3 F2 F1 F0
 *
 *   Bytes split into groups by order-of-magnitude:
 *      A3 B3 C3   A2 B2 C2   A1 B1 C1   A0 B0 C0
 *      D3 E3 F3   D2 E2 F2   D1 E1 F1   D0 E0 F0
 * </pre>
 * To further improve the compression, the predictor takes the difference
 * of each subsequent bytes. Again, the differences (deltas) are computed on a
 * row-byte-row basis. For the most part, the differences combine bytes
 * associated with the same order-of-magnitude, though there is a special
 * transition at the end of each order-of-magnitude set (shown in parentheses):
 * <pre>
 *      A3, B3-A3, C3-B3, (A2-C3), B2-A2, C2-B2, (A1-C2), etc.
 *      D3, E3-D3, F3-D3, (D2-F3), E3-D2, etc.
 * </pre>
 * Once the predictor transform is complete, the data is stored using
 * conventional data compression techniques such as Deflate or LZW. In practice,
 * floating point data does not compress especially well, but using the above
 * technique, the TIFF process typically reduces the overall storage size by 20
 * to 30 percent (depending on the data). The TIFF Technical Note 3 specifies 3
 * data size formats for storing floating point values:
 * <pre>
 *     32 bits    IEEE-754 single-precision standard
 *     16 bits    IEEE-754 half-precision standard
 *     24 bits    A non-standard representation
 * </pre>
 * At this time, we have not obtained data samples for the smaller
 * representations used in combination with a predictor.
 * <p>
 * <strong>Interleaved formats</strong>
 * <p>
 * TIFF Technical Note 3 also provides sample code for interleaved data, such as
 * a real-valued vector or a complex pair. At this time no samples of
 * interleaved data were available. As a caveat, the specification that the
 * document provides has disadvantages in terms of code complexity and
 * performance. Because the interleaved evaluation is embedded inside the pixel
 * row and column loops, it puts a lot of redundant conditional evaluations
 * inside the double nested loops. It is recommended that when interleaved data
 * is implemented, it should get their own block of code so as not to interfere
 * with the processing of the more common non-interleaved variations.
 */
@SuppressWarnings("PMD.TooManyStaticImports")
public abstract class ImageDataReader {
    protected final TiffDirectory directory;
    protected final PhotometricInterpreter photometricInterpreter;
    private final int[] bitsPerSample;
    protected final int bitsPerSampleLength;
    private final int[] last;

    protected final int predictor;
    protected final int samplesPerPixel;
    protected final int width;
    protected final int height;
    protected final int sampleFormat;

    public ImageDataReader(final TiffDirectory directory,
            final PhotometricInterpreter photometricInterpreter, final int[] bitsPerSample,
        final int predictor, final int samplesPerPixel, final int sampleFormat,
        final int width, final int height) {
        this.directory = directory;
        this.photometricInterpreter = photometricInterpreter;
        this.bitsPerSample = bitsPerSample;
        this.bitsPerSampleLength = bitsPerSample.length;
        this.samplesPerPixel = samplesPerPixel;
        this.sampleFormat = sampleFormat;
        this.predictor = predictor;
        this.width = width;
        this.height = height;
        last = new int[samplesPerPixel];
    }

    // public abstract void readImageData(BufferedImage bi, ByteSource
    // byteSource)
    public abstract void readImageData(ImageBuilder imageBuilder)
            throws ImageReadException, IOException;


    public abstract BufferedImage readImageData(Rectangle subImage)
            throws ImageReadException, IOException;

    /**
     * Checks if all the bits per sample entries are the same size
     * @param size the size to check
     * @return true if all the bits per sample entries are the same
     */
    protected boolean isHomogenous(final int size) {
        for (final int element : bitsPerSample) {
            if (element != size) {
                return false;
            }
        }
        return true;
    }

    /**
     * Reads samples and returns them in an int array.
     *
     * @param bis
     *            the stream to read from
     * @param result
     *            the samples array to populate, must be the same length as
     *            bitsPerSample.length
     * @throws IOException
     */
    void getSamplesAsBytes(final BitInputStream bis, final int[] result) throws IOException {
        for (int i = 0; i < bitsPerSample.length; i++) {
            final int bits = bitsPerSample[i];
            int sample = bis.readBits(bits);
            if (bits < 8) {
                final int sign = sample & 1;
                sample = sample << (8 - bits); // scale to byte.
                if (sign > 0) {
                    sample = sample | ((1 << (8 - bits)) - 1); // extend to byte
                }
            } else if (bits > 8) {
                sample = sample >> (bits - 8); // extend to byte.
            }
            result[i] = sample;
        }
    }

    protected void resetPredictor() {
        Arrays.fill(last, 0);
    }

    protected int[] applyPredictor(final int[] samples) {
        if (predictor == 2) {
            // Horizontal differencing.
            for (int i = 0; i < samples.length; i++) {
                samples[i] = 0xff & (samples[i] + last[i]);
                last[i] = samples[i];
            }
        }

        return samples;
    }

    protected byte[] decompress(final byte[] compressedInput, final int compression,
            final int expectedSize, final int tileWidth, final int tileHeight)
            throws ImageReadException, IOException {
        final TiffField fillOrderField = directory.findField(TiffTagConstants.TIFF_TAG_FILL_ORDER);
        int fillOrder = TiffTagConstants.FILL_ORDER_VALUE_NORMAL;
        if (fillOrderField != null) {
            fillOrder = fillOrderField.getIntValue();
        }
        final byte[] compressedOrdered; // re-ordered bytes (if necessary)
        if (fillOrder == TiffTagConstants.FILL_ORDER_VALUE_NORMAL) {
            compressedOrdered = compressedInput;
            // good
        } else if (fillOrder == TiffTagConstants.FILL_ORDER_VALUE_REVERSED) {
            compressedOrdered = new byte[compressedInput.length];
            for (int i = 0; i < compressedInput.length; i++) {
                compressedOrdered[i] = (byte) (Integer.reverse(0xff & compressedInput[i]) >>> 24);
            }
        } else {
            throw new ImageReadException("TIFF FillOrder=" + fillOrder
                    + " is invalid");
        }

        switch (compression) {
        case TIFF_COMPRESSION_UNCOMPRESSED: // None;
            return compressedOrdered;
        case TIFF_COMPRESSION_CCITT_1D: // CCITT Group 3 1-Dimensional Modified
                                        // Huffman run-length encoding.
            return T4AndT6Compression.decompressModifiedHuffman(compressedOrdered,
                    tileWidth, tileHeight);
        case TIFF_COMPRESSION_CCITT_GROUP_3: {
            int t4Options = 0;
            final TiffField field = directory.findField(TiffTagConstants.TIFF_TAG_T4_OPTIONS);
            if (field != null) {
                t4Options = field.getIntValue();
            }
            final boolean is2D = (t4Options & TIFF_FLAG_T4_OPTIONS_2D) != 0;
            final boolean usesUncompressedMode = (t4Options & TIFF_FLAG_T4_OPTIONS_UNCOMPRESSED_MODE) != 0;
            if (usesUncompressedMode) {
                throw new ImageReadException(
                        "T.4 compression with the uncompressed mode extension is not yet supported");
            }
            final boolean hasFillBitsBeforeEOL = (t4Options & TIFF_FLAG_T4_OPTIONS_FILL) != 0;
            if (is2D) {
                return T4AndT6Compression.decompressT4_2D(compressedOrdered,
                        tileWidth, tileHeight, hasFillBitsBeforeEOL);
            }
            return T4AndT6Compression.decompressT4_1D(compressedOrdered,
                    tileWidth, tileHeight, hasFillBitsBeforeEOL);
        }
        case TIFF_COMPRESSION_CCITT_GROUP_4: {
            int t6Options = 0;
            final TiffField field = directory.findField(TiffTagConstants.TIFF_TAG_T6_OPTIONS);
            if (field != null) {
                t6Options = field.getIntValue();
            }
            final boolean usesUncompressedMode = (t6Options & TIFF_FLAG_T6_OPTIONS_UNCOMPRESSED_MODE) != 0;
            if (usesUncompressedMode) {
                throw new ImageReadException(
                        "T.6 compression with the uncompressed mode extension is not yet supported");
            }
            return T4AndT6Compression.decompressT6(compressedOrdered, tileWidth,
                    tileHeight);
        }
        case TIFF_COMPRESSION_LZW: // LZW
        {
            final InputStream is = new ByteArrayInputStream(compressedOrdered);

            final int lzwMinimumCodeSize = 8;

            final MyLzwDecompressor myLzwDecompressor = new MyLzwDecompressor(
                    lzwMinimumCodeSize, ByteOrder.BIG_ENDIAN);

            myLzwDecompressor.setTiffLZWMode();

            return myLzwDecompressor.decompress(is, expectedSize);
        }

        case TIFF_COMPRESSION_PACKBITS: // Packbits
        {
            return new PackBits().decompress(compressedOrdered, expectedSize);
        }

        case TIFF_COMPRESSION_DEFLATE_ADOBE:
        case TIFF_COMPRESSION_DEFLATE_PKZIP: // deflate
        {
            return ZlibDeflate.decompress(compressedInput, expectedSize);
        }

        default:
            throw new ImageReadException("Tiff: unknown/unsupported compression: " + compression);
        }
    }

    /**
     * Given a source file that specifies the floating-point data format, unpack
     * the raw bytes obtained from the source file and organize them into an
     * array of integers containing the bit-equivalent of IEEE-754 32-bit
     * floats. Source files containing 64 bit doubles are downcast to floats.
     * <p>
     * This method supports either the tile format or the strip format of TIFF
     * source files. The scan size indicates the number of columns to be
     * extracted. For strips, the width and the scan size are always the full
     * width of the image. For tiles, the scan size is the full width of the
     * tile, but the width may be smaller in the cases where the tiles do not
     * evenly divide the width (for example, a 256 pixel wide tile in a 257
     * pixel wide image would result in two columns of tiles, the second column
     * having only one column of pixels that were worth extracting.
     *
     * @param width the width of the data block to be extracted
     * @param height the height of the data block to be extracted
     * @param scansize the number of pixels in a single row of the block
     * @param bytes the raw bytes
     * @param predictor the predictor specified by the source, only predictor 3
     * is supported.
     * @param bitsPerSample the number of bits per sample, 32 or 64.
     * @param byteOrder the byte order for the source data
     * @return a valid array of integers in row major order, dimensions
     * scan-size wide and height height.
     * @throws ImageReadException in the event of an invalid format.
     */
    protected int[] unpackFloatingPointSamples(
        int width,
        int height,
        int scansize,
        byte[] bytes,
        int predictor,
        int bitsPerSample, ByteOrder byteOrder)
        throws ImageReadException {
        int bytesPerSample = bitsPerSample / 8;
        int nBytes = bytesPerSample * scansize * height;
        int length = bytes.length < nBytes ? nBytes / scansize : height;

        int[] samples = new int[scansize * height];
        // floating-point differencing is indicated by a predictor value of 3.
        if (predictor == TiffTagConstants.PREDICTOR_VALUE_FLOATING_POINT_DIFFERENCING) {
            // at this time, this class supports the 32-bit format.  The
            // main reason for this is that we have not located sample data
            // that can be used for testing and analysis.
            if (bitsPerSample != 32) {
                throw new ImageReadException(
                    "Imaging does not yet support floating-point data"
                    + " with predictor type 3 for "
                    + bitsPerSample + " bits per sample");
            }
            int bytesInRow = scansize * 4;
            for (int i = 0; i < length; i++) {
                int aOffset = i * bytesInRow;
                int bOffset = aOffset + scansize;
                int cOffset = bOffset + scansize;
                int dOffset = cOffset + scansize;
                // in this loop, the source bytes give delta values.
                // we adjust them to give true values.  This operation is
                // done on a row-by-row basis.
                for (int j = 1; j < bytesInRow; j++) {
                    bytes[aOffset + j] += bytes[aOffset + j - 1];
                }
                // pack the bytes into the integer bit-equivalent of
                // floating point values
                int index = i * scansize;
                for (int j = 0; j < width; j++) {
                    int a = bytes[aOffset + j];
                    int b = bytes[bOffset + j];
                    int c = bytes[cOffset + j];
                    int d = bytes[dOffset + j];
                    // Pack the 4 byte components into a single integer
                    // in the byte order used by the TIFF standard
                    samples[index++] = ((a & 0xff) << 24)
                        | ((b & 0xff) << 16)
                        | ((c & 0xff) << 8)
                        | (d & 0xff);
                }
            }
            return samples;
        }  // end of predictor==3 case.

        // simple packing case, 64 or 32 bits --------------------------
        if (bitsPerSample == 64) {
            int k = 0;
            int index = 0;
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < scansize; j++) {
                    long b0 = bytes[k++] & 0xffL;
                    long b1 = bytes[k++] & 0xffL;
                    long b2 = bytes[k++] & 0xffL;
                    long b3 = bytes[k++] & 0xffL;
                    long b4 = bytes[k++] & 0xffL;
                    long b5 = bytes[k++] & 0xffL;
                    long b6 = bytes[k++] & 0xffL;
                    long b7 = bytes[k++] & 0xffL;
                    long sbits;
                    if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                        sbits = (b7 << 56)
                            | (b6 << 48)
                            | (b5 << 40)
                            | (b4 << 32)
                            | (b3 << 24)
                            | (b2 << 16)
                            | (b1 << 8)
                            | b0;

                    } else {
                        sbits = (b0 << 56)
                            | (b1 << 48)
                            | (b2 << 40)
                            | (b3 << 32)
                            | (b4 << 24)
                            | (b5 << 16)
                            | (b6 << 8)
                            | b7;
                    }
                    // since the photometric interpreter does not
                    // currently support doubles, we need to replace this
                    // element with a float.  This action is inefficient and
                    // should be improved.
                    float f = (float) Double.longBitsToDouble(sbits);
                    samples[index++] = Float.floatToRawIntBits(f);
                }
            }
        } else if (bitsPerSample == 32) {
            int k = 0;
            int index = 0;
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < scansize; j++) {
                    int b0 = bytes[k++] & 0xff;
                    int b1 = bytes[k++] & 0xff;
                    int b2 = bytes[k++] & 0xff;
                    int b3 = bytes[k++] & 0xff;
                    int sbits;
                    if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                        sbits
                            = (b3 << 24)
                            | (b2 << 16)
                            | (b1 << 8)
                            | b0;

                    } else {
                        sbits
                            = (b0 << 24)
                            | (b1 << 16)
                            | (b2 << 8)
                            | b3;
                    }
                    // since the photometric interpreter does not
                    // currently support doubles, we need to replace this
                    // element with a float.  This action is inefficient and
                    // should be improved.
                    samples[index++] = sbits;
                }
            }
        } else {
            throw new ImageReadException(
                "Imaging does not support floating-point samples with "
                + bitsPerSample + " bits per sample");
        }

        return samples;
    }

    /**
     *
     * @param xBlock coordinate of block relative to source data
     * @param yBlock coordinate of block relative to source data
     * @param blockWidth width of block, in pixels
     * @param blockHeight height of block in pixels
     * @param blockData the data for the block
     * @param xRaster coordinate of raster relative to source data
     * @param yRaster coordinate of raster relative to source data
     * @param rasterWidth width of the raster (always smaller than source data)
     * @param rasterHeight height of the raster (always smaller than source
     * data)
     * @param rasterData the raster data.
     */
    void transferBlockToRaster(int xBlock, int yBlock,
        int blockWidth, int blockHeight, int blockData[],
        int xRaster, int yRaster,
        int rasterWidth, int rasterHeight, float[] rasterData) {

        // xR0, yR0 are the coordinates within the raster (upper-left corner)
        // xR1, yR1 are ONE PAST the coordinates of the lower-right corner
        int xR0 = xBlock - xRaster;  // xR0, yR0 coordinates relative to
        int yR0 = yBlock - yRaster; // the raster
        int xR1 = xR0 + blockWidth;
        int yR1 = yR0 + blockHeight;
        if (xR0 < 0) {
            xR0 = 0;
        }
        if (yR0 < 0) {
            yR0 = 0;
        }
        if (xR1 > rasterWidth) {
            xR1 = rasterWidth;
        }
        if (yR1 > rasterHeight) {
            yR1 = rasterHeight;
        }

        // Recall that the above logic may have adjusted xR0, xY0 so that
        // they are not necessarily point to the source pixel at xRaster, yRaster
        // we compute xSource = xR0+xRaster.
        //            xOffset = xSource-xBlock
        // since the block cannot be accessed with a negative offset,
        // we check for negatives and adjust xR0, yR0 upward as necessary
        int xB0 = xR0 + xRaster - xBlock;
        int yB0 = yR0 + yRaster - yBlock;
        if (xB0 < 0) {
            xR0 -= xB0;
            xB0 = 0;
        }
        if (yB0 < 0) {
            yR0 -= yB0;
            yB0 = 0;
        }

        int w = xR1 - xR0;
        int h = yR1 - yR0;
        if (w <= 0 || h <= 0) {
            // The call to this method put the block outside the
            // bounds of the raster.  There is nothing to do.  Ideally,
            // this situation never arises, because it would mean that
            // the data was read from the file unnecessarily.
            return;
        }
        // see if the xR1, yR1 would extend past the limits of the block
        if (w > blockWidth) {
            w = blockWidth;
        }
        if (h > blockHeight) {
            h = blockHeight;
        }

        for (int i = 0; i < h; i++) {
            int yR = yR0 + i;
            int yB = yB0 + i;
            int rOffset = yR * rasterWidth + xR0;
            int bOffset = yB * blockWidth + xB0;
            for (int j = 0; j < w; j++) {
                rasterData[rOffset + j] = Float.intBitsToFloat(blockData[bOffset + j]);
            }
        }
    }

    /**
     * Defines a method for accessing the floating-point raster data in a TIFF
     * image. These implementations of this method in DataReaderStrips and
     * DataReaderTiled assume that this instance is of a compatible data type
     * (floating-point) and that all access checks have already been performed.
     *
     * @param subImage if non-null, instructs the access method to retrieve only
     * a sub-section of the image data.
     * @return a valid instance
     * @throws ImageReadException in the event of an incompatible data form.
     * @throws IOException in the event of I/O error.
     */
    public abstract TiffRasterData readRasterData(final Rectangle subImage)
        throws ImageReadException, IOException;
}
