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

import java.io.IOException;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.ImageBuilder;

public class PhotometricInterpreterBiLevel extends PhotometricInterpreter {
    private final boolean invert;

    // private final int bitsPerPixel;

    public PhotometricInterpreterBiLevel(final int samplesPerPixel,
            final int[] bitsPerSample, final int predictor, final int width,
            final int height, final boolean invert) {
        super(samplesPerPixel, bitsPerSample, predictor, width, height);

        this.invert = invert;
        // this.bitsPerPixel = fBitsPerPixel;
    }

    @Override
    public void interpretPixel(final ImageBuilder imageBuilder, final int[] samples, final int x,
            final int y) throws ImageReadException, IOException {
        int sample = samples[0];

        if (invert) {
            sample = 255 - sample;
        }

        final int red = sample;
        final int green = sample;
        final int blue = sample;

        final int alpha = 0xff;
        final int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue);

        imageBuilder.setRGB(x, y, rgb);
    }
}
