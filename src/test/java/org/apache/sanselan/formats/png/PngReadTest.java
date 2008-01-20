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
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.sanselan.ImageFormat;
import org.apache.sanselan.ImageInfo;
import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.Sanselan;
import org.apache.sanselan.SanselanTest;
import org.apache.sanselan.common.IImageMetadata;
import org.apache.sanselan.util.Debug;

public class PngReadTest extends SanselanTest
{
	public PngReadTest(String name)
	{
		super(name);
	}

	private static boolean isPng(File file) throws IOException,
			ImageReadException
	{
		ImageFormat format = Sanselan.guessFormat(file);
		return format == ImageFormat.IMAGE_FORMAT_PNG;
	}

	private static final ImageFilter imageFilter = new ImageFilter()
	{
		public boolean accept(File file) throws IOException, ImageReadException
		{
			return isPng(file);
		}
	};

	private File getPngImage() throws IOException, ImageReadException
	{
		return getTestImage(imageFilter);
	}

	private List getPngImages() throws IOException, ImageReadException
	{
		return getTestImages(imageFilter);
	}

	public void test() throws IOException, ImageReadException,
			ImageWriteException
	{
		Debug.debug("start");

		List images = getPngImages();
		for (int i = 0; i < images.size(); i++)
		{
			File imageFile = (File) images.get(i);
			Debug.debug("imageFile", imageFile);
			if (imageFile.getParentFile().getName()
					.equalsIgnoreCase("pngsuite")
					&& imageFile.getName().toLowerCase().startsWith("x"))
			{
				try
				{
					IImageMetadata metadata = Sanselan.getMetadata(imageFile);
					//			assertNotNull(metadata);
					fail("Image read should have failed.");
				}
				catch (Exception e)
				{
				}
				
				try
				{
					ImageInfo imageInfo = Sanselan.getImageInfo(imageFile);
//					assertNotNull(imageInfo);
					fail("Image read should have failed.");
				}
				catch (Exception e)
				{
				}
				
				try
				{
					BufferedImage image = Sanselan.getBufferedImage(imageFile);
//					assertNotNull(image);
					fail("Image read should have failed.");
				}
				catch (Exception e)
				{
				}
			}
			else
			{
				IImageMetadata metadata = Sanselan.getMetadata(imageFile);
				//			assertNotNull(metadata);

				ImageInfo imageInfo = Sanselan.getImageInfo(imageFile);
				assertNotNull(imageInfo);

				BufferedImage image = Sanselan.getBufferedImage(imageFile);
				assertNotNull(image);
			}
		}
	}

}
