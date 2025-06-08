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

package org.apache.commons.imaging.roundtrip;

import java.awt.image.BufferedImage;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LimitedColorRoundtripTest extends RoundtripBase {

    public static BufferedImage[] images = { TestImages.createLimitedColorImage(1, 1), // minimal
            TestImages.createLimitedColorImage(2, 2), //
            TestImages.createLimitedColorImage(10, 10), // larger than 8
            TestImages.createLimitedColorImage(300, 300), // larger than 256
    };

    public static Stream<Arguments> testLimitedColorRoundtrip() {
        return createRoundtripArguments(images);
    }

    @ParameterizedTest
    @MethodSource
    void testLimitedColorRoundtrip(final BufferedImage testImage, final FormatInfo formatInfo) throws Exception {
        boolean imageExact = true;
        if (formatInfo.colorSupport == FormatInfo.COLOR_BITMAP) {
            imageExact = false;
        }
        if (formatInfo.colorSupport == FormatInfo.COLOR_GRAYSCALE) {
            imageExact = false;
        }

        roundtrip(formatInfo, testImage, "indexable", imageExact);
    }

}
