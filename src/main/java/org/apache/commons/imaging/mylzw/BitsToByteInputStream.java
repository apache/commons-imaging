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

import org.apache.commons.imaging.common.Allocator;

/**
 * Input stream that converts bit-based input to byte-based output with depth adjustment.
 */
public class BitsToByteInputStream extends FilterInputStream {
    private final int desiredDepth;

    /**
     * Constructs a new BitsToByteInputStream.
     *
     * @param is the MyBitInputStream to read from.
     * @param desiredDepth the desired bit depth.
     */
    public BitsToByteInputStream(final MyBitInputStream is, final int desiredDepth) {
        super(is);
        this.desiredDepth = desiredDepth;
    }

    @Override
    public int read() throws IOException {
        return readBits(8);
    }

    /**
     * Reads the specified number of bits and adjusts to the desired depth.
     *
     * @param bitCount the number of bits to read.
     * @return the adjusted value.
     * @throws IOException if an I/O error occurs.
     */
    public int readBits(final int bitCount) throws IOException {
        int i = ((MyBitInputStream) in).readBits(bitCount);
        if (bitCount < desiredDepth) {
            i <<= desiredDepth - bitCount;
        } else if (bitCount > desiredDepth) {
            i >>= bitCount - desiredDepth;
        }

        return i;
    }

    /**
     * Reads an array of bit values.
     *
     * @param sampleBits the number of bits per sample.
     * @param length the number of samples to read.
     * @return the array of values.
     * @throws IOException if an I/O error occurs.
     */
    public int[] readBitsArray(final int sampleBits, final int length) throws IOException {
        final int[] result = Allocator.intArray(length);
        for (int i = 0; i < length; i++) {
            result[i] = readBits(sampleBits);
        }
        return result;
    }
}
