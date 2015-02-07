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
 *
 * Changed 2015 by Michael Gross, mgmechanics@mgmechanics.de
 */
package org.apache.commons.imaging;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.apache.commons.imaging.common.BinaryFileParser;
import org.apache.commons.imaging.common.BufferedImageFactory;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.SimpleBufferedImageFactory;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceArray;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.formats.bmp.BmpImageParser;
import org.apache.commons.imaging.formats.dcx.DcxImageParser;
import org.apache.commons.imaging.formats.gif.GifImageParser;
import org.apache.commons.imaging.formats.icns.IcnsImageParser;
import org.apache.commons.imaging.formats.ico.IcoImageParser;
import org.apache.commons.imaging.formats.jpeg.JpegImageParser;
import org.apache.commons.imaging.formats.pcx.PcxImageParser;
import org.apache.commons.imaging.formats.png.PngImageParser;
import org.apache.commons.imaging.formats.pnm.PnmImageParser;
import org.apache.commons.imaging.formats.psd.PsdImageParser;
import org.apache.commons.imaging.formats.rgbe.RgbeImageParser;
import org.apache.commons.imaging.formats.tiff.TiffImageParser;
import org.apache.commons.imaging.formats.wbmp.WbmpImageParser;
import org.apache.commons.imaging.formats.xbm.XbmImageParser;
import org.apache.commons.imaging.formats.xpm.XpmImageParser;

/**
 * Provides the abstract base class for all image reading and writing
 * utilities.  ImageParser implementations are expected to extend this
 * class providing logic for identifying and processing data in their
 * own specific format.   Specific implementations are found
 * under the com.apache.commons.imaging.formats package.
 * 
 * <h3>Application Notes</h3>
 * 
 * <h4>Format support</h4>
 * 
 * For the most recent information on format support for the
 * Apache Commons Imaging package, refer to
 * <a href="http://commons.apache.org/imaging/formatsupport.html">Format Support</a>
 * at the main project development web site.
 * 
 * <h4>On the accuracy of this Javadoc</h4>
 * 
 * The original authors of this class did not supply documentation.
 * The Javadoc for this class is based on inspection of the
 * source code.  In some cases, the purpose and usage for particular
 * methods was deduced from the source and may not perfectly reflect
 * the intentions of the original. Therefore, you should not assume
 * that the documentation is perfect, especially in the more obscure
 * and specialized areas of implementation.
 * 
 * <h4>The "Map params" argument</h4>
 * 
 * Many of the methods specified by this class accept an argument of
 * type Map giving a list of parameters to be used when processing an
 * image. For example, some of the output formats permit the specification
 * of different kinds of image compression or color models. Some of the
 * reading methods permit the calling application to require strict
 * format compliance.   In many cases, however, an application will not
 * require the use of this argument.  While some of the ImageParser
 * implementations check for (and ignore) null arguments for this parameter,
 * not all of them do (at least not at the time these notes were written).
 * Therefore, a prudent programmer will always supply an valid, though
 * empty instance of a Map implementation when calling such methods.
 * Generally, the java HashMap class is useful for this purpose.
 * 
 * <p>Additionally, developers creating or enhancing classes derived
 * from ImageParser are encouraged to include such checks in their code.
 */
public abstract class ImageParser extends BinaryFileParser {

    /**
     * Gets an array of new instances of all image parsers.
     *
     * @return A valid array of image parsers
     */
    public static ImageParser[] getAllImageParsers() {

        return new ImageParser[]{
                new BmpImageParser(),
                new DcxImageParser(),
                new GifImageParser(),
                new IcnsImageParser(),
                new IcoImageParser(),
                new JpegImageParser(),
                new PcxImageParser(),
                new PngImageParser(),
                new PnmImageParser(),
                new PsdImageParser(),
                new RgbeImageParser(),
                new TiffImageParser(),
                new WbmpImageParser(),
                new XbmImageParser(),
                new XpmImageParser(),
                // new JBig2ImageParser(),
                // new TgaImageParser(),
        };
    }

    /**
     * Get image metadata from the specified byte source.  Format-specific
     * ImageParser implementations are expected to return a valid
     * IImageMetadata object or to throw an ImageReadException if unable
     * to process the specified byte source.
     *
     * @param byteSource A valid byte source.
     * @return A valid, potentially subject-matter-specific implementation of
     *         the IImageMetadata interface describing the content extracted
     *         from the source content.
     * @throws ImageReadException In the event that the the ByteSource
     *                            content does not conform to the format of the specific parser
     *                            implementation.
     * @throws IOException        In the event of unsuccessful data read operation.
     */
    public final ImageMetadata getMetadata(final ByteSource byteSource) throws ImageReadException, IOException {
        return getMetadata(byteSource, null);
    }

    /**
     * Get image metadata from the specified byte source.  Format-specific
     * ImageParser implementations are expected to return a valid
     * IImageMetadata object or to throw an ImageReadException if unable
     * to process the specified byte source.
     * 
     * <p>The params argument provides a mechanism for individual
     * implementations to pass optional information into the parser.
     * Not all formats will require this capability.  Because the
     * base class may call this method with a null params argument,
     * implementations should <strong>always</strong> include logic
     * for ignoring null input.
     *
     * @param byteSource A valid byte source.
     * @param params     Optional instructions for special-handling or
     *                   interpretation of the input data (null objects are permitted and
     *                   must be supported by implementations).
     * @return A valid, potentially subject-matter-specific implementation of
     *         the IImageMetadata interface describing the content extracted
     *         from the source content.
     * @throws ImageReadException In the event that the the ByteSource
     *                            content does not conform to the format of the specific parser
     *                            implementation.
     * @throws IOException        In the event of unsuccessful data read operation.
     */
    public abstract ImageMetadata getMetadata(ByteSource byteSource, final ImagingParameters params)
            throws ImageReadException, IOException;

    /**
     * Get image metadata from the specified array of bytes.  Format-specific
     * ImageParser implementations are expected to return a valid
     * IImageMetadata object or to throw an ImageReadException if unable
     * to process the specified data.
     *
     * @param bytes A valid array of bytes
     * @return A valid, potentially subject-matter-specific implementation of
     *         the IImageMetadata interface describing the content extracted
     *         from the source content.
     * @throws ImageReadException In the event that the the specified content
     *                            does not conform to the format of the specific
     *                            parser implementation.
     * @throws IOException        In the event of unsuccessful data read operation.
     */
    public final ImageMetadata getMetadata(final byte[] bytes) throws ImageReadException, IOException {
        return getMetadata(bytes, null);
    }

    /**
     * Get image metadata from the specified array of bytes.  Format-specific
     * ImageParser implementations are expected to return a valid
     * IImageMetadata object or to throw an ImageReadException if unable
     * to process the specified data.
     * 
     * <p>The params argument provides a mechanism for individual
     * implementations to pass optional information into the parser.
     * Not all formats will require this capability.  Because the
     * base class may call this method with a null params argument,
     * implementations should <strong>always</strong> include logic
     * for ignoring null input.
     *
     * @param bytes  A valid array of bytes
     * @param params Optional instructions for special-handling or
     *               interpretation of the input data (null objects are permitted and
     *               must be supported by implementations).
     * @return A valid image metadata object describing the content extracted
     *         from  the specified content.
     * @throws ImageReadException In the event that the the specified content
     *                            does not conform to the format of the specific
     *                            parser implementation.
     * @throws IOException        In the event of unsuccessful data read operation.
     */
    public final ImageMetadata getMetadata(final byte[] bytes, final ImagingParameters params)
            throws ImageReadException, IOException {
        return getMetadata(new ByteSourceArray(bytes), params);
    }

    /**
     * Get image metadata from the specified file.  Format-specific
     * ImageParser implementations are expected to return a valid
     * IImageMetadata object or to throw an ImageReadException if unable
     * to process the specified data.
     *
     * @param file A valid reference to a file.
     * @return A valid image metadata object describing the content extracted
     *         from  the specified content.
     * @throws ImageReadException In the event that the the specified content
     *                            does not conform to the format of the specific
     *                            parser implementation.
     * @throws IOException        In the event of unsuccessful file read or
     *                            access operation.
     */
    public final ImageMetadata getMetadata(final File file) throws ImageReadException, IOException {
        return getMetadata(file, null);
    }

    /**
     * Get image metadata from the specified file.  Format-specific
     * ImageParser implementations are expected to return a valid
     * IImageMetadata object or to throw an ImageReadException if unable
     * to process the specified data.
     * 
     * <p>The params argument provides a mechanism for individual
     * implementations to pass optional information into the parser.
     * Not all formats will require this capability.  Because the
     * base class may call this method with a null params argument,
     * implementations should <strong>always</strong> include logic
     * for ignoring null input.
     *
     * @param file   A valid reference to a file.
     * @param params Optional instructions for special-handling or
     *               interpretation of the input data (null objects are permitted and
     *               must be supported by implementations).
     * @return A valid image metadata object describing the content extracted
     *         from  the specified content.
     * @throws ImageReadException In the event that the the specified content
     *                            does not conform to the format of the specific
     *                            parser implementation.
     * @throws IOException        In the event of unsuccessful file read or
     *                            access operation.
     */
    public final ImageMetadata getMetadata(final File file, final ImagingParameters params)
            throws ImageReadException, IOException {
        if (getDebug()) {
            System.out.println(getName() + ".getMetadata" + ": "
                    + file.getName());
        }

        if (!canAcceptExtension(file)) {
            return null;
        }

        return getMetadata(new ByteSourceFile(file), params);
    }

    /**
     * Get image information from the specified ByteSource. Format-specific
     * ImageParser implementations are expected to return a valid
     * ImageInfo object or to throw an ImageReadException if unable
     * to process the specified data.
     * 
     * <p>The params argument provides a mechanism for individual
     * implementations to pass optional information into the parser.
     * Not all formats will require this capability.  Because the
     * base class may call this method with a null params argument,
     * implementations should <strong>always</strong> include logic
     * for ignoring null input.
     *
     * @param byteSource A valid ByteSource object
     * @param params     Optional instructions for special-handling or interpretation
     *                   of the input data (null objects are permitted and
     *                   must be supported by implementations).
     * @return A valid image information object describing the content extracted
     *         from the specified data.
     * @throws ImageReadException In the event that the the specified content
     *                            does not conform to the format of the specific
     *                            parser implementation.
     * @throws IOException        In the event of unsuccessful data access operation.
     */
    public abstract ImageInfo getImageInfo(ByteSource byteSource, final ImagingParameters params)
            throws ImageReadException, IOException;

    /**
     * Get image information from the specified ByteSource.  Format-specific
     * ImageParser implementations are expected to return a valid
     * ImageInfo object or to throw an ImageReadException if unable
     * to process the specified data.
     *
     * @param byteSource A valid ByteSource object
     * @return A valid image information object describing the content extracted
     *         from the specified data.
     * @throws ImageReadException In the event that the the specified content
     *                            does not conform to the format of the specific
     *                            parser implementation.
     * @throws IOException        In the event of unsuccessful data
     *                            access operation.
     */
    public final ImageInfo getImageInfo(final ByteSource byteSource) throws ImageReadException, IOException {
        return getImageInfo(byteSource, null);
    }

    /**
     * Get image information from the specified array of bytes.  Format-specific
     * ImageParser implementations are expected to return a valid
     * ImageInfo object or to throw an ImageReadException if unable
     * to process the specified data.
     * <p>The params argument provides a mechanism for individual
     * implementations to pass optional information into the parser.
     * Not all formats will require this capability.  Because the
     * base class may call this method with a null params argument,
     * implementations should <strong>always</strong> include logic
     * for ignoring null input.
     *
     * @param bytes  A valid array of bytes
     * @param params Optional instructions for special-handling or
     *               interpretation of the input data (null objects are permitted and
     *               must be supported by implementations).
     * @return A valid image information object describing the content extracted
     *         from the specified data.
     * @throws ImageReadException In the event that the the specified content
     *                            does not conform to the format of the specific
     *                            parser implementation.
     * @throws IOException        In the event of unsuccessful data
     *                            access operation.
     */
    public final ImageInfo getImageInfo(final byte[] bytes, final ImagingParameters params)
            throws ImageReadException, IOException {
        return getImageInfo(new ByteSourceArray(bytes), params);
    }

    /**
     * Get image information from the specified file  Format-specific
     * ImageParser implementations are expected to return a valid
     * ImageInfo object or to throw an ImageReadException if unable
     * to process the specified data.
     * <p>The params argument provides a mechanism for individual
     * implementations to pass optional information into the parser.
     * Not all formats will require this capability.  Because the
     * base class may call this method with a null params argument,
     * implementations should <strong>always</strong> include logic
     * for ignoring null input.
     *
     * @param file   A valid File object
     * @param params Optional instructions for special-handling or
     *               interpretation of the input data (null objects are permitted and
     *               must be supported by implementations).
     * @return A valid image information object describing the content extracted
     *         from the specified data.
     * @throws ImageReadException In the event that the the specified content
     *                            does not conform to the format of the specific
     *                            parser implementation.
     * @throws IOException        In the event of unsuccessful file read or
     *                            access operation.
     */
    public final ImageInfo getImageInfo(final File file, final ImagingParameters params)
            throws ImageReadException, IOException {
        if (!canAcceptExtension(file)) {
            return null;
        }

        return getImageInfo(new ByteSourceFile(file), params);
    }

    /**
     * Determines the format compliance of the content of the supplied byte
     * source based on rules provided by a specific implementation.
     *
     * @param byteSource A valid instance of ByteSource
     * @return true if the content is format-compliant; otherwise, false
     * @throws ImageReadException may be thrown by sub-classes
     * @throws IOException        may be thrown by sub-classes
     */
    public FormatCompliance getFormatCompliance(final ByteSource byteSource)
            throws ImageReadException, IOException {
        return null;
    }

    /**
     * Determines the format compliance of the content of the supplied byte
     * array based on rules provided by a specific implementation.
     *
     * @param bytes A valid byte array.
     * @return A valid FormatCompliance object.
     * @throws ImageReadException may be thrown by sub-classes
     * @throws IOException        may be thrown by sub-classes
     */
    public final FormatCompliance getFormatCompliance(final byte[] bytes)
            throws ImageReadException, IOException {
        return getFormatCompliance(new ByteSourceArray(bytes));
    }

    /**
     * Determines the format compliance of the specified file based on
     * rules provided by a specific implementation.
     *
     * @param file A valid reference to a file.
     * @return A valid format compliance object.
     * @throws ImageReadException may be thrown by sub-classes
     * @throws IOException        may be thrown by sub-classes
     */
    public final FormatCompliance getFormatCompliance(final File file)
            throws ImageReadException, IOException {
        if (!canAcceptExtension(file)) {
            return null;
        }

        return getFormatCompliance(new ByteSourceFile(file));
    }

    /**
     * Gets all images specified by the byte source (some
     * formats may include multiple images within a single data source).
     *
     * @param byteSource A valid instance of ByteSource.
     * @return A valid (potentially empty) list of BufferedImage objects.
     * @throws ImageReadException In the event that the the specified content
     *                            does not conform to the format of the specific
     *                            parser implementation.
     * @throws IOException        In the event of unsuccessful read or access operation.
     */
    public List<BufferedImage> getAllBufferedImages(final ByteSource byteSource)
            throws ImageReadException, IOException {
        final BufferedImage bi = getBufferedImage(byteSource, null);

        final List<BufferedImage> result = new ArrayList<BufferedImage>();

        // FIXME this doesn't look like we're actually getting all images contained in the given ByteSource...
        result.add(bi);

        return result;
    }

    /**
     * Gets all images specified by the byte array (some
     * formats may include multiple images within a single data source).
     *
     * @param bytes A valid byte array
     * @return A valid (potentially empty) list of BufferedImage objects.
     * @throws ImageReadException In the event that the the specified content
     *                            does not conform to the format of the specific
     *                            parser implementation.
     * @throws IOException        In the event of unsuccessful read or access operation.
     */
    public final List<BufferedImage> getAllBufferedImages(final byte[] bytes)
            throws ImageReadException, IOException {
        return getAllBufferedImages(new ByteSourceArray(bytes));
    }

    /**
     * Gets all images specified by indicated file (some
     * formats may include multiple images within a single data source).
     *
     * @param file A valid reference to a file.
     * @return A valid (potentially empty) list of BufferedImage objects.
     * @throws ImageReadException In the event that the the specified content
     *                            does not conform to the format of the specific
     *                            parser implementation.
     * @throws IOException        In the event of unsuccessful read or access operation.
     */
    public final List<BufferedImage> getAllBufferedImages(final File file) throws ImageReadException, IOException {
        if (!canAcceptExtension(file)) {
            return null;
        }

        return getAllBufferedImages(new ByteSourceFile(file));
    }

    /**
     * Gets a buffered image specified by the byte source (for
     * sources that specify multiple images, choice of which image
     * is returned is implementation dependent).
     *
     * @param byteSource A valid instance of ByteSource
     * @param params     Optional instructions for special-handling or
     *                   interpretation of the input data (null objects are permitted and
     *                   must be supported by implementations).
     * @return A valid instance of BufferedImage.
     * @throws ImageReadException In the event that the the specified content
     *                            does not conform to the format of the specific
     *                            parser implementation.
     * @throws IOException        In the event of unsuccessful read or access operation.
     */
    public abstract BufferedImage getBufferedImage(ByteSource byteSource, final ImagingParameters params)
            throws ImageReadException, IOException;

    /**
     * Gets a buffered image specified by the byte array (for
     * sources that specify multiple images, choice of which image
     * is returned is implementation dependent).
     *
     * @param bytes  A valid byte array
     * @param params Optional instructions for special-handling or
     *               interpretation of the input data (null objects are permitted and
     *               must be supported by implementations).
     * @return A valid instance of BufferedImage.
     * @throws ImageReadException In the event that the the specified content
     *                            does not conform to the format of the specific
     *                            parser implementation.
     * @throws IOException        In the event of unsuccessful read or access operation.
     */
    public final BufferedImage getBufferedImage(final byte[] bytes, final ImagingParameters params)
            throws ImageReadException, IOException {
        return getBufferedImage(new ByteSourceArray(bytes), params);
    }

    /**
     * Gets a buffered image specified by the indicated file  (for
     * sources that specify multiple images, choice of which image
     * is returned is implementation dependent).
     *
     * @param file   A valid file reference.
     * @param params Optional instructions for special-handling or
     *               interpretation of the input data (null objects are permitted and
     *               must be supported by implementations).
     * @return A valid instance of BufferedImage.
     * @throws ImageReadException In the event that the the specified content
     *                            does not conform to the format of the specific
     *                            parser implementation.
     * @throws IOException        In the event of unsuccessful read or access operation.
     */
    public final BufferedImage getBufferedImage(final File file, final ImagingParameters params)
            throws ImageReadException, IOException {
        if (!canAcceptExtension(file)) {
            return null;
        }

        return getBufferedImage(new ByteSourceFile(file), params);
    }


    /**
     * Writes the content of a BufferedImage to the specified output
     * stream.
     * 
     * <p>The params argument provides a mechanism for individual
     * implementations to pass optional information into the parser.
     * Not all formats will support this capability.  Currently,
     * some of the parsers do not check for null arguments. So in cases
     * where no optional specifications are supported, application
     * code should pass in an empty instance of an implementation of
     * the map interface (i.e. an empty HashMap).
     *
     * @param src    An image giving the source content for output
     * @param os     A valid output stream for storing the formatted image
     * @param params A non-null Map implementation supplying optional,
     *               format-specific instructions for output
     *               (such as selections for data compression, color models, etc.)
     * @throws ImageWriteException In the event that the output format
     *                             cannot handle the input image or invalid params are specified.
     * @throws IOException         In the event of an write error from
     *                             the output stream.
     */
    public void writeImage(final BufferedImage src, final OutputStream os, final ImagingParameters params)
            throws ImageWriteException, IOException {
        os.close(); // we are obligated to close stream.

        throw new ImageWriteException("This image format (" + getName()
                + ") cannot be written.");
    }

    /**
     * Get the size of the image described by the specified byte array.
     *
     * @param bytes A valid byte array.
     * @return A valid instance of Dimension.
     * @throws ImageReadException In the event that the the specified content
     *                            does not conform to the format of the specific
     *                            parser implementation.
     * @throws IOException        In the event of unsuccessful read or access operation.
     */
    public final Dimension getImageSize(final byte[] bytes) throws ImageReadException, IOException {
        return getImageSize(bytes, null);
    }

    /**
     * Get the size of the image described by the specified byte array.
     *
     * @param bytes  A valid byte array.
     * @param params Optional instructions for special-handling or
     *               interpretation of the input data.
     * @return A valid instance of Dimension.
     * @throws ImageReadException In the event that the the specified content
     *                            does not conform to the format of the specific
     *                            parser implementation.
     * @throws IOException        In the event of unsuccessful read or access operation.
     */
    public final Dimension getImageSize(final byte[] bytes, final ImagingParameters params)
            throws ImageReadException, IOException {
        return getImageSize(new ByteSourceArray(bytes), params);
    }

    /**
     * Get the size of the image described by the specified file.
     *
     * @param file A valid reference to a file.
     * @return A valid instance of Dimension.
     * @throws ImageReadException In the event that the the specified content
     *                            does not conform to the format of the specific
     *                            parser implementation.
     * @throws IOException        In the event of unsuccessful read or access operation.
     */
    public final Dimension getImageSize(final File file) throws ImageReadException, IOException {
        return getImageSize(file, null);
    }

    /**
     * Get the size of the image described by the specified file.
     *
     * @param file   A valid reference to a file.
     * @param params Optional instructions for special-handling or
     *               interpretation of the input data.
     * @return A valid instance of Dimension.
     * @throws ImageReadException In the event that the the specified content
     *                            does not conform to the format of the specific
     *                            parser implementation.
     * @throws IOException        In the event of unsuccessful read or access operation.
     */
    public final Dimension getImageSize(final File file, final ImagingParameters params)
            throws ImageReadException, IOException {

        if (!canAcceptExtension(file)) {
            return null;
        }

        return getImageSize(new ByteSourceFile(file), params);
    }

    /**
     * Get the size of the image described by the specified ByteSource.
     *
     * @param byteSource A valid reference to a ByteSource.
     * @param params     Optional instructions for special-handling or
     *                   interpretation of the input data.
     * @return A valid instance of Dimension.
     * @throws ImageReadException In the event that the the specified content
     *                            does not conform to the format of the specific
     *                            parser implementation.
     * @throws IOException        In the event of unsuccessful read or access operation.
     */
    public abstract Dimension getImageSize(ByteSource byteSource, final ImagingParameters params)
            throws ImageReadException, IOException;

    /**
     * Get a string containing XML-formatted text conforming to the Extensible
     * Metadata  Platform (EXP) standard for representing information about
     * image content.  Not all image formats support EXP infomation and
     * even for those that do, there is no guarantee that such information
     * will be present in an image.
     *
     * @param byteSource A valid reference to a ByteSource.
     * @param params     Optional instructions for special-handling or
     *                   interpretation of the input data.
     * @return If XMP metadata is present, a valid string;
     *         if it is not present, a null.
     * @throws ImageReadException In the event that the the specified content
     *                            does not conform to the format of the specific
     *                            parser implementation.
     * @throws IOException        In the event of unsuccessful read or access operation.
     */
    public abstract String getXmpXml(ByteSource byteSource, final ImagingParameters params)
            throws ImageReadException, IOException;

    /**
     * Get an array of bytes describing the International Color Consortium (ICC)
     * specification for the color space of the image contained in the
     * input byte array. Not all formats support ICC profiles.
     *
     * @param bytes A valid array of bytes.
     * @return If available, a valid array of bytes; otherwise, a null
     * @throws ImageReadException In the event that the the specified content
     *                            does not conform to the format of the specific
     *                            parser implementation.
     * @throws IOException        In the event of unsuccessful read or access operation.
     */
    public final byte[] getICCProfileBytes(final byte[] bytes) throws ImageReadException, IOException {
        return getICCProfileBytes(bytes, null);
    }

    /**
     * Get an array of bytes describing the International Color Consortium (ICC)
     * specification for the color space of the image contained in the
     * input byte array. Not all formats support ICC profiles.
     *
     * @param bytes  A valid array of bytes.
     * @param params Optional instructions for special-handling or
     *               interpretation of the input data.
     * @return If available, a valid array of bytes; otherwise, a null
     * @throws ImageReadException In the event that the the specified content
     *                            does not conform to the format of the specific
     *                            parser implementation.
     * @throws IOException        In the event of unsuccessful read or access operation.
     */
    public final byte[] getICCProfileBytes(final byte[] bytes, final ImagingParameters params)
            throws ImageReadException, IOException {
        return getICCProfileBytes(new ByteSourceArray(bytes), params);
    }

    /**
     * Get an array of bytes describing the International Color Consortium (ICC)
     * specification for the color space of the image contained in the
     * input file. Not all formats support ICC profiles.
     *
     * @param file A valid file reference.
     * @return If available, a valid array of bytes; otherwise, a null
     * @throws ImageReadException In the event that the the specified content
     *                            does not conform to the format of the specific
     *                            parser implementation.
     * @throws IOException        In the event of unsuccessful read or access operation.
     */
    public final byte[] getICCProfileBytes(final File file) throws ImageReadException, IOException {
        return getICCProfileBytes(file, null);
    }

    /**
     * Get an array of bytes describing the International Color Consortium (ICC)
     * specification for the color space of the image contained in the
     * input file. Not all formats support ICC profiles.
     *
     * @param file   A valid file reference.
     * @param params Optional instructions for special-handling or
     *               interpretation of the input data.
     * @return If available, a valid array of bytes; otherwise, a null
     * @throws ImageReadException In the event that the the specified content
     *                            does not conform to the format of the specific
     *                            parser implementation.
     * @throws IOException        In the event of unsuccessful read or access operation.
     */
    public final byte[] getICCProfileBytes(final File file, final ImagingParameters params)
            throws ImageReadException, IOException {
        if (!canAcceptExtension(file)) {
            return null;
        }

        if (getDebug()) {
            System.out.println(getName() + ": " + file.getName());
        }

        return getICCProfileBytes(new ByteSourceFile(file), params);
    }

    /**
     * Get an array of bytes describing the International Color Consortium (ICC)
     * specification for the color space of the image contained in the
     * input byteSoruce. Not all formats support ICC profiles.
     *
     * @param byteSource A valid ByteSource.
     * @param params     Optional instructions for special-handling or
     *                   interpretation of the input data.
     * @return If available, a valid array of bytes; otherwise, a null
     * @throws ImageReadException In the event that the the specified content
     *                            does not conform to the format of the specific
     *                            parser implementation.
     * @throws IOException        In the event of unsuccessful read or access operation.
     */
    public abstract byte[] getICCProfileBytes(ByteSource byteSource, final ImagingParameters params)
            throws ImageReadException, IOException;

    /**
     * Write the ImageInfo and format-specific information for the image
     * content of the specified byte array to a string.
     *
     * @param bytes A valid array of bytes.
     * @return A valid string.
     * @throws ImageReadException In the event that the the specified content
     *                            does not conform to the format of the specific
     *                            parser implementation.
     * @throws IOException        In the event of unsuccessful read or access operation.
     */
    public final String dumpImageFile(final byte[] bytes) throws ImageReadException, IOException {
        return dumpImageFile(new ByteSourceArray(bytes));
    }


    /**
     * Write the ImageInfo and format-specific information for the image
     * content of the specified file to a string.
     *
     * @param file A valid file reference.
     * @return A valid string.
     * @throws ImageReadException In the event that the the specified content
     *                            does not conform to the format of the specific
     *                            parser implementation.
     * @throws IOException        In the event of unsuccessful read or access operation.
     */
    public final String dumpImageFile(final File file) throws ImageReadException, IOException {
        if (!canAcceptExtension(file)) {
            return null;
        }

        if (getDebug()) {
            System.out.println(getName() + ": " + file.getName());
        }

        return dumpImageFile(new ByteSourceFile(file));
    }

    /**
     * Write the ImageInfo and format-specific information for the image
     * content of the specified byte source to a string.
     *
     * @param byteSource A valid byte source.
     * @return A valid string.
     * @throws ImageReadException In the event that the the specified content
     *                            does not conform to the format of the specific
     *                            parser implementation.
     * @throws IOException        In the event of unsuccessful read or access operation.
     */
    public final String dumpImageFile(final ByteSource byteSource)
            throws ImageReadException, IOException {
        final StringWriter sw = new StringWriter();
        final PrintWriter pw = new PrintWriter(sw);

        dumpImageFile(pw, byteSource);

        pw.flush();

        return sw.toString();
    }

    /**
     * Write the ImageInfo and format-specific information for the image
     * content of the specified byte source to a PrintWriter
     *
     * @param pw
     * @param byteSource A valid byte source.
     * @return A valid PrintWriter.
     * @throws ImageReadException In the event that the the specified content
     *                            does not conform to the format of the specific
     *                            parser implementation.
     * @throws IOException        In the event of unsuccessful read or access operation.
     */
    public boolean dumpImageFile(final PrintWriter pw, final ByteSource byteSource)
            throws ImageReadException, IOException {
        return false;
    }


    /**
     * Get a descriptive name for the implementation of an ImageParser.
     *
     * @return a valid, subject-matter-specific string.
     */
    public abstract String getName();

    /**
     * Get the default extension for the format specified by an implementation
     * of ImageParser.  Some parsers can support more than one extension
     * (i.e. .JPEG, .JPG;  .TIF, .TIFF, etc.).
     *
     * @return A valid string.
     */
    public abstract String getDefaultExtension();

    /**
     * Get an array of all accepted extensions
     *
     * @return A valid array of one or more elements.
     */
    protected abstract String[] getAcceptedExtensions();

    /**
     * Get an array of ImageFormat objects describing all accepted types
     *
     * @return A valid array of one or more elements.
     */
    protected abstract ImageFormat[] getAcceptedTypes();

    /**
     * Indicates whether the ImageParser implementation can accept
     * the specified format
     *
     * @param type An instance of ImageFormat.
     * @return If the parser can accept the format, true; otherwise, false.
     */
    public boolean canAcceptType(final ImageFormat type) {
        final ImageFormat[] types = getAcceptedTypes();

        for (final ImageFormat type2 : types) {
            if (type2.equals(type)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Indicates whether the ImageParser implementation can accept
     * the specified file based on its extension.
     *
     * @param file An valid file reference.
     * @return If the parser can accept the format, true; otherwise, false.
     */
    protected final boolean canAcceptExtension(final File file) {
        return canAcceptExtension(file.getName());
    }

    /**
     * Indicates whether the ImageParser implementation can accept
     * the specified file name based on its extension.
     *
     * @param filename An valid string giving a file name or file path.
     * @return If the parser can accept the format, true; otherwise, false.
     */
    protected final boolean canAcceptExtension(final String filename) {
        final String[] exts = getAcceptedExtensions();
        if (exts == null) {
            return true;
        }

        final int index = filename.lastIndexOf('.');
        if (index >= 0) {
            String ext = filename.substring(index);
            ext = ext.toLowerCase(Locale.ENGLISH);

            for (final String ext2 : exts) {
                final String ext2Lower = ext2.toLowerCase(Locale.ENGLISH);
                if (ext2Lower.equals(ext)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Get an instance of IBufferedImageFactory based on the presence
     * of a specification for ImagingConstants.&#46;BUFFERED_IMAGE_FACTORY
     * within the supplied params.
     *
     * @param params A valid Map object, or a null.
     * @return A valid instance of an implementation of a IBufferedImageFactory.
     */
    protected BufferedImageFactory getBufferedImageFactory(final ImagingParameters params) {
        if (params == null) {
            return new SimpleBufferedImageFactory();
        }

        final BufferedImageFactory result = params.getBufferedImageFactory();

        if (null != result) {
            return result;
        }

        return new SimpleBufferedImageFactory();
    }

    /**
     * A utility method to whether we have a parameter object and if the STRICT
     * flag is set or not.
     * Intended for internal use by ImageParser implementations.
     *
     * @param params A valid parameter object (or a null).
     * @return If the params specify strict format compliance, true;
     *         otherwise, false.
     */
    public static boolean isStrict(final ImagingParameters params) {
        if (params == null) {
            return false;
        }
        return params.isStrict();
    }
}
