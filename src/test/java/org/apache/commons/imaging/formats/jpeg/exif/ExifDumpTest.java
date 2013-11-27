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

package org.apache.commons.imaging.formats.jpeg.exif;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.TestUtils;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.formats.jpeg.JpegImageMetadata;
import org.apache.commons.imaging.formats.jpeg.JpegUtils;
import org.apache.commons.imaging.util.Debug;

public class ExifDumpTest extends ExifBaseTest {
    // public ExifDumpTest(String name)
    // {
    // super(name);
    // }

    public void test() throws Exception {
        final List<File> images = getImagesWithExifData();
        for (int i = 0; i < images.size(); i++) {
            if (i % 10 == 0) {
                TestUtils.purgeMemory();
            }

            final File imageFile = images.get(i);
            Debug.debug("imageFile", imageFile);
            Debug.debug();

            final ByteSource byteSource = new ByteSourceFile(imageFile);
            Debug.debug("Segments:");
            new JpegUtils().dumpJFIF(byteSource);

            final Map<String, Object> params = new HashMap<String, Object>();
            final boolean ignoreImageData = isPhilHarveyTestImage(imageFile);
            params.put(PARAM_KEY_READ_THUMBNAILS, new Boolean(!ignoreImageData));

            final JpegImageMetadata metadata = (JpegImageMetadata) Imaging
                    .getMetadata(imageFile, params);
            if (null == metadata)
             {
                continue;
            // assertNotNull(metadata.getExif());
            }

            metadata.dump();
        }
    }

}
