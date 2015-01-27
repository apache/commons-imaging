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

import java.nio.ByteOrder;

import org.apache.commons.imaging.ImagingConstants;

public final class TiffConstants {

    public static final ByteOrder DEFAULT_TIFF_BYTE_ORDER = ByteOrder.LITTLE_ENDIAN;

    public static final int TIFF_HEADER_SIZE = 8;
    public static final int TIFF_DIRECTORY_HEADER_LENGTH = 2;
    public static final int TIFF_DIRECTORY_FOOTER_LENGTH = 4;
    public static final int TIFF_ENTRY_LENGTH = 12;
    public static final int TIFF_ENTRY_MAX_VALUE_LENGTH = 4;

    public static final int TIFF_COMPRESSION_UNCOMPRESSED_1 = 1;
    public static final int TIFF_COMPRESSION_UNCOMPRESSED = TIFF_COMPRESSION_UNCOMPRESSED_1;
    public static final int TIFF_COMPRESSION_CCITT_1D = 2;
    public static final int TIFF_COMPRESSION_CCITT_GROUP_3 = 3;
    public static final int TIFF_COMPRESSION_CCITT_GROUP_4 = 4;
    public static final int TIFF_COMPRESSION_LZW = 5;
    public static final int TIFF_COMPRESSION_JPEG = 6;
    public static final int TIFF_COMPRESSION_UNCOMPRESSED_2 = 32771;
    public static final int TIFF_COMPRESSION_PACKBITS = 32773;

    /**
     * Parameter key. Used in write operations to indicate the desired
     * T.4 options to use when using TIFF_COMPRESSION_CCITT_GROUP_3.
     * <p>
     * Valid values: any Integer containing a mixture of the
     * TIFF_FLAG_T4_OPTIONS_2D, TIFF_FLAG_T4_OPTIONS_UNCOMPRESSED_MODE,
     * and TIFF_FLAG_T4_OPTIONS_FILL flags.
     */
    public static final String PARAM_KEY_T4_OPTIONS = "T4_OPTIONS";

    /**
     * Parameter key. Used in write operations to indicate the desired
     * T.6 options to use when using TIFF_COMPRESSION_CCITT_GROUP_4.
     * <p>
     * Valid values: any Integer containing either zero or
     * TIFF_FLAG_T6_OPTIONS_UNCOMPRESSED_MODE.
     */
    public static final String PARAM_KEY_T6_OPTIONS = "T6_OPTIONS";

    public static final int TIFF_FLAG_T4_OPTIONS_2D = 1;
    public static final int TIFF_FLAG_T4_OPTIONS_UNCOMPRESSED_MODE = 2;
    public static final int TIFF_FLAG_T4_OPTIONS_FILL = 4;
    public static final int TIFF_FLAG_T6_OPTIONS_UNCOMPRESSED_MODE = 2;
    
    
    public static final String PARAM_KEY_SUBIMAGE_X = "SUBIMAGE_X";
    public static final String PARAM_KEY_SUBIMAGE_Y = "SUBIMAGE_Y";
    public static final String PARAM_KEY_SUBIMAGE_WIDTH = "SUBIMAGE_WIDTH";
    public static final String PARAM_KEY_SUBIMAGE_HEIGHT = "SUBIMAGE_HEIGHT";

    /**
     * Specifies the amount of memory in bytes to be used for a strip
     * or tile size when employing LZW compression.  The default is
     * 8000 (roughly 8K). Minimum value is 8000.
     */
    public static final String PARAM_KEY_LZW_COMPRESSION_BLOCK_SIZE =
            "PARAM_KEY_LZW_COMPRESSION_BLOCK_SIZE";

    /**
     * Specifies a larger strip-size to be used for compression. This setting
     * generally produces smaller output files, but requires a slightly longer
     * processing time. Used in conjunction with the
     * PARAM_KEY_LZW_COMPRESSION_STRIP_SIZE
     */
    public static final int TIFF_LZW_COMPRESSION_BLOCK_SIZE_MEDIUM = 32768;

    /**
     * Specifies a larger strip-size to be used for compression. This setting
     * generally produces smaller output files, but requires a slightly longer
     * processing time. Used in conjunction with the
     * PARAM_KEY_LZW_COMPRESSION_STRIP_SIZE
     */
    public static final int TIFF_LZW_COMPRESSION_BLOCK_SIZE_LARGE = 65536;

    private TiffConstants() {
    }
}
