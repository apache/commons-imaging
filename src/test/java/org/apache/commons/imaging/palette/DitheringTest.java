/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.imaging.palette;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.imaging.ImagingException;
import org.junit.jupiter.api.Test;

/**
 * Tests for class {@link Dithering}.
 **/
class DitheringTest {

    @Test
    void testApplyFloydSteinbergDitheringWithNonNullOne() throws ImagingException {
        final BufferedImage bufferedImage = new BufferedImage(8, 8, 8);
        bufferedImage.setRGB(2, 2, 2);
        final List<ColorSpaceSubset> linkedList = new LinkedList<>();
        final ColorSpaceSubset colorSpaceSubset = new ColorSpaceSubset(-234, -352);
        colorSpaceSubset.rgb = 8;
        linkedList.add(colorSpaceSubset);
        final QuantizedPalette quantizedPalette = new QuantizedPalette(linkedList, 8);
        Dithering.applyFloydSteinbergDithering(bufferedImage, quantizedPalette);
        assertEquals(-16777208, bufferedImage.getRGB(0, 0));
        assertEquals(-16777208, bufferedImage.getRGB(1, 1));
        assertEquals(-16777208, bufferedImage.getRGB(2, 1));
        assertEquals(-16777208, bufferedImage.getRGB(2, 2));
    }

    @Test
    void testApplyFloydSteinbergDitheringWithNonNullTwo() throws ImagingException {
        final BufferedImage bufferedImage = new BufferedImage(3, 3, 3);
        bufferedImage.setRGB(1, 2, 4);
        final List<ColorSpaceSubset> linkedList = new LinkedList<>();
        final ColorSpaceSubset colorSpaceSubset = new ColorSpaceSubset(-234, -352);
        linkedList.add(colorSpaceSubset);
        final QuantizedPalette quantizedPalette = new QuantizedPalette(linkedList, 3);
        Dithering.applyFloydSteinbergDithering(bufferedImage, quantizedPalette);
        assertEquals(-1, bufferedImage.getRGB(0, 0));
        assertEquals(-1, bufferedImage.getRGB(1, 1));
        assertEquals(-1, bufferedImage.getRGB(2, 1));
        assertEquals(-1, bufferedImage.getRGB(2, 2));
    }

    @Test
    void testApplyFloydSteinbergDitheringBlackAndWhite() throws ImagingException {
        final BufferedImage image = new BufferedImage(2, 2, BufferedImage.TYPE_INT_RGB);
        // All gray 0x808080 (128, 128, 128)
        image.setRGB(0, 0, 0x808080);
        image.setRGB(1, 0, 0x808080);
        image.setRGB(0, 1, 0x808080);
        image.setRGB(1, 1, 0x808080);
        // Palette: Black and White
        // We use a custom Palette implementation that returns the closest color
        final Palette palette = new Palette() {

            @Override
            public int getEntry(final int index) {
                return index == 0 ? 0x000000 : 0xffffff;
            }

            @Override
            public int getPaletteIndex(final int rgb) {
                final int r = rgb >> 16 & 0xff;
                final int g = rgb >> 8 & 0xff;
                final int b = rgb & 0xff;
                final int gray = (r + g + b) / 3;
                return gray < 128 ? 0 : 1;
            }

            @Override
            public int length() {
                return 2;
            }
        };
        Dithering.applyFloydSteinbergDithering(image, palette);
        // (0,0) is 128,128,128 -> closest is White (1) because we used gray < 128 ? 0 : 1
        // Actually, 128 < 128 is false, so it picks 1 (White: 0xffffff)
        // Error = 128 - 255 = -127
        // (1,0) gets 7/16 of error: 128 + (-127 * 7 / 16) = 128 - 55 = 73
        // (0,1) gets 5/16 of error: 128 + (-127 * 5 / 16) = 128 - 39 = 89
        // (1,1) gets 1/16 of error: 128 + (-127 * 1 / 16) = 128 - 7 = 121
        assertEquals(0xffffff, image.getRGB(0, 0) & 0xffffff);
        // (1,0) is 73 -> closest is Black (0x000000)
        assertEquals(0x000000, image.getRGB(1, 0) & 0xffffff);
    }

    @Test
    void testApplyFloydSteinbergDitheringSmallImage() throws ImagingException {
        // 1x1 image
        final BufferedImage image = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
        image.setRGB(0, 0, 0x123456);
        // SimplePalette uses exact match.
        // We must include the alpha channel because TYPE_INT_RGB uses 0xff as alpha in getRGB.
        final Palette palette = new SimplePalette(new int[] { 0xff123456 });
        // Should not throw exception
        Dithering.applyFloydSteinbergDithering(image, palette);
        assertEquals(0x123456, image.getRGB(0, 0) & 0xffffff);
    }

    @Test
    void testApplyFloydSteinbergDitheringAlpha() throws ImagingException {
        // Image with alpha channel
        final BufferedImage image = new BufferedImage(2, 1, BufferedImage.TYPE_INT_ARGB);
        // (0,0) is semi-transparent red
        image.setRGB(0, 0, 0x80ff0000);
        // (1,0) is fully transparent
        image.setRGB(1, 0, 0x00000000);
        final Palette palette = new Palette() {

            @Override
            public int getEntry(final int index) {
                return index == 0 ? 0xff000000 : 0x00ffffff; // Black or Transparent White
            }

            @Override
            public int getPaletteIndex(final int rgb) {
                final int alpha = rgb >> 24 & 0xff;
                return alpha < 128 ? 1 : 0;
            }

            @Override
            public int length() {
                return 2;
            }
        };
        Dithering.applyFloydSteinbergDithering(image, palette);
        // (0,0) alpha is 128 -> index 0 (Black: 0xff000000)
        // (1,0) should receive error from (0,0)
        // Initial (0,0) ARGB: 128, 255, 0, 0
        // Palette (0,0) ARGB: 255, 0, 0, 0
        // Error A: 128-255 = -127
        // Error R: 255-0 = 255
        // (1,0) was 0, 0, 0, 0
        // New (1,0) A: 0 + (-127 * 7/16) = -55 -> clipped to 0
        // New (1,0) R: 0 + (255 * 7/16) = 111
        // New (1,0) ARGB approx: 0, 111, 0, 0
        // palette.getPaletteIndex(0, 111, 0, 0) -> alpha is 0 < 128 -> index 1 (Transparent White: 0x00ffffff)
        assertEquals(0xff000000, image.getRGB(0, 0));
        assertEquals(0x00ffffff, image.getRGB(1, 0));
    }

    @Test
    void testApplyFloydSteinbergDitheringClipping() throws ImagingException {
        final BufferedImage image = new BufferedImage(2, 1, BufferedImage.TYPE_INT_RGB);
        // (0,0) is White, (1,0) is White.
        // We force a large positive error at (0,0) that would push (1,0) beyond 255.
        image.setRGB(0, 0, 0xffffff);
        image.setRGB(1, 0, 0xffffff);
        final Palette palette = new Palette() {

            @Override
            public int getEntry(final int index) {
                return index == 0 ? 0x000000 : 0x808080;
            }

            @Override
            public int getPaletteIndex(final int rgb) {
                // If it's pure white, return index 0 (Black)
                // This creates an error of +255 in each channel
                if ((rgb & 0xffffff) == 0xffffff) {
                    return 0;
                }
                // Otherwise return index 1
                return 1;
            }

            @Override
            public int length() {
                return 2;
            }
        };
        // (0,0) ARGB is 0xffffff (255, 255, 255)
        // palette.getPaletteIndex(0xffffff) returns 0 -> 0x000000
        // error is (255, 255, 255)
        // (1,0) gets 7/16 of 255 = 111.
        // New (1,0) = 255 + 111 = 366 -> should be clipped to 255.
        // palette.getPaletteIndex(clipped value) -> 366 clipped to 255 is 0xffffff.
        // palette.getPaletteIndex(0xffffff) returns 0 -> 0x000000
        Dithering.applyFloydSteinbergDithering(image, palette);
        assertEquals(0x000000, image.getRGB(0, 0) & 0xffffff);
        assertEquals(0x000000, image.getRGB(1, 0) & 0xffffff);
    }
}
