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

package org.apache.commons.imaging.formats.jpeg.decoder;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.common.AllocationRequestException;
import org.apache.commons.imaging.test.TestResources;
import org.junit.jupiter.api.Test;

/**
 * Tests for the JpegDecoder.
 */
class JpegDecoderTest {

    /**
     * Test that a bad file does not hang or take too long to be processed.
     */
    @Test
    void testDecodeBadFile() {
        // From IMAGING-220
        final File inputFile = TestResources.resourceToFile("/IMAGING-220/timeout-48eb4251935b4ca8b26d1859ea525c1b42ae0c78.jpeg");
        final ByteSource byteSourceFile = ByteSource.file(inputFile);
        assertThrows(ImagingException.class, () -> new JpegDecoder().decode(byteSourceFile));
    }

    /**
     * A SOF whose width times height, scaled by {@link Integer#BYTES}, overflows a 32-bit int must not slip past the raster allocation guard (IMAGING-379).
     * Here 0x8000 by 0x8000 makes {@code Integer.BYTES * width * height} wrap to zero; the request is now computed in long and still rejected.
     */
    @Test
    void testOversizedRasterAllocationIsRejected() {
        final byte[] jpeg = {
                (byte) 0xFF, (byte) 0xD8, // SOI
                (byte) 0xFF, (byte) 0xC0, 0x00, 0x0B, // SOF0, segment length 11
                0x08, (byte) 0x80, 0x00, (byte) 0x80, 0x00, // precision 8, height 0x8000, width 0x8000
                0x01, 0x01, 0x11, 0x00, // one component: id 1, sampling 0x11, quantization table 0
                (byte) 0xFF, (byte) 0xDA, 0x00, 0x08, // SOS, segment length 8
                0x01, 0x01, 0x00, 0x00, 0x3F, 0x00, // one component: selector 1, tables 0; Ss 0, Se 63, Ah/Al 0
                0x00, 0x00, // minimal entropy payload
                (byte) 0xFF, (byte) 0xD9, // EOI
        };
        final ImagingException ex = assertThrows(ImagingException.class, () -> new JpegDecoder().decode(ByteSource.array(jpeg)));
        assertInstanceOf(AllocationRequestException.class, ex.getCause());
    }
}
