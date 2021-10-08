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
 * Implementation notes:
 *    See ImageDataReader and DataReaderStrips for notes on development
 * with particular emphasis on run-time performance.
 */
package org.apache.commons.imaging.formats.tiff.datareaders;

import java.awt.Rectangle;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteOrder;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.formats.tiff.TiffRasterData;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.TiffImageData;
import org.apache.commons.imaging.formats.tiff.TiffRasterDataFloat;
import org.apache.commons.imaging.formats.tiff.TiffRasterDataInt;
import org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterRgb;

/**
 * Provides a data reader for TIFF file images organized by tiles.
 */
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
            final int predictor, final int samplesPerPixel, final int sampleFormat,
            final int width, final int height,
            final int compression,
            final TiffPlanarConfiguration planarConfiguration,
            final ByteOrder byteOrder, final TiffImageData.Tiles imageData) {
        super(directory, photometricInterpreter, bitsPerSample, predictor,
                samplesPerPixel, sampleFormat, width, height, planarConfiguration);

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
        // code only supports the 32-bit and 64-bit formats.
        if (sampleFormat == TiffTagConstants.SAMPLE_FORMAT_VALUE_IEEE_FLOATING_POINT) {
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
            final int[] samples = new int[4];
            final int[] b = unpackFloatingPointSamples(
                    j1 - j0, i1 - i0, tileWidth, bytes,
                    bitsPerPixel, byteOrder);
            for (int i = i0; i < i1; i++) {
                final int row = i - startY;
                final int rowOffset = row * tileWidth;
                for (int j = j0; j < j1; j++) {
                    final int column = j - startX;
                    int k = (rowOffset + column) * samplesPerPixel;
                    samples[0] = b[k];
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

        if ((bitsPerPixel == 24 || bitsPerPixel == 32) && allSamplesAreOneByte
                && photometricInterpreter instanceof PhotometricInterpreterRgb) {
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

            if (predictor == TiffTagConstants.PREDICTOR_VALUE_HORIZONTAL_DIFFERENCING) {
                applyPredictorToBlock(tileWidth, i1 - i0, samplesPerPixel, bytes);
            }

            if (bitsPerPixel == 24) {
                // 24 bit case, we don't mask the red byte because any
                // sign-extended bits get covered by opacity mask
                for (int i = i0; i < i1; i++) {
                    int k = (i - i0) * tileWidth * 3;
                    for (int j = j0; j < j1; j++, k += 3) {
                        final int rgb = 0xff000000
                                | (bytes[k] << 16)
                                | ((bytes[k + 1] & 0xff) << 8)
                                | (bytes[k + 2] & 0xff);
                        imageBuilder.setRGB(j, i, rgb);
                    }
                }
            } else if (bitsPerPixel == 32) {
                // 32 bit case, we don't mask the high byte because any
                // sign-extended bits get shifted up and out of result.
                for (int i = i0; i < i1; i++) {
                    int k = (i - i0) * tileWidth * 4;
                    for (int j = j0; j < j1; j++, k += 4) {
                        final int rgb
                                = ((bytes[k] & 0xff) << 16)
                                | ((bytes[k + 1] & 0xff) << 8)
                                | (bytes[k + 2] & 0xff)
                                | (bytes[k + 3] << 24);
                        imageBuilder.setRGB(j, i, rgb);
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
    public ImageBuilder readImageData(final Rectangle subImageSpecification,
            final boolean hasAlpha,
            final boolean isAlphaPreMultiplied)
            throws ImageReadException, IOException {

        final Rectangle subImage;
        if (subImageSpecification == null) {
            // configure subImage to read entire image
            subImage = new Rectangle(0, 0, width, height);
        } else {
            subImage = subImageSpecification;
        }

        final int bitsPerRow = tileWidth * bitsPerPixel;
        final int bytesPerRow = (bitsPerRow + 7) / 8;
        final int bytesPerTile = bytesPerRow * tileLength;

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

        final ImageBuilder workingBuilder
                = new ImageBuilder(workingWidth, workingHeight,
                        hasAlpha, isAlphaPreMultiplied);

        for (int iRow = row0; iRow <= row1; iRow++) {
            for (int iCol = col0; iCol <= col1; iCol++) {
                final int tile = iRow * nColumnsOfTiles + iCol;
                final byte[] compressed = imageData.tiles[tile].getData();
                final byte[] decompressed = decompress(compressed, compression,
                        bytesPerTile, tileWidth, tileLength);
                final int x = iCol * tileWidth - x0;
                final int y = iRow * tileLength - y0;
                interpretTile(workingBuilder, decompressed, x, y, width, height);
            }
        }

        if (subImage.x == x0
                && subImage.y == y0
                && subImage.width == workingWidth
                && subImage.height == workingHeight) {
            return workingBuilder;
        }

        return workingBuilder.getSubset(
                subImage.x - x0,
                subImage.y - y0,
                subImage.width,
                subImage.height);
    }

    @Override
    public TiffRasterData readRasterData(final Rectangle subImage)
            throws ImageReadException, IOException {
        switch (sampleFormat) {
            case TiffTagConstants.SAMPLE_FORMAT_VALUE_IEEE_FLOATING_POINT:
                return readRasterDataFloat(subImage);
            case TiffTagConstants.SAMPLE_FORMAT_VALUE_TWOS_COMPLEMENT_SIGNED_INTEGER:
                return readRasterDataInt(subImage);
            default:
                throw new ImageReadException("Unsupported sample format, value="
                        + sampleFormat);
        }
    }

    private TiffRasterData readRasterDataFloat(final Rectangle subImage)
            throws ImageReadException, IOException {
        final int bitsPerRow = tileWidth * bitsPerPixel;
        final int bytesPerRow = (bitsPerRow + 7) / 8;
        final int bytesPerTile = bytesPerRow * tileLength;
        int xRaster;
        int yRaster;
        int rasterWidth;
        int rasterHeight;
        if (subImage != null) {
            xRaster = subImage.x;
            yRaster = subImage.y;
            rasterWidth = subImage.width;
            rasterHeight = subImage.height;
        } else {
            xRaster = 0;
            yRaster = 0;
            rasterWidth = width;
            rasterHeight = height;
        }
        float[] rasterDataFloat = new float[rasterWidth * rasterHeight * samplesPerPixel];

        // tileWidth is the width of the tile
        // tileLength is the height of the tile
        final int col0 = xRaster / tileWidth;
        final int col1 = (xRaster + rasterWidth - 1) / tileWidth;
        final int row0 = yRaster / tileLength;
        final int row1 = (yRaster + rasterHeight - 1) / tileLength;

        final int nColumnsOfTiles = (width + tileWidth - 1) / tileWidth;

        for (int iRow = row0; iRow <= row1; iRow++) {
            for (int iCol = col0; iCol <= col1; iCol++) {
                final int tile = iRow * nColumnsOfTiles + iCol;
                final byte[] compressed = imageData.tiles[tile].getData();
                final byte[] decompressed = decompress(compressed, compression,
                        bytesPerTile, tileWidth, tileLength);
                final int x = iCol * tileWidth;
                final int y = iRow * tileLength;

                final int[] blockData = unpackFloatingPointSamples(
                        tileWidth, tileLength, tileWidth,
                        decompressed,
                        bitsPerPixel, byteOrder);
                transferBlockToRaster(x, y, tileWidth, tileLength, blockData,
                        xRaster, yRaster, rasterWidth, rasterHeight, samplesPerPixel, rasterDataFloat);
            }
        }

        return new TiffRasterDataFloat(rasterWidth, rasterHeight, samplesPerPixel,rasterDataFloat);
    }

    private TiffRasterData readRasterDataInt(final Rectangle subImage)
            throws ImageReadException, IOException {
        final int bitsPerRow = tileWidth * bitsPerPixel;
        final int bytesPerRow = (bitsPerRow + 7) / 8;
        final int bytesPerTile = bytesPerRow * tileLength;
        int xRaster;
        int yRaster;
        int rasterWidth;
        int rasterHeight;
        if (subImage != null) {
            xRaster = subImage.x;
            yRaster = subImage.y;
            rasterWidth = subImage.width;
            rasterHeight = subImage.height;
        } else {
            xRaster = 0;
            yRaster = 0;
            rasterWidth = width;
            rasterHeight = height;
        }
        int[] rasterDataInt = new int[rasterWidth * rasterHeight];

        // tileWidth is the width of the tile
        // tileLength is the height of the tile
        final int col0 = xRaster / tileWidth;
        final int col1 = (xRaster + rasterWidth - 1) / tileWidth;
        final int row0 = yRaster / tileLength;
        final int row1 = (yRaster + rasterHeight - 1) / tileLength;

        final int nColumnsOfTiles = (width + tileWidth - 1) / tileWidth;

        for (int iRow = row0; iRow <= row1; iRow++) {
            for (int iCol = col0; iCol <= col1; iCol++) {
                final int tile = iRow * nColumnsOfTiles + iCol;
                final byte[] compressed = imageData.tiles[tile].getData();
                final byte[] decompressed = decompress(compressed, compression,
                        bytesPerTile, tileWidth, tileLength);
                final int x = iCol * tileWidth;
                final int y = iRow * tileLength;
                final int[] blockData = unpackIntSamples(
                        tileWidth, tileLength, tileWidth,
                        decompressed,
                        predictor, bitsPerPixel, byteOrder);
                transferBlockToRaster(x, y, tileWidth, tileLength, blockData,
                        xRaster, yRaster, rasterWidth, rasterHeight, rasterDataInt);
            }
        }
        return new TiffRasterDataInt(rasterWidth, rasterHeight, rasterDataInt);
    }
}
