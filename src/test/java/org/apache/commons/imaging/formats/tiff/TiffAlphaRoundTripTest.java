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
package org.apache.commons.imaging.formats.tiff;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;

import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.Imaging;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.io.TempDir;

/**
 * Performs a round-trip that writes an image containing Alpha and then reads it
 * back.
 * Selected non-opaque pixels are tested for correctness,
 */
public class TiffAlphaRoundTripTest {

    @TempDir
    Path tempDir;

    @Test
    public void test() throws Exception {

        // This test will exercise two passes to test the implementation
        // of the TIFF support for writing and reading images containing
        // an alpha channel.  In the first pass, the alpha writing is enabled
        // in the second pass it is suppressed.
        for (int i = 0; i < 2; i++) {
            // Step 0, create a buffered image that includes transparency
            // in the form of two rectangles, one completely opaque,
            // and one giving 50 percent opaque red.
            int width = 400;
            int height = 400;
            BufferedImage image0;
            if (i == 0) {
                image0 = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            } else {
                image0 = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            }
            Graphics2D g2d = image0.createGraphics();
            g2d.setColor(Color.red);
            g2d.fillRect(0, 0, width, height);
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC));
            g2d.setColor(new Color(0, 0, 0, 0));
            g2d.fillRect(100, 100, 100, 100);
            g2d.setColor(new Color(0xff, 0, 0, 0x80));
            g2d.fillRect(200, 200, 100, 100);

            // Step 1: write the Buffered Image to an output file and
            //         then read it back in.  This action will test the
            //         correctness of a round-trip test.
            File file = new File(tempDir.toFile(), "TiffAlphaRoundTripTest.tif");
            file.delete();
            HashMap<String, Object> params = new HashMap<>();

            Imaging.writeImage(image0, file, ImageFormats.TIFF, params);
            BufferedImage image1 = Imaging.getBufferedImage(file);

            // Step 2:  create a composite image overlaying a white background
            //          with the results from the TIFF file.
            BufferedImage compImage
                = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            g2d = compImage.createGraphics();
            g2d.setColor(Color.white);
            g2d.fillRect(0, 0, width, height);
            g2d.drawImage(image1, 0, 0, null);

            // Step 3, verify that the correct values are in the image.
            int test1 = compImage.getRGB(150, 150); // in the transparent rectangle
            int test2 = compImage.getRGB(250, 250);
            if (i == 0) {
                doPixelsMatch(150, 150, 0xffffffff, test1);
                doPixelsMatch(250, 250, 0xffff7f7f, test2);
            } else {
                doPixelsMatch(151, 151, 0xff000000, test1);
                doPixelsMatch(251, 251, 0xffff0000, test2);
            }
        }
    }

    void doPixelsMatch(int x, int y, int a, int b) {
        if (!componentMatch(a, b, 0, 2)
            || !componentMatch(a, b, 8, 2)
            || !componentMatch(a, b, 16, 2)
            || !componentMatch(a, b, 24, 2)) {

            String complaint = String.format("Pixel mismatch at (%d,%d): 0x%08x 0x%08x",
                x, y, a, b);
            fail(complaint);
        }
    }

    /**
     * Checks to see if a pixel component (A, R, G, or B) for two specified
     * values are within a specified tolerance.
     *
     * @param a the first value
     * @param b the second value
     * @param iShift a multiple of 8 telling how far to shift values
     * to extract components (24, 16, 8, or zero for ARGB)
     * @param iTolerance a small positive integer
     * @return true if the components of the values match
     */
    boolean componentMatch(int a, int b, int iShift, int iTolerance) {
        int delta = ((a >> iShift) & 0xff) - ((b >> iShift) & 0xff);
        if (delta < 0) {
            delta = -delta;
        }
        return delta < iTolerance;
    }
}
