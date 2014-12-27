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

import static org.junit.Assert.assertEquals;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;
import org.junit.Test;

public class TiffSubImageTest extends TiffBaseTest {

    @Test
    public void testSubImage() throws ImageReadException, ImageWriteException, IOException {
        BufferedImage src = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        byte[] imageBytes = Imaging.writeImageToBytes(src, ImageFormats.TIFF, null);
        
        Map<String, Object> params = new TreeMap<String, Object>();
        params.put(TiffConstants.PARAM_KEY_SUBIMAGE_X, 0);
        params.put(TiffConstants.PARAM_KEY_SUBIMAGE_Y, 0);
        params.put(TiffConstants.PARAM_KEY_SUBIMAGE_WIDTH, 2);
        params.put(TiffConstants.PARAM_KEY_SUBIMAGE_HEIGHT, 3);
        BufferedImage image = Imaging.getBufferedImage(imageBytes, params);
        assertEquals(image.getWidth(), 2);
        assertEquals(image.getHeight(), 3);
    }
}