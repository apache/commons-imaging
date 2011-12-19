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
package org.apache.commons.sanselan.formats.jpeg.iptc;

import org.apache.commons.sanselan.formats.jpeg.JpegConstants;

public interface IptcConstants extends JpegConstants
{

    public static final byte IPTC_PREFIX[] = { 0x1C, 0x02, };

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

    // public static final int IPTC_RECORD_PREFIX = 0x1c02;
    public static final int IPTC_RECORD_TAG_MARKER = 0x1c;
    public static final int IPTC_ENVELOPE_RECORD_NUMBER = 0x01;
    public static final int IPTC_APPLICATION_2_RECORD_NUMBER = 0x02;

    public static final IptcType IPTC_TYPE_RECORD_VERSION = new IptcType(0,
            "Record Version");
    public static final IptcType IPTC_TYPE_OBJECT_TYPE_REFERENCE = new IptcType(
            3, "Object Type Reference");
    public static final IptcType IPTC_TYPE_OBJECT_ATTRIBUTE_REFERENCE = new IptcType(
            4, "Object Attribute Reference");
    public static final IptcType IPTC_TYPE_OBJECT_NAME = new IptcType(5,
            "Object Name");
    public static final IptcType IPTC_TYPE_EDIT_STATUS = new IptcType(7,
            "Edit Status");
    public static final IptcType IPTC_TYPE_EDITORIAL_UPDATE = new IptcType(8,
            "Editorial Update");
    public static final IptcType IPTC_TYPE_URGENCY = new IptcType(10, "Urgency");
    public static final IptcType IPTC_TYPE_SUBJECT_REFERENCE = new IptcType(12,
            "Subject Reference");
    public static final IptcType IPTC_TYPE_CATEGORY = new IptcType(15,
            "Category");
    public static final IptcType IPTC_TYPE_SUPPLEMENTAL_CATEGORY = new IptcType(
            20, "Supplemental Category");
    public static final IptcType IPTC_TYPE_FIXTURE_IDENTIFIER = new IptcType(
            22, "Fixture Identifier");
    public static final IptcType IPTC_TYPE_KEYWORDS = new IptcType(25,
            "Keywords");
    public static final IptcType IPTC_TYPE_CONTENT_LOCATION_CODE = new IptcType(
            26, "Content Location Code");
    public static final IptcType IPTC_TYPE_CONTENT_LOCATION_NAME = new IptcType(
            27, "Content Location Name");
    public static final IptcType IPTC_TYPE_RELEASE_DATE = new IptcType(30,
            "Release Date");
    public static final IptcType IPTC_TYPE_RELEASE_TIME = new IptcType(35,
            "Release Time");
    public static final IptcType IPTC_TYPE_EXPIRATION_DATE = new IptcType(37,
            "Expiration Date");
    public static final IptcType IPTC_TYPE_EXPIRATION_TIME = new IptcType(38,
            "Expiration Time");
    public static final IptcType IPTC_TYPE_SPECIAL_INSTRUCTIONS = new IptcType(
            40, "Special Instructions");
    public static final IptcType IPTC_TYPE_ACTION_ADVISED = new IptcType(42,
            "Action Advised");
    public static final IptcType IPTC_TYPE_REFERENCE_SERVICE = new IptcType(45,
            "Reference Service");
    public static final IptcType IPTC_TYPE_REFERENCE_DATE = new IptcType(47,
            "Reference Date");
    public static final IptcType IPTC_TYPE_REFERENCE_NUMBER = new IptcType(50,
            "Reference Number");
    public static final IptcType IPTC_TYPE_DATE_CREATED = new IptcType(55,
            "Date Created");
    public static final IptcType IPTC_TYPE_TIME_CREATED = new IptcType(60,
            "Time Created");
    public static final IptcType IPTC_TYPE_DIGITAL_CREATION_DATE = new IptcType(
            62, "Digital Creation Date");
    public static final IptcType IPTC_TYPE_DIGITAL_CREATION_TIME = new IptcType(
            63, "Digital Creation Time");
    public static final IptcType IPTC_TYPE_ORIGINATING_PROGRAM = new IptcType(
            65, "Originating Program");
    public static final IptcType IPTC_TYPE_PROGRAM_VERSION = new IptcType(70,
            "Program Version");
    public static final IptcType IPTC_TYPE_OBJECT_CYCLE = new IptcType(75,
            "Object Cycle");
    public static final IptcType IPTC_TYPE_BYLINE = new IptcType(80, "By-line");
    public static final IptcType IPTC_TYPE_BYLINE_TITLE = new IptcType(85,
            "By-line Title");
    public static final IptcType IPTC_TYPE_CITY = new IptcType(90, "City");
    public static final IptcType IPTC_TYPE_SUBLOCATION = new IptcType(92,
            "Sublocation");
    public static final IptcType IPTC_TYPE_PROVINCE_STATE = new IptcType(95,
            "Province/State");
    public static final IptcType IPTC_TYPE_COUNTRY_PRIMARY_LOCATION_CODE = new IptcType(
            100, "Country/Primary Location Code");
    public static final IptcType IPTC_TYPE_COUNTRY_PRIMARY_LOCATION_NAME = new IptcType(
            101, "Country/Primary Location Name");
    public static final IptcType IPTC_TYPE_ORIGINAL_TRANSMISSION_REFERENCE = new IptcType(
            103, "Original Transmission, Reference");
    public static final IptcType IPTC_TYPE_HEADLINE = new IptcType(105,
            "Headline");
    public static final IptcType IPTC_TYPE_CREDIT = new IptcType(110, "Credit");
    public static final IptcType IPTC_TYPE_SOURCE = new IptcType(115, "Source");
    public static final IptcType IPTC_TYPE_COPYRIGHT_NOTICE = new IptcType(116,
            "Copyright Notice");
    public static final IptcType IPTC_TYPE_CONTACT = new IptcType(118,
            "Contact");
    public static final IptcType IPTC_TYPE_CAPTION_ABSTRACT = new IptcType(120,
            "Caption/Abstract");
    public static final IptcType IPTC_TYPE_WRITER_EDITOR = new IptcType(122,
            "Writer/Editor");
    public static final IptcType IPTC_TYPE_RASTERIZED_CAPTION = new IptcType(
            125, "Rasterized Caption");
    public static final IptcType IPTC_TYPE_IMAGE_TYPE = new IptcType(130,
            "ImageType");
    public static final IptcType IPTC_TYPE_IMAGE_ORIENTATION = new IptcType(
            131, "Image Orientation");
    public static final IptcType IPTC_TYPE_LANGUAGE_IDENTIFIER = new IptcType(
            135, "Language Identifier");
    public static final IptcType IPTC_TYPE_AUDIO_TYPE = new IptcType(150,
            "Audio Type");
    public static final IptcType IPTC_TYPE_AUDIO_SAMPLING_RATE = new IptcType(
            151, "Audio Sampling Rate");
    public static final IptcType IPTC_TYPE_AUDIO_SAMPLING_RESOLUTION = new IptcType(
            152, "Audio Sampling Resolution");
    public static final IptcType IPTC_TYPE_AUDIO_DURATION = new IptcType(153,
            "Audio Duration");
    public static final IptcType IPTC_TYPE_AUDIO_OUTCUE = new IptcType(154,
            "Audio Outcue");
    public static final IptcType IPTC_TYPE_OBJECT_DATA_PREVIEW_FILE_FORMAT = new IptcType(
            200, "Object Data Preview, File Format");
    public static final IptcType IPTC_TYPE_OBJECT_DATA_PREVIEW_FILE_FORMAT_VERSION = new IptcType(
            201, "Object Data Preview, File Format Version");
    public static final IptcType IPTC_TYPE_OBJECT_DATA_PREVIEW_DATA = new IptcType(
            202, "Object Data Preview Data");
    // --
    // public static final IptcType IPTC_TYPE_UNKNOWN = new IptcType(-1,
    // "Unknown");

    public static final IptcType IPTC_TYPES[] = { IPTC_TYPE_RECORD_VERSION,
            IPTC_TYPE_OBJECT_TYPE_REFERENCE,
            IPTC_TYPE_OBJECT_ATTRIBUTE_REFERENCE, IPTC_TYPE_OBJECT_NAME,
            IPTC_TYPE_EDIT_STATUS, IPTC_TYPE_EDITORIAL_UPDATE,
            IPTC_TYPE_URGENCY, IPTC_TYPE_SUBJECT_REFERENCE, IPTC_TYPE_CATEGORY,
            IPTC_TYPE_SUPPLEMENTAL_CATEGORY, IPTC_TYPE_FIXTURE_IDENTIFIER,
            IPTC_TYPE_KEYWORDS, IPTC_TYPE_CONTENT_LOCATION_CODE,
            IPTC_TYPE_CONTENT_LOCATION_NAME, IPTC_TYPE_RELEASE_DATE,
            IPTC_TYPE_RELEASE_TIME, IPTC_TYPE_EXPIRATION_DATE,
            IPTC_TYPE_EXPIRATION_TIME, IPTC_TYPE_SPECIAL_INSTRUCTIONS,
            IPTC_TYPE_ACTION_ADVISED, IPTC_TYPE_REFERENCE_SERVICE,
            IPTC_TYPE_REFERENCE_DATE, IPTC_TYPE_REFERENCE_NUMBER,
            IPTC_TYPE_DATE_CREATED, IPTC_TYPE_TIME_CREATED,
            IPTC_TYPE_DIGITAL_CREATION_DATE, IPTC_TYPE_DIGITAL_CREATION_TIME,
            IPTC_TYPE_ORIGINATING_PROGRAM, IPTC_TYPE_PROGRAM_VERSION,
            IPTC_TYPE_OBJECT_CYCLE, IPTC_TYPE_BYLINE, IPTC_TYPE_BYLINE_TITLE,
            IPTC_TYPE_CITY, IPTC_TYPE_SUBLOCATION, IPTC_TYPE_PROVINCE_STATE,
            IPTC_TYPE_COUNTRY_PRIMARY_LOCATION_CODE,
            IPTC_TYPE_COUNTRY_PRIMARY_LOCATION_NAME,
            IPTC_TYPE_ORIGINAL_TRANSMISSION_REFERENCE, IPTC_TYPE_HEADLINE,
            IPTC_TYPE_CREDIT, IPTC_TYPE_SOURCE, IPTC_TYPE_COPYRIGHT_NOTICE,
            IPTC_TYPE_CONTACT, IPTC_TYPE_CAPTION_ABSTRACT,
            IPTC_TYPE_WRITER_EDITOR, IPTC_TYPE_RASTERIZED_CAPTION,
            IPTC_TYPE_IMAGE_TYPE, IPTC_TYPE_IMAGE_ORIENTATION,
            IPTC_TYPE_LANGUAGE_IDENTIFIER, IPTC_TYPE_AUDIO_TYPE,
            IPTC_TYPE_AUDIO_SAMPLING_RATE, IPTC_TYPE_AUDIO_SAMPLING_RESOLUTION,
            IPTC_TYPE_AUDIO_DURATION, IPTC_TYPE_AUDIO_OUTCUE,
            IPTC_TYPE_OBJECT_DATA_PREVIEW_FILE_FORMAT,
            IPTC_TYPE_OBJECT_DATA_PREVIEW_FILE_FORMAT_VERSION,
            IPTC_TYPE_OBJECT_DATA_PREVIEW_DATA, };

}
