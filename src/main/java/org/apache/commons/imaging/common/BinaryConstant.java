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

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/**
 * Represents a constant binary value used for pattern matching in binary data.
 */
public class BinaryConstant {
    private final byte[] value;

    /**
     * Constructs a binary constant from a byte array.
     *
     * @param value the byte array value.
     */
    public BinaryConstant(final byte[] value) {
        this.value = value.clone();
    }

    /**
     * Tests whether the given byte array equals this constant.
     *
     * @param bytes the byte array to compare.
     * @return {@code true} if the arrays are equal, {@code false} otherwise.
     */
    public boolean equals(final byte[] bytes) {
        return Arrays.equals(value, bytes);
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof BinaryConstant)) {
            return false;
        }
        final BinaryConstant other = (BinaryConstant) obj;
        return equals(other.value);
    }

    /**
     * Gets the byte at the specified index.
     *
     * @param i the index.
     * @return the byte at the specified index.
     */
    public byte get(final int i) {
        return value[i];
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(value);
    }

    /**
     * Tests whether the give buffer starts with this binary constant.
     *
     * @param buffer The buffer to test.
     * @return Whether the give buffer starts with this binary constant.
     */
    public boolean isStartOf(final byte[] buffer) {
        return BinaryFunctions.startsWith(buffer, value);
    }

    /**
     * Gets the raw byte array value (internal use).
     *
     * @return the raw value.
     */
    byte[] rawValue() {
        return value;
    }

    /**
     * Gets the size of this binary constant.
     *
     * @return the size in bytes.
     */
    public int size() {
        return value.length;
    }

    /**
     * Writes this binary constant to an output stream.
     *
     * @param os the output stream.
     * @throws IOException if an I/O error occurs.
     */
    public void writeTo(final OutputStream os) throws IOException {
        for (final byte element : value) {
            os.write(element);
        }
    }
}
