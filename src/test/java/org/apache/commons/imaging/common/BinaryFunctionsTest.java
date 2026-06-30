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
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.api.Test;

public class BinaryFunctionsTest {

    @Test
    public void testCharsToQuad() {
        assertEquals(0x01020304, BinaryFunctions.charsToQuad((char) 1, (char) 2, (char) 3, (char) 4));
    }

    @Test
    public void testQuadsToByteArray() {
        assertArrayEquals(new byte[]{1, 2, 3, 4}, BinaryFunctions.quadsToByteArray(0x01020304));
    }

    @Test
    public void testCompareBytes() {
        byte[] a = {1, 2, 3, 4, 5};
        byte[] b = {0, 2, 3, 4, 6};
        assertTrue(BinaryFunctions.compareBytes(a, 1, b, 1, 3));
        assertFalse(BinaryFunctions.compareBytes(a, 0, b, 0, 5));
        assertFalse(BinaryFunctions.compareBytes(a, 4, b, 4, 1));
    }

    @Test
    public void testStartsWith() {
        byte[] haystack = {1, 2, 3, 4, 5};
        byte[] needle = {1, 2, 3};
        byte[] wrongNeedle = {1, 2, 4};
        assertTrue(BinaryFunctions.startsWith(haystack, needle));
        assertFalse(BinaryFunctions.startsWith(haystack, wrongNeedle));
        assertFalse(BinaryFunctions.startsWith(needle, haystack));
    }

    @Test
    public void testReadBytes() throws IOException {
        byte[] data = {1, 2, 3, 4, 5};
        InputStream is = new ByteArrayInputStream(data);
        byte[] read = BinaryFunctions.readBytes("test", is, 3, "Error");
        assertArrayEquals(new byte[]{1, 2, 3}, read);
    }

    @Test
    public void testCopyOfRange() {
        byte[] original = {1, 2, 3, 4, 5};
        byte[] copy = BinaryFunctions.copyOfRange(original, 1, 3);
        assertArrayEquals(new byte[]{2, 3, 4}, copy);
    }
}
