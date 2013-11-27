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

public final class DataReaderTiled extends DataReader {

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
        // changes introduced May 2012
        // The following block of code implements changes that
        // reduce image loading time by using special-case processing
        // instead of the general-purpose logic from the original
        // implementation. For a detailed discussion, see the comments for
        // a similar treatment in the DataReaderStrip class
        //

        // verify that all samples are one byte in size
        boolean allSamplesAreOneByte = true;
        for (final int element : bitsPerSample) {
            if (element != 8) {
                allSamplesAreOneByte = false;
                break;
            }
        }

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

        final ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        final BitInputStream bis = new BitInputStream(bais, byteOrder);

        final int pixelsPerTile = tileWidth * tileLength;

        int tileX = 0, tileY = 0;

        int[] samples = new int[bitsPerSample.length];
        resetPredictor();
        for (int i = 0; i < pixelsPerTile; i++) {

            final int x = tileX + startX;
            final int y = tileY + startY;

            getSamplesAsBytes(bis, samples);

            if ((x < xLimit) && (y < yLimit)) {
                samples = applyPredictor(samples);
                photometricInterpreter.interpretPixel(imageBuilder, samples, x,
                        y);
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

    @Override
    public void readImageData(final ImageBuilder imageBuilder)
            throws ImageReadException, IOException {
        final int bitsPerRow = tileWidth * bitsPerPixel;
        final int bytesPerRow = (bitsPerRow + 7) / 8;
        final int bytesPerTile = bytesPerRow * tileLength;
        int x = 0, y = 0;

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
            throws ImageReadException, IOException
    {
        final int bitsPerRow = tileWidth * bitsPerPixel;
        final int bytesPerRow = (bitsPerRow + 7) / 8;
        final int bytesPerTile = bytesPerRow * tileLength;
        int x = 0, y = 0;

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
