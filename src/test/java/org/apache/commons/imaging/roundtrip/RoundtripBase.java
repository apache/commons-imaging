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

import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.ImagingParameters;
import org.apache.commons.imaging.common.RgbBufferedImageFactory;
import org.apache.commons.imaging.internal.Debug;
import org.apache.commons.imaging.internal.Util;
import org.junit.jupiter.params.provider.Arguments;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RoundtripBase {

    protected void roundtrip(final FormatInfo formatInfo, final BufferedImage testImage,
                             final String tempPrefix, final boolean imageExact) throws IOException,
            ImageReadException, ImageWriteException {
        final File temp1 = Files.createTempFile(tempPrefix + ".", "."
                + formatInfo.format.getDefaultExtension()).toFile();
        Debug.debug("tempFile: " + temp1.getName());

        final ImageParser imageParser = Util.getImageParser(formatInfo.format);

        final ImagingParameters params = Util.getImageParser(formatInfo.format).getDefaultParameters();
        try (FileOutputStream fos = new FileOutputStream(temp1)) {
            imageParser.writeImage(testImage, fos, params);
        }

        final ImagingParameters readParams = Util.getImageParser(formatInfo.format).getDefaultParameters();
        readParams.setBufferedImageFactory(new RgbBufferedImageFactory());
        final BufferedImage image2 = imageParser.getBufferedImage(temp1, readParams);
        assertNotNull(image2);

        if (imageExact) {
            // note tolerance when comparing grayscale images
            // BufferedImages of
            ImageAsserts.assertEquals(testImage, image2);
        }

        if (formatInfo.identicalSecondWrite) {
            final File temp2 = Files.createTempFile(tempPrefix + ".", "." + formatInfo.format.getDefaultExtension()).toFile();
            try (FileOutputStream fos = new FileOutputStream(temp2)) {
                imageParser.writeImage(image2, fos, params);
            }

            ImageAsserts.assertEquals(temp1, temp2);
        }
    }

    public static Stream<Arguments> createRoundtripArguments(final BufferedImage[] images) {
        return Stream.of(images).flatMap(i -> Stream.of(FormatInfo.READ_WRITE_FORMATS).map(f -> Arguments.of(i, f)));
    }
}
