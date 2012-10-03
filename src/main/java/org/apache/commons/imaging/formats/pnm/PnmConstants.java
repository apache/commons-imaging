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
package org.apache.commons.imaging.formats.pnm;

public interface PnmConstants {
    public static final byte PNM_PREFIX_BYTE = 0x50; // P

    public static final byte PBM_TEXT_CODE = 0x31; // Textual Bitmap
    public static final byte PGM_TEXT_CODE = 0x32; // Textual GrayMap
    public static final byte PPM_TEXT_CODE = 0x33; // Textual Pixmap
    public static final byte PGM_RAW_CODE = 0x35; // RAW GrayMap
    public static final byte PBM_RAW_CODE = 0x34; // RAW Bitmap
    public static final byte PPM_RAW_CODE = 0x36; // RAW Pixmap
    public static final byte PAM_TEXT_CODE = 0x37; // PAM Pixmap

    public static final byte PNM_SEPARATOR = 0x20; // Space
    public static final byte PNM_NEWLINE = 0x0A; // "usually a newline"
                                                 // (http://netpbm.sourceforge.net/doc/pbm.html)
}
