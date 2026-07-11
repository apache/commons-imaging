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

package org.apache.commons.imaging.palette;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.imaging.ImagingException;
import org.junit.jupiter.api.Test;

public class ColorGroupCutTest {

    @Test
    public void testGetColorGroup() throws ImagingException {
        final List<ColorCount> lessCounts = new ArrayList<>();
        lessCounts.add(new ColorCount(0xFF000000));
        final ColorGroup less = new ColorGroup(lessCounts, false);
        final List<ColorCount> moreCounts = new ArrayList<>();
        moreCounts.add(new ColorCount(0xFFFFFFFF));
        final ColorGroup more = new ColorGroup(moreCounts, false);
        final ColorGroupCut cut = new ColorGroupCut(less, more, ColorComponent.RED, 127);
        assertEquals(127, cut.limit);
        assertSame(ColorComponent.RED, cut.mode);
        assertSame(less, cut.less);
        assertSame(more, cut.more);
        // Red is 0, 0 <= 127 -> less
        assertSame(less, cut.getColorGroup(0xFF000000));
        // Red is 127, 127 <= 127 -> less
        assertSame(less, cut.getColorGroup(0xFF7F0000));
        // Red is 128, 128 > 127 -> more
        assertSame(more, cut.getColorGroup(0xFF800000));
    }
}
