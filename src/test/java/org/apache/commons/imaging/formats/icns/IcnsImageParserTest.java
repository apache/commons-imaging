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

package org.apache.commons.imaging.formats.icns;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.EOFException;
import java.io.IOException;

import org.junit.jupiter.api.Test;

public class IcnsImageParserTest {

    /**
     * Gets the byte at the specified {@code index} from the int value.
     */
    private static byte intByte(int value, int index) {
        return (byte) ((value >> (index * Byte.SIZE)) & 0xFF);
    }

    @Test
    public void testGetImageSize() throws Exception {
        // org.apache.commons.imaging.common.Allocator.DEFAULT
        final int fileSize = 1_073_741_824;
        final int elementSize = fileSize - 8;

        final byte[] bytes = {
            // Header
            'i', 'c', 'n', 's',
            // (Too large) file size
            intByte(fileSize, 3), intByte(fileSize, 2), intByte(fileSize, 1), intByte(fileSize, 0),
            // Type (does not matter?)
            0, 0, 0, 0,
            // (Too large) element size
            intByte(elementSize, 3), intByte(elementSize, 2), intByte(elementSize, 1), intByte(elementSize, 0),
        };
        IOException e = assertThrows(IOException.class, () -> new IcnsImageParser().getImageSize(bytes));
        assertEquals("Not a valid ICNS file, name: Data, length: 1073741808", e.getMessage());

        Throwable cause = e.getCause();
        assertInstanceOf(EOFException.class, cause);
        assertEquals("Unexpected EOF; was expecting more bytes", cause.getMessage());
    }
}
