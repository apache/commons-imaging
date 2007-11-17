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
package org.cmc.sanselan.formats.png;

import java.awt.Dimension;
import java.awt.color.ColorSpace;
import java.awt.color.ICC_ColorSpace;
import java.awt.color.ICC_Profile;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DataBuffer;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Vector;
import java.util.zip.InflaterInputStream;

import org.cmc.sanselan.ColorTools;
import org.cmc.sanselan.ImageFormat;
import org.cmc.sanselan.ImageInfo;
import org.cmc.sanselan.ImageParser;
import org.cmc.sanselan.ImageReadException;
import org.cmc.sanselan.ImageWriteException;
import org.cmc.sanselan.common.IImageMetadata;
import org.cmc.sanselan.common.ImageMetadata;
import org.cmc.sanselan.common.byteSources.ByteSource;
import org.cmc.sanselan.formats.png.chunks.PNGChunk;
import org.cmc.sanselan.formats.png.chunks.PNGChunkIDAT;
import org.cmc.sanselan.formats.png.chunks.PNGChunkIHDR;
import org.cmc.sanselan.formats.png.chunks.PNGChunkPLTE;
import org.cmc.sanselan.formats.png.chunks.PNGChunkgAMA;
import org.cmc.sanselan.formats.png.chunks.PNGChunkiCCP;
import org.cmc.sanselan.formats.png.chunks.PNGChunkpHYs;
import org.cmc.sanselan.formats.png.chunks.PNGChunktEXt;
import org.cmc.sanselan.formats.png.chunks.PNGChunkzTXt;
import org.cmc.sanselan.formats.png.chunks.PNGTextChunk;
import org.cmc.sanselan.formats.transparencyfilters.TransparencyFilter;
import org.cmc.sanselan.formats.transparencyfilters.TransparencyFilterGrayscale;
import org.cmc.sanselan.formats.transparencyfilters.TransparencyFilterIndexedColor;
import org.cmc.sanselan.formats.transparencyfilters.TransparencyFilterTrueColor;
import org.cmc.sanselan.icc.IccProfileParser;
import org.cmc.sanselan.util.Debug;

public class PngImageParser extends ImageParser implements PngConstants
{

	public PngImageParser()
	{
		//		setDebug(true);
	}

	public String getName()
	{
		return "Png-Custom";
	}

	public String getDefaultExtension()
	{
		return DEFAULT_EXTENSION;
	}

	private static final String DEFAULT_EXTENSION = ".png";

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
			ImageFormat.IMAGE_FORMAT_PNG, //
		};
	}

	//	private final static int tRNS = CharsToQuad('t', 'R', 'N', 's');

	private boolean keepChunk(int ChunkType, int ChunkTypes[])
	{
		//		System.out.println("keepChunk: ");
		if (ChunkTypes == null)
			return true;

		for (int i = 0; i < ChunkTypes.length; i++)
		{
			if (ChunkTypes[i] == ChunkType)
				return true;
		}
		return false;
	}

	private Vector readChunks(InputStream is, int ChunkTypes[],
			boolean return_after_first) throws ImageReadException, IOException
	{
		Vector result = new Vector();

		while (true)
		{
			if (debug)
				System.out.println("");

			int length = read4Bytes("Length", is, "Not a Valid PNG File");
			int chunkType = read4Bytes("ChunkType", is, "Not a Valid PNG File");

			if (debug)
			{
				printCharQuad("ChunkType", chunkType);
				debugNumber("Length", length, 4);
			}
			boolean keep = keepChunk(chunkType, ChunkTypes);

			byte bytes[] = null;
			if (keep)
			{
				bytes = readByteArray("Chunk Data", length, is,
						"Not a Valid PNG File: Couldn't read Chunk Data.");
			}
			else
				skipBytes(is, length, "Not a Valid PNG File");

			if (debug)
				if (bytes != null)
					debugNumber("bytes", bytes.length, 4);

			int CRC = read4Bytes("CRC", is, "Not a Valid PNG File");

			if (keep)
			{
				if (chunkType == iCCP)
					result.add(new PNGChunkiCCP(length, chunkType, CRC, bytes));
				else if (chunkType == tEXt)
					result.add(new PNGChunktEXt(length, chunkType, CRC, bytes));
				else if (chunkType == zTXt)
					result.add(new PNGChunkzTXt(length, chunkType, CRC, bytes));
				else if (chunkType == IHDR)
					result.add(new PNGChunkIHDR(length, chunkType, CRC, bytes));
				else if (chunkType == PLTE)
					result.add(new PNGChunkPLTE(length, chunkType, CRC, bytes));
				else if (chunkType == pHYs)
					result.add(new PNGChunkpHYs(length, chunkType, CRC, bytes));
				else if (chunkType == IDAT)
					result.add(new PNGChunkIDAT(length, chunkType, CRC, bytes));
				else if (chunkType == gAMA)
					result.add(new PNGChunkgAMA(length, chunkType, CRC, bytes));
				else
					result.add(new PNGChunk(length, chunkType, CRC, bytes));

				if (return_after_first)
					return result;
			}

			if (chunkType == IEND)
				break;

		}

		return result;

	}

	private void readSignature(InputStream is) throws ImageReadException,
			IOException
	{
		readAndVerifyBytes(is, PNG_Signature,
				"Not a Valid PNG Segment: Incorrect Signature");

	}

	private Vector readChunks(ByteSource byteSource, int ChunkTypes[],
			boolean return_after_first) throws ImageReadException, IOException
	{
		InputStream is = null;

		try
		{
			is = byteSource.getInputStream();

			Vector chunks = null;

			readSignature(is);
			chunks = readChunks(is, ChunkTypes, return_after_first);
			return chunks;
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

	public byte[] getICCProfileBytes(ByteSource byteSource)
			throws ImageReadException, IOException
	{
		Vector chunks = readChunks(byteSource, new int[]{
			iCCP,
		}, true);

		if ((chunks == null) || (chunks.size() < 1))
		{
			//			throw new ImageReadException("Png: No chunks");
			return null;
		}

		if (chunks.size() > 1)
			throw new ImageReadException(
					"PNG contains more than one ICC Profile ");

		PNGChunkiCCP pngChunkiCCP = (PNGChunkiCCP) chunks.get(0);
		byte bytes[] = pngChunkiCCP.UncompressedProfile;

		return (bytes);
	}

	public Dimension getImageSize(ByteSource byteSource)
			throws ImageReadException, IOException
	{
		Vector chunks = readChunks(byteSource, new int[]{
			IHDR,
		}, true);

		if ((chunks == null) || (chunks.size() < 1))
			throw new ImageReadException("Png: No chunks");

		if (chunks.size() > 1)
			throw new ImageReadException("PNG contains more than one Header");

		PNGChunkIHDR pngChunkIHDR = (PNGChunkIHDR) chunks.get(0);

		return new Dimension(pngChunkIHDR.width, pngChunkIHDR.height);
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
		Vector chunks = readChunks(byteSource, new int[]{
				tEXt, zTXt,
		}, true);

		if ((chunks == null) || (chunks.size() < 1))
			return null;

		ImageMetadata result = new ImageMetadata();

		for (int i = 0; i < chunks.size(); i++)
		{
			PNGTextChunk chunk = (PNGTextChunk) chunks.get(i);

			result.add(chunk.getKeyword(), chunk.getText());
		}

		return result;
	}

	private boolean isGrayscale(int colorType) throws ImageReadException
	{
		//		Color type is a single-byte integer that describes the interpretation of the 
		//		image data. Color type codes represent sums of the following values: 
		//			1 (palette used), 2 (color used), and 4 (alpha channel used). 
		//			Valid values are 0, 2, 3, 4, and 6.
		//
		//		Bit depth restrictions for each color type are imposed to simplify implementations 
		//		and to prohibit combinations that do not compress well. Decoders must support all 
		//		valid combinations of bit depth and color type. The allowed combinations are:
		//
		//		   Color    Allowed    Interpretation
		//		   Type    Bit Depths
		//		   
		//		   0       1,2,4,8,16  Each pixel is a grayscale sample.
		//		   
		//		   2       8,16        Each pixel is an R,G,B triple.
		//		   
		//		   3       1,2,4,8     Each pixel is a palette index;
		//		                       a PLTE chunk must appear.
		//		   
		//		   4       8,16        Each pixel is a grayscale sample,
		//		                       followed by an alpha sample.
		//		   
		//		   6       8,16        Each pixel is an R,G,B triple,
		//		                       followed by an alpha sample.
		switch (colorType)
		{
			case 0 :
				return true;
			case 2 :
				return false;
			case 3 :
				return false;
			case 4 :
				return true;
			case 6 :
				return false;
		}

		//		return -1;
		throw new ImageReadException("PNG: unknown color type: " + colorType);
	}

	private int samplesPerPixel(int colorType) throws ImageReadException
	{
		//		Color type is a single-byte integer that describes the interpretation of the 
		//		image data. Color type codes represent sums of the following values: 
		//			1 (palette used), 2 (color used), and 4 (alpha channel used). 
		//			Valid values are 0, 2, 3, 4, and 6.
		//
		//		Bit depth restrictions for each color type are imposed to simplify implementations 
		//		and to prohibit combinations that do not compress well. Decoders must support all 
		//		valid combinations of bit depth and color type. The allowed combinations are:
		//
		//		   Color    Allowed    Interpretation
		//		   Type    Bit Depths
		//		   
		//		   0       1,2,4,8,16  Each pixel is a grayscale sample.
		//		   
		//		   2       8,16        Each pixel is an R,G,B triple.
		//		   
		//		   3       1,2,4,8     Each pixel is a palette index;
		//		                       a PLTE chunk must appear.
		//		   
		//		   4       8,16        Each pixel is a grayscale sample,
		//		                       followed by an alpha sample.
		//		   
		//		   6       8,16        Each pixel is an R,G,B triple,
		//		                       followed by an alpha sample.
		switch (colorType)
		{
			case 0 :
				return 1;
			case 2 :
				return 3;
			case 3 :
				return 1; // is this accurate ?  how may bits per index?
			case 4 :
				return 2;
			case 6 :
				return 4;
		}

		//		return -1;
		throw new ImageReadException("PNG: unknown color type: " + colorType);
	}

	private Vector filterChunks(Vector v, int type)
	{
		Vector result = new Vector();

		for (int i = 0; i < v.size(); i++)
		{
			PNGChunk chunk = (PNGChunk) v.get(i);
			if (chunk.chunkType == type)
				result.add(chunk);
		}

		return result;
	}

	private boolean hasAlphaChannel(int ColorType) throws ImageReadException,
			IOException
	{
		switch (ColorType)
		{
			case 0 : //       1,2,4,8,16  Each pixel is a grayscale sample.
			case 2 : //     8,16        Each pixel is an R,G,B triple.
			case 3 : //     1,2,4,8     Each pixel is a palette index;
				return false;
			case 4 : //     8,16        Each pixel is a grayscale sample,
				//					                       followed by an alpha sample.
			case 6 : //    8,16        Each pixel is an R,G,B triple,
				//					                       followed by an alpha sample.
				return true;
			default :
				throw new ImageReadException("PNG: unknown color type: "
						+ ColorType);
		}
	}

	private String getColorTypeDescription(int ColorType)
	{
		switch (ColorType)
		{
			case 0 : //       1,2,4,8,16  Each pixel is a grayscale sample.
				return "grayscale";
			case 2 : //     8,16        Each pixel is an R,G,B triple.
				return "rgb";
			case 3 : //     1,2,4,8     Each pixel is a palette index;
				return "indexed rgb";
			case 4 : //     8,16        Each pixel is a grayscale sample,
				//					                       followed by an alpha sample.
				return "grayscale w/ alpha";
			case 6 : //    8,16        Each pixel is an R,G,B triple,
				//					                       followed by an alpha sample.
				return "RGB w/ alpha";
			default :
				return "Unknown Color Type";
		}
	}

	// TODO: I have been too casual about making inner classes subclass of BinaryFileParser
	// I may not have always preserved byte order correctly.  

	private TransparencyFilter getTransparencyFilter(int ColorType,
			PNGChunk pngChunktRNS) throws ImageReadException, IOException
	{
		//		this.printCharQuad("pngChunktRNS.ChunkType", pngChunktRNS.ChunkType);
		//		this.debugNumber("pngChunktRNS.Length", pngChunktRNS.Length);

		switch (ColorType)
		{
			case 0 : //       1,2,4,8,16  Each pixel is a grayscale sample.
				return new TransparencyFilterGrayscale(pngChunktRNS.bytes);
			case 2 : //     8,16        Each pixel is an R,G,B triple.
				return new TransparencyFilterTrueColor(pngChunktRNS.bytes);
			case 3 : //     1,2,4,8     Each pixel is a palette index;
				return new TransparencyFilterIndexedColor(pngChunktRNS.bytes);
			case 4 : //     8,16        Each pixel is a grayscale sample,
			case 6 : //    8,16        Each pixel is an R,G,B triple,
			default :
				throw new ImageReadException(
						"Simple Transparency not compatible with ColorType: "
								+ ColorType);
		}
	}

	public ImageInfo getImageInfo(ByteSource byteSource)
			throws ImageReadException, IOException
	{
		Vector chunks = readChunks(byteSource, new int[]{
				IHDR, pHYs, tEXt, zTXt, tRNS, PLTE,
		}, false);

		//		if(chunks!=null)
		//		System.out.println("chunks: " + chunks.size());

		if ((chunks == null) || (chunks.size() < 1))
			throw new ImageReadException("PNG: no chunks");

		Vector IHDRs = filterChunks(chunks, IHDR);
		if (IHDRs.size() != 1)
			throw new ImageReadException("PNG contains more than one Header");

		PNGChunkIHDR pngChunkIHDR = (PNGChunkIHDR) IHDRs.get(0);
		PNGChunk pngChunktRNS = null;

		boolean isTransparent = false;

		Vector tRNSs = filterChunks(chunks, tRNS);
		if (tRNSs.size() > 0)
		{
			isTransparent = true;
			pngChunktRNS = (PNGChunk) IHDRs.get(0);
		}
		else
			hasAlphaChannel(pngChunkIHDR.colorType);

		PNGChunkpHYs pngChunkpHYs = null;

		Vector pHYss = filterChunks(chunks, pHYs);
		if (pHYss.size() > 1)
			throw new ImageReadException("PNG contains more than one pHYs: "
					+ pHYss.size());
		else if (pHYss.size() == 1)
			pngChunkpHYs = (PNGChunkpHYs) pHYss.get(0);

		Vector tEXts = filterChunks(chunks, tEXt);
		Vector zTXts = filterChunks(chunks, zTXt);

		//			private class PNGChunkpHYs extends PNGChunk
		//			{
		//				public final int PixelsPerUnitXAxis;
		//				public final int PixelsPerUnitYAxis;
		//				public final int UnitSpecifier;

		{
			//			private class PNGChunkIHDR extends PNGChunk
			//			{
			//				public final int Width;
			//				public final int Height;
			//				public final int BitDepth;
			//				public final int ColorType;
			//				public final int CompressionMethod;
			//				public final int FilterMethod;
			//				public final int InterlaceMethod;

			Vector Comments = new Vector();

			for (int i = 0; i < tEXts.size(); i++)
			{
				PNGChunktEXt pngChunktEXt = (PNGChunktEXt) tEXts.get(i);
				Comments.add(pngChunktEXt.Keyword + ": " + pngChunktEXt.Text);
			}
			for (int i = 0; i < zTXts.size(); i++)
			{
				PNGChunkzTXt pngChunkzTXt = (PNGChunkzTXt) zTXts.get(i);
				Comments.add(pngChunkzTXt.Keyword + ": " + pngChunkzTXt.Text);
			}

			int BitsPerPixel = pngChunkIHDR.bitDepth
					* samplesPerPixel(pngChunkIHDR.colorType);
			ImageFormat Format = ImageFormat.IMAGE_FORMAT_PNG;
			String FormatName = "PNG Portable Network Graphics";
			int Height = pngChunkIHDR.height;
			String MimeType = "image/png";
			int NumberOfImages = 1;
			int Width = pngChunkIHDR.width;
			boolean isProgressive = (pngChunkIHDR.interlaceMethod != 0);

			int PhysicalHeightDpi = -1;
			float PhysicalHeightInch = -1;
			int PhysicalWidthDpi = -1;
			float PhysicalWidthInch = -1;

			//			if (pngChunkpHYs != null)
			//			{
			//				System.out.println("\t" + "pngChunkpHYs.UnitSpecifier: " + pngChunkpHYs.UnitSpecifier );
			//				System.out.println("\t" + "pngChunkpHYs.PixelsPerUnitYAxis: " + pngChunkpHYs.PixelsPerUnitYAxis );
			//				System.out.println("\t" + "pngChunkpHYs.PixelsPerUnitXAxis: " + pngChunkpHYs.PixelsPerUnitXAxis );
			//			}
			if ((pngChunkpHYs != null) && (pngChunkpHYs.UnitSpecifier == 1)) // meters
			{
				double meters_per_inch = 0.0254;

				PhysicalWidthDpi = (int) Math
						.round((double) pngChunkpHYs.PixelsPerUnitXAxis
								* meters_per_inch);
				PhysicalWidthInch = (float) ((double) Width
						* (double) pngChunkpHYs.PixelsPerUnitXAxis * meters_per_inch);
				PhysicalHeightDpi = (int) Math
						.round((double) pngChunkpHYs.PixelsPerUnitYAxis
								* meters_per_inch);
				PhysicalHeightInch = (float) ((double) Height
						* (double) pngChunkpHYs.PixelsPerUnitYAxis * meters_per_inch);
			}

			String FormatDetails = "Png";

			boolean usesPalette = false;

			Vector PLTEs = filterChunks(chunks, PLTE);
			if (PLTEs.size() > 1)
				usesPalette = true;

			int ColorType;
			switch (pngChunkIHDR.colorType)
			{
				case 0 : //       1,2,4,8,16  Each pixel is a grayscale sample.
				case 4 : //     8,16        Each pixel is a grayscale sample,
					//					                       followed by an alpha sample.
					ColorType = ImageInfo.COLOR_TYPE_GRAYSCALE;
					break;
				case 2 : //     8,16        Each pixel is an R,G,B triple.
				case 3 : //     1,2,4,8     Each pixel is a palette index;
				case 6 : //    8,16        Each pixel is an R,G,B triple,
					//					                       followed by an alpha sample.
					ColorType = ImageInfo.COLOR_TYPE_RGB;
					break;
				default :
					throw new ImageReadException("Png: Unknown ColorType: "
							+ pngChunkIHDR.colorType);
			}

			String compressionAlgorithm = ImageInfo.COMPRESSION_ALGORITHM_PNG_FILTER;

			ImageInfo result = new ImageInfo(FormatDetails, BitsPerPixel,
					Comments, Format, FormatName, Height, MimeType,
					NumberOfImages, PhysicalHeightDpi, PhysicalHeightInch,
					PhysicalWidthDpi, PhysicalWidthInch, Width, isProgressive,
					isTransparent, usesPalette, ColorType, compressionAlgorithm);

			return result;
		}
	}

	public BufferedImage getBufferedImage(ByteSource byteSource, Map params)
			throws ImageReadException, IOException
	{
		Vector chunks = readChunks(byteSource, new int[]{
				IHDR, PLTE, IDAT, tRNS, iCCP, gAMA, sRGB,
		}, false);

		if ((chunks == null) || (chunks.size() < 1))
			throw new ImageReadException("PNG: no chunks");

		Vector IHDRs = filterChunks(chunks, IHDR);
		if (IHDRs.size() != 1)
			throw new ImageReadException("PNG contains more than one Header");

		PNGChunkIHDR pngChunkIHDR = (PNGChunkIHDR) IHDRs.get(0);

		Vector PLTEs = filterChunks(chunks, PLTE);
		if (PLTEs.size() > 1)
			throw new ImageReadException("PNG contains more than one Palette");

		PNGChunkPLTE pngChunkPLTE = null;
		if (PLTEs.size() == 1)
			pngChunkPLTE = (PNGChunkPLTE) PLTEs.get(0);

		// -----

		Vector IDATs = filterChunks(chunks, IDAT);
		if (IDATs.size() < 1)
			throw new ImageReadException("PNG missing image data");

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		for (int i = 0; i < IDATs.size(); i++)
		{
			PNGChunkIDAT pngChunkIDAT = (PNGChunkIDAT) IDATs.get(i);
			byte bytes[] = pngChunkIDAT.bytes;
			//						System.out.println(i + ": bytes: " + bytes.length);
			baos.write(bytes);
		}

		byte compressed[] = baos.toByteArray();

		baos = null;

		TransparencyFilter transparencyFilter = null;

		Vector tRNSs = filterChunks(chunks, tRNS);
		if (tRNSs.size() > 0)
		{
			PNGChunk pngChunktRNS = (PNGChunk) tRNSs.get(0);
			transparencyFilter = getTransparencyFilter(pngChunkIHDR.colorType,
					pngChunktRNS);
		}

		ICC_Profile icc_profile = null;
		GammaCorrection gammaCorrection = null;
		{
			Vector sRGBs = filterChunks(chunks, sRGB);
			Vector gAMAs = filterChunks(chunks, gAMA);
			Vector iCCPs = filterChunks(chunks, iCCP);
			if (sRGBs.size() > 1)
				throw new ImageReadException("PNG: unexpected sRGB chunk");
			if (gAMAs.size() > 1)
				throw new ImageReadException("PNG: unexpected gAMA chunk");
			if (iCCPs.size() > 1)
				throw new ImageReadException("PNG: unexpected iCCP chunk");

			if (sRGBs.size() == 1)
			{
				// no color management neccesary.
				if (debug)
					System.out.println("sRGB, no color management neccesary.");
			}
			else if (iCCPs.size() == 1)
			{
				if (debug)
					System.out.println("iCCP.");

				PNGChunkiCCP pngChunkiCCP = (PNGChunkiCCP) iCCPs.get(0);
				byte bytes[] = pngChunkiCCP.UncompressedProfile;

				icc_profile = ICC_Profile.getInstance(bytes);
			}
			else if (gAMAs.size() == 1)
			{
				PNGChunkgAMA pngChunkgAMA = (PNGChunkgAMA) gAMAs.get(0);
				double gamma = pngChunkgAMA.getGamma();
				//				if (debug)
				//				System.out.println("gamma: " + gamma);

				// charles: what is the correct target value here?
				//				double targetGamma = 2.2;
				double targetGamma = 1.0;
				double diff = Math.abs(targetGamma - gamma);
				if (diff >= 0.5)
					gammaCorrection = new GammaCorrection(gamma, targetGamma);

				if (gammaCorrection != null)
					if (pngChunkPLTE != null)
						pngChunkPLTE.correct(gammaCorrection);

			}
		}

		{
			int width = pngChunkIHDR.width;
			int height = pngChunkIHDR.height;
			int colorType = pngChunkIHDR.colorType;
			int bitDepth = pngChunkIHDR.bitDepth;

			//			System.out.println("color_type: " + color_type);
			//			System.out.println("BitDepth: " + BitDepth);

			int transfer_type;
			//			int BytesPerSample;
			int bitsPerSample = bitDepth;

			if (pngChunkIHDR.filterMethod != 0)
				throw new ImageReadException("PNG: unknown FilterMethod: "
						+ pngChunkIHDR.filterMethod);

			transfer_type = DataBuffer.TYPE_BYTE;
			//			switch (BitDepth)
			//			{
			//				case 1 :
			//				case 2 :
			//				case 4 :
			//				case 8 :
			//					transfer_type = DataBuffer.TYPE_BYTE;
			//					//					BytesPerSample = 1;
			//					break;
			//				case 16 :
			//					transfer_type = DataBuffer.TYPE_INT;
			//					//					BytesPerSample = 2;
			//					break;
			//				default :
			//					throw new ImageReadException("PNG: unknown bit depth: " + BitDepth);
			//			}

			ColorModel cm = null;
			int samplesPerPixel = samplesPerPixel(pngChunkIHDR.colorType);
			boolean isGrayscale = isGrayscale(pngChunkIHDR.colorType);

			//			switch (colorType)
			//			{
			//				case 0 : //       1,2,4,8,16  Each pixel is a grayscale sample.
			//				{
			//					ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);
			//
			//					//					BytesPerPixel = getBytesPerPixel( BitsPerSample,  SamplesPerPixel);
			//					//					BytesPerPixel = BytesPerSample * SamplesPerPixel;
			//					cm = new ComponentColorModel(cs, true, false,
			//							ColorModel.TRANSLUCENT, transfer_type);
			//					break;
			//				}
			//				case 2 : //     8,16        Each pixel is an R,G,B triple.
			//				{
			//					ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_sRGB);
			//
			//					//					BytesPerPixel = getBytesPerPixel( BitsPerSample,  SamplesPerPixel);
			//					//					BytesPerPixel = BytesPerSample * SamplesPerPixel;
			//					cm = new ComponentColorModel(cs, true, false,
			//							ColorModel.TRANSLUCENT, transfer_type);
			//					//										cm = ColorModel.getRGBdefault();
			//					break;
			//				}
			//					//					   
			//				case 3 : //     1,2,4,8     Each pixel is a palette index;
			//					//					                       a PLTE chunk must appear.
			//				{
			//					ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_sRGB);
			//
			//					//					BytesPerPixel = getBytesPerPixel( BitsPerSample,  SamplesPerPixel);
			//					//					BytesPerPixel = BytesPerSample * SamplesPerPixel;
			//					cm = new ComponentColorModel(cs, true, false,
			//							ColorModel.TRANSLUCENT, transfer_type);
			//					//										cm = ColorModel.getRGBdefault();
			//
			//					//					SamplesPerPixel = 1;
			//					//					//					bits_per_pixel = 8;
			//					//					//					BytesPerPixel = 1;
			//					//					cm = ColorModel.getRGBdefault();
			//					//					//					ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_sRGB);
			//					//					//					cm = new ComponentColorModel(cs, false, false,
			//					//					//							ColorModel.OPAQUE, transfer_type);
			//					break;
			//				}
			//				case 4 : //     8,16        Each pixel is a grayscale sample,
			//					//					                       followed by an alpha sample.
			//				{
			//					ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);
			//
			//					//					BytesPerPixel = getBytesPerPixel( BitsPerSample,  SamplesPerPixel);
			//					//					BytesPerPixel = BytesPerSample * SamplesPerPixel;
			//					cm = new ComponentColorModel(cs, true, false,
			//							ColorModel.TRANSLUCENT, transfer_type);
			//					break;
			//				}
			//				case 6 : //    8,16        Each pixel is an R,G,B triple,
			//				{
			//					ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_sRGB);
			//
			//					//					BytesPerPixel = getBytesPerPixel( BitsPerSample,  SamplesPerPixel);
			//					//					BytesPerPixel = BytesPerSample * SamplesPerPixel;
			//					cm = new ComponentColorModel(cs, true, false,
			//							ColorModel.TRANSLUCENT, transfer_type);
			//					break;
			//				}
			//				default :
			//					throw new ImageReadException("PNG: unknown color type: "
			//							+ BitDepth);
			//			}

			//			cm = ColorModel.getRGBdefault();
			//
			
			int bitsPerPixel = bitsPerSample * samplesPerPixel;
			Debug.debug("bitsPerSample", bitsPerSample);
			Debug.debug("samplesPerPixel", samplesPerPixel);

			
			//
			//						WritableRaster raster = cm.createCompatibleWritableRaster(width,
			//					height);
			//
			//						boolean premult = cm.isAlphaPremultiplied();
			//
			//						BufferedImage result = new BufferedImage(cm, raster, premult, null);
			BufferedImage result;
			if (isGrayscale)
				result = getBufferedImageFactory(params)
						.getGrayscaleBufferedImage(width, height);
			else
				result = getBufferedImageFactory(params).getColorBufferedImage(
						width, height);

			ByteArrayInputStream bais = new ByteArrayInputStream(compressed);
			InflaterInputStream iis = new InflaterInputStream(bais);
			//			ZInputStream iis = new ZInputStream(bais);
			//			ByteArrayInputStream iis = new ByteArrayInputStream(uncompressed);

			int bitsPerScanLine = bitsPerPixel * width;

						Debug.debug("bitsPerScanLine", bitsPerScanLine);
						Debug.debug("bitsPerPixel", bitsPerPixel);

			ScanExpediter scanExpediter;

			if (pngChunkIHDR.interlaceMethod == 0)
				scanExpediter = new ScanExpediterSimple(width, height, iis,
						result, colorType, bitDepth, bitsPerPixel,
						pngChunkPLTE, gammaCorrection, transparencyFilter);
			else if (pngChunkIHDR.interlaceMethod == 1)
				scanExpediter = new ScanExpediterInterlaced(width, height, iis,
						result, colorType, bitDepth, bitsPerPixel,
						pngChunkPLTE, gammaCorrection, transparencyFilter);
			else
				throw new ImageReadException("Unknown InterlaceMethod: "
						+ pngChunkIHDR.interlaceMethod);

			scanExpediter.drive();

			if (icc_profile != null)
			{
				Boolean is_srgb = new IccProfileParser().issRGB(icc_profile);
				if (is_srgb == null || !is_srgb.booleanValue())
				{
					ICC_ColorSpace cs = new ICC_ColorSpace(icc_profile);

					ColorModel srgbCM = ColorModel.getRGBdefault();
					ColorSpace cs_sRGB = srgbCM.getColorSpace();

					result = new ColorTools().convertBetweenColorSpaces(result,
							cs, cs_sRGB);
				}
			}

			return result;

		}

	}

	public boolean dumpImageFile(PrintWriter pw, ByteSource byteSource)
			throws ImageReadException, IOException
	{
		ImageInfo imageInfo = getImageInfo(byteSource);
		if (imageInfo == null)
			return false;

		imageInfo.toString(pw, "");

		{
			Vector chunks = readChunks(byteSource, null, false);
			{
				Vector IHDRs = filterChunks(chunks, IHDR);
				if (IHDRs.size() != 1)
				{
					if (debug)
						System.out.println("PNG contains more than one Header");
					return false;
				}
				PNGChunkIHDR pngChunkIHDR = (PNGChunkIHDR) IHDRs.get(0);
				pw.println("Color: "
						+ getColorTypeDescription(pngChunkIHDR.colorType));
			}

			pw.println("chunks: " + chunks.size());

			if ((chunks == null) || (chunks.size() < 1))
				return false;

			for (int i = 0; i < chunks.size(); i++)
			{
				PNGChunk chunk = (PNGChunk) chunks.get(i);
				printCharQuad(pw, "\t" + i + ": ", chunk.chunkType);
			}
		}

		pw.println("");

		return true;
	}

	public void writeImage(BufferedImage src, OutputStream os, Map params)
			throws ImageWriteException, IOException
	{
		new PngWriter(params).writeImage(src, os, params);
	}
}
