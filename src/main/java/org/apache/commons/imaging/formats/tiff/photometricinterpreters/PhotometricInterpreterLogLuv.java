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

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.ImageBuilder;

/**
 * Photometric interpretation Logluv support. Logluv is an encoding for storing data inside TIFF images.
 *
 * @see <a href="https://en.wikipedia.org/wiki/Logluv_TIFF">Logluv TIFF</a>
 */
public class PhotometricInterpreterLogLuv extends PhotometricInterpreter {

    /**
     * Rgb values (reg-green-blue, as R-G-B, as in the RGB color model).
     */
    static class RgbValues {
        public int r;
        public int g;
        public int b;
    }

    /**
     * Tristimulus color values (red-green-blue, as X-Y-Z, in the CIE XYZ color space).
     */
    static class TristimulusValues {
        public float x;
        public float y;
        public float z;
    }

    public PhotometricInterpreterLogLuv(final int samplesPerPixel, final int[] bitsPerSample, final int predictor, final int width, final int height) {
        super(samplesPerPixel, bitsPerSample, predictor, width, height);
    }

    /**
     * Receives a triplet tristimulus values (CIE XYZ) and then does a CIELAB-CIEXYZ conversion (consult Wikipedia link for formula), where the CIELAB values
     * are used to calculate the tristimulus values of the reference white point.
     *
     * @param tristimulusValues the XYZ tristimulus values
     * @return RGB values
     * @see <a href="https://en.wikipedia.org/wiki/CIELAB_color_space">CIELAB color space</a>
     */
    RgbValues getRgbValues(final TristimulusValues tristimulusValues) {
        final float varX = tristimulusValues.x / 100f; // X = From 0 to ref_X
        final float varY = tristimulusValues.y / 100f; // Y = From 0 to ref_Y
        final float varZ = tristimulusValues.z / 100f; // Z = From 0 to ref_Y

        float varR = varX * 3.2406f + varY * -1.5372f + varZ * -0.4986f;
        float varG = varX * -0.9689f + varY * 1.8758f + varZ * 0.0415f;
        float varB = varX * 0.0557f + varY * -0.2040f + varZ * 1.0570f;

        if (varR > 0.0031308) {
            varR = 1.055f * (float) Math.pow(varR, 1 / 2.4) - 0.055f;
        } else {
            varR = 12.92f * varR;
        }
        if (varG > 0.0031308) {
            varG = 1.055f * (float) Math.pow(varG, 1 / 2.4) - 0.055f;
        } else {
            varG = 12.92f * varG;
        }

        if (varB > 0.0031308) {
            varB = 1.055f * (float) Math.pow(varB, 1 / 2.4) - 0.055f;
        } else {
            varB = 12.92f * varB;
        }

        // var_R = ((var_R + 0.16561039f) / (3.0152583f + 0.16561039f));
        // var_G = ((var_G + 0.06561642f) / (3.0239854f + 0.06561642f));
        // var_B = ((var_B + 0.19393992f) / (3.1043448f + 0.19393992f));

        final RgbValues values = new RgbValues();
        values.r = (int) (varR * 255f);
        values.g = (int) (varG * 255f);
        values.b = (int) (varB * 255f);
        return values;
    }

    /**
     * Receives a triplet of CIELAB values, and calculates the tristimulus values. The reference white point used here is the equivalent to summer sun and sky.
     *
     * @param cieL lightness from black to white
     * @param cieA lightness from green to red
     * @param cieB lightness from blue to yellow
     * @return tristimulus (X, Y, and Z) values
     * @see <a href="https://en.wikipedia.org/wiki/CIELAB_color_space">CIELAB color space</a>
     * @see <a href="https://en.wikipedia.org/wiki/White_point">White point</a>
     */
    TristimulusValues getTristimulusValues(final int cieL, final int cieA, final int cieB) {
        float varY = (cieL * 100.0f / 255.0f + 16.0f) / 116.0f;
        float varX = cieA / 500.0f + varY;
        float varZ = varY - cieB / 200.0f;

        final float varXCube = (float) Math.pow(varX, 3.0d);
        final float varYCube = (float) Math.pow(varY, 3.0d);
        final float varZCube = (float) Math.pow(varZ, 3.0d);

        if (varYCube > 0.008856f) {
            varY = varYCube;
        } else {
            varY = (varY - 16 / 116.0f) / 7.787f;
        }

        if (varXCube > 0.008856f) {
            varX = varXCube;
        } else {
            varX = (varX - 16 / 116.0f) / 7.787f;
        }

        if (varZCube > 0.008856f) {
            varZ = varZCube;
        } else {
            varZ = (varZ - 16 / 116.0f) / 7.787f;
        }

        // These reference values are the relative white points (XYZ) for commons scene types.
        // The chosen values here reflect a scene with Summer Sun and Sky, temperature of 6504 K,
        // X 95.047, Y 100.0, and Z 108.883.
        // See Color Science by Wyszecki and Stiles for more
        final float refX = 95.047f;
        final float refY = 100.000f;
        final float refZ = 108.883f;

        final TristimulusValues values = new TristimulusValues();
        values.x = refX * varX; // ref_X = 95.047 Observer= 2°, Illuminant= D65
        values.y = refY * varY; // ref_Y = 100.000
        values.z = refZ * varZ; // ref_Z = 108.883
        return values;
    }

    @Override
    public void interpretPixel(final ImageBuilder imageBuilder, final int[] samples, final int x, final int y) throws ImagingException, IOException {
        if (samples == null || samples.length != 3) {
            throw new ImagingException("Invalid length of bits per sample (expected 3).");
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
        final int rgb = alpha << 24 | red << 16 | green << 8 | blue << 0;
        imageBuilder.setRgb(x, y, rgb);

    }
}
