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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfo;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoAny;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoAscii;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoByte;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoByteOrShort;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoLong;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoRational;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoShort;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoShortOrLong;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoUnknown;

public interface TiffTagConstants
        extends
            TiffFieldTypeConstants
{

    public static final TagInfoLong TIFF_TAG_NEW_SUBFILE_TYPE = new TagInfoLong(
            "New Subfile Type", 0xFE, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_SUBFILE_TYPE = new TagInfoShort(
            "Subfile Type", 0xFF, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShortOrLong TIFF_TAG_IMAGE_WIDTH = new TagInfoShortOrLong(
            "Image Width", 0x100, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShortOrLong TIFF_TAG_IMAGE_LENGTH = new TagInfoShortOrLong(
            "Image Length", 0x101, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_BITS_PER_SAMPLE = new TagInfoShort(
            "Bits Per Sample", 0x102, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_COMPRESSION = new TagInfoShort(
            "Compression", 0x103, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_PHOTOMETRIC_INTERPRETATION = new TagInfoShort(
            "Photometric Interpretation", 0x106, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_THRESHHOLDING = new TagInfoShort(
            "Threshholding", 0x107, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_CELL_WIDTH = new TagInfoShort(
            "Cell Width", 0x108, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_CELL_LENGTH = new TagInfoShort(
            "Cell Length", 0x109, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_FILL_ORDER = new TagInfoShort(
            "Fill Order", 0x10A, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoAscii TIFF_TAG_DOCUMENT_NAME = new TagInfoAscii(
            "Document Name", 0x10D, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoAscii TIFF_TAG_IMAGE_DESCRIPTION = new TagInfoAscii(
            "Image Description", 0x10E, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoAscii TIFF_TAG_MAKE = new TagInfoAscii(
            "Make", 0x10F, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoAscii TIFF_TAG_MODEL = new TagInfoAscii(
            "Model", 0x110, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShortOrLong TIFF_TAG_STRIP_OFFSETS = new TagInfoShortOrLong(
            "Strip Offsets", 0x111, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT, true);

    public static final TagInfoShort TIFF_TAG_ORIENTATION = new TagInfoShort(
            "Orientation", 0x112, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_SAMPLES_PER_PIXEL = new TagInfoShort(
            "Samples Per Pixel", 0x115, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShortOrLong TIFF_TAG_ROWS_PER_STRIP = new TagInfoShortOrLong(
            "Rows Per Strip", 0x116, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShortOrLong TIFF_TAG_STRIP_BYTE_COUNTS = new TagInfoShortOrLong(
            "Strip Byte Counts", 0x117, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_MIN_SAMPLE_VALUE = new TagInfoShort(
            "Min Sample Value", 0x118, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_MAX_SAMPLE_VALUE = new TagInfoShort(
            "Max Sample Value", 0x119, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoRational TIFF_TAG_XRESOLUTION = new TagInfoRational(
            "XResolution", 0x11A, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoRational TIFF_TAG_YRESOLUTION = new TagInfoRational(
            "YResolution", 0x11B, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_PLANAR_CONFIGURATION = new TagInfoShort(
            "Planar Configuration", 0x11C, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoAscii TIFF_TAG_PAGE_NAME = new TagInfoAscii(
            "Page Name", 0x11D, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoRational TIFF_TAG_XPOSITION = new TagInfoRational(
            "XPosition", 0x11E, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoRational TIFF_TAG_YPOSITION = new TagInfoRational(
            "YPosition",  0x11F, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoLong TIFF_TAG_FREE_OFFSETS = new TagInfoLong(
            "Free Offsets", 0x120, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoLong TIFF_TAG_FREE_BYTE_COUNTS = new TagInfoLong(
            "Free Byte Counts", 0x121, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_GRAY_RESPONSE_UNIT = new TagInfoShort(
            "Gray Response Unit", 0x122, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_GRAY_RESPONSE_CURVE = new TagInfoShort(
            "Gray Response Curve", 0x123, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoLong TIFF_TAG_T4_OPTIONS = new TagInfoLong(
            "T4 Options", 0x124, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoLong TIFF_TAG_T6_OPTIONS = new TagInfoLong(
            "T6 Options", 0x125, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_RESOLUTION_UNIT = new TagInfoShort(
            "Resolution Unit", 0x128, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_PAGE_NUMBER = new TagInfoShort(
            "Page Number", 0x129, 2,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_TRANSFER_FUNCTION = new TagInfoShort(
            "Transfer Function", 0x12D, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoAscii TIFF_TAG_SOFTWARE = new TagInfoAscii(
            "Software", 0x131, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoAscii TIFF_TAG_DATE_TIME = new TagInfoAscii(
            "Date Time", 0x132, 20,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoAscii TIFF_TAG_ARTIST = new TagInfoAscii(
            "Artist", 0x13B, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoAscii TIFF_TAG_HOST_COMPUTER = new TagInfoAscii(
            "Host Computer", 0x13C, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_PREDICTOR = new TagInfoShort(
            "Predictor", 0x13D, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoRational TIFF_TAG_WHITE_POINT = new TagInfoRational(
            "White Point", 0x13E, 2,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoRational TIFF_TAG_PRIMARY_CHROMATICITIES = new TagInfoRational(
            "Primary Chromaticities", 0x13F, 6,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_COLOR_MAP = new TagInfoShort(
            "Color Map", 0x140, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_HALFTONE_HINTS = new TagInfoShort(
            "Halftone Hints", 0x141, 2,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShortOrLong TIFF_TAG_TILE_WIDTH = new TagInfoShortOrLong(
            "Tile Width", 0x142, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShortOrLong TIFF_TAG_TILE_LENGTH = new TagInfoShortOrLong(
            "Tile Length", 0x143, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoLong TIFF_TAG_TILE_OFFSETS = new TagInfoLong(
            "Tile Offsets", 0x144, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT, true);

    public static final TagInfoShortOrLong TIFF_TAG_TILE_BYTE_COUNTS = new TagInfoShortOrLong(
            "Tile Byte Counts", 0x145, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_INK_SET = new TagInfoShort(
            "Ink Set", 0x14C, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoAscii TIFF_TAG_INK_NAMES = new TagInfoAscii(
            "Ink Names", 0x14D, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_NUMBER_OF_INKS = new TagInfoShort(
            "Number Of Inks", 0x14E, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoByteOrShort TIFF_TAG_DOT_RANGE = new TagInfoByteOrShort(
            "Dot Range", 0x150, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoAscii TIFF_TAG_TARGET_PRINTER = new TagInfoAscii(
            "Target Printer", 0x151, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_EXTRA_SAMPLES = new TagInfoShort(
            "Extra Samples", 0x152, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_SAMPLE_FORMAT = new TagInfoShort(
            "Sample Format", 0x153, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoAny TIFF_TAG_SMIN_SAMPLE_VALUE = new TagInfoAny(
            "SMin Sample Value", 0x154, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoAny TIFF_TAG_SMAX_SAMPLE_VALUE = new TagInfoAny(
            "SMax Sample Value", 0x155, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_TRANSFER_RANGE = new TagInfoShort(
            "Transfer Range", 0x156, 6,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_JPEG_PROC = new TagInfoShort(
            "JPEGProc", 0x200, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoLong TIFF_TAG_JPEG_INTERCHANGE_FORMAT = new TagInfoLong(
            "JPEGInterchange Format", 0x201, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT, true);

    public static final TagInfoLong TIFF_TAG_JPEG_INTERCHANGE_FORMAT_LENGTH = new TagInfoLong(
            "JPEGInterchange Format Length", 0x202,
            1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_JPEG_RESTART_INTERVAL = new TagInfoShort(
            "JPEGRestart Interval", 0x203, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_JPEG_LOSSLESS_PREDICTORS = new TagInfoShort(
            "JPEGLossless Predictors", 0x205, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_JPEG_POINT_TRANSFORMS = new TagInfoShort(
            "JPEGPoint Transforms", 0x206, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoLong TIFF_TAG_JPEG_QTABLES = new TagInfoLong(
            "JPEGQTables", 0x207, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoLong TIFF_TAG_JPEG_DCTABLES = new TagInfoLong(
            "JPEGDCTables", 0x208, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoLong TIFF_TAG_JPEG_ACTABLES = new TagInfoLong(
            "JPEGACTables", 0x209, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoRational TIFF_TAG_YCBCR_COEFFICIENTS = new TagInfoRational(
            "YCbCr Coefficients", 0x211, 3,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_YCBCR_SUB_SAMPLING = new TagInfoShort(
            "YCbCr Sub Sampling", 0x212, 2,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_YCBCR_POSITIONING = new TagInfoShort(
            "YCbCr Positioning", 0x213, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoLong TIFF_TAG_REFERENCE_BLACK_WHITE = new TagInfoLong(
            "Reference Black White", 0x214, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoAscii TIFF_TAG_COPYRIGHT = new TagInfoAscii(
            "Copyright", 0x8298, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoByte TIFF_TAG_XMP = new TagInfoByte(
            "XMP", 0x2BC, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    // TODO:
    //    public static final TagInfo2 TIFF_TAG_UNKNOWN = null;
    public static final TagInfo TIFF_TAG_UNKNOWN = new TagInfoUnknown(
            "Unknown Tag", -1, TagInfo.LENGTH_UNKNOWN,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final List<TagInfo> ALL_TIFF_TAGS =
            Collections.unmodifiableList(Arrays.asList(
                    TIFF_TAG_NEW_SUBFILE_TYPE, TIFF_TAG_SUBFILE_TYPE,
                    TIFF_TAG_IMAGE_WIDTH, TIFF_TAG_IMAGE_LENGTH,
                    TIFF_TAG_BITS_PER_SAMPLE, TIFF_TAG_COMPRESSION,
                    TIFF_TAG_PHOTOMETRIC_INTERPRETATION, TIFF_TAG_THRESHHOLDING,
                    TIFF_TAG_CELL_WIDTH, TIFF_TAG_CELL_LENGTH, TIFF_TAG_FILL_ORDER,
                    TIFF_TAG_DOCUMENT_NAME, TIFF_TAG_IMAGE_DESCRIPTION, TIFF_TAG_MAKE,
                    TIFF_TAG_MODEL, TIFF_TAG_STRIP_OFFSETS, TIFF_TAG_ORIENTATION,
                    TIFF_TAG_SAMPLES_PER_PIXEL, TIFF_TAG_ROWS_PER_STRIP,
                    TIFF_TAG_STRIP_BYTE_COUNTS, TIFF_TAG_MIN_SAMPLE_VALUE,
                    TIFF_TAG_MAX_SAMPLE_VALUE, TIFF_TAG_XRESOLUTION,
                    TIFF_TAG_YRESOLUTION, TIFF_TAG_PLANAR_CONFIGURATION,
                    TIFF_TAG_PAGE_NAME, TIFF_TAG_XPOSITION, TIFF_TAG_YPOSITION,
                    TIFF_TAG_FREE_OFFSETS, TIFF_TAG_FREE_BYTE_COUNTS,
                    TIFF_TAG_GRAY_RESPONSE_UNIT, TIFF_TAG_GRAY_RESPONSE_CURVE,
                    TIFF_TAG_T4_OPTIONS, TIFF_TAG_T6_OPTIONS, TIFF_TAG_RESOLUTION_UNIT,
                    TIFF_TAG_PAGE_NUMBER, TIFF_TAG_TRANSFER_FUNCTION,
                    TIFF_TAG_SOFTWARE, TIFF_TAG_DATE_TIME, TIFF_TAG_ARTIST,
                    TIFF_TAG_HOST_COMPUTER, TIFF_TAG_PREDICTOR, TIFF_TAG_WHITE_POINT,
                    TIFF_TAG_PRIMARY_CHROMATICITIES, TIFF_TAG_COLOR_MAP,
                    TIFF_TAG_HALFTONE_HINTS, TIFF_TAG_TILE_WIDTH, TIFF_TAG_TILE_LENGTH,
                    TIFF_TAG_TILE_OFFSETS, TIFF_TAG_TILE_BYTE_COUNTS, TIFF_TAG_INK_SET,
                    TIFF_TAG_INK_NAMES, TIFF_TAG_NUMBER_OF_INKS, TIFF_TAG_DOT_RANGE,
                    TIFF_TAG_TARGET_PRINTER, TIFF_TAG_EXTRA_SAMPLES,
                    TIFF_TAG_SAMPLE_FORMAT, TIFF_TAG_SMIN_SAMPLE_VALUE,
                    TIFF_TAG_SMAX_SAMPLE_VALUE, TIFF_TAG_TRANSFER_RANGE,
                    TIFF_TAG_JPEG_PROC, TIFF_TAG_JPEG_INTERCHANGE_FORMAT,
                    TIFF_TAG_JPEG_INTERCHANGE_FORMAT_LENGTH,
                    TIFF_TAG_JPEG_RESTART_INTERVAL, TIFF_TAG_JPEG_LOSSLESS_PREDICTORS,
                    TIFF_TAG_JPEG_POINT_TRANSFORMS, TIFF_TAG_JPEG_QTABLES,
                    TIFF_TAG_JPEG_DCTABLES, TIFF_TAG_JPEG_ACTABLES,
                    TIFF_TAG_YCBCR_COEFFICIENTS, TIFF_TAG_YCBCR_SUB_SAMPLING,
                    TIFF_TAG_YCBCR_POSITIONING, TIFF_TAG_REFERENCE_BLACK_WHITE,
                    TIFF_TAG_COPYRIGHT,
                    TIFF_TAG_XMP));
}