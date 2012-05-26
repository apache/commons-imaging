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

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.BitInputStream;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.TiffImageData;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter;

public final class DataReaderTiled extends DataReader {

    private final int tileWidth;
    private final int tileLength;

    private final int bitsPerPixel;

    private final int compression;
    private final int byteOrder;

    private final TiffImageData.Tiles imageData;

    public DataReaderTiled(TiffDirectory directory,
            PhotometricInterpreter photometricInterpreter, int tileWidth,
            int tileLength, int bitsPerPixel, int bitsPerSample[],
            int predictor, int samplesPerPixel, int width, int height,
            int compression, int byteOrder, TiffImageData.Tiles imageData) {
        super(directory, photometricInterpreter, bitsPerSample, predictor,
                samplesPerPixel, width, height);

        this.tileWidth = tileWidth;
        this.tileLength = tileLength;

        this.bitsPerPixel = bitsPerPixel;
        this.compression = compression;

        this.imageData = imageData;
        this.byteOrder = byteOrder;
    }

    private void interpretTile(ImageBuilder imageBuilder, byte bytes[],
            int startX, int startY) throws ImageReadException, IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        BitInputStream bis = new BitInputStream(bais, byteOrder);

        int pixelsPerTile = tileWidth * tileLength;

        int tileX = 0, tileY = 0;

        int[] samples = new int[bitsPerSample.length];
        resetPredictor();
        for (int i = 0; i < pixelsPerTile; i++) {

            int x = tileX + startX;
            int y = tileY + startY;

            getSamplesAsBytes(bis, samples);

            if ((x < width) && (y < height)) {
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
                if (tileY >= tileLength)
                    break;
            }

        }
    }

    @Override
    public void readImageData(ImageBuilder imageBuilder)
            throws ImageReadException, IOException {
        int bitsPerRow = tileWidth * bitsPerPixel;
        int bytesPerRow = (bitsPerRow + 7) / 8;
        int bytesPerTile = bytesPerRow * tileLength;
        int x = 0, y = 0;

        for (int tile = 0; tile < imageData.tiles.length; tile++) {
            byte compressed[] = imageData.tiles[tile].getData();

            byte decompressed[] = decompress(compressed, compression,
                    bytesPerTile, tileWidth, tileLength);

            interpretTile(imageBuilder, decompressed, x, y);

            x += tileWidth;
            if (x >= width) {
                x = 0;
                y += tileLength;
                if (y >= height)
                    break;
            }

        }
    }
}
