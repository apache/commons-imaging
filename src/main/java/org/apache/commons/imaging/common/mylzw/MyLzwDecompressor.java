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
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

public final class MyLzwDecompressor {
    private static final int MAX_TABLE_SIZE = 1 << 12;
    private final byte[][] table;
    private int codeSize;
    private final int initialCodeSize;
    private int codes = -1;
    private final ByteOrder byteOrder;
    private final Listener listener;
    private final int clearCode;
    private final int eoiCode;
    private int written;
    private boolean tiffLZWMode;

    public interface Listener {
        void code(int code);

        void init(int clearCode, int eoiCode);
    }

    public MyLzwDecompressor(final int initialCodeSize, final ByteOrder byteOrder) {
        this(initialCodeSize, byteOrder, null);
    }

    public MyLzwDecompressor(final int initialCodeSize, final ByteOrder byteOrder,
            final Listener listener) {
        this.listener = listener;
        this.byteOrder = byteOrder;

        this.initialCodeSize = initialCodeSize;

        table = new byte[MAX_TABLE_SIZE][];
        clearCode = 1 << initialCodeSize;
        eoiCode = clearCode + 1;

        if (null != listener) {
            listener.init(clearCode, eoiCode);
        }

        initializeTable();
    }

    private void initializeTable() {
        codeSize = initialCodeSize;

        final int intialEntriesCount = 1 << codeSize + 2;

        for (int i = 0; i < intialEntriesCount; i++) {
            table[i] = new byte[] { (byte) i, };
        }
    }

    private void clearTable() {
        codes = (1 << initialCodeSize) + 2;
        codeSize = initialCodeSize;
        incrementCodeSize();
    }

    private int getNextCode(final MyBitInputStream is) throws IOException {
        final int code = is.readBits(codeSize);

        if (null != listener) {
            listener.code(code);
        }
        return code;
    }

    private byte[] stringFromCode(final int code) throws IOException {
        if ((code >= codes) || (code < 0)) {
            throw new IOException("Bad Code: " + code + " codes: " + codes
                    + " code_size: " + codeSize + ", table: " + table.length);
        }
        return table[code];
    }

    private boolean isInTable(final int code) {
        return code < codes;
    }

    private byte firstChar(final byte[] bytes) {
        return bytes[0];
    }

    private void addStringToTable(final byte[] bytes) throws IOException {
        if (codes < (1 << codeSize)) {
            table[codes] = bytes;
            codes++;
        }
        // If the table already full, then we simply ignore these bytes
        // per the https://www.w3.org/Graphics/GIF/spec-gif89a.txt 'spec'.

        checkCodeSize();
    }

    private byte[] appendBytes(final byte[] bytes, final byte b) {
        final byte[] result = new byte[bytes.length + 1];

        System.arraycopy(bytes, 0, result, 0, bytes.length);
        result[result.length - 1] = b;
        return result;
    }

    private void writeToResult(final OutputStream os, final byte[] bytes)
            throws IOException {
        os.write(bytes);
        written += bytes.length;
    }

    public void setTiffLZWMode() {
        tiffLZWMode = true;
    }

    public byte[] decompress(final InputStream is, final int expectedLength) throws IOException {
        int code;
        int oldCode = -1;
        final MyBitInputStream mbis = new MyBitInputStream(is, byteOrder);
        if (tiffLZWMode) {
            mbis.setTiffLZWMode();
        }

        final ByteArrayOutputStream baos = new ByteArrayOutputStream(expectedLength);

        clearTable();

        while ((code = getNextCode(mbis)) != eoiCode) {
            if (code == clearCode) {
                clearTable();

                if (written >= expectedLength) {
                    break;
                }
                code = getNextCode(mbis);

                if (code == eoiCode) {
                    break;
                }
                writeToResult(baos, stringFromCode(code));

                oldCode = code;
            } else {
                if (isInTable(code)) {
                    writeToResult(baos, stringFromCode(code));

                    addStringToTable(appendBytes(stringFromCode(oldCode),
                            firstChar(stringFromCode(code))));
                    oldCode = code;
                } else {
                    final byte[] outString = appendBytes(stringFromCode(oldCode),
                            firstChar(stringFromCode(oldCode)));
                    writeToResult(baos, outString);
                    addStringToTable(outString);
                    oldCode = code;
                }
            }

            if (written >= expectedLength) {
                break;
            }
        }

        return baos.toByteArray();
    }

    private void checkCodeSize() {
        int limit = (1 << codeSize);
        if (tiffLZWMode) {
            limit--;
        }

        if (codes == limit) {
            incrementCodeSize();
        }
    }

    private void incrementCodeSize() {
        if (codeSize != 12) {
            codeSize++;
        }
    }
}
