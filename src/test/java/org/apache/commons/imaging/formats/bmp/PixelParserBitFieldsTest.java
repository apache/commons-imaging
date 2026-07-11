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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;

import org.apache.commons.imaging.ImagingException;
import org.junit.jupiter.api.Test;

public class PixelParserBitFieldsTest {

    @Test
    public void testGetNextRgb_16Bit() throws IOException {
        // 5-6-5 RGB
        final BmpHeaderInfo bhi = new BmpHeaderInfo((byte) 0, (byte) 0, 0, 0, 0, 0, 1, 1, 1, 16, 3, 0, 0, 0, 0, 0, 0b1111100000000000, // red
                0b0000011111100000, // green
                0b0000000000011111, // blue
                0, 0, null, 0, 0, 0, 0, 0, 0, 0);
        // Data: 0b11111_000000_00000 -> 0xF800 (Pure Red in 565)
        // Little endian: 0x00, 0xF8
        final byte[] imageData = { 0x00, (byte) 0xF8 };
        final PixelParserBitFields parser = new PixelParserBitFields(bhi, null, imageData);
        final int rgb = parser.getNextRgb();
        // 0xF800 -> red = 0b11111 (31). 31 << 3 = 248.
        // Expected ARGB: 0xFFF80000
        assertEquals(0xFFF80000, rgb);
    }

    @Test
    public void testGetNextRgb_32Bit_WithAlpha() throws IOException {
        final BmpHeaderInfo bhi = new BmpHeaderInfo((byte) 0, (byte) 0, 0, 0, 0, 0, 1, 1, 1, 32, 3, 0, 0, 0, 0, 0, 0x00FF0000, // red
                0x0000FF00, // green
                0x000000FF, // blue
                0xFF000000, // alpha
                0, null, 0, 0, 0, 0, 0, 0, 0);
        // Data: ARGB = 0x80402010
        // Little endian: 0x10, 0x20, 0x40, 0x80
        final byte[] imageData = { 0x10, 0x20, 0x40, (byte) 0x80 };
        final PixelParserBitFields parser = new PixelParserBitFields(bhi, null, imageData);
        final int rgb = parser.getNextRgb();
        assertEquals(0x80402010, rgb);
    }

    @Test
    public void testGetNextRgb_24Bit() throws IOException {
        final BmpHeaderInfo bhi = new BmpHeaderInfo((byte) 0, (byte) 0, 0, 0, 0, 0, 1, 1, 1, 24, 3, 0, 0, 0, 0, 0, 0x00FF0000, // red
                0x0000FF00, // green
                0x000000FF, // blue
                0, // alpha
                0, null, 0, 0, 0, 0, 0, 0, 0);
        // Data: RGB = 0x112233
        // Little endian: 0x33, 0x22, 0x11
        final byte[] imageData = { 0x33, 0x22, 0x11 };
        final PixelParserBitFields parser = new PixelParserBitFields(bhi, null, imageData);
        final int rgb = parser.getNextRgb();
        assertEquals(0xFF112233, rgb);
    }

    @Test
    public void testGetNextRgb_8Bit() throws IOException {
        final BmpHeaderInfo bhi = new BmpHeaderInfo((byte) 0, (byte) 0, 0, 0, 0, 0, 1, 1, 1, 8, 3, 0, 0, 0, 0, 0, 0b11100000, // red
                0b00011100, // green
                0b00000011, // blue
                0, // alpha
                0, null, 0, 0, 0, 0, 0, 0, 0);
        // Data: 0b101_010_11 -> 0xAB
        final byte[] imageData = { (byte) 0xAB };
        final PixelParserBitFields parser = new PixelParserBitFields(bhi, null, imageData);
        final int rgb = parser.getNextRgb();
        // red = 0b101 (5). 5 << 5 = 160.
        // green = 0b010 (2). 2 << 5 = 64.
        // blue = 0b11 (3). 3 << 6 = 192.
        // wait, getMaskShift for blue (mask=3):
        // trailingZeroes = 0.
        // maskLength = 2.
        // return 0 - (8 - 2) = -6.
        // blue << -(-6) = blue << 6. 3 << 6 = 192. Correct.
        assertEquals(0xFFA040C0, rgb);
    }

    @Test
    public void testNewlinePadding() throws IOException {
        final BmpHeaderInfo bhi = new BmpHeaderInfo((byte) 0, (byte) 0, 0, 0, 0, 0, 1, 1, 1, 16, 3, 0, 0, 0, 0, 0, 0xF800, 0x07E0, 0x001F, 0, 0, null, 0, 0, 0,
                0, 0, 0, 0);
        // 16 bits = 2 bytes. 2 bytes padding needed to reach the 4-byte boundary.
        final byte[] imageData = { 0x00, 0x00, 0x55, 0x66 };
        final PixelParserBitFields parser = new PixelParserBitFields(bhi, null, imageData);
        parser.getNextRgb(); // consumes 2 bytes
        parser.newline(); // should consume 2 more bytes
        // Next read should fail, or we can check internal byteCount if it was accessible
        // Since we can't check byteCount, we can try to read again and see if it fails.
        assertThrows(IOException.class, () -> parser.getNextRgb());
    }

    @Test
    public void testUnknownBitsPerPixel() {
        final BmpHeaderInfo bhi = new BmpHeaderInfo((byte) 0, (byte) 0, 0, 0, 0, 0, 1, 1, 1, 7, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0);
        final byte[] imageData = { 0 };
        final PixelParserBitFields parser = new PixelParserBitFields(bhi, null, imageData);
        assertThrows(ImagingException.class, parser::getNextRgb);
    }
}
