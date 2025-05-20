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
package org.apache.commons.imaging.mylzw;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.Allocator;

public final class MyLzwDecompressor {

    public interface Listener {

        void code(int code);

        void init(int clearCode, int eoiCode);
    }

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
    private final boolean tiffLZWMode;

    public MyLzwDecompressor(final int initialCodeSize, final ByteOrder byteOrder, final boolean tiffLZWMode) throws ImagingException {
        this(initialCodeSize, byteOrder, tiffLZWMode, null);
    }

    public MyLzwDecompressor(final int initialCodeSize, final ByteOrder byteOrder, final boolean tiffLZWMode, final Listener listener) throws ImagingException {
        this.listener = listener;
        this.byteOrder = byteOrder;
        this.tiffLZWMode = tiffLZWMode;
        this.initialCodeSize = initialCodeSize;

        table = new byte[MAX_TABLE_SIZE][];
        clearCode = 1 << initialCodeSize;
        eoiCode = clearCode + 1;

        if (null != listener) {
            listener.init(clearCode, eoiCode);
        }

        initializeTable();
    }

    private void addStringToTable(final byte[] bytes) {
        if (codes < 1 << codeSize) {
            table[codes] = bytes;
            codes++;
        }
        // If the table already full, then we simply ignore these bytes
        // per the https://www.w3.org/Graphics/GIF/spec-gif89a.txt 'spec'.

        checkCodeSize();
    }

    private byte[] appendBytes(final byte[] bytes, final byte b) {
        final byte[] result = Arrays.copyOf(bytes, bytes.length + 1);
        result[result.length - 1] = b;
        return result;
    }

    private void checkCodeSize() {
        int limit = 1 << codeSize;
        if (tiffLZWMode) {
            limit--;
        }

        if (codes == limit) {
            incrementCodeSize();
        }
    }

    private void clearTable() {
        codes = (1 << initialCodeSize) + 2;
        codeSize = initialCodeSize;
        incrementCodeSize();
    }

    public byte[] decompress(final InputStream is, final int expectedLength) throws IOException {
        int code;
        int oldCode = -1;
        try (MyBitInputStream mbis = new MyBitInputStream(is, byteOrder, tiffLZWMode);
                ByteArrayOutputStream baos = new ByteArrayOutputStream(Allocator.checkByteArray(expectedLength))) {

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
                } else if (isInTable(code)) {
                    writeToResult(baos, stringFromCode(code));

                    addStringToTable(appendBytes(stringFromCode(oldCode), firstChar(stringFromCode(code))));
                } else {
                    final byte[] outString = appendBytes(stringFromCode(oldCode), firstChar(stringFromCode(oldCode)));
                    writeToResult(baos, outString);
                    addStringToTable(outString);
                }
                oldCode = code;

                if (written >= expectedLength) {
                    break;
                }
            }

            return baos.toByteArray();
        }
    }

    private byte firstChar(final byte[] bytes) {
        return bytes[0];
    }

    private int getNextCode(final MyBitInputStream is) throws IOException {
        final int code = is.readBits(codeSize);

        if (null != listener) {
            listener.code(code);
        }
        return code;
    }

    private void incrementCodeSize() {
        if (codeSize != 12) {
            codeSize++;
        }
    }

    private void initializeTable() throws ImagingException {
        codeSize = initialCodeSize;

        final int initialEntriesCount = 1 << codeSize + 2;

        if (initialEntriesCount > table.length) {
            throw new ImagingException(String.format("Invalid Lzw table length [%d]; entries count is [%d]", table.length, initialEntriesCount));
        }

        for (int i = 0; i < initialEntriesCount; i++) {
            table[i] = new byte[] { (byte) i, };
        }
    }

    private boolean isInTable(final int code) {
        return code < codes;
    }

    private byte[] stringFromCode(final int code) throws ImagingException {
        if (code >= codes || code < 0) {
            throw new ImagingException("Bad Code: " + code + " codes: " + codes + " code_size: " + codeSize + ", table: " + table.length);
        }
        return table[code];
    }

    private void writeToResult(final OutputStream os, final byte[] bytes) throws IOException {
        os.write(bytes);
        written += bytes.length;
    }
}
