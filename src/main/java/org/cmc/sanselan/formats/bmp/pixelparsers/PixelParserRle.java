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
package org.cmc.sanselan.formats.bmp.pixelparsers;

import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.IOException;

import org.cmc.sanselan.ImageReadException;
import org.cmc.sanselan.formats.bmp.BmpHeaderInfo;

public class PixelParserRle extends PixelParser
{

	public PixelParserRle(BmpHeaderInfo bhi, byte ColorTable[],
			byte ImageData[])
	{
		super(bhi, ColorTable, ImageData);

	}

	private int getSamplesPerByte() throws ImageReadException, IOException
	{
		if (bhi.bitsPerPixel == 8)
			return 1;
		else if (bhi.bitsPerPixel == 4)
			return 2;
		else
			throw new ImageReadException("BMP RLE: bad BitsPerPixel: "
					+ bhi.bitsPerPixel);
	}

	private int[] convertDataToSamples(int data) throws ImageReadException,
			IOException
	{
		int rgbs[];
		if (bhi.bitsPerPixel == 8)
		{
			rgbs = new int[1];
			rgbs[0] = getColorTableRGB(data);
			//			pixels_written = 1;
		}
		else if (bhi.bitsPerPixel == 4)
		{
			rgbs = new int[2];
			int sample1 = data >> 4;
			int sample2 = 0x0f & data;
			rgbs[0] = getColorTableRGB(sample1);
			rgbs[1] = getColorTableRGB(sample2);
			//			pixels_written = 2;
		}
		else
			throw new ImageReadException("BMP RLE: bad BitsPerPixel: "
					+ bhi.bitsPerPixel);

		return rgbs;
	}

	private int processByteOfData(int rgbs[], int repeat, int x, int y,
			int width, int height, DataBuffer db, BufferedImage bi)
			throws ImageReadException
	{
		//				int rbg
		int pixels_written = 0;
		for (int i = 0; i < repeat; i++)
		{

			if ((x >= 0) && (x < width) && (y >= 0) && (y < height))
			{
				//					int rgb = 0xff000000;
				//					rgb = getNextRGB();
				int rgb = rgbs[i % rgbs.length];
				//								bi.setRGB(x, y, rgb);
				db.setElem(y * bhi.width + x, rgb);
				//								bi.setRGB(x, y, 0xff00ff00);
			}
			else
			{
				System.out.println("skipping bad pixel (" + x + "," + y + ")");
			}

			x++;
			pixels_written++;
		}

		return pixels_written;
	}

	public void processImage(BufferedImage bi) throws ImageReadException,
			IOException
	{
		DataBuffer db = bi.getRaster().getDataBuffer();

		int count = 0;
		int width = bhi.width;
		int height = bhi.height;
		int x = 0, y = height - 1;

		//		bfp.setDebug(true);

		boolean done = false;
		while (!done)
		{
			count++;
			//			if (count > 100)
			//				return;

			int a = 0xff & bfp.readByte("RLE (" + x + "," + y + ") a", is,
					"BMP: Bad RLE");
			//				baos.write(a);
			int b = 0xff & bfp.readByte("RLE (" + x + "," + y + ")  b", is,
					"BMP: Bad RLE");
			//				baos.write(b);

			if (a == 0)
			{
				switch (b)
				{
					case 0 : // EOL
					{
						//						System.out.println("EOL");
						y--;
						x = 0;
					}
						break;
					case 1 : // EOF
						//						System.out
						//								.println("xXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
						done = true;
						break;
					case 2 : {
						//						System.out
						//								.println("xXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
						int c = 0xff & bfp
								.readByte("RLE c", is, "BMP: Bad RLE");
						//							baos.write(c);
						int d = 0xff & bfp
								.readByte("RLE d", is, "BMP: Bad RLE");
						//							baos.write(d);

					}
						break;
					default : {
						//						System.out
						//								.println("xXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

						int SamplesPerByte = getSamplesPerByte();
						int size = b / SamplesPerByte;
						if ((b % SamplesPerByte) > 0)
							size++;
						if ((size % 2) != 0)
							size++;

						//						System.out.println("b: " + b);
						//						System.out.println("size: " + size);
						//						System.out.println("SamplesPerByte: " + SamplesPerByte);

						byte bytes[] = bfp.readByteArray("bytes", size, is,
								"RLE: Absolute Mode");

						int remaining = b;

						//						while(true)
						for (int i = 0; remaining > 0; i++)
						//								for (int i = 0; i < bytes.length; i++)
						{
							int samples[] = convertDataToSamples(0xff & bytes[i]);
							int towrite = Math.min(remaining, SamplesPerByte);
							//							System.out.println("remaining: " + remaining);
							//							System.out.println("SamplesPerByte: "
							//									+ SamplesPerByte);
							//							System.out.println("towrite: " + towrite);
							int written = processByteOfData(samples, towrite,
									x, y, width, height, db, bi);
							//							System.out.println("written: " + written);
							//							System.out.println("");
							x += written;
							remaining -= written;
						}
						//							baos.write(bytes);
					}
						break;
				}
			}
			else
			{
				int rgbs[] = convertDataToSamples(b);

				x += processByteOfData(rgbs, a, x, y, width, height, db, bi);
				//					x += processByteOfData(b, a, x, y, width, height, bi);

			}
		}

	}
}