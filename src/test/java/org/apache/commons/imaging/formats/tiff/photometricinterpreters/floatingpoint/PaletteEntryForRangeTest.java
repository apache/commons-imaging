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
package org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.Color;

import org.junit.jupiter.api.Test;

/**
 * Performs unit tests for palette entries based on range of values.
 */
public class PaletteEntryForRangeTest {

    public PaletteEntryForRangeTest() {
    }

    /**
     * Test of coversSingleEntry method, of class PaletteEntryForRange.
     */
    @Test
    void testCoversSingleEntry() {
        final Color c0 = new Color(0xff0000ff);
        final Color c1 = new Color(0xff00ff00);
        final PaletteEntryForRange instance = new PaletteEntryForRange(0.0f, 1.0f, c0, c1);
        assertFalse(instance.coversSingleEntry());
    }

    @Test
    void testFaultyConstructors() {
        final Color c0 = new Color(0xff0000ff);
        final Color c1 = new Color(0xff00ff00);

        // test the two-color variations
        assertThrows(IllegalArgumentException.class, () -> new PaletteEntryForRange(0.0f, 0.0f, c0, c1), "Constructor failed to detect invalid range");

        assertThrows(IllegalArgumentException.class, () -> new PaletteEntryForRange(0.0f, 1.0f, null, c1), "Constructor failed to detect null color");

        assertThrows(IllegalArgumentException.class, () -> new PaletteEntryForRange(0.0f, 1.0f, c0, null), "Constructor failed to detect invalid color");

        // test the one-color variations
        assertThrows(IllegalArgumentException.class, () -> new PaletteEntryForRange(0.0f, 0.0f, c0), "Constructor failed to detect invalid range");

        assertThrows(IllegalArgumentException.class, () -> new PaletteEntryForRange(0.0f, 1.0f, null), "Constructor failed to detect null color");
    }

    /**
     * Test of getARGB method, of class PaletteEntryForRange.
     */
    @Test
    void testGetARGB() {
        final Color c0 = new Color(0xff0000ff);
        final Color c1 = new Color(0xff00ff00);
        final PaletteEntryForRange instance = new PaletteEntryForRange(0.0f, 1.0f, c0, c1);
        final int a0 = instance.getArgb(0.0f);
        final int a1 = instance.getArgb(0.5f);
        assertEquals(0xff0000ff, a0, "Invalid value for 0.0f");
        assertEquals(0xff008080, a1, "Invalid interpolated values");
    }

    /**
     * Test of getColor method, of class PaletteEntryForRange.
     */
    @Test
    void testGetColor() {
        Color c0 = new Color(0xff0000ff);
        Color c1 = new Color(0xff00ff00);
        final PaletteEntryForRange instance = new PaletteEntryForRange(0.0f, 1.0f, c0, c1);
        c0 = instance.getColor(0.0f);
        c1 = instance.getColor(0.5f);
        final int a0 = c0.getRGB();
        final int a1 = c1.getRGB();
        assertEquals(0xff0000ff, a0, "Invalid value for 0.0f");
        assertEquals(0xff008080, a1, "Invalid interpolated values");

    }

    /**
     * Test of getLowerBound method, of class PaletteEntryForRange.
     */
    @Test
    void testGetLowerBound() {
        final Color c0 = new Color(0xff0000ff);
        final Color c1 = new Color(0xff00ff00);
        final PaletteEntryForRange instance = new PaletteEntryForRange(0.0f, 1.0f, c0, c1);
        assertEquals(0.0f, instance.getLowerBound());
    }

    /**
     * Test of getUpperBound method, of class PaletteEntryForRange.
     */
    @Test
    void testGetUpperBound() {
        final Color c0 = new Color(0xff0000ff);
        final Color c1 = new Color(0xff00ff00);
        final PaletteEntryForRange instance = new PaletteEntryForRange(0.0f, 1.0f, c0, c1);
        assertEquals(1.0f, instance.getUpperBound());
    }

    /**
     * Test of isCovered method, of class PaletteEntryForRange.
     */
    @Test
    void testIsCovered() {
        final Color c0 = new Color(0xff0000ff);
        final Color c1 = new Color(0xff00ff00);
        final PaletteEntryForRange instance = new PaletteEntryForRange(0.0f, 1.0f, c0, c1);
        assertTrue(instance.isCovered(0.0f), "Zero value must be covered");
        assertFalse(instance.isCovered(1.0f), "Value 1.0 must not be covered");
    }
}
