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

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Hashtable;
import java.util.List;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.Sanselan;
import org.apache.commons.imaging.util.Debug;

public class ConvertPngToGifTest extends PngBaseTest {



    public void test() throws Exception
    {

        List images = getPngImages();
        for (int i = 0; i < images.size(); i++) {
            if (i % 10 == 0)
                Debug.purgeMemory();

            File imageFile = (File) images.get(i);
            if (isInvalidPNGTestFile(imageFile))
                continue;
            // Debug.debug("imageFile", imageFile);
            // Debug.debug();

            Hashtable params = new Hashtable();
//            params.put(SanselanConstants.PARAM_KEY_VERBOSE, Boolean.TRUE);

            BufferedImage image = Sanselan.getBufferedImage(imageFile, params);
            assertNotNull(image);

            File outFile = createTempFile(imageFile.getName()+".", ".gif");
//            Debug.debug("outFile", outFile);

            Sanselan.writeImage(image, outFile, ImageFormat.IMAGE_FORMAT_GIF,
                    params);
        }
        Debug.debug("complete.");
    }

}
