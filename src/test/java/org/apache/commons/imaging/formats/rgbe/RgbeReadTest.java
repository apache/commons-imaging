/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.imaging.formats.rgbe;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.internal.Debug;
import org.apache.commons.imaging.test.TestResources;
import org.junit.jupiter.api.Test;

public class RgbeReadTest extends AbstractRgbeTest {

    @Test
    public void test() throws IOException, ImagingException {
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
     */
    @Test
    public void testErrorDecompressingInvalidFile() {
        // From IMAGING-219
        final File inputFile = TestResources.resourceToFile("/IMAGING-219/timeout-9713502c9c371f1654b493650c16ab17c0444369.hdr");
        final ByteSource byteSourceFile = ByteSource.file(inputFile);
        final RgbeImagingParameters params = new RgbeImagingParameters();
        assertThrows(ImagingException.class, () -> new RgbeImageParser().getBufferedImage(byteSourceFile, params));
    }
}
