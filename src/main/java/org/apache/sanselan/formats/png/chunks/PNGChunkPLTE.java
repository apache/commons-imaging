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
package org.apache.sanselan.formats.png.chunks;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.formats.png.GammaCorrection;

public class PNGChunkPLTE extends PNGChunk
{
	public final int rgb[];

	public PNGChunkPLTE(int length, int ChunkType, int CRC, byte bytes[])
			throws ImageReadException, IOException
	{
		super(length, ChunkType, CRC, bytes);

		ByteArrayInputStream is = new ByteArrayInputStream(bytes);

		if ((length % 3) != 0)
			throw new ImageReadException("PLTE: wrong length: " + length);

		int count = length / 3;

		rgb = new int[count];

		for (int i = 0; i < count; i++)
		{
			int red = readByte("red[" + i + "]", is,
					"Not a Valid Png File: PLTE Corrupt");
			int green = readByte("green[" + i + "]", is,
					"Not a Valid Png File: PLTE Corrupt");
			int blue = readByte("blue[" + i + "]", is,
					"Not a Valid Png File: PLTE Corrupt");
			rgb[i] = 0xff000000 | ((0xff & red) << 16) | ((0xff & green) << 8)
					| ((0xff & blue) << 0);
		}
	}

	public int getRGB(int index) throws ImageReadException, IOException
	{
		if ((index < 0) || (index >= rgb.length))
			throw new ImageReadException("PNG: unknown Palette reference: "
					+ index);
		return rgb[index];
	}

	// public void printPalette() {
	// Debug.debug();
	// Debug.debug("palette");
	// for (int i = 0; i < rgb.length; i++) {
	// Debug.debug("\t" + "palette[" + i + "];", rgb[i] + " (0x"
	// + Integer.toHexString(rgb[i]) + ")");
	//
	// }
	// Debug.debug();
	// }

	public void correct(GammaCorrection gammaCorrection)
	{
		for (int i = 0; i < rgb.length; i++)
			rgb[i] = gammaCorrection.correctARGB(rgb[i]);
	}

}