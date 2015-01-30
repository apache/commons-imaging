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

import org.apache.commons.imaging.common.BufferedImageFactory;

/**
 * This class is a POJO holding data for parameters as requested in IMAGING-159.
 * It implements lazy initialization: <br>
 * After getting an instance there is no value present until you set one using
 * one the setter methods. Until a value is set, isPresentX() will return
 * {@code false}. If you try to access the value you will get an RuntimeException.
 * <p>
 * After a value is set isPresentX() will return true and you may access the value.
 * You can unset any value using unsetX(). Then you got the same state as before
 * a value for this parameter was set.
 */
public class ImagingParameters {
    
    private Boolean verbose;
    
    private Boolean strict;
    
    private String fileNameForReading;
    
    private String xmpXmlAsString;
    
    private ImageFormat imageFormat;
    
    private BufferedImageFactory bufferedImageFactory;
    
    private PixelDensity pixelDensity;
    
    /**
     * This gives you a parameter object without values.
     */
    public ImagingParameters() {
        this.verbose = null;
        this.strict = null;
        this.fileNameForReading = null;
        this.xmpXmlAsString = null;
        this.imageFormat = null;
        this.bufferedImageFactory = null;
        this.pixelDensity = null;
    }
    
    
    
    
    /**
     * Throws a RuntimeException if the value for this parameter isn't set yet.
     * @param value 
     */
    private void checkIfParameterWasSet(final Object value) {
        if (value == null) {
            throw new IllegalStateException("You tried to get a value which is not present.");
        }
    }
}
