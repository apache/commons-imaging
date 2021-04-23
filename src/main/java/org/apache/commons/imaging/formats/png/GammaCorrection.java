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
package org.apache.commons.imaging.formats.png;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GammaCorrection {

    private static final Logger LOGGER = Logger.getLogger(GammaCorrection.class.getName());

    private final int[] lookupTable;

    public GammaCorrection(final double srcGamma, final double dstGamma) {

        if (LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.finest("src_gamma: " + srcGamma);
            LOGGER.finest("dst_gamma: " + dstGamma);
        }

        lookupTable = new int[256];
        for (int i = 0; i < 256; i++) {
            lookupTable[i] = correctSample(i, srcGamma, dstGamma);
            if (LOGGER.isLoggable(Level.FINEST)) {
                LOGGER.finest("lookup_table[" + i + "]: " + lookupTable[i]);
            }
        }
    }

    public int correctSample(final int sample) {
        return lookupTable[sample];
    }

    public int correctARGB(final int pixel) {
        final int alpha = (0xff000000) & pixel;
        int red = (pixel >> 16) & 0xff;
        int green = (pixel >> 8) & 0xff;
        int blue = (pixel) & 0xff;

        red = correctSample(red);
        green = correctSample(green);
        blue = correctSample(blue);

        return alpha | ((0xff & red) << 16) | ((0xff & green) << 8) | ((0xff & blue));
    }

    private int correctSample(final int sample, final double srcGamma, final double dstGamma) {
        // if (kUseAdobeGammaMethod && val <= 32)
        // {
        // double slope = Math.round(255.0d * Math.pow((32.0 / 255.0d),
        // src_gamma / dst_gamma)) / 32.d;
        // return (int) (sample * slope);
        // }

        return (int) Math.round(255.0d * Math.pow((sample / 255.0d), srcGamma / dstGamma));
    }

}
