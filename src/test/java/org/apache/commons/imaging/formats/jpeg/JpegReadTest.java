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

package org.apache.commons.imaging.formats.jpeg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.stream.Stream;

import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.formats.tiff.TiffImagingParameters;
import org.apache.commons.imaging.internal.Debug;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class JpegReadTest extends JpegBaseTest {

    public static Stream<File> data() throws Exception{
        return getJpegImages().stream();
    }

    @ParameterizedTest
    @MethodSource("data")
    public void test(final File imageFile) throws Exception {
        final JpegImageParser jpegImageParser = new JpegImageParser();
        final ImageMetadata metadata = jpegImageParser.getExifMetadata(new ByteSourceFile(imageFile), new TiffImagingParameters());
        // TODO only run this tests with images that have metadata...
        //assertNotNull(metadata);
        Debug.debug("metadata", metadata);

        Debug.debug("ICC profile", Imaging.getICCProfile(imageFile));

        final ImageInfo imageInfo = Imaging.getImageInfo(imageFile);
        assertNotNull(imageInfo);

        try {
            final BufferedImage image = Imaging.getBufferedImage(imageFile);
            assertNotNull(image);
        } catch (final ImagingException imageReadException) {
            assertEquals("Only sequential, baseline JPEGs are supported at the moment",
                    imageReadException.getMessage());
        }
    }

    /**
     * The JPEG image data may contain a negative number of segments,
     * in which case the parser could throw a NegativeArraySizeException.
     *
     * <p>This test case verifies that we are handling that scenario, and
     * throwing an ImageReadException instead.</p>
     *
     * <p>See Google OSS Fuzz issue 33458</p>
     */
    @Test
    public void testUncaughtExceptionOssFuzz33458() {
        final String input = "/images/jpeg/oss-fuzz-33458/clusterfuzz-testcase-minimized-ImagingJpegFuzzer-4548690447564800";
        final String file = JpegReadTest.class.getResource(input).getFile();
        final JpegImageParser parser = new JpegImageParser();
        assertThrows(ImagingException.class, () -> parser.getBufferedImage(new ByteSourceFile(new File(file)), new JpegImagingParameters()));
    }

}
