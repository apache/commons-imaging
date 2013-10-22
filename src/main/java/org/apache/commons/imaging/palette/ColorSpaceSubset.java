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

import java.io.Serializable;
import java.util.Comparator;

class ColorSpaceSubset {
    final int mins[], maxs[];
    final int precision;
    final int precision_mask;
    final int total;
    int rgb; // median

    ColorSpaceSubset(final int total, final int precision) {
        this.total = total;
        this.precision = precision;
        precision_mask = (1 << precision) - 1;

        mins = new int[PaletteFactory.components];
        maxs = new int[PaletteFactory.components];
        for (int i = 0; i < PaletteFactory.components; i++) {
            mins[i] = 0;
            maxs[i] = precision_mask;
        }

        rgb = -1;
    }

    ColorSpaceSubset(final int total, final int precision, final int mins[], final int maxs[],
            final int table[]) {
        this.total = total;
        this.precision = precision;
        this.mins = mins;
        this.maxs = maxs;
        precision_mask = (1 << precision) - 1;

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
        final int color_area = rdiff * gdiff * bdiff;

        System.out.println(prefix + ": [" + Integer.toHexString(rgb)
                + "] total : " + total
        // + " ("
        // + (100.0 * (double) total / (double) total_area)
        // + " %)"
                );
        System.out.println("\t" + "rgb: " + Integer.toHexString(rgb) + ", "
                + "red: " + Integer.toHexString(mins[0] << (8 - precision))
                + ", " + Integer.toHexString(maxs[0] << (8 - precision)) + ", "
                + "green: " + Integer.toHexString(mins[1] << (8 - precision))
                + ", " + Integer.toHexString(maxs[1] << (8 - precision)) + ", "
                + "blue: " + Integer.toHexString(mins[2] << (8 - precision))
                + ", " + Integer.toHexString(maxs[2] << (8 - precision)));
        System.out.println("\t" + "red: " + mins[0] + ", " + maxs[0] + ", "
                + "green: " + mins[1] + ", " + maxs[1] + ", " + "blue: "
                + mins[2] + ", " + maxs[2]);
        System.out
                .println("\t" + "rdiff: " + rdiff + ", " + "gdiff: " + gdiff
                        + ", " + "bdiff: " + bdiff + ", " + "color_area: "
                        + color_area);
    }

    public void dumpJustRGB(final String prefix) {
        System.out.println("\t" + "rgb: " + Integer.toHexString(rgb) + ", "
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
        final int color_area = rdiff * gdiff * bdiff;

        return color_area;

    }

    public void setAverageRGB(final int table[]) {
        long redsum = 0, greensum = 0, bluesum = 0;

        for (int red = mins[0]; red <= maxs[0]; red++) {
            for (int green = mins[1]; green <= maxs[1]; green++) {
                for (int blue = mins[2]; blue <= maxs[2]; blue++) {
                    // note: order reversed
                    final int index = (blue << (2 * precision)) 
                            | (green << (1 * precision))
                            | (red << (0 * precision));
                    final int count = table[index];
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

    // the index in the palette.
    private int index;
    
    public final int getIndex() {
        return index;
    }

    public final void setIndex(final int i) {
        index = i;
    }

    public static class RgbComparator implements Comparator<ColorSpaceSubset>, Serializable {
        private static final long serialVersionUID = 509214838111679029L;

        public int compare(final ColorSpaceSubset c1, final ColorSpaceSubset c2) {
            return c1.rgb - c2.rgb;
        }
    }
    
    public static final RgbComparator rgbComparator = new RgbComparator();
}
