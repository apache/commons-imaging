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
package org.apache.commons.imaging.formats.tiff.datareaders;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration;
import org.junit.jupiter.api.Test;

public class DataReaderStripsTest {
    @Test
    void testApplyPredictor() {
        final int[] bitsPerPixel = { 1, 2, 3 };
        final DataReaderStrips strips = new DataReaderStrips(null, null, 3, bitsPerPixel, 2, 4, 0, 3, 1, 1, TiffPlanarConfiguration.CHUNKY, null, 2, null);
        strips.resetPredictor();
        final int[] samples = { 10, 355, 355, 255 };
        int[] expected = { 10, 99, 99, 255 };
        int[] predicted = strips.applyPredictor(samples);
        assertArrayEquals(expected, predicted);
        expected = new int[] { 20, 198, 198, 254 };
        predicted = strips.applyPredictor(samples);
        assertArrayEquals(expected, predicted);
    }
}
