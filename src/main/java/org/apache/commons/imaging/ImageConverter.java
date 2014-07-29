package org.apache.commons.imaging;

import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;

/**
 * Image converter
 * 
 */
public class ImageConverter {

	/**
	 * Converts the source image file into the format of the destination image
	 * file
	 * 
	 * @param srcFile
	 *            source image file
	 * @param dstFile
	 *            destination image file
	 * @throws IOException
	 *             thrown when the destination file cannot be (re)created or an
	 *             I/O error occurs
	 * @throws ImageReadException
	 *             thrown when the source image file cannot be read
	 * @throws ImageWriteException
	 *             thrown when the destination image file cannot be written (for
	 *             example if the destination format does not support the size
	 *             or the palette of the source image)
	 * @throws IllegalArgumentException
	 *             thrown when at least one extension is invalid, when the
	 *             source file does not exist
	 */
	public void convertImage(final File srcFile, final File dstFile)
			throws IOException, ImageReadException, ImageWriteException,
			IllegalArgumentException {
		if (!srcFile.exists()) {
			throw new IllegalArgumentException("The source file "
					+ srcFile.getAbsolutePath() + " does not exist");
		}
		final int srcFileExtIndex = srcFile.getName().lastIndexOf('.');
		final String srcFileExt;
		if (srcFileExtIndex != -1
				&& srcFileExtIndex + 1 < srcFile.getName().length()) {
			srcFileExt = srcFile.getName().substring(srcFileExtIndex + 1);
		} else {
			srcFileExt = null;
		}
		final int dstFileExtIndex = dstFile.getName().lastIndexOf('.');
		final String dstFileExt;
		if (dstFileExtIndex != -1
				&& dstFileExtIndex + 1 < dstFile.getName().length()) {
			dstFileExt = dstFile.getName().substring(dstFileExtIndex + 1);
		} else {
			dstFileExt = null;
		}

		checkExtensionsValidity(srcFileExt, dstFileExt);

		BufferedImage srcImg = Imaging.getBufferedImage(srcFile);
		if (dstFile.exists() && !dstFile.delete()) {
			throw new IllegalArgumentException("The destination file "
					+ dstFile.getAbsolutePath()
					+ " already exists and cannot be deleted");
		}
		dstFile.createNewFile();
		if (srcImg != null) {
			BufferedOutputStream bos = null;
			try {
				bos = new BufferedOutputStream(new FileOutputStream(dstFile));
				final ImageParser dstParser = getImageParser(dstFileExt);
				dstParser.writeImage(srcImg, bos, null);
			} finally {
				if (bos != null) {
					bos.close();
				}
			}
		}
	}

	/**
	 * Checks whether the extension of the source and the extension of the
	 * destination are valid and distinct
	 * 
	 * @param srcExt
	 *            extension of the source
	 * @param dstExt
	 *            extension of the destination
	 * @throws IllegalArgumentException
	 *             thrown when one of them is invalid or both are two extensions
	 *             of the same format
	 */
	protected void checkExtensionsValidity(final String srcExt,
			final String dstExt) throws IllegalArgumentException {
		if (srcExt == null || srcExt.length() == 0) {
			throw new IllegalArgumentException("The source has no extension");
		}
		if (!Imaging.hasImageFileExtension(srcExt)) {
			throw new IllegalArgumentException(srcExt
					+ " is not an image file extension");
		}
		if (dstExt == null || dstExt.length() == 0) {
			throw new IllegalArgumentException(
					"The destination has no extension");
		}
		if (!Imaging.hasImageFileExtension(dstExt)) {
			throw new IllegalArgumentException(dstExt
					+ " is not an image file extension");
		}
		final ImageParser srcParser = getImageParser(srcExt);
		final ImageParser dstParser = getImageParser(dstExt);
		if (srcParser.getClass() == dstParser.getClass()) {
			throw new IllegalArgumentException("No conversion needed");
		}
	}

	/**
	 * Converts the source image stream into the format of the destination image
	 * stream
	 * 
	 * @param is
	 *            source image stream
	 * @param srcExt
	 *            extension of the source image
	 * @param os
	 *            destination image stream
	 * @param dstExt
	 *            extension of the destination image
	 * @throws IOException
	 *             thrown when an I/O error occurs
	 * @throws ImageReadException
	 *             thrown when the source image stream cannot be read
	 * @throws ImageWriteException
	 *             thrown when the destination image stream cannot be written
	 *             (for example if the destination format does not support the
	 *             size or the palette of the source image)
	 * @throws IllegalArgumentException
	 *             thrown when at least one extension is invalid
	 */
	public void convertImage(final InputStream is, final String srcExt,
			final OutputStream os, final String dstExt) throws IOException,
			ImageReadException, ImageWriteException, IllegalArgumentException {
		checkExtensionsValidity(srcExt, dstExt);
		BufferedImage srcImg = Imaging.getBufferedImage(is);
		final ImageParser dstParser = getImageParser(dstExt);
		dstParser.writeImage(srcImg, os, null);
	}

	/**
	 * Returns the image parser of the file
	 * 
	 * @param filename image filename
	 * @return image parser of the image if any, otherwise <code>null</code>
	 */
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
}
