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
package org.apache.commons.imaging.formats.bmp;

import org.junit.Test;

import java.awt.image.BufferedImage;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BmpWriterRgbTest{

    @Test
    public void testGetImageData() {
        BmpWriterRgb bmpWriterRgb = new BmpWriterRgb();
        BufferedImage bufferedImage = new BufferedImage(2, 2, 5);
        byte[] byteArray = bmpWriterRgb.getImageData(bufferedImage);

        assertEquals(24, bmpWriterRgb.getBitsPerPixel());
        assertEquals(0, bmpWriterRgb.getPaletteSize());
        assertEquals(16, byteArray.length);
        assertArrayEquals(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, byteArray);
    }

}