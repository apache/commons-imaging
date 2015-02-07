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
    
    /**
     * This gives you a parameter object with default values.
     */
    public ImagingParametersPng() {
        this.bitDepth = null;
        this.forceIndexedColor = false;
        this.forceTrueColor = false;
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
     * Returns a Byte for the bit depth of a PNG image.
     * @return 
     */
    public Byte getBitDepth() {
        Byte value = this.bitDepth;
        checkIfParameterIsPresent(value);
        return value;
    }
    
    /**
     * Sets the bit depth of a PNG image.
     * @param value
     */
    public void setBitDepth(final Byte value) {
        checkIfValueIsNull(value);
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
}
