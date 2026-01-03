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
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefined;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknowns;

/**
 * References:
 * <ul>
 * <li>https://exiftool.org/TagNames/EXIF.html</li>
 * <li>[BROKEN URL] http://tiki-lounge.com/~raf/tiff/fields.html</li>
 * <li>https://www.awaresystems.be/imaging/tiff/tifftags.html</li>
 * <li>"Stonits": http://www.anyhere.com/gward/pixformat/tiffluv.html</li>
 * </ul>
 */
public final class ExifTagConstants {

    /** Interoperability index tag. */
    public static final TagInfoAscii EXIF_TAG_INTEROPERABILITY_INDEX = new TagInfoAscii("InteroperabilityIndex", 0x0001, -1,
            TiffDirectoryType.EXIF_DIRECTORY_INTEROP_IFD);
    /** Interoperability version tag. */
    public static final TagInfoUndefined EXIF_TAG_INTEROPERABILITY_VERSION = new TagInfoUndefined("InteroperabilityVersion", 0x0002,
            TiffDirectoryType.EXIF_DIRECTORY_INTEROP_IFD);
    /** Processing software tag. */
    public static final TagInfoAscii EXIF_TAG_PROCESSING_SOFTWARE = new TagInfoAscii("ProcessingSoftware", 0x000b, -1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    /** Software tag. */
    public static final TagInfoAscii EXIF_TAG_SOFTWARE = new TagInfoAscii("Software", 0x0131, -1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    /** Preview image start (IFD0) tag. */
    public static final TagInfoLong EXIF_TAG_PREVIEW_IMAGE_START_IFD0 = new TagInfoLong("PreviewImageStart", 0x0111, TiffDirectoryType.EXIF_DIRECTORY_IFD0,
            true);
    /** Preview image start (Sub IFD1) tag. */
    public static final TagInfoLong EXIF_TAG_PREVIEW_IMAGE_START_SUB_IFD1 = new TagInfoLong("PreviewImageStart", 0x0111,
            TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD1, true);
    /** JPG from raw start (Sub IFD2) tag. */
    public static final TagInfoLong EXIF_TAG_JPG_FROM_RAW_START_SUB_IFD2 = new TagInfoLong("JpgFromRawStart", 0x0111, TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD2,
            true);
    /** Preview image length (IFD0) tag. */
    public static final TagInfoLong EXIF_TAG_PREVIEW_IMAGE_LENGTH_IFD0 = new TagInfoLong("PreviewImageLength", 0x0117, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    /** Preview image length (Sub IFD1) tag. */
    public static final TagInfoLong EXIF_TAG_PREVIEW_IMAGE_LENGTH_SUB_IFD1 = new TagInfoLong("PreviewImageLength", 0x0117,
            TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD1);
    /** JPG from raw length (Sub IFD2) tag. */
    public static final TagInfoLong EXIF_TAG_JPG_FROM_RAW_LENGTH_SUB_IFD2 = new TagInfoLong("JpgFromRawLength", 0x0117,
            TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD2);
    /** Preview image start (Maker Notes) tag. */
    public static final TagInfoLong EXIF_TAG_PREVIEW_IMAGE_START_MAKER_NOTES = new TagInfoLong("PreviewImageStart", 0x0201,
            TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES);
    /** JPG from raw start (Sub IFD) tag. */
    public static final TagInfoLong EXIF_TAG_JPG_FROM_RAW_START_SUB_IFD = new TagInfoLong("JpgFromRawStart", 0x0201, TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD,
            true);
    /** JPG from raw start (IFD2) tag. */
    public static final TagInfoLong EXIF_TAG_JPG_FROM_RAW_START_IFD2 = new TagInfoLong("JpgFromRawStart", 0x0201, TiffDirectoryType.EXIF_DIRECTORY_IFD2, true);
    /** Other image start tag. */
    public static final TagInfoLong EXIF_TAG_OTHER_IMAGE_START = new TagInfoLong("OtherImageStart", 0x0201, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN, true);
    /** Preview image length (Maker Notes) tag. */
    public static final TagInfoLong EXIF_TAG_PREVIEW_IMAGE_LENGTH_MAKER_NOTES = new TagInfoLong("PreviewImageLength", 0x0202,
            TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES);
    /** JPG from raw length (Sub IFD) tag. */
    public static final TagInfoLong EXIF_TAG_JPG_FROM_RAW_LENGTH_SUB_IFD = new TagInfoLong("JpgFromRawLength", 0x0202,
            TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD);
    /** JPG from raw length (IFD2) tag. */
    public static final TagInfoLong EXIF_TAG_JPG_FROM_RAW_LENGTH_IFD2 = new TagInfoLong("JpgFromRawLength", 0x0202, TiffDirectoryType.EXIF_DIRECTORY_IFD2);
    /** Other image length tag. */
    public static final TagInfoLong EXIF_TAG_OTHER_IMAGE_LENGTH = new TagInfoLong("OtherImageLength", 0x0202, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Application notes tag. */
    public static final TagInfoBytes EXIF_TAG_APPLICATION_NOTES = new TagInfoBytes("ApplicationNotes", 0x02bc, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Matteing tag. */
    public static final TagInfoUnknowns EXIF_TAG_MATTEING = new TagInfoUnknowns("Matteing", 0x80e3, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Data type tag. */
    public static final TagInfoUnknowns EXIF_TAG_DATA_TYPE = new TagInfoUnknowns("DataType", 0x80e4, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Image depth tag. */
    public static final TagInfoUnknowns EXIF_TAG_IMAGE_DEPTH = new TagInfoUnknowns("ImageDepth", 0x80e5, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Tile depth tag. */
    public static final TagInfoUnknowns EXIF_TAG_TILE_DEPTH = new TagInfoUnknowns("TileDepth", 0x80e6, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Model 2 tag. */
    public static final TagInfoUnknowns EXIF_TAG_MODEL_2 = new TagInfoUnknowns("Model2", 0x827d, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Exposure time tag. */
    public static final TagInfoRationals EXIF_TAG_EXPOSURE_TIME = new TagInfoRationals("ExposureTime", 0x829a, -1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** F-number tag. */
    public static final TagInfoRationals EXIF_TAG_FNUMBER = new TagInfoRationals("FNumber", 0x829d, -1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    // FIXME: other types?
    /** IPTC-NAA tag. */
    public static final TagInfoLong EXIF_TAG_IPTC_NAA = new TagInfoLong("IPTC-NAA", 0x83bb, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    /** Intergraph packet data tag. */
    public static final TagInfoShorts EXIF_TAG_INTERGRAPH_PACKET_DATA = new TagInfoShorts("IntergraphPacketData", 0x847e, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Intergraph flag registers tag. */
    public static final TagInfoLongs EXIF_TAG_INTERGRAPH_FLAG_REGISTERS = new TagInfoLongs("IntergraphFlagRegisters", 0x847f, 16,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Site tag. */
    public static final TagInfoAscii EXIF_TAG_SITE = new TagInfoAscii("Site", 0x84e0, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Color sequence tag. */
    public static final TagInfoAscii EXIF_TAG_COLOR_SEQUENCE = new TagInfoAscii("ColorSequence", 0x84e1, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** IT8 header tag. */
    public static final TagInfoAscii EXIF_TAG_IT8HEADER = new TagInfoAscii("IT8Header", 0x84e2, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Raster padding tag. */
    public static final TagInfoShort EXIF_TAG_RASTER_PADDING = new TagInfoShort("RasterPadding", 0x84e3, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Bits per run length tag. */
    public static final TagInfoShort EXIF_TAG_BITS_PER_RUN_LENGTH = new TagInfoShort("BitsPerRunLength", 0x84e4, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Bits per extended run length tag. */
    public static final TagInfoShort EXIF_TAG_BITS_PER_EXTENDED_RUN_LENGTH = new TagInfoShort("BitsPerExtendedRunLength", 0x84e5,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Color table tag. */
    public static final TagInfoBytes EXIF_TAG_COLOR_TABLE = new TagInfoBytes("ColorTable", 0x84e6, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Image color indicator tag. */
    public static final TagInfoByte EXIF_TAG_IMAGE_COLOR_INDICATOR = new TagInfoByte("ImageColorIndicator", 0x84e7, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Background color indicator tag. */
    public static final TagInfoByte EXIF_TAG_BACKGROUND_COLOR_INDICATOR = new TagInfoByte("BackgroundColorIndicator", 0x84e8,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Image color value tag. */
    public static final TagInfoBytes EXIF_TAG_IMAGE_COLOR_VALUE = new TagInfoBytes("ImageColorValue", 0x84e9, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Background color value tag. */
    public static final TagInfoBytes EXIF_TAG_BACKGROUND_COLOR_VALUE = new TagInfoBytes("BackgroundColorValue", 0x84ea, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Pixel intensity range tag. */
    public static final TagInfoBytes EXIF_TAG_PIXEL_INTENSITY_RANGE = new TagInfoBytes("PixelIntensityRange", 0x84eb, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Transparency indicator tag. */
    public static final TagInfoByte EXIF_TAG_TRANSPARENCY_INDICATOR = new TagInfoByte("TransparencyIndicator", 0x84ec,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Color characterization tag. */
    public static final TagInfoAscii EXIF_TAG_COLOR_CHARACTERIZATION = new TagInfoAscii("ColorCharacterization", 0x84ed, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** HC usage tag. */
    public static final TagInfoShortOrLong EXIF_TAG_HCUSAGE = new TagInfoShortOrLong("HCUsage", 0x84ee, 1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** SEM info tag. */
    public static final TagInfoAscii EXIF_TAG_SEMINFO = new TagInfoAscii("SEMInfo", 0x8546, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    /** AFCP IPTC tag. */
    public static final TagInfoLong EXIF_TAG_AFCP_IPTC = new TagInfoLong("AFCP_IPTC", 0x8568, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Leaf data tag. */
    public static final TagInfoLong EXIF_TAG_LEAF_DATA = new TagInfoLong("LeafData", 0x8606, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Photoshop settings tag. */
    public static final TagInfoBytes EXIF_TAG_PHOTOSHOP_SETTINGS = new TagInfoBytes("PhotoshopSettings", 0x8649, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** EXIF offset tag. */
    public static final TagInfoDirectory EXIF_TAG_EXIF_OFFSET = new TagInfoDirectory("ExifOffset", 0x8769, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Exposure program tag. */
    public static final TagInfoShort EXIF_TAG_EXPOSURE_PROGRAM = new TagInfoShort("ExposureProgram", 0x8822, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Exposure program value: manual. */
    public static final int EXPOSURE_PROGRAM_VALUE_MANUAL = 1;
    /** Exposure program value: program AE. */
    public static final int EXPOSURE_PROGRAM_VALUE_PROGRAM_AE = 2;
    /** Exposure program value: aperture priority AE. */
    public static final int EXPOSURE_PROGRAM_VALUE_APERTURE_PRIORITY_AE = 3;
    /** Exposure program value: shutter speed priority AE. */
    public static final int EXPOSURE_PROGRAM_VALUE_SHUTTER_SPEED_PRIORITY_AE = 4;
    /** Exposure program value: creative slow speed. */
    public static final int EXPOSURE_PROGRAM_VALUE_CREATIVE_SLOW_SPEED = 5;
    /** Exposure program value: action high speed. */
    public static final int EXPOSURE_PROGRAM_VALUE_ACTION_HIGH_SPEED = 6;
    /** Exposure program value: portrait. */
    public static final int EXPOSURE_PROGRAM_VALUE_PORTRAIT = 7;
    /** Exposure program value: landscape. */
    public static final int EXPOSURE_PROGRAM_VALUE_LANDSCAPE = 8;
    /** Spectral sensitivity tag. */
    public static final TagInfoAscii EXIF_TAG_SPECTRAL_SENSITIVITY = new TagInfoAscii("SpectralSensitivity", 0x8824, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** GPS info tag. */
    public static final TagInfoDirectory EXIF_TAG_GPSINFO = new TagInfoDirectory("GPSInfo", 0x8825, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Photographic sensitivity (ISO) tag. */
    public static final TagInfoShorts EXIF_TAG_ISO = new TagInfoShorts("PhotographicSensitivity", 0x8827, -1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Opto-electric conversion factor tag. */
    public static final TagInfoUndefineds EXIF_TAG_OPTO_ELECTRIC_CONV_FACTOR = new TagInfoUndefineds("Opto - Electric Conv Factor", 0x8828, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Leaf Sub IFD tag. */
    public static final TagInfoLong EXIF_TAG_LEAF_SUB_IFD = new TagInfoLong("LeafSubIFD", 0x888a, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** EXIF version tag. */
    public static final TagInfoUndefineds EXIF_TAG_EXIF_VERSION = new TagInfoUndefineds("ExifVersion", 0x9000, 4, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Date/time original tag. */
    public static final TagInfoAscii EXIF_TAG_DATE_TIME_ORIGINAL = new TagInfoAscii("DateTimeOriginal", 0x9003, 20, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Date/time digitized tag. */
    public static final TagInfoAscii EXIF_TAG_DATE_TIME_DIGITIZED = new TagInfoAscii("DateTimeDigitized", 0x9004, 20,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Components configuration tag. */
    public static final TagInfoUndefineds EXIF_TAG_COMPONENTS_CONFIGURATION = new TagInfoUndefineds("ComponentsConfiguration", 0x9101, 4,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Compressed bits per pixel tag. */
    public static final TagInfoRational EXIF_TAG_COMPRESSED_BITS_PER_PIXEL = new TagInfoRational("CompressedBitsPerPixel", 0x9102,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Shutter speed value tag. */
    public static final TagInfoSRational EXIF_TAG_SHUTTER_SPEED_VALUE = new TagInfoSRational("ShutterSpeedValue", 0x9201,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Aperture value tag. */
    public static final TagInfoRational EXIF_TAG_APERTURE_VALUE = new TagInfoRational("ApertureValue", 0x9202, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Brightness value tag. */
    public static final TagInfoSRational EXIF_TAG_BRIGHTNESS_VALUE = new TagInfoSRational("BrightnessValue", 0x9203, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Exposure compensation tag. */
    public static final TagInfoSRational EXIF_TAG_EXPOSURE_COMPENSATION = new TagInfoSRational("ExposureCompensation", 0x9204,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Max aperture value tag. */
    public static final TagInfoRational EXIF_TAG_MAX_APERTURE_VALUE = new TagInfoRational("MaxApertureValue", 0x9205,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Subject distance tag. */
    public static final TagInfoRationals EXIF_TAG_SUBJECT_DISTANCE = new TagInfoRationals("Subject Distance", 0x9206, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Metering mode tag. */
    public static final TagInfoShort EXIF_TAG_METERING_MODE = new TagInfoShort("MeteringMode", 0x9207, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Metering mode value: average. */
    public static final int METERING_MODE_VALUE_AVERAGE = 1;
    /** Metering mode value: center weighted average. */
    public static final int METERING_MODE_VALUE_CENTER_WEIGHTED_AVERAGE = 2;
    /** Metering mode value: spot. */
    public static final int METERING_MODE_VALUE_SPOT = 3;
    /** Metering mode value: multi-spot. */
    public static final int METERING_MODE_VALUE_MULTI_SPOT = 4;
    /** Metering mode value: multi-segment. */
    public static final int METERING_MODE_VALUE_MULTI_SEGMENT = 5;
    /** Metering mode value: partial. */
    public static final int METERING_MODE_VALUE_PARTIAL = 6;
    /** Metering mode value: other. */
    public static final int METERING_MODE_VALUE_OTHER = 255;
    /** Light source tag. */
    public static final TagInfoShort EXIF_TAG_LIGHT_SOURCE = new TagInfoShort("LightSource", 0x9208, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Light source value: daylight. */
    public static final int LIGHT_SOURCE_VALUE_DAYLIGHT = 1;
    /** Light source value: fluorescent. */
    public static final int LIGHT_SOURCE_VALUE_FLUORESCENT = 2;
    /** Light source value: tungsten. */
    public static final int LIGHT_SOURCE_VALUE_TUNGSTEN = 3;
    /** Light source value: flash. */
    public static final int LIGHT_SOURCE_VALUE_FLASH = 4;
    /** Light source value: fine weather. */
    public static final int LIGHT_SOURCE_VALUE_FINE_WEATHER = 9;
    /** Light source value: cloudy. */
    public static final int LIGHT_SOURCE_VALUE_CLOUDY = 10;
    /** Light source value: shade. */
    public static final int LIGHT_SOURCE_VALUE_SHADE = 11;
    /** Light source value: daylight fluorescent. */
    public static final int LIGHT_SOURCE_VALUE_DAYLIGHT_FLUORESCENT = 12;
    /** Light source value: day white fluorescent. */
    public static final int LIGHT_SOURCE_VALUE_DAY_WHITE_FLUORESCENT = 13;
    /** Light source value: cool white fluorescent. */
    public static final int LIGHT_SOURCE_VALUE_COOL_WHITE_FLUORESCENT = 14;
    /** Light source value: white fluorescent. */
    public static final int LIGHT_SOURCE_VALUE_WHITE_FLUORESCENT = 15;
    /** Light source value: standard light A. */
    public static final int LIGHT_SOURCE_VALUE_STANDARD_LIGHT_A = 17;
    /** Light source value: standard light B. */
    public static final int LIGHT_SOURCE_VALUE_STANDARD_LIGHT_B = 18;
    /** Light source value: standard light C. */
    public static final int LIGHT_SOURCE_VALUE_STANDARD_LIGHT_C = 19;
    /** Light source value: D55. */
    public static final int LIGHT_SOURCE_VALUE_D55 = 20;
    /** Light source value: D65. */
    public static final int LIGHT_SOURCE_VALUE_D65 = 21;
    /** Light source value: D75. */
    public static final int LIGHT_SOURCE_VALUE_D75 = 22;
    /** Light source value: D50. */
    public static final int LIGHT_SOURCE_VALUE_D50 = 23;
    /** Light source value: ISO studio tungsten. */
    public static final int LIGHT_SOURCE_VALUE_ISO_STUDIO_TUNGSTEN = 24;
    /** Light source value: other. */
    public static final int LIGHT_SOURCE_VALUE_OTHER = 255;
    /** Flash tag. */
    public static final TagInfoShort EXIF_TAG_FLASH = new TagInfoShort("Flash", 0x9209, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Flash value: no flash. */
    public static final int FLASH_VALUE_NO_FLASH = 0x0;
    /** Flash value: fired. */
    public static final int FLASH_VALUE_FIRED = 0x1;
    /** Flash value: fired, return not detected. */
    public static final int FLASH_VALUE_FIRED_RETURN_NOT_DETECTED = 0x5;
    /** Flash value: fired, return detected. */
    public static final int FLASH_VALUE_FIRED_RETURN_DETECTED = 0x7;
    /** Flash value: on, did not fire. */
    public static final int FLASH_VALUE_ON_DID_NOT_FIRE = 0x8;
    /** Flash value: on. */
    public static final int FLASH_VALUE_ON = 0x9;
    /** Flash value: on, return not detected. */
    public static final int FLASH_VALUE_ON_RETURN_NOT_DETECTED = 0xd;
    /** Flash value: on, return detected. */
    public static final int FLASH_VALUE_ON_RETURN_DETECTED = 0xf;
    /** Flash value: off. */
    public static final int FLASH_VALUE_OFF = 0x10;
    /** Flash value: off, did not fire, return not detected. */
    public static final int FLASH_VALUE_OFF_DID_NOT_FIRE_RETURN_NOT_DETECTED = 0x14;
    /** Flash value: auto, did not fire. */
    public static final int FLASH_VALUE_AUTO_DID_NOT_FIRE = 0x18;
    /** Flash value: auto, fired. */
    public static final int FLASH_VALUE_AUTO_FIRED = 0x19;
    /** Flash value: auto, fired, return not detected. */
    public static final int FLASH_VALUE_AUTO_FIRED_RETURN_NOT_DETECTED = 0x1d;
    /** Flash value: auto, fired, return detected. */
    public static final int FLASH_VALUE_AUTO_FIRED_RETURN_DETECTED = 0x1f;
    /** Flash value: no flash function. */
    public static final int FLASH_VALUE_NO_FLASH_FUNCTION = 0x20;
    /** Flash value: off, no flash function. */
    public static final int FLASH_VALUE_OFF_NO_FLASH_FUNCTION = 0x30;
    /** Flash value: fired, red-eye reduction. */
    public static final int FLASH_VALUE_FIRED_RED_EYE_REDUCTION = 0x41;
    /** Flash value: fired, red-eye reduction, return not detected. */
    public static final int FLASH_VALUE_FIRED_RED_EYE_REDUCTION_RETURN_NOT_DETECTED = 0x45;
    /** Flash value: fired, red-eye reduction, return detected. */
    public static final int FLASH_VALUE_FIRED_RED_EYE_REDUCTION_RETURN_DETECTED = 0x47;
    /** Flash value: on, red-eye reduction. */
    public static final int FLASH_VALUE_ON_RED_EYE_REDUCTION = 0x49;
    /** Flash value: on, red-eye reduction, return not detected. */
    public static final int FLASH_VALUE_ON_RED_EYE_REDUCTION_RETURN_NOT_DETECTED = 0x4d;
    /** Flash value: on, red-eye reduction, return detected. */
    public static final int FLASH_VALUE_ON_RED_EYE_REDUCTION_RETURN_DETECTED = 0x4f;
    /** Flash value: off, red-eye reduction. */
    public static final int FLASH_VALUE_OFF_RED_EYE_REDUCTION = 0x50;
    /** Flash value: auto, did not fire, red-eye reduction. */
    public static final int FLASH_VALUE_AUTO_DID_NOT_FIRE_RED_EYE_REDUCTION = 0x58;
    /** Flash value: auto, fired, red-eye reduction. */
    public static final int FLASH_VALUE_AUTO_FIRED_RED_EYE_REDUCTION = 0x59;
    /** Flash value: auto, fired, red-eye reduction, return not detected. */
    public static final int FLASH_VALUE_AUTO_FIRED_RED_EYE_REDUCTION_RETURN_NOT_DETECTED = 0x5d;
    /** Flash value: auto, fired, red-eye reduction, return detected. */
    public static final int FLASH_VALUE_AUTO_FIRED_RED_EYE_REDUCTION_RETURN_DETECTED = 0x5f;
    /** Focal length tag. */
    public static final TagInfoRationals EXIF_TAG_FOCAL_LENGTH = new TagInfoRationals("FocalLength", 0x920a, -1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Subject area tag. */
    public static final TagInfoShorts EXIF_TAG_SUBJECT_AREA = new TagInfoShorts("SubjectArea", 0x9214, -1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** StoNits tag. */
    public static final TagInfoDouble EXIF_TAG_STO_NITS = new TagInfoDouble("StoNits", 0x923f, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Maker note tag. */
    public static final TagInfoUndefineds EXIF_TAG_MAKER_NOTE = new TagInfoUndefineds("MakerNote", 0x927c, -1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** User comment tag. */
    public static final TagInfoGpsText EXIF_TAG_USER_COMMENT = new TagInfoGpsText("UserComment", 0x9286, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Sub-second time tag. */
    public static final TagInfoAscii EXIF_TAG_SUB_SEC_TIME = new TagInfoAscii("SubSecTime", 0x9290, -1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Sub-second time original tag. */
    public static final TagInfoAscii EXIF_TAG_SUB_SEC_TIME_ORIGINAL = new TagInfoAscii("SubSecTimeOriginal", 0x9291, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Sub-second time digitized tag. */
    public static final TagInfoAscii EXIF_TAG_SUB_SEC_TIME_DIGITIZED = new TagInfoAscii("SubSecTimeDigitized", 0x9292, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Flashpix version tag. */
    public static final TagInfoUndefineds EXIF_TAG_FLASHPIX_VERSION = new TagInfoUndefineds("FlashpixVersion", 0xa000, 4,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** EXIF image width tag. */
    public static final TagInfoShort EXIF_TAG_EXIF_IMAGE_WIDTH = new TagInfoShort("ExifImageWidth", 0xa002, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** EXIF image length tag. */
    public static final TagInfoShort EXIF_TAG_EXIF_IMAGE_LENGTH = new TagInfoShort("ExifImageLength", 0xa003, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Related sound file tag. */
    public static final TagInfoAscii EXIF_TAG_RELATED_SOUND_FILE = new TagInfoAscii("RelatedSoundFile", 0xa004, 13, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Interoperability offset tag. */
    public static final TagInfoDirectory EXIF_TAG_INTEROP_OFFSET = new TagInfoDirectory("InteropOffset", 0xa005, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Flash energy (EXIF IFD) tag. */
    public static final TagInfoRationals EXIF_TAG_FLASH_ENERGY_EXIF_IFD = new TagInfoRationals("FlashEnergy", 0xa20b, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Spatial frequency response tag. */
    public static final TagInfoUndefineds EXIF_TAG_SPATIAL_FREQUENCY_RESPONSE_2 = new TagInfoUndefineds("SpatialFrequencyResponse", 0xa20c, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Noise tag. */
    public static final TagInfoUnknowns EXIF_TAG_NOISE_2 = new TagInfoUnknowns("Noise", 0xa20d, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Focal plane X resolution (EXIF IFD) tag. */
    public static final TagInfoRational EXIF_TAG_FOCAL_PLANE_XRESOLUTION_EXIF_IFD = new TagInfoRational("FocalPlaneXResolution", 0xa20e,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Focal plane Y resolution (EXIF IFD) tag. */
    public static final TagInfoRational EXIF_TAG_FOCAL_PLANE_YRESOLUTION_EXIF_IFD = new TagInfoRational("FocalPlaneYResolution", 0xa20f,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Focal plane resolution unit (EXIF IFD) tag. */
    public static final TagInfoShort EXIF_TAG_FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD = new TagInfoShort("FocalPlaneResolutionUnit", 0xa210,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Focal plane resolution unit value: none. */
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_NONE = 1;
    /** Focal plane resolution unit value: inches. */
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_INCHES = 2;
    /** Focal plane resolution unit value: centimeters. */
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_CM = 3;
    /** Focal plane resolution unit value: millimeters. */
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_MM = 4;
    /** Focal plane resolution unit value: micrometers. */
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_UM = 5;
    /** Image number tag. */
    public static final TagInfoUnknowns EXIF_TAG_IMAGE_NUMBER = new TagInfoUnknowns("ImageNumber", 0xa211, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Security classification tag. */
    public static final TagInfoUnknowns EXIF_TAG_SECURITY_CLASSIFICATION = new TagInfoUnknowns("SecurityClassification", 0xa212, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Image history tag. */
    public static final TagInfoUnknowns EXIF_TAG_IMAGE_HISTORY = new TagInfoUnknowns("ImageHistory", 0xa213, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Subject location tag. */
    public static final TagInfoShorts EXIF_TAG_SUBJECT_LOCATION = new TagInfoShorts("SubjectLocation", 0xa214, 2, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Exposure index (EXIF IFD) tag. */
    public static final TagInfoRational EXIF_TAG_EXPOSURE_INDEX_EXIF_IFD = new TagInfoRational("ExposureIndex", 0xa215,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** TIFF-EP standard ID tag. */
    public static final TagInfoUnknowns EXIF_TAG_TIFF_EPSTANDARD_ID_2 = new TagInfoUnknowns("TIFF-EPStandardID", 0xa216, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Sensing method (EXIF IFD) tag. */
    public static final TagInfoShort EXIF_TAG_SENSING_METHOD_EXIF_IFD = new TagInfoShort("SensingMethod", 0xa217, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Sensing method value: not defined. */
    public static final int SENSING_METHOD_EXIF_IFD_VALUE_NOT_DEFINED = 1;
    /** Sensing method value: one-chip color area. */
    public static final int SENSING_METHOD_EXIF_IFD_VALUE_ONE_CHIP_COLOR_AREA = 2;
    /** Sensing method value: two-chip color area. */
    public static final int SENSING_METHOD_EXIF_IFD_VALUE_TWO_CHIP_COLOR_AREA = 3;
    /** Sensing method value: three-chip color area. */
    public static final int SENSING_METHOD_EXIF_IFD_VALUE_THREE_CHIP_COLOR_AREA = 4;
    /** Sensing method value: color sequential area. */
    public static final int SENSING_METHOD_EXIF_IFD_VALUE_COLOR_SEQUENTIAL_AREA = 5;
    /** Sensing method value: trilinear. */
    public static final int SENSING_METHOD_EXIF_IFD_VALUE_TRILINEAR = 7;
    /** Sensing method value: color sequential linear. */
    public static final int SENSING_METHOD_EXIF_IFD_VALUE_COLOR_SEQUENTIAL_LINEAR = 8;
    /** File source tag. */
    public static final TagInfoUndefined EXIF_TAG_FILE_SOURCE = new TagInfoUndefined("FileSource", 0xa300, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** File source value: film scanner. */
    public static final int FILE_SOURCE_VALUE_FILM_SCANNER = 1;
    /** File source value: reflection print scanner. */
    public static final int FILE_SOURCE_VALUE_REFLECTION_PRINT_SCANNER = 2;
    /** File source value: digital camera. */
    public static final int FILE_SOURCE_VALUE_DIGITAL_CAMERA = 3;
    /** Scene type tag. */
    public static final TagInfoUndefined EXIF_TAG_SCENE_TYPE = new TagInfoUndefined("SceneType", 0xa301, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** CFA pattern tag. */
    public static final TagInfoUndefineds EXIF_TAG_CFAPATTERN = new TagInfoUndefineds("CFAPattern", 0xa302, -1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Custom rendered tag. */
    public static final TagInfoShort EXIF_TAG_CUSTOM_RENDERED = new TagInfoShort("CustomRendered", 0xa401, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Custom rendered value: normal. */
    public static final int CUSTOM_RENDERED_VALUE_NORMAL = 0;
    /** Custom rendered value: custom. */
    public static final int CUSTOM_RENDERED_VALUE_CUSTOM = 1;
    /** Exposure mode tag. */
    public static final TagInfoShort EXIF_TAG_EXPOSURE_MODE = new TagInfoShort("ExposureMode", 0xa402, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Exposure mode value: auto. */
    public static final int EXPOSURE_MODE_VALUE_AUTO = 0;
    /** Exposure mode value: manual. */
    public static final int EXPOSURE_MODE_VALUE_MANUAL = 1;
    /** Exposure mode value: auto bracket. */
    public static final int EXPOSURE_MODE_VALUE_AUTO_BRACKET = 2;
    /** White balance tag. */
    public static final TagInfoShort EXIF_TAG_WHITE_BALANCE_1 = new TagInfoShort("WhiteBalance", 0xa403, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** White balance value: auto. */
    public static final int WHITE_BALANCE_1_VALUE_AUTO = 0;
    /** White balance value: manual. */
    public static final int WHITE_BALANCE_1_VALUE_MANUAL = 1;
    /** Digital zoom ratio tag. */
    public static final TagInfoRational EXIF_TAG_DIGITAL_ZOOM_RATIO = new TagInfoRational("DigitalZoomRatio", 0xa404,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Focal length in 35mm format tag. */
    public static final TagInfoShort EXIF_TAG_FOCAL_LENGTH_IN_35MM_FORMAT = new TagInfoShort("FocalLengthIn35mmFormat", 0xa405,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Scene capture type tag. */
    public static final TagInfoShort EXIF_TAG_SCENE_CAPTURE_TYPE = new TagInfoShort("SceneCaptureType", 0xa406, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Scene capture type value: standard. */
    public static final int SCENE_CAPTURE_TYPE_VALUE_STANDARD = 0;
    /** Scene capture type value: landscape. */
    public static final int SCENE_CAPTURE_TYPE_VALUE_LANDSCAPE = 1;
    /** Scene capture type value: portrait. */
    public static final int SCENE_CAPTURE_TYPE_VALUE_PORTRAIT = 2;
    /** Scene capture type value: night. */
    public static final int SCENE_CAPTURE_TYPE_VALUE_NIGHT = 3;
    /** Gain control tag. */
    public static final TagInfoShort EXIF_TAG_GAIN_CONTROL = new TagInfoShort("GainControl", 0xa407, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Gain control value: none. */
    public static final int GAIN_CONTROL_VALUE_NONE = 0;
    /** Gain control value: low gain up. */
    public static final int GAIN_CONTROL_VALUE_LOW_GAIN_UP = 1;
    /** Gain control value: high gain up. */
    public static final int GAIN_CONTROL_VALUE_HIGH_GAIN_UP = 2;
    /** Gain control value: low gain down. */
    public static final int GAIN_CONTROL_VALUE_LOW_GAIN_DOWN = 3;
    /** Gain control value: high gain down. */
    public static final int GAIN_CONTROL_VALUE_HIGH_GAIN_DOWN = 4;
    /** Contrast tag. */
    public static final TagInfoShort EXIF_TAG_CONTRAST_1 = new TagInfoShort("Contrast", 0xa408, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Contrast value: normal. */
    public static final int CONTRAST_1_VALUE_NORMAL = 0;
    /** Contrast value: low. */
    public static final int CONTRAST_1_VALUE_LOW = 1;
    /** Contrast value: high. */
    public static final int CONTRAST_1_VALUE_HIGH = 2;
    /** Saturation tag. */
    public static final TagInfoShort EXIF_TAG_SATURATION_1 = new TagInfoShort("Saturation", 0xa409, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Saturation value: normal. */
    public static final int SATURATION_1_VALUE_NORMAL = 0;
    /** Saturation value: low. */
    public static final int SATURATION_1_VALUE_LOW = 1;
    /** Saturation value: high. */
    public static final int SATURATION_1_VALUE_HIGH = 2;
    /** Sharpness tag. */
    public static final TagInfoShort EXIF_TAG_SHARPNESS_1 = new TagInfoShort("Sharpness", 0xa40a, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Sharpness value: normal. */
    public static final int SHARPNESS_1_VALUE_NORMAL = 0;
    /** Sharpness value: soft. */
    public static final int SHARPNESS_1_VALUE_SOFT = 1;
    /** Sharpness value: hard. */
    public static final int SHARPNESS_1_VALUE_HARD = 2;
    /** Device setting description tag. */
    public static final TagInfoUndefineds EXIF_TAG_DEVICE_SETTING_DESCRIPTION = new TagInfoUndefineds("DeviceSettingDescription", 0xa40b, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_SUBJECT_DISTANCE_RANGE = new TagInfoShort("SubjectDistanceRange", 0xa40c,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Subject distance range value: macro. */
    public static final int SUBJECT_DISTANCE_RANGE_VALUE_MACRO = 1;
    /** Subject distance range value: close. */
    public static final int SUBJECT_DISTANCE_RANGE_VALUE_CLOSE = 2;
    /** Subject distance range value: distant. */
    public static final int SUBJECT_DISTANCE_RANGE_VALUE_DISTANT = 3;
    /** Image unique ID tag. */
    public static final TagInfoAscii EXIF_TAG_IMAGE_UNIQUE_ID = new TagInfoAscii("ImageUniqueID", 0xa420, 33, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Camera owner name tag. */
    public static final TagInfoAscii EXIF_TAG_CAMERA_OWNER_NAME = new TagInfoAscii("CameraOwnerName", 0xa430, -1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Body serial number tag. */
    public static final TagInfoAscii EXIF_TAG_BODY_SERIAL_NUMBER = new TagInfoAscii("BodySerialNumber", 0xa431, -1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Lens specification tag. */
    public static final TagInfoRationals EXIF_TAG_LENS_SPECIFICATION = new TagInfoRationals("LensSpecification", 0xa432, 4,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Lens make tag. */
    public static final TagInfoAscii EXIF_TAG_LENS_MAKE = new TagInfoAscii("LensMake", 0xa433, -1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Lens model tag. */
    public static final TagInfoAscii EXIF_TAG_LENS_MODEL = new TagInfoAscii("LensModel", 0xa434, -1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Lens serial number tag. */
    public static final TagInfoAscii EXIF_TAG_LENS_SERIAL_NUMBER = new TagInfoAscii("LensSerialNumber", 0xa435, -1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Gamma tag. */
    public static final TagInfoRational EXIF_TAG_GAMMA = new TagInfoRational("Gamma", 0xa500, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Annotations tag. */
    public static final TagInfoUnknowns EXIF_TAG_ANNOTATIONS = new TagInfoUnknowns("Annotations", 0xc44f, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /** Print image matching tag. */
    public static final TagInfoUndefined EXIF_TAG_PRINT_IM = new TagInfoUndefined("PrintIM", 0xc4a5, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    /** Offset schema tag. */
    public static final TagInfoSLong EXIF_TAG_OFFSET_SCHEMA = new TagInfoSLong("OffsetSchema", 0xea1d, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Owner name tag. */
    public static final TagInfoAscii EXIF_TAG_OWNER_NAME = new TagInfoAscii("OwnerName", 0xfde8, -1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Serial number tag. */
    public static final TagInfoAscii EXIF_TAG_SERIAL_NUMBER = new TagInfoAscii("SerialNumber", 0xfde9, -1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Lens tag. */
    public static final TagInfoAscii EXIF_TAG_LENS = new TagInfoAscii("Lens", 0xfdea, -1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Raw file tag. */
    public static final TagInfoAscii EXIF_TAG_RAW_FILE = new TagInfoAscii("RawFile", 0xfe4c, -1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Converter tag. */
    public static final TagInfoAscii EXIF_TAG_CONVERTER = new TagInfoAscii("Converter", 0xfe4d, -1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** White balance (alternative) tag. */
    public static final TagInfoAscii EXIF_TAG_WHITE_BALANCE_2 = new TagInfoAscii("WhiteBalance", 0xfe4e, -1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Exposure tag. */
    public static final TagInfoAscii EXIF_TAG_EXPOSURE = new TagInfoAscii("Exposure", 0xfe51, -1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Shadows tag. */
    public static final TagInfoAscii EXIF_TAG_SHADOWS = new TagInfoAscii("Shadows", 0xfe52, -1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Brightness tag. */
    public static final TagInfoAscii EXIF_TAG_BRIGHTNESS = new TagInfoAscii("Brightness", 0xfe53, -1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Contrast (alternative) tag. */
    public static final TagInfoAscii EXIF_TAG_CONTRAST_2 = new TagInfoAscii("Contrast", 0xfe54, -1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Saturation (alternative) tag. */
    public static final TagInfoAscii EXIF_TAG_SATURATION_2 = new TagInfoAscii("Saturation", 0xfe55, -1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Sharpness (alternative) tag. */
    public static final TagInfoAscii EXIF_TAG_SHARPNESS_2 = new TagInfoAscii("Sharpness", 0xfe56, -1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Smoothness tag. */
    public static final TagInfoAscii EXIF_TAG_SMOOTHNESS = new TagInfoAscii("Smoothness", 0xfe57, -1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** Moire filter tag. */
    public static final TagInfoAscii EXIF_TAG_MOIRE_FILTER = new TagInfoAscii("MoireFilter", 0xfe58, -1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /** All EXIF tags. */
    public static final List<TagInfo> ALL_EXIF_TAGS = Collections.unmodifiableList(Arrays.asList(EXIF_TAG_INTEROPERABILITY_INDEX,
            EXIF_TAG_INTEROPERABILITY_VERSION, EXIF_TAG_PROCESSING_SOFTWARE, EXIF_TAG_SOFTWARE, EXIF_TAG_PREVIEW_IMAGE_START_IFD0,
            EXIF_TAG_PREVIEW_IMAGE_START_SUB_IFD1, EXIF_TAG_JPG_FROM_RAW_START_SUB_IFD2, EXIF_TAG_PREVIEW_IMAGE_LENGTH_IFD0,
            EXIF_TAG_PREVIEW_IMAGE_LENGTH_SUB_IFD1, EXIF_TAG_JPG_FROM_RAW_LENGTH_SUB_IFD2, EXIF_TAG_PREVIEW_IMAGE_START_MAKER_NOTES,
            EXIF_TAG_JPG_FROM_RAW_START_SUB_IFD, EXIF_TAG_JPG_FROM_RAW_START_IFD2, EXIF_TAG_OTHER_IMAGE_START, EXIF_TAG_PREVIEW_IMAGE_LENGTH_MAKER_NOTES,
            EXIF_TAG_JPG_FROM_RAW_LENGTH_SUB_IFD, EXIF_TAG_JPG_FROM_RAW_LENGTH_IFD2, EXIF_TAG_OTHER_IMAGE_LENGTH, EXIF_TAG_APPLICATION_NOTES, EXIF_TAG_MATTEING,
            EXIF_TAG_DATA_TYPE, EXIF_TAG_IMAGE_DEPTH, EXIF_TAG_TILE_DEPTH, EXIF_TAG_MODEL_2, EXIF_TAG_EXPOSURE_TIME, EXIF_TAG_FNUMBER, EXIF_TAG_IPTC_NAA,
            EXIF_TAG_INTERGRAPH_PACKET_DATA, EXIF_TAG_INTERGRAPH_FLAG_REGISTERS, EXIF_TAG_SITE, EXIF_TAG_COLOR_SEQUENCE, EXIF_TAG_IT8HEADER,
            EXIF_TAG_RASTER_PADDING, EXIF_TAG_BITS_PER_RUN_LENGTH, EXIF_TAG_BITS_PER_EXTENDED_RUN_LENGTH, EXIF_TAG_COLOR_TABLE, EXIF_TAG_IMAGE_COLOR_INDICATOR,
            EXIF_TAG_BACKGROUND_COLOR_INDICATOR, EXIF_TAG_IMAGE_COLOR_VALUE, EXIF_TAG_BACKGROUND_COLOR_VALUE, EXIF_TAG_PIXEL_INTENSITY_RANGE,
            EXIF_TAG_TRANSPARENCY_INDICATOR, EXIF_TAG_COLOR_CHARACTERIZATION, EXIF_TAG_HCUSAGE, EXIF_TAG_SEMINFO, EXIF_TAG_AFCP_IPTC, EXIF_TAG_LEAF_DATA,
            EXIF_TAG_PHOTOSHOP_SETTINGS, EXIF_TAG_EXIF_OFFSET, EXIF_TAG_EXPOSURE_PROGRAM, EXIF_TAG_SPECTRAL_SENSITIVITY, EXIF_TAG_GPSINFO, EXIF_TAG_ISO,
            EXIF_TAG_OPTO_ELECTRIC_CONV_FACTOR, EXIF_TAG_LEAF_SUB_IFD, EXIF_TAG_EXIF_VERSION, EXIF_TAG_DATE_TIME_ORIGINAL, EXIF_TAG_DATE_TIME_DIGITIZED,
            EXIF_TAG_COMPONENTS_CONFIGURATION, EXIF_TAG_COMPRESSED_BITS_PER_PIXEL, EXIF_TAG_SHUTTER_SPEED_VALUE, EXIF_TAG_APERTURE_VALUE,
            EXIF_TAG_BRIGHTNESS_VALUE, EXIF_TAG_EXPOSURE_COMPENSATION, EXIF_TAG_MAX_APERTURE_VALUE, EXIF_TAG_SUBJECT_DISTANCE, EXIF_TAG_IMAGE_UNIQUE_ID,
            EXIF_TAG_CAMERA_OWNER_NAME, EXIF_TAG_BODY_SERIAL_NUMBER, EXIF_TAG_LENS_SPECIFICATION, EXIF_TAG_LENS_MAKE, EXIF_TAG_LENS_MODEL,
            EXIF_TAG_LENS_SERIAL_NUMBER, EXIF_TAG_METERING_MODE, EXIF_TAG_LIGHT_SOURCE, EXIF_TAG_FLASH, EXIF_TAG_FOCAL_LENGTH, EXIF_TAG_SUBJECT_AREA,
            EXIF_TAG_STO_NITS, EXIF_TAG_SUB_SEC_TIME, EXIF_TAG_SUB_SEC_TIME_ORIGINAL, EXIF_TAG_SUB_SEC_TIME_DIGITIZED, EXIF_TAG_FLASHPIX_VERSION,
            EXIF_TAG_EXIF_IMAGE_WIDTH, EXIF_TAG_EXIF_IMAGE_LENGTH, EXIF_TAG_RELATED_SOUND_FILE, EXIF_TAG_INTEROP_OFFSET, EXIF_TAG_FLASH_ENERGY_EXIF_IFD,
            EXIF_TAG_SPATIAL_FREQUENCY_RESPONSE_2, EXIF_TAG_NOISE_2, EXIF_TAG_FOCAL_PLANE_XRESOLUTION_EXIF_IFD, EXIF_TAG_FOCAL_PLANE_YRESOLUTION_EXIF_IFD,
            EXIF_TAG_FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD, EXIF_TAG_IMAGE_NUMBER, EXIF_TAG_SECURITY_CLASSIFICATION, EXIF_TAG_IMAGE_HISTORY,
            EXIF_TAG_SUBJECT_LOCATION, EXIF_TAG_EXPOSURE_INDEX_EXIF_IFD, EXIF_TAG_TIFF_EPSTANDARD_ID_2, EXIF_TAG_SENSING_METHOD_EXIF_IFD, EXIF_TAG_FILE_SOURCE,
            EXIF_TAG_SCENE_TYPE, EXIF_TAG_CFAPATTERN, EXIF_TAG_CUSTOM_RENDERED, EXIF_TAG_EXPOSURE_MODE, EXIF_TAG_WHITE_BALANCE_1, EXIF_TAG_DIGITAL_ZOOM_RATIO,
            EXIF_TAG_FOCAL_LENGTH_IN_35MM_FORMAT, EXIF_TAG_SCENE_CAPTURE_TYPE, EXIF_TAG_GAIN_CONTROL, EXIF_TAG_CONTRAST_1, EXIF_TAG_SATURATION_1,
            EXIF_TAG_SHARPNESS_1, EXIF_TAG_DEVICE_SETTING_DESCRIPTION, EXIF_TAG_SUBJECT_DISTANCE_RANGE, EXIF_TAG_IMAGE_UNIQUE_ID, EXIF_TAG_GAMMA,
            EXIF_TAG_ANNOTATIONS, EXIF_TAG_PRINT_IM, EXIF_TAG_OFFSET_SCHEMA, EXIF_TAG_OWNER_NAME, EXIF_TAG_SERIAL_NUMBER, EXIF_TAG_LENS, EXIF_TAG_RAW_FILE,
            EXIF_TAG_CONVERTER, EXIF_TAG_WHITE_BALANCE_2, EXIF_TAG_EXPOSURE, EXIF_TAG_SHADOWS, EXIF_TAG_BRIGHTNESS, EXIF_TAG_CONTRAST_2, EXIF_TAG_SATURATION_2,
            EXIF_TAG_SHARPNESS_2, EXIF_TAG_SMOOTHNESS, EXIF_TAG_MOIRE_FILTER, EXIF_TAG_USER_COMMENT, //
            EXIF_TAG_MAKER_NOTE));

    private ExifTagConstants() {
    }
}
