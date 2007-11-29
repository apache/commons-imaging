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
package org.apache.sanselan.formats.png;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.formats.png.chunks.PNGChunkPLTE;
import org.apache.sanselan.formats.transparencyfilters.TransparencyFilter;
import org.apache.sanselan.util.Debug;

public class ScanExpediterSimple extends ScanExpediter
{
	public ScanExpediterSimple(int width, int height, InputStream is,
			BufferedImage bi, int color_type, int BitDepth, int bitsPerPixel,
			PNGChunkPLTE pngChunkPLTE, GammaCorrection gammaCorrection,
			TransparencyFilter transparencyFilter)

	{
		super(width, height, is, bi, color_type, BitDepth, bitsPerPixel,
				pngChunkPLTE, gammaCorrection, transparencyFilter);
	}

	public void drive() throws ImageReadException, IOException
	{
//		Debug.debug("width", width);
		int bitsPerScanLine = bitsPerPixel * width;
//		Debug.debug("bitsPerPixel", bitsPerPixel);
//		Debug.debug("bitsPerScanLine", bitsPerScanLine);
		int pixelBytesPerScanLine = getBitsToBytesRoundingUp(bitsPerScanLine);
//		Debug.debug("pixelBytesPerScanLine", pixelBytesPerScanLine);
		byte prev[] = null;

		for (int y = 0; y < height; y++)
		{
//			Debug.debug("getNextScanline", y + "/" + height + ", " + pixelBytesPerScanLine);

			byte unfiltered[] = getNextScanline(is, pixelBytesPerScanLine,
					prev, bytesPerPixel);

			prev = unfiltered;

			BitParser bitParser = new BitParser(unfiltered, bitsPerPixel,
					bitDepth);

			for (int x = 0; x < width; x++)
			{
				int rgb = getRGB(bitParser, x);

				//				if (((x + y) % 256) == 0)
				//				{
				//					this.debugNumber(x + ", " + y, rgb, 4);
				//				} 
				//				this.debugNumber(x + ", " + y, rgb, 4);
				//				if (y == 0)
				//					Debug.debug("read " + x + ", " + y, Integer
				//							.toHexString(rgb));

				//				Debug.debug("pngChunkIHDR.interlaceMethod", pngChunkIHDR.interlaceMethod);
				bi.setRGB(x, y, rgb);
				//				buffer.setElem(y * width +x , rgb);

				//				bi.setRGB(x, y, 0xff000000 | rgb);
				//				bi.setRGB(x, y, 0xff000000);
				//				bi.setRGB(x, y, 0xffffffff);
			}
		}

		//		Debug.debug("bi", bi.getWidth());
		//		Debug.debug("bi", bi.getHeight());
	}
}