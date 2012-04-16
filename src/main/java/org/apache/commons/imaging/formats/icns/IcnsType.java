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


public class IcnsType
{
    private final int type;
    private final int width;
    private final int height;
    private final int bitsPerPixel;
    private final boolean hasMask;

    public static final IcnsType ICNS_16x12_1BIT_IMAGE_AND_MASK =
        new IcnsType("icm#", 16, 12, 1, true);
    public static final IcnsType ICNS_16x12_4BIT_IMAGE =
        new IcnsType("icm4", 16, 12, 4, false);
    public static final IcnsType ICNS_16x12_8BIT_IMAGE =
        new IcnsType("icm8", 16, 12, 8, false);

    public static final IcnsType ICNS_16x16_8BIT_MASK =
        new IcnsType("s8mk", 16, 16, 8, true);
    public static final IcnsType ICNS_16x16_1BIT_IMAGE_AND_MASK =
        new IcnsType("ics#", 16, 16, 1, true);
    public static final IcnsType ICNS_16x16_4BIT_IMAGE =
        new IcnsType("ics4", 16, 16, 4, false);
    public static final IcnsType ICNS_16x16_8BIT_IMAGE =
        new IcnsType("ics8", 16, 16, 8, false);
    public static final IcnsType ICNS_16x16_32BIT_IMAGE =
        new IcnsType("is32", 16, 16, 32, false);

    public static final IcnsType ICNS_32x32_8BIT_MASK =
        new IcnsType("l8mk", 32, 32, 8, true);
    public static final IcnsType ICNS_32x32_1BIT_IMAGE_AND_MASK =
        new IcnsType("ICN#", 32, 32, 1, true);
    public static final IcnsType ICNS_32x32_4BIT_IMAGE =
        new IcnsType("icl4", 32, 32, 4, false);
    public static final IcnsType ICNS_32x32_8BIT_IMAGE =
        new IcnsType("icl8", 32, 32, 8, false);
    public static final IcnsType ICNS_32x32_32BIT_IMAGE =
        new IcnsType("il32", 32, 32, 32, false);

    public static final IcnsType ICNS_48x48_8BIT_MASK =
        new IcnsType("h8mk", 48, 48, 8, true);
    public static final IcnsType ICNS_48x48_1BIT_IMAGE_AND_MASK =
        new IcnsType("ich#", 48, 48, 1, true);
    public static final IcnsType ICNS_48x48_4BIT_IMAGE =
        new IcnsType("ich4", 48, 48, 4, false);
    public static final IcnsType ICNS_48x48_8BIT_IMAGE =
        new IcnsType("ich8", 48, 48, 8, false);
    public static final IcnsType ICNS_48x48_32BIT_IMAGE =
        new IcnsType("ih32", 48, 48, 32, false);

    public static final IcnsType ICNS_128x128_8BIT_MASK =
        new IcnsType("t8mk", 128, 128, 8, true);
    public static final IcnsType ICNS_128x128_32BIT_IMAGE =
        new IcnsType("it32", 128, 128, 32, false);

    public static final IcnsType ICNS_256x256_32BIT_ARGB_IMAGE =
        new IcnsType("ic08", 256, 256, 32, false);

    public static final IcnsType ICNS_512x512_32BIT_ARGB_IMAGE =
        new IcnsType("ic09", 512, 512, 32, false);

    private static final IcnsType[] allImageTypes =
    {
        ICNS_16x12_1BIT_IMAGE_AND_MASK, ICNS_16x12_4BIT_IMAGE, ICNS_16x12_8BIT_IMAGE,
        ICNS_16x16_1BIT_IMAGE_AND_MASK, ICNS_16x16_4BIT_IMAGE, ICNS_16x16_8BIT_IMAGE, ICNS_16x16_32BIT_IMAGE,
        ICNS_32x32_1BIT_IMAGE_AND_MASK, ICNS_32x32_4BIT_IMAGE, ICNS_32x32_8BIT_IMAGE, ICNS_32x32_32BIT_IMAGE,
        ICNS_48x48_1BIT_IMAGE_AND_MASK, ICNS_48x48_4BIT_IMAGE, ICNS_48x48_8BIT_IMAGE, ICNS_48x48_32BIT_IMAGE,
        ICNS_128x128_32BIT_IMAGE,
        ICNS_256x256_32BIT_ARGB_IMAGE,
        ICNS_512x512_32BIT_ARGB_IMAGE
    };

    private static final IcnsType[] allMaskTypes =
    {
        ICNS_16x12_1BIT_IMAGE_AND_MASK,
        ICNS_16x16_1BIT_IMAGE_AND_MASK, ICNS_16x16_8BIT_MASK,
        ICNS_32x32_1BIT_IMAGE_AND_MASK, ICNS_32x32_8BIT_MASK,
        ICNS_48x48_1BIT_IMAGE_AND_MASK, ICNS_48x48_8BIT_MASK,
        ICNS_128x128_8BIT_MASK
    };

    private IcnsType(String type, int width, int height, int bitsPerPixel, boolean hasMask)
    {
        this.type = typeAsInt(type);
        this.width = width;
        this.height = height;
        this.bitsPerPixel = bitsPerPixel;
        this.hasMask = hasMask;
    }

    public int getType()
    {
        return type;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public int getBitsPerPixel()
    {
        return bitsPerPixel;
    }

    public boolean hasMask()
    {
        return hasMask;
    }

    @Override
    public String toString()
    {
        return getClass().getName() + "[" +
                "width=" + width + "," +
                "height=" + height + "," +
                "bpp=" + bitsPerPixel + "," +
                "hasMask=" + hasMask + "]";
    }

    public static IcnsType findAnyType(int type)
    {
        for (int i = 0; i < allImageTypes.length; i++)
        {
            if (allImageTypes[i].getType() == type)
                return allImageTypes[i];
        }
        for (int i = 0; i < allMaskTypes.length; i++)
        {
            if (allMaskTypes[i].getType() == type)
                return allMaskTypes[i];
        }
        return null;
    }

    public static IcnsType findImageType(int type)
    {
        for (int i = 0; i < allImageTypes.length; i++)
        {
            if (allImageTypes[i].getType() == type)
                return allImageTypes[i];
        }
        return null;
    }

    public static IcnsType find8BPPMaskType(IcnsType imageType)
    {
        for (int i = 0; i < allMaskTypes.length; i++)
        {
            if (allMaskTypes[i].getBitsPerPixel() == 8 &&
                allMaskTypes[i].getWidth() == imageType.getWidth() &&
                allMaskTypes[i].getHeight() == imageType.getHeight())
            {
                return allMaskTypes[i];
            }
        }
        return null;
    }

    public static IcnsType find1BPPMaskType(IcnsType imageType)
    {
        for (int i = 0; i < allMaskTypes.length; i++)
        {
            if (allMaskTypes[i].getBitsPerPixel() == 1 &&
                allMaskTypes[i].getWidth() == imageType.getWidth() &&
                allMaskTypes[i].getHeight() == imageType.getHeight())
            {
                return allMaskTypes[i];
            }
        }
        return null;
    }

    public static int typeAsInt(String type)
    {
        byte[] bytes = null;
        try
        {
            bytes = type.getBytes("US-ASCII");
        }
        catch (UnsupportedEncodingException cannotHappen)
        {
        }
        if (bytes.length != 4)
            throw new IllegalArgumentException("Invalid ICNS type");
        return ((0xff & bytes[0]) << 24) |
            ((0xff & bytes[1]) << 16) |
            ((0xff & bytes[2]) << 8) |
            (0xff & bytes[3]);
    }

    public static String describeType(int type)
    {
        byte[] bytes = new byte[4];
        bytes[0] = (byte)(0xff & (type >> 24));
        bytes[1] = (byte)(0xff & (type >> 16));
        bytes[2] = (byte)(0xff & (type >> 8));
        bytes[3] = (byte)(0xff & type);
        try
        {
            return new String(bytes, "US-ASCII");
        }
        catch (UnsupportedEncodingException cannotHappen)
        {
        }
        return null;
    }
}
