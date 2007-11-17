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

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.zip.DeflaterOutputStream;

import org.cmc.sanselan.ImageWriteException;
import org.cmc.sanselan.palette.MedianCutQuantizer;
import org.cmc.sanselan.palette.Palette;
import org.cmc.sanselan.palette.PaletteFactory;
import org.cmc.sanselan.util.Debug;

public class PngWriter implements PngConstants
{
	private final boolean verbose;

	public PngWriter(boolean verbose)
	{
		this.verbose = verbose;
	}

	public PngWriter(Map params)
	{
		this.verbose = getParamBoolean(params, PARAM_KEY_VERBOSE, false);
	}

	private boolean getParamBoolean(Map params, Object key,
			boolean default_value)
	{
		boolean result = default_value;
		{
			Object o = params == null ? null : params.get(key);
			if (o != null && o instanceof Boolean)
				result = ((Boolean) o).booleanValue();
		}
		return result;
	}

	/*
	 1. IHDR: image header, which is the first chunk in a PNG datastream.
	 2. PLTE: palette table associated with indexed PNG images.
	 3. IDAT: image data chunks.
	 4. IEND: image trailer, which is the last chunk in a PNG datastream.

	 The remaining 14 chunk types are termed ancillary chunk types, which encoders may generate and decoders may interpret.

	 1. Transparency information: tRNS (see 11.3.2: Transparency information).
	 2. Colour space information: cHRM, gAMA, iCCP, sBIT, sRGB (see 11.3.3: Colour space information).
	 3. Textual information: iTXt, tEXt, zTXt (see 11.3.4: Textual information).
	 4. Miscellaneous information: bKGD, hIST, pHYs, sPLT (see 11.3.5: Miscellaneous information).
	 5. Time information: tIME (see 11.3.6: Time stamp information).

	 */

	private final void writeInt(OutputStream os, int value) throws IOException
	{
		os.write(0xff & (value >> 24));
		os.write(0xff & (value >> 16));
		os.write(0xff & (value >> 8));
		os.write(0xff & (value >> 0));
	}

	private final void writeChunk(OutputStream os, byte chunk_type[],
			byte data[]) throws IOException
	{
		int data_length = data == null ? 0 : data.length;
		writeInt(os, data_length);
		os.write(chunk_type);
		if (data != null)
			os.write(data);

		//		Debug.debug("writeChunk chunk_type", chunk_type);
		//		Debug.debug("writeChunk data", data);

		{
			PngCrc png_crc = new PngCrc();

			long crc1 = png_crc
					.start_partial_crc(chunk_type, chunk_type.length);
			long crc2 = data == null ? crc1 : png_crc.continue_partial_crc(
					crc1, data, data.length);
			int crc = (int) png_crc.finish_partial_crc(crc2);

			//			Debug.debug("crc1", crc1 + " (" + Long.toHexString(crc1)
			//					+ ")");
			//			Debug.debug("crc2", crc2 + " (" + Long.toHexString(crc2)
			//					+ ")");
			//			Debug.debug("crc3", crc + " (" + Integer.toHexString(crc)
			//					+ ")");

			writeInt(os, crc);
		}
	}

	private static class ImageHeader
	{
		public final int width;
		public final int height;
		public final byte bit_depth;
		public final byte colorType;
		public final byte compression_method;
		public final byte filter_method;
		public final byte interlace_method;

		public ImageHeader(int width, int height, byte bit_depth,
				byte colorType, byte compression_method, byte filter_method,
				byte interlace_method)
		{
			this.width = width;
			this.height = height;
			this.bit_depth = bit_depth;
			this.colorType = colorType;
			this.compression_method = compression_method;
			this.filter_method = filter_method;
			this.interlace_method = interlace_method;
		}

	}

	private void writeChunkIHDR(OutputStream os, ImageHeader value)
			throws IOException
	{
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		writeInt(baos, value.width);
		writeInt(baos, value.height);
		baos.write(0xff & value.bit_depth);
		baos.write(0xff & value.colorType);
		baos.write(0xff & value.compression_method);
		baos.write(0xff & value.filter_method);
		baos.write(0xff & value.interlace_method);

		//		Debug.debug("baos", baos.toByteArray());

		writeChunk(os, IHDR_CHUNK_TYPE, baos.toByteArray());
	}

	private void writeChunkPLTE(OutputStream os, Palette palette)
			throws IOException
	{
		int length = palette.length();
		byte bytes[] = new byte[length * 3];

		//		Debug.debug("length", length);
		for (int i = 0; i < length; i++)
		{
			int rgb = palette.getEntry(i);
			int index = i * 3;
			//			Debug.debug("index", index);
			bytes[index + 0] = (byte) (0xff & (rgb >> 16));
			bytes[index + 1] = (byte) (0xff & (rgb >> 8));
			bytes[index + 2] = (byte) (0xff & (rgb >> 0));
		}

		writeChunk(os, PLTE_CHUNK_TYPE, bytes);
	}

	private void writeChunkIEND(OutputStream os) throws IOException
	{
		writeChunk(os, IEND_CHUNK_TYPE, null);
	}

	private void writeChunkIDAT(OutputStream os, byte bytes[])
			throws IOException
	{
		writeChunk(os, IDAT_CHUNK_TYPE, bytes);
	}

	private byte getColourType(boolean hasAlpha, boolean isGrayscale)
	{
		byte result;

		boolean index = false; // charles

		if (index)
			result = COLOR_TYPE_INDEXED_COLOR;
		else if (isGrayscale)
		{
			if (hasAlpha)
				result = COLOR_TYPE_GREYSCALE_WITH_ALPHA;
			else
				result = COLOR_TYPE_GREYSCALE;
		}
		else if (hasAlpha)
			result = COLOR_TYPE_TRUE_COLOR_WITH_ALPHA;
		else
			result = COLOR_TYPE_TRUE_COLOR;

		return result;
	}

	private byte getBitDepth(final byte colorType, Map params)
	{
		byte result = 8;

		Object o = params.get(PARAM_KEY_PNG_BIT_DEPTH);
		if (o != null && o instanceof Number)
		{
			int value = ((Number) o).intValue();
			switch (value)
			{
				case 1 :
				case 2 :
				case 4 :
				case 8 :
				case 16 :
					result = (byte) value;
				default :
			}
			switch (colorType)
			{
				case COLOR_TYPE_GREYSCALE :
					break;
				case COLOR_TYPE_INDEXED_COLOR :
					result = (byte) Math.min(8, result);
					break;
				case COLOR_TYPE_GREYSCALE_WITH_ALPHA :
				case COLOR_TYPE_TRUE_COLOR :
				case COLOR_TYPE_TRUE_COLOR_WITH_ALPHA :
					result = (byte) Math.max(8, result);
					break;
				default :
			}
		}

		return result;
	}

	/*
	 between two chunk types indicates alternatives.
	 Table 5.3 — Chunk ordering rules Critical chunks
	 (shall appear in this order, except PLTE is optional)
	 Chunk name 	Multiple allowed 	Ordering constraints
	 IHDR 	No 	Shall be first
	 PLTE 	No 	Before first IDAT
	 IDAT 	Yes 	Multiple IDAT chunks shall be consecutive
	 IEND 	No 	Shall be last
	 Ancillary chunks
	 (need not appear in this order)
	 Chunk name 	Multiple allowed 	Ordering constraints
	 cHRM 	No 	Before PLTE and IDAT
	 gAMA 	No 	Before PLTE and IDAT
	 iCCP 	No 	Before PLTE and IDAT. If the iCCP chunk is present, the sRGB chunk should not be present.
	 sBIT 	No 	Before PLTE and IDAT
	 sRGB 	No 	Before PLTE and IDAT. If the sRGB chunk is present, the iCCP chunk should not be present.
	 bKGD 	No 	After PLTE; before IDAT
	 hIST 	No 	After PLTE; before IDAT
	 tRNS 	No 	After PLTE; before IDAT
	 pHYs 	No 	Before IDAT
	 sPLT 	Yes 	Before IDAT
	 tIME 	No 	None
	 iTXt 	Yes 	None
	 tEXt 	Yes 	None
	 zTXt 	Yes 	None
	 */

	public void writeImage(BufferedImage src, OutputStream os, Map params)
			throws ImageWriteException, IOException
	{
		// make copy of params; we'll clear keys as we consume them.
		params = new Hashtable(params);

		// clear format key.
		if (params.containsKey(PARAM_KEY_FORMAT))
			params.remove(PARAM_KEY_FORMAT);
		// clear verbose key.
		if (params.containsKey(PARAM_KEY_VERBOSE))
			params.remove(PARAM_KEY_VERBOSE);

		Map rawParams = new HashMap(params);
		if (params.containsKey(PARAM_KEY_PNG_FORCE_TRUE_COLOR))
			params.remove(PARAM_KEY_PNG_FORCE_TRUE_COLOR);
		if (params.containsKey(PARAM_KEY_PNG_FORCE_INDEXED_COLOR))
			params.remove(PARAM_KEY_PNG_FORCE_INDEXED_COLOR);
		if (params.containsKey(PARAM_KEY_PNG_BIT_DEPTH))
			params.remove(PARAM_KEY_PNG_BIT_DEPTH);
		if (params.size() > 0)
		{
			Object firstKey = params.keySet().iterator().next();
			throw new ImageWriteException("Unknown parameter: " + firstKey);
		}
		params = rawParams;

		int width = src.getWidth();
		int height = src.getHeight();

		boolean hasAlpha = new PaletteFactory().hasTransparency(src);
		if (verbose)
			Debug.debug("hasAlpha", hasAlpha);
		//			int transparency = new PaletteFactory().getTransparency(src);

		boolean isGrayscale = new PaletteFactory().isGrayscale(src);
		if (verbose)
			Debug.debug("isGrayscale", isGrayscale);

		byte colorType;
		{
			boolean force_indexed_color = getParamBoolean(params,
					PARAM_KEY_PNG_FORCE_INDEXED_COLOR, false);
			boolean force_true_color = getParamBoolean(params,
					PARAM_KEY_PNG_FORCE_TRUE_COLOR, false);

			if (force_indexed_color && force_true_color)
				throw new ImageWriteException(
						"Params: Cannot force both indexed and true color modes");
			else if (force_indexed_color)
			{
				colorType = COLOR_TYPE_INDEXED_COLOR;
			}
			else if (force_true_color)
			{
				colorType = (byte) (hasAlpha
						? COLOR_TYPE_TRUE_COLOR_WITH_ALPHA
						: COLOR_TYPE_TRUE_COLOR);
			}
			else
				colorType = getColourType(hasAlpha, isGrayscale);
			if (verbose)
				Debug.debug("colorType", colorType);

		}

		byte bit_depth = getBitDepth(colorType, params);
		if (verbose)
			Debug.debug("bit_depth", bit_depth);

		int sample_depth;
		if (colorType == COLOR_TYPE_INDEXED_COLOR)
			sample_depth = 8;
		else
			sample_depth = bit_depth;
		if (verbose)
			Debug.debug("sample_depth", sample_depth);

		{
			os.write(PNG_Signature);
		}
		{
			// IHDR  	Shall be first

			byte compression_method = COMPRESSION_TYPE_INFLATE_DEFLATE;
			byte filter_method = FILTER_METHOD_ADAPTIVE;
			byte interlace_method = INTERLACE_METHOD_NONE; // charles

			ImageHeader image_header = new ImageHeader(width, height,
					bit_depth, colorType, compression_method, filter_method,
					interlace_method);

			writeChunkIHDR(os, image_header);
		}

		{
			// sRGB 	No 	Before PLTE and IDAT. If the sRGB chunk is present, the iCCP chunk should not be present.

			// charles
		}

		Palette palette = null;
		if (colorType == COLOR_TYPE_INDEXED_COLOR)
		{
			// PLTE 	No 	Before first IDAT

			int max_colors = hasAlpha ? 255 : 256;

			palette = new MedianCutQuantizer(true).process(src, max_colors,
					verbose);
			//			Palette palette2 = new PaletteFactory().makePaletteSimple(src,
			//					max_colors);

			//			palette.dump();

			writeChunkPLTE(os, palette);
		}

		{
			//						Debug.debug("writing IDAT");

			// IDAT 	Yes 	Multiple IDAT chunks shall be consecutive

			byte uncompressed[];
			{
				ByteArrayOutputStream baos = new ByteArrayOutputStream();

				int row[] = new int[width];
				for (int y = 0; y < height; y++)
				{
					//					Debug.debug("y", y + "/" + height);
					src.getRGB(0, y, width, 1, row, 0, width);

					byte filter_type = FILTER_TYPE_NONE;
					baos.write(filter_type);
					for (int x = 0; x < width; x++)
					{
						int argb = row[x];

						if (palette != null)
						{
							int index = palette.getPaletteIndex(argb);
							baos.write(0xff & index);
						}
						else
						{
							int alpha = 0xff & (argb >> 24);
							int red = 0xff & (argb >> 16);
							int green = 0xff & (argb >> 8);
							int blue = 0xff & (argb >> 0);

							if (isGrayscale)
							{
								int gray = (red + green + blue) / 3;
								//								if(y==0)
								//								{
								//									Debug.debug(x + ", " + y + " argb", Integer.toHexString(argb));
								////									Debug.debug(x + ", " + y + " gray", gray);
								////									Debug.debug(x + ", " + y + " gray", gray);
								//									Debug.debug(x + ", " + y + " gray", gray + " " + Integer.toHexString(gray));
								//									Debug.debug();
								//								}
								baos.write(gray);
							}
							else
							{
								baos.write(red);
								baos.write(green);
								baos.write(blue);
							}
						}
					}
				}
				uncompressed = baos.toByteArray();
			}
			//			Debug.debug("uncompressed", uncompressed.length);

			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			DeflaterOutputStream dos = new DeflaterOutputStream(baos);
			int chunk_size = 256 * 1024;
			for (int index = 0; index < uncompressed.length; index += chunk_size)
			{
				int end = Math.min(uncompressed.length, index + chunk_size);
				int length = end - index;

				dos.write(uncompressed, index, length);

				byte compressed[] = baos.toByteArray();
				baos.reset();
				if (compressed.length > 0)
				{
					//					Debug.debug("compressed", compressed.length);
					writeChunkIDAT(os, compressed);
				}

			}
			{
				dos.finish();
				byte compressed[] = baos.toByteArray();
				if (compressed.length > 0)
				{
					//					Debug.debug("compressed", compressed.length);
					writeChunkIDAT(os, compressed);
				}
			}
		}

		{
			// IEND 	No 	Shall be last

			writeChunkIEND(os);
		}

		/*
		 Ancillary chunks
		 (need not appear in this order)
		 Chunk name 	Multiple allowed 	Ordering constraints
		 cHRM 	No 	Before PLTE and IDAT
		 gAMA 	No 	Before PLTE and IDAT
		 iCCP 	No 	Before PLTE and IDAT. If the iCCP chunk is present, the sRGB chunk should not be present.
		 sBIT 	No 	Before PLTE and IDAT
		 sRGB 	No 	Before PLTE and IDAT. If the sRGB chunk is present, the iCCP chunk should not be present.
		 bKGD 	No 	After PLTE; before IDAT
		 hIST 	No 	After PLTE; before IDAT
		 tRNS 	No 	After PLTE; before IDAT
		 pHYs 	No 	Before IDAT
		 sPLT 	Yes 	Before IDAT
		 tIME 	No 	None
		 iTXt 	Yes 	None
		 tEXt 	Yes 	None
		 zTXt 	Yes 	None
		 */

		os.close();
	} // todo: filter types
	// proper colour types
	// srgb, etc.
}
