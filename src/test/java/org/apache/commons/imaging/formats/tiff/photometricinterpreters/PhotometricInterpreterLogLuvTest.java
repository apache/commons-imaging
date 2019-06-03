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
package org.apache.commons.imaging.formats.tiff.photometricinterpreters;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PhotometricInterpreterLogLuvTest {

    @Test
    public void testConstructor() {
        int samplesPerPixel = 8;
        int[] bitsPerSample = new int[] {1, 2, 3};
        int predictor = 1;
        int width = 800;
        int height = 600;
        PhotometricInterpreterLogLuv p = new PhotometricInterpreterLogLuv(samplesPerPixel, bitsPerSample, predictor,
                width, height);
        assertEquals(samplesPerPixel, p.samplesPerPixel);
        for (int i = 0; i < bitsPerSample.length; i++) {
            assertEquals(bitsPerSample[i], p.getBitsPerSample(i));
        }
        assertEquals(predictor, p.predictor);
        assertEquals(width, p.width);
        assertEquals(height, p.height);
    }
}
