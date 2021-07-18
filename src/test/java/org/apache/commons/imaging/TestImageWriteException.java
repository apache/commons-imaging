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
package org.apache.commons.imaging;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Tests for {@link ImageWriteException}.
 */
public class TestImageWriteException {

    public static Stream<Object[]> data() {
        final ImageWriteException exception = new ImageWriteException(null);
        return Stream.of(
                new Object[] {null, "null"},
                new Object[] {new Object[] {Integer.valueOf(1)}, "[Object[]: 1]"},
                new Object[] {new char[] {'a', 'b', 'c'}, "[char[]: 3]"},
                new Object[] {new byte[] {0, 1}, "[byte[]: 2]"},
                new Object[] {new short[] {0}, "[short[]: 1]"},
                new Object[] {new int[] {-1, -2, 4, 100}, "[int[]: 4]"},
                new Object[] {new long[] {-1, -2, 4, 100}, "[long[]: 4]"},
                new Object[] {new float[] {-1.0f, 2.0f}, "[float[]: 2]"},
                new Object[] {new double[] {-1.0d, 2.0d}, "[double[]: 2]"},
                new Object[] {new boolean[] {true, false, true}, "[boolean[]: 3]"},
                new Object[] {exception, exception.getClass().getName()}
                );
    }

    @Test
    public void testCreateExceptionWithMessage() {
        final ImageWriteException exception = new ImageWriteException("imaging");
        assertEquals("imaging", exception.getMessage());
        assertNull(exception.getCause());
    }

    @Test
    public void testCreateExceptionWithMessageAndCause() {
        final ImageWriteException exception = new ImageWriteException("imaging", new Exception("cause"));
        assertEquals("imaging", exception.getMessage());
        assertNotNull(exception.getCause());
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testCreateExceptionWithData(final Object data, final String expectedType) {
        final ImageWriteException exception = new ImageWriteException("imaging", data);
        assertEquals(String.format("imaging: %s (%s)", data, expectedType), exception.getMessage());
    }
}
