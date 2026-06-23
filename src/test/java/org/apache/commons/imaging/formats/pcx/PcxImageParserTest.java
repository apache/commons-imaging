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

package org.apache.commons.imaging.formats.pcx;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.apache.commons.imaging.common.AllocationRequestException;
import org.junit.jupiter.api.Test;

class PcxImageParserTest {

    /**
     * A 24-bit PCX header whose width and height are both 65536 makes {@code rowLength * ySize} overflow {@code int} and wrap to a tiny value, which used to
     * slip past the {@link AllocationRequestException} guard and allocate an undersized buffer. The size is now computed in {@code long}, so the real
     * request is rejected.
     */
    @Test
    void testBufferSizeOverflow() {
        final byte[] bytes = new byte[128];
        bytes[0] = 10; // manufacturer
        bytes[1] = 5; // version
        bytes[2] = 0; // encoding (uncompressed)
        bytes[3] = 24; // bitsPerPixel
        // xMin = 0, yMin = 0
        // xMax = 65535 (little-endian), so xSize = 65536
        bytes[8] = (byte) 0xFF;
        bytes[9] = (byte) 0xFF;
        // yMax = 65535 (little-endian), so ySize = 65536
        bytes[10] = (byte) 0xFF;
        bytes[11] = (byte) 0xFF;
        bytes[65] = 1; // nPlanes
        bytes[66] = 8; // bytesPerLine
        assertThrows(AllocationRequestException.class, () -> new PcxImageParser().getBufferedImage(bytes, null));
    }
}
