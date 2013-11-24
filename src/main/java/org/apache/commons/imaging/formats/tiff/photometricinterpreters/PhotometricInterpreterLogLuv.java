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

public class PhotometricInterpreterLogLuv extends PhotometricInterpreter {
    // private final boolean yOnly;

    public PhotometricInterpreterLogLuv(final int fSamplesPerPixel,
            final int fBitsPerSample[], final int predictor, final int width, final int height) {
        super(fSamplesPerPixel, fBitsPerSample, predictor, width, height);

        // this.yOnly = yonly;
    }

    private float cube(final float f) {
        return f * f * f;
    }

    // private float function_f(float value, )

    @Override
    public void interpretPixel(final ImageBuilder imageBuilder, final int samples[], final int x,
            final int y) throws ImageReadException, IOException {
        float X, Y, Z;

        final int cieL = samples[0];
        final int cieA = (byte) samples[1];
        final int cieB = (byte) samples[2];

        {

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

            final float ref_X = 95.047f;
            final float ref_Y = 100.000f;
            final float ref_Z = 108.883f;

            X = ref_X * var_X; // ref_X = 95.047 Observer= 2°, Illuminant= D65
            Y = ref_Y * var_Y; // ref_Y = 100.000
            Z = ref_Z * var_Z; // ref_Z = 108.883

        }

        // ref_X = 95.047 //Observer = 2°, Illuminant = D65
        // ref_Y = 100.000
        // ref_Z = 108.883

        int R, G, B;
        {
            final float var_X = X / 100f; // X = From 0 to ref_X
            final float var_Y = Y / 100f; // Y = From 0 to ref_Y
            final float var_Z = Z / 100f; // Z = From 0 to ref_Y

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

            // var_R = (((var_R-)))
            // updateMaxMin(new float[]{
            // var_R, var_G, var_B,
            // }, maxVarRGB, minVarRGB);

            // var_R = ((var_R + 0.16561039f) / (3.0152583f + 0.16561039f));
            // var_G = ((var_G + 0.06561642f) / (3.0239854f + 0.06561642f));
            // var_B = ((var_B + 0.19393992f) / (3.1043448f + 0.19393992f));

            R = (int) (var_R * 255f);
            G = (int) (var_G * 255f);
            B = (int) (var_B * 255f);
        }

        // float R = 1.910f * X - 0.532f * Y - 0.288f * Z;
        // float G = -0.985f * X + 1.999f * Y - 0.028f * Z;
        // float B = 0.058f * X - 0.118f * Y + 0.898f * Z;

        // updateMaxMin(new float[]{
        // R, G, B,
        // }, maxRGB, minRGB);

        int red = R;
        int green = G;
        int blue = B;

        red = Math.min(255, Math.max(0, red));
        green = Math.min(255, Math.max(0, green));
        blue = Math.min(255, Math.max(0, blue));
        final int alpha = 0xff;
        final int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);
        imageBuilder.setRGB(x, y, rgb);

    }
}
