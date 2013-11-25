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
    private static final double REF_X = 95.047;  // Observer= 2°, Illuminant= D65
    private static final double REF_Y = 100.000;
    private static final double REF_Z = 108.883;
    
    private ColorConversions() {
    }

    public static ColorCieLab convertXYZtoCIELab(final ColorXyz xyz) {
        return convertXYZtoCIELab(xyz.X, xyz.Y, xyz.Z);
    }

    public static ColorCieLab convertXYZtoCIELab(final double X, final double Y,
            final double Z) {

        double var_X = X / REF_X; // REF_X = 95.047 Observer= 2°, Illuminant=
                                  // D65
        double var_Y = Y / REF_Y; // REF_Y = 100.000
        double var_Z = Z / REF_Z; // REF_Z = 108.883

        if (var_X > 0.008856) {
            var_X = Math.pow(var_X, (1 / 3.0));
        } else {
            var_X = (7.787 * var_X) + (16 / 116.0);
        }
        if (var_Y > 0.008856) {
            var_Y = Math.pow(var_Y, 1 / 3.0);
        } else {
            var_Y = (7.787 * var_Y) + (16 / 116.0);
        }
        if (var_Z > 0.008856) {
            var_Z = Math.pow(var_Z, 1 / 3.0);
        } else {
            var_Z = (7.787 * var_Z) + (16 / 116.0);
        }

        final double L = (116 * var_Y) - 16;
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

        if (Math.pow(var_Y, 3) > 0.008856) {
            var_Y = Math.pow(var_Y, 3);
        } else {
            var_Y = (var_Y - 16 / 116.0) / 7.787;
        }
        if (Math.pow(var_X, 3) > 0.008856) {
            var_X = Math.pow(var_X, 3);
        } else {
            var_X = (var_X - 16 / 116.0) / 7.787;
        }
        if (Math.pow(var_Z, 3) > 0.008856) {
            var_Z = Math.pow(var_Z, 3);
        } else {
            var_Z = (var_Z - 16 / 116.0) / 7.787;
        }

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
        final double a = 17.5 * (((1.02 * X) - Y) / Math.sqrt(Y));
        final double b = 7 * ((Y - (0.847 * Z)) / Math.sqrt(Y));

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

        double var_R = var_X * 3.2406 + var_Y * -1.5372 + var_Z * -0.4986;
        double var_G = var_X * -0.9689 + var_Y * 1.8758 + var_Z * 0.0415;
        double var_B = var_X * 0.0557 + var_Y * -0.2040 + var_Z * 1.0570;

        if (var_R > 0.0031308) {
            var_R = 1.055 * Math.pow(var_R, (1 / 2.4)) - 0.055;
        } else {
            var_R = 12.92 * var_R;
        }
        if (var_G > 0.0031308) {
            var_G = 1.055 * Math.pow(var_G, (1 / 2.4)) - 0.055;
        } else {
            var_G = 12.92 * var_G;
        }
        if (var_B > 0.0031308) {
            var_B = 1.055 * Math.pow(var_B, (1 / 2.4)) - 0.055;
        } else {
            var_B = 12.92 * var_B;
        }

        final double R = (var_R * 255);
        final double G = (var_G * 255);
        final double B = (var_B * 255);

        return convertRGBtoRGB(R, G, B);
    }

    public static ColorXyz convertRGBtoXYZ(final int rgb) {
        final int r = 0xff & (rgb >> 16);
        final int g = 0xff & (rgb >> 8);
        final int b = 0xff & (rgb >> 0);

        double var_R = r / 255.0; // Where R = 0 ÷ 255
        double var_G = g / 255.0; // Where G = 0 ÷ 255
        double var_B = b / 255.0; // Where B = 0 ÷ 255

        if (var_R > 0.04045) {
            var_R = Math.pow((var_R + 0.055) / 1.055, 2.4);
        } else {
            var_R = var_R / 12.92;
        }
        if (var_G > 0.04045) {
            var_G = Math.pow((var_G + 0.055) / 1.055, 2.4);
        } else {
            var_G = var_G / 12.92;
        }
        if (var_B > 0.04045) {
            var_B = Math.pow((var_B + 0.055) / 1.055, 2.4);
        } else {
            var_B = var_B / 12.92;
        }

        var_R = var_R * 100;
        var_G = var_G * 100;
        var_B = var_B * 100;

        // Observer. = 2°, Illuminant = D65
        final double X = var_R * 0.4124 + var_G * 0.3576 + var_B * 0.1805;
        final double Y = var_R * 0.2126 + var_G * 0.7152 + var_B * 0.0722;
        final double Z = var_R * 0.0193 + var_G * 0.1192 + var_B * 0.9505;

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

    public static int convertCMYKtoRGB(final int c, final int m, final int y, final int k)
    // throws ImageReadException, IOException
    {
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

    private static double cube(final double f) {
        return f * f * f;
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

            final double var_x_cube = cube(var_X);
            final double var_y_cube = cube(var_Y);
            final double var_z_cube = cube(var_Z);

            if (var_y_cube > 0.008856) {
                var_Y = var_y_cube;
            } else {
                var_Y = (var_Y - 16 / 116.0) / 7.787;
            }

            if (var_x_cube > 0.008856) {
                var_X = var_x_cube;
            } else {
                var_X = (var_X - 16 / 116.0) / 7.787;
            }

            if (var_z_cube > 0.008856) {
                var_Z = var_z_cube;
            } else {
                var_Z = (var_Z - 16 / 116.0) / 7.787;
            }

            // double REF_X = 95.047;
            // double REF_Y = 100.000;
            // double REF_Z = 108.883;

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

            if (var_R > 0.0031308) {
                var_R = 1.055 * Math.pow(var_R, (1 / 2.4)) - 0.055;
            } else {
                var_R = 12.92 * var_R;
            }
            if (var_G > 0.0031308) {
                var_G = 1.055 * Math.pow(var_G, (1 / 2.4)) - 0.055;
            } else {
                var_G = 12.92 * var_G;
            }

            if (var_B > 0.0031308) {
                var_B = 1.055 * Math.pow(var_B, (1 / 2.4)) - 0.055;
            } else {
                var_B = 12.92 * var_B;
            }

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
        final int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);

        return rgb;
    }

    private static int convertRGBtoRGB(int red, int green, int blue) {
        red = Math.min(255, Math.max(0, red));
        green = Math.min(255, Math.max(0, green));
        blue = Math.min(255, Math.max(0, blue));

        final int alpha = 0xff;
        final int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);

        return rgb;
    }

    public static ColorCieLch convertCIELabtoCIELCH(final ColorCieLab cielab) {
        return convertCIELabtoCIELCH(cielab.L, cielab.a, cielab.b);
    }

    public static ColorCieLch convertCIELabtoCIELCH(final double L, final double a, final double b) {
        double var_H = Math.atan2(b, a); // Quadrant by signs

        if (var_H > 0) {
            var_H = (var_H / Math.PI) * 180.0;
        } else {
            var_H = 360 - radian_2_degree(Math.abs(var_H));
        }

        // L = L;
        final double C = Math.sqrt(square(a) + square(b));
        final double H = var_H;

        return new ColorCieLch(L, C, H);
    }

    public static ColorCieLab convertCIELCHtoCIELab(final ColorCieLch cielch) {
        return convertCIELCHtoCIELab(cielch.L, cielch.C, cielch.H);
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

        if (var_Y > 0.008856) {
            var_Y = Math.pow(var_Y, (1 / 3.0));
        } else {
            var_Y = (7.787 * var_Y) + (16 / 116.0);
        }

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

        double var_Y = (L + 16) / 116;
        if (Math.pow(var_Y, 3) > 0.008856) {
            var_Y = Math.pow(var_Y, 3);
        } else {
            var_Y = (var_Y - 16 / 116) / 7.787;
        }

        final double ref_U = (4 * REF_X) / (REF_X + (15 * REF_Y) + (3 * REF_Z));
        final double ref_V = (9 * REF_Y) / (REF_X + (15 * REF_Y) + (3 * REF_Z));
        final double var_U = u / (13 * L) + ref_U;
        final double var_V = v / (13 * L) + ref_V;

        final double Y = var_Y * 100;
        final double X = -(9 * Y * var_U) / ((var_U - 4) * var_V - var_U * var_V);
        final double Z = (9 * Y - (15 * var_V * Y) - (var_V * X)) / (3 * var_V);

        return new ColorXyz(X, Y, Z);
    }
}
