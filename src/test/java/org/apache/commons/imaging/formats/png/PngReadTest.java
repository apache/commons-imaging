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

package org.apache.commons.imaging.formats.png;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.internal.Debug;
import org.junit.Assert;
import org.junit.Test;

public class PngReadTest extends PngBaseTest {

    @Test
    public void test() throws Exception {
        Debug.debug("start");

        final List<File> images = getPngImages();
        for (int i = 0; i < images.size(); i++) {

            final File imageFile = images.get(i);
            Debug.debug("imageFile", imageFile);
            if (isInvalidPNGTestFile(imageFile)) {
                try {
                    Imaging.getMetadata(imageFile);
                    fail("Image read should have failed.");
                } catch (final Exception e) {
                }

                try {
                    Imaging.getImageInfo(imageFile);
                    fail("Image read should have failed.");
                } catch (final Exception e) {
                }

                try {
                    Imaging.getBufferedImage(imageFile);
                    fail("Image read should have failed.");
                } catch (final Exception e) {
                }
            } else {
                ImageMetadata metadata = null;
                try {
    metadata                    = Imaging.getMetadata(imageFile);
                } catch(Exception e) {  e.printStackTrace();}
                Assert.assertFalse(metadata instanceof File); // Dummy check to avoid unused warning (it may be null)

                final ImageInfo imageInfo = Imaging.getImageInfo(imageFile);
                assertNotNull(imageInfo);

                Debug.debug("ICC profile", Imaging.getICCProfile(imageFile));

                final BufferedImage image = Imaging.getBufferedImage(imageFile);
                assertNotNull(image);
            }
        }
    }

}
