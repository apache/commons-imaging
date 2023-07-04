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

import static org.junit.jupiter.api.Assertions.assertEquals;
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
import org.apache.commons.imaging.common.GenericImageMetadata;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.internal.Debug;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PngReadTest extends PngBaseTest {

    @Test
    public void test() throws Exception {
        Debug.debug("start");

        final List<File> images = getPngImages();
        for (final File imageFile : images) {

            Debug.debug("imageFile", imageFile);
            if (isInvalidPngTestFile(imageFile)) {
                assertThrows(
                    Exception.class,
                    () -> Imaging.getMetadata(imageFile),
                    "Image read should have failed."
                );

                assertThrows(
                        Exception.class,
                        () -> Imaging.getImageInfo(imageFile),
                        "Image read should have failed."
                );

                assertThrows(
                        Exception.class,
                        () -> Imaging.getBufferedImage(imageFile),
                        "Image read should have failed."
                );
            } else {
                final ImageMetadata metadata = Imaging.getMetadata(imageFile);
                Assertions.assertFalse(metadata instanceof File); // Dummy check to avoid unused warning (it may be null)

                final ImageInfo imageInfo = Imaging.getImageInfo(imageFile);
                assertNotNull(imageInfo);

                Debug.debug("ICC profile", Imaging.getIccProfile(imageFile));

                final BufferedImage image = Imaging.getBufferedImage(imageFile);
                assertNotNull(image);
            }
        }
    }

    /**
     * Test reading metadata from PNG file with UTF-8 characters in the text chunks.
     *
     * @see <a href="https://issues.apache.org/jira/browse/IMAGING-342">IMAGING-342</a>
     * @throws IOException if it fails to read the test image
     * @throws ImagingException if it fails to read the test image
     */
    @Test
    public void testReadMetadataFromItxtChunk() throws IOException, ImagingException {
        final String input = "/images/png/IMAGING-342/utf8-comment.png";
        final String file = PngReadTest.class.getResource(input).getFile();
        final PngImageParser parser = new PngImageParser();

        final ImageMetadata metadata = parser.getMetadata(new File(file));
        final List<?> items = metadata.getItems();
        assertEquals(1, items.size());

        final GenericImageMetadata.GenericImageMetadataItem item = ((GenericImageMetadata.GenericImageMetadataItem) items.get(0));
        assertEquals("Comment", item.getKeyword());
        assertEquals("\u2192 UTF-8 Test", item.getText());
    }

    /**
     * If the PNG image data contains an invalid ICC Profile, previous versions would
     * simply rethrow the IAE. This test verifies we are instead raising the documented
     * {@literal ImageReadException}.
     *
     * <p>See Google OSS Fuzz issue 33691</p>
     *
     * @throws IOException if it fails to read the test image
     */
    @Test
    public void testUncaughtExceptionOssFuzz33691() throws IOException {
        final String input = "/images/png/oss-fuzz-33691/clusterfuzz-testcase-minimized-ImagingPngFuzzer-6177282101215232";
        final String file = PngReadTest.class.getResource(input).getFile();
        final PngImageParser parser = new PngImageParser();
        assertThrows(ImagingException.class, () -> parser.getBufferedImage(ByteSource.file(new File(file)), new PngImagingParameters()));
    }

    /**
     * Test that a PNG image using indexed color type but no PLTE chunks
     * does not throw a {@code NullPointerException}.
     *
     * <p>See Google OSS Fuzz issue 37607</p>
     *
     * @throws IOException if it fails to read the test image
     */
    @Test
    public void testUncaughtExceptionOssFuzz37607() throws IOException {
        final String input = "/images/png/IMAGING-317/clusterfuzz-testcase-minimized-ImagingPngFuzzer-6242400830357504";
        final String file = PngReadTest.class.getResource(input).getFile();
        final PngImageParser parser = new PngImageParser();
        assertThrows(ImagingException.class, () -> parser.getBufferedImage(ByteSource.file(new File(file)), new PngImagingParameters()));
    }
}
