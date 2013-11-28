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
package org.apache.commons.imaging.common.mylzw;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

public class MyBitOutputStream extends OutputStream {
    private final OutputStream os;
    private final ByteOrder byteOrder;
    private int bitsInCache;
    private int bitCache;
    private int bytesWritten;

    public MyBitOutputStream(final OutputStream os, final ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
        this.os = os;
    }

    @Override
    public void write(final int value) throws IOException {
        writeBits(value, 8);
    }

    // TODO: in and out streams CANNOT accurately read/write 32bits at a time,
    // as int will overflow. should have used a long
    public void writeBits(int value, final int sampleBits) throws IOException {
        final int sampleMask = (1 << sampleBits) - 1;
        value &= sampleMask;

        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            // MSB, so add to right
            bitCache = (bitCache << sampleBits) | value;
        } else {
            // LSB, so add to left
            bitCache = bitCache | (value << bitsInCache);
        }
        bitsInCache += sampleBits;

        while (bitsInCache >= 8) {
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                // MSB, so write from left
                final int b = 0xff & (bitCache >> (bitsInCache - 8));
                actualWrite(b);

                bitsInCache -= 8;
            } else {
                // LSB, so write from right
                final int b = 0xff & bitCache;
                actualWrite(b);

                bitCache >>= 8;
                bitsInCache -= 8;
            }
            final int remainderMask = (1 << bitsInCache) - 1; // unneccesary
            bitCache &= remainderMask; // unneccesary
        }

    }

    private void actualWrite(final int value) throws IOException {
        os.write(value);
        bytesWritten++;
    }

    public void flushCache() throws IOException {
        if (bitsInCache > 0) {
            final int bitMask = (1 << bitsInCache) - 1;
            int b = bitMask & bitCache;

            if (byteOrder == ByteOrder.BIG_ENDIAN) { 
                // MSB, so write from left
                b <<= 8 - bitsInCache; // left align fragment.
                os.write(b);
            } else {
                // LSB, so write from right
                os.write(b);
            }
        }

        bitsInCache = 0;
        bitCache = 0;
    }

    public int getBytesWritten() {
        return bytesWritten + ((bitsInCache > 0) ? 1 : 0);
    }

}
