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
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrByte;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds;

/**
 * Digital Negative (DNG) Specification
 * <BR>
 * <a href="http://www.adobe.com/products/dng/pdfs/dng_spec_1_3_0_0.pdf">...</a>
 */
public final class DngTagConstants {

    public static final TagInfoBytes EXIF_TAG_DNG_VERSION = new TagInfoBytes(
            "DNGVersion", 0xc612, 4,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoBytes EXIF_TAG_DNG_BACKWARD_VERSION = new TagInfoBytes(
            "DNGBackwardVersion", 0xc613, 4,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoAscii EXIF_TAG_UNIQUE_CAMERA_MODEL = new TagInfoAscii(
            "UniqueCameraModel", 0xc614, -1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoAsciiOrByte EXIF_TAG_LOCALIZED_CAMERA_MODEL = new TagInfoAsciiOrByte(
            "LocalizedCameraModel", 0xc615, -1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoBytes EXIF_TAG_CFAPLANE_COLOR = new TagInfoBytes(
            "CFAPlaneColor", 0xc616, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoShort EXIF_TAG_CFALAYOUT = new TagInfoShort(
            "CFALayout", 0xc617,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final int CFALAYOUT_VALUE_RECTANGULAR = 1;
    public static final int CFALAYOUT_VALUE_EVEN_COLUMNS_OFFSET_DOWN_1_2_ROW = 2;
    public static final int CFALAYOUT_VALUE_EVEN_COLUMNS_OFFSET_UP_1_2_ROW = 3;
    public static final int CFALAYOUT_VALUE_EVEN_ROWS_OFFSET_RIGHT_1_2_COLUMN = 4;
    public static final int CFALAYOUT_VALUE_EVEN_ROWS_OFFSET_LEFT_1_2_COLUMN = 5;
    public static final int CFALAYOUT_VALUE_EVEN_ROWS_OFFSET_UP_1_2_ROW_EVEN_COLUMNS_OFFSET_LEFT_1_2_COLUMN = 6;
    public static final int CFALAYOUT_VALUE_EVEN_ROWS_OFFSET_UP_1_2_ROW_EVEN_COLUMNS_OFFSET_RIGHT_1_2_COLUMN = 7;
    public static final int CFALAYOUT_VALUE_EVEN_ROWS_OFFSET_DOWN_1_2_ROW_EVEN_COLUMNS_OFFSET_LEFT_1_2_COLUMN = 8;
    public static final int CFALAYOUT_VALUE_EVEN_ROWS_OFFSET_DOWN_1_2_ROW_EVEN_COLUMNS_OFFSET_RIGHT_1_2_COLUMN = 9;

    public static final TagInfoShorts EXIF_TAG_LINEARIZATION_TABLE = new TagInfoShorts(
            "LinearizationTable", 0xc618, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoShorts EXIF_TAG_BLACK_LEVEL_REPEAT_DIM = new TagInfoShorts(
            "BlackLevelRepeatDim", 0xc619, 2,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoShortOrLongOrRational EXIF_TAG_BLACK_LEVEL = new TagInfoShortOrLongOrRational(
            "BlackLevel", 0xc61a, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoSRationals EXIF_TAG_BLACK_LEVEL_DELTA_H = new TagInfoSRationals(
            "BlackLevelDeltaH", 0xc61b, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoSRationals EXIF_TAG_BLACK_LEVEL_DELTA_V = new TagInfoSRationals(
            "BlackLevelDeltaV", 0xc61c, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoShortOrLong EXIF_TAG_WHITE_LEVEL = new TagInfoShortOrLong(
            "WhiteLevel", 0xc61d, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoRationals EXIF_TAG_DEFAULT_SCALE = new TagInfoRationals(
            "DefaultScale", 0xc61e, 2,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoShortOrLongOrRational EXIF_TAG_DEFAULT_CROP_ORIGIN = new TagInfoShortOrLongOrRational(
            "DefaultCropOrigin", 0xc61f, 2,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoShortOrLongOrRational EXIF_TAG_DEFAULT_CROP_SIZE = new TagInfoShortOrLongOrRational(
            "DefaultCropSize", 0xc620, 2,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoSRationals EXIF_TAG_COLOR_MATRIX_1 = new TagInfoSRationals(
            "ColorMatrix1", 0xc621, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoSRationals EXIF_TAG_COLOR_MATRIX_2 = new TagInfoSRationals(
            "ColorMatrix2", 0xc622, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoSRationals EXIF_TAG_CAMERA_CALIBRATION_1 = new TagInfoSRationals(
            "CameraCalibration1", 0xc623, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoSRationals EXIF_TAG_CAMERA_CALIBRATION_2 = new TagInfoSRationals(
            "CameraCalibration2", 0xc624, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoSRationals EXIF_TAG_REDUCTION_MATRIX_1 = new TagInfoSRationals(
            "ReductionMatrix1", 0xc625, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoSRationals EXIF_TAG_REDUCTION_MATRIX_2 = new TagInfoSRationals(
            "ReductionMatrix2", 0xc626, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoRationals EXIF_TAG_ANALOG_BALANCE = new TagInfoRationals(
            "AnalogBalance", 0xc627, -1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoShortOrRational EXIF_TAG_AS_SHOT_NEUTRAL = new TagInfoShortOrRational(
            "AsShotNeutral", 0xc628, -1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoRationals EXIF_TAG_AS_SHOT_WHITE_XY = new TagInfoRationals(
            "AsShotWhiteXY", 0xc629, 2,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoSRational EXIF_TAG_BASELINE_EXPOSURE = new TagInfoSRational(
            "BaselineExposure", 0xc62a,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoRational EXIF_TAG_BASELINE_NOISE = new TagInfoRational(
            "BaselineNoise", 0xc62b,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoRational EXIF_TAG_BASELINE_SHARPNESS = new TagInfoRational(
            "BaselineSharpness", 0xc62c,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoLong EXIF_TAG_BAYER_GREEN_SPLIT = new TagInfoLong(
            "BayerGreenSplit", 0xc62d,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoRational EXIF_TAG_LINEAR_RESPONSE_LIMIT = new TagInfoRational(
            "LinearResponseLimit", 0xc62e,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoAscii EXIF_TAG_CAMERA_SERIAL_NUMBER = new TagInfoAscii(
            "CameraSerialNumber", 0xc62f, -1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoRationals EXIF_TAG_DNG_LENS_INFO = new TagInfoRationals(
            "DNGLensInfo", 0xc630, 4,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoRational EXIF_TAG_CHROMA_BLUR_RADIUS = new TagInfoRational(
            "ChromaBlurRadius", 0xc631,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoRational EXIF_TAG_ANTI_ALIAS_STRENGTH = new TagInfoRational(
            "AntiAliasStrength", 0xc632,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoRational EXIF_TAG_SHADOW_SCALE = new TagInfoRational(
            "ShadowScale", 0xc633,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoBytes EXIF_TAG_DNG_PRIVATE_DATA = new TagInfoBytes(
            "DNGPrivateData", 0xc634, -1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoShort EXIF_TAG_MAKER_NOTE_SAFETY = new TagInfoShort(
            "MakerNoteSafety", 0xc635,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final int MAKER_NOTE_SAFETY_VALUE_UNSAFE = 0;
    public static final int MAKER_NOTE_SAFETY_VALUE_SAFE = 1;

    public static final TagInfoShort EXIF_TAG_CALIBRATION_ILLUMINANT_1 = new TagInfoShort(
            "CalibrationIlluminant1", 0xc65a,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
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

    public static final TagInfoShort EXIF_TAG_CALIBRATION_ILLUMINANT_2 = new TagInfoShort(
            "CalibrationIlluminant2", 0xc65b,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
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

    public static final TagInfoRational EXIF_TAG_BEST_QUALITY_SCALE = new TagInfoRational(
            "BestQualityScale", 0xc65c,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoBytes EXIF_TAG_RAW_DATA_UNIQUE_ID = new TagInfoBytes(
            "RawDataUniqueID", 0xc65d, 16,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoAsciiOrByte EXIF_TAG_ORIGINAL_RAW_FILE_NAME = new TagInfoAsciiOrByte(
            "OriginalRawFileName", 0xc68b, -1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoUndefineds EXIF_TAG_ORIGINAL_RAW_FILE_DATA = new TagInfoUndefineds(
            "OriginalRawFileData", 0xc68c, -1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoShortOrLong EXIF_TAG_ACTIVE_AREA = new TagInfoShortOrLong(
            "ActiveArea", 0xc68d, 4,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoShortOrLong EXIF_TAG_MASKED_AREAS = new TagInfoShortOrLong(
            "MaskedAreas", 0xc68e, 4,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoUndefineds EXIF_TAG_AS_SHOT_ICCPROFILE = new TagInfoUndefineds(
            "AsShotICCProfile", 0xc68f, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoSRationals EXIF_TAG_AS_SHOT_PRE_PROFILE_MATRIX = new TagInfoSRationals(
            "AsShotPreProfileMatrix", 0xc690, -1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoUndefineds EXIF_TAG_CURRENT_ICCPROFILE = new TagInfoUndefineds(
            "CurrentICCProfile", 0xc691, -1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoSRationals EXIF_TAG_CURRENT_PRE_PROFILE_MATRIX = new TagInfoSRationals(
            "CurrentPreProfileMatrix", 0xc692, -1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoShort EXIF_TAG_COLORIMETRIC_REFERENCE = new TagInfoShort(
            "ColorimetricReference", 0xc6bf,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    public static final short COLORIMETRIC_REFERENCE_VALUE_SCENE_REFERRED = 0;
    public static final short COLORIMETRIC_REFERENCE_VALUE_OUTPUT_REFERRED = 1;

    public static final TagInfoAsciiOrByte EXIF_TAG_CAMERA_CALIBRATION_SIGNATURE = new TagInfoAsciiOrByte(
            "CameraCalibrationSignature", 0xc6f3, -1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoAsciiOrByte EXIF_TAG_PROFILE_CALIBRATION_SIGNATURE = new TagInfoAsciiOrByte(
            "ProfileCalibrationSignature", 0xc6f4, -1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoLongs EXIF_TAG_EXTRA_CAMERA_PROFILES = new TagInfoLongs(
            "ExtraCameraProfiles", 0xc6f5, -1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoAsciiOrByte EXIF_TAG_AS_SHOT_PROFILE_NAME = new TagInfoAsciiOrByte(
            "AsShotProfileName", 0xc6f6, -1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoRational EXIF_TAG_NOISE_REDUCTION_APPLIED = new TagInfoRational(
            "NoiseReductionApplied", 0xc6f7,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoAscii EXIF_TAG_PROFILE_NAME = new TagInfoAscii(
            "ProfileName", 0xc6f8, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoLongs EXIF_TAG_PROFILE_HUE_SAT_MAP_DIMS = new TagInfoLongs(
            "ProfileHueSatMapDims", 0xc6f9, 3,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoFloats EXIF_TAG_PROFILE_HUE_SAT_MAP_DATA1 = new TagInfoFloats(
            "ProfileHueSatMapData1", 0xc6fa, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoFloats EXIF_TAG_PROFILE_HUE_SAT_MAP_DATA2 = new TagInfoFloats(
            "ProfileHueSatMapData2", 0xc6fb, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoFloats EXIF_TAG_PROFILE_TONE_CURVE = new TagInfoFloats(
            "ProfileToneCurve", 0xc6fc, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoLong EXIF_TAG_PROFILE_EMBED_POLICY = new TagInfoLong(
            "ProfileEmbedPolicy", 0xc6fd,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final int PROFILE_EMBED_POLICY_VALUE_ALLOW_COPYING = 0;
    public static final int PROFILE_EMBED_POLICY_VALUE_EMBED_IF_USED = 1;
    public static final int PROFILE_EMBED_POLICY_VALUE_EMBED_NEVER = 2;
    public static final int PROFILE_EMBED_POLICY_VALUE_NO_RESTRICTIONS = 3;

    public static final TagInfoAsciiOrByte EXIF_TAG_PROFILE_COPYRIGHT = new TagInfoAsciiOrByte(
            "ProfileCopyright", 0xc6fe, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoSRationals EXIF_TAG_FORWARD_MATRIX1 = new TagInfoSRationals(
            "ForwardMatrix1", 0xc714, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoSRationals EXIF_TAG_FORWARD_MATRIX2 = new TagInfoSRationals(
            "ForwardMatrix2", 0xc715, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoAsciiOrByte EXIF_TAG_PREVIEW_APPLICATION_NAME = new TagInfoAsciiOrByte(
            "PreviewApplicationName", 0xc716, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoAsciiOrByte EXIF_TAG_PREVIEW_APPLICATION_VERSION = new TagInfoAsciiOrByte(
            "PreviewApplicationVersion", 0xc717, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoAsciiOrByte EXIF_TAG_PREVIEW_SETTINGS_NAME = new TagInfoAsciiOrByte(
            "PreviewSettingsName", 0xc718, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoBytes EXIF_TAG_PREVIEW_SETTINGS_DIGEST = new TagInfoBytes(
            "PreviewSettingsDigest", 0xc719, 16,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoLong EXIF_TAG_PREVIEW_COLORSPACE = new TagInfoLong(
            "PreviewColorspace", 0xc71a,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final int PREVIEW_COLORSPACE_VALUE_UNKNOWN = 0;
    public static final int PREVIEW_COLORSPACE_VALUE_GRAY_GAMMA_2_2 = 1;
    public static final int PREVIEW_COLORSPACE_VALUE_sRGB = 2;
    public static final int PREVIEW_COLORSPACE_VALUE_ADOBE_RGB = 3;
    public static final int PREVIEW_COLORSPACE_VALUE_PROPHOTO_RGB = 4;

    public static final TagInfoAscii EXIF_TAG_PREVIEW_DATE_TIME = new TagInfoAscii(
            "PreviewDateTime", 0xc71b, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoBytes EXIF_TAG_RAW_IMAGE_DIGEST = new TagInfoBytes(
            "RawImageDigest", 0xc71c, 16,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoBytes EXIF_TAG_ORIGINAL_RAW_FILE_DIGEST = new TagInfoBytes(
            "OriginalRawFileDigest", 0xc71d, 16,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoShortOrLong EXIF_TAG_SUB_TILE_BLOCK_SIZE = new TagInfoShortOrLong(
            "SubTileBlockSize", 0xc71e, 2,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoShortOrLong EXIF_TAG_ROW_INTERLEAVE_FACTOR = new TagInfoShortOrLong(
            "RowInterleaveFactor", 0xc71f, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoLongs EXIF_TAG_PROFILE_LOOK_TABLE_DIMS = new TagInfoLongs(
            "ProfileLookTableDims", 0xc725, 3,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoFloats EXIF_TAG_PROFILE_LOOK_TABLE_DATA = new TagInfoFloats(
            "ProfileLookTableData", 0xc726, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoUndefineds EXIF_TAG_OPCODE_LIST_1 = new TagInfoUndefineds(
            "OpcodeList1", 0xc740, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoUndefineds EXIF_TAG_OPCODE_LIST_2 = new TagInfoUndefineds(
            "OpcodeList2", 0xc741, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoUndefineds EXIF_TAG_OPCODE_LIST_3 = new TagInfoUndefineds(
            "OpcodeList3", 0xc74E, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoDoubles EXIF_TAG_NOISE_PROFILE = new TagInfoDoubles(
            "NoiseProfile", 0xc761, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final List<TagInfo> ALL_DNG_TAGS =
            Collections.unmodifiableList(Arrays.asList(
                    EXIF_TAG_DNG_VERSION,
                    EXIF_TAG_DNG_BACKWARD_VERSION,
                    EXIF_TAG_UNIQUE_CAMERA_MODEL,
                    EXIF_TAG_LOCALIZED_CAMERA_MODEL,
                    EXIF_TAG_CFAPLANE_COLOR,
                    EXIF_TAG_CFALAYOUT,
                    EXIF_TAG_LINEARIZATION_TABLE,
                    EXIF_TAG_BLACK_LEVEL_REPEAT_DIM,
                    EXIF_TAG_BLACK_LEVEL,
                    EXIF_TAG_BLACK_LEVEL_DELTA_H,
                    EXIF_TAG_BLACK_LEVEL_DELTA_V,
                    EXIF_TAG_WHITE_LEVEL,
                    EXIF_TAG_DEFAULT_SCALE,
                    EXIF_TAG_DEFAULT_CROP_ORIGIN,
                    EXIF_TAG_DEFAULT_CROP_SIZE,
                    EXIF_TAG_COLOR_MATRIX_1,
                    EXIF_TAG_COLOR_MATRIX_2,
                    EXIF_TAG_CAMERA_CALIBRATION_1,
                    EXIF_TAG_CAMERA_CALIBRATION_2,
                    EXIF_TAG_REDUCTION_MATRIX_1,
                    EXIF_TAG_REDUCTION_MATRIX_2,
                    EXIF_TAG_ANALOG_BALANCE,
                    EXIF_TAG_AS_SHOT_NEUTRAL,
                    EXIF_TAG_AS_SHOT_WHITE_XY,
                    EXIF_TAG_BASELINE_EXPOSURE,
                    EXIF_TAG_BASELINE_NOISE,
                    EXIF_TAG_BASELINE_SHARPNESS,
                    EXIF_TAG_BAYER_GREEN_SPLIT,
                    EXIF_TAG_LINEAR_RESPONSE_LIMIT,
                    EXIF_TAG_CAMERA_SERIAL_NUMBER,
                    EXIF_TAG_DNG_LENS_INFO,
                    EXIF_TAG_CHROMA_BLUR_RADIUS,
                    EXIF_TAG_ANTI_ALIAS_STRENGTH,
                    EXIF_TAG_SHADOW_SCALE,
                    EXIF_TAG_DNG_PRIVATE_DATA,
                    EXIF_TAG_MAKER_NOTE_SAFETY,
                    EXIF_TAG_CALIBRATION_ILLUMINANT_1,
                    EXIF_TAG_CALIBRATION_ILLUMINANT_2,
                    EXIF_TAG_BEST_QUALITY_SCALE,
                    EXIF_TAG_RAW_DATA_UNIQUE_ID,
                    EXIF_TAG_ORIGINAL_RAW_FILE_NAME,
                    EXIF_TAG_ORIGINAL_RAW_FILE_DATA,
                    EXIF_TAG_ACTIVE_AREA,
                    EXIF_TAG_MASKED_AREAS,
                    EXIF_TAG_AS_SHOT_ICCPROFILE,
                    EXIF_TAG_AS_SHOT_PRE_PROFILE_MATRIX,
                    EXIF_TAG_CURRENT_ICCPROFILE,
                    EXIF_TAG_CURRENT_PRE_PROFILE_MATRIX,
                    EXIF_TAG_COLORIMETRIC_REFERENCE,
                    EXIF_TAG_CAMERA_CALIBRATION_SIGNATURE,
                    EXIF_TAG_PROFILE_CALIBRATION_SIGNATURE,
                    EXIF_TAG_EXTRA_CAMERA_PROFILES,
                    EXIF_TAG_AS_SHOT_PROFILE_NAME,
                    EXIF_TAG_NOISE_REDUCTION_APPLIED,
                    EXIF_TAG_PROFILE_NAME,
                    EXIF_TAG_PROFILE_HUE_SAT_MAP_DIMS,
                    EXIF_TAG_PROFILE_HUE_SAT_MAP_DATA1,
                    EXIF_TAG_PROFILE_HUE_SAT_MAP_DATA2,
                    EXIF_TAG_PROFILE_TONE_CURVE,
                    EXIF_TAG_PROFILE_EMBED_POLICY,
                    EXIF_TAG_PROFILE_COPYRIGHT,
                    EXIF_TAG_FORWARD_MATRIX1,
                    EXIF_TAG_FORWARD_MATRIX2,
                    EXIF_TAG_PREVIEW_APPLICATION_NAME,
                    EXIF_TAG_PREVIEW_APPLICATION_VERSION,
                    EXIF_TAG_PREVIEW_SETTINGS_NAME,
                    EXIF_TAG_PREVIEW_SETTINGS_DIGEST,
                    EXIF_TAG_PREVIEW_COLORSPACE,
                    EXIF_TAG_PREVIEW_DATE_TIME,
                    EXIF_TAG_RAW_IMAGE_DIGEST,
                    EXIF_TAG_ORIGINAL_RAW_FILE_DIGEST,
                    EXIF_TAG_SUB_TILE_BLOCK_SIZE,
                    EXIF_TAG_ROW_INTERLEAVE_FACTOR,
                    EXIF_TAG_PROFILE_LOOK_TABLE_DIMS,
                    EXIF_TAG_PROFILE_LOOK_TABLE_DATA,
                    EXIF_TAG_OPCODE_LIST_1,
                    EXIF_TAG_OPCODE_LIST_2,
                    EXIF_TAG_OPCODE_LIST_3,
                    EXIF_TAG_NOISE_PROFILE));

    private DngTagConstants() {
    }
}
