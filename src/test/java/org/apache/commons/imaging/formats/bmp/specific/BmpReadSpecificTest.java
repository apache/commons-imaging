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

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.Imaging;
import org.junit.Test;

/**
 * This test class contains some specific tests i.e. reading an image with negative height.
 */
public class BmpReadSpecificTest extends BmpBaseTest {
    /**
     * Get image info for a bmp with negative height
     * @throws ImageReadException
     * @throws IOException 
     */
    @Test
    public void testImageInfoNegativeHeight() throws ImageReadException, IOException {
        final File imageFile = new File(TEST_SPECIFIC_FOLDER, "bmp/1/monochrome-negative-height.bmp");
        final Map<String, Object> params = Collections.emptyMap();
        final ImageInfo imageInfo = Imaging.getImageInfo(imageFile, params);
        assertNotNull(imageInfo);
        // TODO assert more
    }
    
    /**
     * Get a buffered image for a bmp with negative height
     * @throws ImageReadException
     * @throws IOException 
     */
    @Test
    public void testBufferedImageNegativeHeight() throws Exception {
        final File imageFile = new File(TEST_SPECIFIC_FOLDER, "bmp/1/monochrome-negative-height.bmp");
        final BufferedImage image = Imaging.getBufferedImage(imageFile);
        assertNotNull(image);
        // TODO assert more
    }

}
