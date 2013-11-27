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

import org.apache.commons.imaging.common.BinaryConstant;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefined;

/**
 * Microsoft's HDP/WDP file format. 
 */
public interface MicrosoftHdPhotoTagConstants {
    /*
     * The byte order for this GUID field is as follows:
     * Data1 (int), Data2 (short), Data3 (short) are little-endian,
     * Data4 (char[8]) is endian-independent.
     */
    TagInfoByte EXIF_TAG_PIXEL_FORMAT = new TagInfoByte(
            "PixelFormat", 0xbc01, 16,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    BinaryConstant PIXEL_FORMAT_VALUE_BLACK_AND_WHITE =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x05);
    BinaryConstant PIXEL_FORMAT_VALUE_8_BIT_GRAY =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x08);
    BinaryConstant PIXEL_FORMAT_VALUE_16_BIT_BGR555 =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x9);
    BinaryConstant PIXEL_FORMAT_VALUE_16_BIT_BGR565 =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0xa);
    BinaryConstant PIXEL_FORMAT_VALUE_16_BIT_GRAY =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0xb);
    BinaryConstant PIXEL_FORMAT_VALUE_24_BIT_BGR =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0xc);
    BinaryConstant PIXEL_FORMAT_VALUE_24_BIT_RGB =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0xd);
    BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_BGR =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0xe);
    BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_BGRA =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0xf);
    BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_PBGRA =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x10);
    BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_GRAY_FLOAT =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x11);
    BinaryConstant PIXEL_FORMAT_VALUE_48_BIT_RGB_FIXED_POINT =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x12);
    BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_BGR101010 =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x13);
    BinaryConstant PIXEL_FORMAT_VALUE_48_BIT_RGB =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x15);
    BinaryConstant PIXEL_FORMAT_VALUE_64_BIT_RGBA =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x16);
    BinaryConstant PIXEL_FORMAT_VALUE_64_BIT_PRGBA =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x17);
    BinaryConstant PIXEL_FORMAT_VALUE_96_BIT_RGB_FIXED_POINT =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x18);
    BinaryConstant PIXEL_FORMAT_VALUE_128_BIT_RGBA_FLOAT =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x19);
    BinaryConstant PIXEL_FORMAT_VALUE_128_BIT_PRGBA_FLOAT =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x1a);
    BinaryConstant PIXEL_FORMAT_VALUE_128_BIT_RGB_FLOAT =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x1b);
    BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_CMYK =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x1c);
    BinaryConstant PIXEL_FORMAT_VALUE_64_BIT_RGBA_FIXED_POINT =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x1d);
    BinaryConstant PIXEL_FORMAT_VALUE_128_BIT_RGBA_FIXED_POINT =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x1e);
    BinaryConstant PIXEL_FORMAT_VALUE_64_BIT_CMYK =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x1f);
    BinaryConstant PIXEL_FORMAT_VALUE_24_BIT_3_CHANNELS =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x20);
    BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_4_CHANNELS =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x21);
    BinaryConstant PIXEL_FORMAT_VALUE_40_BIT_5_CHANNELS =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x22);
    BinaryConstant PIXEL_FORMAT_VALUE_48_BIT_6_CHANNELS =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x23);
    BinaryConstant PIXEL_FORMAT_VALUE_56_BIT_7_CHANNELS =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x24);
    BinaryConstant PIXEL_FORMAT_VALUE_64_BIT_8_CHANNELS =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x25);
    BinaryConstant PIXEL_FORMAT_VALUE_48_BIT_3_CHANNELS =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x26);
    BinaryConstant PIXEL_FORMAT_VALUE_64_BIT_4_CHANNELS =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x27);
    BinaryConstant PIXEL_FORMAT_VALUE_80_BIT_5_CHANNELS =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x28);
    BinaryConstant PIXEL_FORMAT_VALUE_96_BIT_6_CHANNELS =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x29);
    BinaryConstant PIXEL_FORMAT_VALUE_112_BIT_7_CHANNELS =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x2a);
    BinaryConstant PIXEL_FORMAT_VALUE_128_BIT_8_CHANNELS =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x2b);
    BinaryConstant PIXEL_FORMAT_VALUE_40_BIT_CMYK_ALPHA =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x2c);
    BinaryConstant PIXEL_FORMAT_VALUE_80_BIT_CMYK_ALPHA =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x2d);
    BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_3_CHANNELS_ALPHA =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x2e);
    BinaryConstant PIXEL_FORMAT_VALUE_40_BIT_4_CHANNELS_ALPHA =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x2f);
    BinaryConstant PIXEL_FORMAT_VALUE_48_BIT_5_CHANNELS_ALPHA =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x30);
    BinaryConstant PIXEL_FORMAT_VALUE_56_BIT_6_CHANNELS_ALPHA =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x31);
    BinaryConstant PIXEL_FORMAT_VALUE_64_BIT_7_CHANNELS_ALPHA =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x32);
    BinaryConstant PIXEL_FORMAT_VALUE_72_BIT_8_CHANNELS_ALPHA =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x33);
    BinaryConstant PIXEL_FORMAT_VALUE_64_BIT_3_CHANNELS_ALPHA =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x34);
    BinaryConstant PIXEL_FORMAT_VALUE_80_BIT_4_CHANNELS_ALPHA =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x35);
    BinaryConstant PIXEL_FORMAT_VALUE_96_BIT_5_CHANNELS_ALPHA =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x36);
    BinaryConstant PIXEL_FORMAT_VALUE_112_BIT_6_CHANNELS_ALPHA =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x37);
    BinaryConstant PIXEL_FORMAT_VALUE_128_BIT_7_CHANNELS_ALPHA =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x38);
    BinaryConstant PIXEL_FORMAT_VALUE_144_BIT_8_CHANNELS_ALPHA =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x39);
    BinaryConstant PIXEL_FORMAT_VALUE_64_BIT_RGBA_HALF =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x3a);
    BinaryConstant PIXEL_FORMAT_VALUE_48_BIT_RGB_HALF =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x3b);
    BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_RGBE =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x3d);
    BinaryConstant PIXEL_FORMAT_VALUE_16_BIT_GRAY_HALF =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x3e);
    BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_GRAY_FIXED_POINT =
            TagConstantsUtils.createMicrosoftHdPhotoGuidEndingWith((byte) 0x3f);

    TagInfoLong EXIF_TAG_TRANSFOMATION = new TagInfoLong(
            "Transfomation", 0xbc02, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    int TRANSFOMATION_VALUE_HORIZONTAL_NORMAL = 0;
    int TRANSFOMATION_VALUE_MIRROR_VERTICAL = 1;
    int TRANSFOMATION_VALUE_MIRROR_HORIZONTAL = 2;
    int TRANSFOMATION_VALUE_ROTATE_180 = 3;
    int TRANSFOMATION_VALUE_ROTATE_90_CW = 4;
    int TRANSFOMATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_90_CW = 5;
    int TRANSFOMATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_270_CW = 6;
    int TRANSFOMATION_VALUE_ROTATE_270_CW = 7;
    
    TagInfoLong EXIF_TAG_UNCOMPRESSED = new TagInfoLong(
            "Uncompressed", 0xbc03, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    int UNCOMPRESSED_VALUE_NO = 0;
    int UNCOMPRESSED_VALUE_YES = 1;

    TagInfoLong EXIF_TAG_IMAGE_TYPE = new TagInfoLong(
            "ImageType", 0xbc04, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    TagInfoLong EXIF_TAG_IMAGE_WIDTH = new TagInfoLong(
            "ImageWidth", 0xbc80, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    
    TagInfoLong EXIF_TAG_IMAGE_HEIGHT = new TagInfoLong(
            "ImageHeight", 0xbc81, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    
    TagInfoFloat EXIF_TAG_WIDTH_RESOLUTION = new TagInfoFloat(
            "WidthResolution", 0xbc82, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    
    TagInfoFloat EXIF_TAG_HEIGHT_RESOLUTION = new TagInfoFloat(
            "HeightResolution", 0xbc83, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    
    // FIXME: might be an offset?
    TagInfoLong EXIF_TAG_IMAGE_OFFSET = new TagInfoLong(
            "ImageOffset", 0xbcc0, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    
    TagInfoLong EXIF_TAG_IMAGE_BYTE_COUNT = new TagInfoLong(
            "ImageByteCount", 0xbcc1, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    
    // FIXME: might be an offset?
    TagInfoLong EXIF_TAG_ALPHA_OFFSET = new TagInfoLong(
            "AlphaOffset", 0xbcc2, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    
    TagInfoLong EXIF_TAG_ALPHA_BYTE_COUNT = new TagInfoLong(
            "AlphaByteCount", 0xbcc3, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    TagInfoByte EXIF_TAG_IMAGE_DATA_DISCARD = new TagInfoByte(
            "ImageDataDiscard", 0xbcc4, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    int IMAGE_DATA_DISCARD_VALUE_FULL_RESOLUTION = 0;
    int IMAGE_DATA_DISCARD_VALUE_FLEXBITS_DISCARDED = 1;
    int IMAGE_DATA_DISCARD_VALUE_HIGH_PASS_FREQUENCY_DATA_DISCARDED = 2;
    int IMAGE_DATA_DISCARD_VALUE_HIGHPASS_AND_LOW_PASS_FREQUENCY_DATA_DISCARDED = 3;

    TagInfoByte EXIF_TAG_ALPHA_DATA_DISCARD = new TagInfoByte(
            "AlphaDataDiscard", 0xbcc5, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    int ALPHA_DATA_DISCARD_VALUE_FULL_RESOLUTION = 0;
    int ALPHA_DATA_DISCARD_VALUE_FLEXBITS_DISCARDED = 1;
    int ALPHA_DATA_DISCARD_VALUE_HIGH_PASS_FREQUENCY_DATA_DISCARDED = 2;
    int ALPHA_DATA_DISCARD_VALUE_HIGHPASS_AND_LOW_PASS_FREQUENCY_DATA_DISCARDED = 3;

    TagInfoUndefined EXIF_TAG_PADDING = new TagInfoUndefined(
            "Padding", 0xea1c, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    
    List<TagInfo> ALL_MICROSOFT_HD_PHOTO_TAGS =
            Collections.unmodifiableList(Arrays.asList(
                    EXIF_TAG_PIXEL_FORMAT,
                    EXIF_TAG_TRANSFOMATION,
                    EXIF_TAG_UNCOMPRESSED,
                    EXIF_TAG_IMAGE_TYPE,
                    EXIF_TAG_IMAGE_WIDTH,
                    EXIF_TAG_IMAGE_HEIGHT,
                    EXIF_TAG_WIDTH_RESOLUTION,
                    EXIF_TAG_HEIGHT_RESOLUTION,
                    EXIF_TAG_IMAGE_OFFSET,
                    EXIF_TAG_IMAGE_BYTE_COUNT,
                    EXIF_TAG_ALPHA_OFFSET,
                    EXIF_TAG_ALPHA_BYTE_COUNT,
                    EXIF_TAG_IMAGE_DATA_DISCARD,
                    EXIF_TAG_ALPHA_DATA_DISCARD,
                    EXIF_TAG_PADDING));
}
