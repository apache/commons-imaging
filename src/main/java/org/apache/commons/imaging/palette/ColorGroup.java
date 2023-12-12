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

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.imaging.ImagingException;

class ColorGroup {

    // final ColorGroup parent;
    ColorGroupCut cut;
    // final List children = new ArrayList();
    int paletteIndex = -1;

    private final List<ColorCount> colorCounts;
    final boolean ignoreAlpha;
    int minRed = Integer.MAX_VALUE;
    int maxRed = Integer.MIN_VALUE;
    int minGreen = Integer.MAX_VALUE;
    int maxGreen = Integer.MIN_VALUE;
    int minBlue = Integer.MAX_VALUE;
    int maxBlue = Integer.MIN_VALUE;
    int minAlpha = Integer.MAX_VALUE;
    int maxAlpha = Integer.MIN_VALUE;

    final int alphaDiff;
    final int redDiff;
    final int greenDiff;
    final int blueDiff;

    final int maxDiff;
    final int diffTotal;
    final int totalPoints;

    ColorGroup(final List<ColorCount> colorCounts, final boolean ignoreAlpha) throws ImagingException {
        this.colorCounts = colorCounts;
        this.ignoreAlpha = ignoreAlpha;

        if (colorCounts.isEmpty()) {
            throw new ImagingException("Empty colorCounts");
        }

        int total = 0;
        for (final ColorCount color : colorCounts) {
            total += color.count;

            minAlpha = Math.min(minAlpha, color.alpha);
            maxAlpha = Math.max(maxAlpha, color.alpha);
            minRed = Math.min(minRed, color.red);
            maxRed = Math.max(maxRed, color.red);
            minGreen = Math.min(minGreen, color.green);
            maxGreen = Math.max(maxGreen, color.green);
            minBlue = Math.min(minBlue, color.blue);
            maxBlue = Math.max(maxBlue, color.blue);
        }
        this.totalPoints = total;

        alphaDiff = maxAlpha - minAlpha;
        redDiff = maxRed - minRed;
        greenDiff = maxGreen - minGreen;
        blueDiff = maxBlue - minBlue;
        maxDiff = Math.max(
                ignoreAlpha ? redDiff : Math.max(alphaDiff, redDiff),
                Math.max(greenDiff, blueDiff));
        diffTotal = (ignoreAlpha ? 0 : alphaDiff) + redDiff + greenDiff + blueDiff;
    }

    boolean contains(final int argb) {
        final int alpha = 0xff & argb >> 24;
        final int red = 0xff & argb >> 16;
        final int green = 0xff & argb >> 8;
        final int blue = 0xff & argb >> 0;

        if (!ignoreAlpha && (alpha < minAlpha || alpha > maxAlpha)) {
            return false;
        }
        if (red < minRed || red > maxRed) {
            return false;
        }
        if (green < minGreen || green > maxGreen) {
            return false;
        }
        if (blue < minBlue || blue > maxBlue) {
            return false;
        }
        return true;
    }

    /**
     * Return a copy of the list of color counts.
     * @return a copy of the list of color counts
     */
    List<ColorCount> getColorCounts() {
        return new ArrayList<>(colorCounts);
    }

    int getMedianValue() {
        long countTotal = 0;
        long alphaTotal = 0;
        long redTotal = 0;
        long greenTotal = 0;
        long blueTotal = 0;

        for (final ColorCount color : colorCounts) {
            countTotal += color.count;
            alphaTotal += color.count * color.alpha;
            redTotal += color.count * color.red;
            greenTotal += color.count * color.green;
            blueTotal += color.count * color.blue;
        }

        int alpha = 0;
        int red = 0;
        int green = 0;
        int blue = 0;
        try {
            if (countTotal == 0) {
                throw new RuntimeException("countTotal cannot be 0");
            }
            alpha = ignoreAlpha ? 0xff : (int) Math.round((double) alphaTotal / countTotal);
            red = (int) Math.round((double) redTotal / countTotal);
            green = (int) Math.round((double) greenTotal / countTotal);
            blue = (int) Math.round((double) blueTotal / countTotal);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return alpha << 24 | red << 16 | green << 8 | blue;
    }

    @Override
    public String toString() {
        return "{ColorGroup. minRed: " + Integer.toHexString(minRed)
                + ", maxRed: " + Integer.toHexString(maxRed)
                + ", minGreen: " + Integer.toHexString(minGreen)
                + ", maxGreen: " + Integer.toHexString(maxGreen)
                + ", minBlue: " + Integer.toHexString(minBlue)
                + ", maxBlue: " + Integer.toHexString(maxBlue)
                + ", minAlpha: " + Integer.toHexString(minAlpha)
                + ", maxAlpha: " + Integer.toHexString(maxAlpha)
                + ", maxDiff: " + Integer.toHexString(maxDiff)
                + ", diffTotal: " + diffTotal + "}";
    }

}
