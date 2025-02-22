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
package org.apache.commons.imaging.formats.tiff;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.imaging.AbstractImageParser;
import org.apache.commons.imaging.FormatCompliance;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.common.Allocator;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.XmpEmbeddable;
import org.apache.commons.imaging.common.XmpImagingParameters;
import org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement;
import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCmyk;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterLogLuv;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterPalette;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterRgb;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterYCbCr;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy;

/**
 * Implements methods for reading and writing TIFF files. Instances of this class are invoked from the general Imaging class. Applications that require the use
 * of TIFF-specific features may instantiate and access this class directly.
 */
public class TiffImageParser extends AbstractImageParser<TiffImagingParameters> implements XmpEmbeddable<TiffImagingParameters> {

    private static final String DEFAULT_EXTENSION = ImageFormats.TIFF.getDefaultExtension();
    private static final String[] ACCEPTED_EXTENSIONS = ImageFormats.TIFF.getExtensions();

    /**
     * Constructs a new instance with the big-endian byte order.
     */
    public TiffImageParser() {
        // empty
    }

    private Rectangle checkForSubImage(final TiffImagingParameters params) {
        // the params class enforces a correct specification for the
        // sub-image, but does not have knowledge of the actual
        // dimensions of the image that is being read. This method
        // returns the sub-image specification, if any, and leaves
        // further tests to the calling module.
        if (params != null && params.isSubImageSet()) {
            final int ix0 = params.getSubImageX();
            final int iy0 = params.getSubImageY();
            final int iwidth = params.getSubImageWidth();
            final int iheight = params.getSubImageHeight();
            return new Rectangle(ix0, iy0, iwidth, iheight);
        }
        return null;
    }

    public List<byte[]> collectRawImageData(final ByteSource byteSource, final TiffImagingParameters params) throws ImagingException, IOException {
        final FormatCompliance formatCompliance = FormatCompliance.getDefault();
        final TiffContents contents = new TiffReader(params != null && params.isStrict()).readDirectories(byteSource, true, formatCompliance);

        final List<byte[]> result = new ArrayList<>();
        for (int i = 0; i < contents.directories.size(); i++) {
            final TiffDirectory directory = contents.directories.get(i);
            final List<ImageDataElement> dataElements = directory.getTiffRawImageDataElements();
            for (final ImageDataElement element : dataElements) {
                final byte[] bytes = byteSource.getByteArray(element.offset, element.length);
                result.add(bytes);
            }
        }
        return result;
    }

    @Override
    public boolean dumpImageFile(final PrintWriter pw, final ByteSource byteSource) throws ImagingException, IOException {
        try {
            pw.println("tiff.dumpImageFile");

            {
                final ImageInfo imageData = getImageInfo(byteSource);
                if (imageData == null) {
                    return false;
                }

                imageData.toString(pw, "");
            }

            pw.println("");

            // try
            {
                final FormatCompliance formatCompliance = FormatCompliance.getDefault();
                final TiffImagingParameters params = new TiffImagingParameters();
                final TiffContents contents = new TiffReader(true).readContents(byteSource, params, formatCompliance);

                final List<TiffDirectory> directories = contents.directories;
                if (directories == null) {
                    return false;
                }

                for (int d = 0; d < directories.size(); d++) {
                    final TiffDirectory directory = directories.get(d);

                    // Debug.debug("directory offset", directory.offset);

                    for (final TiffField field : directory) {
                        field.dump(pw, Integer.toString(d));
                    }
                }

                pw.println("");
            }
            // catch (Exception e)
            // {
            // Debug.debug(e);
            // pw.println("");
            // return false;
            // }

            return true;
        } finally {
            pw.println("");
        }
    }

    @Override
    protected String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS;
    }

    @Override
    protected ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[] { ImageFormats.TIFF, //
        };
    }

    @Override
    public List<BufferedImage> getAllBufferedImages(final ByteSource byteSource) throws ImagingException, IOException {
        final FormatCompliance formatCompliance = FormatCompliance.getDefault();
        final TiffReader tiffReader = new TiffReader(true);
        final TiffContents contents = tiffReader.readDirectories(byteSource, true, formatCompliance);
        final List<BufferedImage> results = new ArrayList<>();
        for (int i = 0; i < contents.directories.size(); i++) {
            final TiffDirectory directory = contents.directories.get(i);
            final BufferedImage result = directory.getTiffImage(tiffReader.getByteOrder(), null);
            if (result != null) {
                results.add(result);
            }
        }
        return results;
    }

    /**
     * <p>
     * Gets a buffered image specified by the byte source. The TiffImageParser class features support for a number of options that are unique to the TIFF
     * format. These options can be specified by supplying the appropriate parameters using the keys from the TiffConstants class and the params argument for
     * this method.
     * </p>
     *
     * <p>
     * <strong>Loading Partial Images</strong>
     * </p>
     *
     * <p>
     * The TIFF parser includes support for loading partial images without committing significantly more memory resources than are necessary to store the image.
     * This feature is useful for conserving memory in applications that require a relatively small sub image from a very large TIFF file. The specifications
     * for partial images are as follows:
     * </p>
     *
     * <pre>
     * TiffImagingParameters params = new TiffImagingParameters();
     * params.setSubImageX(x);
     * params.setSubImageY(y);
     * params.setSubImageWidth(width);
     * params.setSubImageHeight(height);
     * </pre>
     *
     * <p>
     * Note that the arguments x, y, width, and height must specify a valid rectangular region that is fully contained within the source TIFF image.
     * </p>
     *
     * @param byteSource A valid instance of ByteSource
     * @param params     Optional instructions for special-handling or interpretation of the input data (null objects are permitted and must be supported by
     *                   implementations).
     * @return A valid instance of BufferedImage.
     * @throws ImagingException In the event that the specified content does not conform to the format of the specific parser implementation.
     * @throws IOException      In the event of unsuccessful read or access operation.
     */
    @Override
    public BufferedImage getBufferedImage(final ByteSource byteSource, TiffImagingParameters params) throws ImagingException, IOException {
        if (params == null) {
            params = new TiffImagingParameters();
        }
        final FormatCompliance formatCompliance = FormatCompliance.getDefault();
        final TiffReader reader = new TiffReader(params.isStrict());
        final TiffContents contents = reader.readFirstDirectory(byteSource, true, formatCompliance);
        final ByteOrder byteOrder = reader.getByteOrder();
        final TiffDirectory directory = contents.directories.get(0);
        final BufferedImage result = directory.getTiffImage(byteOrder, params);
        if (null == result) {
            throw new ImagingException("TIFF does not contain an image.");
        }
        return result;
    }

    protected BufferedImage getBufferedImage(final TiffDirectory directory, final ByteOrder byteOrder, final TiffImagingParameters params)
            throws ImagingException, IOException {
        final short compressionFieldValue;
        if (directory.findField(TiffTagConstants.TIFF_TAG_COMPRESSION) != null) {
            compressionFieldValue = directory.getFieldValue(TiffTagConstants.TIFF_TAG_COMPRESSION);
        } else {
            compressionFieldValue = TiffConstants.COMPRESSION_UNCOMPRESSED_1;
        }
        final int compression = 0xffff & compressionFieldValue;
        final int width = directory.getSingleFieldValue(TiffTagConstants.TIFF_TAG_IMAGE_WIDTH);
        final int height = directory.getSingleFieldValue(TiffTagConstants.TIFF_TAG_IMAGE_LENGTH);

        final Rectangle subImage = checkForSubImage(params);
        if (subImage != null) {
            // Check for valid subimage specification. The following checks
            // are consistent with BufferedImage.getSubimage()
            if (subImage.width <= 0) {
                throw new ImagingException("Negative or zero subimage width.");
            }
            if (subImage.height <= 0) {
                throw new ImagingException("Negative or zero subimage height.");
            }
            if (subImage.x < 0 || subImage.x >= width) {
                throw new ImagingException("Subimage x is outside raster.");
            }
            if (subImage.x + subImage.width > width) {
                throw new ImagingException("Subimage (x+width) is outside raster.");
            }
            if (subImage.y < 0 || subImage.y >= height) {
                throw new ImagingException("Subimage y is outside raster.");
            }
            if (subImage.y + subImage.height > height) {
                throw new ImagingException("Subimage (y+height) is outside raster.");
            }
        }

        int samplesPerPixel = 1;
        final TiffField samplesPerPixelField = directory.findField(TiffTagConstants.TIFF_TAG_SAMPLES_PER_PIXEL);
        if (samplesPerPixelField != null) {
            samplesPerPixel = samplesPerPixelField.getIntValue();
        }
        int[] bitsPerSample = { 1 };
        int bitsPerPixel = samplesPerPixel;
        final TiffField bitsPerSampleField = directory.findField(TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE);
        if (bitsPerSampleField != null) {
            bitsPerSample = bitsPerSampleField.getIntArrayValue();
            bitsPerPixel = bitsPerSampleField.getIntValueOrArraySum();
        }

        // int bitsPerPixel = getTagAsValueOrArraySum(entries,
        // TIFF_TAG_BITS_PER_SAMPLE);

        int predictor = -1;
        {
            // dumpOptionalNumberTag(entries, TIFF_TAG_FILL_ORDER);
            // dumpOptionalNumberTag(entries, TIFF_TAG_FREE_BYTE_COUNTS);
            // dumpOptionalNumberTag(entries, TIFF_TAG_FREE_OFFSETS);
            // dumpOptionalNumberTag(entries, TIFF_TAG_ORIENTATION);
            // dumpOptionalNumberTag(entries, TIFF_TAG_PLANAR_CONFIGURATION);
            final TiffField predictorField = directory.findField(TiffTagConstants.TIFF_TAG_PREDICTOR);
            if (null != predictorField) {
                predictor = predictorField.getIntValueOrArraySum();
            }
        }

        if (samplesPerPixel != bitsPerSample.length) {
            throw new ImagingException("Tiff: samplesPerPixel (" + samplesPerPixel + ")!=fBitsPerSample.length (" + bitsPerSample.length + ")");
        }

        final int photometricInterpretation = 0xffff & directory.getFieldValue(TiffTagConstants.TIFF_TAG_PHOTOMETRIC_INTERPRETATION);

        boolean hasAlpha = false;
        boolean isAlphaPremultiplied = false;
        if (photometricInterpretation == TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_RGB && samplesPerPixel == 4) {
            final TiffField extraSamplesField = directory.findField(TiffTagConstants.TIFF_TAG_EXTRA_SAMPLES);
            if (extraSamplesField == null) {
                // this state is not defined in the TIFF specification
                // and so this code will interpret it as meaning that the
                // proper handling would be ARGB.
                hasAlpha = true;
                isAlphaPremultiplied = false;
            } else {
                final int extraSamplesValue = extraSamplesField.getIntValue();
                switch (extraSamplesValue) {
                case TiffTagConstants.EXTRA_SAMPLE_UNASSOCIATED_ALPHA:
                    hasAlpha = true;
                    isAlphaPremultiplied = false;
                    break;
                case TiffTagConstants.EXTRA_SAMPLE_ASSOCIATED_ALPHA:
                    hasAlpha = true;
                    isAlphaPremultiplied = true;
                    break;
                case 0:
                default:
                    hasAlpha = false;
                    isAlphaPremultiplied = false;
                    break;
                }
            }
        }

        PhotometricInterpreter photometricInterpreter = params == null ? null : params.getCustomPhotometricInterpreter();
        if (photometricInterpreter == null) {
            photometricInterpreter = getPhotometricInterpreter(directory, photometricInterpretation, bitsPerPixel, bitsPerSample, predictor, samplesPerPixel,
                    width, height);
        }

        // Obtain the planar configuration
        final TiffField pcField = directory.findField(TiffTagConstants.TIFF_TAG_PLANAR_CONFIGURATION);
        final TiffPlanarConfiguration planarConfiguration = pcField == null ? TiffPlanarConfiguration.CHUNKY
                : TiffPlanarConfiguration.lenientValueOf(pcField.getIntValue());

        if (planarConfiguration == TiffPlanarConfiguration.PLANAR) {
            // currently, we support the non-interleaved (non-chunky)
            // option only in the case of a 24-bit RBG photometric interpreter
            // and for strips (not for tiles).
            if (photometricInterpretation != TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_RGB || bitsPerPixel != 24) {
                throw new ImagingException("For planar configuration 2, only 24 bit RGB is currently supported");
            }
            if (null == directory.findField(TiffTagConstants.TIFF_TAG_STRIP_OFFSETS)) {
                throw new ImagingException("For planar configuration 2, only strips-organization is supported");
            }
        }

        final AbstractTiffImageData imageData = directory.getTiffImageData();

        final ImageDataReader dataReader = imageData.getDataReader(directory, photometricInterpreter, bitsPerPixel, bitsPerSample, predictor, samplesPerPixel,
                width, height, compression, planarConfiguration, byteOrder);

        final ImageBuilder iBuilder = dataReader.readImageData(subImage, hasAlpha, isAlphaPremultiplied);
        return iBuilder.getBufferedImage();
    }

    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Override
    public TiffImagingParameters getDefaultParameters() {
        return new TiffImagingParameters();
    }

    @Override
    public FormatCompliance getFormatCompliance(final ByteSource byteSource) throws ImagingException, IOException {
        final FormatCompliance formatCompliance = FormatCompliance.getDefault();
        final TiffImagingParameters params = new TiffImagingParameters();
        new TiffReader(params.isStrict()).readContents(byteSource, params, formatCompliance);
        return formatCompliance;
    }

    @Override
    public byte[] getIccProfileBytes(final ByteSource byteSource, final TiffImagingParameters params) throws ImagingException, IOException {
        final FormatCompliance formatCompliance = FormatCompliance.getDefault();
        final TiffContents contents = new TiffReader(params != null && params.isStrict()).readFirstDirectory(byteSource, false, formatCompliance);
        final TiffDirectory directory = contents.directories.get(0);

        return directory.getFieldValue(TiffEpTagConstants.EXIF_TAG_INTER_COLOR_PROFILE, false);
    }

    @Override
    public ImageInfo getImageInfo(final ByteSource byteSource, final TiffImagingParameters params) throws ImagingException, IOException {
        final FormatCompliance formatCompliance = FormatCompliance.getDefault();
        final TiffContents contents = new TiffReader(params != null && params.isStrict()).readDirectories(byteSource, false, formatCompliance);
        final TiffDirectory directory = contents.directories.get(0);

        final TiffField widthField = directory.findField(TiffTagConstants.TIFF_TAG_IMAGE_WIDTH, true);
        final TiffField heightField = directory.findField(TiffTagConstants.TIFF_TAG_IMAGE_LENGTH, true);

        if (widthField == null || heightField == null) {
            throw new ImagingException("TIFF image missing size info.");
        }

        final int height = heightField.getIntValue();
        final int width = widthField.getIntValue();

        final TiffField resolutionUnitField = directory.findField(TiffTagConstants.TIFF_TAG_RESOLUTION_UNIT);
        int resolutionUnit = 2; // Inch
        if (resolutionUnitField != null && resolutionUnitField.getValue() != null) {
            resolutionUnit = resolutionUnitField.getIntValue();
        }

        double unitsPerInch = -1;
        switch (resolutionUnit) {
        case 1:
            break;
        case 2: // Inch
            unitsPerInch = 1.0;
            break;
        case 3: // Centimeter
            unitsPerInch = 2.54;
            break;
        default:
            break;

        }

        int physicalWidthDpi = -1;
        float physicalWidthInch = -1;
        int physicalHeightDpi = -1;
        float physicalHeightInch = -1;

        if (unitsPerInch > 0) {
            final TiffField xResolutionField = directory.findField(TiffTagConstants.TIFF_TAG_XRESOLUTION);
            final TiffField yResolutionField = directory.findField(TiffTagConstants.TIFF_TAG_YRESOLUTION);

            if (xResolutionField != null && xResolutionField.getValue() != null) {
                final double xResolutionPixelsPerUnit = xResolutionField.getDoubleValue();
                physicalWidthDpi = (int) Math.round(xResolutionPixelsPerUnit * unitsPerInch);
                physicalWidthInch = (float) (width / (xResolutionPixelsPerUnit * unitsPerInch));
            }
            if (yResolutionField != null && yResolutionField.getValue() != null) {
                final double yResolutionPixelsPerUnit = yResolutionField.getDoubleValue();
                physicalHeightDpi = (int) Math.round(yResolutionPixelsPerUnit * unitsPerInch);
                physicalHeightInch = (float) (height / (yResolutionPixelsPerUnit * unitsPerInch));
            }
        }

        final TiffField bitsPerSampleField = directory.findField(TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE);

        int bitsPerSample = 1;
        if (bitsPerSampleField != null && bitsPerSampleField.getValue() != null) {
            bitsPerSample = bitsPerSampleField.getIntValueOrArraySum();
        }

        final int bitsPerPixel = bitsPerSample; // assume grayscale;
        // dunno if this handles colormapped images correctly.

        final List<String> comments = Allocator.arrayList(directory.size());
        for (final TiffField field : directory) {
            final String comment = field.toString();
            comments.add(comment);
        }

        final ImageFormat format = ImageFormats.TIFF;
        final String formatName = "TIFF Tag-based Image File Format";
        final String mimeType = "image/tiff";
        final int numberOfImages = contents.directories.size();
        // not accurate ... only reflects first
        final boolean progressive = false;
        // is TIFF ever interlaced/progressive?

        final String formatDetails = "TIFF v." + contents.header.tiffVersion;

        boolean transparent = false; // TODO: wrong
        boolean usesPalette = false;
        final TiffField colorMapField = directory.findField(TiffTagConstants.TIFF_TAG_COLOR_MAP);
        if (colorMapField != null) {
            usesPalette = true;
        }

        final int photoInterp = 0xffff & directory.getFieldValue(TiffTagConstants.TIFF_TAG_PHOTOMETRIC_INTERPRETATION);
        final TiffField extraSamplesField = directory.findField(TiffTagConstants.TIFF_TAG_EXTRA_SAMPLES);
        final int extraSamples;
        if (extraSamplesField == null) {
            extraSamples = 0; // no extra samples value
        } else {
            extraSamples = extraSamplesField.getIntValue();
        }
        final TiffField samplesPerPixelField = directory.findField(TiffTagConstants.TIFF_TAG_SAMPLES_PER_PIXEL);
        final int samplesPerPixel;
        if (samplesPerPixelField == null) {
            samplesPerPixel = 1;
        } else {
            samplesPerPixel = samplesPerPixelField.getIntValue();
        }

        final ImageInfo.ColorType colorType;
        switch (photoInterp) {
        case TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_BLACK_IS_ZERO:
        case TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_WHITE_IS_ZERO:
            // the ImageInfo.ColorType enumeration does not distinguish
            // between monotone white is zero or black is zero
            colorType = ImageInfo.ColorType.BW;
            break;
        case TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_RGB:
            colorType = ImageInfo.ColorType.RGB;
            // even if 4 samples per pixel are included, TIFF
            // doesn't specify transparent unless the optional "extra samples"
            // field is supplied with a non-zero value
            transparent = samplesPerPixel == 4 && extraSamples != 0;
            break;
        case TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_RGB_PALETTE:
            colorType = ImageInfo.ColorType.RGB;
            usesPalette = true;
            break;
        case TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_CMYK:
            colorType = ImageInfo.ColorType.CMYK;
            break;
        case TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_YCB_CR:
            colorType = ImageInfo.ColorType.YCbCr;
            break;
        default:
            colorType = ImageInfo.ColorType.UNKNOWN;
        }

        final short compressionFieldValue;
        if (directory.findField(TiffTagConstants.TIFF_TAG_COMPRESSION) != null) {
            compressionFieldValue = directory.getFieldValue(TiffTagConstants.TIFF_TAG_COMPRESSION);
        } else {
            compressionFieldValue = TiffConstants.COMPRESSION_UNCOMPRESSED_1;
        }
        final int compression = 0xffff & compressionFieldValue;
        final ImageInfo.CompressionAlgorithm compressionAlgorithm;

        switch (compression) {
        case TiffConstants.COMPRESSION_UNCOMPRESSED_1:
            compressionAlgorithm = ImageInfo.CompressionAlgorithm.NONE;
            break;
        case TiffConstants.COMPRESSION_CCITT_1D:
            compressionAlgorithm = ImageInfo.CompressionAlgorithm.CCITT_1D;
            break;
        case TiffConstants.COMPRESSION_CCITT_GROUP_3:
            compressionAlgorithm = ImageInfo.CompressionAlgorithm.CCITT_GROUP_3;
            break;
        case TiffConstants.COMPRESSION_CCITT_GROUP_4:
            compressionAlgorithm = ImageInfo.CompressionAlgorithm.CCITT_GROUP_4;
            break;
        case TiffConstants.COMPRESSION_LZW:
            compressionAlgorithm = ImageInfo.CompressionAlgorithm.LZW;
            break;
        case TiffConstants.COMPRESSION_JPEG_OBSOLETE:
            compressionAlgorithm = ImageInfo.CompressionAlgorithm.JPEG_TIFF_OBSOLETE;
            break;
        case TiffConstants.COMPRESSION_JPEG:
            compressionAlgorithm = ImageInfo.CompressionAlgorithm.JPEG;
            break;
        case TiffConstants.COMPRESSION_UNCOMPRESSED_2:
            compressionAlgorithm = ImageInfo.CompressionAlgorithm.NONE;
            break;
        case TiffConstants.COMPRESSION_PACKBITS:
            compressionAlgorithm = ImageInfo.CompressionAlgorithm.PACKBITS;
            break;
        case TiffConstants.COMPRESSION_DEFLATE_PKZIP:
        case TiffConstants.COMPRESSION_DEFLATE_ADOBE:
            compressionAlgorithm = ImageInfo.CompressionAlgorithm.DEFLATE;
            break;
        default:
            compressionAlgorithm = ImageInfo.CompressionAlgorithm.UNKNOWN;
            break;
        }

        return new ImageInfo(formatDetails, bitsPerPixel, comments, format, formatName, height, mimeType, numberOfImages, physicalHeightDpi, physicalHeightInch,
                physicalWidthDpi, physicalWidthInch, width, progressive, transparent, usesPalette, colorType, compressionAlgorithm);
    }

    @Override
    public Dimension getImageSize(final ByteSource byteSource, final TiffImagingParameters params) throws ImagingException, IOException {
        final FormatCompliance formatCompliance = FormatCompliance.getDefault();
        final TiffContents contents = new TiffReader(params != null && params.isStrict()).readFirstDirectory(byteSource, false, formatCompliance);
        final TiffDirectory directory = contents.directories.get(0);

        final TiffField widthField = directory.findField(TiffTagConstants.TIFF_TAG_IMAGE_WIDTH, true);
        final TiffField heightField = directory.findField(TiffTagConstants.TIFF_TAG_IMAGE_LENGTH, true);

        if (widthField == null || heightField == null) {
            throw new ImagingException("TIFF image missing size info.");
        }

        final int height = heightField.getIntValue();
        final int width = widthField.getIntValue();

        return new Dimension(width, height);
    }

    @Override
    public ImageMetadata getMetadata(final ByteSource byteSource, TiffImagingParameters params) throws ImagingException, IOException {
        if (params == null) {
            params = getDefaultParameters();
        }
        final FormatCompliance formatCompliance = FormatCompliance.getDefault();
        final TiffReader tiffReader = new TiffReader(params.isStrict());
        final TiffContents contents = tiffReader.readContents(byteSource, params, formatCompliance);

        final List<TiffDirectory> directories = contents.directories;

        final TiffImageMetadata result = new TiffImageMetadata(contents);

        for (final TiffDirectory dir : directories) {
            final TiffImageMetadata.Directory metadataDirectory = new TiffImageMetadata.Directory(tiffReader.getByteOrder(), dir);

            final List<TiffField> entries = dir.getDirectoryEntries();

            for (final TiffField entry : entries) {
                metadataDirectory.add(entry);
            }

            result.add(metadataDirectory);
        }

        return result;
    }

    @Override
    public String getName() {
        return "Tiff-Custom";
    }

    private PhotometricInterpreter getPhotometricInterpreter(final TiffDirectory directory, final int photometricInterpretation, final int bitsPerPixel,
            final int[] bitsPerSample, final int predictor, final int samplesPerPixel, final int width, final int height) throws ImagingException {
        switch (photometricInterpretation) {
        case 0:
        case 1:
            final boolean invert = photometricInterpretation == 0;

            return new PhotometricInterpreterBiLevel(samplesPerPixel, bitsPerSample, predictor, width, height, invert);
        case 3: {
            // Palette
            final int[] colorMap = directory.findField(TiffTagConstants.TIFF_TAG_COLOR_MAP, true).getIntArrayValue();

            final int expectedColormapSize = 3 * (1 << bitsPerPixel);

            if (colorMap.length != expectedColormapSize) {
                throw new ImagingException("Tiff: fColorMap.length (" + colorMap.length + ") != expectedColormapSize (" + expectedColormapSize + ")");
            }

            return new PhotometricInterpreterPalette(samplesPerPixel, bitsPerSample, predictor, width, height, colorMap);
        }
        case 2: // RGB
            return new PhotometricInterpreterRgb(samplesPerPixel, bitsPerSample, predictor, width, height);
        case 5: // CMYK
            return new PhotometricInterpreterCmyk(samplesPerPixel, bitsPerSample, predictor, width, height);
        case 6: {
//            final double[] yCbCrCoefficients = directory.findField(
//                    TiffTagConstants.TIFF_TAG_YCBCR_COEFFICIENTS, true)
//                    .getDoubleArrayValue();
//
//            final int[] yCbCrPositioning = directory.findField(
//                    TiffTagConstants.TIFF_TAG_YCBCR_POSITIONING, true)
//                    .getIntArrayValue();
//            final int[] yCbCrSubSampling = directory.findField(
//                    TiffTagConstants.TIFF_TAG_YCBCR_SUB_SAMPLING, true)
//                    .getIntArrayValue();
//
//            final double[] referenceBlackWhite = directory.findField(
//                    TiffTagConstants.TIFF_TAG_REFERENCE_BLACK_WHITE, true)
//                    .getDoubleArrayValue();

            return new PhotometricInterpreterYCbCr(samplesPerPixel, bitsPerSample, predictor, width, height);
        }

        case 8:
            return new PhotometricInterpreterCieLab(samplesPerPixel, bitsPerSample, predictor, width, height);

        case 32844:
        case 32845: {
//            final boolean yonly = (photometricInterpretation == 32844);
            return new PhotometricInterpreterLogLuv(samplesPerPixel, bitsPerSample, predictor, width, height);
        }

        default:
            throw new ImagingException("TIFF: Unknown fPhotometricInterpretation: " + photometricInterpretation);
        }
    }

    /**
     * Reads the content of a TIFF file that contains numerical data samples rather than image-related pixels.
     * <p>
     * If desired, sub-image data can be read from the file by using a Java {@code TiffImagingParameters} instance to specify the subsection of the image that
     * is required. The following code illustrates the approach:
     *
     * <pre>
     * int x; // coordinate (column) of corner of sub-image
     * int y; // coordinate (row) of corner of sub-image
     * int width; // width of sub-image
     * int height; // height of sub-image
     *
     * TiffImagingParameters params = new TiffImagingParameters();
     * params.setSubImageX(x);
     * params.setSubImageY(y);
     * params.setSubImageWidth(width);
     * params.setSubImageHeight(height);
     * TiffRasterData raster = readFloatingPointRasterData(directory, byteOrder, params);
     * </pre>
     *
     * @param directory the TIFF directory pointing to the data to be extracted (TIFF files may contain multiple directories)
     * @param byteOrder the byte order of the data to be extracted
     * @param params    an optional parameter object instance
     * @return a valid instance
     * @throws ImagingException in the event of incompatible or malformed data
     * @throws IOException      in the event of an I/O error
     */
    TiffRasterData getRasterData(final TiffDirectory directory, final ByteOrder byteOrder, TiffImagingParameters params) throws ImagingException, IOException {
        if (params == null) {
            params = getDefaultParameters();
        }

        final short[] sSampleFmt = directory.getFieldValue(TiffTagConstants.TIFF_TAG_SAMPLE_FORMAT, true);
        if (sSampleFmt == null || sSampleFmt.length < 1) {
            throw new ImagingException("Directory does not specify numeric raster data");
        }

        int samplesPerPixel = 1;
        final TiffField samplesPerPixelField = directory.findField(TiffTagConstants.TIFF_TAG_SAMPLES_PER_PIXEL);
        if (samplesPerPixelField != null) {
            samplesPerPixel = samplesPerPixelField.getIntValue();
        }

        int[] bitsPerSample = { 1 };
        int bitsPerPixel = samplesPerPixel;
        final TiffField bitsPerSampleField = directory.findField(TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE);
        if (bitsPerSampleField != null) {
            bitsPerSample = bitsPerSampleField.getIntArrayValue();
            bitsPerPixel = bitsPerSampleField.getIntValueOrArraySum();
        }

        final short compressionFieldValue;
        if (directory.findField(TiffTagConstants.TIFF_TAG_COMPRESSION) != null) {
            compressionFieldValue = directory.getFieldValue(TiffTagConstants.TIFF_TAG_COMPRESSION);
        } else {
            compressionFieldValue = TiffConstants.COMPRESSION_UNCOMPRESSED_1;
        }
        final int compression = 0xffff & compressionFieldValue;

        final int width = directory.getSingleFieldValue(TiffTagConstants.TIFF_TAG_IMAGE_WIDTH);
        final int height = directory.getSingleFieldValue(TiffTagConstants.TIFF_TAG_IMAGE_LENGTH);

        Rectangle subImage = checkForSubImage(params);
        if (subImage != null) {
            // Check for valid subimage specification. The following checks
            // are consistent with BufferedImage.getSubimage()
            if (subImage.width <= 0) {
                throw new ImagingException("Negative or zero subimage width.");
            }
            if (subImage.height <= 0) {
                throw new ImagingException("Negative or zero subimage height.");
            }
            if (subImage.x < 0 || subImage.x >= width) {
                throw new ImagingException("Subimage x is outside raster.");
            }
            if (subImage.x + subImage.width > width) {
                throw new ImagingException("Subimage (x+width) is outside raster.");
            }
            if (subImage.y < 0 || subImage.y >= height) {
                throw new ImagingException("Subimage y is outside raster.");
            }
            if (subImage.y + subImage.height > height) {
                throw new ImagingException("Subimage (y+height) is outside raster.");
            }

            // if the subimage is just the same thing as the whole
            // image, suppress the subimage processing
            if (subImage.x == 0 && subImage.y == 0 && subImage.width == width && subImage.height == height) {
                subImage = null;
            }
        }

        // int bitsPerPixel = getTagAsValueOrArraySum(entries,
        // TIFF_TAG_BITS_PER_SAMPLE);
        int predictor = -1;
        {
            // dumpOptionalNumberTag(entries, TIFF_TAG_FILL_ORDER);
            // dumpOptionalNumberTag(entries, TIFF_TAG_FREE_BYTE_COUNTS);
            // dumpOptionalNumberTag(entries, TIFF_TAG_FREE_OFFSETS);
            // dumpOptionalNumberTag(entries, TIFF_TAG_ORIENTATION);
            // dumpOptionalNumberTag(entries, TIFF_TAG_PLANAR_CONFIGURATION);
            final TiffField predictorField = directory.findField(TiffTagConstants.TIFF_TAG_PREDICTOR);
            if (null != predictorField) {
                predictor = predictorField.getIntValueOrArraySum();
            }
        }

        // Obtain the planar configuration
        final TiffField pcField = directory.findField(TiffTagConstants.TIFF_TAG_PLANAR_CONFIGURATION);
        final TiffPlanarConfiguration planarConfiguration = pcField == null ? TiffPlanarConfiguration.CHUNKY
                : TiffPlanarConfiguration.lenientValueOf(pcField.getIntValue());

        if (sSampleFmt[0] == TiffTagConstants.SAMPLE_FORMAT_VALUE_IEEE_FLOATING_POINT) {
            if (bitsPerSample[0] != 32 && bitsPerSample[0] != 64) {
                throw new ImagingException("TIFF floating-point data uses unsupported bits-per-sample: " + bitsPerSample[0]);
            }

            if (predictor != -1 && predictor != TiffTagConstants.PREDICTOR_VALUE_NONE
                    && predictor != TiffTagConstants.PREDICTOR_VALUE_FLOATING_POINT_DIFFERENCING) {
                throw new ImagingException("TIFF floating-point data uses unsupported horizontal-differencing predictor");
            }
        } else if (sSampleFmt[0] == TiffTagConstants.SAMPLE_FORMAT_VALUE_TWOS_COMPLEMENT_SIGNED_INTEGER) {

            if (samplesPerPixel != 1) {
                throw new ImagingException("TIFF integer data uses unsupported samples per pixel: " + samplesPerPixel);
            }

            if (bitsPerPixel != 16 && bitsPerPixel != 32) {
                throw new ImagingException("TIFF integer data uses unsupported bits-per-pixel: " + bitsPerPixel);
            }

            if (predictor != -1 && predictor != TiffTagConstants.PREDICTOR_VALUE_NONE
                    && predictor != TiffTagConstants.PREDICTOR_VALUE_HORIZONTAL_DIFFERENCING) {
                throw new ImagingException("TIFF integer data uses unsupported horizontal-differencing predictor");
            }
        } else {
            throw new ImagingException("TIFF does not provide a supported raster-data format");
        }

        // The photometric interpreter is not used, but the image-based
        // data reader classes require one. So we create a dummy interpreter.
        final PhotometricInterpreter photometricInterpreter = new PhotometricInterpreterBiLevel(samplesPerPixel, bitsPerSample, predictor, width, height,
                false);

        final AbstractTiffImageData imageData = directory.getTiffImageData();

        final ImageDataReader dataReader = imageData.getDataReader(directory, photometricInterpreter, bitsPerPixel, bitsPerSample, predictor, samplesPerPixel,
                width, height, compression, planarConfiguration, byteOrder);

        return dataReader.readRasterData(subImage);
    }

    @Override
    public String getXmpXml(final ByteSource byteSource, XmpImagingParameters<TiffImagingParameters> params) throws ImagingException, IOException {
        if (params == null) {
            params = new XmpImagingParameters<>();
        }
        final FormatCompliance formatCompliance = FormatCompliance.getDefault();
        final TiffContents contents = new TiffReader(params.isStrict()).readDirectories(byteSource, false, formatCompliance);
        final TiffDirectory directory = contents.directories.get(0);

        final byte[] bytes = directory.getFieldValue(TiffTagConstants.TIFF_TAG_XMP, false);
        if (bytes == null) {
            return null;
        }

        // segment data is UTF-8 encoded xml.
        return new String(bytes, StandardCharsets.UTF_8);
    }

    @Override
    public void writeImage(final BufferedImage src, final OutputStream os, TiffImagingParameters params) throws ImagingException, IOException {
        if (params == null) {
            params = new TiffImagingParameters();
        }
        new TiffImageWriterLossy().writeImage(src, os, params);
    }

}
