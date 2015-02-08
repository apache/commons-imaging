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
 * Created 2015 by Michael Gross, mgmechanics@mgmechanics.de
 * Changed 2015 by Michael Gross, mgmechanics@mgmechanics.de
 */

package org.apache.commons.imaging;

import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;

/**
 * This class is a POJO holding data for parameters as requested in IMAGING-159.
 * It holds additional data needed for the TIFF format only.
 */
public final class ImagingParametersTiff extends ImagingParameters {
    
    private Integer compressionLevel; // PARAM_KEY_COMPRESSION
    
    private TiffOutputSet outputSetForMetaData; // PARAM_KEY_EXIF
    
    private boolean readThumbnailsValue; // PARAM_KEY_READ_THUMBNAILS
    
    /**
     * This gives you a parameter object with default values.
     */
    public ImagingParametersTiff() {
        this.compressionLevel = null;
        this.outputSetForMetaData = null;
    }
    
    //****** compressionLevel ******
    
    /**
     * Returns {@code true} if there is a value present, {@false} else.
     * @return 
     */
    public boolean isCompressionLevelPresent() {
        return this.compressionLevel == null;
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
    
    //****** tiffOutputSetForMetaData ******
    
    /**
     * Parameter key.
     * 
     * Only used when writing images.
     * <p>
     * Valid values: TiffOutputSet to write into the image's EXIF metadata.
     * @return {@code true} if there is a value present, {@false} else.
     */
    public boolean isOutputSetPresent() {
        return this.outputSetForMetaData == null;
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
        checkIfValueIsNull(value);
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
        return this.readThumbnailsValue;
    }
    
    /**
     * Call this method to indicate to read embedded thumbnails.
     */
    public void enableReadThumbnails() {
        this.readThumbnailsValue = true;
    }
    
    /**
     * Call this method to indicate not to read embedded thumbnails.
     */
    public void disableReadThumbnails() {
        this.readThumbnailsValue = false;
    }
}
