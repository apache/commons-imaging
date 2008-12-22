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

package org.apache.sanselan.formats.bmp;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.apache.sanselan.ImageFormat;
import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.Sanselan;
import org.apache.sanselan.util.Debug;
import org.apache.sanselan.util.IOUtils;

public class BmpRoundtripTest extends BmpBaseTest
{

	private int[][] getSimpleRawData(int width, int height, int value)
	{
		int[][] result = new int[height][width];
		for (int y = 0; y < height; y++)
			for (int x = 0; x < width; x++)
				result[y][x] = value;
		return result;
	}

	private int[][] getAscendingRawData(int width, int height)
	{
		int[][] result = new int[height][width];
		for (int y = 0; y < height; y++)
			for (int x = 0; x < width; x++)
			{
				int alpha = (x + y) % 256;
				int value = (x + y) % 256;
				int argb = (0xff & alpha) << 24 | (0xff & value) << 16
						| (0xff & value) << 8 | (0xff & value) << 0;

				result[y][x] = argb;
			}
		return result;
	}

	private int[][] randomRawData(int width, int height)
	{
		Random random = new Random();
		int[][] result = new int[height][width];
		for (int y = 0; y < height; y++)
			for (int x = 0; x < width; x++)
			{
				int argb = random.nextInt();
				result[y][x] = argb;
			}
		return result;
	}

	 public void testSmallBlackPixels() throws IOException,
	 ImageReadException,
	 ImageWriteException
	 {
	 int[][] smallBlackPixels = getSimpleRawData(256, 256, 0);
	 writeAndReadImageData(smallBlackPixels);
	 }
	
	public void testSingleBlackPixel() throws IOException, ImageReadException,
			ImageWriteException
	{
		int[][] singleBlackPixel = getSimpleRawData(1, 1, 0);
		writeAndReadImageData(singleBlackPixel);
	}

	
	 public void testSmallRedPixels() throws IOException, ImageReadException,
	 ImageWriteException
	 {
	 int[][] smallRedPixels = getSimpleRawData(256, 256, 0xffff0000);
	 writeAndReadImageData(smallRedPixels);
	 }
	
	 public void testSingleRedPixel() throws IOException, ImageReadException,
	 ImageWriteException
	 {
	 int[][] singleRedPixel = getSimpleRawData(1, 1, 0xffff0000);
	 writeAndReadImageData(singleRedPixel);
	 }
	
	 public void testSmallAscendingPixels() throws IOException,
	 ImageReadException, ImageWriteException
	 {
	 int[][] smallAscendingPixels = getAscendingRawData(256, 256);
	 writeAndReadImageData(smallAscendingPixels);
	 }
	
	 public void testSmallRandomPixels() throws IOException,
	 ImageReadException,
	 ImageWriteException
	 {
	 int[][] smallRandomPixels = randomRawData(256, 256);
	 writeAndReadImageData(smallRandomPixels);
	 }

	private BufferedImage imageDataToBufferedImage(int[][] rawData)
	{
		int width = rawData[0].length;
		int height = rawData.length;
		BufferedImage image = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_ARGB);
		for (int y = 0; y < height; y++)
			for (int x = 0; x < width; x++)
			{
				image.setRGB(x, y, rawData[y][x]);
			}
		return image;
	}

	private int[][] bufferedImageToImageData(BufferedImage image)
	{
		int width = image.getWidth();
		int height = image.getHeight();
		int[][] result = new int[height][width];

		for (int y = 0; y < height; y++)
			for (int x = 0; x < width; x++)
			{
				result[y][x] = image.getRGB(x, y);
			}
		return result;
	}

	private void writeAndReadImageData(int[][] rawData) throws IOException,
			ImageReadException, ImageWriteException
	{
		BufferedImage srcImage = imageDataToBufferedImage(rawData);

		Map writeParams = new HashMap();
		// writeParams.put(SanselanConstants.PARAM_KEY_FORMAT,
		// ImageFormat.IMAGE_FORMAT_BMP);
		// writeParams.put(PngConstants.PARAM_KEY_BMP_FORCE_TRUE_COLOR,
		// Boolean.TRUE);

		byte bytes[] = Sanselan.writeImageToBytes(srcImage,
				ImageFormat.IMAGE_FORMAT_BMP, writeParams);

		// Debug.debug("bytes", bytes);

		File tempFile = createTempFile("temp", ".bmp");
		IOUtils.writeToFile(bytes, tempFile);

		BufferedImage dstImage = Sanselan.getBufferedImage(bytes);

		assertTrue(null != dstImage);
		assertTrue(srcImage.getWidth() == dstImage.getWidth());
		assertTrue(srcImage.getHeight() == dstImage.getHeight());

		int dstData[][] = bufferedImageToImageData(dstImage);
		compare(rawData, dstData);
	}

	private void compare(int[][] a, int[][] b)
	{
		assertTrue(null != a);
		assertTrue(null != b);
		assertTrue(a.length == b.length);

		for (int y = 0; y < a.length; y++)
		{
			assertTrue(a[y].length == b[y].length);
			// make sure row lengths consistent.
			assertTrue(a[0].length == b[y].length);
			for (int x = 0; x < a[y].length; x++)
			{
				// ignore alpha channel - BMP has no transparency.
				int rgbA = 0xffffff & a[y][x];
				int rgbB = 0xffffff & b[y][x];

				if (rgbA != rgbB)
				{
					Debug.debug("x: " + x + ", y: " + y + ", rgbA: " + rgbA
							+ " (0x" + Integer.toHexString(rgbA) + ")"
							+ ", rgbB: " + rgbB + " (0x"
							+ Integer.toHexString(rgbB) + ")");
				}
				assertTrue(rgbA == rgbB);
			}
		}
	}

}
