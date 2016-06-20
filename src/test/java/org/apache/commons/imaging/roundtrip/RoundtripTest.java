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
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.PixelDensity;
import org.apache.commons.imaging.util.Debug;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class RoundtripTest extends RoundtripBase {

    @Test
    public void testLimitedColorRoundtrip() throws Exception {
        final BufferedImage testImages[] = { //

                createLimitedColorImage(1, 1), // minimal
                createLimitedColorImage(2, 2), //
                createLimitedColorImage(10, 10), // larger than 8
                createLimitedColorImage(300, 300), // larger than 256
        };

        for (final BufferedImage testImage : testImages) {
            for (final FormatInfo element : FORMAT_INFOS) {
                final FormatInfo formatInfo = element;
                if ((!formatInfo.canRead) || (!formatInfo.canWrite)) {
                    continue;
                }

                Debug.debug("indexable test: " + formatInfo.format.getName());

                boolean imageExact = true;
                if (formatInfo.colorSupport == COLOR_BITMAP) {
                    imageExact = false;
                }
                if (formatInfo.colorSupport == COLOR_GRAYSCALE) {
                    imageExact = false;
                }

                roundtrip(formatInfo, testImage, "indexable", imageExact);
            }
        }
    }

    @Test
    public void testFullColorRoundtrip() throws Exception {
        final BufferedImage testImages[] = { //

                createFullColorImage(1, 1), // minimal
                createFullColorImage(2, 2), //
                createFullColorImage(10, 10), // larger than 8
                createFullColorImage(300, 300), // larger than 256
        };

        for (final BufferedImage testImage : testImages) {
            for (final FormatInfo element : FORMAT_INFOS) {
                final FormatInfo formatInfo = element;
                if ((!formatInfo.canRead) || (!formatInfo.canWrite)) {
                    continue;
                }

                Debug.debug("fullColor test: " + formatInfo.format.getName());

                boolean imageExact = true;
                if (formatInfo.colorSupport == COLOR_BITMAP) {
                    imageExact = false;
                }
                if (formatInfo.colorSupport == COLOR_GRAYSCALE) {
                    imageExact = false;
                }
                if (formatInfo.colorSupport == COLOR_LIMITED_INDEX) {
                    imageExact = false;
                }

                roundtrip(formatInfo, testImage, "fullColor", imageExact);
            }
        }
    }

    @Test
    public void testPixelDensityRoundtrip() throws IOException,
            ImageReadException, ImageWriteException {
        final BufferedImage testImage = createFullColorImage(2, 2);
        for (final FormatInfo formatInfo : FORMAT_INFOS) {
            if (!formatInfo.canRead || !formatInfo.canWrite || !formatInfo.preservesResolution) {
                continue;
            }

            Debug.debug("pixel density test: " + formatInfo.format.getName());

            final File temp1 = createTempFile("pixeldensity.", "."
                    + formatInfo.format.getExtension());

            final Map<String, Object> params = new HashMap<>();
            final PixelDensity pixelDensity = PixelDensity.createFromPixelsPerInch(75, 150);
            params.put(ImagingConstants.PARAM_KEY_PIXEL_DENSITY, pixelDensity);
            Imaging.writeImage(testImage, temp1, formatInfo.format, params);

            final ImageInfo imageInfo = Imaging.getImageInfo(temp1);
            if (imageInfo == null) {
                continue;
            }
            final int xReadDPI = imageInfo.getPhysicalWidthDpi();
            final int yReadDPI = imageInfo.getPhysicalHeightDpi();
            // allow a 5% margin of error in storage and conversion
            assertTrue("horizontal pixel density stored wrongly for " + formatInfo.format +
                            " in=" + pixelDensity.horizontalDensityInches() + ", out=" + xReadDPI,
                    Math.abs((xReadDPI - pixelDensity.horizontalDensityInches()) /
                            pixelDensity.horizontalDensityInches()) <= 0.05);
            assertTrue("vertical pixel density stored wrongly for " + formatInfo.format +
                            " in=" + pixelDensity.verticalDensityInches() + ", out=" + yReadDPI,
                    Math.abs((yReadDPI - pixelDensity.verticalDensityInches()) /
                            pixelDensity.verticalDensityInches()) <= 0.05);
        }
    }

    @Test
    public void testNullParametersRoundtrip() throws IOException, ImageReadException, ImageWriteException {
        final BufferedImage testImage = createFullColorImage(1, 1);
        for (final FormatInfo formatInfo : FORMAT_INFOS) {
            if (!formatInfo.canRead || !formatInfo.canWrite) {
                continue;
            }
            final File temp1 = createTempFile("nullParameters.", "."
                    + formatInfo.format.getExtension());
            Imaging.writeImage(testImage, temp1, formatInfo.format, null);
            Imaging.getImageInfo(temp1, null);
            Imaging.getImageSize(temp1, null);
            Imaging.getMetadata(temp1, null);
            Imaging.getICCProfile(temp1, null);
            BufferedImage imageRead = Imaging.getBufferedImage(temp1, null);
            assertNotNull(imageRead);
        }
    }

}
