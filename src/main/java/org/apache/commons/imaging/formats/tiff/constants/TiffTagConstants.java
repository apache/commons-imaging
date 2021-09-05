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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAny;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknowns;

/**
 * Tags from the <A HREF="https://partners.adobe.com/public/developer/en/tiff/TIFF6.pdf">TIFF6 specification</A>.
 * <P>TIFF is a trademark of Adobe Systems Incorporated or its subsidiaries,
 * and may be registered in some jurisdictions.</P>
 *@see <A HREF="https://partners.adobe.com/public/developer/en/tiff/TIFF6.pdf">TIFF&trade; 6.0 Specification</A>
 */
public final class TiffTagConstants {

    public static final TagInfoLong TIFF_TAG_NEW_SUBFILE_TYPE = new TagInfoLong(
            "NewSubfileType", 0xFE,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);
    public static final int SUBFILE_TYPE_VALUE_FULL_RESOLUTION_IMAGE = 0;
    public static final int SUBFILE_TYPE_VALUE_REDUCED_RESOLUTION_IMAGE = 1;
    public static final int SUBFILE_TYPE_VALUE_SINGLE_PAGE_OF_MULTI_PAGE_IMAGE = 2;
    public static final int SUBFILE_TYPE_VALUE_SINGLE_PAGE_OF_MULTI_PAGE_REDUCED_RESOLUTION_IMAGE = 3;
    public static final int SUBFILE_TYPE_VALUE_TRANSPARENCY_MASK = 4;
    public static final int SUBFILE_TYPE_VALUE_TRANSPARENCY_MASK_OF_REDUCED_RESOLUTION_IMAGE = 5;
    public static final int SUBFILE_TYPE_VALUE_TRANSPARENCY_MASK_OF_MULTI_PAGE_IMAGE = 6;
    public static final int SUBFILE_TYPE_VALUE_TRANSPARENCY_MASK_OF_REDUCED_RESOLUTION_MULTI_PAGE_IMAGE = 7;

    public static final TagInfoShort TIFF_TAG_SUBFILE_TYPE = new TagInfoShort(
            "SubfileType", 0xFF,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);
    public static final short OLD_SUBFILE_TYPE_VALUE_FULL_RESOLUTION_IMAGE = 1;
    public static final short OLD_SUBFILE_TYPE_VALUE_REDUCED_RESOLUTION_IMAGE = 2;
    public static final short OLD_SUBFILE_TYPE_VALUE_SINGLE_PAGE_OF_MULTI_PAGE_IMAGE = 3;

    public static final TagInfoShortOrLong TIFF_TAG_IMAGE_WIDTH = new TagInfoShortOrLong(
            "ImageWidth", 0x100, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShortOrLong TIFF_TAG_IMAGE_LENGTH = new TagInfoShortOrLong(
            "ImageLength", 0x101, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShorts TIFF_TAG_BITS_PER_SAMPLE = new TagInfoShorts(
            "BitsPerSample", 0x102, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);
    public static final short BITS_PER_SAMPLE_DEFAULT_VALUE = 1;

    public static final TagInfoShort TIFF_TAG_COMPRESSION = new TagInfoShort(
            "Compression", 0x103,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);
    public static final short COMPRESSION_VALUE_UNCOMPRESSED = 1;
    public static final short COMPRESSION_VALUE_CCITT_1D = 2;
    public static final short COMPRESSION_VALUE_T4_GROUP_3_FAX = 3;
    public static final short COMPRESSION_VALUE_T6_GROUP_4_FAX = 4;
    public static final short COMPRESSION_VALUE_LZW = 5;
    public static final short COMPRESSION_VALUE_JPEG_OLD_STYLE = 6;
    public static final short COMPRESSION_VALUE_JPEG = 7;
    public static final short COMPRESSION_VALUE_ADOBE_DEFLATE = 8;
    public static final short COMPRESSION_VALUE_JBIG_B_AND_W = 9;
    public static final short COMPRESSION_VALUE_JBIG_COLOR = 10;
    public static final short COMPRESSION_VALUE_NEXT = 32766;
    public static final short COMPRESSION_VALUE_EPSON_ERF_COMPRESSED =(short)32769;
    public static final short COMPRESSION_VALUE_CCIRLEW = (short)32771;
    public static final short COMPRESSION_VALUE_PACK_BITS = (short)32773;
    public static final short COMPRESSION_VALUE_THUNDERSCAN = (short)32809;
    public static final short COMPRESSION_VALUE_IT8CTPAD = (short)32895;
    public static final short COMPRESSION_VALUE_IT8LW = (short)32896;
    public static final short COMPRESSION_VALUE_IT8MP = (short)32897;
    public static final short COMPRESSION_VALUE_IT8BL = (short)32898;
    public static final short COMPRESSION_VALUE_PIXAR_FILM = (short)32908;
    public static final short COMPRESSION_VALUE_PIXAR_LOG = (short)32909;
    public static final short COMPRESSION_VALUE_DEFLATE = (short)32946;
    public static final short COMPRESSION_VALUE_DCS = (short)32947;
    public static final short COMPRESSION_VALUE_JBIG = (short)34661;
    public static final short COMPRESSION_VALUE_SGILOG = (short)34676;
    public static final short COMPRESSION_VALUE_SGILOG_24 = (short)34677;
    public static final short COMPRESSION_VALUE_JPEG_2000 = (short)34712;
    public static final short COMPRESSION_VALUE_NIKON_NEF_COMPRESSED = (short)34713;
    public static final short COMPRESSION_VALUE_KODAK_DCR_COMPRESSED = (short)65000;
    public static final short COMPRESSION_VALUE_PENTAX_PEF_COMPRESSED = (short)65535;

    public static final TagInfoShort TIFF_TAG_PHOTOMETRIC_INTERPRETATION = new TagInfoShort(
            "PhotometricInterpretation", 0x106,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);
    public static final short PHOTOMETRIC_INTERPRETATION_VALUE_WHITE_IS_ZERO = 0;
    public static final short PHOTOMETRIC_INTERPRETATION_VALUE_BLACK_IS_ZERO = 1;
    public static final short PHOTOMETRIC_INTERPRETATION_VALUE_RGB = 2;
    public static final short PHOTOMETRIC_INTERPRETATION_VALUE_RGB_PALETTE = 3;
    public static final short PHOTOMETRIC_INTERPRETATION_VALUE_TRANSPARENCY_MASK = 4;
    public static final short PHOTOMETRIC_INTERPRETATION_VALUE_CMYK = 5;
    public static final short PHOTOMETRIC_INTERPRETATION_VALUE_YCB_CR = 6;
    public static final short PHOTOMETRIC_INTERPRETATION_VALUE_CIELAB = 8;
    public static final short PHOTOMETRIC_INTERPRETATION_VALUE_ICCLAB = 9;
    public static final short PHOTOMETRIC_INTERPRETATION_VALUE_ITULAB = 10;
    public static final short PHOTOMETRIC_INTERPRETATION_VALUE_COLOR_FILTER_ARRAY = (short)32803;
    public static final short PHOTOMETRIC_INTERPRETATION_VALUE_PIXAR_LOG_L = (short)32844;
    public static final short PHOTOMETRIC_INTERPRETATION_VALUE_PIXAR_LOG_LUV = (short)32845;
    public static final short PHOTOMETRIC_INTERPRETATION_VALUE_LINEAR_RAW = (short)34892;

    public static final TagInfoShort TIFF_TAG_THRESHHOLDING = new TagInfoShort(
            "Threshholding", 0x107,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);
    public static final short THRESHOLDING_VALUE_NO_DITHERING_OR_HALFTONING = 1;
    public static final short THRESHOLDING_VALUE_ORDERED_DITHER_OR_HALFTONE = 2;
    public static final short THRESHOLDING_VALUE_RANDOMIZED_DITHER = 3;
    public static final short THRESHOLDING_DEFAULT_VALUE =
        THRESHOLDING_VALUE_NO_DITHERING_OR_HALFTONING;

    public static final TagInfoShort TIFF_TAG_CELL_WIDTH = new TagInfoShort(
            "CellWidth", 0x108,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_CELL_LENGTH = new TagInfoShort(
            "CellLength", 0x109,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_FILL_ORDER = new TagInfoShort(
            "FillOrder", 0x10A,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);
    public static final short FILL_ORDER_VALUE_NORMAL = 1;
    public static final short FILL_ORDER_VALUE_REVERSED = 2;
    public static final short FILL_ORDER_DEFAULT_VALUE =
        FILL_ORDER_VALUE_NORMAL;

    public static final TagInfoAscii TIFF_TAG_DOCUMENT_NAME = new TagInfoAscii(
            "DocumentName", 0x10D, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoAscii TIFF_TAG_IMAGE_DESCRIPTION = new TagInfoAscii(
            "ImageDescription", 0x10E, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoAscii TIFF_TAG_MAKE = new TagInfoAscii(
            "Make", 0x10F, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoAscii TIFF_TAG_MODEL = new TagInfoAscii(
            "Model", 0x110, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShortOrLong TIFF_TAG_STRIP_OFFSETS = new TagInfoShortOrLong(
            "StripOffsets", 0x111, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT, true);

    public static final TagInfoShort TIFF_TAG_ORIENTATION = new TagInfoShort(
            "Orientation", 0x112,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);
    public static final short ORIENTATION_VALUE_HORIZONTAL_NORMAL = 1;
    public static final short ORIENTATION_VALUE_MIRROR_HORIZONTAL = 2;
    public static final short ORIENTATION_VALUE_ROTATE_180 = 3;
    public static final short ORIENTATION_VALUE_MIRROR_VERTICAL = 4;
    public static final short ORIENTATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_270_CW = 5;
    public static final short ORIENTATION_VALUE_ROTATE_90_CW = 6;
    public static final short ORIENTATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_90_CW = 7;
    public static final short ORIENTATION_VALUE_ROTATE_270_CW = 8;
    public static final short ORIENTATION_DEFAULT_VALUE =
        ORIENTATION_VALUE_HORIZONTAL_NORMAL;

    public static final TagInfoShort TIFF_TAG_SAMPLES_PER_PIXEL = new TagInfoShort(
            "SamplesPerPixel", 0x115,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);
    public static final short SAMPLES_PER_PIXEL_DEFAULT_VALUE = 1;

    public static final TagInfoShortOrLong TIFF_TAG_ROWS_PER_STRIP = new TagInfoShortOrLong(
            "RowsPerStrip", 0x116, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShortOrLong TIFF_TAG_STRIP_BYTE_COUNTS = new TagInfoShortOrLong(
            "StripByteCounts", 0x117, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShorts TIFF_TAG_MIN_SAMPLE_VALUE = new TagInfoShorts(
            "MinSampleValue", 0x118, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShorts TIFF_TAG_MAX_SAMPLE_VALUE = new TagInfoShorts(
            "MaxSampleValue", 0x119, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoRational TIFF_TAG_XRESOLUTION = new TagInfoRational(
            "XResolution", 0x11A,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoRational TIFF_TAG_YRESOLUTION = new TagInfoRational(
            "YResolution", 0x11B,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_PLANAR_CONFIGURATION = new TagInfoShort(
            "PlanarConfiguration", 0x11C,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);
    public static final short PLANAR_CONFIGURATION_VALUE_CHUNKY = 1;
    public static final short PLANAR_CONFIGURATION_VALUE_PLANAR = 2;
    public static final short PLANAR_CONFIGURATION_DEFAULT_VALUE =
        PLANAR_CONFIGURATION_VALUE_CHUNKY;

    public static final TagInfoAscii TIFF_TAG_PAGE_NAME = new TagInfoAscii(
            "PageName", 0x11D, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoRationals TIFF_TAG_XPOSITION = new TagInfoRationals(
            "XPosition", 0x11E, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoRationals TIFF_TAG_YPOSITION = new TagInfoRationals(
            "YPosition",  0x11F, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoLongs TIFF_TAG_FREE_OFFSETS = new TagInfoLongs(
            "FreeOffsets", 0x120, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoLongs TIFF_TAG_FREE_BYTE_COUNTS = new TagInfoLongs(
            "FreeByteCounts", 0x121, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_GRAY_RESPONSE_UNIT = new TagInfoShort(
            "GrayResponseUnit", 0x122,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);
    public static final short GRAY_RESPONSE_UNIT_VALUE_0_1 = 1;
    public static final short GRAY_RESPONSE_UNIT_VALUE_0_01 = 2;
    public static final short GRAY_RESPONSE_UNIT_VALUE_0_001 = 3;
    public static final short GRAY_RESPONSE_UNIT_VALUE_0_0001 = 4;
    public static final short GRAY_RESPONSE_UNIT_VALUE_0_00001 = 5;
    public static final short GRAY_RESPONSE_UNIT_DEFAULT_VALUE =
        GRAY_RESPONSE_UNIT_VALUE_0_01;
    public static final short GRAY_RESPONSE_UNIT_RECOMMENDED_VALUE =
        GRAY_RESPONSE_UNIT_VALUE_0_001;

    public static final TagInfoShorts TIFF_TAG_GRAY_RESPONSE_CURVE = new TagInfoShorts(
            "GrayResponseCurve", 0x123, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoLong TIFF_TAG_T4_OPTIONS = new TagInfoLong(
            "T4Options", 0x124,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoLong TIFF_TAG_T6_OPTIONS = new TagInfoLong(
            "T6Options", 0x125,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_RESOLUTION_UNIT = new TagInfoShort(
            "ResolutionUnit", 0x128,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);
    public static final short RESOLUTION_UNIT_VALUE_NONE = 1;
    /**
     * @deprecated This constant does not comply with the Java language constant naming
     * convention nor the TIFF specification.
     * Use {@link #RESOLUTION_UNIT_VALUE_INCH} instead.
     * @see #RESOLUTION_UNIT_VALUE_INCH
     */
    @Deprecated
    public static final int RESOLUTION_UNIT_VALUE_INCHES = 2;
    public static final short RESOLUTION_UNIT_VALUE_INCH = 2;
    public static final short RESOLUTION_UNIT_VALUE_CM = 3;
    public static final short RESOLUTION_UNIT_DEFAULT_VALUE =
        RESOLUTION_UNIT_VALUE_INCH;

    public static final TagInfoShorts TIFF_TAG_PAGE_NUMBER = new TagInfoShorts(
            "PageNumber", 0x129, 2,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShorts TIFF_TAG_TRANSFER_FUNCTION = new TagInfoShorts(
            "TransferFunction", 0x12D, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoAscii TIFF_TAG_SOFTWARE = new TagInfoAscii(
            "Software", 0x131, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoAscii TIFF_TAG_DATE_TIME = new TagInfoAscii(
            "DateTime", 0x132, 20,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoAscii TIFF_TAG_ARTIST = new TagInfoAscii(
            "Artist", 0x13B, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoAscii TIFF_TAG_HOST_COMPUTER = new TagInfoAscii(
            "HostComputer", 0x13C, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_PREDICTOR = new TagInfoShort(
            "Predictor", 0x13D,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);
    public static final short PREDICTOR_VALUE_NONE = 1;
    public static final short PREDICTOR_VALUE_HORIZONTAL_DIFFERENCING = 2;
    public static final short PREDICTOR_VALUE_FLOATING_POINT_DIFFERENCING = 3;
    public static final short PREDICTOR_DEFAULT_VALUE =
            PREDICTOR_VALUE_NONE;

    public static final TagInfoRationals TIFF_TAG_WHITE_POINT = new TagInfoRationals(
            "WhitePoint", 0x13E, 2,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoRationals TIFF_TAG_PRIMARY_CHROMATICITIES = new TagInfoRationals(
            "PrimaryChromaticities", 0x13F, 6,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShorts TIFF_TAG_COLOR_MAP = new TagInfoShorts(
            "ColorMap", 0x140, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShorts TIFF_TAG_HALFTONE_HINTS = new TagInfoShorts(
            "HalftoneHints", 0x141, 2,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShortOrLong TIFF_TAG_TILE_WIDTH = new TagInfoShortOrLong(
            "TileWidth", 0x142, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShortOrLong TIFF_TAG_TILE_LENGTH = new TagInfoShortOrLong(
            "TileLength", 0x143, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoLongs TIFF_TAG_TILE_OFFSETS = new TagInfoLongs(
            "TileOffsets", 0x144, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT, true);

    public static final TagInfoShortOrLong TIFF_TAG_TILE_BYTE_COUNTS = new TagInfoShortOrLong(
            "TileByteCounts", 0x145, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_INK_SET = new TagInfoShort(
            "InkSet", 0x14C,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);
    public static final short INK_SET_VALUE_CMYK = 1;
    public static final short INK_SET_VALUE_NOT_CMYK = 2;
    public static final short INK_SET_DEFAULT_VALUE =
        INK_SET_VALUE_CMYK;

    public static final TagInfoAscii TIFF_TAG_INK_NAMES = new TagInfoAscii(
            "InkNames", 0x14D, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_NUMBER_OF_INKS = new TagInfoShort(
            "NumberOfInks", 0x14E,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoByteOrShort TIFF_TAG_DOT_RANGE = new TagInfoByteOrShort(
            "DotRange", 0x150, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoAscii TIFF_TAG_TARGET_PRINTER = new TagInfoAscii(
            "TargetPrinter", 0x151, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShorts TIFF_TAG_EXTRA_SAMPLES = new TagInfoShorts(
            "ExtraSamples", 0x152, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);
    public static final short EXTRA_SAMPLE_VALUE_UNSPECIFIED = 0;
    public static final short EXTRA_SAMPLE_ASSOCIATED_ALPHA = 1;
    public static final short EXTRA_SAMPLE_UNASSOCIATED_ALPHA = 2;

    public static final TagInfoShorts TIFF_TAG_SAMPLE_FORMAT = new TagInfoShorts(
            "SampleFormat", 0x153, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);
    public static final short SAMPLE_FORMAT_VALUE_UNSIGNED_INTEGER = 1;
    public static final short SAMPLE_FORMAT_VALUE_TWOS_COMPLEMENT_SIGNED_INTEGER = 2;
    public static final short SAMPLE_FORMAT_VALUE_IEEE_FLOATING_POINT = 3;
    public static final short SAMPLE_FORMAT_VALUE_UNDEFINED = 4;
    public static final short SAMPLE_FORMAT_VALUE_COMPLEX_INTEGER = 5;
    public static final short SAMPLE_FORMAT_VALUE_IEEE_FLOATING_POINT_1 = 6;
    public static final short SAMPLE_FORMAT_DEFAULT_VALUE =
        SAMPLE_FORMAT_VALUE_UNSIGNED_INTEGER;

    public static final TagInfoAny TIFF_TAG_SMIN_SAMPLE_VALUE = new TagInfoAny(
            "SMinSampleValue", 0x154, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoAny TIFF_TAG_SMAX_SAMPLE_VALUE = new TagInfoAny(
            "SMaxSampleValue", 0x155, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShorts TIFF_TAG_TRANSFER_RANGE = new TagInfoShorts(
            "TransferRange", 0x156, 6,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_JPEG_PROC = new TagInfoShort(
            "JPEGProc", 0x200,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);
    public static final short JPEGPROC_VALUE_BASELINE = 1;
    public static final short JPEGPROC_VALUE_LOSSLESS = 14;

    public static final TagInfoLong TIFF_TAG_JPEG_INTERCHANGE_FORMAT = new TagInfoLong(
            "JPEGInterchangeFormat", 0x201,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT, true);

    public static final TagInfoLong TIFF_TAG_JPEG_INTERCHANGE_FORMAT_LENGTH = new TagInfoLong(
            "JPEGInterchangeFormatLength", 0x202,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_JPEG_RESTART_INTERVAL = new TagInfoShort(
            "JPEGRestartInterval", 0x203,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShorts TIFF_TAG_JPEG_LOSSLESS_PREDICTORS = new TagInfoShorts(
            "JPEGLosslessPredictors", 0x205, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShorts TIFF_TAG_JPEG_POINT_TRANSFORMS = new TagInfoShorts(
            "JPEGPointTransforms", 0x206, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoLongs TIFF_TAG_JPEG_QTABLES = new TagInfoLongs(
            "JPEGQTables", 0x207, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoLongs TIFF_TAG_JPEG_DCTABLES = new TagInfoLongs(
            "JPEGDCTables", 0x208, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoLongs TIFF_TAG_JPEG_ACTABLES = new TagInfoLongs(
            "JPEGACTables", 0x209, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoRationals TIFF_TAG_YCBCR_COEFFICIENTS = new TagInfoRationals(
            "YCbCrCoefficients", 0x211, 3,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShorts TIFF_TAG_YCBCR_SUB_SAMPLING = new TagInfoShorts(
            "YCbCrSubSampling", 0x212, 2,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoShort TIFF_TAG_YCBCR_POSITIONING = new TagInfoShort(
            "YCbCrPositioning", 0x213,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);
    public static final short YCB_CR_POSITIONING_VALUE_CENTERED = 1;
    public static final short YCB_CR_POSITIONING_VALUE_CO_SITED = 2;
    public static final short YCB_CR_POSITIONING_DEFAULT_VALUE =
        YCB_CR_POSITIONING_VALUE_CENTERED;

    public static final TagInfoLongs TIFF_TAG_REFERENCE_BLACK_WHITE = new TagInfoLongs(
            "ReferenceBlackWhite", 0x214, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoAscii TIFF_TAG_COPYRIGHT = new TagInfoAscii(
            "Copyright", 0x8298, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final TagInfoBytes TIFF_TAG_XMP = new TagInfoBytes(
            "XMP", 0x2BC, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    // TODO:
    //    public static final TagInfo2 TIFF_TAG_UNKNOWN = null;
    public static final TagInfoUnknowns TIFF_TAG_UNKNOWN = new TagInfoUnknowns(
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

    private TiffTagConstants() {
    }
}
