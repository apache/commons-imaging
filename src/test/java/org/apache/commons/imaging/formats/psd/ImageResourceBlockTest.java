package org.apache.commons.imaging.formats.psd;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;

public class ImageResourceBlockTest{

    @Test
    public void testCreatesImageResourceBlockAndCallsGetName() throws UnsupportedEncodingException {
        byte[] byteArray = new byte[3];
        ImageResourceBlock imageResourceBlock = new ImageResourceBlock(0, byteArray, byteArray);

        assertEquals( new String(byteArray, "ISO-8859-1"), imageResourceBlock.getName());
    }

}