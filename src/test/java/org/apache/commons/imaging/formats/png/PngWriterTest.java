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
package org.apache.commons.imaging.formats.png;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingTestConstants;
import org.apache.commons.imaging.palette.Palette;
import org.apache.commons.imaging.palette.PaletteFactory;
import org.apache.commons.imaging.palette.SimplePalette;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for class {@link PngWriter}.
 */
public class PngWriterTest extends AbstractPngTest {

    private static int countColors(final byte[] bytes) throws IOException {
        final BufferedImage imageParsed = Imaging.getBufferedImage(bytes);
        return new PaletteFactory().makeExactRgbPaletteSimple(imageParsed, Integer.MAX_VALUE).length();
    }

    private static byte[] getImageBytes(final BufferedImage image, final PngImagingParameters params, final PaletteFactory paletteFactory) throws IOException {
        try (ByteArrayOutputStream os = new ByteArrayOutputStream()) {
            new PngWriter().writeImage(image, os, params, paletteFactory);
            return os.toByteArray();
        }
    }

    private File getPngFile(String name) {
        final File pngFolder = new File(ImagingTestConstants.TEST_IMAGE_FOLDER, "png");
        return new File(pngFolder, name);
    }

    // The form of the test set is
    //    0.   target file name
    //    1.   Expected colour count (as String) - for testPaletteFactory
    private static String [][] testSet = {
        {"1/Oregon Scientific DS6639 - DSC_0307 - small.png", "1"},
        {"2/12118.png", "1"},
        {"2/28569-4.png", "1"},
        {"2/28569-8.png", "1"},
        {"2/28569.png", "1"},
        {"3/testImage.png", "116"},
        {"3/testImageNoAlpha.png", "1"},
        {"4/buttons_level_menu_down.ipad.png", "2"},
        {"5/trns-gray.png", "26"},
        {"5/trns-palette8.png", "18"},
        {"5/trns-rgb.png", "26"},
    };

    @Test
    public void testNullParameters() throws IOException {
        for (String[] testTarget : testSet) {
            final String filePath = testTarget[0];
            final File imageFile = getPngFile(filePath);

            final BufferedImage image = Imaging.getBufferedImage(imageFile);

            try (ByteArrayOutputStream os = new ByteArrayOutputStream()) {
                new PngWriter().writeImage(image, os, null, null);
                final byte[] bytes = os.toByteArray();
                final int numColors = countColors(bytes);
                assertTrue(numColors > 1);
            }
        }
    }

    @Test
    public void testPaletteFactory() throws IOException {
        for (String[] testTarget : testSet) {
            final String filePath = testTarget[0];
            final File imageFile = getPngFile(filePath);
            final int colourCount = Integer.parseInt(testTarget[1]);

            final BufferedImage image = Imaging.getBufferedImage(imageFile);
            final PngImagingParameters params = new PngImagingParameters();
            params.setForceIndexedColor(true);

            final byte[] bytes = getImageBytes(image, params, null);
            final int numColors = countColors(bytes);
            assertTrue(numColors > 1, imageFile::toString);

            final PaletteFactory factory = new PaletteFactory() {
                @Override
                public Palette makeQuantizedRgbPalette(final BufferedImage src, final int max) {
                    // Force a palette containing nothing but black (all zero's).
                    return new SimplePalette(new int[max]);
                }
            };
            final byte[] palettedBytes = getImageBytes(image, params, factory);
            assertEquals(colourCount, countColors(palettedBytes), filePath);
        }
    }
}
