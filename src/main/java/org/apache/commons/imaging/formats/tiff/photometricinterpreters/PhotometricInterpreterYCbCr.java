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

public class PhotometricInterpreterYCbCr extends PhotometricInterpreter {

    public PhotometricInterpreterYCbCr(final int fSamplesPerPixel,
            final int fBitsPerSample[], final int predictor,
            final int width, final int height) {
        super(fSamplesPerPixel, fBitsPerSample, predictor, width, height);
    }

    public static int limit(final int value, final int min, final int max) {
        return Math.min(max, Math.max(min, value));
    }

    /**
     * This method converts a YUV (aka YCbCr) colorspace to a RGB colorspace.
     * This is handy when trying to reconstruct an image in Java from YCbCr
     * transmitted data. This routine expects the data to fall in the standard
     * PC 0..255 range per pixel, with the array dimensions corresponding to the
     * imageWidth and imageHeight. These variables are either set manually in
     * the case of a null constructor, or they are automatically calculated from
     * the image parameter constructor.
     * 
     * @param Y
     *            The Y component set.
     * @param Cb
     *            The Cb component set.
     * @param Cr
     *            The Cr component set.
     * @return R The R component.
     */
    public static int convertYCbCrtoRGB(final int Y, final int Cb, final int Cr) {
        final double r1 = (((1.164 * (Y - 16.0))) + (1.596 * (Cr - 128.0)));
        final double g1 = (((1.164 * (Y - 16.0))) - (0.813 * (Cr - 128.0)) - (0.392 * (Cb - 128.0)));
        final double b1 = (((1.164 * (Y - 16.0))) + (2.017 * (Cb - 128.0)));

        final int r = limit((int) r1, 0, 255);
        final int g = limit((int) g1, 0, 255);
        final int b = limit((int) b1, 0, 255);

        final int alpha = 0xff;
        final int rgb = (alpha << 24) | (r << 16) | (g << 8) | (b << 0);
        return rgb;
    }

    @Override
    public void interpretPixel(final ImageBuilder imageBuilder, final int samples[], final int x,
            final int y) throws ImageReadException, IOException {
        final int Y = samples[0];
        final int Cb = samples[1];
        final int Cr = samples[2];
        final double R = Y + 1.402 * (Cr - 128.0);
        final double G = Y - 0.34414 * (Cb - 128.0) - 0.71414 * (Cr - 128.0);
        final double B = Y + 1.772 * (Cb - 128.0);

        final int red = limit((int) R, 0, 255);
        final int green = limit((int) G, 0, 255);
        final int blue = limit((int) B, 0, 255);

        final int alpha = 0xff;
        final int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);
        imageBuilder.setRGB(x, y, rgb);

    }
}
