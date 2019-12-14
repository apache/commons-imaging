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

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.internal.Debug;
import org.apache.commons.io.FilenameUtils;
import org.junit.jupiter.api.Test;

public class PngMultipleRoundtripTest extends PngBaseTest {

    @Test
    public void test() throws Exception {
        final String imagesFolderPath = FilenameUtils.separatorsToSystem(
                "src\\test\\data\\images\\png\\3");
        final File imagesFolder = new File(imagesFolderPath);
        assertTrue(imagesFolder.exists() && imagesFolder.isDirectory());

        final File files[] = imagesFolder.listFiles();
        for (final File file : files) {
            final File imageFile = file;
            if (!imageFile.isFile()) {
                continue;
            }
            if (!imageFile.getName().toLowerCase().endsWith(".png")) {
                continue;
            }

            Debug.debug();
            Debug.debug("imageFile", imageFile);

            File lastFile = imageFile;
            for (int j = 0; j < 10; j++) {
                final Map<String, Object> readParams = new HashMap<>();
                // readParams.put(ImagingConstants.BUFFERED_IMAGE_FACTORY,
                // new RgbBufferedImageFactory());
                final BufferedImage image = Imaging.getBufferedImage(lastFile,
                        readParams);
                assertNotNull(image);

                final File tempFile = File.createTempFile(imageFile.getName() + "." + j
                        + ".", ".png");
                Debug.debug("tempFile", tempFile);

                final Map<String, Object> writeParams = new HashMap<>();
                Imaging.writeImage(image, tempFile,
                        ImageFormats.PNG, writeParams);

                lastFile = tempFile;
            }
        }
    }

}
