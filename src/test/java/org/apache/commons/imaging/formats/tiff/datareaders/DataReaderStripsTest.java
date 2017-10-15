package org.apache.commons.imaging.formats.tiff.datareaders;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DataReaderStripsTest {
    @Test
    public void testApplyPredictor() throws Exception {
        int[] bitsPerPixel = {1,2,3};
        DataReaderStrips strips = new DataReaderStrips(null, null, 3, bitsPerPixel , 2, 4, 3, 1, 1, null, 2, null);
        strips.resetPredictor();
        int[] samples = {10, 355, 355, 255};
        int[] expected = {10, 99, 99, 255};
        int[] predicted = strips.applyPredictor(samples);
        assertArrayEquals(expected, predicted);
        expected = new int[]{20, 198, 198, 254};
        predicted = strips.applyPredictor(samples);
        assertArrayEquals(expected, predicted);
    }
}