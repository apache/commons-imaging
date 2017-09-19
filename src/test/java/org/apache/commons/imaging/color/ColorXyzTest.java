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

import org.junit.Before;
import org.junit.Test;

public class ColorXyzTest {

    private ColorXyz color;
    private ColorXyz colorCopy;

    @Before
    public void setUp() throws Exception {
        color = new ColorXyz(1.0, 2.0, 3.0);
        colorCopy = new ColorXyz(1.0, 2.0, 3.0);
    }

    @Test
    public void testXAssignment() throws Exception {
        assertEquals(1.0, color.X, 0.0);
    }

    @Test
    public void testYAssignment() throws Exception {
        assertEquals(2.0, color.Y, 0.0);
    }

    @Test
    public void testZAssignment() throws Exception {
        assertEquals(3.0, color.Z, 0.0);
    }

    @Test
    public void testToString() throws Exception {
        assertEquals("{X: 1.0, Y: 2.0, Z: 3.0}", color.toString());
    }

    @Test
    public void testHashCodeAndEquals() throws Exception {
        assertTrue(color.equals(colorCopy) && colorCopy.equals(color));
        assertThat(color.hashCode(), is(colorCopy.hashCode()));
    }
}
