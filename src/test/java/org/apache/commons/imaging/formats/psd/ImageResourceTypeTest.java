package org.apache.commons.imaging.formats.psd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for class {@link ImageResourceType}.
 *
 * @date 13.07.2017
 * @see ImageResourceType
 *
 **/
public class ImageResourceTypeTest{


    @Test
    public void testGetDescriptionWithPositive() {

        String string = ImageResourceType.getDescription(2309);

        assertEquals("Path Information (saved paths).", string);

    }


    @Test
    public void testGetDescriptionWithZero() {

        String string = ImageResourceType.getDescription(0);

        assertEquals("Unknown", string);

    }


}