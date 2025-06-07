/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.imaging.formats.tiff;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingTestConstants;
import org.junit.jupiter.api.Test;

/**
 * Reads files in the BigTIFF samples folder and compares the BigTIFF files against the standard "classic" tiff image.
 */
public class TiffBigTiffTest extends AbstractTiffTest {

    private boolean doImagesMatch(final int w, final int h, final int[] classicRgb, final BufferedImage image) {
        final int iW = image.getWidth();
        final int iH = image.getHeight();
        if (iW != w || iH != h) {
            return false;
        }
        final int[] argb = new int[w * h];
        image.getRGB(0, 0, w, h, argb, 0, w);
        for (int i = 0; i < argb.length; i++) {
            if ((argb[i] & 0x00ffffff) != (classicRgb[i] & 0x00ffffff)) {
                return false;
            }
        }
        return true;
    }

    @Test
    void test() throws IOException {
        final File tiffFolder = new File(ImagingTestConstants.TEST_IMAGE_FOLDER, "tiff");
        final File bigTiffFolder = new File(tiffFolder, "13");

        final File classicFile = new File(bigTiffFolder, "Classic.tif");
        final BufferedImage classicImage = Imaging.getBufferedImage(classicFile);
        assertNotNull(classicImage);
        final int w = classicImage.getWidth();
        final int h = classicImage.getHeight();
        final int[] classicRgb = new int[w * h];
        classicImage.getRGB(0, 0, w, h, classicRgb, 0, w); // data for comparison

        int nTest = 0;
        final File[] files = bigTiffFolder.listFiles();
        for (final File f : files) {
            final String name = f.getName();
            if (!name.toLowerCase().startsWith("bigtiff")) {
                continue;
            }
            final BufferedImage image = Imaging.getBufferedImage(f);
            assertNotNull(image);
            final boolean status = doImagesMatch(w, h, classicRgb, image);
            assertTrue(status, "BigTIFF content does not match test image for " + name);
            nTest++;
        }

        assertTrue(nTest > 0, "JUnit test failed to find sample BigTIFF files");
    }

}
