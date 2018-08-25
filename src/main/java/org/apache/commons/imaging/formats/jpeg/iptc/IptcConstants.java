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
package org.apache.commons.imaging.formats.jpeg.iptc;


public final class IptcConstants {
    public static final int IPTC_NON_EXTENDED_RECORD_MAXIMUM_SIZE = 32767;

    public static final int IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO = 0x03e8;
    public static final int IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO = 0x03e9;
    public static final int IMAGE_RESOURCE_BLOCK_XML_DATA = 0x03ea;
    public static final int IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_COLOR_TABLE = 0x03eb;
    public static final int IMAGE_RESOURCE_BLOCK_RESOLUTION_INFO = 0x03ed;
    public static final int IMAGE_RESOURCE_BLOCK_ALPHA_CHANNELS_NAMES = 0x03ee;
    public static final int IMAGE_RESOURCE_BLOCK_DISPLAY_INFO = 0x03ef;
    public static final int IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION = 0x03f0;
    public static final int IMAGE_RESOURCE_BLOCK_BORDER_INFORMATION = 0x03f1;
    public static final int IMAGE_RESOURCE_BLOCK_BACKGROUND_COLOR = 0x03f2;
    public static final int IMAGE_RESOURCE_BLOCK_PRINT_FLAGS = 0x03f3;
    public static final int IMAGE_RESOURCE_BLOCK_BW_HALFTONING_INFO = 0x03f4;
    public static final int IMAGE_RESOURCE_BLOCK_COLOR_HALFTONING_INFO = 0x03f5;
    public static final int IMAGE_RESOURCE_BLOCK_DUOTONE_HALFTONING_INFO = 0x03f6;
    public static final int IMAGE_RESOURCE_BLOCK_BW_TRANSFER_FUNC = 0x03f7;
    public static final int IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS = 0x03f8;
    public static final int IMAGE_RESOURCE_BLOCK_DUOTONE_TRANSFER_FUNCS = 0x03f9;
    public static final int IMAGE_RESOURCE_BLOCK_DUOTONE_IMAGE_INFO = 0x03fa;
    public static final int IMAGE_RESOURCE_BLOCK_EFFECTIVE_BW = 0x03fb;
    public static final int IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1 = 0x03fc;
    public static final int IMAGE_RESOURCE_BLOCK_EPS_OPTIONS = 0x03fd;
    public static final int IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO = 0x03fe;
    public static final int IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG2 = 0x03ff;
    public static final int IMAGE_RESOURCE_BLOCK_LAYER_STATE_INFO = 0x0400;
    public static final int IMAGE_RESOURCE_BLOCK_WORKING_PATH = 0x0401;
    public static final int IMAGE_RESOURCE_BLOCK_LAYERS_GROUP_INFO = 0x0402;
    public static final int IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG3 = 0x0403;
    public static final int IMAGE_RESOURCE_BLOCK_IPTC_DATA = 0x0404;
    public static final int IMAGE_RESOURCE_BLOCK_RAW_IMAGE_MODE = 0x0405;
    public static final int IMAGE_RESOURCE_BLOCK_JPEG_QUALITY = 0x0406;
    public static final int IMAGE_RESOURCE_BLOCK_GRID_GUIDES_INFO = 0x0408;
    public static final int IMAGE_RESOURCE_BLOCK_PHOTOSHOP_BGR_THUMBNAIL = 0x0409;
    public static final int IMAGE_RESOURCE_BLOCK_COPYRIGHT_FLAG = 0x040a;
    public static final int IMAGE_RESOURCE_BLOCK_URL = 0x040b;
    public static final int IMAGE_RESOURCE_BLOCK_PHOTOSHOP_THUMBNAIL = 0x040c;
    public static final int IMAGE_RESOURCE_BLOCK_GLOBAL_ANGLE = 0x040d;
    public static final int IMAGE_RESOURCE_BLOCK_COLOR_SAMPLERS_RESOURCE = 0x040e;
    public static final int IMAGE_RESOURCE_BLOCK_ICC_PROFILE = 0x040f;
    public static final int IMAGE_RESOURCE_BLOCK_WATERMARK = 0x0410;
    public static final int IMAGE_RESOURCE_BLOCK_ICC_UNTAGGED = 0x0411;
    public static final int IMAGE_RESOURCE_BLOCK_EFFECTS_VISIBLE = 0x0412;
    public static final int IMAGE_RESOURCE_BLOCK_SPOT_HALFTONE = 0x0413;
    public static final int IMAGE_RESOURCE_BLOCK_IDS_BASE_VALUE = 0x0414;
    public static final int IMAGE_RESOURCE_BLOCK_UNICODE_ALPHA_NAMES = 0x0415;
    public static final int IMAGE_RESOURCE_BLOCK_INDEXED_COLOUR_TABLE_COUNT = 0x0416;
    public static final int IMAGE_RESOURCE_BLOCK_TRANSPARENT_INDEX = 0x0417;
    public static final int IMAGE_RESOURCE_BLOCK_GLOBAL_ALTITUDE = 0x0419;
    public static final int IMAGE_RESOURCE_BLOCK_SLICES = 0x041a;
    public static final int IMAGE_RESOURCE_BLOCK_WORKFLOW_URL = 0x041b;
    public static final int IMAGE_RESOURCE_BLOCK_JUMP_TO_XPEP = 0x041c;
    public static final int IMAGE_RESOURCE_BLOCK_ALPHA_IDENTIFIERS = 0x041d;
    public static final int IMAGE_RESOURCE_BLOCK_URL_LIST = 0x041e;
    public static final int IMAGE_RESOURCE_BLOCK_VERSION_INFO = 0x0421;
    public static final int IMAGE_RESOURCE_BLOCK_EXIFINFO = 0x0422;
    public static final int IMAGE_RESOURCE_BLOCK_EXIF_INFO2 = 0x0423;
    public static final int IMAGE_RESOURCE_BLOCK_XMP = 0x0424;
    public static final int IMAGE_RESOURCE_BLOCK_CAPTION_DIGEST = 0x0425;
    public static final int IMAGE_RESOURCE_BLOCK_PRINT_SCALE = 0x0426;
    public static final int IMAGE_RESOURCE_BLOCK_PIXEL_ASPECT_RATIO = 0x0428;
    public static final int IMAGE_RESOURCE_BLOCK_LAYER_COMPS = 0x0429;
    public static final int IMAGE_RESOURCE_BLOCK_ALTERNATE_DUOTONE_COLORS = 0x042a;
    public static final int IMAGE_RESOURCE_BLOCK_ALTERNATE_SPOT_COLORS = 0x042b;
    public static final int IMAGE_RESOURCE_BLOCK_CLIPPING_PATH_NAME = 0x0bb7;
    public static final int IMAGE_RESOURCE_BLOCK_PRINT_FLAGS_INFO = 0x2710;

    public static final int IPTC_RECORD_TAG_MARKER = 0x1c;
    public static final int IPTC_ENVELOPE_RECORD_NUMBER = 0x01;
    public static final int IPTC_APPLICATION_2_RECORD_NUMBER = 0x02;

    private IptcConstants() {
    }
}
