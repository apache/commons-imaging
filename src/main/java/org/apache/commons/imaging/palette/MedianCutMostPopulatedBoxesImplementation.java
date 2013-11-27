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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.imaging.ImageWriteException;

public class MedianCutMostPopulatedBoxesImplementation extends MedianCutImplementation {
    @Override
    public boolean performNextMedianCut(final List<ColorGroup> colorGroups,
            final boolean ignoreAlpha) throws ImageWriteException {
        int maxPoints = 0;
        ColorGroup colorGroup = null;
        for (ColorGroup group : colorGroups) {
            if (group.maxDiff > 0) {
                if (group.totalPoints > maxPoints) {
                    colorGroup = group;
                    maxPoints = group.totalPoints;
                }
            }
        }
        if (colorGroup == null) {
            return false;
        }
        
        
        
        double bestScore = Double.MAX_VALUE;
        ColorComponent bestColorComponent = null;
        int bestMedianIndex = -1;
        for (final ColorComponent colorComponent : ColorComponent.values()) {
            if (ignoreAlpha && colorComponent == ColorComponent.ALPHA) {
                continue;
            }
            Collections.sort(colorGroup.colorCounts, new ColorComparer(colorComponent));
            final int countHalf = (int) Math.round((double) colorGroup.totalPoints / 2);
            int oldCount = 0, newCount = 0;
            int medianIndex;
            for (medianIndex = 0; medianIndex < colorGroup.colorCounts.size(); medianIndex++) {
                final ColorCount colorCount = colorGroup.colorCounts.get(medianIndex);
    
                newCount += colorCount.count;
    
                if (newCount < countHalf) {
                    oldCount = newCount;
                } else {
                    break;
                }
            }
            if (medianIndex == colorGroup.colorCounts.size() - 1) {
                medianIndex--;
            } else if (medianIndex > 0) {
                final int newDiff = Math.abs(newCount - countHalf);
                final int oldDiff = Math.abs(countHalf - oldCount);
                if (oldDiff < newDiff) {
                    medianIndex--;
                }
            }

            final List<ColorCount> lowerColors = new ArrayList<ColorCount>(
                    colorGroup.colorCounts.subList(0, medianIndex + 1));
            final List<ColorCount> upperColors = new ArrayList<ColorCount>(
                    colorGroup.colorCounts.subList(medianIndex + 1,
                            colorGroup.colorCounts.size()));
            if (lowerColors.isEmpty() || upperColors.isEmpty()) {
                continue;
            }
            final ColorGroup lowerGroup = new ColorGroup(lowerColors, ignoreAlpha);
            final ColorGroup upperGroup = new ColorGroup(upperColors, ignoreAlpha);
            final int diff = Math.abs(lowerGroup.totalPoints - upperGroup.totalPoints);
            final double score = diff / (double) Math.max(lowerGroup.totalPoints, upperGroup.totalPoints);
            if (score < bestScore) {
                bestScore = score;
                bestColorComponent = colorComponent;
                bestMedianIndex = medianIndex;
            }
        }

        if (bestColorComponent == null) {
            return false;
        }
        
        Collections.sort(colorGroup.colorCounts, new ColorComparer(bestColorComponent));
        final List<ColorCount> lowerColors = new ArrayList<ColorCount>(
                colorGroup.colorCounts.subList(0, bestMedianIndex + 1));
        final List<ColorCount> upperColors = new ArrayList<ColorCount>(
                colorGroup.colorCounts.subList(bestMedianIndex + 1,
                        colorGroup.colorCounts.size()));
        final ColorGroup lowerGroup = new ColorGroup(lowerColors, ignoreAlpha);
        final ColorGroup upperGroup = new ColorGroup(upperColors, ignoreAlpha);
        colorGroups.remove(colorGroup);
        colorGroups.add(lowerGroup);
        colorGroups.add(upperGroup);
        
        final ColorCount medianValue = colorGroup.colorCounts
                .get(bestMedianIndex);
        int limit;
        switch (bestColorComponent) {
        case ALPHA:
            limit = medianValue.alpha;
            break;
        case RED:
            limit = medianValue.red;
            break;
        case GREEN:
            limit = medianValue.green;
            break;
        case BLUE:
            limit = medianValue.blue;
            break;
        default:
            throw new Error("Bad mode.");
        }
        colorGroup.cut = new ColorGroupCut(lowerGroup, upperGroup, bestColorComponent, limit);
        return true;
    }
    
    private static class ColorComparer implements Comparator<ColorCount>, Serializable {
        private static final long serialVersionUID = 1L;
        
        private final ColorComponent colorComponent;
        
        public ColorComparer(final ColorComponent colorComponent) {
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
    }

}
