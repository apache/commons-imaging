/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.imaging.formats.png;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Files;
import java.util.List;

import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.internal.Debug;
import org.junit.jupiter.api.Test;

class ConvertPngToGifTest extends AbstractPngTest {

    @Test
    void test() throws Exception {

        final List<File> images = getPngImages();
        for (final File imageFile : images) {

            if (isInvalidPngTestFile(imageFile)) {
                continue;
            }

            final BufferedImage image = Imaging.getBufferedImage(imageFile);
            assertNotNull(image);

            final File outFile = Files.createTempFile(imageFile.getName() + ".", ".gif").toFile();

            Imaging.writeImage(image, outFile, ImageFormats.GIF);
        }
        Debug.debug("complete.");
    }

}
