package org.apache.commons.imaging.formats.tiff;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for class {@link JpegImageData}.
 *
 * @date 13.07.2017
 * @see JpegImageData
 *
 **/
public class JpegImageDataTest{


    @Test
    public void testCreatesJpegImageDataAndCallsGetElementDescription() {

        byte[] byteArray = new byte[5];
        JpegImageData jpegImageData = new JpegImageData((-1L), 1, byteArray);
        String string = jpegImageData.getElementDescription(true);

        assertEquals("Jpeg image data: 5 bytes", string);
    }


}