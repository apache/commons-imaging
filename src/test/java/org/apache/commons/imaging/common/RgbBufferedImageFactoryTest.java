package org.apache.commons.imaging.common;

import org.junit.Test;

import java.awt.image.DirectColorModel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Unit tests for class {@link RgbBufferedImageFactory}.
 *
 * @date 13.07.2017
 * @see RgbBufferedImageFactory
 *
 **/
public class RgbBufferedImageFactoryTest{


    @Test
    public void testGetColorBufferedImageThrowsIllegalArgumentException() {

        RgbBufferedImageFactory rgbBufferedImageFactory = new RgbBufferedImageFactory();

        try {
            rgbBufferedImageFactory.getColorBufferedImage(0, 0, true);
            fail("Expecting exception: IllegalArgumentException");
        } catch(IllegalArgumentException e) {
            assertEquals("Width (0) and height (0) cannot be <= 0",e.getMessage());
            assertEquals(DirectColorModel.class.getName(), e.getStackTrace()[0].getClassName());
        }

    }


}