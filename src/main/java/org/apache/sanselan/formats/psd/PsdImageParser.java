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
package org.apache.sanselan.formats.psd;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Vector;

import org.apache.sanselan.ImageFormat;
import org.apache.sanselan.ImageInfo;
import org.apache.sanselan.ImageParser;
import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.common.IImageMetadata;
import org.apache.sanselan.common.byteSources.ByteSource;
import org.apache.sanselan.formats.psd.dataparsers.DataParser;
import org.apache.sanselan.formats.psd.dataparsers.DataParserBitmap;
import org.apache.sanselan.formats.psd.dataparsers.DataParserCMYK;
import org.apache.sanselan.formats.psd.dataparsers.DataParserGrayscale;
import org.apache.sanselan.formats.psd.dataparsers.DataParserIndexed;
import org.apache.sanselan.formats.psd.dataparsers.DataParserLab;
import org.apache.sanselan.formats.psd.dataparsers.DataParserRGB;
import org.apache.sanselan.formats.psd.datareaders.CompressedDataReader;
import org.apache.sanselan.formats.psd.datareaders.DataReader;
import org.apache.sanselan.formats.psd.datareaders.UncompressedDataReader;
import org.apache.sanselan.util.Debug;

public class PsdImageParser extends ImageParser
{

	public PsdImageParser()
	{
		super.setByteOrder(BYTE_ORDER_MSB);
		//		setDebug(true);
	}

	public String getName()
	{
		return "PSD-Custom";
	}

	public String getDefaultExtension()
	{
		return DEFAULT_EXTENSION;
	}

	private static final String DEFAULT_EXTENSION = ".psd";

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
			ImageFormat.IMAGE_FORMAT_PSD, //
		};
	}

	private PSDHeaderInfo readHeader(ByteSource byteSource)
			throws ImageReadException, IOException
	{
		InputStream is = null;

		try
		{
			is = byteSource.getInputStream();

			return readHeader(is);
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

	private PSDHeaderInfo readHeader(InputStream is) throws ImageReadException,
			IOException
	{
		readAndVerifyBytes(is, new byte[]{
				56, 66, 80, 83
		}, "Not a Valid PSD File");

		int Version = read2Bytes("Version", is, "Not a Valid PSD File");

		byte Reserved[] = readByteArray("Reserved", 6, is,
				"Not a Valid PSD File");

		int Channels = read2Bytes("Channels", is, "Not a Valid PSD File");
		int Rows = read4Bytes("Rows", is, "Not a Valid PSD File");
		int Columns = read4Bytes("Columns", is, "Not a Valid PSD File");
		int Depth = read2Bytes("Depth", is, "Not a Valid PSD File");
		int Mode = read2Bytes("Mode", is, "Not a Valid PSD File");

		PSDHeaderInfo result = new PSDHeaderInfo(Version, Reserved, Channels,
				Rows, Columns, Depth, Mode);

		return result;
	}

	private ImageContents readImageContents(InputStream is)
			throws ImageReadException, IOException
	{
		PSDHeaderInfo header = readHeader(is);

		int ColorModeDataLength = read4Bytes("ColorModeDataLength", is,
				"Not a Valid PSD File");
		skipBytes(is, ColorModeDataLength);
		//		is.skip(ColorModeDataLength);
		//				byte ColorModeData[] = readByteArray("ColorModeData",
		//						ColorModeDataLength, is, "Not a Valid PSD File");

		int ImageResourcesLength = read4Bytes("ImageResourcesLength", is,
				"Not a Valid PSD File");
		skipBytes(is, ImageResourcesLength);
		//		long skipped = is.skip(ImageResourcesLength);
		//				byte ImageResources[] = readByteArray("ImageResources",
		//						ImageResourcesLength, is, "Not a Valid PSD File");

		int LayerAndMaskDataLength = read4Bytes("LayerAndMaskDataLength", is,
				"Not a Valid PSD File");
		skipBytes(is, LayerAndMaskDataLength);
		//		is.skip(LayerAndMaskDataLength);
		//				byte LayerAndMaskData[] = readByteArray("LayerAndMaskData",
		//						LayerAndMaskDataLength, is, "Not a Valid PSD File");

		int Compression = read2Bytes("Compression", is, "Not a Valid PSD File");

		//		skip_bytes(is, LayerAndMaskDataLength);
		//		byte ImageData[] = readByteArray("ImageData", LayerAndMaskDataLength,
		//				is, "Not a Valid PSD File");

		//		System.out.println("Compression: " + Compression);

		ImageContents result = new ImageContents(header, ColorModeDataLength,
		//				ColorModeData, 
				ImageResourcesLength,
				//				ImageResources,
				LayerAndMaskDataLength,
				//				LayerAndMaskData, 
				Compression);

		return result;
	}

	private Vector readImageResourceBlocks(byte bytes[],
			int fImageResourceIDs[], int max_blocks_to_read)
			throws ImageReadException, IOException
	{
		return readImageResourceBlocks(new ByteArrayInputStream(bytes),
				fImageResourceIDs, max_blocks_to_read, bytes.length);
	}

	private boolean keepImageResourceBlock(int ID, int fImageResourceIDs[])
	{
		if (fImageResourceIDs == null)
			return true;

		for (int i = 0; i < fImageResourceIDs.length; i++)
			if (ID == fImageResourceIDs[i])
				return true;

		return false;
	}

	private Vector readImageResourceBlocks(InputStream is,
			int fImageResourceIDs[], int max_blocks_to_read, int available)
			throws ImageReadException, IOException
	{
		Vector result = new Vector();

		while (available > 0)
		{
			//			if (debug)
			//				System.out.println("available: " + available);

			readAndVerifyBytes(is, new byte[]{
					56, 66, 73, 77
			}, "Not a Valid PSD File");
			available -= 4;

			int ID = read2Bytes("ID", is, "Not a Valid PSD File");
			available -= 2;

			int NameLength = readByte("NameLength", is, "Not a Valid PSD File");

			available -= 1;
			//			int ActualNameLength = (((NameLength + 1) % 2) == 0)
			//					? NameLength
			//					: NameLength + 1; // pad to make even
			byte NameData[] = readByteArray("NameData", NameLength, is,
					"Not a Valid PSD File");
			available -= NameLength;
			if (((NameLength + 1) % 2) != 0)
			{
				int NameDiscard = readByte("NameDiscard", is,
						"Not a Valid PSD File");
				available -= 1;
			}
			//		String Name = readPString("Name", 6, is, "Not a Valid PSD File");
			int DataSize = read4Bytes("Size", is, "Not a Valid PSD File");
			available -= 4;
			//			int ActualDataSize = ((DataSize % 2) == 0)
			//					? DataSize
			//					: DataSize + 1; // pad to make even

			byte Data[] = readByteArray("Data", DataSize, is,
					"Not a Valid PSD File");
			available -= DataSize;

			if ((DataSize % 2) != 0)
			{
				int DataDiscard = readByte("DataDiscard", is,
						"Not a Valid PSD File");
				available -= 1;
			}

			if (keepImageResourceBlock(ID, fImageResourceIDs))
			{
				result.add(new ImageResourceBlock(ID, NameData, Data));

				if ((max_blocks_to_read >= 0)
						&& (result.size() >= max_blocks_to_read))
					return result;
			}
			//			debugNumber("ID", ID, 2);

		}

		return result;
	}

	private Vector readImageResourceBlocks(ByteSource byteSource,
			int fImageResourceIDs[], int max_blocks_to_read)
			throws ImageReadException, IOException
	{
		InputStream is = null;

		try
		{
			is = byteSource.getInputStream();

			ImageContents imageContents = readImageContents(is);

			is.close();

			is = this.getInputStream(byteSource, PSD_SECTION_IMAGE_RESOURCES);
			byte ImageResources[] = readByteArray("ImageResources",
					imageContents.ImageResourcesLength, is,
					"Not a Valid PSD File");

			return readImageResourceBlocks(ImageResources, fImageResourceIDs,
					max_blocks_to_read);
		}
		//		catch (Exception e)
		//		{
		//			//			System.out.println("Error: " + file.getAbsolutePath());
		//		Debug.debug(e);	}
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
		//		is.reset();
		//		if (debug)
		//			System.out.println("");
		//
		//		return null;
	}

	//	InputStream is = getInputStream(byteSource, kPSD_SECTION_IMAGE_DATA);

	private static final int PSD_SECTION_HEADER = 0;
	private static final int PSD_SECTION_COLOR_MODE = 1;
	private static final int PSD_SECTION_IMAGE_RESOURCES = 2;
	private static final int PSD_SECTION_LAYER_AND_MASK_DATA = 3;
	private static final int PSD_SECTION_IMAGE_DATA = 4;

	private static final int PSD_HEADER_LENGTH = 26;

	private InputStream getInputStream(ByteSource byteSource, int section)
			throws ImageReadException, IOException
	{
		InputStream is = byteSource.getInputStream();

		if (section == PSD_SECTION_HEADER)
			return is;

		skipBytes(is, PSD_HEADER_LENGTH);
		//		is.skip(kHeaderLength);

		int ColorModeDataLength = read4Bytes("ColorModeDataLength", is,
				"Not a Valid PSD File");

		if (section == PSD_SECTION_COLOR_MODE)
			return is;

		skipBytes(is, ColorModeDataLength);
		//		byte ColorModeData[] = readByteArray("ColorModeData",
		//				ColorModeDataLength, is, "Not a Valid PSD File");

		int ImageResourcesLength = read4Bytes("ImageResourcesLength", is,
				"Not a Valid PSD File");

		if (section == PSD_SECTION_IMAGE_RESOURCES)
			return is;

		skipBytes(is, ImageResourcesLength);
		//		byte ImageResources[] = readByteArray("ImageResources",
		//				ImageResourcesLength, is, "Not a Valid PSD File");

		int LayerAndMaskDataLength = read4Bytes("LayerAndMaskDataLength", is,
				"Not a Valid PSD File");

		if (section == PSD_SECTION_LAYER_AND_MASK_DATA)
			return is;

		skipBytes(is, LayerAndMaskDataLength);
		//		byte LayerAndMaskData[] = readByteArray("LayerAndMaskData",
		//				LayerAndMaskDataLength, is, "Not a Valid PSD File");

		int Compression = read2Bytes("Compression", is, "Not a Valid PSD File");

		//		byte ImageData[] = readByteArray("ImageData",
		//				LayerAndMaskDataLength, is, "Not a Valid PSD File");

		if (section == PSD_SECTION_IMAGE_DATA)
			return is;

		throw new ImageReadException("getInputStream: Unknown Section: "
				+ section);
	}

	private byte[] getData(ByteSource byteSource, int section)
			throws ImageReadException, IOException
	{
		InputStream is = null;

		try
		{
			is = byteSource.getInputStream();

			//			PSDHeaderInfo header = readHeader(is);
			if (section == PSD_SECTION_HEADER)
				return readByteArray("Header", PSD_HEADER_LENGTH, is,
						"Not a Valid PSD File");
			skipBytes(is, PSD_HEADER_LENGTH);

			int ColorModeDataLength = read4Bytes("ColorModeDataLength", is,
					"Not a Valid PSD File");

			if (section == PSD_SECTION_COLOR_MODE)
				return readByteArray("ColorModeData", ColorModeDataLength, is,
						"Not a Valid PSD File");

			skipBytes(is, ColorModeDataLength);
			//		byte ColorModeData[] = readByteArray("ColorModeData",
			//				ColorModeDataLength, is, "Not a Valid PSD File");

			int ImageResourcesLength = read4Bytes("ImageResourcesLength", is,
					"Not a Valid PSD File");

			if (section == PSD_SECTION_IMAGE_RESOURCES)
				return readByteArray("ImageResources", ImageResourcesLength,
						is, "Not a Valid PSD File");

			skipBytes(is, ImageResourcesLength);
			//		byte ImageResources[] = readByteArray("ImageResources",
			//				ImageResourcesLength, is, "Not a Valid PSD File");

			int LayerAndMaskDataLength = read4Bytes("LayerAndMaskDataLength",
					is, "Not a Valid PSD File");

			if (section == PSD_SECTION_LAYER_AND_MASK_DATA)
				return readByteArray("LayerAndMaskData",
						LayerAndMaskDataLength, is, "Not a Valid PSD File");

			skipBytes(is, LayerAndMaskDataLength);
			//		byte LayerAndMaskData[] = readByteArray("LayerAndMaskData",
			//				LayerAndMaskDataLength, is, "Not a Valid PSD File");

			int Compression = read2Bytes("Compression", is,
					"Not a Valid PSD File");

			//		byte ImageData[] = readByteArray("ImageData",
			//				LayerAndMaskDataLength, is, "Not a Valid PSD File");

			//		if (section == kPSD_SECTION_IMAGE_DATA)
			//			return readByteArray("LayerAndMaskData", LayerAndMaskDataLength, is,
			//			"Not a Valid PSD File");

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
		throw new ImageReadException("getInputStream: Unknown Section: "
				+ section);
	}

	private ImageContents readImageContents(ByteSource byteSource)
			throws ImageReadException, IOException
	{
		InputStream is = null;

		try
		{
			is = byteSource.getInputStream();

			ImageContents imageContents = readImageContents(is);
			return imageContents;
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

	public final static int IMAGE_RESOURCE_Id_ICC_PROFILE = 0x040F;

	public byte[] getICCProfileBytes(ByteSource byteSource)
			throws ImageReadException, IOException
	{
		Vector segments = readImageResourceBlocks(byteSource, new int[]{
			IMAGE_RESOURCE_Id_ICC_PROFILE,
		}, 1);

		if ((segments == null) || (segments.size() < 1))
			return null;

		ImageResourceBlock irb = (ImageResourceBlock) segments.get(0);
		byte bytes[] = irb.Data;
		if ((bytes == null) || (bytes.length < 1))
			return null;
		return bytes;
	}

	public Dimension getImageSize(ByteSource byteSource)
			throws ImageReadException, IOException
	{
		PSDHeaderInfo bhi = readHeader(byteSource);
		if (bhi == null)
			throw new ImageReadException("PSD: couldn't read header");

		return new Dimension(bhi.Columns, bhi.Rows);

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

	private int getChannelsPerMode(int mode)
	{
		switch (mode)
		{
			case 0 : // Bitmap
				return 1;
			case 1 : // Grayscale
				return 1;
			case 2 : // Indexed
				return -1;
			case 3 : // RGB
				return 3;
			case 4 : // CMYK
				return 4;
			case 7 : // Multichannel
				return -1;
			case 8 : // Duotone
				return -1;
			case 9 : // Lab
				return 4;
			default :
				return -1;

		}
	}

	public ImageInfo getImageInfo(ByteSource byteSource)
			throws ImageReadException, IOException
	{
		ImageContents imageContents = readImageContents(byteSource);
		//		ImageContents imageContents = readImage(byteSource, false);

		if (imageContents == null)
			throw new ImageReadException("PSD: Couldn't read blocks");

		PSDHeaderInfo header = imageContents.header;
		if (header == null)
			throw new ImageReadException("PSD: Couldn't read Header");

		int Width = header.Columns;
		int Height = header.Rows;

		Vector Comments = new Vector();
		// TODO: comments...

		int BitsPerPixel = header.Depth * getChannelsPerMode(header.Mode);
		//		System.out.println("header.Depth: " + header.Depth);
		//		System.out.println("header.Mode: " + header.Mode);
		//		System.out.println("getChannelsPerMode(header.Mode): " + getChannelsPerMode(header.Mode));
		if (BitsPerPixel < 0)
			BitsPerPixel = 0;
		ImageFormat Format = ImageFormat.IMAGE_FORMAT_PSD;
		String FormatName = "Photoshop";
		String MimeType = "image/x-photoshop";
		// we ought to count images, but don't yet.
		int NumberOfImages = -1;
		// not accurate ... only reflects first
		boolean isProgressive = false;

		int PhysicalWidthDpi = 72;
		float PhysicalWidthInch = (float) ((double) Width / (double) PhysicalWidthDpi);
		int PhysicalHeightDpi = 72;
		float PhysicalHeightInch = (float) ((double) Height / (double) PhysicalHeightDpi);

		String FormatDetails = "Psd";

		boolean isTransparent = false; // TODO: inaccurate.
		boolean usesPalette = header.Mode == COLOR_MODE_INDEXED;
		int ColorType = ImageInfo.COLOR_TYPE_UNKNOWN;

		String compressionAlgorithm;
		switch (imageContents.Compression)
		{
			case 0 :
				compressionAlgorithm = ImageInfo.COMPRESSION_ALGORITHM_NONE;
				break;
			case 1 :
				compressionAlgorithm = ImageInfo.COMPRESSION_ALGORITHM_PSD;
				break;
			default :
				compressionAlgorithm = ImageInfo.COMPRESSION_ALGORITHM_UNKNOWN;
		}

		ImageInfo result = new ImageInfo(FormatDetails, BitsPerPixel, Comments,
				Format, FormatName, Height, MimeType, NumberOfImages,
				PhysicalHeightDpi, PhysicalHeightInch, PhysicalWidthDpi,
				PhysicalWidthInch, Width, isProgressive, isTransparent,
				usesPalette, ColorType, compressionAlgorithm);

		return result;
	}

	private ImageResourceBlock findImageResourceBlock(Vector blocks, int ID)
			throws ImageReadException, IOException
	{
		for (int i = 0; i < blocks.size(); i++)
		{
			ImageResourceBlock block = (ImageResourceBlock) blocks.get(i);

			if (block.ID == ID)
				return block;
		}
		return null;
	}

	public boolean dumpImageFile(PrintWriter pw, ByteSource byteSource)
			throws ImageReadException, IOException
	{
		pw.println("gif.dumpImageFile");

		{
			ImageInfo fImageData = getImageInfo(byteSource);
			if (fImageData == null)
				return false;

			fImageData.toString(pw, "");
		}
		{
			ImageContents imageContents = readImageContents(byteSource);

			imageContents.dump(pw);
			imageContents.header.dump(pw);

			Vector blocks = readImageResourceBlocks(byteSource,
			//					fImageContents.ImageResources, 
					null, -1);

			pw.println("blocks.size(): " + blocks.size());

			//			System.out.println("gif.blocks: " + blocks.blocks.size());
			for (int i = 0; i < blocks.size(); i++)
			{
				ImageResourceBlock block = (ImageResourceBlock) blocks.get(i);
				pw.println("\t" + i + " (" + Integer.toHexString(block.ID)
						+ ", " + "'"
						+ new String(block.NameData)
						+ "' ("
						+ block.NameData.length
						+ "), "
						//						+ block.getClass().getName() 
						//						+ ", "
						+ " data: " + block.Data.length + " type: '"
						+ new PSDConstants().getDescription(block.ID) + "' "
						+ ")");

			}

		}

		pw.println("");

		return true;
	}

	private static final int COLOR_MODE_INDEXED = 2;

	public BufferedImage getBufferedImage(ByteSource byteSource, Map params)
			throws ImageReadException, IOException
	{
		ImageContents imageContents = readImageContents(byteSource);
		//		ImageContents imageContents = readImage(byteSource, false);

		if (imageContents == null)
			throw new ImageReadException("PSD: Couldn't read blocks");

		PSDHeaderInfo header = imageContents.header;
		if (header == null)
			throw new ImageReadException("PSD: Couldn't read Header");

		//		ImageDescriptor id = (ImageDescriptor) findBlock(fImageContents.blocks,
		//				kImageSeperator);
		//		if (id == null)
		//			throw new ImageReadException("PSD: Couldn't read Image Descriptor");
		//		GraphicControlExtension gce = (GraphicControlExtension) findBlock(
		//				fImageContents.blocks, kGraphicControlExtension);

		Vector blocks = readImageResourceBlocks(byteSource,
		//					fImageContents.ImageResources, 
				null, -1);

		int width = header.Columns;
		int height = header.Rows;
		//		int height = header.Columns;

		//		int transfer_type;

		//		transfer_type = DataBuffer.TYPE_BYTE;

		boolean hasAlpha = false;
		BufferedImage result = getBufferedImageFactory(params)
				.getColorBufferedImage(width, height, hasAlpha);

		DataParser dataParser;
		switch (imageContents.header.Mode)
		{
			case 0 : // bitmap
				dataParser = new DataParserBitmap();
				break;
			case 1 :
			case 8 : // Duotone=8; 
				dataParser = new DataParserGrayscale();
				break;
			case 3 :
				dataParser = new DataParserRGB();
				break;
			case 4 :
				dataParser = new DataParserCMYK();
				break;
			case 9 :
				dataParser = new DataParserLab();
				break;
			case COLOR_MODE_INDEXED :
				//			case 2 : // Indexed=2; 
			{

				byte ColorModeData[] = getData(byteSource,
						PSD_SECTION_COLOR_MODE);

				//				ImageResourceBlock block = findImageResourceBlock(blocks,
				//						0x03EB);
				//				if (block == null)
				//					throw new ImageReadException(
				//							"Missing: Indexed Color Image Resource Block");

				dataParser = new DataParserIndexed(ColorModeData);
				break;
			}
			case 7 : // Multichannel=7; 
				//				fDataParser = new DataParserStub();
				//				break;

				//			case 1 :
				//				fDataReader = new CompressedDataReader();
				//				break;
			default :
				throw new ImageReadException("Unknown Mode: "
						+ imageContents.header.Mode);
		}
		DataReader fDataReader;
		switch (imageContents.Compression)
		{
			case 0 :
				fDataReader = new UncompressedDataReader(dataParser);
				break;
			case 1 :
				fDataReader = new CompressedDataReader(dataParser);
				break;
			default :
				throw new ImageReadException("Unknown Compression: "
						+ imageContents.Compression);
		}
		{
			InputStream is = null;

			try
			{
				is = getInputStream(byteSource, PSD_SECTION_IMAGE_DATA);
				fDataReader.readData(is, result, imageContents, this);

				fDataReader.dump();
				//is.
				//				ImageContents imageContents = readImageContents(is);
				//				return imageContents;
			}
			finally
			{
				try
				{
					if (is != null)
						is.close();
				}
				catch (Exception e)
				{
					Debug.debug(e);
				}

			}

		}

		return result;

	}

}