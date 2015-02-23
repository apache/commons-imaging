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

import static org.junit.Assert.assertNotNull;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingParameters;
import org.apache.commons.imaging.ImagingParametersPng;
import org.apache.commons.imaging.util.Debug;
import org.junit.Test;

public class PngWriteForceTrueColorText extends PngBaseTest {

    @Test
    public void test() throws Exception {

        final List<File> images = getPngImages();
        for (final File imageFile : images) {

            try {
                if (isInvalidPNGTestFile(imageFile)) {
                    continue;
                }

                Debug.debug("imageFile", imageFile);
                // Debug.debug();

                // params.put(ImagingConstants.PARAM_KEY_VERBOSE,
                // Boolean.TRUE);

                final BufferedImage image = Imaging.getBufferedImage(imageFile, new ImagingParameters());
                assertNotNull(image);

                final File outFile = createTempFile(imageFile.getName() + ".", ".gif");
                // Debug.debug("outFile", outFile);

                final ImagingParametersPng params = new ImagingParametersPng();
                params.enableForceTrueColor();
                Imaging.writeImage(image, outFile, ImageFormats.PNG, params);

                final BufferedImage image2 = Imaging.getBufferedImage(outFile, new ImagingParameters());
                assertNotNull(image2);
            } catch (final Exception e) {
                Debug.debug("imageFile", imageFile);
                throw e;
            }
        }
        Debug.debug("complete.");
    }

}
