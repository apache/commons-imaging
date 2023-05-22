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

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import org.apache.commons.imaging.FormatCompliance;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.internal.Debug;
import org.junit.jupiter.api.Test;

public class TiffReadTest extends TiffBaseTest {

    @Test
    public void test() throws Exception {
        final List<File> images = getTiffImages();
        for (final File imageFile : images) {

            Debug.debug("imageFile", imageFile);

            final ImageMetadata metadata = Imaging.getMetadata(imageFile);
            assertNotNull(metadata);

            Debug.debug("ICC profile", Imaging.getICCProfile(imageFile));

            final ImageInfo imageInfo = Imaging.getImageInfo(imageFile);
            assertNotNull(imageInfo);

            final BufferedImage image = Imaging.getBufferedImage(imageFile);
            assertNotNull(image);
        }
    }

    @Test
    public void testReadDirectories() throws Exception {
        // same as above, but test reading the TIFF directories
        final List<File> images = getTiffImages();
        for (final File imageFile : images) {
            final String name = imageFile.getName();
            // the "bad offsets" file will cause an exception to be thrown.
            // It's not relevant to what this test is trying to discover.
            // So skip it.
            if(name.toLowerCase().contains("bad")){
                continue;
            }
            final ByteSource byteSource = ByteSource.file(imageFile);
            final TiffReader tiffReader = new TiffReader(true);
            final TiffContents contents = tiffReader.readDirectories(
                byteSource,
                true,
                FormatCompliance.getDefault());
                assertNotNull(contents);
        }
    }
}

