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

package org.apache.commons.imaging.formats.tiff.datareaders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteOrder;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Tests {@link BitInputStream}.
 */
class BitInputStreamTest {

    /**
     * Tests that bit fields cut off by the end of the data are reported instead of being read as all ones.
     */
    @ParameterizedTest
    @ValueSource(ints = { 1, 4, 8, 16, 24, 32 })
    void testReadBitsAtEndOfData(final int count) throws IOException {
        for (final ByteOrder byteOrder : new ByteOrder[] { ByteOrder.BIG_ENDIAN, ByteOrder.LITTLE_ENDIAN }) {
            final byte[] data = new byte[count / 8];
            try (BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), byteOrder)) {
                if (count >= 8) {
                    assertEquals(0, bis.readBits(count));
                }
                assertThrows(EOFException.class, () -> bis.readBits(count));
            }
        }
    }
}
