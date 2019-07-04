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
 * EXIF tags and value constants stored in the {@code Exif} image file directory
 * of a TIFF file.
 *
 * <P>The <A HREF="http://www.cipa.jp">Camera &amp; Imaging Products Association (CIPA)</A>
 * is the driving body behind the EXIF standard.</P>
 * @see <A HREF="http://www.cipa.jp/std/std-sec_e.html">EXIF Specification</A>
 * @see <A HREF="https://www.sno.phy.queensu.ca/~phil/exiftool/TagNames/EXIF.html">List of EXIF tags supported by</A> <A HREF="https://www.sno.phy.queensu.ca/~phil/exiftool"><CODE>exiftool</CODE></A>
 * @see <A HREF="http://tiki-lounge.com/~raf/tiff/fields.html">http://tiki-lounge.com/~raf/tiff/fields.html</A>
 * @see <A HREF="http://www.awaresystems.be/imaging/tiff/tifftags.html">AWare Systems&rsquo; Imaging / TIFF / TIFF Tag Reference</A>
 * @see <A HREF="http://www.anyhere.com/gward/pixformat/tiffluv.html">LogLuv Encoding &ldquo;StoNits&rdquo; for TIFF Images</A>
 */
public final class ExifTagConstants {

    public static final TagInfoAscii EXIF_TAG_INTEROPERABILITY_INDEX = new TagInfoAscii(
            "InteroperabilityIndex", 0x0001, -1,
            TiffDirectoryType.EXIF_DIRECTORY_INTEROP_IFD);
    public static final TagInfoUndefined EXIF_TAG_INTEROPERABILITY_VERSION = new TagInfoUndefined(
            "InteroperabilityVersion", 0x0002,
            TiffDirectoryType.EXIF_DIRECTORY_INTEROP_IFD);
    public static final TagInfoAscii EXIF_TAG_PROCESSING_SOFTWARE = new TagInfoAscii(
            "ProcessingSoftware", 0x000b, -1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoAscii EXIF_TAG_SOFTWARE = new TagInfoAscii(
            "Software", 0x0131, -1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoLong EXIF_TAG_PREVIEW_IMAGE_START_IFD0 = new TagInfoLong(
            "PreviewImageStart", 0x0111,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0, true);
    public static final TagInfoLong EXIF_TAG_PREVIEW_IMAGE_START_SUB_IFD1 = new TagInfoLong(
            "PreviewImageStart", 0x0111,
            TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD1, true);
    public static final TagInfoLong EXIF_TAG_JPG_FROM_RAW_START_SUB_IFD2 = new TagInfoLong(
            "JpgFromRawStart", 0x0111,
            TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD2, true);
    public static final TagInfoLong EXIF_TAG_PREVIEW_IMAGE_LENGTH_IFD0 = new TagInfoLong(
            "PreviewImageLength", 0x0117,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoLong EXIF_TAG_PREVIEW_IMAGE_LENGTH_SUB_IFD1 = new TagInfoLong(
            "PreviewImageLength", 0x0117,
            TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD1);
    public static final TagInfoLong EXIF_TAG_JPG_FROM_RAW_LENGTH_SUB_IFD2 = new TagInfoLong(
            "JpgFromRawLength", 0x0117,
            TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD2);
    public static final TagInfoLong EXIF_TAG_PREVIEW_IMAGE_START_MAKER_NOTES = new TagInfoLong(
            "PreviewImageStart", 0x0201,
            TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES);
    public static final TagInfoLong EXIF_TAG_JPG_FROM_RAW_START_SUB_IFD = new TagInfoLong(
            "JpgFromRawStart", 0x0201,
            TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD, true);
    public static final TagInfoLong EXIF_TAG_JPG_FROM_RAW_START_IFD2 = new TagInfoLong(
            "JpgFromRawStart", 0x0201,
            TiffDirectoryType.EXIF_DIRECTORY_IFD2, true);
    public static final TagInfoLong EXIF_TAG_OTHER_IMAGE_START = new TagInfoLong(
            "OtherImageStart", 0x0201,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN, true);
    public static final TagInfoLong EXIF_TAG_PREVIEW_IMAGE_LENGTH_MAKER_NOTES = new TagInfoLong(
            "PreviewImageLength", 0x0202,
            TiffDirectoryType.EXIF_DIRECTORY_MAKER_NOTES);
    public static final TagInfoLong EXIF_TAG_JPG_FROM_RAW_LENGTH_SUB_IFD = new TagInfoLong(
            "JpgFromRawLength", 0x0202,
            TiffDirectoryType.EXIF_DIRECTORY_SUB_IFD);
    public static final TagInfoLong EXIF_TAG_JPG_FROM_RAW_LENGTH_IFD2 = new TagInfoLong(
            "JpgFromRawLength", 0x0202,
            TiffDirectoryType.EXIF_DIRECTORY_IFD2);
    public static final TagInfoLong EXIF_TAG_OTHER_IMAGE_LENGTH = new TagInfoLong(
            "OtherImageLength", 0x0202,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoBytes EXIF_TAG_APPLICATION_NOTES = new TagInfoBytes(
            "ApplicationNotes", 0x02bc, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUnknowns EXIF_TAG_MATTEING = new TagInfoUnknowns(
            "Matteing", 0x80e3, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUnknowns EXIF_TAG_DATA_TYPE = new TagInfoUnknowns(
            "DataType", 0x80e4, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUnknowns EXIF_TAG_IMAGE_DEPTH = new TagInfoUnknowns(
            "ImageDepth", 0x80e5, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUnknowns EXIF_TAG_TILE_DEPTH = new TagInfoUnknowns(
            "TileDepth", 0x80e6, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUnknowns EXIF_TAG_MODEL_2 = new TagInfoUnknowns(
            "Model2", 0x827d, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoRationals EXIF_TAG_EXPOSURE_TIME = new TagInfoRationals(
            "ExposureTime", 0x829a, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRationals EXIF_TAG_FNUMBER = new TagInfoRationals(
            "FNumber", 0x829d, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    // FIXME: other types?
    public static final TagInfoLong EXIF_TAG_IPTC_NAA = new TagInfoLong(
            "IPTC-NAA", 0x83bb,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoShorts EXIF_TAG_INTERGRAPH_PACKET_DATA = new TagInfoShorts(
            "IntergraphPacketData", 0x847e, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoLongs EXIF_TAG_INTERGRAPH_FLAG_REGISTERS = new TagInfoLongs(
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
            "RasterPadding", 0x84e3,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_BITS_PER_RUN_LENGTH = new TagInfoShort(
            "BitsPerRunLength", 0x84e4,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_BITS_PER_EXTENDED_RUN_LENGTH = new TagInfoShort(
            "BitsPerExtendedRunLength", 0x84e5,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoBytes EXIF_TAG_COLOR_TABLE = new TagInfoBytes(
            "ColorTable", 0x84e6, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_IMAGE_COLOR_INDICATOR = new TagInfoByte(
            "ImageColorIndicator", 0x84e7,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_BACKGROUND_COLOR_INDICATOR = new TagInfoByte(
            "BackgroundColorIndicator", 0x84e8,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoBytes EXIF_TAG_IMAGE_COLOR_VALUE = new TagInfoBytes(
            "ImageColorValue", 0x84e9, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoBytes EXIF_TAG_BACKGROUND_COLOR_VALUE = new TagInfoBytes(
            "BackgroundColorValue", 0x84ea, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoBytes EXIF_TAG_PIXEL_INTENSITY_RANGE = new TagInfoBytes(
            "PixelIntensityRange", 0x84eb, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoByte EXIF_TAG_TRANSPARENCY_INDICATOR = new TagInfoByte(
            "TransparencyIndicator", 0x84ec,
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
            "AFCP_IPTC", 0x8568,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoLong EXIF_TAG_LEAF_DATA = new TagInfoLong(
            "LeafData", 0x8606,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoBytes EXIF_TAG_PHOTOSHOP_SETTINGS = new TagInfoBytes(
            "PhotoshopSettings", 0x8649, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoDirectory EXIF_TAG_EXIF_OFFSET = new TagInfoDirectory(
            "ExifOffset", 0x8769,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_EXPOSURE_PROGRAM = new TagInfoShort(
            "ExposureProgram", 0x8822,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final short EXPOSURE_PROGRAM_VALUE_MANUAL = 1;
    public static final short EXPOSURE_PROGRAM_VALUE_PROGRAM_AE = 2;
    public static final short EXPOSURE_PROGRAM_VALUE_APERTURE_PRIORITY_AE = 3;
    public static final short EXPOSURE_PROGRAM_VALUE_SHUTTER_SPEED_PRIORITY_AE = 4;
    public static final short EXPOSURE_PROGRAM_VALUE_CREATIVE_SLOW_SPEED = 5;
    public static final short EXPOSURE_PROGRAM_VALUE_ACTION_HIGH_SPEED = 6;
    public static final short EXPOSURE_PROGRAM_VALUE_PORTRAIT = 7;
    public static final short EXPOSURE_PROGRAM_VALUE_LANDSCAPE = 8;
    public static final TagInfoAscii EXIF_TAG_SPECTRAL_SENSITIVITY = new TagInfoAscii(
            "SpectralSensitivity", 0x8824, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoDirectory EXIF_TAG_GPSINFO = new TagInfoDirectory(
            "GPSInfo", 0x8825,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShorts EXIF_TAG_ISO = new TagInfoShorts(
            "PhotographicSensitivity", 0x8827, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /**
     * @deprecated The tag does not comply with the EXIF specification.
     * Use {@link #EXIF_TAG_OECF} instead.
     * @see #EXIF_TAG_OECF
     */
    @Deprecated
    public static final TagInfoUndefineds EXIF_TAG_OPTO_ELECTRIC_CONV_FACTOR = new TagInfoUndefineds(
            "Opto - Electric Conv Factor", 0x8828, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUndefineds EXIF_TAG_OECF = new TagInfoUndefineds(
            "OECF", 0x8828, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_SENSITIVITY_TYPE = new TagInfoShort(
            "SensitivityType", 0x8830,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final short SENSITIVITY_TYPE_VALUE_UNKNOWN = 0;
    public static final short SENSITIVITY_TYPE_VALUE_SOS = 1;
    public static final short SENSITIVITY_TYPE_VALUE_REI = 2;
    public static final short SENSITIVITY_TYPE_VALUE_ISO = 3;
    public static final short SENSITIVITY_TYPE_VALUE_SOS_REI = 4;
    public static final short SENSITIVITY_TYPE_VALUE_SOS_ISO = 5;
    public static final short SENSITIVITY_TYPE_VALUE_REI_ISO = 6;
    public static final short SENSITIVITY_TYPE_VALUE_SOS_REI_ISO = 7;
    public static final TagInfoLong EXIF_TAG_STANDARD_OUTPUT_SENSITIVITY = new TagInfoLong(
            "StandardOutputSensitivity", 0x8831,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoLong EXIF_TAG_RECOMMENDED_EXPOSURE_INDEX = new TagInfoLong(
            "RecommendedExposureIndex", 0x8832,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoLong EXIF_TAG_ISO_SPEED = new TagInfoLong(
            "ISOSpeed", 0x8833,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoLong EXIF_TAG_ISO_SPEED_LATITUDE_YYY = new TagInfoLong(
            "ISOSpeedLatitudeyyy", 0x8834,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoLong EXIF_TAG_ISO_SPEED_LATITUDE_ZZZ = new TagInfoLong(
            "ISOSpeedLatitudezzz", 0x8835,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoLong EXIF_TAG_LEAF_SUB_IFD = new TagInfoLong(
            "LeafSubIFD", 0x888a,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUndefineds EXIF_TAG_EXIF_VERSION = new TagInfoUndefineds(
            "ExifVersion", 0x9000, 4,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_DATE_TIME_ORIGINAL = new TagInfoAscii(
            "DateTimeOriginal", 0x9003, 20,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_DATE_TIME_DIGITIZED = new TagInfoAscii(
            "DateTimeDigitized", 0x9004, 20,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoUndefineds EXIF_TAG_COMPONENTS_CONFIGURATION = new TagInfoUndefineds(
            "ComponentsConfiguration", 0x9101, 4,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_OFFSET_TIME = new TagInfoAscii(
            "OffsetTime", 0x9010, 7,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_OFFSET_TIME_ORIGINAL = new TagInfoAscii(
            "OffsetTimeOriginal", 0x9011, 7,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_OFFSET_TIME_DIGITIZED = new TagInfoAscii(
            "OffsetTimeDigitized", 0x9012, 7,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_COMPRESSED_BITS_PER_PIXEL = new TagInfoRational(
            "CompressedBitsPerPixel", 0x9102,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoSRational EXIF_TAG_SHUTTER_SPEED_VALUE = new TagInfoSRational(
            "ShutterSpeedValue", 0x9201,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_APERTURE_VALUE = new TagInfoRational(
            "ApertureValue", 0x9202,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoSRational EXIF_TAG_BRIGHTNESS_VALUE = new TagInfoSRational(
            "BrightnessValue", 0x9203,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /**
     * @deprecated The tag does not comply with the EXIF specification.
     * Use {@link #EXIF_TAG_EXPOSURE_BIAS_VALUE} instead.
     * @see #EXIF_TAG_EXPOSURE_BIAS_VALUE
     */
    @Deprecated
    public static final TagInfoSRational EXIF_TAG_EXPOSURE_COMPENSATION = new TagInfoSRational(
            "ExposureCompensation", 0x9204,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoSRational EXIF_TAG_EXPOSURE_BIAS_VALUE = new TagInfoSRational(
            "ExposureBiasValue", 0x9204,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_MAX_APERTURE_VALUE = new TagInfoRational(
            "MaxApertureValue", 0x9205,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRationals EXIF_TAG_SUBJECT_DISTANCE = new TagInfoRationals(
            "SubjectDistance", 0x9206, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoShort EXIF_TAG_METERING_MODE = new TagInfoShort(
            "MeteringMode", 0x9207,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final short METERING_MODE_VALUE_UNKNOWN = 0;
    public static final short METERING_MODE_VALUE_AVERAGE = 1;
    public static final short METERING_MODE_VALUE_CENTER_WEIGHTED_AVERAGE = 2;
    public static final short METERING_MODE_VALUE_SPOT = 3;
    public static final short METERING_MODE_VALUE_MULTI_SPOT = 4;
    public static final short METERING_MODE_VALUE_MULTI_SEGMENT = 5;
    public static final short METERING_MODE_VALUE_PARTIAL = 6;
    public static final short METERING_MODE_VALUE_OTHER = 255;
    public static final short METERING_MODE_DEFAULT_VALUE =
        METERING_MODE_VALUE_UNKNOWN;
    public static final TagInfoShort EXIF_TAG_LIGHT_SOURCE = new TagInfoShort(
            "LightSource", 0x9208,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final short LIGHT_SOURCE_VALUE_UNKNOWN = 0;
    public static final short LIGHT_SOURCE_VALUE_DAYLIGHT = 1;
    public static final short LIGHT_SOURCE_VALUE_FLUORESCENT = 2;
    public static final short LIGHT_SOURCE_VALUE_TUNGSTEN = 3;
    public static final short LIGHT_SOURCE_VALUE_FLASH = 4;
    public static final short LIGHT_SOURCE_VALUE_FINE_WEATHER = 9;
    public static final short LIGHT_SOURCE_VALUE_CLOUDY = 10;
    public static final short LIGHT_SOURCE_VALUE_SHADE = 11;
    public static final short LIGHT_SOURCE_VALUE_DAYLIGHT_FLUORESCENT = 12;
    public static final short LIGHT_SOURCE_VALUE_DAY_WHITE_FLUORESCENT = 13;
    public static final short LIGHT_SOURCE_VALUE_COOL_WHITE_FLUORESCENT = 14;
    public static final short LIGHT_SOURCE_VALUE_WHITE_FLUORESCENT = 15;
    public static final short LIGHT_SOURCE_VALUE_STANDARD_LIGHT_A = 17;
    public static final short LIGHT_SOURCE_VALUE_STANDARD_LIGHT_B = 18;
    public static final short LIGHT_SOURCE_VALUE_STANDARD_LIGHT_C = 19;
    public static final short LIGHT_SOURCE_VALUE_D55 = 20;
    public static final short LIGHT_SOURCE_VALUE_D65 = 21;
    public static final short LIGHT_SOURCE_VALUE_D75 = 22;
    public static final short LIGHT_SOURCE_VALUE_D50 = 23;
    public static final short LIGHT_SOURCE_VALUE_ISO_STUDIO_TUNGSTEN = 24;
    public static final short LIGHT_SOURCE_VALUE_OTHER = 255;
    public static final short LIGHT_SOURCE_DEFAULT_VALUE =
        LIGHT_SOURCE_VALUE_UNKNOWN;
    public static final TagInfoShort EXIF_TAG_FLASH = new TagInfoShort(
            "Flash", 0x9209,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final short FLASH_VALUE_NO_FLASH = 0x0;
    public static final short FLASH_VALUE_FIRED = 0x1;
    public static final short FLASH_VALUE_FIRED_RETURN_NOT_DETECTED = 0x5;
    public static final short FLASH_VALUE_FIRED_RETURN_DETECTED = 0x7;
    public static final short FLASH_VALUE_ON_DID_NOT_FIRE = 0x8;
    public static final short FLASH_VALUE_ON = 0x9;
    public static final short FLASH_VALUE_ON_RETURN_NOT_DETECTED = 0xd;
    public static final short FLASH_VALUE_ON_RETURN_DETECTED = 0xf;
    public static final short FLASH_VALUE_OFF = 0x10;
    public static final short FLASH_VALUE_OFF_DID_NOT_FIRE_RETURN_NOT_DETECTED = 0x14;
    public static final short FLASH_VALUE_AUTO_DID_NOT_FIRE = 0x18;
    public static final short FLASH_VALUE_AUTO_FIRED = 0x19;
    public static final short FLASH_VALUE_AUTO_FIRED_RETURN_NOT_DETECTED = 0x1d;
    public static final short FLASH_VALUE_AUTO_FIRED_RETURN_DETECTED = 0x1f;
    public static final short FLASH_VALUE_NO_FLASH_FUNCTION = 0x20;
    public static final short FLASH_VALUE_OFF_NO_FLASH_FUNCTION = 0x30;
    public static final short FLASH_VALUE_FIRED_RED_EYE_REDUCTION = 0x41;
    public static final short FLASH_VALUE_FIRED_RED_EYE_REDUCTION_RETURN_NOT_DETECTED = 0x45;
    public static final short FLASH_VALUE_FIRED_RED_EYE_REDUCTION_RETURN_DETECTED = 0x47;
    public static final short FLASH_VALUE_ON_RED_EYE_REDUCTION = 0x49;
    public static final short FLASH_VALUE_ON_RED_EYE_REDUCTION_RETURN_NOT_DETECTED = 0x4d;
    public static final short FLASH_VALUE_ON_RED_EYE_REDUCTION_RETURN_DETECTED = 0x4f;
    public static final short FLASH_VALUE_OFF_RED_EYE_REDUCTION = 0x50;
    public static final short FLASH_VALUE_AUTO_DID_NOT_FIRE_RED_EYE_REDUCTION = 0x58;
    public static final short FLASH_VALUE_AUTO_FIRED_RED_EYE_REDUCTION = 0x59;
    public static final short FLASH_VALUE_AUTO_FIRED_RED_EYE_REDUCTION_RETURN_NOT_DETECTED = 0x5d;
    public static final short FLASH_VALUE_AUTO_FIRED_RED_EYE_REDUCTION_RETURN_DETECTED = 0x5f;
    public static final TagInfoRationals EXIF_TAG_FOCAL_LENGTH = new TagInfoRationals(
            "FocalLength", 0x920a, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoShorts EXIF_TAG_SUBJECT_AREA = new TagInfoShorts(
            "SubjectArea", 0x9214, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoDouble EXIF_TAG_STO_NITS = new TagInfoDouble(
            "StoNits", 0x923f,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUndefineds EXIF_TAG_MAKER_NOTE = new TagInfoUndefineds(
            "MakerNote", 0x927c, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoGpsText EXIF_TAG_USER_COMMENT = new TagInfoGpsText(
            "UserComment", 0x9286,
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
    public static final TagInfoSRational EXIF_TAG_TEMPERATURE = new TagInfoSRational(
            "Temperature", 0x9400,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_HUMIDITY = new TagInfoRational(
            "Humidity", 0x9401,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_PRESSURE = new TagInfoRational(
            "Pressure", 0x9402,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_WATER_DEPTH = new TagInfoRational(
            "WaterDepth", 0x9403,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_ACCELERATION = new TagInfoRational(
            "Acceleration", 0x9404,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoSRational EXIF_TAG_CAMERA_ELEVATION_ANGLE = new TagInfoSRational(
            "CameraElevationAngle", 0x9405,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoUndefineds EXIF_TAG_FLASHPIX_VERSION = new TagInfoUndefineds(
            "FlashpixVersion", 0xa000, 4,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /**
     * @deprecated The tag does not comply with the EXIF specification.
     * Use {@link #EXIF_TAG_PIXEL_X_DIMENSION} instead.
     * @see #EXIF_TAG_PIXEL_X_DIMENSION
     */
    @Deprecated
    public static final TagInfoShort EXIF_TAG_EXIF_IMAGE_WIDTH = new TagInfoShort(
            "ExifImageWidth", 0xa002,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoShortOrLong EXIF_TAG_PIXEL_X_DIMENSION = new TagInfoShortOrLong(
            "PixelXDimension", 0xa002, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /**
     * @deprecated The tag does not comply with the EXIF specification.
     * Use {@link #EXIF_TAG_PIXEL_Y_DIMENSION} instead.
     * @see #EXIF_TAG_PIXEL_Y_DIMENSION
     */
    @Deprecated
    public static final TagInfoShort EXIF_TAG_EXIF_IMAGE_LENGTH = new TagInfoShort(
            "ExifImageLength", 0xa003,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoShortOrLong EXIF_TAG_PIXEL_Y_DIMENSION = new TagInfoShortOrLong(
            "PixelYDimension", 0xa003, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD, false);
    public static final TagInfoAscii EXIF_TAG_RELATED_SOUND_FILE = new TagInfoAscii(
            "RelatedSoundFile", 0xa004, 13,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoDirectory EXIF_TAG_INTEROP_OFFSET = new TagInfoDirectory(
            "InteropOffset", 0xa005,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /**
     * @deprecated The tag does not comply with the EXIF specification. This
     * constant does not comply with the Java language constant naming
     * convention. Use {@link #EXIF_TAG_FLASH_ENERGY} instead.
     * @see #EXIF_TAG_FLASH_ENERGY
     */
    @Deprecated
    public static final TagInfoRationals EXIF_TAG_FLASH_ENERGY_EXIF_IFD = new TagInfoRationals(
            "FlashEnergy", 0xa20b, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_FLASH_ENERGY = new TagInfoRational(
            "FlashEnergy", 0xa20b,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoUndefineds EXIF_TAG_SPATIAL_FREQUENCY_RESPONSE_2 = new TagInfoUndefineds(
            "SpatialFrequencyResponse", 0xa20c, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUnknowns EXIF_TAG_NOISE_2 = new TagInfoUnknowns(
            "Noise", 0xa20d, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention. Use {@link #EXIF_TAG_FOCAL_PLANE_X_RESOLUTION} instead.
     * @see #EXIF_TAG_FOCAL_PLANE_X_RESOLUTION
     */
    @Deprecated
    public static final TagInfoRational EXIF_TAG_FOCAL_PLANE_XRESOLUTION_EXIF_IFD = new TagInfoRational(
            "FocalPlaneXResolution", 0xa20e,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_FOCAL_PLANE_X_RESOLUTION = new TagInfoRational(
            "FocalPlaneXResolution", 0xa20e,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention. Use {@link #EXIF_TAG_FOCAL_PLANE_Y_RESOLUTION} instead.
     * @see #EXIF_TAG_FOCAL_PLANE_Y_RESOLUTION
     */
    @Deprecated
    public static final TagInfoRational EXIF_TAG_FOCAL_PLANE_YRESOLUTION_EXIF_IFD = new TagInfoRational(
            "FocalPlaneYResolution", 0xa20f,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_FOCAL_PLANE_Y_RESOLUTION = new TagInfoRational(
            "FocalPlaneYResolution", 0xa20f,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention. Use {@link #EXIF_TAG_FOCAL_PLANE_RESOLUTION_UNIT}
     * instead.
     * @see #EXIF_TAG_FOCAL_PLANE_RESOLUTION_UNIT
     */
    @Deprecated
    public static final TagInfoShort EXIF_TAG_FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD = new TagInfoShort(
            "FocalPlaneResolutionUnit", 0xa210,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention nor the EXIF specification. Do not use it.
     */
    @Deprecated
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_NONE = 1;
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention nor the EXIF specification.
     * Use {@link #FOCAL_PLANE_RESOLUTION_UNIT_VALUE_INCH} instead.
     * @see #FOCAL_PLANE_RESOLUTION_UNIT_VALUE_INCH
     */
    @Deprecated
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_INCHES = 2;
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention nor the EXIF specification.
     * Use {@link #FOCAL_PLANE_RESOLUTION_UNIT_VALUE_CM} instead.
     * @see #FOCAL_PLANE_RESOLUTION_UNIT_VALUE_CM
     */
    @Deprecated
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_CM = 3;
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention nor the EXIF specification. Do not use it.
     */
    @Deprecated
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_MM = 4;
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention nor the EXIF specification. Do not use it.
     */
    @Deprecated
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_UM = 5;
    public static final TagInfoShort EXIF_TAG_FOCAL_PLANE_RESOLUTION_UNIT = new TagInfoShort(
            "FocalPlaneResolutionUnit", 0xa210,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final short FOCAL_PLANE_RESOLUTION_UNIT_VALUE_INCH = 2;
    public static final short FOCAL_PLANE_RESOLUTION_UNIT_VALUE_CM = 3;
    public static final short FOCAL_PLANE_RESOLUTION_UNIT_DEFAULT_VALUE =
            FOCAL_PLANE_RESOLUTION_UNIT_VALUE_INCH;
    public static final TagInfoUnknowns EXIF_TAG_IMAGE_NUMBER = new TagInfoUnknowns(
            "ImageNumber", 0xa211, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUnknowns EXIF_TAG_SECURITY_CLASSIFICATION = new TagInfoUnknowns(
            "SecurityClassification", 0xa212, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUnknowns EXIF_TAG_IMAGE_HISTORY = new TagInfoUnknowns(
            "ImageHistory", 0xa213, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShorts EXIF_TAG_SUBJECT_LOCATION = new TagInfoShorts(
            "SubjectLocation", 0xa214, 2,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention. Use {@link #EXIF_TAG_EXPOSURE_INDEX}
     * instead.
     * @see #EXIF_TAG_EXPOSURE_INDEX
     */
    @Deprecated
    public static final TagInfoRational EXIF_TAG_EXPOSURE_INDEX_EXIF_IFD = new TagInfoRational(
            "ExposureIndex", 0xa215,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_EXPOSURE_INDEX = new TagInfoRational(
            "ExposureIndex", 0xa215,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoUnknowns EXIF_TAG_TIFF_EPSTANDARD_ID_2 = new TagInfoUnknowns(
            "TIFF-EPStandardID", 0xa216, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention. Use {@link #EXIF_TAG_SENSING_METHOD}
     * instead.
     * @see #EXIF_TAG_SENSING_METHOD
     */
    @Deprecated
    public static final TagInfoShort EXIF_TAG_SENSING_METHOD_EXIF_IFD = new TagInfoShort(
            "SensingMethod", 0xa217,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention nor the EXIF specification.
     * Use {@link #SENSING_METHOD_VALUE_NOT_DEFINED} instead.
     * @see #SENSING_METHOD_VALUE_NOT_DEFINED
     */
    @Deprecated
    public static final int SENSING_METHOD_EXIF_IFD_VALUE_NOT_DEFINED = 1;
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention nor the EXIF specification.
     * Use {@link #SENSING_METHOD_VALUE_ONE_CHIP_COLOR_AREA} instead.
     * @see #SENSING_METHOD_VALUE_ONE_CHIP_COLOR_AREA
     */
    @Deprecated
    public static final int SENSING_METHOD_EXIF_IFD_VALUE_ONE_CHIP_COLOR_AREA = 2;
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention nor the EXIF specification.
     * Use {@link #SENSING_METHOD_VALUE_TWO_CHIP_COLOR_AREA} instead.
     * @see #SENSING_METHOD_VALUE_TWO_CHIP_COLOR_AREA
     */
    @Deprecated
    public static final int SENSING_METHOD_EXIF_IFD_VALUE_TWO_CHIP_COLOR_AREA = 3;
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention nor the EXIF specification.
     * Use {@link #SENSING_METHOD_VALUE_THREE_CHIP_COLOR_AREA} instead.
     * @see #SENSING_METHOD_VALUE_THREE_CHIP_COLOR_AREA
     */
    @Deprecated
    public static final int SENSING_METHOD_EXIF_IFD_VALUE_THREE_CHIP_COLOR_AREA = 4;
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention nor the EXIF specification.
     * Use {@link #SENSING_METHOD_VALUE_COLOR_SEQUENTIAL_AREA} instead.
     * @see #SENSING_METHOD_VALUE_COLOR_SEQUENTIAL_AREA
     */
    @Deprecated
    public static final int SENSING_METHOD_EXIF_IFD_VALUE_COLOR_SEQUENTIAL_AREA = 5;
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention nor the EXIF specification.
     * Use {@link #SENSING_METHOD_VALUE_TRILINEAR} instead.
     * @see #SENSING_METHOD_VALUE_TRILINEAR
     */
    @Deprecated
    public static final int SENSING_METHOD_EXIF_IFD_VALUE_TRILINEAR = 7;
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention nor the EXIF specification.
     * Use {@link #SENSING_METHOD_VALUE_COLOR_SEQUENTIAL_LINEAR} instead.
     * @see #SENSING_METHOD_VALUE_COLOR_SEQUENTIAL_LINEAR
     */
    @Deprecated
    public static final int SENSING_METHOD_EXIF_IFD_VALUE_COLOR_SEQUENTIAL_LINEAR = 8;
    public static final TagInfoShort EXIF_TAG_SENSING_METHOD = new TagInfoShort(
            "SensingMethod", 0xa217,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final short SENSING_METHOD_VALUE_NOT_DEFINED = 1;
    public static final short SENSING_METHOD_VALUE_ONE_CHIP_COLOR_AREA = 2;
    public static final short SENSING_METHOD_VALUE_TWO_CHIP_COLOR_AREA = 3;
    public static final short SENSING_METHOD_VALUE_THREE_CHIP_COLOR_AREA = 4;
    public static final short SENSING_METHOD_VALUE_COLOR_SEQUENTIAL_AREA = 5;
    public static final short SENSING_METHOD_VALUE_TRILINEAR = 7;
    public static final short SENSING_METHOD_VALUE_COLOR_SEQUENTIAL_LINEAR = 8;
    public static final TagInfoUndefined EXIF_TAG_FILE_SOURCE = new TagInfoUndefined(
            "FileSource", 0xa300,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final byte FILE_SOURCE_VALUE_FILM_SCANNER = 1;
    public static final byte FILE_SOURCE_VALUE_REFLECTION_PRINT_SCANNER = 2;
    public static final byte FILE_SOURCE_VALUE_DIGITAL_CAMERA = 3;
    public static final byte FILE_SOURCE_DEFAULT_VALUE =
        FILE_SOURCE_VALUE_DIGITAL_CAMERA;
    public static final TagInfoUndefined EXIF_TAG_SCENE_TYPE = new TagInfoUndefined(
            "SceneType", 0xa301,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention. Use {@link #EXIF_TAG_CFA_PATTERN} instead.
     * @see #EXIF_TAG_CFA_PATTERN
     */
    @Deprecated
    public static final TagInfoUndefineds EXIF_TAG_CFAPATTERN = new TagInfoUndefineds(
            "CFAPattern", 0xa302, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoUndefineds EXIF_TAG_CFA_PATTERN = new TagInfoUndefineds(
            "CFAPattern", 0xa302, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoShort EXIF_TAG_CUSTOM_RENDERED = new TagInfoShort(
            "CustomRendered", 0xa401,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final short CUSTOM_RENDERED_VALUE_NORMAL = 0;
    public static final short CUSTOM_RENDERED_VALUE_CUSTOM = 1;
    public static final short CUSTOM_RENDERED_DEFAULT_VALUE =
        CUSTOM_RENDERED_VALUE_NORMAL;
    public static final TagInfoShort EXIF_TAG_EXPOSURE_MODE = new TagInfoShort(
            "ExposureMode", 0xa402,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final short EXPOSURE_MODE_VALUE_AUTO = 0;
    public static final short EXPOSURE_MODE_VALUE_MANUAL = 1;
    public static final short EXPOSURE_MODE_VALUE_AUTO_BRACKET = 2;
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention. Use {@link #EXIF_TAG_WHITE_BALANCE} instead.
     * @see #EXIF_TAG_WHITE_BALANCE
     */
    @Deprecated
    public static final TagInfoShort EXIF_TAG_WHITE_BALANCE_1 = new TagInfoShort(
            "WhiteBalance", 0xa403,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention nor the EXIF specification.
     * Use {@link #WHITE_BALANCE_VALUE_AUTO} instead.
     * @see #WHITE_BALANCE_VALUE_AUTO
     */
    @Deprecated
    public static final int WHITE_BALANCE_1_VALUE_AUTO = 0;
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention nor the EXIF specification.
     * Use {@link #WHITE_BALANCE_VALUE_MANUAL} instead.
     * @see #WHITE_BALANCE_VALUE_MANUAL
     */
    @Deprecated
    public static final int WHITE_BALANCE_1_VALUE_MANUAL = 1;
    public static final TagInfoShort EXIF_TAG_WHITE_BALANCE = new TagInfoShort(
            "WhiteBalance", 0xa403,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final short WHITE_BALANCE_VALUE_AUTO = 0;
    public static final short WHITE_BALANCE_VALUE_MANUAL = 1;
    public static final TagInfoRational EXIF_TAG_DIGITAL_ZOOM_RATIO = new TagInfoRational(
            "DigitalZoomRatio", 0xa404,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /**
     * @deprecated The tag does not comply with the EXIF specification.
     * Use {@link #EXIF_TAG_FOCAL_LENGTH_IN_35MM_FILM} instead.
     * @see #EXIF_TAG_FOCAL_LENGTH_IN_35MM_FILM
     */
    @Deprecated
    public static final TagInfoShort EXIF_TAG_FOCAL_LENGTH_IN_35MM_FORMAT = new TagInfoShort(
            "FocalLengthIn35mmFormat", 0xa405,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoShort EXIF_TAG_FOCAL_LENGTH_IN_35MM_FILM = new TagInfoShort(
            "FocalLengthIn35mmFilm", 0xa405,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoShort EXIF_TAG_SCENE_CAPTURE_TYPE = new TagInfoShort(
            "SceneCaptureType", 0xa406,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final short SCENE_CAPTURE_TYPE_VALUE_STANDARD = 0;
    public static final short SCENE_CAPTURE_TYPE_VALUE_LANDSCAPE = 1;
    public static final short SCENE_CAPTURE_TYPE_VALUE_PORTRAIT = 2;
    public static final short SCENE_CAPTURE_TYPE_VALUE_NIGHT = 3;
    public static final short SCENE_CAPTURE_TYPE_DEFAULT_VALUE =
        SCENE_CAPTURE_TYPE_VALUE_STANDARD;
    public static final TagInfoShort EXIF_TAG_GAIN_CONTROL = new TagInfoShort(
            "GainControl", 0xa407,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final short GAIN_CONTROL_VALUE_NONE = 0;
    public static final short GAIN_CONTROL_VALUE_LOW_GAIN_UP = 1;
    public static final short GAIN_CONTROL_VALUE_HIGH_GAIN_UP = 2;
    public static final short GAIN_CONTROL_VALUE_LOW_GAIN_DOWN = 3;
    public static final short GAIN_CONTROL_VALUE_HIGH_GAIN_DOWN = 4;
    public static final short GAIN_CONTROL_DEFAULT_VALUE =
        GAIN_CONTROL_VALUE_NONE;
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention. Use {@link #EXIF_TAG_CONTRAST} instead.
     * @see #EXIF_TAG_CONTRAST
     */
    @Deprecated
    public static final TagInfoShort EXIF_TAG_CONTRAST_1 = new TagInfoShort(
            "Contrast", 0xa408,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention nor the EXIF specification.
     * Use {@link #CONTRAST_VALUE_NORMAL} instead.
     * @see #CONTRAST_VALUE_NORMAL
     */
    @Deprecated
    public static final int CONTRAST_1_VALUE_NORMAL = 0;
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention nor the EXIF specification.
     * Use {@link #CONTRAST_VALUE_LOW} instead.
     * @see #CONTRAST_VALUE_LOW
     */
    @Deprecated
    public static final int CONTRAST_1_VALUE_LOW = 1;
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention nor the EXIF specification.
     * Use {@link #CONTRAST_VALUE_HIGH} instead.
     * @see #CONTRAST_VALUE_HIGH
     */
    @Deprecated
    public static final int CONTRAST_1_VALUE_HIGH = 2;
    public static final TagInfoShort EXIF_TAG_CONTRAST = new TagInfoShort(
            "Contrast", 0xa408,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final short CONTRAST_VALUE_NORMAL = 0;
    public static final short CONTRAST_VALUE_LOW = 1;
    public static final short CONTRAST_VALUE_HIGH = 2;
    public static final short CONTRAST_DEFAULT_VALUE =
        CONTRAST_VALUE_NORMAL;
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention. Use {@link #EXIF_TAG_SATURATION} instead.
     * @see #EXIF_TAG_SATURATION
     */
    @Deprecated
    public static final TagInfoShort EXIF_TAG_SATURATION_1 = new TagInfoShort(
            "Saturation", 0xa409,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention nor the EXIF specification.
     * Use {@link #SATURATION_VALUE_NORMAL} instead.
     * @see #SATURATION_VALUE_NORMAL
     */
    @Deprecated
    public static final int SATURATION_1_VALUE_NORMAL = 0;
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention nor the EXIF specification.
     * Use {@link #SATURATION_VALUE_LOW} instead.
     * @see #SATURATION_VALUE_LOW
     */
    @Deprecated
    public static final int SATURATION_1_VALUE_LOW = 1;
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention nor the EXIF specification.
     * Use {@link #SATURATION_VALUE_HIGH} instead.
     * @see #SATURATION_VALUE_HIGH
     */
    @Deprecated
    public static final int SATURATION_1_VALUE_HIGH = 2;
    public static final TagInfoShort EXIF_TAG_SATURATION = new TagInfoShort(
            "Saturation", 0xa409,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final short SATURATION_VALUE_NORMAL = 0;
    public static final short SATURATION_VALUE_LOW = 1;
    public static final short SATURATION_VALUE_HIGH = 2;
    public static final short SATURATION_DEFAULT_VALUE =
        SATURATION_VALUE_NORMAL;
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention. Use {@link #EXIF_TAG_SHARPNESS} instead.
     * @see #EXIF_TAG_SHARPNESS
     */
    @Deprecated
    public static final TagInfoShort EXIF_TAG_SHARPNESS_1 = new TagInfoShort(
            "Sharpness", 0xa40a,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention nor the EXIF specification.
     * Use {@link #SHARPNESS_VALUE_NORMAL} instead.
     * @see #SHARPNESS_VALUE_NORMAL
     */
    @Deprecated
    public static final int SHARPNESS_1_VALUE_NORMAL = 0;
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention nor the EXIF specification.
     * Use {@link #SHARPNESS_VALUE_SOFT} instead.
     * @see #SHARPNESS_VALUE_SOFT
     */
    @Deprecated
    public static final int SHARPNESS_1_VALUE_SOFT = 1;
    /**
     * @deprecated This constant does not comply with the Java language constant
     * naming convention nor the EXIF specification.
     * Use {@link #SHARPNESS_VALUE_HARD} instead.
     * @see #SHARPNESS_VALUE_HARD
     */
    @Deprecated
    public static final int SHARPNESS_1_VALUE_HARD = 2;
    public static final TagInfoShort EXIF_TAG_SHARPNESS = new TagInfoShort(
            "Sharpness", 0xa40a,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final short SHARPNESS_VALUE_NORMAL = 0;
    public static final short SHARPNESS_VALUE_SOFT = 1;
    public static final short SHARPNESS_VALUE_HARD = 2;
    public static final short SHARPNESS_DEFAULT_VALUE =
        SHARPNESS_VALUE_NORMAL;
    public static final TagInfoUndefineds EXIF_TAG_DEVICE_SETTING_DESCRIPTION = new TagInfoUndefineds(
            "DeviceSettingDescription", 0xa40b, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoShort EXIF_TAG_SUBJECT_DISTANCE_RANGE = new TagInfoShort(
            "SubjectDistanceRange", 0xa40c,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final short SUBJECT_DISTANCE_RANGE_VALUE_UNKNOWN = 0;
    public static final short SUBJECT_DISTANCE_RANGE_VALUE_MACRO = 1;
    public static final short SUBJECT_DISTANCE_RANGE_VALUE_CLOSE = 2;
    public static final short SUBJECT_DISTANCE_RANGE_VALUE_DISTANT = 3;
    public static final TagInfoAscii EXIF_TAG_IMAGE_UNIQUE_ID = new TagInfoAscii(
            "ImageUniqueID", 0xa420, 33,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_CAMERA_OWNER_NAME = new TagInfoAscii(
            "CameraOwnerName", 0xa430, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoAscii EXIF_TAG_BODY_SERIAL_NUMBER = new TagInfoAscii(
            "BodySerialNumber", 0xa431, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRationals EXIF_TAG_LENS_SPECIFICATION = new TagInfoRationals(
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
    public static final TagInfoShort EXIF_TAG_COMPOSITE_IMAGE = new TagInfoShort(
            "CompositeImage", 0xa460,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final short COMPOSITE_IMAGE_VALUE_UNKNOWN = 0;
    public static final short COMPOSITE_IMAGE_VALUE_NON_COMPOSITE = 1;
    public static final short COMPOSITE_IMAGE_VALUE_COMPOSITE = 2;
    public static final short COMPOSITE_IMAGE_VALUE_COMPOSITE_WHEN_SHOOTING = 3;
    public static final TagInfoShorts EXIF_TAG_SOURCE_IMAGE_NUMBER_OF_COMPOSITE_IMAGE = new TagInfoShorts(
            "SourceImageNumberOfCompositeImage", 0xa461, 2,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoUndefineds EXIF_TAG_SOURCE_EXPOSURE_TIMES_OF_COMPOSITE_IMAGE = new TagInfoUndefineds(
            "SourceExposureTimesOfCompositeImage", 0xa462, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoRational EXIF_TAG_GAMMA = new TagInfoRational(
            "Gamma", 0xa500,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final TagInfoUnknowns EXIF_TAG_ANNOTATIONS = new TagInfoUnknowns(
            "Annotations", 0xc44f, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final TagInfoUndefined EXIF_TAG_PRINT_IM = new TagInfoUndefined(
            "PrintIM", 0xc4a5,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final TagInfoSLong EXIF_TAG_OFFSET_SCHEMA = new TagInfoSLong(
            "OffsetSchema", 0xea1d,
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
                    EXIF_TAG_OECF,
                    EXIF_TAG_SENSITIVITY_TYPE,
                    EXIF_TAG_STANDARD_OUTPUT_SENSITIVITY,
                    EXIF_TAG_RECOMMENDED_EXPOSURE_INDEX,
                    EXIF_TAG_LEAF_SUB_IFD,
                    EXIF_TAG_EXIF_VERSION, EXIF_TAG_DATE_TIME_ORIGINAL,
                    EXIF_TAG_DATE_TIME_DIGITIZED, EXIF_TAG_COMPONENTS_CONFIGURATION,
                    EXIF_TAG_COMPRESSED_BITS_PER_PIXEL, EXIF_TAG_SHUTTER_SPEED_VALUE,
                    EXIF_TAG_APERTURE_VALUE, EXIF_TAG_BRIGHTNESS_VALUE,
                    EXIF_TAG_EXPOSURE_BIAS_VALUE, EXIF_TAG_MAX_APERTURE_VALUE,
                    EXIF_TAG_SUBJECT_DISTANCE, EXIF_TAG_IMAGE_UNIQUE_ID,
                    EXIF_TAG_CAMERA_OWNER_NAME,
                    EXIF_TAG_BODY_SERIAL_NUMBER,
                    EXIF_TAG_LENS_SPECIFICATION,
                    EXIF_TAG_LENS_MAKE,
                    EXIF_TAG_LENS_MODEL,
                    EXIF_TAG_LENS_SERIAL_NUMBER,
                    EXIF_TAG_METERING_MODE,
                    EXIF_TAG_LIGHT_SOURCE, EXIF_TAG_FLASH, EXIF_TAG_FOCAL_LENGTH,
                    EXIF_TAG_SUBJECT_AREA,
                    EXIF_TAG_STO_NITS, EXIF_TAG_SUB_SEC_TIME,
                    EXIF_TAG_SUB_SEC_TIME_ORIGINAL, EXIF_TAG_SUB_SEC_TIME_DIGITIZED,
                    EXIF_TAG_FLASHPIX_VERSION,
                    EXIF_TAG_PIXEL_X_DIMENSION, EXIF_TAG_PIXEL_Y_DIMENSION,
                    EXIF_TAG_RELATED_SOUND_FILE, EXIF_TAG_INTEROP_OFFSET,
                    EXIF_TAG_FLASH_ENERGY,
                    EXIF_TAG_SPATIAL_FREQUENCY_RESPONSE_2, EXIF_TAG_NOISE_2,
                    EXIF_TAG_FOCAL_PLANE_X_RESOLUTION,
                    EXIF_TAG_FOCAL_PLANE_Y_RESOLUTION,
                    EXIF_TAG_FOCAL_PLANE_RESOLUTION_UNIT,
                    EXIF_TAG_IMAGE_NUMBER, EXIF_TAG_SECURITY_CLASSIFICATION,
                    EXIF_TAG_IMAGE_HISTORY, EXIF_TAG_SUBJECT_LOCATION,
                    EXIF_TAG_EXPOSURE_INDEX, EXIF_TAG_TIFF_EPSTANDARD_ID_2,
                    EXIF_TAG_SENSING_METHOD, EXIF_TAG_FILE_SOURCE,
                    EXIF_TAG_SCENE_TYPE, EXIF_TAG_CFA_PATTERN, EXIF_TAG_CUSTOM_RENDERED,
                    EXIF_TAG_EXPOSURE_MODE, EXIF_TAG_WHITE_BALANCE,
                    EXIF_TAG_DIGITAL_ZOOM_RATIO, EXIF_TAG_FOCAL_LENGTH_IN_35MM_FILM,
                    EXIF_TAG_SCENE_CAPTURE_TYPE, EXIF_TAG_GAIN_CONTROL,
                    EXIF_TAG_CONTRAST, EXIF_TAG_SATURATION, EXIF_TAG_SHARPNESS,
                    EXIF_TAG_DEVICE_SETTING_DESCRIPTION,
                    EXIF_TAG_SUBJECT_DISTANCE_RANGE, EXIF_TAG_IMAGE_UNIQUE_ID,
                    EXIF_TAG_GAMMA,
                    EXIF_TAG_ANNOTATIONS, EXIF_TAG_PRINT_IM,
                    EXIF_TAG_OFFSET_SCHEMA, EXIF_TAG_OWNER_NAME,
                    EXIF_TAG_SERIAL_NUMBER, EXIF_TAG_LENS, EXIF_TAG_RAW_FILE,
                    EXIF_TAG_CONVERTER, EXIF_TAG_WHITE_BALANCE_2, EXIF_TAG_EXPOSURE,
                    EXIF_TAG_SHADOWS, EXIF_TAG_BRIGHTNESS, EXIF_TAG_CONTRAST_2,
                    EXIF_TAG_SATURATION_2, EXIF_TAG_SHARPNESS_2, EXIF_TAG_SMOOTHNESS,
                    EXIF_TAG_MOIRE_FILTER, EXIF_TAG_USER_COMMENT,
                    EXIF_TAG_MAKER_NOTE,
                    EXIF_TAG_ISO_SPEED, EXIF_TAG_ISO_SPEED_LATITUDE_YYY,
                    EXIF_TAG_ISO_SPEED_LATITUDE_ZZZ,
                    EXIF_TAG_OFFSET_TIME, EXIF_TAG_OFFSET_TIME_ORIGINAL,
                    EXIF_TAG_OFFSET_TIME_DIGITIZED,
                    EXIF_TAG_COMPOSITE_IMAGE,
                    EXIF_TAG_SOURCE_IMAGE_NUMBER_OF_COMPOSITE_IMAGE,
                    EXIF_TAG_SOURCE_EXPOSURE_TIMES_OF_COMPOSITE_IMAGE,
                    EXIF_TAG_TEMPERATURE, EXIF_TAG_HUMIDITY, EXIF_TAG_PRESSURE,
                    EXIF_TAG_WATER_DEPTH, EXIF_TAG_ACCELERATION,
                    EXIF_TAG_CAMERA_ELEVATION_ANGLE));

    private ExifTagConstants() {
    }
}
