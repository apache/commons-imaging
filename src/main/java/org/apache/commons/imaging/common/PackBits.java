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

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream;

public class PackBits {

    public byte[] compress(final byte[] bytes) throws IOException {
        // max length 1 extra byte for every 128
        try (UnsynchronizedByteArrayOutputStream baos = new UnsynchronizedByteArrayOutputStream(Allocator.checkByteArray(bytes.length * 2))) {
            int ptr = 0;
            while (ptr < bytes.length) {
                int dup = findNextDuplicate(bytes, ptr);

                if (dup == ptr) {
                    // write run length
                    final int len = findRunLength(bytes, dup);
                    final int actualLen = Math.min(len, 128);
                    baos.write(-(actualLen - 1));
                    baos.write(bytes[ptr]);
                    ptr += actualLen;
                } else {
                    // write literals
                    int len = dup - ptr;

                    if (dup > 0) {
                        final int runlen = findRunLength(bytes, dup);
                        if (runlen < 3) {
                            // may want to discard next run.
                            final int nextptr = ptr + len + runlen;
                            final int nextdup = findNextDuplicate(bytes, nextptr);
                            if (nextdup != nextptr) {
                                // discard 2-byte run
                                dup = nextdup;
                                len = dup - ptr;
                            }
                        }
                    }

                    if (dup < 0) {
                        len = bytes.length - ptr;
                    }
                    final int actualLen = Math.min(len, 128);

                    baos.write(actualLen - 1);
                    for (int i = 0; i < actualLen; i++) {
                        baos.write(bytes[ptr]);
                        ptr++;
                    }
                }
            }
            return baos.toByteArray();
        }
    }

    public byte[] decompress(final byte[] bytes, final int expected)
            throws ImagingException {
        int total = 0;

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // Loop until you get the number of unpacked bytes you are expecting:
        int i = 0;
        while (total < expected) {
            // Read the next source byte into n.
            if (i >= bytes.length) {
                throw new ImagingException(
                        "Tiff: Unpack bits source exhausted: " + i
                                + ", done + " + total + ", expected + "
                                + expected);
            }

            final int n = bytes[i++];
            if ((n >= 0) && (n <= 127)) {
                // If n is between 0 and 127 inclusive, copy the next n+1 bytes
                // literally.
                final int count = n + 1;

                total += count;
                for (int j = 0; j < count; j++) {
                    baos.write(bytes[i++]);
                }
            } else if ((n >= -127) && (n <= -1)) {
                // Else if n is between -127 and -1 inclusive, copy the next byte
                // -n+1 times.

                final int b = bytes[i++];
                final int count = -n + 1;

                total += count;
                for (int j = 0; j < count; j++) {
                    baos.write(b);
                }
            } else if (n == -128) {
                // Else if n is -128, noop.
                throw new ImagingException("Packbits: " + n);
            }
        }

        return baos.toByteArray();

    }

    private int findNextDuplicate(final byte[] bytes, final int start) {
        // int last = -1;
        if (start >= bytes.length) {
            return -1;
        }

        byte prev = bytes[start];

        for (int i = start + 1; i < bytes.length; i++) {
            final byte b = bytes[i];

            if (b == prev) {
                return i - 1;
            }

            prev = b;
        }

        return -1;
    }

    private int findRunLength(final byte[] bytes, final int start) {
        final byte b = bytes[start];

        int i;

        for (i = start + 1; (i < bytes.length) && (bytes[i] == b); i++) {
            // do nothing
        }

        return i - start;
    }
}
