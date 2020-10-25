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

import java.io.File;
import java.util.Collections;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.Imaging;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test that an invalid segment will not cause an ArrayIndexOutOfBoundsException
 * when the huffman table is created in a DHT segment.
 */
public class JpegWithInvalidDhtSegmentTest {

    @Test
    public void testSingleImage() {
        // we cannot use ImagingTest and getImageByFileName, as it would cause others
        // tests to fail
        final File imageFile = new File(JpegWithInvalidDhtSegmentTest.class
                .getResource("/IMAGING-215/ArrayIndexOutOfBoundsException_DhtSegment_79.jpeg")
                .getFile());
        Assertions.assertThrows(ImageReadException.class, () -> {
            Imaging.getMetadata(imageFile, Collections.emptyMap());
        });
    }
}
