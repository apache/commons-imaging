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
package org.apache.commons.imaging.formats.bmp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;
import java.io.IOException;

import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.test.TestResources;
import org.junit.jupiter.api.Test;

/**
 * Tests for the {@link BmpImageParser}.
 */
public class BmpImageParserTest {

    /**
     * For https://issues.apache.org/jira/browse/IMAGING-279.
     *
     * @throws IOException
     * @throws ImagingException
     */
    @Test
    void testImageForNegativeArraySizeException() throws ImagingException, IOException {
        final File bmp = TestResources.resourceToFile("/images/bmp/IMAGING-279/negative_array_size_exception.bmp");
        final BmpImageParser parser = new BmpImageParser();
        assertThrows(IllegalArgumentException.class, () -> parser.getImageInfo(bmp, new BmpImagingParameters()));
    }

    /**
     * For https://issues.apache.org/jira/browse/IMAGING-264.
     *
     * @throws IOException
     * @throws ImagingException
     */
    @Test
    void testImageWidthRounding() throws ImagingException, IOException {
        final File bmp = TestResources.resourceToFile("/images/bmp/IMAGING-264/test-72_6-dpi.bmp");
        final BmpImageParser parser = new BmpImageParser();
        final ImageInfo imageInfo = parser.getImageInfo(bmp, new BmpImagingParameters());
        assertEquals(73, imageInfo.getPhysicalWidthDpi(), "Expected 72.6 resolution to be rounded to 73");
    }
}
