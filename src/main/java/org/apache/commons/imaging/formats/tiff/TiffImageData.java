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

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.formats.tiff.datareaders.DataReader;
import org.apache.commons.imaging.formats.tiff.datareaders.DataReaderStrips;
import org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter;

public abstract class TiffImageData
{
    public static class Tiles extends TiffImageData
    {
        public final TiffElement.DataElement tiles[];

        //        public final byte tiles[][];
        private final int tileWidth, tileLength;

        public Tiles(final TiffElement.DataElement tiles[],
                final int tileWidth, final int tileLength)
        {
            this.tiles = tiles;
            this.tileWidth = tileWidth;
            this.tileLength = tileLength;
        }

        @Override
        public TiffElement.DataElement[] getImageData()
        {
            return tiles;
        }

        @Override
        public boolean stripsNotTiles()
        {
            return false;
        }

        @Override
        public DataReader getDataReader(TiffDirectory directory,
                PhotometricInterpreter photometricInterpreter,
                int bitsPerPixel, int bitsPerSample[], int predictor,
                int samplesPerPixel, int width, int height, int compression, int byteOrder)
                throws IOException, ImageReadException
        {
            return new DataReaderTiled(directory, photometricInterpreter,
                    tileWidth, tileLength, bitsPerPixel, bitsPerSample,
                    predictor, samplesPerPixel, width, height, compression, byteOrder, this);
        }

        //        public TiffElement[] getElements()
        //        {
        //            return tiles;
        //        }
    }

    public static class Strips extends TiffImageData
    {
        public final TiffElement.DataElement strips[];
        //        public final byte strips[][];
        public final int rowsPerStrip;

        public Strips(final TiffElement.DataElement strips[],
                final int rowsPerStrip)
        {
            this.strips = strips;
            this.rowsPerStrip = rowsPerStrip;
        }

        @Override
        public TiffElement.DataElement[] getImageData()
        {
            return strips;
        }

        @Override
        public boolean stripsNotTiles()
        {
            return true;
        }

        @Override
        public DataReader getDataReader(TiffDirectory directory,
                PhotometricInterpreter photometricInterpreter,
                int bitsPerPixel, int bitsPerSample[], int predictor,
                int samplesPerPixel, int width, int height, int compression, int byteorder)
                throws IOException, ImageReadException
        {
            return new DataReaderStrips(directory, photometricInterpreter,
                    bitsPerPixel, bitsPerSample, predictor, samplesPerPixel,
                    width, height, compression,byteorder, rowsPerStrip, this);
        }

        //        public TiffElement[] getElements()
        //        {
        //            return strips;
        //        }

    }

    //    public abstract TiffElement[] getElements();

    public abstract TiffElement.DataElement[] getImageData();

    public abstract boolean stripsNotTiles();

    public abstract DataReader getDataReader(TiffDirectory directory,
            PhotometricInterpreter photometricInterpreter, int bitsPerPixel,
            int bitsPerSample[], int predictor, int samplesPerPixel, int width,
            int height, int compression, int byteOrder) throws IOException, ImageReadException;

    public static class Data extends TiffElement.DataElement
    {
        public Data(int offset, int length, final byte data[])
        {
            super(offset, length, data);
        }

        @Override
        public String getElementDescription(boolean verbose)
        {
            return "Tiff image data: " + data.length + " bytes";
        }

    }
    
    public static class ByteSourceData extends Data
    {
        ByteSourceFile byteSourceFile ;
        public ByteSourceData(int offset, int length, ByteSourceFile byteSource)
        {
            super(offset, length, new byte[0]);
            byteSourceFile = byteSource;
        }

        @Override
        public String getElementDescription(boolean verbose)
        {
            return "Tiff image data: " + data.length + " bytes";
        }

        
        public byte[] getData()
        {
            try {
                return byteSourceFile.getBlock(offset, length);
            } catch (IOException ioex) {
            }
            return new byte[0];
        }
    }
}