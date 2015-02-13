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
 * Changed 2015 by Michael Gross, mgmechanics@mgmechanics.de
 */
package org.apache.commons.imaging.formats.tiff;

import static org.junit.Assert.assertEquals;

import java.awt.image.BufferedImage;
import java.io.IOException;

import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingParametersTiff;
import org.junit.Test;

public class TiffSubImageTest extends TiffBaseTest {

    @Test
    public void testSubImage() throws ImageReadException, ImageWriteException, IOException {
        BufferedImage src = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        byte[] imageBytes = Imaging.writeImageToBytes(src, ImageFormats.TIFF, null);
        
        final ImagingParametersTiff params = new ImagingParametersTiff();
        params.setSubImageX(0);
        params.setSubImageY(0);
        params.setSubImageWidth(2);
        params.setSubImageHeight(3);
        BufferedImage image = Imaging.getBufferedImage(imageBytes, params);
        assertEquals(image.getWidth(), 2);
        assertEquals(image.getHeight(), 3);
    }
}