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
package org.apache.commons.sanselan.formats.tiff.constants;

import java.util.Collections;
import java.util.List;

public enum ExifTagConstants
        implements
            TiffDirectoryConstants,
            TiffFieldTypeConstants,
            TagHolder
{ /**/
    INTEROP_INDEX(new TagInfo(
            "Interop Index", 0x0001, FIELD_TYPE_ASCII, 1,
            EXIF_DIRECTORY_INTEROP_IFD)),
    INTEROP_VERSION(new TagInfo(
            "Interop Version", 0x0002, FIELD_TYPE_UNDEFINED, 1,
            EXIF_DIRECTORY_INTEROP_IFD)),
    PROCESSING_SOFTWARE(new TagInfo(
            "Processing Software", 0x000b, FIELD_TYPE_ASCII, 1,
            EXIF_DIRECTORY_IFD0)),
    SUBFILE_TYPE(new TagInfo(
            "Subfile Type", 0x00fe, FIELD_TYPE_LONG, 1, EXIF_DIRECTORY_IFD0)) {
        public static final int SUBFILE_TYPE_VALUE_FULL_RESOLUTION_IMAGE = 0;
        public static final int SUBFILE_TYPE_VALUE_REDUCED_RESOLUTION_IMAGE = 1;
        public static final int SUBFILE_TYPE_VALUE_SINGLE_PAGE_OF_MULTI_PAGE_IMAGE = 2;
        public static final int SUBFILE_TYPE_VALUE_SINGLE_PAGE_OF_MULTI_PAGE_REDUCED_RESOLUTION_IMAGE = 3;
        public static final int SUBFILE_TYPE_VALUE_TRANSPARENCY_MASK = 4;
        public static final int SUBFILE_TYPE_VALUE_TRANSPARENCY_MASK_OF_REDUCED_RESOLUTION_IMAGE = 5;
        public static final int SUBFILE_TYPE_VALUE_TRANSPARENCY_MASK_OF_MULTI_PAGE_IMAGE = 6;
        public static final int SUBFILE_TYPE_VALUE_TRANSPARENCY_MASK_OF_REDUCED_RESOLUTION_MULTI_PAGE_IMAGE = 7;
    },
    OLD_SUBFILE_TYPE(new TagInfo(
            "Old Subfile Type", 0x00ff, FIELD_TYPE_SHORT, 1,
            EXIF_DIRECTORY_IFD0)) {
        public static final int OLD_SUBFILE_TYPE_VALUE_FULL_RESOLUTION_IMAGE = 1;
        public static final int OLD_SUBFILE_TYPE_VALUE_REDUCED_RESOLUTION_IMAGE = 2;
        public static final int OLD_SUBFILE_TYPE_VALUE_SINGLE_PAGE_OF_MULTI_PAGE_IMAGE = 3;
    },
    IMAGE_WIDTH_IFD0(new TagInfo(
            "Image Width", 0x0100, FIELD_TYPE_LONG, 1, EXIF_DIRECTORY_IFD0)),
    IMAGE_HEIGHT_IFD0(new TagInfo(
            "Image Height", 0x0101, FIELD_TYPE_LONG, 1, EXIF_DIRECTORY_IFD0)),
    BITS_PER_SAMPLE(new TagInfo(
            "Bits Per Sample", 0x0102, FIELD_TYPE_SHORT, -1,
            EXIF_DIRECTORY_IFD0)),
    COMPRESSION(new TagInfo(
            "Compression", 0x0103, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_IFD0)) {
        public static final int COMPRESSION_VALUE_UNCOMPRESSED = 1;
        public static final int COMPRESSION_VALUE_CCITT_1D = 2;
        public static final int COMPRESSION_VALUE_T4_GROUP_3_FAX = 3;
        public static final int COMPRESSION_VALUE_T6_GROUP_4_FAX = 4;
        public static final int COMPRESSION_VALUE_LZW = 5;
        public static final int COMPRESSION_VALUE_JPEG_OLD_STYLE = 6;
        public static final int COMPRESSION_VALUE_JPEG = 7;
        public static final int COMPRESSION_VALUE_ADOBE_DEFLATE = 8;
        public static final int COMPRESSION_VALUE_JBIG_B_AND_W = 9;
        public static final int COMPRESSION_VALUE_JBIG_COLOR = 10;
        public static final int COMPRESSION_VALUE_NEXT = 32766;
        public static final int COMPRESSION_VALUE_EPSON_ERF_COMPRESSED = 32769;
        public static final int COMPRESSION_VALUE_CCIRLEW = 32771;
        public static final int COMPRESSION_VALUE_PACK_BITS = 32773;
        public static final int COMPRESSION_VALUE_THUNDERSCAN = 32809;
        public static final int COMPRESSION_VALUE_IT8CTPAD = 32895;
        public static final int COMPRESSION_VALUE_IT8LW = 32896;
        public static final int COMPRESSION_VALUE_IT8MP = 32897;
        public static final int COMPRESSION_VALUE_IT8BL = 32898;
        public static final int COMPRESSION_VALUE_PIXAR_FILM = 32908;
        public static final int COMPRESSION_VALUE_PIXAR_LOG = 32909;
        public static final int COMPRESSION_VALUE_DEFLATE = 32946;
        public static final int COMPRESSION_VALUE_DCS = 32947;
        public static final int COMPRESSION_VALUE_JBIG = 34661;
        public static final int COMPRESSION_VALUE_SGILOG = 34676;
        public static final int COMPRESSION_VALUE_SGILOG_24 = 34677;
        public static final int COMPRESSION_VALUE_JPEG_2000 = 34712;
        public static final int COMPRESSION_VALUE_NIKON_NEF_COMPRESSED = 34713;
        public static final int COMPRESSION_VALUE_KODAK_DCR_COMPRESSED = 65000;
        public static final int COMPRESSION_VALUE_PENTAX_PEF_COMPRESSED = 65535;
    },
    PHOTOMETRIC_INTERPRETATION(new TagInfo(
            "Photometric Interpretation", 0x0106, FIELD_TYPE_SHORT, 1,
            EXIF_DIRECTORY_IFD0)) {
        public static final int PHOTOMETRIC_INTERPRETATION_VALUE_WHITE_IS_ZERO = 0;
        public static final int PHOTOMETRIC_INTERPRETATION_VALUE_BLACK_IS_ZERO = 1;
        public static final int PHOTOMETRIC_INTERPRETATION_VALUE_RGB = 2;
        public static final int PHOTOMETRIC_INTERPRETATION_VALUE_RGB_PALETTE = 3;
        public static final int PHOTOMETRIC_INTERPRETATION_VALUE_TRANSPARENCY_MASK = 4;
        public static final int PHOTOMETRIC_INTERPRETATION_VALUE_CMYK = 5;
        public static final int PHOTOMETRIC_INTERPRETATION_VALUE_YCB_CR = 6;
        public static final int PHOTOMETRIC_INTERPRETATION_VALUE_CIELAB = 8;
        public static final int PHOTOMETRIC_INTERPRETATION_VALUE_ICCLAB = 9;
        public static final int PHOTOMETRIC_INTERPRETATION_VALUE_ITULAB = 10;
        public static final int PHOTOMETRIC_INTERPRETATION_VALUE_COLOR_FILTER_ARRAY = 32803;
        public static final int PHOTOMETRIC_INTERPRETATION_VALUE_PIXAR_LOG_L = 32844;
        public static final int PHOTOMETRIC_INTERPRETATION_VALUE_PIXAR_LOG_LUV = 32845;
        public static final int PHOTOMETRIC_INTERPRETATION_VALUE_LINEAR_RAW = 34892;
    },
    THRESHOLDING(new TagInfo(
            "Thresholding", 0x0107, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_IFD0)) {
        public static final int THRESHOLDING_VALUE_NO_DITHERING_OR_HALFTONING = 1;
        public static final int THRESHOLDING_VALUE_ORDERED_DITHER_OR_HALFTONE = 2;
        public static final int THRESHOLDING_VALUE_RANDOMIZED_DITHER = 3;
    },
    CELL_WIDTH(new TagInfo("Cell Width",
            0x0108, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_IFD0)),
    CELL_LENGTH(new TagInfo(
            "Cell Length", 0x0109, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_IFD0)),
    FILL_ORDER(new TagInfo("Fill Order",
            0x010a, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_IFD0)) {
        public static final int FILL_ORDER_VALUE_NORMAL = 1;
        public static final int FILL_ORDER_VALUE_REVERSED = 2;
    },
    DOCUMENT_NAME(new TagInfo(
            "Document Name", 0x010d, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_IFD0)),
    IMAGE_DESCRIPTION(new TagInfo(
            "Image Description", 0x010e, FIELD_TYPE_ASCII, 1,
            EXIF_DIRECTORY_IFD0)),
    MAKE(new TagInfo("Make", 0x010f,
            FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_IFD0)),
    MODEL(new TagInfo("Model", 0x0110,
            FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_IFD0)),
    // poly tag public static final TagInfo2 STRIP_OFFSETS(new TagInfo2( "StripOffsets", 0x0111, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    PREVIEW_IMAGE_START_IFD0(new TagInfo.Offset(
            "Preview Image Start", 0x0111, FIELD_TYPE_LONG, 1,
            EXIF_DIRECTORY_IFD0)),
    PREVIEW_IMAGE_START_SUB_IFD1(new TagInfo.Offset(
            "Preview Image Start", 0x0111, FIELD_TYPE_LONG, 1,
            EXIF_DIRECTORY_SUB_IFD1)),
    JPG_FROM_RAW_START_SUB_IFD2(new TagInfo.Offset(
            "Jpg From Raw Start", 0x0111, FIELD_TYPE_LONG, 1,
            EXIF_DIRECTORY_SUB_IFD2)),
    ORIENTATION(new TagInfo(
            "Orientation", 0x0112, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_IFD0)) {
        public static final int ORIENTATION_VALUE_HORIZONTAL_NORMAL = 1;
        public static final int ORIENTATION_VALUE_MIRROR_HORIZONTAL = 2;
        public static final int ORIENTATION_VALUE_ROTATE_180 = 3;
        public static final int ORIENTATION_VALUE_MIRROR_VERTICAL = 4;
        public static final int ORIENTATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_270_CW = 5;
        public static final int ORIENTATION_VALUE_ROTATE_90_CW = 6;
        public static final int ORIENTATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_90_CW = 7;
        public static final int ORIENTATION_VALUE_ROTATE_270_CW = 8;
    },
    SAMPLES_PER_PIXEL(new TagInfo(
            "Samples Per Pixel", 0x0115, FIELD_TYPE_SHORT, 1,
            EXIF_DIRECTORY_IFD0)),
    ROWS_PER_STRIP(new TagInfo(
            "Rows Per Strip", 0x0116, FIELD_TYPE_LONG, 1, EXIF_DIRECTORY_IFD0)),
    // poly tag public static final TagInfo2 STRIP_BYTE_COUNTS(new TagInfo2( "StripByteCounts", 0x0117, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    PREVIEW_IMAGE_LENGTH_IFD0(new TagInfo(
            "Preview Image Length", 0x0117, FIELD_TYPE_LONG, 1,
            EXIF_DIRECTORY_IFD0)),
    PREVIEW_IMAGE_LENGTH_SUB_IFD1(new TagInfo(
            "Preview Image Length", 0x0117, FIELD_TYPE_LONG, 1,
            EXIF_DIRECTORY_SUB_IFD1)),
    JPG_FROM_RAW_LENGTH_SUB_IFD2(new TagInfo(
            "Jpg From Raw Length", 0x0117, FIELD_TYPE_LONG, 1,
            EXIF_DIRECTORY_SUB_IFD2)),
    MIN_SAMPLE_VALUE(new TagInfo(
            "Min Sample Value", 0x0118, FIELD_TYPE_SHORT, 1,
            EXIF_DIRECTORY_IFD0)),
    MAX_SAMPLE_VALUE(new TagInfo(
            "Max Sample Value", 0x0119, FIELD_TYPE_SHORT, 1,
            EXIF_DIRECTORY_IFD0)),
    XRESOLUTION(new TagInfo(
            "XResolution", 0x011a, FIELD_TYPE_RATIONAL, 1, EXIF_DIRECTORY_IFD0)),
    YRESOLUTION(new TagInfo(
            "YResolution", 0x011b, FIELD_TYPE_RATIONAL, 1, EXIF_DIRECTORY_IFD0)),
    PLANAR_CONFIGURATION(new TagInfo(
            "Planar Configuration", 0x011c, FIELD_TYPE_SHORT, 1,
            EXIF_DIRECTORY_IFD0)) {
        public static final int PLANAR_CONFIGURATION_VALUE_CHUNKY = 1;
        public static final int PLANAR_CONFIGURATION_VALUE_PLANAR = 2;
    },
    PAGE_NAME(new TagInfo("Page Name",
            0x011d, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_IFD0)),
    XPOSITION(new TagInfo("XPosition",
            0x011e, FIELD_TYPE_RATIONAL, 1, EXIF_DIRECTORY_IFD0)),
    YPOSITION(new TagInfo("YPosition",
            0x011f, FIELD_TYPE_RATIONAL, 1, EXIF_DIRECTORY_IFD0)),
    FREE_OFFSETS(new TagInfo(
            "Free Offsets", 0x0120, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    FREE_BYTE_COUNTS(new TagInfo(
            "Free Byte Counts", 0x0121, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    GRAY_RESPONSE_UNIT(new TagInfo(
            "Gray Response Unit", 0x0122, FIELD_TYPE_SHORT, 1,
            EXIF_DIRECTORY_IFD0)) {
        public static final int GRAY_RESPONSE_UNIT_VALUE_0_1 = 1;
        public static final int GRAY_RESPONSE_UNIT_VALUE_0_001 = 2;
        public static final int GRAY_RESPONSE_UNIT_VALUE_0_0001 = 3;
        public static final int GRAY_RESPONSE_UNIT_VALUE_1E_05 = 4;
        public static final int GRAY_RESPONSE_UNIT_VALUE_1E_06 = 5;
    },
    GRAY_RESPONSE_CURVE(new TagInfo(
            "Gray Response Curve", 0x0123, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    T4OPTIONS(new TagInfo("T4 Options",
            0x0124, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    T6OPTIONS(new TagInfo("T6 Options",
            0x0125, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    RESOLUTION_UNIT(new TagInfo(
            "Resolution Unit", 0x0128, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_IFD0)) {
        public static final int RESOLUTION_UNIT_VALUE_NONE = 1;
        public static final int RESOLUTION_UNIT_VALUE_INCHES = 2;
        public static final int RESOLUTION_UNIT_VALUE_CM = 3;
    },
    PAGE_NUMBER(new TagInfo(
            "Page Number", 0x0129, FIELD_TYPE_SHORT, 2, EXIF_DIRECTORY_IFD0)),
    COLOR_RESPONSE_UNIT(new TagInfo(
            "Color Response Unit", 0x012c, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    TRANSFER_FUNCTION(new TagInfo(
            "Transfer Function", 0x012d, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    SOFTWARE(new TagInfo("Software",
            0x0131, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_IFD0)),
    MODIFY_DATE(new TagInfo(
            "Modify Date", 0x0132, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_IFD0)),
    ARTIST(new TagInfo("Artist", 0x013b,
            FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_IFD0)),
    HOST_COMPUTER(new TagInfo(
            "Host Computer", 0x013c, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_IFD0)),
    PREDICTOR(new TagInfo("Predictor",
            0x013d, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_IFD0)) {
        public static final int PREDICTOR_VALUE_NONE = 1;
        public static final int PREDICTOR_VALUE_HORIZONTAL_DIFFERENCING = 2;
    },
    WHITE_POINT(new TagInfo(
            "White Point", 0x013e, FIELD_TYPE_RATIONAL, 2, EXIF_DIRECTORY_IFD0)),
    PRIMARY_CHROMATICITIES(new TagInfo(
            "Primary Chromaticities", 0x013f, FIELD_TYPE_RATIONAL, 6,
            EXIF_DIRECTORY_IFD0)),
    COLOR_MAP(new TagInfo("Color Map",
            0x0140, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    HALFTONE_HINTS(new TagInfo(
            "Halftone Hints", 0x0141, FIELD_TYPE_SHORT, 2, EXIF_DIRECTORY_IFD0)),
    TILE_WIDTH(new TagInfo("Tile Width",
            0x0142, FIELD_TYPE_LONG, 1, EXIF_DIRECTORY_IFD0)),
    TILE_LENGTH(new TagInfo(
            "Tile Length", 0x0143, FIELD_TYPE_LONG, 1, EXIF_DIRECTORY_IFD0)),
    TILE_OFFSETS(new TagInfo(
            "Tile Offsets", 0x0144, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    TILE_BYTE_COUNTS(new TagInfo(
            "Tile Byte Counts", 0x0145, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    BAD_FAX_LINES(new TagInfo(
            "Bad Fax Lines", 0x0146, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    CLEAN_FAX_DATA(new TagInfo(
            "Clean Fax Data", 0x0147, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)) {
        public static final int CLEAN_FAX_DATA_VALUE_CLEAN = 0;
        public static final int CLEAN_FAX_DATA_VALUE_REGENERATED = 1;
        public static final int CLEAN_FAX_DATA_VALUE_UNCLEAN = 2;
    },
    CONSECUTIVE_BAD_FAX_LINES(new TagInfo(
            "Consecutive Bad Fax Lines", 0x0148,
            FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    SUB_IFD(new TagInfo("Sub IFD",
            0x014a, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    INK_SET(new TagInfo("Ink Set",
            0x014c, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_IFD0)) {
        public static final int INK_SET_VALUE_CMYK = 1;
        public static final int INK_SET_VALUE_NOT_CMYK = 2;
    },
    INK_NAMES(new TagInfo("Ink Names",
            0x014d, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    NUMBEROF_INKS(new TagInfo(
            "Numberof Inks", 0x014e, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    DOT_RANGE(new TagInfo("Dot Range",
            0x0150, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_IFD0)),
    TARGET_PRINTER(new TagInfo(
            "Target Printer", 0x0151, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    EXTRA_SAMPLES(new TagInfo(
            "Extra Samples", 0x0152, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    SAMPLE_FORMAT(new TagInfo(
            "Sample Format", 0x0153, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)) {
        public static final int SAMPLE_FORMAT_VALUE_UNSIGNED_INTEGER = 1;
        public static final int SAMPLE_FORMAT_VALUE_TWOS_COMPLEMENT_SIGNED_INTEGER = 2;
        public static final int SAMPLE_FORMAT_VALUE_IEEE_FLOATING_POINT = 3;
        public static final int SAMPLE_FORMAT_VALUE_UNDEFINED = 4;
        public static final int SAMPLE_FORMAT_VALUE_COMPLEX_INTEGER = 5;
        public static final int SAMPLE_FORMAT_VALUE_IEEE_FLOATING_POINT_1 = 6;
    },
    SMIN_SAMPLE_VALUE(new TagInfo(
            "SMin Sample Value", 0x0154, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    SMAX_SAMPLE_VALUE(new TagInfo(
            "SMax Sample Value", 0x0155, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    TRANSFER_RANGE(new TagInfo(
            "Transfer Range", 0x0156, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    CLIP_PATH(new TagInfo("Clip Path",
            0x0157, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    XCLIP_PATH_UNITS(new TagInfo(
            "XClip Path Units", 0x0158, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    YCLIP_PATH_UNITS(new TagInfo(
            "YClip Path Units", 0x0159, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    INDEXED(new TagInfo("Indexed",
            0x015a, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)) {
        public static final int INDEXED_VALUE_NOT_INDEXED = 0;
        public static final int INDEXED_VALUE_INDEXED = 1;
    },
    JPEGTABLES(new TagInfo("JPEGTables",
            0x015b, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    OPIPROXY(new TagInfo("OPIProxy",
            0x015f, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)) {
        public static final int OPIPROXY_VALUE_HIGHER_RESOLUTION_IMAGE_DOES_NOT_EXIST = 0;
        public static final int OPIPROXY_VALUE_HIGHER_RESOLUTION_IMAGE_EXISTS = 1;
    },
    GLOBAL_PARAMETERS_IFD(new TagInfo(
            "Global Parameters IFD", 0x0190, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    PROFILE_TYPE(new TagInfo(
            "Profile Type", 0x0191, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)) {
        public static final int PROFILE_TYPE_VALUE_UNSPECIFIED = 0;
        public static final int PROFILE_TYPE_VALUE_GROUP_3_FAX = 1;
    },
    FAX_PROFILE(new TagInfo(
            "Fax Profile", 0x0192, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)) {
        public static final int FAX_PROFILE_VALUE_UNKNOWN = 0;
        public static final int FAX_PROFILE_VALUE_MINIMAL_B_AND_W_LOSSLESS_S = 1;
        public static final int FAX_PROFILE_VALUE_EXTENDED_B_AND_W_LOSSLESS_F = 2;
        public static final int FAX_PROFILE_VALUE_LOSSLESS_JBIG_B_AND_W_J = 3;
        public static final int FAX_PROFILE_VALUE_LOSSY_COLOR_AND_GRAYSCALE_C = 4;
        public static final int FAX_PROFILE_VALUE_LOSSLESS_COLOR_AND_GRAYSCALE_L = 5;
        public static final int FAX_PROFILE_VALUE_MIXED_RASTER_CONTENT_M = 6;
    },
    CODING_METHODS(new TagInfo(
            "Coding Methods", 0x0193, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    VERSION_YEAR(new TagInfo(
            "Version Year", 0x0194, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    MODE_NUMBER(new TagInfo(
            "Mode Number", 0x0195, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    DECODE(new TagInfo("Decode", 0x01b1,
            FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    DEFAULT_IMAGE_COLOR(new TagInfo(
            "Default Image Color", 0x01b2, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    JPEGPROC(new TagInfo("JPEGProc",
            0x0200, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)) {
        public static final int JPEGPROC_VALUE_BASELINE = 1;
        public static final int JPEGPROC_VALUE_LOSSLESS = 14;
    },
    // poly tag public static final TagInfo2 THUMBNAIL_OFFSET(new TagInfo2( "ThumbnailOffset", 0x0201, FIELD_TYPE_LONG, 1, EXIF_DIRECTORY_IFD1)),
    PREVIEW_IMAGE_START_MAKER_NOTES(new TagInfo(
            "Preview Image Start", 0x0201, FIELD_TYPE_LONG, 1,
            EXIF_DIRECTORY_MAKER_NOTES)),
    JPG_FROM_RAW_START_SUB_IFD(new TagInfo.Offset(
            "Jpg From Raw Start", 0x0201, FIELD_TYPE_LONG, 1,
            EXIF_DIRECTORY_SUB_IFD)),
    JPG_FROM_RAW_START_IFD2(new TagInfo.Offset(
            "Jpg From Raw Start", 0x0201, FIELD_TYPE_LONG, 1,
            EXIF_DIRECTORY_IFD2)),
    OTHER_IMAGE_START(new TagInfo.Offset(
            "Other Image Start", 0x0201, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    // poly tag public static final TagInfo2 THUMBNAIL_LENGTH(new TagInfo2( "ThumbnailLength", 0x0202, FIELD_TYPE_LONG, 1, EXIF_DIRECTORY_IFD1)),
    PREVIEW_IMAGE_LENGTH_MAKER_NOTES(new TagInfo(
            "Preview Image Length", 0x0202, FIELD_TYPE_LONG, 1,
            EXIF_DIRECTORY_MAKER_NOTES)),
    JPG_FROM_RAW_LENGTH_SUB_IFD(new TagInfo(
            "Jpg From Raw Length", 0x0202, FIELD_TYPE_LONG, 1,
            EXIF_DIRECTORY_SUB_IFD)),
    JPG_FROM_RAW_LENGTH_IFD2(new TagInfo(
            "Jpg From Raw Length", 0x0202, FIELD_TYPE_LONG, 1,
            EXIF_DIRECTORY_IFD2)),
    OTHER_IMAGE_LENGTH(new TagInfo(
            "Other Image Length", 0x0202, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    JPEGRESTART_INTERVAL(new TagInfo(
            "JPEGRestart Interval", 0x0203, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    JPEGLOSSLESS_PREDICTORS(new TagInfo(
            "JPEGLossless Predictors", 0x0205, FIELD_TYPE_DESCRIPTION_UNKNOWN,
            1, EXIF_DIRECTORY_UNKNOWN)),
    JPEGPOINT_TRANSFORMS(new TagInfo(
            "JPEGPoint Transforms", 0x0206, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    JPEGQTABLES(new TagInfo(
            "JPEGQTables", 0x0207, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    JPEGDCTABLES(new TagInfo(
            "JPEGDCTables", 0x0208, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    JPEGACTABLES(new TagInfo(
            "JPEGACTables", 0x0209, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    YCBCR_COEFFICIENTS(new TagInfo(
            "YCbCr Coefficients", 0x0211, FIELD_TYPE_RATIONAL, 3,
            EXIF_DIRECTORY_IFD0)),
    YCBCR_SUB_SAMPLING(new TagInfo(
            "YCbCr Sub Sampling", 0x0212, FIELD_TYPE_SHORT, 2,
            EXIF_DIRECTORY_IFD0)),
    YCBCR_POSITIONING(new TagInfo(
            "YCbCr Positioning", 0x0213, FIELD_TYPE_SHORT, 1,
            EXIF_DIRECTORY_IFD0)) {
        public static final int YCB_CR_POSITIONING_VALUE_CENTERED = 1;
        public static final int YCB_CR_POSITIONING_VALUE_CO_SITED = 2;
    },
    REFERENCE_BLACK_WHITE(new TagInfo(
            "Reference Black White", 0x0214, FIELD_TYPE_RATIONAL, 6,
            EXIF_DIRECTORY_IFD0)),
    STRIP_ROW_COUNTS(new TagInfo(
            "Strip Row Counts", 0x022f, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    APPLICATION_NOTES(new TagInfo(
            "Application Notes", 0x02bc, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    RELATED_IMAGE_FILE_FORMAT(new TagInfo(
            "Related Image File Format", 0x1000, FIELD_TYPE_ASCII, 1,
            EXIF_DIRECTORY_INTEROP_IFD)),
    RELATED_IMAGE_WIDTH(new TagInfo(
            "Related Image Width", 0x1001, FIELD_TYPE_SHORT, 1,
            EXIF_DIRECTORY_INTEROP_IFD)),
    RELATED_IMAGE_LENGTH(new TagInfo(
            "Related Image Length", 0x1002, FIELD_TYPE_SHORT, 1,
            EXIF_DIRECTORY_INTEROP_IFD)),
    RATING(new TagInfo("Rating", 0x4746,
            FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_IFD0)),
    RATING_PERCENT(new TagInfo(
            "Rating Percent", 0x4749, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_IFD0)),
    IMAGE_ID(new TagInfo("Image ID",
            0x800d, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    WANG_ANNOTATION(new TagInfo(
            "Wang Annotation", 0x80a4, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    MATTEING(new TagInfo("Matteing",
            0x80e3, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    DATA_TYPE(new TagInfo("Data Type",
            0x80e4, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    IMAGE_DEPTH(new TagInfo(
            "Image Depth", 0x80e5, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    TILE_DEPTH(new TagInfo("Tile Depth",
            0x80e6, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    MODEL_2(new TagInfo("Model 2",
            0x827d, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    CFAREPEAT_PATTERN_DIM(new TagInfo(
            "CFARepeat Pattern Dim", 0x828d, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    CFAPATTERN_2(new TagInfo(
            "CFAPattern 2", 0x828e, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    BATTERY_LEVEL(new TagInfo(
            "Battery Level", 0x828f, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    COPYRIGHT(new TagInfo("Copyright",
            0x8298, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_IFD0)),
    EXPOSURE_TIME(new TagInfo(
            "Exposure Time", 0x829a, FIELD_TYPE_RATIONAL, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    FNUMBER(new TagInfo("FNumber",
            0x829d, FIELD_TYPE_RATIONAL, 1, EXIF_DIRECTORY_EXIF_IFD)),
    MDFILE_TAG(new TagInfo("MDFile Tag",
            0x82a5, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    MDSCALE_PIXEL(new TagInfo(
            "MDScale Pixel", 0x82a6, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    MDCOLOR_TABLE(new TagInfo(
            "MDColor Table", 0x82a7, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    MDLAB_NAME(new TagInfo("MDLab Name",
            0x82a8, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    MDSAMPLE_INFO(new TagInfo(
            "MDSample Info", 0x82a9, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    MDPREP_DATE(new TagInfo(
            "MDPrep Date", 0x82aa, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    MDPREP_TIME(new TagInfo(
            "MDPrep Time", 0x82ab, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    MDFILE_UNITS(new TagInfo(
            "MDFile Units", 0x82ac, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    PIXEL_SCALE(new TagInfo(
            "Pixel Scale", 0x830e, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    IPTC_NAA(new TagInfo("IPTC- NAA",
            0x83bb, FIELD_TYPE_LONG, 1, EXIF_DIRECTORY_IFD0)),
    INTERGRAPH_PACKET_DATA(new TagInfo(
            "Intergraph Packet Data", 0x847e, FIELD_TYPE_DESCRIPTION_UNKNOWN,
            1, EXIF_DIRECTORY_UNKNOWN)),
    INTERGRAPH_FLAG_REGISTERS(new TagInfo(
            "Intergraph Flag Registers", 0x847f,
            FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    INTERGRAPH_MATRIX(new TagInfo(
            "Intergraph Matrix", 0x8480, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    MODEL_TIE_POINT(new TagInfo(
            "Model Tie Point", 0x8482, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    SITE(new TagInfo("Site", 0x84e0,
            FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    COLOR_SEQUENCE(new TagInfo(
            "Color Sequence", 0x84e1, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    IT8HEADER(new TagInfo("IT8 Header",
            0x84e2, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    RASTER_PADDING(new TagInfo(
            "Raster Padding", 0x84e3, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    BITS_PER_RUN_LENGTH(new TagInfo(
            "Bits Per Run Length", 0x84e4, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    BITS_PER_EXTENDED_RUN_LENGTH(new TagInfo(
            "Bits Per Extended Run Length", 0x84e5,
            FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    COLOR_TABLE(new TagInfo(
            "Color Table", 0x84e6, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    IMAGE_COLOR_INDICATOR(new TagInfo(
            "Image Color Indicator", 0x84e7, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    BACKGROUND_COLOR_INDICATOR(new TagInfo(
            "Background Color Indicator", 0x84e8,
            FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    IMAGE_COLOR_VALUE(new TagInfo(
            "Image Color Value", 0x84e9, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    BACKGROUND_COLOR_VALUE(new TagInfo(
            "Background Color Value", 0x84ea, FIELD_TYPE_DESCRIPTION_UNKNOWN,
            1, EXIF_DIRECTORY_UNKNOWN)),
    PIXEL_INTENSITY_RANGE(new TagInfo(
            "Pixel Intensity Range", 0x84eb, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    TRANSPARENCY_INDICATOR(new TagInfo(
            "Transparency Indicator", 0x84ec, FIELD_TYPE_DESCRIPTION_UNKNOWN,
            1, EXIF_DIRECTORY_UNKNOWN)),
    COLOR_CHARACTERIZATION(new TagInfo(
            "Color Characterization", 0x84ed, FIELD_TYPE_DESCRIPTION_UNKNOWN,
            1, EXIF_DIRECTORY_UNKNOWN)),
    HCUSAGE(new TagInfo("HCUsage",
            0x84ee, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    SEMINFO(new TagInfo("SEMInfo",
            0x8546, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_IFD0)),
    AFCP_IPTC(new TagInfo("AFCP_ IPTC",
            0x8568, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    MODEL_TRANSFORM(new TagInfo(
            "Model Transform", 0x85d8, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    LEAF_DATA(new TagInfo("Leaf Data",
            0x8606, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    PHOTOSHOP_SETTINGS(new TagInfo(
            "Photoshop Settings", 0x8649, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    EXIF_OFFSET(new TagInfo.Offset(
            "Exif Offset", 0x8769, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    ICC_PROFILE(new TagInfo(
            "ICC_ Profile", 0x8773, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    IMAGE_LAYER(new TagInfo(
            "Image Layer", 0x87ac, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    GEO_TIFF_DIRECTORY(new TagInfo(
            "Geo Tiff Directory", 0x87af, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    GEO_TIFF_DOUBLE_PARAMS(new TagInfo(
            "Geo Tiff Double Params", 0x87b0, FIELD_TYPE_DESCRIPTION_UNKNOWN,
            1, EXIF_DIRECTORY_UNKNOWN)),
    GEO_TIFF_ASCII_PARAMS(new TagInfo(
            "Geo Tiff Ascii Params", 0x87b1, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    EXPOSURE_PROGRAM(new TagInfo(
            "Exposure Program", 0x8822, FIELD_TYPE_SHORT, 1,
            EXIF_DIRECTORY_EXIF_IFD)) {
        public static final int EXPOSURE_PROGRAM_VALUE_MANUAL = 1;
        public static final int EXPOSURE_PROGRAM_VALUE_PROGRAM_AE = 2;
        public static final int EXPOSURE_PROGRAM_VALUE_APERTURE_PRIORITY_AE = 3;
        public static final int EXPOSURE_PROGRAM_VALUE_SHUTTER_SPEED_PRIORITY_AE = 4;
        public static final int EXPOSURE_PROGRAM_VALUE_CREATIVE_SLOW_SPEED = 5;
        public static final int EXPOSURE_PROGRAM_VALUE_ACTION_HIGH_SPEED = 6;
        public static final int EXPOSURE_PROGRAM_VALUE_PORTRAIT = 7;
        public static final int EXPOSURE_PROGRAM_VALUE_LANDSCAPE = 8;
    },
    SPECTRAL_SENSITIVITY(new TagInfo(
            "Spectral Sensitivity", 0x8824, FIELD_TYPE_ASCII, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    GPSINFO(new TagInfo.Offset(
            "GPSInfo", 0x8825, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    ISO(new TagInfo("ISO", 0x8827,
            FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_EXIF_IFD)),
    OPTO__ELECTRIC_CONV_FACTOR(new TagInfo(
            "Opto - Electric Conv Factor", 0x8828,
            FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    INTERLACE(new TagInfo("Interlace",
            0x8829, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    TIME_ZONE_OFFSET(new TagInfo(
            "Time Zone Offset", 0x882a, FIELD_TYPE_SSHORT, -1,
            EXIF_DIRECTORY_EXIF_IFD)),
    SELF_TIMER_MODE(new TagInfo(
            "Self Timer Mode", 0x882b, FIELD_TYPE_SHORT, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    FAX_RECV_PARAMS(new TagInfo(
            "Fax Recv Params", 0x885c, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    FAX_SUB_ADDRESS(new TagInfo(
            "Fax Sub Address", 0x885d, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    FAX_RECV_TIME(new TagInfo(
            "Fax Recv Time", 0x885e, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    LEAF_SUB_IFD(new TagInfo(
            "Leaf Sub IFD", 0x888a, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    EXIF_VERSION(new TagInfo(
            "Exif Version", 0x9000, FIELD_TYPE_UNDEFINED, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    DATE_TIME_ORIGINAL(new TagInfo(
            "Date Time Original", 0x9003, FIELD_TYPE_ASCII, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    CREATE_DATE(new TagInfo(
            "Create Date", 0x9004, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_EXIF_IFD)),
    COMPONENTS_CONFIGURATION(new TagInfo(
            "Components Configuration", 0x9101, FIELD_TYPE_UNDEFINED, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    COMPRESSED_BITS_PER_PIXEL(new TagInfo(
            "Compressed Bits Per Pixel", 0x9102, FIELD_TYPE_RATIONAL, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    SHUTTER_SPEED_VALUE(new TagInfo(
            "Shutter Speed Value", 0x9201, FIELD_TYPE_SRATIONAL, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    APERTURE_VALUE(new TagInfo(
            "Aperture Value", 0x9202, FIELD_TYPE_RATIONAL, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    BRIGHTNESS_VALUE(new TagInfo(
            "Brightness Value", 0x9203, FIELD_TYPE_SRATIONAL, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    EXPOSURE_COMPENSATION(new TagInfo(
            "Exposure Compensation", 0x9204, FIELD_TYPE_SRATIONAL, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    MAX_APERTURE_VALUE(new TagInfo(
            "Max Aperture Value", 0x9205, FIELD_TYPE_RATIONAL, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    SUBJECT_DISTANCE(new TagInfo(
            "Subject Distance", 0x9206, FIELD_TYPE_RATIONAL, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    METERING_MODE(new TagInfo(
            "Metering Mode", 0x9207, FIELD_TYPE_SHORT, 1,
            EXIF_DIRECTORY_EXIF_IFD)) {
        public static final int METERING_MODE_VALUE_AVERAGE = 1;
        public static final int METERING_MODE_VALUE_CENTER_WEIGHTED_AVERAGE = 2;
        public static final int METERING_MODE_VALUE_SPOT = 3;
        public static final int METERING_MODE_VALUE_MULTI_SPOT = 4;
        public static final int METERING_MODE_VALUE_MULTI_SEGMENT = 5;
        public static final int METERING_MODE_VALUE_PARTIAL = 6;
        public static final int METERING_MODE_VALUE_OTHER = 255;
    },
    LIGHT_SOURCE(new TagInfo(
            "Light Source", 0x9208, FIELD_TYPE_SHORT, 1,
            EXIF_DIRECTORY_EXIF_IFD)) {
        public static final int LIGHT_SOURCE_VALUE_DAYLIGHT = 1;
        public static final int LIGHT_SOURCE_VALUE_FLUORESCENT = 2;
        public static final int LIGHT_SOURCE_VALUE_TUNGSTEN = 3;
        public static final int LIGHT_SOURCE_VALUE_FLASH = 4;
        public static final int LIGHT_SOURCE_VALUE_FINE_WEATHER = 9;
        public static final int LIGHT_SOURCE_VALUE_CLOUDY = 10;
        public static final int LIGHT_SOURCE_VALUE_SHADE = 11;
        public static final int LIGHT_SOURCE_VALUE_DAYLIGHT_FLUORESCENT = 12;
        public static final int LIGHT_SOURCE_VALUE_DAY_WHITE_FLUORESCENT = 13;
        public static final int LIGHT_SOURCE_VALUE_COOL_WHITE_FLUORESCENT = 14;
        public static final int LIGHT_SOURCE_VALUE_WHITE_FLUORESCENT = 15;
        public static final int LIGHT_SOURCE_VALUE_STANDARD_LIGHT_A = 17;
        public static final int LIGHT_SOURCE_VALUE_STANDARD_LIGHT_B = 18;
        public static final int LIGHT_SOURCE_VALUE_STANDARD_LIGHT_C = 19;
        public static final int LIGHT_SOURCE_VALUE_D55 = 20;
        public static final int LIGHT_SOURCE_VALUE_D65 = 21;
        public static final int LIGHT_SOURCE_VALUE_D75 = 22;
        public static final int LIGHT_SOURCE_VALUE_D50 = 23;
        public static final int LIGHT_SOURCE_VALUE_ISO_STUDIO_TUNGSTEN = 24;
        public static final int LIGHT_SOURCE_VALUE_OTHER = 255;
    },
    FLASH(new TagInfo("Flash", 0x9209,
            FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_EXIF_IFD)) {
        public static final int FLASH_VALUE_NO_FLASH = 0x0;
        public static final int FLASH_VALUE_FIRED = 0x1;
        public static final int FLASH_VALUE_FIRED_RETURN_NOT_DETECTED = 0x5;
        public static final int FLASH_VALUE_FIRED_RETURN_DETECTED = 0x7;
        public static final int FLASH_VALUE_ON_DID_NOT_FIRE = 0x8;
        public static final int FLASH_VALUE_ON = 0x9;
        public static final int FLASH_VALUE_ON_RETURN_NOT_DETECTED = 0xd;
        public static final int FLASH_VALUE_ON_RETURN_DETECTED = 0xf;
        public static final int FLASH_VALUE_OFF = 0x10;
        public static final int FLASH_VALUE_OFF_DID_NOT_FIRE_RETURN_NOT_DETECTED = 0x14;
        public static final int FLASH_VALUE_AUTO_DID_NOT_FIRE = 0x18;
        public static final int FLASH_VALUE_AUTO_FIRED = 0x19;
        public static final int FLASH_VALUE_AUTO_FIRED_RETURN_NOT_DETECTED = 0x1d;
        public static final int FLASH_VALUE_AUTO_FIRED_RETURN_DETECTED = 0x1f;
        public static final int FLASH_VALUE_NO_FLASH_FUNCTION = 0x20;
        public static final int FLASH_VALUE_OFF_NO_FLASH_FUNCTION = 0x30;
        public static final int FLASH_VALUE_FIRED_RED_EYE_REDUCTION = 0x41;
        public static final int FLASH_VALUE_FIRED_RED_EYE_REDUCTION_RETURN_NOT_DETECTED = 0x45;
        public static final int FLASH_VALUE_FIRED_RED_EYE_REDUCTION_RETURN_DETECTED = 0x47;
        public static final int FLASH_VALUE_ON_RED_EYE_REDUCTION = 0x49;
        public static final int FLASH_VALUE_ON_RED_EYE_REDUCTION_RETURN_NOT_DETECTED = 0x4d;
        public static final int FLASH_VALUE_ON_RED_EYE_REDUCTION_RETURN_DETECTED = 0x4f;
        public static final int FLASH_VALUE_OFF_RED_EYE_REDUCTION = 0x50;
        public static final int FLASH_VALUE_AUTO_DID_NOT_FIRE_RED_EYE_REDUCTION = 0x58;
        public static final int FLASH_VALUE_AUTO_FIRED_RED_EYE_REDUCTION = 0x59;
        public static final int FLASH_VALUE_AUTO_FIRED_RED_EYE_REDUCTION_RETURN_NOT_DETECTED = 0x5d;
        public static final int FLASH_VALUE_AUTO_FIRED_RED_EYE_REDUCTION_RETURN_DETECTED = 0x5f;
    },
    FOCAL_LENGTH(new TagInfo(
            "Focal Length", 0x920a, FIELD_TYPE_RATIONAL, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    FLASH_ENERGY(new TagInfo(
            "Flash Energy", 0x920b, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    SPATIAL_FREQUENCY_RESPONSE_1(new TagInfo(
            "Spatial Frequency Response", 0x920c,
            FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    NOISE_1(new TagInfo("Noise", 0x920d,
            FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    FOCAL_PLANE_XRESOLUTION(new TagInfo(
            "Focal Plane XResolution", 0x920e, FIELD_TYPE_DESCRIPTION_UNKNOWN,
            1, EXIF_DIRECTORY_UNKNOWN)),
    FOCAL_PLANE_YRESOLUTION(new TagInfo(
            "Focal Plane YResolution", 0x920f, FIELD_TYPE_DESCRIPTION_UNKNOWN,
            1, EXIF_DIRECTORY_UNKNOWN)),
    FOCAL_PLANE_RESOLUTION_UNIT(new TagInfo(
            "Focal Plane Resolution Unit", 0x9210,
            FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)) {
        public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_NONE = 1;
        public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_INCHES = 2;
        public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_CM = 3;
        public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_MM = 4;
        public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_UM = 5;
    },
    IMAGE_NUMBER_EXIF_IFD(new TagInfo(
            "Image Number", 0x9211, FIELD_TYPE_LONG, 1, EXIF_DIRECTORY_EXIF_IFD)),
    SECURITY_CLASSIFICATION_EXIF_IFD(new TagInfo(
            "Security Classification", 0x9212, FIELD_TYPE_ASCII, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    IMAGE_HISTORY_EXIF_IFD(new TagInfo(
            "Image History", 0x9213, FIELD_TYPE_ASCII, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    SUBJECT_LOCATION_1(new TagInfo(
            "Subject Location", 0x9214, FIELD_TYPE_SHORT, 4,
            EXIF_DIRECTORY_EXIF_IFD)),
    EXPOSURE_INDEX(new TagInfo(
            "Exposure Index", 0x9215, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    TIFF_EPSTANDARD_ID_1(new TagInfo(
            "TIFF- EPStandard ID", 0x9216, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    SENSING_METHOD(new TagInfo(
            "Sensing Method", 0x9217, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)) {
        public static final int SENSING_METHOD_VALUE_MONOCHROME_AREA = 1;
        public static final int SENSING_METHOD_VALUE_ONE_CHIP_COLOR_AREA = 2;
        public static final int SENSING_METHOD_VALUE_TWO_CHIP_COLOR_AREA = 3;
        public static final int SENSING_METHOD_VALUE_THREE_CHIP_COLOR_AREA = 4;
        public static final int SENSING_METHOD_VALUE_COLOR_SEQUENTIAL_AREA = 5;
        public static final int SENSING_METHOD_VALUE_MONOCHROME_LINEAR = 6;
        public static final int SENSING_METHOD_VALUE_TRILINEAR = 7;
        public static final int SENSING_METHOD_VALUE_COLOR_SEQUENTIAL_LINEAR = 8;
    },
    STO_NITS(new TagInfo("Sto Nits",
            0x923f, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    //     skipping Maker Note!
    MAKER_NOTE(new TagInfo("Maker Note",
            0x927c, FIELD_TYPE_UNDEFINED, 1, EXIF_DIRECTORY_EXIF_IFD)),
    USER_COMMENT(new TagInfo.Text(
            "UserComment", 0x9286, FIELD_TYPE_UNDEFINED, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    SUB_SEC_TIME(new TagInfo(
            "Sub Sec Time", 0x9290, FIELD_TYPE_ASCII, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    SUB_SEC_TIME_ORIGINAL(new TagInfo(
            "Sub Sec Time Original", 0x9291, FIELD_TYPE_ASCII, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    SUB_SEC_TIME_DIGITIZED(new TagInfo(
            "Sub Sec Time Digitized", 0x9292, FIELD_TYPE_ASCII, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    IMAGE_SOURCE_DATA(new TagInfo(
            "Image Source Data", 0x935c, FIELD_TYPE_UNDEFINED, 1,
            EXIF_DIRECTORY_IFD0)),
    XPTITLE(new TagInfo("XPTitle",
            0x9c9b, FIELD_TYPE_BYTE, 1, EXIF_DIRECTORY_IFD0)),
    XPCOMMENT(new TagInfo("XPComment",
            0x9c9c, FIELD_TYPE_BYTE, 1, EXIF_DIRECTORY_IFD0)),
    XPAUTHOR(new TagInfo("XPAuthor",
            0x9c9d, FIELD_TYPE_BYTE, 1, EXIF_DIRECTORY_IFD0)),
    XPKEYWORDS(new TagInfo("XPKeywords",
            0x9c9e, FIELD_TYPE_BYTE, 1, EXIF_DIRECTORY_IFD0)),
    XPSUBJECT(new TagInfo("XPSubject",
            0x9c9f, FIELD_TYPE_BYTE, 1, EXIF_DIRECTORY_IFD0)),
    FLASHPIX_VERSION(new TagInfo(
            "Flashpix Version", 0xa000, FIELD_TYPE_UNDEFINED, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    COLOR_SPACE(new TagInfo(
            "Color Space", 0xa001, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_EXIF_IFD)) {
        public static final int COLOR_SPACE_VALUE_SRGB = 1;
        public static final int COLOR_SPACE_VALUE_ADOBE_RGB = 2;
        public static final int COLOR_SPACE_VALUE_UNCALIBRATED = 65535;
    },
    EXIF_IMAGE_WIDTH(new TagInfo(
            "Exif Image Width", 0xa002, FIELD_TYPE_SHORT, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    EXIF_IMAGE_LENGTH(new TagInfo(
            "Exif Image Length", 0xa003, FIELD_TYPE_SHORT, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    RELATED_SOUND_FILE(new TagInfo(
            "Related Sound File", 0xa004, FIELD_TYPE_ASCII, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    INTEROP_OFFSET(new TagInfo.Offset(
            "Interop Offset", 0xa005, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    FLASH_ENERGY_EXIF_IFD(new TagInfo(
            "Flash Energy", 0xa20b, FIELD_TYPE_RATIONAL, -1,
            EXIF_DIRECTORY_EXIF_IFD)),
    SPATIAL_FREQUENCY_RESPONSE_2(new TagInfo(
            "Spatial Frequency Response", 0xa20c,
            FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    NOISE_2(new TagInfo("Noise", 0xa20d,
            FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    FOCAL_PLANE_XRESOLUTION_EXIF_IFD(new TagInfo(
            "Focal Plane XResolution", 0xa20e, FIELD_TYPE_RATIONAL, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    FOCAL_PLANE_YRESOLUTION_EXIF_IFD(new TagInfo(
            "Focal Plane YResolution", 0xa20f, FIELD_TYPE_RATIONAL, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD(new TagInfo(
            "Focal Plane Resolution Unit", 0xa210, FIELD_TYPE_SHORT, 1,
            EXIF_DIRECTORY_EXIF_IFD)) {
        public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_NONE = 1;
        public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_INCHES = 2;
        public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_CM = 3;
        public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_MM = 4;
        public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_UM = 5;
    },
    IMAGE_NUMBER(new TagInfo(
            "Image Number", 0xa211, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    SECURITY_CLASSIFICATION(new TagInfo(
            "Security Classification", 0xa212, FIELD_TYPE_DESCRIPTION_UNKNOWN,
            1, EXIF_DIRECTORY_UNKNOWN)),
    IMAGE_HISTORY(new TagInfo(
            "Image History", 0xa213, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    SUBJECT_LOCATION_2(new TagInfo(
            "Subject Location", 0xa214, FIELD_TYPE_SHORT, 2,
            EXIF_DIRECTORY_EXIF_IFD)),
    EXPOSURE_INDEX_EXIF_IFD(new TagInfo(
            "Exposure Index", 0xa215, FIELD_TYPE_RATIONAL, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    TIFF_EPSTANDARD_ID_2(new TagInfo(
            "TIFF- EPStandard ID", 0xa216, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    SENSING_METHOD_EXIF_IFD(new TagInfo(
            "Sensing Method", 0xa217, FIELD_TYPE_SHORT, 1,
            EXIF_DIRECTORY_EXIF_IFD)) {
        public static final int SENSING_METHOD_EXIF_IFD_VALUE_NOT_DEFINED = 1;
        public static final int SENSING_METHOD_EXIF_IFD_VALUE_ONE_CHIP_COLOR_AREA = 2;
        public static final int SENSING_METHOD_EXIF_IFD_VALUE_TWO_CHIP_COLOR_AREA = 3;
        public static final int SENSING_METHOD_EXIF_IFD_VALUE_THREE_CHIP_COLOR_AREA = 4;
        public static final int SENSING_METHOD_EXIF_IFD_VALUE_COLOR_SEQUENTIAL_AREA = 5;
        public static final int SENSING_METHOD_EXIF_IFD_VALUE_TRILINEAR = 7;
        public static final int SENSING_METHOD_EXIF_IFD_VALUE_COLOR_SEQUENTIAL_LINEAR = 8;
    },
    FILE_SOURCE(new TagInfo(
            "File Source", 0xa300, FIELD_TYPE_UNDEFINED, 1,
            EXIF_DIRECTORY_EXIF_IFD)) {
        public static final int FILE_SOURCE_VALUE_FILM_SCANNER = 1;
        public static final int FILE_SOURCE_VALUE_REFLECTION_PRINT_SCANNER = 2;
        public static final int FILE_SOURCE_VALUE_DIGITAL_CAMERA = 3;
    },
    SCENE_TYPE(new TagInfo("Scene Type",
            0xa301, FIELD_TYPE_UNDEFINED, 1, EXIF_DIRECTORY_EXIF_IFD)),
    CFAPATTERN(new TagInfo("CFAPattern",
            0xa302, FIELD_TYPE_UNDEFINED, 1, EXIF_DIRECTORY_EXIF_IFD)),
    CUSTOM_RENDERED(new TagInfo(
            "Custom Rendered", 0xa401, FIELD_TYPE_SHORT, 1,
            EXIF_DIRECTORY_EXIF_IFD)) {
        public static final int CUSTOM_RENDERED_VALUE_NORMAL = 0;
        public static final int CUSTOM_RENDERED_VALUE_CUSTOM = 1;
    },
    EXPOSURE_MODE(new TagInfo(
            "Exposure Mode", 0xa402, FIELD_TYPE_SHORT, 1,
            EXIF_DIRECTORY_EXIF_IFD)) {
        public static final int EXPOSURE_MODE_VALUE_AUTO = 0;
        public static final int EXPOSURE_MODE_VALUE_MANUAL = 1;
        public static final int EXPOSURE_MODE_VALUE_AUTO_BRACKET = 2;
    },
    WHITE_BALANCE_1(new TagInfo(
            "White Balance", 0xa403, FIELD_TYPE_SHORT, 1,
            EXIF_DIRECTORY_EXIF_IFD)) {
        public static final int WHITE_BALANCE_1_VALUE_AUTO = 0;
        public static final int WHITE_BALANCE_1_VALUE_MANUAL = 1;
    },
    DIGITAL_ZOOM_RATIO(new TagInfo(
            "Digital Zoom Ratio", 0xa404, FIELD_TYPE_RATIONAL, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    FOCAL_LENGTH_IN_35MM_FORMAT(new TagInfo(
            "Focal Length In 3 5mm Format", 0xa405, FIELD_TYPE_SHORT, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    SCENE_CAPTURE_TYPE(new TagInfo(
            "Scene Capture Type", 0xa406, FIELD_TYPE_SHORT, 1,
            EXIF_DIRECTORY_EXIF_IFD)) {
        public static final int SCENE_CAPTURE_TYPE_VALUE_STANDARD = 0;
        public static final int SCENE_CAPTURE_TYPE_VALUE_LANDSCAPE = 1;
        public static final int SCENE_CAPTURE_TYPE_VALUE_PORTRAIT = 2;
        public static final int SCENE_CAPTURE_TYPE_VALUE_NIGHT = 3;
    },
    GAIN_CONTROL(new TagInfo(
            "Gain Control", 0xa407, FIELD_TYPE_SHORT, 1,
            EXIF_DIRECTORY_EXIF_IFD)) {
        public static final int GAIN_CONTROL_VALUE_NONE = 0;
        public static final int GAIN_CONTROL_VALUE_LOW_GAIN_UP = 1;
        public static final int GAIN_CONTROL_VALUE_HIGH_GAIN_UP = 2;
        public static final int GAIN_CONTROL_VALUE_LOW_GAIN_DOWN = 3;
        public static final int GAIN_CONTROL_VALUE_HIGH_GAIN_DOWN = 4;
    },
    CONTRAST_1(new TagInfo("Contrast",
            0xa408, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_EXIF_IFD)) {
        public static final int CONTRAST_1_VALUE_NORMAL = 0;
        public static final int CONTRAST_1_VALUE_LOW = 1;
        public static final int CONTRAST_1_VALUE_HIGH = 2;
    },
    SATURATION_1(new TagInfo(
            "Saturation", 0xa409, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_EXIF_IFD)) {
        public static final int SATURATION_1_VALUE_NORMAL = 0;
        public static final int SATURATION_1_VALUE_LOW = 1;
        public static final int SATURATION_1_VALUE_HIGH = 2;
    },
    SHARPNESS_1(new TagInfo("Sharpness",
            0xa40a, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_EXIF_IFD)) {
        public static final int SHARPNESS_1_VALUE_NORMAL = 0;
        public static final int SHARPNESS_1_VALUE_SOFT = 1;
        public static final int SHARPNESS_1_VALUE_HARD = 2;
    },
    DEVICE_SETTING_DESCRIPTION(new TagInfo(
            "Device Setting Description", 0xa40b,
            FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    SUBJECT_DISTANCE_RANGE(new TagInfo(
            "Subject Distance Range", 0xa40c, FIELD_TYPE_SHORT, 1,
            EXIF_DIRECTORY_EXIF_IFD)) {
        public static final int SUBJECT_DISTANCE_RANGE_VALUE_MACRO = 1;
        public static final int SUBJECT_DISTANCE_RANGE_VALUE_CLOSE = 2;
        public static final int SUBJECT_DISTANCE_RANGE_VALUE_DISTANT = 3;
    },
    IMAGE_UNIQUE_ID(new TagInfo(
            "Image Unique ID", 0xa420, FIELD_TYPE_ASCII, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    GDALMETADATA(new TagInfo(
            "GDALMetadata", 0xa480, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    GDALNO_DATA(new TagInfo(
            "GDALNo Data", 0xa481, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    GAMMA(new TagInfo("Gamma", 0xa500,
            FIELD_TYPE_RATIONAL, 1, EXIF_DIRECTORY_EXIF_IFD)),
    PIXEL_FORMAT(new TagInfo(
            "Pixel Format", 0xbc01, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)) {
        public static final int PIXEL_FORMAT_VALUE_BLACK_AND_WHITE = 0x5;
        public static final int PIXEL_FORMAT_VALUE_8_BIT_GRAY = 0x8;
        public static final int PIXEL_FORMAT_VALUE_16_BIT_BGR555 = 0x9;
        public static final int PIXEL_FORMAT_VALUE_16_BIT_BGR565 = 0xa;
        public static final int PIXEL_FORMAT_VALUE_16_BIT_GRAY = 0xb;
        public static final int PIXEL_FORMAT_VALUE_24_BIT_BGR = 0xc;
        public static final int PIXEL_FORMAT_VALUE_24_BIT_RGB = 0xd;
        public static final int PIXEL_FORMAT_VALUE_32_BIT_BGR = 0xe;
        public static final int PIXEL_FORMAT_VALUE_32_BIT_BGRA = 0xf;
        public static final int PIXEL_FORMAT_VALUE_32_BIT_PBGRA = 0x10;
        public static final int PIXEL_FORMAT_VALUE_32_BIT_GRAY_FLOAT = 0x11;
        public static final int PIXEL_FORMAT_VALUE_48_BIT_RGB_FIXED_POINT = 0x12;
        public static final int PIXEL_FORMAT_VALUE_32_BIT_BGR101010 = 0x13;
        public static final int PIXEL_FORMAT_VALUE_48_BIT_RGB = 0x15;
        public static final int PIXEL_FORMAT_VALUE_64_BIT_RGBA = 0x16;
        public static final int PIXEL_FORMAT_VALUE_64_BIT_PRGBA = 0x17;
        public static final int PIXEL_FORMAT_VALUE_96_BIT_RGB_FIXED_POINT = 0x18;
        public static final int PIXEL_FORMAT_VALUE_128_BIT_RGBA_FLOAT = 0x19;
        public static final int PIXEL_FORMAT_VALUE_128_BIT_PRGBA_FLOAT = 0x1a;
        public static final int PIXEL_FORMAT_VALUE_128_BIT_RGB_FLOAT = 0x1b;
        public static final int PIXEL_FORMAT_VALUE_32_BIT_CMYK = 0x1c;
        public static final int PIXEL_FORMAT_VALUE_64_BIT_RGBA_FIXED_POINT = 0x1d;
        public static final int PIXEL_FORMAT_VALUE_128_BIT_RGBA_FIXED_POINT = 0x1e;
        public static final int PIXEL_FORMAT_VALUE_64_BIT_CMYK = 0x1f;
        public static final int PIXEL_FORMAT_VALUE_24_BIT_3_CHANNELS = 0x20;
        public static final int PIXEL_FORMAT_VALUE_32_BIT_4_CHANNELS = 0x21;
        public static final int PIXEL_FORMAT_VALUE_40_BIT_5_CHANNELS = 0x22;
        public static final int PIXEL_FORMAT_VALUE_48_BIT_6_CHANNELS = 0x23;
        public static final int PIXEL_FORMAT_VALUE_56_BIT_7_CHANNELS = 0x24;
        public static final int PIXEL_FORMAT_VALUE_64_BIT_8_CHANNELS = 0x25;
        public static final int PIXEL_FORMAT_VALUE_48_BIT_3_CHANNELS = 0x26;
        public static final int PIXEL_FORMAT_VALUE_64_BIT_4_CHANNELS = 0x27;
        public static final int PIXEL_FORMAT_VALUE_80_BIT_5_CHANNELS = 0x28;
        public static final int PIXEL_FORMAT_VALUE_96_BIT_6_CHANNELS = 0x29;
        public static final int PIXEL_FORMAT_VALUE_112_BIT_7_CHANNELS = 0x2a;
        public static final int PIXEL_FORMAT_VALUE_128_BIT_8_CHANNELS = 0x2b;
        public static final int PIXEL_FORMAT_VALUE_40_BIT_CMYK_ALPHA = 0x2c;
        public static final int PIXEL_FORMAT_VALUE_80_BIT_CMYK_ALPHA = 0x2d;
        public static final int PIXEL_FORMAT_VALUE_32_BIT_3_CHANNELS_ALPHA = 0x2e;
        public static final int PIXEL_FORMAT_VALUE_40_BIT_4_CHANNELS_ALPHA = 0x2f;
        public static final int PIXEL_FORMAT_VALUE_48_BIT_5_CHANNELS_ALPHA = 0x30;
        public static final int PIXEL_FORMAT_VALUE_56_BIT_6_CHANNELS_ALPHA = 0x31;
        public static final int PIXEL_FORMAT_VALUE_64_BIT_7_CHANNELS_ALPHA = 0x32;
        public static final int PIXEL_FORMAT_VALUE_72_BIT_8_CHANNELS_ALPHA = 0x33;
        public static final int PIXEL_FORMAT_VALUE_64_BIT_3_CHANNELS_ALPHA = 0x34;
        public static final int PIXEL_FORMAT_VALUE_80_BIT_4_CHANNELS_ALPHA = 0x35;
        public static final int PIXEL_FORMAT_VALUE_96_BIT_5_CHANNELS_ALPHA = 0x36;
        public static final int PIXEL_FORMAT_VALUE_112_BIT_6_CHANNELS_ALPHA = 0x37;
        public static final int PIXEL_FORMAT_VALUE_128_BIT_7_CHANNELS_ALPHA = 0x38;
        public static final int PIXEL_FORMAT_VALUE_144_BIT_8_CHANNELS_ALPHA = 0x39;
        public static final int PIXEL_FORMAT_VALUE_64_BIT_RGBA_HALF = 0x3a;
        public static final int PIXEL_FORMAT_VALUE_48_BIT_RGB_HALF = 0x3b;
        public static final int PIXEL_FORMAT_VALUE_32_BIT_RGBE = 0x3d;
        public static final int PIXEL_FORMAT_VALUE_16_BIT_GRAY_HALF = 0x3e;
        public static final int PIXEL_FORMAT_VALUE_32_BIT_GRAY_FIXED_POINT = 0x3f;
    },
    TRANSFOMATION(new TagInfo(
            "Transfomation", 0xbc02, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)) {
        public static final int TRANSFOMATION_VALUE_HORIZONTAL_NORMAL = 0;
        public static final int TRANSFOMATION_VALUE_MIRROR_VERTICAL = 1;
        public static final int TRANSFOMATION_VALUE_MIRROR_HORIZONTAL = 2;
        public static final int TRANSFOMATION_VALUE_ROTATE_180 = 3;
        public static final int TRANSFOMATION_VALUE_ROTATE_90_CW = 4;
        public static final int TRANSFOMATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_90_CW = 5;
        public static final int TRANSFOMATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_270_CW = 6;
        public static final int TRANSFOMATION_VALUE_ROTATE_270_CW = 7;
    },
    UNCOMPRESSED(new TagInfo(
            "Uncompressed", 0xbc03, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)) {
        public static final int UNCOMPRESSED_VALUE_NO = 0;
        public static final int UNCOMPRESSED_VALUE_YES = 1;
    },
    IMAGE_TYPE(new TagInfo("Image Type",
            0xbc04, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    IMAGE_WIDTH(new TagInfo(
            "Image Width", 0xbc80, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    IMAGE_HEIGHT(new TagInfo(
            "Image Height", 0xbc81, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    WIDTH_RESOLUTION(new TagInfo(
            "Width Resolution", 0xbc82, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    HEIGHT_RESOLUTION(new TagInfo(
            "Height Resolution", 0xbc83, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    // might be an offset?
    IMAGE_OFFSET(new TagInfo(
            "Image Offset", 0xbcc0, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    IMAGE_BYTE_COUNT(new TagInfo(
            "Image Byte Count", 0xbcc1, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    // might be an offset?
    ALPHA_OFFSET(new TagInfo(
            "Alpha Offset", 0xbcc2, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    ALPHA_BYTE_COUNT(new TagInfo(
            "Alpha Byte Count", 0xbcc3, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    IMAGE_DATA_DISCARD(new TagInfo(
            "Image Data Discard", 0xbcc4, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)) {
        public static final int IMAGE_DATA_DISCARD_VALUE_FULL_RESOLUTION = 0;
        public static final int IMAGE_DATA_DISCARD_VALUE_FLEXBITS_DISCARDED = 1;
        public static final int IMAGE_DATA_DISCARD_VALUE_HIGH_PASS_FREQUENCY_DATA_DISCARDED = 2;
        public static final int IMAGE_DATA_DISCARD_VALUE_HIGHPASS_AND_LOW_PASS_FREQUENCY_DATA_DISCARDED = 3;
    },
    ALPHA_DATA_DISCARD(new TagInfo(
            "Alpha Data Discard", 0xbcc5, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)) {
        public static final int ALPHA_DATA_DISCARD_VALUE_FULL_RESOLUTION = 0;
        public static final int ALPHA_DATA_DISCARD_VALUE_FLEXBITS_DISCARDED = 1;
        public static final int ALPHA_DATA_DISCARD_VALUE_HIGH_PASS_FREQUENCY_DATA_DISCARDED = 2;
        public static final int ALPHA_DATA_DISCARD_VALUE_HIGHPASS_AND_LOW_PASS_FREQUENCY_DATA_DISCARDED = 3;
    },
    OCE_SCANJOB_DESC(new TagInfo(
            "Oce Scanjob Desc", 0xc427, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    OCE_APPLICATION_SELECTOR(new TagInfo(
            "Oce Application Selector", 0xc428, FIELD_TYPE_DESCRIPTION_UNKNOWN,
            1, EXIF_DIRECTORY_UNKNOWN)),
    OCE_IDNUMBER(new TagInfo(
            "Oce IDNumber", 0xc429, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    OCE_IMAGE_LOGIC(new TagInfo(
            "Oce Image Logic", 0xc42a, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    ANNOTATIONS(new TagInfo(
            "Annotations", 0xc44f, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    PRINT_IM(new TagInfo("Print IM",
            0xc4a5, FIELD_TYPE_UNDEFINED, 1, EXIF_DIRECTORY_IFD0)),
    DNG_VERSION(new TagInfo(
            "DNG Version", 0xc612, FIELD_TYPE_BYTE, 4, EXIF_DIRECTORY_IFD0)),
    DNG_BACKWARD_VERSION(new TagInfo(
            "DNG Backward Version", 0xc613, FIELD_TYPE_BYTE, 4,
            EXIF_DIRECTORY_IFD0)),
    UNIQUE_CAMERA_MODEL(new TagInfo(
            "Unique Camera Model", 0xc614, FIELD_TYPE_ASCII, 1,
            EXIF_DIRECTORY_IFD0)),
    LOCALIZED_CAMERA_MODEL(new TagInfo(
            "Localized Camera Model", 0xc615, FIELD_TYPE_ASCII, 1,
            EXIF_DIRECTORY_IFD0)),
    CFAPLANE_COLOR(new TagInfo(
            "CFAPlane Color", 0xc616, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    CFALAYOUT(new TagInfo("CFALayout",
            0xc617, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)) {
        public static final int CFALAYOUT_VALUE_RECTANGULAR = 1;
        public static final int CFALAYOUT_VALUE_EVEN_COLUMNS_OFFSET_DOWN_1_2_ROW = 2;
        public static final int CFALAYOUT_VALUE_EVEN_COLUMNS_OFFSET_UP_1_2_ROW = 3;
        public static final int CFALAYOUT_VALUE_EVEN_ROWS_OFFSET_RIGHT_1_2_COLUMN = 4;
        public static final int CFALAYOUT_VALUE_EVEN_ROWS_OFFSET_LEFT_1_2_COLUMN = 5;
    },
    LINEARIZATION_TABLE(new TagInfo(
            "Linearization Table", 0xc618, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    BLACK_LEVEL_REPEAT_DIM(new TagInfo(
            "Black Level Repeat Dim", 0xc619, FIELD_TYPE_DESCRIPTION_UNKNOWN,
            1, EXIF_DIRECTORY_UNKNOWN)),
    BLACK_LEVEL(new TagInfo(
            "Black Level", 0xc61a, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    BLACK_LEVEL_DELTA_H(new TagInfo(
            "Black Level Delta H", 0xc61b, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    BLACK_LEVEL_DELTA_V(new TagInfo(
            "Black Level Delta V", 0xc61c, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    WHITE_LEVEL(new TagInfo(
            "White Level", 0xc61d, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    DEFAULT_SCALE(new TagInfo(
            "Default Scale", 0xc61e, FIELD_TYPE_RATIONAL, 2,
            EXIF_DIRECTORY_SUB_IFD)),
    DEFAULT_CROP_ORIGIN(new TagInfo(
            "Default Crop Origin", 0xc61f, FIELD_TYPE_LONG, 2,
            EXIF_DIRECTORY_SUB_IFD)),
    DEFAULT_CROP_SIZE(new TagInfo(
            "Default Crop Size", 0xc620, FIELD_TYPE_LONG, 2,
            EXIF_DIRECTORY_SUB_IFD)),
    COLOR_MATRIX_1(new TagInfo(
            "Color Matrix 1", 0xc621, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    COLOR_MATRIX_2(new TagInfo(
            "Color Matrix 2", 0xc622, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    CAMERA_CALIBRATION_1(new TagInfo(
            "Camera Calibration 1", 0xc623, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    CAMERA_CALIBRATION_2(new TagInfo(
            "Camera Calibration 2", 0xc624, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    REDUCTION_MATRIX_1(new TagInfo(
            "Reduction Matrix 1", 0xc625, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    REDUCTION_MATRIX_2(new TagInfo(
            "Reduction Matrix 2", 0xc626, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    ANALOG_BALANCE(new TagInfo(
            "Analog Balance", 0xc627, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    AS_SHOT_NEUTRAL(new TagInfo(
            "As Shot Neutral", 0xc628, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    AS_SHOT_WHITE_XY(new TagInfo(
            "As Shot White XY", 0xc629, FIELD_TYPE_RATIONAL, 2,
            EXIF_DIRECTORY_IFD0)),
    BASELINE_EXPOSURE(new TagInfo(
            "Baseline Exposure", 0xc62a, FIELD_TYPE_SRATIONAL, 1,
            EXIF_DIRECTORY_IFD0)),
    BASELINE_NOISE(new TagInfo(
            "Baseline Noise", 0xc62b, FIELD_TYPE_RATIONAL, 1,
            EXIF_DIRECTORY_IFD0)),
    BASELINE_SHARPNESS(new TagInfo(
            "Baseline Sharpness", 0xc62c, FIELD_TYPE_RATIONAL, 1,
            EXIF_DIRECTORY_IFD0)),
    BAYER_GREEN_SPLIT(new TagInfo(
            "Bayer Green Split", 0xc62d, FIELD_TYPE_LONG, 1,
            EXIF_DIRECTORY_SUB_IFD)),
    LINEAR_RESPONSE_LIMIT(new TagInfo(
            "Linear Response Limit", 0xc62e, FIELD_TYPE_RATIONAL, 1,
            EXIF_DIRECTORY_IFD0)),
    CAMERA_SERIAL_NUMBER(new TagInfo(
            "Camera Serial Number", 0xc62f, FIELD_TYPE_ASCII, 1,
            EXIF_DIRECTORY_IFD0)),
    DNG_LENS_INFO(new TagInfo(
            "DNG Lens Info", 0xc630, FIELD_TYPE_RATIONAL, 4,
            EXIF_DIRECTORY_IFD0)),
    CHROMA_BLUR_RADIUS(new TagInfo(
            "Chroma Blur Radius", 0xc631, FIELD_TYPE_RATIONAL, 1,
            EXIF_DIRECTORY_SUB_IFD)),
    ANTI_ALIAS_STRENGTH(new TagInfo(
            "Anti Alias Strength", 0xc632, FIELD_TYPE_RATIONAL, 1,
            EXIF_DIRECTORY_SUB_IFD)),
    SHADOW_SCALE(new TagInfo(
            "Shadow Scale", 0xc633, FIELD_TYPE_RATIONAL, 1, EXIF_DIRECTORY_IFD0)),
    // poly tag public static final TagInfo2 SR2PRIVATE(new TagInfo2( "SR2Private", 0xc634, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    DNG_ADOBE_DATA(new TagInfo(
            "DNG Adobe Data", 0xc634, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    DNG_PENTAX_DATA(new TagInfo(
            "DNG Pentax Data", 0xc634, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    DNG_PRIVATE_DATA(new TagInfo(
            "DNG Private Data", 0xc634, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    MAKER_NOTE_SAFETY(new TagInfo(
            "Maker Note Safety", 0xc635, FIELD_TYPE_SHORT, 1,
            EXIF_DIRECTORY_IFD0)) {
        public static final int MAKER_NOTE_SAFETY_VALUE_UNSAFE = 0;
        public static final int MAKER_NOTE_SAFETY_VALUE_SAFE = 1;
    },
    CALIBRATION_ILLUMINANT_1(new TagInfo(
            "Calibration Illuminant 1", 0xc65a, FIELD_TYPE_SHORT, 1,
            EXIF_DIRECTORY_IFD0)) {
        public static final int CALIBRATION_ILLUMINANT_1_VALUE_DAYLIGHT = 1;
        public static final int CALIBRATION_ILLUMINANT_1_VALUE_FLUORESCENT = 2;
        public static final int CALIBRATION_ILLUMINANT_1_VALUE_TUNGSTEN = 3;
        public static final int CALIBRATION_ILLUMINANT_1_VALUE_FLASH = 4;
        public static final int CALIBRATION_ILLUMINANT_1_VALUE_FINE_WEATHER = 9;
        public static final int CALIBRATION_ILLUMINANT_1_VALUE_CLOUDY = 10;
        public static final int CALIBRATION_ILLUMINANT_1_VALUE_SHADE = 11;
        public static final int CALIBRATION_ILLUMINANT_1_VALUE_DAYLIGHT_FLUORESCENT = 12;
        public static final int CALIBRATION_ILLUMINANT_1_VALUE_DAY_WHITE_FLUORESCENT = 13;
        public static final int CALIBRATION_ILLUMINANT_1_VALUE_COOL_WHITE_FLUORESCENT = 14;
        public static final int CALIBRATION_ILLUMINANT_1_VALUE_WHITE_FLUORESCENT = 15;
        public static final int CALIBRATION_ILLUMINANT_1_VALUE_STANDARD_LIGHT_A = 17;
        public static final int CALIBRATION_ILLUMINANT_1_VALUE_STANDARD_LIGHT_B = 18;
        public static final int CALIBRATION_ILLUMINANT_1_VALUE_STANDARD_LIGHT_C = 19;
        public static final int CALIBRATION_ILLUMINANT_1_VALUE_D55 = 20;
        public static final int CALIBRATION_ILLUMINANT_1_VALUE_D65 = 21;
        public static final int CALIBRATION_ILLUMINANT_1_VALUE_D75 = 22;
        public static final int CALIBRATION_ILLUMINANT_1_VALUE_D50 = 23;
        public static final int CALIBRATION_ILLUMINANT_1_VALUE_ISO_STUDIO_TUNGSTEN = 24;
        public static final int CALIBRATION_ILLUMINANT_1_VALUE_OTHER = 255;
    },
    CALIBRATION_ILLUMINANT_2(new TagInfo(
            "Calibration Illuminant 2", 0xc65b, FIELD_TYPE_SHORT, 1,
            EXIF_DIRECTORY_IFD0)) {
        public static final int CALIBRATION_ILLUMINANT_2_VALUE_DAYLIGHT = 1;
        public static final int CALIBRATION_ILLUMINANT_2_VALUE_FLUORESCENT = 2;
        public static final int CALIBRATION_ILLUMINANT_2_VALUE_TUNGSTEN = 3;
        public static final int CALIBRATION_ILLUMINANT_2_VALUE_FLASH = 4;
        public static final int CALIBRATION_ILLUMINANT_2_VALUE_FINE_WEATHER = 9;
        public static final int CALIBRATION_ILLUMINANT_2_VALUE_CLOUDY = 10;
        public static final int CALIBRATION_ILLUMINANT_2_VALUE_SHADE = 11;
        public static final int CALIBRATION_ILLUMINANT_2_VALUE_DAYLIGHT_FLUORESCENT = 12;
        public static final int CALIBRATION_ILLUMINANT_2_VALUE_DAY_WHITE_FLUORESCENT = 13;
        public static final int CALIBRATION_ILLUMINANT_2_VALUE_COOL_WHITE_FLUORESCENT = 14;
        public static final int CALIBRATION_ILLUMINANT_2_VALUE_WHITE_FLUORESCENT = 15;
        public static final int CALIBRATION_ILLUMINANT_2_VALUE_STANDARD_LIGHT_A = 17;
        public static final int CALIBRATION_ILLUMINANT_2_VALUE_STANDARD_LIGHT_B = 18;
        public static final int CALIBRATION_ILLUMINANT_2_VALUE_STANDARD_LIGHT_C = 19;
        public static final int CALIBRATION_ILLUMINANT_2_VALUE_D55 = 20;
        public static final int CALIBRATION_ILLUMINANT_2_VALUE_D65 = 21;
        public static final int CALIBRATION_ILLUMINANT_2_VALUE_D75 = 22;
        public static final int CALIBRATION_ILLUMINANT_2_VALUE_D50 = 23;
        public static final int CALIBRATION_ILLUMINANT_2_VALUE_ISO_STUDIO_TUNGSTEN = 24;
        public static final int CALIBRATION_ILLUMINANT_2_VALUE_OTHER = 255;
    },
    BEST_QUALITY_SCALE(new TagInfo(
            "Best Quality Scale", 0xc65c, FIELD_TYPE_RATIONAL, 1,
            EXIF_DIRECTORY_SUB_IFD)),
    RAW_DATA_UNIQUE_ID(new TagInfo(
            "Raw Data Unique ID", 0xc65d, FIELD_TYPE_BYTE, 16,
            EXIF_DIRECTORY_IFD0)),
    ALIAS_LAYER_METADATA(new TagInfo(
            "Alias Layer Metadata", 0xc660, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    ORIGINAL_RAW_FILE_NAME(new TagInfo(
            "Original Raw File Name", 0xc68b, FIELD_TYPE_ASCII, 1,
            EXIF_DIRECTORY_IFD0)),
    ORIGINAL_RAW_FILE_DATA(new TagInfo(
            "Original Raw File Data", 0xc68c, FIELD_TYPE_UNDEFINED, 1,
            EXIF_DIRECTORY_IFD0)),
    ACTIVE_AREA(new TagInfo(
            "Active Area", 0xc68d, FIELD_TYPE_LONG, 4, EXIF_DIRECTORY_SUB_IFD)),
    MASKED_AREAS(new TagInfo(
            "Masked Areas", 0xc68e, FIELD_TYPE_LONG, 4, EXIF_DIRECTORY_SUB_IFD)),
    AS_SHOT_ICCPROFILE(new TagInfo(
            "As Shot ICCProfile", 0xc68f, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    AS_SHOT_PRE_PROFILE_MATRIX(new TagInfo(
            "As Shot Pre Profile Matrix", 0xc690,
            FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    CURRENT_ICCPROFILE(new TagInfo(
            "Current ICCProfile", 0xc691, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
            EXIF_DIRECTORY_UNKNOWN)),
    CURRENT_PRE_PROFILE_MATRIX(new TagInfo(
            "Current Pre Profile Matrix", 0xc692,
            FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN)),
    OFFSET_SCHEMA(new TagInfo(
            "Offset Schema", 0xea1d, FIELD_TYPE_SLONG, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    OWNER_NAME(new TagInfo("Owner Name",
            0xfde8, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_EXIF_IFD)),
    SERIAL_NUMBER(new TagInfo(
            "Serial Number", 0xfde9, FIELD_TYPE_ASCII, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    LENS(new TagInfo("Lens", 0xfdea,
            FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_EXIF_IFD)),
    RAW_FILE(new TagInfo("Raw File",
            0xfe4c, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_EXIF_IFD)),
    CONVERTER(new TagInfo("Converter",
            0xfe4d, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_EXIF_IFD)),
    WHITE_BALANCE_2(new TagInfo(
            "White Balance", 0xfe4e, FIELD_TYPE_ASCII, 1,
            EXIF_DIRECTORY_EXIF_IFD)),
    EXPOSURE(new TagInfo("Exposure",
            0xfe51, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_EXIF_IFD)),
    SHADOWS(new TagInfo("Shadows",
            0xfe52, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_EXIF_IFD)),
    BRIGHTNESS(new TagInfo("Brightness",
            0xfe53, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_EXIF_IFD)),
    CONTRAST_2(new TagInfo("Contrast",
            0xfe54, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_EXIF_IFD)),
    SATURATION_2(new TagInfo(
            "Saturation", 0xfe55, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_EXIF_IFD)),
    SHARPNESS_2(new TagInfo("Sharpness",
            0xfe56, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_EXIF_IFD)),
    SMOOTHNESS(new TagInfo("Smoothness",
            0xfe57, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_EXIF_IFD)),
    MOIRE_FILTER(new TagInfo(
            "Moire Filter", 0xfe58, FIELD_TYPE_ASCII, 1,
            EXIF_DIRECTORY_EXIF_IFD));
    
    public final TagInfo tagInfo;
    
    ExifTagConstants(TagInfo tagInfo) {
        this.tagInfo = tagInfo;
    }
    
    public TagInfo getTagInfo() {
        return tagInfo;
    }
    
    public static final List<TagInfo> ALL_EXIF_TAGS = Collections.unmodifiableList(
            TagConstantsUtils.mergeTagLists(values()));
}
