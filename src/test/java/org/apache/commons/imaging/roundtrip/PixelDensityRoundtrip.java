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
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.PixelDensity;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

@RunWith(Theories.class)
public class PixelDensityRoundtrip extends RoundtripBase {

    @DataPoints
    public static FormatInfo[] formatInfos = FormatInfo.PRESERVING_RESOLUTION_FORMATS;

    @Theory
    public void testPixelDensityRoundtrip(final FormatInfo formatInfo) throws Exception {
        final BufferedImage testImage = TestImages.createFullColorImage(2, 2);

        final File temp1 = createTempFile("pixeldensity.", "."
                + formatInfo.format.getExtension());

        final Map<String, Object> params = new HashMap<>();
        final PixelDensity pixelDensity = PixelDensity.createFromPixelsPerInch(75, 150);
        params.put(ImagingConstants.PARAM_KEY_PIXEL_DENSITY, pixelDensity);
        Imaging.writeImage(testImage, temp1, formatInfo.format, params);

        final ImageInfo imageInfo = Imaging.getImageInfo(temp1);
        if (imageInfo != null) {
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

}
