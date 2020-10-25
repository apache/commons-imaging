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
package org.apache.commons.imaging.formats.bmp;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingTestConstants;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BmpReadTest extends BmpBaseTest {

    public static Collection<File> data() throws Exception {
        return getBmpImages();
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testImageInfo(File imageFile) throws ImageReadException, IOException {
        final Map<String, Object> params = Collections.emptyMap();
        final ImageInfo imageInfo = Imaging.getImageInfo(imageFile, params);
        assertNotNull(imageInfo);
        // TODO assert more
    }

    @Disabled(value = "RoundtripTest has to be fixed before implementation can throw UnsupportedOperationException")
    @ParameterizedTest
    @MethodSource("data")
    public void testMetaData(File imageFile) {
        Assertions.assertThrows(UnsupportedOperationException.class, () -> {
            Imaging.getMetadata(imageFile);
        });
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testBufferedImage(File imageFile) throws Exception {
        final BufferedImage image = Imaging.getBufferedImage(imageFile);
        assertNotNull(image);
        // TODO assert more
    }

    /**
     * Test that when the value of the mask parameter is zero, getMaskShift won't
     * get stuck in one of its while loops.
     *
     * @throws IOException
     * @throws ImageReadException
     */
    @Test
    public void testGetMaskShiftZeroMask() throws ImageReadException, IOException {
        File inputFile = new File(ImagingTestConstants.TEST_IMAGE_FOLDER +
                "/bmp/5/@broken/timeout-bd15dbfa26b4e88070de540c6603039e8a88626f");
        new BmpImageParser().dumpImageFile(new ByteSourceFile(inputFile));
    }
}
