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
package org.apache.commons.imaging.palette;

import java.util.Arrays;
import java.util.Comparator;
import java.util.logging.Logger;

class ColorSpaceSubset {

    public static class RgbComparator implements Comparator<ColorSpaceSubset> {

        @Override
        public int compare(final ColorSpaceSubset c1, final ColorSpaceSubset c2) {
            return c1.rgb - c2.rgb;
        }
    }

    private static final Logger LOGGER = Logger.getLogger(ColorSpaceSubset.class.getName());
    public static final RgbComparator RGB_COMPARATOR = new RgbComparator();
    static final int SHALLOW_SIZE = 40;
    final int[] mins;
    final int[] maxs;
    final int precision;
    final int precisionMask;
    final int total;

    int rgb; // median
    // the index in the palette.
    private int index;

    ColorSpaceSubset(final int total, final int precision) {
        this.total = total;
        this.precision = precision;
        precisionMask = (1 << precision) - 1;

        mins = new int[PaletteFactory.COMPONENTS];
        maxs = new int[PaletteFactory.COMPONENTS];
        Arrays.fill(maxs, precisionMask);

        rgb = -1;
    }

    ColorSpaceSubset(final int total, final int precision, final int[] mins, final int[] maxs) {
        this.total = total;
        this.precision = precision;
        this.mins = mins;
        this.maxs = maxs;
        precisionMask = (1 << precision) - 1;

        rgb = -1;
    }

    public final boolean contains(int red, int green, int blue) {
        red >>= (8 - precision);
        if (mins[0] > red) {
            return false;
        }
        if (maxs[0] < red) {
            return false;
        }

        green >>= (8 - precision);
        if (mins[1] > green) {
            return false;
        }
        if (maxs[1] < green) {
            return false;
        }

        blue >>= (8 - precision);
        if (mins[2] > blue) {
            return false;
        }
        if (maxs[2] < blue) {
            return false;
        }

        return true;
    }

    public void dump(final String prefix) {
        final int rdiff = maxs[0] - mins[0] + 1;
        final int gdiff = maxs[1] - mins[1] + 1;
        final int bdiff = maxs[2] - mins[2] + 1;
        final int colorArea = rdiff * gdiff * bdiff;

        LOGGER.fine(prefix + ": [" + Integer.toHexString(rgb)
                + "] total : " + total
        // + " ("
        // + (100.0 * (double) total / (double) total_area)
        // + " %)"
                );
        LOGGER.fine("\t" + "rgb: " + Integer.toHexString(rgb) + ", "
                + "red: " + Integer.toHexString(mins[0] << (8 - precision))
                + ", " + Integer.toHexString(maxs[0] << (8 - precision)) + ", "
                + "green: " + Integer.toHexString(mins[1] << (8 - precision))
                + ", " + Integer.toHexString(maxs[1] << (8 - precision)) + ", "
                + "blue: " + Integer.toHexString(mins[2] << (8 - precision))
                + ", " + Integer.toHexString(maxs[2] << (8 - precision)));
        LOGGER.fine("\t" + "red: " + mins[0] + ", " + maxs[0] + ", "
                + "green: " + mins[1] + ", " + maxs[1] + ", " + "blue: "
                + mins[2] + ", " + maxs[2]);
        LOGGER.fine("\t" + "rdiff: " + rdiff + ", " + "gdiff: " + gdiff
                        + ", " + "bdiff: " + bdiff + ", " + "colorArea: "
                        + colorArea);
    }

    public void dumpJustRgb(final String prefix) {
        LOGGER.fine("\t" + "rgb: " + Integer.toHexString(rgb) + ", "
                + "red: " + Integer.toHexString(mins[0] << (8 - precision))
                + ", " + Integer.toHexString(maxs[0] << (8 - precision)) + ", "
                + "green: " + Integer.toHexString(mins[1] << (8 - precision))
                + ", " + Integer.toHexString(maxs[1] << (8 - precision)) + ", "
                + "blue: " + Integer.toHexString(mins[2] << (8 - precision))
                + ", " + Integer.toHexString(maxs[2] << (8 - precision)));
    }

    public int getArea() {
        final int rdiff = maxs[0] - mins[0] + 1;
        final int gdiff = maxs[1] - mins[1] + 1;
        final int bdiff = maxs[2] - mins[2] + 1;

        return rdiff * gdiff * bdiff;

    }

    public final int getIndex() {
        return index;
    }

    public void setAverageRgb(final int[] table) {
        long redsum = 0;
        long greensum = 0;
        long bluesum = 0;

        for (int red = mins[0]; red <= maxs[0]; red++) {
            for (int green = mins[1]; green <= maxs[1]; green++) {
                for (int blue = mins[2]; blue <= maxs[2]; blue++) {
                    // note: order reversed
                    final int idx = (blue << (2 * precision))
                            | (green << (1 * precision))
                            | (red << (0 * precision));
                    final int count = table[idx];
                    redsum += count * (red << (8 - precision));
                    greensum += count * (green << (8 - precision));
                    bluesum += count * (blue << (8 - precision));
                }
            }
        }

        redsum /= total;
        greensum /= total;
        bluesum /= total;
        rgb = (int) (((redsum & 0xff) << 16) | ((greensum & 0xff) << 8) | ((bluesum & 0xff) << 0));
    }

    public final void setIndex(final int i) {
        index = i;
    }
}
