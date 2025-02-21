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
package org.apache.commons.imaging.roundtrip;

import java.awt.image.BufferedImage;
import java.util.Random;
final class TestImages {

    static BufferedImage createArgbBitmapImage(final int width, final int height) {
        final BufferedImage result = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                // alternating black and white.
                final int modulator = y + 2; // make sure lines vary.
                final int argb = (x + y) % modulator == 0 ? 0xff000000 : 0xffffffff;
                result.setRGB(x, y, argb);
            }
        }
        return result;
    }

    static BufferedImage createArgbGrayscaleImage(final int width, final int height) {
        final BufferedImage result = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                final int value = 256 * (x + y) / (width + height);
                final int argb = 0xff << 24 | value << 16 | value << 8 | value << 0;

                result.setRGB(x, y, argb);
            }
        }
        return result;
    }

    static BufferedImage createBitmapBitmapImage(final int width, final int height) {
        final BufferedImage result = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_BINARY);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                // alternating black and white.
                final int modulator = y + 2; // make sure lines vary.
                final int argb = (x + y) % modulator == 0 ? 0xff000000 : 0xffffffff;
                result.setRGB(x, y, argb);
            }
        }
        return result;
    }

    static BufferedImage createFullColorImage(final int width, final int height) {
        final Random random = new Random();
        final BufferedImage result = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                // random color
                final int red = random.nextInt(256);
                final int green = random.nextInt(256);
                final int blue = random.nextInt(256);
                final int argb = 0xff << 24 | red << 16 | green << 8 | blue << 0;
                result.setRGB(x, y, argb);
            }
        }
        return result;
    }

    static BufferedImage createGrayscaleGrayscaleImage(final int width, final int height) {
        final BufferedImage result = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                final int value = 256 * (x + y) / (width + height);
                final int argb = 0xff << 24 | value << 16 | value << 8 | value << 0;

                result.setRGB(x, y, argb);
            }
        }
        return result;
    }

    static BufferedImage createLimitedColorImage(final int width, final int height) {
        final int[] colors = { 0xffffffff, 0xff000000, 0xfff00000, 0xff0000ff, 0xff123456, 0xfffefeff, 0xff7f817f, };

        final BufferedImage result = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                final int argb = colors[(x + y) % colors.length];
                result.setRGB(x, y, argb);
            }
        }
        return result;
    }

    private TestImages() {
    }
}
