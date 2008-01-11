/**
 * 
 */
package org.apache.sanselan.formats.tiff;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.formats.tiff.datareaders.DataReader;
import org.apache.sanselan.formats.tiff.datareaders.DataReaderStrips;
import org.apache.sanselan.formats.tiff.datareaders.DataReaderTiled;
import org.apache.sanselan.formats.tiff.photometricinterpreters.PhotometricInterpreter;

public abstract class RawTiffImageData
{
	public static class Tiles extends RawTiffImageData
	{
		public final byte tiles[][];
		private final int tileWidth, tileLength;

		public Tiles(final byte tiles[][], final int tileWidth,
				final int tileLength)
		{
			this.tiles = tiles;
			this.tileWidth = tileWidth;
			this.tileLength = tileLength;
		}

		public byte[][] getRawImageData()
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
	}

	public static class Strips extends RawTiffImageData
	{
		public final byte strips[][];
		public final int rowsPerStrip;

		public Strips(final byte strips[][], final int rowsPerStrip)
		{
			this.strips = strips;
			this.rowsPerStrip = rowsPerStrip;
		}

		public byte[][] getRawImageData()
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
			return new DataReaderStrips(photometricInterpreter,
					bitsPerPixel, bitsPerSample, predictor, samplesPerPixel,
					width, height, compression, rowsPerStrip, this);
		}
	}

	public abstract byte[][] getRawImageData();

	public abstract boolean stripsNotTiles();

	public abstract DataReader getDataReader(ArrayList entries,
			PhotometricInterpreter photometricInterpreter, int bitsPerPixel,
			int bitsPerSample[], int predictor, int samplesPerPixel, int width,
			int height, int compression) throws IOException, ImageReadException;

}