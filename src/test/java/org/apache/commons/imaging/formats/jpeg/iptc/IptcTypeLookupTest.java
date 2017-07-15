package org.apache.commons.imaging.formats.jpeg.iptc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for class {@link IptcTypeLookup}.
 *
 * @date 13.07.2017
 * @see IptcTypeLookup
 *
 **/
public class IptcTypeLookupTest{


    @Test
    public void testGetIptcTypeWithPositive() {

        IptcType iptcType = IptcTypeLookup.getIptcType(1117);

        assertEquals( 1117, iptcType.getType() );
        assertEquals( "Unknown", iptcType.getName() );

    }


}