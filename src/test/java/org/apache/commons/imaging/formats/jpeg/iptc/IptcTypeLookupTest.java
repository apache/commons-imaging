package org.apache.commons.imaging.formats.jpeg.iptc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IptcTypeLookupTest{

    @Test
    public void testGetIptcTypeWithPositive() {
        IptcType iptcType = IptcTypeLookup.getIptcType(1117);

        assertEquals(1117, iptcType.getType());
        assertEquals("Unknown", iptcType.getName());
    }

}