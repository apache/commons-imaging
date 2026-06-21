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
        List<ColorCount> lessCounts = new ArrayList<>();
        lessCounts.add(new ColorCount(0xFF000000));
        ColorGroup less = new ColorGroup(lessCounts, false);

        List<ColorCount> moreCounts = new ArrayList<>();
        moreCounts.add(new ColorCount(0xFFFFFFFF));
        ColorGroup more = new ColorGroup(moreCounts, false);

        ColorGroupCut cut = new ColorGroupCut(less, more, ColorComponent.RED, 127);

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
