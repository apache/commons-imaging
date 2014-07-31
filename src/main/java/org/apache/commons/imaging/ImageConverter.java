package org.apache.commons.imaging;

import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.apache.commons.imaging.formats.dcx.DcxImageParser;
import org.apache.commons.imaging.formats.icns.IcnsImageParser;
import org.apache.commons.imaging.formats.ico.IcoImageParser;
import org.apache.commons.imaging.formats.tiff.TiffImageParser;

/**
 * Image converter
 * 
 */
public class ImageConverter {

	/**
	 * index of the source image to use during the conversion when the
	 * destination format supports a single image per data source, ignored when
	 * an hint to compute this index dynamically is enabled
	 */
	private int sourceImageIndex;

	private boolean indexOfSmallestSourceImageComputationEnabled;

	private boolean indexOfBiggestSourceImageComputationEnabled;

	/**
	 * indicates whether several images should be computed from one source image
	 * when the destination format supports more than one image per data source.
	 * The source image is then copied and rescaled several times. Ignored when
	 * the destination format is not ICNS
	 */
	private boolean sourceImageDuplicationAndRescaleEnabled;

	public ImageConverter() {
		super();
		this.sourceImageIndex = 0;
	}

	public int getSourceImageIndex() {
		return sourceImageIndex;
	}

	public void setSourceImageIndex(final int sourceImageIndex) {
		this.sourceImageIndex = sourceImageIndex;
	}

	public boolean isIndexOfSmallestSourceImageComputationEnabled() {
		return indexOfSmallestSourceImageComputationEnabled;
	}

	public void setIndexOfSmallestSourceImageComputationEnabled(
			boolean indexOfSmallestSourceImageComputationEnabled) {
		this.indexOfSmallestSourceImageComputationEnabled = indexOfSmallestSourceImageComputationEnabled;
	}

	public boolean isIndexOfBiggestSourceImageComputationEnabled() {
		return indexOfBiggestSourceImageComputationEnabled;
	}

	public void setIndexOfBiggestSourceImageComputationEnabled(
			boolean indexOfBiggestSourceImageComputationEnabled) {
		this.indexOfBiggestSourceImageComputationEnabled = indexOfBiggestSourceImageComputationEnabled;
	}

	public boolean isSourceImageDuplicationAndRescaleEnabled() {
		return sourceImageDuplicationAndRescaleEnabled;
	}

	public void setSourceImageDuplicationAndRescaleEnabled(
			boolean sourceImageDuplicationAndRescaleEnabled) {
		this.sourceImageDuplicationAndRescaleEnabled = sourceImageDuplicationAndRescaleEnabled;
	}

	/**
	 * Converts the source image file into the format of the destination image
	 * file
	 * 
	 * @param srcFile
	 *            source image file
	 * @param dstFile
	 *            destination image file
	 * @throws IOException
	 *             In the event that the destination file cannot be (re)created
	 *             or an I/O error occurs
	 * @throws ImageReadException
	 *             In the event that the source image file cannot be read
	 * @throws ImageWriteException
	 *             In the event that the destination image file cannot be
	 *             written (for example if the destination format does not
	 *             support the size or the palette of the source image)
	 * @throws IllegalArgumentException
	 *             In the event that at least one extension is invalid, when the
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
			srcFileExt = srcFile.getName().substring(srcFileExtIndex);
		} else {
			srcFileExt = null;
		}
		final int dstFileExtIndex = dstFile.getName().lastIndexOf('.');
		final String dstFileExt;
		if (dstFileExtIndex != -1
				&& dstFileExtIndex + 1 < dstFile.getName().length()) {
			dstFileExt = dstFile.getName().substring(dstFileExtIndex);
		} else {
			dstFileExt = null;
		}

		checkExtensionsValidity(srcFileExt, dstFileExt);

		List<BufferedImage> srcImgs = Imaging.getAllBufferedImages(srcFile);
		if (dstFile.exists() && !dstFile.delete()) {
			throw new IllegalArgumentException("The destination file "
					+ dstFile.getAbsolutePath()
					+ " already exists and cannot be deleted");
		}
		dstFile.createNewFile();
		if (srcImgs != null && !srcImgs.isEmpty()) {
			BufferedOutputStream bos = null;
			try {
				bos = new BufferedOutputStream(new FileOutputStream(dstFile));
				doConvertImage(srcImgs, bos, dstFileExt);
			} finally {
				if (bos != null) {
					bos.close();
				}
			}
		}
	}

	protected void doConvertImage(final List<BufferedImage> srcImgs,
			final OutputStream os, final String dstExt)
			throws ImageWriteException, IOException, IllegalArgumentException {
		final ImageParser dstParser = getImageParser(dstExt);
		if (srcImgs.size() == 1) {
			if (supportsMultipleImagesWithinSingleDataSource(dstParser)) {
				if (sourceImageDuplicationAndRescaleEnabled
						&& dstParser.getClass() == IcnsImageParser.class) {
					BufferedImage srcImg = srcImgs.get(0);
					List<BufferedImage> altSrcImgs = new ArrayList<BufferedImage>();
					final int[] sizes = new int[]{16, 32, 48, 128};
					for (int size : sizes) {
						if (srcImg.getWidth() == size && srcImg.getHeight() == size) {
							altSrcImgs.add(srcImg);
						} else {
							BufferedImage rescaledImg = new BufferedImage(size,
									size, BufferedImage.TYPE_INT_ARGB);
							AffineTransform transform = new AffineTransform();
							transform.scale(size / (double) srcImg.getWidth(),
									size / (double) srcImg.getHeight());
							AffineTransformOp scaleOp = new AffineTransformOp(
									transform, AffineTransformOp.TYPE_BICUBIC);
							scaleOp.filter(srcImg, rescaledImg);
							altSrcImgs.add(rescaledImg);
						}
					}
					dstParser.writeImages(altSrcImgs, os, null);
				} else {
					dstParser.writeImage(srcImgs.get(0), os, null);
				}
			} else {
				dstParser.writeImage(srcImgs.get(0), os, null);
			}
		} else {
			if (supportsMultipleImagesWithinSingleDataSource(dstParser)) {
				dstParser.writeImages(srcImgs, os, null);
			} else {
				if (indexOfSmallestSourceImageComputationEnabled) {
					int indexOfSmallestSourceImage = 0;
					int areaOfSmallestSourceImage = srcImgs.get(0).getWidth()
							* srcImgs.get(0).getHeight();
					for (int srcIndex = 1; srcIndex < srcImgs.size(); srcIndex++) {
						int areaOfSourceImage = srcImgs.get(srcIndex)
								.getWidth() * srcImgs.get(srcIndex).getHeight();
						if (areaOfSourceImage < areaOfSmallestSourceImage) {
							areaOfSmallestSourceImage = areaOfSourceImage;
							indexOfSmallestSourceImage = srcIndex;
						}
					}
					dstParser.writeImage(
							srcImgs.get(indexOfSmallestSourceImage), os, null);
				} else {
					if (indexOfBiggestSourceImageComputationEnabled) {
						int indexOfBiggestSourceImage = 0;
						int areaOfBiggestSourceImage = srcImgs.get(0)
								.getWidth() * srcImgs.get(0).getHeight();
						for (int srcIndex = 1; srcIndex < srcImgs.size(); srcIndex++) {
							int areaOfSourceImage = srcImgs.get(srcIndex)
									.getWidth()
									* srcImgs.get(srcIndex).getHeight();
							if (areaOfSourceImage > areaOfBiggestSourceImage) {
								areaOfBiggestSourceImage = areaOfSourceImage;
								indexOfBiggestSourceImage = srcIndex;
							}
						}
						dstParser.writeImage(
								srcImgs.get(indexOfBiggestSourceImage), os,
								null);
					} else {
						if (sourceImageIndex < 0
								|| srcImgs.size() <= sourceImageIndex) {
							throw new IllegalArgumentException(
									"Impossible to read an image at index "
											+ sourceImageIndex);
						} else {
							dstParser.writeImage(srcImgs.get(sourceImageIndex),
									os, null);
						}
					}
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
	 *             In the event that one of them is invalid or both are two
	 *             extensions of the same format
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
	 *             In the event of an I/O error
	 * @throws ImageReadException
	 *             In the event that the source image stream cannot be read
	 * @throws ImageWriteException
	 *             In the event that the destination image stream cannot be
	 *             written (for example if the destination format does not
	 *             support the size or the palette of the source image)
	 * @throws IllegalArgumentException
	 *             In the event that at least one extension is invalid
	 */
	public void convertImage(final InputStream is, final String srcExt,
			final OutputStream os, final String dstExt) throws IOException,
			ImageReadException, ImageWriteException, IllegalArgumentException {
		checkExtensionsValidity(srcExt, dstExt);
		List<BufferedImage> srcImgs = Imaging.getAllBufferedImages(is, srcExt);
		if (srcImgs != null && !srcImgs.isEmpty()) {
			doConvertImage(srcImgs, os, dstExt);
		}
	}

	private boolean supportsMultipleImagesWithinSingleDataSource(
			final ImageParser imageParser) {
		final Class imageParserClass = imageParser.getClass();
		return /*imageParserClass == DcxImageParser.class
				|| */imageParserClass == IcnsImageParser.class/*
				|| imageParserClass == IcoImageParser.class
				|| imageParserClass == TiffImageParser.class*/;
	}

	/**
	 * Returns the image parser of the file
	 * 
	 * @param filename
	 *            image filename
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
