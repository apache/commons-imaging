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
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.palette.Palette;
import org.apache.commons.imaging.palette.PaletteFactory;
import org.apache.commons.imaging.palette.SimplePalette;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for class {@link PngWriter}.
 */
public class PngWriterTest extends PngBaseTest {

    @Test
    public void testPaletteFactory() throws IOException {
        final File imageFile = getValidPngImages().get(0);

        final BufferedImage image = Imaging.getBufferedImage(imageFile);
        final PngImagingParameters params = new PngImagingParameters();
        params.setForceIndexedColor(true);

        final byte[] bytes = getImageBytes(image, params);
        final int numColors = countColors(bytes);
        assertTrue(numColors > 1);

        final PaletteFactory factory = new PaletteFactory() {
            @Override
            public Palette makeQuantizedRgbPalette(final BufferedImage src, final int max) {
                // Force a stupid palette containing nothing but black (all zero's).
                return new SimplePalette(new int[max]);
            }
        };
        final byte[] palettedBytes = getImageBytesWithPalette(image, params, factory);

        assertEquals(1, countColors(palettedBytes));
    }

    @Test
    public void testNullParameters() throws IOException {
        final File imageFile = getValidPngImages().get(0);

        final BufferedImage image = Imaging.getBufferedImage(imageFile);

        try (ByteArrayOutputStream os = new ByteArrayOutputStream()) {
            new PngWriter().writeImage(image, os, null, null);
            byte[] bytes = os.toByteArray();
            final int numColors = countColors(bytes);
            assertTrue(numColors > 1);
        }
    }

    private static byte[] getImageBytes(final BufferedImage image, final PngImagingParameters params) throws IOException {
        try (ByteArrayOutputStream os = new ByteArrayOutputStream()) {
            new PngWriter().writeImage(image, os, params);
            return os.toByteArray();
        }
    }
    private static byte[] getImageBytesWithPalette(final BufferedImage image, final PngImagingParameters params, final PaletteFactory paletteFactory) throws IOException {
        try (ByteArrayOutputStream os = new ByteArrayOutputStream()) {
            new PngWriter().writeImage(image, os, params, paletteFactory);
            return os.toByteArray();
        }
    }

    private List<File> getValidPngImages() throws IOException {
        final List<File> result = new ArrayList<>();
        for (final File imageFile : getPngImages()) {

            if (!isInvalidPNGTestFile(imageFile)) {
                result.add(imageFile);
            }
        }
        return result;
    }

    private static int countColors(final byte[] bytes) throws IOException {
        final BufferedImage imageParsed = Imaging.getBufferedImage(bytes);
        return new PaletteFactory().makeExactRgbPaletteSimple(imageParsed, Integer.MAX_VALUE).length();
    }
}
