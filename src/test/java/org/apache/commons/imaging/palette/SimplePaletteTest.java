package org.apache.commons.imaging.palette;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for class {@link SimplePalette}.
 *
 * @date 2017-07-13
 * @see SimplePalette
 *
 **/
public class SimplePaletteTest{


    @Test
    public void testGetPaletteIndexReturningNegative() {

        int[] intArray = new int[1];
        SimplePalette simplePalette = new SimplePalette(intArray);

        assertEquals( -1, simplePalette.getPaletteIndex((-1)));
        assertEquals(1, simplePalette.length() );

    }


}