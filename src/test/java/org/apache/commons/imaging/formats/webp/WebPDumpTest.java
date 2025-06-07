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
package org.apache.commons.imaging.formats.webp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.Dimension;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.internal.Debug;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Test the methods that dump data into streams.
 */
public class WebPDumpTest extends AbstractWebPTest {

    /**
     * @param imageFile parameterized test image.
     * @throws Exception if it cannot open the images.
     */
    @ParameterizedTest
    @MethodSource("images")
    void testDump(final File imageFile) throws Exception {
        Debug.debug("imageFile", imageFile);
        Debug.debug();

        final String xmpXml = Imaging.getXmpXml(imageFile);
        if (xmpXml != null) {
            Debug.debug("xmpXml: " + xmpXml);
            Debug.debug();
        }

        final WebPImageParser parser = new WebPImageParser();
        final WebPImagingParameters params = new WebPImagingParameters();

        final WebPImageMetadata metadata = parser.getMetadata(ByteSource.file(imageFile), parser.getDefaultParameters());
        if (metadata != null) {
            Debug.debug("Exif: " + metadata.getExif());
            Debug.debug();
        }

        final ByteSource bs = ByteSource.file(imageFile);

        final Dimension size = parser.getImageSize(bs, params);

        final StringWriter sw = new StringWriter();
        final PrintWriter pw = new PrintWriter(sw);
        parser.dumpImageFile(pw, bs);

        assertTrue(sw.toString().contains("Width: " + size.width));
    }

}
