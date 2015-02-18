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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingConstants;
import org.junit.Ignore;
import org.junit.Test;

/**
 * This test class contains tests specific for reading an image with
 * negative and positive height.
 */
public class BmpReadHeightTest extends BmpBaseTest {
    /**
     * Get image info for a bmp with negative height.
     * Expected result: Even if the height of bitmap a negative number all
     * information about the size of the image are positive numbers.
     * @throws ImageReadException
     * @throws IOException 
     */
    @Test
    public void testImageInfoNegativeHeight() throws ImageReadException, IOException {
        // set to true to print image data to STDOUT
        final boolean debugMode = false;
        final File imageFile = new File(TEST_SPECIFIC_FOLDER, "bmp/1/monochrome-negative-height.bmp");
        final Map<String, Object> params = new HashMap<String, Object>();
        if (debugMode) params.put(ImagingConstants.PARAM_KEY_VERBOSE, true);
        final ImageInfo imageInfo = Imaging.getImageInfo(imageFile, params);
        
        assertNotNull(imageInfo);
        assertEquals(8, imageInfo.getHeight());
        assertEquals(72, imageInfo.getPhysicalHeightDpi());
        assertEquals(0.11111111f, imageInfo.getPhysicalHeightInch(), 0.1f);
    }
    
    /**
     * Get image info for a bmp with positive height.
     * Expected result: All information about the size of the image are positive numbers.
     * @throws ImageReadException
     * @throws IOException 
     */
    @Test
    public void testImageInfoPositiveHeight() throws ImageReadException, IOException {
        // set to true to print image data to STDOUT
        final boolean debugMode = false;
        final File imageFile = new File(TEST_SPECIFIC_FOLDER, "bmp/1/monochrome-positive-height.bmp");
        final Map<String, Object> params = new HashMap<String, Object>();
        if (debugMode) params.put(ImagingConstants.PARAM_KEY_VERBOSE, true);
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
     * Expected: The test image has white pixels in each corner except bottom left (there is a black one).
     * @throws ImageReadException
     * @throws IOException 
     */
    @Ignore(value = "Reading bitmaps with negative height has to be implemented before one can execute this test successfully.")
    @Test
    public void testBufferedImageNegativeHeight() throws Exception {
        // set to true to print image data to STDOUT
        final boolean debugMode = false;
        final File imageFile = new File(TEST_SPECIFIC_FOLDER, "bmp/1/monochrome-negative-height.bmp");
        final BufferedImage bufImage = Imaging.getBufferedImage(imageFile);
        
        if (debugMode) debugBufferedImageAsTable(bufImage, "negative height");
        assertEquals(8, bufImage.getHeight());
        assertEquals(4, bufImage.getWidth());
        // the image is monochrome and has 4 black pixels, the remaning pixel are white
        // the black pixels a placed such that we can make sure the picture is read as expected
        // -16777216 => -2^24 => black (4 pixels); -1 => white (other pixels)
        // top left - white
        assertEquals(-1, bufImage.getRGB(0, 0));
        // top right - white
        assertEquals(-1, bufImage.getRGB(3, 0));
        // bottom left - black
        assertEquals(-16777216, bufImage.getRGB(0, 7));
        // bottom right - white
        assertEquals(-1, bufImage.getRGB(3, 7));
        //other black pixels - just for fun
        assertEquals(-16777216, bufImage.getRGB(1, 6));
        assertEquals(-16777216, bufImage.getRGB(2, 5));
        assertEquals(-16777216, bufImage.getRGB(3, 4));
    }
    
    /**
     * Get a buffered image for a bmp with positive height.
     * Expected: The test image has white pixels in each corner except bottom left (there is a black one).
     * This test is to prove that changes to enable reading bmp images with negative height doesn't break
     * the ability to read bmp images with positive height.
     * @throws ImageReadException
     * @throws IOException 
     */
    @Test
    public void testBufferedImagePositiveHeight() throws Exception {
        // set to true to print image data to STDOUT
        final boolean debugMode = false;
        final File imageFile = new File(TEST_SPECIFIC_FOLDER, "bmp/1/monochrome-positive-height.bmp");
        final BufferedImage bufImage = Imaging.getBufferedImage(imageFile);
        
        if (debugMode) debugBufferedImageAsTable(bufImage, "positive height");
        assertEquals(8, bufImage.getHeight());
        assertEquals(4, bufImage.getWidth());
        // the image is monochrome and has 4 black pixels, the remaning pixel are white
        // the black pixels a placed such that we can make sure the picture is read as expected
        // -16777216 => -2^24 => black (4 pixels); -1 => white (other pixels)
        // top left - white
        assertEquals(-1, bufImage.getRGB(0, 0));
        // top right - white
        assertEquals(-1, bufImage.getRGB(3, 0));
        // bottom left - black
        assertEquals(-16777216, bufImage.getRGB(0, 7));
        // bottom right - white
        assertEquals(-1, bufImage.getRGB(3, 7));
        //other black pixels - just for fun
        assertEquals(-16777216, bufImage.getRGB(1, 6));
        assertEquals(-16777216, bufImage.getRGB(2, 5));
        assertEquals(-16777216, bufImage.getRGB(3, 4));
    }
    
    /**
     * Returns a table which contains the RGB colors of the given image.
     * @param bufImage
     * @return 
     */
    private List<List<Integer>> getBufferedImageAsTable(final BufferedImage bufImage) {
        final int height = bufImage.getHeight(); // y
        final int width = bufImage.getWidth(); // x
        final List<List<Integer>> table = new ArrayList<List<Integer>>();
        
        for (int y = 0; y < height; y++) {
            final List<Integer> row = new ArrayList<Integer>();
            for(int x = 0; x < width; x++) {
                row.add(bufImage.getRGB(x, y));
            } 
            table.add(row);
        }
        return table;
    }
    /**
     * Prints the RGB colors of the given image as table with x, y = 0, 0 on top left.
     * @param bufImage 
     */
    private void debugBufferedImageAsTable(final BufferedImage bufImage, final String comment) {
        System.out.println();
        System.out.println(comment);
        List<List<Integer>> table = getBufferedImageAsTable(bufImage);
        for (List<Integer> row : table) {
            System.out.println(row);
        }
        System.out.println();
    }
}
