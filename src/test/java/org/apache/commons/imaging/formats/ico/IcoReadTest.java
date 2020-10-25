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

package org.apache.commons.imaging.formats.ico;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Collections;
import java.util.stream.Stream;

import org.apache.commons.imaging.Imaging;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class IcoReadTest extends IcoBaseTest {

    public static Stream<File> data() throws Exception {
        return getIcoImages().stream();
    }

    @Disabled(value = "RoundtripTest has to be fixed before implementation can throw UnsupportedOperationException")
    @ParameterizedTest
    @MethodSource("data")
    public void testMetadata(File imageFile) {
        Assertions.assertThrows(UnsupportedOperationException.class, () -> {
            Imaging.getMetadata(imageFile);
        });
    }

    @Disabled(value = "RoundtripTest has to be fixed before implementation can throw UnsupportedOperationException")
    @ParameterizedTest
    @MethodSource("data")
    public void testImageInfo(File imageFile) {
        Assertions.assertThrows(UnsupportedOperationException.class, () -> {
            Imaging.getImageInfo(imageFile, Collections.emptyMap());
        });
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testBufferedImage(File imageFile) throws Exception {
        final BufferedImage image = Imaging.getBufferedImage(imageFile);
        assertNotNull(image);
        // TODO assert more
    }
}
