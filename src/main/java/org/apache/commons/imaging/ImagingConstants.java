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

/**
 * Defines constants that may be used in passing options to 
 * ImageParser read/write implementations, the utility routines
 * implemented in the Imaging class, and throughout the
 * Apache Commons Imaging package.  Individual ImageParser 
 * implementations may define their own format-specific options.
 */
public interface ImagingConstants {
    /**
     * Parameter key. Applies to read and write operations.
     * <p>
     * Valid values: Boolean.TRUE and Boolean.FALSE.
     */
    public static final String PARAM_KEY_VERBOSE = "VERBOSE";

    /**
     * Parameter key. Used to hint the filename when reading from a byte array
     * or InputStream. The filename hint can help disambiguate what file the
     * image format.
     * <p>
     * Applies to read operations.
     * <p>
     * Valid values: filename as string
     * <p>
     * 
     * @see java.io.InputStream
     */
    public static final String PARAM_KEY_FILENAME = "FILENAME";

    /**
     * Parameter key. Used in write operations to indicate desired image format.
     * <p>
     * Valid values: Any format defined in ImageFormat, such as
     * ImageFormat.IMAGE_FORMAT_PNG.
     * <p>
     * 
     * @see org.apache.commons.imaging.ImageFormat
     */
    public static final String PARAM_KEY_FORMAT = "FORMAT";

    /**
     * Parameter key. Used in write operations to indicate desired compression
     * algorithm.
     * <p>
     * Currently only applies to writing TIFF image files.
     * <p>
     * Valid values: TiffConstants.TIFF_COMPRESSION_UNCOMPRESSED,
     * TiffConstants.TIFF_COMPRESSION_CCITT_1D,
     * TiffConstants.TIFF_COMPRESSION_LZW,
     * TiffConstants.TIFF_COMPRESSION_PACKBITS.
     * <p>
     * 
     * @see org.apache.commons.imaging.formats.tiff.constants.TiffConstants
     */
    public static final String PARAM_KEY_COMPRESSION = "COMPRESSION";

    public static final String BUFFERED_IMAGE_FACTORY = "BUFFERED_IMAGE_FACTORY";

    /**
     * Parameter key. Indicates whether to read embedded thumbnails.
     * <p>
     * Only applies to read EXIF metadata from JPEG/JFIF files.
     * <p>
     * Valid values: Boolean.TRUE and Boolean.FALSE.
     * <p>
     * 
     * @see org.apache.commons.imaging.formats.tiff.constants.TiffConstants
     */
    public static final String PARAM_KEY_READ_THUMBNAILS = "READ_THUMBNAILS";

    /**
     * Parameter key. Indicates whether to throw exceptions when parsing invalid
     * files, or whether to tolerate small problems.
     * <p>
     * Valid values: Boolean.TRUE and Boolean.FALSE. Default value:
     * Boolean.FALSE.
     * <p>
     * 
     * @see org.apache.commons.imaging.formats.tiff.constants.TiffConstants
     */
    public static final String PARAM_KEY_STRICT = "STRICT";

    /**
     * Parameter key.
     * 
     * Only used when writing images.
     * <p>
     * Valid values: TiffOutputSet to write into the image's EXIF metadata.
     * <p>
     * 
     * @see org.apache.commons.imaging.formats.tiff.write.TiffOutputSet
     */
    public static final String PARAM_KEY_EXIF = "EXIF";

    /**
     * Parameter key.
     * 
     * Only used when writing images.
     * <p>
     * Valid values: String of XMP XML.
     * <p>
     */
    public static final String PARAM_KEY_XMP_XML = "XMP_XML";

    /**
     * Parameter key. Used in write operations to indicate the desired pixel
     * density (DPI), and/or aspect ratio.
     * <p>
     * Valid values: PixelDensity
     * <p>
     * 
     * @see org.apache.commons.imaging.PixelDensity
     */
    public static final String PARAM_KEY_PIXEL_DENSITY = "PIXEL_DENSITY";
}
