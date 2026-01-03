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
package org.apache.commons.imaging.common;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.logging.Logger;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.RandomAccessFiles;
import org.apache.commons.lang3.ArrayUtils;

/**
 * Convenience methods for various binary and I/O operations.
 */
public final class BinaryFunctions {

    private static final byte NUL = (byte) 0;
    private static final Logger LOGGER = Logger.getLogger(BinaryFunctions.class.getName());

    /**
     * Converts four characters to a 32-bit integer (quad).
     *
     * @param c1 the first character.
     * @param c2 the second character.
     * @param c3 the third character.
     * @param c4 the fourth character.
     * @return the 32-bit integer value.
     */
    public static int charsToQuad(final char c1, final char c2, final char c3, final char c4) {
        return (0xff & c1) << 24 | (0xff & c2) << 16 | (0xff & c3) << 8 | (0xff & c4) << 0;
    }

    /**
     * Compares byte arrays for equality within specified ranges.
     *
     * @param a the first byte array.
     * @param aStart the starting index in the first array.
     * @param b the second byte array.
     * @param bStart the starting index in the second array.
     * @param length the number of bytes to compare.
     * @return {@code true} if the ranges are equal, {@code false} otherwise.
     */
    public static boolean compareBytes(final byte[] a, final int aStart, final byte[] b, final int bStart, final int length) {
        if (a.length < aStart + length) {
            return false;
        }
        if (b.length < bStart + length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (a[aStart + i] != b[bStart + i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Copies the specified range of the specified array into a new array.
     *
     * @param original the array from which a range is to be copied.
     * @param from     the initial index of the range to be copied, inclusive.
     * @param count    the amount of bytes to copy.
     * @return a new array containing the specified range from the original array, truncated or padded with zeros to obtain the required length.
     */
    public static byte[] copyOfRange(final byte[] original, final int from, final int count) {
        return Arrays.copyOfRange(original, from, from + Allocator.checkByteArray(count));
    }

    /**
     * Copies the start of the specified array into a new array.
     *
     * @param original the array from which a range is to be copied.
     * @param count    the amount of bytes to copy.
     * @return a new array containing the specified range from the original array, truncated or padded with zeros to obtain the required length.
     */
    public static byte[] copyOfStart(final byte[] original, int count) {
        if (count > original.length) {
            count = original.length;
        }
        return copyOfRange(original, 0, count);
    }

    /**
     * Reads bytes from a RandomAccessFile at a specified position.
     *
     * @param raf the RandomAccessFile to read from.
     * @param pos the position to start reading.
     * @param length the number of bytes to read.
     * @param exception the exception message if length is invalid.
     * @return the bytes read.
     * @throws IOException if an I/O error occurs or length is invalid.
     */
    public static byte[] getBytes(final RandomAccessFile raf, final long pos, final int length, final String exception) throws IOException {
        if (length < 0) {
            throw new IOException(String.format("%s, invalid length: %d", exception, length));
        }
        Allocator.checkByteArray(length);
        return RandomAccessFiles.read(raf, pos, length);

    }

    /**
     * Finds the index of the first 0 in the array starting at the given index.
     *
     * @param src  the array to search for the object, may be {@code null}.
     * @param start  the index to start searching.
     * @param message The ImagingException message if 0 is not found.
     * @return the index of the value within the array,
     * @throws ImagingException Thrown if 0 is not found.
     */
    public static int indexOf0(final byte[] src, final int start, final String message) throws ImagingException {
        final int i = ArrayUtils.indexOf(src, NUL, start);
        if (i < 0) {
            throw new ImagingException(message);
        }
        return i;
    }

    /**
     * Finds the index of the first 0 in the array starting at the given index.
     *
     * @param src  the array to search for the object, may be {@code null}.
     * @param message The ImagingException message if 0 is not found.
     * @return the index of the value within the array,
     * @throws ImagingException Thrown if 0 is not found.
     */
    public static int indexOf0(final byte[] src, final String message) throws ImagingException {
        return indexOf0(src, 0, message);
    }

    /**
     * Logs the binary representation of a byte.
     *
     * @param msg the message prefix.
     * @param i the byte value.
     */
    public static void logByteBits(final String msg, final byte i) {
        LOGGER.finest(msg + ": '" + Integer.toBinaryString(0xff & i));
    }

    /**
     * Logs a quad as a character string.
     *
     * @param msg the message prefix.
     * @param i the quad value.
     */
    public static void logCharQuad(final String msg, final int i) {
        LOGGER.finest(msg + ": '" + (char) (0xff & i >> 24) + (char) (0xff & i >> 16) + (char) (0xff & i >> 8) + (char) (0xff & i >> 0) + "'");

    }

    /**
     * Prints a quad as a character string to a PrintWriter.
     *
     * @param pw the PrintWriter.
     * @param msg the message prefix.
     * @param i the quad value.
     */
    public static void printCharQuad(final PrintWriter pw, final String msg, final int i) {
        pw.println(msg + ": '" + (char) (0xff & i >> 24) + (char) (0xff & i >> 16) + (char) (0xff & i >> 8) + (char) (0xff & i >> 0) + "'");
    }

    /**
     * Convert a quad into a byte array.
     *
     * @param quad quad.
     * @return a byte array.
     */
    public static byte[] quadsToByteArray(final int quad) {
        final byte[] arr = new byte[4];
        arr[0] = (byte) (quad >> 24);
        arr[1] = (byte) (quad >> 16);
        arr[2] = (byte) (quad >> 8);
        arr[3] = (byte) quad;
        return arr;
    }

    /**
     * Reads 2 bytes from an input stream in the specified byte order.
     *
     * @param name the field name (for debugging).
     * @param in the input stream.
     * @param exception the exception message if read fails.
     * @param byteOrder the byte order.
     * @return the 16-bit value.
     * @throws IOException if an I/O error occurs.
     */
    public static int read2Bytes(final String name, final InputStream in, final String exception, final ByteOrder byteOrder) throws IOException {
        final int byte0 = in.read();
        final int byte1 = in.read();
        if ((byte0 | byte1) < 0) {
            throw new IOException(exception);
        }
        final int result;
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            result = byte0 << 8 | byte1;
        } else {
            result = byte1 << 8 | byte0;
        }
        return result;
    }

    /**
     * Reads 3 bytes from an input stream in the specified byte order.
     *
     * @param name the field name (for debugging).
     * @param in the input stream.
     * @param exception the exception message if read fails.
     * @param byteOrder the byte order.
     * @return the 24-bit value.
     * @throws IOException if an I/O error occurs.
     */
    public static int read3Bytes(final String name, final InputStream in, final String exception, final ByteOrder byteOrder) throws IOException {
        final int byte0 = in.read();
        final int byte1 = in.read();
        final int byte2 = in.read();
        if ((byte0 | byte1 | byte2) < 0) {
            throw new IOException(exception);
        }
        final int result;
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            result = byte0 << 16 | byte1 << 8 | byte2 << 0;
        } else {
            result = byte2 << 16 | byte1 << 8 | byte0 << 0;
        }
        return result;
    }

    /**
     * Reads 4 bytes from an input stream in the specified byte order.
     *
     * @param name the field name (for debugging).
     * @param in the input stream.
     * @param exception the exception message if read fails.
     * @param byteOrder the byte order.
     * @return the 32-bit value.
     * @throws IOException if an I/O error occurs.
     */
    public static int read4Bytes(final String name, final InputStream in, final String exception, final ByteOrder byteOrder) throws IOException {
        final int byte0 = in.read();
        final int byte1 = in.read();
        final int byte2 = in.read();
        final int byte3 = in.read();
        if ((byte0 | byte1 | byte2 | byte3) < 0) {
            throw new IOException(exception);
        }
        final int result;
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            result = byte0 << 24 | byte1 << 16 | byte2 << 8 | byte3 << 0;
        } else {
            result = byte3 << 24 | byte2 << 16 | byte1 << 8 | byte0 << 0;
        }
        return result;
    }

    /**
     * Reads eight bytes from the specified input stream, adjust for byte order, and return a long integer.
     *
     * @param name      a descriptive identifier used for diagnostic purposes
     * @param in        a valid input stream
     * @param exception application-defined message to be used for constructing an exception if an error condition is triggered.
     * @param byteOrder the order in which the InputStream marshals data
     * @return a long integer interpreted from next 8 bytes in the InputStream
     * @throws IOException in the event of a non-recoverable error, such as an attempt to read past the end of file.
     */
    public static long read8Bytes(final String name, final InputStream in, final String exception, final ByteOrder byteOrder) throws IOException {
        final long byte0 = in.read();
        final long byte1 = in.read();
        final long byte2 = in.read();
        final long byte3 = in.read();
        final long byte4 = in.read();
        final long byte5 = in.read();
        final long byte6 = in.read();
        final long byte7 = in.read();
        if ((byte0 | byte1 | byte2 | byte3 | byte4 | byte5 | byte6 | byte7) < 0) {
            throw new IOException(exception);
        }
        final long result;
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            result = byte0 << 56 | byte1 << 48 | byte2 << 40 | byte3 << 32 | byte4 << 24 | byte5 << 16 | byte6 << 8 | byte7 << 0;
        } else {
            result = byte7 << 56 | byte6 << 48 | byte5 << 40 | byte4 << 32 | byte3 << 24 | byte2 << 16 | byte1 << 8 | byte0 << 0;
        }
        return result;
    }

    /**
     * Reads and verifies bytes match a BinaryConstant.
     *
     * @param in the input stream.
     * @param expected the expected binary constant.
     * @param exception the exception message if bytes don't match.
     * @throws ImagingException if the bytes don't match or EOF is reached.
     * @throws IOException if an I/O error occurs.
     */
    public static void readAndVerifyBytes(final InputStream in, final BinaryConstant expected, final String exception) throws ImagingException, IOException {
        readAndVerifyBytes(in, expected.rawValue(), exception);
    }

    /**
     * Reads and verifies bytes match an expected byte array.
     *
     * @param in the input stream.
     * @param expected the expected byte array.
     * @param exception the exception message if bytes don't match.
     * @throws ImagingException if the bytes don't match or EOF is reached.
     * @throws IOException if an I/O error occurs.
     */
    public static void readAndVerifyBytes(final InputStream in, final byte[] expected, final String exception) throws ImagingException, IOException {
        for (final byte element : expected) {
            final int data = in.read();
            final byte b = (byte) (0xff & data);
            if (data < 0) {
                throw new ImagingException("Unexpected EOF.");
            }
            if (b != element) {
                throw new ImagingException(exception);
            }
        }
    }

    /**
     * Reads a single byte from an input stream.
     *
     * @param name the field name (for debugging).
     * @param in the input stream.
     * @param exceptionMessage the exception message if read fails.
     * @return the byte read.
     * @throws IOException if an I/O error occurs.
     */
    public static byte readByte(final String name, final InputStream in, final String exceptionMessage) throws IOException {
        final int result = in.read();
        if (result < 0) {
            throw new IOException(exceptionMessage);
        }
        return (byte) (0xff & result);
    }

    /**
     * Reads a specified number of bytes from an input stream.
     *
     * @param in the input stream.
     * @param count the number of bytes to read.
     * @return the bytes read.
     * @throws IOException if an I/O error occurs.
     */
    public static byte[] readBytes(final InputStream in, final int count) throws IOException {
        return readBytes("", in, count, "Unexpected EOF");
    }

    /**
     * Reads a specified number of bytes from an input stream.
     *
     * @param name the field name (for debugging).
     * @param in the input stream.
     * @param length the number of bytes to read.
     * @return the bytes read.
     * @throws IOException if an I/O error occurs.
     */
    public static byte[] readBytes(final String name, final InputStream in, final int length) throws IOException {
        return readBytes(name, in, length, name + " could not be read.");
    }

    /**
     * Reads a specified number of bytes from an input stream with a custom exception message.
     *
     * @param name the field name (for debugging).
     * @param in the input stream.
     * @param length the number of bytes to read.
     * @param exception the exception message if read fails.
     * @return the bytes read.
     * @throws IOException if an I/O error occurs.
     */
    public static byte[] readBytes(final String name, final InputStream in, final int length, final String exception) throws IOException {
        try {
            return in == null ? ArrayUtils.EMPTY_BYTE_ARRAY : IOUtils.toByteArray(in, Allocator.check(length));
        } catch (final IOException e) {
            throw new IOException(exception + ", name: " + name + ", length: " + length);
        }
    }

    /**
     * Gets the remaining bytes from a byte array starting at a specified offset.
     *
     * @param name the field name (for debugging).
     * @param bytes the source byte array.
     * @param count the starting offset.
     * @return the remaining bytes.
     */
    public static byte[] remainingBytes(final String name, final byte[] bytes, final int count) {
        return copyOfRange(bytes, count, bytes.length - count);
    }

    /**
     * Consumes the {@code InputStream} (without closing it) searching for a quad. It will stop either when the quad is found, or when there are no more bytes
     * in the input stream.
     *
     * <p>
     * Returns {@code true} if it found the quad, and {@code false} otherwise.
     *
     * @param quad a quad (the needle).
     * @param in  an input stream (the haystack).
     * @return {@code true} if it found the quad, and {@code false} otherwise.
     * @throws IOException if it fails to read from the given input stream.
     */
    public static boolean searchQuad(final int quad, final InputStream in) throws IOException {
        final byte[] needle = quadsToByteArray(quad);
        int b = -1;
        int position = 0;
        while ((b = in.read()) != -1) {
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

    /**
     * Skips a specified number of bytes in an input stream.
     *
     * @param in the input stream.
     * @param skip the number of bytes to skip.
     * @return the number of bytes actually skipped.
     * @throws IOException if an I/O error occurs.
     */
    public static long skipBytes(final InputStream in, final long skip) throws IOException {
        return skipBytes(in, skip, "Couldn't skip bytes");
    }

    /**
     * Skips a specified number of bytes in an input stream with a custom exception message.
     *
     * @param in the input stream.
     * @param skip the number of bytes to skip.
     * @param exMessage the exception message if skip fails.
     * @return the number of bytes actually skipped.
     * @throws IOException if an I/O error occurs.
     */
    public static long skipBytes(final InputStream in, final long skip, final String exMessage) throws IOException {
        try {
            return IOUtils.skip(in, skip);
        } catch (final IOException e) {
            throw new IOException(exMessage, e);
        }
    }

    /**
     * Tests whether a byte array starts with a specified byte sequence.
     *
     * @param buffer the buffer to test.
     * @param search the byte sequence to search for.
     * @return {@code true} if the buffer starts with the search sequence, {@code false} otherwise.
     */
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
