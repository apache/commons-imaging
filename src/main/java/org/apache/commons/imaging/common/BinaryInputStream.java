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
import java.nio.ByteOrder;

import org.apache.commons.imaging.ImageReadException;

public class BinaryInputStream extends InputStream {

    private final InputStream is;
    private final ByteOrder byteOrder;

    public BinaryInputStream(final InputStream is, final ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
        this.is = is;
    }

    @Override
    public int read() throws IOException {
        return is.read();
    }

    public final int read4Bytes(final String name, final String exception)
            throws IOException {
        return BinaryFunctions.read4Bytes(name, is, exception, byteOrder);
    }

    public final void readAndVerifyBytes(final byte expected[], final String exception)
            throws ImageReadException, IOException {
        BinaryFunctions.readAndVerifyBytes(is, expected, exception);
    }

    public final void skipBytes(final long length, final String exception)
            throws IOException {
        BinaryFunctions.skipBytes(is, length, exception);
    }

    public final byte[] readBytes(final String name, final int length, final String exception)
            throws IOException {
        return BinaryFunctions.readBytes(name, is, length, exception);
    }

    public final byte[] readBytes(final int length, final String error)
            throws IOException {
        return BinaryFunctions.readBytes("", is, length, error);
    }
    
    public final int read4Bytes(final String exception) throws IOException {
        return BinaryFunctions.read4Bytes("", is, exception, byteOrder);
    }
    
    public final int read3Bytes(final String name, final String exception) throws IOException {
        return BinaryFunctions.read3Bytes(name, is, exception, byteOrder);
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
}
