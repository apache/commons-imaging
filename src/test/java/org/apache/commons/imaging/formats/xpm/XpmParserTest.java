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
package org.apache.commons.imaging.formats.xpm;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class XpmParserTest {

    @Test
    public void testXpmHeader() throws Exception {
        // XpmHeader is private static final, use reflection to test it
        Class<?> headerClass = Class.forName("org.apache.commons.imaging.formats.xpm.XpmImageParser$XpmHeader");
        Constructor<?> constructor = headerClass.getDeclaredConstructor(int.class, int.class, int.class, int.class, int.class, int.class, boolean.class);
        constructor.setAccessible(true);
        
        Object header = constructor.newInstance(10, 20, 2, 1, 5, 5, true);
        
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Method dumpMethod = headerClass.getMethod("dump", PrintWriter.class);
        dumpMethod.invoke(header, pw);
        pw.flush();
        
        String output = sw.toString();
        assertNotNull(output);
        // Using contains because exact line endings might vary by OS
        assertTrue(output.contains("Width: 10"));
        assertTrue(output.contains("Height: 20"));
        assertTrue(output.contains("NumColors: 2"));
        assertTrue(output.contains("NumCharsPerPixel: 1"));
        assertTrue(output.contains("X hotspot: 5"));
        assertTrue(output.contains("Y hotspot: 5"));
        assertTrue(output.contains("XpmExt: true"));
    }

    @Test
    public void testPaletteEntry() throws Exception {
        Class<?> entryClass = Class.forName("org.apache.commons.imaging.formats.xpm.XpmImageParser$PaletteEntry");
        Constructor<?> constructor = entryClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object entry = constructor.newInstance();
        
        Method getBestArgbMethod = entryClass.getDeclaredMethod("getBestArgb");
        getBestArgbMethod.setAccessible(true);
        
        Field colorArgbField = entryClass.getDeclaredField("colorArgb");
        colorArgbField.setAccessible(true);
        Field haveColorField = entryClass.getDeclaredField("haveColor");
        haveColorField.setAccessible(true);
        
        Field grayArgbField = entryClass.getDeclaredField("grayArgb");
        grayArgbField.setAccessible(true);
        Field haveGrayField = entryClass.getDeclaredField("haveGray");
        haveGrayField.setAccessible(true);

        Field gray4LevelArgbField = entryClass.getDeclaredField("gray4LevelArgb");
        gray4LevelArgbField.setAccessible(true);
        Field haveGray4LevelField = entryClass.getDeclaredField("haveGray4Level");
        haveGray4LevelField.setAccessible(true);

        Field monoArgbField = entryClass.getDeclaredField("monoArgb");
        monoArgbField.setAccessible(true);
        Field haveMonoField = entryClass.getDeclaredField("haveMono");
        haveMonoField.setAccessible(true);

        // Default
        assertEquals(0, getBestArgbMethod.invoke(entry));

        // Color
        colorArgbField.set(entry, 0xFF112233);
        haveColorField.set(entry, true);
        assertEquals(0xFF112233, getBestArgbMethod.invoke(entry));

        // Gray (should still return color if color is present)
        grayArgbField.set(entry, 0xFF444444);
        haveGrayField.set(entry, true);
        assertEquals(0xFF112233, getBestArgbMethod.invoke(entry));

        // Remove color, should return gray
        haveColorField.set(entry, false);
        assertEquals(0xFF444444, getBestArgbMethod.invoke(entry));

        // Gray4Level
        gray4LevelArgbField.set(entry, 0xFF555555);
        haveGray4LevelField.set(entry, true);
        haveGrayField.set(entry, false);
        assertEquals(0xFF555555, getBestArgbMethod.invoke(entry));

        // Mono
        monoArgbField.set(entry, 0xFF666666);
        haveMonoField.set(entry, true);
        haveGray4LevelField.set(entry, false);
        assertEquals(0xFF666666, getBestArgbMethod.invoke(entry));
    }

    @Test
    public void testXpmImagingParameters() {
        XpmImagingParameters params = new XpmImagingParameters();
        assertNotNull(params);
    }

    @Test
    public void testXpmImageParserBasics() {
        XpmImageParser parser = new XpmImageParser();
        assertEquals("X PixMap", parser.getName());
        assertEquals("xpm", parser.getDefaultExtension());
    }
    @Test
    public void testParseColor() throws Exception {
        XpmImageParser parser = new XpmImageParser();
        Method parseColorMethod = XpmImageParser.class.getDeclaredMethod("parseColor", String.class);
        parseColorMethod.setAccessible(true);

        assertEquals(0xFF000000, parseColorMethod.invoke(parser, "#000000"));
        assertEquals(0xFFFFFFFF, parseColorMethod.invoke(parser, "#FFFFFF"));
        assertEquals(0x00000000, parseColorMethod.invoke(parser, "None"));
        
        // Test #RGB (4-bit per channel expanded to 8-bit)
        int rgb = (int) parseColorMethod.invoke(parser, "#FFF");
        // red = 0xF << 20 = 0xF00000, green = 0xF << 12 = 0x00F000, blue = 0xF << 4 = 0x0000F0
        // result = 0xFF000000 | 0xF00000 | 0x00F000 | 0x0000F0 = 0xFFF0F0F0
        assertEquals(0xFFF0F0F0, rgb);

        // Test names
        assertEquals(0xFF0000FF, parseColorMethod.invoke(parser, "blue"));
        assertEquals(0xFF0000FF, parseColorMethod.invoke(parser, "BLUE"));
        
        // Unknown color name
        assertEquals(0x00000000, parseColorMethod.invoke(parser, "nonexistent_color_name"));
    }
}
