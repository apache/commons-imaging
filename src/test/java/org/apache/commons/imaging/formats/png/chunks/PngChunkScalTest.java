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
package org.apache.commons.imaging.formats.png.chunks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.apache.commons.imaging.ImagingException;
import org.junit.jupiter.api.Test;

public class PngChunkScalTest {
    private static final double delta = 0.001;
    private static final int chunkType = 1933787468;

    @Test
    public void testConstruct_InvalidDblValue() {
        assertThrows(ImagingException.class, () -> new PngChunkScal(10, chunkType, 0, new byte[] { 2, 65, 46, 48, 49, 0, 48, 46, 48, 50 }));
    }

    @Test
    public void testConstruct_InvalidUnitSpecifier() {
        assertThrows(ImagingException.class, () -> new PngChunkScal(10, chunkType, 0, new byte[] { 3, 48, 46, 48, 49, 0, 48, 46, 48, 50 }));
    }

    @Test
    public void testConstruct_MissingSeparator() {
        assertThrows(ImagingException.class, () -> new PngChunkScal(9, chunkType, 0, new byte[] { 1, 48, 46, 48, 49, 48, 46, 48, 50 }));
    }

    @Test
    public void testConstruct_MissingXValue() {
        assertThrows(ImagingException.class, () -> new PngChunkScal(2, chunkType, 0, new byte[] { 2, 0 }));
    }

    @Test
    public void testConstruct_MissingYValue() {
        assertThrows(ImagingException.class, () -> new PngChunkScal(6, chunkType, 0, new byte[] { 2, 48, 46, 48, 49, 0 }));
    }

    @Test
    public void testConstructMeters() throws ImagingException {
        final PngChunkScal pngChunkScal = new PngChunkScal(10, chunkType, 0, new byte[] { 1, 48, 46, 48, 49, 0, 48, 46, 48, 50 });

        assertEquals(pngChunkScal.getUnitSpecifier(), 1);
        assertEquals(pngChunkScal.getUnitsPerPixelXAxis(), 0.01, delta);
        assertEquals(pngChunkScal.getUnitsPerPixelYAxis(), 0.02, delta);
    }

    @Test
    public void testConstructRadians() throws ImagingException {
        final PngChunkScal pngChunkScal = new PngChunkScal(10, chunkType, 0, new byte[] { 2, 48, 46, 48, 49, 0, 48, 46, 48, 50 });

        assertEquals(pngChunkScal.getUnitSpecifier(), 2);
        assertEquals(pngChunkScal.getUnitsPerPixelXAxis(), 0.01, delta);
        assertEquals(pngChunkScal.getUnitsPerPixelYAxis(), 0.02, delta);
    }
}
