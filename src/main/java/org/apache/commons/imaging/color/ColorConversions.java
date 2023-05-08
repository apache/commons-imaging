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


public final class ColorConversions {

    /*
     * These constants are for CIEXYZ to CIELAB conversion.
     * For reference: <a href="https://en.wikipedia.org/wiki/CIELAB_color_space#From_CIEXYZ_to_CIELAB">From CIEXYZ to CIELAB, from CIELAB color space<a/>
     */
    // White reference
    private static final double REF_X = 95.047; // Observer= 2°, Illuminant= D65
    private static final double REF_Y = 100.000;
    private static final double REF_Z = 108.883;
    private static final double XYZ_m = 7.787037; // match in slope. Note commonly seen 7.787 gives worse results
    private static final double XYZ_t0 = 0.008856;

    private ColorConversions() {
    }

    public static ColorCieLab convertXYZtoCIELab(final ColorXyz xyz) {
        return convertXYZtoCIELab(xyz.X, xyz.Y, xyz.Z);
    }

    public static ColorCieLab convertXYZtoCIELab(final double X, final double Y, final double Z) {

        double var_X = X / REF_X; // REF_X = 95.047 Observer= 2°, Illuminant= D65
        double var_Y = Y / REF_Y; // REF_Y = 100.000
        double var_Z = Z / REF_Z; // REF_Z = 108.883

        // Pivot XÝZ:
        var_X = pivotXYZ(var_X);
        var_Y = pivotXYZ(var_Y);
        var_Z = pivotXYZ(var_Z);

        // Math.max added from https://github.com/muak/ColorMinePortable/blob/master/ColorMinePortable/ColorSpaces/Conversions/LabConverter.cs
        final double L = Math.max(0, 116 * var_Y - 16);
        final double a = 500 * (var_X - var_Y);
        final double b = 200 * (var_Y - var_Z);
        return new ColorCieLab(L, a, b);
    }

    public static ColorXyz convertCIELabtoXYZ(final ColorCieLab cielab) {
        return convertCIELabtoXYZ(cielab.L, cielab.a, cielab.b);
    }

    public static ColorXyz convertCIELabtoXYZ(final double L, final double a, final double b) {
        double var_Y = (L + 16) / 116.0;
        double var_X = a / 500 + var_Y;
        double var_Z = var_Y - b / 200.0;

        var_Y = unPivotXYZ(var_Y);
        var_X = unPivotXYZ(var_X);
        var_Z = unPivotXYZ(var_Z);

        final double X = REF_X * var_X; // REF_X = 95.047 Observer= 2°, Illuminant=
        // D65
        final double Y = REF_Y * var_Y; // REF_Y = 100.000
        final double Z = REF_Z * var_Z; // REF_Z = 108.883

        return new ColorXyz(X, Y, Z);
    }

    public static ColorHunterLab convertXYZtoHunterLab(final ColorXyz xyz) {
        return convertXYZtoHunterLab(xyz.X, xyz.Y, xyz.Z);
    }

    public static ColorHunterLab convertXYZtoHunterLab(final double X,
            final double Y, final double Z) {
        final double L = 10 * Math.sqrt(Y);
        final double a = Y == 0.0 ? 0.0 : 17.5 * (((1.02 * X) - Y) / Math.sqrt(Y));
        final double b = Y == 0.0 ? 0.0 : 7 * ((Y - (0.847 * Z)) / Math.sqrt(Y));

        return new ColorHunterLab(L, a, b);
    }

    public static ColorXyz convertHunterLabtoXYZ(final ColorHunterLab cielab) {
        return convertHunterLabtoXYZ(cielab.L, cielab.a, cielab.b);
    }

    public static ColorXyz convertHunterLabtoXYZ(final double L, final double a,
            final double b) {
        final double var_Y = L / 10;
        final double var_X = a / 17.5 * L / 10;
        final double var_Z = b / 7 * L / 10;

        final double Y = Math.pow(var_Y, 2);
        final double X = (var_X + Y) / 1.02;
        final double Z = -(var_Z - Y) / 0.847;

        return new ColorXyz(X, Y, Z);
    }


    public static int convertXYZtoRGB(final ColorXyz xyz) {
        return convertXYZtoRGB(xyz.X, xyz.Y, xyz.Z);
    }

    public static int convertXYZtoRGB(final double X, final double Y, final double Z) {
        // Observer = 2°, Illuminant = D65
        final double var_X = X / 100.0; // Where X = 0 ÷ 95.047
        final double var_Y = Y / 100.0; // Where Y = 0 ÷ 100.000
        final double var_Z = Z / 100.0; // Where Z = 0 ÷ 108.883

        // see: https://github.com/StanfordHCI/c3/blob/master/java/src/edu/stanford/vis/color/LAB.java
        double var_R = var_X * 3.2404542 + var_Y * -1.5371385 + var_Z * -0.4985314;
        double var_G = var_X * -0.9692660 + var_Y * 1.8760108 + var_Z * 0.0415560;
        double var_B = var_X * 0.0556434 + var_Y * -0.2040259 + var_Z * 1.0572252;

        // Attention: A lot of sources do list these values with less precision. But it makes a visual difference:
        // double var_R = var_X * 3.2406 + var_Y * -1.5372 + var_Z * -0.4986;
        // double var_G = var_X * -0.9689 + var_Y * 1.8758 + var_Z * 0.0415;
        // double var_B = var_X * 0.0557 + var_Y * -0.2040 + var_Z * 1.0570;

        var_R = pivotRGB(var_R);
        var_G = pivotRGB(var_G);
        var_B = pivotRGB(var_B);

        final double R = (var_R * 255);
        final double G = (var_G * 255);
        final double B = (var_B * 255);
        return convertRGBtoRGB(R, G, B);
    }

    // See also c# implementation:
    // https://github.com/muak/ColorMinePortable/blob/master/ColorMinePortable/ColorSpaces/Conversions/XyzConverter.cs
    public static ColorXyz convertRGBtoXYZ(final int rgb) {
        final int r = 0xff & (rgb >> 16);
        final int g = 0xff & (rgb >> 8);
        final int b = 0xff & (rgb >> 0);

        double var_R = r / 255.0; // Where R = 0 ÷ 255
        double var_G = g / 255.0; // Where G = 0 ÷ 255
        double var_B = b / 255.0; // Where B = 0 ÷ 255

        // Pivot RGB:
        var_R = unPivotRGB(var_R);
        var_G = unPivotRGB(var_G);
        var_B = unPivotRGB(var_B);

        var_R *= 100;
        var_G *= 100;
        var_B *= 100;

        // Observer. = 2°, Illuminant = D65
        // see: https://github.com/StanfordHCI/c3/blob/master/java/src/edu/stanford/vis/color/LAB.java
        final double X = var_R * 0.4124564 + var_G * 0.3575761 + var_B * 0.1804375;
        final double Y = var_R * 0.2126729 + var_G * 0.7151522 + var_B * 0.0721750;
        final double Z = var_R * 0.0193339 + var_G * 0.1191920 + var_B * 0.9503041;

        // Attention: A lot of sources do list these values with less precision. But it makes a visual difference:
        // final double X = var_R * 0.4124 + var_G * 0.3576 + var_B * 0.1805;
        // final double Y = var_R * 0.2126 + var_G * 0.7152 + var_B * 0.0722;
        // final double Z = var_R * 0.0193 + var_G * 0.1192 + var_B * 0.9505;

        return new ColorXyz(X, Y, Z);
    }

    public static ColorCmy convertRGBtoCMY(final int rgb) {
        final int R = 0xff & (rgb >> 16);
        final int G = 0xff & (rgb >> 8);
        final int B = 0xff & (rgb >> 0);

        // RGB values = 0 ÷ 255
        // CMY values = 0 ÷ 1

        final double C = 1 - (R / 255.0);
        final double M = 1 - (G / 255.0);
        final double Y = 1 - (B / 255.0);

        return new ColorCmy(C, M, Y);
    }

    public static int convertCMYtoRGB(final ColorCmy cmy) {
        // From Ghostscript's gdevcdj.c:
        // * Ghostscript: R = (1.0 - C) * (1.0 - K)
        // * Adobe: R = 1.0 - min(1.0, C + K)
        // and similarly for G and B.
        // This is Ghostscript's formula with K = 0.

        // CMY values = 0 ÷ 1
        // RGB values = 0 ÷ 255

        final double R = (1 - cmy.C) * 255.0;
        final double G = (1 - cmy.M) * 255.0;
        final double B = (1 - cmy.Y) * 255.0;

        return convertRGBtoRGB(R, G, B);
    }

    public static ColorCmyk convertCMYtoCMYK(final ColorCmy cmy) {
        // Where CMYK and CMY values = 0 ÷ 1

        double C = cmy.C;
        double M = cmy.M;
        double Y = cmy.Y;

        double var_K = 1.0;

        if (C < var_K) {
            var_K = C;
        }
        if (M < var_K) {
            var_K = M;
        }
        if (Y < var_K) {
            var_K = Y;
        }
        if (var_K == 1) { // Black
            C = 0;
            M = 0;
            Y = 0;
        } else {
            C = (C - var_K) / (1 - var_K);
            M = (M - var_K) / (1 - var_K);
            Y = (Y - var_K) / (1 - var_K);
        }
        return new ColorCmyk(C, M, Y, var_K);
    }

    public static ColorCmy convertCMYKtoCMY(final ColorCmyk cmyk) {
        return convertCMYKtoCMY(cmyk.C, cmyk.M, cmyk.Y, cmyk.K);
    }

    public static ColorCmy convertCMYKtoCMY(double C, double M, double Y,
            final double K) {
        // Where CMYK and CMY values = 0 ÷ 1

        C = (C * (1 - K) + K);
        M = (M * (1 - K) + K);
        Y = (Y * (1 - K) + K);

        return new ColorCmy(C, M, Y);
    }

    public static int convertCMYKtoRGB(final int c, final int m, final int y, final int k) {
        final double C = c / 255.0;
        final double M = m / 255.0;
        final double Y = y / 255.0;
        final double K = k / 255.0;

        return convertCMYtoRGB(convertCMYKtoCMY(C, M, Y, K));
    }

    public static ColorHsl convertRGBtoHSL(final int rgb) {

        final int R = 0xff & (rgb >> 16);
        final int G = 0xff & (rgb >> 8);
        final int B = 0xff & (rgb >> 0);

        final double var_R = (R / 255.0); // Where RGB values = 0 ÷ 255
        final double var_G = (G / 255.0);
        final double var_B = (B / 255.0);

        final double var_Min = Math.min(var_R, Math.min(var_G, var_B)); // Min. value
                                                                  // of RGB
        double var_Max;
        boolean maxIsR = false;
        boolean maxIsG = false;
        if (var_R >= var_G && var_R >= var_B) {
            var_Max = var_R;
            maxIsR = true;
        } else if (var_G > var_B) {
            var_Max = var_G;
            maxIsG = true;
        } else {
            var_Max = var_B;
        }
        final double del_Max = var_Max - var_Min; // Delta RGB value

        final double L = (var_Max + var_Min) / 2.0;

        double H, S;
        // Debug.debug("del_Max", del_Max);
        if (del_Max == 0) {
            // This is a gray, no chroma...

            H = 0; // HSL results = 0 ÷ 1
            S = 0;
        } else {
        // Chromatic data...

            // Debug.debug("L", L);

            if (L < 0.5) {
                S = del_Max / (var_Max + var_Min);
            } else {
                S = del_Max / (2 - var_Max - var_Min);
            }

            // Debug.debug("S", S);

            final double del_R = (((var_Max - var_R) / 6) + (del_Max / 2)) / del_Max;
            final double del_G = (((var_Max - var_G) / 6) + (del_Max / 2)) / del_Max;
            final double del_B = (((var_Max - var_B) / 6) + (del_Max / 2)) / del_Max;

            if (maxIsR) {
                H = del_B - del_G;
            } else if (maxIsG) {
                H = (1 / 3.0) + del_R - del_B;
            } else {
                H = (2 / 3.0) + del_G - del_R;
            }

            // Debug.debug("H1", H);

            if (H < 0) {
                H += 1;
            }
            if (H > 1) {
                H -= 1;
            }

            // Debug.debug("H2", H);
        }

        return new ColorHsl(H, S, L);
    }

    public static int convertHSLtoRGB(final ColorHsl hsl) {
        return convertHSLtoRGB(hsl.H, hsl.S, hsl.L);
    }

    public static int convertHSLtoRGB(final double H, final double S, final double L) {
        double R, G, B;

        if (S == 0) {
            // HSL values = 0 ÷ 1
            R = L * 255; // RGB results = 0 ÷ 255
            G = L * 255;
            B = L * 255;
        } else {
            double var_2;

            if (L < 0.5) {
                var_2 = L * (1 + S);
            } else {
                var_2 = (L + S) - (S * L);
            }

            final double var_1 = 2 * L - var_2;

            R = 255 * convertHuetoRGB(var_1, var_2, H + (1 / 3.0));
            G = 255 * convertHuetoRGB(var_1, var_2, H);
            B = 255 * convertHuetoRGB(var_1, var_2, H - (1 / 3.0));
        }

        return convertRGBtoRGB(R, G, B);
    }

    private static double convertHuetoRGB(final double v1, final double v2, double vH) {
        if (vH < 0) {
            vH += 1;
        }
        if (vH > 1) {
            vH -= 1;
        }
        if ((6 * vH) < 1) {
            return (v1 + (v2 - v1) * 6 * vH);
        }
        if ((2 * vH) < 1) {
            return (v2);
        }
        if ((3 * vH) < 2) {
            return (v1 + (v2 - v1) * ((2 / 3.0) - vH) * 6);
        }
        return (v1);
    }

    public static ColorHsv convertRGBtoHSV(final int rgb) {
        final int R = 0xff & (rgb >> 16);
        final int G = 0xff & (rgb >> 8);
        final int B = 0xff & (rgb >> 0);

        final double var_R = (R / 255.0); // RGB values = 0 ÷ 255
        final double var_G = (G / 255.0);
        final double var_B = (B / 255.0);

        final double var_Min = Math.min(var_R, Math.min(var_G, var_B)); // Min. value
                                                                  // of RGB
        boolean maxIsR = false;
        boolean maxIsG = false;
        double var_Max;
        if (var_R >= var_G && var_R >= var_B) {
            var_Max = var_R;
            maxIsR = true;
        } else if (var_G > var_B) {
            var_Max = var_G;
            maxIsG = true;
        } else {
            var_Max = var_B;
        }
        final double del_Max = var_Max - var_Min; // Delta RGB value

        final double V = var_Max;

        double H, S;
        if (del_Max == 0) {
            // This is a gray, no chroma...
            H = 0; // HSV results = 0 ÷ 1
            S = 0;
        } else {
        // Chromatic data...
            S = del_Max / var_Max;

            final double del_R = (((var_Max - var_R) / 6) + (del_Max / 2)) / del_Max;
            final double del_G = (((var_Max - var_G) / 6) + (del_Max / 2)) / del_Max;
            final double del_B = (((var_Max - var_B) / 6) + (del_Max / 2)) / del_Max;

            if (maxIsR) {
                H = del_B - del_G;
            } else if (maxIsG) {
                H = (1 / 3.0) + del_R - del_B;
            } else {
                H = (2 / 3.0) + del_G - del_R;
            }

            if (H < 0) {
                H += 1;
            }
            if (H > 1) {
                H -= 1;
            }
        }

        return new ColorHsv(H, S, V);
    }

    public static int convertHSVtoRGB(final ColorHsv HSV) {
        return convertHSVtoRGB(HSV.H, HSV.S, HSV.V);
    }

    public static int convertHSVtoRGB(final double H, final double S, final double V) {
        double R, G, B;

        if (S == 0) {
            // HSV values = 0 ÷ 1
            R = V * 255;
            G = V * 255;
            B = V * 255;
        } else {
            double var_h = H * 6;
            if (var_h == 6) {
                var_h = 0; // H must be < 1
            }
            final double var_i = Math.floor(var_h); // Or ... var_i = floor( var_h )
            final double var_1 = V * (1 - S);
            final double var_2 = V * (1 - S * (var_h - var_i));
            final double var_3 = V * (1 - S * (1 - (var_h - var_i)));

            double var_r, var_g, var_b;

            if (var_i == 0) {
                var_r = V;
                var_g = var_3;
                var_b = var_1;
            } else if (var_i == 1) {
                var_r = var_2;
                var_g = V;
                var_b = var_1;
            } else if (var_i == 2) {
                var_r = var_1;
                var_g = V;
                var_b = var_3;
            } else if (var_i == 3) {
                var_r = var_1;
                var_g = var_2;
                var_b = V;
            } else if (var_i == 4) {
                var_r = var_3;
                var_g = var_1;
                var_b = V;
            } else {
                var_r = V;
                var_g = var_1;
                var_b = var_2;
            }

            R = var_r * 255; // RGB results = 0 ÷ 255
            G = var_g * 255;
            B = var_b * 255;
        }

        return convertRGBtoRGB(R, G, B);
    }

    public static int convertCMYKtoRGB_Adobe(final int sc, final int sm, final int sy,
            final int sk) {
        final int red = 255 - (sc + sk);
        final int green = 255 - (sm + sk);
        final int blue = 255 - (sy + sk);

        return convertRGBtoRGB(red, green, blue);
    }

    private static double square(final double f) {
        return f * f;
    }

    public static int convertCIELabtoARGBTest(final int cieL, final int cieA, final int cieB) {
        double X, Y, Z;
        {

            double var_Y = ((cieL * 100.0 / 255.0) + 16.0) / 116.0;
            double var_X = cieA / 500.0 + var_Y;
            double var_Z = var_Y - cieB / 200.0;

            var_X = unPivotXYZ(var_X);
            var_Y = unPivotXYZ(var_Y);
            var_Z = unPivotXYZ(var_Z);

            X = REF_X * var_X; // REF_X = 95.047 Observer= 2°, Illuminant= D65
            Y = REF_Y * var_Y; // REF_Y = 100.000
            Z = REF_Z * var_Z; // REF_Z = 108.883

        }

        double R, G, B;
        {
            final double var_X = X / 100; // X = From 0 to REF_X
            final double var_Y = Y / 100; // Y = From 0 to REF_Y
            final double var_Z = Z / 100; // Z = From 0 to REF_Y

            double var_R = var_X * 3.2406 + var_Y * -1.5372 + var_Z * -0.4986;
            double var_G = var_X * -0.9689 + var_Y * 1.8758 + var_Z * 0.0415;
            double var_B = var_X * 0.0557 + var_Y * -0.2040 + var_Z * 1.0570;

            var_R = pivotRGB(var_R);
            var_G = pivotRGB(var_G);
            var_B = pivotRGB(var_B);

            R = (var_R * 255);
            G = (var_G * 255);
            B = (var_B * 255);
        }

        return convertRGBtoRGB(R, G, B);
    }

    private static int convertRGBtoRGB(final double R, final double G, final double B) {
        int red = (int) Math.round(R);
        int green = (int) Math.round(G);
        int blue = (int) Math.round(B);

        red = Math.min(255, Math.max(0, red));
        green = Math.min(255, Math.max(0, green));
        blue = Math.min(255, Math.max(0, blue));

        final int alpha = 0xff;

        return (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);
    }

    private static int convertRGBtoRGB(int red, int green, int blue) {
        red = Math.min(255, Math.max(0, red));
        green = Math.min(255, Math.max(0, green));
        blue = Math.min(255, Math.max(0, blue));

        final int alpha = 0xff;

        return (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);
    }

    public static ColorCieLch convertCIELabtoCIELCH(final ColorCieLab cielab) {
        return convertCIELabtoCIELCH(cielab.L, cielab.a, cielab.b);
    }

    public static ColorCieLch convertCIELabtoCIELCH(final double L, final double a, final double b) {
        // atan2(y,x) returns atan(y/x)
        final double atanba = Math.atan2(b, a); // Quadrant by signs

        final double h = atanba > 0 //
                ? Math.toDegrees(atanba) //
                : Math.toDegrees(atanba) + 360;

        // L = L;
        final double C = Math.sqrt(square(a) + square(b));

        return new ColorCieLch(L, C, h);
    }

    public static ColorCieLab convertCIELCHtoCIELab(final ColorCieLch cielch) {
        return convertCIELCHtoCIELab(cielch.L, cielch.C, cielch.h);
    }

    public static ColorCieLab convertCIELCHtoCIELab(final double L, final double C, final double H) {
        // Where CIE-H° = 0 ÷ 360°

        // CIE-L* = CIE-L;
        final double a = Math.cos(degree_2_radian(H)) * C;
        final double b = Math.sin(degree_2_radian(H)) * C;

        return new ColorCieLab(L, a, b);
    }

    public static double degree_2_radian(final double degree) {
        return degree * Math.PI / 180.0;
    }

    public static double radian_2_degree(final double radian) {
        return radian * 180.0 / Math.PI;
    }

    public static ColorCieLuv convertXYZtoCIELuv(final ColorXyz xyz) {
        return convertXYZtoCIELuv(xyz.X, xyz.Y, xyz.Z);
    }

    public static ColorCieLuv convertXYZtoCIELuv(final double X, final double Y, final double Z) {
        // problems here with div by zero

        final double var_U = (4 * X) / (X + (15 * Y) + (3 * Z));
        final double var_V = (9 * Y) / (X + (15 * Y) + (3 * Z));

        // Debug.debug("var_U", var_U);
        // Debug.debug("var_V", var_V);

        double var_Y = Y / 100.0;
        // Debug.debug("var_Y", var_Y);

        var_Y = pivotXYZ(var_Y);

        // Debug.debug("var_Y", var_Y);

        final double ref_U = (4 * REF_X) / (REF_X + (15 * REF_Y) + (3 * REF_Z));
        final double ref_V = (9 * REF_Y) / (REF_X + (15 * REF_Y) + (3 * REF_Z));

        // Debug.debug("ref_U", ref_U);
        // Debug.debug("ref_V", ref_V);

        final double L = (116 * var_Y) - 16;
        final double u = 13 * L * (var_U - ref_U);
        final double v = 13 * L * (var_V - ref_V);

        return new ColorCieLuv(L, u, v);
    }

    public static ColorXyz convertCIELuvtoXYZ(final ColorCieLuv cielch) {
        return convertCIELuvtoXYZ(cielch.L, cielch.u, cielch.v);
    }

    public static ColorXyz convertCIELuvtoXYZ(final double L, final double u, final double v) {
        // problems here with div by zero

        double var_Y = (L + 16) / 116.0;
        var_Y = unPivotXYZ(var_Y);

        final double ref_U = (4 * REF_X) / (REF_X + (15 * REF_Y) + (3 * REF_Z));
        final double ref_V = (9 * REF_Y) / (REF_X + (15 * REF_Y) + (3 * REF_Z));
        final double var_U = u / (13 * L) + ref_U;
        final double var_V = v / (13 * L) + ref_V;

        final double Y = var_Y * 100;
        final double X = -(9 * Y * var_U) / ((var_U - 4) * var_V - var_U * var_V);
        final double Z = (9 * Y - (15 * var_V * Y) - (var_V * X)) / (3 * var_V);

        return new ColorXyz(X, Y, Z);
    }

    public static ColorDin99Lab convertCIELabToDIN99bLab(final ColorCieLab cie) {
        return convertCIELabToDIN99bLab(cie.L, cie.a, cie.b);
    }

    public static ColorDin99Lab convertCIELabToDIN99bLab(final double L, final double a, final double b) {
        final double FAC_1 = 100.0 / Math.log(129.0 / 50.0); // = 105.51
        final double kE = 1.0; // brightness factor, 1.0 for CIE reference conditions
        final double kCH = 1.0; // chroma and hue factor, 1.0 for CIE reference conditions
        final double ang = Math.toRadians(16.0);

        final double L99 = kE * FAC_1 * Math.log(1. + 0.0158 * L);
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
        return new ColorDin99Lab(L99, a99, b99);
    }

    public static ColorCieLab convertDIN99bLabToCIELab(final ColorDin99Lab dinb) {
        return convertDIN99bLabToCIELab(dinb.L99, dinb.a99, dinb.b99);
    }

    public static ColorCieLab convertDIN99bLabToCIELab(final double L99b, final double a99b, final double b99b) {
        final double kE = 1.0; // brightness factor, 1.0 for CIE reference conditions
        final double kCH = 1.0; // chroma and hue factor, 1.0 for CIE reference conditions
        final double FAC_1 = 100.0 / Math.log(129.0 / 50.0); // L99 scaling factor = 105.50867113783109
        final double ang = Math.toRadians(16.0);

        final double hef = Math.atan2(b99b, a99b);
        final double C = Math.sqrt(a99b * a99b + b99b * b99b);
        final double G = (Math.exp(0.045 * C * kCH * kE) - 1.0) / 0.045;
        final double e = G * Math.cos(hef);
        final double f = G * Math.sin(hef) / 0.7;

        final double L = (Math.exp(L99b * kE / FAC_1) - 1.) / 0.0158;
        final double a = e * Math.cos(ang) - f * Math.sin(ang);
        final double b = e * Math.sin(ang) + f * Math.cos(ang);
        return new ColorCieLab(L, a, b);
    }

    /**
     * DIN99o.
     *
     * @param cie CIE color.
     * @return CIELab colors converted to DIN99oLab color space.
     * @see <a href="https://de.wikipedia.org/w/index.php?title=Diskussion:DIN99-Farbraum">https://de.wikipedia.org/w/index.php?title=Diskussion:DIN99-Farbraum</a>
     */
    public static ColorDin99Lab convertCIELabToDIN99oLab(final ColorCieLab cie) {
        return convertCIELabToDIN99oLab(cie.L, cie.a, cie.b);
    }

    /**
     * DIN99o.
     *
     * @param L lightness of color.
     * @param a position between red and green.
     * @param b position between yellow and blue.
     * @return CIBELab colors converted to DIN99oLab color space.
     * @see <a href="https://de.wikipedia.org/w/index.php?title=Diskussion:DIN99-Farbraum">https://de.wikipedia.org/w/index.php?title=Diskussion:DIN99-Farbraum</a>
     */
    public static ColorDin99Lab convertCIELabToDIN99oLab(final double L, final double a, final double b) {
        final double kE = 1.0; // brightness factor, 1.0 for CIE reference conditions
        final double kCH = 1.0; // chroma and hue factor, 1.0 for CIE reference conditions
        final double FAC_1 = 100.0 / Math.log(139.0 / 100.0); // L99 scaling factor = 303.67100547050995
        final double ang = Math.toRadians(26.0);

        final double L99o = FAC_1 / kE * Math.log(1 + 0.0039 * L); // Lightness correction kE
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
        return new ColorDin99Lab(L99o, a99o, b99o);
    }

    /**
     * DIN99o.
     *
     * @param dino color in the DIN99 color space.
     * @return DIN99o colors converted to CIELab color space.
     * @see <a href="https://de.wikipedia.org/w/index.php?title=Diskussion:DIN99-Farbraum">https://de.wikipedia.org/w/index.php?title=Diskussion:DIN99-Farbraum</a>
     */
    public static ColorCieLab convertDIN99oLabToCIELab(final ColorDin99Lab dino) {
        return convertDIN99oLabToCIELab(dino.L99, dino.a99, dino.b99);
    }

    /**
     * DIN99o.
     *
     * @param L99o lightness of color.
     * @param a99o position between red and green.
     * @param b99o position between yellow and blue.
     * @return DIN99o colors converted to CIELab color space.
     * @see <a href="https://de.wikipedia.org/w/index.php?title=Diskussion:DIN99-Farbraum">https://de.wikipedia.org/w/index.php?title=Diskussion:DIN99-Farbraum</a>
     */
    public static ColorCieLab convertDIN99oLabToCIELab(final double L99o, final double a99o, final double b99o) {
        final double kE = 1.0; // brightness factor, 1.0 for CIE reference conditions
        final double kCH = 1.0; // chroma and hue factor, 1.0 for CIE reference conditions
        final double FAC_1 = 100.0 / Math.log(139.0 / 100.0); // L99 scaling factor = 303.67100547050995
        final double ang = Math.toRadians(26.0);

        final double L = (Math.exp(L99o * kE / FAC_1) - 1.0) / 0.0039;

        final double h99ef = Math.atan2(b99o, a99o); // arctan in four quadrants

        final double heofo = h99ef - ang; // backwards hue rotation

        final double C99 = Math.sqrt(a99o * a99o + b99o * b99o); // DIN99 chroma
        final double G = (Math.exp(0.0435 * kE * kCH * C99) - 1.0) / 0.075; // factor for chroma decompression and viewing conditions
        final double e = G * Math.cos(heofo);
        final double f = G * Math.sin(heofo);

        final double a = e * Math.cos(ang) - f / 0.83 * Math.sin(ang); // rotation by 26 degrees
        final double b = e * Math.sin(ang) + f / 0.83 * Math.cos(ang); // rotation by 26 degrees

        return new ColorCieLab(L, a, b);
    }

    private static double pivotRGB(double n) {
        if (n > 0.0031308) {
            n = 1.055 * Math.pow(n, 1 / 2.4) - 0.055;
        } else {
            n = 12.92 * n;
        }
        return n;
    }

    private static double unPivotRGB(double n) {
        if (n > 0.04045) {
            n = Math.pow((n + 0.055) / 1.055, 2.4);
        } else {
            n = n / 12.92;
        }
        return n;
    }

    private static double pivotXYZ(double n) {
        if (n > XYZ_t0) {
            n = Math.pow(n, 1 / 3.0);
        } else {
            n = XYZ_m * n + 16 / 116.0;
        }
        return n;
    }

    private static double unPivotXYZ(double n) {
        final double nCube = Math.pow(n, 3);
        if (nCube > XYZ_t0) {
            n = nCube;
        } else {
            n = (n - 16 / 116.0) / XYZ_m;
        }
        return n;
    }

}
