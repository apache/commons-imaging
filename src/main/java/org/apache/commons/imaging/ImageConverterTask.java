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
package org.apache.commons.imaging;

import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

/**
 * Ant task of image conversion
 * 
 */
public class ImageConverterTask extends Task {

	private String src;

	private String dst;

	@Override
	public void execute() throws BuildException {
		if (src == null) {
			throw new BuildException("The src attribute cannot be null");
		}
		if (dst == null) {
			throw new BuildException("The dst attribute cannot be null");
		}
		final File srcFile = new File(getProject().getBaseDir(), src);
		if (!srcFile.exists()) {
			throw new BuildException("The source file "
					+ srcFile.getAbsolutePath() + " does not exist");
		}
		final File dstFile = new File(getProject().getBaseDir(), dst);
		final int srcFileExtIndex = srcFile.getName().lastIndexOf('.');
		final String srcFileExt;
		if (srcFileExtIndex != -1
				&& srcFileExtIndex + 1 < srcFile.getName().length()) {
			srcFileExt = srcFile.getName().substring(srcFileExtIndex + 1);
		} else {
			srcFileExt = null;
		}
		if (srcFileExt == null || srcFileExt.length() == 0) {
			throw new BuildException("The source file "
					+ srcFile.getAbsolutePath() + " has no extension");
		}
		if (!Imaging.hasImageFileExtension(srcFile)) {
			throw new BuildException("The source file "
					+ srcFile.getAbsolutePath()
					+ " has no image file extension");
		}
		final int dstFileExtIndex = dstFile.getName().lastIndexOf('.');
		final String dstFileExt;
		if (dstFileExtIndex != -1
				&& dstFileExtIndex + 1 < dstFile.getName().length()) {
			dstFileExt = dstFile.getName().substring(dstFileExtIndex + 1);
		} else {
			dstFileExt = null;
		}
		if (dstFileExt == null || dstFileExt.length() == 0) {
			throw new BuildException("The destination file "
					+ dstFile.getAbsolutePath() + " has no extension");
		}
		if (!Imaging.hasImageFileExtension(dstFile.getName())) {
			throw new BuildException("The destination file "
					+ dstFile.getAbsolutePath()
					+ " has no image file extension");
		}
		final ImageParser srcParser = getImageParser(srcFile.getName());
		final ImageParser dstParser = getImageParser(dstFile.getName());
		if (srcParser.getClass() == dstParser.getClass()) {
			throw new BuildException("No conversion needed");
		}
		if (dstFile.exists() && !dstFile.delete()) {
			throw new BuildException("The destination file "
					+ dstFile.getAbsolutePath()
					+ " already exists and cannot be deleted");
		}
		try {
			dstFile.createNewFile();
		} catch (IOException e) {
			throw new BuildException("The destination file "
					+ dstFile.getAbsolutePath() + " cannot be created");
		}
		BufferedImage srcImg = null;
		try {
			srcImg = Imaging.getBufferedImage(srcFile);
		} catch (ImageReadException e) {
			throw new BuildException("The source image cannot be read", e);
		} catch (IOException e) {
			throw new BuildException("The source image cannot be read", e);
		}
		if (srcImg != null) {
			BufferedOutputStream bos = null;
			try {
				bos = new BufferedOutputStream(new FileOutputStream(dstFile));
				dstParser.writeImage(srcImg, bos, null);
			} catch (ImageWriteException e) {
				throw new BuildException(
						"The destination image cannot be written", e);
			} catch (FileNotFoundException e) {
				throw new BuildException(
						"The destination image cannot be written", e);
			} catch (IOException e) {
				throw new BuildException(
						"The destination image cannot be written", e);
			} finally {
				try {
					if (bos != null) {
						bos.close();
					}
				} catch (IOException e) {
				}
			}
		}
	}

	private ImageParser getImageParser(String filename) {
		if (filename == null) {
			return null;
		}

		filename = filename.toLowerCase(Locale.ENGLISH);

		final ImageParser[] imageParsers = ImageParser.getAllImageParsers();
		for (final ImageParser imageParser : imageParsers) {
			final String[] exts = imageParser.getAcceptedExtensions();

			for (final String ext : exts) {
				if (filename.endsWith(ext.toLowerCase(Locale.ENGLISH))) {
					return imageParser;
				}
			}
		}

		return null;
	}

	public void setDst(String dst) {
		this.dst = dst;
	}

	public void setSrc(String src) {
		this.src = src;
	}
}
