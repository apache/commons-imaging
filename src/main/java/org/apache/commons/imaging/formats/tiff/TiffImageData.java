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

package org.apache.commons.imaging.formats.tiff;

import java.io.IOException;
import java.nio.ByteOrder;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader;
import org.apache.commons.imaging.formats.tiff.datareaders.DataReaderStrips;
import org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter;

public abstract class TiffImageData {
    public static class Tiles extends TiffImageData {
        public final TiffElement.DataElement[] tiles;

        // public final byte tiles[][];
        private final int tileWidth;
        private final int tileLength;

        public Tiles(final TiffElement.DataElement[] tiles, final int tileWidth, final int tileLength) {
            this.tiles = tiles;
            this.tileWidth = tileWidth;
            this.tileLength = tileLength;
        }

        @Override
        public TiffElement.DataElement[] getImageData() {
            return tiles;
        }

        @Override
        public boolean stripsNotTiles() {
            return false;
        }

        @Override
        public ImageDataReader getDataReader(final TiffDirectory directory,
                final PhotometricInterpreter photometricInterpreter,
                final int bitsPerPixel, final int[] bitsPerSample, final int predictor,
                final int samplesPerPixel, final int width, final int height, final int compression,
                final ByteOrder byteOrder) throws IOException, ImageReadException {
            return new DataReaderTiled(directory, photometricInterpreter,
                    tileWidth, tileLength, bitsPerPixel, bitsPerSample,
                    predictor, samplesPerPixel, width, height, compression,
                    byteOrder, this);
        }
        
        /** 
         * Get the width of individual tiles.  Note that if the overall
         * image width is not a multiple of the tile width, then
         * the last column of tiles may extend beyond the image width.
         * @return an integer value greater than zero
         */
        public int getTileWidth() {
            return tileWidth;
        }
        
        /** 
         * Get the height of individual tiles.  Note that if the overall
         * image height is not a multiple of the tile height, then
         * the last row of tiles may extend beyond the image height.
         * @return an integer value greater than zero
         */
        public int getTileHeight() {
            return tileLength;
        }

        // public TiffElement[] getElements()
        // {
        // return tiles;
        // }
    }

    public static class Strips extends TiffImageData {
        private final TiffElement.DataElement[] strips;
        // public final byte strips[][];
        public final int rowsPerStrip;

        public Strips(final TiffElement.DataElement[] strips, final int rowsPerStrip) {
            this.strips = strips;
            this.rowsPerStrip = rowsPerStrip;
        }

        @Override
        public TiffElement.DataElement[] getImageData() {
            return strips;
        }

        public TiffElement.DataElement getImageData(int offset) {
            return strips[offset];
        }

        public int getImageDataLength() {
            return strips.length;
        }

        @Override
        public boolean stripsNotTiles() {
            return true;
        }

        @Override
        public ImageDataReader getDataReader(final TiffDirectory directory,
                final PhotometricInterpreter photometricInterpreter,
                final int bitsPerPixel, final int[] bitsPerSample, final int predictor,
                final int samplesPerPixel, final int width, final int height, final int compression,
                final ByteOrder byteorder) throws IOException, ImageReadException {
            return new DataReaderStrips(directory, photometricInterpreter,
                    bitsPerPixel, bitsPerSample, predictor, samplesPerPixel,
                    width, height, compression, byteorder, rowsPerStrip, this);
        }

    }

    // public abstract TiffElement[] getElements();

    public abstract TiffElement.DataElement[] getImageData();

    public abstract boolean stripsNotTiles();

    public abstract ImageDataReader getDataReader(TiffDirectory directory,
            PhotometricInterpreter photometricInterpreter, int bitsPerPixel,
            int[] bitsPerSample, int predictor, int samplesPerPixel, int width,
            int height, int compression, ByteOrder byteOrder) throws IOException,
            ImageReadException;

    public static class Data extends TiffElement.DataElement {
        public Data(final long offset, final int length, final byte[] data) {
            super(offset, length, data);
        }

        @Override
        public String getElementDescription(final boolean verbose) {
            return "Tiff image data: " + getDataLength() + " bytes";
        }

    }

    public static class ByteSourceData extends Data {
        ByteSourceFile byteSourceFile;

        public ByteSourceData(final long offset, final int length, final ByteSourceFile byteSource) {
            super(offset, length, new byte[0]);
            byteSourceFile = byteSource;
        }

        @Override
        public String getElementDescription(final boolean verbose) {
            return "Tiff image data: " + getDataLength() + " bytes";
        }

        @Override
        public byte[] getData() {
            try {
                return byteSourceFile.getBlock(offset, length);
            } catch (final IOException ioex) {
                return new byte[0];
            }
        }
    }
}
