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

public class MedianCutMostPopulatedBoxesImplementation extends MedianCutImplementation {
    @Override
    public boolean performNextMedianCut(final List<ColorGroup> colorGroups,
            boolean ignoreAlpha) throws ImageWriteException {
        int maxPoints = 0;
        ColorGroup colorGroup = null;
        for (int i = 0; i < colorGroups.size(); i++) {
            if (colorGroups.get(i).max_diff > 0) {
                ColorGroup c = colorGroups.get(i);
                if (c.totalPoints > maxPoints) {
                    colorGroup = c;
                    maxPoints = c.totalPoints;
                }
            }
        }
        if (colorGroup == null) {
            return false;
        }
        
        
        
        double bestScore = Double.MAX_VALUE;
        ColorComponent bestColorComponent = null;
        int bestMedianIndex = -1;
        for (ColorComponent colorComponent : ColorComponent.values()) {
            if (ignoreAlpha && colorComponent == ColorComponent.ALPHA) {
                continue;
            }
            Collections.sort(colorGroup.color_counts, new ColorComparer(colorComponent));
            final int count_half = (int) Math.round((double) colorGroup.totalPoints / 2);
            int old_count = 0, new_count = 0;
            int median_index;
            for (median_index = 0; median_index < colorGroup.color_counts.size(); median_index++) {
                final ColorCount color_count = colorGroup.color_counts.get(median_index);
    
                new_count += color_count.count;
    
                if (new_count < count_half) {
                    old_count = new_count;
                    continue;
                }
                break;
            }
            if (median_index == colorGroup.color_counts.size() - 1) {
                median_index--;
            } else if (median_index > 0) {
                final int new_diff = Math.abs(new_count - count_half);
                final int old_diff = Math.abs(count_half - old_count);
                if (old_diff < new_diff) {
                    median_index--;
                }
            }

            final List<ColorCount> lowerColors = new ArrayList<ColorCount>(
                    colorGroup.color_counts.subList(0, median_index + 1));
            final List<ColorCount> upperColors = new ArrayList<ColorCount>(
                    colorGroup.color_counts.subList(median_index + 1,
                            colorGroup.color_counts.size()));
            if (lowerColors.size() == 0 || upperColors.size() == 0) {
                continue;
            }
            ColorGroup lowerGroup = new ColorGroup(lowerColors, ignoreAlpha);
            ColorGroup upperGroup = new ColorGroup(upperColors, ignoreAlpha);
            int diff = Math.abs(lowerGroup.totalPoints - upperGroup.totalPoints);
            double score = diff / (double)Math.max(lowerGroup.totalPoints, upperGroup.totalPoints);
            if (score < bestScore) {
                bestScore = score;
                bestColorComponent = colorComponent;
                bestMedianIndex = median_index;
            }
        }

        if (bestColorComponent == null) {
            return false;
        }
        
        Collections.sort(colorGroup.color_counts, new ColorComparer(bestColorComponent));
        final List<ColorCount> lowerColors = new ArrayList<ColorCount>(
                colorGroup.color_counts.subList(0, bestMedianIndex + 1));
        final List<ColorCount> upperColors = new ArrayList<ColorCount>(
                colorGroup.color_counts.subList(bestMedianIndex + 1,
                        colorGroup.color_counts.size()));
        ColorGroup lowerGroup = new ColorGroup(lowerColors, ignoreAlpha);
        ColorGroup upperGroup = new ColorGroup(upperColors, ignoreAlpha);
        colorGroups.remove(colorGroup);
        colorGroups.add(lowerGroup);
        colorGroups.add(upperGroup);
        
        final ColorCount median_value = colorGroup.color_counts
                .get(bestMedianIndex);
        int limit;
        switch (bestColorComponent) {
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
        colorGroup.cut = new ColorGroupCut(lowerGroup, upperGroup, bestColorComponent, limit);
        return true;
    }
    
    private static class ColorComparer implements Comparator<ColorCount> {
        private final ColorComponent colorComponent;
        
        public ColorComparer(ColorComponent colorComponent) {
            this.colorComponent = colorComponent;
        }
        
        public int compare(final ColorCount c1, final ColorCount c2) {
            switch (colorComponent) {
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

}
