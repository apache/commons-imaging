package org.apache.commons.imaging.formats.bmp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class PixelParserRgbTest {

    private static final byte[] COLOR_TABLE = {
        (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xFF, // 0: Black
        (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, // 1: White
        (byte) 0x00, (byte) 0x00, (byte) 0xFF, (byte) 0xFF, // 2: Red
        (byte) 0x00, (byte) 0xFF, (byte) 0x00, (byte) 0xFF, // 3: Green
    };

    @Test
    public void testGetNextRgb_1Bit() throws IOException {
        final BmpHeaderInfo bhi = new BmpHeaderInfo(
            (byte) 0, (byte) 0, 0, 0, 0, 0, 2, 1, 1, 1, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0
        );
        // Data: 0b10100000 -> sample 1, then 0, then 1, then 0...
        final byte[] imageData = { (byte) 0xA0 };
        final PixelParserRgb parser = new PixelParserRgb(bhi, COLOR_TABLE, imageData);
        
        assertEquals(0xFFFFFFFF, parser.getNextRgb()); // 1 -> White
        assertEquals(0xFF000000, parser.getNextRgb()); // 0 -> Black
    }

    @Test
    public void testGetNextRgb_4Bit() throws IOException {
        final BmpHeaderInfo bhi = new BmpHeaderInfo(
            (byte) 0, (byte) 0, 0, 0, 0, 0, 2, 1, 1, 4, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0
        );
        // Data: 0x23 -> sample 2, then 3
        final byte[] imageData = { 0x23 };
        final PixelParserRgb parser = new PixelParserRgb(bhi, COLOR_TABLE, imageData);
        
        assertEquals(0xFFFF0000, parser.getNextRgb()); // 2 -> Red
        assertEquals(0xFF00FF00, parser.getNextRgb()); // 3 -> Green
    }

    @Test
    public void testGetNextRgb_8Bit() throws IOException {
        final BmpHeaderInfo bhi = new BmpHeaderInfo(
            (byte) 0, (byte) 0, 0, 0, 0, 0, 1, 1, 1, 8, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0
        );
        final byte[] imageData = { 2 };
        final PixelParserRgb parser = new PixelParserRgb(bhi, COLOR_TABLE, imageData);
        
        assertEquals(0xFFFF0000, parser.getNextRgb()); // 2 -> Red
    }

    @Test
    public void testGetNextRgb_16Bit() throws IOException {
        final BmpHeaderInfo bhi = new BmpHeaderInfo(
            (byte) 0, (byte) 0, 0, 0, 0, 0, 1, 1, 1, 16, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0
        );
        // RGB 555: Pure Blue = 0b0_00000_00000_11111 -> 0x001F
        // Little Endian: 0x1F, 0x00
        final byte[] imageData = { 0x1F, 0x00 };
        final PixelParserRgb parser = new PixelParserRgb(bhi, null, imageData);
        
        // blue = (0x1F) << 3 = 248. red=0, green=0.
        assertEquals(0xFF0000F8, parser.getNextRgb());
    }

    @Test
    public void testGetNextRgb_24Bit() throws IOException {
        final BmpHeaderInfo bhi = new BmpHeaderInfo(
            (byte) 0, (byte) 0, 0, 0, 0, 0, 1, 1, 1, 24, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0
        );
        // RGB: 0x112233. Little Endian: 0x33, 0x22, 0x11
        final byte[] imageData = { 0x33, 0x22, 0x11 };
        final PixelParserRgb parser = new PixelParserRgb(bhi, null, imageData);
        
        assertEquals(0xFF112233, parser.getNextRgb());
    }

    @Test
    public void testGetNextRgb_32Bit() throws IOException {
        final BmpHeaderInfo bhi = new BmpHeaderInfo(
            (byte) 0, (byte) 0, 0, 0, 0, 0, 1, 1, 1, 32, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0
        );
        // RGB: 0x112233. Little Endian: 0x33, 0x22, 0x11, 0x00
        final byte[] imageData = { 0x33, 0x22, 0x11, 0x00 };
        final PixelParserRgb parser = new PixelParserRgb(bhi, null, imageData);
        
        assertEquals(0xFF112233, parser.getNextRgb());
    }

    @Test
    public void testNewlinePadding() throws IOException {
        final BmpHeaderInfo bhi = new BmpHeaderInfo(
            (byte) 0, (byte) 0, 0, 0, 0, 0, 1, 1, 1, 24, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0
        );
        // 24 bits = 3 bytes. 1 byte padding needed.
        final byte[] imageData = { 0x33, 0x22, 0x11, 0x55, (byte) 0xFF }; 
        final PixelParserRgb parser = new PixelParserRgb(bhi, null, imageData);
        
        parser.getNextRgb(); // consumes 3 bytes
        parser.newline(); // should consume 1 more byte (0x55)
        
        // Next read should fail with ArrayIndexOutOfBoundsException or IOException
        // Case 24 uses imageData[byteCount + 0], which throws AIOOBE if byteCount is at the end.
        assertThrows(RuntimeException.class, parser::getNextRgb);
    }
}
