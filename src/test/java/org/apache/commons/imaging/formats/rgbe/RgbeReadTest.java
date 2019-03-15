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
package org.apache.commons.imaging.formats.rgbe;

import static org.junit.Assert.assertNotNull;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.internal.Debug;
import org.junit.Test;

public class RgbeReadTest extends RgbeBaseTest {

    @Test
    public void test() throws IOException, ImageReadException {
        Debug.debug("start");

        final List<File> images = getRgbeImages();

        for (final File imageFile : images) {

            Debug.debug("imageFile", imageFile);

            final ImageMetadata metadata = Imaging.getMetadata(imageFile);
            assertNotNull(metadata);

            final ImageInfo imageInfo = Imaging.getImageInfo(imageFile);
            assertNotNull(imageInfo);

            final BufferedImage image = Imaging.getBufferedImage(imageFile);
            assertNotNull(image);
        }
    }

    /**
     * Test that a bad file does not gets the RgbeImageParser stuck reading it.
     *
     * @throws ImageReadException
     * @throws IOException
     */
    @Test(expected = ImageReadException.class, timeout = 2000)
    public void testErrorDecompressingInvalidFile() throws ImageReadException, IOException {
        // From IMAGING-219
        File inputFile = new File(
                RgbeReadTest.class.getResource("/IMAGING-219/timeout-9713502c9c371f1654b493650c16ab17c0444369")
                        .getFile());
        ByteSourceFile byteSourceFile = new ByteSourceFile(inputFile);
        Map<String, Object> params = Collections.<String, Object>emptyMap();
        new RgbeImageParser().getBufferedImage(byteSourceFile, params);
    }
}
