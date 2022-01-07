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

import org.apache.commons.imaging.Imaging;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class NullParametersRoundtripTest extends RoundtripBase {

    public static Stream<FormatInfo> data() {
        return Stream.of(FormatInfo.READ_WRITE_FORMATS);
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testNullParametersRoundtrip(final FormatInfo formatInfo) throws Exception {
        final BufferedImage testImage = TestImages.createFullColorImage(1, 1);
        final File temp1 = File.createTempFile("nullParameters.", "." + formatInfo.format.getDefaultExtension());
        Imaging.writeImage(testImage, temp1, formatInfo.format);
        Imaging.getImageInfo(temp1);
        Imaging.getImageSize(temp1);
        Imaging.getMetadata(temp1);
        Imaging.getICCProfile(temp1);
        final BufferedImage imageRead = Imaging.getBufferedImage(temp1);

        assertNotNull(imageRead);
    }

}
