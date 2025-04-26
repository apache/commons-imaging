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
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;

import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii;
import org.junit.jupiter.api.Test;

/**
 * Tests for the WebP metadata.
 */
public class WebPMetadataTest extends AbstractWebPTest {

    /**
     * @throws Exception if it cannot open the images.
     */
    @Test
    public void testReadAlpha() throws Exception {
        final File imageFile = new File(WebPMetadataTest.class.getResource("/images/webp/alpha/alpha.webp").getFile());
        final WebPImageParser parser = new WebPImageParser();
        final ImageInfo imageInfo = parser.getImageInfo(ByteSource.file(imageFile), parser.getDefaultParameters());
        assertNotNull(imageInfo);
    }

    /**
     * @throws Exception if it cannot open the images.
     */
    @Test
    public void testReadMetadata() throws Exception {
        final File imageFile = new File(WebPMetadataTest.class.getResource("/images/webp/exif/_DSC6099.webp").getFile());
        final WebPImageParser parser = new WebPImageParser();
        final WebPImageMetadata metadata = parser.getMetadata(ByteSource.file(imageFile), parser.getDefaultParameters());
        assertEquals(56, metadata.getItems().size());

        final TiffImageMetadata tiffImageMetadata = metadata.getExif();
        assertNotNull(tiffImageMetadata);

        // Finds by the tag number.
        final TagInfo make = new TagInfoAscii("", 271, 0, null);
        final Object field = tiffImageMetadata.getFieldValue(make);
        assertEquals("sony", field.toString().trim().toLowerCase());
    }

    /**
     * @throws Exception if it cannot open the images.
     */
    @Test
    public void testReadXmp() throws Exception {
        final File imageFile = new File(WebPMetadataTest.class.getResource("/images/webp/xmp/test.webp").getFile());
        final WebPImageParser parser = new WebPImageParser();

        final String xml = parser.getXmpXml(ByteSource.file(imageFile), parser.getDefaultParameters());
        assertTrue(xml.contains("Apache License"));
    }
}
