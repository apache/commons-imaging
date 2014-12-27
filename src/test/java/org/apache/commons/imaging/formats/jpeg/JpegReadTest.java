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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.common.IImageMetadata;
import org.apache.commons.imaging.util.Debug;
import org.junit.Test;

public class JpegReadTest extends JpegBaseTest {

    @Test
    public void test() throws Exception {
        final List<File> images = getJpegImages();
        for (int i = 0; i < images.size(); i++) {

            final File imageFile = images.get(i);
            Debug.debug("imageFile", imageFile.getAbsoluteFile());

            // ByteSource byteSource = new ByteSourceFile(imageFile);
            // new JpegUtils().dumpJFIF(byteSource);

            final Map<String, Object> params = new HashMap<String, Object>();
            final boolean ignoreImageData = isPhilHarveyTestImage(imageFile);
            params.put(PARAM_KEY_READ_THUMBNAILS, new Boolean(!ignoreImageData));

            final IImageMetadata metadata = Imaging.getMetadata(imageFile, params);
            // assertNotNull(metadata);
            Debug.debug("metadata", metadata);
            
            Debug.debug("ICC profile", Imaging.getICCProfile(imageFile, params));

            final ImageInfo imageInfo = Imaging.getImageInfo(imageFile, params);
            assertNotNull(imageInfo);
            
            try {
                final BufferedImage image = Imaging.getBufferedImage(imageFile, params);
                assertNotNull(image);
            } catch (final ImageReadException imageReadException) {
                assertEquals("Only sequential, baseline JPEGs are supported at the moment",
                        imageReadException.getMessage());
            }
        }
    }

}
