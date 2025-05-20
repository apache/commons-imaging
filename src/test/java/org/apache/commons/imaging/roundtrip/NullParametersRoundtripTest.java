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

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.stream.Stream;

import org.apache.commons.imaging.Imaging;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class NullParametersRoundtripTest extends RoundtripBase {

    public static Stream<FormatInfo> data() {
        return Stream.of(FormatInfo.READ_WRITE_FORMATS);
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testNullParametersRoundtrip(final FormatInfo formatInfo) throws Exception {
        final BufferedImage testImage = TestImages.createFullColorImage(1, 1);
        final byte[] temp1;
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            Imaging.writeImage(testImage, byteArrayOutputStream, formatInfo.format);
            temp1 = byteArrayOutputStream.toByteArray();
        }
        final String fileName = "nullParameters." + formatInfo.format.getDefaultExtension();
        Imaging.getImageInfo(new ByteArrayInputStream(temp1), fileName);
        Imaging.getImageSize(new ByteArrayInputStream(temp1), fileName);
        Imaging.getMetadata(new ByteArrayInputStream(temp1), fileName);
        Imaging.getIccProfile(new ByteArrayInputStream(temp1), fileName);
        final BufferedImage imageRead = Imaging.getBufferedImage(new ByteArrayInputStream(temp1), fileName);

        assertNotNull(imageRead);
    }

}
