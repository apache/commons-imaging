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
package org.apache.commons.imaging.formats.icns;

import java.io.UnsupportedEncodingException;

enum IcnsType {

    ICNS_16x12_1BIT_IMAGE_AND_MASK("icm#", 16, 12, 1, true, false), ICNS_16x12_4BIT_IMAGE("icm4", 16, 12, 4, false, false), ICNS_16x12_8BIT_IMAGE("icm8", 16, 12, 8, false, false), ICNS_16x16_8BIT_MASK("s8mk", 16, 16, 8, true, false), ICNS_16x16_1BIT_IMAGE_AND_MASK("ics#", 16, 16, 1, true, false), ICNS_16x16_4BIT_IMAGE("ics4", 16, 16, 4, false, false), ICNS_16x16_8BIT_IMAGE("ics8", 16, 16, 8, false, false), ICNS_16x16_32BIT_IMAGE("is32", 16, 16, 32, false, false), ICNS_16x16_32BIT_ARGB_IMAGE("icp4", 16, 16, 32, false, true),

    ICNS_32x32_1BIT_MONO_IMAGE("ICON", 32, 32, 1, false, false), ICNS_32x32_1BIT_IMAGE_AND_MASK("ICN#", 32, 32, 1, true, false), ICNS_32x32_4BIT_IMAGE("icl4", 32, 32, 4, false, false), ICNS_32x32_8BIT_IMAGE("icl8", 32, 32, 8, false, false), ICNS_32x32_8BIT_MASK("l8mk", 32, 32, 8, true, false), ICNS_32x32_32BIT_IMAGE("il32", 32, 32, 32, false, false), ICNS_32x32_32BIT_ARGB_IMAGE("icp5", 32, 32, 32, false, true), ICNS_32x32_32BIT_RETINA_IMAGE("ic11", 32, 32, 32, false, true),

    ICNS_48x48_1BIT_IMAGE_AND_MASK("ich#", 48, 48, 1, true, false), ICNS_48x48_4BIT_IMAGE("ich4", 48, 48, 4, false, false), ICNS_48x48_8BIT_IMAGE("ich8", 48, 48, 8, false, false), ICNS_48x48_8BIT_MASK("h8mk", 48, 48, 8, true, false), ICNS_48x48_32BIT_IMAGE("ih32", 48, 48, 32, false, false),

    ICNS_64x64_32BIT_ARGB_IMAGE("icp6", 64, 64, 32, false, true), ICNS_64x64_32BIT_RETINA_IMAGE("ic12", 64, 64, 32, false, true),

    ICNS_128x128_8BIT_MASK("t8mk", 128, 128, 8, true, false), ICNS_128x128_32BIT_IMAGE("it32", 128, 128, 32, false, false), ICNS_128x128_32BIT_ARGB_IMAGE("ic07", 128, 128, 32, false, true),

    ICNS_256x256_32BIT_ARGB_IMAGE("ic08", 256, 256, 32, false, true), ICNS_256x256_32BIT_RETINA_IMAGE("ic13", 256, 256, 32, false, true),

    ICNS_512x512_32BIT_ARGB_IMAGE("ic09", 512, 512, 32, false, true), ICNS_512x512_32BIT_RETINA_IMAGE("ic14", 512, 512, 32, false, true),

    ICNS_1024x1024_32BIT_ARGB_IMAGE("ic10", 1024, 1024, 32, false, true);

    private static final IcnsType[] ALL_IMAGE_TYPES = { ICNS_16x12_1BIT_IMAGE_AND_MASK, ICNS_16x12_4BIT_IMAGE, ICNS_16x12_8BIT_IMAGE, ICNS_16x16_1BIT_IMAGE_AND_MASK, ICNS_16x16_4BIT_IMAGE, ICNS_16x16_8BIT_IMAGE, ICNS_16x16_32BIT_IMAGE, ICNS_16x16_32BIT_ARGB_IMAGE, ICNS_32x32_1BIT_MONO_IMAGE, ICNS_32x32_1BIT_IMAGE_AND_MASK, ICNS_32x32_4BIT_IMAGE, ICNS_32x32_8BIT_IMAGE, ICNS_32x32_32BIT_IMAGE, ICNS_32x32_32BIT_ARGB_IMAGE, ICNS_32x32_32BIT_RETINA_IMAGE, ICNS_48x48_1BIT_IMAGE_AND_MASK, ICNS_48x48_4BIT_IMAGE, ICNS_48x48_8BIT_IMAGE, ICNS_48x48_32BIT_IMAGE, ICNS_64x64_32BIT_ARGB_IMAGE, ICNS_64x64_32BIT_RETINA_IMAGE, ICNS_128x128_32BIT_IMAGE, ICNS_128x128_32BIT_ARGB_IMAGE, ICNS_256x256_32BIT_ARGB_IMAGE, ICNS_256x256_32BIT_RETINA_IMAGE, ICNS_512x512_32BIT_ARGB_IMAGE, ICNS_512x512_32BIT_RETINA_IMAGE, ICNS_1024x1024_32BIT_ARGB_IMAGE };

    private static final IcnsType[] ALL_MASK_TYPES = { ICNS_16x12_1BIT_IMAGE_AND_MASK, ICNS_16x16_1BIT_IMAGE_AND_MASK, ICNS_16x16_8BIT_MASK, ICNS_32x32_1BIT_IMAGE_AND_MASK, ICNS_32x32_8BIT_MASK, ICNS_48x48_1BIT_IMAGE_AND_MASK, ICNS_48x48_8BIT_MASK, ICNS_128x128_8BIT_MASK };

    private final int type;
    private final String typeName;
    private final int width;
    private final int height;
    private final int bitsPerPixel;
    private final boolean hasMask;
    private final boolean isPngOrJpeg2000;

    private IcnsType(final String type, final int width, final int height, final int bitsPerPixel, final boolean hasMask, final boolean isPngOrJpeg2000) {
        this.type = typeAsInt(type);
        this.typeName = type;
        this.width = width;
        this.height = height;
        this.bitsPerPixel = bitsPerPixel;
        this.hasMask = hasMask;
        this.isPngOrJpeg2000 = isPngOrJpeg2000;
    }

    public int getType() {
        return this.type;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public int getBitsPerPixel() {
        return this.bitsPerPixel;
    }

    public boolean hasMask() {
        return this.hasMask;
    }

    public boolean isPngOrJpeg2000() {
        return this.isPngOrJpeg2000;
    }

    @Override
    public String toString() {
        return getClass().getName()
            + "["
            + "width="
            + this.width
            + ","
            + "height="
            + this.height
            + ","
            + "bpp="
            + this.bitsPerPixel
            + ","
            + "hasMask="
            + this.hasMask
            + "]";
    }

    public static IcnsType findAnyType(final int type) {
        for (final IcnsType allImageType : ALL_IMAGE_TYPES) {
            if (allImageType.getType() == type) {
                return allImageType;
            }
        }
        for (final IcnsType allMaskType : ALL_MASK_TYPES) {
            if (allMaskType.getType() == type) {
                return allMaskType;
            }
        }
        return null;
    }

    public static IcnsType findImageType(final int type) {
        for (final IcnsType allImageType : ALL_IMAGE_TYPES) {
            if (allImageType.getType() == type) {
                return allImageType;
            }
        }
        return null;
    }

    public static IcnsType find8BPPMaskType(final IcnsType imageType) {
        for (final IcnsType allMaskType : ALL_MASK_TYPES) {
            if (allMaskType.getBitsPerPixel() == 8
                && allMaskType.getWidth() == imageType.getWidth()
                && allMaskType.getHeight() == imageType.getHeight()) {
                return allMaskType;
            }
        }
        return null;
    }

    public static IcnsType find1BPPMaskType(final IcnsType imageType) {
        for (final IcnsType allMaskType : ALL_MASK_TYPES) {
            if (allMaskType.getBitsPerPixel() == 1
                && allMaskType.getWidth() == imageType.getWidth()
                && allMaskType.getHeight() == imageType.getHeight()) {
                return allMaskType;
            }
        }
        return null;
    }

    public static int typeAsInt(final String type) {
        final byte[] bytes;
        try {
            bytes = type.getBytes("US-ASCII");
        } catch (final UnsupportedEncodingException unsupportedEncodingException) {
            throw new IllegalArgumentException("Your Java doesn't support US-ASCII", unsupportedEncodingException);
        }
        if (bytes.length != 4) {
            throw new IllegalArgumentException("Invalid ICNS type");
        }
        return ((0xff & bytes[0]) << 24)
            | ((0xff & bytes[1]) << 16)
            | ((0xff & bytes[2]) << 8)
            | (0xff & bytes[3]);
    }

    public static String describeType(final int type) {
        final byte[] bytes = new byte[4];
        bytes[0] = (byte) (0xff & (type >> 24));
        bytes[1] = (byte) (0xff & (type >> 16));
        bytes[2] = (byte) (0xff & (type >> 8));
        bytes[3] = (byte) (0xff & type);
        try {
            return new String(bytes, "US-ASCII");
        } catch (final UnsupportedEncodingException unsupportedEncodingException) {
            throw new IllegalArgumentException("Your Java doesn't support US-ASCII", unsupportedEncodingException);
        }
    }
}
