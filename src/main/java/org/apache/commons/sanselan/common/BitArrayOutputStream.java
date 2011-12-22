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
package org.apache.commons.sanselan.common;

public class BitArrayOutputStream {
    private byte[] buffer;
    private int bytesWritten = 0;
    private int cache = 0;
    private int cacheMask = 0x80;

    public BitArrayOutputStream() {
        buffer = new byte[16];
    }

    public BitArrayOutputStream(int size) {
        buffer = new byte[size];
    }

    public int size() {
        return bytesWritten;
    }

    public byte[] toByteArray() {
        flush();
        if (bytesWritten == buffer.length) {
            return buffer;
        }
        byte[] out = new byte[bytesWritten];
        System.arraycopy(buffer, 0, out, 0, bytesWritten);
        return out;
    }

    public void close() {
        flush();
    }

    public void flush() {
        if (cacheMask != 0x80) {
            writeByte(cache);
            cache = 0;
            cacheMask = 0x80;
        }
    }

    public void write(int b) {
        flush();
        writeByte(b);
    }

    public void writeBit(int bit) {
        if (bit != 0) {
            cache |= cacheMask;
        }
        cacheMask >>>= 1;
        if (cacheMask == 0) {
            flush();
        }
    }

    public int getBitsAvailableInCurrentByte() {
        int count = 0;
        for (int mask = cacheMask; mask != 0; mask >>>= 1) {
            ++count;
        }
        return count;
    }
    
    private void writeByte(int b) {
        if (bytesWritten >= buffer.length) {
            byte[] bigger = new byte[buffer.length * 2];
            System.arraycopy(buffer, 0, bigger, 0, bytesWritten);
            buffer = bigger;
        }
        buffer[bytesWritten++] = (byte)b;
    }
}
