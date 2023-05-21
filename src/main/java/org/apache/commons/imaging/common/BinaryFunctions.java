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
import java.util.logging.Logger;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.io.IOUtils;

/**
 * Convenience methods for various binary and I/O operations.
 */
public final class BinaryFunctions {

    private static final Logger LOGGER = Logger.getLogger(BinaryFunctions.class.getName());

    public static int charsToQuad(final char c1, final char c2, final char c3, final char c4) {
        return (((0xff & c1) << 24) | ((0xff & c2) << 16) | ((0xff & c3) << 8) | ((0xff & c4) << 0));
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

    public static void copyStreamToStream(final InputStream is, final OutputStream os)
            throws IOException {
        IOUtils.copy(is, os);
    }

    public static int findNull(final byte[] src, final int start, final String message) throws ImagingException {
        for (int i = start; i < src.length; i++) {
            if (src[i] == 0) {
                return i;
            }
        }
        throw new ImagingException(message);
    }

    public static int findNull(final byte[] src, final String message) throws ImagingException {
        return findNull(src, 0, message);
    }

    public static byte[] getRAFBytes(final RandomAccessFile raf, final long pos,
            final int length, final String exception) throws IOException {
        if (length < 0) {
            throw new IOException(String.format("%s, invalid length: %d", exception, length));
        }
        final byte[] result = Allocator.byteArray(length);

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

    public static byte[] getStreamBytes(final InputStream is) throws IOException {
        final ByteArrayOutputStream os = new ByteArrayOutputStream();
        copyStreamToStream(is, os);
        return os.toByteArray();
    }

    public static byte[] head(final byte[] bytes, int count) {
        if (count > bytes.length) {
            count = bytes.length;
        }
        return slice(bytes, 0, count);
    }

    public static void printByteBits(final String msg, final byte i) {
        LOGGER.finest(msg + ": '" + Integer.toBinaryString(0xff & i));
    }

    public static void printCharQuad(final PrintWriter pw, final String msg, final int i) {
        pw.println(msg + ": '" + (char) (0xff & (i >> 24))
                + (char) (0xff & (i >> 16)) + (char) (0xff & (i >> 8))
                + (char) (0xff & (i >> 0)) + "'");

    }

    public static void printCharQuad(final String msg, final int i) {
        LOGGER.finest(msg + ": '" + (char) (0xff & (i >> 24))
                + (char) (0xff & (i >> 16)) + (char) (0xff & (i >> 8))
                + (char) (0xff & (i >> 0)) + "'");

    }

    /**
     * Convert a quad into a byte array.
     * @param quad quad
     * @return a byte array
     */
    public static byte[] quadsToByteArray(final int quad) {
        final byte[] arr = new byte[4];
        arr[0] = (byte) (quad >> 24);
        arr[1] = (byte) (quad >> 16);
        arr[2] = (byte) (quad >> 8);
        arr[3] = (byte) quad;
        return arr;
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
            result = (byte0 << 16) | (byte1 << 8) | (byte2 << 0);
        } else {
            result = (byte2 << 16) | (byte1 << 8) | (byte0 << 0);
        }

        return result;
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

    public static void readAndVerifyBytes(final InputStream is,
            final BinaryConstant expected, final String exception)
            throws ImagingException, IOException {
        for (int i = 0; i < expected.size(); i++) {
            final int data = is.read();
            final byte b = (byte) (0xff & data);

            if (data < 0) {
                throw new ImagingException("Unexpected EOF.");
            }

            if (b != expected.get(i)) {
                throw new ImagingException(exception);
            }
        }
    }

    public static void readAndVerifyBytes(final InputStream is, final byte[] expected,
            final String exception) throws ImagingException, IOException {
        for (final byte element : expected) {
            final int data = is.read();
            final byte b = (byte) (0xff & data);

            if (data < 0) {
                throw new ImagingException("Unexpected EOF.");
            }

            if (b != element) {
                throw new ImagingException(exception);
            }
        }
    }

    public static byte readByte(final String name, final InputStream is, final String exceptionMessage)
            throws IOException {
        final int result = is.read();
        if ((result < 0)) {
            throw new IOException(exceptionMessage);
        }
        return (byte) (0xff & result);
    }

    public static byte[] readBytes(final InputStream is, final int count) throws IOException {
        return readBytes("", is, count, "Unexpected EOF");
    }

    public static byte[] readBytes(final String name, final InputStream is, final int length)
            throws IOException {
        final String exception = name + " could not be read.";
        return readBytes(name, is, length, exception);
    }

    public static byte[] readBytes(final String name, final InputStream is, final int length,
            final String exception) throws IOException {
        if (length < 0) {
            throw new IOException(String.format("%s, invalid length: %d", exception, length));
        }
        final byte[] result = Allocator.byteArray(length);
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

    public static byte[] remainingBytes(final String name, final byte[] bytes, final int count) {
        return slice(bytes, count, bytes.length - count);
    }

    /**
     * Consumes the {@code InputStream} (without closing it) searching for a quad. It will
     * stop either when the quad is found, or when there are no more bytes in the input stream.
     *
     * <p>Returns {@code true} if it found the quad, and {@code false} otherwise.
     *
     * @param quad a quad (the needle)
     * @param bis an input stream (the haystack)
     * @return {@code true} if it found the quad, and {@code false} otherwise
     * @throws IOException if it fails to read from the given input stream
     */
    public static boolean searchQuad(final int quad, final InputStream bis) throws IOException {
        final byte[] needle = BinaryFunctions.quadsToByteArray(quad);
        int b = -1;
        int position = 0;
        while ((b = bis.read()) != -1) {
            if (needle[position] == b) {
                position++;
                if (position == needle.length) {
                    return true;
                }
            } else {
                position = 0;
            }
        }
        return false;
    }

    public static void skipBytes(final InputStream is, final long length) throws IOException {
        skipBytes(is, length, "Couldn't skip bytes");
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

    public static byte[] slice(final byte[] bytes, final int start, final int count) {
        final byte[] result = Allocator.byteArray(count);
        System.arraycopy(bytes, start, result, 0, count);
        return result;
    }

    public static boolean startsWith(final byte[] haystack, final BinaryConstant needle) {
        if ((haystack == null) || (haystack.length < needle.size())) {
            return false;
        }

        for (int i = 0; i < needle.size(); i++) {
            if (haystack[i] != needle.get(i)) {
                return false;
            }
        }

        return true;
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

    private BinaryFunctions() {
    }
}
