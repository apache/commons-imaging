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
package org.apache.commons.imaging.formats.bmp.pixelparsers;

import java.io.IOException;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.formats.bmp.BmpHeaderInfo;

public class PixelParserRgb extends PixelParserSimple {
    public PixelParserRgb(final BmpHeaderInfo bhi, final byte ColorTable[],
            final byte ImageData[]) {
        super(bhi, ColorTable, ImageData);

    }

    private int bytecount = 0;
    private int cached_bit_count = 0;
    private int cached_byte = 0;

    int pixelCount = 0;

    @Override
    public int getNextRGB() throws ImageReadException, IOException {
        pixelCount++;

        if ((bhi.bitsPerPixel == 1) 
                || (bhi.bitsPerPixel == 4)) { // always grayscale?
            if (cached_bit_count < bhi.bitsPerPixel) {
                if (cached_bit_count != 0) {
                    throw new ImageReadException("Unexpected leftover bits: "
                            + cached_bit_count + "/" + bhi.bitsPerPixel);
                }

                cached_bit_count += 8;
                cached_byte = (0xff & imageData[bytecount]);
                bytecount++;
            }
            final int cache_mask = (1 << bhi.bitsPerPixel) - 1;
            final int sample = cache_mask & (cached_byte >> (8 - bhi.bitsPerPixel));
            cached_byte = 0xff & (cached_byte << bhi.bitsPerPixel);
            cached_bit_count -= bhi.bitsPerPixel;

            final int rgb = getColorTableRGB(sample);

            return rgb;
        } else if (bhi.bitsPerPixel == 8) { // always grayscale?
            final int sample = 0xff & imageData[bytecount + 0];

            final int rgb = getColorTableRGB(sample);

            bytecount += 1;

            return rgb;
        } else if (bhi.bitsPerPixel == 16) {
            final int data = bfp.read2Bytes("Pixel", is, "BMP Image Data");

            final int blue = (0x1f & (data >> 0)) << 3;
            final int green = (0x1f & (data >> 5)) << 3;
            final int red = (0x1f & (data >> 10)) << 3;
            final int alpha = 0xff;

            final int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);

            bytecount += 2;

            return rgb;
        } else if (bhi.bitsPerPixel == 24) {
            final int blue = 0xff & imageData[bytecount + 0];
            final int green = 0xff & imageData[bytecount + 1];
            final int red = 0xff & imageData[bytecount + 2];
            final int alpha = 0xff;

            final int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);

            bytecount += 3;

            return rgb;
        } else if (bhi.bitsPerPixel == 32) {
            final int blue = 0xff & imageData[bytecount + 0];
            final int green = 0xff & imageData[bytecount + 1];
            final int red = 0xff & imageData[bytecount + 2];
            final int alpha = 0xff;

            final int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);

            bytecount += 4;

            return rgb;
        }

        throw new ImageReadException("Unknown BitsPerPixel: "
                + bhi.bitsPerPixel);
    }

    @Override
    public void newline() throws ImageReadException, IOException {
        cached_bit_count = 0;

        while (((bytecount) % 4) != 0) {
            bfp.readByte("Pixel", is, "BMP Image Data");
            bytecount++;
        }
    }
}
