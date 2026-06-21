package org.apache.commons.imaging.palette;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.imaging.ImagingException;
import org.junit.jupiter.api.Test;

public class ColorGroupTest {

    @Test
    public void testConstructor() throws ImagingException {
        final List<ColorCount> colorCounts = new ArrayList<>();
        final ColorCount cc1 = new ColorCount(0x01020304);
        cc1.count = 10;
        colorCounts.add(cc1);
        
        final ColorCount cc2 = new ColorCount(0x10203040);
        cc2.count = 20;
        colorCounts.add(cc2);

        final ColorGroup group = new ColorGroup(colorCounts, false);

        assertEquals(30, group.totalPoints);
        assertEquals(0x01, group.minAlpha);
        assertEquals(0x10, group.maxAlpha);
        assertEquals(0x02, group.minRed);
        assertEquals(0x20, group.maxRed);
        assertEquals(0x03, group.minGreen);
        assertEquals(0x30, group.maxGreen);
        assertEquals(0x04, group.minBlue);
        assertEquals(0x40, group.maxBlue);

        assertEquals(0x10 - 0x01, group.alphaDiff);
        assertEquals(0x20 - 0x02, group.redDiff);
        assertEquals(0x30 - 0x03, group.greenDiff);
        assertEquals(0x40 - 0x04, group.blueDiff);

        // maxDiff = max(max(alphaDiff, redDiff), max(greenDiff, blueDiff))
        // alphaDiff = 15, redDiff = 30, greenDiff = 45, blueDiff = 60
        assertEquals(60, group.maxDiff);
        assertEquals(15 + 30 + 45 + 60, group.diffTotal);
    }

    @Test
    public void testConstructorWithIgnoreAlpha() throws ImagingException {
        final List<ColorCount> colorCounts = new ArrayList<>();
        final ColorCount cc1 = new ColorCount(0xFF000000);
        cc1.count = 1;
        colorCounts.add(cc1);
        
        final ColorCount cc2 = new ColorCount(0x00FFFFFF);
        cc2.count = 1;
        colorCounts.add(cc2);

        final ColorGroup group = new ColorGroup(colorCounts, true);

        // ignoreAlpha affects maxDiff and diffTotal
        // alphaDiff = 255, redDiff = 255, greenDiff = 255, blueDiff = 255
        // if ignoreAlpha, maxDiff = max(redDiff, max(greenDiff, blueDiff)) = 255
        // diffTotal = 0 + 255 + 255 + 255 = 765
        assertEquals(255, group.maxDiff);
        assertEquals(765, group.diffTotal);
        assertTrue(group.ignoreAlpha);
    }

    @Test
    public void testConstructorEmpty() {
        final List<ColorCount> colorCounts = new ArrayList<>();
        assertThrows(ImagingException.class, () -> new ColorGroup(colorCounts, false));
    }

    @Test
    public void testContains() throws ImagingException {
        final List<ColorCount> colorCounts = new ArrayList<>();
        colorCounts.add(new ColorCount(0xFF102030));
        colorCounts.add(new ColorCount(0xFF405060));
        
        final ColorGroup group = new ColorGroup(colorCounts, false);
        
        // Inside
        assertTrue(group.contains(0xFF102030));
        assertTrue(group.contains(0xFF405060));
        assertTrue(group.contains(0xFF203040));
        
        // Outside Alpha
        assertFalse(group.contains(0x00102030));
        // Outside Red
        assertFalse(group.contains(0xFF0F2030));
        assertFalse(group.contains(0xFF412030));
        // Outside Green
        assertFalse(group.contains(0xFF101F30));
        assertFalse(group.contains(0xFF105130));
        // Outside Blue
        assertFalse(group.contains(0xFF10202F));
        assertFalse(group.contains(0xFF102061));
    }

    @Test
    public void testContainsIgnoreAlpha() throws ImagingException {
        final List<ColorCount> colorCounts = new ArrayList<>();
        colorCounts.add(new ColorCount(0xFF102030));
        colorCounts.add(new ColorCount(0xFF405060));
        
        final ColorGroup group = new ColorGroup(colorCounts, true);
        
        // Inside regardless of alpha
        assertTrue(group.contains(0xFF102030));
        assertTrue(group.contains(0x00102030));
        assertTrue(group.contains(0x80203040));
        
        // Still outside other components
        assertFalse(group.contains(0xFF0F2030));
    }

    @Test
    public void testGetColorCounts() throws ImagingException {
        final List<ColorCount> colorCounts = new ArrayList<>();
        colorCounts.add(new ColorCount(0xFF102030));
        
        final ColorGroup group = new ColorGroup(colorCounts, false);
        List<ColorCount> copy = group.getColorCounts();
        
        assertEquals(1, copy.size());
        assertEquals(colorCounts.get(0).argb, copy.get(0).argb);
        
        // Verify it's a copy
        copy.clear();
        assertEquals(1, group.getColorCounts().size());
    }

    @Test
    public void testGetMedianValue() throws ImagingException {
        final List<ColorCount> colorCounts = new ArrayList<>();
        
        // 10 pixels of 0x00000000
        final ColorCount cc1 = new ColorCount(0x00000000);
        cc1.count = 10;
        colorCounts.add(cc1);
        
        // 10 pixels of 0xFFFFFFFF
        final ColorCount cc2 = new ColorCount(0xFFFFFFFF);
        cc2.count = 10;
        colorCounts.add(cc2);
        
        final ColorGroup group = new ColorGroup(colorCounts, false);
        
        // Median should be (0+255)/2 = 127.5, rounded to 128
        // 0x80808080
        int median = group.getMedianValue();
        assertEquals(0x80808080, median);
    }

    @Test
    public void testGetMedianValueIgnoreAlpha() throws ImagingException {
        final List<ColorCount> colorCounts = new ArrayList<>();
        
        final ColorCount cc1 = new ColorCount(0x00000000);
        cc1.count = 10;
        colorCounts.add(cc1);
        
        final ColorGroup group = new ColorGroup(colorCounts, true);
        
        // If ignoreAlpha is true, alpha is forced to 0xFF
        int median = group.getMedianValue();
        assertEquals(0xFF000000, median);
    }

    @Test
    public void testGetMedianValueWeighted() throws ImagingException {
        final List<ColorCount> colorCounts = new ArrayList<>();
        
        // 1 pixel of 0x00000000
        final ColorCount cc1 = new ColorCount(0x00000000);
        cc1.count = 1;
        colorCounts.add(cc1);
        
        // 2 pixels of 0x00FFFFFF (R,G,B = 255)
        final ColorCount cc2 = new ColorCount(0x00FFFFFF);
        cc2.count = 2;
        colorCounts.add(cc2);
        
        final ColorGroup group = new ColorGroup(colorCounts, false);
        
        // total points = 3
        // red total = 1*0 + 2*255 = 510
        // red average = 510 / 3 = 170
        // Same for green and blue.
        // alpha average = 0
        
        int median = group.getMedianValue();
        assertEquals(0x00AAAAAA, median); // 170 is 0xAA
    }

    @Test
    public void testToString() throws ImagingException {
        final List<ColorCount> colorCounts = new ArrayList<>();
        colorCounts.add(new ColorCount(0xFF102030));
        
        final ColorGroup group = new ColorGroup(colorCounts, false);
        String str = group.toString();
        
        assertTrue(str.contains("minRed: 10"));
        assertTrue(str.contains("maxRed: 10"));
        assertTrue(str.contains("minAlpha: ff"));
    }
}
