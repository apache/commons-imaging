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

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.ImageBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PhotometricInterpreterRgbTest {

    private PhotometricInterpreterRgb p;

    private final int samplesPerPixel = 3;
    private final int[] bitsPerSample = {8, 8, 8};
    private final int predictor = 1;
    private final int width = 800;
    private final int height = 600;

    @BeforeEach
    public void setUp() {
        p = new PhotometricInterpreterRgb(
        samplesPerPixel, bitsPerSample, predictor, width, height);
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
    public void testInterpretPixel() throws ImagingException, IOException {
        final ImageBuilder imgBuilder = new ImageBuilder(600, 400, /*alpha*/ true);
        final int x = 10;
        final int y = 20;
        p.interpretPixel(imgBuilder, new int[] {255, 255, 255}, x, y);
        assertEquals(0xffffffff, imgBuilder.getRGB(x, y));
    }
}
