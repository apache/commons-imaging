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
 *
 * Added 2015 by Michael Gross, mgmechanics@mgmechanics.de
 * Changed 2015 by Michael Gross, mgmechanics@mgmechanics.de
 */

package org.apache.commons.imaging.formats.bmp.specific;

import org.apache.commons.imaging.formats.bmp.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingConstants;
import org.junit.Ignore;
import org.junit.Test;

/**
 * This test class contains some specific tests i.e. reading an image with negative height.
 */
public class BmpReadSpecificTest extends BmpBaseTest {
    /**
     * Get image info for a bmp with negative height.
     * Expected result: Even if the height of bitmap a negative number all information about
     * the size of the image shall be positive. The original negative height shall be used only
     * to get the image data.
     * @throws ImageReadException
     * @throws IOException 
     */
    @Test
    public void testImageInfoNegativeHeight() throws ImageReadException, IOException {
        final File imageFile = new File(TEST_SPECIFIC_FOLDER, "bmp/1/monochrome-negative-height.bmp");
        
        final Map<String, Object> params = new HashMap<String, Object>();
        params.put(ImagingConstants.PARAM_KEY_VERBOSE, false);
        
        final ImageInfo imageInfo = Imaging.getImageInfo(imageFile, params);
        assertNotNull(imageInfo);
        assertEquals(8, imageInfo.getHeight());
        assertEquals(72, imageInfo.getPhysicalHeightDpi());
        assertEquals(0.11111111f, imageInfo.getPhysicalHeightInch(), 0.1f);
    }
    
    /**
     * Get a buffered image for a bmp with negative height.
     * 
     * THIS TESTS THE HOTFIX EMPLOYED UNTIL READING BITMAPS WITH NEGATIVE HEIGTH IS IMPLEMENTED.
     * 
     * @throws ImageReadException
     * @throws IOException 
     */
    @Test(expected=ImageReadException.class)
    public void testBufferedImageNegativeHeightException() throws Exception {
        final File imageFile = new File(TEST_SPECIFIC_FOLDER, "bmp/1/monochrome-negative-height.bmp");
        Imaging.getBufferedImage(imageFile);
    }
    
    /**
     * Get a buffered image for a bmp with negative height.
     * Expected: The test image has white pixels in each corner except bottom left
     * (there is a black one).
     * @throws ImageReadException
     * @throws IOException 
     */
    @Ignore(value = "Reading bitmaps with negative height has to be implemented before one can execute this test successfully.")
    @Test//(expected=ImageReadException.class)
    public void testBufferedImageNegativeHeight() throws Exception {
        final File imageFile = new File(TEST_SPECIFIC_FOLDER, "bmp/1/monochrome-negative-height.bmp");
        final BufferedImage bufImage = Imaging.getBufferedImage(imageFile);
        assertEquals(8, bufImage.getHeight());
        assertEquals(4, bufImage.getWidth());
        // the image is monochrome and has 4 black pixels, the remaning pixel are white
        // the black pixels a placed such that we can make sure the picture is read
        // as expected
        // top left - white
        assertEquals(1, bufImage.getRGB(0, 0));
        // top right - white
        assertEquals(1, bufImage.getRGB(3, 0));
        // bottom left - black
        assertEquals(0, bufImage.getRGB(0, 7));
        // bottom right - white
        assertEquals(1, bufImage.getRGB(3, 7));
    }
}
