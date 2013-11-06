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

import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.common.ByteOrder;

public interface TiffConstants
        extends
            ImagingConstants,
            TiffDirectoryConstants,
            AllTagConstants {
    ByteOrder DEFAULT_TIFF_BYTE_ORDER = ByteOrder.INTEL;

    int TIFF_HEADER_SIZE = 8;
    int TIFF_DIRECTORY_HEADER_LENGTH = 2;
    int TIFF_DIRECTORY_FOOTER_LENGTH = 4;
    int TIFF_ENTRY_LENGTH = 12;
    int TIFF_ENTRY_MAX_VALUE_LENGTH = 4;

    int TIFF_COMPRESSION_UNCOMPRESSED_1 = 1;
    int TIFF_COMPRESSION_UNCOMPRESSED = TIFF_COMPRESSION_UNCOMPRESSED_1;
    int TIFF_COMPRESSION_CCITT_1D = 2;
    int TIFF_COMPRESSION_CCITT_GROUP_3 = 3;
    int TIFF_COMPRESSION_CCITT_GROUP_4 = 4;
    int TIFF_COMPRESSION_LZW = 5;
    int TIFF_COMPRESSION_JPEG = 6;
    int TIFF_COMPRESSION_UNCOMPRESSED_2 = 32771;
    int TIFF_COMPRESSION_PACKBITS = 32773;

    /**
     * Parameter key. Used in write operations to indicate the desired
     * T.4 options to use when using TIFF_COMPRESSION_CCITT_GROUP_3.
     * <p>
     * Valid values: any Integer containing a mixture of the
     * TIFF_FLAG_T4_OPTIONS_2D, TIFF_FLAG_T4_OPTIONS_UNCOMPRESSED_MODE,
     * and TIFF_FLAG_T4_OPTIONS_FILL flags.
     */
    String PARAM_KEY_T4_OPTIONS = "T4_OPTIONS";

    /**
     * Parameter key. Used in write operations to indicate the desired
     * T.6 options to use when using TIFF_COMPRESSION_CCITT_GROUP_4.
     * <p>
     * Valid values: any Integer containing either zero or
     * TIFF_FLAG_T6_OPTIONS_UNCOMPRESSED_MODE.
     */
    String PARAM_KEY_T6_OPTIONS = "T6_OPTIONS";

    int TIFF_FLAG_T4_OPTIONS_2D = 1;
    int TIFF_FLAG_T4_OPTIONS_UNCOMPRESSED_MODE = 2;
    int TIFF_FLAG_T4_OPTIONS_FILL = 4;
    int TIFF_FLAG_T6_OPTIONS_UNCOMPRESSED_MODE = 2;
    
    
    String PARAM_KEY_SUBIMAGE_X = "SUBIMAGE_X";
    String PARAM_KEY_SUBIMAGE_Y = "SUBIMAGE_Y";
    String PARAM_KEY_SUBIMAGE_WIDTH = "SUBIMAGE_WIDTH";
    String PARAM_KEY_SUBIMAGE_HEIGHT = "SUBIMAGE_HEIGHT";
}
