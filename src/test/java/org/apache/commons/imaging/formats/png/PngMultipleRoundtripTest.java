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

import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.internal.Debug;
import org.apache.commons.io.FilenameUtils;
import org.junit.jupiter.api.Test;

import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PngMultipleRoundtripTest extends PngBaseTest {

    @Test
    public void test() throws Exception {
        final String imagesFolderPath = FilenameUtils.separatorsToSystem(
                "src\\test\\data\\images\\png\\3");
        final File imagesFolder = new File(imagesFolderPath);
        assertTrue(imagesFolder.exists() && imagesFolder.isDirectory());

        final File[] files = imagesFolder.listFiles();
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
                final BufferedImage image = Imaging.getBufferedImage(lastFile);
                assertNotNull(image);

                final File tempFile = Files.createTempFile(imageFile.getName() + "." + j + ".", ".png").toFile();
                Debug.debug("tempFile", tempFile);

                Imaging.writeImage(image, tempFile, ImageFormats.PNG);

                lastFile = tempFile;
            }
        }
    }

}
