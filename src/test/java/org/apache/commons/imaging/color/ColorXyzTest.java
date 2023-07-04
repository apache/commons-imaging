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
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ColorXyzTest {

    private ColorXyz color;
    private ColorXyz colorCopy;

    @BeforeEach
    public void setUp() {
        color = new ColorXyz(1.0, 2.0, 3.0);
        colorCopy = new ColorXyz(1.0, 2.0, 3.0);
    }

    @Test
    public void testHashCodeAndEquals() {
        assertTrue(color.equals(colorCopy) && colorCopy.equals(color));
        assertThat(color.hashCode(), is(colorCopy.hashCode()));
    }

    @Test
    public void testToString() {
        assertEquals("{X: 1.0, Y: 2.0, Z: 3.0}", color.toString());
    }

    @Test
    public void testXAssignment() {
        assertEquals(1.0, color.x, 0.0);
    }

    @Test
    public void testYAssignment() {
        assertEquals(2.0, color.y, 0.0);
    }

    @Test
    public void testZAssignment() {
        assertEquals(3.0, color.z, 0.0);
    }
}
