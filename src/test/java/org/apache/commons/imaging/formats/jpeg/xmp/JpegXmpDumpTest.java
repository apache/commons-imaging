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

package org.apache.commons.imaging.formats.jpeg.xmp;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.File;
import java.util.stream.Stream;

import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.formats.jpeg.JpegImageParser;
import org.apache.commons.imaging.formats.jpeg.JpegImagingParameters;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class JpegXmpDumpTest extends AbstractJpegXmpTest {

    public static Stream<File> data() throws Exception {
        return getImagesWithXmpData().stream();
    }

    @ParameterizedTest
    @MethodSource("data")
    void test(final File imageFile) throws Exception {
        final ByteSource byteSource = ByteSource.file(imageFile);
        final JpegImagingParameters params = new JpegImagingParameters();
        final String xmpXml = new JpegImageParser().getXmpXml(byteSource, params);

        // TODO assert more
        assertNotNull(xmpXml);
    }

}
