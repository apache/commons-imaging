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
import java.util.Arrays;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.ImageBuilder;

public class PhotometricInterpreterPalette extends PhotometricInterpreter {

    /**
     * The color map of integer ARGB values tied to the pixel index of the
     * palette
     */
    private final int[] indexColorMap;
    private final int bitsPerPixelMask;

    public PhotometricInterpreterPalette(final int samplesPerPixel,
            final int[] bitsPerSample, final int predictor, final int width, final int height,
            final int[] colorMap) {
        super(samplesPerPixel, bitsPerSample, predictor, width, height);

        final int bitsPerPixel = getBitsPerSample(0);
        final int colormapScale = (1 << bitsPerPixel);
        indexColorMap = new int[colormapScale];
        Arrays.setAll(indexColorMap, i -> {
            final int red = (colorMap[i] >> 8) & 0xff;
            final int green = (colorMap[i + (colormapScale)] >> 8) & 0xff;
            final int blue = (colorMap[i + (2 * colormapScale)] >> 8) & 0xff;
            return 0xff000000 | (red << 16) | (green << 8) | blue;
        });

        // Fix for IMAGING-247 5/17/2020
        // This interpreter is used with TIFF_COMPRESSION_PACKBITS (32773).
        // which unpacks to 8 bits per sample. But if the bits-per-pixel
        // is less than 8 bits, some authoring tools do not zero-out the
        // unused bits. This results in cases where the decoded by index
        // exceeds the size of the palette. So we set up a mask to protect
        // the code from an array bounds exception.
        int temp = 0;
        for (int i = 0; i < bitsPerPixel; i++) {
            temp = (temp << 1) | 1;
        }
        bitsPerPixelMask = temp;

    }

    @Override
    public void interpretPixel(final ImageBuilder imageBuilder, final int[] samples, final int x,
            final int y) throws ImageReadException, IOException {
        imageBuilder.setRGB(x, y, indexColorMap[samples[0] & bitsPerPixelMask]);
    }
}
