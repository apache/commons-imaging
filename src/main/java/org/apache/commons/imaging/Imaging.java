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

import java.awt.Dimension;
import java.awt.color.ICC_Profile;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.common.IImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceArray;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.common.bytesource.ByteSourceInputStream;
import org.apache.commons.imaging.icc.IccProfileInfo;
import org.apache.commons.imaging.icc.IccProfileParser;
import org.apache.commons.imaging.util.IoUtils;

/**
 * The primary application programming interface (API) to the Imaging library.
 * <p>

 * <h3>Application Notes</h3>
 * <h4>Using this class</h4>
 * Almost all of the Apache Commons Imaging library's core functionality can 
 * be accessed through the methods provided by this class.
 * The use of the Imaging class is similar to the Java API's ImageIO class,
 * though Imaging supports formats and options not included in the standard 
 * Java API. 
 * <p>All of methods provided by the Imaging class are declared static.
 * <p>The Apache Commons Imaging package is a pure Java implementation.
 * <h4>Format support</h4>
 * While the Apache Commons Imaging package handles a number of different 
 * graphics formats, support for some formats is not yet complete.
 * For the most recent information on support for specific formats, refer to
 * <a href="http://commons.apache.org/imaging/formatsupport.html">Format Support</a>
 * at the main project development web site.
 * <h4>Optional parameters for image reading and writing</h4>
 * Some of the methods provided by this class accept an optional 
 * <strong>params</strong> argument that permits the application to specify
 * elements for special handling.  If these specifications are not required by
 * the application, the params argument may be omitted (as appropriate) or
 * a null argument may be provided. In image-writing operations, the option 
 * parameters may include options such as data-compression type (if any), 
 * color model, or other format-specific data representations.   The parameters 
 * map may also be used to provide EXIF Tags and other metadata to those
 * formats that support them. In image-reading operations,
 * the parameters may include information about special handling in reading
 * the image data.
 * <p>Optional parameters are specified using a Map object (typically, 
 * a Java HashMap) to specify a set of keys and values for input.  
 * The specification for support keys is provided by the ImagingConstants 
 * interface as well as by format-specific interfaces such as 
 * JpegContants or TiffConstants.
 * <h4>Example code</h4>
 * See the source of the SampleUsage class and other classes in the
 * org.apache.commons.imaging.examples package for examples.
 * 
 * @see <a
 *      href="https://svn.apache.org/repos/asf/commons/proper/imaging/trunk/src/test/java/org/apache/commons/imaging/examples/SampleUsage.java">org.apache.commons.imaging.examples.SampleUsage</a>
 * @see <a href="http://commons.apache.org/imaging/formatsupport.html">Format Support</a>
 */
public abstract class Imaging implements ImagingConstants {

    /**
     * Attempts to determine if a file contains an image recorded in 
     * a supported graphics format based on its file-name extension 
     * (for example "&#46jpg", "&#46;gif", "&#46;png", etc&#46;). 
     * 
     * @param file A valid File object providing a reference to 
     * a file that may contain an image.
     * @return true if the file-name includes a supported image 
     * format file extension; otherwise, false.
     */
    public static boolean hasImageFileExtension(final File file) {
        if (file==null || !file.isFile()) {
            return false;
        }
        return hasImageFileExtension(file.getName());
    }

    /**
     * Attempts to determine if a file contains an image recorded in 
     * a supported graphics format based on its file-name extension 
     * (for example "&#46jpg", "&#46;gif", "&#46;png", etc&#46;). 
     * 
     * @param filename  A valid string representing name of file 
     * which may contain an image.
     * @return true if the filename has an image format file extension.
     */
    public static boolean hasImageFileExtension(String filename) {
        if(filename==null) {
            return false;
        }
        
        filename = filename.toLowerCase();

        final ImageParser imageParsers[] = ImageParser.getAllImageParsers();
        for (final ImageParser imageParser : imageParsers) {
            final String exts[] = imageParser.getAcceptedExtensions();

            for (final String ext : exts) {
                if (filename.endsWith(ext.toLowerCase())) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Attempts to determine the image format of a file based on its
     * "magic numbers," the first bytes of the data.  
     * <p>Many graphics format specify identifying byte 
     * values that appear at the beginning of the data file.  This method
     * checks for such identifying elements and returns a ImageFormat 
     * enumeration indicating what it detects. Note that this 
     * method can return "false positives" in cases where non-image files
     * begin with the specified byte values.
     * 
     * @param bytes  Byte array containing an image file.
     * @return An ImageFormat, such as ImageFormat.IMAGE_FORMAT_JPEG. Returns
     *         ImageFormat.IMAGE_FORMAT_UNKNOWN if the image type cannot be
     *         determined.
     */
    public static ImageFormat guessFormat(final byte bytes[])
            throws ImageReadException, IOException {
        return guessFormat(new ByteSourceArray(bytes));
    }

    /**
     * Attempts to determine the image format of a file based on its
     * "magic numbers," the first bytes of the data.  
     * <p>Many graphics formats specify identifying byte 
     * values that appear at the beginning of the data file.  This method
     * checks for such identifying elements and returns a ImageFormat 
     * enumeration indicating what it detects. Note that this 
     * method can return "false positives" in cases where non-image files
     * begin with the specified byte values.
     * 
     * @param file  File containing image data.
     * @return An ImageFormat, such as ImageFormat.IMAGE_FORMAT_JPEG. Returns
     *         ImageFormat.IMAGE_FORMAT_UNKNOWN if the image type cannot be
     *         determined.
     */
    public static ImageFormat guessFormat(final File file) throws ImageReadException,
            IOException {
        return guessFormat(new ByteSourceFile(file));
    }

    private static final int[] MAGIC_NUMBERS_GIF = { 0x47, 0x49, };
    private static final int[] MAGIC_NUMBERS_PNG = { 0x89, 0x50, };
    private static final int[] MAGIC_NUMBERS_JPEG = { 0xff, 0xd8, };
    private static final int[] MAGIC_NUMBERS_BMP = { 0x42, 0x4d, };
    private static final int[] MAGIC_NUMBERS_TIFF_MOTOROLA = { 0x4D, 0x4D, };
    private static final int[] MAGIC_NUMBERS_TIFF_INTEL = { 0x49, 0x49, };
    private static final int[] MAGIC_NUMBERS_PAM = { 0x50, 0x37, };
    private static final int[] MAGIC_NUMBERS_PSD = { 0x38, 0x42, };
    private static final int[] MAGIC_NUMBERS_PBM_A = { 0x50, 0x31, };
    private static final int[] MAGIC_NUMBERS_PBM_B = { 0x50, 0x34, };
    private static final int[] MAGIC_NUMBERS_PGM_A = { 0x50, 0x32, };
    private static final int[] MAGIC_NUMBERS_PGM_B = { 0x50, 0x35, };
    private static final int[] MAGIC_NUMBERS_PPM_A = { 0x50, 0x33, };
    private static final int[] MAGIC_NUMBERS_PPM_B = { 0x50, 0x36, };
    private static final int[] MAGIC_NUMBERS_JBIG2_1 = { 0x97, 0x4A, };
    private static final int[] MAGIC_NUMBERS_JBIG2_2 = { 0x42, 0x32, };
    private static final int[] MAGIC_NUMBERS_ICNS = { 0x69, 0x63, };
    private static final int[] MAGIC_NUMBERS_DCX = { 0xB1, 0x68, };
    private static final int[] MAGIC_NUMBERS_RGBE = { 0x23, 0x3F, };

    private static boolean compareBytePair(final int[] a, final int b[]) {
        if (a.length != 2 && b.length != 2) {
            throw new RuntimeException("Invalid Byte Pair.");
        }
        return (a[0] == b[0]) && (a[1] == b[1]);
    }

    
    /**
     * Attempts to determine the image format of a file based on its
     * "magic numbers," the first bytes of the data.  
     * <p>Many graphics formats specify identifying byte 
     * values that appear at the beginning of the data file.  This method
     * checks for such identifying elements and returns a ImageFormat 
     * enumeration indicating what it detects. Note that this 
     * method can return "false positives" in cases where non-image files
     * begin with the specified byte values.
     * 
     * @param byteSource a valid ByteSource object potentially supplying 
     * data for an image.
     * @return An ImageFormat, such as ImageFormat.IMAGE_FORMAT_JPEG. Returns
     *         ImageFormat.IMAGE_FORMAT_UNKNOWN if the image type cannot be
     *         determined.
     * @throws ImageReadException in the event of an unsuccessful 
     * attempt to read the image data
     * @throws IOException in the event of an unrecoverable I/O condition.
     */
    public static ImageFormat guessFormat(final ByteSource byteSource)
            throws ImageReadException, IOException {
        
        if (byteSource==null) {
            return ImageFormats.UNKNOWN;
        }
        
        InputStream is = null;
        boolean canThrow = false;
        try {
            is = byteSource.getInputStream();

            final int i1 = is.read();
            final int i2 = is.read();
            if ((i1 < 0) || (i2 < 0)) {
                throw new ImageReadException(
                        "Couldn't read magic numbers to guess format.");
            }

            final int b1 = i1 & 0xff;
            final int b2 = i2 & 0xff;
            final int bytePair[] = { b1, b2, };

            if (compareBytePair(MAGIC_NUMBERS_GIF, bytePair)) {
                canThrow = true;
                return ImageFormats.GIF;
            }
            // else if (b1 == 0x00 && b2 == 0x00) // too similar to TGA
            // {
            // return ImageFormat.IMAGE_FORMAT_ICO;
            // }
            else if (compareBytePair(MAGIC_NUMBERS_PNG, bytePair)) {
                canThrow = true;
                return ImageFormats.PNG;
            } else if (compareBytePair(MAGIC_NUMBERS_JPEG, bytePair)) {
                canThrow = true;
                return ImageFormats.JPEG;
            } else if (compareBytePair(MAGIC_NUMBERS_BMP, bytePair)) {
                canThrow = true;
                return ImageFormats.BMP;
            } else if (compareBytePair(MAGIC_NUMBERS_TIFF_MOTOROLA, bytePair)) {
                canThrow = true;
                return ImageFormats.TIFF;
            } else if (compareBytePair(MAGIC_NUMBERS_TIFF_INTEL, bytePair)) {
                canThrow = true;
                return ImageFormats.TIFF;
            } else if (compareBytePair(MAGIC_NUMBERS_PSD, bytePair)) {
                canThrow = true;
                return ImageFormats.PSD;
            } else if (compareBytePair(MAGIC_NUMBERS_PAM, bytePair)) {
                canThrow = true;
                return ImageFormats.PAM;
            } else if (compareBytePair(MAGIC_NUMBERS_PBM_A, bytePair)) {
                canThrow = true;
                return ImageFormats.PBM;
            } else if (compareBytePair(MAGIC_NUMBERS_PBM_B, bytePair)) {
                canThrow = true;
                return ImageFormats.PBM;
            } else if (compareBytePair(MAGIC_NUMBERS_PGM_A, bytePair)) {
                canThrow = true;
                return ImageFormats.PGM;
            } else if (compareBytePair(MAGIC_NUMBERS_PGM_B, bytePair)) {
                canThrow = true;
                return ImageFormats.PGM;
            } else if (compareBytePair(MAGIC_NUMBERS_PPM_A, bytePair)) {
                canThrow = true;
                return ImageFormats.PPM;
            } else if (compareBytePair(MAGIC_NUMBERS_PPM_B, bytePair)) {
                canThrow = true;
                return ImageFormats.PPM;
            } else if (compareBytePair(MAGIC_NUMBERS_JBIG2_1, bytePair)) {
                final int i3 = is.read();
                final int i4 = is.read();
                if ((i3 < 0) || (i4 < 0)) {
                    throw new ImageReadException(
                            "Couldn't read magic numbers to guess format.");
                }

                final int b3 = i3 & 0xff;
                final int b4 = i4 & 0xff;
                final int bytePair2[] = { b3, b4, };
                if (compareBytePair(MAGIC_NUMBERS_JBIG2_2, bytePair2)) {
                    canThrow = true;
                    return ImageFormats.JBIG2;
                }
            } else if (compareBytePair(MAGIC_NUMBERS_ICNS, bytePair)) {
                canThrow = true;
                return ImageFormats.ICNS;
            } else if (compareBytePair(MAGIC_NUMBERS_DCX, bytePair)) {
                canThrow = true;
                return ImageFormats.DCX;
            } else if (compareBytePair(MAGIC_NUMBERS_RGBE, bytePair)) {
                canThrow = true;
                return ImageFormats.RGBE;
            }
            canThrow = true;
            return ImageFormats.UNKNOWN;
        } finally {
            IoUtils.closeQuietly(canThrow, is);
        }
    }

    /**
     * Extracts an ICC Profile (if present) from JPEG, PNG, PSD (Photoshop) and
     * TIFF images.
     * <p>
     * 
     * @param bytes
     *            Byte array containing an image file.
     * @return An instance of ICC_Profile or null if the image contains no ICC
     *         profile.
     */
    public static ICC_Profile getICCProfile(final byte bytes[])
            throws ImageReadException, IOException {
        return getICCProfile(bytes, null);
    }

    /**
     * Extracts an ICC Profile (if present) from JPEG, PNG, PSD (Photoshop) and
     * TIFF images.
     * <p>
     * 
     * @param bytes
     *            Byte array containing an image file.
     * @param params
     *            Map of optional parameters, defined in ImagingConstants.
     * @return An instance of ICC_Profile or null if the image contains no ICC
     *         profile..
     */
    public static ICC_Profile getICCProfile(final byte bytes[], final Map<String,Object> params)
            throws ImageReadException, IOException {
        return getICCProfile(new ByteSourceArray(bytes), params);
    }

    /**
     * Extracts an ICC Profile (if present) from JPEG, PNG, PSD (Photoshop) and
     * TIFF images.
     * <p>
     * 
     * @param is
     *            InputStream from which to read image data.
     * @param filename
     *            Filename associated with image data (optional).
     * @return An instance of ICC_Profile or null if the image contains no ICC
     *         profile..
     */
    public static ICC_Profile getICCProfile(final InputStream is, final String filename)
            throws ImageReadException, IOException {
        return getICCProfile(is, filename, null);
    }

    /**
     * Extracts an ICC Profile (if present) from JPEG, PNG, PSD (Photoshop) and
     * TIFF images.
     * <p>
     * 
     * @param is
     *            InputStream from which to read image data.
     * @param filename
     *            Filename associated with image data (optional).
     * @param params
     *            Map of optional parameters, defined in ImagingConstants.
     * @return An instance of ICC_Profile or null if the image contains no ICC
     *         profile..
     */
    public static ICC_Profile getICCProfile(final InputStream is, final String filename,
            final Map<String,Object> params) throws ImageReadException, IOException {
        return getICCProfile(new ByteSourceInputStream(is, filename), params);
    }

    /**
     * Extracts an ICC Profile (if present) from JPEG, PNG, PSD (Photoshop) and
     * TIFF images.
     * <p>
     * 
     * @param file
     *            File containing image data.
     * @return An instance of ICC_Profile or null if the image contains no ICC
     *         profile..
     */
    public static ICC_Profile getICCProfile(final File file)
            throws ImageReadException, IOException {
        return getICCProfile(file, null);
    }

    /**
     * Extracts an ICC Profile (if present) from JPEG, PNG, PSD (Photoshop) and
     * TIFF images.
     * <p>
     * 
     * @param file
     *            File containing image data.
     * @param params
     *            Map of optional parameters, defined in ImagingConstants.
     * @return An instance of ICC_Profile or null if the image contains no ICC
     *         profile..
     */
    public static ICC_Profile getICCProfile(final File file, final Map<String,Object> params)
            throws ImageReadException, IOException {
        return getICCProfile(new ByteSourceFile(file), params);
    }

    protected static ICC_Profile getICCProfile(final ByteSource byteSource, final Map<String,Object> params)
            throws ImageReadException, IOException {
        final byte bytes[] = getICCProfileBytes(byteSource, params);
        if (bytes == null) {
            return null;
        }

        final IccProfileParser parser = new IccProfileParser();
        final IccProfileInfo info = parser.getICCProfileInfo(bytes);
        if (info == null) {
            return null;
        }
        if (info.issRGB()) {
            return null;
        }

        final ICC_Profile icc = ICC_Profile.getInstance(bytes);
        return icc;
    }

    /**
     * Extracts the raw bytes of an ICC Profile (if present) from JPEG, PNG, PSD
     * (Photoshop) and TIFF images.
     * <p>
     * To parse the result use IccProfileParser or
     * ICC_Profile.getInstance(bytes).
     * <p>
     * 
     * @param bytes
     *            Byte array containing an image file.
     * @return A byte array.
     * @see IccProfileParser
     * @see ICC_Profile
     */
    public static byte[] getICCProfileBytes(final byte bytes[])
            throws ImageReadException, IOException {
        return getICCProfileBytes(bytes, null);
    }

    /**
     * Extracts the raw bytes of an ICC Profile (if present) from JPEG, PNG, PSD
     * (Photoshop) and TIFF images.
     * <p>
     * To parse the result use IccProfileParser or
     * ICC_Profile.getInstance(bytes).
     * <p>
     * 
     * @param bytes
     *            Byte array containing an image file.
     * @param params
     *            Map of optional parameters, defined in ImagingConstants.
     * @return A byte array.
     * @see IccProfileParser
     * @see ICC_Profile
     */
    public static byte[] getICCProfileBytes(final byte bytes[], final Map<String,Object> params)
            throws ImageReadException, IOException {
        return getICCProfileBytes(new ByteSourceArray(bytes), params);
    }

    /**
     * Extracts the raw bytes of an ICC Profile (if present) from JPEG, PNG, PSD
     * (Photoshop) and TIFF images.
     * <p>
     * To parse the result use IccProfileParser or
     * ICC_Profile.getInstance(bytes).
     * <p>
     * 
     * @param file
     *            File containing image data.
     * @return A byte array.
     * @see IccProfileParser
     * @see ICC_Profile
     */
    public static byte[] getICCProfileBytes(final File file)
            throws ImageReadException, IOException {
        return getICCProfileBytes(file, null);
    }

    /**
     * Extracts the raw bytes of an ICC Profile (if present) from JPEG, PNG, PSD
     * (Photoshop) and TIFF images.
     * <p>
     * To parse the result use IccProfileParser or
     * ICC_Profile.getInstance(bytes).
     * <p>
     * 
     * @param file
     *            File containing image data.
     * @param params
     *            Map of optional parameters, defined in ImagingConstants.
     * @return A byte array.
     * @see IccProfileParser
     * @see ICC_Profile
     */
    public static byte[] getICCProfileBytes(final File file, final Map<String,Object> params)
            throws ImageReadException, IOException {
        return getICCProfileBytes(new ByteSourceFile(file), params);
    }

    private static byte[] getICCProfileBytes(final ByteSource byteSource, final Map<String,Object> params)
            throws ImageReadException, IOException {
        final ImageParser imageParser = getImageParser(byteSource);

        return imageParser.getICCProfileBytes(byteSource, params);
    }

    /**
     * Parses the "image info" of an image.
     * <p>
     * "Image info" is a summary of basic information about the image such as:
     * width, height, file format, bit depth, color type, etc.
     * <p>
     * Not to be confused with "image metadata."
     * <p>
     * 
     * @param filename
     *            String.
     * @param bytes
     *            Byte array containing an image file.
     * @param params
     *            Map of optional parameters, defined in ImagingConstants.
     * @return An instance of ImageInfo.
     * @see ImageInfo
     */
    public static ImageInfo getImageInfo(final String filename, final byte bytes[],
            final Map<String,Object> params) throws ImageReadException, IOException {
        return getImageInfo(new ByteSourceArray(filename, bytes), params);
    }

    /**
     * Parses the "image info" of an image.
     * <p>
     * "Image info" is a summary of basic information about the image such as:
     * width, height, file format, bit depth, color type, etc.
     * <p>
     * Not to be confused with "image metadata."
     * <p>
     * 
     * @param filename
     *            String.
     * @param bytes
     *            Byte array containing an image file.
     * @return An instance of ImageInfo.
     * @see ImageInfo
     */
    public static ImageInfo getImageInfo(final String filename, final byte bytes[])
            throws ImageReadException, IOException {
        return getImageInfo(new ByteSourceArray(filename, bytes), null);
    }

    /**
     * Parses the "image info" of an image.
     * <p>
     * "Image info" is a summary of basic information about the image such as:
     * width, height, file format, bit depth, color type, etc.
     * <p>
     * Not to be confused with "image metadata."
     * <p>
     * 
     * @param is
     *            InputStream from which to read image data.
     * @param filename
     *            Filename associated with image data (optional).
     * @return An instance of ImageInfo.
     * @see ImageInfo
     */
    public static ImageInfo getImageInfo(final InputStream is, final String filename)
            throws ImageReadException, IOException {
        return getImageInfo(new ByteSourceInputStream(is, filename), null);
    }

    /**
     * Parses the "image info" of an image.
     * <p>
     * "Image info" is a summary of basic information about the image such as:
     * width, height, file format, bit depth, color type, etc.
     * <p>
     * Not to be confused with "image metadata."
     * <p>
     * 
     * @param is
     *            InputStream from which to read image data.
     * @param filename
     *            Filename associated with image data (optional).
     * @param params
     *            Map of optional parameters, defined in ImagingConstants.
     * @return An instance of ImageInfo.
     * @see ImageInfo
     */
    public static ImageInfo getImageInfo(final InputStream is, final String filename,
            final Map<String,Object> params) throws ImageReadException, IOException {
        return getImageInfo(new ByteSourceInputStream(is, filename), params);
    }

    /**
     * Parses the "image info" of an image.
     * <p>
     * "Image info" is a summary of basic information about the image such as:
     * width, height, file format, bit depth, color type, etc.
     * <p>
     * Not to be confused with "image metadata."
     * <p>
     * 
     * @param bytes
     *            Byte array containing an image file.
     * @return An instance of ImageInfo.
     * @see ImageInfo
     */
    public static ImageInfo getImageInfo(final byte bytes[])
            throws ImageReadException, IOException {
        return getImageInfo(new ByteSourceArray(bytes), null);
    }

    /**
     * Parses the "image info" of an image.
     * <p>
     * "Image info" is a summary of basic information about the image such as:
     * width, height, file format, bit depth, color type, etc.
     * <p>
     * Not to be confused with "image metadata."
     * <p>
     * 
     * @param bytes
     *            Byte array containing an image file.
     * @param params
     *            Map of optional parameters, defined in ImagingConstants.
     * @return An instance of ImageInfo.
     * @see ImageInfo
     */
    public static ImageInfo getImageInfo(final byte bytes[], final Map<String,Object> params)
            throws ImageReadException, IOException {
        return getImageInfo(new ByteSourceArray(bytes), params);
    }

    /**
     * Parses the "image info" of an image file.
     * <p>
     * "Image info" is a summary of basic information about the image such as:
     * width, height, file format, bit depth, color type, etc.
     * <p>
     * Not to be confused with "image metadata."
     * <p>
     * 
     * @param file
     *            File containing image data.
     * @param params
     *            Map of optional parameters, defined in ImagingConstants.
     * @return An instance of ImageInfo.
     * @see ImageInfo
     */
    public static ImageInfo getImageInfo(final File file, final Map<String,Object> params)
            throws ImageReadException, IOException {
        return getImageInfo(new ByteSourceFile(file), params);
    }

    /**
     * Parses the "image info" of an image file.
     * <p>
     * "Image info" is a summary of basic information about the image such as:
     * width, height, file format, bit depth, color type, etc.
     * <p>
     * Not to be confused with "image metadata."
     * <p>
     * 
     * @param file
     *            File containing image data.
     * @return An instance of ImageInfo.
     * @see ImageInfo
     */
    public static ImageInfo getImageInfo(final File file) throws ImageReadException,
            IOException {
        return getImageInfo(file, null);
    }

    private static ImageInfo getImageInfo(final ByteSource byteSource, final Map<String,Object> params)
            throws ImageReadException, IOException {
        final ImageParser imageParser = getImageParser(byteSource);

        final ImageInfo imageInfo = imageParser.getImageInfo(byteSource, params);

        return imageInfo;
    }

    private static ImageParser getImageParser(final ByteSource byteSource)
            throws ImageReadException, IOException {
        final ImageFormat format = guessFormat(byteSource);
        if (!format.equals(ImageFormats.UNKNOWN)) {

            final ImageParser imageParsers[] = ImageParser.getAllImageParsers();

            for (final ImageParser imageParser : imageParsers) {
                if (imageParser.canAcceptType(format)) {
                    return imageParser;
                }
            }
        }

        final String filename = byteSource.getFilename();
        if (filename != null) {
            final ImageParser imageParsers[] = ImageParser.getAllImageParsers();

            for (final ImageParser imageParser : imageParsers) {
                if (imageParser.canAcceptExtension(filename)) {
                    return imageParser;
                }
            }
        }

        throw new ImageReadException("Can't parse this format.");
    }

    /**
     * Determines the width and height of an image.
     * <p>
     * 
     * @param is
     *            InputStream from which to read image data.
     * @param filename
     *            Filename associated with image data (optional).
     * @return The width and height of the image.
     */
    public static Dimension getImageSize(final InputStream is, final String filename)
            throws ImageReadException, IOException {
        return getImageSize(is, filename, null);
    }

    /**
     * Determines the width and height of an image.
     * <p>
     * 
     * @param is
     *            InputStream from which to read image data.
     * @param filename
     *            Filename associated with image data (optional).
     * @param params
     *            Map of optional parameters, defined in ImagingConstants.
     * @return The width and height of the image.
     */
    public static Dimension getImageSize(final InputStream is, final String filename,
            final Map<String,Object> params) throws ImageReadException, IOException {
        return getImageSize(new ByteSourceInputStream(is, filename), params);
    }

    /**
     * Determines the width and height of an image.
     * <p>
     * 
     * @param bytes
     *            Byte array containing an image file.
     * @return The width and height of the image.
     */
    public static Dimension getImageSize(final byte bytes[])
            throws ImageReadException, IOException {
        return getImageSize(bytes, null);
    }

    /**
     * Determines the width and height of an image.
     * <p>
     * 
     * @param bytes
     *            Byte array containing an image file.
     * @param params
     *            Map of optional parameters, defined in ImagingConstants.
     * @return The width and height of the image.
     */
    public static Dimension getImageSize(final byte bytes[], final Map<String,Object> params)
            throws ImageReadException, IOException {
        return getImageSize(new ByteSourceArray(bytes), params);
    }

    /**
     * Determines the width and height of an image file.
     * <p>
     * 
     * @param file
     *            File containing image data.
     * @return The width and height of the image.
     */
    public static Dimension getImageSize(final File file) throws ImageReadException,
            IOException {
        return getImageSize(file, null);
    }

    /**
     * Determines the width and height of an image file.
     * <p>
     * 
     * @param file
     *            File containing image data.
     * @param params
     *            Map of optional parameters, defined in ImagingConstants.
     * @return The width and height of the image.
     */
    public static Dimension getImageSize(final File file, final Map<String,Object> params)
            throws ImageReadException, IOException {
        return getImageSize(new ByteSourceFile(file), params);
    }

    public static Dimension getImageSize(final ByteSource byteSource, final Map<String,Object> params)
            throws ImageReadException, IOException {
        final ImageParser imageParser = getImageParser(byteSource);

        return imageParser.getImageSize(byteSource, params);
    }

    /**
     * Extracts the embedded XML metadata as an XML string.
     * <p>
     * 
     * @param is
     *            InputStream from which to read image data.
     * @param filename
     *            Filename associated with image data (optional).
     * @return Xmp Xml as String, if present. Otherwise, returns null.
     */
    public static String getXmpXml(final InputStream is, final String filename)
            throws ImageReadException, IOException {
        return getXmpXml(is, filename, null);
    }

    /**
     * Extracts the embedded XML metadata as an XML string.
     * <p>
     * 
     * @param is
     *            InputStream from which to read image data.
     * @param filename
     *            Filename associated with image data (optional).
     * @param params
     *            Map of optional parameters, defined in ImagingConstants.
     * @return Xmp Xml as String, if present. Otherwise, returns null.
     */
    public static String getXmpXml(final InputStream is, final String filename, final Map<String,Object> params)
            throws ImageReadException, IOException {
        return getXmpXml(new ByteSourceInputStream(is, filename), params);
    }

    /**
     * Extracts the embedded XML metadata as an XML string.
     * <p>
     * 
     * @param bytes
     *            Byte array containing an image file.
     * @return Xmp Xml as String, if present. Otherwise, returns null.
     */
    public static String getXmpXml(final byte bytes[]) throws ImageReadException,
            IOException {
        return getXmpXml(bytes, null);
    }

    /**
     * Extracts the embedded XML metadata as an XML string.
     * <p>
     * 
     * @param bytes
     *            Byte array containing an image file.
     * @param params
     *            Map of optional parameters, defined in ImagingConstants.
     * @return Xmp Xml as String, if present. Otherwise, returns null.
     */
    public static String getXmpXml(final byte bytes[], final Map<String,Object> params)
            throws ImageReadException, IOException {
        return getXmpXml(new ByteSourceArray(bytes), params);
    }

    /**
     * Extracts the embedded XML metadata as an XML string.
     * <p>
     * 
     * @param file
     *            File containing image data.
     * @return Xmp Xml as String, if present. Otherwise, returns null.
     */
    public static String getXmpXml(final File file) throws ImageReadException,
            IOException {
        return getXmpXml(file, null);
    }

    /**
     * Extracts the embedded XML metadata as an XML string.
     * <p>
     * 
     * @param file
     *            File containing image data.
     * @param params
     *            Map of optional parameters, defined in ImagingConstants.
     * @return Xmp Xml as String, if present. Otherwise, returns null.
     */
    public static String getXmpXml(final File file, final Map<String,Object> params)
            throws ImageReadException, IOException {
        return getXmpXml(new ByteSourceFile(file), params);
    }

    /**
     * Extracts the embedded XML metadata as an XML string.
     * <p>
     * 
     * @param byteSource
     *            File containing image data.
     * @param params
     *            Map of optional parameters, defined in ImagingConstants.
     * @return Xmp Xml as String, if present. Otherwise, returns null.
     */
    public static String getXmpXml(final ByteSource byteSource, final Map<String,Object> params)
            throws ImageReadException, IOException {
        final ImageParser imageParser = getImageParser(byteSource);

        return imageParser.getXmpXml(byteSource, params);
    }

    /**
     * Parses the metadata of an image. This metadata depends on the format of
     * the image.
     * <p>
     * JPEG/JFIF files may contain EXIF and/or IPTC metadata. PNG files may
     * contain comments. TIFF files may contain metadata.
     * <p>
     * The instance of IImageMetadata returned by getMetadata() should be upcast
     * (depending on image format).
     * <p>
     * Not to be confused with "image info."
     * <p>
     * 
     * @param bytes
     *            Byte array containing an image file.
     * @return An instance of IImageMetadata.
     * @see IImageMetadata
     */
    public static IImageMetadata getMetadata(final byte bytes[])
            throws ImageReadException, IOException {
        return getMetadata(bytes, null);
    }

    /**
     * Parses the metadata of an image. This metadata depends on the format of
     * the image.
     * <p>
     * JPEG/JFIF files may contain EXIF and/or IPTC metadata. PNG files may
     * contain comments. TIFF files may contain metadata.
     * <p>
     * The instance of IImageMetadata returned by getMetadata() should be upcast
     * (depending on image format).
     * <p>
     * Not to be confused with "image info."
     * <p>
     * 
     * @param bytes
     *            Byte array containing an image file.
     * @param params
     *            Map of optional parameters, defined in ImagingConstants.
     * @return An instance of IImageMetadata.
     * @see IImageMetadata
     */
    public static IImageMetadata getMetadata(final byte bytes[], final Map<String,Object> params)
            throws ImageReadException, IOException {
        return getMetadata(new ByteSourceArray(bytes), params);
    }

    /**
     * Parses the metadata of an image file. This metadata depends on the format
     * of the image.
     * <p>
     * JPEG/JFIF files may contain EXIF and/or IPTC metadata. PNG files may
     * contain comments. TIFF files may contain metadata.
     * <p>
     * The instance of IImageMetadata returned by getMetadata() should be upcast
     * (depending on image format).
     * <p>
     * Not to be confused with "image info."
     * <p>
     * 
     * @param is
     *            InputStream from which to read image data.
     * @param filename
     *            Filename associated with image data (optional).
     * @return An instance of IImageMetadata.
     * @see IImageMetadata
     */
    public static IImageMetadata getMetadata(final InputStream is, final String filename)
            throws ImageReadException, IOException {
        return getMetadata(is, filename, null);
    }

    /**
     * Parses the metadata of an image file. This metadata depends on the format
     * of the image.
     * <p>
     * JPEG/JFIF files may contain EXIF and/or IPTC metadata. PNG files may
     * contain comments. TIFF files may contain metadata.
     * <p>
     * The instance of IImageMetadata returned by getMetadata() should be upcast
     * (depending on image format).
     * <p>
     * Not to be confused with "image info."
     * <p>
     * 
     * @param is
     *            InputStream from which to read image data.
     * @param filename
     *            Filename associated with image data (optional).
     * @param params
     *            Map of optional parameters, defined in ImagingConstants.
     * @return An instance of IImageMetadata.
     * @see IImageMetadata
     */
    public static IImageMetadata getMetadata(final InputStream is, final String filename,
            final Map<String,Object> params) throws ImageReadException, IOException {
        return getMetadata(new ByteSourceInputStream(is, filename), params);
    }

    /**
     * Parses the metadata of an image file. This metadata depends on the format
     * of the image.
     * <p>
     * JPEG/JFIF files may contain EXIF and/or IPTC metadata. PNG files may
     * contain comments. TIFF files may contain metadata.
     * <p>
     * The instance of IImageMetadata returned by getMetadata() should be upcast
     * (depending on image format).
     * <p>
     * Not to be confused with "image info."
     * <p>
     * 
     * @param file
     *            File containing image data.
     * @return An instance of IImageMetadata.
     * @see IImageMetadata
     */
    public static IImageMetadata getMetadata(final File file)
            throws ImageReadException, IOException {
        return getMetadata(file, null);
    }

    /**
     * Parses the metadata of an image file. This metadata depends on the format
     * of the image.
     * <p>
     * JPEG/JFIF files may contain EXIF and/or IPTC metadata. PNG files may
     * contain comments. TIFF files may contain metadata.
     * <p>
     * The instance of IImageMetadata returned by getMetadata() should be upcast
     * (depending on image format).
     * <p>
     * Not to be confused with "image info."
     * <p>
     * 
     * @param file
     *            File containing image data.
     * @param params
     *            Map of optional parameters, defined in ImagingConstants.
     * @return An instance of IImageMetadata.
     * @see IImageMetadata
     */
    public static IImageMetadata getMetadata(final File file, final Map<String,Object> params)
            throws ImageReadException, IOException {
        return getMetadata(new ByteSourceFile(file), params);
    }

    private static IImageMetadata getMetadata(final ByteSource byteSource, final Map<String,Object> params)
            throws ImageReadException, IOException {
        final ImageParser imageParser = getImageParser(byteSource);

        return imageParser.getMetadata(byteSource, params);
    }

    /**
     * Write the ImageInfo and format-specific information for the image
     * content of the specified byte array to a string.
     * @param bytes A valid array of bytes.
     * @return A valid string.
     * @throws ImageReadException In the event that the the specified 
     * content does not conform to the format of the specific parser
     * implementation.
     * @throws IOException In the event of unsuccessful read or
     * access operation.
     */
    public static String dumpImageFile(final byte bytes[]) throws ImageReadException,
            IOException {
        return dumpImageFile(new ByteSourceArray(bytes));
    }

    /**
     * Write the ImageInfo and format-specific information for the image
     * content of the specified file to a string.
     * @param file A valid file reference.
     * @return A valid string.
     * @throws ImageReadException In the event that the the specified 
     * content does not conform to the format of the specific parser
     * implementation.
     * @throws IOException In the event of unsuccessful read or
     * access operation.
     */
    public static String dumpImageFile(final File file) throws ImageReadException,
            IOException {
        return dumpImageFile(new ByteSourceFile(file));
    }

    private static String dumpImageFile(final ByteSource byteSource)
            throws ImageReadException, IOException {
        final ImageParser imageParser = getImageParser(byteSource);

        return imageParser.dumpImageFile(byteSource);
    }

    /**
     * Attempts to determine the image format of the specified data and 
     * evaluates its format compliance.   This method
     * returns a FormatCompliance object which includes information
     * about the data's compliance to a specific format.
     * @param bytes a valid array of bytes containing image data.
     * @return if successful, a valid FormatCompliance object.
     * @throws ImageReadException in the event of unreadable data.
     * @throws IOException in the event of an unrecoverable I/O condition.
     */
    public static FormatCompliance getFormatCompliance(final byte bytes[])
            throws ImageReadException, IOException {
        return getFormatCompliance(new ByteSourceArray(bytes));
    }

    /**
     * Attempts to determine the image format of the specified data and 
     * evaluates its format compliance.   This method
     * returns a FormatCompliance object which includes information
     * about the data's compliance to a specific format.
     * @param file valid file containing image data
     * @return if successful, a valid FormatCompliance object.
     * @throws ImageReadException in the event of unreadable data.
     * @throws IOException in the event of an unrecoverable I/O condition.
     */
    public static FormatCompliance getFormatCompliance(final File file)
            throws ImageReadException, IOException {
        return getFormatCompliance(new ByteSourceFile(file));
    }

    private static FormatCompliance getFormatCompliance(final ByteSource byteSource)
            throws ImageReadException, IOException {
        final ImageParser imageParser = getImageParser(byteSource);

        return imageParser.getFormatCompliance(byteSource);
    }

    /**
     * Gets all images specified by the InputStream  (some 
     * formats may include multiple images within a single data source).
     * @param is A valid InputStream
     * @return A valid (potentially empty) list of BufferedImage objects.
     * @throws ImageReadException In the event that the the specified 
     * content does not conform to the format of the specific parser
     * implementation.
     * @throws IOException In the event of unsuccessful read or
     * access operation.
     */
    public static List<BufferedImage> getAllBufferedImages(final InputStream is,
            final String filename) throws ImageReadException, IOException {
        return getAllBufferedImages(new ByteSourceInputStream(is, filename));
    }

    /**
     * Gets all images specified by the byte array (some 
     * formats may include multiple images within a single data source).
     * @param bytes a valid array of bytes
     * @return A valid (potentially empty) list of BufferedImage objects.
     * @throws ImageReadException In the event that the the specified 
     * content does not conform to the format of the specific parser
     * implementation.
     * @throws IOException In the event of unsuccessful read or
     * access operation.
     */
    public static List<BufferedImage> getAllBufferedImages(final byte bytes[])
            throws ImageReadException, IOException {
        return getAllBufferedImages(new ByteSourceArray(bytes));
    }

   /**
     * Gets all images specified by the file (some 
     * formats may include multiple images within a single data source).
     * @param file A reference to a valid data file.
     * @return A valid (potentially empty) list of BufferedImage objects.
     * @throws ImageReadException In the event that the the specified 
     * content does not conform to the format of the specific parser
     * implementation.
     * @throws IOException In the event of unsuccessful read or
     * access operation.
     */
    public static List<BufferedImage> getAllBufferedImages(final File file)
            throws ImageReadException, IOException {
        return getAllBufferedImages(new ByteSourceFile(file));
    }

    
    private static List<BufferedImage> getAllBufferedImages(
            final ByteSource byteSource) throws ImageReadException, IOException {
        final ImageParser imageParser = getImageParser(byteSource);

        return imageParser.getAllBufferedImages(byteSource);
    }


    /**
     * Reads the first image from an InputStream. 
     * <p>
     * For the most recent information on support for specific formats, refer to
     * <a href="http://commons.apache.org/imaging/formatsupport.html">Format Support</a>
     * at the main project development web site.   While the Apache Commons
     * Imaging package does not fully support all formats, it  can read 
     * image info, metadata and ICC profiles from all image formats that 
     * provide this data.
     * @param is a valid ImageStream from which to read data.
     * @return if successful, a valid buffered image
     * @throws ImageReadException in the event of a processing error
     * while reading an image (i.e. a format violation, etc.).
     * @throws IOException  in the event of an unrecoverable I/O exception.
     */

    public static BufferedImage getBufferedImage(final InputStream is)
            throws ImageReadException, IOException {
        return getBufferedImage(is, null);
    }

    
    
    /**
     * Reads the first image from an InputStream 
     * using data-processing options specified through a parameters
     * map.  Options may be configured using the ImagingContants 
     * interface or the various format-specific implementations provided
     * by this package.
     * <p>
     * For the most recent information on support for specific formats, refer to
     * <a href="http://commons.apache.org/imaging/formatsupport.html">Format Support</a>
     * at the main project development web site.   While the Apache Commons
     * Imaging package does not fully support all formats, it  can read 
     * image info, metadata and ICC profiles from all image formats that 
     * provide this data.
     * @param is a valid ImageStream from which to read data.
     * @param params an optional parameters map specifying options
     * @return if successful, a valid buffered image
     * @throws ImageReadException in the event of a processing error
     * while reading an image (i.e. a format violation, etc.).
     * @throws IOException  in the event of an unrecoverable I/O exception.
     */
    public static BufferedImage getBufferedImage(final InputStream is, final Map<String,Object> params)
            throws ImageReadException, IOException {
        String filename = null;
        if (params != null && params.containsKey(PARAM_KEY_FILENAME)) {
            filename = (String) params.get(PARAM_KEY_FILENAME);
        }
        return getBufferedImage(new ByteSourceInputStream(is, filename), params);
    }

    /**
     * Reads the first image from a byte array. 
     * <p>
     * For the most recent information on support for specific formats, refer to
     * <a href="http://commons.apache.org/imaging/formatsupport.html">Format Support</a>
     * at the main project development web site.   While the Apache Commons
     * Imaging package does not fully support all formats, it  can read 
     * image info, metadata and ICC profiles from all image formats that 
     * provide this data.
     * @param bytes a valid array of bytes from which to read data.
     * @return if successful, a valid buffered image
     * @throws ImageReadException in the event of a processing error
     * while reading an image (i.e. a format violation, etc.).
     * @throws IOException  in the event of an unrecoverable I/O exception.
     */
    public static BufferedImage getBufferedImage(final byte bytes[])
            throws ImageReadException, IOException {
        return getBufferedImage(new ByteSourceArray(bytes), null);
    }

   
    /**
     * Reads the first image from a byte array
     * using data-processing options specified through a parameters
     * map.  Options may be configured using the ImagingContants 
     * interface or the various format-specific implementations provided
     * by this package.
     * <p>
     * For the most recent information on support for specific formats, refer to
     * <a href="http://commons.apache.org/imaging/formatsupport.html">Format Support</a>
     * at the main project development web site.   While the Apache Commons
     * Imaging package does not fully support all formats, it  can read 
     * image info, metadata and ICC profiles from all image formats that 
     * provide this data.
     * @param bytes a valid array of bytes from which to read data.
     * @param params an optional parameters map specifying options.
     * @return if successful, a valid buffered image
     * @throws ImageReadException in the event of a processing error
     * while reading an image (i.e. a format violation, etc.).
     * @throws IOException  in the event of an unrecoverable I/O exception.
     */ 
    public static BufferedImage getBufferedImage(final byte bytes[], final Map<String,Object> params)
            throws ImageReadException, IOException {
        return getBufferedImage(new ByteSourceArray(bytes), params);
    }


    
    
    /**
     * Reads the first image from a file. 
     * <p>
     * For the most recent information on support for specific formats, refer to
     * <a href="http://commons.apache.org/imaging/formatsupport.html">Format Support</a>
     * at the main project development web site.   While the Apache Commons
     * Imaging package does not fully support all formats, it  can read 
     * image info, metadata and ICC profiles from all image formats that 
     * provide this data.
     * @param file a valid reference to a file containing image data.
     * @return if successful, a valid buffered image
     * @throws ImageReadException in the event of a processing error
     * while reading an image (i.e. a format violation, etc.).
     * @throws IOException  in the event of an unrecoverable I/O exception.
     */
    public static BufferedImage getBufferedImage(final File file)
            throws ImageReadException, IOException {
        return getBufferedImage(new ByteSourceFile(file), null);
    }

    
    /**
     * Reads the first image from a file
     * using data-processing options specified through a parameters
     * map.  Options may be configured using the ImagingContants 
     * interface or the various format-specific implementations provided
     * by this package.
     * <p>
     * For the most recent information on support for specific formats, refer to
     * <a href="http://commons.apache.org/imaging/formatsupport.html">Format Support</a>
     * at the main project development web site.   While the Apache Commons
     * Imaging package does not fully support all formats, it  can read 
     * image info, metadata and ICC profiles from all image formats that 
     * provide this data.
     * @param file a valid reference to a file containing image data.
     * @return if successful, a valid buffered image
     * @throws ImageReadException in the event of a processing error
     * while reading an image (i.e. a format violation, etc.).
     * @throws IOException  in the event of an unrecoverable I/O exception.
     */
    public static BufferedImage getBufferedImage(final File file, final Map<String,Object> params)
            throws ImageReadException, IOException {
        return getBufferedImage(new ByteSourceFile(file), params);
    }

    
    
    private static BufferedImage getBufferedImage(final ByteSource byteSource,
            Map<String,Object> params) throws ImageReadException, IOException {
        final ImageParser imageParser = getImageParser(byteSource);
        if (null == params) {
            params = new HashMap<String,Object>();
        }

        return imageParser.getBufferedImage(byteSource, params);
    }

     /**
     * Writes the content of a BufferedImage to a file using the specified 
     * image format.  Specifications for storing the file (such as data compression,
     * color models, metadata tags, etc.) may be specified using an optional
     * parameters map. These specifications are defined in the ImagingConstants
     * interface or in various format-specific implementations.
     * <p>
     * Image writing is not supported for all graphics formats.
     * For the most recent information on support for specific formats, refer to
     * <a href="http://commons.apache.org/imaging/formatsupport.html">Format Support</a>
     * at the main project development web site.   While the Apache Commons
     * Imaging package does not fully support all formats, it  can read 
     * image info, metadata and ICC profiles from all image formats that 
     * provide this data.
     * @param src a valid BufferedImage object
     * @param file the file to which the output image is to be written
     * @param format the format in which the output image is to be written
     * @param params an optional parameters map (nulls permitted)
     * @throws ImageWriteException in the event of a format violation,
     * unsupported image format, etc.
     * @throws IOException in the event of an unrecoverable I/O exception.
     * @see ImagingConstants
     */    
    public static void writeImage(final BufferedImage src, final File file,
            final ImageFormat format, final Map<String,Object> params) throws ImageWriteException,
            IOException {
        OutputStream os = null;
        boolean canThrow = false;
        try {
            os = new FileOutputStream(file);
            os = new BufferedOutputStream(os);

            writeImage(src, os, format, params);
            canThrow = true;
        } finally {
            IoUtils.closeQuietly(canThrow, os);
        }
    }

    
    /**
     * Writes the content of a BufferedImage to a byte array using the specified 
     * image format.  Specifications for storing the file (such as data compression,
     * color models, metadata tags, etc.) may be specified using an optional
     * parameters map. These specifications are defined in the ImagingConstants
     * interface or in various format-specific implementations.
     * <p>
     * Image writing is not supported for all graphics formats.
     * For the most recent information on support for specific formats, refer to
     * <a href="http://commons.apache.org/imaging/formatsupport.html">Format Support</a>
     * at the main project development web site.   While the Apache Commons
     * Imaging package does not fully support all formats, it  can read 
     * image info, metadata and ICC profiles from all image formats that 
     * provide this data.
     * @param src a valid BufferedImage object
     * @param format the format in which the output image is to be written
     * @param params an optional parameters map (nulls permitted)
     * @return if successful, a valid array of bytes.
     * @throws ImageWriteException in the event of a format violation,
     * unsupported image format, etc.
     * @throws IOException in the event of an unrecoverable I/O exception.
     * @see ImagingConstants
     */   
    public static byte[] writeImageToBytes(final BufferedImage src,
            final ImageFormat format, final Map<String,Object> params) throws ImageWriteException,
            IOException {
        final ByteArrayOutputStream os = new ByteArrayOutputStream();

        writeImage(src, os, format, params);

        return os.toByteArray();
    }


     /**
     * Writes the content of a BufferedImage to an OutputStream using the specified 
     * image format.  Specifications for storing the file (such as data compression,
     * color models, metadata tags, etc.) may be specified using an optional
     * parameters map. These specifications are defined in the ImagingConstants
     * interface or in various format-specific implementations.
     * <p>
     * Image writing is not supported for all graphics formats.
     * For the most recent information on support for specific formats, refer to
     * <a href="http://commons.apache.org/imaging/formatsupport.html">Format Support</a>
     * at the main project development web site.   While the Apache Commons
     * Imaging package does not fully support all formats, it  can read 
     * image info, metadata and ICC profiles from all image formats that 
     * provide this data.
     * @param src a valid BufferedImage object
     * @param os the OutputStream to which the output image is to be written
     * @param format the format in which the output image is to be written
     * @param params an optional parameters map (nulls permitted)
     * @throws ImageWriteException in the event of a format violation,
     * unsupported image format, etc.
     * @throws IOException in the event of an unrecoverable I/O exception.
     * @see ImagingConstants
     */    
    public static void writeImage(final BufferedImage src, final OutputStream os,
            final ImageFormat format, Map<String,Object> params) throws ImageWriteException,
            IOException {
        final ImageParser imageParsers[] = ImageParser.getAllImageParsers();

        // make sure params are non-null
        if (params == null) {
            params = new HashMap<String,Object>();
        }

        params.put(PARAM_KEY_FORMAT, format);

        for (final ImageParser imageParser2 : imageParsers) {
            final ImageParser imageParser = imageParser2;

            if (!imageParser.canAcceptType(format)) {
                continue;
            }

            imageParser.writeImage(src, os, params);
            return;
        }

        throw new ImageWriteException("Unknown Format: " + format);
    }

}
