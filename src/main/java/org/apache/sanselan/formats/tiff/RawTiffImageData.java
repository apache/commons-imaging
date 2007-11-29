/**
 * 
 */
package org.apache.sanselan.formats.tiff;

public abstract class RawTiffImageData
{
	public static class Tiles extends RawTiffImageData
	{
		public final byte tiles[][];

		public Tiles(final byte tiles[][])
		{
			this.tiles = tiles;
		}

		public byte[][] getRawImageData()
		{
			return tiles;
		}

		public boolean stripsNotTiles()
		{
			return false;
		}
	}

	public static class Strips extends RawTiffImageData
	{
		public final byte strips[][];

		public Strips(final byte strips[][])
		{
			this.strips = strips;
		}

		public byte[][] getRawImageData()
		{
			return strips;
		}

		public boolean stripsNotTiles()
		{
			return true;
		}
	}

	//	public static class Jpeg extends RawImageData
	//	{
	//		public final byte data[][];
	//
	//		public Jpeg(final byte data[])
	//		{
	//			this.data = data;
	//		}
	//
	//		public byte[] getRawImageData()
	//		{
	//			return data;
	//		}
	//	}

	public abstract byte[][] getRawImageData();

	public abstract boolean stripsNotTiles();
}