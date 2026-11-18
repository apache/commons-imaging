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
package org.apache.commons.imaging.formats.tiff.datareaders;

import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

import org.apache.commons.imaging.ImagingException;

/**
 * Input stream reading 1-8, 16, 24 or 32 bits, starting from the most significant bit, but incapable of reading non-aligned and < 8 bit fields across byte
 * boundaries.
 */
final class BitInputStream extends FilterInputStream {
    private final ByteOrder byteOrder;
    private int cache;
    private int cacheBitsRemaining;
    private long bytesRead;

    BitInputStream(final InputStream is, final ByteOrder byteOrder) {
        super(is);
        this.byteOrder = byteOrder;
    }

    public void flushCache() {
        cacheBitsRemaining = 0;
    }

    public long getBytesRead() {
        return bytesRead;
    }

    /**
     * Reads the next byte of the underlying stream for a bit field.
     *
     * @return the byte, from 0 to 255.
     * @throws IOException if an I/O error occurs, or {@link EOFException} at the end of the stream.
     */
    private int readByte() throws IOException {
        final int b = in.read();
        if (b < 0) {
            throw new EOFException("BitInputStream: unexpected end of the image data");
        }
        return b;
    }

    @Override
    public int read() throws IOException {
        if (cacheBitsRemaining > 0) {
            throw new ImagingException("BitInputStream: incomplete bit read");
        }
        return in.read();
    }

    public int readBits(final int count) throws IOException {
        if (count < 8) {
            if (cacheBitsRemaining == 0) {
                // fill cache
                cache = readByte();
                cacheBitsRemaining = 8;
                bytesRead++;
            }
            if (count > cacheBitsRemaining) {
                throw new ImagingException("BitInputStream: can't read bit fields across bytes");
            }

            // int bits_to_shift = cache_bits_remaining - count;
            cacheBitsRemaining -= count;
            final int bits = cache >> cacheBitsRemaining;

            switch (count) {
            case 1:
                return bits & 1;
            case 2:
                return bits & 3;
            case 3:
                return bits & 7;
            case 4:
                return bits & 15;
            case 5:
                return bits & 31;
            case 6:
                return bits & 63;
            case 7:
                return bits & 127;
            }

        }
        if (cacheBitsRemaining > 0) {
            throw new ImagingException("BitInputStream: incomplete bit read");
        }

        if (count == 8) {
            bytesRead++;
            return readByte();
        }

        /**
         * Taking default order of the TIFF to be Little Endian and reversing the bytes in the end if its Big Endian.This is done because majority (may be all)
         * of the files will be of Little Endian.
         */
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            switch (count) {
            case 16:
                bytesRead += 2;
                return readByte() << 8 | readByte() << 0;
            case 24:
                bytesRead += 3;
                return readByte() << 16 | readByte() << 8 | readByte() << 0;
            case 32:
                bytesRead += 4;
                return readByte() << 24 | readByte() << 16 | readByte() << 8 | readByte() << 0;
            default:
                break;
            }
        } else {
            switch (count) {
            case 16:
                bytesRead += 2;
                return readByte() << 0 | readByte() << 8;
            case 24:
                bytesRead += 3;
                return readByte() << 0 | readByte() << 8 | readByte() << 16;
            case 32:
                bytesRead += 4;
                return readByte() << 0 | readByte() << 8 | readByte() << 16 | readByte() << 24;
            default:
                break;
            }
        }

        throw new ImagingException("BitInputStream: unknown error");
    }
}
