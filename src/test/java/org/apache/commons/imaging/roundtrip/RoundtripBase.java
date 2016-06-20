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

package org.apache.commons.imaging.roundtrip;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.common.RgbBufferedImageFactory;
import org.apache.commons.imaging.util.Debug;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;

import static org.junit.Assert.assertNotNull;

public class RoundtripBase {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    protected void roundtrip(final FormatInfo formatInfo, final BufferedImage testImage,
                             final String tempPrefix, final boolean imageExact) throws IOException,
            ImageReadException, ImageWriteException {
        final File temp1 = createTempFile(tempPrefix + ".", "."
                + formatInfo.format.getExtension());
        Debug.debug("tempFile: " + temp1.getName());

        final Map<String, Object> params = new HashMap<>();
        Imaging.writeImage(testImage, temp1, formatInfo.format, params);

        final Map<String, Object> readParams = new HashMap<>();
        readParams.put(ImagingConstants.BUFFERED_IMAGE_FACTORY,
                new RgbBufferedImageFactory());
        final BufferedImage image2 = Imaging.getBufferedImage(temp1, readParams);
        assertNotNull(image2);

        if (imageExact) {
            // note tolerance when comparing grayscale images
            // BufferedImages of
            ImageAsserts.assertEquals(testImage, image2);
        }

        if (formatInfo.identicalSecondWrite) {
            final File temp2 = createTempFile(tempPrefix + ".", "."
                    + formatInfo.format.getExtension());
            // Debug.debug("tempFile: " + tempFile.getName());
            Imaging.writeImage(image2, temp2, formatInfo.format, params);

            ImageAsserts.assertEquals(temp1, temp2);
        }
    }

    protected File createTempFile(final String prefix, final String suffix)
            throws IOException {
        return File.createTempFile(prefix, suffix, folder.newFolder());
    }

}
