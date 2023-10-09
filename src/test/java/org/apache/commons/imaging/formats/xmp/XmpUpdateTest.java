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
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.util.List;

import org.apache.commons.imaging.AbstractImageParser;
import org.apache.commons.imaging.AbstractImagingTest;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.common.XmpImagingParameters;
import org.apache.commons.imaging.internal.Debug;
import org.apache.commons.imaging.internal.ImageParserFactory;
import org.junit.jupiter.api.Test;

public class XmpUpdateTest<E extends XmpImagingParameters<E>> extends AbstractImagingTest {

    @Test
    public void test() throws Exception {
        final List<File> images = getTestImages();
        for (final File imageFile : images) {

            if (imageFile.getName().toLowerCase().endsWith(".png")
                    && isInvalidPngTestFile(imageFile)) {
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

            final File tempFile = Files.createTempFile(imageFile.getName() + ".", "." + imageFormat.getDefaultExtension()).toFile();
            final BufferedImage image = Imaging.getBufferedImage(imageFile);

            final AbstractImageParser<E> parser = ImageParserFactory.getImageParser("." + imageFormat.getDefaultExtension());
            final E params = parser.getDefaultParameters();
            params.setXmpXml(xmpXml);
            try (FileOutputStream fos = new FileOutputStream(tempFile)) {
                parser.writeImage(image, fos, params);
            }

            final String xmpXmlOut = Imaging.getXmpXml(tempFile);

            assertNotNull(xmpXmlOut);
            assertEquals(xmpXmlOut, xmpXml);
        }
    }
}
