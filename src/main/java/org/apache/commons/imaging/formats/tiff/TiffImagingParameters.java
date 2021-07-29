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
     * User provided {@code TiffOutputSet} used to write into the image's EXIF metadata.
     */
    private TiffOutputSet exif = null;

    /**
     * X-coordinate of a sub-image.
     */
    private Integer subImageX = null;

    /**
     * Y-coordinate of a sub-image.
     */
    private Integer subImageY = null;

    /**
     * Width of a sub-image.
     */
    private Integer subImageWidth = null;

    /**
     * Height of a sub-image.
     */
    private Integer subImageHeight = null;

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

    public TiffOutputSet getExif() {
        return exif;
    }

    public void setExif(TiffOutputSet exif) {
        this.exif = exif;
    }

    public Integer getSubImageX() {
        return subImageX;
    }

    public void setSubImageX(Integer subImageX) {
        this.subImageX = subImageX;
    }

    public Integer getSubImageY() {
        return subImageY;
    }

    public void setSubImageY(Integer subImageY) {
        this.subImageY = subImageY;
    }

    public Integer getSubImageWidth() {
        return subImageWidth;
    }

    public void setSubImageWidth(Integer subImageWidth) {
        this.subImageWidth = subImageWidth;
    }

    public Integer getSubImageHeight() {
        return subImageHeight;
    }

    public void setSubImageHeight(Integer subImageHeight) {
        this.subImageHeight = subImageHeight;
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
