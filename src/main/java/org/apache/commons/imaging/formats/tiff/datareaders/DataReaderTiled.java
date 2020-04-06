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
 /*
 * Implementation Notes:
 *
 *   Additional implementation notes are given in DataReaderStrips.java
 *
 * The TIFF Floating-Point Formats ----------------------------------
 *    In addition to providing images, TIFF files can supply data in the
 * form of numerical values. As of March 2020 the Commons Imaging library
 * was extended to support some floating-point data formats.
 *    Unfortunately, the floating-point format allows for a lot of different
 * variations and only the most widely used of these are currently supported.
 * At the time of implementation, only a small set of data products were
 * available. Thus it is likely that developers will wish to extend this capability
 * as additional test data become available. When implementing extensions
 * to this logic, developers are reminder that image processing requires
 * access to literally millions of pixels, so attention to performance
 * is essential to a successful implementation (please see the notes in
 * DataReaderStrips.java for more information).
 *    The TIFF floating-point implementation is very poorly documented.
 * So these notes are included to provide clarification on at least
 * some aspects of the format.
 *
 * The Predictor==3 Case
 *   TIFF specifies an extension for a predictor that is intended to
 * improve data compression ratios for floating-point values.  This
 * predictor is specified using the TIFF predictor TAG with a value of 3
 * (see TIFF Technical Note 3, April 8, 2005).  Consider a 4-byte floating
 * point value given in IEEE-754 format.  Let f3 be the high-order byte,
 * with f2 the next highest, followed by f1, and f0 for the
 * low-order byte.  This designation shoulod not be confused with the
 * in-memory layout of the bytes (little-endian versus big-endian), but
 * rather their numerical values. The sign bit and upper 7 bits of the exponent
 * are given in the high-order byte, followed by the remaining sign bit
 * and the mantissa in the lower.
 *   In many real-valued raster data sets, the sign and magnitude (exponent)
 * of the values changes slowly which the contents of the mantissa vary in
 * a semi-random manner, with the information entropy tending to increase
 * in the lowest ordered bytes.  Thus, the high-order bytes have more
 * redundancy than the low-order bytes and can compress more efficiently.
 * To exploit this, the TIFF format splits the bytes into groups based on their
 * order-of-magnitude.  This splitting process takes place on a ROW-BY-ROW
 * basis (note the emphasis, this point is not clearly documented in the spec).
 * .  For example, for row length of 3 pixels -- A, B, and C -- the data
 * for two rows would be given as shown below (again, ignoring endian issues):
 *   Original:
 *      A3 A2 A1 A0   B3 B2 B1 B0   C3 C2 C1 C0
 *      D3 D3 D1 D0   E3 E2 E2 E0   F3 F2 F1 F0
 *
 *   Bytes split into groups by order-of-magnitude:
 *      A3 B3 C3   A2 B2 C2   A1 B1 C1   A0 B0 C0
 *      D3 E3 F3   D2 E2 F2   D1 E1 F1   D0 E0 F0
 *
 * To further improve the compression, the predictor takes the difference of
 * each subsequent bytes.  Again, the differences (deltas) are computed on
 * a row-byte-row basis.  For the most part, the differences combine
 * bytes associated with the same order-of-magnitude, though there is
 * a special transition at the end of each order-of-magnitude set (shown in
 * parentheses):
 *
 *      A3, B3-A3, C3-B3, (A2-C3), B2-A2, C2-B2, (A1-C2), etc.
 *      D3, E3-D3, F3-D3, (D2-F3), E3-D2, etc.
 *
 * Once the predictor transform is complete, the data is stored using
 * conventional data compression techniques such as Deflate or LZW.
 * In practice, floating point data does not compress especially well, but
 * using the above technique, the TIFF process typically reduces the overall
 * storage size by 20 to 30 percent (depending on the data).
 *    The TIFF Technical Note 3 specifies 3 data size formats for
 * storing floating point values:
 *     32 bits    IEEE-754 single-precision standard
 *     16 bits    IEEE-754 half-precision standard
 *     24 bits    A non-standard representation
 * At this time, we have not obtained data samples for the smaller
 * representations.  There are also reports of 64-bit data
 * (see Commons Imaging JIRA issue IMAGING-102), though documentation
 * for that format was not available when these notes were written.
 */

package org.apache.commons.imaging.formats.tiff.datareaders;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteOrder;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.TiffElement.DataElement;
import org.apache.commons.imaging.formats.tiff.TiffImageData;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterRgb;

public final class DataReaderTiled extends ImageDataReader {

    private final int tileWidth;
    private final int tileLength;

    private final int bitsPerPixel;

    private final int compression;
    private final ByteOrder byteOrder;

    private final TiffImageData.Tiles imageData;

    public DataReaderTiled(final TiffDirectory directory,
            final PhotometricInterpreter photometricInterpreter, final int tileWidth,
            final int tileLength, final int bitsPerPixel, final int[] bitsPerSample,
            final int predictor, final int samplesPerPixel, final int width, final int height,
            final int compression, final ByteOrder byteOrder, final TiffImageData.Tiles imageData) {
        super(directory, photometricInterpreter, bitsPerSample, predictor,
                samplesPerPixel, width, height);

        this.tileWidth = tileWidth;
        this.tileLength = tileLength;

        this.bitsPerPixel = bitsPerPixel;
        this.compression = compression;

        this.imageData = imageData;
        this.byteOrder = byteOrder;
    }

    private void interpretTile(final ImageBuilder imageBuilder, final byte[] bytes,
        final int startX, final int startY, final int xLimit, final int yLimit) throws ImageReadException, IOException {

        // March 2020 change to handle floating-point with compression
        // for the compressed floating-point, there is a standard that allows
        // 16 bit floats (which is an IEEE 754 standard) and 24 bits (which is
        // a non-standard format implemented for TIFF).  At this time, this
        // code only supports 32-bite.
        if (floatingPointFormat) {
            if (predictor != 3 || bitsPerPixel != 32 || bitsPerSampleLength != 1) {
                throw new ImageReadException(
                    "Floating point format not supported for predictor=" + predictor
                    + ", bitsPerPixel=" + bitsPerPixel
                    + ", sample array size " + bitsPerSampleLength);
            }

            // tileLength: number of rows in tile
            // tileWidth:  number of columns in tile
            final int i0 = startY;
            int i1 = startY + tileLength;
            if (i1 > yLimit) {
                // the tile is padded past bottom of image
                i1 = yLimit;
            }
            final int j0 = startX;
            int j1 = startX + tileWidth;
            if (j1 > xLimit) {
                // the tile is padded to beyond the tile width
                j1 = xLimit;
            }
            int bytesInRow = tileWidth * 4;
            final int[] samples = new int[4];

            for (int i = i0; i < i1; i++) {
                int row = i - startY;
                // the bytes from the floating-point values were broken
                // out into 4 sets and given sequentially, highest order bytes
                // first.  This was done on a row-by-row basis.
                // we need to re-assemble the floating point representations.
                // Note that each of the 4*tileWidth bytes in the row gives
                // a differencing value.  So first we must execute a loop
                // combining the differences.
                int aOffset = row * bytesInRow;
                int bOffset = aOffset + tileWidth;
                int cOffset = bOffset + tileWidth;
                int dOffset = cOffset + tileWidth;
                // in this loop, the source bytes give delta values.
                for (int j = 1; j < bytesInRow; j++) {
                    bytes[aOffset + j] += bytes[aOffset + j - 1];
                }
                for (int j = j0; j < j1; j++) {
                    int column = j - startX;
                    int a = bytes[aOffset + column];
                    int b = bytes[bOffset + column];
                    int c = bytes[cOffset + column];
                    int d = bytes[dOffset + column];
                    // Pack the 4 byte components into a single integer
                    // in the byte order used by the TIFF standard
                    int v = ((a & 0xff) << 24)
                        | ((b & 0xff) << 16)
                        | ((c & 0xff) << 8)
                        | (d & 0xff);
                    // To inspect values, you could use
                    // float f = Float.intBitsToFloat(v);
                    samples[0] = v;
                    photometricInterpreter.interpretPixel(
                        imageBuilder, samples, j, i);
                }
            }
            return;
        }
        // End of March 2020 changes to support floating-point format

        // changes introduced May 2012
        // The following block of code implements changes that
        // reduce image loading time by using special-case processing
        // instead of the general-purpose logic from the original
        // implementation. For a detailed discussion, see the comments for
        // a similar treatment in the DataReaderStrip class
        //

        // verify that all samples are one byte in size
        final boolean allSamplesAreOneByte = isHomogenous(8);

        if (predictor != 2 && bitsPerPixel == 24 && allSamplesAreOneByte) {
            int k = 0;
            final int i0 = startY;
            int i1 = startY + tileLength;
            if (i1 > yLimit) {
                // the tile is padded past bottom of image
                i1 = yLimit;
            }
            final int j0 = startX;
            int j1 = startX + tileWidth;
            if (j1 > xLimit) {
                // the tile is padded to beyond the tile width
                j1 = xLimit;
            }
            if (photometricInterpreter instanceof PhotometricInterpreterRgb) {
                for (int i = i0; i < i1; i++) {
                    k = (i - i0) * tileWidth * 3;
                    for (int j = j0; j < j1; j++, k += 3) {
                        final int rgb = 0xff000000
                                | (((bytes[k] << 8) | (bytes[k + 1] & 0xff)) << 8)
                                | (bytes[k + 2] & 0xff);
                        imageBuilder.setRGB(j, i, rgb);
                    }
                }
            } else {
                final int[] samples = new int[3];
                for (int i = i0; i < i1; i++) {
                    k = (i - i0) * tileWidth * 3;
                    for (int j = j0; j < j1; j++) {
                        samples[0] = bytes[k++] & 0xff;
                        samples[1] = bytes[k++] & 0xff;
                        samples[2] = bytes[k++] & 0xff;
                        photometricInterpreter.interpretPixel(imageBuilder,
                                samples, j, i);
                    }
                }
            }
            return;
        }

        // End of May 2012 changes

        try (BitInputStream bis = new BitInputStream(new ByteArrayInputStream(bytes), byteOrder)) {

            final int pixelsPerTile = tileWidth * tileLength;

            int tileX = 0;
            int tileY = 0;

            int[] samples = new int[bitsPerSampleLength];
            resetPredictor();
            for (int i = 0; i < pixelsPerTile; i++) {

                final int x = tileX + startX;
                final int y = tileY + startY;

                getSamplesAsBytes(bis, samples);

                if (x < xLimit && y < yLimit) {
                    samples = applyPredictor(samples);
                    photometricInterpreter.interpretPixel(imageBuilder, samples, x, y);
                }

                tileX++;

                if (tileX >= tileWidth) {
                    tileX = 0;
                    resetPredictor();
                    tileY++;
                    bis.flushCache();
                    if (tileY >= tileLength) {
                        break;
                    }
                }

            }
        }
    }

    @Override
    public void readImageData(final ImageBuilder imageBuilder)
            throws ImageReadException, IOException {
        final int bitsPerRow = tileWidth * bitsPerPixel;
        final int bytesPerRow = (bitsPerRow + 7) / 8;
        final int bytesPerTile = bytesPerRow * tileLength;
        int x = 0;
        int y = 0;

        for (final DataElement tile2 : imageData.tiles) {
            final byte[] compressed = tile2.getData();

            final byte[] decompressed = decompress(compressed, compression,
                    bytesPerTile, tileWidth, tileLength);

            interpretTile(imageBuilder, decompressed, x, y, width, height);

            x += tileWidth;
            if (x >= width) {
                x = 0;
                y += tileLength;
                if (y >= height) {
                    break;
                }
            }

        }
    }

    @Override
    public BufferedImage readImageData(final Rectangle subImage)
            throws ImageReadException, IOException {
        final int bitsPerRow = tileWidth * bitsPerPixel;
        final int bytesPerRow = (bitsPerRow + 7) / 8;
        final int bytesPerTile = bytesPerRow * tileLength;
        int x = 0;
        int y = 0;

        // tileWidth is the width of the tile
        // tileLength is the height of the tile
        final int col0 = subImage.x / tileWidth;
        final int col1 = (subImage.x + subImage.width - 1) / tileWidth;
        final int row0 = subImage.y / tileLength;
        final int row1 = (subImage.y + subImage.height - 1) / tileLength;

        final int nCol = col1 - col0 + 1;
        final int nRow = row1 - row0 + 1;
        final int workingWidth = nCol * tileWidth;
        final int workingHeight = nRow * tileLength;

        final int nColumnsOfTiles = (width + tileWidth - 1) / tileWidth;

        final int x0 = col0 * tileWidth;
        final int y0 = row0 * tileLength;

        final ImageBuilder workingBuilder =
                new ImageBuilder(workingWidth, workingHeight, false);

        for (int iRow = row0; iRow <= row1; iRow++) {
            for (int iCol = col0; iCol <= col1; iCol++) {
                final int tile = iRow * nColumnsOfTiles + iCol;
                final byte[] compressed = imageData.tiles[tile].getData();
                final byte[] decompressed = decompress(compressed, compression,
                        bytesPerTile, tileWidth, tileLength);
                x = iCol * tileWidth - x0;
                y = iRow * tileLength - y0;
                interpretTile(workingBuilder, decompressed, x, y, workingWidth, workingHeight);
            }
        }

        if (subImage.x == x0
                && subImage.y == y0
                && subImage.width == workingWidth
                && subImage.height == workingHeight) {
            return workingBuilder.getBufferedImage();
        }
        return workingBuilder.getSubimage(
            subImage.x - x0,
            subImage.y - y0,
            subImage.width,
            subImage.height);
    }

}
