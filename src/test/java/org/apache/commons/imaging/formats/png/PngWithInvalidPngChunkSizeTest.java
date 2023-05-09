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

import java.io.File;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.examples.ImageReadExample.ManagedImageBufferedImageFactory;
import org.apache.commons.imaging.formats.jpeg.JpegWithInvalidDhtSegmentTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests for PNG files with invalid chunk sizes.
 */
public class PngWithInvalidPngChunkSizeTest {

    /**
     * Test that an image with an invalid PNG chunk size causes an
     * ImageReadException instead of other exception types.
     */
    @Test
    public void testPngWithInvalidPngChunkSize() {
        final File imageFile = new File(JpegWithInvalidDhtSegmentTest.class.getResource("/IMAGING-211/testfile_2.png").getFile());
        final PngImagingParameters params = new PngImagingParameters();
        params.setBufferedImageFactory(new ManagedImageBufferedImageFactory());
        final PngImageParser jpegImageParser = new PngImageParser();
        Assertions.assertThrows(ImageReadException.class, () -> jpegImageParser.getBufferedImage(imageFile, params));
    }

    /**
     * Test that an image with an invalid negative PNG chunk size causes an
     * ImageReadException instead of other exception types.
     */
    @Test
    public void testPngWithInvalidNegativePngChunkSize() {
        final File imageFile = new File(
                JpegWithInvalidDhtSegmentTest.class.getResource("/IMAGING-210/testfile.png").getFile());
        final PngImagingParameters params = new PngImagingParameters();
        params.setBufferedImageFactory(new ManagedImageBufferedImageFactory());
        final PngImageParser jpegImageParser = new PngImageParser();
        Assertions.assertThrows(ImageReadException.class, () -> jpegImageParser.getBufferedImage(imageFile, params));
    }
}
