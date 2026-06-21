package org.apache.commons.imaging.palette;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class ColorCountTest {

    @Test
    public void testColorCount() {
        int argb = 0x11223344;
        ColorCount cc = new ColorCount(argb);
        assertEquals(argb, cc.argb);
        assertEquals(0x11, cc.alpha);
        assertEquals(0x22, cc.red);
        assertEquals(0x33, cc.green);
        assertEquals(0x44, cc.blue);
        
        cc.count = 5;
        assertEquals(5, cc.count);
    }

    @Test
    public void testEqualsAndHashCode() {
        ColorCount cc1 = new ColorCount(0xFF112233);
        ColorCount cc2 = new ColorCount(0xFF112233);
        ColorCount cc3 = new ColorCount(0xFF445566);
        
        assertEquals(cc1, cc2);
        assertNotEquals(cc1, cc3);
        assertEquals(cc1.hashCode(), cc2.hashCode());
        assertNotEquals(cc1.hashCode(), cc3.hashCode());
    }
}
