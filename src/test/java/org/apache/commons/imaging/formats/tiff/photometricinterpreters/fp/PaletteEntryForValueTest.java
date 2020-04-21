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
package org.apache.commons.imaging.formats.tiff.photometricinterpreters.fp;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Performs unit tests for palette entries based on single-value targets.
 */
public class PaletteEntryForValueTest {

    public PaletteEntryForValueTest() {
    }

    /**
     * Test of isCovered method, of class PaletteEntryForValue.
     */
    @Test
    public void testIsCovered() {
        Color c0 = new Color(0xff0000ff);
        PaletteEntryForValue instance = new PaletteEntryForValue(0.0f, c0);
        assertTrue(instance.isCovered(0.0f), "Zero value must be covered");
        assertFalse(instance.isCovered(1.0f), "Value 1.0 must not be covered");
        instance = new PaletteEntryForValue(Float.NaN, c0);
        assertTrue(instance.isCovered(Float.NaN), "NaN value must be covered");
        assertFalse(instance.isCovered(1.0f), "Value 1.0 must not be covered");

    }

    /**
     * Test of getARGB method, of class PaletteEntryForValue.
     */
    @Test
    public void testGetARGB() {
        Color c0 = new Color(0xff0000ff);
        PaletteEntryForValue instance = new PaletteEntryForValue(0.0f, c0);
        int a0 = instance.getARGB(0.0f);
        int a1 = instance.getARGB(0.5f);
        int a2 = instance.getARGB(Float.NaN);
        assertEquals(0xff0000ff, a0, "Invalid value for target 0.0f");
        assertEquals(0, a1, "Invalid value for target 0.5f");
        assertEquals(0, a2, "Invalid value for target NaN");
        instance = new PaletteEntryForValue(Float.NaN, c0);
        a0 = instance.getARGB(0.0f);
        a1 = instance.getARGB(Float.NaN);
        assertEquals(0, a0, "Invalid value for target 0.0f");
        assertEquals(0xff0000ff, a1, "Invalid value for target NaN");
    }

    /**
     * Test of getColor method, of class PaletteEntryForValue.
     */
    @Test
    public void testGetColor() {
        Color cTest = new Color(0xff0000ff);
        PaletteEntryForValue instance = new PaletteEntryForValue(0.0f, cTest);
        Color c0 = instance.getColor(0.0f);
        int a0 = c0.getRGB();
        assertEquals(0xff0000ff, a0, "Invalid value for 0.0f");
        c0 = instance.getColor(1f);
        assertTrue(c0 == null, "Non-null return for invalid target 1.0f");
        c0 = instance.getColor(Float.NaN);
        assertTrue(c0 == null, "Non-null return for invalid target 1.0f");
        instance = new PaletteEntryForValue(Float.NaN, cTest);
        c0 = instance.getColor(Float.NaN);
        assertTrue(c0 != null, "Invalid return for valid target Float.NaN");
        c0 = instance.getColor(1.0f);
        assertTrue(c0 == null, "Invalid return for invalid valid target 1.0f");

    }


    @Test
    public void testFaultyConstructors() {
        Color c0 = new Color(0xff0000ff);
        Color c1 = new Color(0xff00ff00);
        PaletteEntryForValue pTest;


        try {
            pTest = new PaletteEntryForValue(0.0f, null);
            fail("Constructor failed to detect null color");
        } catch (IllegalArgumentException iex) {
            // successful test
        }

    }
}
