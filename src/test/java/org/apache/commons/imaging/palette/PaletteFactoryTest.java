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
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.image.BufferedImage;

import org.apache.commons.imaging.ImagingException;
import org.junit.jupiter.api.Test;

public class PaletteFactoryTest {

    @Test
    public void testCountTransparentColors() {
        final PaletteFactory factory = new PaletteFactory();
        final BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        // All transparent, all same color (0x00000000)
        assertEquals(1, factory.countTransparentColors(image));
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                image.setRGB(x, y, 0x00FFFFFF & (x << 16 | y << 8));
            }
        }
        // All have alpha 0, but different RGB.
        // first = 0x00000000 (at 0,0). next is 0x00000800 (at 0,1).
        // Since 0x00000000 != 0x00000800, it should return 2.
        assertEquals(2, factory.countTransparentColors(image));
        // Mixed alpha: all opaque
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                image.setRGB(x, y, 0xFFFFFFFF);
            }
        }
        assertEquals(0, factory.countTransparentColors(image));
        // One pixel transparent
        image.setRGB(0, 0, 0x00FFFFFF);
        assertEquals(1, factory.countTransparentColors(image));
        final int[] rgbs = { 0x00112233, 0x00112233, 0xFF112233, 0x00445566 };
        assertEquals(2, factory.countTrasparentColors(rgbs)); // 0x00112233 and 0x00445566 are different
        final int[] rgbs1 = { 0x00112233, 0x00112233, 0xFF112233 };
        assertEquals(1, factory.countTrasparentColors(rgbs1));
        final int[] rgbs0 = { 0xFF112233, 0xFF445566 };
        assertEquals(0, factory.countTrasparentColors(rgbs0));
    }

    @Test
    public void testHasTransparency() {
        final PaletteFactory factory = new PaletteFactory();
        final BufferedImage imageNoAlpha = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        assertFalse(factory.hasTransparency(imageNoAlpha));
        assertFalse(factory.hasTransparency(imageNoAlpha, 128));
        final BufferedImage imageAlpha = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        // Default is all 0 (transparent)
        assertTrue(factory.hasTransparency(imageAlpha));
        assertTrue(factory.hasTransparency(imageAlpha, 128));
        // Make it opaque
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                imageAlpha.setRGB(x, y, 0xFFFFFFFF);
            }
        }
        assertFalse(factory.hasTransparency(imageAlpha));
        // One pixel semi-transparent
        imageAlpha.setRGB(5, 5, 0x80FFFFFF);
        assertTrue(factory.hasTransparency(imageAlpha));
        assertFalse(factory.hasTransparency(imageAlpha, 127)); // 128 is not < 127
        assertTrue(factory.hasTransparency(imageAlpha, 129)); // 128 is < 129
    }

    @Test
    public void testIsGrayscale() {
        final PaletteFactory factory = new PaletteFactory();
        final BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                image.setRGB(x, y, 0xFF111111 * (x + 1));
            }
        }
        assertTrue(factory.isGrayscale(image));
        image.setRGB(5, 5, 0xFF111211);
        assertFalse(factory.isGrayscale(image));
    }

    @Test
    public void testMakeExactRgbPaletteFancy() {
        final PaletteFactory factory = new PaletteFactory();
        final BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        image.setRGB(0, 0, 0xFF0000);
        image.setRGB(1, 1, 0x00FF00);
        final Palette palette = factory.makeExactRgbPaletteFancy(image);
        assertNotNull(palette);
        assertEquals(3, palette.length()); // Black + 2 colors
    }

    @Test
    public void testMakeExactRgbPaletteSimple() {
        final PaletteFactory factory = new PaletteFactory();
        final BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        image.setRGB(0, 0, 0xFF0000);
        image.setRGB(1, 1, 0x00FF00);
        image.setRGB(2, 2, 0x0000FF);
        final SimplePalette palette = factory.makeExactRgbPaletteSimple(image, 10);
        assertNotNull(palette);
        assertEquals(4, palette.length()); // Black (default) + 3 colors
    }

    @Test
    public void testMakeQuantizedRgbaPalette() throws ImagingException {
        final PaletteFactory factory = new PaletteFactory();
        final BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        for (int i = 0; i < 100; i++) {
            image.setRGB(i % 10, i / 10, i << 24 | i << 16 | i << 8 | i);
        }
        final Palette palette = factory.makeQuantizedRgbaPalette(image, true, 10);
        assertNotNull(palette);
        assertTrue(palette.length() <= 10);
    }

    @Test
    public void testMakeQuantizedRgbPalette() {
        final PaletteFactory factory = new PaletteFactory();
        final BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        for (int i = 0; i < 100; i++) {
            image.setRGB(i % 10, i / 10, i << 16 | i << 8 | i);
        }
        final Palette palette = factory.makeQuantizedRgbPalette(image, 10);
        assertNotNull(palette);
        assertTrue(palette.length() <= 10);
    }
}
