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
package org.apache.sanselan.formats.pnm;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

import org.apache.sanselan.ImageWriteException;

public class PGMWriter extends PNMWriter
{
	public PGMWriter(boolean RAWBITS)
	{
		super(RAWBITS);
	}

	public void writeImage(BufferedImage src, OutputStream os, Map params)
			throws ImageWriteException, IOException
	{
		//			System.out.println
		// (b1 == 0x50 && b2 == 0x36)
		os.write(0x50);
		os.write(RAWBITS ? 0x35 : 0x32);
		os.write(' ');

		int width = src.getWidth();
		int height = src.getHeight();

		os.write(("" + width).getBytes());
		os.write(' ');

		os.write(("" + height).getBytes());
		os.write(' ');

		os.write(("" + 255).getBytes()); // max component value
		os.write('\n');

		for (int y = 0; y < height; y++)
			for (int x = 0; x < width; x++)
			{
				int argb = src.getRGB(x, y);
				int red = 0xff & (argb >> 16);
				int green = 0xff & (argb >> 8);
				int blue = 0xff & (argb >> 0);
				int sample = (red + green + blue) / 3;

				if (RAWBITS)
				{
					os.write((byte) sample);
				}
				else
				{
					os.write(("" + sample).getBytes()); // max component value
					os.write(' ');
				}
			}
	}

}