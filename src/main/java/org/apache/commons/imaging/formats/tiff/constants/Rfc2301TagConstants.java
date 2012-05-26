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
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong;

/**
 * RFC 2301: File Format for Internet Fax
 * <BR>
 * www.ietf.org/rfc/rfc2301.txt
 * <BR>
 * Also subsumes  "The spirit of TIFF class F"
 * <BR>
 * http://cool.conservation-us.org/bytopic/imaging/std/tiff-f.html
 */
public interface Rfc2301TagConstants extends TiffFieldTypeConstants {
    public static final TagInfoShortOrLong TIFF_TAG_BAD_FAX_LINES = new TagInfoShortOrLong(
            "Bad Fax Lines", 0x0146, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    
    public static final TagInfoShort TIFF_TAG_CLEAN_FAX_DATA = new TagInfoShort(
            "Clean Fax Data", 0x0147, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final int CLEAN_FAX_DATA_VALUE_CLEAN = 0;
    public static final int CLEAN_FAX_DATA_VALUE_REGENERATED = 1;
    public static final int CLEAN_FAX_DATA_VALUE_UNCLEAN = 2;
    
    public static final TagInfoShortOrLong TIFF_TAG_CONSECUTIVE_BAD_FAX_LINES = new TagInfoShortOrLong(
            "Consecutive Bad Fax Lines", 0x0148, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoLong TIFF_TAG_GLOBAL_PARAMETERS_IFD = new TagInfoLong(
            "Global Parameters IFD", 0x0190, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN, true);
    
    public static final TagInfoLong TIFF_TAG_PROFILE_TYPE = new TagInfoLong(
            "Profile Type", 0x0191, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final int PROFILE_TYPE_VALUE_UNSPECIFIED = 0;
    public static final int PROFILE_TYPE_VALUE_GROUP_3_FAX = 1;
    
    public static final TagInfoByte TIFF_TAG_FAX_PROFILE = new TagInfoByte(
            "Fax Profile", 0x0192, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final int FAX_PROFILE_VALUE_UNKNOWN = 0;
    public static final int FAX_PROFILE_VALUE_MINIMAL_B_AND_W_LOSSLESS_S = 1;
    public static final int FAX_PROFILE_VALUE_EXTENDED_B_AND_W_LOSSLESS_F = 2;
    public static final int FAX_PROFILE_VALUE_LOSSLESS_JBIG_B_AND_W_J = 3;
    public static final int FAX_PROFILE_VALUE_LOSSY_COLOR_AND_GRAYSCALE_C = 4;
    public static final int FAX_PROFILE_VALUE_LOSSLESS_COLOR_AND_GRAYSCALE_L = 5;
    public static final int FAX_PROFILE_VALUE_MIXED_RASTER_CONTENT_M = 6;
    
    public static final TagInfoLong TIFF_TAG_CODING_METHODS = new TagInfoLong(
            "Coding Methods", 0x0193, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final int CODING_METHODS_VALUE_T4_1D = 2;
    public static final int CODING_METHODS_VALUE_T4_2D = 4;
    public static final int CODING_METHODS_VALUE_T6 = 8;
    public static final int CODING_METHODS_VALUE_T82_T85 = 16;
    public static final int CODING_METHODS_VALUE_T81 = 32;
    public static final int CODING_METHODS_VALUE_T82_T43 = 64;
    
    public static final TagInfoByte TIFF_TAG_VERSION_YEAR = new TagInfoByte(
            "Version Year", 0x0194, 4,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    
    public static final TagInfoByte TIFF_TAG_MODE_NUMBER = new TagInfoByte(
            "Mode Number", 0x0195, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoRational TIFF_TAG_DECODE = new TagInfoRational(
            "Decode", 0x01b1, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    
    public static final TagInfoShort TIFF_TAG_DEFAULT_IMAGE_COLOR = new TagInfoShort(
            "Default Image Color", 0x01b2, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoLong TIFF_TAG_STRIP_ROW_COUNTS = new TagInfoLong(
            "Strip Row Counts", 0x022f, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoShortOrLong TIFF_TAG_IMAGE_LAYER = new TagInfoShortOrLong(
            "Image Layer", 0x87ac, 2,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final List<TagInfo> ALL_RFC_2301_TAGS =
            Collections.unmodifiableList(Arrays.asList(
                    TIFF_TAG_BAD_FAX_LINES,
                    TIFF_TAG_CLEAN_FAX_DATA,
                    TIFF_TAG_CONSECUTIVE_BAD_FAX_LINES,
                    TIFF_TAG_GLOBAL_PARAMETERS_IFD,
                    TIFF_TAG_PROFILE_TYPE,
                    TIFF_TAG_FAX_PROFILE,
                    TIFF_TAG_CODING_METHODS,
                    TIFF_TAG_VERSION_YEAR,
                    TIFF_TAG_MODE_NUMBER,
                    TIFF_TAG_DECODE,
                    TIFF_TAG_DEFAULT_IMAGE_COLOR,
                    TIFF_TAG_STRIP_ROW_COUNTS,
                    TIFF_TAG_IMAGE_LAYER));
}
