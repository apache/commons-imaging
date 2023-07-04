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
package org.apache.commons.imaging.formats.bmp;

import static org.apache.commons.imaging.common.BinaryFunctions.read2Bytes;
import static org.apache.commons.imaging.common.BinaryFunctions.read3Bytes;
import static org.apache.commons.imaging.common.BinaryFunctions.read4Bytes;
import static org.apache.commons.imaging.common.BinaryFunctions.readByte;

import java.io.IOException;
import java.nio.ByteOrder;

import org.apache.commons.imaging.ImagingException;

class PixelParserBitFields extends PixelParserSimple {

    private final int redShift;
    private final int greenShift;
    private final int blueShift;
    private final int alphaShift;

    private final int redMask;
    private final int greenMask;
    private final int blueMask;
    private final int alphaMask;

    private int byteCount;

    PixelParserBitFields(final BmpHeaderInfo bhi, final byte[] colorTable, final byte[] imageData) {
        super(bhi, colorTable, imageData);

        redMask = bhi.redMask;
        greenMask = bhi.greenMask;
        blueMask = bhi.blueMask;
        alphaMask = bhi.alphaMask;

        redShift = getMaskShift(redMask);
        greenShift = getMaskShift(greenMask);
        blueShift = getMaskShift(blueMask);
        alphaShift = (alphaMask != 0 ? getMaskShift(alphaMask) : 0);
    }

    private int getMaskShift(int mask) {
        if (mask == 0) {
            return 0;
        }

        int trailingZeroes = 0;

        while ((0x1 & mask) == 0) {
            mask = 0x7fffffff & (mask >> 1);
            trailingZeroes++;
        }

        int maskLength = 0;

        while ((0x1 & mask) == 1) {
            mask = 0x7fffffff & (mask >> 1);
            maskLength++;
        }

        return trailingZeroes - (8 - maskLength);
    }

    @Override
    public int getNextRgb() throws ImagingException, IOException {
        int data;

        switch (bhi.bitsPerPixel) {
        case 8:
            data = 0xff & imageData[byteCount + 0];
            byteCount += 1;
            break;
        case 24:
            data = read3Bytes("Pixel", is, "BMP Image Data", ByteOrder.LITTLE_ENDIAN);
            byteCount += 3;
            break;
        case 32:
            data = read4Bytes("Pixel", is, "BMP Image Data", ByteOrder.LITTLE_ENDIAN);
            byteCount += 4;
            break;
        case 16:
            data = read2Bytes("Pixel", is, "BMP Image Data", ByteOrder.LITTLE_ENDIAN);
            byteCount += 2;
            break;
        default:
            throw new ImagingException("Unknown BitsPerPixel: " + bhi.bitsPerPixel);
        }

        int red = (redMask & data);
        int green = (greenMask & data);
        int blue = (blueMask & data);
        int alpha = (alphaMask != 0 ? alphaMask & data : 0xff);

        red = (redShift >= 0) ? red >> redShift : red << -redShift;
        green = (greenShift >= 0) ? green >> greenShift : green << -greenShift;
        blue = (blueShift >= 0) ? blue >> blueShift : blue << -blueShift;
        alpha = (alphaShift >= 0) ? alpha >> alphaShift : alpha << -alphaShift;

        return (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);
    }

    @Override
    public void newline() throws ImagingException, IOException {
        while ((byteCount % 4) != 0) {
            readByte("Pixel", is, "BMP Image Data");
            byteCount++;
        }
    }
}
