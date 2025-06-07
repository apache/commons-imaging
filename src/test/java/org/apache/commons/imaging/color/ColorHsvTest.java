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
package org.apache.commons.imaging.color;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ColorHsvTest {

    private ColorHsv color;
    private ColorHsv colorCopy;

    @BeforeEach
    public void setUp() {
        color = new ColorHsv(1.0, 2.0, 3.0);
        colorCopy = new ColorHsv(1.0, 2.0, 3.0);
    }

    @Test
    void testHashCodeAndEquals() {
        assertTrue(color.equals(colorCopy) && colorCopy.equals(color));
        assertEquals(colorCopy.hashCode(), color.hashCode());
    }

    @Test
    void testHAssignment() {
        assertEquals(1.0, color.h, 0.0);
    }

    @Test
    void testSAssignment() {
        assertEquals(2.0, color.s, 0.0);
    }

    @Test
    void testToString() {
        assertEquals("{H: 1.0, S: 2.0, V: 3.0}", color.toString());
    }

    @Test
    void testVAssignment() {
        assertEquals(3.0, color.v, 0.0);
    }
}
