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

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingTestConstants;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Performs tests that access the content of TIFF files
 * containing non-opaque alpha-channel pixels
 */
public class TiffReadAlphaTest {

    private final static String[] names = {
        "TransparencyTestStripAssociated.tif",
        "TransparencyTestStripUnassociated.tif",
        "TransparencyTestTileAssociated.tif",
        "TransparencyTestTileUnassociated.tif"
    };

    private final static int[][] testSite = {
        {40, 40, 0xffff0000},
        {60, 40, 0xff77ff77},
        {40, 60, 0xffff0000},
        {60, 60, 0xff008800}
    };

    /**
     * Gets a file from the TIFF test directory that contains floating-point
     * data.
     *
     * @param name a valid file name
     * @return a valid file reference.
     */
    private File getTiffFile(String name) {
        File tiffFolder = new File(ImagingTestConstants.TEST_IMAGE_FOLDER, "tiff");
        File alphaFolder = new File(tiffFolder, "12");
        return new File(alphaFolder, name);
    }

    @Test
    public void test() {
        for (String name : names) {
            try {
                File subject = getTiffFile(name);
                BufferedImage overlay = Imaging.getBufferedImage(subject);
                BufferedImage composite = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
                Graphics2D g2d = composite.createGraphics();
                g2d.setColor(Color.white);
                g2d.fillRect(0, 0, 101, 101);
                g2d.setColor(Color.black);
                g2d.fillRect(0, 50, 101, 51);
                g2d.drawImage(overlay, 0, 0, null);

                for (int i = 0; i < testSite.length; i++) {
                    int x = testSite[i][0];
                    int y = testSite[i][1];
                    int p = testSite[i][2];
                    int t = composite.getRGB(x, y);
                    assertEquals(t, p, "Error for " + name + " at position " + x + ", " + y);
                }
            } catch (ImageReadException | IOException ex) {
                fail("Exception reading " + name + ", " + ex.getMessage());
            }
        }
    }
}
