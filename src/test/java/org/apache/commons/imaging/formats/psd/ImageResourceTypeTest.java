package org.apache.commons.imaging.formats.psd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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