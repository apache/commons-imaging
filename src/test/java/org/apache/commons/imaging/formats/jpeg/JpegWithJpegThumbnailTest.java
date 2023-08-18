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

package org.apache.commons.imaging.formats.jpeg;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.awt.image.BufferedImage;
import java.io.File;

import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.AbstractImagingTest;
import org.apache.commons.imaging.common.ImageMetadata;
import org.junit.jupiter.api.Test;

public class JpegWithJpegThumbnailTest extends AbstractImagingTest {

    @Test
    public void testSingleImage() throws Exception {
        final File imageFile = getTestImageByName("img_F028c_small.jpg");

        final ImageMetadata metadata = Imaging.getMetadata(imageFile);
        assertNotNull(metadata);
        final JpegImageMetadata jpegMetadata = (JpegImageMetadata) metadata;
        final BufferedImage image = jpegMetadata.getExifThumbnail();
        assertNotNull(image);
    }
}
