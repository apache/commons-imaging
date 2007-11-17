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
package org.apache.sanselan.formats.bmp.pixelparsers;

import java.io.IOException;

import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.formats.bmp.BmpHeaderInfo;

public class PixelParserRgb extends PixelParserSimple
{
	public PixelParserRgb(BmpHeaderInfo bhi, byte ColorTable[],
			byte ImageData[])
	{
		super(bhi, ColorTable, ImageData);

	}

	private int bytecount = 0;
	private int cached_bit_count = 0;
	private int cached_byte = 0;

	int pixel_count = 0;

	public int getNextRGB() throws ImageReadException, IOException
	{
		pixel_count++;

		if ((bhi.bitsPerPixel == 1) // always grayscale?
				|| (bhi.bitsPerPixel == 4)) // always grayscale?

		{
			if (cached_bit_count < bhi.bitsPerPixel)
			{
				if (cached_bit_count != 0)
					throw new ImageReadException("Unexpected leftover bits: "
							+ cached_bit_count + "/" + bhi.bitsPerPixel);

				//				cached_byte = 0;

				cached_bit_count += 8;
				cached_byte =
				//					(cached_byte << 8)
				//						|
				(0xff & imageData[bytecount]);
				//				if (pixel_count < 500)
				//					System.out.println("reading byte on pixel # "
				//							+ (pixel_count - 1));
				bytecount++;
			}
			int cache_mask = (1 << bhi.bitsPerPixel) - 1;
			int sample = cache_mask & (cached_byte >> (8 - bhi.bitsPerPixel));
			cached_byte = 0xff & (cached_byte << bhi.bitsPerPixel);
			cached_bit_count -= bhi.bitsPerPixel;

			int rgb = getColorTableRGB(sample);

			return rgb;
		}
		else if (bhi.bitsPerPixel == 8) // always grayscale?
		{
			int sample = 0xff & imageData[bytecount + 0];

			int rgb = getColorTableRGB(sample);

			bytecount += 1;

			return rgb;
		}
		else if (bhi.bitsPerPixel == 16)
		{
			int data = bfp.read2Bytes("Pixel", is, "BMP Image Data");

			int blue = (0x1f & (data >> 0)) << 3;
			int green = (0x1f & (data >> 5)) << 3;
			int red = (0x1f & (data >> 10)) << 3;
			int alpha = 0xff;

			int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);

			bytecount += 2;

			return rgb;
		}
		else if (bhi.bitsPerPixel == 24)
		{
			int blue = 0xff & imageData[bytecount + 0];
			int green = 0xff & imageData[bytecount + 1];
			int red = 0xff & imageData[bytecount + 2];
			int alpha = 0xff;

			int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);

			bytecount += 3;

			return rgb;
		}
		else if (bhi.bitsPerPixel == 32)
		{
			int blue = 0xff & imageData[bytecount + 0];
			int green = 0xff & imageData[bytecount + 1];
			int red = 0xff & imageData[bytecount + 2];
			int alpha = 0xff;

			int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);

			bytecount += 4;

			return rgb;
		}

		throw new ImageReadException("Unknown BitsPerPixel: "
				+ bhi.bitsPerPixel);
	}

	public void newline() throws ImageReadException, IOException
	{
		cached_bit_count = 0;

		while (((bytecount) % 4) != 0)
		{
			bfp.readByte("Pixel", is, "BMP Image Data");
			bytecount++;
		}
	}
}