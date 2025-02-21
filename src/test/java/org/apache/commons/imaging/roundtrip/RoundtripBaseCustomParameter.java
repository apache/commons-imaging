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

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.stream.Stream;

import org.apache.commons.imaging.AbstractImageParser;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.ImagingParameters;
import org.apache.commons.imaging.formats.pcx.PcxImagingParameters;
import org.apache.commons.imaging.common.RgbBufferedImageFactory;
import org.apache.commons.imaging.internal.ImageParserFactory;
import org.junit.jupiter.params.provider.Arguments;

public class RoundtripBaseCustomParameter {

    public static Stream<Arguments> createRoundtripArguments(final BufferedImage[] images) {
        PcxImagingParameters[] p = new PcxImagingParameters[5];
        int i = 0;
        p[i] = new PcxImagingParameters();
        p[i].setBitDepth(32);
        i++; // Test #1
        p[i] = new PcxImagingParameters();
        p[i].setBitDepth(24);
        i++; // Test #2
        p[i] = new PcxImagingParameters();
        p[i].setBitDepth(4);
        p[i].setPlanes(1);
        i++; // Test #3
        p[i] = new PcxImagingParameters();
        p[i].setBitDepth(4);
        p[i].setPlanes(4);
        i++; // Test #4
        p[i] = new PcxImagingParameters();
        p[i].setBitDepth(2);
        p[i].setPlanes(2);
        i++; // Test #5
        return Stream.of(images).flatMap(x -> Stream.of(p).map(y -> Arguments.of(x, y)));
    }

    protected void roundtrip(final FormatInfo formatInfo, final ImagingParameters params, final BufferedImage testImage, final String tempPrefix, final boolean imageExact)
            throws IOException, ImagingException, ImagingException {

        final AbstractImageParser abstractImageParser = ImageParserFactory.getImageParser(formatInfo.format);

        final byte[] temp1;
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            abstractImageParser.writeImage(testImage, bos, params);
            temp1 = bos.toByteArray();
        }

        params.setBufferedImageFactory(new RgbBufferedImageFactory());
        final BufferedImage image2 = abstractImageParser.getBufferedImage(temp1, params);
        assertNotNull(image2);

        if (imageExact) {
            // note tolerance when comparing grayscale images
            // BufferedImages of
            ImageAsserts.assertImageEquals(testImage, image2);
        }

        if (formatInfo.identicalSecondWrite) {
            final byte[] temp2;
            try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
                abstractImageParser.writeImage(image2, bos, params);
                temp2 = bos.toByteArray();
            }

            assertArrayEquals(temp1, temp2);
        }
    }
}
