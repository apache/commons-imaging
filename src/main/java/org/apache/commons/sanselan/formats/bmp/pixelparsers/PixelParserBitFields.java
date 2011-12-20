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
package org.apache.commons.sanselan.formats.bmp.pixelparsers;

import java.io.IOException;

import org.apache.commons.sanselan.ImageReadException;
import org.apache.commons.sanselan.formats.bmp.BmpHeaderInfo;

public class PixelParserBitFields extends PixelParserSimple
{

    private final int redShift;
    private final int greenShift;
    private final int blueShift;
    private final int alphaShift;

    private final int redMask;
    private final int greenMask;
    private final int blueMask;
    private final int alphaMask;

    public PixelParserBitFields(BmpHeaderInfo bhi, byte ColorTable[],
            byte ImageData[])
    {
        super(bhi, ColorTable, ImageData);

        redMask = bhi.redMask;
        greenMask = bhi.greenMask;
        blueMask = bhi.blueMask;
        alphaMask = bhi.alphaMask;

        redShift = getMaskShift(redMask);
        greenShift = getMaskShift(greenMask);
        blueShift = getMaskShift(blueMask);
        alphaShift = (alphaMask != 0 ? getMaskShift(alphaMask) : 0);
    }

    private int getMaskShift(int mask)
    {
        int trailingZeroes = 0;

        while ((0x1 & mask) == 0)
        {
            mask = 0x7fffffff & (mask >> 1);
            trailingZeroes++;
        }

        int maskLength = 0;

        while ((0x1 & mask) == 1)
        {
            mask = 0x7fffffff & (mask >> 1);
            maskLength++;
        }

        return (trailingZeroes - (8 - maskLength));
    }
    private int bytecount = 0;

    public int getNextRGB() throws ImageReadException, IOException
    {
        int data;

        if (bhi.bitsPerPixel == 8)
        {
            data = 0xff & imageData[bytecount + 0];
            bytecount += 1;
        }
        else if (bhi.bitsPerPixel == 24)
        {
            data = bfp.read3Bytes("Pixel", is, "BMP Image Data");
            bytecount += 3;
        }
        else if (bhi.bitsPerPixel == 32)
        {
            data = bfp.read4Bytes("Pixel", is, "BMP Image Data");
            bytecount += 4;
        }
        else if (bhi.bitsPerPixel == 16)
        {
            data = bfp.read2Bytes("Pixel", is, "BMP Image Data");
            bytecount += 2;
        }
        else
            throw new ImageReadException("Unknown BitsPerPixel: "
                    + bhi.bitsPerPixel);

        int red = (redMask & data);
        int green = (greenMask & data);
        int blue = (blueMask & data);
        int alpha = (alphaMask != 0 ? alphaMask & data : 0xff);

        red = (redShift >= 0) ? red >> redShift : red << -redShift;
        green = (greenShift >= 0) ? green >> greenShift : green << -greenShift;
        blue = (blueShift >= 0) ? blue >> blueShift : blue << -blueShift;
        alpha = (alphaShift >= 0) ? alpha >> alphaShift : alpha << -alphaShift;

        int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);

        return rgb;
    }

    public void newline() throws ImageReadException, IOException
    {
        while (((bytecount) % 4) != 0)
        {
            bfp.readByte("Pixel", is, "BMP Image Data");
            bytecount++;
        }
    }
}