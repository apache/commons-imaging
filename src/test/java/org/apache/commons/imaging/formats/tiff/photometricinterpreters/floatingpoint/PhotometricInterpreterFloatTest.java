/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.ImageBuilder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Provides a unit test for the TIFF photometric interpreter used for mapping
 * floating-point values to a color palette.
 */
public class PhotometricInterpreterFloatTest {

    private static PhotometricInterpreterFloat pInterp;
    private static PhotometricInterpreterFloat bandedInterp;
    private static ImageBuilder imageBuilder;
    private static ImageBuilder bandedImageBuilder;

    private static final Color orange = new Color(255, 136, 62);
    private static final Color green = new Color(22, 155, 98);

    public PhotometricInterpreterFloatTest() {
    }

    @BeforeAll
    public static void setUpClass() throws ImageReadException, IOException {
        // the setup is to assign color (grayscale) values to the
        // pixels along the main diagonal at coordinates
        // (0, 0), (1, 1), ... (256, 256).
        // The floating point values at each pixel are just the
        // index divided by 256.

        final List<PaletteEntry> paletteList = new ArrayList<>();
        final List<PaletteEntry> reverseList = new ArrayList<>();
        for (int i = 0; i < 256; i += 32) {
            final int i1 = i + 31;
            final float f0 = i / 256f;
            final float f1 = (i + 32) / 256f;
            final int argb0 = 0xff000000 | (i << 8) | i;
            final int argb1 = 0xff000000 | (i1 << 8) | i;
            final Color c0 = new Color(argb0);
            final Color c1 = new Color(argb1);
            final PaletteEntryForRange entry = new PaletteEntryForRange(f0, f1, c0, c1);
            paletteList.add(entry);
        }
        // The interpreter is supposed to sort entries.  To test that,
        // we copy them to a list in reverse order.
        for (int i = paletteList.size() - 1; i >= 0; i--) {
            final PaletteEntry entry = paletteList.get(i);
            reverseList.add(entry);
        }

        pInterp = new PhotometricInterpreterFloat(reverseList);

        // pre-populate the state data for the interpreter with
        // some values so that we can test min/max access methods.
        imageBuilder = new ImageBuilder(257, 257, false);
        final int[] samples = new int[1];
        for (int i = 0; i <= 256; i++) {
            final float f = i / 256f;
            samples[0] = Float.floatToRawIntBits(f);
            pInterp.interpretPixel(imageBuilder, samples, i, i);
        }

        // Now set up a palette than maps values in a range to a single color.
        final List<PaletteEntry> bandedPaletteList = new ArrayList<>();
        bandedPaletteList.add(new PaletteEntryForRange(0f, 0.33f, green));
        bandedPaletteList.add(new PaletteEntryForRange(0.33f, 0.66f, Color.white));
        bandedPaletteList.add(new PaletteEntryForRange(0.66f, 1.0f, orange));
        bandedPaletteList.add(new PaletteEntryForValue(Float.NaN, Color.gray));
        bandedPaletteList.add(new PaletteEntryForValue(-1, Color.gray));
        bandedInterp = new PhotometricInterpreterFloat(bandedPaletteList);
        bandedImageBuilder = new ImageBuilder(300, 200, false);
        for (int j = 0; j < 300; j++) {
            final float f = j / 299.0f;
            samples[0] = Float.floatToRawIntBits(f);
            for (int i = 0; i < 200; i++) {
                bandedInterp.interpretPixel(bandedImageBuilder, samples, j, i);
            }
        }
        samples[0] = Float.floatToRawIntBits(Float.NaN);
        for (int i = 0; i < 200; i++) {
            bandedInterp.interpretPixel(bandedImageBuilder, samples, 0, i);
            bandedInterp.interpretPixel(bandedImageBuilder, samples, 299, i);
        }
        samples[0] = Float.floatToRawIntBits(-1);
        for (int i = 0; i < 300; i++) {
            bandedInterp.interpretPixel(bandedImageBuilder, samples, i, 0);
            bandedInterp.interpretPixel(bandedImageBuilder, samples, i, 199);
        }
    }

    /**
     * Test of interpretPixel method, of class PhotometricInterpreterFloat.
     */
    @Test
    public void testInterpretPixel() {
        for (int i = 0; i < 256; i++) {
            final int lowTest = (i / 32) * 32;
            final int argb = imageBuilder.getRGB(i, i);
            final int b = argb & 0xff;
            assertEquals(b, lowTest, "Invalid conversion for level " + i);
        }

        // nothing should match the i=256 case.
        // The last entry in the palette has values
        // in the range  224.0/256.0 <= value < 256.0/256.0.  So when it
        // was rendered, there was not palette entry that matched it,
        // and the corresponding pixel was set to zero.
        int argb = imageBuilder.getRGB(256, 256);
        assertEquals(argb, 0, "Invalid upper-bound test");

        // Now inspect the banded palette case
        argb = bandedImageBuilder.getRGB(0, 0);
        assertEquals(Color.gray.getRGB(), argb, "Invalid mapping of NaN");
        argb = bandedImageBuilder.getRGB(50, 10);
        assertEquals(green.getRGB(), argb, "Invalid mapping of green range");
        argb = bandedImageBuilder.getRGB(150, 10);
        assertEquals(Color.white.getRGB(), argb, "Invalid mapping of white range");
        argb = bandedImageBuilder.getRGB(250, 10);
        assertEquals(orange.getRGB(), argb, "Invalid mapping of orange range");
    }

    /**
     * Test of getMinFound method, of class PhotometricInterpreterFloat.
     */
    @Test
    public void testGetMinFound() {
        final float expResult = 0.0F;
        final float result = pInterp.getMinFound();
        assertEquals(expResult, result, 0.0, "Invalid minimum value");
    }

    /**
     * Test of getMaxXY method, of class PhotometricInterpreterFloat.
     */
    @Test
    public void testGetMaxXY() {
        final int[] expResult = new int[]{256, 256};
        final int[] result = pInterp.getMaxXY();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getMaxFound method, of class PhotometricInterpreterFloat.
     */
    @Test
    public void testGetMaxFound() {
        final float expResult = 1.0F;
        final float result = pInterp.getMinFound();
        assertEquals(expResult, result, 1.0, "Invalid maximum value");
    }

    /**
     * Test of getMinXY method, of class PhotometricInterpreterFloat.
     */
    @Test
    public void testGetMinXY() {
        final int[] expResult = new int[]{0, 0};
        final int[] result = pInterp.getMinXY();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getMeanFound method, of class PhotometricInterpreterFloat.
     */
    @Test
    public void testGetMeanFound() {
        final float expResult = 0.5F;
        final float result = pInterp.getMinFound();
        assertEquals(expResult, result, 1.0, "Invalid mean value");
    }

    /**
     * Test of interpretPixel method, of class PhotometricInterpreterFloat.
     */
    @Test
    public void testMapValueToARGB() {

        int argb = pInterp.mapValueToARGB(0.5f);
        int test = imageBuilder.getRGB(128, 128);
        assertEquals(test, argb, "Conflicting results from value-to-ARGB map");

        // pInterp does not define a state for NaN, but bandedInterp does.
        // so test both variations
        argb = pInterp.mapValueToARGB(Float.NaN);
        assertEquals(0, argb, "Non-defined NaN did not return ARGB of zero");

        // to test mappings for special values, use the banded-interpreter
        argb = bandedInterp.mapValueToARGB(Float.NaN);
        test = Color.gray.getRGB();
        assertEquals(test, argb, "Float.NaN mapped to incorrect ARGB");
        argb = bandedInterp.mapValueToARGB(-1f);
        test = Color.gray.getRGB();
        assertEquals(test, argb, "Excluded value mapped to incorrect ARGB");
    }

    @Test
    public void testConstructors() {
        PhotometricInterpreterFloat ptest;
        ptest = new PhotometricInterpreterFloat(0, 1);
        ptest = new PhotometricInterpreterFloat(1, 0);
        try {
            ptest = new PhotometricInterpreterFloat(null);
            fail("Constructor failed to detect null arguments");
        } catch (final IllegalArgumentException iex) {

        }

        try {
            ptest = new PhotometricInterpreterFloat(0.1f, 0.1f);
            fail("Constructor failed to detect bad-range argument values");
        } catch (final IllegalArgumentException iex) {

        }

    }

     /**
     * Test of overlapping entries
     */
    @Test
    public void testOverlappingEntriesEntry() throws ImageReadException, IOException  {
        final Color c0 = new Color(0xff0000ff);
        final Color c1 = new Color(0xff00ff00);
        final List<PaletteEntry> overlapList = new ArrayList<>();
        overlapList.add(new PaletteEntryForRange(0.0f, 1.0f, c0));
        overlapList.add(new PaletteEntryForRange(0.0f, 1.5f, c1));

        final PhotometricInterpreterFloat interpreter = new PhotometricInterpreterFloat(overlapList);

        imageBuilder = new ImageBuilder(257, 257, false);
        final int[] samples = new int[1];
        samples[0] = Float.floatToRawIntBits(0.5f);
        interpreter.interpretPixel(imageBuilder, samples, 0, 0);
        samples[0] = Float.floatToRawIntBits(1.2f);
        interpreter.interpretPixel(imageBuilder, samples, 1, 1);
        int argb0 = imageBuilder.getRGB(0,0)|0xff000000;
        int argb1 = imageBuilder.getRGB(1,1)|0xff000000;
        assertEquals(argb0, c0.getRGB(), "Invalid result for overlapping palette entry 0");
        assertEquals(argb1, c1.getRGB(), "Invalid result for overlapping palette entry 1");
        argb0 = interpreter.mapValueToARGB(0.5f);
        argb1 = interpreter.mapValueToARGB(1.2f);
        assertEquals(argb0, c0.getRGB(), "Invalid mapping for overlapping palette entry 0");
        assertEquals(argb1, c1.getRGB(), "Invalid mapping for overlapping palette entry 1");
    }

}
