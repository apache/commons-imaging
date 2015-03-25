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

import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;

/**
 * This class is a POJO holding data for parameters as requested in IMAGING-159.
 * It holds additional data needed for the TIFF format only.
 */
public final class ImagingParametersTiff extends ImagingParameters {
    
    private Integer compressionLevel;
    
    private Integer compressionBlockSize;

    private TiffOutputSet outputSetForMetaData;
    
    private boolean readThumbnails;
    
    private Integer t4options;
    
    private Integer t6options;
    
    private Integer subImageX;
    
    private Integer subImageY;
    
    private Integer subImageWidth;
    
    private Integer subImageHeight;
    
    
    /**
     * This gives you a parameter object with default values.
     */
    public ImagingParametersTiff() {
        this.compressionLevel = null;
        this.compressionBlockSize = null;
        this.outputSetForMetaData = null;
        this.readThumbnails = false;
        this.t4options = null;
        this.t6options = null;
        this.subImageX = null;
        this.subImageY = null;
        this.subImageWidth = null;
        this.subImageHeight = null;
    }
    
    //****** compressionLevel ******
    
    /**
     * Returns {@code true} if there is a value present, {@code false} else.
     * @return 
     */
    public boolean isCompressionLevelPresent() {
        return this.compressionLevel != null;
    }
    
    /**
     * Parameter used in write operations to indicate desired compression
     * algorithm.
     * <p>
     * Currently only applies to writing TIFF image files.
     * <p>
     * Default value: TiffConstants.TIFF_COMPRESSION_UNCOMPRESSED
     * @return Valid values:
     * TiffConstants.TIFF_COMPRESSION_UNCOMPRESSED,
     * TiffConstants.TIFF_COMPRESSION_CCITT_1D,
     * TiffConstants.TIFF_COMPRESSION_LZW,
     * TiffConstants.TIFF_COMPRESSION_PACKBITS
     */
    public int getCompressionLevel() {
        Integer value = this.compressionLevel;
        checkIfParameterIsPresent(value);
        return value;
    }
    
    /**
     * Parameter used in write operations to indicate desired compression
     * algorithm.
     * <p>
     * Currently only applies to writing TIFF image files.
     * @param value Valid values:
     * TiffConstants.TIFF_COMPRESSION_UNCOMPRESSED,
     * TiffConstants.TIFF_COMPRESSION_CCITT_1D,
     * TiffConstants.TIFF_COMPRESSION_LZW,
     * TiffConstants.TIFF_COMPRESSION_PACKBITS
     */
    public void setCompressionLevel(final int value) {
        this.compressionLevel = value;
    }
    
    //****** compressionBlockSize ******
    
    /**
     * Returns {@code true} if there is a value present, {@code false} else.
     * @return 
     */
    public boolean isCompressionBlockSizePresent() {
        return this.compressionBlockSize != null;
    }
    
    /**
     * Specifies the amount of memory in bytes to be used for a strip
     * or tile size when employing LZW compression.  The default is
     * 8000 (roughly 8K). Minimum value is 8000.
     * @return the compression block size
     */
    public int getCompressionBlockSize() {
        Integer value = this.compressionBlockSize;
        checkIfParameterIsPresent(value);
        return value;
    }
    
    /**
     * Specifies the amount of memory in bytes to be used for a strip
     * or tile size when employing LZW compression.  The default is
     * 8000 (roughly 8K). Minimum value is 8000.
     * @param value the compression block size
     */
    public void setCompressionBlockSize(final int value) {
        this.compressionBlockSize = value;
    }
    
    //****** tiffOutputSetForMetaData ******
    
    /**
     * Parameter key.
     * 
     * Only used when writing images.
     * <p>
     * Valid values: TiffOutputSet to write into the image's EXIF metadata.
     * @return {@code true} if there is a value present, {@code false} else.
     */
    public boolean isOutputSetPresent() {
        return this.outputSetForMetaData != null;
    }
    
    /**
     * Parameter key.
     * 
     * Only used when writing images.
     * @return Valid values: TiffOutputSet to write into the image's EXIF metadata.
     */
    public TiffOutputSet getOutputSet() {
        TiffOutputSet value = this.outputSetForMetaData;
        checkIfParameterIsPresent(value);
        return value;
    }
    
    /**
     * Parameter key.
     * 
     * Only used when writing images.
     * @param value Valid values: TiffOutputSet to write into the image's EXIF metadata.
     */
    public void setOutputSet(final TiffOutputSet value) {
        checkIfValueIsNull(value, "outputSet");
        this.outputSetForMetaData = value;
    }
    
    //****** readThumbnails ******
    
    /**
     * Parameter key. Indicates whether to read embedded thumbnails.
     * Default value: don't read embedded thumbnails
     * @return Valid values:{@code true} (causes it to read embedded thumbnails
     * and {@code false} (don't read embedded thumbnails).
     */
    public boolean getReadThumbnails() {
        return this.readThumbnails;
    }
    
    /**
     * Call this method to indicate to read embedded thumbnails.
     * @param value {@code true} = read embedded thumbnails;
     * {@code false} = don't read embedded thumbnails
     */
    public void setReadThumbnails(final boolean value) {
        this.readThumbnails = value;
    }
    
    //****** t4 options ******
    
    /**
     * Returns {@code true} if there is a value present, {@code false} else.
     * @return 
     */
    public boolean isT4optionsPresent() {
        return this.t4options != null;
    }
    
    /**
     * Used in write operations to indicate the desired
     * T.4 options to use when using TIFF_COMPRESSION_CCITT_GROUP_3.
     * <p>
     * Valid values: any Integer containing a mixture of the
     * TIFF_FLAG_T4_OPTIONS_2D, TIFF_FLAG_T4_OPTIONS_UNCOMPRESSED_MODE,
     * and TIFF_FLAG_T4_OPTIONS_FILL flags.
     * @return desired t4 options
     */
    public int getT4options() {
        Integer value = this.t4options;
        checkIfParameterIsPresent(value);
        return value;
    }
    
    /**
     * Used in write operations to indicate the desired
     * T.4 options to use when using TIFF_COMPRESSION_CCITT_GROUP_3.
     * <p>
     * Valid values: any Integer containing a mixture of the
     * TIFF_FLAG_T4_OPTIONS_2D, TIFF_FLAG_T4_OPTIONS_UNCOMPRESSED_MODE,
     * and TIFF_FLAG_T4_OPTIONS_FILL flags.
     * @param value desired t4 options
     */
    public void setT4options(final int value) {
        this.t4options = value;
    }
    
    //****** t6 options ******
    
    /**
     * Returns {@code true} if there is a value present, {@code false} else.
     * @return 
     */
    public boolean isT6optionsPresent() {
        return this.t6options != null;
    }
    
    /**
     * Used in write operations to indicate the desired
     * T.6 options to use when using TIFF_COMPRESSION_CCITT_GROUP_4.
     * <p>
     * Valid values: any Integer containing either zero or
     * TIFF_FLAG_T6_OPTIONS_UNCOMPRESSED_MODE.
     * @return desired t6 options
     */
    public int getT6options() {
        Integer value = this.t6options;
        checkIfParameterIsPresent(value);
        return value;
    }
    
    /**
     * Used in write operations to indicate the desired
     * T.6 options to use when using TIFF_COMPRESSION_CCITT_GROUP_4.
     * <p>
     * Valid values: any Integer containing either zero or
     * TIFF_FLAG_T6_OPTIONS_UNCOMPRESSED_MODE.
     * @param value desired t6 options
     */
    public void setT6options(final int value) {
        this.t6options = value;
    }
    
    //****** subImageX ******
    
    /**
     * Returns {@code true} if there is a value present, {@code false} else.
     * @return 
     */
    public boolean isSubImageX_Present() {
        return this.subImageX != null;
    }
    
    /**
     * Parameter used in read operations to indicate the X coordinate of the sub-image.
     * <p>
     * Currently only applies to read TIFF image files.
     * @return the x coordinate of the sub-image
     */
    public int getSubImageX() {
        Integer value = this.subImageX;
        checkIfParameterIsPresent(value);
        return value;
    }
    
    /**
     * Parameter used in read operations to indicate the X coordinate of the sub-image.
     * <p>
     * Currently only applies to read TIFF image files.
     * @param value the x coordinate of the sub-image
     */
    public void setSubImageX(final int value) {
        this.subImageX = value;
    }
    
    //****** subImageY ******
    
    /**
     * Returns {@code true} if there is a value present, {@code false} else.
     * @return 
     */
    public boolean isSubImageY_Present() {
        return this.subImageY != null;
    }
    
    /**
     * Parameter used in read operations to indicate the Y coordinate of the sub-image.
     * <p>
     * Currently only applies to read TIFF image files.
     * @return the y coordinate of the sub-image
     */
    public int getSubImageY() {
        Integer value = this.subImageY;
        checkIfParameterIsPresent(value);
        return value;
    }
    
    /**
     * Parameter used in read operations to indicate the Y coordinate of the sub-image.
     * <p>
     * Currently only applies to read TIFF image files.
     * @param value the y coordinate of the sub-image
     */
    public void setSubImageY(final int value) {
        this.subImageY = value;
    }
    
    //****** subImageWidth ******
    
    /**
     * Returns {@code true} if there is a value present, {@code false} else.
     * @return 
     */
    public boolean isSubImageWidth_Present() {
        return this.subImageWidth != null;
    }
    
    /**
     * Parameter used in read operations to indicate the width of the sub-image.
     * <p>
     * Currently only applies to read TIFF image files.
     * @return the width of the sub-image
     */
    public int getSubImageWidth() {
        Integer value = this.subImageWidth;
        checkIfParameterIsPresent(value);
        return value;
    }
    
    /**
     * Parameter used in read operations to indicate the width of the sub-image.
     * <p>
     * Currently only applies to read TIFF image files.
     * @param value the width of the sub-image
     */
    public void setSubImageWidth(final int value) {
        this.subImageWidth = value;
    }
    
    //****** subImageHeight ******
    
    /**
     * Returns {@code true} if there is a value present, {@code false} else.
     * @return 
     */
    public boolean isSubImageHeight_Present() {
        return this.subImageHeight != null;
    }
    
    /**
     * Parameter used in read operations to indicate the height of the sub-image.
     * <p>
     * Currently only applies to read TIFF image files.
     * @return the height of the sub-image
     */
    public int getSubImageHeight() {
        Integer value = this.subImageHeight;
        checkIfParameterIsPresent(value);
        return value;
    }
    
    /**
     * Parameter used in read operations to indicate the height of the sub-image.
     * <p>
     * Currently only applies to read TIFF image files.
     * @param value the height of the sub-image
     */
    public void setSubImageHeight(final int value) {
        this.subImageHeight = value;
    }
}
