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
package org.cmc.sanselan.formats.gif;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;

import org.cmc.sanselan.FormatCompliance;
import org.cmc.sanselan.ImageFormat;
import org.cmc.sanselan.ImageInfo;
import org.cmc.sanselan.ImageParser;
import org.cmc.sanselan.ImageReadException;
import org.cmc.sanselan.ImageWriteException;
import org.cmc.sanselan.common.BinaryOutputStream;
import org.cmc.sanselan.common.IImageMetadata;
import org.cmc.sanselan.common.byteSources.ByteSource;
import org.cmc.sanselan.common.mylzw.MyLZWCompressor;
import org.cmc.sanselan.common.mylzw.MyLZWDecompressor;
import org.cmc.sanselan.palette.Palette;
import org.cmc.sanselan.palette.PaletteFactory;
import org.cmc.sanselan.util.Debug;

public class GifImageParser extends ImageParser
{

	public GifImageParser()
	{
		super.setByteOrder(BYTE_ORDER_LSB);
	}

	public String getName()
	{
		return "Gif-Custom";
	}

	public String getDefaultExtension()
	{
		return DEFAULT_EXTENSION;
	}

	private static final String DEFAULT_EXTENSION = ".gif";

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
			ImageFormat.IMAGE_FORMAT_GIF, //
		};
	}

	private static final byte GIF_HEADER_SIGNATURE[] = {
			71, 73, 70
	};

	private GIFHeaderInfo readHeader(InputStream is,
			FormatCompliance formatCompliance) throws ImageReadException,
			IOException
	{
		byte identifier1 = readByte("identifier1", is, "Not a Valid GIF File");
		byte identifier2 = readByte("identifier2", is, "Not a Valid GIF File");
		byte identifier3 = readByte("identifier3", is, "Not a Valid GIF File");

		byte version1 = readByte("version1", is, "Not a Valid GIF File");
		byte version2 = readByte("version2", is, "Not a Valid GIF File");
		byte version3 = readByte("version3", is, "Not a Valid GIF File");

		if (formatCompliance != null)
		{
			formatCompliance.compare_bytes("Signature", GIF_HEADER_SIGNATURE,
					new byte[]{
							identifier1, identifier2, identifier3,
					});
			formatCompliance.compare("version", 56, version1);
			formatCompliance.compare("version", new int[]{
					55, 57,
			}, version2);
			formatCompliance.compare("version", 97, version3);
		}

		if (debug)
			printCharQuad("identifier: ", ((identifier1 << 16)
					| (identifier2 << 8) | (identifier3 << 0)));
		if (debug)
			printCharQuad("version: ",
					((version1 << 16) | (version2 << 8) | (version3 << 0)));

		int logicalScreenWidth = read2Bytes("Logical Screen Width", is,
				"Not a Valid GIF File");
		int logicalScreenHeight = read2Bytes("Logical Screen Height", is,
				"Not a Valid GIF File");

		if (formatCompliance != null)
		{
			formatCompliance.checkBounds("Width", 1, Integer.MAX_VALUE,
					logicalScreenWidth);
			formatCompliance.checkBounds("Height", 1, Integer.MAX_VALUE,
					logicalScreenHeight);
		}

		byte packedFields = readByte("Packed Fields", is,
				"Not a Valid GIF File");
		byte backgroundColorIndex = readByte("Background Color Index", is,
				"Not a Valid GIF File");
		byte pixelAspectRatio = readByte("Pixel Aspect Ratio", is,
				"Not a Valid GIF File");

		if (debug)
			printByteBits("PackedFields bits", packedFields);

		boolean globalColorTableFlag = ((packedFields & 128) > 0);
		if (debug)
			System.out.println("GlobalColorTableFlag: " + globalColorTableFlag);
		byte colorResolution = (byte) ((packedFields >> 4) & 7);
		if (debug)
			System.out.println("ColorResolution: " + colorResolution);
		boolean sortFlag = ((packedFields & 8) > 0);
		if (debug)
			System.out.println("SortFlag: " + sortFlag);
		byte sizeofGlobalColorTable = (byte) (packedFields & 7);
		if (debug)
			System.out.println("SizeofGlobalColorTable: "
					+ sizeofGlobalColorTable);

		if (formatCompliance != null)
		{
			if (globalColorTableFlag && backgroundColorIndex != -1)
				formatCompliance.checkBounds("Background Color Index", 0,
						convertColorTableSize(sizeofGlobalColorTable),
						backgroundColorIndex);
		}

		return new GIFHeaderInfo(identifier1, identifier2, identifier3,
				version1, version2, version3, logicalScreenWidth,
				logicalScreenHeight, packedFields, backgroundColorIndex,
				pixelAspectRatio, globalColorTableFlag, colorResolution,
				sortFlag, sizeofGlobalColorTable);
	}

	private GraphicControlExtension readGraphicControlExtension(int code,
			InputStream is) throws ImageReadException, IOException
	{
		readByte("block_size", is, "GIF: corrupt GraphicControlExt");
		int packed = readByte("packed fields", is,
				"GIF: corrupt GraphicControlExt");

		int dispose = (packed & 0x1c) >> 2; // disposal method
		boolean transparency = (packed & 1) != 0;

		int delay = read2Bytes("delay in milliseconds", is,
				"GIF: corrupt GraphicControlExt");
		int transparentColorIndex = 0xff & readByte("transparent color index",
				is, "GIF: corrupt GraphicControlExt");
		readByte("block terminator", is, "GIF: corrupt GraphicControlExt");

		return new GraphicControlExtension(code, packed, dispose, transparency,
				delay, transparentColorIndex);
	}

	private byte[] readSubBlock(InputStream is) throws ImageReadException,
			IOException
	{
		int block_size = 0xff & readByte("block_size", is, "GIF: corrupt block");

		byte bytes[] = readByteArray("block", block_size, is,
				"GIF: corrupt block");

		return bytes;
	}

	protected GenericGIFBlock readGenericGIFBlock(InputStream is, int code)
			throws ImageReadException, IOException
	{
		return readGenericGIFBlock(is, code, null);
	}

	protected GenericGIFBlock readGenericGIFBlock(InputStream is, int code,
			byte first[]) throws ImageReadException, IOException
	{
		byte bytes[] = null;
		Vector subblocks = new Vector();

		if (first != null)
			subblocks.add(first);

		while (true)
		{
			bytes = readSubBlock(is);
			if (bytes.length < 1)
				break;
			subblocks.add(bytes);
		}

		return new GenericGIFBlock(code, subblocks);
	}

	private final static int IMAGE_SEPARATOR = 0x2C;
	private final static int GRAPHIC_CONTROL_EXTENSION = (0x2100 | 0xf9);
	private final static int COMMENT_EXTENSION = 0xfe;
	private final static int PLAIN_TEXT_EXTENSION = 0x01;
	private final static int TERMINATOR_BYTE = 0x3b;

	private Vector readBlocks(GIFHeaderInfo ghi, InputStream is,
			boolean stop_before_image_data, FormatCompliance formatCompliance)
			throws ImageReadException, IOException
	{
		Vector result = new Vector();

		while (true)
		{
			int code = is.read();
			//			this.debugNumber("code: ", code);

			switch (code)
			{
				case -1 :
					throw new ImageReadException("GIF: unexpected end of data");

				case IMAGE_SEPARATOR :
					ImageDescriptor id = readImageDescriptor(ghi, code, is,
							stop_before_image_data, formatCompliance);
					result.add(id);

					break;

				case 0x21 : // extension
				{
					int extension_code = is.read();
					//					this.debugNumber("extension_code: ", extension_code);
					int complete_code = ((0xff & code) << 8)
							| (0xff & extension_code);

					switch (extension_code)
					{
						case 0xf9 :
							GraphicControlExtension gce = readGraphicControlExtension(
									complete_code, is);
							result.add(gce);
							break;

						case COMMENT_EXTENSION : {
							GenericGIFBlock block = readGenericGIFBlock(is,
									complete_code);
							result.add(block);
							break;
						}

						case PLAIN_TEXT_EXTENSION : {
							GenericGIFBlock block = readGenericGIFBlock(is,
									complete_code);
							result.add(block);
							break;
						}

						case 0xff : // 255 (hex 0xFF) Application Extension Label
						{
							byte label[] = readSubBlock(is);

							if (formatCompliance != null)
								formatCompliance.addComment(
										"Unknown Application Extension ("
												+ new String(label) + ")",
										complete_code);

							// if (label == new String("ICCRGBG1")) 
							{
								// GIF's can have embedded ICC Profiles - who knew? 
							}

							if ((label != null) && (label.length > 0))
							{
								GenericGIFBlock block = readGenericGIFBlock(is,
										complete_code, label);
								byte bytes[] = block.appendSubBlocks();

								result.add(block);
							}
							break;
						}

						default : {

							if (formatCompliance != null)
								formatCompliance.addComment("Unknown block",
										complete_code);

							GenericGIFBlock block = readGenericGIFBlock(is,
									complete_code);
							result.add(block);
							break;
						}
					}
				}
					break;

				case TERMINATOR_BYTE :
					return result;

				case 0x00 : // bad byte, but keep going and see what happens
					break;

				default :
					throw new ImageReadException("GIF: unknown code: " + code);
			}
		}
	}

	private ImageDescriptor readImageDescriptor(GIFHeaderInfo ghi,
			int blockCode, InputStream is, boolean stop_before_image_data,
			FormatCompliance formatCompliance) throws ImageReadException,
			IOException
	{
		int ImageLeftPosition = read2Bytes("Image Left Position", is,
				"Not a Valid GIF File");
		int ImageTopPosition = read2Bytes("Image Top Position", is,
				"Not a Valid GIF File");
		int imageWidth = read2Bytes("Image Width", is, "Not a Valid GIF File");
		int imageHeight = read2Bytes("Image Height", is, "Not a Valid GIF File");
		byte PackedFields = readByte("Packed Fields", is,
				"Not a Valid GIF File");

		if (formatCompliance != null)
		{
			formatCompliance.checkBounds("Width", 1, ghi.logicalScreenWidth,
					imageWidth);
			formatCompliance.checkBounds("Height", 1, ghi.logicalScreenHeight,
					imageHeight);
			formatCompliance.checkBounds("Left Position", 0,
					ghi.logicalScreenWidth - imageWidth, ImageLeftPosition);
			formatCompliance.checkBounds("Top Position", 0,
					ghi.logicalScreenHeight - imageHeight, ImageTopPosition);
		}

		if (debug)
			printByteBits("PackedFields bits", PackedFields);

		boolean LocalColorTableFlag = (((PackedFields >> 7) & 1) > 0);
		if (debug)
			System.out.println("LocalColorTableFlag: " + LocalColorTableFlag);
		boolean InterlaceFlag = (((PackedFields >> 6) & 1) > 0);
		if (debug)
			System.out.println("Interlace Flag: " + InterlaceFlag);
		boolean SortFlag = (((PackedFields >> 5) & 1) > 0);
		if (debug)
			System.out.println("Sort  Flag: " + SortFlag);

		byte SizeofLocalColorTable = (byte) (PackedFields & 7);
		if (debug)
			System.out.println("SizeofLocalColorTable: "
					+ SizeofLocalColorTable);

		byte LocalColorTable[] = null;
		if (LocalColorTableFlag)
			LocalColorTable = readColorTable(is, SizeofLocalColorTable,
					formatCompliance);

		byte imageData[] = null;
		if (!stop_before_image_data)
		{
			int LZWMinimumCodeSize = is.read();

			GenericGIFBlock block = readGenericGIFBlock(is, -1);
			byte bytes[] = block.appendSubBlocks();
			InputStream bais = new ByteArrayInputStream(bytes);

			int size = imageWidth * imageHeight;
			MyLZWDecompressor myLzwDecompressor = new MyLZWDecompressor(
					LZWMinimumCodeSize, BYTE_ORDER_LSB);
			imageData = myLzwDecompressor.decompress(bais, size);
		}
		else
		{
			int LZWMinimumCodeSize = is.read();
			if (debug)
				System.out.println("LZWMinimumCodeSize: " + LZWMinimumCodeSize);

			readGenericGIFBlock(is, -1);
		}

		ImageDescriptor result = new ImageDescriptor(blockCode,
				ImageLeftPosition, ImageTopPosition, imageWidth, imageHeight,
				PackedFields, LocalColorTableFlag, InterlaceFlag, SortFlag,
				SizeofLocalColorTable, LocalColorTable, imageData);

		return result;
	}

	private int simple_pow(int base, int power)
	{
		int result = 1;

		for (int i = 0; i < power; i++)
			result *= base;

		return result;
	}

	private int convertColorTableSize(int ct_size)
	{
		return 3 * simple_pow(2, ct_size + 1);
	}

	private byte[] readColorTable(InputStream is, int ct_size,
			FormatCompliance formatCompliance) throws ImageReadException,
			IOException
	{
		int actual_size = convertColorTableSize(ct_size);

		byte bytes[] = readByteArray("block", actual_size, is,
				"GIF: corrupt Color Table");

		return bytes;
	}

	private GIFHeaderInfo readHeader(ByteSource byteSource)
			throws ImageReadException, IOException
	{
		InputStream is = null;
		try
		{
			is = byteSource.getInputStream();

			return readHeader(is, getDefaultFormatCompliance());
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

	private GIFBlock findBlock(Vector v, int code)
	{
		for (int i = 0; i < v.size(); i++)
		{
			GIFBlock fGIFBlock = (GIFBlock) v.get(i);
			if (fGIFBlock.blockCode == code)
				return fGIFBlock;
		}
		return null;
	}

	private ImageContents readFile(ByteSource byteSource,
			boolean stop_before_image_data) throws ImageReadException,
			IOException
	{
		return readFile(byteSource, stop_before_image_data,
				getDefaultFormatCompliance());
	}

	private ImageContents readFile(ByteSource byteSource,
			boolean stop_before_image_data, FormatCompliance formatCompliance)
			throws ImageReadException, IOException
	{
		InputStream is = null;
		try
		{
			is = byteSource.getInputStream();

			GIFHeaderInfo ghi = readHeader(is, formatCompliance);

			byte globalColorTable[] = null;
			if (ghi.globalColorTableFlag)
				globalColorTable = readColorTable(is,
						ghi.sizeOfGlobalColorTable, formatCompliance);

			Vector blocks = readBlocks(ghi, is, stop_before_image_data,
					formatCompliance);

			ImageContents result = new ImageContents(ghi, globalColorTable,
					blocks);

			return result;
		}
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
	}

	public byte[] getICCProfileBytes(ByteSource byteSource)
			throws ImageReadException, IOException
	{
		return null;
	}

	public Dimension getImageSize(ByteSource byteSource)
			throws ImageReadException, IOException
	{
		GIFHeaderInfo bhi = readHeader(byteSource);

		if (bhi == null)
			throw new ImageReadException("GIF: Couldn't read Header");

		return new Dimension(bhi.logicalScreenWidth, bhi.logicalScreenHeight);

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

	private Vector getComments(Vector v) throws ImageReadException, IOException
	{
		Vector result = new Vector();
		int code = 0x21fe;

		for (int i = 0; i < v.size(); i++)
		{
			GIFBlock block = (GIFBlock) v.get(i);
			if (block.blockCode == code)
			{
				byte bytes[] = ((GenericGIFBlock) block).appendSubBlocks();
				result.add(new String(bytes));
			}
		}

		return result;
	}

	public ImageInfo getImageInfo(ByteSource byteSource)
			throws ImageReadException, IOException
	{
		ImageContents blocks = readFile(byteSource, false);

		if (blocks == null)
			throw new ImageReadException("GIF: Couldn't read blocks");

		GIFHeaderInfo bhi = blocks.gifHeaderInfo;
		if (bhi == null)
			throw new ImageReadException("GIF: Couldn't read Header");

		ImageDescriptor id = (ImageDescriptor) findBlock(blocks.blocks,
				IMAGE_SEPARATOR);
		if (id == null)
			throw new ImageReadException("GIF: Couldn't read ImageDescriptor");

		GraphicControlExtension gce = (GraphicControlExtension) findBlock(
				blocks.blocks, GRAPHIC_CONTROL_EXTENSION);

		int Height = bhi.logicalScreenHeight;
		int Width = bhi.logicalScreenWidth;

		Vector Comments;

		Comments = getComments(blocks.blocks);

		int BitsPerPixel = (bhi.colorResolution + 1) * 3;
		ImageFormat Format = ImageFormat.IMAGE_FORMAT_GIF;
		String FormatName = "GIF Graphics Interchange Format";
		String MimeType = "image/gif";
		// we ought to count images, but don't yet.
		int NumberOfImages = -1;

		boolean isProgressive = id.interlaceFlag;

		int PhysicalWidthDpi = 72;
		float PhysicalWidthInch = (float) ((double) Width / (double) PhysicalWidthDpi);
		int PhysicalHeightDpi = 72;
		float PhysicalHeightInch = (float) ((double) Height / (double) PhysicalHeightDpi);

		String FormatDetails = "Gif " + ((char) blocks.gifHeaderInfo.version1)
				+ ((char) blocks.gifHeaderInfo.version2)
				+ ((char) blocks.gifHeaderInfo.version3);

		boolean isTransparent = false;
		if (gce != null)
		{
			if (gce.transparency)
				isTransparent = true;
		}

		boolean usesPalette = true;
		int colorType = ImageInfo.COLOR_TYPE_RGB;
		String compressionAlgorithm = ImageInfo.COMPRESSION_ALGORITHM_LZW;

		ImageInfo result = new ImageInfo(FormatDetails, BitsPerPixel, Comments,
				Format, FormatName, Height, MimeType, NumberOfImages,
				PhysicalHeightDpi, PhysicalHeightInch, PhysicalWidthDpi,
				PhysicalWidthInch, Width, isProgressive, isTransparent,
				usesPalette, colorType, compressionAlgorithm);

		return result;
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
			ImageContents blocks = readFile(byteSource, false);

			if (blocks == null)
				return false;

			pw.println("gif.blocks: " + blocks.blocks.size());
			for (int i = 0; i < blocks.blocks.size(); i++)
			{
				GIFBlock fGIFBlock = (GIFBlock) blocks.blocks.get(i);
				this.debugNumber(pw, "\t" + i + " ("
						+ fGIFBlock.getClass().getName() + ")",
						fGIFBlock.blockCode, 4);
			}

		}

		pw.println("");

		return true;
	}

	private int[] getColorTable(byte bytes[]) throws ImageReadException,
			IOException
	{
		if ((bytes.length % 3) != 0)
			throw new ImageReadException("Bad Color Table Length: "
					+ bytes.length);
		int length = bytes.length / 3;

		int result[] = new int[length];

		for (int i = 0; i < length; i++)
		{
			int red = 0xff & bytes[(i * 3) + 0];
			int green = 0xff & bytes[(i * 3) + 1];
			int blue = 0xff & bytes[(i * 3) + 2];

			int alpha = 0xff;

			int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);
			result[i] = rgb;
		}

		return result;
	}

	public FormatCompliance getFormatCompliance(ByteSource byteSource)
			throws ImageReadException, IOException
	{
		FormatCompliance result = new FormatCompliance(byteSource
				.getDescription());

		readFile(byteSource, false, result);

		return result;
	}

	public BufferedImage getBufferedImage(ByteSource byteSource, Map params)
			throws ImageReadException, IOException
	{
		ImageContents imageContents = readFile(byteSource, false);

		if (imageContents == null)
			throw new ImageReadException("GIF: Couldn't read blocks");

		GIFHeaderInfo ghi = imageContents.gifHeaderInfo;
		if (ghi == null)
			throw new ImageReadException("GIF: Couldn't read Header");

		ImageDescriptor id = (ImageDescriptor) findBlock(imageContents.blocks,
				IMAGE_SEPARATOR);
		if (id == null)
			throw new ImageReadException("GIF: Couldn't read Image Descriptor");
		GraphicControlExtension gce = (GraphicControlExtension) findBlock(
				imageContents.blocks, GRAPHIC_CONTROL_EXTENSION);

		int width = ghi.logicalScreenWidth;
		int height = ghi.logicalScreenHeight;

		boolean hasAlpha = gce.transparency;
		BufferedImage result = getBufferedImageFactory(params)
				.getColorBufferedImage(width, height, hasAlpha);

		{
			int colortable[];
			if (id.localColorTable != null)
				colortable = getColorTable(id.localColorTable);
			else if (imageContents.globalColorTable != null)
				colortable = getColorTable(imageContents.globalColorTable);
			else
				throw new ImageReadException("Gif: No Color Table");

			int transparentIndex = -1;
			if (gce != null)
			{
				if (gce.transparency)
					transparentIndex = gce.transparentColorIndex;
			}

			//			Debug.debug("charles TransparentIndex", TransparentIndex);

			int counter = 0;
			//			ByteArrayInputStream bais = new ByteArrayInputStream(id.ImageData);
			//			for (int y = 0; y < height; y++)

			int rows_in_pass_1 = (height + 7) / 8;
			int rows_in_pass_2 = (height + 3) / 8;
			int rows_in_pass_3 = (height + 1) / 4;
			int rows_in_pass_4 = (height) / 2;

			DataBuffer db = result.getRaster().getDataBuffer();

			for (int row = 0; row < height; row++)
			{

				int y;
				if (id.interlaceFlag)
				{
					int the_row = row;
					if (the_row < rows_in_pass_1)
						y = the_row * 8;
					else
					{
						the_row -= rows_in_pass_1;
						if (the_row < (rows_in_pass_2))
							y = 4 + (the_row * 8);
						else
						{
							the_row -= rows_in_pass_2;
							if (the_row < (rows_in_pass_3))
								y = 2 + (the_row * 4);
							else
							{
								the_row -= rows_in_pass_3;
								if (the_row < (rows_in_pass_4))
									y = 1 + (the_row * 2);
								else
									throw new ImageReadException(
											"Gif: Strange Row");
							}
						}
					}
					//					System.out.println("row(" + row + "): " + y);
				}
				else
					y = row;

				for (int x = 0; x < width; x++)
				{

					int index = 0xff & id.imageData[counter++];
					int rgb = colortable[index];

					if (transparentIndex == index)
						rgb = 0x00;

					db.setElem(y * width + x, rgb);
				}

			}
		}

		return result;

	}

	private void writeAsSubBlocks(OutputStream os, byte bytes[])
			throws IOException
	{
		int index = 0;

		while (index < bytes.length)
		{
			int block_size = Math.min(bytes.length - index, 255);
			os.write(block_size);
			os.write(bytes, index, block_size);
			index += block_size;
		}
		os.write(0); // last block 
	}

	private static final int LOCAL_COLOR_TABLE_FLAG_MASK = 1 << 7;
	private static final int INTERLACE_FLAG_MASK = 1 << 6;
	private static final int SORT_FLAG_MASK = 1 << 5;

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

		int width = src.getWidth();
		int height = src.getHeight();

		boolean hasAlpha = new PaletteFactory().hasTransparency(src);

		int max_colors = hasAlpha ? 255 : 256;

		Palette palette2 = new PaletteFactory().makePaletteSimple(src,
				max_colors);
		//		int palette[] = new PaletteFactory().makePaletteSimple(src, 256);
		//		Map palette_map = paletteToMap(palette);

		if (palette2 == null)
		{
			palette2 = new PaletteFactory().makePaletteQuantized(src,
					max_colors);
			System.out.println("quantizing");
		}
		else
			System.out.println("exact palette");

		if (palette2 == null)
			throw new ImageWriteException(
					"Gif: can't write images with more than 256 colors");
		int palette_size = palette2.length() + (hasAlpha ? 1 : 0);

		BinaryOutputStream bos = new BinaryOutputStream(os, BYTE_ORDER_LSB);

		{
			// write Header
			os.write(0x47); // G magic numbers
			os.write(0x49); // I 
			os.write(0x46); // F

			os.write(0x38); // 8 version magic numbers
			os.write(0x39); // 9 
			os.write(0x61); // a

			// Logical Screen Descriptor.

			bos.write2Bytes(width);
			bos.write2Bytes(height);

			int colorTableScaleLessOne = (palette_size > 128)
					? 7
					: (palette_size > 64) ? 6 : (palette_size > 32)
							? 5
							: (palette_size > 16) ? 4 : (palette_size > 8)
									? 3
									: (palette_size > 4)
											? 2
											: (palette_size > 2) ? 1 : 0;

			int colorTableSizeInFormat = 1 << (colorTableScaleLessOne + 1);
			int actual_size = 3 * simple_pow(2, colorTableScaleLessOne + 1);
			{
				byte colorResolution = (byte) colorTableScaleLessOne; // TODO: 

				boolean globalColorTableFlag = false;
				boolean sortFlag = false;
				int globalColorTableFlagMask = 1 << 7;
				int sortFlagMask = 8;
				int sizeOfGlobalColorTable = 0;

				int packedFields = ((globalColorTableFlag
						? globalColorTableFlagMask
						: 0)
						| (sortFlag ? sortFlagMask : 0)
						| ((7 & colorResolution) << 4) | (7 & sizeOfGlobalColorTable));
				bos.write(packedFields); // one byte
			}
			{
				byte BackgroundColorIndex = 0;
				bos.write(BackgroundColorIndex);
			}
			{
				byte PixelAspectRatio = 0;
				bos.write(PixelAspectRatio);
			}

			{ // write Global Color Table.

			}

			if (hasAlpha)
			{ // write GraphicControlExtension
				bos.write((byte) 0x21);
				bos.write((byte) 0xf9);
				//				bos.write(0xff & (kGraphicControlExtension >> 8));
				//				bos.write(0xff & (kGraphicControlExtension >> 0));

				bos.write((byte) 4); // block size;
				int fPackedFields = hasAlpha ? 1 : 0; // transparency flag
				bos.write((byte) fPackedFields);
				bos.write((byte) 0); //  Delay Time
				bos.write((byte) 0); //  Delay Time
				bos.write((byte) (hasAlpha ? palette2.length() : 0)); //   Transparent Color Index
				bos.write((byte) 0); // terminator
			}

			{ //  Image Descriptor.
				bos.write(IMAGE_SEPARATOR);
				bos.write2Bytes(0); // Image Left Position  
				bos.write2Bytes(0); //  Image Top Position  
				bos.write2Bytes(width); // Image Width    
				bos.write2Bytes(height); //  Image Height     

				{
					boolean LocalColorTableFlag = true;
					//					boolean LocalColorTableFlag = false;
					boolean InterlaceFlag = false;
					boolean SortFlag = false;
					int SizeOfLocalColorTable = colorTableScaleLessOne;

					//					int SizeOfLocalColorTable = 0;

					int PackedFields = ((LocalColorTableFlag
							? LOCAL_COLOR_TABLE_FLAG_MASK
							: 0)
							| (InterlaceFlag ? INTERLACE_FLAG_MASK : 0)
							| (SortFlag ? SORT_FLAG_MASK : 0) | (7 & SizeOfLocalColorTable));
					bos.write(PackedFields); // one byte
				}
			}

			{ // write Local Color Table.
				for (int i = 0; i < colorTableSizeInFormat; i++)
				{
					if (i < palette2.length())
					{
						int rgb = palette2.getEntry(i);

						int red = 0xff & (rgb >> 16);
						int green = 0xff & (rgb >> 8);
						int blue = 0xff & (rgb >> 0);

						bos.write(red);
						bos.write(green);
						bos.write(blue);
					}
					else
					{
						bos.write(0);
						bos.write(0);
						bos.write(0);
					}
				}
			}

			{ // get Image Data.
				int image_data_total = 0;

				int LZWMinimumCodeSize = colorTableScaleLessOne + 1; // TODO: make better choice here.
				bos.write(LZWMinimumCodeSize);

				MyLZWCompressor compressor = new MyLZWCompressor(
						LZWMinimumCodeSize, BYTE_ORDER_LSB, false); // GIF Mode);

				byte imagedata[] = new byte[width * height];
				for (int y = 0; y < height; y++)
				{
					for (int x = 0; x < width; x++)
					{
						int argb = src.getRGB(x, y);
						int rgb = 0xffffff & argb;
						int index;

						if (hasAlpha)
						{
							int alpha = 0xff & (argb >> 24);
							final int alphaThreshold = 255;
							if (alpha < alphaThreshold)
								index = palette2.length(); // is transparent
							else
								index = palette2.getPaletteIndex(rgb);
						}
						else
						{
							index = palette2.getPaletteIndex(rgb);
						}

						imagedata[y * width + x] = (byte) index;
					}
				}

				byte compressed[] = compressor.compress(imagedata);
				writeAsSubBlocks(bos, compressed);
				image_data_total += compressed.length;
			}

			palette2.dump();

			bos.write(TERMINATOR_BYTE);
		}

		bos.close();
		os.close();
	}
}