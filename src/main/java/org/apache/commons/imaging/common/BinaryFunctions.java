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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;

import org.apache.commons.imaging.ImageReadException;

/**
 * Convenience methods for various binary and I/O operations.
 */
public final class BinaryFunctions {
    private BinaryFunctions() {
    }
    
    public static boolean startsWith(final byte[] haystack, final byte[] needle) {
        if (needle == null) {
            return false;
        }
        if (haystack == null) {
            return false;
        }
        if (needle.length > haystack.length) {
            return false;
        }

        for (int i = 0; i < needle.length; i++) {
            if (needle[i] != haystack[i]) {
                return false;
            }
        }

        return true;
    }

    public static byte readByte(final String name, final InputStream is, final String exception)
            throws IOException {
        final int result = is.read();
        if ((result < 0)) {
            throw new IOException(exception);
        }
        return (byte) (0xff & result);
    }

    public static byte[] readBytes(final String name, final InputStream is, final int length)
            throws IOException {
        final String exception = name + " could not be read.";
        return readBytes(name, is, length, exception);
    }

    public static byte[] readBytes(final String name, final InputStream is, final int length,
            final String exception) throws IOException {
        final byte[] result = new byte[length];
        int read = 0;
        while (read < length) {
            final int count = is.read(result, read, length - read);
            if (count < 0) {
                throw new IOException(exception + " count: " + count
                        + " read: " + read + " length: " + length);
            }

            read += count;
        }

        return result;
    }

    public static byte[] readBytes(final InputStream is, final int count) throws IOException {
        return readBytes("", is, count, "Unexpected EOF");
    }

    public static void readAndVerifyBytes(final InputStream is, final byte[] expected,
            final String exception) throws ImageReadException, IOException {
        for (final byte element : expected) {
            final int data = is.read();
            final byte b = (byte) (0xff & data);

            if (data < 0) {
                throw new ImageReadException("Unexpected EOF.");
            }

            if (b != element) {
                throw new ImageReadException(exception);
            }
        }
    }

    public static void readAndVerifyBytes(final InputStream is,
            final BinaryConstant expected, final String exception)
            throws ImageReadException, IOException {
        for (int i = 0; i < expected.size(); i++) {
            final int data = is.read();
            final byte b = (byte) (0xff & data);

            if (data < 0) {
                throw new ImageReadException("Unexpected EOF.");
            }

            if (b != expected.get(i)) {
                throw new ImageReadException(exception);
            }
        }
    }

    public static void readAndVerifyBytes(final String name, final InputStream is,
            final byte[] expected, final String exception) throws ImageReadException,
            IOException {
        final byte[] bytes = readBytes(name, is, expected.length, exception);

        for (int i = 0; i < expected.length; i++) {
            if (bytes[i] != expected[i]) {
                throw new ImageReadException(exception);
            }
        }
    }

    public static void skipBytes(final InputStream is, final long length, final String exception)
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

    public static void scanForByte(final InputStream is, final byte value)
            throws IOException {
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

    public static byte[] remainingBytes(final String name, final byte[] bytes, final int count) {
        return slice(bytes, count, bytes.length - count);
    }

    public static byte[] slice(final byte[] bytes, final int start, final int count) {
        final byte[] result = new byte[count];
        System.arraycopy(bytes, start, result, 0, count);
        return result;
    }

    public static byte[] tail(final byte[] bytes, int count) {
        if (count > bytes.length) {
            count = bytes.length;
        }
        return slice(bytes, bytes.length - count, count);
    }

    public static byte[] head(final byte[] bytes, int count) {
        if (count > bytes.length) {
            count = bytes.length;
        }
        return slice(bytes, 0, count);
    }

    public static boolean compareBytes(final byte[] a, final int aStart, final byte[] b,
            final int bStart, final int length) {
        if (a.length < (aStart + length)) {
            return false;
        }
        if (b.length < (bStart + length)) {
            return false;
        }

        for (int i = 0; i < length; i++) {
            if (a[aStart + i] != b[bStart + i]) {
                return false;
            }
        }

        return true;
    }

    public static int read4Bytes(final String name, final InputStream is,
            final String exception, final ByteOrder byteOrder) throws IOException {
        final int byte0 = is.read();
        final int byte1 = is.read();
        final int byte2 = is.read();
        final int byte3 = is.read();
        if ((byte0 | byte1 | byte2 | byte3) < 0) {
            throw new IOException(exception);
        }

        final int result;
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            result = (byte0 << 24) | (byte1 << 16)
                    | (byte2 << 8) | (byte3 << 0);
        } else {
            result = (byte3 << 24) | (byte2 << 16)
                    | (byte1 << 8) | (byte0 << 0);
        }

        return result;
    }

    public static int read3Bytes(final String name, final InputStream is,
            final String exception, final ByteOrder byteOrder) throws IOException {
        final int byte0 = is.read();
        final int byte1 = is.read();
        final int byte2 = is.read();
        if ((byte0 | byte1 | byte2) < 0) {
            throw new IOException(exception);
        }

        final int result;
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            result = (byte0 << 16) | (byte1 << 8)
                    | (byte2 << 0);
        } else {
            result = (byte2 << 16) | (byte1 << 8)
                    | (byte0 << 0);
        }

        return result;
    }

    public static int read2Bytes(final String name, final InputStream is,
            final String exception, final ByteOrder byteOrder) throws IOException {
        final int byte0 = is.read();
        final int byte1 = is.read();
        if ((byte0 | byte1) < 0) {
            throw new IOException(exception);
        }
        
        final int result;
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            result = (byte0 << 8) | byte1;
        } else {
            result = (byte1 << 8) | byte0;
        }
        
        return result;
    }

    public static void printCharQuad(final String msg, final int i) {
        System.out.println(msg + ": '" + (char) (0xff & (i >> 24))
                + (char) (0xff & (i >> 16)) + (char) (0xff & (i >> 8))
                + (char) (0xff & (i >> 0)) + "'");

    }

    public static void printCharQuad(final PrintWriter pw, final String msg, final int i) {
        pw.println(msg + ": '" + (char) (0xff & (i >> 24))
                + (char) (0xff & (i >> 16)) + (char) (0xff & (i >> 8))
                + (char) (0xff & (i >> 0)) + "'");

    }

    public static void printByteBits(final String msg, final byte i) {
        System.out.println(msg + ": '" + Integer.toBinaryString(0xff & i));
    }

    public static int charsToQuad(final char c1, final char c2, final char c3, final char c4) {
        return (((0xff & c1) << 24) | ((0xff & c2) << 16) | ((0xff & c3) << 8) | ((0xff & c4) << 0));
    }

    public static int findNull(final byte[] src) {
        return findNull(src, 0);
    }

    public static int findNull(final byte[] src, final int start) {
        for (int i = start; i < src.length; i++) {
            if (src[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    public static byte[] getRAFBytes(final RandomAccessFile raf, final long pos,
            final int length, final String exception) throws IOException {
        final byte[] result = new byte[length];

        raf.seek(pos);

        int read = 0;
        while (read < length) {
            final int count = raf.read(result, read, length - read);
            if (count < 0) {
                throw new IOException(exception);
            }

            read += count;
        }

        return result;

    }

    public static void skipBytes(final InputStream is, final long length) throws IOException {
        skipBytes(is, length, "Couldn't skip bytes");
    }

    public static void copyStreamToStream(final InputStream is, final OutputStream os)
            throws IOException {
        final byte[] buffer = new byte[1024];
        int read;
        while ((read = is.read(buffer)) > 0) {
            os.write(buffer, 0, read);
        }
    }

    public static byte[] getStreamBytes(final InputStream is) throws IOException {
        final ByteArrayOutputStream os = new ByteArrayOutputStream();
        copyStreamToStream(is, os);
        return os.toByteArray();
    }
}
