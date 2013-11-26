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
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

import org.apache.commons.imaging.ImageReadException;

public class BinaryFileParser {
    // default byte order for Java, many file formats.
    private ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    private boolean debug = false;

    public BinaryFileParser(final ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
    }

    /**
     * Constructs a BinaryFileParser with the default, big-endian, byte order.
     */
    public BinaryFileParser() {
        // as above
    }

    protected void setByteOrder(final ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
    }

    public ByteOrder getByteOrder() {
        return byteOrder;
    }
    
    public boolean getDebug() {
        return debug;
    }
    
    public void setDebug(final boolean debug) {
        this.debug = debug;
    }

    protected final byte[] toBytes(final short value) {
        return ByteConversions.toBytes(value, byteOrder);
    }

    protected final byte[] toBytes(final short value, final ByteOrder byteOrder) {
        return ByteConversions.toBytes(value, byteOrder);
    }

    protected final int toInt(final byte bytes[]) {
        return ByteConversions.toInt(bytes, byteOrder);
    }
    
    protected final int toUInt16(final byte[] bytes) {
        return ByteConversions.toUInt16(bytes, byteOrder);
    }

    protected final int toUInt16(final byte bytes[], final int start) {
        return ByteConversions.toUInt16(bytes, start, byteOrder);
    }

    protected byte[] getStreamBytes(final InputStream is) throws IOException {
        return BinaryFunctions.getStreamBytes(is);
    }
    
    protected final int read4Bytes(final String name, final InputStream is, final String exception)
            throws IOException {
        return BinaryFunctions.read4Bytes(name, is, exception, byteOrder);
    }

    protected final int read3Bytes(final String name, final InputStream is, final String exception)
            throws IOException {
        return BinaryFunctions.read3Bytes(name, is, exception, byteOrder);
    }

    protected final int read2Bytes(final String name, final InputStream is, final String exception)
            throws IOException {
        return BinaryFunctions.read2Bytes(name, is, exception, byteOrder);
    }
    
    protected final byte readByte(final String name, final InputStream is, final String exception)
            throws IOException {
        return BinaryFunctions.readByte(name, is, exception);
    }
    
    protected final byte[] readBytes(final String name, final InputStream is, final int length,
            final String exception) throws IOException {
        return BinaryFunctions.readBytes(name, is, length, exception);
    }
    
    protected final byte[] readBytes(final String name, final InputStream is, final int length)
            throws IOException {
        return BinaryFunctions.readBytes(name, is, length);
    }
    
    protected final byte[] readBytes(final InputStream is, final int count) throws IOException {
        return BinaryFunctions.readBytes(is, count);
    }
    
    protected final void readAndVerifyBytes(final InputStream is,
            final BinaryConstant expected, final String exception)
                    throws IOException, ImageReadException {
        BinaryFunctions.readAndVerifyBytes(is, expected, exception);
    }
    
    protected final void readAndVerifyBytes(final InputStream is, final byte expected[],
            final String exception) throws ImageReadException, IOException {
        BinaryFunctions.readAndVerifyBytes(is, expected, exception);
    }
    
    protected final void skipBytes(final InputStream is, final int length)
            throws IOException {
        BinaryFunctions.skipBytes(is, length);
    }

    protected final void skipBytes(final InputStream is, final long length)
            throws IOException {
        BinaryFunctions.skipBytes(is, length);
    }

    protected final void skipBytes(final InputStream is, final long length, final String exception)
            throws IOException {
        BinaryFunctions.skipBytes(is, length, exception);
    }
    
    protected final byte[] remainingBytes(final String name, final byte bytes[], final int count) {
        return BinaryFunctions.remainingBytes(name, bytes, count);
    }
    
    protected final byte[] slice(final byte bytes[], final int start, final int count) {
        return BinaryFunctions.slice(bytes, start, count);
    }
    
    protected final int findNull(final byte src[]) {
        return BinaryFunctions.findNull(src);
    }
    
    protected final int findNull(final byte src[], final int start) {
        return BinaryFunctions.findNull(src, start);
    }
    
    protected void printByteBits(final String msg, final byte i) {
        BinaryFunctions.printByteBits(msg, i);
    }
    
    protected void printCharQuad(final String msg, final int i) {
        BinaryFunctions.printCharQuad(msg, i);
    }

    protected final void printCharQuad(final PrintWriter pw, final String msg, final int i) {
        BinaryFunctions.printCharQuad(pw, msg, i);
    }
    
    protected final void debugNumber(final String msg, final int data) {
        debugNumber(msg, data, 1);
    }

    protected final void debugNumber(final String msg, final int data, final int bytes) {
        final PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, Charset.defaultCharset()));
        debugNumber(pw, msg, data, bytes);
        pw.flush();
    }

    protected final void debugNumber(final PrintWriter pw, final String msg, final int data) {
        debugNumber(pw, msg, data, 1);
    }

    protected final void debugNumber(final PrintWriter pw, final String msg, final int data,
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

    protected final boolean compareBytes(final byte a[], final int aStart, final byte b[],
            final int bStart, final int length) {
        return BinaryFunctions.compareBytes(a, aStart, b, bStart, length);
    }
    
    protected static boolean startsWith(final byte haystack[], final BinaryConstant needle) {
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

    protected static boolean startsWith(final byte haystack[], final byte needle[]) {
        return BinaryFunctions.startsWith(haystack, needle);
    }
}
