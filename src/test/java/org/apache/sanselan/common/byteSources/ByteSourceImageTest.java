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

package org.apache.sanselan.common.byteSources;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.apache.sanselan.ImageFormat;
import org.apache.sanselan.ImageInfo;
import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.Sanselan;
import org.apache.sanselan.util.Debug;
import org.apache.sanselan.util.IOUtils;

public class ByteSourceImageTest extends ByteSourceTest
{
	public ByteSourceImageTest()
	{
		super(ByteSourceImageTest.class.getName());
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite(ByteSourceImageTest.class);
	}

	public void test() throws IOException, ImageReadException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException
	{
		File imageFile = getTestImage();
		Debug.debug("imageFile", imageFile);
		assertTrue(imageFile != null);

		byte imageFileBytes[] = IOUtils.getFileBytes(imageFile);
		assertTrue(imageFileBytes != null);
		assertTrue(imageFileBytes.length == imageFile.length());

		checkGuessFormat(imageFile, imageFileBytes);

		checkGetICCProfileBytes(imageFile, imageFileBytes);

		checkGetImageInfo(imageFile, imageFileBytes);

		checkGetImageSize(imageFile, imageFileBytes);

		checkGetBufferedImage(imageFile, imageFileBytes);
	}

	public void checkGetBufferedImage(File file, byte[] bytes)
			throws IOException, ImageReadException
	{
		BufferedImage imageFile = Sanselan.getBufferedImage(file);
		assertTrue(imageFile != null);
		assertTrue(imageFile.getWidth() > 0);
		assertTrue(imageFile.getHeight() > 0);

		BufferedImage imageBytes = Sanselan.getBufferedImage(bytes);
		assertTrue(imageBytes != null);
		assertTrue(imageFile.getWidth() == imageBytes.getWidth());
		assertTrue(imageFile.getHeight() == imageBytes.getHeight());
	}

	public void checkGetImageSize(File imageFile, byte[] imageFileBytes)
			throws IOException, ImageReadException
	{
		Dimension imageSizeFile = Sanselan.getImageSize(imageFile);
		assertTrue(imageSizeFile != null);
		assertTrue(imageSizeFile.width > 0);
		assertTrue(imageSizeFile.height > 0);

		Dimension imageSizeBytes = Sanselan.getImageSize(imageFileBytes);
		assertTrue(imageSizeBytes != null);
		assertTrue(imageSizeFile.width == imageSizeBytes.width);
		assertTrue(imageSizeFile.height == imageSizeBytes.height);
	}

	public void checkGuessFormat(File imageFile, byte[] imageFileBytes)
			throws IOException, ImageReadException
	{
		// check guessFormat()
		ImageFormat imageFormatFile = Sanselan.guessFormat(imageFile);
		assertTrue(imageFormatFile != null);
		assertTrue(imageFormatFile != ImageFormat.IMAGE_FORMAT_UNKNOWN);
		//		Debug.debug("imageFormatFile", imageFormatFile);

		ImageFormat imageFormatBytes = Sanselan.guessFormat(imageFileBytes);
		assertTrue(imageFormatBytes != null);
		assertTrue(imageFormatBytes != ImageFormat.IMAGE_FORMAT_UNKNOWN);
		//		Debug.debug("imageFormatBytes", imageFormatBytes);

		assertTrue(imageFormatBytes == imageFormatFile);
	}

	public void checkGetICCProfileBytes(File imageFile, byte[] imageFileBytes)
			throws IOException, ImageReadException
	{
		// check guessFormat()
		byte iccBytesFile[] = Sanselan.getICCProfileBytes(imageFile);

		byte iccBytesBytes[] = Sanselan.getICCProfileBytes(imageFileBytes);

		assertTrue((iccBytesFile != null) == (iccBytesBytes != null));

		if (iccBytesFile == null)
			return;

		compareByteArrays(iccBytesFile, iccBytesBytes);
	}

	public void checkGetImageInfo(File imageFile, byte[] imageFileBytes)
			throws IOException, ImageReadException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException
	{
		// check guessFormat()
		ImageInfo imageInfoFile = Sanselan.getImageInfo(imageFile);

		ImageInfo imageInfoBytes = Sanselan.getImageInfo(imageFileBytes);

		assertTrue(imageInfoFile != null);
		assertTrue(imageInfoBytes != null);

		Method methods[] = ImageInfo.class.getMethods();
		for (int i = 0; i < methods.length; i++)
		{
			Method method = methods[i];
			method.getModifiers();
			if (!Modifier.isPublic(method.getModifiers()))
				continue;
			if (!method.getName().startsWith("get"))
				continue;
			if (method.getName().equals("getClass"))
				continue;
			if (method.getGenericParameterTypes().length > 0)
				continue;

			Object valueFile = method.invoke(imageInfoFile, null);
			Object valueBytes = method.invoke(imageInfoBytes, null);

			assertTrue(valueFile.equals(valueBytes));
		}

		// only have to test values from imageInfoFile; we already know values match.
		assertTrue(imageInfoFile.getBitsPerPixel() > 0);

		assertTrue(imageInfoFile.getFormat() != null);
		assertTrue(imageInfoFile.getFormat() != ImageFormat.IMAGE_FORMAT_UNKNOWN);

		assertTrue(imageInfoFile.getFormatName() != null);

		assertTrue(imageInfoFile.getWidth() > 0);
		assertTrue(imageInfoFile.getHeight() > 0);

		assertTrue(imageInfoFile.getMimeType() != null);

		assertTrue(imageInfoFile.getNumberOfImages() > 0);

	}
}
