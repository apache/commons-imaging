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

import java.util.Collections;
import java.util.List;

import org.apache.commons.imaging.ImageWriteException;

class ColorGroup {
    // public final ColorGroup parent;
    public ColorGroupCut cut = null;
    // public final List children = new ArrayList();
    public int palette_index = -1;

    public final List<ColorCount> color_counts;
    public final boolean ignoreAlpha;
    public int min_red = Integer.MAX_VALUE;
    public int max_red = Integer.MIN_VALUE;
    public int min_green = Integer.MAX_VALUE;
    public int max_green = Integer.MIN_VALUE;
    public int min_blue = Integer.MAX_VALUE;
    public int max_blue = Integer.MIN_VALUE;
    public int min_alpha = Integer.MAX_VALUE;
    public int max_alpha = Integer.MIN_VALUE;

    public final int alpha_diff;
    public final int red_diff;
    public final int green_diff;
    public final int blue_diff;

    public final int max_diff;
    public final int diff_total;
    public final int totalPoints;

    public ColorGroup(final List<ColorCount> color_counts, final boolean ignoreAlpha)
            throws ImageWriteException {
        this.color_counts = Collections.unmodifiableList(color_counts);
        this.ignoreAlpha = ignoreAlpha;

        if (color_counts.size() < 1) {
            throw new ImageWriteException("empty color_group");
        }

        int total = 0;
        for (int i = 0; i < color_counts.size(); i++) {
            final ColorCount color = color_counts.get(i);
            total += color.count;

            min_alpha = Math.min(min_alpha, color.alpha);
            max_alpha = Math.max(max_alpha, color.alpha);
            min_red = Math.min(min_red, color.red);
            max_red = Math.max(max_red, color.red);
            min_green = Math.min(min_green, color.green);
            max_green = Math.max(max_green, color.green);
            min_blue = Math.min(min_blue, color.blue);
            max_blue = Math.max(max_blue, color.blue);
        }
        this.totalPoints = total;

        alpha_diff = max_alpha - min_alpha;
        red_diff = max_red - min_red;
        green_diff = max_green - min_green;
        blue_diff = max_blue - min_blue;
        max_diff = Math.max(
                ignoreAlpha ? red_diff : Math.max(alpha_diff, red_diff),
                Math.max(green_diff, blue_diff));
        diff_total = (ignoreAlpha ? 0 : alpha_diff) + red_diff + green_diff
                + blue_diff;

    }

    public boolean contains(final int argb) {
        final int alpha = 0xff & (argb >> 24);
        final int red = 0xff & (argb >> 16);
        final int green = 0xff & (argb >> 8);
        final int blue = 0xff & (argb >> 0);

        if (!ignoreAlpha && (alpha < min_alpha || alpha > max_alpha)) {
            return false;
        }
        if (red < min_red || red > max_red) {
            return false;
        }
        if (green < min_green || green > max_green) {
            return false;
        }
        if (blue < min_blue || blue > max_blue) {
            return false;
        }
        return true;
    }

    public int getMedianValue() {
        long count_total = 0;
        long alpha_total = 0, red_total = 0, green_total = 0, blue_total = 0;

        for (int i = 0; i < color_counts.size(); i++) {
            final ColorCount color = color_counts.get(i);

            count_total += color.count;
            alpha_total += color.count * color.alpha;
            red_total += color.count * color.red;
            green_total += color.count * color.green;
            blue_total += color.count * color.blue;
        }

        final int alpha = ignoreAlpha ? 0xff : (int) Math
                .round((double) alpha_total / count_total);
        final int red = (int) Math.round((double) red_total / count_total);
        final int green = (int) Math.round((double) green_total / count_total);
        final int blue = (int) Math.round((double) blue_total / count_total);

        return (alpha << 24) | (red << 16) | (green << 8) | blue;
    }

    @Override
    public String toString() {
        return "{ColorGroup. min_red: " + Integer.toHexString(min_red)
                + ", max_red: " + Integer.toHexString(max_red)
                + ", min_green: " + Integer.toHexString(min_green)
                + ", max_green: " + Integer.toHexString(max_green)
                + ", min_blue: " + Integer.toHexString(min_blue)
                + ", max_blue: " + Integer.toHexString(max_blue)
                + ", min_alpha: " + Integer.toHexString(min_alpha)
                + ", max_alpha: " + Integer.toHexString(max_alpha)
                + ", max_diff: " + Integer.toHexString(max_diff)
                + ", diff_total: " + diff_total + "}";
    }

}
