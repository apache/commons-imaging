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

import org.apache.commons.imaging.ImageReadException;

public class BinaryFileParser extends BinaryFileFunctions {
    public BinaryFileParser(final ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
    }

    public BinaryFileParser() {

    }

    // default byte order for Java, many file formats.
    private ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;

    // protected boolean BYTE_ORDER_reversed = true;

    protected void setByteOrder(final ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
    }

    public ByteOrder getByteOrder() {
        return byteOrder;
    }

    protected final int convertByteArrayToInt(final String name, final byte bytes[]) {
        return BinaryConversions.toInt(bytes, byteOrder);
    }

    public final int convertByteArrayToShort(final String name, final byte[] bytes)
            throws ImageReadException {
        return convertByteArrayToShort(name, bytes, byteOrder);
    }
    
    public final int convertByteArrayToShort(final String name, final int start,
            final byte bytes[]) throws ImageReadException {
        return convertByteArrayToShort(name, start, bytes, byteOrder);
    }

    public final int read4Bytes(final String name, final InputStream is, final String exception)
            throws IOException {
        return read4Bytes(name, is, exception, byteOrder);
    }

    public final int read3Bytes(final String name, final InputStream is, final String exception)
            throws IOException {
        return read3Bytes(name, is, exception, byteOrder);
    }

    public final int read2Bytes(final String name, final InputStream is, final String exception)
            throws ImageReadException, IOException {
        return read2Bytes(name, is, exception, byteOrder);
    }

    public static boolean byteArrayHasPrefix(final byte bytes[], final BinaryConstant prefix) {
        if ((bytes == null) || (bytes.length < prefix.size())) {
            return false;
        }

        for (int i = 0; i < prefix.size(); i++) {
            if (bytes[i] != prefix.get(i)) {
                return false;
            }
        }

        return true;
    }

    public static boolean byteArrayHasPrefix(final byte bytes[], final byte prefix[]) {
        if ((bytes == null) || (bytes.length < prefix.length)) {
            return false;
        }

        for (int i = 0; i < prefix.length; i++) {
            if (bytes[i] != prefix[i]) {
                return false;
            }
        }

        return true;
    }
}
