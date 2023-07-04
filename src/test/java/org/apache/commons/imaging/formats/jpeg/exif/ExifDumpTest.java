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

package org.apache.commons.imaging.formats.jpeg.exif;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.File;
import java.util.stream.Stream;

import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.formats.jpeg.JpegImageMetadata;
import org.apache.commons.imaging.formats.jpeg.JpegImagingParameters;
import org.apache.commons.imaging.formats.jpeg.JpegUtils;
import org.apache.commons.imaging.internal.Debug;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExifDumpTest extends ExifBaseTest {

    public static Stream<File> data() throws Exception {
        return getImagesWithExifData().stream();
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testDumpJFIF(final File imageFile) throws Exception {
        final ByteSource byteSource = ByteSource.file(imageFile);
        Debug.debug("Segments:");
        new JpegUtils().dumpJfif(byteSource);
        // TODO assert something
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testMetadata(final File imageFile) throws Exception {
        final JpegImagingParameters params = new JpegImagingParameters();

        final JpegImageMetadata metadata = (JpegImageMetadata) Imaging.getMetadata(imageFile);
        assertNotNull(metadata);
        // TODO assert more
    }
}
