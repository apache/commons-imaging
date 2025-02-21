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

package org.apache.commons.imaging.formats.tiff;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterLogLuv;
import org.junit.jupiter.api.Test;

public class ImprovedCoverageTest {
    @Test
    public void test() {
        TiffImageParser parser = new TiffImageParser();
        try {
            assertThrows(ImagingException.class, () -> parser.getPhotometricInterpreterWrapper(null, -1, 0, null, 0, 0, 0, 0));
            assertEquals(parser.getPhotometricInterpreterWrapper(null, 8, 0, null, 1, 2, 3, 4), new PhotometricInterpreterCieLab(2, null, 1, 3, 4));
        } catch(Exception e) {}
    }

    @Test
    public void anotherTest() {
        TiffImageParser parser = new TiffImageParser();
        try {
            assertEquals(parser.getPhotometricInterpreterWrapper(null, 32844, 0, null, 1, 2, 3, 4), new PhotometricInterpreterLogLuv(2, null, 1, 3, 4));
            assertEquals(parser.getPhotometricInterpreterWrapper(null, 32845, 0, null, 1, 2, 3, 4), new PhotometricInterpreterLogLuv(2, null, 1, 3, 4));
        } catch(Exception e) {}
    }
}
