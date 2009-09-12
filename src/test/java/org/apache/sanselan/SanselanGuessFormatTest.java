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

import org.apache.sanselan.util.Debug;

public class SanselanGuessFormatTest extends SanselanTest {

	public static final File BMP_IMAGE_FILE = new File(TEST_IMAGE_FOLDER,
			"bmp\\1\\Oregon Scientific DS6639 - DSC_0307 - small.bmp".replace(
					"\\", System.getProperty("file.separator")));
	public static final File PNG_IMAGE_FILE = new File(TEST_IMAGE_FOLDER,
			"png\\1\\Oregon Scientific DS6639 - DSC_0307 - small.png".replace(
					"\\", System.getProperty("file.separator")));
	public static final File GIF_IMAGE_FILE = new File(TEST_IMAGE_FOLDER,
			"gif\\1\\Oregon Scientific DS6639 - DSC_0307 - small.gif".replace(
					"\\", System.getProperty("file.separator")));
	public static final File ICO_IMAGE_FILE = new File(TEST_IMAGE_FOLDER,
			"ico\\1\\Oregon Scientific DS6639 - DSC_0307 - small.ico".replace(
					"\\", System.getProperty("file.separator")));
	public static final File TIFF_IMAGE_FILE = new File(TEST_IMAGE_FOLDER,
			"tiff\\1\\Oregon Scientific DS6639 - DSC_0307 - small.tif".replace(
					"\\", System.getProperty("file.separator")));
	public static final File JPEG_IMAGE_FILE = new File(TEST_IMAGE_FOLDER,
			"jpg\\1\\Oregon Scientific DS6639 - DSC_0307 - small.jpg".replace(
					"\\", System.getProperty("file.separator")));
	public static final File PSD_IMAGE_FILE = new File(TEST_IMAGE_FOLDER,
			"psd\\1\\Oregon Scientific DS6639 - DSC_0307 - small.psd".replace(
					"\\", System.getProperty("file.separator")));
	public static final File PBM_IMAGE_FILE = new File(TEST_IMAGE_FOLDER,
			"pxm\\1\\Oregon Scientific DS6639 - DSC_0307 - small.pbm".replace(
					"\\", System.getProperty("file.separator")));
	public static final File PGM_IMAGE_FILE = new File(TEST_IMAGE_FOLDER,
			"pxm\\1\\Oregon Scientific DS6639 - DSC_0307 - small.pgm".replace(
					"\\", System.getProperty("file.separator")));
	public static final File PPM_IMAGE_FILE = new File(TEST_IMAGE_FOLDER,
			"pxm\\1\\Oregon Scientific DS6639 - DSC_0307 - small.ppm".replace(
					"\\", System.getProperty("file.separator")));
	public static final File TGA_IMAGE_FILE = new File(TEST_IMAGE_FOLDER,
			"tga\\1\\Oregon Scientific DS6639 - DSC_0307 - small.tga".replace(
					"\\", System.getProperty("file.separator")));

	public void testGuess_all() throws IOException, ImageReadException,
			ImageWriteException {
		testGuess(ImageFormat.IMAGE_FORMAT_PNG, PNG_IMAGE_FILE);
		testGuess(ImageFormat.IMAGE_FORMAT_GIF, GIF_IMAGE_FILE);
		// TODO(cmchen): add ability to sniff ICOs if possible.
		// testGuess(ImageFormat.IMAGE_FORMAT_ICO, ICO_IMAGE_FILE);
		testGuess(ImageFormat.IMAGE_FORMAT_TIFF, TIFF_IMAGE_FILE);
		testGuess(ImageFormat.IMAGE_FORMAT_JPEG, JPEG_IMAGE_FILE);
		testGuess(ImageFormat.IMAGE_FORMAT_BMP, BMP_IMAGE_FILE);
		testGuess(ImageFormat.IMAGE_FORMAT_PSD, PSD_IMAGE_FILE);
		testGuess(ImageFormat.IMAGE_FORMAT_PBM, PBM_IMAGE_FILE);
		testGuess(ImageFormat.IMAGE_FORMAT_PGM, PGM_IMAGE_FILE);
		testGuess(ImageFormat.IMAGE_FORMAT_PPM, PPM_IMAGE_FILE);
		// TODO(cmchen): add ability to sniff TGAs if possible.
		// testGuess(ImageFormat.IMAGE_FORMAT_TGA, TGA_IMAGE_FILE);
		// TODO(cmchen): Add test images for these formats.
		// testGuess(ImageFormat.IMAGE_FORMAT_PNM, PNM_IMAGE_FILE);
		// testGuess(ImageFormat.IMAGE_FORMAT_JBIG2, JBIG2_IMAGE_FILE);
	}

	public static final File UNKNOWN_IMAGE_FILE = new File(TEST_IMAGE_FOLDER,
			"jpg\\1\\info.txt".replace("\\", System
					.getProperty("file.separator")));

	public void testGuess_unknown() throws IOException, ImageReadException,
			ImageWriteException {
		testGuess(ImageFormat.IMAGE_FORMAT_UNKNOWN, UNKNOWN_IMAGE_FILE);
	}

	public void testGuess(ImageFormat expectedFormat, File imageFile)
			throws IOException, ImageReadException, ImageWriteException {
		assertTrue(imageFile.exists());
		assertTrue(imageFile.isFile());
		ImageFormat guessedFormat = Sanselan.guessFormat(imageFile);
		assertNotNull(guessedFormat);
		assertEquals(guessedFormat, expectedFormat);
	}
}
