package org.apache.commons.imaging.formats.psd.dataparsers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataParserCmykTest {

    @Test
    public void testGetBasicChannelsCount() {
        DataParserCmyk dataParserCmyk = new DataParserCmyk();

        assertEquals(4, dataParserCmyk.getBasicChannelsCount());
    }

}