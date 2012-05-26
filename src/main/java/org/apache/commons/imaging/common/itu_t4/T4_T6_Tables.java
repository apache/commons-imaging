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

import org.apache.commons.imaging.common.BitArrayOutputStream;

class T4_T6_Tables {
    public static class Entry {
        String bitString;
        Integer value;

        public Entry(String bitString, Integer value) {
            this.bitString = bitString;
            this.value = value;
        }

        public void writeBits(BitArrayOutputStream outputStream) {
            for (int i = 0; i < bitString.length(); i++) {
                if (bitString.charAt(i) == '0') {
                    outputStream.writeBit(0);
                } else {
                    outputStream.writeBit(1);
                }
            }
        }
    }

    public static final Entry[] whiteTerminatingCodes = {
            new Entry("00110101", Integer.valueOf(0)),
            new Entry("000111", Integer.valueOf(1)),
            new Entry("0111", Integer.valueOf(2)),
            new Entry("1000", Integer.valueOf(3)),
            new Entry("1011", Integer.valueOf(4)),
            new Entry("1100", Integer.valueOf(5)),
            new Entry("1110", Integer.valueOf(6)),
            new Entry("1111", Integer.valueOf(7)),
            new Entry("10011", Integer.valueOf(8)),
            new Entry("10100", Integer.valueOf(9)),
            new Entry("00111", Integer.valueOf(10)),
            new Entry("01000", Integer.valueOf(11)),
            new Entry("001000", Integer.valueOf(12)),
            new Entry("000011", Integer.valueOf(13)),
            new Entry("110100", Integer.valueOf(14)),
            new Entry("110101", Integer.valueOf(15)),
            new Entry("101010", Integer.valueOf(16)),
            new Entry("101011", Integer.valueOf(17)),
            new Entry("0100111", Integer.valueOf(18)),
            new Entry("0001100", Integer.valueOf(19)),
            new Entry("0001000", Integer.valueOf(20)),
            new Entry("0010111", Integer.valueOf(21)),
            new Entry("0000011", Integer.valueOf(22)),
            new Entry("0000100", Integer.valueOf(23)),
            new Entry("0101000", Integer.valueOf(24)),
            new Entry("0101011", Integer.valueOf(25)),
            new Entry("0010011", Integer.valueOf(26)),
            new Entry("0100100", Integer.valueOf(27)),
            new Entry("0011000", Integer.valueOf(28)),
            new Entry("00000010", Integer.valueOf(29)),
            new Entry("00000011", Integer.valueOf(30)),
            new Entry("00011010", Integer.valueOf(31)),
            new Entry("00011011", Integer.valueOf(32)),
            new Entry("00010010", Integer.valueOf(33)),
            new Entry("00010011", Integer.valueOf(34)),
            new Entry("00010100", Integer.valueOf(35)),
            new Entry("00010101", Integer.valueOf(36)),
            new Entry("00010110", Integer.valueOf(37)),
            new Entry("00010111", Integer.valueOf(38)),
            new Entry("00101000", Integer.valueOf(39)),
            new Entry("00101001", Integer.valueOf(40)),
            new Entry("00101010", Integer.valueOf(41)),
            new Entry("00101011", Integer.valueOf(42)),
            new Entry("00101100", Integer.valueOf(43)),
            new Entry("00101101", Integer.valueOf(44)),
            new Entry("00000100", Integer.valueOf(45)),
            new Entry("00000101", Integer.valueOf(46)),
            new Entry("00001010", Integer.valueOf(47)),
            new Entry("00001011", Integer.valueOf(48)),
            new Entry("01010010", Integer.valueOf(49)),
            new Entry("01010011", Integer.valueOf(50)),
            new Entry("01010100", Integer.valueOf(51)),
            new Entry("01010101", Integer.valueOf(52)),
            new Entry("00100100", Integer.valueOf(53)),
            new Entry("00100101", Integer.valueOf(54)),
            new Entry("01011000", Integer.valueOf(55)),
            new Entry("01011001", Integer.valueOf(56)),
            new Entry("01011010", Integer.valueOf(57)),
            new Entry("01011011", Integer.valueOf(58)),
            new Entry("01001010", Integer.valueOf(59)),
            new Entry("01001011", Integer.valueOf(60)),
            new Entry("00110010", Integer.valueOf(61)),
            new Entry("00110011", Integer.valueOf(62)),
            new Entry("00110100", Integer.valueOf(63)), };

    public static final Entry[] blackTerminatingCodes = {
            new Entry("0000110111", Integer.valueOf(0)),
            new Entry("010", Integer.valueOf(1)),
            new Entry("11", Integer.valueOf(2)),
            new Entry("10", Integer.valueOf(3)),
            new Entry("011", Integer.valueOf(4)),
            new Entry("0011", Integer.valueOf(5)),
            new Entry("0010", Integer.valueOf(6)),
            new Entry("00011", Integer.valueOf(7)),
            new Entry("000101", Integer.valueOf(8)),
            new Entry("000100", Integer.valueOf(9)),
            new Entry("0000100", Integer.valueOf(10)),
            new Entry("0000101", Integer.valueOf(11)),
            new Entry("0000111", Integer.valueOf(12)),
            new Entry("00000100", Integer.valueOf(13)),
            new Entry("00000111", Integer.valueOf(14)),
            new Entry("000011000", Integer.valueOf(15)),
            new Entry("0000010111", Integer.valueOf(16)),
            new Entry("0000011000", Integer.valueOf(17)),
            new Entry("0000001000", Integer.valueOf(18)),
            new Entry("00001100111", Integer.valueOf(19)),
            new Entry("00001101000", Integer.valueOf(20)),
            new Entry("00001101100", Integer.valueOf(21)),
            new Entry("00000110111", Integer.valueOf(22)),
            new Entry("00000101000", Integer.valueOf(23)),
            new Entry("00000010111", Integer.valueOf(24)),
            new Entry("00000011000", Integer.valueOf(25)),
            new Entry("000011001010", Integer.valueOf(26)),
            new Entry("000011001011", Integer.valueOf(27)),
            new Entry("000011001100", Integer.valueOf(28)),
            new Entry("000011001101", Integer.valueOf(29)),
            new Entry("000001101000", Integer.valueOf(30)),
            new Entry("000001101001", Integer.valueOf(31)),
            new Entry("000001101010", Integer.valueOf(32)),
            new Entry("000001101011", Integer.valueOf(33)),
            new Entry("000011010010", Integer.valueOf(34)),
            new Entry("000011010011", Integer.valueOf(35)),
            new Entry("000011010100", Integer.valueOf(36)),
            new Entry("000011010101", Integer.valueOf(37)),
            new Entry("000011010110", Integer.valueOf(38)),
            new Entry("000011010111", Integer.valueOf(39)),
            new Entry("000001101100", Integer.valueOf(40)),
            new Entry("000001101101", Integer.valueOf(41)),
            new Entry("000011011010", Integer.valueOf(42)),
            new Entry("000011011011", Integer.valueOf(43)),
            new Entry("000001010100", Integer.valueOf(44)),
            new Entry("000001010101", Integer.valueOf(45)),
            new Entry("000001010110", Integer.valueOf(46)),
            new Entry("000001010111", Integer.valueOf(47)),
            new Entry("000001100100", Integer.valueOf(48)),
            new Entry("000001100101", Integer.valueOf(49)),
            new Entry("000001010010", Integer.valueOf(50)),
            new Entry("000001010011", Integer.valueOf(51)),
            new Entry("000000100100", Integer.valueOf(52)),
            new Entry("000000110111", Integer.valueOf(53)),
            new Entry("000000111000", Integer.valueOf(54)),
            new Entry("000000100111", Integer.valueOf(55)),
            new Entry("000000101000", Integer.valueOf(56)),
            new Entry("000001011000", Integer.valueOf(57)),
            new Entry("000001011001", Integer.valueOf(58)),
            new Entry("000000101011", Integer.valueOf(59)),
            new Entry("000000101100", Integer.valueOf(60)),
            new Entry("000001011010", Integer.valueOf(61)),
            new Entry("000001100110", Integer.valueOf(62)),
            new Entry("000001100111", Integer.valueOf(63)), };

    public static final Entry[] whiteMakeUpCodes = {
            new Entry("11011", Integer.valueOf(64)),
            new Entry("10010", Integer.valueOf(128)),
            new Entry("010111", Integer.valueOf(192)),
            new Entry("0110111", Integer.valueOf(256)),
            new Entry("00110110", Integer.valueOf(320)),
            new Entry("00110111", Integer.valueOf(384)),
            new Entry("01100100", Integer.valueOf(448)),
            new Entry("01100101", Integer.valueOf(512)),
            new Entry("01101000", Integer.valueOf(576)),
            new Entry("01100111", Integer.valueOf(640)),
            new Entry("011001100", Integer.valueOf(704)),
            new Entry("011001101", Integer.valueOf(768)),
            new Entry("011010010", Integer.valueOf(832)),
            new Entry("011010011", Integer.valueOf(896)),
            new Entry("011010100", Integer.valueOf(960)),
            new Entry("011010101", Integer.valueOf(1024)),
            new Entry("011010110", Integer.valueOf(1088)),
            new Entry("011010111", Integer.valueOf(1152)),
            new Entry("011011000", Integer.valueOf(1216)),
            new Entry("011011001", Integer.valueOf(1280)),
            new Entry("011011010", Integer.valueOf(1344)),
            new Entry("011011011", Integer.valueOf(1408)),
            new Entry("010011000", Integer.valueOf(1472)),
            new Entry("010011001", Integer.valueOf(1536)),
            new Entry("010011010", Integer.valueOf(1600)),
            new Entry("011000", Integer.valueOf(1664)),
            new Entry("010011011", Integer.valueOf(1728)), };

    public static final Entry[] blackMakeUpCodes = {
            new Entry("0000001111", Integer.valueOf(64)),
            new Entry("000011001000", Integer.valueOf(128)),
            new Entry("000011001001", Integer.valueOf(192)),
            new Entry("000001011011", Integer.valueOf(256)),
            new Entry("000000110011", Integer.valueOf(320)),
            new Entry("000000110100", Integer.valueOf(384)),
            new Entry("000000110101", Integer.valueOf(448)),
            new Entry("0000001101100", Integer.valueOf(512)),
            new Entry("0000001101101", Integer.valueOf(576)),
            new Entry("0000001001010", Integer.valueOf(640)),
            new Entry("0000001001011", Integer.valueOf(704)),
            new Entry("0000001001100", Integer.valueOf(768)),
            new Entry("0000001001101", Integer.valueOf(832)),
            new Entry("0000001110010", Integer.valueOf(896)),
            new Entry("0000001110011", Integer.valueOf(960)),
            new Entry("0000001110100", Integer.valueOf(1024)),
            new Entry("0000001110101", Integer.valueOf(1088)),
            new Entry("0000001110110", Integer.valueOf(1152)),
            new Entry("0000001110111", Integer.valueOf(1216)),
            new Entry("0000001010010", Integer.valueOf(1280)),
            new Entry("0000001010011", Integer.valueOf(1344)),
            new Entry("0000001010100", Integer.valueOf(1408)),
            new Entry("0000001010101", Integer.valueOf(1472)),
            new Entry("0000001011010", Integer.valueOf(1536)),
            new Entry("0000001011011", Integer.valueOf(1600)),
            new Entry("0000001100100", Integer.valueOf(1664)),
            new Entry("0000001100101", Integer.valueOf(1728)), };

    public static final Entry[] additionalMakeUpCodes = {
            new Entry("00000001000", Integer.valueOf(1792)),
            new Entry("00000001100", Integer.valueOf(1856)),
            new Entry("00000001101", Integer.valueOf(1920)),
            new Entry("000000010010", Integer.valueOf(1984)),
            new Entry("000000010011", Integer.valueOf(2048)),
            new Entry("000000010100", Integer.valueOf(2112)),
            new Entry("000000010101", Integer.valueOf(2176)),
            new Entry("000000010110", Integer.valueOf(2240)),
            new Entry("000000010111", Integer.valueOf(2304)),
            new Entry("000000011100", Integer.valueOf(2368)),
            new Entry("000000011101", Integer.valueOf(2432)),
            new Entry("000000011110", Integer.valueOf(2496)),
            new Entry("000000011111", Integer.valueOf(2560)), };

    public static final Entry EOL = new Entry("000000000001",
            Integer.valueOf(0));
    public static final Entry EOL13 = new Entry("0000000000001",
            Integer.valueOf(0));
    public static final Entry EOL14 = new Entry("00000000000001",
            Integer.valueOf(0));
    public static final Entry EOL15 = new Entry("000000000000001",
            Integer.valueOf(0));
    public static final Entry EOL16 = new Entry("0000000000000001",
            Integer.valueOf(0));
    public static final Entry EOL17 = new Entry("00000000000000001",
            Integer.valueOf(0));
    public static final Entry EOL18 = new Entry("000000000000000001",
            Integer.valueOf(0));
    public static final Entry EOL19 = new Entry("0000000000000000001",
            Integer.valueOf(0));
    public static final Entry P = new Entry("0001", Integer.valueOf(0));
    public static final Entry H = new Entry("001", Integer.valueOf(0));
    public static final Entry V0 = new Entry("1", Integer.valueOf(0));
    public static final Entry VR1 = new Entry("011", Integer.valueOf(0));
    public static final Entry VR2 = new Entry("000011", Integer.valueOf(0));
    public static final Entry VR3 = new Entry("0000011", Integer.valueOf(0));
    public static final Entry VL1 = new Entry("010", Integer.valueOf(0));
    public static final Entry VL2 = new Entry("000010", Integer.valueOf(0));
    public static final Entry VL3 = new Entry("0000010", Integer.valueOf(0));
}
