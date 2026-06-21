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
package org.apache.commons.imaging.formats.bmp;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.commons.imaging.common.AbstractBinaryOutputStream;
import org.apache.commons.imaging.palette.SimplePalette;
import org.junit.jupiter.api.Test;

public class BmpWriterPaletteTest {

    @Test
    public void testBmpWriterPalette_1Bit() {
        final int[] colors = { 0x000000, 0xFFFFFF };
        final SimplePalette palette = new SimplePalette(colors);
        final BmpWriterPalette writer = new BmpWriterPalette(palette);
        
        assertEquals(1, writer.getBitsPerPixel());
        assertEquals(2, writer.getPaletteSize());
        
        final BufferedImage image = new BufferedImage(2, 1, BufferedImage.TYPE_INT_RGB);
        image.setRGB(0, 0, 0xFFFFFF); // White (index 1)
        image.setRGB(1, 0, 0x000000); // Black (index 0)
        
        final byte[] imageData = writer.getImageData(image);
        // 2 pixels at 1 bit each = 2 bits. Packed into one byte as 0b10000000 = 0x80.
        // Padding to 4 bytes: 0x80, 0, 0, 0.
        assertArrayEquals(new byte[] { (byte) 0x80, 0, 0, 0 }, imageData);
    }

    @Test
    public void testBmpWriterPalette_4Bit() {
        final int[] colors = new int[16];
        for (int i = 0; i < 16; i++) colors[i] = i;
        final SimplePalette palette = new SimplePalette(colors);
        final BmpWriterPalette writer = new BmpWriterPalette(palette);
        
        assertEquals(4, writer.getBitsPerPixel());
        
        final BufferedImage image = new BufferedImage(2, 1, BufferedImage.TYPE_INT_RGB);
        image.setRGB(0, 0, 0x000002); // Index 2
        image.setRGB(1, 0, 0x000003); // Index 3
        
        final byte[] imageData = writer.getImageData(image);
        // 2 pixels at 4 bits each = 8 bits. 0x23.
        // Padding to 4 bytes: 0x23, 0, 0, 0.
        assertArrayEquals(new byte[] { 0x23, 0, 0, 0 }, imageData);
    }

    @Test
    public void testBmpWriterPalette_8Bit() {
        final int[] colors = new int[256];
        for (int i = 0; i < 256; i++) colors[i] = i;
        final SimplePalette palette = new SimplePalette(colors);
        final BmpWriterPalette writer = new BmpWriterPalette(palette);
        
        assertEquals(8, writer.getBitsPerPixel());
        
        final BufferedImage image = new BufferedImage(2, 1, BufferedImage.TYPE_INT_RGB);
        image.setRGB(0, 0, 0x00000A); // Index 10
        image.setRGB(1, 0, 0x00000B); // Index 11
        
        final byte[] imageData = writer.getImageData(image);
        // 2 pixels at 8 bits each = 2 bytes. 0x0A, 0x0B.
        // Padding to 4 bytes: 0x0A, 0x0B, 0, 0.
        assertArrayEquals(new byte[] { 0x0A, 0x0B, 0, 0 }, imageData);
    }

    @Test
    public void testWritePalette() throws IOException {
        final int[] colors = { 0x112233, 0x445566 };
        final SimplePalette palette = new SimplePalette(colors);
        final BmpWriterPalette writer = new BmpWriterPalette(palette);
        
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final AbstractBinaryOutputStream bos = AbstractBinaryOutputStream.littleEndian(baos);
        writer.writePalette(bos);
        
        final byte[] paletteData = baos.toByteArray();
        // Each entry is 4 bytes: Blue, Green, Red, 0
        final byte[] expected = {
            0x33, 0x22, 0x11, 0,
            0x66, 0x55, 0x44, 0
        };
        assertArrayEquals(expected, paletteData);
    }
}
