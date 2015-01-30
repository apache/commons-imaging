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
 * It implements lazy initialization for some values: <br>
 * After getting an instance there is no value present until you set one using
 * one the setter methods. Until a value is set, isPresentX() will return
 * {@code false}. If you try to access the value you will get an RuntimeException.
 * <p>
 * After a value is set isPresentX() will return true and you may access the value.
 * You can reset any value using resetX(). Then you got the same state as before
 * a value for this parameter was set.
 * <p>Other values have a default value, see the particular javadoc.
 * For these values the resetX() method restores the default value.
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
     * <p>
     * Some values got default values:<br>
     * verbose (Boolean.FALSE), strict
     */
    public ImagingParameters() {
        this.verbose = Boolean.FALSE;
        this.strict = Boolean.FALSE;
        this.fileNameForReading = null;
        this.xmpXmlAsString = null;
        this.imageFormat = null;
        this.bufferedImageFactory = null;
        this.pixelDensity = null;
    }
    
    //****** verbose ******
    /**
     * Parameter key. Applies to read and write operations.
     * <p>
     * This one comes with a default value: Boolean.FALSE.
     * @return Valid values: Boolean.TRUE and Boolean.FALSE.
     */
    public Boolean isVerbose() {
        return this.verbose;
    }
    
    /**
     * Parameter key. Applies to read and write operations.
     * @param value Valid values: Boolean.TRUE and Boolean.FALSE.
     */
    public void setVerbose(final Boolean value) {
        checkIfValueIsNull(value);
        this.verbose = value;
    }
    
    /**
     * Parameter key. Applies to read and write operations.
     * Reset this parameter to it's default value (Boolean.FALSE).
     */
    public void resetVerbose() {
        this.verbose = Boolean.FALSE;
    }
    
    //****** strict ******
    
    /**
     * Parameter key. Indicates whether to throw exceptions when parsing invalid
     * files, or whether to tolerate small problems.
     * <p>
     * This one comes with a default value: Boolean.FALSE.
     * @return Valid values: Boolean.TRUE and Boolean.FALSE. Default value:
     * Boolean.FALSE.
     * @see org.apache.commons.imaging.formats.tiff.constants.TiffConstants
     */
    public Boolean isStrict() {
        return this.strict;
    }
    
    /**
     * Parameter key. Indicates whether to throw exceptions when parsing invalid
     * files, or whether to tolerate small problems.
     * @param value Valid values: Boolean.TRUE and Boolean.FALSE.
     */
    public void setStrict(final Boolean value) {
        checkIfValueIsNull(value);
        this.strict = value;
    }
    
    /**
     * Parameter key. Indicates whether to throw exceptions when parsing invalid
     * files, or whether to tolerate small problems.
     * Reset this parameter to it's default value (Boolean.FALSE).
     */
    public void resetStrict() {
        this.strict = Boolean.FALSE;
    }
    
    //****** fileNameForReading ******
    
    /**
     * Parameter key. Used to hint the filename when reading from a byte array
     * or InputStream. The filename hint can help disambiguate what file the
     * image format.
     * <p>
     * Applies to read operations.
     * @return {@code true} if there is a value present, {@false} else.
     */
    public boolean isFileNameForReadingPresent() {
        return this.fileNameForReading == null;
    }
    
    /**
     * Parameter key. Used to hint the filename when reading from a byte array
     * or InputStream. The filename hint can help disambiguate what file the
     * image format.
     * <p>
     * Applies to read operations.
     * @return Valid values: filename as string
     * @see java.io.InputStream
     */
    public String getFileNameForReading() {
        String value = this.fileNameForReading;
        checkIfParameterIsPresent(value);
        return value;
    }
    
    /**
     * Parameter key. Used to hint the filename when reading from a byte array
     * or InputStream. The filename hint can help disambiguate what file the
     * image format.
     * <p>
     * Applies to read operations.
     * @param value Valid values: filename as string
     * @see java.io.InputStream
     */
    public void setFileNameForReading(final String value) {
        checkIfValueIsNull(value);
        this.fileNameForReading = value;
    }
    
    /**
     * Parameter key. Used to hint the filename when reading from a byte array
     * or InputStream. The filename hint can help disambiguate what file the
     * image format.
     * <p>
     * Applies to read operations.
     * <p>Resets the parameter to the default state (value not present)
     */
    public void resetFileNameForReading() {
        this.fileNameForReading = null;
    }
    
    
    /**
     * Throws a RuntimeException if a given value is {code null}.
     * @param value 
     */
    private void checkIfValueIsNull(final Object value) {
        if (value == null) {
            throw new IllegalArgumentException("The value for any parameter must not null.");
        }
    }
    
    /**
     * Throws a RuntimeException if the value for this parameter isn't set yet.
     * @param value 
     */
    private void checkIfParameterIsPresent(final Object value) {
        if (value == null) {
            throw new IllegalStateException("You tried to get a value which is not present.");
        }
    }
}
