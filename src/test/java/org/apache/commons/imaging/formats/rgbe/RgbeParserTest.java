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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.Dimension;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.common.ImageMetadata;
import org.junit.jupiter.api.Test;

public class RgbeParserTest {

    @Test
    public void testGetIccProfileBytes() throws IOException {
        final RgbeImageParser parser = new RgbeImageParser();
        final byte[] bytes = "#?RADIANCE\n\n-Y 1 +X 1\n".getBytes(StandardCharsets.US_ASCII);
        assertNull(parser.getIccProfileBytes(ByteSource.array(bytes), new RgbeImagingParameters()));
    }

    @Test
    public void testGetImageInfo() throws IOException {
        final RgbeImageParser parser = new RgbeImageParser();
        final String header = "#?RADIANCE\nFORMAT=32-bit_rle_rgbe\n\n-Y 10 +X 20\n";
        final byte[] bytes = header.getBytes(StandardCharsets.US_ASCII);
        final ImageInfo info = parser.getImageInfo(ByteSource.array(bytes), new RgbeImagingParameters());
        assertNotNull(info);
        assertEquals(20, info.getWidth());
        assertEquals(10, info.getHeight());
        assertEquals(ImageFormats.RGBE, info.getFormat());
    }

    @Test
    public void testGetImageSize() throws IOException {
        final RgbeImageParser parser = new RgbeImageParser();
        final String header = "#?RADIANCE\n\n-Y 10 +X 20\n";
        final byte[] bytes = header.getBytes(StandardCharsets.US_ASCII);
        final Dimension size = parser.getImageSize(ByteSource.array(bytes), new RgbeImagingParameters());
        assertEquals(20, size.width);
        assertEquals(10, size.height);
    }

    @Test
    public void testGetMetadata() throws IOException {
        final RgbeImageParser parser = new RgbeImageParser();
        final String header = "#?RADIANCE\nFORMAT=32-bit_rle_rgbe\nEXPOSURE=1.0\n\n-Y 1 +X 1\n";
        final byte[] bytes = header.getBytes(StandardCharsets.US_ASCII);
        final ImageMetadata metadata = parser.getMetadata(ByteSource.array(bytes), new RgbeImagingParameters());
        assertNotNull(metadata);
        assertEquals(2, metadata.getItems().size());
    }

    @Test
    public void testInvalidHeader() {
        final RgbeImageParser parser = new RgbeImageParser();
        final byte[] bytes = "INVALID".getBytes(StandardCharsets.US_ASCII);
        assertThrows(ImagingException.class, () -> parser.getImageSize(ByteSource.array(bytes), new RgbeImagingParameters()));
    }

    @Test
    public void testInvalidResolutionString() {
        final RgbeImageParser parser = new RgbeImageParser();
        final String header = "#?RADIANCE\n\nINVALID_RESOLUTION\n";
        final byte[] bytes = header.getBytes(StandardCharsets.US_ASCII);
        assertThrows(ImagingException.class, () -> parser.getImageSize(ByteSource.array(bytes), new RgbeImagingParameters()));
    }

    @Test
    public void testRgbeImageParserBasics() {
        final RgbeImageParser parser = new RgbeImageParser();
        assertEquals("Radiance HDR", parser.getName());
        assertEquals("hdr", parser.getDefaultExtension());
        final String[] extensions = parser.getAcceptedExtensions();
        assertTrue(extensions.length > 0);
        final ImageFormat[] types = parser.getAcceptedTypes();
        assertEquals(1, types.length);
        assertEquals(ImageFormats.RGBE, types[0]);
        assertNotNull(parser.getDefaultParameters());
    }

    @Test
    public void testRgbeImagingParameters() {
        final RgbeImagingParameters params = new RgbeImagingParameters();
        assertNotNull(params);
    }
}
