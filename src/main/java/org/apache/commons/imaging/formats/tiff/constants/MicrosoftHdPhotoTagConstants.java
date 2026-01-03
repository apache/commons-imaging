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
    /** EXIF tag: Pixel Format. */
    public static final TagInfoBytes EXIF_TAG_PIXEL_FORMAT = new TagInfoBytes("PixelFormat", 0xbc01, 16, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    /** Pixel format: Black and White. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_BLACK_AND_WHITE = create((byte) 0x05);

    /** Pixel format: 8-bit Gray. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_8_BIT_GRAY = create((byte) 0x08);

    /** Pixel format: 16-bit BGR555. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_16_BIT_BGR555 = create((byte) 0x9);

    /** Pixel format: 16-bit BGR565. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_16_BIT_BGR565 = create((byte) 0xa);

    /** Pixel format: 16-bit Gray. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_16_BIT_GRAY = create((byte) 0xb);

    /** Pixel format: 24-bit BGR. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_24_BIT_BGR = create((byte) 0xc);

    /** Pixel format: 24-bit RGB. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_24_BIT_RGB = create((byte) 0xd);

    /** Pixel format: 32-bit BGR. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_BGR = create((byte) 0xe);

    /** Pixel format: 32-bit BGRA. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_BGRA = create((byte) 0xf);

    /** Pixel format: 32-bit PBGRA. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_PBGRA = create((byte) 0x10);

    /** Pixel format: 32-bit Gray Float. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_GRAY_FLOAT = create((byte) 0x11);

    /** Pixel format: 48-bit RGB Fixed Point. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_48_BIT_RGB_FIXED_POINT = create((byte) 0x12);

    /** Pixel format: 32-bit BGR101010. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_BGR101010 = create((byte) 0x13);

    /** Pixel format: 48-bit RGB. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_48_BIT_RGB = create((byte) 0x15);

    /** Pixel format: 64-bit RGBA. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_64_BIT_RGBA = create((byte) 0x16);

    /** Pixel format: 64-bit PRGBA. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_64_BIT_PRGBA = create((byte) 0x17);

    /** Pixel format: 96-bit RGB Fixed Point. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_96_BIT_RGB_FIXED_POINT = create((byte) 0x18);

    /** Pixel format: 128-bit RGBA Float. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_128_BIT_RGBA_FLOAT = create((byte) 0x19);

    /** Pixel format: 128-bit PRGBA Float. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_128_BIT_PRGBA_FLOAT = create((byte) 0x1a);

    /** Pixel format: 128-bit RGB Float. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_128_BIT_RGB_FLOAT = create((byte) 0x1b);

    /** Pixel format: 32-bit CMYK. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_CMYK = create((byte) 0x1c);

    /** Pixel format: 64-bit RGBA Fixed Point. */
    /** Pixel format: 64-bit RGBA Fixed Point. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_64_BIT_RGBA_FIXED_POINT = create((byte) 0x1d);

    /** Pixel format: 128-bit RGBA Fixed Point. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_128_BIT_RGBA_FIXED_POINT = create((byte) 0x1e);

    /** Pixel format: 64-bit CMYK. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_64_BIT_CMYK = create((byte) 0x1f);

    /** Pixel format: 24-bit 3 Channels. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_24_BIT_3_CHANNELS = create((byte) 0x20);

    /** Pixel format: 32-bit 4 Channels. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_4_CHANNELS = create((byte) 0x21);

    /** Pixel format: 40-bit 5 Channels. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_40_BIT_5_CHANNELS = create((byte) 0x22);

    /** Pixel format: 48-bit 6 Channels. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_48_BIT_6_CHANNELS = create((byte) 0x23);

    /** Pixel format: 56-bit 7 Channels. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_56_BIT_7_CHANNELS = create((byte) 0x24);

    /** Pixel format: 64-bit 8 Channels. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_64_BIT_8_CHANNELS = create((byte) 0x25);

    /** Pixel format: 48-bit 3 Channels. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_48_BIT_3_CHANNELS = create((byte) 0x26);

    /** Pixel format: 64-bit 4 Channels. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_64_BIT_4_CHANNELS = create((byte) 0x27);

    /** Pixel format: 80-bit 5 Channels. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_80_BIT_5_CHANNELS = create((byte) 0x28);

    /** Pixel format: 96-bit 6 Channels. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_96_BIT_6_CHANNELS = create((byte) 0x29);

    /** Pixel format: 112-bit 7 Channels. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_112_BIT_7_CHANNELS = create((byte) 0x2a);

    /** Pixel format: 128-bit 8 Channels. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_128_BIT_8_CHANNELS = create((byte) 0x2b);

    /** Pixel format: 40-bit CMYK Alpha. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_40_BIT_CMYK_ALPHA = create((byte) 0x2c);

    /** Pixel format: 80-bit CMYK Alpha. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_80_BIT_CMYK_ALPHA = create((byte) 0x2d);

    /** Pixel format: 32-bit 3 Channels Alpha. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_3_CHANNELS_ALPHA = create((byte) 0x2e);

    /** Pixel format: 40-bit 4 Channels Alpha. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_40_BIT_4_CHANNELS_ALPHA = create((byte) 0x2f);

    /** Pixel format: 48-bit 5 Channels Alpha. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_48_BIT_5_CHANNELS_ALPHA = create((byte) 0x30);

    /** Pixel format: 56-bit 6 Channels Alpha. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_56_BIT_6_CHANNELS_ALPHA = create((byte) 0x31);

    /** Pixel format: 64-bit 7 Channels Alpha. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_64_BIT_7_CHANNELS_ALPHA = create((byte) 0x32);

    /** Pixel format: 72-bit 8 Channels Alpha. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_72_BIT_8_CHANNELS_ALPHA = create((byte) 0x33);

    /** Pixel format: 64-bit 3 Channels Alpha. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_64_BIT_3_CHANNELS_ALPHA = create((byte) 0x34);

    /** Pixel format: 80-bit 4 Channels Alpha. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_80_BIT_4_CHANNELS_ALPHA = create((byte) 0x35);

    /** Pixel format: 96-bit 5 Channels Alpha. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_96_BIT_5_CHANNELS_ALPHA = create((byte) 0x36);

    /** Pixel format: 112-bit 6 Channels Alpha. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_112_BIT_6_CHANNELS_ALPHA = create((byte) 0x37);

    /** Pixel format: 128-bit 7 Channels Alpha. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_128_BIT_7_CHANNELS_ALPHA = create((byte) 0x38);

    /** Pixel format: 144-bit 8 Channels Alpha. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_144_BIT_8_CHANNELS_ALPHA = create((byte) 0x39);

    /** Pixel format: 64-bit RGBA Half. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_64_BIT_RGBA_HALF = create((byte) 0x3a);

    /** Pixel format: 48-bit RGB Half. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_48_BIT_RGB_HALF = create((byte) 0x3b);

    /** Pixel format: 32-bit RGBE. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_RGBE = create((byte) 0x3d);

    /** Pixel format: 16-bit Gray Half. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_16_BIT_GRAY_HALF = create((byte) 0x3e);

    /** Pixel format: 32-bit Gray Fixed Point. */
    public static final BinaryConstant PIXEL_FORMAT_VALUE_32_BIT_GRAY_FIXED_POINT = create((byte) 0x3f);

    /** EXIF tag: Transformation. */
    public static final TagInfoLong EXIF_TAG_TRANSFORMATION = new TagInfoLong("Transformation", 0xbc02, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    /** Transformation value: Horizontal (normal). */
    public static final int TRANSFORMATION_VALUE_HORIZONTAL_NORMAL = 0;

    /** Transformation value: Mirror vertical. */
    public static final int TRANSFORMATION_VALUE_MIRROR_VERTICAL = 1;

    /** Transformation value: Mirror horizontal. */
    public static final int TRANSFORMATION_VALUE_MIRROR_HORIZONTAL = 2;

    /** Transformation value: Rotate 180. */
    public static final int TRANSFORMATION_VALUE_ROTATE_180 = 3;

    /** Transformation value: Rotate 90 CW. */
    public static final int TRANSFORMATION_VALUE_ROTATE_90_CW = 4;

    /** Transformation value: Mirror horizontal and rotate 90 CW. */
    public static final int TRANSFORMATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_90_CW = 5;

    /** Transformation value: Mirror horizontal and rotate 270 CW. */
    public static final int TRANSFORMATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_270_CW = 6;

    /** Transformation value: Rotate 270 CW. */
    public static final int TRANSFORMATION_VALUE_ROTATE_270_CW = 7;

    /** EXIF tag: Uncompressed. */
    public static final TagInfoLong EXIF_TAG_UNCOMPRESSED = new TagInfoLong("Uncompressed", 0xbc03, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    /** Uncompressed value: No. */
    public static final int UNCOMPRESSED_VALUE_NO = 0;

    /** Uncompressed value: Yes. */
    public static final int UNCOMPRESSED_VALUE_YES = 1;

    /** EXIF tag: Image Type. */
    public static final TagInfoLong EXIF_TAG_IMAGE_TYPE = new TagInfoLong("ImageType", 0xbc04, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    /** EXIF tag: Image Width. */
    public static final TagInfoLong EXIF_TAG_IMAGE_WIDTH = new TagInfoLong("ImageWidth", 0xbc80, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    /** EXIF tag: Image Height. */
    public static final TagInfoLong EXIF_TAG_IMAGE_HEIGHT = new TagInfoLong("ImageHeight", 0xbc81, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    /** EXIF tag: Width Resolution. */
    public static final TagInfoFloat EXIF_TAG_WIDTH_RESOLUTION = new TagInfoFloat("WidthResolution", 0xbc82, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    /** EXIF tag: Height Resolution. */
    public static final TagInfoFloat EXIF_TAG_HEIGHT_RESOLUTION = new TagInfoFloat("HeightResolution", 0xbc83, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    // FIXME: might be an offset?
    /** EXIF tag: Image Offset. */
    public static final TagInfoLong EXIF_TAG_IMAGE_OFFSET = new TagInfoLong("ImageOffset", 0xbcc0, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    /** EXIF tag: Image Byte Count. */
    public static final TagInfoLong EXIF_TAG_IMAGE_BYTE_COUNT = new TagInfoLong("ImageByteCount", 0xbcc1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    // FIXME: might be an offset?
    /** EXIF tag: Alpha Offset. */
    public static final TagInfoLong EXIF_TAG_ALPHA_OFFSET = new TagInfoLong("AlphaOffset", 0xbcc2, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    /** EXIF tag: Alpha Byte Count. */
    public static final TagInfoLong EXIF_TAG_ALPHA_BYTE_COUNT = new TagInfoLong("AlphaByteCount", 0xbcc3, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    /** EXIF tag: Image Data Discard. */
    public static final TagInfoByte EXIF_TAG_IMAGE_DATA_DISCARD = new TagInfoByte("ImageDataDiscard", 0xbcc4, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    /** Image data discard value: Full resolution. */
    public static final int IMAGE_DATA_DISCARD_VALUE_FULL_RESOLUTION = 0;

    /** Image data discard value: Flexbits discarded. */
    public static final int IMAGE_DATA_DISCARD_VALUE_FLEXBITS_DISCARDED = 1;

    /** Image data discard value: High pass frequency data discarded. */
    public static final int IMAGE_DATA_DISCARD_VALUE_HIGH_PASS_FREQUENCY_DATA_DISCARDED = 2;

    /** Image data discard value: Highpass and low pass frequency data discarded. */
    public static final int IMAGE_DATA_DISCARD_VALUE_HIGHPASS_AND_LOW_PASS_FREQUENCY_DATA_DISCARDED = 3;

    /** EXIF tag: Alpha Data Discard. */
    public static final TagInfoByte EXIF_TAG_ALPHA_DATA_DISCARD = new TagInfoByte("AlphaDataDiscard", 0xbcc5, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    /** Alpha data discard value: Full resolution. */
    public static final int ALPHA_DATA_DISCARD_VALUE_FULL_RESOLUTION = 0;

    /** Alpha data discard value: Flexbits discarded. */
    public static final int ALPHA_DATA_DISCARD_VALUE_FLEXBITS_DISCARDED = 1;

    /** Alpha data discard value: High pass frequency data discarded. */
    public static final int ALPHA_DATA_DISCARD_VALUE_HIGH_PASS_FREQUENCY_DATA_DISCARDED = 2;

    /** Alpha data discard value: Highpass and low pass frequency data discarded. */
    public static final int ALPHA_DATA_DISCARD_VALUE_HIGHPASS_AND_LOW_PASS_FREQUENCY_DATA_DISCARDED = 3;

    public static final TagInfoUndefineds EXIF_TAG_PADDING = new TagInfoUndefineds("Padding", 0xea1c, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final List<TagInfo> ALL_MICROSOFT_HD_PHOTO_TAGS = Collections
            .unmodifiableList(Arrays.asList(EXIF_TAG_PIXEL_FORMAT, EXIF_TAG_TRANSFORMATION, EXIF_TAG_UNCOMPRESSED, EXIF_TAG_IMAGE_TYPE, EXIF_TAG_IMAGE_WIDTH,
                    EXIF_TAG_IMAGE_HEIGHT, EXIF_TAG_WIDTH_RESOLUTION, EXIF_TAG_HEIGHT_RESOLUTION, EXIF_TAG_IMAGE_OFFSET, EXIF_TAG_IMAGE_BYTE_COUNT,
                    EXIF_TAG_ALPHA_OFFSET, EXIF_TAG_ALPHA_BYTE_COUNT, EXIF_TAG_IMAGE_DATA_DISCARD, EXIF_TAG_ALPHA_DATA_DISCARD, EXIF_TAG_PADDING));

    private static BinaryConstant create(final byte end) {
        return new BinaryConstant(new byte[] { (byte) 0x24, (byte) 0xC3, (byte) 0xDD, (byte) 0x6F, (byte) 0x03, (byte) 0x4E, (byte) 0xFE, (byte) 0x4B,
                (byte) 0xB1, (byte) 0x85, (byte) 0x3D, (byte) 0x77, (byte) 0x76, (byte) 0x8D, (byte) 0xC9, end });
    }

    private MicrosoftHdPhotoTagConstants() {
    }
}
