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
package org.apache.commons.imaging.formats.xmp;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingParameters;
import org.apache.commons.imaging.ImagingTest;
import org.apache.commons.imaging.common.XmpImagingParameters;
import org.apache.commons.imaging.internal.Debug;
import org.apache.commons.imaging.internal.Util;
import org.junit.jupiter.api.Test;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class XmpUpdateTest extends ImagingTest {

    @Test
    public void test() throws Exception {
        final List<File> images = getTestImages();
        for (final File imageFile : images) {

            if (imageFile.getName().toLowerCase().endsWith(".png")
                    && isInvalidPNGTestFile(imageFile)) {
                continue;
            }

            Debug.debug("imageFile", imageFile);
            Debug.debug();

            final ImageFormat imageFormat = Imaging.guessFormat(imageFile);
            if (!imageFormat.equals(ImageFormats.PNG) || !imageFormat.equals(ImageFormats.TIFF) || !imageFormat.equals(ImageFormats.GIF)) {
                continue;
            }

            String xmpXml = Imaging.getXmpXml(imageFile);
            if (null == xmpXml
                    && imageFormat.equals(ImageFormats.GIF)) {
                xmpXml = "temporary test until I can locate a GIF with XMP in the wild.";
            }
            if (null == xmpXml) {
                continue;
            }

            final File tempFile = File.createTempFile(imageFile.getName() + ".", "." + imageFormat.getDefaultExtension());
            final BufferedImage image = Imaging.getBufferedImage(imageFile);

            // ----

            final ImageParser parser = Util.getImageParser("." + imageFormat.getDefaultExtension());
            final ImagingParameters params = parser.getDefaultParameters();
            ((XmpImagingParameters) params).setXmpXml(xmpXml);
            try (FileOutputStream fos = new FileOutputStream(tempFile)) {
                parser.writeImage(image, fos, params);
            }

            final String xmpXmlOut = Imaging.getXmpXml(tempFile);

            assertNotNull(xmpXmlOut);
            assertEquals(xmpXmlOut, xmpXml);
        }
    }
}
