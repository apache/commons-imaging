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

import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.ImagingTest;

public class PaletteQuantizationTest extends ImagingTest {
    public void testPaletteQuantization() throws ImageWriteException {
        BufferedImage whiteImage = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        for (int y = 0; y < whiteImage.getHeight(); y++) {
            for (int x = 0; x < whiteImage.getWidth(); x++) {
                whiteImage.setRGB(x, y, 0xFFFFFF);
            }
        }
        checkPaletteDetails(whiteImage, 10, 1);
        
        BufferedImage whiteAndBlackImage = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        for (int y = 0; y < whiteImage.getHeight(); y++) {
            for (int x = 0; x < 5; x++) {
                whiteAndBlackImage.setRGB(x, y, 0xFFFFFF);
            }
            for (int x = 5; x < 10; x++) {
                whiteAndBlackImage.setRGB(x, y, 0x000000);
            }
        }
        checkPaletteDetails(whiteAndBlackImage, 10, 2);
        
        BufferedImage rainbowImage = new BufferedImage(9, 10, BufferedImage.TYPE_INT_RGB);
        for (int y = 0; y < whiteImage.getHeight(); y++) {
            for (int x = 0; x < 3; x++) {
                rainbowImage.setRGB(x, y, 0xFF0000);
            }
            for (int x = 3; x < 6; x++) {
                rainbowImage.setRGB(x, y, 0x00FF00);
            }
            for (int x = 6; x < 9; x++) {
                rainbowImage.setRGB(x, y, 0x0000FF);
            }
        }
        checkPaletteDetails(rainbowImage, 10, 3);
        checkPaletteDetails(rainbowImage, 2, 2);
    }
    
    private void checkPaletteDetails(BufferedImage image, final int limit, final int expectedSize) throws ImageWriteException {
        PaletteFactory paletteFactory = new PaletteFactory();
        Palette palette;

        palette = paletteFactory.makeExactRgbPaletteSimple(image, limit);
        // too small palettes are null
        boolean exact = false;
        if (palette != null) {
            assertEquals(expectedSize, palette.length());
            //checkUniqueColors(image, palette);
            exact = true;
        }
        if (exact) {
            //checkDithering(image, palette);
        }

        palette = paletteFactory.makeQuantizedRgbaPalette(image, false, limit);
        assertEquals(expectedSize, palette.length());
        checkUniqueColors(image, palette);
        if (exact) {
            checkPixelsAreIdentical(image, palette);
        }
        
        palette = paletteFactory.makeQuantizedRgbPalette(image, limit);
        assertEquals(expectedSize, palette.length());
        //checkUniqueColors(image, palette);
        if (exact) {
            //checkDithering(image, palette);
        }
        
        MedianCutQuantizer medianCutQuantizer = new MedianCutQuantizer(true);
        palette = medianCutQuantizer.process(
                image, limit, new MedianCutMostPopulatedBoxesImplementation(), false);
        assertEquals(expectedSize, palette.length());
        checkUniqueColors(image, palette);
        if (exact) {
            checkPixelsAreIdentical(image, palette);
        }
    }
    
    private void checkUniqueColors(BufferedImage src, Palette palette) throws ImageWriteException {
        BufferedImage dst = new BufferedImage(src.getWidth(), src.getHeight(), BufferedImage.TYPE_INT_RGB);
        dst.getGraphics().drawImage(src, 0, 0, src.getWidth(), src.getHeight(), null);
        Dithering.applyFloydSteinbergDithering(dst, palette);
        Palette ditheredPalette = new PaletteFactory().makeExactRgbPaletteSimple(dst, palette.length() * 2);
        assertEquals(palette.length(), ditheredPalette.length());
    }
    
    private void checkPixelsAreIdentical(BufferedImage src, Palette palette) throws ImageWriteException {
        BufferedImage dst = new BufferedImage(src.getWidth(), src.getHeight(), BufferedImage.TYPE_INT_RGB);
        dst.getGraphics().drawImage(src, 0, 0, src.getWidth(), src.getHeight(), null);
        Dithering.applyFloydSteinbergDithering(dst, palette);
        for (int y = 0; y < src.getHeight(); y++) {
            for (int x = 0; x < src.getWidth(); x++) {
                assertEquals(src.getRGB(x, y), dst.getRGB(x, y));
            }
        }
    }
}
