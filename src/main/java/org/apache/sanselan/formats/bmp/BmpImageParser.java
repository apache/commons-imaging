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
package org.apache.sanselan.formats.bmp;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;

import org.apache.sanselan.FormatCompliance;
import org.apache.sanselan.ImageFormat;
import org.apache.sanselan.ImageInfo;
import org.apache.sanselan.ImageParser;
import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.common.BinaryOutputStream;
import org.apache.sanselan.common.IImageMetadata;
import org.apache.sanselan.common.byteSources.ByteSource;
import org.apache.sanselan.formats.bmp.pixelparsers.PixelParser;
import org.apache.sanselan.formats.bmp.pixelparsers.PixelParserBitFields;
import org.apache.sanselan.formats.bmp.pixelparsers.PixelParserRgb;
import org.apache.sanselan.formats.bmp.pixelparsers.PixelParserRle;
import org.apache.sanselan.formats.bmp.writers.BMPWriter;
import org.apache.sanselan.formats.bmp.writers.BMPWriterPalette;
import org.apache.sanselan.formats.bmp.writers.BMPWriterRGB;
import org.apache.sanselan.palette.PaletteFactory;
import org.apache.sanselan.palette.SimplePalette;
import org.apache.sanselan.util.Debug;

public class BmpImageParser extends ImageParser
{

	public BmpImageParser()
	{
		super.setByteOrder(BYTE_ORDER_INTEL);
	}

	public String getName()
	{
		return "Bmp-Custom";
	}

	public String getDefaultExtension()
	{
		return DEFAULT_EXTENSION;
	}

	private static final String DEFAULT_EXTENSION = ".bmp";

	private static final String ACCEPTED_EXTENSIONS[] = {
		DEFAULT_EXTENSION,
	};

	protected String[] getAcceptedExtensions()
	{
		return ACCEPTED_EXTENSIONS;
	}

	protected ImageFormat[] getAcceptedTypes()
	{
		return new ImageFormat[]{
			ImageFormat.IMAGE_FORMAT_BMP, //
		};
	}

	private static final byte BMP_HEADER_SIGNATURE[] = {
			0x42, 0x4d,
	};

	private BmpHeaderInfo readBmpHeaderInfo(InputStream is,
			FormatCompliance formatCompliance) throws ImageReadException,
			IOException
	{
		byte Identifier1 = readByte("Identifier1", is, "Not a Valid BMP File");
		byte Identifier2 = readByte("Identifier2", is, "Not a Valid BMP File");

		//		System.out.println("a");
		if (formatCompliance != null)
		{
			//			System.out.println("b");
			formatCompliance.compare_bytes("Signature", BMP_HEADER_SIGNATURE,
					new byte[]{
							Identifier1, Identifier2,
					});
		}

		int FileSize = read4Bytes("File Size", is, "Not a Valid BMP File");
		int Reserved = read4Bytes("Reserved", is, "Not a Valid BMP File");
		int BitmapDataOffset = read4Bytes("Bitmap Data Offset", is,
				"Not a Valid BMP File");

		int BitmapHeaderSize = read4Bytes("Bitmap Header Size", is,
				"Not a Valid BMP File");
		int Width = read4Bytes("Width", is, "Not a Valid BMP File");
		int Height = read4Bytes("Height", is, "Not a Valid BMP File");
		int Planes = read2Bytes("Planes", is, "Not a Valid BMP File");
		int BitsPerPixel = read2Bytes("Bits Per Pixel", is,
				"Not a Valid BMP File");
		int Compression = read4Bytes("Compression", is, "Not a Valid BMP File");
		int BitmapDataSize = read4Bytes("Bitmap Data Size", is,
				"Not a Valid BMP File");
		int HResolution = read4Bytes("HResolution", is, "Not a Valid BMP File");
		int VResolution = read4Bytes("VResolution", is, "Not a Valid BMP File");
		int ColorsUsed = read4Bytes("ColorsUsed", is, "Not a Valid BMP File");
		int ColorsImportant = read4Bytes("ColorsImportant", is,
				"Not a Valid BMP File");

		BmpHeaderInfo result = new BmpHeaderInfo(Identifier1, Identifier2,
				FileSize, Reserved, BitmapDataOffset,

				BitmapHeaderSize, Width, Height, Planes, BitsPerPixel,
				Compression, BitmapDataSize, HResolution, VResolution,
				ColorsUsed, ColorsImportant);
		return result;
	}

	private static final int BI_RGB = 0;
	private static final int BI_RLE4 = 2;
	private static final int BI_RLE8 = 1;
	private static final int BI_BITFIELDS = 3;

	private byte[] getRLEBytes(InputStream is, int RLESamplesPerByte)
			throws ImageReadException, IOException
	{
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		//		this.setDebug(true);

		boolean done = false;
		while (!done)
		{
			int a = 0xff & this.readByte("RLE a", is, "BMP: Bad RLE");
			baos.write(a);
			int b = 0xff & this.readByte("RLE b", is, "BMP: Bad RLE");
			baos.write(b);

			if (a == 0)
			{
				switch (b)
				{
					case 0 : // EOL
						break;
					case 1 : // EOF
						//						System.out.println("xXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
						done = true;
						break;
					case 2 : {
						//						System.out.println("xXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
						int c = 0xff & this.readByte("RLE c", is,
								"BMP: Bad RLE");
						baos.write(c);
						int d = 0xff & this.readByte("RLE d", is,
								"BMP: Bad RLE");
						baos.write(d);

					}
						break;
					default : {
						int size = b / RLESamplesPerByte;
						if ((b % RLESamplesPerByte) > 0)
							size++;
						if ((size % 2) != 0)
							size++;

						//						System.out.println("b: " + b);
						//						System.out.println("size: " + size);
						//						System.out.println("RLESamplesPerByte: " + RLESamplesPerByte);
						//						System.out.println("xXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
						byte bytes[] = this.readByteArray("bytes", size, is,
								"RLE: Absolute Mode");
						baos.write(bytes);
					}
						break;
				}
			}
		}

		return baos.toByteArray();
	}

	private ImageContents readImageContents(InputStream is,
			FormatCompliance formatCompliance) throws ImageReadException,
			IOException
	{
		BmpHeaderInfo bhi = readBmpHeaderInfo(is, formatCompliance);

		int colorTableSize = bhi.colorsUsed;
		if (colorTableSize == 0)
			colorTableSize = (1 << bhi.bitsPerPixel);

		if (debug)
		{
			this.debugNumber("ColorsUsed", bhi.colorsUsed, 4);
			this.debugNumber("BitsPerPixel", bhi.bitsPerPixel, 4);
			this.debugNumber("ColorTableSize", colorTableSize, 4);
			this.debugNumber("Compression", bhi.compression, 4);
		}

		int paletteLength;
		int rleSamplesPerByte = 0;
		boolean rle = false;

		switch (bhi.compression)
		{
			case BI_RGB :
				if (debug)
					System.out.println("Compression: BI_RGB");
				if (bhi.bitsPerPixel <= 8)
					paletteLength = 4 * colorTableSize;
				else
					paletteLength = 0;
				//				BytesPerPaletteEntry = 0;
				//				System.out.println("Compression: BI_RGBx2: " + bhi.BitsPerPixel);
				//				System.out.println("Compression: BI_RGBx2: " + (bhi.BitsPerPixel <= 16));
				break;

			case BI_RLE4 :
				if (debug)
					System.out.println("Compression: BI_RLE4");
				paletteLength = 4 * colorTableSize;
				rleSamplesPerByte = 2;
				//				ExtraBitsPerPixel = 4;
				rle = true;
				////				BytesPerPixel = 2;
				////				BytesPerPaletteEntry = 0;
				break;
			//
			case BI_RLE8 :
				if (debug)
					System.out.println("Compression: BI_RLE8");
				paletteLength = 4 * colorTableSize;
				rleSamplesPerByte = 1;
				//				ExtraBitsPerPixel = 8;
				rle = true;
				//				BytesPerPixel = 2;
				//				BytesPerPaletteEntry = 0;
				break;
			//
			case BI_BITFIELDS :
				if (debug)
					System.out.println("Compression: BI_BITFIELDS");
				paletteLength = 3 * 4; // TODO: is this right?  are the masks always LONGs?
				//				BytesPerPixel = 2;
				//				BytesPerPaletteEntry = 4;
				break;

			default :
				throw new ImageReadException("BMP: Unknown Compression: "
						+ bhi.compression);
		}

		byte colorTable[] = null;
		if (paletteLength > 0)
			//		if (bhi.Compression != BI_RGB)
			colorTable = this.readByteArray("ColorTable", paletteLength, is,
					"Not a Valid BMP File");

		if (debug)
		{
			this.debugNumber("PaletteLength", paletteLength, 4);
			System.out.println("ColorTable: "
					+ ((colorTable == null) ? "null" : "" + colorTable.length));
		}

		int pixelCount = bhi.width * bhi.height;

		int imageLineLength = ((((bhi.bitsPerPixel) * bhi.width) + 7) / 8);

		if (debug)
		{
			//			this.debugNumber("Total BitsPerPixel",
			//					(ExtraBitsPerPixel + bhi.BitsPerPixel), 4);
			//			this.debugNumber("Total Bit Per Line",
			//					((ExtraBitsPerPixel + bhi.BitsPerPixel) * bhi.Width), 4);
			//			this.debugNumber("ExtraBitsPerPixel", ExtraBitsPerPixel, 4);
			this.debugNumber("bhi.Width", bhi.width, 4);
			this.debugNumber("bhi.Height", bhi.height, 4);
			this.debugNumber("ImageLineLength", imageLineLength, 4);
			//			this.debugNumber("ImageDataSize", ImageDataSize, 4);
			this.debugNumber("PixelCount", pixelCount, 4);
		}
		//		int ImageLineLength = BytesPerPixel * bhi.Width;
		while ((imageLineLength % 4) != 0)
			imageLineLength++;

		final int header_size = 54;
		int expected_data_offset = header_size + paletteLength;

		if (debug)
		{
			this.debugNumber("bhi.BitmapDataOffset", bhi.bitmapDataOffset, 4);
			this.debugNumber("expected_data_offset", expected_data_offset, 4);
		}
		int extra_bytes = bhi.bitmapDataOffset - expected_data_offset;
		if (extra_bytes < 0)
			throw new ImageReadException("BMP: Strange BitmapDataOffset: "
					+ bhi.bitmapDataOffset + " (expected: "
					+ expected_data_offset + ", PaletteLength: "
					+ paletteLength + ", header_size: " + header_size + ")");
		else if (extra_bytes > 0)
			//		if(bhi.BiCtmapDataOffset>0)
			////			byte ImageData[] = 
			this.readByteArray("BitmapDataOffset", extra_bytes, is,
					"Not a Valid BMP File");

		int ImageDataSize = bhi.height * imageLineLength;

		if (debug)
		{
			this.debugNumber("ImageDataSize", ImageDataSize, 4);
		}

		byte ImageData[];
		if (rle)
			ImageData = getRLEBytes(is, rleSamplesPerByte);
		else
			ImageData = this.readByteArray("ImageData", ImageDataSize, is,
					"Not a Valid BMP File");

		if (debug)
		{
			this.debugNumber("ImageData.length", ImageData.length, 4);
		}
		PixelParser pixelParser;

		switch (bhi.compression)
		{

			case BI_RLE4 :
			case BI_RLE8 :
				pixelParser = new PixelParserRle(bhi, colorTable, ImageData);
				break;

			case BI_RGB :
				pixelParser = new PixelParserRgb(bhi, colorTable, ImageData);
				break;
			case BI_BITFIELDS :
				pixelParser = new PixelParserBitFields(bhi, colorTable,
						ImageData);
				break;
			default :
				throw new ImageReadException("BMP: Unknown Compression: "
						+ bhi.compression);
		}

		return new ImageContents(bhi, colorTable, ImageData, pixelParser);
	}

	private BmpHeaderInfo readBmpHeaderInfo(ByteSource byteSource)
			throws ImageReadException, IOException
	{
		//		{
		InputStream is = null;
		//			BufferedInputStream bis = null;
		try
		{
			is = byteSource.getInputStream();
			//				is = new FileInputStream(file);
			//				bis = new BufferedInputStream(is);

			//				readSignature(is);
			return readBmpHeaderInfo(is, null);
		}
		//			catch (Exception e)
		//			{
		//				//				System.out.println("Error: " + file.getAbsolutePath());
		//		Debug.debug(e);	}
		finally
		{
			try
			{
				//					bis.close();
				is.close();
			}
			catch (Exception e)
			{
				Debug.debug(e);
			}

		}
		//		}
		//		return null;
	}

	public byte[] getICCProfileBytes(ByteSource byteSource)
			throws ImageReadException, IOException
	{
		return null;
	}

	public Dimension getImageSize(ByteSource byteSource)
			throws ImageReadException, IOException
	{
		BmpHeaderInfo bhi = readBmpHeaderInfo(byteSource);

		if (bhi == null)
			throw new ImageReadException("BMP: couldn't read header");

		return new Dimension(bhi.width, bhi.height);

	}

	public byte[] embedICCProfile(byte image[], byte profile[])
	{
		return null;
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

	private String getBmpTypeDescription(int Identifier1, int Identifier2)
	{
		if ((Identifier1 == 'B') && (Identifier2 == 'M'))
			return "Windows 3.1x, 95, NT,";
		if ((Identifier1 == 'B') && (Identifier2 == 'A'))
			return "OS/2 Bitmap Array";
		if ((Identifier1 == 'C') && (Identifier2 == 'I'))
			return "OS/2 Color Icon";
		if ((Identifier1 == 'C') && (Identifier2 == 'P'))
			return "OS/2 Color Pointer";
		if ((Identifier1 == 'I') && (Identifier2 == 'C'))
			return "OS/2 Icon";
		if ((Identifier1 == 'P') && (Identifier2 == 'T'))
			return "OS/2 Pointer";

		return "Unknown";
	}

	public ImageInfo getImageInfo(ByteSource byteSource)
			throws ImageReadException, IOException
	{
		ImageContents ic = readImageContents(byteSource.getInputStream(),
				getDefaultFormatCompliance());

		if (ic == null)
			throw new ImageReadException("Couldn't read BMP Data");

		BmpHeaderInfo bhi = ic.bhi;
		byte colorTable[] = ic.colorTable;
		//		byte ImageData[] = ic.ImageData;

		//		BmpHeaderInfo bhi = readBmpHeaderInfo(byteSource);
		if (bhi == null)
			throw new ImageReadException("BMP: couldn't read header");

		int Height = bhi.height;
		int Width = bhi.width;

		Vector Comments = new Vector();
		// TODO: comments...

		int bitsPerPixel = bhi.bitsPerPixel;
		ImageFormat format = ImageFormat.IMAGE_FORMAT_BMP;
		String fName = "BMP Windows Bitmap";
		String mimeType = "image/x-ms-bmp";
		// we ought to count images, but don't yet.
		int numberOfImages = -1;
		// not accurate ... only reflects first
		boolean isProgressive = false;
		//					boolean isProgressive = (fPNGChunkIHDR.InterlaceMethod != 0);
		//
		// pixels per meter
		int physicalWidthDpi = (int) ((double) bhi.hResolution * 1000.0 / 2.54);
		float physicalWidthInch = (float) ((double) Width / (double) physicalWidthDpi);
		//		int physicalHeightDpi = 72;
		int physicalHeightDpi = (int) ((double) bhi.vResolution * 1000.0 / 2.54);
		float physicalHeightInch = (float) ((double) Height / (double) physicalHeightDpi);

		String formatDetails = "Bmp (" + (char) bhi.identifier1
				+ (char) bhi.identifier2 + ": "
				+ getBmpTypeDescription(bhi.identifier1, bhi.identifier2) + ")";

		boolean isTransparent = false;
		//		if (gce != null)
		//		{
		//			if (gce.transparency)
		//				isTransparent = true;
		//		}

		boolean usesPalette = colorTable != null;
		int ColorType = ImageInfo.COLOR_TYPE_RGB;
		String compressionAlgorithm = ImageInfo.COMPRESSION_ALGORITHM_RLE;

		ImageInfo result = new ImageInfo(formatDetails, bitsPerPixel, Comments,
				format, fName, Height, mimeType, numberOfImages,
				physicalHeightDpi, physicalHeightInch, physicalWidthDpi,
				physicalWidthInch, Width, isProgressive, isTransparent,
				usesPalette, ColorType, compressionAlgorithm);

		return result;
	}

	public boolean dumpImageFile(PrintWriter pw, ByteSource byteSource)
			throws ImageReadException, IOException
	{
		pw.println("bmp.dumpImageFile");

		ImageInfo imageData = getImageInfo(byteSource);
		if (imageData == null)
			return false;

		imageData.toString(pw, "");

		pw.println("");

		return true;
	}

	public FormatCompliance getFormatCompliance(ByteSource byteSource)
			throws ImageReadException, IOException
	{
		FormatCompliance result = new FormatCompliance(byteSource
				.getDescription());

		ImageContents ic = readImageContents(byteSource.getInputStream(),
				result);

		return result;
	}

	public BufferedImage getBufferedImage(ByteSource byteSource, Map params)
			throws ImageReadException, IOException
	{
		ImageContents ic = readImageContents(byteSource.getInputStream(),
				getDefaultFormatCompliance());
		if (ic == null)
			throw new ImageReadException("Couldn't read BMP Data");

		BmpHeaderInfo bhi = ic.bhi;
		byte colorTable[] = ic.colorTable;
		byte imageData[] = ic.imageData;

		int width = bhi.width;
		int height = bhi.height;

		BufferedImage result = getBufferedImageFactory(params)
				.getColorBufferedImage(width, height);

		if (debug)
		{
			System.out.println("width: " + width);
			System.out.println("height: " + height);
			System.out.println("width*height: " + width * height);
			System.out.println("width*height*4: " + width * height * 4);
		}

		PixelParser pixelParser = ic.pixelParser;

		pixelParser.processImage(result);

		return result;

	}

	private static final int BITMAP_FILE_HEADER_SIZE = 14;
	private static final int BITMAP_INFO_HEADER_SIZE = 40;

	public void writeImage(BufferedImage src, OutputStream os, Map params)
			throws ImageWriteException, IOException
	{
		// make copy of params; we'll clear keys as we consume them.
		params = new Hashtable(params);

		// clear format key.
		if (params.containsKey(PARAM_KEY_FORMAT))
			params.remove(PARAM_KEY_FORMAT);

		if (params.size() > 0)
		{
			Object firstKey = params.keySet().iterator().next();
			throw new ImageWriteException("Unknown parameter: " + firstKey);
		}

		SimplePalette palette = new PaletteFactory()
				.makePaletteSimple(src, 256);

		BMPWriter writer = null;
		if (palette == null)
			writer = new BMPWriterRGB();
		else
			writer = new BMPWriterPalette(palette);

		byte imagedata[] = writer.getImageData(src);
		BinaryOutputStream bos = new BinaryOutputStream(os, BYTE_ORDER_INTEL);

		{
			// write BitmapFileHeader
			os.write(0x42); // B, Windows 3.1x, 95, NT, Bitmap
			os.write(0x4d); // M 

			int filesize = BITMAP_FILE_HEADER_SIZE + BITMAP_INFO_HEADER_SIZE + // header size
					4 * writer.getPaletteSize() + //palette size in bytes
					imagedata.length;
			bos.write4Bytes(filesize);

			bos.write4Bytes(0); // reserved
			bos.write4Bytes(BITMAP_FILE_HEADER_SIZE + BITMAP_INFO_HEADER_SIZE
					+ 4 * writer.getPaletteSize()); // Bitmap Data Offset
		}

		int width = src.getWidth();
		int height = src.getHeight();

		{ // write BitmapInfoHeader
			bos.write4Bytes(BITMAP_INFO_HEADER_SIZE); // Bitmap Info Header Size
			bos.write4Bytes(width); // width
			bos.write4Bytes(height); // height
			bos.write2Bytes(1); // Number of Planes
			bos.write2Bytes(writer.getBitsPerPixel()); // Bits Per Pixel

			bos.write4Bytes(0); // Compression
			bos.write4Bytes(imagedata.length); // Bitmap Data Size
			bos.write4Bytes(0); // HResolution
			bos.write4Bytes(0); // VResolution
			bos.write4Bytes(0); // Colors
			bos.write4Bytes(0); // Important Colors
			//			bos.write_4_bytes(0); // Compression
		}

		{ // write Palette
			writer.writePalette(bos);
		}
		{ // write Image Data
			bos.writeByteArray(imagedata);
		}
	}

}