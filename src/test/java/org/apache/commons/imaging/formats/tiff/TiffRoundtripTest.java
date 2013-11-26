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

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.TestUtils;
import org.apache.commons.imaging.common.IImageMetadata;
import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;
import org.apache.commons.imaging.util.Debug;

public class TiffRoundtripTest extends TiffBaseTest {

    public void test() throws Exception {
        final List<File> images = getTiffImages();
        for (int i = 0; i < images.size(); i++) {
            if (i % 10 == 0) {
                TestUtils.purgeMemory();
            }

            final File imageFile = images.get(i);
            Debug.debug("imageFile", imageFile);

            final IImageMetadata metadata = Imaging.getMetadata(imageFile);
            assertNotNull(metadata);

            final ImageInfo imageInfo = Imaging.getImageInfo(imageFile);
            assertNotNull(imageInfo);

            BufferedImage image = Imaging.getBufferedImage(imageFile);
            assertNotNull(image);

            final int[] compressions = new int[] {
                    TiffConstants.TIFF_COMPRESSION_UNCOMPRESSED,
                    TiffConstants.TIFF_COMPRESSION_LZW,
                    TiffConstants.TIFF_COMPRESSION_PACKBITS
            };
            for (final int compression : compressions) {
                final File tempFile = createTempFile(imageFile.getName() + "-" + compression + ".", ".tif");
                final Map<String,Object> params = new HashMap<String,Object>();
                params.put(TiffConstants.PARAM_KEY_COMPRESSION, compression);
                Imaging.writeImage(image, tempFile, ImageFormats.TIFF,
                        params);
                final BufferedImage image2 = Imaging.getBufferedImage(tempFile);
                assertNotNull(image2);
            }
        }
    }

}
