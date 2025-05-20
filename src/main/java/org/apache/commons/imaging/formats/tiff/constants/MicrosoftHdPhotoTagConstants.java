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

import org.apache.commons.imaging.common.BinaryConstant;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds;

/**
 * Microsoft's HDP/WDP file format.
 */
public final class MicrosoftHdPhotoTagConstants {

    /*
     * The byte order for this GUID field is as follows: Data1 (int), Data2 (short), Data3 (short) are little-endian, Data4 (char[8]) is endian-independent.
     */
    public static final TagInfoBytes EXIF_TAG_PIXEL_FORMAT = new TagInfoBytes("PixelFormat", 0xbc01, 16, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_BLACK_AND_WHITE = createMicrosoftHdPhotoGuidEndingWith((byte) 0x05);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_8_BIT_GRAY = createMicrosoftHdPhotoGuidEndingWith((byte) 0x08);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_16_BIT_BGR555 = createMicrosoftHdPhotoGuidEndingWith((byte) 0x9);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_16_BIT_BGR565 = createMicrosoftHdPhotoGuidEndingWith((byte) 0xa);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_16_BIT_GRAY = createMicrosoftHdPhotoGuidEndingWith((byte) 0xb);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_24_BIT_BGR = createMicrosoftHdPhotoGuidEndingWith((byte) 0xc);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_24_BIT_RGB = createMicrosoftHdPhotoGuidEndingWith((byte) 0xd);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_BGR = createMicrosoftHdPhotoGuidEndingWith((byte) 0xe);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_BGRA = createMicrosoftHdPhotoGuidEndingWith((byte) 0xf);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_PBGRA = createMicrosoftHdPhotoGuidEndingWith((byte) 0x10);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_GRAY_FLOAT = createMicrosoftHdPhotoGuidEndingWith((byte) 0x11);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_48_BIT_RGB_FIXED_POINT = createMicrosoftHdPhotoGuidEndingWith((byte) 0x12);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_BGR101010 = createMicrosoftHdPhotoGuidEndingWith((byte) 0x13);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_48_BIT_RGB = createMicrosoftHdPhotoGuidEndingWith((byte) 0x15);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_64_BIT_RGBA = createMicrosoftHdPhotoGuidEndingWith((byte) 0x16);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_64_BIT_PRGBA = createMicrosoftHdPhotoGuidEndingWith((byte) 0x17);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_96_BIT_RGB_FIXED_POINT = createMicrosoftHdPhotoGuidEndingWith((byte) 0x18);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_128_BIT_RGBA_FLOAT = createMicrosoftHdPhotoGuidEndingWith((byte) 0x19);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_128_BIT_PRGBA_FLOAT = createMicrosoftHdPhotoGuidEndingWith((byte) 0x1a);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_128_BIT_RGB_FLOAT = createMicrosoftHdPhotoGuidEndingWith((byte) 0x1b);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_CMYK = createMicrosoftHdPhotoGuidEndingWith((byte) 0x1c);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_64_BIT_RGBA_FIXED_POINT = createMicrosoftHdPhotoGuidEndingWith((byte) 0x1d);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_128_BIT_RGBA_FIXED_POINT = createMicrosoftHdPhotoGuidEndingWith((byte) 0x1e);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_64_BIT_CMYK = createMicrosoftHdPhotoGuidEndingWith((byte) 0x1f);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_24_BIT_3_CHANNELS = createMicrosoftHdPhotoGuidEndingWith((byte) 0x20);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_4_CHANNELS = createMicrosoftHdPhotoGuidEndingWith((byte) 0x21);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_40_BIT_5_CHANNELS = createMicrosoftHdPhotoGuidEndingWith((byte) 0x22);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_48_BIT_6_CHANNELS = createMicrosoftHdPhotoGuidEndingWith((byte) 0x23);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_56_BIT_7_CHANNELS = createMicrosoftHdPhotoGuidEndingWith((byte) 0x24);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_64_BIT_8_CHANNELS = createMicrosoftHdPhotoGuidEndingWith((byte) 0x25);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_48_BIT_3_CHANNELS = createMicrosoftHdPhotoGuidEndingWith((byte) 0x26);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_64_BIT_4_CHANNELS = createMicrosoftHdPhotoGuidEndingWith((byte) 0x27);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_80_BIT_5_CHANNELS = createMicrosoftHdPhotoGuidEndingWith((byte) 0x28);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_96_BIT_6_CHANNELS = createMicrosoftHdPhotoGuidEndingWith((byte) 0x29);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_112_BIT_7_CHANNELS = createMicrosoftHdPhotoGuidEndingWith((byte) 0x2a);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_128_BIT_8_CHANNELS = createMicrosoftHdPhotoGuidEndingWith((byte) 0x2b);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_40_BIT_CMYK_ALPHA = createMicrosoftHdPhotoGuidEndingWith((byte) 0x2c);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_80_BIT_CMYK_ALPHA = createMicrosoftHdPhotoGuidEndingWith((byte) 0x2d);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_3_CHANNELS_ALPHA = createMicrosoftHdPhotoGuidEndingWith((byte) 0x2e);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_40_BIT_4_CHANNELS_ALPHA = createMicrosoftHdPhotoGuidEndingWith((byte) 0x2f);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_48_BIT_5_CHANNELS_ALPHA = createMicrosoftHdPhotoGuidEndingWith((byte) 0x30);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_56_BIT_6_CHANNELS_ALPHA = createMicrosoftHdPhotoGuidEndingWith((byte) 0x31);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_64_BIT_7_CHANNELS_ALPHA = createMicrosoftHdPhotoGuidEndingWith((byte) 0x32);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_72_BIT_8_CHANNELS_ALPHA = createMicrosoftHdPhotoGuidEndingWith((byte) 0x33);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_64_BIT_3_CHANNELS_ALPHA = createMicrosoftHdPhotoGuidEndingWith((byte) 0x34);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_80_BIT_4_CHANNELS_ALPHA = createMicrosoftHdPhotoGuidEndingWith((byte) 0x35);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_96_BIT_5_CHANNELS_ALPHA = createMicrosoftHdPhotoGuidEndingWith((byte) 0x36);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_112_BIT_6_CHANNELS_ALPHA = createMicrosoftHdPhotoGuidEndingWith((byte) 0x37);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_128_BIT_7_CHANNELS_ALPHA = createMicrosoftHdPhotoGuidEndingWith((byte) 0x38);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_144_BIT_8_CHANNELS_ALPHA = createMicrosoftHdPhotoGuidEndingWith((byte) 0x39);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_64_BIT_RGBA_HALF = createMicrosoftHdPhotoGuidEndingWith((byte) 0x3a);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_48_BIT_RGB_HALF = createMicrosoftHdPhotoGuidEndingWith((byte) 0x3b);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_RGBE = createMicrosoftHdPhotoGuidEndingWith((byte) 0x3d);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_16_BIT_GRAY_HALF = createMicrosoftHdPhotoGuidEndingWith((byte) 0x3e);
    public static final BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_GRAY_FIXED_POINT = createMicrosoftHdPhotoGuidEndingWith((byte) 0x3f);

    public static final TagInfoLong EXIF_TAG_TRANSFORMATION = new TagInfoLong("Transformation", 0xbc02, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final int TRANSFORMATION_VALUE_HORIZONTAL_NORMAL = 0;
    public static final int TRANSFORMATION_VALUE_MIRROR_VERTICAL = 1;
    public static final int TRANSFORMATION_VALUE_MIRROR_HORIZONTAL = 2;
    public static final int TRANSFORMATION_VALUE_ROTATE_180 = 3;
    public static final int TRANSFORMATION_VALUE_ROTATE_90_CW = 4;
    public static final int TRANSFORMATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_90_CW = 5;
    public static final int TRANSFORMATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_270_CW = 6;
    public static final int TRANSFORMATION_VALUE_ROTATE_270_CW = 7;

    public static final TagInfoLong EXIF_TAG_UNCOMPRESSED = new TagInfoLong("Uncompressed", 0xbc03, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final int UNCOMPRESSED_VALUE_NO = 0;
    public static final int UNCOMPRESSED_VALUE_YES = 1;

    public static final TagInfoLong EXIF_TAG_IMAGE_TYPE = new TagInfoLong("ImageType", 0xbc04, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoLong EXIF_TAG_IMAGE_WIDTH = new TagInfoLong("ImageWidth", 0xbc80, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoLong EXIF_TAG_IMAGE_HEIGHT = new TagInfoLong("ImageHeight", 0xbc81, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoFloat EXIF_TAG_WIDTH_RESOLUTION = new TagInfoFloat("WidthResolution", 0xbc82, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoFloat EXIF_TAG_HEIGHT_RESOLUTION = new TagInfoFloat("HeightResolution", 0xbc83, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    // FIXME: might be an offset?
    public static final TagInfoLong EXIF_TAG_IMAGE_OFFSET = new TagInfoLong("ImageOffset", 0xbcc0, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoLong EXIF_TAG_IMAGE_BYTE_COUNT = new TagInfoLong("ImageByteCount", 0xbcc1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    // FIXME: might be an offset?
    public static final TagInfoLong EXIF_TAG_ALPHA_OFFSET = new TagInfoLong("AlphaOffset", 0xbcc2, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoLong EXIF_TAG_ALPHA_BYTE_COUNT = new TagInfoLong("AlphaByteCount", 0xbcc3, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoByte EXIF_TAG_IMAGE_DATA_DISCARD = new TagInfoByte("ImageDataDiscard", 0xbcc4, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final int IMAGE_DATA_DISCARD_VALUE_FULL_RESOLUTION = 0;
    public static final int IMAGE_DATA_DISCARD_VALUE_FLEXBITS_DISCARDED = 1;
    public static final int IMAGE_DATA_DISCARD_VALUE_HIGH_PASS_FREQUENCY_DATA_DISCARDED = 2;
    public static final int IMAGE_DATA_DISCARD_VALUE_HIGHPASS_AND_LOW_PASS_FREQUENCY_DATA_DISCARDED = 3;

    public static final TagInfoByte EXIF_TAG_ALPHA_DATA_DISCARD = new TagInfoByte("AlphaDataDiscard", 0xbcc5, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    public static final int ALPHA_DATA_DISCARD_VALUE_FULL_RESOLUTION = 0;
    public static final int ALPHA_DATA_DISCARD_VALUE_FLEXBITS_DISCARDED = 1;
    public static final int ALPHA_DATA_DISCARD_VALUE_HIGH_PASS_FREQUENCY_DATA_DISCARDED = 2;
    public static final int ALPHA_DATA_DISCARD_VALUE_HIGHPASS_AND_LOW_PASS_FREQUENCY_DATA_DISCARDED = 3;

    public static final TagInfoUndefineds EXIF_TAG_PADDING = new TagInfoUndefineds("Padding", 0xea1c, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final List<TagInfo> ALL_MICROSOFT_HD_PHOTO_TAGS = Collections
            .unmodifiableList(Arrays.asList(EXIF_TAG_PIXEL_FORMAT, EXIF_TAG_TRANSFORMATION, EXIF_TAG_UNCOMPRESSED, EXIF_TAG_IMAGE_TYPE, EXIF_TAG_IMAGE_WIDTH,
                    EXIF_TAG_IMAGE_HEIGHT, EXIF_TAG_WIDTH_RESOLUTION, EXIF_TAG_HEIGHT_RESOLUTION, EXIF_TAG_IMAGE_OFFSET, EXIF_TAG_IMAGE_BYTE_COUNT,
                    EXIF_TAG_ALPHA_OFFSET, EXIF_TAG_ALPHA_BYTE_COUNT, EXIF_TAG_IMAGE_DATA_DISCARD, EXIF_TAG_ALPHA_DATA_DISCARD, EXIF_TAG_PADDING));

    private static BinaryConstant createMicrosoftHdPhotoGuidEndingWith(final byte end) {
        return new BinaryConstant(new byte[] { (byte) 0x24, (byte) 0xC3, (byte) 0xDD, (byte) 0x6F, (byte) 0x03, (byte) 0x4E, (byte) 0xFE, (byte) 0x4B,
                (byte) 0xB1, (byte) 0x85, (byte) 0x3D, (byte) 0x77, (byte) 0x76, (byte) 0x8D, (byte) 0xC9, end });
    }

    private MicrosoftHdPhotoTagConstants() {
    }
}
