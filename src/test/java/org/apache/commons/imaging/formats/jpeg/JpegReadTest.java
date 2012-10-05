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
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.common.IImageMetadata;
import org.apache.commons.imaging.util.Debug;

public class JpegReadTest extends JpegBaseTest {

    public void test() throws Exception {
        List<File> images = getJpegImages();
        for (int i = 0; i < images.size(); i++) {
            if (i % 10 == 0)
                Debug.purgeMemory();

            File imageFile = images.get(i);
            Debug.debug("imageFile", imageFile.getAbsoluteFile());

            // ByteSource byteSource = new ByteSourceFile(imageFile);
            // new JpegUtils().dumpJFIF(byteSource);

            Map<String,Object> params = new HashMap<String,Object>();
            boolean ignoreImageData = isPhilHarveyTestImage(imageFile);
            params.put(PARAM_KEY_READ_THUMBNAILS, new Boolean(!ignoreImageData));

            IImageMetadata metadata = Imaging.getMetadata(imageFile, params);
            // assertNotNull(metadata);
            Debug.debug("metadata", metadata);
            
            Debug.debug("ICC profile", Imaging.getICCProfile(imageFile, params));

            ImageInfo imageInfo = Imaging.getImageInfo(imageFile, params);
            assertNotNull(imageInfo);
            
            try {
                BufferedImage image = Imaging.getBufferedImage(imageFile, params);
                assertNotNull(image);
            } catch (ImageReadException imageReadException) {
                assertEquals("Only sequential, baseline JPEGs are supported at the moment",
                        imageReadException.getMessage());
            }
        }
    }

}
