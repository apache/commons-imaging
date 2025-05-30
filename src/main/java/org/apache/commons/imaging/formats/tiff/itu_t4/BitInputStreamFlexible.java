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
package org.apache.commons.imaging.formats.tiff.itu_t4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.imaging.ImagingException;

/**
 * Input stream that allows reading up to 32 bits across byte boundaries in most significant bit first order.
 */
final class BitInputStreamFlexible extends FilterInputStream {
    // TODO should be byte order conscious, that is, TIFF for reading
    // samples size < 8 - shouldn't that effect their order within byte?

    private int cache;
    private int cacheBitsRemaining;
    private long bytesRead;

    BitInputStreamFlexible(final InputStream is) {
        super(is);
    }

    public void flushCache() {
        cacheBitsRemaining = 0;
    }

    public long getBytesRead() {
        return bytesRead;
    }

    @Override
    public int read() throws IOException {
        if (cacheBitsRemaining > 0) {
            throw new ImagingException("BitInputStream: incomplete bit read");
        }
        return in.read();
    }

    public int readBits(int count) throws IOException {

        if (count <= 32) {
            // catch-all
            int result = 0;
            // int done = 0;

            if (cacheBitsRemaining > 0) {
                if (count >= cacheBitsRemaining) {
                    result = (1 << cacheBitsRemaining) - 1 & cache;
                    count -= cacheBitsRemaining;
                    cacheBitsRemaining = 0;
                } else {
                    // cache >>= count;
                    cacheBitsRemaining -= count;
                    result = (1 << count) - 1 & cache >> cacheBitsRemaining;
                    count = 0;
                }
            }
            while (count >= 8) {
                cache = in.read();
                if (cache < 0) {
                    throw new ImagingException("Couldn't read bits");
                }
                // System.out.println("cache 1: " + cache + " ("
                // + Integer.toHexString(cache) + ", "
                // + Integer.toBinaryString(cache) + ")");
                bytesRead++;
                result = result << 8 | 0xff & cache;
                count -= 8;
            }
            if (count > 0) {
                cache = in.read();
                if (cache < 0) {
                    throw new ImagingException("Couldn't read bits");
                }
                // System.out.println("cache 2: " + cache + " ("
                // + Integer.toHexString(cache) + ", "
                // + Integer.toBinaryString(cache) + ")");
                bytesRead++;
                cacheBitsRemaining = 8 - count;
                result = result << count | (1 << count) - 1 & cache >> cacheBitsRemaining;
                count = 0;
            }

            return result;
        }

        throw new ImagingException("BitInputStream: unknown error");

    }
}
