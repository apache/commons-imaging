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
import org.apache.commons.imaging.internal.Util;
import org.junit.jupiter.params.provider.Arguments;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RoundtripBase {

    protected void roundtrip(final FormatInfo formatInfo, final BufferedImage testImage,
                             final String tempPrefix, final boolean imageExact) throws IOException,
            ImageReadException, ImageWriteException {

        final ImageParser imageParser = Util.getImageParser(formatInfo.format);

        byte[] temp1;
        final ImagingParameters params = Util.getImageParser(formatInfo.format).getDefaultParameters();
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream(1000000)) {
            imageParser.writeImage(testImage, bos, params);
            temp1 = bos.toByteArray();
        }

        final BufferedImage image2;
        try {
            final ImagingParameters readParams = Util.getImageParser(formatInfo.format).getDefaultParameters();
            readParams.setBufferedImageFactory(new RgbBufferedImageFactory());
            image2 = imageParser.getBufferedImage(temp1, readParams);
            assertNotNull(image2);

            if (imageExact) {
                // note tolerance when comparing grayscale images
                // BufferedImages of
                ImageAsserts.assertEquals(testImage, image2);
            }
        } catch (final Throwable e) {
            final Path tempFile = Files.createTempFile("test", ".jpg");
            Files.write(tempFile, temp1);
            System.err.println("Failed tempFile " + tempFile);
            throw e;
        }

        if (formatInfo.identicalSecondWrite) {
            byte[] temp2;
            try (ByteArrayOutputStream bos = new ByteArrayOutputStream(1000000)) {
                imageParser.writeImage(image2, bos, params);
                temp2 = bos.toByteArray();
            }
            try {
                ImageAsserts.assertEquals(temp1, temp2);
            } catch (final Throwable e) {
                final Path tempFile = Files.createTempFile(tempPrefix + ".", "." + formatInfo.format.getDefaultExtension());
                Files.write(tempFile, temp1);
                final Path tempFile2 = Files.createTempFile(tempPrefix + ".", "." + formatInfo.format.getDefaultExtension());
                Files.write(tempFile2, temp2);
                System.err.println("Failed tempFile1 " + tempFile);
                System.err.println("Failed tempFile2 " + tempFile2);
                throw e;
            }
        }
    }

    public static Stream<Arguments> createRoundtripArguments(final BufferedImage[] images) {
        return Stream.of(images).flatMap(i -> Stream.of(FormatInfo.READ_WRITE_FORMATS).map(f -> Arguments.of(i, f)));
    }
}
