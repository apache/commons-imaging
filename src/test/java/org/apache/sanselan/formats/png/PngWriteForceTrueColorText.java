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

package org.apache.sanselan.formats.png;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.sanselan.ImageFormat;
import org.apache.sanselan.Sanselan;
import org.apache.sanselan.util.Debug;

public class PngWriteForceTrueColorText extends PngBaseTest {

    public void test() throws Exception {

        List images = getPngImages();
        for (int i = 0; i < images.size(); i++) {
            if (i % 10 == 0)
                Debug.purgeMemory();

            File imageFile = (File) images.get(i);
            try {
                if (isInvalidPNGTestFile(imageFile))
                    continue;

                Debug.debug("imageFile", imageFile);
                // Debug.debug();

                // params.put(SanselanConstants.PARAM_KEY_VERBOSE,
                // Boolean.TRUE);

                BufferedImage image = Sanselan.getBufferedImage(imageFile,
                        new HashMap());
                assertNotNull(image);

                File outFile = createTempFile(imageFile.getName() + ".", ".gif");
                // Debug.debug("outFile", outFile);

                Map params = new HashMap();
                params.put(PngConstants.PARAM_KEY_PNG_FORCE_TRUE_COLOR,
                        Boolean.TRUE);
                Sanselan.writeImage(image, outFile,
                        ImageFormat.IMAGE_FORMAT_PNG, params);

                BufferedImage image2 = Sanselan.getBufferedImage(outFile,
                        new HashMap());
            } catch (Exception e) {
                Debug.debug("imageFile", imageFile);
                throw e;
            }
        }
        Debug.debug("complete.");
    }

}
