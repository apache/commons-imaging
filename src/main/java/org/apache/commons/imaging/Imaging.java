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
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Stream;

import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.XmpEmbeddable;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.icc.IccProfileInfo;
import org.apache.commons.imaging.icc.IccProfileParser;
import org.apache.commons.imaging.internal.ImageParserFactory;

/**
 * The primary application programming interface (API) to the Imaging library.
 *
 * <h2>Application Notes</h2>
 *
 * <h3>Using this class</h3>
 *
 * <p>Almost all of the Apache Commons Imaging library's core functionality can
 * be accessed through the methods provided by this class.
 * The use of the Imaging class is similar to the Java API's ImageIO class,
 * though Imaging supports formats not included in the standard Java API.</p>
 *
 * <p>All of methods provided by the Imaging class are declared static.</p>
 *
 * <p>The Apache Commons Imaging package is a pure Java implementation.</p>
 *
 * <h3>Format support</h3>
 *
 * <p>While the Apache Commons Imaging package handles a number of different
 * graphics formats, support for some formats is not yet complete.
 * For the most recent information on support for specific formats, refer to
 * <a href="https://commons.apache.org/imaging/formatsupport.html">Format Support</a>
 * at the main project development web site.</p>
 *
 * <h3>Optional parameters for image reading and writing</h3>
 *
 * <p>Many of the operations provided in this class as static calls can be accessed directly
 * using format-specific {@link ImageParser} instances. These static methods are provided
 * for convenience in simple use cases.</p>
 *
 * <h3>Example code</h3>
 *
 * <p>See the source of the SampleUsage class and other classes in the
 * org.apache.commons.imaging.examples package for examples.</p>
 *
 * @see <a
 *      href="https://svn.apache.org/repos/asf/commons/proper/imaging/trunk/src/test/java/org/apache/commons/imaging/examples/SampleUsage.java">org.apache.commons.imaging.examples.SampleUsage</a>
 * @see <a href="https://commons.apache.org/imaging/formatsupport.html">Format Support</a>
 */
public final class Imaging {

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

    private static boolean compareBytePair(final int[] a, final int[] b) {
        if (a.length != 2 && b.length != 2) {
            throw new IllegalArgumentException("Invalid Byte Pair.");
        }
        return (a[0] == b[0]) && (a[1] == b[1]);
    }

    /**
     * Write the ImageInfo and format-specific information for the image content of the specified byte array to a string.
     *
     * @param bytes A valid array of bytes.
     * @return A valid string.
     * @throws ImagingException In the event that the specified content does not conform to the format of the specific parser implementation.
     * @throws IOException In the event of unsuccessful read or access operation.
     */
    public static String dumpImageFile(final byte[] bytes) throws ImagingException, IOException {
        return dumpImageFile(ByteSource.array(bytes));
    }

    private static String dumpImageFile(final ByteSource byteSource) throws ImagingException, IOException {
        final ImageParser<?> imageParser = ImageParserFactory.getImageParser(byteSource);
        return imageParser.dumpImageFile(byteSource);
    }

    /**
     * Write the ImageInfo and format-specific information for the image content of the specified file to a string.
     *
     * @param file A valid file reference.
     * @return A valid string.
     * @throws ImagingException In the event that the specified content does not conform to the format of the specific parser implementation.
     * @throws IOException In the event of unsuccessful read or access operation.
     */
    public static String dumpImageFile(final File file) throws ImagingException, IOException {
        return dumpImageFile(ByteSource.file(file));
    }

    /**
     * Gets all images specified by the byte array (some formats may include multiple images within a single data source).
     *
     * @param bytes a valid array of bytes
     * @return A valid (potentially empty) list of BufferedImage objects.
     * @throws ImagingException In the event that the specified content does not conform to the format of the specific parser implementation.
     * @throws IOException In the event of unsuccessful read or access operation.
     */
    public static List<BufferedImage> getAllBufferedImages(final byte[] bytes) throws ImagingException, IOException {
        return getAllBufferedImages(ByteSource.array(bytes));
    }

    private static List<BufferedImage> getAllBufferedImages(final ByteSource byteSource) throws ImagingException, IOException {
        final ImageParser<?> imageParser = ImageParserFactory.getImageParser(byteSource);
        return imageParser.getAllBufferedImages(byteSource);
    }

    /**
     * Gets all images specified by the file (some formats may include multiple images within a single data source).
     *
     * @param file A reference to a valid data file.
     * @return A valid (potentially empty) list of BufferedImage objects.
     * @throws ImagingException In the event that the specified content does not conform to the format of the specific parser implementation.
     * @throws IOException In the event of unsuccessful read or access operation.
     */
    public static List<BufferedImage> getAllBufferedImages(final File file) throws ImagingException, IOException {
        return getAllBufferedImages(ByteSource.file(file));
    }

    /**
     * Gets all images specified by the InputStream  (some formats may include multiple images within a single data source).
     *
     * @param is A valid InputStream
     * @param fileName Filename associated with image data (optional).
     * @return A valid (potentially empty) list of BufferedImage objects.
     * @throws ImagingException In the event that the specified content does not conform to the format of the specific parser implementation.
     * @throws IOException In the event of unsuccessful read or access operation.
     */
    public static List<BufferedImage> getAllBufferedImages(final InputStream is, final String fileName) throws ImagingException, IOException {
        return getAllBufferedImages(ByteSource.inputStream(is, fileName));
    }

    /**
     * Reads the first image from a byte array.
     *
     * <p>For the most recent information on support for specific formats, refer to
     * <a href="https://commons.apache.org/imaging/formatsupport.html">Format Support</a>
     * at the main project development web site.   While the Apache Commons
     * Imaging package does not fully support all formats, it  can read
     * image info, metadata and ICC profiles from all image formats that
     * provide this data.</p>
     *
     * @param bytes a valid array of bytes from which to read data.
     * @return if successful, a valid buffered image
     * @throws ImagingException in the event of a processing error while reading an image (i.e. a format violation, etc.).
     * @throws IOException in the event of an unrecoverable I/O exception.
     */
    public static BufferedImage getBufferedImage(final byte[] bytes) throws ImagingException, IOException {
        return getBufferedImage(ByteSource.array(bytes));
    }

    private static BufferedImage getBufferedImage(final ByteSource byteSource) throws ImagingException, IOException {
        final ImageParser<?> imageParser = ImageParserFactory.getImageParser(byteSource);
        return imageParser.getBufferedImage(byteSource, null);
    }

    /**
     * Reads the first image from a file.
     *
     * <p>For the most recent information on support for specific formats, refer to
     * <a href="https://commons.apache.org/imaging/formatsupport.html">Format Support</a>
     * at the main project development web site.   While the Apache Commons
     * Imaging package does not fully support all formats, it  can read
     * image info, metadata and ICC profiles from all image formats that
     * provide this data.</p>
     *
     * @param file a valid reference to a file containing image data.
     * @return if successful, a valid buffered image
     * @throws ImagingException in the event of a processing error while reading an image (i.e. a format violation, etc.).
     * @throws IOException  in the event of an unrecoverable I/O exception.
     */
    public static BufferedImage getBufferedImage(final File file) throws ImagingException, IOException {
        return getBufferedImage(ByteSource.file(file));
    }

    /**
     * Reads the first image from an InputStream.
     *
     * <p>For the most recent information on support for specific formats, refer to
     * <a href="https://commons.apache.org/imaging/formatsupport.html">Format Support</a>
     * at the main project development web site.   While the Apache Commons
     * Imaging package does not fully support all formats, it  can read
     * image info, metadata and ICC profiles from all image formats that
     * provide this data.</p>
     *
     * @param is a valid ImageStream from which to read data.
     * @return if successful, a valid buffered image
     * @throws ImagingException in the event of a processing errorfileName while reading an image (i.e. a format violation, etc.).
     * @throws IOException  in the event of an unrecoverable I/O exception.
     */
    public static BufferedImage getBufferedImage(final InputStream is) throws ImagingException, IOException {
        return getBufferedImage(is, null);
    }

    /**
     * Reads the first image from an InputStream.
     *
     * <p>For the most recent information on support for specific formats, refer to
     * <a href="https://commons.apache.org/imaging/formatsupport.html">Format Support</a>
     * at the main project development web site.   While the Apache Commons
     * Imaging package does not fully support all formats, it  can read
     * image info, metadata and ICC profiles from all image formats that
     * provide this data.</p>
     *
     * @param is a valid ImageStream from which to read data.
     * @param fileName the image file name.
     * @return if successful, a valid buffered image
     * @throws ImagingException in the event of a processing error while reading an image (i.e. a format violation, etc.).
     * @throws IOException  in the event of an unrecoverable I/O exception.
     */
    public static BufferedImage getBufferedImage(final InputStream is, final String fileName) throws ImagingException, IOException {
        return getBufferedImage(ByteSource.inputStream(is, fileName));
    }

    /**
     * Attempts to determine the image format of the specified data and evaluates its format compliance.
     *
     * <p>This method returns a FormatCompliance object which includes information about the data's compliance to a specific format.</p>
     *
     * @param bytes a valid array of bytes containing image data.
     * @return if successful, a valid FormatCompliance object.
     * @throws ImagingException in the event of unreadable data.
     * @throws IOException in the event of an unrecoverable I/O condition.
     */
    public static FormatCompliance getFormatCompliance(final byte[] bytes) throws ImagingException, IOException {
        return getFormatCompliance(ByteSource.array(bytes));
    }

    private static FormatCompliance getFormatCompliance(final ByteSource byteSource) throws ImagingException, IOException {
        final ImageParser<?> imageParser = ImageParserFactory.getImageParser(byteSource);
        return imageParser.getFormatCompliance(byteSource);
    }

    /**
     * Attempts to determine the image format of the specified data and
     * evaluates its format compliance.   This method
     * returns a FormatCompliance object which includes information
     * about the data's compliance to a specific format.
     *
     * @param file valid file containing image data
     * @return if successful, a valid FormatCompliance object.
     * @throws ImagingException in the event of unreadable data.
     * @throws IOException in the event of an unrecoverable I/O condition.
     */
    public static FormatCompliance getFormatCompliance(final File file) throws ImagingException, IOException {
        return getFormatCompliance(ByteSource.file(file));
    }

    /**
     * Extracts an ICC Profile (if present) from JPEG, PNG, PSD (Photoshop) and TIFF images.
     *
     * @param bytes Byte array containing an image file.
     * @return An instance of ICC_Profile or null if the image contains no ICC profile.
     * @throws ImagingException if it fails to parse the image
     * @throws IOException if it fails to read the image data
     */
    public static ICC_Profile getICCProfile(final byte[] bytes) throws ImagingException, IOException {
        return getICCProfile(ByteSource.array(bytes));
    }

    protected static ICC_Profile getICCProfile(final ByteSource byteSource) throws ImagingException, IOException {
        final byte[] bytes = getICCProfileBytes(byteSource);
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

        return ICC_Profile.getInstance(bytes);
    }

    /**
     * Extracts an ICC Profile (if present) from JPEG, PNG, PSD (Photoshop) and TIFF images.
     *
     * @param file File containing image data.
     * @return An instance of ICC_Profile or null if the image contains no ICC profile.
     * @throws ImagingException if it fails to parse the image
     * @throws IOException if it fails to read the image data
     */
    public static ICC_Profile getICCProfile(final File file) throws ImagingException, IOException {
        return getICCProfile(ByteSource.file(file));
    }

    /**
     * Extracts an ICC Profile (if present) from JPEG, PNG, PSD (Photoshop) and TIFF images.
     *
     * @param is InputStream from which to read image data.
     * @param fileName Filename associated with image data (optional).
     * @return An instance of ICC_Profile or null if the image contains no ICC profile.
     * @throws ImagingException if it fails to parse the image
     * @throws IOException if it fails to read the image data
     */
    public static ICC_Profile getICCProfile(final InputStream is, final String fileName) throws ImagingException, IOException {
        return getICCProfile(ByteSource.inputStream(is, fileName));
    }

    /**
     * Extracts the raw bytes of an ICC Profile (if present) from JPEG, PNG, PSD
     * (Photoshop) and TIFF images.
     *
     * <p>To parse the result use IccProfileParser or
     * ICC_Profile.getInstance(bytes).</p>
     *
     * @param bytes
     *            Byte array containing an image file.
     * @return A byte array.
     * @see IccProfileParser
     * @see ICC_Profile
     * @throws ImagingException if it fails to parse the image
     * @throws IOException if it fails to read the image data
     */
    public static byte[] getICCProfileBytes(final byte[] bytes) throws ImagingException, IOException {
        return getICCProfileBytes(ByteSource.array(bytes));
    }

    private static byte[] getICCProfileBytes(final ByteSource byteSource) throws ImagingException, IOException {
        final ImageParser<?> imageParser = ImageParserFactory.getImageParser(byteSource);
        return imageParser.getICCProfileBytes(byteSource, null);
    }

    /**
     * Extracts the raw bytes of an ICC Profile (if present) from JPEG, PNG, PSD
     * (Photoshop) and TIFF images.
     *
     * <p>To parse the result use IccProfileParser or
     * ICC_Profile.getInstance(bytes).</p>
     *
     * @param file
     *            File containing image data.
     * @return A byte array.
     * @see IccProfileParser
     * @see ICC_Profile
     * @throws ImagingException if it fails to parse the image
     * @throws IOException if it fails to read the image data
     */
    public static byte[] getICCProfileBytes(final File file) throws ImagingException, IOException {
        return getICCProfileBytes(ByteSource.file(file));
    }

    /**
     * Parses the "image info" of an image.
     *
     * <p>"Image info" is a summary of basic information about the image such as:
     * width, height, file format, bit depth, color type, etc.</p>
     *
     * <p>Not to be confused with "image metadata."</p>
     *
     * @param bytes Byte array containing an image file.
     * @return An instance of ImageInfo.
     * @see ImageInfo
     * @throws ImagingException if it fails to parse the image
     * @throws IOException if it fails to read the image data
     */
    public static ImageInfo getImageInfo(final byte[] bytes) throws ImagingException, IOException {
        return getImageInfo(ByteSource.array(bytes));
    }

    private static ImageInfo getImageInfo(final ByteSource byteSource) throws ImagingException, IOException {
        return ImageParserFactory.getImageParser(byteSource).getImageInfo(byteSource, null);
    }

    /**
     * Parses the "image info" of an image file.
     *
     * <p>"Image info" is a summary of basic information about the image such as:
     * width, height, file format, bit depth, color type, etc.</p>
     *
     * <p>Not to be confused with "image metadata."</p>
     *
     * @param file File containing image data.
     * @return An instance of ImageInfo.
     * @see ImageInfo
     * @throws ImagingException if it fails to parse the image
     * @throws IOException if it fails to read the image data
     */
    public static ImageInfo getImageInfo(final File file) throws ImagingException, IOException {
        return getImageInfo(ByteSource.file(file));
    }

    /**
     * Parses the "image info" of an image.
     *
     * <p>"Image info" is a summary of basic information about the image such as:
     * width, height, file format, bit depth, color type, etc.</p>
     *
     * <p>Not to be confused with "image metadata."</p>
     *
     * @param is InputStream from which to read image data.
     * @param fileName Filename associated with image data (optional).
     * @return An instance of ImageInfo.
     * @see ImageInfo
     * @throws ImagingException if it fails to parse the image
     * @throws IOException if it fails to read the image data
     */
    public static ImageInfo getImageInfo(final InputStream is, final String fileName) throws ImagingException, IOException {
        return getImageInfo(ByteSource.inputStream(is, fileName));
    }

    /**
     * Parses the "image info" of an image.
     *
     * <p>"Image info" is a summary of basic information about the image such as:
     * width, height, file format, bit depth, color type, etc.</p>
     *
     * <p>Not to be confused with "image metadata."</p>
     *
     * @param fileName String.
     * @param bytes Byte array containing an image file.
     * @return An instance of ImageInfo.
     * @see ImageInfo
     * @throws ImagingException if it fails to parse the image
     * @throws IOException if it fails to read the image data
     */
    public static ImageInfo getImageInfo(final String fileName, final byte[] bytes) throws ImagingException, IOException {
        return getImageInfo(ByteSource.array(bytes, fileName));
    }

    /**
     * Determines the width and height of an image.
     *
     * @param bytes Byte array containing an image file.
     * @return The width and height of the image.
     * @throws ImagingException if it fails to parse the image
     * @throws IOException if it fails to read the image data
     */
    public static Dimension getImageSize(final byte[] bytes) throws ImagingException, IOException {
        return getImageSize(ByteSource.array(bytes));
    }

    /**
     * Determines the width and height of an image byte source.
     *
     * @param byteSource Byte source data.
     * @return The width and height of the image.
     * @throws ImagingException if it fails to parse the image
     * @throws IOException if it fails to read the image data
     */
    public static Dimension getImageSize(final ByteSource byteSource) throws ImagingException, IOException {
        final ImageParser<?> imageParser = ImageParserFactory.getImageParser(byteSource);
        return imageParser.getImageSize(byteSource, null);
    }

    /**
     * Determines the width and height of an image file.
     *
     * @param file File containing image data.
     * @return The width and height of the image.
     * @throws ImagingException if it fails to parse the image
     * @throws IOException if it fails to read the image data
     */
    public static Dimension getImageSize(final File file) throws ImagingException, IOException {
        return getImageSize(ByteSource.file(file));
    }

    /**
     * Determines the width and height of an image.
     *
     * @param is InputStream from which to read image data.
     * @param fileName Filename associated with image data (optional).
     * @return The width and height of the image.
     * @throws ImagingException if it fails to parse the image
     * @throws IOException if it fails to read the image data
     */
    public static Dimension getImageSize(final InputStream is, final String fileName) throws ImagingException, IOException {
        return getImageSize(ByteSource.inputStream(is, fileName));
    }

    /**
     * Parses the metadata of an image. This metadata depends on the format of the image.
     *
     * <p>JPEG/JFIF files may contain EXIF and/or IPTC metadata. PNG files may
     * contain comments. TIFF files may contain metadata.</p>
     *
     * <p>The instance of IImageMetadata returned by getMetadata() should be upcast
     * (depending on image format).</p>
     *
     * <p>Not to be confused with "image info."</p>
     *
     * @param bytes Byte array containing an image file.
     * @return An instance of ImageMetadata.
     * @see org.apache.commons.imaging.common.ImageMetadata
     * @throws ImagingException if it fails to read the image metadata
     * @throws IOException if it fails to read the image data
     */
    public static ImageMetadata getMetadata(final byte[] bytes) throws ImagingException, IOException {
        return getMetadata(ByteSource.array(bytes));
    }

    private static ImageMetadata getMetadata(final ByteSource byteSource) throws ImagingException, IOException {
        final ImageParser<?> imageParser = ImageParserFactory.getImageParser(byteSource);
        return imageParser.getMetadata(byteSource, null);
    }

    /**
     * Parses the metadata of an image file. This metadata depends on the format of the image.
     *
     * <p>JPEG/JFIF files may contain EXIF and/or IPTC metadata. PNG files may
     * contain comments. TIFF files may contain metadata.</p>
     *
     * <p>The instance of IImageMetadata returned by getMetadata() should be upcast
     * (depending on image format).</p>
     *
     * <p>Not to be confused with "image info."</p>
     *
     * @param file File containing image data.
     * @return An instance of IImageMetadata.
     * @see org.apache.commons.imaging.common.ImageMetadata
     * @throws ImagingException if it fails to read the image metadata
     * @throws IOException if it fails to read the image data
     */
    public static ImageMetadata getMetadata(final File file) throws ImagingException, IOException {
        return getMetadata(ByteSource.file(file));
    }

    /**
     * Parses the metadata of an image file. This metadata depends on the format of the image.
     *
     * <p>JPEG/JFIF files may contain EXIF and/or IPTC metadata. PNG files may
     * contain comments. TIFF files may contain metadata.</p>
     *
     * <p>The instance of IImageMetadata returned by getMetadata() should be upcast (depending on image format).</p>
     *
     * <p>Not to be confused with "image info."</p>
     *
     * @param is InputStream from which to read image data.
     * @param fileName Filename associated with image data (optional).
     * @return An instance of IImageMetadata.
     * @see org.apache.commons.imaging.common.ImageMetadata
     * @throws ImagingException if it fails to read the image metadata
     * @throws IOException if it fails to read the image data
     */
    public static ImageMetadata getMetadata(final InputStream is, final String fileName) throws ImagingException, IOException {
        return getMetadata(ByteSource.inputStream(is, fileName));
    }

    /**
     * Extracts the embedded XML metadata as an XML string.
     *
     * @param bytes Byte array containing an image file.
     * @return Xmp Xml as String, if present. Otherwise, returns null.
     * @throws ImagingException if it fails to parse the image
     * @throws IOException if it fails to read the image data
     */
    public static String getXmpXml(final byte[] bytes) throws ImagingException, IOException {
        return getXmpXml(ByteSource.array(bytes));
    }

    /**
     * Extracts the embedded XML metadata as an XML string.
     *
     * @param byteSource File containing image data.
     * @return Xmp Xml as String, if present. Otherwise, returns null.
     * @throws ImagingException if it fails to parse the image
     * @throws IOException if it fails to read the image data
     */
    public static String getXmpXml(final ByteSource byteSource) throws ImagingException, IOException {
        final ImageParser<?> imageParser = ImageParserFactory.getImageParser(byteSource);
        if (imageParser instanceof XmpEmbeddable) {
            return ((XmpEmbeddable<?>) imageParser).getXmpXml(byteSource, null);
        }
        return null;
    }

    /**
     * Extracts the embedded XML metadata as an XML string.
     *
     * @param file File containing image data.
     * @return Xmp Xml as String, if present. Otherwise, returns null.
     * @throws ImagingException if it fails to parse the image
     * @throws IOException if it fails to read the image data
     */
    public static String getXmpXml(final File file) throws ImagingException, IOException {
        return getXmpXml(ByteSource.file(file));
    }

    /**
     * Extracts the embedded XML metadata as an XML string.
     *
     * @param is InputStream from which to read image data.
     * @param fileName Filename associated with image data (optional).
     * @return Xmp Xml as String, if present. Otherwise, returns null.
     * @throws ImagingException if it fails to parse the image
     * @throws IOException if it fails to read the image data
     */
    public static String getXmpXml(final InputStream is, final String fileName) throws ImagingException, IOException {
        return getXmpXml(ByteSource.inputStream(is, fileName));
    }

    /**
     * Attempts to determine the image format of a file based on its "magic numbers," the first bytes of the data.
     *
     * <p>Many graphics format specify identifying byte
     * values that appear at the beginning of the data file.  This method
     * checks for such identifying elements and returns a ImageFormat
     * enumeration indicating what it detects. Note that this
     * method can return "false positives" in cases where non-image files
     * begin with the specified byte values.</p>
     *
     * @param bytes  Byte array containing an image file.
     * @return An ImageFormat, such as ImageFormat.IMAGE_FORMAT_JPEG. Returns ImageFormat.IMAGE_FORMAT_UNKNOWN if the image type cannot be determined.
     * @throws IOException in the event of an unrecoverable I/O condition.
     */
    public static ImageFormat guessFormat(final byte[] bytes) throws IOException {
        return guessFormat(ByteSource.array(bytes));
    }

    /**
     * Attempts to determine the image format of a file based on its "magic numbers," the first bytes of the data.
     *
     * <p>Many graphics formats specify identifying byte
     * values that appear at the beginning of the data file.  This method
     * checks for such identifying elements and returns a ImageFormat
     * enumeration indicating what it detects. Note that this
     * method can return "false positives" in cases where non-image files
     * begin with the specified byte values.</p>
     *
     * @param byteSource a valid ByteSource object potentially supplying data for an image.
     * @return An ImageFormat, such as ImageFormat.IMAGE_FORMAT_JPEG. Returns ImageFormat.IMAGE_FORMAT_UNKNOWN if the image type cannot be determined.
     * @throws IllegalArgumentException in the event of an unsuccessful attempt to read the image data
     * @throws IOException in the event of an unrecoverable I/O condition.
     */
    public static ImageFormat guessFormat(final ByteSource byteSource) throws IOException {
        if (byteSource == null) {
            return ImageFormats.UNKNOWN;
        }

        try (InputStream is = byteSource.getInputStream()) {
            final int i1 = is.read();
            final int i2 = is.read();
            if ((i1 < 0) || (i2 < 0)) {
                throw new IllegalArgumentException("Couldn't read magic numbers to guess format.");
            }

            final int b1 = i1 & 0xff;
            final int b2 = i2 & 0xff;
            final int[] bytePair = { b1, b2, };

            if (compareBytePair(MAGIC_NUMBERS_GIF, bytePair)) {
                return ImageFormats.GIF;
            // } else if (b1 == 0x00 && b2 == 0x00) // too similar to TGA
            // {
            // return ImageFormat.IMAGE_FORMAT_ICO;
            }
            if (compareBytePair(MAGIC_NUMBERS_PNG, bytePair)) {
                return ImageFormats.PNG;
            }
            if (compareBytePair(MAGIC_NUMBERS_JPEG, bytePair)) {
                return ImageFormats.JPEG;
            }
            if (compareBytePair(MAGIC_NUMBERS_BMP, bytePair)) {
                return ImageFormats.BMP;
            }
            if (compareBytePair(MAGIC_NUMBERS_TIFF_MOTOROLA, bytePair)) {
                return ImageFormats.TIFF;
            }
            if (compareBytePair(MAGIC_NUMBERS_TIFF_INTEL, bytePair)) {
                return ImageFormats.TIFF;
            }
            if (compareBytePair(MAGIC_NUMBERS_PSD, bytePair)) {
                return ImageFormats.PSD;
            }
            if (compareBytePair(MAGIC_NUMBERS_PAM, bytePair)) {
                return ImageFormats.PAM;
            }
            if (compareBytePair(MAGIC_NUMBERS_PBM_A, bytePair)) {
                return ImageFormats.PBM;
            }
            if (compareBytePair(MAGIC_NUMBERS_PBM_B, bytePair)) {
                return ImageFormats.PBM;
            }
            if (compareBytePair(MAGIC_NUMBERS_PGM_A, bytePair)) {
                return ImageFormats.PGM;
            }
            if (compareBytePair(MAGIC_NUMBERS_PGM_B, bytePair)) {
                return ImageFormats.PGM;
            }
            if (compareBytePair(MAGIC_NUMBERS_PPM_A, bytePair)) {
                return ImageFormats.PPM;
            }
            if (compareBytePair(MAGIC_NUMBERS_PPM_B, bytePair)) {
                return ImageFormats.PPM;
            }
            if (compareBytePair(MAGIC_NUMBERS_JBIG2_1, bytePair)) {
                final int i3 = is.read();
                final int i4 = is.read();
                if ((i3 < 0) || (i4 < 0)) {
                    throw new IllegalArgumentException("Couldn't read magic numbers to guess format.");
                }

                final int b3 = i3 & 0xff;
                final int b4 = i4 & 0xff;
                final int[] bytePair2 = { b3, b4, };
                if (compareBytePair(MAGIC_NUMBERS_JBIG2_2, bytePair2)) {
                    return ImageFormats.JBIG2;
                }
            } else if (compareBytePair(MAGIC_NUMBERS_ICNS, bytePair)) {
                return ImageFormats.ICNS;
            } else if (compareBytePair(MAGIC_NUMBERS_DCX, bytePair)) {
                return ImageFormats.DCX;
            } else if (compareBytePair(MAGIC_NUMBERS_RGBE, bytePair)) {
                return ImageFormats.RGBE;
            }
            return Stream
                .of(ImageFormats.values())
                .filter(imageFormat -> Stream
                    .of(imageFormat.getExtensions())
                    .anyMatch(extension -> {
                        final String fileName = byteSource.getFileName();
                        if (fileName == null || fileName.trim().length() == 0) {
                            return false;
                        }
                        final String fileExtension = fileName.substring(fileName.lastIndexOf('.') + 1);
                        return extension != null
                                && extension.trim().length() > 0
                                && fileExtension.equalsIgnoreCase(extension);
                    }))
                .findFirst()
                .orElse(ImageFormats.UNKNOWN)
            ;
        }
    }

    /**
     * Attempts to determine the image format of a file based on its "magic numbers," the first bytes of the data.
     *
     * <p>Many graphics formats specify identifying byte
     * values that appear at the beginning of the data file.  This method
     * checks for such identifying elements and returns a ImageFormat
     * enumeration indicating what it detects. Note that this
     * method can return "false positives" in cases where non-image files
     * begin with the specified byte values.</p>
     *
     * @param file  File containing image data.
     * @return An ImageFormat, such as ImageFormat.IMAGE_FORMAT_JPEG. Returns ImageFormat.IMAGE_FORMAT_UNKNOWN if the image type cannot be determined.
     * @throws IOException in the event of an unrecoverable I/O condition.
     */
    public static ImageFormat guessFormat(final File file) throws IOException {
        return guessFormat(ByteSource.file(file));
    }

    /**
     * Attempts to determine if a file contains an image recorded in
     * a supported graphics format based on its file-name extension
     * (for example "&#46;jpg", "&#46;gif", "&#46;png", etc&#46;).
     *
     * @param file A valid File object providing a reference to a file that may contain an image.
     * @return true if the file-name includes a supported image format file extension; otherwise, false.
     */
    public static boolean hasImageFileExtension(final File file) {
        if (file == null || !file.isFile()) {
            return false;
        }
        return hasImageFileExtension(file.getName());
    }

    /**
     * Attempts to determine if a file contains an image recorded in
     * a supported graphics format based on its file-name extension
     * (for example "&#46;jpg", "&#46;gif", "&#46;png", etc&#46;).
     *
     * @param fileName  A valid string representing name of file which may contain an image.
     * @return true if the file name has an image format file extension.
     */
    public static boolean hasImageFileExtension(final String fileName) {
        if (fileName == null) {
            return false;
        }

        final String normalizedFilename = fileName.toLowerCase(Locale.ENGLISH);

        for (final ImageParser<?> imageParser : ImageParser.getAllImageParsers()) {
            for (final String extension : imageParser.getAcceptedExtensions()) {
                if (normalizedFilename.endsWith(extension.toLowerCase(Locale.ENGLISH))) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Writes the content of a BufferedImage to a file using the specified image format.
     *
     * <p>Image writing is not supported for all graphics formats.
     * For the most recent information on support for specific formats, refer to
     * <a href="https://commons.apache.org/imaging/formatsupport.html">Format Support</a>
     * at the main project development web site.   While the Apache Commons
     * Imaging package does not fully support all formats, it  can read
     * image info, metadata and ICC profiles from all image formats that
     * provide this data.</p>
     *
     * @param src a valid BufferedImage object
     * @param file the file to which the output image is to be written
     * @param format the format in which the output image is to be written
     * @throws ImagingException in the event of a format violation, unsupported image format, etc.
     * @throws IOException in the event of an unrecoverable I/O exception.
     * @see ImagingConstants
     */
    public static void writeImage(final BufferedImage src, final File file, final ImageFormat format) throws ImagingException, IOException {
        try (FileOutputStream fos = new FileOutputStream(file); BufferedOutputStream os = new BufferedOutputStream(fos)) {
            writeImage(src, os, format);
        }
    }

    /**
     * Writes the content of a BufferedImage to an OutputStream using the specified image format.
     *
     * <p>Image writing is not supported for all graphics formats.
     * For the most recent information on support for specific formats, refer to
     * <a href="https://commons.apache.org/imaging/formatsupport.html">Format Support</a>
     * at the main project development web site.   While the Apache Commons
     * Imaging package does not fully support all formats, it  can read
     * image info, metadata and ICC profiles from all image formats that
     * provide this data.</p>
     *
     * @param src a valid BufferedImage object
     * @param outputStream the OutputStream to which the output image is to be written
     * @param format the format in which the output image is to be written
     * @throws ImagingException in the event of a format violation, unsupported image format, etc.
     * @throws IOException in the event of an unrecoverable I/O exception.
     * @see ImagingConstants
     */
    public static void writeImage(final BufferedImage src, final OutputStream outputStream, final ImageFormat format) throws ImagingException, IOException {
        Objects.requireNonNull(src, "src");
        Objects.requireNonNull(outputStream, "outputStream");
        Objects.requireNonNull(format, "format");

        final ImageParser<?> imageParser = ImageParserFactory.getImageParser(format);
        imageParser.writeImage(src, outputStream, null);
    }

    /**
     * Writes the content of a BufferedImage to a byte array using the specified image format.
     *
     * <p>Image writing is not supported for all graphics formats.
     * For the most recent information on support for specific formats, refer to
     * <a href="https://commons.apache.org/imaging/formatsupport.html">Format Support</a>
     * at the main project development web site.   While the Apache Commons
     * Imaging package does not fully support all formats, it  can read
     * image info, metadata and ICC profiles from all image formats that
     * provide this data.</p>
     *
     * @param src a valid BufferedImage object
     * @param format the format in which the output image is to be written
     * @return if successful, a valid array of bytes.
     * @throws ImagingException in the event of a format violation, unsupported image format, etc.
     * @throws IOException in the event of an unrecoverable I/O exception.
     * @see ImagingConstants
     */
    public static byte[] writeImageToBytes(final BufferedImage src, final ImageFormat format) throws ImagingException, IOException {
        try (ByteArrayOutputStream os = new ByteArrayOutputStream()) {
            writeImage(src, os, format);
            return os.toByteArray();
        }
    }

    private Imaging() {
        // Instances can not be created
    }
}
