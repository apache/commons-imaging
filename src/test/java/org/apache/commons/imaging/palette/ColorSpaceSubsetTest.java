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

import org.junit.jupiter.api.Test;

public class ColorSpaceSubsetTest {

    @Test
    public void testConstructorAndGetters() {
        final int total = 100;
        final int precision = 5;
        final ColorSpaceSubset subset = new ColorSpaceSubset(total, precision);
        assertEquals(total, subset.total);
        assertEquals(precision, subset.precision);
        assertEquals(-1, subset.rgb);
        subset.setIndex(12);
        assertEquals(12, subset.getIndex());
    }

    @Test
    public void testConstructorWithMinsMaxs() {
        final int total = 50;
        final int precision = 6;
        final int[] mins = { 1, 2, 3 };
        final int[] maxs = { 10, 11, 12 };
        final ColorSpaceSubset subset = new ColorSpaceSubset(total, precision, mins, maxs);
        assertEquals(total, subset.total);
        assertEquals(precision, subset.precision);
        assertEquals(mins, subset.mins);
        assertEquals(maxs, subset.maxs);
    }

    @Test
    public void testContains() {
        // Precision 8 means no bit shifting in contains() effectively (8-8=0)
        // However, the code uses 8 - precision.
        // If precision is 8, red >>= 0.
        // If precision is 5, red >>= 3.
        final int precision = 5;
        final int precisionMask = (1 << precision) - 1; // 31
        final ColorSpaceSubset subset = new ColorSpaceSubset(100, precision);
        // Default mins are 0, maxs are precisionMask (31)
        // Color (128, 128, 128)
        // red = 128 >> 3 = 16. 0 <= 16 <= 31.
        assertTrue(subset.contains(128, 128, 128));
        // Boundary test
        final int[] mins = { 10, 10, 10 };
        final int[] maxs = { 20, 20, 20 };
        final ColorSpaceSubset restricted = new ColorSpaceSubset(100, precision, mins, maxs);
        // red = 80 >> 3 = 10. OK.
        assertTrue(restricted.contains(80, 80, 80));
        assertTrue(restricted.contains(160, 160, 160)); // 160 >> 3 = 20. OK.
        assertFalse(restricted.contains(79, 80, 80)); // 79 >> 3 = 9. Too small.
        assertFalse(restricted.contains(168, 80, 80)); // 168 >> 3 = 21. Too large.
        assertFalse(restricted.contains(80, 79, 80));
        assertFalse(restricted.contains(80, 168, 80));
        assertFalse(restricted.contains(80, 80, 79));
        assertFalse(restricted.contains(80, 80, 168));
    }

    @Test
    public void testGetArea() {
        final int[] mins = { 10, 20, 30 };
        final int[] maxs = { 15, 25, 35 };
        // diffs are 6, 6, 6
        final ColorSpaceSubset subset = new ColorSpaceSubset(100, 8, mins, maxs);
        assertEquals(6 * 6 * 6, subset.getArea());
    }

    @Test
    public void testSetAverageRgb() {
        final int precision = 2; // 2 bits per component. 0, 1, 2, 3
        // index = blue << 4 | green << 2 | red
        // table size = 1 << 6 = 64
        final int[] table = new int[64];
        // mins/maxs are inclusive
        final int[] mins = { 1, 1, 1 };
        final int[] maxs = { 2, 2, 2 };
        // colors in subset: (1,1,1), (2,1,1), (1,2,1), (2,2,1), (1,1,2), (2,1,2), (1,2,2), (2,2,2)
        // Let's put 10 pixels of (1,1,1) shifted by (8-precision) = 6
        // actual color = 1 << 6 = 64
        final int idx1 = 1 << 4 | 1 << 2 | 1;
        table[idx1] = 10;
        // Let's put 10 pixels of (2,2,2)
        // actual color = 2 << 6 = 128
        final int idx2 = 2 << 4 | 2 << 2 | 2;
        table[idx2] = 10;
        final ColorSpaceSubset subset = new ColorSpaceSubset(20, precision, mins, maxs);
        subset.setAverageRgb(table);
        // average red = (10 * 64 + 10 * 128) / 20 = (640 + 1280) / 20 = 1920 / 20 = 96
        // rgb = (96 << 16) | (96 << 8) | 96
        assertEquals(0x606060, subset.rgb & 0xffffff);
    }

    @Test
    public void testRgbComparator() {
        final ColorSpaceSubset subset1 = new ColorSpaceSubset(100, 8);
        subset1.rgb = 0x102030;
        final ColorSpaceSubset subset2 = new ColorSpaceSubset(100, 8);
        subset2.rgb = 0x102040;
        assertTrue(ColorSpaceSubset.RGB_COMPARATOR.compare(subset1, subset2) < 0);
        assertTrue(ColorSpaceSubset.RGB_COMPARATOR.compare(subset2, subset1) > 0);
        assertEquals(0, ColorSpaceSubset.RGB_COMPARATOR.compare(subset1, subset1));
    }

    @Test
    public void testDump() {
        // Just verify it doesn't throw anything
        final ColorSpaceSubset subset = new ColorSpaceSubset(100, 8);
        subset.rgb = 0x123456;
        subset.dump("Test");
        subset.dumpJustRgb("TestJustRgb");
    }
}
