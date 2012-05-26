/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */

package org.apache.commons.imaging.formats.jpeg.decoder;

public class YCbCrConverter {
    private static final int[] reds = new int[256 * 256];
    private static final int[] blues = new int[256 * 256];
    private static final int[] greens1 = new int[256 * 256];
    private static final int[] greens2 = new int[256 * 512];

    static {
        /*
         * Why use (Cr << 8) | Y and not (Y << 8) | Cr as the index? Y changes
         * often, while Cb and Cr is usually subsampled less often and repeats
         * itself between adjacent pixels, so using it as the high order byte
         * gives higher locality of reference.
         */
        for (int Y = 0; Y < 256; Y++) {
            for (int Cr = 0; Cr < 256; Cr++) {
                int r = Y + fastRound(1.402f * (Cr - 128));
                if (r < 0)
                    r = 0;
                if (r > 255)
                    r = 255;
                reds[(Cr << 8) | Y] = r << 16;
            }
        }
        for (int Y = 0; Y < 256; Y++) {
            for (int Cb = 0; Cb < 256; Cb++) {
                int b = Y + fastRound(1.772f * (Cb - 128));
                if (b < 0)
                    b = 0;
                if (b > 255)
                    b = 255;
                blues[(Cb << 8) | Y] = b;
            }
        }
        // green is the hardest
        // Math.round((float)(Y - 0.34414*(Cb-128) - 0.71414*(Cr-128)))
        // but Y is integral
        // = Y - Math.round((float)(0.34414*(Cb-128) + 0.71414*(Cr-128)))
        // = Y - Math.round(f(Cb, Cr))
        // where
        // f(Cb, Cr) = 0.34414*(Cb-128) + 0.71414*(Cr-128)
        // Cb and Cr terms each vary from 255-128 = 127 to 0-128 = -128
        // Linear function, so only examine endpoints:
        // Cb term Cr term Result
        // 127 127 134.4
        // -128 -128 -135.4
        // 127 -128 -47.7
        // -128 127 46.6
        // Thus with -135 being the minimum and 134 the maximum,
        // there is a range of 269 values,
        // and 135 needs to be added to make it zero-based.

        // As for Y - f(Cb, Cr)
        // the range becomes:
        // Y f(Cb, Cr)
        // 255 -135
        // 255 134
        // 0 -135
        // 0 134
        // thus the range is [-134,390] and has 524 values
        // but is clamped to [0, 255]
        for (int Cb = 0; Cb < 256; Cb++) {
            for (int Cr = 0; Cr < 256; Cr++) {
                int value = fastRound(0.34414f * (Cb - 128) + 0.71414f
                        * (Cr - 128));
                greens1[(Cb << 8) | Cr] = value + 135;
            }
        }
        for (int Y = 0; Y < 256; Y++) {
            for (int value = 0; value < 270; value++) {
                int green = Y - (value - 135);
                if (green < 0)
                    green = 0;
                else if (green > 255)
                    green = 255;
                greens2[(value << 8) | Y] = green << 8;
            }
        }
    }

    private static int fastRound(float x) {
        // Math.round() is very slow
        return (int) (x + 0.5f);
    }

    public static int convertYCbCrToRGB(int Y, int Cb, int Cr) {
        int r = reds[(Cr << 8) | Y];
        int g1 = greens1[(Cb << 8) | Cr];
        int g = greens2[(g1 << 8) | Y];
        int b = blues[(Cb << 8) | Y];
        return r | g | b;
    }
}
