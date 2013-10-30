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
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.imaging.ImageWriteException;

public class MedianCutLongestAxisImplementation extends MedianCutImplementation {
    private static final Comparator<ColorGroup> comparator = new Comparator<ColorGroup>() {
        public int compare(final ColorGroup cg1, final ColorGroup cg2) {
            if (cg1.max_diff == cg2.max_diff) {
                return cg2.diff_total - cg1.diff_total;
            }
            return cg2.max_diff - cg1.max_diff;
        }
    };

    @Override
    public boolean performNextMedianCut(final List<ColorGroup> color_groups, final boolean ignoreAlpha)
            throws ImageWriteException {
        Collections.sort(color_groups, comparator);
        final ColorGroup color_group = color_groups.get(0);

        if (color_group.max_diff == 0) {
            return false;
        }
        if (!ignoreAlpha
                && color_group.alpha_diff > color_group.red_diff
                && color_group.alpha_diff > color_group.green_diff
                && color_group.alpha_diff > color_group.blue_diff) {
            doCut(color_group, ColorComponent.ALPHA, color_groups, ignoreAlpha);
        } else if (color_group.red_diff > color_group.green_diff
                && color_group.red_diff > color_group.blue_diff) {
            doCut(color_group, ColorComponent.RED, color_groups, ignoreAlpha);
        } else if (color_group.green_diff > color_group.blue_diff) {
            doCut(color_group, ColorComponent.GREEN, color_groups, ignoreAlpha);
        } else {
            doCut(color_group, ColorComponent.BLUE, color_groups, ignoreAlpha);
        }
        return true;
    }
    
    private void doCut(final ColorGroup color_group, final ColorComponent mode,
            final List<ColorGroup> color_groups, final boolean ignoreAlpha) throws ImageWriteException {

        final Comparator<ColorCount> comp = new Comparator<ColorCount>() {
            public int compare(final ColorCount c1, final ColorCount c2) {
                switch (mode) {
                case ALPHA:
                    return c1.alpha - c2.alpha;
                case RED:
                    return c1.red - c2.red;
                case GREEN:
                    return c1.green - c2.green;
                case BLUE:
                    return c1.blue - c2.blue;
                default:
                    return 0;
                }
            }
        };

        Collections.sort(color_group.color_counts, comp);
        final int count_half = (int) Math.round((double) color_group.totalPoints / 2);
        int old_count = 0, new_count = 0;
        int median_index;
        for (median_index = 0; median_index < color_group.color_counts.size(); median_index++) {
            final ColorCount color_count = color_group.color_counts.get(median_index);

            new_count += color_count.count;

            if (new_count < count_half) {
                old_count = new_count;
                continue;
            }
            break;
        }

        if (median_index == color_group.color_counts.size() - 1) {
            median_index--;
        } else if (median_index > 0) {
            final int new_diff = Math.abs(new_count - count_half);
            final int old_diff = Math.abs(count_half - old_count);
            if (old_diff < new_diff) {
                median_index--;
            }
        }

        color_groups.remove(color_group);
        final List<ColorCount> color_counts1 = new ArrayList<ColorCount>(
                color_group.color_counts.subList(0, median_index + 1));
        final List<ColorCount> color_counts2 = new ArrayList<ColorCount>(
                color_group.color_counts.subList(median_index + 1,
                        color_group.color_counts.size()));

        ColorGroup less, more;
        less = new ColorGroup(new ArrayList<ColorCount>(color_counts1), ignoreAlpha);
        color_groups.add(less);
        more = new ColorGroup(new ArrayList<ColorCount>(color_counts2), ignoreAlpha);
        color_groups.add(more);

        final ColorCount median_value = color_group.color_counts
                .get(median_index);
        int limit;
        switch (mode) {
        case ALPHA:
            limit = median_value.alpha;
            break;
        case RED:
            limit = median_value.red;
            break;
        case GREEN:
            limit = median_value.green;
            break;
        case BLUE:
            limit = median_value.blue;
            break;
        default:
            throw new Error("Bad mode.");
        }
        color_group.cut = new ColorGroupCut(less, more, mode, limit);
    }
}
