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
 * This class is a POJO holding data for parameters as requested in IMAGING-159.
 * It holds additional data needed for the PNM format only.
 */
public final class ImagingParametersPnm extends ImagingParameters {
    
    private boolean useRawbits;
    
    /**
     * This gives you a parameter object with default values.
     */
    public ImagingParametersPnm() {
        this.useRawbits = true;
    }
    
    // ****** isUseRawbitsEnabled ******
    
    /**
     * {@code true} = use raw bits; {@code false} = don't use raw bits
     * <p>
     * Default value: {@code false}
     * @return 
     */
    public boolean isUseRawbitsEnabled() {
        return this.useRawbits;
    }
    
    /**
     * use raw bits
     */
    public void enableUseRawbits() {
        this.useRawbits = true;
    }
    
    /**
     * don't use raw bits
     */
    public void disableUseRawbits() {
        this.useRawbits = false;
    }
}
