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

package org.apache.commons.imaging.formats.jpeg;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;

import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.test.TestResources;
import org.junit.jupiter.api.Test;

/**
 * Tests that a JPEG file without an SOF (Start Of Frame) segment causes {@link Imaging#getImageInfo(File)} to throw an
 * {@link ImagingException} instead of an unchecked {@link IndexOutOfBoundsException}.
 */
class JpegWithoutSofSegmentTest {

    @Test
    void testGetImageInfo() {
        // we cannot use ImagingTest and getImageByFileName, as it would cause other tests to fail
        final File imageFile = TestResources.resourceToFile("/IMAGING-333/NoSofSegment.jpg");
        assertThrows(ImagingException.class, () -> Imaging.getImageInfo(imageFile));
    }
}
