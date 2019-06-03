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

import org.junit.Before;
import org.junit.Test;

public class PhotometricInterpreterLogLuvTest {

    private PhotometricInterpreterLogLuv p;

    private int samplesPerPixel = 8;
    private int[] bitsPerSample = new int[] {1, 2, 3};
    private int predictor = 1;
    private int width = 800;
    private int height = 600;

    @Before
    public void setUp() {
        p = new PhotometricInterpreterLogLuv(samplesPerPixel, bitsPerSample, predictor,
                width, height);
    }

    @Test
    public void testConstructor() {
        assertEquals(samplesPerPixel, p.samplesPerPixel);
        for (int i = 0; i < bitsPerSample.length; i++) {
            assertEquals(bitsPerSample[i], p.getBitsPerSample(i));
        }
        assertEquals(predictor, p.predictor);
        assertEquals(width, p.width);
        assertEquals(height, p.height);
    }

    @Test
    public void testGetTristimulusValues() {
        // any value equals 0 will have its pow(N, 3) equal to 0
        assertEquals(0.0d, (double) p.getTristimulusValues(0, 0, 0).x, 0.001d);
        assertEquals(0.0d, (double) p.getTristimulusValues(0, 0, 0).y, 0.001d);
        assertEquals(0.0d, (double) p.getTristimulusValues(0, 0, 0).z, 0.001d);
        // values under the threshold used in the if statements
        assertEquals(0.04126d, (double) p.getTristimulusValues(1, 0, 0).x, 0.001d);
        assertEquals(0.04341d, (double) p.getTristimulusValues(1, 0, 0).y, 0.001d);
        assertEquals(0.04727d, (double) p.getTristimulusValues(1, 0, 0).z, 0.001d);
        // values under the threshold used in the if statements
        assertEquals(29.36116d, (double) p.getTristimulusValues(100, 100, 50).x, 0.001d);
        assertEquals(10.78483d, (double) p.getTristimulusValues(100, 100, 50).y, 0.001d);
        assertEquals(1.25681d, (double) p.getTristimulusValues(100, 100, 50).z, 0.001d);
    }
}
