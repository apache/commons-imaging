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
import static org.apache.commons.imaging.common.BinaryFunctions.readByte;

import java.io.IOException;
import java.nio.ByteOrder;

import org.apache.commons.imaging.ImagingException;

class PixelParserRgb extends PixelParserSimple {
    private int byteCount;
    private int cachedBitCount;
    private int cachedByte;

    PixelParserRgb(final BmpHeaderInfo bhi, final byte[] colorTable, final byte[] imageData) {
        super(bhi, colorTable, imageData);

    }

    @Override
    public int getNextRgb() throws ImagingException, IOException {

        switch (bhi.bitsPerPixel) {
        case 1:
        case 4: {
            if (cachedBitCount < bhi.bitsPerPixel) {
                if (cachedBitCount != 0) {
                    throw new ImagingException("Unexpected leftover bits: "
                            + cachedBitCount + "/" + bhi.bitsPerPixel);
                }

                cachedBitCount += 8;
                cachedByte = (0xff & imageData[byteCount]);
                byteCount++;
            }
            final int cacheMask = (1 << bhi.bitsPerPixel) - 1;
            final int sample = cacheMask & (cachedByte >> (8 - bhi.bitsPerPixel));
            cachedByte = 0xff & (cachedByte << bhi.bitsPerPixel);
            cachedBitCount -= bhi.bitsPerPixel;
            return getColorTableRGB(sample);
        }
        case 8: {
            final int sample = 0xff & imageData[byteCount + 0];
            final int rgb = getColorTableRGB(sample);
            byteCount += 1;
            return rgb;
        }
        case 16: {
            final int data = read2Bytes("Pixel", is, "BMP Image Data", ByteOrder.LITTLE_ENDIAN);
            final int blue = (0x1f & (data >> 0)) << 3;
            final int green = (0x1f & (data >> 5)) << 3;
            final int red = (0x1f & (data >> 10)) << 3;
            final int alpha = 0xff;
            final int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);
            byteCount += 2;
            return rgb;
        }
        case 24: {
            final int blue = 0xff & imageData[byteCount + 0];
            final int green = 0xff & imageData[byteCount + 1];
            final int red = 0xff & imageData[byteCount + 2];
            final int alpha = 0xff;
            final int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);
            byteCount += 3;
            return rgb;
        }
        case 32: {
            final int blue = 0xff & imageData[byteCount + 0];
            final int green = 0xff & imageData[byteCount + 1];
            final int red = 0xff & imageData[byteCount + 2];
            final int alpha = 0xff;
            final int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);
            byteCount += 4;
            return rgb;
        }
        default:
            break;
        }

        throw new ImagingException("Unknown BitsPerPixel: "
                + bhi.bitsPerPixel);
    }

    @Override
    public void newline() throws ImagingException, IOException {
        cachedBitCount = 0;

        while (((byteCount) % 4) != 0) {
            readByte("Pixel", is, "BMP Image Data");
            byteCount++;
        }
    }
}
