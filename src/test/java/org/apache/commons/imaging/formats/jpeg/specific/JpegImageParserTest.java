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
    public void testGetBufferedImage10() throws ImageReadException, IOException {
        final File imageFile = new File(ImagingTestConstants.TEST_SPECIFIC_FOLDER, "jpg/10/1402522741337.jpg");
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
}