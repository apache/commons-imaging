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

import java.io.IOException;

import org.cmc.sanselan.ImageReadException;

public class BitParser
{
	private final byte bytes[];
	private final int BitsPerPixel;
	private final int BitDepth;

	public BitParser(byte bytes[], int BitsPerPixel, int BitDepth)
	{
		this.bytes = bytes;
		this.BitsPerPixel = BitsPerPixel;
		this.BitDepth = BitDepth;
	}

	public int getSample(int pixel_index_in_scanline, int SampleIndex)
			throws ImageReadException, IOException
	{
		int pixel_index_bits = BitsPerPixel * pixel_index_in_scanline;
		int sample_index_bits = pixel_index_bits + (SampleIndex * BitDepth);
		//		int sample_index_bytes = sample_index_bits / 8;
		int sample_index_bytes = sample_index_bits >> 3;
		//		int sample_index_bytes = pixel_index_bits / 8;

		//		System.out.println("sample_index_bytes: " + sample_index_bytes);

		if (BitDepth == 8)
			return 0xff & bytes[sample_index_bytes];
		else if (BitDepth < 8)
		{
			int b = 0xff & bytes[sample_index_bytes];
			//			int bits_to_shift = 8 - ((pixel_index_bits % 8) + BitsPerPixel);
			int bits_to_shift = 8 - ((pixel_index_bits & 7) + BitDepth);
			//			int bits_to_shift = 8 - ((pixel_index_bits % 8) + BitDepth);
			b >>= bits_to_shift;

			int bitmask = (1 << BitDepth) - 1;
			return b & bitmask;
			//			switch (BitDepth)
			//			{
			//				case 1 :
			//					return b & 1;
			//				case 2 :
			//					return b & 3;
			//				case 4 :
			//					return b & 15;
			//			}
		}
		else if (BitDepth == 16)
		{
			return ((0xff & (bytes[sample_index_bytes] << 8)) | (0xff & bytes[sample_index_bytes + 1]));
		}

		throw new ImageReadException("PNG: bad BitDepth: " + BitDepth);
	}

	public int getSampleAsByte(int pixel_index_in_scanline, int SampleIndex)
			throws ImageReadException, IOException
	{
		int sample = getSample(pixel_index_in_scanline, SampleIndex);
		int rot = 8 - BitDepth;
		if (rot > 0)
			sample <<= rot;
		else if (rot < 0)
			sample >>= -rot;
		return 0xff & sample;
	}
}