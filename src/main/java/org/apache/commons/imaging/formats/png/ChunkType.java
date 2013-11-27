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

import org.apache.commons.imaging.common.BinaryFunctions;

/**
 * Type of a PNG chunk.
 * 
 * @see <a href="http://www.w3.org/TR/PNG/#11Chunks">Portable Network Graphics Specification - Chunk specifications</a>
 */
public enum ChunkType {
    
    /** Image header */
    IHDR,

    /** Palette */
    PLTE,

    /** Image data */
    IDAT,

    /** Image trailer */
    IEND,

    /** Transparency */
    tRNS,

    /** Image gamma */
    gAMA,

    /** Embedded ICC profile */
    iCCP,

    /** Standard RGB colour space */
    sRGB,

    /** Textual data */
    tEXt,

    /** Compressed textual data */
    zTXt,

    /** International textual data */
    iTXt,

    /** Physical pixel dimensions */
    pHYs;

    final byte[] array;
    final int value;

    private ChunkType() {
        char[] chars = name().toCharArray();
        array = name().getBytes();
        value = BinaryFunctions.charsToQuad(chars[0], chars[1], chars[2], chars[3]);
    }
}
