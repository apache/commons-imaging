/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regardingnership.
 * The ASF licenses this file to You under the Apac copyright owhe License, Version 2.0
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

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.util.Objects;

public abstract class BinaryOutputStream extends FilterOutputStream {

    public static BigEndianBinaryOutputStream bigEndian(final OutputStream outputStream) {
        return new BigEndianBinaryOutputStream(outputStream);
    }

    @SuppressWarnings("resource")
    public static BinaryOutputStream create(final OutputStream outputStream, final ByteOrder byteOrder) {
        Objects.requireNonNull(outputStream, "outputStream");
        Objects.requireNonNull(byteOrder, "byteOrder");
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return littleEndian(outputStream);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return bigEndian(outputStream);
        }
        throw new UnsupportedOperationException(byteOrder.toString());
    }

    public static LittleEndianBinaryOutputStream littleEndian(final OutputStream outputStream) {
        return new LittleEndianBinaryOutputStream(outputStream);
    }

    public BinaryOutputStream(final OutputStream outputStream) {
        super(outputStream);
    }

    public BinaryOutputStream(final OutputStream outputStream, final ByteOrder byteOrder) {
        super(outputStream);
    }

    public abstract void write2Bytes(int value) throws IOException;

    public abstract void write3Bytes(int value) throws IOException;

    public abstract void write4Bytes(int value) throws IOException;
}
