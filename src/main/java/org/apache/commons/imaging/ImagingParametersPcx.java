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

import org.apache.commons.imaging.formats.pcx.PcxConstants;

/**
 * This class is a POJO holding data for parameters as requested in IMAGING-159.
 * It holds additional data needed for the PCX format only.
 */
public final class ImagingParametersPcx extends ImagingParameters {
    
    private Integer compressionLevel; // PARAM_KEY_COMPRESSION
    // This is the default value used for the parameter above.
    // If you need to change the default value for this parameter, do it here.
    // Please remember to change the javadoc also.
    private final Integer compressionLevelDefault = PcxConstants.PCX_COMPRESSION_UNCOMPRESSED;
    
    private Integer bitDepth;
    
    /**
     * This gives you a parameter object with default values.
     */
    public ImagingParametersPcx() {
        this.compressionLevel = compressionLevelDefault;
        this.bitDepth = null;
    }
    
    //****** compressionLevel ******
    
    /**
     * Parameter used in write operations to indicate desired compression
     * algorithm.
     * <p>
     * Currently only applies to writing PCX image files.
     * <p>
     * Default value: PcxConstants.PCX_COMPRESSION_UNCOMPRESSED
     * @return Valid values:
     * PcxConstants.PCX_COMPRESSION_UNCOMPRESSED,
     * PcxConstants.PCX_COMPRESSION_RLE
     */
    public Integer getCompressionLevel() {
        Integer value = this.compressionLevel;
        checkIfParameterIsPresent(value);
        return value;
    }
    
    /**
     * Parameter used in write operations to indicate desired compression
     * algorithm.
     * <p>
     * Currently only applies to writing PCX image files.
     * @param value Valid values:
     * PcxConstants.PCX_COMPRESSION_UNCOMPRESSED,
     * PcxConstants.PCX_COMPRESSION_RLE
     */
    public void setCompressionLevel(final Integer value) {
        checkIfValueIsNull(value);
        this.compressionLevel = value;
    }
    
    //****** bitDepth ******
    
    /**
     * Returns {@code true} if the parameter bit depth was set, {@code false} else.
     * @return 
     */
    public boolean isBitDepthPresent() {
        return this.bitDepth == null;
    }
    
    /**
     * Returns a Integer for the bit depth of a PCX image.
     * @return 
     */
    public Integer getBitDepth() {
        Integer value = this.bitDepth;
        checkIfParameterIsPresent(value);
        return value;
    }
    
    /**
     * Sets the bit depth of a PCX image.
     * @param value
     */
    public void setBitDepth(final Integer value) {
        checkIfValueIsNull(value);
        this.bitDepth = value;
    }
}
