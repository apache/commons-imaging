/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */
package org.apache.commons.imaging.formats.xbm;

import static org.junit.Assert.assertNotNull;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.util.Debug;
import org.junit.Assert;
import org.junit.Test;

public class XbmReadTest extends XbmBaseTest {

    @Test
    public void test() throws Exception {
        Debug.debug("start");

        final List<File> images = getXbmImages();
        for (final File imageFile : images) {

            Debug.debug("imageFile", imageFile);

            final ImageMetadata metadata = Imaging.getMetadata(imageFile);
            Assert.assertFalse(metadata instanceof File); // Dummy check to avoid unused warning (it may be null)

            final Map<String, Object> params = new HashMap<>();
            final ImageInfo imageInfo = Imaging.getImageInfo(imageFile, params);
            assertNotNull(imageInfo);

            final BufferedImage image = Imaging.getBufferedImage(imageFile);
            assertNotNull(image);
        }
    }

}
