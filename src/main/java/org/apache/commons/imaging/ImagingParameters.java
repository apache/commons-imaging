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
 * It holds data needed for all image formats. For data needed only by one
 * particular format there are inherited classes.
 * <p>
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
    // default value for verbose - is set after initialization and resetVerbose()
    private final Boolean verboseDefault = Boolean.FALSE; //PARAM_KEY_VERBOSE
    
    private Boolean strict;
    private final Boolean strictDefault = Boolean.FALSE; // PARAM_KEY_STRICT
    
    private String fileNameForReading; // PARAM_KEY_FILENAME
    
    private String xmpXmlAsString; // PARAM_KEY_XMP_XML
    
    private ImageFormat imageFormat; // PARAM_KEY_FORMAT
    
    private BufferedImageFactory bufferedImageFactory; // BUFFERED_IMAGE_FACTORY
    
    private PixelDensity pixelDensity; // PARAM_KEY_PIXEL_DENSITY
    
    /**
     * This gives you a parameter object with default values.
     */
    public ImagingParameters() {
        this.verbose = verboseDefault;
        this.strict = strictDefault;
        this.fileNameForReading = null;
        this.xmpXmlAsString = null;
        this.imageFormat = null;
        this.bufferedImageFactory = null;
        this.pixelDensity = null;
    }
    
    //****** verbose ******
    /**
     * Parameter applies to read and write operations.
     * <p>
     * This one comes with a default value: Boolean.FALSE.
     * @return Valid values: Boolean.TRUE and Boolean.FALSE.
     */
    public Boolean isVerbose() {
        return this.verbose;
    }
    
    /**
     * Parameter applies to read and write operations.
     * This method sets the verbose mode.
     */
    public void setVerbose() {
        this.verbose = Boolean.TRUE;
    }
    
    /**
     * Parameter applies to read and write operations.
     * This method removes the verbose mode.
     */
    public void resetVerbose() {
        this.verbose = verboseDefault;
    }
    
    //****** strict ******
    
    /**
     * Parameter indicates whether to throw exceptions when parsing invalid
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
     * Parameter indicates whether to throw exceptions when parsing invalid
     * files, or whether to tolerate small problems.
     * This method switches the behavior so that it tolerates small problems.
     */
    public void setStrict() {
        this.strict = Boolean.TRUE;
    }
    
    /**
     * Parameter indicates whether to throw exceptions when parsing invalid
     * files, or whether to tolerate small problems.
     * This method switches the behavior so that it throws exceptions when
     * parsing invalid files.
     */
    public void resetStrict() {
        this.strict = strictDefault;
    }
    
    //****** fileNameForReading ******
    
    /**
     * Parameter used to hint the filename when reading from a byte array
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
     * Parameter used to hint the filename when reading from a byte array
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
     * Parameter used to hint the filename when reading from a byte array
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
     * Parameter used to hint the filename when reading from a byte array
     * or InputStream. The filename hint can help disambiguate what file the
     * image format.
     * <p>
     * Applies to read operations.
     * <p>
     * Resets the parameter to the default state (value not present)
     */
    public void resetFileNameForReading() {
        this.fileNameForReading = null;
    }
    
    //****** xmpXmlAsString ******
    
    /**
     * Parameter key.
     * 
     * Only used when writing images. Valid values: String of XMP XML.
     * @return {@code true} if there is a value present, {@false} else.
     */
    public boolean isXmpXmlAsStringPresent() {
        return this.xmpXmlAsString == null;
    }
    
    /**
     * Parameter key.
     * 
     * Only used when writing images.
     * @return Valid values: String of XMP XML.
     */
    public String getXmpXmlAsString() {
        String value = this.xmpXmlAsString;
        checkIfParameterIsPresent(value);
        return value;
    }
    
    /**
     * Parameter key.
     * 
     * Only used when writing images.
     * @param value Valid values: String of XMP XML.
     */
    public void setXmpXmlAsString(final String value) {
        checkIfValueIsNull(value);
        this.xmpXmlAsString = value;
    }
    
    /**
     * Parameter key.
     * 
     * Only used when writing images. Valid values: String of XMP XML.
     * <p>
     * Resets the parameter to the default state (value not present)
     */
    public void resetXmpXmlAsString() {
        this.xmpXmlAsString = null;
    }
    
    //****** imageFormat ******
    
    /**
     * Parameter used in write operations to indicate desired image format.
     * @return {@code true} if there is a value present, {@false} else.
     */
    public boolean isImageFormatPresent() {
        return this.imageFormat == null;
    }
    
    /**
     * Parameter used in write operations to indicate desired image format.
     * @return Valid values: Any format defined in ImageFormat, such as
     * ImageFormat.IMAGE_FORMAT_PNG.
     */
    public ImageFormat getImageFormat() {
        ImageFormat value = this.imageFormat;
        checkIfParameterIsPresent(value);
        return value;
    }
    
    /**
     * Parameter used in write operations to indicate desired image format.
     * @param value Valid values: Any format defined in ImageFormat, such as
     * ImageFormat.IMAGE_FORMAT_PNG.
     */
    public void setImageFormat(final ImageFormat value) {
        checkIfValueIsNull(value);
        this.imageFormat = value;
    }
    
    /**
     * Parameter used in write operations to indicate desired image format.
     * <p>
     * Resets the parameter to the default state (value not present)
     */
    public void resetImageFormat() {
        this.imageFormat = null;
    }
    
    //****** bufferedImageFactory ******
    
    /**
     * 
     * @return {@code true} if there is a value present, {@false} else.
     */
    public boolean isBufferedImageFactoryPresent() {
        return this.bufferedImageFactory == null;
    }
    
    /**
     * 
     * @return A BufferedImageFactory
     */
    public BufferedImageFactory getBufferedImageFactory() {
        BufferedImageFactory value = this.bufferedImageFactory;
        checkIfParameterIsPresent(value);
        return value;
    }
    
    /**
     * 
     * @param value A BufferedImageFactory
     */
    public void setBufferedImageFactory(final BufferedImageFactory value) {
        checkIfValueIsNull(value);
        this.bufferedImageFactory = value;
    }
    
    /**
     * 
     * <p>
     * Resets the parameter to the default state (value not present)
     */
    public void resetBufferedImageFactory() {
        this.bufferedImageFactory = null;
    }
    
    //****** pixelDensity ******
    
    /**
     * Parameter key. Used in write operations to indicate the desired pixel
     * density (DPI), and/or aspect ratio.
     * @return {@code true} if there is a value present, {@false} else.
     * @see org.apache.commons.imaging.PixelDensity
     */
    public boolean isPixelDensityPresent() {
        return this.pixelDensity == null;
    }
    
    /**
     * Parameter key. Used in write operations to indicate the desired pixel
     * density (DPI), and/or aspect ratio.
     * @return Valid values: PixelDensity
     * @see org.apache.commons.imaging.PixelDensity
     */
    public PixelDensity getPixelDensity() {
        PixelDensity value = this.pixelDensity;
        checkIfParameterIsPresent(value);
        return value;
    }
    
    /**
     * Parameter key. Used in write operations to indicate the desired pixel
     * density (DPI), and/or aspect ratio.
     * @param value Valid values: PixelDensity
     * @see org.apache.commons.imaging.PixelDensity
     */
    public void setPixelDensity(final PixelDensity value) {
        checkIfValueIsNull(value);
        this.pixelDensity = value;
    }
    
    /**
     * Parameter key. Used in write operations to indicate the desired pixel
     * density (DPI), and/or aspect ratio.
     * <p>
     * Resets the parameter to the default state (value not present)
     * @see org.apache.commons.imaging.PixelDensity
     */
    public void resetPixelDensity() {
        this.pixelDensity = null;
    }
    
    //****** check methods ******
    
    /**
     * Throws a RuntimeException if a given value is {code null}.
     * @param value 
     */
    final void checkIfValueIsNull(final Object value) {
        if (value == null) {
            throw new IllegalArgumentException("The value for any parameter must not null.");
        }
    }
    
    /**
     * Throws a RuntimeException if the value for this parameter isn't set yet.
     * @param value 
     */
    final void checkIfParameterIsPresent(final Object value) {
        if (value == null) {
            throw new IllegalStateException("You tried to get a value which is not present.");
        }
    }
}
