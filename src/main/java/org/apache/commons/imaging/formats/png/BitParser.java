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
package org.apache.commons.imaging.formats.png;

import org.apache.commons.imaging.ImageReadException;

class BitParser {
    private final byte[] bytes;
    private final int bitsPerPixel;
    private final int bitDepth;

    public BitParser(final byte[] bytes, final int bitsPerPixel, final int bitDepth) {
        this.bytes = bytes; // TODO clone?
        this.bitsPerPixel = bitsPerPixel;
        this.bitDepth = bitDepth;
    }

    public int getSample(final int pixelIndexInScanline, final int sampleIndex)
            throws ImageReadException {
        final int pixelIndexBits = bitsPerPixel * pixelIndexInScanline;
        final int sampleIndexBits = pixelIndexBits + (sampleIndex * bitDepth);
        final int sampleIndexBytes = sampleIndexBits >> 3;

        if (bitDepth == 8) {
            return 0xff & bytes[sampleIndexBytes];
        } else if (bitDepth < 8) {
            int b = 0xff & bytes[sampleIndexBytes];
            final int bitsToShift = 8 - ((pixelIndexBits & 7) + bitDepth);
            b >>= bitsToShift;

            final int bitmask = (1 << bitDepth) - 1;
            return b & bitmask;
        } else if (bitDepth == 16) {
            return (((0xff & bytes[sampleIndexBytes]) << 8) | (0xff & bytes[sampleIndexBytes + 1]));
        }

        throw new ImageReadException("PNG: bad BitDepth: " + bitDepth);
    }

    public int getSampleAsByte(final int pixelIndexInScanline, final int sampleIndex)
            throws ImageReadException {
        int sample = getSample(pixelIndexInScanline, sampleIndex);

        final int rot = 8 - bitDepth;
        if (rot > 0) {
            sample = sample * 255 / ((1 << bitDepth) - 1);
        } else if (rot < 0) {
            sample >>= -rot;
        }

        return 0xff & sample;
    }
}
