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
package org.apache.commons.imaging.palette;

import java.awt.image.BufferedImage;

import org.apache.commons.imaging.ImagingException;

/**
 * Dithering algorithms to use when quantizing an image to palette form.
 */
public final class Dithering {
    private static int adjustPixel(final int argb, final int errA, final int errR, final int errG, final int errB, final int mul) {
        int a = (argb >> 24) & 0xff;
        int r = (argb >> 16) & 0xff;
        int g = (argb >> 8) & 0xff;
        int b = argb & 0xff;

        a += errA * mul / 16;
        r += errR * mul / 16;
        g += errG * mul / 16;
        b += errB * mul / 16;

        if (a < 0) {
            a = 0;
        } else if (a > 0xff) {
            a = 0xff;
        }
        if (r < 0) {
            r = 0;
        } else if (r > 0xff) {
            r = 0xff;
        }
        if (g < 0) {
            g = 0;
        } else if (g > 0xff) {
            g = 0xff;
        }
        if (b < 0) {
            b = 0;
        } else if (b > 0xff) {
            b = 0xff;
        }

        return (a << 24) | (r << 16) | (g << 8) | b;
    }

    /**
     * Changes the given image to only use colors from the given palette,
     * applying Floyd-Steinberg dithering in the process. Ensure that
     * your alpha values in the image and in the palette are consistent.
     *
     * @param image   the image to change
     * @param palette the palette to use
     * @throws ImagingException if it fails to read the palette index
     */
    public static void applyFloydSteinbergDithering(final BufferedImage image, final Palette palette) throws ImagingException {
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                final int argb = image.getRGB(x, y);
                final int index = palette.getPaletteIndex(argb);
                final int nextArgb = palette.getEntry(index);
                image.setRGB(x, y, nextArgb);

                final int a = (argb >> 24) & 0xff;
                final int r = (argb >> 16) & 0xff;
                final int g = (argb >> 8) & 0xff;
                final int b = argb & 0xff;

                final int na = (nextArgb >> 24) & 0xff;
                final int nr = (nextArgb >> 16) & 0xff;
                final int ng = (nextArgb >> 8) & 0xff;
                final int nb = nextArgb & 0xff;

                final int errA = a - na;
                final int errR = r - nr;
                final int errG = g - ng;
                final int errB = b - nb;

                if (x + 1 < image.getWidth()) {
                    int update = adjustPixel(image.getRGB(x + 1, y), errA, errR, errG, errB, 7);
                    image.setRGB(x + 1, y, update);
                    if (y + 1 < image.getHeight()) {
                        update = adjustPixel(image.getRGB(x + 1, y + 1), errA, errR, errG, errB, 1);
                        image.setRGB(x + 1, y + 1, update);
                    }
                }
                if (y + 1 < image.getHeight()) {
                    int update = adjustPixel(image.getRGB(x, y + 1), errA, errR, errG, errB, 5);
                    image.setRGB(x, y + 1, update);
                    if (x - 1 >= 0) {
                        update = adjustPixel(image.getRGB(x - 1, y + 1), errA, errR, errG, errB, 3);
                        image.setRGB(x - 1, y + 1, update);
                    }

                }
            }
        }
    }

    private Dithering() {
        // no instances.
    }
}
