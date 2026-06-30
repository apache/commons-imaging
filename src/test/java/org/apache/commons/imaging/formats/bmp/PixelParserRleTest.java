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

import java.io.IOException;

import org.apache.commons.imaging.common.ImageBuilder;
import org.junit.jupiter.api.Test;

public class PixelParserRleTest {

    private static final byte[] COLOR_TABLE = {
        (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xFF, // 0: Black
        (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, // 1: White
        (byte) 0x00, (byte) 0x00, (byte) 0xFF, (byte) 0xFF, // 2: Red
        (byte) 0x00, (byte) 0xFF, (byte) 0x00, (byte) 0xFF, // 3: Green
    };

    @Test
    public void testProcessImage_Rle8() throws IOException {
        final BmpHeaderInfo bhi = new BmpHeaderInfo(
            (byte) 0, (byte) 0, 0, 0, 0, 0, 2, 2, 1, 8, 1, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0
        );
        // RLE8 data:
        // 02 01 -> Encoded mode: repeat color index 1, 2 times
        // 00 00 -> Escape mode: End of line
        // 02 02 -> Encoded mode: repeat color index 2, 2 times
        // 00 01 -> Escape mode: End of file
        final byte[] imageData = {
            0x02, 0x01,
            0x00, 0x00,
            0x02, 0x02,
            0x00, 0x01
        };
        final PixelParserRle parser = new PixelParserRle(bhi, COLOR_TABLE, imageData);
        final ImageBuilder imageBuilder = new ImageBuilder(2, 2, false);
        parser.processImage(imageBuilder);
        
        // Row 1 (bottom row in BMP, y=1)
        assertEquals(0xFFFFFFFF, imageBuilder.getRgb(0, 1));
        assertEquals(0xFFFFFFFF, imageBuilder.getRgb(1, 1));
        // Row 0 (y=0)
        assertEquals(0xFFFF0000, imageBuilder.getRgb(0, 0));
        assertEquals(0xFFFF0000, imageBuilder.getRgb(1, 0));
    }

    @Test
    public void testProcessImage_Rle4() throws IOException {
        final BmpHeaderInfo bhi = new BmpHeaderInfo(
            (byte) 0, (byte) 0, 0, 0, 0, 0, 4, 1, 1, 4, 2, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0
        );
        // RLE4 data:
        // 04 23 -> Encoded mode: repeat colors index 2 and 3, 4 times (2, 3, 2, 3)
        // 00 01 -> Escape mode: End of file
        final byte[] imageData = {
            0x04, 0x23,
            0x00, 0x01
        };
        final PixelParserRle parser = new PixelParserRle(bhi, COLOR_TABLE, imageData);
        final ImageBuilder imageBuilder = new ImageBuilder(4, 1, false);
        parser.processImage(imageBuilder);
        
        assertEquals(0xFFFF0000, imageBuilder.getRgb(0, 0)); // 2
        assertEquals(0xFF00FF00, imageBuilder.getRgb(1, 0)); // 3
        assertEquals(0xFFFF0000, imageBuilder.getRgb(2, 0)); // 2
        assertEquals(0xFF00FF00, imageBuilder.getRgb(3, 0)); // 3
    }

    @Test
    public void testProcessImage_AbsoluteMode_Rle8() throws IOException {
        final BmpHeaderInfo bhi = new BmpHeaderInfo(
            (byte) 0, (byte) 0, 0, 0, 0, 0, 3, 1, 1, 8, 1, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0
        );
        // 00 03 01 02 03 00 -> Absolute mode: 3 pixels (1, 2, 3). 
        // 00 03 means absolute mode, 3 pixels. 
        // Next bytes: 01, 02, 03. 
        // Total bytes read must be even, so one padding byte 00.
        // 00 01 -> End of file.
        final byte[] imageData = {
            0x00, 0x03, 0x01, 0x02, 0x03, 0x00,
            0x00, 0x01
        };
        final PixelParserRle parser = new PixelParserRle(bhi, COLOR_TABLE, imageData);
        final ImageBuilder imageBuilder = new ImageBuilder(3, 1, false);
        parser.processImage(imageBuilder);
        
        assertEquals(0xFFFFFFFF, imageBuilder.getRgb(0, 0)); // 1
        assertEquals(0xFFFF0000, imageBuilder.getRgb(1, 0)); // 2
        assertEquals(0xFF00FF00, imageBuilder.getRgb(2, 0)); // 3
    }
    
    @Test
    public void testProcessImage_DeltaMode() throws IOException {
        final BmpHeaderInfo bhi = new BmpHeaderInfo(
            (byte) 0, (byte) 0, 0, 0, 0, 0, 4, 4, 1, 8, 1, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0
        );
        // 00 02 01 01 -> Delta mode: move x+1, y+1 (y is bottom-up, so move up/left relative to start)
        // Initial x=0, y=3.
        // Delta 1, 1 -> x=1, y=2.
        // 01 02 -> Encoded mode: repeat color 2, 1 time.
        // 00 01 -> EOF.
        final byte[] imageData = {
            0x00, 0x02, 0x01, 0x01,
            0x01, 0x02,
            0x00, 0x01
        };
        final PixelParserRle parser = new PixelParserRle(bhi, COLOR_TABLE, imageData);
        final ImageBuilder imageBuilder = new ImageBuilder(4, 4, false);
        parser.processImage(imageBuilder);
        
        assertEquals(0xFFFF0000, imageBuilder.getRgb(1, 2));
    }
}
