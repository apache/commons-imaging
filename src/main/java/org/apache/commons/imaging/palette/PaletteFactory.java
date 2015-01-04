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

import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.imaging.ImageWriteException;

/**
 * Factory for creating palettes.
 */
public class PaletteFactory {
    private static final boolean DEBUG = false;
    public static final int COMPONENTS = 3; // in bits
    
    /**
     * Builds an exact complete opaque palette containing all the colors in {@code src},
     * using an algorithm that is faster than {@linkplain #makeExactRgbPaletteSimple} for large images
     * but uses 2 mebibytes of working memory. Treats all the colors as opaque.
     * @param src the image whose palette to build
     * @return the palette
     */
    public Palette makeExactRgbPaletteFancy(final BufferedImage src) {
        // map what rgb values have been used

        final byte[] rgbmap = new byte[256 * 256 * 32];

        final int width = src.getWidth();
        final int height = src.getHeight();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                final int argb = src.getRGB(x, y);
                final int rggbb = 0x1fffff & argb;
                final int highred = 0x7 & (argb >> 21);
                final int mask = 1 << highred;
                rgbmap[rggbb] |= mask;
            }
        }

        int count = 0;
        for (final byte element : rgbmap) {
            final int eight = 0xff & element;
            count += Integer.bitCount(eight);
        }

        if (DEBUG) {
            System.out.println("Used colors: " + count);
        }

        final int[] colormap = new int[count];
        int mapsize = 0;
        for (int i = 0; i < rgbmap.length; i++) {
            final int eight = 0xff & rgbmap[i];
            int mask = 0x80;
            for (int j = 0; j < 8; j++) {
                final int bit = eight & mask;
                mask >>>= 1;

                if (bit > 0) {
                    final int rgb = i | ((7 - j) << 21);

                    colormap[mapsize++] = rgb;
                }
            }
        }

        Arrays.sort(colormap);
        return new SimplePalette(colormap);
    }

    private int pixelToQuantizationTableIndex(int argb, final int precision) {
        int result = 0;
        final int precisionMask = (1 << precision) - 1;

        for (int i = 0; i < COMPONENTS; i++) {
            int sample = argb & 0xff;
            argb >>= 8;

            sample >>= (8 - precision);
            result = (result << precision) | (sample & precisionMask);
        }

        return result;
    }

    private int getFrequencyTotal(final int[] table, final int[] mins, final int[] maxs,
            final int precision) {
        int sum = 0;

        for (int blue = mins[2]; blue <= maxs[2]; blue++) {
            final int b = (blue << (2 * precision));
            for (int green = mins[1]; green <= maxs[1]; green++) {
                final int g = (green << (1 * precision));
                for (int red = mins[0]; red <= maxs[0]; red++) {
                    final int index = b | g | red;

                    sum += table[index];
                }
            }
        }

        return sum;
    }

    private DivisionCandidate finishDivision(final ColorSpaceSubset subset,
            final int component, final int precision, final int sum, final int slice) {
        if (DEBUG) {
            subset.dump("trying (" + component + "): ");
        }

        final int total = subset.total;

        if ((slice < subset.mins[component])
                || (slice >= subset.maxs[component])) {
            return null;
        }

        if ((sum < 1) || (sum >= total)) {
            return null;
        }

        final int remainder = total - sum;
        if ((remainder < 1) || (remainder >= total)) {
            return null;
        }

        final int[] sliceMins = new int[subset.mins.length];
        System.arraycopy(subset.mins, 0, sliceMins, 0, subset.mins.length);
        final int[] sliceMaxs = new int[subset.maxs.length];
        System.arraycopy(subset.maxs, 0, sliceMaxs, 0, subset.maxs.length);

        sliceMaxs[component] = slice;
        sliceMins[component] = slice + 1;

        if (DEBUG) {
            System.out.println("total: " + total);
            System.out.println("first total: " + sum);
            System.out.println("second total: " + (total - sum));
            // System.out.println("start: " + start);
            // System.out.println("end: " + end);
            System.out.println("slice: " + slice);

        }

        final ColorSpaceSubset first = new ColorSpaceSubset(sum, precision, subset.mins, sliceMaxs);
        final ColorSpaceSubset second = new ColorSpaceSubset(total - sum, precision, sliceMins, subset.maxs);

        return new DivisionCandidate(first, second);

    }

    private List<DivisionCandidate> divideSubset2(final int[] table,
            final ColorSpaceSubset subset, final int component, final int precision) {
        if (DEBUG) {
            subset.dump("trying (" + component + "): ");
        }

        final int total = subset.total;

        final int[] sliceMins = new int[subset.mins.length];
        System.arraycopy(subset.mins, 0, sliceMins, 0, subset.mins.length);
        final int[] sliceMaxs = new int[subset.maxs.length];
        System.arraycopy(subset.maxs, 0, sliceMaxs, 0, subset.maxs.length);

        int sum1 = 0;
        int slice1;
        int last = 0;

        for (slice1 = subset.mins[component]; slice1 != subset.maxs[component] + 1; slice1++) {
            sliceMins[component] = slice1;
            sliceMaxs[component] = slice1;

            last = getFrequencyTotal(table, sliceMins, sliceMaxs, precision);

            sum1 += last;

            if (sum1 >= (total / 2)) {
                break;
            }
        }

        int sum2 = sum1 - last;
        int slice2 = slice1 - 1;

        final DivisionCandidate dc1 = finishDivision(subset, component, precision, sum1, slice1);
        final DivisionCandidate dc2 = finishDivision(subset, component, precision, sum2, slice2);

        final List<DivisionCandidate> result = new ArrayList<DivisionCandidate>();

        if (dc1 != null) {
            result.add(dc1);
        }
        if (dc2 != null) {
            result.add(dc2);
        }

        return result;
    }

    private DivisionCandidate divideSubset2(final int[] table,
            final ColorSpaceSubset subset, final int precision) {
        final List<DivisionCandidate> dcs = new ArrayList<DivisionCandidate>();

        dcs.addAll(divideSubset2(table, subset, 0, precision));
        dcs.addAll(divideSubset2(table, subset, 1, precision));
        dcs.addAll(divideSubset2(table, subset, 2, precision));

        DivisionCandidate bestV = null;
        double bestScore = Double.MAX_VALUE;

        for (DivisionCandidate dc : dcs) {
            final ColorSpaceSubset first = dc.dst_a;
            final ColorSpaceSubset second = dc.dst_b;
            final int area1 = first.total;
            final int area2 = second.total;

            final int diff = Math.abs(area1 - area2);
            final double score = ((double) diff) / ((double) Math.max(area1, area2));

            if (bestV == null) {
                bestV = dc;
                bestScore = score;
            } else if (score < bestScore) {
                bestV = dc;
                bestScore = score;
            }

        }

        return bestV;
    }

    private static class DivisionCandidate {
        // private final ColorSpaceSubset src;
        private final ColorSpaceSubset dst_a;
        private final ColorSpaceSubset dst_b;

        public DivisionCandidate(final ColorSpaceSubset dst_a, final ColorSpaceSubset dst_b) {
            // this.src = src;
            this.dst_a = dst_a;
            this.dst_b = dst_b;
        }
    }

    private List<ColorSpaceSubset> divide(final List<ColorSpaceSubset> v,
            final int desiredCount, final int[] table, final int precision) {
        final List<ColorSpaceSubset> ignore = new ArrayList<ColorSpaceSubset>();

        while (true) {
            int maxArea = -1;
            ColorSpaceSubset maxSubset = null;

            for (ColorSpaceSubset subset : v) {
                if (ignore.contains(subset)) {
                    continue;
                }
                final int area = subset.total;

                if (maxSubset == null) {
                    maxSubset = subset;
                    maxArea = area;
                } else if (area > maxArea) {
                    maxSubset = subset;
                    maxArea = area;
                }
            }

            if (maxSubset == null) {
                return v;
            }
            if (DEBUG) {
                System.out.println("\t" + "area: " + maxArea);
            }

            final DivisionCandidate dc = divideSubset2(table, maxSubset,
                    precision);
            if (dc != null) {
                v.remove(maxSubset);
                v.add(dc.dst_a);
                v.add(dc.dst_b);
            } else {
                ignore.add(maxSubset);
            }

            if (v.size() == desiredCount) {
                return v;
            }
        }
    }

    /**
     * Builds an inexact opaque palette of at most {@code max} colors in {@code src}
     * using a variation of the Median Cut algorithm. Accurate to 6 bits per component,
     * and works by splitting the color bounding box most heavily populated by colors
     * along the component which splits the colors in that box most evenly.
     * @param src the image whose palette to build
     * @param max the maximum number of colors the palette can contain
     * @return the palette of at most {@code max} colors
     */
    public Palette makeQuantizedRgbPalette(final BufferedImage src, final int max) {
        final int precision = 6; // in bits

        final int tableScale = precision * COMPONENTS;
        final int tableSize = 1 << tableScale;
        final int[] table = new int[tableSize];

        final int width = src.getWidth();
        final int height = src.getHeight();

        List<ColorSpaceSubset> subsets = new ArrayList<ColorSpaceSubset>();
        final ColorSpaceSubset all = new ColorSpaceSubset(width * height, precision);
        subsets.add(all);

        if (DEBUG) {
            final int preTotal = getFrequencyTotal(table, all.mins, all.maxs, precision);
            System.out.println("pre total: " + preTotal);
        }

        // step 1: count frequency of colors
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                final int argb = src.getRGB(x, y);

                final int index = pixelToQuantizationTableIndex(argb, precision);

                table[index]++;
            }
        }

        if (DEBUG) {
            final int allTotal = getFrequencyTotal(table, all.mins, all.maxs, precision);
            System.out.println("all total: " + allTotal);
            System.out.println("width * height: " + (width * height));
        }

        subsets = divide(subsets, max, table, precision);

        if (DEBUG) {
            System.out.println("subsets: " + subsets.size());
            System.out.println("width*height: " + width * height);
        }

        for (int i = 0; i < subsets.size(); i++) {
            final ColorSpaceSubset subset = subsets.get(i);

            subset.setAverageRGB(table);

            if (DEBUG) {
                subset.dump(i + ": ");
            }
        }

        Collections.sort(subsets, ColorSpaceSubset.RGB_COMPARATOR);

        return new QuantizedPalette(subsets, precision);
    }
    
    /**
     * Builds an inexact possibly translucent palette of at most {@code max} colors in {@code src}
     * using the traditional Median Cut algorithm. Color bounding boxes are split along the
     * longest axis, with each step splitting the box. All bits in each component are used.
     * The Algorithm is slower and seems exact than {@linkplain #makeQuantizedRgbPalette(BufferedImage, int)}.
     * @param src the image whose palette to build
     * @param transparent whether to consider the alpha values
     * @param max the maximum number of colors the palette can contain
     * @return the palette of at most {@code max} colors
     */
    public Palette makeQuantizedRgbaPalette(final BufferedImage src, final boolean transparent, final int max) throws ImageWriteException {
        return new MedianCutQuantizer(!transparent).process(src, max,
                new LongestAxisMedianCut(), false);
    }

    /**
     * Builds an exact complete opaque palette containing all the colors in {@code src},
     * and fails by returning {@code null} if there are more than {@code max} colors necessary to do this.
     * @param src the image whose palette to build
     * @param max the maximum number of colors the palette can contain
     * @return the complete palette of {@code max} or less colors, or {@code null} if more than {@code max} colors are necessary
     */
    public SimplePalette makeExactRgbPaletteSimple(final BufferedImage src, final int max) {
        // This is not efficient for large values of max, say, max > 256;
        final Set<Integer> rgbs = new HashSet<Integer>();

        final int width = src.getWidth();
        final int height = src.getHeight();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                final int argb = src.getRGB(x, y);
                final int rgb = 0xffffff & argb;

                if (rgbs.add(rgb) && rgbs.size() > max) {
                    return null;
                }
            }
        }
        
        final int[] result = new int[rgbs.size()];
        int next = 0;
        for (final int rgb : rgbs) {
            result[next++] = rgb;
        }
        Arrays.sort(result);

        return new SimplePalette(result);
    }

    public boolean isGrayscale(final BufferedImage src) {
        final int width = src.getWidth();
        final int height = src.getHeight();

        if (ColorSpace.TYPE_GRAY == src.getColorModel().getColorSpace()
                .getType()) {
            return true;
        }

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                final int argb = src.getRGB(x, y);

                final int red = 0xff & (argb >> 16);
                final int green = 0xff & (argb >> 8);
                final int blue = 0xff & (argb >> 0);

                if (red != green || red != blue) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean hasTransparency(final BufferedImage src) {
        return hasTransparency(src, 255);
    }

    public boolean hasTransparency(final BufferedImage src, final int threshold) {
        final int width = src.getWidth();
        final int height = src.getHeight();

        if (!src.getColorModel().hasAlpha()) {
            return false;
        }

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                final int argb = src.getRGB(x, y);
                final int alpha = 0xff & (argb >> 24);
                if (alpha < threshold) {
                    return true;
                }
            }
        }
        return false;
    }

    public int countTrasparentColors(final int[] rgbs) {
        int first = -1;

        for (final int rgb : rgbs) {
            final int alpha = 0xff & (rgb >> 24);
            if (alpha < 0xff) {
                if (first < 0) {
                    first = rgb;
                } else if (rgb != first) {
                    return 2; // more than one transparent color;
                }
            }
        }

        if (first < 0) {
            return 0;
        }
        return 1;
    }

    public int countTransparentColors(final BufferedImage src) {
        final ColorModel cm = src.getColorModel();
        if (!cm.hasAlpha()) {
            return 0;
        }

        final int width = src.getWidth();
        final int height = src.getHeight();

        int first = -1;

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                final int rgb = src.getRGB(x, y);
                final int alpha = 0xff & (rgb >> 24);
                if (alpha < 0xff) {
                    if (first < 0) {
                        first = rgb;
                    } else if (rgb != first) {
                        return 2; // more than one transparent color;
                    }
                }
            }
        }

        if (first < 0) {
            return 0;
        }
        return 1;
    }

}
