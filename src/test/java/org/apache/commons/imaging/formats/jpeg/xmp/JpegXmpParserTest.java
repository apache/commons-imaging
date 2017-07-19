package org.apache.commons.imaging.formats.jpeg.xmp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class JpegXmpParserTest{

    @Test
    public void testCreatesJpegXmpParserAndCallsParseXmpJpegSegment() {
        JpegXmpParser jpegXmpParser = new JpegXmpParser();
        byte[] byteArray = new byte[1];

        try {
            jpegXmpParser.parseXmpJpegSegment(byteArray);
            fail("Expecting exception: Exception");
        } catch(Exception e) {
            assertEquals("Invalid JPEG XMP Segment.",e.getMessage());
            assertEquals(JpegXmpParser.class.getName(), e.getStackTrace()[0].getClassName());
        }
    }

}