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
import org.apache.commons.imaging.util.Debug;

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
    public static boolean hasImageFileExtension(File file) {
        if (file==null || !file.isFile())
            return false;
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
        if(filename==null)
            return false;
        
        filename = filename.toLowerCase();

        ImageParser imageParsers[] = ImageParser.getAllImageParsers();
        for (int i = 0; i < imageParsers.length; i++) {
            ImageParser imageParser = imageParsers[i];
            String exts[] = imageParser.getAcceptedExtensions();

            for (int j = 0; j < exts.length; j++) {
                String ext = exts[j];
                if (filename.endsWith(ext.toLowerCase()))
                    return true;
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
    public static ImageFormat guessFormat(byte bytes[])
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
    public static ImageFormat guessFormat(File file) throws ImageReadException,
            IOException {
        return guessFormat(new ByteSourceFile(file));
    }

    private static final int[] MAGIC_NUMBERS_GIF = { 0x47, 0x49, };
    private static final int[] MAGIC_NUMBERS_PNG = { 0x89, 0x50, };
    private static final int[] MAGIC_NUMBERS_JPEG = { 0xff, 0xd8, };
    private static final int[] MAGIC_NUMBERS_BMP = { 0x42, 0x4d, };
    private static final int[] MAGIC_NUMBERS_TIFF_MOTOROLA = { 0x4D, 0x4D, };
    private static final int[] MAGIC_NUMBERS_TIFF_INTEL = { 0x49, 0x49, };
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

    private static boolean compareBytePair(int[] a, int b[]) {
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
    public static ImageFormat guessFormat(ByteSource byteSource)
            throws ImageReadException, IOException {
        
        if(byteSource==null)
            return ImageFormat.IMAGE_FORMAT_UNKNOWN;
        
        InputStream is = null;

        try {
            is = byteSource.getInputStream();

            int i1 = is.read();
            int i2 = is.read();
            if ((i1 < 0) || (i2 < 0))
                throw new ImageReadException(
                        "Couldn't read magic numbers to guess format.");

            int b1 = i1 & 0xff;
            int b2 = i2 & 0xff;
            int bytePair[] = { b1, b2, };

            if (compareBytePair(MAGIC_NUMBERS_GIF, bytePair)) {
                return ImageFormat.IMAGE_FORMAT_GIF;
            }
            // else if (b1 == 0x00 && b2 == 0x00) // too similar to TGA
            // {
            // return ImageFormat.IMAGE_FORMAT_ICO;
            // }
            else if (compareBytePair(MAGIC_NUMBERS_PNG, bytePair)) {
                return ImageFormat.IMAGE_FORMAT_PNG;
            } else if (compareBytePair(MAGIC_NUMBERS_JPEG, bytePair)) {
                return ImageFormat.IMAGE_FORMAT_JPEG;
            } else if (compareBytePair(MAGIC_NUMBERS_BMP, bytePair)) {
                return ImageFormat.IMAGE_FORMAT_BMP;
            } else if (compareBytePair(MAGIC_NUMBERS_TIFF_MOTOROLA, bytePair)) {
                return ImageFormat.IMAGE_FORMAT_TIFF;
            } else if (compareBytePair(MAGIC_NUMBERS_TIFF_INTEL, bytePair)) {
                return ImageFormat.IMAGE_FORMAT_TIFF;
            } else if (compareBytePair(MAGIC_NUMBERS_PSD, bytePair)) {
                return ImageFormat.IMAGE_FORMAT_PSD;
            } else if (compareBytePair(MAGIC_NUMBERS_PBM_A, bytePair)) {
                return ImageFormat.IMAGE_FORMAT_PBM;
            } else if (compareBytePair(MAGIC_NUMBERS_PBM_B, bytePair)) {
                return ImageFormat.IMAGE_FORMAT_PBM;
            } else if (compareBytePair(MAGIC_NUMBERS_PGM_A, bytePair)) {
                return ImageFormat.IMAGE_FORMAT_PGM;
            } else if (compareBytePair(MAGIC_NUMBERS_PGM_B, bytePair)) {
                return ImageFormat.IMAGE_FORMAT_PGM;
            } else if (compareBytePair(MAGIC_NUMBERS_PPM_A, bytePair)) {
                return ImageFormat.IMAGE_FORMAT_PPM;
            } else if (compareBytePair(MAGIC_NUMBERS_PPM_B, bytePair)) {
                return ImageFormat.IMAGE_FORMAT_PPM;
            } else if (compareBytePair(MAGIC_NUMBERS_JBIG2_1, bytePair)) {
                int i3 = is.read();
                int i4 = is.read();
                if ((i3 < 0) || (i4 < 0))
                    throw new ImageReadException(
                            "Couldn't read magic numbers to guess format.");

                int b3 = i3 & 0xff;
                int b4 = i4 & 0xff;
                int bytePair2[] = { b3, b4, };
                if (compareBytePair(MAGIC_NUMBERS_JBIG2_2, bytePair2)) {
                    return ImageFormat.IMAGE_FORMAT_JBIG2;
                }
            } else if (compareBytePair(MAGIC_NUMBERS_ICNS, bytePair)) {
                return ImageFormat.IMAGE_FORMAT_ICNS;
            } else if (compareBytePair(MAGIC_NUMBERS_DCX, bytePair)) {
                return ImageFormat.IMAGE_FORMAT_DCX;
            } else if (compareBytePair(MAGIC_NUMBERS_RGBE, bytePair)) {
                return ImageFormat.IMAGE_FORMAT_RGBE;
            }

            return ImageFormat.IMAGE_FORMAT_UNKNOWN;
        } finally {
            if (is != null) {
                try {
                    is.close();

                } catch (IOException e) {
                    Debug.debug(e);

                }
            }
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
    public static ICC_Profile getICCProfile(byte bytes[])
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
    public static ICC_Profile getICCProfile(byte bytes[], Map params)
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
    public static ICC_Profile getICCProfile(InputStream is, String filename)
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
    public static ICC_Profile getICCProfile(InputStream is, String filename,
            Map params) throws ImageReadException, IOException {
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
    public static ICC_Profile getICCProfile(File file)
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
    public static ICC_Profile getICCProfile(File file, Map params)
            throws ImageReadException, IOException {
        return getICCProfile(new ByteSourceFile(file), params);
    }

    protected static ICC_Profile getICCProfile(ByteSource byteSource, Map params)
            throws ImageReadException, IOException {
        byte bytes[] = getICCProfileBytes(byteSource, params);
        if (bytes == null)
            return null;

        IccProfileParser parser = new IccProfileParser();
        IccProfileInfo info = parser.getICCProfileInfo(bytes);
        if (info == null)
            return null;
        if (info.issRGB())
            return null;

        ICC_Profile icc = ICC_Profile.getInstance(bytes);
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
    public static byte[] getICCProfileBytes(byte bytes[])
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
    public static byte[] getICCProfileBytes(byte bytes[], Map params)
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
    public static byte[] getICCProfileBytes(File file)
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
    public static byte[] getICCProfileBytes(File file, Map params)
            throws ImageReadException, IOException {
        return getICCProfileBytes(new ByteSourceFile(file), params);
    }

    private static byte[] getICCProfileBytes(ByteSource byteSource, Map params)
            throws ImageReadException, IOException {
        ImageParser imageParser = getImageParser(byteSource);

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
    public static ImageInfo getImageInfo(String filename, byte bytes[],
            Map params) throws ImageReadException, IOException {
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
    public static ImageInfo getImageInfo(String filename, byte bytes[])
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
    public static ImageInfo getImageInfo(InputStream is, String filename)
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
    public static ImageInfo getImageInfo(InputStream is, String filename,
            Map params) throws ImageReadException, IOException {
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
    public static ImageInfo getImageInfo(byte bytes[])
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
    public static ImageInfo getImageInfo(byte bytes[], Map params)
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
    public static ImageInfo getImageInfo(File file, Map params)
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
    public static ImageInfo getImageInfo(File file) throws ImageReadException,
            IOException {
        return getImageInfo(file, null);
    }

    private static ImageInfo getImageInfo(ByteSource byteSource, Map params)
            throws ImageReadException, IOException {
        ImageParser imageParser = getImageParser(byteSource);

        ImageInfo imageInfo = imageParser.getImageInfo(byteSource, params);

        return imageInfo;
    }

    private static ImageParser getImageParser(ByteSource byteSource)
            throws ImageReadException, IOException {
        ImageFormat format = guessFormat(byteSource);
        if (!format.equals(ImageFormat.IMAGE_FORMAT_UNKNOWN)) {

            ImageParser imageParsers[] = ImageParser.getAllImageParsers();

            for (int i = 0; i < imageParsers.length; i++) {
                ImageParser imageParser = imageParsers[i];

                if (imageParser.canAcceptType(format))
                    return imageParser;
            }
        }

        String filename = byteSource.getFilename();
        if (filename != null) {
            ImageParser imageParsers[] = ImageParser.getAllImageParsers();

            for (int i = 0; i < imageParsers.length; i++) {
                ImageParser imageParser = imageParsers[i];

                if (imageParser.canAcceptExtension(filename))
                    return imageParser;
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
    public static Dimension getImageSize(InputStream is, String filename)
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
    public static Dimension getImageSize(InputStream is, String filename,
            Map params) throws ImageReadException, IOException {
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
    public static Dimension getImageSize(byte bytes[])
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
    public static Dimension getImageSize(byte bytes[], Map params)
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
    public static Dimension getImageSize(File file) throws ImageReadException,
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
    public static Dimension getImageSize(File file, Map params)
            throws ImageReadException, IOException {
        return getImageSize(new ByteSourceFile(file), params);
    }

    public static Dimension getImageSize(ByteSource byteSource, Map params)
            throws ImageReadException, IOException {
        ImageParser imageParser = getImageParser(byteSource);

        return imageParser.getImageSize(byteSource, params);
    }

    /**
     * Determines the width and height of an image.
     * <p>
     * 
     * @param is
     *            InputStream from which to read image data.
     * @param filename
     *            Filename associated with image data (optional).
     * @return Xmp Xml as String, if present. Otherwise, returns null.
     */
    public static String getXmpXml(InputStream is, String filename)
            throws ImageReadException, IOException {
        return getXmpXml(is, filename, null);
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
     * @return Xmp Xml as String, if present. Otherwise, returns null.
     */
    public static String getXmpXml(InputStream is, String filename, Map params)
            throws ImageReadException, IOException {
        return getXmpXml(new ByteSourceInputStream(is, filename), params);
    }

    /**
     * Determines the width and height of an image.
     * <p>
     * 
     * @param bytes
     *            Byte array containing an image file.
     * @return Xmp Xml as String, if present. Otherwise, returns null.
     */
    public static String getXmpXml(byte bytes[]) throws ImageReadException,
            IOException {
        return getXmpXml(bytes, null);
    }

    /**
     * Determines the width and height of an image.
     * <p>
     * 
     * @param bytes
     *            Byte array containing an image file.
     * @param params
     *            Map of optional parameters, defined in ImagingConstants.
     * @return Xmp Xml as String, if present. Otherwise, returns null.
     */
    public static String getXmpXml(byte bytes[], Map params)
            throws ImageReadException, IOException {
        return getXmpXml(new ByteSourceArray(bytes), params);
    }

    /**
     * Extracts embedded XML metadata as XML string.
     * <p>
     * 
     * @param file
     *            File containing image data.
     * @return Xmp Xml as String, if present. Otherwise, returns null.
     */
    public static String getXmpXml(File file) throws ImageReadException,
            IOException {
        return getXmpXml(file, null);
    }

    /**
     * Extracts embedded XML metadata as XML string.
     * <p>
     * 
     * @param file
     *            File containing image data.
     * @param params
     *            Map of optional parameters, defined in ImagingConstants.
     * @return Xmp Xml as String, if present. Otherwise, returns null.
     */
    public static String getXmpXml(File file, Map params)
            throws ImageReadException, IOException {
        return getXmpXml(new ByteSourceFile(file), params);
    }

    /**
     * Extracts embedded XML metadata as XML string.
     * <p>
     * 
     * @param byteSource
     *            File containing image data.
     * @param params
     *            Map of optional parameters, defined in ImagingConstants.
     * @return Xmp Xml as String, if present. Otherwise, returns null.
     */
    public static String getXmpXml(ByteSource byteSource, Map params)
            throws ImageReadException, IOException {
        ImageParser imageParser = getImageParser(byteSource);

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
    public static IImageMetadata getMetadata(byte bytes[])
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
    public static IImageMetadata getMetadata(byte bytes[], Map params)
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
    public static IImageMetadata getMetadata(InputStream is, String filename)
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
    public static IImageMetadata getMetadata(InputStream is, String filename,
            Map params) throws ImageReadException, IOException {
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
    public static IImageMetadata getMetadata(File file)
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
    public static IImageMetadata getMetadata(File file, Map params)
            throws ImageReadException, IOException {
        return getMetadata(new ByteSourceFile(file), params);
    }

    private static IImageMetadata getMetadata(ByteSource byteSource, Map params)
            throws ImageReadException, IOException {
        ImageParser imageParser = getImageParser(byteSource);

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
    public static String dumpImageFile(byte bytes[]) throws ImageReadException,
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
    public static String dumpImageFile(File file) throws ImageReadException,
            IOException {
        return dumpImageFile(new ByteSourceFile(file));
    }

    private static String dumpImageFile(ByteSource byteSource)
            throws ImageReadException, IOException {
        ImageParser imageParser = getImageParser(byteSource);

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
    public static FormatCompliance getFormatCompliance(byte bytes[])
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
    public static FormatCompliance getFormatCompliance(File file)
            throws ImageReadException, IOException {
        return getFormatCompliance(new ByteSourceFile(file));
    }

    private static FormatCompliance getFormatCompliance(ByteSource byteSource)
            throws ImageReadException, IOException {
        ImageParser imageParser = getImageParser(byteSource);

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
    public static List<BufferedImage> getAllBufferedImages(InputStream is,
            String filename) throws ImageReadException, IOException {
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
    public static List<BufferedImage> getAllBufferedImages(byte bytes[])
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
    public static List<BufferedImage> getAllBufferedImages(File file)
            throws ImageReadException, IOException {
        return getAllBufferedImages(new ByteSourceFile(file));
    }

    
    private static List<BufferedImage> getAllBufferedImages(
            ByteSource byteSource) throws ImageReadException, IOException {
        ImageParser imageParser = getImageParser(byteSource);

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

    public static BufferedImage getBufferedImage(InputStream is)
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
    public static BufferedImage getBufferedImage(InputStream is, Map params)
            throws ImageReadException, IOException {
        String filename = null;
        if (params != null && params.containsKey(PARAM_KEY_FILENAME))
            filename = (String) params.get(PARAM_KEY_FILENAME);
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
    public static BufferedImage getBufferedImage(byte bytes[])
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
    

    public static BufferedImage getBufferedImage(byte bytes[], Map params)
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
    public static BufferedImage getBufferedImage(File file)
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
    public static BufferedImage getBufferedImage(File file, Map params)
            throws ImageReadException, IOException {
        return getBufferedImage(new ByteSourceFile(file), params);
    }

    
    
    private static BufferedImage getBufferedImage(ByteSource byteSource,
            Map params) throws ImageReadException, IOException {
        ImageParser imageParser = getImageParser(byteSource);
        if (null == params)
            params = new HashMap();

        return imageParser.getBufferedImage(byteSource, params);
    }

    /**
     * Writes a BufferedImage to a file.
     * <p>
     * (TODO: elaborate here.)
     * <p>
     * Sanselan can only read image info, metadata and ICC profiles from all
     * image formats. However, note that the library cannot currently read or
     * write JPEG image data. PSD (Photoshop) files can only be partially read
     * and cannot be written. All other formats (PNG, GIF, TIFF, BMP, etc.) are
     * fully supported.
     * <p>
     * 
     * @param src
     *            The BufferedImage to be written.
     * @param file
     *            File to write to.
     * @param format
     *            The ImageFormat to use.
     * @param params
     *            Map of optional parameters, defined in ImagingConstants.
     * @see ImagingConstants
     */
    
    

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
    public static void writeImage(BufferedImage src, File file,
            ImageFormat format, Map params) throws ImageWriteException,
            IOException {
        OutputStream os = null;

        try {
            os = new FileOutputStream(file);
            os = new BufferedOutputStream(os);

            writeImage(src, os, format, params);
        } finally {
            try {
                if (os != null)
                    os.close();
            } catch (Exception e) {
                Debug.debug(e);
            }
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
    public static byte[] writeImageToBytes(BufferedImage src,
            ImageFormat format, Map params) throws ImageWriteException,
            IOException {
        ByteArrayOutputStream os = new ByteArrayOutputStream();

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
    public static void writeImage(BufferedImage src, OutputStream os,
            ImageFormat format, Map params) throws ImageWriteException,
            IOException {
        ImageParser imageParsers[] = ImageParser.getAllImageParsers();

        // make sure params are non-null
        if (params == null)
            params = new HashMap();

        params.put(PARAM_KEY_FORMAT, format);

        for (int i = 0; i < imageParsers.length; i++) {
            ImageParser imageParser = imageParsers[i];

            if (!imageParser.canAcceptType(format))
                continue;

            imageParser.writeImage(src, os, params);
            return;
        }

        throw new ImageWriteException("Unknown Format: " + format);
    }

}
