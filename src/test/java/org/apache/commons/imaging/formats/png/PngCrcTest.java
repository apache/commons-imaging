package org.apache.commons.imaging.formats.png;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for class {@link PngCrc}.
 *
 * @date 2017-07-13
 * @see PngCrc
 *
 **/
public class PngCrcTest{


    @Test
    public void testCrc() {

        PngCrc pngCrc = new PngCrc();
        byte[] byteArray = new byte[4];

        assertEquals(558161692, pngCrc.crc(byteArray, (byte)32));
        assertEquals(3736805603L, pngCrc.start_partial_crc(byteArray, 0));

    }


}