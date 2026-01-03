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

package org.apache.commons.imaging.formats.jpeg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.imaging.common.BinaryConstant;
import org.apache.commons.imaging.common.BinaryFunctions;

/**
 * JPEG format constants including markers, signatures, and identifiers.
 */
public final class JpegConstants {

    /** Maximum JPEG segment size: {@value}. */
    public static final int MAX_SEGMENT_SIZE = 0xffff;

    /** JFIF0 signature. */
    public static final BinaryConstant JFIF0_SIGNATURE = new BinaryConstant(new byte[] { 0x4a, // J
            0x46, // F
            0x49, // I
            0x46, // F
            0x0, //
    });

    /** Alternative JFIF0 signature. */
    public static final BinaryConstant JFIF0_SIGNATURE_ALTERNATIVE = new BinaryConstant(new byte[] { 0x4a, // J
            0x46, // F
            0x49, // I
            0x46, // F
            0x20, //
    });

    /** EXIF identifier code. */
    public static final BinaryConstant EXIF_IDENTIFIER_CODE = new BinaryConstant(new byte[] { 0x45, // E
            0x78, // x
            0x69, // i
            0x66, // f
    });

    /** XMP metadata identifier. */
    public static final BinaryConstant XMP_IDENTIFIER = new BinaryConstant(new byte[] { 0x68, // h
            0x74, // t
            0x74, // t
            0x70, // p
            0x3A, // :
            0x2F, // /
            0x2F, // /
            0x6E, // n
            0x73, // s
            0x2E, // .
            0x61, // a
            0x64, // d
            0x6F, // o
            0x62, // b
            0x65, // e
            0x2E, // .
            0x63, // c
            0x6F, // o
            0x6D, // m
            0x2F, // /
            0x78, // x
            0x61, // a
            0x70, // p
            0x2F, // /
            0x31, // 1
            0x2E, // .
            0x30, // 0
            0x2F, // /
            0, // 0-terminated us-ascii string.
    });

    /** Start of Image marker. */
    public static final BinaryConstant SOI = new BinaryConstant(new byte[] { (byte) 0xff, (byte) 0xd8 });

    /** End of Image marker. */
    public static final BinaryConstant EOI = new BinaryConstant(new byte[] { (byte) 0xff, (byte) 0xd9 });

    /** JPEG APP0 marker value: {@value}. */
    public static final int JPEG_APP0 = 0xE0;

    /** JPEG APP0 marker: {@value}. */
    public static final int JPEG_APP0_MARKER = 0xff00 | JPEG_APP0;

    /** JPEG APP1 marker: {@value}. */
    public static final int JPEG_APP1_MARKER = 0xff00 | JPEG_APP0 + 1;

    /** JPEG APP2 marker: {@value}. */
    public static final int JPEG_APP2_MARKER = 0xff00 | JPEG_APP0 + 2;

    /** JPEG APP13 marker: {@value}. */
    public static final int JPEG_APP13_MARKER = 0xff00 | JPEG_APP0 + 13;

    /** JPEG APP14 marker: {@value}. */
    public static final int JPEG_APP14_MARKER = 0xff00 | JPEG_APP0 + 14;

    /** JPEG APP15 marker: {@value}. */
    public static final int JPEG_APP15_MARKER = 0xff00 | JPEG_APP0 + 15;

    /** JFIF marker: {@value}. */
    public static final int JFIF_MARKER = 0xFFE0;

    /** Start of Frame 0 (Baseline DCT) marker: {@value}. */
    public static final int SOF0_MARKER = 0xFFc0;

    /** Start of Frame 1 (Extended Sequential DCT) marker: {@value}. */
    public static final int SOF1_MARKER = 0xFFc0 + 0x1;

    /** Start of Frame 2 (Progressive DCT) marker: {@value}. */
    public static final int SOF2_MARKER = 0xFFc0 + 0x2;

    /** Start of Frame 3 (Lossless Sequential) marker: {@value}. */
    public static final int SOF3_MARKER = 0xFFc0 + 0x3;

    /** Define Huffman Table marker: {@value}. */
    public static final int DHT_MARKER = 0xFFc0 + 0x4;

    /** Start of Frame 5 (Differential Sequential DCT) marker: {@value}. */
    public static final int SOF5_MARKER = 0xFFc0 + 0x5;

    /** Start of Frame 6 (Differential Progressive DCT) marker: {@value}. */
    public static final int SOF6_MARKER = 0xFFc0 + 0x6;

    /** Start of Frame 7 (Differential Lossless) marker: {@value}. */
    public static final int SOF7_MARKER = 0xFFc0 + 0x7;

    /** Start of Frame 8 (Reserved) marker: {@value}. */
    public static final int SOF8_MARKER = 0xFFc0 + 0x8;

    /** Start of Frame 9 (Extended Sequential DCT, Arithmetic) marker: {@value}. */
    public static final int SOF9_MARKER = 0xFFc0 + 0x9;

    /** Start of Frame 10 (Progressive DCT, Arithmetic) marker: {@value}. */
    public static final int SOF10_MARKER = 0xFFc0 + 0xa;

    /** Start of Frame 11 (Lossless, Arithmetic) marker: {@value}. */
    public static final int SOF11_MARKER = 0xFFc0 + 0xb;

    /** Define Arithmetic Coding marker: {@value}. */
    public static final int DAC_MARKER = 0xFFc0 + 0xc;

    /** Start of Frame 13 (Differential Sequential DCT, Arithmetic) marker: {@value}. */
    public static final int SOF13_MARKER = 0xFFc0 + 0xd;

    /** Start of Frame 14 (Differential Progressive DCT, Arithmetic) marker: {@value}. */
    public static final int SOF14_MARKER = 0xFFc0 + 0xe;

    /** Start of Frame 15 (Differential Lossless, Arithmetic) marker: {@value}. */
    public static final int SOF15_MARKER = 0xFFc0 + 0xf;

    /** Define Restart Interval marker: {@value}. */
    public static final int DRI_MARKER = 0xFFdd;

    /** Restart 0 marker: {@value}. */
    public static final int RST0_MARKER = 0xFFd0;

    /** Restart 1 marker: {@value}. */
    public static final int RST1_MARKER = 0xFFd0 + 0x1;

    /** Restart 2 marker: {@value}. */
    public static final int RST2_MARKER = 0xFFd0 + 0x2;

    /** Restart 3 marker: {@value}. */
    public static final int RST3_MARKER = 0xFFd0 + 0x3;

    /** Restart 4 marker: {@value}. */
    public static final int RST4_MARKER = 0xFFd0 + 0x4;

    /** Restart 5 marker: {@value}. */
    public static final int RST5_MARKER = 0xFFd0 + 0x5;

    /** Restart 6 marker: {@value}. */
    public static final int RST6_MARKER = 0xFFd0 + 0x6;

    /** Restart 7 marker: {@value}. */
    public static final int RST7_MARKER = 0xFFd0 + 0x7;

    /** End of Image marker: {@value}. */
    public static final int EOI_MARKER = 0xFFd9;

    /** Start of Scan marker: {@value}. */
    public static final int SOS_MARKER = 0xFFda;

    /** Define Quantization Table marker: {@value}. */
    public static final int DQT_MARKER = 0xFFdb;

    /** Define Number of Lines marker: {@value}. */
    public static final int DNL_MARKER = 0xFFdc;

    /** Comment marker: {@value}. */
    public static final int COM_MARKER = 0xFFfe;

    /** List of all JPEG markers. */
    public static final List<Integer> MARKERS = Collections.unmodifiableList(
            Arrays.asList(JPEG_APP0, JPEG_APP0_MARKER, JPEG_APP1_MARKER, JPEG_APP2_MARKER, JPEG_APP13_MARKER, JPEG_APP14_MARKER, JPEG_APP15_MARKER, JFIF_MARKER,
                    SOF0_MARKER, SOF1_MARKER, SOF2_MARKER, SOF3_MARKER, DHT_MARKER, SOF5_MARKER, SOF6_MARKER, SOF7_MARKER, SOF8_MARKER, SOF9_MARKER,
                    SOF10_MARKER, SOF11_MARKER, DAC_MARKER, SOF13_MARKER, SOF14_MARKER, SOF15_MARKER, EOI_MARKER, SOS_MARKER, DQT_MARKER, DNL_MARKER,
                    COM_MARKER, DRI_MARKER, RST0_MARKER, RST1_MARKER, RST2_MARKER, RST3_MARKER, RST4_MARKER, RST5_MARKER, RST6_MARKER, RST7_MARKER));

    /** ICC profile label. */
    public static final BinaryConstant ICC_PROFILE_LABEL = new BinaryConstant(
            new byte[] { 0x49, 0x43, 0x43, 0x5F, 0x50, 0x52, 0x4F, 0x46, 0x49, 0x4C, 0x45, 0x0 });

    /** Photoshop identification string. */
    public static final BinaryConstant PHOTOSHOP_IDENTIFICATION_STRING = new BinaryConstant(new byte[] { 0x50, // P
            0x68, // h
            0x6F, // o
            0x74, // t
            0x6F, // o
            0x73, // s
            0x68, // h
            0x6F, // o
            0x70, // p
            0x20, //
            0x33, // 3
            0x2E, // .
            0x30, // 0
            0, });

    /** 8BIM constant for Photoshop metadata. */
    public static final int CONST_8BIM = BinaryFunctions.charsToQuad('8', 'B', 'I', 'M');

    private JpegConstants() {
    }
}
