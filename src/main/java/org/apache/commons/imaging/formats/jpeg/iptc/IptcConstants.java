/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.imaging.formats.jpeg.iptc;

/**
 * IPTC (International Press Telecommunications Council) metadata constants.
 */
public final class IptcConstants {

    /** Maximum size for non-extended IPTC records: {@value}. */
    public static final int IPTC_NON_EXTENDED_RECORD_MAXIMUM_SIZE = 32767;

    /** Image resource block: Photoshop 2.0 info: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO = 0x03e8;

    /** Image resource block: Macintosh print info: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO = 0x03e9;

    /** Image resource block: XML data: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_XML_DATA = 0x03ea;

    /** Image resource block: Photoshop 2.0 color table: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_COLOR_TABLE = 0x03eb;

    /** Image resource block: resolution info: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_RESOLUTION_INFO = 0x03ed;

    /** Image resource block: alpha channels names: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_ALPHA_CHANNELS_NAMES = 0x03ee;

    /** Image resource block: display info: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_DISPLAY_INFO = 0x03ef;

    /** Image resource block: PString caption: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION = 0x03f0;

    /** Image resource block: border information: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_BORDER_INFORMATION = 0x03f1;

    /** Image resource block: background color: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_BACKGROUND_COLOR = 0x03f2;

    /** Image resource block: print flags: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_PRINT_FLAGS = 0x03f3;

    /** Image resource block: black and white halftoning info: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_BW_HALFTONING_INFO = 0x03f4;

    /** Image resource block: color halftoning info: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_COLOR_HALFTONING_INFO = 0x03f5;

    /** Image resource block: duotone halftoning info: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_DUOTONE_HALFTONING_INFO = 0x03f6;

    /** Image resource block: black and white transfer function: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_BW_TRANSFER_FUNC = 0x03f7;

    /** Image resource block: color transfer functions: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS = 0x03f8;

    /** Image resource block: duotone transfer functions: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_DUOTONE_TRANSFER_FUNCS = 0x03f9;

    /** Image resource block: duotone image info: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_DUOTONE_IMAGE_INFO = 0x03fa;

    /** Image resource block: effective black and white: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_EFFECTIVE_BW = 0x03fb;

    /** Image resource block: obsolete Photoshop tag 1: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1 = 0x03fc;

    /** Image resource block: EPS options: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_EPS_OPTIONS = 0x03fd;

    /** Image resource block: quick mask info: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO = 0x03fe;

    /** Image resource block: obsolete Photoshop tag 2: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG2 = 0x03ff;

    /** Image resource block: layer state info: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_LAYER_STATE_INFO = 0x0400;

    /** Image resource block: working path: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_WORKING_PATH = 0x0401;

    /** Image resource block: layers group info: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_LAYERS_GROUP_INFO = 0x0402;

    /** Image resource block: obsolete Photoshop tag 3: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG3 = 0x0403;

    /** Image resource block: IPTC data: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_IPTC_DATA = 0x0404;

    /** Image resource block: raw image mode: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_RAW_IMAGE_MODE = 0x0405;

    /** Image resource block: JPEG quality: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_JPEG_QUALITY = 0x0406;

    /** Image resource block: grid and guides info: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_GRID_GUIDES_INFO = 0x0408;

    /** Image resource block: Photoshop BGR thumbnail: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_PHOTOSHOP_BGR_THUMBNAIL = 0x0409;

    /** Image resource block: copyright flag: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_COPYRIGHT_FLAG = 0x040a;

    /** Image resource block: URL: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_URL = 0x040b;

    /** Image resource block: Photoshop thumbnail: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_PHOTOSHOP_THUMBNAIL = 0x040c;

    /** Image resource block: global angle: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_GLOBAL_ANGLE = 0x040d;

    /** Image resource block: color samplers resource: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_COLOR_SAMPLERS_RESOURCE = 0x040e;

    /** Image resource block: ICC profile: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_ICC_PROFILE = 0x040f;

    /** Image resource block: watermark: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_WATERMARK = 0x0410;

    /** Image resource block: ICC untagged: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_ICC_UNTAGGED = 0x0411;

    /** Image resource block: effects visible: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_EFFECTS_VISIBLE = 0x0412;

    /** Image resource block: spot halftone: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_SPOT_HALFTONE = 0x0413;

    /** Image resource block: IDs base value: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_IDS_BASE_VALUE = 0x0414;

    /** Image resource block: Unicode alpha names: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_UNICODE_ALPHA_NAMES = 0x0415;

    /** Image resource block: indexed colour table count: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_INDEXED_COLOUR_TABLE_COUNT = 0x0416;

    /** Image resource block: transparent index: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_TRANSPARENT_INDEX = 0x0417;

    /** Image resource block: global altitude: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_GLOBAL_ALTITUDE = 0x0419;

    /** Image resource block: slices: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_SLICES = 0x041a;

    /** Image resource block: workflow URL: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_WORKFLOW_URL = 0x041b;

    /** Image resource block: jump to XPEP: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_JUMP_TO_XPEP = 0x041c;

    /** Image resource block: alpha identifiers: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_ALPHA_IDENTIFIERS = 0x041d;

    /** Image resource block: URL list: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_URL_LIST = 0x041e;

    /** Image resource block: version info: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_VERSION_INFO = 0x0421;

    /** Image resource block: EXIF info: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_EXIFINFO = 0x0422;

    /** Image resource block: EXIF info 2: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_EXIF_INFO2 = 0x0423;

    /** Image resource block: XMP metadata: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_XMP = 0x0424;

    /** Image resource block: caption digest: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_CAPTION_DIGEST = 0x0425;

    /** Image resource block: print scale: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_PRINT_SCALE = 0x0426;

    /** Image resource block: pixel aspect ratio: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_PIXEL_ASPECT_RATIO = 0x0428;

    /** Image resource block: layer comps: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_LAYER_COMPS = 0x0429;

    /** Image resource block: alternate duotone colors: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_ALTERNATE_DUOTONE_COLORS = 0x042a;

    /** Image resource block: alternate spot colors: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_ALTERNATE_SPOT_COLORS = 0x042b;

    /** Image resource block: clipping path name: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_CLIPPING_PATH_NAME = 0x0bb7;

    /** Image resource block: print flags info: {@value}. */
    public static final int IMAGE_RESOURCE_BLOCK_PRINT_FLAGS_INFO = 0x2710;

    /** IPTC record tag marker: {@value}. */
    public static final int IPTC_RECORD_TAG_MARKER = 0x1c;

    /** IPTC envelope record number: {@value}. */
    public static final int IPTC_ENVELOPE_RECORD_NUMBER = 0x01;

    /** IPTC application 2 record number: {@value}. */
    public static final int IPTC_APPLICATION_2_RECORD_NUMBER = 0x02;

    private IptcConstants() {
    }
}
