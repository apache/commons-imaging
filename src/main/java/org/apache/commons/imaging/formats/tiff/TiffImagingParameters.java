/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */

package org.apache.commons.imaging.formats.tiff;

import org.apache.commons.imaging.common.XmpImagingParameters;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;

/**
 * Tiff format parameters.
 * @since 1.0-alpha3
 */
public class TiffImagingParameters extends XmpImagingParameters {

    /**
     * Indicates whether to read embedded thumbnails or not. Only applies to read EXIF metadata from JPEG/JFIF files.
     *
     * <p>Default value is {@code true}.</p>
     */
    private boolean readThumbnails = true;

    /**
     * User provided {@code TiffOutputSet} used to write into
     * the image's metadata including standard directory and EXIF tags.
     */
    private TiffOutputSet tiffOutputSet = null;

    /**
     * X-coordinate of a sub-image.
     */
    private int subImageX;

    /**
     * Y-coordinate of a sub-image.
     */
    private int subImageY;

    /**
     * Width of a sub-image.
     */
    private int subImageWidth;

    /**
     * Height of a sub-image.
     */
    private int subImageHeight;

    /**
     * Specifies that an application-specified photometric interpreter
     * is to be used when reading TIFF files to convert raster data samples
     * to RGB values for the output image.
     *
     * <p>The value supplied with this key should be a valid instance of
     * a class that implements PhotometricInterpreter.</p>
     */
    private PhotometricInterpreter customPhotometricInterpreter = null;

    /**
     * TIFF compression algorithm, if any.
     */
    private Integer compression = null;

    /**
     * Specifies the amount of memory in bytes to be used for a strip
     * or tile size when employing LZW compression.  The default is
     * 8000 (roughly 8K). Minimum value is 8000.
     */
    private Integer lzwCompressionBlockSize = null;

    /**
     * Used in write operations to indicate the desired T.4 options to
     * use when using TIFF_COMPRESSION_CCITT_GROUP_3.
     *
     * <p>Valid values: any Integer containing a mixture of the
     * TIFF_FLAG_T4_OPTIONS_2D, TIFF_FLAG_T4_OPTIONS_UNCOMPRESSED_MODE,
     * and TIFF_FLAG_T4_OPTIONS_FILL flags.</p>
     */
    private Integer t4Options = null;

    /**
     * Used in write operations to indicate the desired T.6 options to
     * use when using TIFF_COMPRESSION_CCITT_GROUP_4.
     *
     * <p>Valid values: any Integer containing either zero or
     * TIFF_FLAG_T6_OPTIONS_UNCOMPRESSED_MODE.</p>
     */
    private Integer t6Options = null;

    public boolean isReadThumbnails() {
        return readThumbnails;
    }

    public void setReadThumbnails(boolean readThumbnails) {
        this.readThumbnails = readThumbnails;
    }

    /**
     * Get the TIFF output set for writing TIFF files.
     * @return if set, a valid instance; otherwise, a null reference.
     */
    public TiffOutputSet getOutputSet() {
        return tiffOutputSet;
    }

    /**
     * Set the TIFF output set for writing TIFF files.  An output set
     * may contain various types of TiffDirectories including image directories,
     * EXIF directories, GPS-related directories, etc.
     *
     * @param tiffOutputSet A valid instance.
     */
    public void setOutputSet(TiffOutputSet tiffOutputSet) {
        this.tiffOutputSet = tiffOutputSet;
    }

    /**
     * Sets parameters for performing a partial read operation on an image. This
     * method is useful for reducing memory and run-time overhead when accessing
     * large source images.
     * <p>
     * Note that the corner x and y coordinates must be positive integers (zero
     * or greater). The width and height must be greater than zero.
     *
     * @param x pixel coordinate of the upper-left corner of the source image,
     * must be zero or greater.
     * @param y pixel coordinate of the upper-left corner of the source image,
     * must be zero or greater.
     * @param width width of the image subset to be read, must be greater than
     * zero.
     * @param height height of the image subset to be read, must be greater than
     * zero.
     */
    public void setSubImage(int x, int y, int width, int height) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException(
                    "Invalid sub-image specification: negative x and y values not allowed");
        }
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException(
                    "Invalid sub-image specification width and height must be greater than zero");
        }
        subImageX = x;
        subImageY = y;
        subImageWidth = width;
        subImageHeight = height;
    }

    /**
     * Clears settings for sub-image. Subsequent read operations will retrieve
     * the entire image.
     */
    public void clearSubImage() {
        subImageWidth = 0;
        subImageHeight = 0;
    }

    /**
     * Indicates whether the application has set sub-image parameters.
     *
     * @return true if the sub-image parameters are set; otherwise, false.
     */
    public boolean isSubImageSet() {
        return subImageWidth > 0 && subImageHeight > 0;
    }

    /**
     * Gets the X coordinate of a sub-image. This setting is meaningful only if
     * a sub-image is set.
     *
     * @return a positive integer
     */
    public int getSubImageX() {
        return subImageX;
    }

    /**
     * Gets the Y coordinate of a sub-image. This setting is meaningful only if
     * a sub-image is set.
     *
     * @return a positive integer
     */
    public int getSubImageY() {
        return subImageY;
    }

    /**
     * Gets the width for a sub-image setting. For a sub-image setting to be
     * meaningful, both the width and height must be set.
     *
     * @return if the sub-image feature is enabled, a value greater than zero;
     * otherwise, zero.
     */
    public int getSubImageWidth() {
        return subImageWidth;
    }

    /**
     * Gets the height for a sub-image setting. For a sub-image setting to be
     * meaningful, both the width and height must be set.
     *
     * @return if the sub-image feature is enabled, a value greater than zero;
     * otherwise, zero.
     */
    public int getSubImageHeight() {
        return subImageHeight;
    }

    public PhotometricInterpreter getCustomPhotometricInterpreter() {
        return customPhotometricInterpreter;
    }

    public void setCustomPhotometricInterpreter(PhotometricInterpreter customPhotometricInterpreter) {
        this.customPhotometricInterpreter = customPhotometricInterpreter;
    }

    public Integer getCompression() {
        return compression;
    }

    public void setCompression(Integer compression) {
        this.compression = compression;
    }

    public Integer getLzwCompressionBlockSize() {
        return lzwCompressionBlockSize;
    }

    public void setLzwCompressionBlockSize(Integer lzwCompressionBlockSize) {
        this.lzwCompressionBlockSize = lzwCompressionBlockSize;
    }

    public Integer getT4Options() {
        return t4Options;
    }

    public void setT4Options(Integer t4Options) {
        this.t4Options = t4Options;
    }

    public Integer getT6Options() {
        return t6Options;
    }

    public void setT6Options(Integer t6Options) {
        this.t6Options = t6Options;
    }

}
