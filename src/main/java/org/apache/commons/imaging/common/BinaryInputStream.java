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

    public final void setByteOrder(final ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
    }

    public final ByteOrder getByteOrder() {
        return byteOrder;
    }

    @Override
    public int read() throws IOException {
        return is.read();
    }

    public final int read4Bytes(final String name, final String exception)
            throws IOException {
        return BinaryFunctions.read4Bytes(name, is, exception, byteOrder);
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
        BinaryFunctions.readAndVerifyBytes(is, expected, exception);
    }

    public final void readAndVerifyBytes(final String name, final byte expected[],
            final String exception) throws ImageReadException, IOException {
        BinaryFunctions.readAndVerifyBytes(name, is, expected, exception);
    }

    public final void skipBytes(final long length, final String exception)
            throws IOException {
        BinaryFunctions.skipBytes(is, length, exception);
    }

    public final void scanForByte(final byte value) throws IOException {
        BinaryFunctions.scanForByte(is, value);
    }

    public final byte[] readBytes(final String name, final int length, final String exception)
            throws IOException {
        return BinaryFunctions.readBytes(name, is, length, exception);
    }

    public final void debugByteArray(final String name, final byte bytes[]) {
        System.out.println(name + ": " + bytes.length);

        for (int i = 0; ((i < bytes.length) && (i < 50)); i++) {
            debugNumber(name + " (" + i + ")", bytes[i]);
        }
    }

    public final void debugNumberArray(final String name, final int numbers[], final int length) {
        System.out.println(name + ": " + numbers.length);

        for (int i = 0; ((i < numbers.length) && (i < 50)); i++) {
            debugNumber(name + " (" + i + ")", numbers[i], length);
        }
    }

    public final byte[] readBytes(final int length, final String error)
            throws ImageReadException, IOException {
        return BinaryFunctions.readBytes("", is, length, error);
    }

    public final boolean compareBytes(final byte a[], final int aStart, final byte b[],
            final int bStart, final int length) {
        return BinaryFunctions.compareBytes(a, aStart, b, bStart, length);
    }

    public final int read4Bytes(final String name, final String exception, final ByteOrder byteOrder)
            throws IOException {
        return BinaryFunctions.read4Bytes(name, is, exception, byteOrder);
    }
    
    public final int read4Bytes(final String exception) throws IOException {
        return BinaryFunctions.read4Bytes("", is, exception, byteOrder);
    }

    public final int read3Bytes(final String name, final String exception, final ByteOrder byteOrder)
            throws IOException {
        return BinaryFunctions.read3Bytes(name, is, exception, byteOrder);
    }
    
    public final int read3Bytes(final String name, final String exception) throws IOException {
        return BinaryFunctions.read3Bytes(name, is, exception, byteOrder);
    }

    public final int read2Bytes(final String name, final String exception, final ByteOrder byteOrder)
            throws IOException {
        return BinaryFunctions.read2Bytes(name, is, exception, byteOrder);
    }

    public final int read2Bytes(final String name, final String exception)
            throws IOException {
        return BinaryFunctions.read2Bytes(name, is, exception, byteOrder);
    }

    public final int read2Bytes(final String exception) throws IOException {
        return BinaryFunctions.read2Bytes("", is, exception, byteOrder);
    }

    public final byte readByte(final String name, final String exception) throws IOException {
        return BinaryFunctions.readByte(name, is, exception);
    }

    public final void printCharQuad(final String msg, final int i) {
        BinaryFunctions.printCharQuad(msg, i);
    }

    public final void printByteBits(final String msg, final byte i) {
        BinaryFunctions.printByteBits(msg, i);
    }

    public final static int charsToQuad(final char c1, final char c2, final char c3, final char c4) {
        return BinaryFunctions.charsToQuad(c1, c2, c3, c4);
    }

    public final int findNull(final byte src[]) {
        return BinaryFunctions.findNull(src);
    }

    public final int findNull(final byte src[], final int start) {
        return BinaryFunctions.findNull(src, start);
    }

    public final byte[] getRAFBytes(final RandomAccessFile raf, final long pos,
            final int length, final String exception) throws IOException {
        return BinaryFunctions.getRAFBytes(raf, pos, length, exception);
    }

    public void skipBytes(final long length) throws IOException {
        BinaryFunctions.skipBytes(is, length);
    }

}
