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

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingTest;
import org.apache.commons.imaging.common.IImageMetadata;
import org.apache.commons.imaging.formats.jpeg.JpegImageMetadata;

public class JpegWithJpegThumbnailTest extends ImagingTest {

    public void testSingleImage() throws Exception {
        final File imageFile = getTestImageByName("img_F028c_small.jpg");

        final Map<String, Object> params = new HashMap<String, Object>();
        final IImageMetadata metadata = Imaging.getMetadata(imageFile, params);
        assertNotNull(metadata);
        final JpegImageMetadata jpegMetadata = (JpegImageMetadata) metadata;
        final BufferedImage image = jpegMetadata.getEXIFThumbnail();
        assertNotNull(image);
    }
}
