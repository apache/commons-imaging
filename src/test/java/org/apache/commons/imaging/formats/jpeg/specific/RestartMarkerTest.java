/*
 * Copyright 2015 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.imaging.formats.jpeg.specific;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingTestConstants;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests for image files with restart marker.
 */
public final class RestartMarkerTest {
    /**
     * Assert that image files with restart marker can be read.
     * @throws org.apache.commons.imaging.ImageReadException
     * @throws java.io.IOException
     */
    @Test
    public void testGetBufferedImageRst01() throws ImageReadException, IOException {
        final File imageFile = new File (ImagingTestConstants.TEST_SPECIFIC_FOLDER, "jpg/1/image.jpeg");
        final BufferedImage image = Imaging.getBufferedImage(imageFile);
        assertEquals(508, image.getWidth());
        assertEquals(349, image.getHeight());
        // check at least the pixels on all 4 edges to prove
        // top left
        assertEquals(-1, image.getRGB(0, 0));
        // top right
        assertEquals(-1, image.getRGB(507, 0));
        // bottom left
        assertEquals(-1, image.getRGB(0, 348));
        // bottom right
        assertEquals(-1, image.getRGB(507, 348));
        // some pixels where rgb != -1
        assertEquals(-197380, image.getRGB(120, 9));
        assertEquals(-8553091, image.getRGB(135, 7));
    }
    
    /**
     * Assert that image files with restart marker can be read.
     * @throws org.apache.commons.imaging.ImageReadException
     * @throws java.io.IOException
     */
    @Test
    public void testGetBufferedImageRst02() throws ImageReadException, IOException {
        final File imageFile = new File (ImagingTestConstants.TEST_SPECIFIC_FOLDER, "jpg/2/_DSC6099.jpg");
        final BufferedImage image = Imaging.getBufferedImage(imageFile);
        assertEquals(400, image.getWidth());
        assertEquals(600, image.getHeight());
        // check at least the pixels on all 4 edges to prove
        // top left
        assertEquals(-13882324, image.getRGB(0, 0));
        // top right
        assertEquals(-6052957, image.getRGB(399, 0));
        // bottom left
        assertEquals(-1, image.getRGB(0, 599));
        // bottom right
        assertEquals(-1, image.getRGB(399, 599));
    }
}