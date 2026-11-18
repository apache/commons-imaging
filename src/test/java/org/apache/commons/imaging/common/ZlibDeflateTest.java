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

package org.apache.commons.imaging.common;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;

import org.apache.commons.imaging.ImagingException;
import org.junit.jupiter.api.Test;

/**
 * Tests {@link ZlibDeflate}.
 */

class ZlibDeflateTest {

    private static byte[] data() {
        final byte[] data = new byte[10_000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i * 31 + i / 97);
        }
        return data;
    }

    @Test
    void testRoundTrip() throws ImagingException {
        final byte[] data = data();
        assertArrayEquals(data, ZlibDeflate.decompress(ZlibDeflate.compress(data), data.length));
    }

    /**
     * Tests that a truncated stream is reported instead of returning an array whose tail was never decompressed.
     */
    @Test
    void testTruncated() throws ImagingException {
        final byte[] data = data();
        final byte[] compressed = ZlibDeflate.compress(data);
        final byte[] truncated = Arrays.copyOf(compressed, compressed.length / 2);
        assertThrows(ImagingException.class, () -> ZlibDeflate.decompress(truncated, data.length));
    }
}
