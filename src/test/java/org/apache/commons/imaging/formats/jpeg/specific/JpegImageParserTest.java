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
import org.apache.commons.imaging.ImagingTestConstants;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.formats.jpeg.JpegImageParser;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Basic tests for JpegImageParser.
 */
public final class JpegImageParserTest {
    /**
     * Image created with The Gimp 2.8
     * @throws ImageReadException
     * @throws IOException 
     */
    @Test
    public void testGetBufferedImage01() throws ImageReadException, IOException {
        final File imageFile = new File(ImagingTestConstants.TEST_SPECIFIC_FOLDER, "jpg/3/rgb.jpg");
        final JpegImageParser parser = new JpegImageParser();
        final BufferedImage image = parser.getBufferedImage(new ByteSourceFile(imageFile), null);
        assertEquals(2, image.getWidth());
        assertEquals(3, image.getHeight());
        
        assertEquals(-131072, image.getRGB(0, 0));
        assertEquals(-1, image.getRGB(1, 0));
        
        assertEquals(-1, image.getRGB(0, 1));
        assertEquals(-16712447, image.getRGB(1, 1));
        
        assertEquals(-16711426, image.getRGB(0, 2));
        // This pixel is expected to be white but isn't. Checked it with KolourPaint 4.13.1:
        // Other white pixel: hue=0°, saturation=0, value=255; red=255, green=255, blue=255, alpha=255; html=#FFFFFF
        // This pixel      : hue=60°, saturation=2, value=255; red=255, green=255, blue=253, alpha=255; html=#FFFFFD
        // => So it is true: This pixel is not exactly white!
        assertEquals(-65794, image.getRGB(1, 2));
    }
    
    /**
     * Image created with Sony Cybershot DSC-P93 (of 2004)
     * @throws ImageReadException
     * @throws IOException 
     */
    @Test
    public void testGetBufferedImage02() throws ImageReadException, IOException {
        final File imageFile = new File(ImagingTestConstants.TEST_SPECIFIC_FOLDER, "jpg/4/DSC00727.JPG");
        final JpegImageParser parser = new JpegImageParser();
        final BufferedImage image = parser.getBufferedImage(new ByteSourceFile(imageFile), null);
        assertEquals(2592, image.getWidth());
        assertEquals(1944, image.getHeight());
        // check at least the pixels on all 4 edges to prove
        // top left
        assertEquals(-8549975, image.getRGB(0, 0));
        // top right
        assertEquals(-5786659, image.getRGB(2591, 0));
        // bottom left
        assertEquals(-10131574, image.getRGB(0, 1943));
        // bottom right
        assertEquals(-5785121, image.getRGB(2591, 1943));
    }
    
    /**
     * Image created with Panasonic Camcorder HDC-HS700 (of 2010)
     * @throws ImageReadException
     * @throws IOException 
     */
    @Test
    public void testGetBufferedImage03() throws ImageReadException, IOException {
        final File imageFile = new File(ImagingTestConstants.TEST_SPECIFIC_FOLDER, "jpg/5/H1060001.JPG");
        final JpegImageParser parser = new JpegImageParser();
        final BufferedImage image = parser.getBufferedImage(new ByteSourceFile(imageFile), null);
        assertEquals(4608, image.getWidth());
        assertEquals(3072, image.getHeight());
        // check at least the pixels on all 4 edges to prove
        // top left
        assertEquals(-3876633, image.getRGB(0, 0));
        // top right
        assertEquals(-11431763, image.getRGB(4607, 0));
        // bottom left
        assertEquals(-11845846, image.getRGB(0, 3071));
        // bottom right
        assertEquals(-13094884, image.getRGB(4607, 3071));
    }
}