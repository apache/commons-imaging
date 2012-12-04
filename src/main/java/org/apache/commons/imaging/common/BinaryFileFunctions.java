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
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;

public class BinaryFileFunctions {
    protected boolean debug = false;

    public final void setDebug(final boolean b) {
        debug = b;
    }

    public final boolean getDebug() {
        return debug;
    }

    protected final void readRandomBytes(final InputStream is) throws IOException {

        for (int counter = 0; counter < 100; counter++) {
            readByte("" + counter, is, "Random Data");
        }
    }

    public final void debugNumber(final String msg, final int data) {
        debugNumber(msg, data, 1);
    }

    public final void debugNumber(final String msg, final int data, final int bytes) {
        final PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, Charset.defaultCharset()));
        debugNumber(pw, msg, data, bytes);
        pw.flush();
    }

    public final void debugNumber(final PrintWriter pw, final String msg, final int data) {
        debugNumber(pw, msg, data, 1);
    }

    public final void debugNumber(final PrintWriter pw, final String msg, final int data,
            final int bytes) {
        pw.print(msg + ": " + data + " (");
        int byteData = data;
        for (int i = 0; i < bytes; i++) {
            if (i > 0) {
                pw.print(",");
            }
            final int singleByte = 0xff & byteData;
            pw.print((char) singleByte + " [" + singleByte + "]");
            byteData >>= 8;
        }
        pw.println(") [0x" + Integer.toHexString(data) + ", "
                + Integer.toBinaryString(data) + "]");
        pw.flush();
    }

    public final boolean startsWith(final byte haystack[], final byte needle[]) {
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

    public final byte[] readBytes(final InputStream is, final int count) throws IOException {
        final byte result[] = new byte[count];
        for (int i = 0; i < count; i++) {
            final int data = is.read();
            result[i] = (byte) data;
        }
        return result;
    }

    public final void readAndVerifyBytes(final InputStream is, final byte expected[],
            final String exception) throws ImageReadException, IOException {
        for (final byte element : expected) {
            final int data = is.read();
            final byte b = (byte) (0xff & data);

            if (data < 0) {
                throw new ImageReadException("Unexpected EOF.");
            }

            if (b != element) {
                // System.out.println("i" + ": " + i);

                // this.debugByteArray("expected", expected);
                // debugNumber("data[" + i + "]", b);
                // debugNumber("expected[" + i + "]", expected[i]);

                throw new ImageReadException(exception);
            }
        }
    }

    public final void readAndVerifyBytes(final InputStream is,
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

    protected final void readAndVerifyBytes(final String name, final InputStream is,
            final byte expected[], final String exception) throws ImageReadException,
            IOException {
        final byte bytes[] = readByteArray(name, expected.length, is, exception);

        for (int i = 0; i < expected.length; i++) {
            if (bytes[i] != expected[i]) {
                // System.out.println("i" + ": " + i);
                // debugNumber("bytes[" + i + "]", bytes[i]);
                // debugNumber("expected[" + i + "]", expected[i]);

                throw new ImageReadException(exception);
            }
        }
    }

    public final void skipBytes(final InputStream is, final int length, final String exception)
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

    protected final void scanForByte(final InputStream is, final byte value)
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

    public final byte readByte(final String name, final InputStream is, final String exception)
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

    protected final RationalNumber[] convertByteArrayToRationalArray(
            final String name, final byte bytes[], final int start, final int length, final ByteOrder byteOrder) {
        final int expectedLength = start + length * 8;

        if (bytes.length < expectedLength) {
            System.out.println(name + ": expected length: " + expectedLength
                    + ", actual length: " + bytes.length);
            return null;
        }

        final RationalNumber result[] = new RationalNumber[length];

        for (int i = 0; i < length; i++) {
            result[i] = convertByteArrayToRational(name, bytes, start + i * 8,
                    byteOrder);
        }

        return result;
    }

    protected final RationalNumber convertByteArrayToRational(final String name,
            final byte bytes[], final ByteOrder byteOrder) {
        return convertByteArrayToRational(name, bytes, 0, byteOrder);
    }

    protected final RationalNumber convertByteArrayToRational(final String name,
            final byte bytes[], final int start, final ByteOrder byteOrder) {
        final int numerator = convertByteArrayToInt(name, bytes, start + 0, byteOrder);
        final int divisor = convertByteArrayToInt(name, bytes, start + 4, byteOrder);

        return new RationalNumber(numerator, divisor);
    }

    protected final int convertByteArrayToInt(final String name, final byte bytes[],
            final ByteOrder byteOrder) {
        return convertByteArrayToInt(name, bytes, 0, byteOrder);
    }

    protected final int convertByteArrayToInt(final String name, final byte bytes[],
            final int start, final ByteOrder byteOrder) {
        final byte byte0 = bytes[start + 0];
        final byte byte1 = bytes[start + 1];
        final byte byte2 = bytes[start + 2];
        final byte byte3 = bytes[start + 3];

        int result;

        if (byteOrder == ByteOrder.MOTOROLA) {
            result = ((0xff & byte0) << 24) | ((0xff & byte1) << 16)
                    | ((0xff & byte2) << 8) | ((0xff & byte3) << 0);
        } else {
            result = ((0xff & byte3) << 24) | ((0xff & byte2) << 16)
                    | ((0xff & byte1) << 8) | ((0xff & byte0) << 0);
        }

        if (debug) {
            debugNumber(name, result, 4);
        }

        return result;
    }

    protected final int[] convertByteArrayToIntArray(final String name, final byte bytes[],
            final int start, final int length, final ByteOrder byteOrder) {
        final int expectedLength = start + length * 4;

        if (bytes.length < expectedLength) {
            System.out.println(name + ": expected length: " + expectedLength
                    + ", actual length: " + bytes.length);
            return null;
        }

        final int result[] = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = convertByteArrayToInt(name, bytes, start + i * 4,
                    byteOrder);
        }

        return result;
    }

    protected final void writeIntInToByteArray(final int value, final byte bytes[],
            final int start, final ByteOrder byteOrder) {
        if (byteOrder == ByteOrder.MOTOROLA) {
            bytes[start + 0] = (byte) (value >> 24);
            bytes[start + 1] = (byte) (value >> 16);
            bytes[start + 2] = (byte) (value >> 8);
            bytes[start + 3] = (byte) (value >> 0);
        } else {
            bytes[start + 3] = (byte) (value >> 24);
            bytes[start + 2] = (byte) (value >> 16);
            bytes[start + 1] = (byte) (value >> 8);
            bytes[start + 0] = (byte) (value >> 0);
        }
    }

    protected static final byte[] int2ToByteArray(final int value, final ByteOrder byteOrder) {
        if (byteOrder == ByteOrder.MOTOROLA) {
            return new byte[] { (byte) (value >> 8), (byte) (value >> 0), };
        } else {
            return new byte[] { (byte) (value >> 0), (byte) (value >> 8), };
        }
    }

    protected final byte[] convertIntArrayToByteArray(final int values[],
            final ByteOrder byteOrder) {
        final byte result[] = new byte[values.length * 4];

        for (int i = 0; i < values.length; i++) {
            writeIntInToByteArray(values[i], result, i * 4, byteOrder);
        }

        return result;
    }

    protected final byte[] convertShortArrayToByteArray(final int values[],
            final ByteOrder byteOrder) {
        final byte result[] = new byte[values.length * 2];

        for (int i = 0; i < values.length; i++) {
            final int value = values[i];

            if (byteOrder == ByteOrder.MOTOROLA) {
                result[i * 2 + 0] = (byte) (value >> 8);
                result[i * 2 + 1] = (byte) (value >> 0);
            } else {
                result[i * 2 + 1] = (byte) (value >> 8);
                result[i * 2 + 0] = (byte) (value >> 0);
            }
        }

        return result;
    }

    protected final byte[] convertShortToByteArray(final int value, final ByteOrder byteOrder) {
        final byte result[] = new byte[2];

        if (byteOrder == ByteOrder.MOTOROLA) {
            result[0] = (byte) (value >> 8);
            result[1] = (byte) (value >> 0);
        } else {
            result[1] = (byte) (value >> 8);
            result[0] = (byte) (value >> 0);
        }

        return result;
    }

    protected final byte[] convertIntArrayToRationalArray(final int numerators[],
            final int denominators[], final ByteOrder byteOrder) throws ImageWriteException {
        if (numerators.length != denominators.length) {
            throw new ImageWriteException("numerators.length ("
                    + numerators.length + " != denominators.length ("
                    + denominators.length + ")");
        }

        final byte result[] = new byte[numerators.length * 8];

        for (int i = 0; i < numerators.length; i++) {
            writeIntInToByteArray(numerators[i], result, i * 8, byteOrder);
            writeIntInToByteArray(denominators[i], result, i * 8 + 4, byteOrder);
        }

        return result;
    }

    protected final byte[] convertRationalArrayToByteArray(
            final RationalNumber numbers[], final ByteOrder byteOrder) {
        // Debug.debug("convertRationalArrayToByteArray 2");
        final byte result[] = new byte[numbers.length * 8];

        for (int i = 0; i < numbers.length; i++) {
            writeIntInToByteArray(numbers[i].numerator, result, i * 8,
                    byteOrder);
            writeIntInToByteArray(numbers[i].divisor, result, i * 8 + 4,
                    byteOrder);
        }

        return result;
    }

    protected final byte[] convertRationalToByteArray(final RationalNumber number,
            final ByteOrder byteOrder) {
        final byte result[] = new byte[8];

        writeIntInToByteArray(number.numerator, result, 0, byteOrder);
        writeIntInToByteArray(number.divisor, result, 4, byteOrder);

        return result;
    }

    protected final int convertByteArrayToShort(final String name, final byte bytes[],
            final ByteOrder byteOrder) throws ImageReadException {
        return convertByteArrayToShort(name, 0, bytes, byteOrder);
    }

    protected final int convertByteArrayToShort(final String name, final int index,
            final byte bytes[], final ByteOrder byteOrder) throws ImageReadException {
        if (index + 1 >= bytes.length) {
            throw new ImageReadException("Index out of bounds. Array size: "
                    + bytes.length + ", index: " + index);
        }

        final int byte0 = 0xff & bytes[index + 0];
        final int byte1 = 0xff & bytes[index + 1];

        int result;

        if (byteOrder == ByteOrder.MOTOROLA) {
            result = (byte0 << 8) | byte1;
        } else {
            // intel, little endian
            result = (byte1 << 8) | byte0;
        }

        if (debug) {
            debugNumber(name, result, 2);
        }

        return result;
    }

    protected final int[] convertByteArrayToShortArray(final String name,
            final byte bytes[], final int start, final int length, final ByteOrder byteOrder)
            throws ImageReadException

    {
        final int expectedLength = start + length * 2;

        if (bytes.length < expectedLength) {
            System.out.println(name + ": expected length: " + expectedLength
                    + ", actual length: " + bytes.length);
            return null;
        }

        final int result[] = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = convertByteArrayToShort(name, start + i * 2, bytes,
                    byteOrder);
        }

        return result;
    }

    public final byte[] readByteArray(final String name, final int length, final InputStream is)
            throws IOException {
        final String exception = name + " could not be read.";
        return readByteArray(name, length, is, exception);
    }

    public final byte[] readByteArray(final String name, final int length, final InputStream is,
            final String exception) throws IOException {
        final byte result[] = new byte[length];

        int read = 0;
        while (read < length) {
            final int count = is.read(result, read, length - read);
            // Debug.debug("count", count);
            if (count < 1) {
                throw new IOException(exception + " count: " + count
                        + " read: " + read + " length: " + length);
            }

            read += count;
        }

        if (debug) {
            for (int i = 0; ((i < length) && (i < 50)); i++) {
                debugNumber(name + " (" + i + ")", 0xff & result[i]);
            }
        }
        return result;
    }

    public final void debugByteArray(final String name, final byte bytes[]) {
        System.out.println(name + ": " + bytes.length);

        for (int i = 0; ((i < bytes.length) && (i < 50)); i++) {
            debugNumber("\t" + " (" + i + ")", 0xff & bytes[i]);
        }
    }

    protected final void debugNumberArray(final String name, final int numbers[], final int length) {
        System.out.println(name + ": " + numbers.length);

        for (int i = 0; ((i < numbers.length) && (i < 50)); i++) {
            debugNumber(name + " (" + i + ")", numbers[i], length);
        }
    }

    public final byte[] readBytearray(final String name, final byte bytes[], final int start,
            final int count) throws ImageReadException {
        if (bytes.length < (start + count)) {
            throw new ImageReadException("Invalid read. bytes.length: "
                    + bytes.length + ", start: " + start + ", count: " + count);
            // return null;
        }

        final byte result[] = new byte[count];
        System.arraycopy(bytes, start, result, 0, count);

        if (debug) {
            debugByteArray(name, result);
        }

        return result;
    }

    protected final byte[] getByteArrayTail(final String name, final byte bytes[], final int count)
            throws ImageReadException {
        return readBytearray(name, bytes, count, bytes.length - count);
    }

    protected final byte[] getBytearrayHead(final String name, final byte bytes[], final int count)
            throws ImageReadException {
        return readBytearray(name, bytes, 0, bytes.length - count);
    }

    public static final byte[] slice(final byte bytes[], final int start, final int count) {
        if (bytes.length < (start + count)) {
            return null;
        }

        final byte result[] = new byte[count];
        System.arraycopy(bytes, start, result, 0, count);

        return result;
    }

    public static final byte[] tail(final byte bytes[], int count) {
        if (count > bytes.length) {
            count = bytes.length;
        }
        return slice(bytes, bytes.length - count, count);
    }

    public static final byte[] head(final byte bytes[], int count) {
        if (count > bytes.length) {
            count = bytes.length;
        }
        return slice(bytes, 0, count);
    }

    public final boolean compareByteArrays(final byte a[], final byte b[]) {
        if (a.length != b.length) {
            return false;
        }

        return compareByteArrays(a, 0, b, 0, a.length);
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
                // debugNumber("\t" + "a[" + (aStart + i) + "]", a[aStart + i]);
                // debugNumber("\t" + "b[" + (bStart + i) + "]", b[bStart + i]);

                return false;
            }
        }

        return true;
    }

    public static final boolean compareBytes(final byte a[], final byte b[]) {
        if (a.length != b.length) {
            return false;
        }

        return compareBytes(a, 0, b, 0, a.length);
    }

    public static final boolean compareBytes(final byte a[], final int aStart, final byte b[],
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

    protected final int read4Bytes(final String name, final InputStream is,
            final String exception, final ByteOrder byteOrder) throws IOException {
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

    protected final int read3Bytes(final String name, final InputStream is,
            final String exception, final ByteOrder byteOrder) throws IOException {
        final byte byte0 = (byte) is.read();
        final byte byte1 = (byte) is.read();
        final byte byte2 = (byte) is.read();

        int result;

        if (byteOrder == ByteOrder.MOTOROLA) {
            result = ((0xff & byte0) << 16) | ((0xff & byte1) << 8)
                    | ((0xff & byte2) << 0);
        } else {
            result = ((0xff & byte2) << 16) | ((0xff & byte1) << 8)
                    | ((0xff & byte0) << 0);
        }

        if (debug) {
            debugNumber(name, result, 3);
        }

        return result;
    }

    protected final int read2Bytes(final String name, final InputStream is,
            final String exception, final ByteOrder byteOrder) throws ImageReadException,
            IOException {
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

    protected final void printCharQuad(final String msg, final int i) {
        System.out.println(msg + ": '" + (char) (0xff & (i >> 24))
                + (char) (0xff & (i >> 16)) + (char) (0xff & (i >> 8))
                + (char) (0xff & (i >> 0)) + "'");

    }

    protected final void printCharQuad(final PrintWriter pw, final String msg, final int i) {
        pw.println(msg + ": '" + (char) (0xff & (i >> 24))
                + (char) (0xff & (i >> 16)) + (char) (0xff & (i >> 8))
                + (char) (0xff & (i >> 0)) + "'");

    }

    protected final void printByteBits(final String msg, final byte i) {
        System.out.println(msg + ": '" + Integer.toBinaryString(0xff & i));
    }

    public final static int charsToQuad(final char c1, final char c2, final char c3, final char c4) {
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
        if (debug) {
            System.out.println("getRAFBytes pos" + ": " + pos);
            System.out.println("getRAFBytes length" + ": " + length);
        }

        final byte result[] = new byte[length];

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

    protected final float convertByteArrayToFloat(final String name, final byte bytes[],
            final ByteOrder byteOrder) {
        return convertByteArrayToFloat(name, bytes, 0, byteOrder);
    }

    protected final float convertByteArrayToFloat(final String name, final byte bytes[],
            final int start, final ByteOrder byteOrder) {
        // TODO: not tested; probably wrong.

        final byte byte0 = bytes[start + 0];
        final byte byte1 = bytes[start + 1];
        final byte byte2 = bytes[start + 2];
        final byte byte3 = bytes[start + 3];

        int bits;

        if (byteOrder == ByteOrder.MOTOROLA) {
            bits = ((0xff & byte0) << 24) | ((0xff & byte1) << 16)
                    | ((0xff & byte2) << 8) | ((0xff & byte3) << 0);
        } else {
            bits = ((0xff & byte3) << 24) | ((0xff & byte2) << 16)
                    | ((0xff & byte1) << 8) | ((0xff & byte0) << 0);
        }

        final float result = Float.intBitsToFloat(bits);

        return result;
    }

    protected final float[] convertByteArrayToFloatArray(final String name,
            final byte bytes[], final int start, final int length, final ByteOrder byteOrder) {
        final int expectedLength = start + length * 4;

        if (bytes.length < expectedLength) {
            System.out.println(name + ": expected length: " + expectedLength
                    + ", actual length: " + bytes.length);
            return null;
        }

        final float result[] = new float[length];

        for (int i = 0; i < length; i++) {
            result[i] = convertByteArrayToFloat(name, bytes, start + i * 4,
                    byteOrder);
        }

        return result;
    }

    protected final byte[] convertFloatToByteArray(final float value, final ByteOrder byteOrder) {
        final byte result[] = new byte[4];

        final int bits = Float.floatToRawIntBits(value);

        if (byteOrder == ByteOrder.INTEL) {
            result[0] = (byte) (0xff & (bits >> 0));
            result[1] = (byte) (0xff & (bits >> 8));
            result[2] = (byte) (0xff & (bits >> 16));
            result[3] = (byte) (0xff & (bits >> 24));
        } else {
            result[3] = (byte) (0xff & (bits >> 0));
            result[2] = (byte) (0xff & (bits >> 8));
            result[1] = (byte) (0xff & (bits >> 16));
            result[0] = (byte) (0xff & (bits >> 24));
        }

        return result;
    }

    protected final byte[] convertDoubleArrayToByteArray(final double values[],
            final ByteOrder byteOrder) {
        final byte result[] = new byte[values.length * 8];
        for (int i = 0; i < values.length; i++) {
            final double value = values[i];
            final long bits = Double.doubleToRawLongBits(value);

            final int start = i * 8;
            if (byteOrder == ByteOrder.INTEL) {
                result[start + 0] = (byte) (0xff & (bits >> 0));
                result[start + 1] = (byte) (0xff & (bits >> 8));
                result[start + 2] = (byte) (0xff & (bits >> 16));
                result[start + 3] = (byte) (0xff & (bits >> 24));
                result[start + 4] = (byte) (0xff & (bits >> 32));
                result[start + 5] = (byte) (0xff & (bits >> 40));
                result[start + 6] = (byte) (0xff & (bits >> 48));
                result[start + 7] = (byte) (0xff & (bits >> 56));
            } else {
                result[start + 7] = (byte) (0xff & (bits >> 0));
                result[start + 6] = (byte) (0xff & (bits >> 8));
                result[start + 5] = (byte) (0xff & (bits >> 16));
                result[start + 4] = (byte) (0xff & (bits >> 24));
                result[start + 3] = (byte) (0xff & (bits >> 32));
                result[start + 2] = (byte) (0xff & (bits >> 40));
                result[start + 1] = (byte) (0xff & (bits >> 48));
                result[start + 0] = (byte) (0xff & (bits >> 56));
            }
        }
        return result;
    }

    protected final double convertByteArrayToDouble(final String name, final byte bytes[],
            final ByteOrder byteOrder) {
        return convertByteArrayToDouble(name, bytes, 0, byteOrder);
    }

    protected final double convertByteArrayToDouble(final String name, final byte bytes[],
            final int start, final ByteOrder byteOrder) {
        final byte byte0 = bytes[start + 0];
        final byte byte1 = bytes[start + 1];
        final byte byte2 = bytes[start + 2];
        final byte byte3 = bytes[start + 3];
        final byte byte4 = bytes[start + 4];
        final byte byte5 = bytes[start + 5];
        final byte byte6 = bytes[start + 6];
        final byte byte7 = bytes[start + 7];

        long bits;

        if (byteOrder == ByteOrder.MOTOROLA) {
            bits = ((0xffL & byte0) << 56) | ((0xffL & byte1) << 48)
                    | ((0xffL & byte2) << 40) | ((0xffL & byte3) << 32)
                    | ((0xffL & byte4) << 24) | ((0xffL & byte5) << 16)
                    | ((0xffL & byte6) << 8) | ((0xffL & byte7) << 0);

        } else {
            bits = ((0xffL & byte7) << 56) | ((0xffL & byte6) << 48)
                    | ((0xffL & byte5) << 40) | ((0xffL & byte4) << 32)
                    | ((0xffL & byte3) << 24) | ((0xffL & byte2) << 16)
                    | ((0xffL & byte1) << 8) | ((0xffL & byte0) << 0);
        }

        final double result = Double.longBitsToDouble(bits);

        return result;
    }

    protected final double[] convertByteArrayToDoubleArray(final String name,
            final byte bytes[], final int start, final int length, final ByteOrder byteOrder) {
        final int expectedLength = start + length * 8;

        if (bytes.length < expectedLength) {
            System.out.println(name + ": expected length: " + expectedLength
                    + ", actual length: " + bytes.length);
            return null;
        }

        final double result[] = new double[length];

        for (int i = 0; i < length; i++) {
            result[i] = convertByteArrayToDouble(name, bytes, start + i * 8,
                    byteOrder);
        }

        return result;
    }

    protected void skipBytes(final InputStream is, final int length) throws IOException {
        this.skipBytes(is, length, "Couldn't skip bytes");
    }

    public final void copyStreamToStream(final InputStream is, final OutputStream os)
            throws IOException {
        final byte buffer[] = new byte[1024];
        int read;
        while ((read = is.read(buffer)) > 0) {
            os.write(buffer, 0, read);
        }
    }

    public final byte[] getStreamBytes(final InputStream is) throws IOException {
        final ByteArrayOutputStream os = new ByteArrayOutputStream();
        copyStreamToStream(is, os);
        return os.toByteArray();
    }
}
