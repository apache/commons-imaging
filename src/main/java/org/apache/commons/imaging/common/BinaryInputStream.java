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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

import org.apache.commons.imaging.ImageReadException;

public class BinaryInputStream extends InputStream {
    private final InputStream is;
    // default byte order for Java, many file formats.
    private ByteOrder byteOrder = ByteOrder.NETWORK;
    protected boolean debug = false;

    public final void setDebug(final boolean b) {
        debug = b;
    }

    public final boolean getDebug() {
        return debug;
    }

    public BinaryInputStream(final byte bytes[], final ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
        this.is = new ByteArrayInputStream(bytes);
    }

    public BinaryInputStream(final InputStream is, final ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
        this.is = is;
    }

    public BinaryInputStream(final InputStream is) {
        this.is = is;
    }

    protected void setByteOrder(final ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
    }

    protected ByteOrder getByteOrder() {
        return byteOrder;
    }

    @Override
    public int read() throws IOException {
        return is.read();
    }

    public final int read4Bytes(final String name, final String exception)
            throws IOException {
        return read4Bytes(name, exception, byteOrder);
    }

    public final void debugNumber(final String msg, final int data) {
        debugNumber(msg, data, 1);
    }

    public final void debugNumber(final String msg, final int data, final int bytes) {
        System.out.print(msg + ": " + data + " (");
        int byteData = data;
        for (int i = 0; i < bytes; i++) {
            if (i > 0) {
                System.out.print(",");
            }
            final int singleByte = 0xff & byteData;
            System.out.print((char) singleByte + " [" + singleByte + "]");
            byteData >>= 8;
        }
        System.out.println(") [0x" + Integer.toHexString(data) + ", "
                + Integer.toBinaryString(data) + "]");
    }

    public final void readAndVerifyBytes(final byte expected[], final String exception)
            throws ImageReadException, IOException {
        for (int i = 0; i < expected.length; i++) {
            final int data = is.read();
            final byte b = (byte) (0xff & data);

            if ((data < 0) || (b != expected[i])) {
                System.out.println("i" + ": " + i);

                this.debugByteArray("expected", expected);
                debugNumber("data[" + i + "]", b);
                // debugNumber("expected[" + i + "]", expected[i]);

                throw new ImageReadException(exception);
            }
        }
    }

    protected final void readAndVerifyBytes(final String name, final byte expected[],
            final String exception) throws ImageReadException, IOException {
        final byte bytes[] = readByteArray(name, expected.length, exception);

        for (int i = 0; i < expected.length; i++) {
            if (bytes[i] != expected[i]) {
                System.out.println("i" + ": " + i);
                debugNumber("bytes[" + i + "]", bytes[i]);
                debugNumber("expected[" + i + "]", expected[i]);

                throw new ImageReadException(exception);
            }
        }
    }

    public final void skipBytes(final int length, final String exception)
            throws IOException {
        long total = 0;
        while (length != total) {
            final long skipped = is.skip(length - total);
            if (skipped < 1) {
                throw new IOException(exception + " (" + skipped + ")");
            }
            total += skipped;
        }
    }

    protected final void scanForByte(final byte value) throws IOException {
        int count = 0;
        for (int i = 0; count < 3; i++) {
            final int b = is.read();
            if (b < 0) {
                return;
            }
            if ((0xff & b) == value) {
                System.out.println("\t" + i + ": match.");
                count++;
            }
        }
    }

    public final byte readByte(final String name, final String exception)
            throws IOException {
        final int result = is.read();

        if ((result < 0)) {
            System.out.println(name + ": " + result);
            throw new IOException(exception);
        }

        if (debug) {
            debugNumber(name, result);
        }

        return (byte) (0xff & result);
    }

    protected final int convertByteArrayToInt(final String name, final byte bytes[],
            final ByteOrder byteOrder) {
        return convertByteArrayToInt(name, bytes, 0, 4, byteOrder);
    }

    protected final int convertByteArrayToInt(final String name, final byte bytes[],
            final int start, final int length, final ByteOrder byteOrder) {
        final byte byte0 = bytes[start + 0];
        final byte byte1 = bytes[start + 1];
        final byte byte2 = bytes[start + 2];
        byte byte3 = 0;
        if (length == 4) {
            byte3 = bytes[start + 3];
        }

        int result;

        if (byteOrder == ByteOrder.MOTOROLA) {
            result = ((0xff & byte0) << 24) + ((0xff & byte1) << 16)
                    + ((0xff & byte2) << 8) + ((0xff & byte3) << 0);
        } else {
            result = ((0xff & byte3) << 24) + ((0xff & byte2) << 16)
                    + ((0xff & byte1) << 8) + ((0xff & byte0) << 0);
        }

        if (debug) {
            debugNumber(name, result, 4);
        }

        return result;
    }

    protected final int convertByteArrayToShort(final String name, final byte bytes[],
            final ByteOrder byteOrder) {
        return convertByteArrayToShort(name, 0, bytes, byteOrder);
    }

    protected final int convertByteArrayToShort(final String name, final int start,
            final byte bytes[], final ByteOrder byteOrder) {
        final byte byte0 = bytes[start + 0];
        final byte byte1 = bytes[start + 1];

        int result;

        if (byteOrder == ByteOrder.MOTOROLA) {
            result = ((0xff & byte0) << 8) + ((0xff & byte1) << 0);
        } else {
            result = ((0xff & byte1) << 8) + ((0xff & byte0) << 0);
        }

        if (debug) {
            debugNumber(name, result, 2);
        }

        return result;
    }

    public final byte[] readByteArray(final String name, final int length, final String exception)
            throws IOException {
        final byte result[] = new byte[length];

        int read = 0;
        while (read < length) {
            final int count = is.read(result, read, length - read);
            if (count < 1) {
                throw new IOException(exception);
            }

            read += count;
        }

        if (debug) {
            for (int i = 0; ((i < length) && (i < 150)); i++) {
                debugNumber(name + " (" + i + ")", 0xff & result[i]);
            }
        }
        return result;
    }

    protected final void debugByteArray(final String name, final byte bytes[]) {
        System.out.println(name + ": " + bytes.length);

        for (int i = 0; ((i < bytes.length) && (i < 50)); i++) {
            debugNumber(name + " (" + i + ")", bytes[i]);
        }
    }

    protected final void debugNumberArray(final String name, final int numbers[], final int length) {
        System.out.println(name + ": " + numbers.length);

        for (int i = 0; ((i < numbers.length) && (i < 50)); i++) {
            debugNumber(name + " (" + i + ")", numbers[i], length);
        }
    }

    public final byte[] readBytearray(final String name, final byte bytes[], final int start,
            final int count) {
        if (bytes.length < (start + count)) {
            return null;
        }

        final byte result[] = new byte[count];
        System.arraycopy(bytes, start, result, 0, count);

        if (debug) {
            debugByteArray(name, result);
        }

        return result;
    }

    public final byte[] readByteArray(final int length, final String error)
            throws ImageReadException, IOException {
        final boolean verbose = false;
        final boolean strict = true;
        return readByteArray(length, error, verbose, strict);
    }

    public final byte[] readByteArray(final int length, final String error,
            final boolean verbose, final boolean strict) throws ImageReadException,
            IOException {
        final byte bytes[] = new byte[length];
        int total = 0;
        int read;
        while ((read = read(bytes, total, length - total)) > 0) {
            total += read;
        }
        if (total < length) {
            if (strict) {
                throw new ImageReadException(error);
            } else if (verbose) {
                System.out.println(error);
            }
            return null;
        }
        return bytes;
    }

    protected final byte[] getBytearrayTail(final String name, final byte bytes[], final int count) {
        return readBytearray(name, bytes, count, bytes.length - count);
    }

    protected final byte[] getBytearrayHead(final String name, final byte bytes[], final int count) {
        return readBytearray(name, bytes, 0, bytes.length - count);
    }

    public final boolean compareByteArrays(final byte a[], final int aStart, final byte b[],
            final int bStart, final int length) {
        if (a.length < (aStart + length)) {
            return false;
        }
        if (b.length < (bStart + length)) {
            return false;
        }

        for (int i = 0; i < length; i++) {
            if (a[aStart + i] != b[bStart + i]) {
                debugNumber("a[" + (aStart + i) + "]", a[aStart + i]);
                debugNumber("b[" + (bStart + i) + "]", b[bStart + i]);

                return false;
            }
        }

        return true;
    }

    protected final int read4Bytes(final String name, final String exception, final ByteOrder byteOrder)
            throws IOException {
        final int size = 4;
        final byte bytes[] = new byte[size];

        int read = 0;
        while (read < size) {
            final int count = is.read(bytes, read, size - read);
            if (count < 1) {
                throw new IOException(exception);
            }

            read += count;
        }

        return convertByteArrayToInt(name, bytes, byteOrder);
    }

    protected final int read3Bytes(final String name, final String exception, final ByteOrder byteOrder)
            throws IOException {
        final int size = 3;
        final byte bytes[] = new byte[size];

        int read = 0;
        while (read < size) {
            final int count = is.read(bytes, read, size - read);
            if (count < 1) {
                throw new IOException(exception);
            }

            read += count;
        }

        return convertByteArrayToInt(name, bytes, 0, 3, byteOrder);

    }

    protected final int read2Bytes(final String name, final String exception, final ByteOrder byteOrder)
            throws IOException {
        final int size = 2;
        final byte bytes[] = new byte[size];

        int read = 0;
        while (read < size) {
            final int count = is.read(bytes, read, size - read);
            if (count < 1) {
                throw new IOException(exception);
            }

            read += count;
        }

        return convertByteArrayToShort(name, bytes, byteOrder);
    }

    public final int read1ByteInteger(final String exception)
            throws ImageReadException, IOException {
        final int byte0 = is.read();
        if (byte0 < 0) {
            throw new ImageReadException(exception);
        }

        return 0xff & byte0;
    }

    public final int read2ByteInteger(final String exception)
            throws ImageReadException, IOException {
        final int byte0 = is.read();
        final int byte1 = is.read();
        if ((byte0 | byte1) < 0) {
            throw new ImageReadException(exception);
        }

        if (byteOrder == ByteOrder.MOTOROLA) {
            return ((0xff & byte0) << 8) + ((0xff & byte1) << 0);
        } else {
            return ((0xff & byte1) << 8) + ((0xff & byte0) << 0);
        }
    }

    public final int read4ByteInteger(final String exception)
            throws ImageReadException, IOException {
        final int byte0 = is.read();
        final int byte1 = is.read();
        final int byte2 = is.read();
        final int byte3 = is.read();
        if ((byte0 | byte1 | byte2 | byte3) < 0) {
            throw new ImageReadException(exception);
        }

        if (byteOrder == ByteOrder.MOTOROLA) {
            return ((0xff & byte0) << 24) + ((0xff & byte1) << 16)
                    + ((0xff & byte2) << 8) + ((0xff & byte3) << 0);
        } else {
            return ((0xff & byte3) << 24) + ((0xff & byte2) << 16)
                    + ((0xff & byte1) << 8) + ((0xff & byte0) << 0);
        }
    }

    protected final void printCharQuad(final String msg, final int i) {
        System.out.println(msg + ": '" + (char) (0xff & (i >> 24))
                + (char) (0xff & (i >> 16)) + (char) (0xff & (i >> 8))
                + (char) (0xff & (i >> 0)) + "'");
    }

    protected final void printByteBits(final String msg, final byte i) {
        System.out.println(msg + ": '" + Integer.toBinaryString(0xff & i));
    }

    protected final static int charsToQuad(final char c1, final char c2, final char c3, final char c4) {
        return (((0xff & c1) << 24) | ((0xff & c2) << 16) | ((0xff & c3) << 8) | ((0xff & c4) << 0));
    }

    public final int findNull(final byte src[]) {
        return findNull(src, 0);
    }

    public final int findNull(final byte src[], final int start) {
        for (int i = start; i < src.length; i++) {
            if (src[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    protected final byte[] getRAFBytes(final RandomAccessFile raf, final long pos,
            final int length, final String exception) throws IOException {
        final byte result[] = new byte[length];

        if (debug) {
            System.out.println("getRAFBytes pos" + ": " + pos);
            System.out.println("getRAFBytes length" + ": " + length);
        }

        raf.seek(pos);

        int read = 0;
        while (read < length) {
            final int count = raf.read(result, read, length - read);
            if (count < 1) {
                throw new IOException(exception);
            }

            read += count;
        }

        return result;

    }

    protected void skipBytes(final int length) throws IOException {
        skipBytes(length, "Couldn't skip bytes");
    }

}
