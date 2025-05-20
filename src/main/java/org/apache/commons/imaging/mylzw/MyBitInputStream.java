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
package org.apache.commons.imaging.mylzw;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

public class MyBitInputStream extends FilterInputStream {
    private final ByteOrder byteOrder;
    private final boolean tiffLZWMode;
    private long bytesRead;
    private int bitsInCache;
    private int bitCache;

    public MyBitInputStream(final InputStream is, final ByteOrder byteOrder, final boolean tiffLZWMode) {
        super(is);
        this.byteOrder = byteOrder;
        this.tiffLZWMode = tiffLZWMode;
    }

    public void flushCache() {
        bitsInCache = 0;
        bitCache = 0;
    }

    public long getBytesRead() {
        return bytesRead;
    }

    @Override
    public int read() throws IOException {
        return readBits(8);
    }

    public int readBits(final int sampleBits) throws IOException {
        while (bitsInCache < sampleBits) {
            final int next = in.read();

            if (next < 0) {
                if (tiffLZWMode) {
                    // pernicious special case!
                    return 257;
                }
                return -1;
            }

            final int newByte = 0xff & next;

            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                bitCache = bitCache << 8 | newByte;
            } else {
                bitCache = newByte << bitsInCache | bitCache;
            }

            bytesRead++;
            bitsInCache += 8;
        }
        final int sampleMask = (1 << sampleBits) - 1;

        final int sample;

        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            sample = sampleMask & bitCache >> bitsInCache - sampleBits;
        } else {
            sample = sampleMask & bitCache;
            bitCache >>= sampleBits;
        }

        final int result = sample;

        bitsInCache -= sampleBits;
        final int remainderMask = (1 << bitsInCache) - 1;
        bitCache &= remainderMask;

        return result;
    }

}
