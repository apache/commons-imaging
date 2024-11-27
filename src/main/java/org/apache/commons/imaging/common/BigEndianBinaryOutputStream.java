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
import java.io.OutputStream;

final class BigEndianBinaryOutputStream extends BinaryOutputStream {

    private static final int MASK_8_BITS = 0xff;   // Magic number 0xff explained
    private static final int BYTE_SHIFT_8 = 8;    // Magic number 8 explained
    private static final int BYTE_SHIFT_16 = 16;  // Magic number 16 explained
    private static final int BYTE_SHIFT_24 = 24;  // Magic number 24 explained

    BigEndianBinaryOutputStream(final OutputStream os) {
        super(os);
    }

    @Override
    public void write2Bytes(final int value) throws IOException {
        writeByteWithShift(value, BYTE_SHIFT_8);  // Extracted and reused logic
        writeByteWithShift(value, 0);
    }

    @Override
    public void write3Bytes(final int value) throws IOException {
        writeByteWithShift(value, BYTE_SHIFT_16);
        writeByteWithShift(value, BYTE_SHIFT_8);
        writeByteWithShift(value, 0);
    }

    @Override
    public void write4Bytes(final int value) throws IOException {
        writeByteWithShift(value, BYTE_SHIFT_24);
        writeByteWithShift(value, BYTE_SHIFT_16);
        writeByteWithShift(value, BYTE_SHIFT_8);
        writeByteWithShift(value, 0);
    }

    // Extracted method to remove duplication
    private void writeByteWithShift(final int value, final int shift) throws IOException {
        write(MASK_8_BITS & (value >> shift));
    }
}