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
package org.apache.commons.imaging.formats.tiff.itu_t4;

import java.io.OutputStream;

/**
 * Output stream writing to a byte array, and capable
 * of writing 1 bit at a time, starting from the most significant bit.
 */
final class BitArrayOutputStream extends OutputStream {
    private byte[] buffer;
    private int bytesWritten;
    private int cache;
    private int cacheMask = 0x80;

    BitArrayOutputStream() {
        buffer = new byte[16];
    }

    BitArrayOutputStream(final int size) {
        buffer = new byte[size];
    }

    int size() {
        return bytesWritten;
    }

    byte[] toByteArray() {
        flush();
        if (bytesWritten == buffer.length) {
            return buffer;
        }
        final byte[] out = new byte[bytesWritten];
        System.arraycopy(buffer, 0, out, 0, bytesWritten);
        return out;
    }

    @Override
    public void close() {
        flush();
    }

    @Override
    public void flush() {
        if (cacheMask != 0x80) {
            writeByte(cache);
            cache = 0;
            cacheMask = 0x80;
        }
    }

    @Override
    public void write(final int b) {
        flush();
        writeByte(b);
    }

    void writeBit(final int bit) {
        if (bit != 0) {
            cache |= cacheMask;
        }
        cacheMask >>>= 1;
        if (cacheMask == 0) {
            flush();
        }
    }

    int getBitsAvailableInCurrentByte() {
        int count = 0;
        for (int mask = cacheMask; mask != 0; mask >>>= 1) {
            ++count;
        }
        return count;
    }

    private void writeByte(final int b) {
        if (bytesWritten >= buffer.length) {
            final byte[] bigger = new byte[buffer.length * 2];
            System.arraycopy(buffer, 0, bigger, 0, bytesWritten);
            buffer = bigger;
        }
        buffer[bytesWritten++] = (byte) b;
    }
}
