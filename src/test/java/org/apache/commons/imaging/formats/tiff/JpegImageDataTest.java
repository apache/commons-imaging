package org.apache.commons.imaging.formats.tiff;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JpegImageDataTest{

    @Test
    public void testCreatesJpegImageDataAndCallsGetElementDescription() {
        byte[] byteArray = new byte[5];
        JpegImageData jpegImageData = new JpegImageData((-1L), 1, byteArray);
        String string = jpegImageData.getElementDescription(true);

        assertEquals("Jpeg image data: 5 bytes", string);
    }

}