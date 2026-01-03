/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.imaging.color;

/**
 * Color space conversions.
 */
public final class ColorConversions {

    // White reference
    /** See: https://en.wikipedia.org/wiki/CIELAB_color_space#From_CIEXYZ_to_CIELAB[10] */
    private static final double REF_X = 95.047; // Observer= 2°, Illuminant= D65

    /** See: https://en.wikipedia.org/wiki/CIELAB_color_space#From_CIEXYZ_to_CIELAB[10] */
    private static final double REF_Y = 100.000;

    /** See: https://en.wikipedia.org/wiki/CIELAB_color_space#From_CIEXYZ_to_CIELAB[10] */
    private static final double REF_Z = 108.883;

    /** See: https://en.wikipedia.org/wiki/CIELAB_color_space#From_CIEXYZ_to_CIELAB[10] */
    private static final double XYZ_m = 7.787037; // match in slope. Note commonly seen 7.787 gives worse results

    /** See: https://en.wikipedia.org/wiki/CIELAB_color_space#From_CIEXYZ_to_CIELAB[10] */
    private static final double XYZ_t0 = 0.008856;

    /**
     * Converts CIE L*a*b* color to ARGB (test version).
     *
     * @param cieL the L* value.
     * @param cieA the a* value.
     * @param cieB the b* value.
     * @return the ARGB color value.
     */
    public static int convertCieLabToArgbTest(final int cieL, final int cieA, final int cieB) {
        final double x;
        final double y;
        final double z;
        {

            double varY = (cieL * 100.0 / 255.0 + 16.0) / 116.0;
            double varX = cieA / 500.0 + varY;
            double varZ = varY - cieB / 200.0;

            varX = unPivotXyz(varX);
            varY = unPivotXyz(varY);
            varZ = unPivotXyz(varZ);

            x = REF_X * varX; // REF_X = 95.047 Observer= 2°, Illuminant= D65
            y = REF_Y * varY; // REF_Y = 100.000
            z = REF_Z * varZ; // REF_Z = 108.883

        }

        final double r;
        final double g;
        final double b;
        {
            final double varX = x / 100; // X = From 0 to REF_X
            final double varY = y / 100; // Y = From 0 to REF_Y
            final double varZ = z / 100; // Z = From 0 to REF_Y

            double varR = varX * 3.2406 + varY * -1.5372 + varZ * -0.4986;
            double varG = varX * -0.9689 + varY * 1.8758 + varZ * 0.0415;
            double varB = varX * 0.0557 + varY * -0.2040 + varZ * 1.0570;

            varR = pivotRgb(varR);
            varG = pivotRgb(varG);
            varB = pivotRgb(varB);

            r = varR * 255;
            g = varG * 255;
            b = varB * 255;
        }

        return convertRgbToRgb(r, g, b);
    }

    /**
     * Converts CIE L*a*b* to CIE LCH.
     *
     * @param cielab the CIE L*a*b* color.
     * @return the CIE LCH color.
     */
    public static ColorCieLch convertCieLabToCieLch(final ColorCieLab cielab) {
        return convertCieLabToCieLch(cielab.l, cielab.a, cielab.b);
    }

    /**
     * Converts CIE L*a*b* to CIE LCH.
     *
     * @param l the L* value.
     * @param a the a* value.
     * @param b the b* value.
     * @return the CIE LCH color.
     */
    public static ColorCieLch convertCieLabToCieLch(final double l, final double a, final double b) {
        // atan2(y, x) returns atan(y/x)
        final double atanba = Math.atan2(b, a); // Quadrant by signs

        final double h = atanba > 0 //
                ? Math.toDegrees(atanba) //
                : Math.toDegrees(atanba) + 360;

        // L = L;
        final double C = Math.sqrt(square(a) + square(b));

        return new ColorCieLch(l, C, h);
    }

    /**
     * Converts CIE L*a*b* to DIN99b Lab.
     *
     * @param cie the CIE L*a*b* color.
     * @return the DIN99b Lab color.
     */
    public static ColorDin99Lab convertCieLabToDin99bLab(final ColorCieLab cie) {
        return convertCieLabToDin99bLab(cie.l, cie.a, cie.b);
    }

    /**
     * Converts CIE L*a*b* to DIN99b Lab.
     *
     * @param l the L* value.
     * @param a the a* value.
     * @param b the b* value.
     * @return the DIN99b Lab color.
     */
    public static ColorDin99Lab convertCieLabToDin99bLab(final double l, final double a, final double b) {
        final double fac1 = 100.0 / Math.log(129.0 / 50.0); // = 105.51
        final double kE = 1.0; // brightness factor, 1.0 for CIE reference conditions
        final double kCH = 1.0; // chroma and hue factor, 1.0 for CIE reference conditions
        final double ang = Math.toRadians(16.0);

        final double l99 = kE * fac1 * Math.log(1. + 0.0158 * l);
        double a99 = 0.0;
        double b99 = 0.0;
        if (a != 0.0 || b != 0.0) {
            final double e = a * Math.cos(ang) + b * Math.sin(ang);
            final double f = 0.7 * (b * Math.cos(ang) - a * Math.sin(ang));
            final double G = Math.sqrt(e * e + f * f);
            if (G != 0.) {
                final double k = Math.log(1. + 0.045 * G) / (0.045 * kCH * kE * G);
                a99 = k * e;
                b99 = k * f;
            }
        }
        return new ColorDin99Lab(l99, a99, b99);
    }

    /**
     * DIN99o.
     *
     * @param cie CIE color.
     * @return CIELab colors converted to DIN99oLab color space.
     * @see <a href=
     *      "https://de.wikipedia.org/w/index.php?title=Diskussion:DIN99-Farbraum">https://de.wikipedia.org/w/index.php?title=Diskussion:DIN99-Farbraum</a>
     */
    public static ColorDin99Lab convertCieLabToDin99oLab(final ColorCieLab cie) {
        return convertCieLabToDin99oLab(cie.l, cie.a, cie.b);
    }

    /**
     * DIN99o.
     *
     * @param l lightness of color.
     * @param a position between red and green.
     * @param b position between yellow and blue.
     * @return CIBELab colors converted to DIN99oLab color space.
     * @see <a href=
     *      "https://de.wikipedia.org/w/index.php?title=Diskussion:DIN99-Farbraum">https://de.wikipedia.org/w/index.php?title=Diskussion:DIN99-Farbraum</a>
     */
    public static ColorDin99Lab convertCieLabToDin99oLab(final double l, final double a, final double b) {
        final double kE = 1.0; // brightness factor, 1.0 for CIE reference conditions
        final double kCH = 1.0; // chroma and hue factor, 1.0 for CIE reference conditions
        final double fac1 = 100.0 / Math.log(139.0 / 100.0); // L99 scaling factor = 303.67100547050995
        final double ang = Math.toRadians(26.0);

        final double l99o = fac1 / kE * Math.log(1 + 0.0039 * l); // Lightness correction kE
        double a99o = 0.0;
        double b99o = 0.0;
        if (a != 0.0 || b != 0.0) {
            final double eo = a * Math.cos(ang) + b * Math.sin(ang); // a stretching
            final double fo = 0.83 * (b * Math.cos(ang) - a * Math.sin(ang)); // b rotation/stretching
            final double Go = Math.sqrt(eo * eo + fo * fo); // chroma
            final double C99o = Math.log(1.0 + 0.075 * Go) / (0.0435 * kCH * kE); // factor for chroma compression and viewing conditions
            final double heofo = Math.atan2(fo, eo); // arctan in four quadrants
            final double h99o = heofo + ang; // hue rotation
            a99o = C99o * Math.cos(h99o);
            b99o = C99o * Math.sin(h99o);
        }
        return new ColorDin99Lab(l99o, a99o, b99o);
    }

    public static ColorXyz convertCieLabToXyz(final ColorCieLab cielab) {
        return convertCieLabToXyz(cielab.l, cielab.a, cielab.b);
    }

    public static ColorXyz convertCieLabToXyz(final double l, final double a, final double b) {
        double varY = (l + 16) / 116.0;
        double varX = a / 500 + varY;
        double varZ = varY - b / 200.0;

        varY = unPivotXyz(varY);
        varX = unPivotXyz(varX);
        varZ = unPivotXyz(varZ);

        final double x = REF_X * varX; // REF_X = 95.047 Observer= 2°, Illuminant=
        // D65
        final double y = REF_Y * varY; // REF_Y = 100.000
        final double z = REF_Z * varZ; // REF_Z = 108.883

        return new ColorXyz(x, y, z);
    }

    /**
     * Converts CIE LCH to CIE L*a*b*.
     *
     * @param cielch the CIE LCH color.
     * @return the CIE L*a*b* color.
     */
    public static ColorCieLab convertCieLchToCieLab(final ColorCieLch cielch) {
        return convertCieLchToCieLab(cielch.l, cielch.c, cielch.h);
    }

    /**
     * Converts CIE LCH to CIE L*a*b*.
     *
     * @param l the L* value.
     * @param c the C* value.
     * @param h the h° value.
     * @return the CIE L*a*b* color.
     */
    public static ColorCieLab convertCieLchToCieLab(final double l, final double c, final double h) {
        // Where CIE-H° = 0 ÷ 360°

        // CIE-L* = CIE-L;
        final double a = Math.cos(degree2radian(h)) * c;
        final double b = Math.sin(degree2radian(h)) * c;

        return new ColorCieLab(l, a, b);
    }

    public static ColorXyz convertCieLuvToXyz(final ColorCieLuv cielch) {
        return convertCieLuvToXyz(cielch.l, cielch.u, cielch.v);
    }

    public static ColorXyz convertCieLuvToXyz(final double l, final double u, final double v) {
        // problems here with div by zero

        final double varY = unPivotXyz((l + 16) / 116.0);

        final double refU = 4 * REF_X / (REF_X + 15 * REF_Y + 3 * REF_Z);
        final double refV = 9 * REF_Y / (REF_X + 15 * REF_Y + 3 * REF_Z);
        final double varU = u / (13 * l) + refU;
        final double varV = v / (13 * l) + refV;

        final double y = varY * 100;
        final double x = -(9 * y * varU) / ((varU - 4) * varV - varU * varV);
        final double z = (9 * y - 15 * varV * y - varV * x) / (3 * varV);

        return new ColorXyz(x, y, z);
    }

    public static ColorCmy convertCmykToCmy(final ColorCmyk cmyk) {
        return convertCmykToCmy(cmyk.c, cmyk.m, cmyk.y, cmyk.k);
    }

    public static ColorCmy convertCmykToCmy(double c, double m, double y, final double k) {
        // Where CMYK and CMY values = 0 ÷ 1

        c = c * (1 - k) + k;
        m = m * (1 - k) + k;
        y = y * (1 - k) + k;

        return new ColorCmy(c, m, y);
    }

    public static int convertCmykToRgb(final int c, final int m, final int y, final int k) {
        final double C = c / 255.0;
        final double M = m / 255.0;
        final double Y = y / 255.0;
        final double K = k / 255.0;

        return convertCmyToRgb(convertCmykToCmy(C, M, Y, K));
    }

    public static int convertCmykToRgbAdobe(final int sc, final int sm, final int sy, final int sk) {
        final int red = 255 - (sc + sk);
        final int green = 255 - (sm + sk);
        final int blue = 255 - (sy + sk);

        return convertRgbToRgb(red, green, blue);
    }

    public static ColorCmyk convertCmyToCmyk(final ColorCmy cmy) {
        // Where CMYK and CMY values = 0 ÷ 1

        double c = cmy.c;
        double m = cmy.m;
        double y = cmy.y;

        double varK = 1.0;

        if (c < varK) {
            varK = c;
        }
        if (m < varK) {
            varK = m;
        }
        if (y < varK) {
            varK = y;
        }
        if (varK == 1) { // Black
            c = 0;
            m = 0;
            y = 0;
        } else {
            c = (c - varK) / (1 - varK);
            m = (m - varK) / (1 - varK);
            y = (y - varK) / (1 - varK);
        }
        return new ColorCmyk(c, m, y, varK);
    }

    public static int convertCmyToRgb(final ColorCmy cmy) {
        // From Ghostscript's gdevcdj.c:
        // * Ghostscript: R = (1.0 - C) * (1.0 - K)
        // * Adobe: R = 1.0 - min(1.0, C + K)
        // and similarly for G and B.
        // This is Ghostscript's formula with K = 0.

        // CMY values = 0 ÷ 1
        // RGB values = 0 ÷ 255

        final double r = (1 - cmy.c) * 255.0;
        final double g = (1 - cmy.m) * 255.0;
        final double b = (1 - cmy.y) * 255.0;

        return convertRgbToRgb(r, g, b);
    }

    public static ColorCieLab convertDin99bLabToCieLab(final ColorDin99Lab dinb) {
        return convertDin99bLabToCieLab(dinb.l99, dinb.a99, dinb.b99);
    }

    public static ColorCieLab convertDin99bLabToCieLab(final double L99b, final double a99b, final double b99b) {
        final double kE = 1.0; // brightness factor, 1.0 for CIE reference conditions
        final double kCH = 1.0; // chroma and hue factor, 1.0 for CIE reference conditions
        final double fac1 = 100.0 / Math.log(129.0 / 50.0); // L99 scaling factor = 105.50867113783109
        final double ang = Math.toRadians(16.0);

        final double hef = Math.atan2(b99b, a99b);
        final double c = Math.sqrt(a99b * a99b + b99b * b99b);
        final double g = (Math.exp(0.045 * c * kCH * kE) - 1.0) / 0.045;
        final double e = g * Math.cos(hef);
        final double f = g * Math.sin(hef) / 0.7;

        final double l = (Math.exp(L99b * kE / fac1) - 1.) / 0.0158;
        final double a = e * Math.cos(ang) - f * Math.sin(ang);
        final double b = e * Math.sin(ang) + f * Math.cos(ang);
        return new ColorCieLab(l, a, b);
    }

    /**
     * DIN99o.
     *
     * @param dino color in the DIN99 color space.
     * @return DIN99o colors converted to CIELab color space.
     * @see <a href=
     *      "https://de.wikipedia.org/w/index.php?title=Diskussion:DIN99-Farbraum">https://de.wikipedia.org/w/index.php?title=Diskussion:DIN99-Farbraum</a>
     */
    public static ColorCieLab convertDin99oLabToCieLab(final ColorDin99Lab dino) {
        return convertDin99oLabToCieLab(dino.l99, dino.a99, dino.b99);
    }

    /**
     * DIN99o.
     *
     * @param l99o lightness of color.
     * @param a99o position between red and green.
     * @param b99o position between yellow and blue.
     * @return DIN99o colors converted to CIELab color space.
     * @see <a href=
     *      "https://de.wikipedia.org/w/index.php?title=Diskussion:DIN99-Farbraum">https://de.wikipedia.org/w/index.php?title=Diskussion:DIN99-Farbraum</a>
     */
    public static ColorCieLab convertDin99oLabToCieLab(final double l99o, final double a99o, final double b99o) {
        final double kE = 1.0; // brightness factor, 1.0 for CIE reference conditions
        final double kCH = 1.0; // chroma and hue factor, 1.0 for CIE reference conditions
        final double fac1 = 100.0 / Math.log(139.0 / 100.0); // L99 scaling factor = 303.67100547050995
        final double ang = Math.toRadians(26.0);

        final double l = (Math.exp(l99o * kE / fac1) - 1.0) / 0.0039;

        final double h99ef = Math.atan2(b99o, a99o); // arctan in four quadrants

        final double heofo = h99ef - ang; // backwards hue rotation

        final double c99 = Math.sqrt(a99o * a99o + b99o * b99o); // DIN99 chroma
        final double g = (Math.exp(0.0435 * kE * kCH * c99) - 1.0) / 0.075; // factor for chroma decompression and viewing conditions
        final double e = g * Math.cos(heofo);
        final double f = g * Math.sin(heofo);

        final double a = e * Math.cos(ang) - f / 0.83 * Math.sin(ang); // rotation by 26 degrees
        final double b = e * Math.sin(ang) + f / 0.83 * Math.cos(ang); // rotation by 26 degrees

        return new ColorCieLab(l, a, b);
    }

    public static int convertHslToRgb(final ColorHsl hsl) {
        return convertHslToRgb(hsl.h, hsl.s, hsl.l);
    }

    public static int convertHslToRgb(final double h, final double s, final double l) {
        final double r;
        final double g;
        final double b;
        if (s == 0) {
            // HSL values = 0 ÷ 1
            r = l * 255; // RGB results = 0 ÷ 255
            g = l * 255;
            b = l * 255;
        } else {
            final double var2;

            if (l < 0.5) {
                var2 = l * (1 + s);
            } else {
                var2 = l + s - s * l;
            }

            final double var1 = 2 * l - var2;

            r = 255 * convertHueToRgb(var1, var2, h + 1 / 3.0);
            g = 255 * convertHueToRgb(var1, var2, h);
            b = 255 * convertHueToRgb(var1, var2, h - 1 / 3.0);
        }

        return convertRgbToRgb(r, g, b);
    }

    public static int convertHsvToRgb(final ColorHsv HSV) {
        return convertHsvToRgb(HSV.h, HSV.s, HSV.v);
    }

    public static int convertHsvToRgb(final double h, final double s, final double v) {
        final double r;
        final double g;
        final double b;
        if (s == 0) {
            // HSV values = 0 ÷ 1
            r = v * 255;
            g = v * 255;
            b = v * 255;
        } else {
            double varH = h * 6;
            if (varH == 6) {
                varH = 0; // H must be < 1
            }
            final double varI = Math.floor(varH); // Or ... varI = floor( varH )
            final double var1 = v * (1 - s);
            final double var2 = v * (1 - s * (varH - varI));
            final double var3 = v * (1 - s * (1 - (varH - varI)));

            final double varR;
            final double varG;
            final double varB;

            if (varI == 0) {
                varR = v;
                varG = var3;
                varB = var1;
            } else if (varI == 1) {
                varR = var2;
                varG = v;
                varB = var1;
            } else if (varI == 2) {
                varR = var1;
                varG = v;
                varB = var3;
            } else if (varI == 3) {
                varR = var1;
                varG = var2;
                varB = v;
            } else if (varI == 4) {
                varR = var3;
                varG = var1;
                varB = v;
            } else {
                varR = v;
                varG = var1;
                varB = var2;
            }

            r = varR * 255; // RGB results = 0 ÷ 255
            g = varG * 255;
            b = varB * 255;
        }

        return convertRgbToRgb(r, g, b);
    }

    private static double convertHueToRgb(final double v1, final double v2, double vH) {
        if (vH < 0) {
            vH += 1;
        }
        if (vH > 1) {
            vH -= 1;
        }
        if (6 * vH < 1) {
            return v1 + (v2 - v1) * 6 * vH;
        }
        if (2 * vH < 1) {
            return v2;
        }
        if (3 * vH < 2) {
            return v1 + (v2 - v1) * (2 / 3.0 - vH) * 6;
        }
        return v1;
    }

    public static ColorXyz convertHunterLabToXyz(final ColorHunterLab cielab) {
        return convertHunterLabToXyz(cielab.l, cielab.a, cielab.b);
    }

    public static ColorXyz convertHunterLabToXyz(final double l, final double a, final double b) {
        final double varY = l / 10;
        final double varX = a / 17.5 * l / 10;
        final double varZ = b / 7 * l / 10;

        final double y = Math.pow(varY, 2);
        final double x = (varX + y) / 1.02;
        final double z = -(varZ - y) / 0.847;

        return new ColorXyz(x, y, z);
    }

    public static ColorCmy convertRgbToCmy(final int rgb) {
        final int r = 0xff & rgb >> 16;
        final int g = 0xff & rgb >> 8;
        final int b = 0xff & rgb >> 0;

        // RGB values = 0 ÷ 255
        // CMY values = 0 ÷ 1

        final double c = 1 - r / 255.0;
        final double m = 1 - g / 255.0;
        final double y = 1 - b / 255.0;

        return new ColorCmy(c, m, y);
    }

    public static ColorHsl convertRgbToHsl(final int rgb) {

        final int r = 0xff & rgb >> 16;
        final int g = 0xff & rgb >> 8;
        final int b = 0xff & rgb >> 0;

        final double varR = r / 255.0; // Where RGB values = 0 ÷ 255
        final double varG = g / 255.0;
        final double varB = b / 255.0;

        final double varMin = Math.min(varR, Math.min(varG, varB)); // Min. value
                                                                    // of RGB
        final double varMax;
        boolean maxIsR = false;
        boolean maxIsG = false;
        if (varR >= varG && varR >= varB) {
            varMax = varR;
            maxIsR = true;
        } else if (varG > varB) {
            varMax = varG;
            maxIsG = true;
        } else {
            varMax = varB;
        }
        final double delMax = varMax - varMin; // Delta RGB value

        final double l = (varMax + varMin) / 2.0;

        double h;
        final double s;
        // Debug.debug("del_Max", del_Max);
        if (delMax == 0) {
            // This is a gray, no chroma...

            h = 0; // HSL results = 0 ÷ 1
            s = 0;
        } else {
            // Chromatic data...

            // Debug.debug("L", L);

            if (l < 0.5) {
                s = delMax / (varMax + varMin);
            } else {
                s = delMax / (2 - varMax - varMin);
            }

            // Debug.debug("S", S);

            final double delR = ((varMax - varR) / 6 + delMax / 2) / delMax;
            final double delG = ((varMax - varG) / 6 + delMax / 2) / delMax;
            final double delB = ((varMax - varB) / 6 + delMax / 2) / delMax;

            if (maxIsR) {
                h = delB - delG;
            } else if (maxIsG) {
                h = 1 / 3.0 + delR - delB;
            } else {
                h = 2 / 3.0 + delG - delR;
            }

            // Debug.debug("H1", H);

            if (h < 0) {
                h += 1;
            }
            if (h > 1) {
                h -= 1;
            }

            // Debug.debug("H2", H);
        }

        return new ColorHsl(h, s, l);
    }

    public static ColorHsv convertRgbToHsv(final int rgb) {
        final int r = 0xff & rgb >> 16;
        final int g = 0xff & rgb >> 8;
        final int b = 0xff & rgb >> 0;

        final double varR = r / 255.0; // RGB values = 0 ÷ 255
        final double varG = g / 255.0;
        final double varB = b / 255.0;

        final double varMin = Math.min(varR, Math.min(varG, varB)); // Min. value
                                                                    // of RGB
        boolean maxIsR = false;
        boolean maxIsG = false;
        final double varMax;
        if (varR >= varG && varR >= varB) {
            varMax = varR;
            maxIsR = true;
        } else if (varG > varB) {
            varMax = varG;
            maxIsG = true;
        } else {
            varMax = varB;
        }
        final double delMax = varMax - varMin; // Delta RGB value

        final double v = varMax;

        double h;
        final double s;
        if (delMax == 0) {
            // This is a gray, no chroma...
            h = 0; // HSV results = 0 ÷ 1
            s = 0;
        } else {
            // Chromatic data...
            s = delMax / varMax;

            final double delR = ((varMax - varR) / 6 + delMax / 2) / delMax;
            final double delG = ((varMax - varG) / 6 + delMax / 2) / delMax;
            final double delB = ((varMax - varB) / 6 + delMax / 2) / delMax;

            if (maxIsR) {
                h = delB - delG;
            } else if (maxIsG) {
                h = 1 / 3.0 + delR - delB;
            } else {
                h = 2 / 3.0 + delG - delR;
            }

            if (h < 0) {
                h += 1;
            }
            if (h > 1) {
                h -= 1;
            }
        }

        return new ColorHsv(h, s, v);
    }

    private static int convertRgbToRgb(final double r, final double g, final double b) {
        int red = (int) Math.round(r);
        int green = (int) Math.round(g);
        int blue = (int) Math.round(b);

        red = Math.min(255, Math.max(0, red));
        green = Math.min(255, Math.max(0, green));
        blue = Math.min(255, Math.max(0, blue));

        final int alpha = 0xff;

        return alpha << 24 | red << 16 | green << 8 | blue << 0;
    }

    private static int convertRgbToRgb(int red, int green, int blue) {
        red = Math.min(255, Math.max(0, red));
        green = Math.min(255, Math.max(0, green));
        blue = Math.min(255, Math.max(0, blue));

        final int alpha = 0xff;

        return alpha << 24 | red << 16 | green << 8 | blue << 0;
    }

    // See also c# implementation:
    // https://github.com/muak/ColorMinePortable/blob/master/ColorMinePortable/ColorSpaces/Conversions/XyzConverter.cs
    public static ColorXyz convertRgbToXyz(final int rgb) {
        final int r = 0xff & rgb >> 16;
        final int g = 0xff & rgb >> 8;
        final int b = 0xff & rgb >> 0;

        double varR = r / 255.0; // Where R = 0 ÷ 255
        double varG = g / 255.0; // Where G = 0 ÷ 255
        double varB = b / 255.0; // Where B = 0 ÷ 255

        // Pivot RGB:
        varR = unPivotRgb(varR);
        varG = unPivotRgb(varG);
        varB = unPivotRgb(varB);

        varR *= 100;
        varG *= 100;
        varB *= 100;

        // Observer. = 2°, Illuminant = D65
        // see: https://github.com/StanfordHCI/c3/blob/master/java/src/edu/stanford/vis/color/LAB.java
        final double X = varR * 0.4124564 + varG * 0.3575761 + varB * 0.1804375;
        final double Y = varR * 0.2126729 + varG * 0.7151522 + varB * 0.0721750;
        final double Z = varR * 0.0193339 + varG * 0.1191920 + varB * 0.9503041;

        // Attention: A lot of sources do list these values with less precision. But it makes a visual difference:
        // final double X = var_R * 0.4124 + var_G * 0.3576 + var_B * 0.1805;
        // final double Y = var_R * 0.2126 + var_G * 0.7152 + var_B * 0.0722;
        // final double Z = var_R * 0.0193 + var_G * 0.1192 + var_B * 0.9505;

        return new ColorXyz(X, Y, Z);
    }

    public static ColorCieLuv convertXuzToCieLuv(final double x, final double y, final double z) {
        // problems here with div by zero

        final double varU = 4 * x / (x + 15 * y + 3 * z);
        final double varV = 9 * y / (x + 15 * y + 3 * z);

        // Debug.debug("var_U", var_U);
        // Debug.debug("var_V", var_V);

        double varY = y / 100.0;
        // Debug.debug("var_Y", var_Y);

        varY = pivotXyz(varY);

        // Debug.debug("var_Y", var_Y);

        final double refU = 4 * REF_X / (REF_X + 15 * REF_Y + 3 * REF_Z);
        final double refV = 9 * REF_Y / (REF_X + 15 * REF_Y + 3 * REF_Z);

        // Debug.debug("ref_U", ref_U);
        // Debug.debug("ref_V", ref_V);

        final double l = 116 * varY - 16;
        final double u = 13 * l * (varU - refU);
        final double v = 13 * l * (varV - refV);

        return new ColorCieLuv(l, u, v);
    }

    public static ColorCieLab convertXyzToCieLab(final ColorXyz xyz) {
        return convertXyzToCieLab(xyz.x, xyz.y, xyz.z);
    }

    public static ColorCieLab convertXyzToCieLab(final double x, final double y, final double z) {

        double varX = x / REF_X; // REF_X = 95.047 Observer= 2°, Illuminant= D65
        double varY = y / REF_Y; // REF_Y = 100.000
        double varZ = z / REF_Z; // REF_Z = 108.883

        // Pivot XÝZ:
        varX = pivotXyz(varX);
        varY = pivotXyz(varY);
        varZ = pivotXyz(varZ);

        // Math.max added from https://github.com/muak/ColorMinePortable/blob/master/ColorMinePortable/ColorSpaces/Conversions/LabConverter.cs
        final double l = Math.max(0, 116 * varY - 16);
        final double a = 500 * (varX - varY);
        final double b = 200 * (varY - varZ);
        return new ColorCieLab(l, a, b);
    }

    public static ColorCieLuv convertXyzToCieLuv(final ColorXyz xyz) {
        return convertXuzToCieLuv(xyz.x, xyz.y, xyz.z);
    }

    public static ColorHunterLab convertXyzToHunterLab(final ColorXyz xyz) {
        return convertXyzToHunterLab(xyz.x, xyz.y, xyz.z);
    }

    public static ColorHunterLab convertXyzToHunterLab(final double x, final double y, final double z) {
        final double l = 10 * Math.sqrt(y);
        final double a = y == 0.0 ? 0.0 : 17.5 * ((1.02 * x - y) / Math.sqrt(y));
        final double b = y == 0.0 ? 0.0 : 7 * ((y - 0.847 * z) / Math.sqrt(y));

        return new ColorHunterLab(l, a, b);
    }

    public static int convertXyzToRgb(final ColorXyz xyz) {
        return convertXyzToRgb(xyz.x, xyz.y, xyz.z);
    }

    public static int convertXyzToRgb(final double x, final double y, final double z) {
        // Observer = 2°, Illuminant = D65
        final double varX = x / 100.0; // Where X = 0 ÷ 95.047
        final double varY = y / 100.0; // Where Y = 0 ÷ 100.000
        final double varZ = z / 100.0; // Where Z = 0 ÷ 108.883

        // see: https://github.com/StanfordHCI/c3/blob/master/java/src/edu/stanford/vis/color/LAB.java
        double varR = varX * 3.2404542 + varY * -1.5371385 + varZ * -0.4985314;
        double varG = varX * -0.9692660 + varY * 1.8760108 + varZ * 0.0415560;
        double varB = varX * 0.0556434 + varY * -0.2040259 + varZ * 1.0572252;

        // Attention: A lot of sources do list these values with less precision. But it makes a visual difference:
        // double var_R = var_X * 3.2406 + var_Y * -1.5372 + var_Z * -0.4986;
        // double var_G = var_X * -0.9689 + var_Y * 1.8758 + var_Z * 0.0415;
        // double var_B = var_X * 0.0557 + var_Y * -0.2040 + var_Z * 1.0570;

        varR = pivotRgb(varR);
        varG = pivotRgb(varG);
        varB = pivotRgb(varB);

        final double r = varR * 255;
        final double g = varG * 255;
        final double b = varB * 255;
        return convertRgbToRgb(r, g, b);
    }

    public static double degree2radian(final double degree) {
        return degree * Math.PI / 180.0;
    }

    private static double pivotRgb(double n) {
        if (n > 0.0031308) {
            n = 1.055 * Math.pow(n, 1 / 2.4) - 0.055;
        } else {
            n = 12.92 * n;
        }
        return n;
    }

    private static double pivotXyz(double n) {
        if (n > XYZ_t0) {
            n = Math.pow(n, 1 / 3.0);
        } else {
            n = XYZ_m * n + 16 / 116.0;
        }
        return n;
    }

    public static double radian2degree(final double radian) {
        return radian * 180.0 / Math.PI;
    }

    private static double square(final double f) {
        return f * f;
    }

    private static double unPivotRgb(double n) {
        if (n > 0.04045) {
            n = Math.pow((n + 0.055) / 1.055, 2.4);
        } else {
            n /= 12.92;
        }
        return n;
    }

    private static double unPivotXyz(double n) {
        final double nCube = Math.pow(n, 3);
        if (nCube > XYZ_t0) {
            n = nCube;
        } else {
            n = (n - 16 / 116.0) / XYZ_m;
        }
        return n;
    }

    private ColorConversions() {
    }

}
