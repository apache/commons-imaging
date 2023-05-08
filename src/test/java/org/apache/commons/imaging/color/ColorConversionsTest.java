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
    public void testRGBtoCMYK() {
        for (final int rgb : SAMPLE_RGBS) {
            final ColorCmy cmy = ColorConversions.convertRGBtoCMY(rgb);
            final ColorCmyk cmyk = ColorConversions.convertCMYtoCMYK(cmy);
            final ColorCmy cmyk_cmy = ColorConversions.convertCMYKtoCMY(cmyk);
            final int cmyk_cmy_rgb = ColorConversions.convertCMYtoRGB(cmyk_cmy);

            Debug.debug("cmy: " + cmy);
            Debug.debug("cmyk: " + cmyk);
            Debug.debug("cmyk_cmy: " + cmyk_cmy);
            Debug.debug("cmyk_cmy_rgb: " + cmyk_cmy_rgb + " (" + Integer.toHexString(cmyk_cmy_rgb) + ")");

            assertEquals(toHexString(0xffffff & rgb), toHexString(0xffffff & cmyk_cmy_rgb));
        }
    }

    @Test
    public void testCMYKtoCMYtoRGBtoCMYtoCMYK() {
        int magentaRGB = ColorConversions.convertCMYtoRGB(ColorConversions.convertCMYKtoCMY(ColorCmyk.MAGENTA));
        assertEquals(ColorCmyk.MAGENTA, ColorConversions.convertCMYtoCMYK(ColorConversions.convertRGBtoCMY(magentaRGB)));
    }

    @Test
    public void testCMYtoCMYKtoCMY() {
        for(int i = 0; i<5; i++){
            ColorCmy cmy1 = new ColorCmy(10 + 12 * i, 15*i, 60/(i+1));
            assertEquals(cmy1, ColorConversions.convertCMYKtoCMY(ColorConversions.convertCMYtoCMYK(cmy1)));
        }
    }
 
    @Test
    public void testRGBtoHSL() {
        for (final int rgb : SAMPLE_RGBS) {
            final ColorHsl hsl = ColorConversions.convertRGBtoHSL(rgb);
            final int hsl_rgb = ColorConversions.convertHSLtoRGB(hsl);

            Debug.debug("hsl: " + hsl);
            Debug.debug("hsl_rgb: " + hsl_rgb + " (" + Integer.toHexString(hsl_rgb) + ")");

            assertEquals(toHexString(0xffffff & rgb), toHexString(0xffffff & hsl_rgb));
        }
    }

    @Test
    public void testHSLtoRGBtoHSL() {
        assertEquals(ColorHsl.BLACK, ColorConversions.convertRGBtoHSL(ColorConversions.convertHSLtoRGB(ColorHsl.BLACK)));
    }

    @Test
    public void testRGBtoHSV() {
        for (final int rgb : SAMPLE_RGBS) {
            final ColorHsv hsv = ColorConversions.convertRGBtoHSV(rgb);
            final int hsv_rgb = ColorConversions.convertHSVtoRGB(hsv);
            Debug.debug("hsv: " + hsv);
            Debug.debug("hsv_rgb: " + hsv_rgb + " (" + Integer.toHexString(hsv_rgb) + ")");

            assertEquals(toHexString(0xffffff & rgb), toHexString(0xffffff & hsv_rgb));
        }
    }

    @Test
    public void testHSVtoRGBtoHSV() {
        assertEquals(ColorHsv.BLUE, ColorConversions.convertRGBtoHSV(ColorConversions.convertHSVtoRGB(ColorHsv.BLUE)));
    }

    @Test
    public void testXYZ() {
        for (final int rgb : SAMPLE_RGBS) {
            final ColorXyz xyz = ColorConversions.convertRGBtoXYZ(rgb);
            final int xyz_rgb = ColorConversions.convertXYZtoRGB(xyz);

            Debug.debug();
            Debug.debug("rgb: " + rgb + " (" + Integer.toHexString(rgb) + ")");
            Debug.debug("xyz: " + xyz);
            Debug.debug("xyz_rgb: " + xyz_rgb + " (" + Integer.toHexString(xyz_rgb) + ")");

            assertEquals(toHexString(0xffffff & rgb), toHexString(0xffffff & xyz_rgb), "rgb "+toHexString(rgb)+", "+xyz);

            final ColorCieLab cielab = ColorConversions.convertXYZtoCIELab(xyz);
            final ColorXyz cielab_xyz = ColorConversions.convertCIELabtoXYZ(cielab);
            final int cielab_xyz_rgb = ColorConversions.convertXYZtoRGB(cielab_xyz);

            Debug.debug("cielab: " + cielab);
            Debug.debug("cielab_xyz: " + cielab_xyz);
            Debug.debug("cielab_xyz_rgb: " + cielab_xyz_rgb + " (" + Integer.toHexString(cielab_xyz_rgb) + ")");

            assertEquals(toHexString(0xffffff & rgb), toHexString(0xffffff & cielab_xyz_rgb));

            final ColorHunterLab hunterlab = ColorConversions.convertXYZtoHunterLab(xyz);
            final ColorXyz hunterlab_xyz = ColorConversions.convertHunterLabtoXYZ(hunterlab);
            final int hunterlab_xyz_rgb = ColorConversions.convertXYZtoRGB(hunterlab_xyz);

            Debug.debug("hunterlab: " + hunterlab);
            Debug.debug("hunterlab_xyz: " + hunterlab_xyz);
            Debug.debug("hunterlab_xyz_rgb: " + hunterlab_xyz_rgb + " ("
                            + Integer.toHexString(hunterlab_xyz_rgb) + ")");

            assertEquals(toHexString(0xffffff & rgb), toHexString(0xffffff & hunterlab_xyz_rgb));

            final ColorCieLch cielch = ColorConversions.convertCIELabtoCIELCH(cielab);
            final ColorCieLab cielch_cielab = ColorConversions.convertCIELCHtoCIELab(cielch);

            Debug.debug("cielch", cielch);
            Debug.debug("cielch_cielab", cielch_cielab);

            final ColorCieLuv cieluv = ColorConversions.convertXYZtoCIELuv(xyz);
            final ColorXyz cieluv_xyz = ColorConversions.convertCIELuvtoXYZ(cieluv);

            Debug.debug("cieluv", cieluv);
            Debug.debug("cieluv_xyz", cieluv_xyz);
        }
    }

    @Test
    public void testCIELabtoXYZtoRGBtoXYZtoCIELab() {
        int greenRGB = ColorConversions.convertXYZtoRGB(ColorConversions.convertCIELabtoXYZ(ColorCieLab.GREEN));
        ColorCieLab greehCIELab = ColorConversions.convertXYZtoCIELab(ColorConversions.convertRGBtoXYZ(greenRGB));
        assertEquals(ColorCieLab.GREEN.L, greehCIELab.L, 0.3);
        assertEquals(ColorCieLab.GREEN.a, greehCIELab.a, 0.3);
        assertEquals(ColorCieLab.GREEN.b, greehCIELab.b, 0.3);
    }

    @Test
    public void testCIELUVtoXYZtoRGBtoXYZtoCIELUV() {
        int whiteRGB = ColorConversions.convertXYZtoRGB(ColorConversions.convertCIELuvtoXYZ(ColorCieLuv.WHITE));
        ColorCieLuv whiteCIELuv = ColorConversions.convertXYZtoCIELuv(ColorConversions.convertRGBtoXYZ(whiteRGB));
        assertEquals(ColorCieLuv.WHITE.L, whiteCIELuv.L,  0.1);
        assertEquals(ColorCieLuv.WHITE.u, whiteCIELuv.u,  0.1);
        assertEquals(ColorCieLuv.WHITE.v, whiteCIELuv.v,  0.1);
    }

    @Test
    public void testCIELchtoCIELabtoCIELch() {
        ColorCieLch redCIELch = ColorConversions.convertCIELabtoCIELCH(ColorConversions.convertCIELCHtoCIELab(ColorCieLch.RED));
        assertEquals(ColorCieLch.RED.L, redCIELch.L, 0.1);
        assertEquals(ColorCieLch.RED.C, redCIELch.C, 0.1);
        assertEquals(ColorCieLch.RED.h, redCIELch.h, 0.1);
    }

    @Test
    public void testRGBtoDin99b() {
        for (final int rgb : SAMPLE_RGBS) {

            final ColorXyz xyz = ColorConversions.convertRGBtoXYZ(rgb);
            final ColorCieLab cielab = ColorConversions.convertXYZtoCIELab(xyz);
            final ColorDin99Lab din99b = ColorConversions.convertCIELabToDIN99bLab(cielab);

            final ColorCieLab din99_cielab = ColorConversions.convertDIN99bLabToCIELab(din99b);
            final ColorXyz din99_cielab_xyz = ColorConversions.convertCIELabtoXYZ(din99_cielab);
            final int din99_cielab_xyz_rgb = ColorConversions.convertXYZtoRGB(din99_cielab_xyz);

            assertEquals(toHexString(0xffffff & rgb), toHexString(0xffffff & din99_cielab_xyz_rgb));
        }
    }

    @Test
    public void testRGBtoDin99o() {
        for (final int rgb : SAMPLE_RGBS) {

            final ColorXyz xyz = ColorConversions.convertRGBtoXYZ(rgb);
            final ColorCieLab cielab = ColorConversions.convertXYZtoCIELab(xyz);
            final ColorDin99Lab din99o = ColorConversions.convertCIELabToDIN99oLab(cielab);

            final ColorCieLab din99_cielab = ColorConversions.convertDIN99oLabToCIELab(din99o);
            final ColorXyz din99_cielab_xyz = ColorConversions.convertCIELabtoXYZ(din99_cielab);
            final int din99_cielab_xyz_rgb = ColorConversions.convertXYZtoRGB(din99_cielab_xyz);

            assertEquals(toHexString(0xffffff & rgb), toHexString(0xffffff & din99_cielab_xyz_rgb));
        }
    }

    @Test
    public void testCIELabToDIN99bLab() {
        ColorDin99Lab din99bLabColor = new ColorDin99Lab(61.43d, 28.64d, 11.11d);
        ColorDin99Lab compareColor = ColorConversions.convertCIELabToDIN99bLab(ColorConversions.convertDIN99bLabToCIELab(din99bLabColor));
        assertEquals(din99bLabColor.L99, compareColor.L99, 0.01);
        assertEquals(din99bLabColor.a99, compareColor.a99, 0.01);
        assertEquals(din99bLabColor.b99, compareColor.b99, 0.01);
    }

    @Test
    public void testCIELabToDIN99oLab() {
        ColorDin99Lab din99oLabColor = new ColorDin99Lab(54.098d, 31.237d, 28.076d);
        ColorDin99Lab compareColor = ColorConversions.convertCIELabToDIN99oLab(ColorConversions.convertDIN99oLabToCIELab(din99oLabColor));
        assertEquals(din99oLabColor.L99, compareColor.L99, 0.001);
        assertEquals(din99oLabColor.a99, compareColor.a99, 0.001);
        assertEquals(din99oLabColor.b99, compareColor.b99, 0.001);
    }

    @Test
    public void testHunterLabtoXYZtoRGBtoXYZtoHunterLab() {
        int greenRGB = ColorConversions.convertXYZtoRGB(ColorConversions.convertHunterLabtoXYZ(ColorHunterLab.GREEN));
        ColorHunterLab greenHunterLab = ColorConversions.convertXYZtoHunterLab(ColorConversions.convertRGBtoXYZ(greenRGB));
        assertEquals(ColorHunterLab.GREEN.L, greenHunterLab.L, 0.01);
        assertEquals(ColorHunterLab.GREEN.a, greenHunterLab.a, 0.01);
        assertEquals(ColorHunterLab.GREEN.b, greenHunterLab.b, 0.01);
    }
}
