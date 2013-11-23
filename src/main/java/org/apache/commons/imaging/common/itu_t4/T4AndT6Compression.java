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
package org.apache.commons.imaging.common.itu_t4;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.BitArrayOutputStream;
import org.apache.commons.imaging.common.BitInputStreamFlexible;
import org.apache.commons.imaging.common.itu_t4.T4_T6_Tables.Entry;
import org.apache.commons.imaging.util.Debug;
import org.apache.commons.imaging.util.IoUtils;

public final class T4AndT6Compression {
    private static final HuffmanTree whiteRunLengths = new HuffmanTree();
    private static final HuffmanTree blackRunLengths = new HuffmanTree();
    private static final HuffmanTree controlCodes = new HuffmanTree();

    public static final int WHITE = 0;
    public static final int BLACK = 1;

    static {
        try {
            for (final Entry entry : T4_T6_Tables.whiteTerminatingCodes) {
                whiteRunLengths.insert(entry.bitString, entry.value);
            }
            for (final Entry entry : T4_T6_Tables.whiteMakeUpCodes) {
                whiteRunLengths.insert(entry.bitString, entry.value);
            }
            for (final Entry entry : T4_T6_Tables.blackTerminatingCodes) {
                blackRunLengths.insert(entry.bitString, entry.value);
            }
            for (final Entry entry : T4_T6_Tables.blackMakeUpCodes) {
                blackRunLengths.insert(entry.bitString, entry.value);
            }
            for (final Entry entry : T4_T6_Tables.additionalMakeUpCodes) {
                whiteRunLengths.insert(entry.bitString, entry.value);
                blackRunLengths.insert(entry.bitString, entry.value);
            }
            controlCodes.insert(T4_T6_Tables.EOL.bitString, T4_T6_Tables.EOL);
            controlCodes.insert(T4_T6_Tables.EOL13.bitString,
                    T4_T6_Tables.EOL13);
            controlCodes.insert(T4_T6_Tables.EOL14.bitString,
                    T4_T6_Tables.EOL14);
            controlCodes.insert(T4_T6_Tables.EOL15.bitString,
                    T4_T6_Tables.EOL15);
            controlCodes.insert(T4_T6_Tables.EOL16.bitString,
                    T4_T6_Tables.EOL16);
            controlCodes.insert(T4_T6_Tables.EOL17.bitString,
                    T4_T6_Tables.EOL17);
            controlCodes.insert(T4_T6_Tables.EOL18.bitString,
                    T4_T6_Tables.EOL18);
            controlCodes.insert(T4_T6_Tables.EOL19.bitString,
                    T4_T6_Tables.EOL19);
            controlCodes.insert(T4_T6_Tables.P.bitString, T4_T6_Tables.P);
            controlCodes.insert(T4_T6_Tables.H.bitString, T4_T6_Tables.H);
            controlCodes.insert(T4_T6_Tables.V0.bitString, T4_T6_Tables.V0);
            controlCodes.insert(T4_T6_Tables.VL1.bitString, T4_T6_Tables.VL1);
            controlCodes.insert(T4_T6_Tables.VL2.bitString, T4_T6_Tables.VL2);
            controlCodes.insert(T4_T6_Tables.VL3.bitString, T4_T6_Tables.VL3);
            controlCodes.insert(T4_T6_Tables.VR1.bitString, T4_T6_Tables.VR1);
            controlCodes.insert(T4_T6_Tables.VR2.bitString, T4_T6_Tables.VR2);
            controlCodes.insert(T4_T6_Tables.VR3.bitString, T4_T6_Tables.VR3);
        } catch (final HuffmanTreeException cannotHappen) {
            Debug.debug(cannotHappen);
        }
    }

    private T4AndT6Compression() {
    }

    private static void compress1DLine(final BitInputStreamFlexible inputStream,
            final BitArrayOutputStream outputStream, final int[] referenceLine, final int width)
            throws ImageWriteException {
        int color = WHITE;
        int runLength = 0;
        for (int x = 0; x < width; x++) {
            try {
                final int nextColor = inputStream.readBits(1);
                if (referenceLine != null) {
                    referenceLine[x] = nextColor;
                }
                if (color == nextColor) {
                    ++runLength;
                } else {
                    writeRunLength(outputStream, runLength, color);
                    color = nextColor;
                    runLength = 1;
                }
            } catch (final IOException ioException) {
                throw new ImageWriteException(
                        "Error reading image to compress", ioException);
            }
        }
        writeRunLength(outputStream, runLength, color);
    }

    /**
     * Compressed with the "Modified Huffman" encoding of section 10 in the
     * TIFF6 specification. No EOLs, no RTC, rows are padded to end on a byte
     * boundary.
     * 
     * @param uncompressed
     * @param width
     * @param height
     * @return the compressed data
     * @throws ImageWriteException
     */
    public static byte[] compressModifiedHuffman(final byte[] uncompressed,
            final int width, final int height) throws ImageWriteException {
        final BitInputStreamFlexible inputStream = new BitInputStreamFlexible(
                new ByteArrayInputStream(uncompressed));
        final BitArrayOutputStream outputStream = new BitArrayOutputStream();
        for (int y = 0; y < height; y++) {
            compress1DLine(inputStream, outputStream, null, width);
            inputStream.flushCache();
            outputStream.flush();
        }
        return outputStream.toByteArray();
    }

    /**
     * Decompresses the "Modified Huffman" encoding of section 10 in the TIFF6
     * specification. No EOLs, no RTC, rows are padded to end on a byte
     * boundary.
     * 
     * @param compressed
     * @param width
     * @param height
     * @return the decompressed data
     * @throws ImageReadException
     */
    public static byte[] decompressModifiedHuffman(final byte[] compressed,
            final int width, final int height) throws ImageReadException {
        final BitInputStreamFlexible inputStream = new BitInputStreamFlexible(
                new ByteArrayInputStream(compressed));
        BitArrayOutputStream outputStream = null;
        boolean canThrow = false;
        try {
            outputStream = new BitArrayOutputStream();
            for (int y = 0; y < height; y++) {
                int color = WHITE;
                int rowLength;
                for (rowLength = 0; rowLength < width;) {
                    final int runLength = readTotalRunLength(inputStream, color);
                    for (int i = 0; i < runLength; i++) {
                        outputStream.writeBit(color);
                    }
                    color = 1 - color;
                    rowLength += runLength;
                }
    
                if (rowLength == width) {
                    inputStream.flushCache();
                    outputStream.flush();
                } else if (rowLength > width) {
                    throw new ImageReadException(
                            "Unrecoverable row length error in image row " + y);
                }
            }
            final byte[] ret = outputStream.toByteArray();
            canThrow = true;
            return ret;
        } finally {
            try {
                IoUtils.closeQuietly(canThrow, outputStream);
            } catch (final IOException ioException) {
                throw new ImageReadException("I/O error", ioException);
            }
        }
    }

    public static byte[] compressT4_1D(final byte[] uncompressed, final int width,
            final int height, final boolean hasFill) throws ImageWriteException {
        final BitInputStreamFlexible inputStream = new BitInputStreamFlexible(
                new ByteArrayInputStream(uncompressed));
        final BitArrayOutputStream outputStream = new BitArrayOutputStream();
        if (hasFill) {
            T4_T6_Tables.EOL16.writeBits(outputStream);
        } else {
            T4_T6_Tables.EOL.writeBits(outputStream);
        }
        for (int y = 0; y < height; y++) {
            compress1DLine(inputStream, outputStream, null, width);
            if (hasFill) {
                int bitsAvailable = outputStream
                        .getBitsAvailableInCurrentByte();
                if (bitsAvailable < 4) {
                    outputStream.flush();
                    bitsAvailable = 8;
                }
                for (; bitsAvailable > 4; bitsAvailable--) {
                    outputStream.writeBit(0);
                }
            }
            T4_T6_Tables.EOL.writeBits(outputStream);
            inputStream.flushCache();
        }
        return outputStream.toByteArray();
    }

    /**
     * Decompresses T.4 1D encoded data. EOL at the beginning and after each
     * row, can be preceded by fill bits to fit on a byte boundary, no RTC.
     * 
     * @param compressed
     * @param width
     * @param height
     * @return the decompressed data
     * @throws ImageReadException
     */
    public static byte[] decompressT4_1D(final byte[] compressed, final int width,
            final int height, final boolean hasFill) throws ImageReadException {
        final BitInputStreamFlexible inputStream = new BitInputStreamFlexible(
                new ByteArrayInputStream(compressed));
        BitArrayOutputStream outputStream = null;
        boolean canThrow = false;
        try {
            outputStream = new BitArrayOutputStream();
            for (int y = 0; y < height; y++) {
                T4_T6_Tables.Entry entry;
                int rowLength;
                try {
                    entry = (T4_T6_Tables.Entry) controlCodes.decode(inputStream);
                    if (!isEOL(entry, hasFill)) {
                        throw new ImageReadException("Expected EOL not found");
                    }
                    int color = WHITE;
                    for (rowLength = 0; rowLength < width;) {
                        final int runLength = readTotalRunLength(inputStream, color);
                        for (int i = 0; i < runLength; i++) {
                            outputStream.writeBit(color);
                        }
                        color = 1 - color;
                        rowLength += runLength;
                    }
                } catch (final HuffmanTreeException huffmanException) {
                    throw new ImageReadException("Decompression error",
                            huffmanException);
                }
    
                if (rowLength == width) {
                    outputStream.flush();
                } else if (rowLength > width) {
                    throw new ImageReadException(
                            "Unrecoverable row length error in image row " + y);
                }
            }
            final byte[] ret = outputStream.toByteArray();
            canThrow = true;
            return ret;
        } finally {
            try {
                IoUtils.closeQuietly(canThrow, outputStream);
            } catch (final IOException ioException) {
                throw new ImageReadException("I/O error", ioException);
            }
        }
    }

    public static byte[] compressT4_2D(final byte[] uncompressed, final int width,
            final int height, final boolean hasFill, final int parameterK)
            throws ImageWriteException {
        final BitInputStreamFlexible inputStream = new BitInputStreamFlexible(
                new ByteArrayInputStream(uncompressed));
        final BitArrayOutputStream outputStream = new BitArrayOutputStream();
        int[] referenceLine = new int[width];
        int[] codingLine = new int[width];
        int kCounter = 0;
        if (hasFill) {
            T4_T6_Tables.EOL16.writeBits(outputStream);
        } else {
            T4_T6_Tables.EOL.writeBits(outputStream);
        }
        for (int y = 0; y < height; y++) {
            if (kCounter > 0) {
                // 2D
                outputStream.writeBit(0);
                for (int i = 0; i < width; i++) {
                    try {
                        codingLine[i] = inputStream.readBits(1);
                    } catch (final IOException ioException) {
                        throw new ImageWriteException(
                                "Error reading image to compress", ioException);
                    }
                }
                int codingA0Color = WHITE;
                int referenceA0Color = WHITE;
                int a1 = nextChangingElement(codingLine, codingA0Color, 0);
                int b1 = nextChangingElement(referenceLine, referenceA0Color, 0);
                int b2 = nextChangingElement(referenceLine,
                        1 - referenceA0Color, b1 + 1);
                for (int a0 = 0; a0 < width;) {
                    if (b2 < a1) {
                        T4_T6_Tables.P.writeBits(outputStream);
                        a0 = b2;
                    } else {
                        final int a1b1 = a1 - b1;
                        if (-3 <= a1b1 && a1b1 <= 3) {
                            T4_T6_Tables.Entry entry;
                            if (a1b1 == -3) {
                                entry = T4_T6_Tables.VL3;
                            } else if (a1b1 == -2) {
                                entry = T4_T6_Tables.VL2;
                            } else if (a1b1 == -1) {
                                entry = T4_T6_Tables.VL1;
                            } else if (a1b1 == 0) {
                                entry = T4_T6_Tables.V0;
                            } else if (a1b1 == 1) {
                                entry = T4_T6_Tables.VR1;
                            } else if (a1b1 == 2) {
                                entry = T4_T6_Tables.VR2;
                            } else {
                                entry = T4_T6_Tables.VR3;
                            }
                            entry.writeBits(outputStream);
                            codingA0Color = 1 - codingA0Color;
                            a0 = a1;
                        } else {
                            final int a2 = nextChangingElement(codingLine,
                                    1 - codingA0Color, a1 + 1);
                            final int a0a1 = a1 - a0;
                            final int a1a2 = a2 - a1;
                            T4_T6_Tables.H.writeBits(outputStream);
                            writeRunLength(outputStream, a0a1, codingA0Color);
                            writeRunLength(outputStream, a1a2,
                                    1 - codingA0Color);
                            a0 = a2;
                        }
                    }
                    referenceA0Color = changingElementAt(referenceLine, a0);
                    a1 = nextChangingElement(codingLine, codingA0Color, a0 + 1);
                    if (codingA0Color == referenceA0Color) {
                        b1 = nextChangingElement(referenceLine,
                                referenceA0Color, a0 + 1);
                    } else {
                        b1 = nextChangingElement(referenceLine,
                                referenceA0Color, a0 + 1);
                        b1 = nextChangingElement(referenceLine,
                                1 - referenceA0Color, b1 + 1);
                    }
                    b2 = nextChangingElement(referenceLine, 1 - codingA0Color,
                            b1 + 1);
                }
                final int[] swap = referenceLine;
                referenceLine = codingLine;
                codingLine = swap;
            } else {
                // 1D
                outputStream.writeBit(1);
                compress1DLine(inputStream, outputStream, referenceLine, width);
            }
            if (hasFill) {
                int bitsAvailable = outputStream
                        .getBitsAvailableInCurrentByte();
                if (bitsAvailable < 4) {
                    outputStream.flush();
                    bitsAvailable = 8;
                }
                for (; bitsAvailable > 4; bitsAvailable--) {
                    outputStream.writeBit(0);
                }
            }
            T4_T6_Tables.EOL.writeBits(outputStream);
            kCounter++;
            if (kCounter == parameterK) {
                kCounter = 0;
            }
            inputStream.flushCache();
        }
        return outputStream.toByteArray();
    }

    /**
     * Decompressed T.4 2D encoded data. EOL at the beginning and after each
     * row, can be preceded by fill bits to fit on a byte boundary, and is
     * succeeded by a tag bit determining whether the next line is encoded using
     * 1D or 2D. No RTC.
     * 
     * @param compressed
     * @param width
     * @param height
     * @return the decompressed data
     * @throws ImageReadException
     */
    public static byte[] decompressT4_2D(final byte[] compressed, final int width,
            final int height, final boolean hasFill) throws ImageReadException {
        final BitInputStreamFlexible inputStream = new BitInputStreamFlexible(
                new ByteArrayInputStream(compressed));
        final BitArrayOutputStream outputStream = new BitArrayOutputStream();
        final int[] referenceLine = new int[width];
        for (int y = 0; y < height; y++) {
            T4_T6_Tables.Entry entry;
            int rowLength = 0;
            try {
                entry = (T4_T6_Tables.Entry) controlCodes.decode(inputStream);
                if (!isEOL(entry, hasFill)) {
                    throw new ImageReadException("Expected EOL not found");
                }
                final int tagBit = inputStream.readBits(1);
                if (tagBit == 0) {
                    // 2D
                    int codingA0Color = WHITE;
                    int referenceA0Color = WHITE;
                    int b1 = nextChangingElement(referenceLine,
                            referenceA0Color, 0);
                    int b2 = nextChangingElement(referenceLine,
                            1 - referenceA0Color, b1 + 1);
                    for (int a0 = 0; a0 < width;) {
                        int a1, a2;
                        entry = (T4_T6_Tables.Entry) controlCodes
                                .decode(inputStream);
                        if (entry == T4_T6_Tables.P) {
                            fillRange(outputStream, referenceLine, a0, b2,
                                    codingA0Color);
                            a0 = b2;
                        } else if (entry == T4_T6_Tables.H) {
                            final int a0a1 = readTotalRunLength(inputStream,
                                    codingA0Color);
                            a1 = a0 + a0a1;
                            fillRange(outputStream, referenceLine, a0, a1,
                                    codingA0Color);
                            final int a1a2 = readTotalRunLength(inputStream,
                                    1 - codingA0Color);
                            a2 = a1 + a1a2;
                            fillRange(outputStream, referenceLine, a1, a2,
                                    1 - codingA0Color);
                            a0 = a2;
                        } else {
                            int a1b1;
                            if (entry == T4_T6_Tables.V0) {
                                a1b1 = 0;
                            } else if (entry == T4_T6_Tables.VL1) {
                                a1b1 = -1;
                            } else if (entry == T4_T6_Tables.VL2) {
                                a1b1 = -2;
                            } else if (entry == T4_T6_Tables.VL3) {
                                a1b1 = -3;
                            } else if (entry == T4_T6_Tables.VR1) {
                                a1b1 = 1;
                            } else if (entry == T4_T6_Tables.VR2) {
                                a1b1 = 2;
                            } else if (entry == T4_T6_Tables.VR3) {
                                a1b1 = 3;
                            } else {
                                throw new ImageReadException(
                                        "Invalid/unknown T.4 control code "
                                                + entry.bitString);
                            }
                            a1 = b1 + a1b1;
                            fillRange(outputStream, referenceLine, a0, a1,
                                    codingA0Color);
                            a0 = a1;
                            codingA0Color = 1 - codingA0Color;
                        }
                        referenceA0Color = changingElementAt(referenceLine, a0);
                        if (codingA0Color == referenceA0Color) {
                            b1 = nextChangingElement(referenceLine,
                                    referenceA0Color, a0 + 1);
                        } else {
                            b1 = nextChangingElement(referenceLine,
                                    referenceA0Color, a0 + 1);
                            b1 = nextChangingElement(referenceLine,
                                    1 - referenceA0Color, b1 + 1);
                        }
                        b2 = nextChangingElement(referenceLine,
                                1 - codingA0Color, b1 + 1);
                        rowLength = a0;
                    }
                } else {
                    // 1D
                    int color = WHITE;
                    for (rowLength = 0; rowLength < width;) {
                        final int runLength = readTotalRunLength(inputStream, color);
                        for (int i = 0; i < runLength; i++) {
                            outputStream.writeBit(color);
                            referenceLine[rowLength + i] = color;
                        }
                        color = 1 - color;
                        rowLength += runLength;
                    }
                }
            } catch (final IOException ioException) {
                throw new ImageReadException("Decompression error", ioException);
            } catch (final HuffmanTreeException huffmanException) {
                throw new ImageReadException("Decompression error",
                        huffmanException);
            }

            if (rowLength == width) {
                outputStream.flush();
            } else if (rowLength > width) {
                throw new ImageReadException(
                        "Unrecoverable row length error in image row " + y);
            }
        }
        return outputStream.toByteArray();
    }

    public static byte[] compressT6(final byte[] uncompressed, final int width, final int height)
            throws ImageWriteException {
        BitInputStreamFlexible inputStream = null;
        boolean canThrow = false;
        try {
            inputStream = new BitInputStreamFlexible(
                    new ByteArrayInputStream(uncompressed));
            final BitArrayOutputStream outputStream = new BitArrayOutputStream();
            int[] referenceLine = new int[width];
            int[] codingLine = new int[width];
            for (int y = 0; y < height; y++) {
                for (int i = 0; i < width; i++) {
                    try {
                        codingLine[i] = inputStream.readBits(1);
                    } catch (final IOException ioException) {
                        throw new ImageWriteException(
                                "Error reading image to compress", ioException);
                    }
                }
                int codingA0Color = WHITE;
                int referenceA0Color = WHITE;
                int a1 = nextChangingElement(codingLine, codingA0Color, 0);
                int b1 = nextChangingElement(referenceLine, referenceA0Color, 0);
                int b2 = nextChangingElement(referenceLine, 1 - referenceA0Color,
                        b1 + 1);
                for (int a0 = 0; a0 < width;) {
                    if (b2 < a1) {
                        T4_T6_Tables.P.writeBits(outputStream);
                        a0 = b2;
                    } else {
                        final int a1b1 = a1 - b1;
                        if (-3 <= a1b1 && a1b1 <= 3) {
                            T4_T6_Tables.Entry entry;
                            if (a1b1 == -3) {
                                entry = T4_T6_Tables.VL3;
                            } else if (a1b1 == -2) {
                                entry = T4_T6_Tables.VL2;
                            } else if (a1b1 == -1) {
                                entry = T4_T6_Tables.VL1;
                            } else if (a1b1 == 0) {
                                entry = T4_T6_Tables.V0;
                            } else if (a1b1 == 1) {
                                entry = T4_T6_Tables.VR1;
                            } else if (a1b1 == 2) {
                                entry = T4_T6_Tables.VR2;
                            } else {
                                entry = T4_T6_Tables.VR3;
                            }
                            entry.writeBits(outputStream);
                            codingA0Color = 1 - codingA0Color;
                            a0 = a1;
                        } else {
                            final int a2 = nextChangingElement(codingLine,
                                    1 - codingA0Color, a1 + 1);
                            final int a0a1 = a1 - a0;
                            final int a1a2 = a2 - a1;
                            T4_T6_Tables.H.writeBits(outputStream);
                            writeRunLength(outputStream, a0a1, codingA0Color);
                            writeRunLength(outputStream, a1a2, 1 - codingA0Color);
                            a0 = a2;
                        }
                    }
                    referenceA0Color = changingElementAt(referenceLine, a0);
                    a1 = nextChangingElement(codingLine, codingA0Color, a0 + 1);
                    if (codingA0Color == referenceA0Color) {
                        b1 = nextChangingElement(referenceLine, referenceA0Color,
                                a0 + 1);
                    } else {
                        b1 = nextChangingElement(referenceLine, referenceA0Color,
                                a0 + 1);
                        b1 = nextChangingElement(referenceLine,
                                1 - referenceA0Color, b1 + 1);
                    }
                    b2 = nextChangingElement(referenceLine, 1 - codingA0Color,
                            b1 + 1);
                }
                final int[] swap = referenceLine;
                referenceLine = codingLine;
                codingLine = swap;
                inputStream.flushCache();
            }
            // EOFB
            T4_T6_Tables.EOL.writeBits(outputStream);
            T4_T6_Tables.EOL.writeBits(outputStream);
            final byte[] ret = outputStream.toByteArray();
            canThrow = true;
            return ret;
        } finally {
            try {
                IoUtils.closeQuietly(canThrow, inputStream);
            } catch (final IOException ioException) {
                throw new ImageWriteException("I/O error", ioException);
            }
        }
    }

    /**
     * Decompress T.6 encoded data. No EOLs, except for 2 consecutive ones at
     * the end (the EOFB, end of fax block). No RTC. No fill bits anywhere. All
     * data is 2D encoded.
     * 
     * @param compressed
     * @param width
     * @param height
     * @return the decompressed data
     * @throws ImageReadException
     */
    public static byte[] decompressT6(final byte[] compressed, final int width, final int height)
            throws ImageReadException {
        final BitInputStreamFlexible inputStream = new BitInputStreamFlexible(
                new ByteArrayInputStream(compressed));
        final BitArrayOutputStream outputStream = new BitArrayOutputStream();
        final int[] referenceLine = new int[width];
        for (int y = 0; y < height; y++) {
            T4_T6_Tables.Entry entry;
            int rowLength = 0;
            try {
                int codingA0Color = WHITE;
                int referenceA0Color = WHITE;
                int b1 = nextChangingElement(referenceLine, referenceA0Color, 0);
                int b2 = nextChangingElement(referenceLine,
                        1 - referenceA0Color, b1 + 1);
                for (int a0 = 0; a0 < width;) {
                    int a1, a2;
                    entry = (T4_T6_Tables.Entry) controlCodes
                            .decode(inputStream);
                    if (entry == T4_T6_Tables.P) {
                        fillRange(outputStream, referenceLine, a0, b2,
                                codingA0Color);
                        a0 = b2;
                    } else if (entry == T4_T6_Tables.H) {
                        final int a0a1 = readTotalRunLength(inputStream,
                                codingA0Color);
                        a1 = a0 + a0a1;
                        fillRange(outputStream, referenceLine, a0, a1,
                                codingA0Color);
                        final int a1a2 = readTotalRunLength(inputStream,
                                1 - codingA0Color);
                        a2 = a1 + a1a2;
                        fillRange(outputStream, referenceLine, a1, a2,
                                1 - codingA0Color);
                        a0 = a2;
                    } else {
                        int a1b1;
                        if (entry == T4_T6_Tables.V0) {
                            a1b1 = 0;
                        } else if (entry == T4_T6_Tables.VL1) {
                            a1b1 = -1;
                        } else if (entry == T4_T6_Tables.VL2) {
                            a1b1 = -2;
                        } else if (entry == T4_T6_Tables.VL3) {
                            a1b1 = -3;
                        } else if (entry == T4_T6_Tables.VR1) {
                            a1b1 = 1;
                        } else if (entry == T4_T6_Tables.VR2) {
                            a1b1 = 2;
                        } else if (entry == T4_T6_Tables.VR3) {
                            a1b1 = 3;
                        } else {
                            throw new ImageReadException(
                                    "Invalid/unknown T.6 control code "
                                            + entry.bitString);
                        }
                        a1 = b1 + a1b1;
                        fillRange(outputStream, referenceLine, a0, a1,
                                codingA0Color);
                        a0 = a1;
                        codingA0Color = 1 - codingA0Color;
                    }
                    referenceA0Color = changingElementAt(referenceLine, a0);
                    if (codingA0Color == referenceA0Color) {
                        b1 = nextChangingElement(referenceLine,
                                referenceA0Color, a0 + 1);
                    } else {
                        b1 = nextChangingElement(referenceLine,
                                referenceA0Color, a0 + 1);
                        b1 = nextChangingElement(referenceLine,
                                1 - referenceA0Color, b1 + 1);
                    }
                    b2 = nextChangingElement(referenceLine, 1 - codingA0Color,
                            b1 + 1);
                    rowLength = a0;
                }
            } catch (final HuffmanTreeException huffmanException) {
                throw new ImageReadException("Decompression error",
                        huffmanException);
            }

            if (rowLength == width) {
                outputStream.flush();
            } else if (rowLength > width) {
                throw new ImageReadException(
                        "Unrecoverable row length error in image row " + y);
            }
        }
        return outputStream.toByteArray();
    }

    private static boolean isEOL(final T4_T6_Tables.Entry entry, final boolean hasFill) {
        if (entry == T4_T6_Tables.EOL) {
            return true;
        }
        if (hasFill) {
            return entry == T4_T6_Tables.EOL13 || entry == T4_T6_Tables.EOL14
                    || entry == T4_T6_Tables.EOL15
                    || entry == T4_T6_Tables.EOL16
                    || entry == T4_T6_Tables.EOL17
                    || entry == T4_T6_Tables.EOL18
                    || entry == T4_T6_Tables.EOL19;
        }
        return false;
    }

    private static void writeRunLength(final BitArrayOutputStream bitStream,
            int runLength, final int color) {
        final T4_T6_Tables.Entry[] makeUpCodes;
        final T4_T6_Tables.Entry[] terminatingCodes;
        if (color == WHITE) {
            makeUpCodes = T4_T6_Tables.whiteMakeUpCodes;
            terminatingCodes = T4_T6_Tables.whiteTerminatingCodes;
        } else {
            makeUpCodes = T4_T6_Tables.blackMakeUpCodes;
            terminatingCodes = T4_T6_Tables.blackTerminatingCodes;
        }
        while (runLength >= 1792) {
            final T4_T6_Tables.Entry entry = lowerBound(
                    T4_T6_Tables.additionalMakeUpCodes, runLength);
            entry.writeBits(bitStream);
            runLength -= entry.value;
        }
        while (runLength >= 64) {
            final T4_T6_Tables.Entry entry = lowerBound(makeUpCodes, runLength);
            entry.writeBits(bitStream);
            runLength -= entry.value;
        }
        final T4_T6_Tables.Entry terminatingEntry = terminatingCodes[runLength];
        terminatingEntry.writeBits(bitStream);
    }

    private static T4_T6_Tables.Entry lowerBound(final T4_T6_Tables.Entry[] entries,
            final int value) {
        int first = 0;
        int last = entries.length - 1;
        do {
            final int middle = (first + last) >>> 1;
            if (entries[middle].value <= value
                    && ((middle + 1) >= entries.length || value < entries[middle + 1].value)) {
                return entries[middle];
            } else if (entries[middle].value > value) {
                last = middle - 1;
            } else {
                first = middle + 1;
            }
        } while (first < last);
        return entries[first];
    }

    private static int readTotalRunLength(final BitInputStreamFlexible bitStream,
            final int color) throws ImageReadException {
        try {
            int totalLength = 0;
            Integer runLength;
            do {
                if (color == WHITE) {
                    runLength = (Integer) whiteRunLengths.decode(bitStream);
                } else {
                    runLength = (Integer) blackRunLengths.decode(bitStream);
                }
                totalLength += runLength;
            } while (runLength > 63);
            return totalLength;
        } catch (final HuffmanTreeException huffmanException) {
            throw new ImageReadException("Decompression error",
                    huffmanException);
        }
    }

    private static int changingElementAt(final int[] line, final int position) {
        if (position < 0 || position >= line.length) {
            return WHITE;
        }
        return line[position];
    }

    private static int nextChangingElement(final int[] line, final int currentColour,
            final int start) {
        int position;
        for (position = start; position < line.length
                && line[position] == currentColour; position++) {
            // noop
        }
        return position < line.length ? position : line.length;
    }

    private static void fillRange(final BitArrayOutputStream outputStream,
            final int[] referenceRow, final int a0, final int end, final int color) {
        for (int i = a0; i < end; i++) {
            referenceRow[i] = color;
            outputStream.writeBit(color);
        }
    }
}
