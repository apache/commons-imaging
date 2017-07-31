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
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Before;
import org.junit.Test;

public class ColorCmyTest {

    private ColorCmy color;
    private ColorCmy colorCopy;

    @Before
    public void setUp() throws Exception {
        color = new ColorCmy(1.0, 2.0, 3.0);
        colorCopy = new ColorCmy(1.0, 2.0, 3.0);
    }

    @Test
    public void testCAssignment() throws Exception {
        assertEquals(1.0, color.C, 0.0);
    }

    @Test
    public void testMAssignment() throws Exception {
        assertEquals(2.0, color.M, 0.0);
    }

    @Test
    public void testYAssignment() throws Exception {
        assertEquals(3.0, color.Y, 0.0);
    }

    @Test
    public void testToString() throws Exception {
        assertEquals("{C: 1.0, M: 2.0, Y: 3.0}", color.toString());
    }

    @Test
    public void testCreatesColorCmy() {
        ColorCmy colorCmy = new ColorCmy(0.0, (-1668.733868772), (-1568.733868772));
        ColorCmy colorCmyTwo = ColorCmy.YELLOW;

        assertFalse(colorCmy.equals(colorCmyTwo));
        assertEquals((-1568.733868772), colorCmy.Y, 0.01);
        assertEquals((-1668.733868772), colorCmy.M, 0.01);
    }

    @Test
    public void testEquals() {
        EqualsVerifier.forClass(ColorCmy.class).verify();
    }

}