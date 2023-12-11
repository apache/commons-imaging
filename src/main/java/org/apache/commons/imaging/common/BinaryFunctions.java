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

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.util.logging.Logger;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.RandomAccessFiles;

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

    public static byte[] getBytes(final RandomAccessFile raf, final long pos,
            final int length, final String exception) throws IOException {
        if (length < 0) {
            throw new IOException(String.format("%s, invalid length: %d", exception, length));
        }
        Allocator.checkByteArray(length);
        return RandomAccessFiles.read(raf, pos, length);

    }

    public static byte[] head(final byte[] bytes, int count) {
        if (count > bytes.length) {
            count = bytes.length;
        }
        return slice(bytes, 0, count);
    }

    public static void logByteBits(final String msg, final byte i) {
        LOGGER.finest(msg + ": '" + Integer.toBinaryString(0xff & i));
    }

    public static void logCharQuad(final String msg, final int i) {
        LOGGER.finest(msg + ": '" + (char) (0xff & (i >> 24))
                + (char) (0xff & (i >> 16)) + (char) (0xff & (i >> 8))
                + (char) (0xff & (i >> 0)) + "'");

    }

    public static void printCharQuad(final PrintWriter pw, final String msg, final int i) {
        pw.println(msg + ": '" + (char) (0xff & (i >> 24))
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

   /**
    * Read eight bytes from the specified input stream, adjust for
    * byte order, and return a long integer.
    * @param name a descriptive identifier used for diagnostic purposes
    * @param is a valid input stream
    * @param exception application-defined message to be used for constructing an exception
    * if an error condition is triggered.
    * @param byteOrder the order in which the InputStream marshals data
    * @return a long integer interpreted from next 8 bytes in the InputStream
    * @throws IOException in the event of a non-recoverable error, such
    * as an attempt to read past the end of file.
    */
   public static long read8Bytes(final String name,
    final InputStream is,
    final String exception,
    final ByteOrder byteOrder) throws IOException {

    final long byte0 = is.read();
    final long byte1 = is.read();
    final long byte2 = is.read();
    final long byte3 = is.read();
    final long byte4 = is.read();
    final long byte5 = is.read();
    final long byte6 = is.read();
    final long byte7 = is.read();

    if ((byte0 | byte1 | byte2 | byte3
      | byte4 | byte5 | byte6 | byte7) < 0) {
      throw new IOException(exception);
    }

    final long result;
    if (byteOrder == ByteOrder.BIG_ENDIAN) {
      result =
          (byte0 << 56) | (byte1 << 48) | (byte2 << 40)
        | (byte3 << 32) | (byte4 << 24) | (byte5 << 16)
        | (byte6 << 8) | (byte7 << 0);
    } else {
      result =
          (byte7 << 56) | (byte6 << 48) | (byte5 << 40)
        | (byte4 << 32) | (byte3 << 24) | (byte2 << 16)
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
        if (result < 0) {
            throw new IOException(exceptionMessage);
        }
        return (byte) (0xff & result);
    }

    public static byte[] readBytes(final InputStream is, final int count) throws IOException {
        return readBytes("", is, count, "Unexpected EOF");
    }

    public static byte[] readBytes(final String name, final InputStream is, final int length)
            throws IOException {
        return readBytes(name, is, length, name + " could not be read.");
    }

    public static byte[] readBytes(final String name, final InputStream is, final int length,
            final String exception) throws IOException {
        try {
            return IOUtils.toByteArray(is, Allocator.check(length));
        } catch (IOException e) {
            throw new IOException(exception + ", name: " + name + ", length: " + length);
        }
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

    public static long skipBytes(final InputStream is, final long length) throws IOException {
        return skipBytes(is, length, "Couldn't skip bytes");
    }

    public static long skipBytes(final InputStream is, final long length, final String exception) throws IOException {
        try {
            return IOUtils.skip(is, length);
        } catch (IOException e) {
            throw new IOException(exception, e);
        }
    }

    public static byte[] slice(final byte[] bytes, final int start, final int count) {
        final byte[] result = Allocator.byteArray(count);
        System.arraycopy(bytes, start, result, 0, count);
        return result;
    }

    public static boolean startsWith(final byte[] buffer, final BinaryConstant search) {
        if (buffer == null || buffer.length < search.size()) {
            return false;
        }

        for (int i = 0; i < search.size(); i++) {
            if (buffer[i] != search.get(i)) {
                return false;
            }
        }

        return true;
    }

    public static boolean startsWith(final byte[] buffer, final byte[] search) {
        if (search == null) {
            return false;
        }
        if (buffer == null) {
            return false;
        }
        if (search.length > buffer.length) {
            return false;
        }

        for (int i = 0; i < search.length; i++) {
            if (search[i] != buffer[i]) {
                return false;
            }
        }

        return true;
    }

    private BinaryFunctions() {
    }
}
