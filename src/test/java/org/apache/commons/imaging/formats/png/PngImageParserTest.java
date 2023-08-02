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
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;

import org.apache.commons.imaging.ImageInfo;
import org.junit.jupiter.api.Test;

public class PngImageParserTest extends PngBaseTest {

    private static byte[] getPngImageBytes(final BufferedImage image, final PngImagingParameters params) throws IOException {
        try (ByteArrayOutputStream os = new ByteArrayOutputStream()) {
            new PngWriter().writeImage(image, os, params, null);
            return os.toByteArray();
        }
    }

    /**
     * Gets the byte at the specified {@code index} from the int value.
     */
    private static byte intByte(int value, int index) {
        return (byte) ((value >> (index * Byte.SIZE)) & 0xFF);
    }

    @Test
    public void testGetImageSize() {
        // org.apache.commons.imaging.common.Allocator.DEFAULT
        final int length = 1_073_741_824;

        final byte[] bytes = {
            // Header
            (byte) 0x89, 'P', 'N', 'G', '\r', '\n', 0x1A, '\n',
            // (Too large) Length
            intByte(length, 3), intByte(length, 2), intByte(length, 1), intByte(length, 0),
            // Chunk type
            'I', 'H', 'D', 'R',
        };
        IOException e = assertThrows(IOException.class, () -> new PngImageParser().getImageSize(bytes));
        assertEquals("Not a Valid PNG File: Couldn't read Chunk Data., name: Chunk Data, length: 1073741824", e.getMessage());

        Throwable cause = e.getCause();
        assertInstanceOf(EOFException.class, cause);
        assertEquals("Unexpected EOF; was expecting more bytes", cause.getMessage());
    }

    @Test
    public void testNoPalette() throws IOException {
        final BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        image.setRGB(1, 1, 0x00FFffFF);
        final PngImagingParameters params = new PngImagingParameters();

        final byte[] bytes = getPngImageBytes(image, params);
        final ImageInfo imageInfo = new PngImageParser().getImageInfo(bytes, null);
        assertFalse(imageInfo.usesPalette());
    }

    @Test
    public void testPalette() throws IOException {
        final BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        image.setRGB(1, 1, 0x00FFffFF);
        final PngImagingParameters params = new PngImagingParameters();
        params.setForceIndexedColor(true);

        final byte[] bytes = getPngImageBytes(image, params);
        final ImageInfo imageInfo = new PngImageParser().getImageInfo(bytes, null);
        assertTrue(imageInfo.usesPalette());
    }
}
