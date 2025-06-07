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

public class ColorCmykTest {

    private ColorCmyk color;
    private ColorCmyk colorCopy;

    @BeforeEach
    public void setUp() {
        color = new ColorCmyk(1.0, 2.0, 3.0, 4.0);
        colorCopy = new ColorCmyk(1.0, 2.0, 3.0, 4.0);
    }

    @Test
    void testCAssignment() {
        assertEquals(1.0, color.c, 0.0);
    }

    @Test
    void testHashCodeAndEquals() {
        assertTrue(color.equals(colorCopy) && colorCopy.equals(color));
        assertEquals(colorCopy.hashCode(), color.hashCode());
    }

    /**
     */
    @Test
    void testKAssignment() {
        assertEquals(4.0, color.k, 0.0);
    }

    @Test
    void testMAssignment() {
        assertEquals(2.0, color.m, 0.0);
    }

    @Test
    void testToString() {
        assertEquals("{C: 1.0, M: 2.0, Y: 3.0, K: 4.0}", color.toString());
    }

    @Test
    void testYAssignment() {
        assertEquals(3.0, color.y, 0.0);
    }
}
