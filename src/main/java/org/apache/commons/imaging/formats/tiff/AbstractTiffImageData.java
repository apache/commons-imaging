/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
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

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.datareaders.AbstractImageDataReader;
import org.apache.commons.imaging.formats.tiff.datareaders.DataReaderStrips;
import org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.AbstractPhotometricInterpreter;

public abstract class AbstractTiffImageData {

    public static class Data extends AbstractTiffElement.DataElement {

        public Data(final long offset, final int length, final byte[] data) {
            super(offset, length, data);
        }

        @Override
        public String getElementDescription() {
            return "TIFF image data: " + getDataLength() + " bytes";
        }

    }

    public static class Strips extends AbstractTiffImageData {

        private final AbstractTiffElement.DataElement[] strips;
        // public final byte strips[][];
        public final int rowsPerStrip;

        public Strips(final AbstractTiffElement.DataElement[] strips, final int rowsPerStrip) {
            this.strips = strips;
            this.rowsPerStrip = rowsPerStrip;
        }

        @Override
        public AbstractImageDataReader getDataReader(final TiffDirectory directory, final AbstractPhotometricInterpreter photometricInterpreter,
                final int bitsPerPixel, final int[] bitsPerSample, final int predictor, final int samplesPerPixel, final int width, final int height,
                final int compression, final TiffPlanarConfiguration planarConfiguration, final ByteOrder byteorder) throws IOException, ImagingException {
            final int sampleFormat = extractSampleFormat(directory);
            return new DataReaderStrips(directory, photometricInterpreter, bitsPerPixel, bitsPerSample, predictor, samplesPerPixel, sampleFormat, width, height,
                    compression, planarConfiguration, byteorder, rowsPerStrip, this);
        }

        @Override
        public AbstractTiffElement.DataElement[] getImageData() {
            return strips;
        }

        public AbstractTiffElement.DataElement getImageData(final int offset) {
            return strips[offset];
        }

        public int getImageDataLength() {
            return strips.length;
        }

        @Override
        public boolean stripsNotTiles() {
            return true;
        }

    }

    public static class Tiles extends AbstractTiffImageData {

        public final AbstractTiffElement.DataElement[] tiles;

        // public final byte tiles[][];
        private final int tileWidth;
        private final int tileLength;

        public Tiles(final AbstractTiffElement.DataElement[] tiles, final int tileWidth, final int tileLength) {
            this.tiles = tiles;
            this.tileWidth = tileWidth;
            this.tileLength = tileLength;
        }

        @Override
        public AbstractImageDataReader getDataReader(final TiffDirectory directory, final AbstractPhotometricInterpreter photometricInterpreter,
                final int bitsPerPixel, final int[] bitsPerSample, final int predictor, final int samplesPerPixel, final int width, final int height,
                final int compression, final TiffPlanarConfiguration planarConfiguration, final ByteOrder byteOrder) throws IOException, ImagingException {
            final int sampleFormat = extractSampleFormat(directory);
            return new DataReaderTiled(directory, photometricInterpreter, tileWidth, tileLength, bitsPerPixel, bitsPerSample, predictor, samplesPerPixel,
                    sampleFormat, width, height, compression, planarConfiguration, byteOrder, this);
        }

        @Override
        public AbstractTiffElement.DataElement[] getImageData() {
            return tiles;
        }

        /**
         * Gets the height of individual tiles. Note that if the overall image height is not a multiple of the tile height, then the last row of tiles may
         * extend beyond the image height.
         *
         * @return an integer value greater than zero
         */
        public int getTileHeight() {
            return tileLength;
        }

        /**
         * Gets the width of individual tiles. Note that if the overall image width is not a multiple of the tile width, then the last column of tiles may
         * extend beyond the image width.
         *
         * @return an integer value greater than zero
         */
        public int getTileWidth() {
            return tileWidth;
        }

        @Override
        public boolean stripsNotTiles() {
            return false;
        }

        // public TiffElement[] getElements()
        // {
        // return tiles;
        // }
    }

    private static int extractSampleFormat(final TiffDirectory directory) throws ImagingException {
        final short[] sSampleFmt = directory.getFieldValue(TiffTagConstants.TIFF_TAG_SAMPLE_FORMAT, false);
        if (sSampleFmt != null && sSampleFmt.length > 0) {
            return sSampleFmt[0];
        }
        return 0; // unspecified format
    }

    public abstract AbstractImageDataReader getDataReader(TiffDirectory directory, AbstractPhotometricInterpreter photometricInterpreter, int bitsPerPixel,
            int[] bitsPerSample, int predictor, int samplesPerPixel, int width, int height, int compression, TiffPlanarConfiguration planarConfiguration,
            ByteOrder byteOrder) throws IOException, ImagingException;

    public abstract AbstractTiffElement.DataElement[] getImageData();

    public abstract boolean stripsNotTiles();
}
