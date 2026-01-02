/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regardingnership.
 * The ASF licenses this file to You under the Apac copyright owhe License, Version 2.0
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

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.util.Objects;

/**
 * Abstract class for binary output streams that provides methods for writing multi-byte values.
 */
public abstract class AbstractBinaryOutputStream extends FilterOutputStream {

    /**
     * Creates a big-endian binary output stream.
     *
     * @param outputStream the underlying output stream.
     * @return a big-endian binary output stream.
     */
    public static BigEndianBinaryOutputStream bigEndian(final OutputStream outputStream) {
        return new BigEndianBinaryOutputStream(outputStream);
    }

    /**
     * Creates a binary output stream with the specified byte order.
     *
     * @param outputStream the underlying output stream.
     * @param byteOrder the byte order.
     * @return a binary output stream with the specified byte order.
     * @throws UnsupportedOperationException if the byte order is not supported.
     */
    @SuppressWarnings("resource")
    public static AbstractBinaryOutputStream create(final OutputStream outputStream, final ByteOrder byteOrder) {
        Objects.requireNonNull(outputStream, "outputStream");
        Objects.requireNonNull(byteOrder, "byteOrder");
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return littleEndian(outputStream);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return bigEndian(outputStream);
        }
        throw new UnsupportedOperationException(byteOrder.toString());
    }

    /**
     * Creates a little-endian binary output stream.
     *
     * @param outputStream the underlying output stream.
     * @return a little-endian binary output stream.
     */
    public static LittleEndianBinaryOutputStream littleEndian(final OutputStream outputStream) {
        return new LittleEndianBinaryOutputStream(outputStream);
    }

    /**
     * Constructs a new binary output stream.
     *
     * @param outputStream the underlying output stream.
     */
    public AbstractBinaryOutputStream(final OutputStream outputStream) {
        super(outputStream);
    }

    /**
     * Writes a 2-byte value.
     *
     * @param value the value to write.
     * @throws IOException if an I/O error occurs.
     */
    public abstract void write2Bytes(int value) throws IOException;

    /**
     * Writes a 3-byte value.
     *
     * @param value the value to write.
     * @throws IOException if an I/O error occurs.
     */
    public abstract void write3Bytes(int value) throws IOException;

    /**
     * Writes a 4-byte value.
     *
     * @param value the value to write.
     * @throws IOException if an I/O error occurs.
     */
    public abstract void write4Bytes(int value) throws IOException;
}
