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
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShort;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefined;

/**
 * 
 */
public interface TiffEpTagConstants {
    public static final TagInfoShort EXIF_TAG_CFAREPEAT_PATTERN_DIM = new TagInfoShort(
            "CFARepeatPatternDim", 0x828d, 2,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    
    public static final TagInfoByte EXIF_TAG_CFAPATTERN_2 = new TagInfoByte(
            "CFAPattern2", 0x828e, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoAsciiOrRational EXIF_TAG_BATTERY_LEVEL = new TagInfoAsciiOrRational(
            "BatteryLevel", 0x828f, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);
    
    public static final TagInfoUndefined EXIF_TAG_INTER_COLOR_PROFILE = new TagInfoUndefined(
            "InterColorProfile", 0x8773, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoShort EXIF_TAG_INTERLACE = new TagInfoShort(
            "Interlace", 0x8829, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoSShort EXIF_TAG_TIME_ZONE_OFFSET = new TagInfoSShort(
            "TimeZoneOffset", 0x882a, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);

    public static final TagInfoShort EXIF_TAG_SELF_TIMER_MODE = new TagInfoShort(
            "SelfTimerMode", 0x882b, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);

    public static final TagInfoRational EXIF_TAG_FLASH_ENERGY = new TagInfoRational(
            "FlashEnergy", 0x920b, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoUndefined EXIF_TAG_SPATIAL_FREQUENCY_RESPONSE_1 = new TagInfoUndefined(
            "SpatialFrequencyResponse", 0x920c, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    
    public static final TagInfoUndefined EXIF_TAG_NOISE_1 = new TagInfoUndefined(
            "Noise", 0x920d, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    
    public static final TagInfoRational EXIF_TAG_FOCAL_PLANE_XRESOLUTION = new TagInfoRational(
            "FocalPlaneXResolution", 0x920e, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    
    public static final TagInfoRational EXIF_TAG_FOCAL_PLANE_YRESOLUTION = new TagInfoRational(
            "FocalPlaneYResolution", 0x920f, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    
    public static final TagInfoShort EXIF_TAG_FOCAL_PLANE_RESOLUTION_UNIT = new TagInfoShort(
            "FocalPlaneResolutionUnit", 0x9210, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_NONE = 1;
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_INCHES = 2;
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_CM = 3;
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_MM = 4;
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_UM = 5;

    public static final TagInfoLong EXIF_TAG_IMAGE_NUMBER_EXIF_IFD = new TagInfoLong(
            "ImageNumber", 0x9211, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);

    public static final TagInfoAscii EXIF_TAG_SECURITY_CLASSIFICATION_EXIF_IFD = new TagInfoAscii(
            "SecurityClassification", 0x9212, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);

    public static final TagInfoAscii EXIF_TAG_IMAGE_HISTORY_EXIF_IFD = new TagInfoAscii(
            "ImageHistory", 0x9213, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);

    public static final TagInfoRational EXIF_TAG_EXPOSURE_INDEX = new TagInfoRational(
            "ExposureIndex", 0x9215, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    
    public static final TagInfoByte EXIF_TAG_TIFF_EPSTANDARD_ID_1 = new TagInfoByte(
            "TIFF/EPStandardID", 0x9216, 4,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoShort EXIF_TAG_SENSING_METHOD = new TagInfoShort(
            "SensingMethod", 0x9217, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final int SENSING_METHOD_VALUE_MONOCHROME_AREA = 1;
    public static final int SENSING_METHOD_VALUE_ONE_CHIP_COLOR_AREA = 2;
    public static final int SENSING_METHOD_VALUE_TWO_CHIP_COLOR_AREA = 3;
    public static final int SENSING_METHOD_VALUE_THREE_CHIP_COLOR_AREA = 4;
    public static final int SENSING_METHOD_VALUE_COLOR_SEQUENTIAL_AREA = 5;
    public static final int SENSING_METHOD_VALUE_MONOCHROME_LINEAR = 6;
    public static final int SENSING_METHOD_VALUE_TRILINEAR = 7;
    public static final int SENSING_METHOD_VALUE_COLOR_SEQUENTIAL_LINEAR = 8;

    public static final List<TagInfo> ALL_TIFF_EP_TAGS =
            Collections.unmodifiableList(Arrays.asList(
                    EXIF_TAG_CFAREPEAT_PATTERN_DIM,
                    EXIF_TAG_CFAPATTERN_2,
                    EXIF_TAG_BATTERY_LEVEL,
                    EXIF_TAG_INTER_COLOR_PROFILE,
                    EXIF_TAG_INTERLACE,
                    EXIF_TAG_TIME_ZONE_OFFSET,
                    EXIF_TAG_SELF_TIMER_MODE,
                    EXIF_TAG_FLASH_ENERGY,
                    EXIF_TAG_SPATIAL_FREQUENCY_RESPONSE_1,
                    EXIF_TAG_NOISE_1,
                    EXIF_TAG_FOCAL_PLANE_XRESOLUTION,
                    EXIF_TAG_FOCAL_PLANE_YRESOLUTION,
                    EXIF_TAG_FOCAL_PLANE_RESOLUTION_UNIT,
                    EXIF_TAG_IMAGE_NUMBER_EXIF_IFD,
                    EXIF_TAG_SECURITY_CLASSIFICATION_EXIF_IFD,
                    EXIF_TAG_IMAGE_HISTORY_EXIF_IFD,
                    EXIF_TAG_EXPOSURE_INDEX,
                    EXIF_TAG_TIFF_EPSTANDARD_ID_1,
                    EXIF_TAG_SENSING_METHOD));
}
