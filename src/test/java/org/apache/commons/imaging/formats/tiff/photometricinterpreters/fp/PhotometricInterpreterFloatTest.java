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
package org.apache.commons.imaging.formats.tiff.photometricinterpreters.fp;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.imaging.FormatCompliance;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.formats.tiff.TiffContents;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.TiffReader;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Provides a unit test for the TIFF photometric interpreter used for mapping
 * floating-point values to a color palette.
 */
public class PhotometricInterpreterFloatTest {

    private static PhotometricInterpreterFloat pInterp;
    private static ImageBuilder imageBuilder;

    public PhotometricInterpreterFloatTest() {
    }

    @BeforeAll
    public static void setUpClass() throws ImageWriteException, ImageReadException, IOException {
        // the setup is to assign color (grayscale) values to the
        // pixels along the main diagonal at coordinates
        // (0, 0), (1, 1), ... (256, 256).
        // The floating point values at each pixel are just the
        // index divided by 256.

        List<IPaletteEntry> paletteList = new ArrayList<>();
        List<IPaletteEntry> reverseList = new ArrayList<>();
        for (int i = 0; i < 256; i += 32) {
            int i1 = i + 31;
            float f0 = (float) i / 256f;
            float f1 = (float) (i + 32) / 256f;
            int argb0 = 0xff000000 | (i << 8) | i;
            int argb1 = 0xff000000 | (i1 << 8) | i;
            Color c0 = new Color(argb0);
            Color c1 = new Color(argb1);
            PaletteEntryForRange entry = new PaletteEntryForRange(f0, f1, c0, c1);
            paletteList.add(entry);
        }
        // The interpreter is supposed to sort entries.  To test that,
        // we copy them to a list in reverse order.
        for (int i = paletteList.size() - 1; i >= 0; i--) {
            IPaletteEntry entry = paletteList.get(i);
            reverseList.add(entry);
        }

        try {
            // The interpreter's constructor requires a directory as an argument.
            // The directory must define specific parameters and have an associated
            // image of a floating-point type.  Rather than constructing one using
            // the commons-imaging API, we simply read one from the resources.
            // The relative path is 8 levels up and then down into the data directory
            File target = new File("src\\test\\data\\images\\tiff\\9",
                "USGS_13_n38w077_dir5.tiff");
            if (!target.exists()) {
                fail("Input resource not found " + target.getAbsolutePath());
            }
            ByteSourceFile byteSource = new ByteSourceFile(target);
            TiffReader tiffReader = new TiffReader(true);
            TiffContents contents = tiffReader.readDirectories(
                byteSource,
                true, // indicates that application should read image data, if present
                FormatCompliance.getDefault());

            TiffDirectory directory = contents.directories.get(0);
            pInterp = new PhotometricInterpreterFloat(directory, reverseList);

            // pre-populate the state data for the interpreter with
            // some values so that we can test min/max access methods.
            imageBuilder = new ImageBuilder(257, 257, false);
            int[] samples = new int[1];
            for (int i = 0; i <= 256; i++) {
                float f = (float) i / 256f;
                samples[0] = Float.floatToRawIntBits(f);
                pInterp.interpretPixel(imageBuilder, samples, i, i);
            }
        } catch (ImageReadException | IOException ex) {
            fail("Exception initializing test " + ex.getMessage());
        }
    }

    /**
     * Test of interpretPixel method, of class PhotometricInterpreterFloat.
     */
    @Test
    public void testInterpretPixel() {
        for (int i = 0; i < 256; i++) {
            int lowTest = (i / 32) * 32;
            int argb = imageBuilder.getRGB(i, i);
            int b = argb & 0xff;
            assertEquals(b, lowTest, "Invalid conversion for level " + i);
        }

        // nothing should match the i=256 case.
        // The last entry in the palette has values
        // in the range  224.0/256.0 <= value < 256.0/256.0.  So when it
        // was rendered, there was not palette entry that matched it,
        // and the corresponding pixel was set to zero.
        int argb = imageBuilder.getRGB(256, 256);
        assertEquals(argb, 0, "Invalid upper-bound test");
    }

    /**
     * Test of getMinFound method, of class PhotometricInterpreterFloat.
     */
    @Test
    public void testGetMinFound() {
        float expResult = 0.0F;
        float result = pInterp.getMinFound();
        assertEquals(expResult, result, 0.0, "Invalid minimum value");
    }

    /**
     * Test of getMaxXY method, of class PhotometricInterpreterFloat.
     */
    @Test
    public void testGetMaxXY() {
        int[] expResult = new int[]{256, 256};
        int[] result = pInterp.getMaxXY();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getMaxFound method, of class PhotometricInterpreterFloat.
     */
    @Test
    public void testGetMaxFound() {
        float expResult = 1.0F;
        float result = pInterp.getMinFound();
        assertEquals(expResult, result, 1.0, "Invalid maximum value");
    }

    /**
     * Test of getMinXY method, of class PhotometricInterpreterFloat.
     */
    @Test
    public void testGetMinXY() {
        int[] expResult = new int[]{0, 0};
        int[] result = pInterp.getMinXY();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getMeanFound method, of class PhotometricInterpreterFloat.
     */
    @Test
    public void testGetMeanFound() {
        float expResult = 0.5F;
        float result = pInterp.getMinFound();
        assertEquals(expResult, result, 1.0, "Invalid mean value");
    }

}
