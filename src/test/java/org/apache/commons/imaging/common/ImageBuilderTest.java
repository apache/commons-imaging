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
package org.apache.commons.imaging.common;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.RasterFormatException;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Provides unit tests for the ImageBuilder class.
 */
public class ImageBuilderTest {


    /**
     * Test of bad dimensions in constructor
     */
    @Test
    public void testConstructorBounds() {
        executeBadConstructor(0, 10);
        executeBadConstructor(10, 0);
    }


    /**
     * Test of bad bounds in sub-image
     */
    @Test
    public void testBoundsCheck() {

        ImageBuilder imageBuilder = new ImageBuilder(100, 100, false );

        executeBadBounds(imageBuilder, -1,  0, 50, 50);
        executeBadBounds(imageBuilder,  0, -1, 50, 50);
        executeBadBounds(imageBuilder,  0,  0,  0, 50);
        executeBadBounds(imageBuilder,  0,  0, 50, 0);
        executeBadBounds(imageBuilder, 90,  0, 50, 50);
        executeBadBounds(imageBuilder,  0, 90, 50, 50);
    }

    /**
     * Test whether sub-image is consistent with source
     */
    @Test
    public void testSubimageAccess() {
        ImageBuilder imageBuilder = new ImageBuilder(100, 100, false );
        populate(imageBuilder);
        BufferedImage bImage = imageBuilder.getSubimage(25, 25, 25, 25);
        int w = bImage.getWidth();
        int h = bImage.getHeight();
        assertEquals(w, 25, "Width of subimage does not match");
        assertEquals(h, 25, "Height of subimage does not match");

        for(int x=25; x<50; x++){
            for(int y=25; y<50; y++){
                int k = bImage.getRGB(x-25, y-25);
                int rgb = imageBuilder.getRGB(x, y);
                assertEquals(k, rgb, "Invalid buffered image subpixel at "+x+", "+y);
            }
        }

        ImageBuilder testBuilder = imageBuilder.getSubset(25, 25, 25, 25);
        for(int x=25; x<50; x++){
            for(int y=25; y<50; y++){
                int k = testBuilder.getRGB(x-25, y-25);
                int rgb = imageBuilder.getRGB(x, y);
                assertEquals(k, rgb, "Invalid image builder subpixel at "+x+", "+y);
            }
        }
    }

    /**
     * Test whether color model is properly applied to buffered images
     */
    @Test
    void testImageColorModel() {
        ImageBuilder  imageBuilder;
        BufferedImage bImage;
        ColorModel    model;
        imageBuilder = new ImageBuilder(100, 100, false );
        bImage = imageBuilder.getBufferedImage();
        model = bImage.getColorModel();
        assertFalse(model.hasAlpha(), "Output image has alpha where not specified");

        imageBuilder = new ImageBuilder(100, 100, true, false);
        bImage = imageBuilder.getBufferedImage();
        model = bImage.getColorModel();
        assertTrue(model.hasAlpha(), "Output image does not have alpha where specified");
        assertFalse(model.isAlphaPremultiplied(), "Output image has alpha pre-multiplied where not specified");

        imageBuilder = new ImageBuilder(100, 100, true, true);
        bImage = imageBuilder.getBufferedImage();
        model = bImage.getColorModel();
        assertTrue(model.hasAlpha(), "Output image does not have alpha where specified");
        assertTrue(model.isAlphaPremultiplied(), "Output image does not have alpha pre-multiplied where specified");
    }

    void executeBadBounds(ImageBuilder imageBuilder, int x, int y, int w, int h){
        try{
            ImageBuilder sub = imageBuilder.getSubset(x, y, w, h);
            fail("Failed to detect bad bounds "+x+", "+y+", "+w+", "+h);
        }catch(RasterFormatException rfe){
            // success, no action required
        }
    }

    void executeBadConstructor(int w, int h){
        try{
            ImageBuilder iBuilder = new ImageBuilder(w, h, true);
            fail("Failed to detect bad constructor "+w+", "+h);
        }catch(RasterFormatException rfe){
            // success, no action required
        }
    }


    void populate(ImageBuilder imageBuilder){
        for(int x=0; x<100; x++){
            for(int y=0; y<100; y++){
                int k = y*100+x;
                int rgb = 0xff000000|k;
                imageBuilder.setRGB(x, y, rgb);
            }
        }
    }



}
