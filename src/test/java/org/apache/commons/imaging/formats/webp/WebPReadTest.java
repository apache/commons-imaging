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
package org.apache.commons.imaging.formats.webp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.formats.webp.chunks.WebPChunkIccp;
import org.apache.commons.imaging.internal.Debug;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Tests that read WebP images.
 */
public class WebPReadTest extends WebPBaseTest {

    /**
     * Not implemented yet.
     *
     * @throws IOException if it failed to read the image.
     */
    @Test
    public void testBufferedImageNotSupported() throws IOException {
        File emptyWebP = new File(WebPReadTest.class.getResource("/images/webp/empty/empty-100x100.webp").getFile());
        WebPImageParser parser = new WebPImageParser();
        ImagingException exception = assertThrows(ImagingException.class, () -> {
            parser.getBufferedImage(ByteSource.file(emptyWebP), parser.getDefaultParameters());
        });
        assertTrue(exception.getMessage().contains("Reading WebP files is currently not supported"));
    }

    /**
     * Basic features of the parser.
     */
    @Test
    public void testParser() {
        WebPImageParser parser = new WebPImageParser();
        assertEquals("WebP-Custom", parser.getName());
        assertEquals("webp", parser.getDefaultExtension());
    }

    /**
     * @param imageFile parameterized test image.
     * @throws Exception if it cannot open the images.
     */
    @ParameterizedTest
    @MethodSource("images")
    public void testRead(File imageFile) throws Exception {
        Debug.debug("start");

        Debug.debug("imageFile", imageFile);

        final ImageMetadata metadata = Imaging.getMetadata(imageFile);
        Assertions.assertFalse(metadata instanceof File); // Dummy check to avoid unused warning (it may be null)

        final ImageInfo imageInfo = Imaging.getImageInfo(imageFile);
        assertNotNull(imageInfo);

        Debug.debug("ICC profile", Imaging.getIccProfileBytes(imageFile));
    }

    /**
     * Test that the given size, and the byte array length match.
     */
    @Test
    public void testWebPChunkInvalidSizeBytes() {
        ImagingException exception = assertThrows(ImagingException.class, () -> {
            new WebPChunkIccp(0, 10, new byte[]{});
        });
        assertEquals("Chunk size must match bytes length", exception.getMessage());
    }
}
