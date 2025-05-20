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

public final class JpegConstants {
    public static final int MAX_SEGMENT_SIZE = 0xffff;

    public static final BinaryConstant JFIF0_SIGNATURE = new BinaryConstant(new byte[] { 0x4a, // J
            0x46, // F
            0x49, // I
            0x46, // F
            0x0, //
    });
    public static final BinaryConstant JFIF0_SIGNATURE_ALTERNATIVE = new BinaryConstant(new byte[] { 0x4a, // J
            0x46, // F
            0x49, // I
            0x46, // F
            0x20, //
    });

    public static final BinaryConstant EXIF_IDENTIFIER_CODE = new BinaryConstant(new byte[] { 0x45, // E
            0x78, // x
            0x69, // i
            0x66, // f
    });

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

    public static final BinaryConstant SOI = new BinaryConstant(new byte[] { (byte) 0xff, (byte) 0xd8 });
    public static final BinaryConstant EOI = new BinaryConstant(new byte[] { (byte) 0xff, (byte) 0xd9 });

    public static final int JPEG_APP0 = 0xE0;
    public static final int JPEG_APP0_MARKER = 0xff00 | JPEG_APP0;
    public static final int JPEG_APP1_MARKER = 0xff00 | JPEG_APP0 + 1;
    public static final int JPEG_APP2_MARKER = 0xff00 | JPEG_APP0 + 2;
    public static final int JPEG_APP13_MARKER = 0xff00 | JPEG_APP0 + 13;
    public static final int JPEG_APP14_MARKER = 0xff00 | JPEG_APP0 + 14;
    public static final int JPEG_APP15_MARKER = 0xff00 | JPEG_APP0 + 15;

    public static final int JFIF_MARKER = 0xFFE0;
    public static final int SOF0_MARKER = 0xFFc0;
    public static final int SOF1_MARKER = 0xFFc0 + 0x1;
    public static final int SOF2_MARKER = 0xFFc0 + 0x2;
    public static final int SOF3_MARKER = 0xFFc0 + 0x3;
    public static final int DHT_MARKER = 0xFFc0 + 0x4;
    public static final int SOF5_MARKER = 0xFFc0 + 0x5;
    public static final int SOF6_MARKER = 0xFFc0 + 0x6;
    public static final int SOF7_MARKER = 0xFFc0 + 0x7;
    public static final int SOF8_MARKER = 0xFFc0 + 0x8;
    public static final int SOF9_MARKER = 0xFFc0 + 0x9;
    public static final int SOF10_MARKER = 0xFFc0 + 0xa;
    public static final int SOF11_MARKER = 0xFFc0 + 0xb;
    public static final int DAC_MARKER = 0xFFc0 + 0xc;
    public static final int SOF13_MARKER = 0xFFc0 + 0xd;
    public static final int SOF14_MARKER = 0xFFc0 + 0xe;
    public static final int SOF15_MARKER = 0xFFc0 + 0xf;

    // marker for restart intervals
    public static final int DRI_MARKER = 0xFFdd;
    public static final int RST0_MARKER = 0xFFd0;
    public static final int RST1_MARKER = 0xFFd0 + 0x1;
    public static final int RST2_MARKER = 0xFFd0 + 0x2;
    public static final int RST3_MARKER = 0xFFd0 + 0x3;
    public static final int RST4_MARKER = 0xFFd0 + 0x4;
    public static final int RST5_MARKER = 0xFFd0 + 0x5;
    public static final int RST6_MARKER = 0xFFd0 + 0x6;
    public static final int RST7_MARKER = 0xFFd0 + 0x7;

    public static final int EOI_MARKER = 0xFFd9;
    public static final int SOS_MARKER = 0xFFda;
    public static final int DQT_MARKER = 0xFFdb;
    public static final int DNL_MARKER = 0xFFdc;
    public static final int COM_MARKER = 0xFFfe;

    public static final List<Integer> MARKERS = Collections.unmodifiableList(
            Arrays.asList(JPEG_APP0, JPEG_APP0_MARKER, JPEG_APP1_MARKER, JPEG_APP2_MARKER, JPEG_APP13_MARKER, JPEG_APP14_MARKER, JPEG_APP15_MARKER, JFIF_MARKER,
                    SOF0_MARKER, SOF1_MARKER, SOF2_MARKER, SOF3_MARKER, DHT_MARKER, SOF5_MARKER, SOF6_MARKER, SOF7_MARKER, SOF8_MARKER, SOF9_MARKER,
                    SOF10_MARKER, SOF11_MARKER, DAC_MARKER, SOF13_MARKER, SOF14_MARKER, SOF15_MARKER, EOI_MARKER, SOS_MARKER, DQT_MARKER, DNL_MARKER,
                    COM_MARKER, DRI_MARKER, RST0_MARKER, RST1_MARKER, RST2_MARKER, RST3_MARKER, RST4_MARKER, RST5_MARKER, RST6_MARKER, RST7_MARKER));

    public static final BinaryConstant ICC_PROFILE_LABEL = new BinaryConstant(
            new byte[] { 0x49, 0x43, 0x43, 0x5F, 0x50, 0x52, 0x4F, 0x46, 0x49, 0x4C, 0x45, 0x0 });

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
    public static final int CONST_8BIM = BinaryFunctions.charsToQuad('8', 'B', 'I', 'M');

    private JpegConstants() {
    }
}
