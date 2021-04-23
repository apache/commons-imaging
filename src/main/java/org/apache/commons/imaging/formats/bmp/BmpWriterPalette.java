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

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.palette.SimplePalette;

class BmpWriterPalette implements BmpWriter {

    private final SimplePalette palette;
    private final int bitsPerSample;

    BmpWriterPalette(final SimplePalette palette) {
        this.palette = palette;

        if (palette.length() <= 2) {
            bitsPerSample = 1;
        } else if (palette.length() <= 16) {
            bitsPerSample = 4;
        } else {
            bitsPerSample = 8;
        }
    }

    @Override
    public int getPaletteSize() {
        return palette.length();
    }

    @Override
    public int getBitsPerPixel() {
        return bitsPerSample;
    }

    @Override
    public void writePalette(final BinaryOutputStream bos) throws IOException {
        for (int i = 0; i < palette.length(); i++) {
            final int rgb = palette.getEntry(i);

            final int red = 0xff & (rgb >> 16);
            final int green = 0xff & (rgb >> 8);
            final int blue = 0xff & (rgb);

            bos.write(blue);
            bos.write(green);
            bos.write(red);
            bos.write(0);
        }
    }

    @Override
    public byte[] getImageData(final BufferedImage src) {
        final int width = src.getWidth();
        final int height = src.getHeight();

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();

        int bitCache = 0;
        int bitsInCache = 0;

        int byteCount = 0;
        for (int y = height - 1; y >= 0; y--) {
            for (int x = 0; x < width; x++) {
                final int argb = src.getRGB(x, y);
                final int rgb = 0xffffff & argb;

                final int index = palette.getPaletteIndex(rgb);

                if (bitsPerSample == 8) {
                    baos.write(0xff & index);
                    byteCount++;
                } else {
                    // 4 or 1
                    bitCache = (bitCache << bitsPerSample) | index;
                    bitsInCache += bitsPerSample;
                    if (bitsInCache >= 8) {
                        baos.write(0xff & bitCache);
                        byteCount++;
                        bitCache = 0;
                        bitsInCache = 0;
                    }
                }
            }

            if (bitsInCache > 0) {
                bitCache = (bitCache << (8 - bitsInCache));

                baos.write(0xff & bitCache);
                byteCount++;
                bitCache = 0;
                bitsInCache = 0;
            }

            while ((byteCount % 4) != 0) {
                baos.write(0);
                byteCount++;
            }
        }

        return baos.toByteArray();
    }
}
