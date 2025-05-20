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
package org.apache.commons.imaging.formats.jpeg.segments;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.io.IOException;

import org.apache.commons.imaging.ImagingException;
import org.junit.jupiter.api.Test;

/**
 * Tests for class {@link App2Segment}.
 *
 * @see App2Segment
 **/
public class App2SegmentTest {

    @Test
    public void testCompareTo() throws IOException, ImagingException {
        final App2Segment app2Segment = new App2Segment(0, 0, null);

        assertEquals(0, app2Segment.compareTo(app2Segment));
    }

    @Test
    public void testEqualsReturningFalse() throws IOException, ImagingException {
        final byte[] byteArray = new byte[3];
        final App2Segment app2Segment = new App2Segment(65475, byteArray);

        assertNotEquals(app2Segment, byteArray);
    }

    @Test
    public void testEqualsReturningTrue() throws IOException, ImagingException {
        final App2Segment app2Segment = new App2Segment(0, 0, null);

        assertEquals(app2Segment, app2Segment);
    }

}
