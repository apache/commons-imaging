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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.Color;

import org.junit.jupiter.api.Test;

/**
 * Performs unit tests for palette entries based on single-value targets.
 */
class PaletteEntryForValueTest {

    public PaletteEntryForValueTest() {
    }

    @Test
    void testFaultyConstructors() {
        assertThrows(IllegalArgumentException.class, () -> new PaletteEntryForValue(0.0f, null), "Constructor failed to detect invalid color");
    }

    /**
     * Test of getARGB method, of class PaletteEntryForValue.
     */
    @Test
    void testGetARGB() {
        final Color c0 = new Color(0xff0000ff);
        PaletteEntryForValue instance = new PaletteEntryForValue(0.0f, c0);
        int a0 = instance.getArgb(0.0f);
        int a1 = instance.getArgb(0.5f);
        final int a2 = instance.getArgb(Float.NaN);
        assertEquals(0xff0000ff, a0, "Invalid value for target 0.0f");
        assertEquals(0, a1, "Invalid value for target 0.5f");
        assertEquals(0, a2, "Invalid value for target NaN");
        instance = new PaletteEntryForValue(Float.NaN, c0);
        a0 = instance.getArgb(0.0f);
        a1 = instance.getArgb(Float.NaN);
        assertEquals(0, a0, "Invalid value for target 0.0f");
        assertEquals(0xff0000ff, a1, "Invalid value for target NaN");
    }

    /**
     * Test of getColor method, of class PaletteEntryForValue.
     */
    @Test
    void testGetColor() {
        final Color cTest = new Color(0xff0000ff);
        PaletteEntryForValue instance = new PaletteEntryForValue(0.0f, cTest);
        Color c0 = instance.getColor(0.0f);
        final int a0 = c0.getRGB();
        assertEquals(0xff0000ff, a0, "Invalid value for 0.0f");
        c0 = instance.getColor(1f);
        assertNull(c0, "Non-null return for invalid target 1.0f");
        c0 = instance.getColor(Float.NaN);
        assertNull(c0, "Non-null return for invalid target 1.0f");
        instance = new PaletteEntryForValue(Float.NaN, cTest);
        c0 = instance.getColor(Float.NaN);
        assertNotNull(c0, "Invalid return for valid target Float.NaN");
        c0 = instance.getColor(1.0f);
        assertNull(c0, "Invalid return for invalid valid target 1.0f");

    }

    /**
     * Test of isCovered method, of class PaletteEntryForValue.
     */
    @Test
    void testIsCovered() {
        final Color c0 = new Color(0xff0000ff);
        PaletteEntryForValue instance = new PaletteEntryForValue(0.0f, c0);
        assertTrue(instance.isCovered(0.0f), "Zero value must be covered");
        assertFalse(instance.isCovered(1.0f), "Value 1.0 must not be covered");
        instance = new PaletteEntryForValue(Float.NaN, c0);
        assertTrue(instance.isCovered(Float.NaN), "NaN value must be covered");
        assertFalse(instance.isCovered(1.0f), "Value 1.0 must not be covered");

    }
}
