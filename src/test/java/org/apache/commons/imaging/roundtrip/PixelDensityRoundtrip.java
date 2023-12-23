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

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.stream.Stream;

import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.PixelDensity;
import org.apache.commons.imaging.formats.tiff.TiffImageParser;
import org.apache.commons.imaging.formats.tiff.TiffImagingParameters;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PixelDensityRoundtrip extends RoundtripBase {

    public static Stream<FormatInfo> testPixelDensityRoundtrip() {
        return Stream.of(FormatInfo.PRESERVING_RESOLUTION_FORMATS);
    }

    @ParameterizedTest
    @MethodSource
    public void testPixelDensityRoundtrip(final FormatInfo formatInfo) throws Exception {
        final BufferedImage testImage = TestImages.createFullColorImage(2, 2);

        final TiffImagingParameters params = new TiffImagingParameters();
        final PixelDensity pixelDensity = PixelDensity.createFromPixelsPerInch(75, 150);
        params.setPixelDensity(pixelDensity);
        final TiffImageParser tiffImageParser = new TiffImageParser();
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        tiffImageParser.writeImage(testImage, byteArrayOutputStream, params);

        final ImageInfo imageInfo = Imaging.getImageInfo(byteArrayOutputStream.toByteArray());
        if (imageInfo != null) {
            final int xReadDPI = imageInfo.getPhysicalWidthDpi();
            final int yReadDPI = imageInfo.getPhysicalHeightDpi();
            // allow a 5% margin of error in storage and conversion
            assertTrue(Math.abs((xReadDPI - pixelDensity.horizontalDensityInches()) / pixelDensity.horizontalDensityInches()) <= 0.05);
            assertTrue(Math.abs((yReadDPI - pixelDensity.verticalDensityInches()) / pixelDensity.verticalDensityInches()) <= 0.05);
        }
    }

}
