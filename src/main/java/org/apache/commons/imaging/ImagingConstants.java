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
 * Defines constants that may be used in passing options to
 * ImageParser read/write implementations, the utility routines
 * implemented in the Imaging class, and throughout the
 * Apache Commons Imaging package.  Individual ImageParser
 * implementations may define their own format-specific options.
 */
public final class ImagingConstants {

    /**
     * <p>Parameter key. Used in write operations to indicate desired compression
     * algorithm.</p>
     *
     * <p>Currently only applies to writing TIFF image files.</p>
     *
     * <p>Valid values: {@code TiffConstants.TIFF_COMPRESSION_UNCOMPRESSED,
     * TiffConstants.TIFF_COMPRESSION_CCITT_1D,
     * TiffConstants.TIFF_COMPRESSION_LZW,
     * TiffConstants.TIFF_COMPRESSION_PACKBITS.}</p>
     *
     * @see org.apache.commons.imaging.formats.tiff.constants.TiffConstants
     */
    public static final String PARAM_KEY_COMPRESSION = "COMPRESSION";

    /**
     * <p>Parameter key. Indicates whether to throw exceptions when parsing invalid
     * files, or whether to tolerate small problems.</p>
     *
     * <p>Valid values: {@code Boolean.TRUE} and {@code Boolean.FALSE}. Default value:
     * {@code Boolean.FALSE}.</p>
     *
     * @see org.apache.commons.imaging.formats.tiff.constants.TiffConstants
     */
    public static final String PARAM_KEY_STRICT = "STRICT";

    /**
     * Empty byte array.
     */
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

    private ImagingConstants() {
    }
}
