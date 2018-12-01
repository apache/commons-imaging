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
package org.apache.commons.imaging.formats.png.parser;

import org.apache.commons.imaging.ImageReadException;

// BitParser renamed to PixelParser

/**
 * {@code PixelParser} object can parse PNG image data and extract
 * individual pixel samples.
 * 
 * A pixel parser works on a scan-line and can be used to get each
 * pixel sample in it, based on the bits-per-pixel and bit-depth
 * fields.
 * 
 * @author Shukant Pal
 */
class PixelParser {
    
    private byte[] scanLine;
    private final int bitsPerPixel;
    private final int bitDepth;

    /**
     * Constructs a {@code PixelParser} object for the given scan-line
     * containing pixels of given sample bit-depth and bit-size.
     * 
     * @param bytes - scan-line data containing pixels
     * @param bitsPerPixel - no. of bits each pixel occupies
     * @param bitDepth - no. of bits each pixel sample occupies
     */
    PixelParser(final byte[] bytes, final int bitsPerPixel, final int bitDepth) {
        this.scanLine = bytes; // TODO clone?
        this.bitsPerPixel = bitsPerPixel;
        this.bitDepth = bitDepth;
    }
    
    /**
     * Returns the scan-line on which this parser is set to work
     * on.
     * 
     * @return 
     */
    public byte[] getScanline() {
        return scanLine;
    }
    
    /**
     * Sets the scan-line on which this parser should work on; used
     * to increment the scan-line.
     * 
     * @param scanLine 
     */
    public void setScanline(byte[] scanLine) {
        this.scanLine = scanLine;
    }

    /**
     * Extracts the required pixel sample from the scan-line and
     * returns its exact value.
     * 
     * @param pixelIndexInScanline
     * @param sampleIndex
     * @return
     * @throws ImageReadException 
     */
    public int getSample(final int pixelIndexInScanline, final int sampleIndex)
            throws ImageReadException {
        final int pixelIndexBits = bitsPerPixel * pixelIndexInScanline;
        final int sampleIndexBits = pixelIndexBits + (sampleIndex * bitDepth);
        final int sampleIndexBytes = sampleIndexBits >> 3;

        if (bitDepth == 8) {
            return 0xff & scanLine[sampleIndexBytes];
        } else if (bitDepth < 8) {
            int b = 0xff & scanLine[sampleIndexBytes];
            final int bitsToShift = 8 - ((pixelIndexBits & 7) + bitDepth);
            b >>= bitsToShift;

            final int bitmask = (1 << bitDepth) - 1;
            return b & bitmask;
        } else if (bitDepth == 16) {
            return (((0xff & scanLine[sampleIndexBytes]) << 8) | (0xff & scanLine[sampleIndexBytes + 1]));
        }

        throw new ImageReadException("PNG: bad BitDepth: " + bitDepth);
    }

    /**
     * Returns the value of {@code getSample} scaled to the 8-bit
     * sample size.
     * 
     * @param pixelIndexInScanline
     * @param sampleIndex
     * @return
     * @throws ImageReadException 
     */
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
