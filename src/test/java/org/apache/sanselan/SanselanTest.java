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

package org.apache.sanselan;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.apache.sanselan.test.util.FSTraversal;
import org.apache.sanselan.util.Debug;

public abstract class SanselanTest extends TestCase implements
		SanselanConstants
{

	protected File createTempFile(String prefix, String suffix)
			throws IOException
	{
		File tempFolder = new File("tmp");
		if (!tempFolder.exists())
			tempFolder.mkdirs();
		assertTrue(tempFolder.isDirectory());

		File result = File.createTempFile(prefix, suffix, tempFolder);
		result.deleteOnExit();
		return result;
	}

	public void compareByteArrays(byte a[], byte b[])
	{
		assertTrue(a.length == b.length);
		for (int i = 0; i < b.length; i++)
			assertTrue(b[i] == a[i]);
	}

	protected void purgeMemory()
	{
		try
		{
			System.gc();
			Thread.sleep(50);
			System.runFinalization();
			Thread.sleep(50);
		} catch (Exception e)
		{
			Debug.debug(e);
		}
	}

	private static final File PHIL_HARVEY_TEST_IMAGE_FOLDER = new File(
			"src\\test\\data\\images\\exif\\philHarvey\\");

	protected boolean isPhilHarveyTestImage(File file)
	{
		// Debug.debug("isPhilHarveyTestImage file", file.getAbsolutePath());
		// Debug.debug("isPhilHarveyTestImage folder",
		// PHIL_HARVEY_TEST_IMAGE_FOLDER.getAbsolutePath());
		return file.getAbsolutePath().startsWith(
				PHIL_HARVEY_TEST_IMAGE_FOLDER.getAbsolutePath());
	}

	public static interface ImageFilter
	{
		public boolean accept(File file) throws IOException, ImageReadException;
	}

	protected File getTestImage() throws IOException, ImageReadException
	{
		return getTestImage(null);
	}

	protected File getTestImage(ImageFilter filter) throws IOException,
			ImageReadException
	{
		List images = getTestImages(filter, 1);

		assertTrue(images.size() > 0);

		return (File) images.get(0);
	}

	protected List getTestImages() throws IOException, ImageReadException
	{
		return getTestImages(null, -1);
	}

	protected List getTestImages(ImageFilter filter) throws IOException,
			ImageReadException
	{
		return getTestImages(filter, -1);
	}

	protected List getTestImages(final ImageFilter filter, final int max)
			throws IOException, ImageReadException
	{

		File srcFolder = new File("src");
		File testFolder = new File(srcFolder, "test");
		File dataFolder = new File(testFolder, "data");
		File imagesFolder = new File(dataFolder, "images");

//		 imagesFolder = new File(imagesFolder, "ignore\\PngSuite\\BGYN6A16.PNG");
		// imagesFolder = new File(imagesFolder, "jpg\\3");
		// imagesFolder = new File(imagesFolder, "");
		// imagesFolder = new File(imagesFolder,
		// "exif\\philHarvey\\Nokia\\Nokia5500.jpg");
//		imagesFolder = new File(imagesFolder, "png\\2\\");
		// imagesFolder = new File(imagesFolder,
		// "exif\\drewNoakes\\007_FujiFilm FinePixS1Pro (5).jpg");
		// src\\test\\data\\images\\exif\\drewNoakes\\007_Nikon D1X.jpg
		// src\\test\\data\\images\\exif\\drewNoakes\\007_FujiFilm FinePixS1Pro
		// (5).jpg

		assertTrue(imagesFolder.exists());

		Debug.debug("imagesFolder", imagesFolder);

		final List images = new ArrayList();

		FSTraversal.Visitor visitor = new FSTraversal.Visitor() {
			long counter = 0;

			public boolean visit(File file, double progressEstimate)
			{

				if (!Sanselan.hasImageFileExtension(file))
					return true;

				if (counter++ % 10 == 0)
					Debug.purgeMemory();

				try
				{
					if (filter != null && !filter.accept(file))
						return true;
				} catch (Exception e)
				{
					Debug.debug(e);
					return false;
				}

				images.add(file);

				if (max < 1)
					return true;
				return images.size() < max;
			}
		};
		new FSTraversal().traverseFiles(imagesFolder, visitor);

		List filtered = new ArrayList();
		// long last = System.currentTimeMillis();
		for (int i = 0; i < images.size(); i++)
		{
			// if (i % 10 == 0)
			// Debug.purgeMemory();

			File file = (File) images.get(i);
			// Debug.debug("considering file", file.getAbsoluteFile());

			if (file.getParentFile().getName().toLowerCase().equals("@broken"))
				continue;
			filtered.add(file);
		}

		assertTrue(filtered.size() > 0);

		return filtered;
	}
}
