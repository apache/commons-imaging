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
package org.apache.commons.imaging.color;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class ColorCieLchTest {

    private ColorCieLch color;
    private ColorCieLch colorCopy;

    @BeforeEach
    public void setUp() {
        color = new ColorCieLch(1.0, 2.0, 3.0);
        colorCopy = new ColorCieLch(1.0, 2.0, 3.0);
    }

    @Test
    public void testLAssignment() {
        assertEquals(1.0, color.L, 0.0);
    }

    @Test
    public void testCAssignment() {
        assertEquals(2.0, color.C, 0.0);
    }

    @Test
    public void testHAssignment() {
        assertEquals(3.0, color.h, 0.0);
    }

    @Test
    public void testToString() {
        assertEquals("{L: 1.0, C: 2.0, h: 3.0}", color.toString());
    }

    @Test
    public void testHashCodeAndEquals() {
        assertTrue(color.equals(colorCopy) && colorCopy.equals(color));
        assertThat(color.hashCode(), is(colorCopy.hashCode()));
    }
}
