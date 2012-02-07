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

public enum TiffTagConstants implements TiffFieldTypeConstants, TagHolder
{

    NEW_SUBFILE_TYPE(new TagInfo(
            "New Subfile Type", 0xFE, FIELD_TYPE_DESCRIPTION_LONG, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    SUBFILE_TYPE(new TagInfo(
            "Subfile Type", 0xFF, FIELD_TYPE_DESCRIPTION_SHORT, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    IMAGE_WIDTH(new TagInfo(
            "Image Width", 0x100, FIELD_TYPE_DESCRIPTION_SHORT_OR_LONG, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    IMAGE_LENGTH(new TagInfo(
            "Image Length", 0x101, FIELD_TYPE_DESCRIPTION_SHORT_OR_LONG, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    BITS_PER_SAMPLE(new TagInfo(
            "Bits Per Sample", 0x102, FIELD_TYPE_DESCRIPTION_SHORT, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    COMPRESSION(new TagInfo(
            "Compression", 0x103, FIELD_TYPE_DESCRIPTION_SHORT, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    PHOTOMETRIC_INTERPRETATION(new TagInfo(
            "Photometric Interpretation", 0x106, FIELD_TYPE_DESCRIPTION_SHORT,
            1, TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    THRESHHOLDING(new TagInfo(
            "Threshholding", 0x107, FIELD_TYPE_DESCRIPTION_SHORT, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    CELL_WIDTH(new TagInfo("Cell Width",
            0x108, FIELD_TYPE_DESCRIPTION_SHORT, 1, TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    CELL_LENGTH(new TagInfo(
            "Cell Length", 0x109, FIELD_TYPE_DESCRIPTION_SHORT, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    FILL_ORDER(new TagInfo("Fill Order",
            0x10A, FIELD_TYPE_DESCRIPTION_SHORT, 1, TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    DOCUMENT_NAME(new TagInfo(
            "Document Name", 0x10D, FIELD_TYPE_DESCRIPTION_ASCII, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    IMAGE_DESCRIPTION(new TagInfo(
            "Image Description", 0x10E, FIELD_TYPE_DESCRIPTION_ASCII, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    MAKE(new TagInfo("Make", 0x10F,
            FIELD_TYPE_DESCRIPTION_ASCII, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    MODEL(new TagInfo("Model", 0x110,
            FIELD_TYPE_DESCRIPTION_ASCII, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    STRIP_OFFSETS(new TagInfo.Offset(
            "Strip Offsets", 0x111, FIELD_TYPE_DESCRIPTION_SHORT_OR_LONG, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    ORIENTATION(new TagInfo(
            "Orientation", 0x112, FIELD_TYPE_DESCRIPTION_SHORT, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    SAMPLES_PER_PIXEL(new TagInfo(
            "Samples Per Pixel", 0x115, FIELD_TYPE_DESCRIPTION_SHORT, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    ROWS_PER_STRIP(new TagInfo(
            "Rows Per Strip", 0x116, FIELD_TYPE_DESCRIPTION_SHORT_OR_LONG, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    STRIP_BYTE_COUNTS(new TagInfo(
            "Strip Byte Counts", 0x117, FIELD_TYPE_DESCRIPTION_LONG_OR_SHORT,
            -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    MIN_SAMPLE_VALUE(new TagInfo(
            "Min Sample Value", 0x118, FIELD_TYPE_DESCRIPTION_SHORT, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    MAX_SAMPLE_VALUE(new TagInfo(
            "Max Sample Value", 0x119, FIELD_TYPE_DESCRIPTION_SHORT, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    XRESOLUTION(new TagInfo(
            "XResolution", 0x11A, FIELD_TYPE_DESCRIPTION_RATIONAL, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    YRESOLUTION(new TagInfo(
            "YResolution", 0x11B, FIELD_TYPE_DESCRIPTION_RATIONAL, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    PLANAR_CONFIGURATION(new TagInfo(
            "Planar Configuration", 0x11C, FIELD_TYPE_DESCRIPTION_SHORT, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    PAGE_NAME(new TagInfo("Page Name",
            0x11D, FIELD_TYPE_DESCRIPTION_ASCII, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    XPOSITION(new TagInfo("XPosition",
            0x11E, FIELD_TYPE_DESCRIPTION_RATIONAL, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    YPOSITION(new TagInfo("YPosition",
            0x11F, FIELD_TYPE_DESCRIPTION_RATIONAL, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    FREE_OFFSETS(new TagInfo(
            "Free Offsets", 0x120, FIELD_TYPE_DESCRIPTION_LONG, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    FREE_BYTE_COUNTS(new TagInfo(
            "Free Byte Counts", 0x121, FIELD_TYPE_DESCRIPTION_LONG, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    GRAY_RESPONSE_UNIT(new TagInfo(
            "Gray Response Unit", 0x122, FIELD_TYPE_DESCRIPTION_SHORT, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    GRAY_RESPONSE_CURVE(new TagInfo(
            "Gray Response Curve", 0x123, FIELD_TYPE_DESCRIPTION_SHORT, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    T4_OPTIONS(new TagInfo("T4 Options",
            0x124, FIELD_TYPE_DESCRIPTION_LONG, 1, TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    T6_OPTIONS(new TagInfo("T6 Options",
            0x125, FIELD_TYPE_DESCRIPTION_LONG, 1, TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    RESOLUTION_UNIT(new TagInfo(
            "Resolution Unit", 0x128, FIELD_TYPE_DESCRIPTION_SHORT, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    PAGE_NUMBER(new TagInfo(
            "Page Number", 0x129, FIELD_TYPE_DESCRIPTION_SHORT, 2,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    TRANSFER_FUNCTION(new TagInfo(
            "Transfer Function", 0x12D, FIELD_TYPE_DESCRIPTION_SHORT, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    SOFTWARE(new TagInfo("Software",
            0x131, FIELD_TYPE_DESCRIPTION_ASCII, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    DATE_TIME(new TagInfo("Date Time",
            0x132, FIELD_TYPE_DESCRIPTION_ASCII, 20, TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    ARTIST(new TagInfo("Artist", 0x13B,
            FIELD_TYPE_DESCRIPTION_ASCII, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    HOST_COMPUTER(new TagInfo(
            "Host Computer", 0x13C, FIELD_TYPE_DESCRIPTION_ASCII, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    PREDICTOR(new TagInfo("Predictor",
            0x13D, FIELD_TYPE_DESCRIPTION_SHORT, 1, TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    WHITE_POINT(new TagInfo(
            "White Point", 0x13E, FIELD_TYPE_DESCRIPTION_RATIONAL, 2,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    PRIMARY_CHROMATICITIES(new TagInfo(
            "Primary Chromaticities", 0x13F, FIELD_TYPE_DESCRIPTION_RATIONAL,
            6, TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    COLOR_MAP(new TagInfo("Color Map",
            0x140, FIELD_TYPE_DESCRIPTION_SHORT, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    HALFTONE_HINTS(new TagInfo(
            "Halftone Hints", 0x141, FIELD_TYPE_DESCRIPTION_SHORT, 2,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    TILE_WIDTH(new TagInfo("Tile Width",
            0x142, FIELD_TYPE_DESCRIPTION_SHORT_OR_LONG, 1, TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    TILE_LENGTH(new TagInfo(
            "Tile Length", 0x143, FIELD_TYPE_DESCRIPTION_SHORT_OR_LONG, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    TILE_OFFSETS(new TagInfo.Offset(
            "Tile Offsets", 0x144, FIELD_TYPE_DESCRIPTION_LONG, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    TILE_BYTE_COUNTS(new TagInfo(
            "Tile Byte Counts", 0x145, FIELD_TYPE_DESCRIPTION_SHORT_OR_LONG,
            -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    INK_SET(new TagInfo("Ink Set",
            0x14C, FIELD_TYPE_DESCRIPTION_SHORT, 1, TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    INK_NAMES(new TagInfo("Ink Names",
            0x14D, FIELD_TYPE_DESCRIPTION_ASCII, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    NUMBER_OF_INKS(new TagInfo(
            "Number Of Inks", 0x14E, FIELD_TYPE_DESCRIPTION_SHORT, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    DOT_RANGE(new TagInfo("Dot Range",
            0x150, FIELD_TYPE_DESCRIPTION_BYTE_OR_SHORT, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    TARGET_PRINTER(new TagInfo(
            "Target Printer", 0x151, FIELD_TYPE_DESCRIPTION_ASCII, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    EXTRA_SAMPLES(new TagInfo(
            "Extra Samples", 0x152, FIELD_TYPE_DESCRIPTION_BYTE, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    SAMPLE_FORMAT(new TagInfo(
            "Sample Format", 0x153, FIELD_TYPE_DESCRIPTION_SHORT, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    SMIN_SAMPLE_VALUE(new TagInfo(
            "SMin Sample Value", 0x154, FIELD_TYPE_DESCRIPTION_ANY, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    SMAX_SAMPLE_VALUE(new TagInfo(
            "SMax Sample Value", 0x155, FIELD_TYPE_DESCRIPTION_ANY, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    TRANSFER_RANGE(new TagInfo(
            "Transfer Range", 0x156, FIELD_TYPE_DESCRIPTION_SHORT, 6,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    JPEG_PROC(new TagInfo("JPEGProc",
            0x200, FIELD_TYPE_DESCRIPTION_SHORT, 1, TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    JPEG_INTERCHANGE_FORMAT(new TagInfo.Offset(
            "JPEGInterchange Format", 0x201, FIELD_TYPE_DESCRIPTION_LONG, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    JPEG_INTERCHANGE_FORMAT_LENGTH(new TagInfo(
            "JPEGInterchange Format Length", 0x202,
            FIELD_TYPE_DESCRIPTION_LONG, 1, TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    JPEG_RESTART_INTERVAL(new TagInfo(
            "JPEGRestart Interval", 0x203, FIELD_TYPE_DESCRIPTION_SHORT, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    JPEG_LOSSLESS_PREDICTORS(new TagInfo(
            "JPEGLossless Predictors", 0x205, FIELD_TYPE_DESCRIPTION_SHORT, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    JPEG_POINT_TRANSFORMS(new TagInfo(
            "JPEGPoint Transforms", 0x206, FIELD_TYPE_DESCRIPTION_SHORT, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    JPEG_QTABLES(new TagInfo(
            "JPEGQTables", 0x207, FIELD_TYPE_DESCRIPTION_LONG, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    JPEG_DCTABLES(new TagInfo(
            "JPEGDCTables", 0x208, FIELD_TYPE_DESCRIPTION_LONG, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    JPEG_ACTABLES(new TagInfo(
            "JPEGACTables", 0x209, FIELD_TYPE_DESCRIPTION_LONG, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    YCBCR_COEFFICIENTS(new TagInfo(
            "YCbCr Coefficients", 0x211, FIELD_TYPE_DESCRIPTION_RATIONAL, 3,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    YCBCR_SUB_SAMPLING(new TagInfo(
            "YCbCr Sub Sampling", 0x212, FIELD_TYPE_DESCRIPTION_SHORT, 2,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    YCBCR_POSITIONING(new TagInfo(
            "YCbCr Positioning", 0x213, FIELD_TYPE_DESCRIPTION_SHORT, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    REFERENCE_BLACK_WHITE(new TagInfo(
            "Reference Black White", 0x214, FIELD_TYPE_DESCRIPTION_LONG, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    COPYRIGHT(new TagInfo("Copyright",
            0x8298, FIELD_TYPE_DESCRIPTION_ASCII, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    XMP(new TagInfo("XMP",
            0x2BC, FIELD_TYPE_DESCRIPTION_BYTE, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT)),

    // TODO:
    //    public static final TagInfo2 UNKNOWN(null;
    UNKNOWN(new TagInfo.Unknown(
            "Unknown Tag", -1, FIELD_TYPE_DESCRIPTION_UNKNOWN,
            TagInfo.LENGTH_UNKNOWN, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN));
    
    public final TagInfo tagInfo;
    
    TiffTagConstants(TagInfo tagInfo) {
        this.tagInfo = tagInfo;
    }
    
    public TagInfo getTagInfo() {
        return tagInfo;
    }
    
    public static final List<TagInfo> ALL_TIFF_TAGS = Collections.unmodifiableList(
            TagConstantsUtils.mergeTagLists(values()));
}