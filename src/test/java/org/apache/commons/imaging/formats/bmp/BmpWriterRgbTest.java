package org.apache.commons.imaging.formats.bmp;

import org.junit.Test;

import java.awt.image.BufferedImage;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Unit tests for class {@link BmpWriterRgb}.
 *
 * @date 13.07.2017
 * @see BmpWriterRgb
 *
 **/
public class BmpWriterRgbTest{


    @Test
    public void testGetImageData() {

        BmpWriterRgb bmpWriterRgb = new BmpWriterRgb();
        BufferedImage bufferedImage = new BufferedImage(2, 2, 5);
        byte[] byteArray = bmpWriterRgb.getImageData(bufferedImage);

        assertEquals( 24, bmpWriterRgb.getBitsPerPixel() );
        assertEquals( 0, bmpWriterRgb.getPaletteSize() );
        assertEquals( 16, byteArray.length );
        assertArrayEquals( new byte[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, byteArray );

    }


}