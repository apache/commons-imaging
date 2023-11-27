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
    private static final int MAX_COLOR_VALUE = 0xff;
    private static final int DITHER_FACTOR = 16;
    private static final int[] DITHER_WEIGHTS = {7, 1, 5, 3};

    private Dithering() {
    }

    private static int adjustPixelComponent(int component, int errorComponent, int weight) {
        int adjustedComponent = component + errorComponent * weight / DITHER_FACTOR;
        return Math.min(Math.max(adjustedComponent, 0), MAX_COLOR_VALUE);
    }

    private static int adjustPixel(int argb, int errA, int errR, int errG, int errB, int mul) {
        int a = (argb >> 24) & MAX_COLOR_VALUE;
        int r = (argb >> 16) & MAX_COLOR_VALUE;
        int g = (argb >> 8) & MAX_COLOR_VALUE;
        int b = argb & MAX_COLOR_VALUE;

        a = adjustPixelComponent(a, errA, mul);
        r = adjustPixelComponent(r, errR, mul);
        g = adjustPixelComponent(g, errG, mul);
        b = adjustPixelComponent(b, errB, mul);

        return (a << 24) | (r << 16) | (g << 8) | b;
    }

    private static void updateImagePixel(BufferedImage image, int x, int y, int errorA, int errorR, int errorG, int errorB, int weightIndex) {
        int update = adjustPixel(image.getRGB(x, y), errorA, errorR, errorG, errorB, DITHER_WEIGHTS[weightIndex]);
        image.setRGB(x, y, update);
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

                final int a = (argb >> 24) & MAX_COLOR_VALUE;
                final int r = (argb >> 16) & MAX_COLOR_VALUE;
                final int g = (argb >> 8) & MAX_COLOR_VALUE;
                final int b = argb & MAX_COLOR_VALUE;

                final int na = (nextArgb >> 24) & MAX_COLOR_VALUE;
                final int nr = (nextArgb >> 16) & MAX_COLOR_VALUE;
                final int ng = (nextArgb >> 8) & MAX_COLOR_VALUE;
                final int nb = nextArgb & MAX_COLOR_VALUE;

                final int errA = a - na;
                final int errR = r - nr;
                final int errG = g - ng;
                final int errB = b - nb;

                for (int weightIndex = 0; weightIndex < DITHER_WEIGHTS.length; weightIndex++) {
                    if (x + 1 < image.getWidth() && y + DITHER_WEIGHTS[weightIndex] < image.getHeight()) {
                        updateImagePixel(image, x + 1, y + DITHER_WEIGHTS[weightIndex], errA, errR, errG, errB, weightIndex);
                    }
                    if (y + 1 < image.getHeight()) {
                        updateImagePixel(image, x, y + 1, errA, errR, errG, errB, weightIndex);
                        if (x - 1 >= 0 && y + DITHER_WEIGHTS[weightIndex] < image.getHeight()) {
                            updateImagePixel(image, x - 1, y + DITHER_WEIGHTS[weightIndex], errA, errR, errG, errB, weightIndex);
                        }
                    }
                }
            }
        }
    }
}