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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingTest;
import org.apache.commons.imaging.common.XmpImagingParameters;
import org.apache.commons.imaging.formats.gif.GifImagingParameters;
import org.apache.commons.imaging.formats.png.PngImagingParameters;
import org.apache.commons.imaging.formats.tiff.TiffImagingParameters;
import org.apache.commons.imaging.internal.Debug;
import org.junit.jupiter.api.Test;

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
            XmpImagingParameters params = null;
            if (imageFormat.equals(ImageFormats.PNG)) {
                params = new PngImagingParameters();
            } else if (imageFormat.equals(ImageFormats.TIFF)) {
                params = new TiffImagingParameters();
            } else if (imageFormat.equals(ImageFormats.GIF)) {
                params = new GifImagingParameters();
            } else {
                continue;
            }

            String xmpXml = Imaging.getXmpXml(imageFile, params);
            if (null == xmpXml
                    && imageFormat.equals(ImageFormats.GIF)) {
                xmpXml = "temporary test until I can locate a GIF with XMP in the wild.";
            }
            if (null == xmpXml) {
                continue;
            }

            final File tempFile = File.createTempFile(imageFile.getName() + ".", "."
                    + imageFormat.getDefaultExtension());
            final BufferedImage image = Imaging.getBufferedImage(imageFile);

            // ----

            params.setXmpXml(xmpXml);
            Imaging.writeImage(image, tempFile, imageFormat, params);

            final String xmpXmlOut = Imaging.getXmpXml(tempFile);

            assertNotNull(xmpXmlOut);
            assertEquals(xmpXmlOut, xmpXml);
        }
    }
}
