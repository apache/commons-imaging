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
		SanselanTestConstants, SanselanConstants {

	protected File createTempFile(String prefix, String suffix)
			throws IOException {
		File tempFolder = new File("tmp");
		if (!tempFolder.exists())
			tempFolder.mkdirs();
		assertTrue(tempFolder.isDirectory());

		File result = File.createTempFile(prefix, suffix, tempFolder);
		result.deleteOnExit();
		return result;
	}

	public void compareByteArrays(byte a[], byte b[]) {
		assertTrue(a.length == b.length);
		for (int i = 0; i < b.length; i++)
			assertTrue(b[i] == a[i]);
	}

	protected void purgeMemory() {
		try {
			System.gc();
			Thread.sleep(50);
			System.runFinalization();
			Thread.sleep(50);
		} catch (Exception e) {
			Debug.debug(e);
		}
	}

	protected boolean isPhilHarveyTestImage(File file) {
		// Debug.debug("isPhilHarveyTestImage file", file.getAbsolutePath());
		// Debug.debug("isPhilHarveyTestImage folder",
		// PHIL_HARVEY_TEST_IMAGE_FOLDER.getAbsolutePath());
		return file.getAbsolutePath().startsWith(
				PHIL_HARVEY_TEST_IMAGE_FOLDER.getAbsolutePath());
	}

	public static interface ImageFilter {
		public boolean accept(File file) throws IOException, ImageReadException;
	}

	protected File getTestImage() throws IOException, ImageReadException {
		return getTestImage(null);
	}

	protected File getTestImageByName(final String filename) 
			throws IOException, ImageReadException {
		return getTestImage(new ImageFilter() {
			public boolean accept(File file) throws IOException, ImageReadException {
				return file.getName().equals(filename);
			}
		});
	}

	protected File getTestImage(ImageFilter filter) throws IOException,
			ImageReadException {
		List images = getTestImages(filter, 1);

		assertTrue(images.size() > 0);

		return (File) images.get(0);
	}

	protected List getTestImages() throws IOException, ImageReadException {
		return getTestImages(null, -1);
	}

	protected List getTestImages(ImageFilter filter) throws IOException,
			ImageReadException {
		return getTestImages(filter, -1);
	}

	private static final List ALL_IMAGES = new ArrayList();

	static {
		File imagesFolder = TEST_IMAGE_FOLDER;

		// imagesFolder = new File(
		// "C:\\personal\\apache\\sanselan\\src\\test\\data\\images\\bmp\\2");

		imagesFolder = imagesFolder.getAbsoluteFile();

		Debug.debug("imagesFolder", imagesFolder);
		assertTrue(imagesFolder.exists());

		FSTraversal.Visitor visitor = new FSTraversal.Visitor() {

			public boolean visit(File file, double progressEstimate) {
				if (!Sanselan.hasImageFileExtension(file))
					return true;
				ALL_IMAGES.add(file);
				return true;
			}
		};
		new FSTraversal().traverseFiles(imagesFolder, visitor);
	}

	protected List getTestImages(final ImageFilter filter, final int max)
			throws IOException, ImageReadException {
		final List images = new ArrayList();
		int counter = 0;

		for (int i = 0; i < ALL_IMAGES.size(); i++) {
			File file = (File) ALL_IMAGES.get(i);

			if (!Sanselan.hasImageFileExtension(file))
				continue;

			if (counter++ % 10 == 0)
				Debug.purgeMemory();

			if (file.getParentFile().getName().toLowerCase().equals("@broken"))
				continue;

			if (filter != null && !filter.accept(file))
				continue;

			images.add(file);

			if (max > 0 && images.size() >= max)
				break;
		}

		assertTrue(images.size() > 0);

		return images;
	}

	protected boolean isInvalidPNGTestFile(File file) {
		return (file.getParentFile().getName().equalsIgnoreCase("pngsuite") && file
				.getName().toLowerCase().startsWith("x"));
	}
}
