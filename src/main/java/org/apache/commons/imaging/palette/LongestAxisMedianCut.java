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

public class LongestAxisMedianCut implements MedianCut {
    private static final Comparator<ColorGroup> COMPARATOR = (cg1, cg2) -> {
        if (cg1.maxDiff == cg2.maxDiff) {
            return cg2.diffTotal - cg1.diffTotal;
        }
        return cg2.maxDiff - cg1.maxDiff;
    };

    @Override
    public boolean performNextMedianCut(final List<ColorGroup> colorGroups, final boolean ignoreAlpha)
            throws ImageWriteException {
        Collections.sort(colorGroups, COMPARATOR);
        final ColorGroup colorGroup = colorGroups.get(0);

        if (colorGroup.maxDiff == 0) {
            return false;
        }
        if (!ignoreAlpha
                && colorGroup.alphaDiff > colorGroup.redDiff
                && colorGroup.alphaDiff > colorGroup.greenDiff
                && colorGroup.alphaDiff > colorGroup.blueDiff) {
            doCut(colorGroup, ColorComponent.ALPHA, colorGroups, ignoreAlpha);
        } else if (colorGroup.redDiff > colorGroup.greenDiff
                && colorGroup.redDiff > colorGroup.blueDiff) {
            doCut(colorGroup, ColorComponent.RED, colorGroups, ignoreAlpha);
        } else if (colorGroup.greenDiff > colorGroup.blueDiff) {
            doCut(colorGroup, ColorComponent.GREEN, colorGroups, ignoreAlpha);
        } else {
            doCut(colorGroup, ColorComponent.BLUE, colorGroups, ignoreAlpha);
        }
        return true;
    }

    private void doCut(final ColorGroup colorGroup, final ColorComponent mode,
            final List<ColorGroup> colorGroups, final boolean ignoreAlpha) throws ImageWriteException {

        final Comparator<ColorCount> comp = (c1, c2) -> {
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
        };

        final List<ColorCount> colorCounts = colorGroup.getColorCounts();
        Collections.sort(colorCounts, comp);
        final int countHalf = (int) Math.round((double) colorGroup.totalPoints / 2);
        int oldCount = 0;
        int newCount = 0;
        int medianIndex;
        for (medianIndex = 0; medianIndex < colorCounts.size(); medianIndex++) {
            final ColorCount colorCount = colorCounts.get(medianIndex);

            newCount += colorCount.count;

            if (newCount < countHalf) {
                oldCount = newCount;
            } else {
                break;
            }
        }

        if (medianIndex == colorCounts.size() - 1) {
            medianIndex--;
        } else if (medianIndex > 0) {
            final int newDiff = Math.abs(newCount - countHalf);
            final int oldDiff = Math.abs(countHalf - oldCount);
            if (oldDiff < newDiff) {
                medianIndex--;
            }
        }

        colorGroups.remove(colorGroup);
        final List<ColorCount> colorCounts1 = new ArrayList<>(
                colorCounts.subList(0, medianIndex + 1));
        final List<ColorCount> colorCounts2 = new ArrayList<>(
                colorCounts.subList(medianIndex + 1,
                        colorCounts.size()));

        final ColorGroup less = new ColorGroup(new ArrayList<>(colorCounts1), ignoreAlpha);
        colorGroups.add(less);
        final ColorGroup more = new ColorGroup(new ArrayList<>(colorCounts2), ignoreAlpha);
        colorGroups.add(more);

        final ColorCount medianValue = colorCounts.get(medianIndex);
        int limit;
        switch (mode) {
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
        colorGroup.cut = new ColorGroupCut(less, more, mode, limit);
    }
}
