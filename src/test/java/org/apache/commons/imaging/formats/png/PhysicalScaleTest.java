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
package org.apache.commons.imaging.formats.png;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PhysicalScaleTest {
    private static final double delta = 0.01;

    @Test
    void testCreateFromMeters() {
        final PhysicalScale physicalScale = PhysicalScale.createFromMeters(1.0, 2.0);

        assertTrue(physicalScale.isInMeters());
        assertFalse(physicalScale.isInRadians());
        assertEquals(physicalScale.getHorizontalUnitsPerPixel(), 1.0, delta);
        assertEquals(physicalScale.getVerticalUnitsPerPixel(), 2.0, delta);
    }

    @Test
    void testCreateFromRadians() {
        final PhysicalScale physicalScale = PhysicalScale.createFromRadians(2.0, 1.0);

        assertFalse(physicalScale.isInMeters());
        assertTrue(physicalScale.isInRadians());
        assertEquals(physicalScale.getHorizontalUnitsPerPixel(), 2.0, delta);
        assertEquals(physicalScale.getVerticalUnitsPerPixel(), 1.0, delta);
    }
}
