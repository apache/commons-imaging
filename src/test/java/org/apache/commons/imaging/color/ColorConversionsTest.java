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
package org.apache.commons.imaging.color;

import static java.lang.Integer.toHexString;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.commons.imaging.internal.Debug;
import org.junit.jupiter.api.Test;

public class ColorConversionsTest {
    private static final int[] SAMPLE_RGBS = { 0xffffffff, 0xff000000,
            0xffff0000, 0xff00ff00, 0xff0000ff, 0xffff00ff, 0xfff0ff00,
            0xff00ffff, 0x00000000, 0xff7f7f7f, };

    @Test
    public void testRgbToCmyk() {
        for (final int rgb : SAMPLE_RGBS) {
            final ColorCmy cmy = ColorConversions.convertRgbToCmy(rgb);
            final ColorCmyk cmyk = ColorConversions.convertCmyToCmyk(cmy);
            final ColorCmy cmykCmy = ColorConversions.convertCmykToCmy(cmyk);
            final int cmykCmyRgb = ColorConversions.convertCmyToRgb(cmykCmy);

            Debug.debug("cmy: " + cmy);
            Debug.debug("cmyk: " + cmyk);
            Debug.debug("cmykCmy: " + cmykCmy);
            Debug.debug("cmykCmyRgb: " + cmykCmyRgb + " (" + Integer.toHexString(cmykCmyRgb) + ")");

            assertEquals(toHexString(0xffffff & rgb), toHexString(0xffffff & cmykCmyRgb));
        }
    }

    @Test
    public void testRgbToDin99b() {
        for (final int rgb : SAMPLE_RGBS) {

            final ColorXyz xyz = ColorConversions.convertRgbToXyz(rgb);
            final ColorCieLab cielab = ColorConversions.convertXyzToCieLab(xyz);
            final ColorDin99Lab din99b = ColorConversions.convertCieLabToDin99bLab(cielab);

            final ColorCieLab din99Cielab = ColorConversions.convertDin99bLabToCieLab(din99b);
            final ColorXyz din99CielabXyz = ColorConversions.convertCieLabToXyz(din99Cielab);
            final int din99CielabXyzRgb = ColorConversions.convertXyzToRgb(din99CielabXyz);

            assertEquals(toHexString(0xffffff & rgb), toHexString(0xffffff & din99CielabXyzRgb));
        }
    }

    @Test
    public void testRgbToDin99o() {
        for (final int rgb : SAMPLE_RGBS) {

            final ColorXyz xyz = ColorConversions.convertRgbToXyz(rgb);
            final ColorCieLab cielab = ColorConversions.convertXyzToCieLab(xyz);
            final ColorDin99Lab din99o = ColorConversions.convertCieLabToDin99oLab(cielab);

            final ColorCieLab din99Cielab = ColorConversions.convertDin99oLabToCieLab(din99o);
            final ColorXyz din99CielabXyz = ColorConversions.convertCieLabToXyz(din99Cielab);
            final int din99CielabXyzRgb = ColorConversions.convertXyzToRgb(din99CielabXyz);

            assertEquals(toHexString(0xffffff & rgb), toHexString(0xffffff & din99CielabXyzRgb));
        }
    }

    @Test
    public void testRgbToHsl() {
        for (final int rgb : SAMPLE_RGBS) {
            final ColorHsl hsl = ColorConversions.convertRgbToHsl(rgb);
            final int hslRgb = ColorConversions.convertHslToRgb(hsl);

            Debug.debug("hsl: " + hsl);
            Debug.debug("hslRgb: " + hslRgb + " (" + Integer.toHexString(hslRgb) + ")");

            assertEquals(toHexString(0xffffff & rgb), toHexString(0xffffff & hslRgb));
        }
    }

    @Test
    public void testRgbToHsv() {
        for (final int rgb : SAMPLE_RGBS) {
            final ColorHsv hsv = ColorConversions.convertRgbToHsv(rgb);
            final int hsvRgb = ColorConversions.convertHsvToRgb(hsv);

            Debug.debug("hsv: " + hsv);
            Debug.debug("hsvRgb: " + hsvRgb + " (" + Integer.toHexString(hsvRgb) + ")");

            assertEquals(toHexString(0xffffff & rgb), toHexString(0xffffff & hsvRgb));
        }
    }

    @Test
    public void testXyz() {
        for (final int rgb : SAMPLE_RGBS) {
            final ColorXyz xyz = ColorConversions.convertRgbToXyz(rgb);
            final int xyzRgb = ColorConversions.convertXyzToRgb(xyz);

            Debug.debug();
            Debug.debug("rgb: " + rgb + " (" + Integer.toHexString(rgb) + ")");
            Debug.debug("xyz: " + xyz);
            Debug.debug("xyzRgb: " + xyzRgb + " (" + Integer.toHexString(xyzRgb) + ")");

            assertEquals(toHexString(0xffffff & rgb), toHexString(0xffffff & xyzRgb), "rgb "+toHexString(rgb)+", "+xyz);

            final ColorCieLab cielab = ColorConversions.convertXyzToCieLab(xyz);
            final ColorXyz cielabXyz = ColorConversions.convertCieLabToXyz(cielab);
            final int cielabXyzRgb = ColorConversions.convertXyzToRgb(cielabXyz);

            Debug.debug("cielab: " + cielab);
            Debug.debug("cielabXyz: " + cielabXyz);
            Debug.debug("cielabXyzRgb: " + cielabXyzRgb + " (" + Integer.toHexString(cielabXyzRgb) + ")");

            assertEquals(toHexString(0xffffff & rgb), toHexString(0xffffff & cielabXyzRgb));

            final ColorHunterLab hunterlab = ColorConversions.convertXyzToHunterLab(xyz);
            final ColorXyz hunterlabXyz = ColorConversions.convertHunterLabToXyz(hunterlab);
            final int hunterlabXyzRgb = ColorConversions.convertXyzToRgb(hunterlabXyz);

            Debug.debug("hunterlab: " + hunterlab);
            Debug.debug("hunterlabXyz: " + hunterlabXyz);
            Debug.debug("hunterlabXyzRgb: " + hunterlabXyzRgb + " ("
                            + Integer.toHexString(hunterlabXyzRgb) + ")");

            assertEquals(toHexString(0xffffff & rgb), toHexString(0xffffff & hunterlabXyzRgb));

            final ColorCieLch cielch = ColorConversions.convertCieLabToCieLch(cielab);
            final ColorCieLab cielchCielab = ColorConversions.convertCieLchToCieLab(cielch);

            Debug.debug("cielch", cielch);
            Debug.debug("cielchCielab", cielchCielab);

            final ColorCieLuv cieluv = ColorConversions.convertXyzToCieLuv(xyz);
            final ColorXyz cieluvXyz = ColorConversions.convertCieLuvToXyz(cieluv);

            Debug.debug("cieluv", cieluv);
            Debug.debug("cieluvXyz", cieluvXyz);
        }
    }
}
