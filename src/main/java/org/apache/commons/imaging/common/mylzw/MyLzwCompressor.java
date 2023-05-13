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
package org.apache.commons.imaging.common.mylzw;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.imaging.common.Allocator;

public class MyLzwCompressor {
    private static final class ByteArray {
        private final byte[] bytes;
        private final int start;
        private final int length;
        private final int hash;

        ByteArray(final byte[] bytes, final int start, final int length) {
            this.bytes = bytes;
            this.start = start;
            this.length = length;

            int tempHash = length;

            for (int i = 0; i < length; i++) {
                final int b = 0xff & bytes[i + start];
                tempHash = tempHash + (tempHash << 8) ^ b ^ i;
            }

            hash = tempHash;
        }

        @Override
        public boolean equals(final Object o) {
            if (o instanceof ByteArray) {
                final ByteArray other = (ByteArray) o;
                if (other.hash != hash) {
                    return false;
                }
                if (other.length != length) {
                    return false;
                }

                for (int i = 0; i < length; i++) {
                    if (other.bytes[i + other.start] != bytes[i + start]) {
                        return false;
                    }
                }

                return true;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return hash;
        }
    }
    public interface Listener {
        void clearCode(int code);

        void dataCode(int code);

        void eoiCode(int code);

        void init(int clearCode, int eoiCode);
    }
    private int codeSize;

    private final int initialCodeSize;
    private int codes = -1;
    private final ByteOrder byteOrder;
    private final boolean earlyLimit;
    private final int clearCode;
    private final int eoiCode;

    private final Listener listener;

    private final Map<ByteArray, Integer> map = new HashMap<>();

    public MyLzwCompressor(final int initialCodeSize, final ByteOrder byteOrder,
            final boolean earlyLimit) {
        this(initialCodeSize, byteOrder, earlyLimit, null);
    }

    public MyLzwCompressor(final int initialCodeSize, final ByteOrder byteOrder,
            final boolean earlyLimit, final Listener listener) {
        this.listener = listener;
        this.byteOrder = byteOrder;
        this.earlyLimit = earlyLimit;

        this.initialCodeSize = initialCodeSize;

        clearCode = 1 << initialCodeSize;
        eoiCode = clearCode + 1;

        if (null != listener) {
            listener.init(clearCode, eoiCode);
        }

        initializeStringTable();
    }

    private boolean addTableEntry(final MyBitOutputStream bos, final byte[] bytes,
            final int start, final int length) throws IOException {
        final ByteArray key = arrayToKey(bytes, start, length);
        return addTableEntry(bos, key);
    }

    private boolean addTableEntry(final MyBitOutputStream bos, final ByteArray key)
            throws IOException {
        boolean cleared = false;

        int limit = (1 << codeSize);
        if (earlyLimit) {
            limit--;
        }

        if (codes == limit) {
            if (codeSize < 12) {
                incrementCodeSize();
            } else {
                writeClearCode(bos);
                clearTable();
                cleared = true;
            }
        }

        if (!cleared) {
            map.put(key, codes);
            codes++;
        }

        return cleared;
    }

    private ByteArray arrayToKey(final byte b) {
        return arrayToKey(new byte[] { b, }, 0, 1);
    }

    private ByteArray arrayToKey(final byte[] bytes, final int start, final int length) {
        return new ByteArray(bytes, start, length);
    }

    private void clearTable() {
        initializeStringTable();
        incrementCodeSize();
    }

    private int codeFromString(final byte[] bytes, final int start, final int length)
            throws IOException {
        final ByteArray key = arrayToKey(bytes, start, length);
        final Integer code = map.get(key);
        if (code == null) {
            throw new IOException("CodeFromString");
        }
        return code;
    }

    public byte[] compress(final byte[] bytes) throws IOException {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream(Allocator.checkByteArray(bytes.length));
        final MyBitOutputStream bos = new MyBitOutputStream(baos, byteOrder);

        initializeStringTable();
        clearTable();
        writeClearCode(bos);

        int wStart = 0;
        int wLength = 0;

        for (int i = 0; i < bytes.length; i++) {
            if (isInTable(bytes, wStart, wLength + 1)) {
                wLength++;
            } else {
                final int code = codeFromString(bytes, wStart, wLength);
                writeDataCode(bos, code);
                addTableEntry(bos, bytes, wStart, wLength + 1);

                wStart = i;
                wLength = 1;
            }
        }

        final int code = codeFromString(bytes, wStart, wLength);
        writeDataCode(bos, code);

        writeEoiCode(bos);

        bos.flushCache();

        return baos.toByteArray();
    }

    private void incrementCodeSize() {
        if (codeSize != 12) {
            codeSize++;
        }
    }

    private void initializeStringTable() {
        codeSize = initialCodeSize;

        final int initialEntriesCount = (1 << codeSize) + 2;

        map.clear();
        for (codes = 0; codes < initialEntriesCount; codes++) {
            if ((codes != clearCode) && (codes != eoiCode)) {
                final ByteArray key = arrayToKey((byte) codes);

                map.put(key, codes);
            }
        }
    }

    private boolean isInTable(final byte[] bytes, final int start, final int length) {
        final ByteArray key = arrayToKey(bytes, start, length);

        return map.containsKey(key);
    }

    private void writeClearCode(final MyBitOutputStream bos) throws IOException {
        if (null != listener) {
            listener.dataCode(clearCode);
        }
        writeCode(bos, clearCode);
    }

    private void writeCode(final MyBitOutputStream bos, final int code)
            throws IOException {
        bos.writeBits(code, codeSize);
    }

    private void writeDataCode(final MyBitOutputStream bos, final int code)
            throws IOException {
        if (null != listener) {
            listener.dataCode(code);
        }
        writeCode(bos, code);
    }

    private void writeEoiCode(final MyBitOutputStream bos) throws IOException {
        if (null != listener) {
            listener.eoiCode(eoiCode);
        }
        writeCode(bos, eoiCode);
    }
}
