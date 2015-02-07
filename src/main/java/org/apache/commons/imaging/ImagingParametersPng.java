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

/**
 * This class is a POJO holding data for parameters as requested in IMAGING-159.
 * It holds additional data needed for the PNG format only.
 */
public final class ImagingParametersPng extends ImagingParameters {
    
    private Byte bitDepth;
    private boolean forceIndexedColor;
    private boolean forceTrueColor;
    private String textChunks;
    
    /**
     * This gives you a parameter object with default values.
     */
    public ImagingParametersPng() {
        this.bitDepth = null;
        this.forceIndexedColor = false;
        this.forceTrueColor = false;
        this.textChunks = null;
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
     * Returns the bit depth of a PNG image.
     * @return the bit depth
     */
    public byte getBitDepth() {
        Byte value = this.bitDepth;
        checkIfParameterIsPresent(value);
        return value;
    }
    
    /**
     * Sets the bit depth of a PNG image.
     * @param value the bit depth
     */
    public void setBitDepth(final byte value) {
        this.bitDepth = value;
    }
    
    // ****** forceIndexedColor ******
    
    /**
     * force indexed color
     */
    public void enableForceIndexedColor() {
        this.forceIndexedColor = true;
    }
    
    /**
     * don't force indexed color
     */
    public void disableForceIndexedColor() {
        this.forceIndexedColor = false;
    }
    
    /**
     * {@code true} = force indexed color; {@code false} = don't force indexed color
     * @return 
     */
    public boolean forceIndexedColor() {
        return this.forceIndexedColor;
    }
    
    // ****** forceTrueColor ******
    
    /**
     * force indexed color
     */
    public void enableForceTrueColor() {
        this.forceTrueColor = true;
    }
    
    /**
     * don't force indexed color
     */
    public void disableForceTrueColor() {
        this.forceTrueColor = false;
    }
    
    /**
     * {@code true} = force true color; {@code false} = don't force true color
     * @return 
     */
    public boolean forceTrueColor() {
        return this.forceTrueColor;
    }
    
    //****** textChunks ******
    
    /**
     * Returns {@code true} if text chunks are present, {@code false} else.
     * @return 
     */
    public boolean areTextChunksPresent() {
        return this.textChunks == null;
    }
    
    /**
     * Returns the text chunks for a PNG image.
     * @return the text chunks
     */
    public String getTextChunks() {
        String value = this.textChunks;
        checkIfParameterIsPresent(value);
        return value;
    }
    
    /**
     * Sets the text chunks for a PNG image.
     * @param value the text chunks
     */
    public void setTextChunks(final String value) {
        checkIfValueIsNull(value);
        this.textChunks = value;
    }
}
