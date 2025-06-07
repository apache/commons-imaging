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

package org.apache.commons.imaging.formats.png;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.common.AllocationRequestException;
import org.junit.jupiter.api.Test;

public class PngImageParserTest extends AbstractPngTest {

    private static byte[] getPngImageBytes(final BufferedImage image, final PngImagingParameters params) throws IOException {
        try (ByteArrayOutputStream os = new ByteArrayOutputStream()) {
            new PngWriter().writeImage(image, os, params, null);
            return os.toByteArray();
        }
    }

    @Test
    void testGetImageSize() {
        final byte[] bytes = {
                // Header
                (byte) 0x89, 'P', 'N', 'G', '\r', '\n', 0x1A, '\n',
                // (Too large) Length
                (byte) 0b0111_1111, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF - 10,
                // Chunk type
                'I', 'H', 'D', 'R', };
        assertThrows(AllocationRequestException.class, () -> new PngImageParser().getImageSize(bytes));
    }

    @Test
    void testNoPalette() throws IOException {
        final BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        image.setRGB(1, 1, 0x00FFffFF);
        final PngImagingParameters params = new PngImagingParameters();

        final byte[] bytes = getPngImageBytes(image, params);
        final ImageInfo imageInfo = new PngImageParser().getImageInfo(bytes, null);
        assertFalse(imageInfo.usesPalette());
    }

    @Test
    void testPalette() throws IOException {
        final BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        image.setRGB(1, 1, 0x00FFffFF);
        final PngImagingParameters params = new PngImagingParameters();
        params.setForceIndexedColor(true);

        final byte[] bytes = getPngImageBytes(image, params);
        final ImageInfo imageInfo = new PngImageParser().getImageInfo(bytes, null);
        assertTrue(imageInfo.usesPalette());
    }
}
