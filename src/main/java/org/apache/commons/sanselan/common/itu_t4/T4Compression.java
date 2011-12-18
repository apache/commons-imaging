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
package org.apache.commons.sanselan.common.itu_t4;

import java.io.ByteArrayInputStream;

import org.apache.commons.sanselan.ImageReadException;
import org.apache.commons.sanselan.common.BitArrayOutputStream;
import org.apache.commons.sanselan.common.BitInputStreamFlexible;


public class T4Compression {
    private static final HuffmanTree whiteRunLengths = new HuffmanTree();
    private static final HuffmanTree blackRunLengths = new HuffmanTree();
    
    static {
        try {
            for (int i = 0; i < T4_T6_Tables.whiteTerminatingCodes.length; i++) {
                T4_T6_Tables.Entry entry = T4_T6_Tables.whiteTerminatingCodes[i];
                whiteRunLengths.insert(entry.bitString, entry.value);
            }
            for (int i = 0; i < T4_T6_Tables.whiteMakeUpCodes.length; i++) {
                T4_T6_Tables.Entry entry = T4_T6_Tables.whiteMakeUpCodes[i];
                whiteRunLengths.insert(entry.bitString, entry.value);
            }
            for (int i = 0; i < T4_T6_Tables.blackTerminatingCodes.length; i++) {
                T4_T6_Tables.Entry entry = T4_T6_Tables.blackTerminatingCodes[i];
                blackRunLengths.insert(entry.bitString, entry.value);
            }
            for (int i = 0; i < T4_T6_Tables.blackMakeUpCodes.length; i++) {
                T4_T6_Tables.Entry entry = T4_T6_Tables.blackMakeUpCodes[i];
                blackRunLengths.insert(entry.bitString, entry.value);
            }
            for (int i = 0; i < T4_T6_Tables.additionalMakeUpCodes.length; i++) {
                T4_T6_Tables.Entry entry = T4_T6_Tables.additionalMakeUpCodes[i];
                whiteRunLengths.insert(entry.bitString, entry.value);
                blackRunLengths.insert(entry.bitString, entry.value);
            }
        } catch (HuffmanTreeException cannotHappen) {
        }
    }
    
    public static byte[] decompress1D(byte[] compressed, int width, int height) throws ImageReadException {
        BitInputStreamFlexible inputStream = new BitInputStreamFlexible(
                new ByteArrayInputStream(compressed));
        BitArrayOutputStream outputStream = new BitArrayOutputStream();
        for (int y = 0; y < height; y++) {
            int totalRunLength = 0;
            boolean isWhite = true;
            boolean isTerminated = false;
            int rowLength;
            for (rowLength = 0; rowLength < width || !isTerminated;) {
                Integer runLength;
                int color;
                try {
                    if (isWhite) {
                        runLength = (Integer)whiteRunLengths.decode(inputStream);
                        color = 0x00;
                    } else {
                        runLength = (Integer)blackRunLengths.decode(inputStream);
                        color = 0x01;
                    }
                } catch (HuffmanTreeException huffmanException) {
                    throw new ImageReadException("Decompression error", huffmanException);
                }

                totalRunLength += runLength.intValue();
                rowLength += runLength.intValue();
                if (runLength.intValue() <= 63) {
                    for (int i = 0; i < totalRunLength; i++) {
                        outputStream.writeBit(color);
                    }
                    totalRunLength = 0;
                    isWhite = !isWhite;
                    isTerminated = true;
                } else {
                    isTerminated = false;
                }
            }
            
            if (rowLength == width) {
                inputStream.flushCache();
                outputStream.flush();
            } else if (rowLength > width) {
                throw new ImageReadException("Unrecoverable row length error in image row " + y);
            }
        }
        return outputStream.toByteArray();
    }
}
