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
package org.cmc.sanselan.formats.ico;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DataBufferInt;
import java.awt.image.Raster;
import java.awt.image.SampleModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Vector;

import org.cmc.sanselan.ImageFormat;
import org.cmc.sanselan.ImageInfo;
import org.cmc.sanselan.ImageParser;
import org.cmc.sanselan.ImageReadException;
import org.cmc.sanselan.ImageWriteException;
import org.cmc.sanselan.common.IImageMetadata;
import org.cmc.sanselan.common.byteSources.ByteSource;
import org.cmc.sanselan.util.Debug;

public class IcoImageParser extends ImageParser
{

	public IcoImageParser()
	{
		super.setByteOrder(BYTE_ORDER_LSB);
		//		setDebug(true);
	}

	public String getName()
	{
		return "ico-Custom";
	}

	public String getDefaultExtension()
	{
		return DEFAULT_EXTENSION;
	}

	private static final String DEFAULT_EXTENSION = ".ico";

	private static final String ACCEPTED_EXTENSIONS[] = {
			".ico", ".cur",
	};

	protected String[] getAcceptedExtensions()
	{
		return ACCEPTED_EXTENSIONS;
	}

	protected ImageFormat[] getAcceptedTypes()
	{
		return new ImageFormat[]{
			ImageFormat.IMAGE_FORMAT_ICO, //
		};
	}

	public boolean embedICCProfile(File src, File dst, byte profile[])
	{
		return false;
	}

	public IImageMetadata getMetadata(ByteSource byteSource, Map params)
			throws ImageReadException, IOException
	{
		return null;
	}

	public ImageInfo getImageInfo(ByteSource byteSource)
			throws ImageReadException, IOException
	{
		return null;
	}

	public Dimension getImageSize(ByteSource byteSource)
			throws ImageReadException, IOException
	{
		return null;
	}

	public byte[] getICCProfileBytes(ByteSource byteSource)
			throws ImageReadException, IOException
	{
		return null;
	}

	private static class FileHeader
	{
		public final int reserved; // Reserved (2 bytes), always 0
		public final int iconType; // IconType (2 bytes), if the image is an icon it?s 1, for cursors the value is 2.
		public final int iconCount; //IconCount (2 bytes), number of icons in this file.

		public FileHeader(final int reserved, final int iconType,
				final int iconCount)
		{
			this.reserved = reserved;
			this.iconType = iconType;
			this.iconCount = iconCount;
		}

		public void dump()
		{
			System.out.println("FileHeader");
			System.out.println("Reserved: " + reserved);
			System.out.println("IconType: " + iconType);
			System.out.println("IconCount: " + iconCount);
			System.out.println("");
		}
	}

	private FileHeader readFileHeader(InputStream is)
			throws ImageReadException, IOException
	{
		int Reserved = read2Bytes("Reserved", is, "Not a Valid ICO File");
		int IconType = read2Bytes("IconType", is, "Not a Valid ICO File");
		int IconCount = read2Bytes("IconCount", is, "Not a Valid ICO File");

		return new FileHeader(Reserved, IconType, IconCount);

	}

	private static class IconInfo
	{
		public final byte Width;
		public final byte Height;
		public final byte ColorCount;
		public final byte Reserved;
		public final int Planes;
		public final int BitCount;
		public final int ImageSize;
		public final int ImageOffset;

		public IconInfo(final byte width, final byte height,
				final byte colorCount, final byte reserved, final int planes,
				final int bitCount, final int imageSize, final int imageOffset)
		{
			Width = width;
			Height = height;
			ColorCount = colorCount;
			Reserved = reserved;
			Planes = planes;
			BitCount = bitCount;
			ImageSize = imageSize;
			ImageOffset = imageOffset;
		}

		public void dump()
		{
			System.out.println("IconInfo");

			System.out.println("Width: " + Width);
			System.out.println("Height: " + Height);
			System.out.println("ColorCount: " + ColorCount);
			System.out.println("Reserved: " + Reserved);
			System.out.println("Planes: " + Planes);
			System.out.println("BitCount: " + BitCount);
			System.out.println("ImageSize: " + ImageSize);
			System.out.println("ImageOffset: " + ImageOffset);
			System.out.println("");
		}
	}

	private IconInfo readIconInfo(InputStream is) throws ImageReadException,
			IOException
	{
		byte Width = readByte("Width", is, "Not a Valid ICO File"); // Width (1 byte), Width of Icon (1 to 255)
		byte Height = readByte("Height", is, "Not a Valid ICO File"); // Height (1 byte), Height of Icon (1 to 255)
		byte ColorCount = readByte("ColorCount", is, "Not a Valid ICO File"); // ColorCount (1 byte), Number of colors, either 0 for 24 bit or higher, 2 for monochrome or 16 for 16 color images.
		byte Reserved = readByte("Reserved", is, "Not a Valid ICO File"); // Reserved (1 byte), Not used (always 0)
		int Planes = read2Bytes("Planes", is, "Not a Valid ICO File"); // Planes (2 bytes), always 1
		int BitCount = read2Bytes("BitCount", is, "Not a Valid ICO File"); // BitCount (2 bytes), number of bits per pixel (1 for monochrome, 4 for 16 colors, 8 for 256 colors, 24 for true colors, 32 for true colors + alpha channel)
		int ImageSize = read4Bytes("ImageSize", is, "Not a Valid ICO File"); // ImageSize (4 bytes), Length of resource in bytes
		int ImageOffset = read4Bytes("ImageOffset", is, "Not a Valid ICO File"); // ImageOffset (4 bytes), start of the image in the file.

		return new IconInfo(Width, Height, ColorCount, Reserved, Planes,
				BitCount, ImageSize, ImageOffset);
	}

	private static class BitmapHeader
	{
		public final int Size;
		public final int Width;
		public final int Height;
		public final int Planes;
		public final int BitCount;
		public final int Compression;
		public final int SizeImage;
		public final int XPelsPerMeter;
		public final int YPelsPerMeter;
		public final int ColorsUsed;
		public final int ColorsImportant;

		public BitmapHeader(final int size, final int width, final int height,
				final int planes, final int bitCount, final int compression,
				final int sizeImage, final int pelsPerMeter,
				final int pelsPerMeter2, final int colorsUsed,
				final int colorsImportant)
		{
			Size = size;
			Width = width;
			Height = height;
			Planes = planes;
			BitCount = bitCount;
			Compression = compression;
			SizeImage = sizeImage;
			XPelsPerMeter = pelsPerMeter;
			YPelsPerMeter = pelsPerMeter2;
			ColorsUsed = colorsUsed;
			ColorsImportant = colorsImportant;
		}

		public void dump()
		{
			System.out.println("BitmapHeader");

			System.out.println("Size: " + Size);
			System.out.println("Width: " + Width);
			System.out.println("Height: " + Height);
			System.out.println("Planes: " + Planes);
			System.out.println("BitCount: " + BitCount);
			System.out.println("Compression: " + Compression);
			System.out.println("SizeImage: " + SizeImage);
			System.out.println("XPelsPerMeter: " + XPelsPerMeter);
			System.out.println("YPelsPerMeter: " + YPelsPerMeter);
			System.out.println("ColorsUsed: " + ColorsUsed);
			System.out.println("ColorsImportant: " + ColorsImportant);

			System.out.println("");
		}
	}

	private static class IconData
	{
		public final IconInfo iconInfo;
		public final BitmapHeader header;
		public final byte palette[];
		public final byte color_map[];
		public final int scanline_size;
		public final byte transparency_map[];
		public final int t_scanline_size;

		public IconData(final IconInfo iconInfo, final BitmapHeader header,
				final byte[] palette, final byte[] color_map,
				final int scanline_size, final byte[] transparency_map,
				final int t_scanline_size)
		{
			super();
			this.iconInfo = iconInfo;
			this.header = header;
			this.palette = palette;
			this.color_map = color_map;
			this.scanline_size = scanline_size;
			this.transparency_map = transparency_map;
			this.t_scanline_size = t_scanline_size;
		}

		public void dump()
		{
			System.out.println("IconData");

			iconInfo.dump();
			header.dump();

			System.out.println("scanline_size: " + scanline_size);
			System.out.println("t_scanline_size: " + t_scanline_size);
			System.out.println("palette: "
					+ ((palette == null) ? "null" : "" + palette.length));
			System.out.println("color_map: "
					+ ((color_map == null) ? "null" : "" + color_map.length));
			System.out.println("transparency_map: "
					+ ((transparency_map == null) ? "null" : ""
							+ transparency_map.length));

			System.out.println("");
		}
	}

	private IconData readIconData(InputStream is, IconInfo fIconInfo)
			throws ImageReadException, IOException
	{
		int Size = read4Bytes("Size", is, "Not a Valid ICO File"); // Size (4 bytes), size of this structure (always 40)
		int Width = read4Bytes("Width", is, "Not a Valid ICO File"); // Width (4 bytes), width of the image (same as iconinfo.width)
		int Height = read4Bytes("Height", is, "Not a Valid ICO File"); // Height (4 bytes), scanlines in the color map + transparent map (iconinfo.height * 2)
		int Planes = read2Bytes("Planes", is, "Not a Valid ICO File"); // Planes (2 bytes), always 1
		int BitCount = read2Bytes("BitCount", is, "Not a Valid ICO File"); // BitCount (2 bytes), 1,4,8,24,32 (see iconinfo for details)
		int Compression = read4Bytes("Compression", is, "Not a Valid ICO File"); // Compression (4 bytes), we don?t use this (0)
		int SizeImage = read4Bytes("SizeImage", is, "Not a Valid ICO File"); // SizeImage (4 bytes), we don?t use this (0)
		int XPelsPerMeter = read4Bytes("XPelsPerMeter", is,
				"Not a Valid ICO File"); // XPelsPerMeter (4 bytes), we don?t use this (0)
		int YPelsPerMeter = read4Bytes("YPelsPerMeter", is,
				"Not a Valid ICO File"); // YPelsPerMeter (4 bytes), we don?t use this (0)
		int ColorsUsed = read4Bytes("ColorsUsed", is, "Not a Valid ICO File"); // ColorsUsed (4 bytes), we don?t use this (0)
		int ColorsImportant = read4Bytes("ColorsImportant", is,
				"Not a Valid ICO File"); // ColorsImportant (4 bytes), we don?t use this (0)

		BitmapHeader header = new BitmapHeader(Size, Width, Height, Planes,
				BitCount, Compression, SizeImage, XPelsPerMeter, YPelsPerMeter,
				ColorsUsed, ColorsImportant);

		//		System.out.println("XXXXXXXXXXXXXXXXXXXX");
		//		fIconInfo.dump();
		//		header.dump();
		//		System.out.println("XXXXXXXXXXXXXXXXXXXX");

		int palette_size = 0;
		byte palette[] = null;

		if ((fIconInfo.BitCount == 1) || (fIconInfo.BitCount == 4)
				|| (fIconInfo.BitCount == 8))
		{
			palette_size = 4 * (1 << fIconInfo.BitCount);
			palette = this.readByteArray("palette", palette_size, is,
					"Not a Valid ICO File");
		}

		byte color_map[] = null;
		int scanline_size = (fIconInfo.BitCount * fIconInfo.Width + 7) / 8;
		if ((scanline_size % 4) != 0)
			scanline_size += 4 - (scanline_size % 4); // pad scanline to 4 byte size.

		int color_map_size_bytes = scanline_size * fIconInfo.Height;
		{
			color_map = this.readByteArray("color_map", color_map_size_bytes,
					is, "Not a Valid ICO File");
		}

		byte transparency_map[] = null;
		int t_scanline_size = (fIconInfo.Width + 7) / 8;
		if ((t_scanline_size % 4) != 0)
			t_scanline_size += 4 - (t_scanline_size % 4); // pad scanline to 4 byte size.

		int tcolor_map_size_bytes = t_scanline_size * fIconInfo.Height;
		{
			transparency_map = this.readByteArray("transparency_map",
					tcolor_map_size_bytes, is, "Not a Valid ICO File");
		}

		return new IconData(fIconInfo, header, palette, color_map,
				scanline_size, transparency_map, t_scanline_size);
	}

	private static class ImageContents
	{
		public final FileHeader fileHeader;
		public final IconData iconDatas[];

		public ImageContents(final FileHeader fileHeader,
				final IconData[] iconDatas)
		{
			super();
			this.fileHeader = fileHeader;
			this.iconDatas = iconDatas;
		}
	}

	private ImageContents readImage(ByteSource byteSource)
			throws ImageReadException, IOException
	{
		InputStream is = null;
		try
		{
			is = byteSource.getInputStream();
			FileHeader fileHeader = readFileHeader(is);

			//			fileHeader.dump();

			IconInfo fIconInfos[] = new IconInfo[fileHeader.iconCount];
			for (int i = 0; i < fileHeader.iconCount; i++)
			{
				fIconInfos[i] = readIconInfo(is);
				//				fIconInfos[i].dump();
			}

			IconData fIconDatas[] = new IconData[fileHeader.iconCount];
			for (int i = 0; i < fileHeader.iconCount; i++)
			{
				fIconDatas[i] = readIconData(is, fIconInfos[i]);
				//				fIconDatas[i].dump();
			}

			return new ImageContents(fileHeader, fIconDatas);
		}
		finally
		{
			try
			{
				is.close();
			}
			catch (Exception e)
			{
				Debug.debug(e);
			}

		}
	}

	public final BufferedImage getBufferedImage(ByteSource byteSource,
			Map params) throws ImageReadException, IOException
	{
		throw new ImageReadException(
				"Use getAllBufferedImages() instead for .ico images.");
	}


	private BufferedImage readBufferedImage(IconData fIconData)
			throws ImageReadException
	{
		IconInfo fIconInfo = fIconData.iconInfo;

		int width = fIconInfo.Width;
		int height = fIconInfo.Height;
		int data[] = new int[width * height];

		for (int y = 0; y < height; y++)
		{
			for (int x = 0; x < width; x++)
			{
				int rgb;

				int alpha_byte = 0xff & fIconData.transparency_map[fIconData.t_scanline_size
						* y + (x / 8)];
				int alpha = 0x01 & (alpha_byte >> (7 - (x % 8)));
				alpha = (alpha == 0) ? 0xff : 0x00;

				if ((fIconInfo.BitCount == 1) || (fIconInfo.BitCount == 4)
						|| (fIconInfo.BitCount == 8))
				{
					int bit_index = fIconData.scanline_size * y * 8 + x
							* fIconInfo.BitCount;
					int b = 0xff & fIconData.color_map[(bit_index >> 3)];
					int mask = (1 << fIconInfo.BitCount) - 1;
					int shift = 8 - (bit_index % 8) - fIconInfo.BitCount;
					int color_index = mask & (b >> shift);

					int red = 0xff & fIconData.palette[4 * color_index + 2];
					int green = 0xff & fIconData.palette[4 * color_index + 1];
					int blue = 0xff & fIconData.palette[4 * color_index + 0];
					rgb = ((0xff & red) << 16) | ((0xff & green) << 8)
							| ((0xff & blue) << 0);
				}
				else if ((fIconInfo.BitCount == 24)
						|| (fIconInfo.BitCount == 32))
				{
					int byte_count = fIconInfo.BitCount >> 3;
					int index = fIconData.scanline_size * y + x * byte_count;
					int red = 0xff & fIconData.color_map[index + 2];
					int green = 0xff & fIconData.color_map[index + 1];
					int blue = 0xff & fIconData.color_map[index + 0];

					rgb = ((0xff & red) << 16) | ((0xff & green) << 8)
							| ((0xff & blue) << 0);
				}
				else
					throw new ImageReadException("Unknown BitCount: "
							+ fIconInfo.BitCount);

				int argb = ((alpha & 0xff) << 24) | (rgb & 0xffffff);

				//				argb = 0xff000000 | argb;

				data[(height - y - 1) * width + x] = argb;
			}
		}

		ColorModel cModel = ColorModel.getRGBdefault();
		DataBufferInt intBuf = new DataBufferInt(data, (width * height));
		SampleModel sModel = cModel.createCompatibleSampleModel(width, height);

		// create our raster
		WritableRaster raster = Raster.createWritableRaster(sModel, intBuf,
				null);

		// now create and return our buffered image
		BufferedImage result = new BufferedImage(cModel, raster, false, null);

		return result;
	}
	

	public Vector getAllBufferedImages(ByteSource byteSource)
			throws ImageReadException, IOException
	{
		Vector result = new Vector();
		ImageContents contents = readImage(byteSource);

		FileHeader fileHeader = contents.fileHeader;
		for (int i = 0; i < fileHeader.iconCount; i++)
		{
			IconData iconData = contents.iconDatas[i];

			BufferedImage image = readBufferedImage(iconData);

			result.add(image);
		}

		return result;
	}

//	public boolean extractImages(ByteSource byteSource, File dst_dir,
//			String dst_root, ImageParser encoder) throws ImageReadException,
//			IOException, ImageWriteException
//	{
//		ImageContents contents = readImage(byteSource);
//
//		FileHeader fileHeader = contents.fileHeader;
//		for (int i = 0; i < fileHeader.iconCount; i++)
//		{
//			IconData iconData = contents.iconDatas[i];
//
//			BufferedImage image = readBufferedImage(iconData);
//
//			int size = Math.max(iconData.iconInfo.Width,
//					iconData.iconInfo.Height);
//			File file = new File(dst_dir, dst_root + "_" + size + "_"
//					+ iconData.iconInfo.BitCount
//					+ encoder.getDefaultExtension());
//			encoder.writeImage(image, new FileOutputStream(file), null);
//		}
//
//		return true;
//	}

}