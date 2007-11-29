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

import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.IOException;

import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.formats.bmp.BmpHeaderInfo;

public abstract class PixelParserSimple extends PixelParser
{
	public PixelParserSimple(BmpHeaderInfo bhi, byte ColorTable[],
			byte ImageData[])
	{
		super(bhi, ColorTable, ImageData);
	}

	public abstract int getNextRGB() throws ImageReadException, IOException;

	public abstract void newline() throws ImageReadException, IOException;

	public void processImage(BufferedImage bi) throws ImageReadException,
			IOException
	{
		DataBuffer db = bi.getRaster().getDataBuffer();

		for (int y = bhi.height - 1; y >= 0; y--)
		{
			for (int x = 0; x < bhi.width; x++)
			{
				int rgb = 0xff000000;
				rgb = getNextRGB();

				db.setElem(y * bhi.width + x, rgb);
			}
			newline();
		}
	}
}