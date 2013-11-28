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

package org.apache.commons.imaging.formats.png;

import java.util.Arrays;

public enum ColorType {

    GREYSCALE(0, true, false, 1, new int[]{1, 2, 4, 8, 16}),
    TRUE_COLOR(2, false, false, 3, new int[]{8, 16}),
    INDEXED_COLOR(3, false, false, 1, new int[]{1, 2, 4, 8}),
    GREYSCALE_WITH_ALPHA(4, true, true, 2, new int[]{8, 16}),
    TRUE_COLOR_WITH_ALPHA(6, false, true, 4, new int[]{8, 16});

    private final int value;
    private final boolean greyscale;
    private final boolean alpha;
    private final int samplesPerPixel;
    private final int[] allowedBitDepths;

    ColorType(int value, boolean greyscale, boolean alpha, int samplesPerPixel, int[] allowedBitDepths) {
        this.value = value;
        this.greyscale = greyscale;
        this.alpha = alpha;
        this.samplesPerPixel = samplesPerPixel;
        this.allowedBitDepths = allowedBitDepths;
    }

    int getValue() {
        return value;
    }

    boolean isGreyscale() {
        return greyscale;
    }

    boolean hasAlpha() {
        return alpha;
    }

    int getSamplesPerPixel() {
        return samplesPerPixel;
    }

    boolean isBitDepthAllowed(int bitDepth) {
        return Arrays.binarySearch(allowedBitDepths, bitDepth) >= 0;
    }

    public static ColorType getColorType(int value) {
        for (ColorType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        
        return null;
    }

    static ColorType getColorType(boolean alpha, boolean grayscale) {
        if (grayscale) {
            if (alpha) {
                return ColorType.GREYSCALE_WITH_ALPHA;
            } else {
                return ColorType.GREYSCALE;
            }
        } else if (alpha) {
            return ColorType.TRUE_COLOR_WITH_ALPHA;
        } else {
            return ColorType.TRUE_COLOR;
        }
    }
}
