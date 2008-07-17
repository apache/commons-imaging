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

package org.apache.sanselan.formats.tiff;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.formats.tiff.datareaders.DataReader;
import org.apache.sanselan.formats.tiff.datareaders.DataReaderStrips;
import org.apache.sanselan.formats.tiff.datareaders.DataReaderTiled;
import org.apache.sanselan.formats.tiff.photometricinterpreters.PhotometricInterpreter;

public abstract class TiffImageData
{
	public static class Tiles extends TiffImageData
	{
		public final TiffElement.DataElement tiles[];

		//		public final byte tiles[][];
		private final int tileWidth, tileLength;

		public Tiles(final TiffElement.DataElement tiles[],
				final int tileWidth, final int tileLength)
		{
			this.tiles = tiles;
			this.tileWidth = tileWidth;
			this.tileLength = tileLength;
		}

		public TiffElement.DataElement[] getImageData()
		{
			return tiles;
		}

		public boolean stripsNotTiles()
		{
			return false;
		}

		public DataReader getDataReader(ArrayList entries,
				PhotometricInterpreter photometricInterpreter,
				int bitsPerPixel, int bitsPerSample[], int predictor,
				int samplesPerPixel, int width, int height, int compression)
				throws IOException, ImageReadException
		{
			return new DataReaderTiled(photometricInterpreter, tileWidth,
					tileLength, bitsPerPixel, bitsPerSample, predictor,
					samplesPerPixel, width, height, compression, this);
		}

		//		public TiffElement[] getElements()
		//		{
		//			return tiles;
		//		}
	}

	public static class Strips extends TiffImageData
	{
		public final TiffElement.DataElement strips[];
		//		public final byte strips[][];
		public final int rowsPerStrip;

		public Strips(final TiffElement.DataElement strips[],
				final int rowsPerStrip)
		{
			this.strips = strips;
			this.rowsPerStrip = rowsPerStrip;
		}

		public TiffElement.DataElement[] getImageData()
		{
			return strips;
		}

		public boolean stripsNotTiles()
		{
			return true;
		}

		public DataReader getDataReader(ArrayList entries,
				PhotometricInterpreter photometricInterpreter,
				int bitsPerPixel, int bitsPerSample[], int predictor,
				int samplesPerPixel, int width, int height, int compression)
				throws IOException, ImageReadException
		{
			return new DataReaderStrips(photometricInterpreter, bitsPerPixel,
					bitsPerSample, predictor, samplesPerPixel, width, height,
					compression, rowsPerStrip, this);
		}

		//		public TiffElement[] getElements()
		//		{
		//			return strips;
		//		}

	}

	//	public abstract TiffElement[] getElements();

	public abstract TiffElement.DataElement[] getImageData();

	public abstract boolean stripsNotTiles();

	public abstract DataReader getDataReader(ArrayList entries,
			PhotometricInterpreter photometricInterpreter, int bitsPerPixel,
			int bitsPerSample[], int predictor, int samplesPerPixel, int width,
			int height, int compression) throws IOException, ImageReadException;

	public static class Data extends TiffElement.DataElement
	{
		public Data(int offset, int length, final byte data[])
		{
			super(offset, length, data);
		}

		public String getElementDescription(boolean verbose)
		{
			return "Tiff image data: " + data.length + " bytes";
		}

	}
}