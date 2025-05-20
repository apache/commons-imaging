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

final class T4_T6_Tables {
    public static class Entry {
        final String bitString;
        final Integer value;

        Entry(final String bitString, final int value) {
            this.bitString = bitString;
            this.value = value;
        }

        public void writeBits(final BitArrayOutputStream outputStream) {
            for (int i = 0; i < bitString.length(); i++) {
                outputStream.writeBit(bitString.charAt(i) == '0' ? 0 : 1);
            }
        }
    }

    public static final Entry[] WHITE_TERMINATING_CODES = { new Entry("00110101", 0), new Entry("000111", 1), new Entry("0111", 2), new Entry("1000", 3),
            new Entry("1011", 4), new Entry("1100", 5), new Entry("1110", 6), new Entry("1111", 7), new Entry("10011", 8), new Entry("10100", 9),
            new Entry("00111", 10), new Entry("01000", 11), new Entry("001000", 12), new Entry("000011", 13), new Entry("110100", 14), new Entry("110101", 15),
            new Entry("101010", 16), new Entry("101011", 17), new Entry("0100111", 18), new Entry("0001100", 19), new Entry("0001000", 20),
            new Entry("0010111", 21), new Entry("0000011", 22), new Entry("0000100", 23), new Entry("0101000", 24), new Entry("0101011", 25),
            new Entry("0010011", 26), new Entry("0100100", 27), new Entry("0011000", 28), new Entry("00000010", 29), new Entry("00000011", 30),
            new Entry("00011010", 31), new Entry("00011011", 32), new Entry("00010010", 33), new Entry("00010011", 34), new Entry("00010100", 35),
            new Entry("00010101", 36), new Entry("00010110", 37), new Entry("00010111", 38), new Entry("00101000", 39), new Entry("00101001", 40),
            new Entry("00101010", 41), new Entry("00101011", 42), new Entry("00101100", 43), new Entry("00101101", 44), new Entry("00000100", 45),
            new Entry("00000101", 46), new Entry("00001010", 47), new Entry("00001011", 48), new Entry("01010010", 49), new Entry("01010011", 50),
            new Entry("01010100", 51), new Entry("01010101", 52), new Entry("00100100", 53), new Entry("00100101", 54), new Entry("01011000", 55),
            new Entry("01011001", 56), new Entry("01011010", 57), new Entry("01011011", 58), new Entry("01001010", 59), new Entry("01001011", 60),
            new Entry("00110010", 61), new Entry("00110011", 62), new Entry("00110100", 63), };

    public static final Entry[] BLACK_TERMINATING_CODES = { new Entry("0000110111", 0), new Entry("010", 1), new Entry("11", 2), new Entry("10", 3),
            new Entry("011", 4), new Entry("0011", 5), new Entry("0010", 6), new Entry("00011", 7), new Entry("000101", 8), new Entry("000100", 9),
            new Entry("0000100", 10), new Entry("0000101", 11), new Entry("0000111", 12), new Entry("00000100", 13), new Entry("00000111", 14),
            new Entry("000011000", 15), new Entry("0000010111", 16), new Entry("0000011000", 17), new Entry("0000001000", 18), new Entry("00001100111", 19),
            new Entry("00001101000", 20), new Entry("00001101100", 21), new Entry("00000110111", 22), new Entry("00000101000", 23),
            new Entry("00000010111", 24), new Entry("00000011000", 25), new Entry("000011001010", 26), new Entry("000011001011", 27),
            new Entry("000011001100", 28), new Entry("000011001101", 29), new Entry("000001101000", 30), new Entry("000001101001", 31),
            new Entry("000001101010", 32), new Entry("000001101011", 33), new Entry("000011010010", 34), new Entry("000011010011", 35),
            new Entry("000011010100", 36), new Entry("000011010101", 37), new Entry("000011010110", 38), new Entry("000011010111", 39),
            new Entry("000001101100", 40), new Entry("000001101101", 41), new Entry("000011011010", 42), new Entry("000011011011", 43),
            new Entry("000001010100", 44), new Entry("000001010101", 45), new Entry("000001010110", 46), new Entry("000001010111", 47),
            new Entry("000001100100", 48), new Entry("000001100101", 49), new Entry("000001010010", 50), new Entry("000001010011", 51),
            new Entry("000000100100", 52), new Entry("000000110111", 53), new Entry("000000111000", 54), new Entry("000000100111", 55),
            new Entry("000000101000", 56), new Entry("000001011000", 57), new Entry("000001011001", 58), new Entry("000000101011", 59),
            new Entry("000000101100", 60), new Entry("000001011010", 61), new Entry("000001100110", 62), new Entry("000001100111", 63), };

    public static final Entry[] WHITE_MAKE_UP_CODES = { new Entry("11011", 64), new Entry("10010", 128), new Entry("010111", 192), new Entry("0110111", 256),
            new Entry("00110110", 320), new Entry("00110111", 384), new Entry("01100100", 448), new Entry("01100101", 512), new Entry("01101000", 576),
            new Entry("01100111", 640), new Entry("011001100", 704), new Entry("011001101", 768), new Entry("011010010", 832), new Entry("011010011", 896),
            new Entry("011010100", 960), new Entry("011010101", 1024), new Entry("011010110", 1088), new Entry("011010111", 1152), new Entry("011011000", 1216),
            new Entry("011011001", 1280), new Entry("011011010", 1344), new Entry("011011011", 1408), new Entry("010011000", 1472),
            new Entry("010011001", 1536), new Entry("010011010", 1600), new Entry("011000", 1664), new Entry("010011011", 1728), };

    public static final Entry[] BLACK_MAKE_UP_CODES = { new Entry("0000001111", 64), new Entry("000011001000", 128), new Entry("000011001001", 192),
            new Entry("000001011011", 256), new Entry("000000110011", 320), new Entry("000000110100", 384), new Entry("000000110101", 448),
            new Entry("0000001101100", 512), new Entry("0000001101101", 576), new Entry("0000001001010", 640), new Entry("0000001001011", 704),
            new Entry("0000001001100", 768), new Entry("0000001001101", 832), new Entry("0000001110010", 896), new Entry("0000001110011", 960),
            new Entry("0000001110100", 1024), new Entry("0000001110101", 1088), new Entry("0000001110110", 1152), new Entry("0000001110111", 1216),
            new Entry("0000001010010", 1280), new Entry("0000001010011", 1344), new Entry("0000001010100", 1408), new Entry("0000001010101", 1472),
            new Entry("0000001011010", 1536), new Entry("0000001011011", 1600), new Entry("0000001100100", 1664), new Entry("0000001100101", 1728), };

    public static final Entry[] ADDITIONAL_MAKE_UP_CODES = { new Entry("00000001000", 1792), new Entry("00000001100", 1856), new Entry("00000001101", 1920),
            new Entry("000000010010", 1984), new Entry("000000010011", 2048), new Entry("000000010100", 2112), new Entry("000000010101", 2176),
            new Entry("000000010110", 2240), new Entry("000000010111", 2304), new Entry("000000011100", 2368), new Entry("000000011101", 2432),
            new Entry("000000011110", 2496), new Entry("000000011111", 2560), };
    public static final Entry EOL = new Entry("000000000001", 0);
    public static final Entry EOL13 = new Entry("0000000000001", 0);
    public static final Entry EOL14 = new Entry("00000000000001", 0);
    public static final Entry EOL15 = new Entry("000000000000001", 0);
    public static final Entry EOL16 = new Entry("0000000000000001", 0);
    public static final Entry EOL17 = new Entry("00000000000000001", 0);
    public static final Entry EOL18 = new Entry("000000000000000001", 0);
    public static final Entry EOL19 = new Entry("0000000000000000001", 0);
    public static final Entry P = new Entry("0001", 0);
    public static final Entry H = new Entry("001", 0);
    public static final Entry V0 = new Entry("1", 0);
    public static final Entry VR1 = new Entry("011", 0);
    public static final Entry VR2 = new Entry("000011", 0);
    public static final Entry VR3 = new Entry("0000011", 0);
    public static final Entry VL1 = new Entry("010", 0);
    public static final Entry VL2 = new Entry("000010", 0);

    public static final Entry VL3 = new Entry("0000010", 0);
}
