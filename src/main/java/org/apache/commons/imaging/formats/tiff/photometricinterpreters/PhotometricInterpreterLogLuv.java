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
package org.apache.commons.imaging.formats.tiff.photometricinterpreters;

import java.io.IOException;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.ImageBuilder;

/**
 * Photometric interpretation Logluv support. Logluv is an encoding for storing
 * data inside TIFF images.
 *
 * @see <a href="https://en.wikipedia.org/wiki/Logluv_TIFF">Logluv TIFF</a>
 */
public class PhotometricInterpreterLogLuv extends PhotometricInterpreter {

    /**
     * Tristimulus color values (red-green-blue, as X-Y-Z, in the CIE XYZ color space).
     */
    private static class TristimulusValues {
        public float x;
        public float y;
        public float z;
    }

    /**
     * Rgb values (reg-green-blue, as R-G-B, as in the RGB color model).
     */
    private static class RgbValues {
        public int r;
        public int g;
        public int b;
    }

    public PhotometricInterpreterLogLuv(final int samplesPerPixel,
            final int[] bitsPerSample, final int predictor, final int width, final int height) {
        super(samplesPerPixel, bitsPerSample, predictor, width, height);
    }

    private float cube(final float f) {
        return f * f * f;
    }

    @Override
    public void interpretPixel(final ImageBuilder imageBuilder, final int[] samples, final int x,
            final int y) throws ImageReadException, IOException {
        if (samples == null || samples.length != 3) {
            throw new ImageReadException("Invalid length of bits per sample (expected 3).");
        }

        // CIE illuminants. An illuminant is a theorical source of visible light with a profile.
        // CIE stands for Commission Internationale de l'Eclairage, or International
        // Comission on Illumination.
        final int cieL = samples[0];
        final int cieA = (byte) samples[1];
        final int cieB = (byte) samples[2];

        final TristimulusValues tristimulusValues = getTristimulusValues(cieL, cieA, cieB);

        // ref_X = 95.047 //Observer = 2°, Illuminant = D65
        // ref_Y = 100.000
        // ref_Z = 108.883

        final RgbValues rgbValues = getRgbValues(tristimulusValues);

        // float R = 1.910f * X - 0.532f * Y - 0.288f * Z;
        // float G = -0.985f * X + 1.999f * Y - 0.028f * Z;
        // float B = 0.058f * X - 0.118f * Y + 0.898f * Z;

        final int red = Math.min(255, Math.max(0, rgbValues.r));
        final int green = Math.min(255, Math.max(0, rgbValues.g));
        final int blue = Math.min(255, Math.max(0, rgbValues.b));
        final int alpha = 0xff;
        final int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);
        imageBuilder.setRGB(x, y, rgb);

    }

    /**
     * Receives a triplet of CIELAB values, and calculates the tristimulus values.
     * The reference white point used here is the equivalent to summer sun and sky.
     *
     * @param cieL lightness from black to white
     * @param cieA lightness from green to red
     * @param cieB lightness from blue to yellow
     * @return tristimulus (X, Y, and Z) values
     * @see <a href="https://en.wikipedia.org/wiki/CIELAB_color_space">CIELAB color space</a>
     * @see <a href="https://en.wikipedia.org/wiki/White_point">White point</a>
     */
    private TristimulusValues getTristimulusValues(int cieL, int cieA, int cieB) {
        float var_Y = ((cieL * 100.0f / 255.0f) + 16.0f) / 116.0f;
        float var_X = cieA / 500.0f + var_Y;
        float var_Z = var_Y - cieB / 200.0f;

        final float var_x_cube = cube(var_X);
        final float var_y_cube = cube(var_Y);
        final float var_z_cube = cube(var_Z);

        if (var_y_cube > 0.008856f) {
            var_Y = var_y_cube;
        } else {
            var_Y = (var_Y - 16 / 116.0f) / 7.787f;
        }

        if (var_x_cube > 0.008856f) {
            var_X = var_x_cube;
        } else {
            var_X = (var_X - 16 / 116.0f) / 7.787f;
        }

        if (var_z_cube > 0.008856f) {
            var_Z = var_z_cube;
        } else {
            var_Z = (var_Z - 16 / 116.0f) / 7.787f;
        }

        // These reference values are the relative white points (XYZ) for commons scene types.
        // The chosen values here reflect a scene with Summer Sun and Sky, temperature of 6504 K,
        // X 95.047, Y 100.0, and Z 108.883.
        // See Color Science by Wyszecki and Stiles for more
        final float ref_X = 95.047f;
        final float ref_Y = 100.000f;
        final float ref_Z = 108.883f;

        final TristimulusValues values = new TristimulusValues();
        values.x = ref_X * var_X; // ref_X = 95.047 Observer= 2°, Illuminant= D65
        values.y = ref_Y * var_Y; // ref_Y = 100.000
        values.z = ref_Z * var_Z; // ref_Z = 108.883
        return values;
    }

    /**
     * Receives a triplet tristimulus values (CIE XYZ) and then does a CIELAB-CIEXYZ
     * conversion (consult Wikipedia link for formula), where the CIELAB values are
     * used to calculate the tristimulus values of the reference white point.
     *
     * @param tristimulusValues the XYZ tristimulus values
     * @return RGB values
     * @see <a href="https://en.wikipedia.org/wiki/CIELAB_color_space">CIELAB color space</a>
     */
    private RgbValues getRgbValues(TristimulusValues tristimulusValues) {
        final float var_X = tristimulusValues.x / 100f; // X = From 0 to ref_X
        final float var_Y = tristimulusValues.y / 100f; // Y = From 0 to ref_Y
        final float var_Z = tristimulusValues.z / 100f; // Z = From 0 to ref_Y

        float var_R = var_X * 3.2406f + var_Y * -1.5372f + var_Z * -0.4986f;
        float var_G = var_X * -0.9689f + var_Y * 1.8758f + var_Z * 0.0415f;
        float var_B = var_X * 0.0557f + var_Y * -0.2040f + var_Z * 1.0570f;

        if (var_R > 0.0031308) {
            var_R = 1.055f * (float) Math.pow(var_R, (1 / 2.4)) - 0.055f;
        } else {
            var_R = 12.92f * var_R;
        }
        if (var_G > 0.0031308) {
            var_G = 1.055f * (float) Math.pow(var_G, (1 / 2.4)) - 0.055f;
        } else {
            var_G = 12.92f * var_G;
        }

        if (var_B > 0.0031308) {
            var_B = 1.055f * (float) Math.pow(var_B, (1 / 2.4)) - 0.055f;
        } else {
            var_B = 12.92f * var_B;
        }

        // var_R = ((var_R + 0.16561039f) / (3.0152583f + 0.16561039f));
        // var_G = ((var_G + 0.06561642f) / (3.0239854f + 0.06561642f));
        // var_B = ((var_B + 0.19393992f) / (3.1043448f + 0.19393992f));

        final RgbValues values = new RgbValues();
        values.r = (int) (var_R * 255f);
        values.g = (int) (var_G * 255f);
        values.b = (int) (var_B * 255f);
        return values;
    }
}
