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

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingTest;
import org.apache.commons.imaging.util.Debug;

public class XmpUpdateTest extends ImagingTest {

    public void test() throws Exception {
        final List<File> images = getTestImages();
        for (int i = 0; i < images.size(); i++) {
            if (i % 10 == 0) {
                Debug.purgeMemory();
            }

            final File imageFile = images.get(i);

            if (imageFile.getName().toLowerCase().endsWith(".png")
                    && isInvalidPNGTestFile(imageFile)) {
                continue;
            }

            Debug.debug("imageFile", imageFile);
            Debug.debug();

            final ImageFormat imageFormat = Imaging.guessFormat(imageFile);

            String xmpXml = Imaging.getXmpXml(imageFile);
            if (null == xmpXml
                    && imageFormat.equals(ImageFormats.GIF)) {
                xmpXml = "temporary test until I can locate a GIF with XMP in the wild.";
            }
            if (null == xmpXml) {
                continue;
            }

            assertNotNull(xmpXml);

            if (imageFormat.equals(ImageFormats.PNG)) { /*
                                                                     * do
                                                                     * nothing
                                                                     */
            } else if (imageFormat.equals(ImageFormats.TIFF)) { /*
                                                                             * do
                                                                             * nothing
                                                                             */
            } else if (imageFormat.equals(ImageFormats.GIF)) { /*
                                                                            * do
                                                                            * nothing
                                                                            */
            } else {
                continue;
            }

            final File tempFile = this.createTempFile(imageFile.getName() + ".", "."
                    + imageFormat.getExtension());
            final BufferedImage image = Imaging.getBufferedImage(imageFile);

            // ----

            final Map<String,Object> params = new HashMap<String,Object>();
            params.put(PARAM_KEY_XMP_XML, xmpXml);
            Imaging.writeImage(image, tempFile, imageFormat, params);

            final String xmpXmlOut = Imaging.getXmpXml(tempFile);

            assertNotNull(xmpXmlOut);

            assertEquals(xmpXmlOut, xmpXml);

            // Debug.debug("xmpXmlOut", xmpXmlOut.length());
            // Debug.debug("xmpXml", xmpXml);
            // Debug.debug();
        }
    }
}
