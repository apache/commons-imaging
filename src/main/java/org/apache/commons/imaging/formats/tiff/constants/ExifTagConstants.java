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
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefined;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknown;

/**
 * References:
 * http://www.sno.phy.queensu.ca/~phil/exiftool/TagNames/EXIF.html
 * http://tiki-lounge.com/~raf/tiff/fields.html
 * http://www.awaresystems.be/imaging/tiff/tifftags.html
 * 
 * "Stonits": http://www.anyhere.com/gward/pixformat/tiffluv.html
 */
public final class ExifTagConstants {

    public static final TagInfoAscii EXIF_TAG_INTEROPERABILITY_INDEX = new TagInfoAscii(
            "InteroperabilityIndex", 0x0001, -1,
            TiffDirectoryType.EXIF_DIRECTORY_INTEROP_IFD);
    public static final TagInfoUndefined EXIF_TAG_INTEROPERABILITY_VERSION = new TagInfoUndefined(
            "InteroperabilityVersion", 0x0002, 1,
            TiffDirectoryType.EXIF_DIRECTORY_INTEROP_IFD);
    public static final TagInfoAscii EXIF_TAG_PROCESSING_SOFTWARE = new TagInfoAscii(
            "ProcessingSoftware", 0x000b, -1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoAscii EXIF_TAG_SOFTWARE = new TagInfoAscii(
            "Software", 0x0131, -1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoLong EXIF_TAG_PREVIEW_IMAGE_START_IFD0 = new TagInfoLong(
            "PreviewImageStart", 0x0111, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0, true);
    public static final TagInfoLong EXIF_TAG_PREVIEW_IMAGE_START_SUB_IFD1 = new TagInfoLong(
            "PreviewImageStart", 0x0111, 1,
            TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD1, true);
    public static final TagInfoLong EXIF_TAG_JPG_FROM_RAW_START_SUB_IFD2 = new TagInfoLong(
            "JpgFromRawStart", 0x0111, 1,
            TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD2, true);
    public static final TagInfoLong EXIF_TAG_PREVIEW_IMAGE_LENGTH_IFD0 = new TagInfoLong(
            "PreviewImageLength", 0x0117, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoLong EXIF_TAG_PREVIEW_IMAGE_LENGTH_SUB_IFD1 = new TagInfoLong(
            "PreviewImageLength", 0x0117, 1,
            TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD1);
    public static final TagInfoLong EXIF_TAG_JPG_FROM_RAW_LENGTH_SUB_IFD2 = new TagInfoLong(
            "JpgFromRawLength", 0x0117, 1,
            TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD2);
    public static final TagInfoLong EXIF_TAG_PREVIEW_IMAGE_START_MAKER_NOTES = new TagInfoLong(
            "PreviewImageStart", 0x0201, 1,
            TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES);
    public static final TagInfoLong EXIF_TAG_JPG_FROM_RAW_START_SUB_IFD = new TagInfoLong(
            "JpgFromRawStart", 0x0201, 1,
            TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD, true);
    public static final TagInfoLong EXIF_TAG_JPG_FROM_RAW_START_IFD2 = new TagInfoLong(
            "JpgFromRawStart", 0x0201, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD2, true);
    public static final TagInfoLong EXIF_TAG_OTHER_IMAGE_START = new TagInfoLong(
            "OtherImageStart", 0x0201, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN, true);
    public static final TagInfoLong EXIF_TAG_PREVIEW_IMAGE_LENGTH_MAKER_NOTES = new TagInfoLong(
            "PreviewImageLength", 0x0202, 1,
            TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES);
    public static final TagInfoLong EXIF_TAG_JPG_FROM_RAW_LENGTH_SUB_IFD = new TagInfoLong(
            "JpgFromRawLength", 0x0202, 1,
            TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD);
    public static final TagInfoLong EXIF_TAG_JPG_FROM_RAW_LENGTH_IFD2 = new TagInfoLong(
            "JpgFromRawLength", 0x0202, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD2);
    public static final TagInfoLong EXIF_TAG_OTHER_IMAGE_LENGTH = new TagInfoLong(
            "OtherImageLength", 0x0202, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_APPLICATION_NOTES = new TagInfoByte(
            "ApplicationNotes", 0x02bc, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUnknown EXIF_TAG_MATTEING = new TagInfoUnknown(
            "Matteing", 0x80e3, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUnknown EXIF_TAG_DATA_TYPE = new TagInfoUnknown(
            "DataType", 0x80e4, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUnknown EXIF_TAG_IMAGE_DEPTH = new TagInfoUnknown(
            "ImageDepth", 0x80e5, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUnknown EXIF_TAG_TILE_DEPTH = new TagInfoUnknown(
            "TileDepth", 0x80e6, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUnknown EXIF_TAG_MODEL_2 = new TagInfoUnknown(
            "Model2", 0x827d, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoRational EXIF_TAG_EXPOSURE_TIME = new TagInfoRational(
            "ExposureTime", 0x829a, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_FNUMBER = new TagInfoRational(
            "FNumber", 0x829d, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    // FIXME: other types?
    public static final TagInfoLong EXIF_TAG_IPTC_NAA = new TagInfoLong(
            "IPTC-NAA", 0x83bb, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoShort EXIF_TAG_INTERGRAPH_PACKET_DATA = new TagInfoShort(
            "IntergraphPacketData", 0x847e, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoLong EXIF_TAG_INTERGRAPH_FLAG_REGISTERS = new TagInfoLong(
            "IntergraphFlagRegisters", 0x847f, 16,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoAscii EXIF_TAG_SITE = new TagInfoAscii(
            "Site", 0x84e0, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoAscii EXIF_TAG_COLOR_SEQUENCE = new TagInfoAscii(
            "ColorSequence", 0x84e1, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoAscii EXIF_TAG_IT8HEADER = new TagInfoAscii(
            "IT8Header", 0x84e2, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_RASTER_PADDING = new TagInfoShort(
            "RasterPadding", 0x84e3, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_BITS_PER_RUN_LENGTH = new TagInfoShort(
            "BitsPerRunLength", 0x84e4, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_BITS_PER_EXTENDED_RUN_LENGTH = new TagInfoShort(
            "BitsPerExtendedRunLength", 0x84e5, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_COLOR_TABLE = new TagInfoByte(
            "ColorTable", 0x84e6, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_IMAGE_COLOR_INDICATOR = new TagInfoByte(
            "ImageColorIndicator", 0x84e7, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_BACKGROUND_COLOR_INDICATOR = new TagInfoByte(
            "BackgroundColorIndicator", 0x84e8, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_IMAGE_COLOR_VALUE = new TagInfoByte(
            "ImageColorValue", 0x84e9, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_BACKGROUND_COLOR_VALUE = new TagInfoByte(
            "BackgroundColorValue", 0x84ea, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_PIXEL_INTENSITY_RANGE = new TagInfoByte(
            "PixelIntensityRange", 0x84eb, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_TRANSPARENCY_INDICATOR = new TagInfoByte(
            "TransparencyIndicator", 0x84ec, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoAscii EXIF_TAG_COLOR_CHARACTERIZATION = new TagInfoAscii(
            "ColorCharacterization", 0x84ed, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShortOrLong EXIF_TAG_HCUSAGE = new TagInfoShortOrLong(
            "HCUsage", 0x84ee, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoAscii EXIF_TAG_SEMINFO = new TagInfoAscii(
            "SEMInfo", 0x8546, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoLong EXIF_TAG_AFCP_IPTC = new TagInfoLong(
            "AFCP_IPTC", 0x8568, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoLong EXIF_TAG_LEAF_DATA = new TagInfoLong(
            "LeafData", 0x8606, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_PHOTOSHOP_SETTINGS = new TagInfoByte(
            "PhotoshopSettings", 0x8649, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoDirectory EXIF_TAG_EXIF_OFFSET = new TagInfoDirectory(
            "ExifOffset", 0x8769, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_EXPOSURE_PROGRAM = new TagInfoShort(
            "ExposureProgram", 0x8822, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int EXPOSURE_PROGRAM_VALUE_MANUAL = 1;
    public static final int EXPOSURE_PROGRAM_VALUE_PROGRAM_AE = 2;
    public static final int EXPOSURE_PROGRAM_VALUE_APERTURE_PRIORITY_AE = 3;
    public static final int EXPOSURE_PROGRAM_VALUE_SHUTTER_SPEED_PRIORITY_AE = 4;
    public static final int EXPOSURE_PROGRAM_VALUE_CREATIVE_SLOW_SPEED = 5;
    public static final int EXPOSURE_PROGRAM_VALUE_ACTION_HIGH_SPEED = 6;
    public static final int EXPOSURE_PROGRAM_VALUE_PORTRAIT = 7;
    public static final int EXPOSURE_PROGRAM_VALUE_LANDSCAPE = 8;
    public static final TagInfoAscii EXIF_TAG_SPECTRAL_SENSITIVITY = new TagInfoAscii(
            "SpectralSensitivity", 0x8824, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoDirectory EXIF_TAG_GPSINFO = new TagInfoDirectory(
            "GPSInfo", 0x8825, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_ISO = new TagInfoShort(
            "PhotographicSensitivity", 0x8827, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoUndefined EXIF_TAG_OPTO_ELECTRIC_CONV_FACTOR = new TagInfoUndefined(
            "Opto - Electric Conv Factor", 0x8828, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoLong EXIF_TAG_LEAF_SUB_IFD = new TagInfoLong(
            "LeafSubIFD", 0x888a, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUndefined EXIF_TAG_EXIF_VERSION = new TagInfoUndefined(
            "ExifVersion", 0x9000, 4,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_DATE_TIME_ORIGINAL = new TagInfoAscii(
            "DateTimeOriginal", 0x9003, 20,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_DATE_TIME_DIGITIZED = new TagInfoAscii(
            "DateTimeDigitized", 0x9004, 20, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoUndefined EXIF_TAG_COMPONENTS_CONFIGURATION = new TagInfoUndefined(
            "ComponentsConfiguration", 0x9101, 4,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_COMPRESSED_BITS_PER_PIXEL = new TagInfoRational(
            "CompressedBitsPerPixel", 0x9102, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoSRational EXIF_TAG_SHUTTER_SPEED_VALUE = new TagInfoSRational(
            "ShutterSpeedValue", 0x9201, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_APERTURE_VALUE = new TagInfoRational(
            "ApertureValue", 0x9202, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoSRational EXIF_TAG_BRIGHTNESS_VALUE = new TagInfoSRational(
            "BrightnessValue", 0x9203, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoSRational EXIF_TAG_EXPOSURE_COMPENSATION = new TagInfoSRational(
            "ExposureCompensation", 0x9204, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_MAX_APERTURE_VALUE = new TagInfoRational(
            "MaxApertureValue", 0x9205, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_SUBJECT_DISTANCE = new TagInfoRational(
            "Subject Distance", 0x9206, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoShort EXIF_TAG_METERING_MODE = new TagInfoShort(
            "MeteringMode", 0x9207, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int METERING_MODE_VALUE_AVERAGE = 1;
    public static final int METERING_MODE_VALUE_CENTER_WEIGHTED_AVERAGE = 2;
    public static final int METERING_MODE_VALUE_SPOT = 3;
    public static final int METERING_MODE_VALUE_MULTI_SPOT = 4;
    public static final int METERING_MODE_VALUE_MULTI_SEGMENT = 5;
    public static final int METERING_MODE_VALUE_PARTIAL = 6;
    public static final int METERING_MODE_VALUE_OTHER = 255;
    public static final TagInfoShort EXIF_TAG_LIGHT_SOURCE = new TagInfoShort(
            "LightSource", 0x9208, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
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
    public static final TagInfoShort EXIF_TAG_FLASH = new TagInfoShort(
            "Flash", 0x9209, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
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
    public static final TagInfoRational EXIF_TAG_FOCAL_LENGTH = new TagInfoRational(
            "FocalLength", 0x920a, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoShort EXIF_TAG_SUBJECT_AREA = new TagInfoShort(
            "SubjectArea", 0x9214, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoDouble EXIF_TAG_STO_NITS = new TagInfoDouble(
            "StoNits", 0x923f, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUndefined EXIF_TAG_MAKER_NOTE = new TagInfoUndefined(
            "MakerNote", 0x927c, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoGpsText EXIF_TAG_USER_COMMENT = new TagInfoGpsText(
            "UserComment", 0x9286, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_SUB_SEC_TIME = new TagInfoAscii(
            "SubSecTime", 0x9290, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_SUB_SEC_TIME_ORIGINAL = new TagInfoAscii(
            "SubSecTimeOriginal", 0x9291, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_SUB_SEC_TIME_DIGITIZED = new TagInfoAscii(
            "SubSecTimeDigitized", 0x9292, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoUndefined EXIF_TAG_FLASHPIX_VERSION = new TagInfoUndefined(
            "FlashpixVersion", 0xa000, 4,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoShort EXIF_TAG_EXIF_IMAGE_WIDTH = new TagInfoShort(
            "ExifImageWidth", 0xa002, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoShort EXIF_TAG_EXIF_IMAGE_LENGTH = new TagInfoShort(
            "ExifImageLength", 0xa003, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_RELATED_SOUND_FILE = new TagInfoAscii(
            "RelatedSoundFile", 0xa004, 13,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoDirectory EXIF_TAG_INTEROP_OFFSET = new TagInfoDirectory(
            "InteropOffset", 0xa005, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoRational EXIF_TAG_FLASH_ENERGY_EXIF_IFD = new TagInfoRational(
            "FlashEnergy", 0xa20b, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoUndefined EXIF_TAG_SPATIAL_FREQUENCY_RESPONSE_2 = new TagInfoUndefined(
            "SpatialFrequencyResponse", 0xa20c, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUnknown EXIF_TAG_NOISE_2 = new TagInfoUnknown(
            "Noise", 0xa20d, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoRational EXIF_TAG_FOCAL_PLANE_XRESOLUTION_EXIF_IFD = new TagInfoRational(
            "FocalPlaneXResolution", 0xa20e, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_FOCAL_PLANE_YRESOLUTION_EXIF_IFD = new TagInfoRational(
            "FocalPlaneYResolution", 0xa20f, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoShort EXIF_TAG_FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD = new TagInfoShort(
            "FocalPlaneResolutionUnit", 0xa210, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_NONE = 1;
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_INCHES = 2;
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_CM = 3;
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_MM = 4;
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_UM = 5;
    public static final TagInfoUnknown EXIF_TAG_IMAGE_NUMBER = new TagInfoUnknown(
            "ImageNumber", 0xa211, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUnknown EXIF_TAG_SECURITY_CLASSIFICATION = new TagInfoUnknown(
            "SecurityClassification", 0xa212, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUnknown EXIF_TAG_IMAGE_HISTORY = new TagInfoUnknown(
            "ImageHistory", 0xa213, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_SUBJECT_LOCATION = new TagInfoShort(
            "SubjectLocation", 0xa214, 2,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_EXPOSURE_INDEX_EXIF_IFD = new TagInfoRational(
            "ExposureIndex", 0xa215, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoUnknown EXIF_TAG_TIFF_EPSTANDARD_ID_2 = new TagInfoUnknown(
            "TIFF-EPStandardID", 0xa216, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_SENSING_METHOD_EXIF_IFD = new TagInfoShort(
            "SensingMethod", 0xa217, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int SENSING_METHOD_EXIF_IFD_VALUE_NOT_DEFINED = 1;
    public static final int SENSING_METHOD_EXIF_IFD_VALUE_ONE_CHIP_COLOR_AREA = 2;
    public static final int SENSING_METHOD_EXIF_IFD_VALUE_TWO_CHIP_COLOR_AREA = 3;
    public static final int SENSING_METHOD_EXIF_IFD_VALUE_THREE_CHIP_COLOR_AREA = 4;
    public static final int SENSING_METHOD_EXIF_IFD_VALUE_COLOR_SEQUENTIAL_AREA = 5;
    public static final int SENSING_METHOD_EXIF_IFD_VALUE_TRILINEAR = 7;
    public static final int SENSING_METHOD_EXIF_IFD_VALUE_COLOR_SEQUENTIAL_LINEAR = 8;
    public static final TagInfoUndefined EXIF_TAG_FILE_SOURCE = new TagInfoUndefined(
            "FileSource", 0xa300, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int FILE_SOURCE_VALUE_FILM_SCANNER = 1;
    public static final int FILE_SOURCE_VALUE_REFLECTION_PRINT_SCANNER = 2;
    public static final int FILE_SOURCE_VALUE_DIGITAL_CAMERA = 3;
    public static final TagInfoUndefined EXIF_TAG_SCENE_TYPE = new TagInfoUndefined(
            "SceneType", 0xa301, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoUndefined EXIF_TAG_CFAPATTERN = new TagInfoUndefined(
            "CFAPattern", 0xa302, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoShort EXIF_TAG_CUSTOM_RENDERED = new TagInfoShort(
            "CustomRendered", 0xa401, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int CUSTOM_RENDERED_VALUE_NORMAL = 0;
    public static final int CUSTOM_RENDERED_VALUE_CUSTOM = 1;
    public static final TagInfoShort EXIF_TAG_EXPOSURE_MODE = new TagInfoShort(
            "ExposureMode", 0xa402, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int EXPOSURE_MODE_VALUE_AUTO = 0;
    public static final int EXPOSURE_MODE_VALUE_MANUAL = 1;
    public static final int EXPOSURE_MODE_VALUE_AUTO_BRACKET = 2;
    public static final TagInfoShort EXIF_TAG_WHITE_BALANCE_1 = new TagInfoShort(
            "WhiteBalance", 0xa403, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int WHITE_BALANCE_1_VALUE_AUTO = 0;
    public static final int WHITE_BALANCE_1_VALUE_MANUAL = 1;
    public static final TagInfoRational EXIF_TAG_DIGITAL_ZOOM_RATIO = new TagInfoRational(
            "DigitalZoomRatio", 0xa404, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoShort EXIF_TAG_FOCAL_LENGTH_IN_35MM_FORMAT = new TagInfoShort(
            "FocalLengthIn35mmFormat", 0xa405, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoShort EXIF_TAG_SCENE_CAPTURE_TYPE = new TagInfoShort(
            "SceneCaptureType", 0xa406, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int SCENE_CAPTURE_TYPE_VALUE_STANDARD = 0;
    public static final int SCENE_CAPTURE_TYPE_VALUE_LANDSCAPE = 1;
    public static final int SCENE_CAPTURE_TYPE_VALUE_PORTRAIT = 2;
    public static final int SCENE_CAPTURE_TYPE_VALUE_NIGHT = 3;
    public static final TagInfoShort EXIF_TAG_GAIN_CONTROL = new TagInfoShort(
            "GainControl", 0xa407, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int GAIN_CONTROL_VALUE_NONE = 0;
    public static final int GAIN_CONTROL_VALUE_LOW_GAIN_UP = 1;
    public static final int GAIN_CONTROL_VALUE_HIGH_GAIN_UP = 2;
    public static final int GAIN_CONTROL_VALUE_LOW_GAIN_DOWN = 3;
    public static final int GAIN_CONTROL_VALUE_HIGH_GAIN_DOWN = 4;
    public static final TagInfoShort EXIF_TAG_CONTRAST_1 = new TagInfoShort(
            "Contrast", 0xa408, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int CONTRAST_1_VALUE_NORMAL = 0;
    public static final int CONTRAST_1_VALUE_LOW = 1;
    public static final int CONTRAST_1_VALUE_HIGH = 2;
    public static final TagInfoShort EXIF_TAG_SATURATION_1 = new TagInfoShort(
            "Saturation", 0xa409, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int SATURATION_1_VALUE_NORMAL = 0;
    public static final int SATURATION_1_VALUE_LOW = 1;
    public static final int SATURATION_1_VALUE_HIGH = 2;
    public static final TagInfoShort EXIF_TAG_SHARPNESS_1 = new TagInfoShort(
            "Sharpness", 0xa40a, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int SHARPNESS_1_VALUE_NORMAL = 0;
    public static final int SHARPNESS_1_VALUE_SOFT = 1;
    public static final int SHARPNESS_1_VALUE_HARD = 2;
    public static final TagInfoUndefined EXIF_TAG_DEVICE_SETTING_DESCRIPTION = new TagInfoUndefined(
            "DeviceSettingDescription", 0xa40b, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_SUBJECT_DISTANCE_RANGE = new TagInfoShort(
            "SubjectDistanceRange", 0xa40c, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int SUBJECT_DISTANCE_RANGE_VALUE_MACRO = 1;
    public static final int SUBJECT_DISTANCE_RANGE_VALUE_CLOSE = 2;
    public static final int SUBJECT_DISTANCE_RANGE_VALUE_DISTANT = 3;
    public static final TagInfoAscii EXIF_TAG_IMAGE_UNIQUE_ID = new TagInfoAscii(
            "ImageUniqueID", 0xa420, 33,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_CAMERA_OWNER_NAME = new TagInfoAscii(
            "CameraOwnerName", 0xa430, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_BODY_SERIAL_NUMBER = new TagInfoAscii(
            "BodySerialNumber", 0xa431, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_LENS_SPECIFICATION = new TagInfoRational(
            "LensSpecification", 0xa432, 4,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_LENS_MAKE = new TagInfoAscii(
            "LensMake", 0xa433, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_LENS_MODEL = new TagInfoAscii(
            "LensModel", 0xa434, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_LENS_SERIAL_NUMBER = new TagInfoAscii(
            "LensSerialNumber", 0xa435, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_GAMMA = new TagInfoRational(
            "Gamma", 0xa500, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoUnknown EXIF_TAG_ANNOTATIONS = new TagInfoUnknown(
            "Annotations", 0xc44f, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUndefined EXIF_TAG_PRINT_IM = new TagInfoUndefined(
            "PrintIM", 0xc4a5, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoSLong EXIF_TAG_OFFSET_SCHEMA = new TagInfoSLong(
            "OffsetSchema", 0xea1d, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_OWNER_NAME = new TagInfoAscii(
            "OwnerName", 0xfde8, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_SERIAL_NUMBER = new TagInfoAscii(
            "SerialNumber", 0xfde9, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_LENS = new TagInfoAscii(
            "Lens", 0xfdea, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_RAW_FILE = new TagInfoAscii(
            "RawFile", 0xfe4c, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_CONVERTER = new TagInfoAscii(
            "Converter", 0xfe4d, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_WHITE_BALANCE_2 = new TagInfoAscii(
            "WhiteBalance", 0xfe4e, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_EXPOSURE = new TagInfoAscii(
            "Exposure", 0xfe51, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_SHADOWS = new TagInfoAscii(
            "Shadows", 0xfe52, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_BRIGHTNESS = new TagInfoAscii(
            "Brightness", 0xfe53, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_CONTRAST_2 = new TagInfoAscii(
            "Contrast", 0xfe54, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_SATURATION_2 = new TagInfoAscii(
            "Saturation", 0xfe55, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_SHARPNESS_2 = new TagInfoAscii(
            "Sharpness", 0xfe56, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_SMOOTHNESS = new TagInfoAscii(
            "Smoothness", 0xfe57, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_MOIRE_FILTER = new TagInfoAscii(
            "MoireFilter", 0xfe58, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);

    public static final List<TagInfo> ALL_EXIF_TAGS =
            Collections.unmodifiableList(Arrays.asList(
                    EXIF_TAG_INTEROPERABILITY_INDEX, EXIF_TAG_INTEROPERABILITY_VERSION,
                    EXIF_TAG_PROCESSING_SOFTWARE,
                    EXIF_TAG_SOFTWARE,
                    EXIF_TAG_PREVIEW_IMAGE_START_IFD0,
                    EXIF_TAG_PREVIEW_IMAGE_START_SUB_IFD1,
                    EXIF_TAG_JPG_FROM_RAW_START_SUB_IFD2,
                    EXIF_TAG_PREVIEW_IMAGE_LENGTH_IFD0,
                    EXIF_TAG_PREVIEW_IMAGE_LENGTH_SUB_IFD1,
                    EXIF_TAG_JPG_FROM_RAW_LENGTH_SUB_IFD2,
                    EXIF_TAG_PREVIEW_IMAGE_START_MAKER_NOTES,
                    EXIF_TAG_JPG_FROM_RAW_START_SUB_IFD,
                    EXIF_TAG_JPG_FROM_RAW_START_IFD2, EXIF_TAG_OTHER_IMAGE_START,
                    EXIF_TAG_PREVIEW_IMAGE_LENGTH_MAKER_NOTES,
                    EXIF_TAG_JPG_FROM_RAW_LENGTH_SUB_IFD,
                    EXIF_TAG_JPG_FROM_RAW_LENGTH_IFD2, EXIF_TAG_OTHER_IMAGE_LENGTH,
                    EXIF_TAG_APPLICATION_NOTES,
                    EXIF_TAG_MATTEING, EXIF_TAG_DATA_TYPE,
                    EXIF_TAG_IMAGE_DEPTH, EXIF_TAG_TILE_DEPTH, EXIF_TAG_MODEL_2,
                    EXIF_TAG_EXPOSURE_TIME,
                    EXIF_TAG_FNUMBER, EXIF_TAG_IPTC_NAA,
                    EXIF_TAG_INTERGRAPH_PACKET_DATA,
                    EXIF_TAG_INTERGRAPH_FLAG_REGISTERS,
                    EXIF_TAG_SITE, EXIF_TAG_COLOR_SEQUENCE,
                    EXIF_TAG_IT8HEADER, EXIF_TAG_RASTER_PADDING,
                    EXIF_TAG_BITS_PER_RUN_LENGTH,
                    EXIF_TAG_BITS_PER_EXTENDED_RUN_LENGTH, EXIF_TAG_COLOR_TABLE,
                    EXIF_TAG_IMAGE_COLOR_INDICATOR,
                    EXIF_TAG_BACKGROUND_COLOR_INDICATOR, EXIF_TAG_IMAGE_COLOR_VALUE,
                    EXIF_TAG_BACKGROUND_COLOR_VALUE, EXIF_TAG_PIXEL_INTENSITY_RANGE,
                    EXIF_TAG_TRANSPARENCY_INDICATOR, EXIF_TAG_COLOR_CHARACTERIZATION,
                    EXIF_TAG_HCUSAGE, EXIF_TAG_SEMINFO, EXIF_TAG_AFCP_IPTC,
                    EXIF_TAG_LEAF_DATA,
                    EXIF_TAG_PHOTOSHOP_SETTINGS, EXIF_TAG_EXIF_OFFSET,
                    EXIF_TAG_EXPOSURE_PROGRAM,
                    EXIF_TAG_SPECTRAL_SENSITIVITY, EXIF_TAG_GPSINFO, EXIF_TAG_ISO,
                    EXIF_TAG_OPTO_ELECTRIC_CONV_FACTOR,
                    EXIF_TAG_LEAF_SUB_IFD,
                    EXIF_TAG_EXIF_VERSION, EXIF_TAG_DATE_TIME_ORIGINAL,
                    EXIF_TAG_DATE_TIME_DIGITIZED, EXIF_TAG_COMPONENTS_CONFIGURATION,
                    EXIF_TAG_COMPRESSED_BITS_PER_PIXEL, EXIF_TAG_SHUTTER_SPEED_VALUE,
                    EXIF_TAG_APERTURE_VALUE, EXIF_TAG_BRIGHTNESS_VALUE,
                    EXIF_TAG_EXPOSURE_COMPENSATION, EXIF_TAG_MAX_APERTURE_VALUE,
                    EXIF_TAG_SUBJECT_DISTANCE, EXIF_TAG_METERING_MODE,
                    EXIF_TAG_LIGHT_SOURCE, EXIF_TAG_FLASH, EXIF_TAG_FOCAL_LENGTH,
                    EXIF_TAG_SUBJECT_AREA,
                    EXIF_TAG_STO_NITS, EXIF_TAG_SUB_SEC_TIME,
                    EXIF_TAG_SUB_SEC_TIME_ORIGINAL, EXIF_TAG_SUB_SEC_TIME_DIGITIZED,
                    EXIF_TAG_FLASHPIX_VERSION,
                    EXIF_TAG_EXIF_IMAGE_WIDTH, EXIF_TAG_EXIF_IMAGE_LENGTH,
                    EXIF_TAG_RELATED_SOUND_FILE, EXIF_TAG_INTEROP_OFFSET,
                    EXIF_TAG_FLASH_ENERGY_EXIF_IFD,
                    EXIF_TAG_SPATIAL_FREQUENCY_RESPONSE_2, EXIF_TAG_NOISE_2,
                    EXIF_TAG_FOCAL_PLANE_XRESOLUTION_EXIF_IFD,
                    EXIF_TAG_FOCAL_PLANE_YRESOLUTION_EXIF_IFD,
                    EXIF_TAG_FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD,
                    EXIF_TAG_IMAGE_NUMBER, EXIF_TAG_SECURITY_CLASSIFICATION,
                    EXIF_TAG_IMAGE_HISTORY, EXIF_TAG_SUBJECT_LOCATION,
                    EXIF_TAG_EXPOSURE_INDEX_EXIF_IFD, EXIF_TAG_TIFF_EPSTANDARD_ID_2,
                    EXIF_TAG_SENSING_METHOD_EXIF_IFD, EXIF_TAG_FILE_SOURCE,
                    EXIF_TAG_SCENE_TYPE, EXIF_TAG_CFAPATTERN, EXIF_TAG_CUSTOM_RENDERED,
                    EXIF_TAG_EXPOSURE_MODE, EXIF_TAG_WHITE_BALANCE_1,
                    EXIF_TAG_DIGITAL_ZOOM_RATIO, EXIF_TAG_FOCAL_LENGTH_IN_35MM_FORMAT,
                    EXIF_TAG_SCENE_CAPTURE_TYPE, EXIF_TAG_GAIN_CONTROL,
                    EXIF_TAG_CONTRAST_1, EXIF_TAG_SATURATION_1, EXIF_TAG_SHARPNESS_1,
                    EXIF_TAG_DEVICE_SETTING_DESCRIPTION,
                    EXIF_TAG_SUBJECT_DISTANCE_RANGE, EXIF_TAG_IMAGE_UNIQUE_ID,
                    EXIF_TAG_GAMMA,
                    EXIF_TAG_ANNOTATIONS, EXIF_TAG_PRINT_IM,
                    EXIF_TAG_OFFSET_SCHEMA, EXIF_TAG_OWNER_NAME,
                    EXIF_TAG_SERIAL_NUMBER, EXIF_TAG_LENS, EXIF_TAG_RAW_FILE,
                    EXIF_TAG_CONVERTER, EXIF_TAG_WHITE_BALANCE_2, EXIF_TAG_EXPOSURE,
                    EXIF_TAG_SHADOWS, EXIF_TAG_BRIGHTNESS, EXIF_TAG_CONTRAST_2,
                    EXIF_TAG_SATURATION_2, EXIF_TAG_SHARPNESS_2, EXIF_TAG_SMOOTHNESS,
                    EXIF_TAG_MOIRE_FILTER,
        
                    EXIF_TAG_USER_COMMENT, //
        
                    EXIF_TAG_MAKER_NOTE));

    private ExifTagConstants() {
    }
}
