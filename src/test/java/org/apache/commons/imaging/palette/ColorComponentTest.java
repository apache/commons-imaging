package org.apache.commons.imaging.palette;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ColorComponentTest {

    @Test
    public void testArgbComponent() {
        int argb = 0x11223344;
        assertEquals(0x11, ColorComponent.ALPHA.argbComponent(argb));
        assertEquals(0x22, ColorComponent.RED.argbComponent(argb));
        assertEquals(0x33, ColorComponent.GREEN.argbComponent(argb));
        assertEquals(0x44, ColorComponent.BLUE.argbComponent(argb));
    }
}
