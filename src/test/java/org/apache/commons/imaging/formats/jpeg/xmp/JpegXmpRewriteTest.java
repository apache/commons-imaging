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

package org.apache.commons.imaging.formats.jpeg.xmp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.stream.Stream;

import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.formats.jpeg.JpegImageParser;
import org.apache.commons.imaging.formats.jpeg.JpegImagingParameters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class JpegXmpRewriteTest extends JpegXmpBaseTest {

    public static Stream<File> data() throws Exception {
        return getImagesWithXmpData().stream();
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testRemoveInsertUpdate(final File imageFile) throws Exception {
        final ByteSource byteSource = ByteSource.file(imageFile);
        final JpegImagingParameters params = new JpegImagingParameters();
        final String xmpXml = new JpegImageParser().getXmpXml(byteSource, params);
        assertNotNull(xmpXml);

        byte[] noXmpFile;
        {
            // test remove

            try (ByteArrayOutputStream os = new ByteArrayOutputStream()) {
                new JpegXmpRewriter().removeXmpXml(byteSource, os);
                noXmpFile = os.toByteArray();
            }

            // Debug.debug("Source Segments:");
            // new JpegUtils().dumpJFIF(ByteSource.file(noXmpFile));

            final String outXmp = new JpegImageParser().getXmpXml(
                    ByteSource.array(noXmpFile, "test.jpg"), params);
            Assertions.assertNull(outXmp);
        }

        {
            // test update

            final String newXmpXml = "test";
            byte[] updated;
            try (ByteArrayOutputStream os = new ByteArrayOutputStream()) {
                new JpegXmpRewriter().updateXmpXml(byteSource, os, newXmpXml);
                updated = os.toByteArray();
            }

            // Debug.debug("Source Segments:");
            // new JpegUtils().dumpJFIF(ByteSource.file(updated));

            final String outXmp = new JpegImageParser().getXmpXml(
                    ByteSource.array(updated, "test.jpg"), params);
            assertNotNull(outXmp);
            assertEquals(outXmp, newXmpXml);
        }

        {
            // test insert

            final String newXmpXml = "test";
            final byte[] updated;
            try (ByteArrayOutputStream os = new ByteArrayOutputStream()) {
                new JpegXmpRewriter().updateXmpXml(ByteSource.array(noXmpFile,
                        "test.jpg"), os, newXmpXml);
                updated = os.toByteArray();
            }

            // Debug.debug("Source Segments:");
            // new JpegUtils().dumpJFIF(ByteSource.file(updated));

            final String outXmp = new JpegImageParser().getXmpXml(
                    ByteSource.array(updated, "test.jpg"), params);
            assertNotNull(outXmp);
            assertEquals(outXmp, newXmpXml);
        }
    }

}
