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

import java.io.IOException;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.common.ImageBuilder;

class PixelParserRle extends PixelParser {

    public PixelParserRle(final BmpHeaderInfo bhi, final byte[] colorTable, final byte[] imageData) {
        super(bhi, colorTable, imageData);

    }

    private int getSamplesPerByte() throws ImageReadException {
        if (bhi.bitsPerPixel == 8) {
            return 1;
        } else if (bhi.bitsPerPixel == 4) {
            return 2;
        } else {
            throw new ImageReadException("BMP RLE: bad BitsPerPixel: "
                    + bhi.bitsPerPixel);
        }
    }

    private int[] convertDataToSamples(final int data) throws ImageReadException {
        int[] rgbs;
        if (bhi.bitsPerPixel == 8) {
            rgbs = new int[1];
            rgbs[0] = getColorTableRGB(data);
            // pixels_written = 1;
        } else if (bhi.bitsPerPixel == 4) {
            rgbs = new int[2];
            final int sample1 = data >> 4;
            final int sample2 = 0x0f & data;
            rgbs[0] = getColorTableRGB(sample1);
            rgbs[1] = getColorTableRGB(sample2);
            // pixels_written = 2;
        } else {
            throw new ImageReadException("BMP RLE: bad BitsPerPixel: "
                    + bhi.bitsPerPixel);
        }

        return rgbs;
    }

    private int processByteOfData(final int[] rgbs, final int repeat, int x, final int y,
            final int width, final int height, final ImageBuilder imageBuilder) {
        // int rbg
        int pixelsWritten = 0;
        for (int i = 0; i < repeat; i++) {

            if ((x >= 0) && (x < width) && (y >= 0) && (y < height)) {
                // int rgb = 0xff000000;
                // rgb = getNextRGB();
                final int rgb = rgbs[i % rgbs.length];
                // bi.setRGB(x, y, rgb);
                imageBuilder.setRGB(x, y, rgb);
                // bi.setRGB(x, y, 0xff00ff00);
            } else {
                System.out.println("skipping bad pixel (" + x + "," + y + ")");
            }

            x++;
            pixelsWritten++;
        }

        return pixelsWritten;
    }

    @Override
    public void processImage(final ImageBuilder imageBuilder)
            throws ImageReadException, IOException {
        final int width = bhi.width;
        final int height = bhi.heightRaw;
        int x = 0;
        int y = height - 1;

        boolean done = false;
        while (!done) {
            final int a = 0xff & BinaryFunctions.readByte("RLE (" + x + "," + y + ") a", is, "BMP: Bad RLE");
            final int b = 0xff & BinaryFunctions.readByte("RLE (" + x + "," + y + ") b", is, "BMP: Bad RLE");

            if (a == 0) {
                switch (b) {
                case 0: {
                    // EOL
                    y--;
                    x = 0;
                    break;
                }
                case 1:
                    // EOF
                    done = true;
                    break;
                case 2: {
                    final int deltaX = 0xff & BinaryFunctions.readByte("RLE deltaX", is, "BMP: Bad RLE");
                    final int deltaY = 0xff & BinaryFunctions.readByte("RLE deltaY", is, "BMP: Bad RLE");
                    x += deltaX;
                    y -= deltaY;
                    break;
                }
                default: {
                    final int samplesPerByte = getSamplesPerByte();
                    int size = b / samplesPerByte;
                    if ((b % samplesPerByte) > 0) {
                        size++;
                    }
                    if ((size % 2) != 0) {
                        size++;
                    }

                    // System.out.println("b: " + b);
                    // System.out.println("size: " + size);
                    // System.out.println("SamplesPerByte: " + SamplesPerByte);

                    final byte[] bytes = BinaryFunctions.readBytes("bytes", is, size, "RLE: Absolute Mode");

                    int remaining = b;

                    for (int i = 0; remaining > 0; i++) {
                    // for (int i = 0; i < bytes.length; i++)
                        final int[] samples = convertDataToSamples(0xff & bytes[i]);
                        final int towrite = Math.min(remaining, samplesPerByte);
                        // System.out.println("remaining: " + remaining);
                        // System.out.println("SamplesPerByte: "
                        // + SamplesPerByte);
                        // System.out.println("towrite: " + towrite);
                        final int written = processByteOfData(samples, towrite, x, y,
                                width, height, imageBuilder);
                        // System.out.println("written: " + written);
                        // System.out.println("");
                        x += written;
                        remaining -= written;
                    }
                    break;
                }
                }
            } else {
                final int[] rgbs = convertDataToSamples(b);

                x += processByteOfData(rgbs, a, x, y, width, height,
                        imageBuilder);
            }
        }
    }
}
