/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.imaging.palette;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.imaging.ImagingException;
import org.junit.jupiter.api.Test;

public class LongestAxisMedianCutTest {

    @Test
    public void testPerformNextMedianCut() throws ImagingException {
        final LongestAxisMedianCut medianCut = new LongestAxisMedianCut();
        final List<ColorGroup> colorGroups = new ArrayList<>();
        final List<ColorCount> colorCounts = new ArrayList<>();
        // Red variation: 0 to 100
        for (int i = 0; i <= 100; i++) {
            colorCounts.add(new ColorCount(0xff000000 | i << 16));
        }
        // Green variation: 0 to 50
        // Blue variation: 0 to 50
        final ColorGroup root = new ColorGroup(colorCounts, false);
        colorGroups.add(root);
        // Red is the longest axis (100 > 50, 0, 0)
        final boolean result = medianCut.performNextMedianCut(colorGroups, false);
        assertTrue(result);
        assertEquals(2, colorGroups.size());
    }

    @Test
    public void testPerformNextMedianCutWithIgnoreAlpha() throws ImagingException {
        final LongestAxisMedianCut medianCut = new LongestAxisMedianCut();
        final List<ColorGroup> colorGroups = new ArrayList<>();
        final List<ColorCount> colorCounts = new ArrayList<>();
        // Alpha variation: 0 to 200
        // Red variation: 0 to 100
        for (int i = 0; i <= 100; i++) {
            // ARGB: i*2, i, 0, 0
            colorCounts.add(new ColorCount(i * 2 << 24 | i << 16));
        }
        final ColorGroup root = new ColorGroup(colorCounts, true);
        colorGroups.add(root);
        // If ignoreAlpha is true, Red should be the longest axis (100) even though Alpha has 200 range
        medianCut.performNextMedianCut(colorGroups, true);
        assertEquals(2, colorGroups.size());
        final ColorGroup cg1 = colorGroups.get(0);
        final ColorGroup cg2 = colorGroups.get(1);
        // Both should have same green and blue (0)
        assertEquals(0, cg1.minGreen);
        assertEquals(0, cg1.maxGreen);
        assertEquals(0, cg2.minGreen);
        assertEquals(0, cg2.maxGreen);
    }

    @Test
    public void testPerformNextMedianCutSingleColor() throws ImagingException {
        final LongestAxisMedianCut medianCut = new LongestAxisMedianCut();
        final List<ColorGroup> colorGroups = new ArrayList<>();
        final List<ColorCount> colorCounts = new ArrayList<>();
        colorCounts.add(new ColorCount(0xff000000));
        final ColorGroup root = new ColorGroup(colorCounts, false);
        colorGroups.add(root);
        // maxDiff is 0, should return false
        final boolean result = medianCut.performNextMedianCut(colorGroups, false);
        assertFalse(result);
        assertEquals(1, colorGroups.size());
    }

    @Test
    public void testPerformNextMedianCutDetailed() throws ImagingException {
        final LongestAxisMedianCut medianCut = new LongestAxisMedianCut();
        final List<ColorGroup> colorGroups = new ArrayList<>();
        final List<ColorCount> colorCounts = new ArrayList<>();
        // Create 10 pixels of color 1 and 10 pixels of color 2
        final ColorCount cc1 = new ColorCount(0xff000000); // Black
        cc1.count = 10;
        colorCounts.add(cc1);
        final ColorCount cc2 = new ColorCount(0xffff0000); // Red
        cc2.count = 10;
        colorCounts.add(cc2);
        final ColorGroup root = new ColorGroup(colorCounts, false);
        colorGroups.add(root);
        final boolean result = medianCut.performNextMedianCut(colorGroups, false);
        assertTrue(result);
        assertEquals(2, colorGroups.size());
        // Each group should have 10 points
        assertEquals(10, colorGroups.get(0).totalPoints);
        assertEquals(10, colorGroups.get(1).totalPoints);
    }

    @Test
    public void testPerformNextMedianCutAllAxes() throws ImagingException {
        final LongestAxisMedianCut medianCut = new LongestAxisMedianCut();
        // Test Green axis
        {
            final List<ColorGroup> colorGroups = new ArrayList<>();
            final List<ColorCount> colorCounts = new ArrayList<>();
            colorCounts.add(new ColorCount(0xff000000));
            colorCounts.add(new ColorCount(0xff00ff00));
            colorGroups.add(new ColorGroup(colorCounts, false));
            assertTrue(medianCut.performNextMedianCut(colorGroups, false));
            // After cut, the original group in the list is replaced or new ones added.
            // LongestAxisMedianCut.doCut removes the old group and adds two new ones.
            // The list will have 2 groups.
            assertEquals(2, colorGroups.size());
        }
        // Test Blue axis
        {
            final List<ColorGroup> colorGroups = new ArrayList<>();
            final List<ColorCount> colorCounts = new ArrayList<>();
            colorCounts.add(new ColorCount(0xff000000));
            colorCounts.add(new ColorCount(0xff0000ff));
            colorGroups.add(new ColorGroup(colorCounts, false));
            assertTrue(medianCut.performNextMedianCut(colorGroups, false));
            assertEquals(2, colorGroups.size());
        }
        // Test Alpha axis
        {
            final List<ColorGroup> colorGroups = new ArrayList<>();
            final List<ColorCount> colorCounts = new ArrayList<>();
            colorCounts.add(new ColorCount(0x00000000));
            colorCounts.add(new ColorCount(0xff000000));
            colorGroups.add(new ColorGroup(colorCounts, false));
            assertTrue(medianCut.performNextMedianCut(colorGroups, false));
            assertEquals(2, colorGroups.size());
        }
    }

    @Test
    public void testPerformNextMedianCutMultipleGroups() throws ImagingException {
        final LongestAxisMedianCut medianCut = new LongestAxisMedianCut();
        final List<ColorGroup> colorGroups = new ArrayList<>();
        // Group 1: Range 10 (Red)
        final List<ColorCount> counts1 = new ArrayList<>();
        counts1.add(new ColorCount(0xff000000));
        counts1.add(new ColorCount(0xff0a0000));
        colorGroups.add(new ColorGroup(counts1, false));
        // Group 2: Range 20 (Red)
        final List<ColorCount> counts2 = new ArrayList<>();
        counts2.add(new ColorCount(0xff000000));
        counts2.add(new ColorCount(0xff140000));
        colorGroups.add(new ColorGroup(counts2, false));
        // Should cut Group 2 because it has larger maxDiff (20 > 10)
        assertTrue(medianCut.performNextMedianCut(colorGroups, false));
        assertEquals(3, colorGroups.size());
        // Check that one group still has range 10, and two new groups are created from the range 20 group
        boolean foundRange10 = false;
        for (final ColorGroup cg : colorGroups) {
            if (cg.maxDiff == 10) {
                foundRange10 = true;
                break;
            }
        }
        assertTrue(foundRange10);
    }

    @Test
    public void testPerformNextMedianCutAmbiguousMedian() throws ImagingException {
        final LongestAxisMedianCut medianCut = new LongestAxisMedianCut();
        final List<ColorGroup> colorGroups = new ArrayList<>();
        final List<ColorCount> colorCounts = new ArrayList<>();
        // 3 colors with counts that make median selection interesting
        // Total points = 10
        // countHalf = 5
        final ColorCount cc1 = new ColorCount(0xff000000); // 0
        cc1.count = 3;
        colorCounts.add(cc1);
        final ColorCount cc2 = new ColorCount(0xff010000); // 1
        cc2.count = 4;
        colorCounts.add(cc2);
        final ColorCount cc3 = new ColorCount(0xff020000); // 2
        cc3.count = 3;
        colorCounts.add(cc3);
        colorGroups.add(new ColorGroup(colorCounts, false));
        // medianIndex loop:
        // i=0: newCount=3. 3 < 5.
        // i=1: newCount=7. 7 >= 5. break. medianIndex=1.
        // newDiff = |7 - 5| = 2
        // oldDiff = |5 - 3| = 2
        // oldDiff < newDiff is false (2 < 2 is false).
        // medianIndex stays 1.
        // colorCounts1: [cc1, cc2], colorCounts2: [cc3]
        assertTrue(medianCut.performNextMedianCut(colorGroups, false));
        assertEquals(2, colorGroups.size());
        // Find the group with 7 points
        boolean found7 = false;
        boolean found3 = false;
        for (final ColorGroup cg : colorGroups) {
            if (cg.totalPoints == 7) {
                found7 = true;
            }
            if (cg.totalPoints == 3) {
                found3 = true;
            }
        }
        assertTrue(found7);
        assertTrue(found3);
    }

    @Test
    public void testPerformNextMedianCutOldDiffSmaller() throws ImagingException {
        final LongestAxisMedianCut medianCut = new LongestAxisMedianCut();
        final List<ColorGroup> colorGroups = new ArrayList<>();
        final List<ColorCount> colorCounts = new ArrayList<>();
        // countHalf = 5
        final ColorCount cc1 = new ColorCount(0xff000000);
        cc1.count = 4;
        colorCounts.add(cc1);
        final ColorCount cc2 = new ColorCount(0xff010000);
        cc2.count = 3;
        colorCounts.add(cc2);
        final ColorCount cc3 = new ColorCount(0xff020000);
        cc3.count = 3;
        colorCounts.add(cc3);
        colorGroups.add(new ColorGroup(colorCounts, false));
        // medianIndex loop:
        // i=0: newCount=4.
        // i=1: newCount=7. break. medianIndex=1.
        // newDiff = |7 - 5| = 2
        // oldDiff = |5 - 4| = 1
        // oldDiff < newDiff (1 < 2) IS TRUE.
        // medianIndex becomes 0.
        // colorCounts1: [cc1], colorCounts2: [cc2, cc3]
        assertTrue(medianCut.performNextMedianCut(colorGroups, false));
        assertEquals(2, colorGroups.size());
        boolean found4 = false;
        boolean found6 = false;
        for (final ColorGroup cg : colorGroups) {
            if (cg.totalPoints == 4) {
                found4 = true;
            }
            if (cg.totalPoints == 6) {
                found6 = true;
            }
        }
        assertTrue(found4);
        assertTrue(found6);
    }
}
