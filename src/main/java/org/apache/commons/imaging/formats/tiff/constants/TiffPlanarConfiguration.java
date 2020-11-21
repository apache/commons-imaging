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
package org.apache.commons.imaging.formats.tiff.constants;

/**
 * Defines options for the organization of data in a TIFF file.
 */
public enum TiffPlanarConfiguration {

    /**
     * Indicates that data is stored in an interleaved format,
     * so that component values for each pixel are contiguous in the file.
     */
    CHUNKY(TiffTagConstants.PLANAR_CONFIGURATION_VALUE_CHUNKY),
    /**
     * Indicates that data is stored in a non-interleaved format,
     * component values for each pixel are separated into distinct
     * planes.
     */
    PLANAR(TiffTagConstants.PLANAR_CONFIGURATION_VALUE_PLANAR);

    /**
     * The integer code values used for indicating the planar configuration
     * in a TIFF file.
     */
    public final int codeValue;

    /**
     *
     * @param codeValue format-indicator value for use in file.
     */
    TiffPlanarConfiguration(final int codeValue) {
        this.codeValue = codeValue;
    }

    /**
     * Interprets an integer code value to determine the enumerated value.
     * Implements lenient rules for handling non-compliant values.
     *
     * @param codeValue an integer code corresponding to the TIFF specification.
     * @return a valid enumeration.
     */
    public static TiffPlanarConfiguration lenientValueOf(final int codeValue) {
        switch (codeValue) {
            case TiffTagConstants.PLANAR_CONFIGURATION_VALUE_CHUNKY:
                return CHUNKY;
            case TiffTagConstants.PLANAR_CONFIGURATION_VALUE_PLANAR:
                return PLANAR;
            default:
                return CHUNKY;
        }
    }
}
