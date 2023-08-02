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

package org.apache.commons.imaging.common;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class KnownSizeByteArrayBuilderTest {
    private static byte[] getTestBytes(int length) {
        byte[] bytes = new byte[length];

        for (int i = 0; i < bytes.length; i++) {
            // Uses a number > 127 and <= 255 to cover positive and negative byte values
            // Number is a prime number to avoid matching internal section sizes of builder
            bytes[i] = (byte) (i % 251);
        }

        return bytes;
    }

    @Test
    void testEmpty() {
        KnownSizeByteArrayBuilder builder = new KnownSizeByteArrayBuilder(0);
        assertArrayEquals(new byte[0], builder.createByteArray());
    }

    @Test
    void testInvalidExpected() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new KnownSizeByteArrayBuilder(-1));
        assertEquals("Invalid size: -1", e.getMessage());

        e = assertThrows(IllegalArgumentException.class, () -> new KnownSizeByteArrayBuilder(Integer.MAX_VALUE));
        assertEquals("Invalid size: " + Integer.MAX_VALUE, e.getMessage());
    }


    @ParameterizedTest
    @ValueSource(ints = {
        1,
        10,
        KnownSizeByteArrayBuilder.INITIAL_SECTION_SIZE + 100,
        KnownSizeByteArrayBuilder.INITIAL_SECTION_SIZE * 2,
        KnownSizeByteArrayBuilder.INITIAL_SECTION_SIZE * 2 + 100,
        KnownSizeByteArrayBuilder.INITIAL_SECTION_SIZE * 5 + 100,
    })
    void testAddByte(int expectedSize) {
        byte[] testData = getTestBytes(expectedSize);
        KnownSizeByteArrayBuilder builder = new KnownSizeByteArrayBuilder(expectedSize);
        assertEquals(0, builder.getAddedBytesCount());

        for (byte b : testData) {
            builder.addByte(b);
        }

        assertEquals(expectedSize, builder.getAddedBytesCount());
        byte[] actualArray = builder.createByteArray();
        assertArrayEquals(testData, actualArray);
    }

    @Test
    void testAddByte_MoreThanExpected() {
        KnownSizeByteArrayBuilder builder = new KnownSizeByteArrayBuilder(1);
        builder.addByte((byte) 1);

        IllegalStateException e = assertThrows(IllegalStateException.class, () -> builder.addByte((byte) 1));
        assertEquals("Already added all expected bytes", e.getMessage());
    }

    @Test
    void testAddBytes() {
        byte[] testData = getTestBytes(KnownSizeByteArrayBuilder.INITIAL_SECTION_SIZE + 100);
        KnownSizeByteArrayBuilder builder = new KnownSizeByteArrayBuilder(testData.length);

        int index = 0;
        int nextAddLength = 0;

        while (index < testData.length) {
            byte[] array = testData.clone();
            builder.addBytes(array, index, nextAddLength);

            assertArrayEquals(testData, array, "Builder modified content of given array");

            index += nextAddLength;
            nextAddLength = Math.min((nextAddLength + 1) * 2, testData.length - index);
        }

        assertArrayEquals(testData, builder.createByteArray());
    }

    @Test
    void testAddBytes_MoreThanExpected() {
        KnownSizeByteArrayBuilder builder = new KnownSizeByteArrayBuilder(1);

        IllegalStateException e = assertThrows(IllegalStateException.class, () -> builder.addBytes(new byte[2], 0, 2));
        assertEquals("Trying to add more bytes than expected", e.getMessage());
    }

    @Test
    void testAddAllBytesFrom() throws IOException {
        byte[] testData = getTestBytes(KnownSizeByteArrayBuilder.INITIAL_SECTION_SIZE + 100);
        KnownSizeByteArrayBuilder builder = new KnownSizeByteArrayBuilder(testData.length);

        ByteArrayInputStream inputStream = new ByteArrayInputStream(testData);
        builder.addAllBytesFrom(inputStream);

        assertEquals(-1, inputStream.read(), "Should have reached end");
        assertArrayEquals(testData, builder.createByteArray());
    }

    @Test
    void testAddAllBytesFrom_LessThanExpected() {
        int expected = 10;
        KnownSizeByteArrayBuilder builder = new KnownSizeByteArrayBuilder(expected);
        ByteArrayInputStream inputStream = new ByteArrayInputStream(new byte[expected - 1]);

        EOFException e = assertThrows(EOFException.class, () -> builder.addAllBytesFrom(inputStream));
        assertEquals("Unexpected EOF; was expecting more bytes", e.getMessage());
    }

    @Test
    void testAsOutputStream() throws IOException {
        byte[] testData = getTestBytes(KnownSizeByteArrayBuilder.INITIAL_SECTION_SIZE + 100);
        KnownSizeByteArrayBuilder builder = new KnownSizeByteArrayBuilder(testData.length);
        OutputStream outputStream = builder.asOutputStream();

        int index = 0;
        int nextAddLength = 0;

        // Test OutputStream.write(int)
        for (; index < 5; index++) {
            outputStream.write(testData[index]);
        }

        while (index < testData.length) {
            byte[] array = testData.clone();
            outputStream.write(array, index, nextAddLength);

            assertArrayEquals(testData, array, "OutputStream modified content of given array");

            index += nextAddLength;
            nextAddLength = Math.min((nextAddLength + 1) * 2, testData.length - index);
        }

        assertArrayEquals(testData, builder.createByteArray());
    }

    @ParameterizedTest
    @ValueSource(ints = {
        1,
        10,
        KnownSizeByteArrayBuilder.INITIAL_SECTION_SIZE + 100,
        KnownSizeByteArrayBuilder.INITIAL_SECTION_SIZE * 2 + 100,
    })
    void testCreateByteArray_LessThanExpected(int dataLength) {
        byte[] testData = getTestBytes(dataLength);
        // Set expected size higher than actual data length
        KnownSizeByteArrayBuilder builder = new KnownSizeByteArrayBuilder(testData.length + 1);

        byte[] array = testData.clone();
        builder.addBytes(array, 0, testData.length);
        assertArrayEquals(testData, array, "Builder modified content of given array");

        IllegalStateException e = assertThrows(IllegalStateException.class, () -> builder.createByteArray(false));
        assertEquals("Not all bytes have been added yet", e.getMessage());

        assertArrayEquals(testData, builder.createByteArray(true));
    }

    /**
     * Similar to {@link #testCreateByteArray_LessThanExpected(int)}, except that the expected
     * size is set way higher than the actual size.
     */
    @ParameterizedTest
    @ValueSource(ints = {
        1,
        10,
        KnownSizeByteArrayBuilder.INITIAL_SECTION_SIZE + 100,
        KnownSizeByteArrayBuilder.INITIAL_SECTION_SIZE * 2 + 100,
    })
    void testCreateByteArray_LotLessThanExpected(int dataLength) {
        byte[] testData = getTestBytes(dataLength);
        // Set expected size higher than actual data length
        KnownSizeByteArrayBuilder builder = new KnownSizeByteArrayBuilder(testData.length * 3);

        byte[] array = testData.clone();
        builder.addBytes(array, 0, testData.length);
        assertArrayEquals(testData, array, "Builder modified content of given array");

        IllegalStateException e = assertThrows(IllegalStateException.class, () -> builder.createByteArray(false));
        assertEquals("Not all bytes have been added yet", e.getMessage());

        assertArrayEquals(testData, builder.createByteArray(true));
    }

    @Test
    void testCreateByteArray_MoreThanOnce() {
        KnownSizeByteArrayBuilder builder = new KnownSizeByteArrayBuilder(1);
        builder.addByte((byte) 1);

        assertArrayEquals(new byte[] {1}, builder.createByteArray());

        IllegalStateException e = assertThrows(IllegalStateException.class, () -> builder.createByteArray());
        assertEquals("Byte array has already been created", e.getMessage());

        e = assertThrows(IllegalStateException.class, () -> builder.addByte((byte) 1));
        assertEquals("Byte array has already been created", e.getMessage());
    }
}
