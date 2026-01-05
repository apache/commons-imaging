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
 * Tags from the TIFF6 specification.
 * <p>
 * [BROKEN URL] http://partners.adobe.com/public/developer/en/tiff/TIFF6.pdf
 * </p>
 */
public final class TiffTagConstants {

    /** TIFF tag: New Subfile Type. */
    public static final TagInfoLong TIFF_TAG_NEW_SUBFILE_TYPE = new TagInfoLong("NewSubfileType", 0xFE, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** Subfile type: Full resolution image. */
    public static final int SUBFILE_TYPE_VALUE_FULL_RESOLUTION_IMAGE = 0;

    /** Subfile type: Reduced resolution image. */
    public static final int SUBFILE_TYPE_VALUE_REDUCED_RESOLUTION_IMAGE = 1;

    /** Subfile type: Single page of multi-page image. */
    public static final int SUBFILE_TYPE_VALUE_SINGLE_PAGE_OF_MULTI_PAGE_IMAGE = 2;

    /** Subfile type: Single page of multi-page reduced resolution image. */
    public static final int SUBFILE_TYPE_VALUE_SINGLE_PAGE_OF_MULTI_PAGE_REDUCED_RESOLUTION_IMAGE = 3;

    /** Subfile type: Transparency mask. */
    public static final int SUBFILE_TYPE_VALUE_TRANSPARENCY_MASK = 4;

    /** Subfile type: Transparency mask of reduced resolution image. */
    public static final int SUBFILE_TYPE_VALUE_TRANSPARENCY_MASK_OF_REDUCED_RESOLUTION_IMAGE = 5;

    /** Subfile type: Transparency mask of multi-page image. */
    public static final int SUBFILE_TYPE_VALUE_TRANSPARENCY_MASK_OF_MULTI_PAGE_IMAGE = 6;

    /** Subfile type: Transparency mask of reduced resolution multi-page image. */
    public static final int SUBFILE_TYPE_VALUE_TRANSPARENCY_MASK_OF_REDUCED_RESOLUTION_MULTI_PAGE_IMAGE = 7;

    /** TIFF tag: Subfile Type (deprecated). */
    public static final TagInfoShort TIFF_TAG_SUBFILE_TYPE = new TagInfoShort("SubfileType", 0xFF, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** Old subfile type: Full resolution image. */
    public static final int OLD_SUBFILE_TYPE_VALUE_FULL_RESOLUTION_IMAGE = 1;

    /** Old subfile type: Reduced resolution image. */
    public static final int OLD_SUBFILE_TYPE_VALUE_REDUCED_RESOLUTION_IMAGE = 2;

    /** Old subfile type: Single page of multi-page image. */
    public static final int OLD_SUBFILE_TYPE_VALUE_SINGLE_PAGE_OF_MULTI_PAGE_IMAGE = 3;

    /** TIFF tag: Image Width. */
    public static final TagInfoShortOrLong TIFF_TAG_IMAGE_WIDTH = new TagInfoShortOrLong("ImageWidth", 0x100, 1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Image Length. */
    public static final TagInfoShortOrLong TIFF_TAG_IMAGE_LENGTH = new TagInfoShortOrLong("ImageLength", 0x101, 1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Bits Per Sample. */
    public static final TagInfoShorts TIFF_TAG_BITS_PER_SAMPLE = new TagInfoShorts("BitsPerSample", 0x102, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Compression. */
    public static final TagInfoShort TIFF_TAG_COMPRESSION = new TagInfoShort("Compression", 0x103, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** Compression value: uncompressed. */
    public static final int COMPRESSION_VALUE_UNCOMPRESSED = 1;

    /** Compression value: CCITT 1D. */
    public static final int COMPRESSION_VALUE_CCITT_1D = 2;

    /** Compression value: T4/Group 3 Fax. */
    public static final int COMPRESSION_VALUE_T4_GROUP_3_FAX = 3;

    /** Compression value: T6/Group 4 Fax. */
    public static final int COMPRESSION_VALUE_T6_GROUP_4_FAX = 4;

    /** Compression value: LZW. */
    public static final int COMPRESSION_VALUE_LZW = 5;

    /** Compression value: JPEG (old-style). */
    public static final int COMPRESSION_VALUE_JPEG_OLD_STYLE = 6;

    /** Compression value: JPEG. */
    public static final int COMPRESSION_VALUE_JPEG = 7;

    /** Compression value: Adobe Deflate. */
    public static final int COMPRESSION_VALUE_ADOBE_DEFLATE = 8;

    /** Compression value: JBIG B&amp;W. */
    public static final int COMPRESSION_VALUE_JBIG_B_AND_W = 9;

    /** Compression value: JBIG Color. */
    public static final int COMPRESSION_VALUE_JBIG_COLOR = 10;

    /** Compression value: NeXT. */
    public static final int COMPRESSION_VALUE_NEXT = 32766;

    /** Compression value: Epson ERF Compressed. */
    public static final int COMPRESSION_VALUE_EPSON_ERF_COMPRESSED = 32769;

    /** Compression value: CCIRLEW. */
    public static final int COMPRESSION_VALUE_CCIRLEW = 32771;

    /** Compression value: PackBits. */
    public static final int COMPRESSION_VALUE_PACK_BITS = 32773;

    /** Compression value: Thunderscan. */
    public static final int COMPRESSION_VALUE_THUNDERSCAN = 32809;

    /** Compression value: IT8CTPAD. */
    public static final int COMPRESSION_VALUE_IT8CTPAD = 32895;

    /** Compression value: IT8LW. */
    public static final int COMPRESSION_VALUE_IT8LW = 32896;

    /** Compression value: IT8MP. */
    public static final int COMPRESSION_VALUE_IT8MP = 32897;

    /** Compression value: IT8BL. */
    public static final int COMPRESSION_VALUE_IT8BL = 32898;

    /** Compression value: Pixar Film. */
    public static final int COMPRESSION_VALUE_PIXAR_FILM = 32908;

    /** Compression value: Pixar Log. */
    public static final int COMPRESSION_VALUE_PIXAR_LOG = 32909;

    /** Compression value: Deflate. */
    public static final int COMPRESSION_VALUE_DEFLATE = 32946;

    /** Compression value: DCS. */
    public static final int COMPRESSION_VALUE_DCS = 32947;

    /** Compression value: JBIG. */
    public static final int COMPRESSION_VALUE_JBIG = 34661;

    /** Compression value: SGILog. */
    public static final int COMPRESSION_VALUE_SGILOG = 34676;

    /** Compression value: SGILog 24. */
    public static final int COMPRESSION_VALUE_SGILOG_24 = 34677;

    /** Compression value: JPEG 2000. */
    public static final int COMPRESSION_VALUE_JPEG_2000 = 34712;

    /** Compression value: Nikon NEF Compressed. */
    public static final int COMPRESSION_VALUE_NIKON_NEF_COMPRESSED = 34713;

    /** Compression value: Kodak DCR Compressed. */
    public static final int COMPRESSION_VALUE_KODAK_DCR_COMPRESSED = 65000;

    /** Compression value: Pentax PEF Compressed. */
    public static final int COMPRESSION_VALUE_PENTAX_PEF_COMPRESSED = 65535;

    /** TIFF tag: Photometric Interpretation. */
    public static final TagInfoShort TIFF_TAG_PHOTOMETRIC_INTERPRETATION = new TagInfoShort("PhotometricInterpretation", 0x106,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** Photometric interpretation value: WhiteIsZero. */
    public static final int PHOTOMETRIC_INTERPRETATION_VALUE_WHITE_IS_ZERO = 0;

    /** Photometric interpretation value: BlackIsZero. */
    public static final int PHOTOMETRIC_INTERPRETATION_VALUE_BLACK_IS_ZERO = 1;

    /** Photometric interpretation value: RGB. */
    public static final int PHOTOMETRIC_INTERPRETATION_VALUE_RGB = 2;

    /** Photometric interpretation value: RGB Palette. */
    public static final int PHOTOMETRIC_INTERPRETATION_VALUE_RGB_PALETTE = 3;

    /** Photometric interpretation value: Transparency Mask. */
    public static final int PHOTOMETRIC_INTERPRETATION_VALUE_TRANSPARENCY_MASK = 4;

    /** Photometric interpretation value: CMYK. */
    public static final int PHOTOMETRIC_INTERPRETATION_VALUE_CMYK = 5;

    /** Photometric interpretation value: YCbCr. */
    public static final int PHOTOMETRIC_INTERPRETATION_VALUE_YCB_CR = 6;

    /** Photometric interpretation value: CIELab. */
    public static final int PHOTOMETRIC_INTERPRETATION_VALUE_CIELAB = 8;

    /** Photometric interpretation value: ICCLab. */
    public static final int PHOTOMETRIC_INTERPRETATION_VALUE_ICCLAB = 9;

    /** Photometric interpretation value: ITULab. */
    public static final int PHOTOMETRIC_INTERPRETATION_VALUE_ITULAB = 10;

    /** Photometric interpretation value: Color Filter Array. */
    public static final int PHOTOMETRIC_INTERPRETATION_VALUE_COLOR_FILTER_ARRAY = 32803;

    /** Photometric interpretation value: Pixar LogL. */
    public static final int PHOTOMETRIC_INTERPRETATION_VALUE_PIXAR_LOG_L = 32844;

    /** Photometric interpretation value: Pixar LogLuv. */
    public static final int PHOTOMETRIC_INTERPRETATION_VALUE_PIXAR_LOG_LUV = 32845;

    /** Photometric interpretation value: Linear Raw. */
    public static final int PHOTOMETRIC_INTERPRETATION_VALUE_LINEAR_RAW = 34892;

    /** TIFF tag: Threshholding. */
    public static final TagInfoShort TIFF_TAG_THRESHHOLDING = new TagInfoShort("Threshholding", 0x107, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** Thresholding value: No dithering or halftoning. */
    public static final int THRESHOLDING_VALUE_NO_DITHERING_OR_HALFTONING = 1;

    /** Thresholding value: Ordered dither or halftone. */
    public static final int THRESHOLDING_VALUE_ORDERED_DITHER_OR_HALFTONE = 2;

    /** Thresholding value: Randomized dither. */
    public static final int THRESHOLDING_VALUE_RANDOMIZED_DITHER = 3;

    /** TIFF tag: Cell Width. */
    public static final TagInfoShort TIFF_TAG_CELL_WIDTH = new TagInfoShort("CellWidth", 0x108, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Cell Length. */
    public static final TagInfoShort TIFF_TAG_CELL_LENGTH = new TagInfoShort("CellLength", 0x109, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Fill Order. */
    public static final TagInfoShort TIFF_TAG_FILL_ORDER = new TagInfoShort("FillOrder", 0x10A, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** Fill order value: Normal. */
    public static final int FILL_ORDER_VALUE_NORMAL = 1;

    /** Fill order value: Reversed. */
    public static final int FILL_ORDER_VALUE_REVERSED = 2;

    /** TIFF tag: Document Name. */
    public static final TagInfoAscii TIFF_TAG_DOCUMENT_NAME = new TagInfoAscii("DocumentName", 0x10D, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Image Description. */
    public static final TagInfoAscii TIFF_TAG_IMAGE_DESCRIPTION = new TagInfoAscii("ImageDescription", 0x10E, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Make. */
    public static final TagInfoAscii TIFF_TAG_MAKE = new TagInfoAscii("Make", 0x10F, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Model. */
    public static final TagInfoAscii TIFF_TAG_MODEL = new TagInfoAscii("Model", 0x110, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Strip Offsets. */
    public static final TagInfoShortOrLong TIFF_TAG_STRIP_OFFSETS = new TagInfoShortOrLong("StripOffsets", 0x111, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT,
            true);

    /** TIFF tag: Orientation. */
    public static final TagInfoShort TIFF_TAG_ORIENTATION = new TagInfoShort("Orientation", 0x112, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** Orientation: Horizontal (normal). */
    public static final int ORIENTATION_VALUE_HORIZONTAL_NORMAL = 1;

    /** Orientation: Mirror horizontal. */
    public static final int ORIENTATION_VALUE_MIRROR_HORIZONTAL = 2;

    /** Orientation: Rotate 180. */
    public static final int ORIENTATION_VALUE_ROTATE_180 = 3;

    /** Orientation: Mirror vertical. */
    public static final int ORIENTATION_VALUE_MIRROR_VERTICAL = 4;

    /** Orientation: Mirror horizontal and rotate 270 CW. */
    public static final int ORIENTATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_270_CW = 5;

    /** Orientation: Rotate 90 CW. */
    public static final int ORIENTATION_VALUE_ROTATE_90_CW = 6;

    /** Orientation: Mirror horizontal and rotate 90 CW. */
    public static final int ORIENTATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_90_CW = 7;

    /** Orientation: Rotate 270 CW. */
    public static final int ORIENTATION_VALUE_ROTATE_270_CW = 8;

    /** TIFF tag: Samples Per Pixel. */
    public static final TagInfoShort TIFF_TAG_SAMPLES_PER_PIXEL = new TagInfoShort("SamplesPerPixel", 0x115, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Rows Per Strip. */
    public static final TagInfoShortOrLong TIFF_TAG_ROWS_PER_STRIP = new TagInfoShortOrLong("RowsPerStrip", 0x116, 1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Strip Byte Counts. */
    public static final TagInfoShortOrLong TIFF_TAG_STRIP_BYTE_COUNTS = new TagInfoShortOrLong("StripByteCounts", 0x117, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Min Sample Value. */
    public static final TagInfoShorts TIFF_TAG_MIN_SAMPLE_VALUE = new TagInfoShorts("MinSampleValue", 0x118, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Max Sample Value. */
    public static final TagInfoShorts TIFF_TAG_MAX_SAMPLE_VALUE = new TagInfoShorts("MaxSampleValue", 0x119, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: X Resolution. */
    public static final TagInfoRational TIFF_TAG_XRESOLUTION = new TagInfoRational("XResolution", 0x11A, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Y Resolution. */
    public static final TagInfoRational TIFF_TAG_YRESOLUTION = new TagInfoRational("YResolution", 0x11B, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Planar Configuration. */
    public static final TagInfoShort TIFF_TAG_PLANAR_CONFIGURATION = new TagInfoShort("PlanarConfiguration", 0x11C, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** Planar configuration: Chunky. */
    public static final int PLANAR_CONFIGURATION_VALUE_CHUNKY = 1;

    /** Planar configuration: Planar. */
    public static final int PLANAR_CONFIGURATION_VALUE_PLANAR = 2;

    /** TIFF tag: Page Name. */
    public static final TagInfoAscii TIFF_TAG_PAGE_NAME = new TagInfoAscii("PageName", 0x11D, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: X Position. */
    public static final TagInfoRationals TIFF_TAG_XPOSITION = new TagInfoRationals("XPosition", 0x11E, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Y Position. */
    public static final TagInfoRationals TIFF_TAG_YPOSITION = new TagInfoRationals("YPosition", 0x11F, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Free Offsets. */
    public static final TagInfoLongs TIFF_TAG_FREE_OFFSETS = new TagInfoLongs("FreeOffsets", 0x120, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Free Byte Counts. */
    public static final TagInfoLongs TIFF_TAG_FREE_BYTE_COUNTS = new TagInfoLongs("FreeByteCounts", 0x121, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Gray Response Unit. */
    public static final TagInfoShort TIFF_TAG_GRAY_RESPONSE_UNIT = new TagInfoShort("GrayResponseUnit", 0x122, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** Gray response unit value: 0.1. */
    public static final int GRAY_RESPONSE_UNIT_VALUE_0_1 = 1;

    /** Gray response unit value: 0.01. */
    public static final int GRAY_RESPONSE_UNIT_VALUE_0_01 = 2;

    /** Gray response unit value: 0.001. */
    public static final int GRAY_RESPONSE_UNIT_VALUE_0_001 = 3;

    /** Gray response unit value: 0.0001. */
    public static final int GRAY_RESPONSE_UNIT_VALUE_0_0001 = 4;

    /** Gray response unit value: 0.00001. */
    public static final int GRAY_RESPONSE_UNIT_VALUE_0_00001 = 5;

    /** TIFF tag: Gray Response Curve. */
    public static final TagInfoShorts TIFF_TAG_GRAY_RESPONSE_CURVE = new TagInfoShorts("GrayResponseCurve", 0x123, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: T4 Options. */
    public static final TagInfoLong TIFF_TAG_T4_OPTIONS = new TagInfoLong("T4Options", 0x124, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: T6 Options. */
    public static final TagInfoLong TIFF_TAG_T6_OPTIONS = new TagInfoLong("T6Options", 0x125, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Resolution Unit. */
    public static final TagInfoShort TIFF_TAG_RESOLUTION_UNIT = new TagInfoShort("ResolutionUnit", 0x128, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** Resolution unit: None. */
    public static final int RESOLUTION_UNIT_VALUE_NONE = 1;

    /** Resolution unit: Inches. */
    public static final int RESOLUTION_UNIT_VALUE_INCHES = 2;

    /** Resolution unit: Centimeters. */
    public static final int RESOLUTION_UNIT_VALUE_CM = 3;

    /** TIFF tag: Page Number. */
    public static final TagInfoShorts TIFF_TAG_PAGE_NUMBER = new TagInfoShorts("PageNumber", 0x129, 2, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Transfer Function. */
    public static final TagInfoShorts TIFF_TAG_TRANSFER_FUNCTION = new TagInfoShorts("TransferFunction", 0x12D, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Software. */
    public static final TagInfoAscii TIFF_TAG_SOFTWARE = new TagInfoAscii("Software", 0x131, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Date Time. */
    public static final TagInfoAscii TIFF_TAG_DATE_TIME = new TagInfoAscii("DateTime", 0x132, 20, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Artist. */
    public static final TagInfoAscii TIFF_TAG_ARTIST = new TagInfoAscii("Artist", 0x13B, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Host Computer. */
    public static final TagInfoAscii TIFF_TAG_HOST_COMPUTER = new TagInfoAscii("HostComputer", 0x13C, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Predictor. */
    public static final TagInfoShort TIFF_TAG_PREDICTOR = new TagInfoShort("Predictor", 0x13D, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** Predictor: None. */
    public static final int PREDICTOR_VALUE_NONE = 1;

    /** Predictor: Horizontal differencing. */
    public static final int PREDICTOR_VALUE_HORIZONTAL_DIFFERENCING = 2;

    /** Predictor: Floating point differencing. */
    public static final int PREDICTOR_VALUE_FLOATING_POINT_DIFFERENCING = 3;

    /** TIFF tag: White Point. */
    public static final TagInfoRationals TIFF_TAG_WHITE_POINT = new TagInfoRationals("WhitePoint", 0x13E, 2, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Primary Chromaticities. */
    public static final TagInfoRationals TIFF_TAG_PRIMARY_CHROMATICITIES = new TagInfoRationals("PrimaryChromaticities", 0x13F, 6,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Color Map. */
    public static final TagInfoShorts TIFF_TAG_COLOR_MAP = new TagInfoShorts("ColorMap", 0x140, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Halftone Hints. */
    public static final TagInfoShorts TIFF_TAG_HALFTONE_HINTS = new TagInfoShorts("HalftoneHints", 0x141, 2, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Tile Width. */
    public static final TagInfoShortOrLong TIFF_TAG_TILE_WIDTH = new TagInfoShortOrLong("TileWidth", 0x142, 1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Tile Length. */
    public static final TagInfoShortOrLong TIFF_TAG_TILE_LENGTH = new TagInfoShortOrLong("TileLength", 0x143, 1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Tile Offsets. */
    public static final TagInfoLongs TIFF_TAG_TILE_OFFSETS = new TagInfoLongs("TileOffsets", 0x144, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT, true);

    /** TIFF tag: Tile Byte Counts. */
    public static final TagInfoShortOrLong TIFF_TAG_TILE_BYTE_COUNTS = new TagInfoShortOrLong("TileByteCounts", 0x145, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Ink Set. */
    public static final TagInfoShort TIFF_TAG_INK_SET = new TagInfoShort("InkSet", 0x14C, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** Ink set: CMYK. */
    public static final int INK_SET_VALUE_CMYK = 1;

    /** Ink set: Not CMYK. */
    public static final int INK_SET_VALUE_NOT_CMYK = 2;

    /** TIFF tag: Ink Names. */
    public static final TagInfoAscii TIFF_TAG_INK_NAMES = new TagInfoAscii("InkNames", 0x14D, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Number Of Inks. */
    public static final TagInfoShort TIFF_TAG_NUMBER_OF_INKS = new TagInfoShort("NumberOfInks", 0x14E, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Dot Range. */
    public static final TagInfoByteOrShort TIFF_TAG_DOT_RANGE = new TagInfoByteOrShort("DotRange", 0x150, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Target Printer. */
    public static final TagInfoAscii TIFF_TAG_TARGET_PRINTER = new TagInfoAscii("TargetPrinter", 0x151, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Extra Samples. */
    public static final TagInfoShorts TIFF_TAG_EXTRA_SAMPLES = new TagInfoShorts("ExtraSamples", 0x152, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** Extra sample: Associated alpha. */
    public static final int EXTRA_SAMPLE_ASSOCIATED_ALPHA = 1;

    /** Extra sample: Unassociated alpha. */
    public static final int EXTRA_SAMPLE_UNASSOCIATED_ALPHA = 2;

    /** TIFF tag: Sample Format. */
    public static final TagInfoShorts TIFF_TAG_SAMPLE_FORMAT = new TagInfoShorts("SampleFormat", 0x153, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** Sample format value: Unsigned integer. */
    public static final int SAMPLE_FORMAT_VALUE_UNSIGNED_INTEGER = 1;

    /** Sample format value: Two's complement signed integer. */
    public static final int SAMPLE_FORMAT_VALUE_TWOS_COMPLEMENT_SIGNED_INTEGER = 2;

    /** Sample format value: IEEE floating point. */
    public static final int SAMPLE_FORMAT_VALUE_IEEE_FLOATING_POINT = 3;

    /** Sample format value: Undefined. */
    public static final int SAMPLE_FORMAT_VALUE_UNDEFINED = 4;

    /** Sample format value: Complex integer. */
    public static final int SAMPLE_FORMAT_VALUE_COMPLEX_INTEGER = 5;

    /** Sample format value: IEEE complex float (deprecated, use COMPLEX_IEEE_FLOATING_POINT). */
    public static final int SAMPLE_FORMAT_VALUE_IEEE_COMPLEX_FLOAT = 6;

    /** Sample format value: Complex IEEE floating point. */
    public static final int SAMPLE_FORMAT_VALUE_COMPLEX_IEEE_FLOATING_POINT = 6;

    /** TIFF tag: S Min Sample Value. */
    public static final TagInfoAny TIFF_TAG_SMIN_SAMPLE_VALUE = new TagInfoAny("SMinSampleValue", 0x154, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: S Max Sample Value. */
    public static final TagInfoAny TIFF_TAG_SMAX_SAMPLE_VALUE = new TagInfoAny("SMaxSampleValue", 0x155, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Transfer Range. */
    public static final TagInfoShorts TIFF_TAG_TRANSFER_RANGE = new TagInfoShorts("TransferRange", 0x156, 6, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: JPEG Proc. */
    public static final TagInfoShort TIFF_TAG_JPEG_PROC = new TagInfoShort("JPEGProc", 0x200, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** JPEG proc: Baseline. */
    public static final int JPEGPROC_VALUE_BASELINE = 1;

    /** JPEG proc: Lossless. */
    public static final int JPEGPROC_VALUE_LOSSLESS = 14;

    /** TIFF tag: JPEG Interchange Format. */
    public static final TagInfoLong TIFF_TAG_JPEG_INTERCHANGE_FORMAT = new TagInfoLong("JPEGInterchangeFormat", 0x201, TiffDirectoryType.TIFF_DIRECTORY_ROOT,
            true);

    /** TIFF tag: JPEG Interchange Format Length. */
    public static final TagInfoLong TIFF_TAG_JPEG_INTERCHANGE_FORMAT_LENGTH = new TagInfoLong("JPEGInterchangeFormatLength", 0x202,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: JPEG Restart Interval. */
    public static final TagInfoShort TIFF_TAG_JPEG_RESTART_INTERVAL = new TagInfoShort("JPEGRestartInterval", 0x203, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: JPEG Lossless Predictors. */
    public static final TagInfoShorts TIFF_TAG_JPEG_LOSSLESS_PREDICTORS = new TagInfoShorts("JPEGLosslessPredictors", 0x205, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: JPEG Point Transforms. */
    public static final TagInfoShorts TIFF_TAG_JPEG_POINT_TRANSFORMS = new TagInfoShorts("JPEGPointTransforms", 0x206, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: JPEG Q Tables. */
    public static final TagInfoLongs TIFF_TAG_JPEG_QTABLES = new TagInfoLongs("JPEGQTables", 0x207, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: JPEG DC Tables. */
    public static final TagInfoLongs TIFF_TAG_JPEG_DCTABLES = new TagInfoLongs("JPEGDCTables", 0x208, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: JPEG AC Tables. */
    public static final TagInfoLongs TIFF_TAG_JPEG_ACTABLES = new TagInfoLongs("JPEGACTables", 0x209, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: YCbCr Coefficients. */
    public static final TagInfoRationals TIFF_TAG_YCBCR_COEFFICIENTS = new TagInfoRationals("YCbCrCoefficients", 0x211, 3,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: YCbCr Sub Sampling. */
    public static final TagInfoShorts TIFF_TAG_YCBCR_SUB_SAMPLING = new TagInfoShorts("YCbCrSubSampling", 0x212, 2, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: YCbCr Positioning. */
    public static final TagInfoShort TIFF_TAG_YCBCR_POSITIONING = new TagInfoShort("YCbCrPositioning", 0x213, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** YCbCr positioning: Centered. */
    public static final int YCB_CR_POSITIONING_VALUE_CENTERED = 1;

    /** YCbCr positioning: Co-sited. */
    public static final int YCB_CR_POSITIONING_VALUE_CO_SITED = 2;

    /** TIFF tag: Reference Black White. */
    public static final TagInfoLongs TIFF_TAG_REFERENCE_BLACK_WHITE = new TagInfoLongs("ReferenceBlackWhite", 0x214, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: Copyright. */
    public static final TagInfoAscii TIFF_TAG_COPYRIGHT = new TagInfoAscii("Copyright", 0x8298, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    /** TIFF tag: XMP. */
    public static final TagInfoBytes TIFF_TAG_XMP = new TagInfoBytes("XMP", 0x2BC, -1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    // TODO:
    // public static final TagInfo2 TIFF_TAG_UNKNOWN = null;

    /** TIFF tag: Unknown Tag. */
    public static final TagInfoUnknowns TIFF_TAG_UNKNOWN = new TagInfoUnknowns("Unknown Tag", -1, TagInfo.LENGTH_UNKNOWN,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    /** List of all TIFF tags. */
    public static final List<TagInfo> ALL_TIFF_TAGS = Collections.unmodifiableList(Arrays.asList(TIFF_TAG_NEW_SUBFILE_TYPE, TIFF_TAG_SUBFILE_TYPE,
            TIFF_TAG_IMAGE_WIDTH, TIFF_TAG_IMAGE_LENGTH, TIFF_TAG_BITS_PER_SAMPLE, TIFF_TAG_COMPRESSION, TIFF_TAG_PHOTOMETRIC_INTERPRETATION,
            TIFF_TAG_THRESHHOLDING, TIFF_TAG_CELL_WIDTH, TIFF_TAG_CELL_LENGTH, TIFF_TAG_FILL_ORDER, TIFF_TAG_DOCUMENT_NAME, TIFF_TAG_IMAGE_DESCRIPTION,
            TIFF_TAG_MAKE, TIFF_TAG_MODEL, TIFF_TAG_STRIP_OFFSETS, TIFF_TAG_ORIENTATION, TIFF_TAG_SAMPLES_PER_PIXEL, TIFF_TAG_ROWS_PER_STRIP,
            TIFF_TAG_STRIP_BYTE_COUNTS, TIFF_TAG_MIN_SAMPLE_VALUE, TIFF_TAG_MAX_SAMPLE_VALUE, TIFF_TAG_XRESOLUTION, TIFF_TAG_YRESOLUTION,
            TIFF_TAG_PLANAR_CONFIGURATION, TIFF_TAG_PAGE_NAME, TIFF_TAG_XPOSITION, TIFF_TAG_YPOSITION, TIFF_TAG_FREE_OFFSETS, TIFF_TAG_FREE_BYTE_COUNTS,
            TIFF_TAG_GRAY_RESPONSE_UNIT, TIFF_TAG_GRAY_RESPONSE_CURVE, TIFF_TAG_T4_OPTIONS, TIFF_TAG_T6_OPTIONS, TIFF_TAG_RESOLUTION_UNIT, TIFF_TAG_PAGE_NUMBER,
            TIFF_TAG_TRANSFER_FUNCTION, TIFF_TAG_SOFTWARE, TIFF_TAG_DATE_TIME, TIFF_TAG_ARTIST, TIFF_TAG_HOST_COMPUTER, TIFF_TAG_PREDICTOR,
            TIFF_TAG_WHITE_POINT, TIFF_TAG_PRIMARY_CHROMATICITIES, TIFF_TAG_COLOR_MAP, TIFF_TAG_HALFTONE_HINTS, TIFF_TAG_TILE_WIDTH, TIFF_TAG_TILE_LENGTH,
            TIFF_TAG_TILE_OFFSETS, TIFF_TAG_TILE_BYTE_COUNTS, TIFF_TAG_INK_SET, TIFF_TAG_INK_NAMES, TIFF_TAG_NUMBER_OF_INKS, TIFF_TAG_DOT_RANGE,
            TIFF_TAG_TARGET_PRINTER, TIFF_TAG_EXTRA_SAMPLES, TIFF_TAG_SAMPLE_FORMAT, TIFF_TAG_SMIN_SAMPLE_VALUE, TIFF_TAG_SMAX_SAMPLE_VALUE,
            TIFF_TAG_TRANSFER_RANGE, TIFF_TAG_JPEG_PROC, TIFF_TAG_JPEG_INTERCHANGE_FORMAT, TIFF_TAG_JPEG_INTERCHANGE_FORMAT_LENGTH,
            TIFF_TAG_JPEG_RESTART_INTERVAL, TIFF_TAG_JPEG_LOSSLESS_PREDICTORS, TIFF_TAG_JPEG_POINT_TRANSFORMS, TIFF_TAG_JPEG_QTABLES, TIFF_TAG_JPEG_DCTABLES,
            TIFF_TAG_JPEG_ACTABLES, TIFF_TAG_YCBCR_COEFFICIENTS, TIFF_TAG_YCBCR_SUB_SAMPLING, TIFF_TAG_YCBCR_POSITIONING, TIFF_TAG_REFERENCE_BLACK_WHITE,
            TIFF_TAG_COPYRIGHT, TIFF_TAG_XMP));

    private TiffTagConstants() {
    }
}
