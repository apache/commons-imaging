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
public interface TiffEpTagConstants extends TiffFieldTypeConstants {
    public static final TagInfoShort EXIF_TAG_CFAREPEAT_PATTERN_DIM = new TagInfoShort(
            "CFARepeat Pattern Dim", 0x828d, 2,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    
    public static final TagInfoByte EXIF_TAG_CFAPATTERN_2 = new TagInfoByte(
            "CFAPattern 2", 0x828e, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoAsciiOrRational EXIF_TAG_BATTERY_LEVEL = new TagInfoAsciiOrRational(
            "Battery Level", 0x828f, -1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);
    
    public static final TagInfoUndefined EXIF_TAG_ICC_PROFILE = new TagInfoUndefined(
            "ICC_Profile", 0x8773, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoShort EXIF_TAG_INTERLACE = new TagInfoShort(
            "Interlace", 0x8829, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoSShort EXIF_TAG_TIME_ZONE_OFFSET = new TagInfoSShort(
            "Time Zone Offset", 0x882a, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);

    public static final TagInfoShort EXIF_TAG_SELF_TIMER_MODE = new TagInfoShort(
            "Self Timer Mode", 0x882b, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);

    public static final TagInfoRational EXIF_TAG_FLASH_ENERGY = new TagInfoRational(
            "Flash Energy", 0x920b, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoUndefined EXIF_TAG_SPATIAL_FREQUENCY_RESPONSE_1 = new TagInfoUndefined(
            "Spatial Frequency Response", 0x920c, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    
    public static final TagInfoUndefined EXIF_TAG_NOISE_1 = new TagInfoUndefined(
            "Noise", 0x920d, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    
    public static final TagInfoRational EXIF_TAG_FOCAL_PLANE_XRESOLUTION = new TagInfoRational(
            "Focal Plane XResolution", 0x920e, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    
    public static final TagInfoRational EXIF_TAG_FOCAL_PLANE_YRESOLUTION = new TagInfoRational(
            "Focal Plane YResolution", 0x920f, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    
    public static final TagInfoShort EXIF_TAG_FOCAL_PLANE_RESOLUTION_UNIT = new TagInfoShort(
            "Focal Plane Resolution Unit", 0x9210, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_NONE = 1;
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_INCHES = 2;
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_CM = 3;
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_MM = 4;
    public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_UM = 5;

    public static final TagInfoLong EXIF_TAG_IMAGE_NUMBER_EXIF_IFD = new TagInfoLong(
            "Image Number", 0x9211, 1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);

    public static final TagInfoAscii EXIF_TAG_SECURITY_CLASSIFICATION_EXIF_IFD = new TagInfoAscii(
            "Security Classification", 0x9212, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);

    public static final TagInfoAscii EXIF_TAG_IMAGE_HISTORY_EXIF_IFD = new TagInfoAscii(
            "Image History", 0x9213, -1,
            TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);

    public static final TagInfoRational EXIF_TAG_EXPOSURE_INDEX = new TagInfoRational(
            "Exposure Index", 0x9215, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    
    public static final TagInfoByte EXIF_TAG_TIFF_EPSTANDARD_ID_1 = new TagInfoByte(
            "TIFF/EP Standard ID", 0x9216, 4,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoShort EXIF_TAG_SENSING_METHOD = new TagInfoShort(
            "Sensing Method", 0x9217, 1,
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
                    EXIF_TAG_ICC_PROFILE,
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
