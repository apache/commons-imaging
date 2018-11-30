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

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

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

    /** Primary chromaticities and white point */
    cHRM,

    /** Image gamma */
    gAMA,

    /** Embedded ICC profile */
    iCCP,

    /** Significant bits*/
    sBIT,

    /** Standard RGB colour space */
    sRGB,

    /** Textual data */
    tEXt,

    /** Compressed textual data */
    zTXt,

    /** International textual data */
    iTXt,

    /** Background colour */
    bKGD,

    /** Image histogram */
    hIST,

    /** Physical pixel dimensions */
    pHYs,

    /** Physical scale */
    sCAL,

    /** Suggested palette */
    sPLT,

    /** Image last-modification time */
    tIME;

    final byte[] array;
    final int value;
    
    private boolean propertyBits[];

    ChunkType() {
        final char[] chars = name().toCharArray();
        array = name().getBytes(StandardCharsets.UTF_8);
        value = BinaryFunctions.charsToQuad(chars[0], chars[1], chars[2], chars[3]);
    }
    
    /**
     * Returns the numeric code identifying the chunk.
     * 
     * @return numeric code of chunk
     */
    public int toCode() {
        return value;
    }
    
    /**
     * Returns the set of four property bits for this chunk type,
     * possibly calculating if not done already.
     * 
     * @return set of four property bits
     */
    public boolean[] propertyBits() {
        // now, propertyBits is property of ChunkType rather than
        // Chunk.
        if(propertyBits == null) {
            propertyBits = new boolean[4];
            int shift = 24;
            
            for (int i = 0; i < 4; i++) {
                final int theByte = 0xff & (toCode() >> shift);
                shift -= 8;
                final int theMask = 1 << 5;
                propertyBits[i] = ((theByte & theMask) > 0);
            }
        }
        
        // notice why ancillary, private, safeToCopy property
        // accesssor are a bit complex.
        return propertyBits.clone();
    }
    
    public boolean isAncillary() {
        if(propertyBits == null) {
            return propertyBits()[0];
        }
        
        return propertyBits[0];
    }
    
    public boolean isPrivate() {
        if(propertyBits == null) {
            return propertyBits()[1];
        }
        
        return propertyBits[1];
    }
    
    public boolean isSafeToCopy() {
        if(propertyBits == null) {
            return propertyBits()[3];
        }
        
        return propertyBits[3];
    }
    
    /**
     * Returns the ChunkType whose numeric code matches the given
     * one.
     * 
     * @param code
     * @return 
     */
    public static ChunkType forCode(int code) {
        final String name = new String(
                ByteBuffer.allocate(4).putInt(code).array(),
                StandardCharsets.ISO_8859_1);
        try {
            return ChunkType.valueOf(name);
        } catch (IllegalArgumentException ex) {
            System.err.println("Unknown ChunkType requested: " + name + ", code: " + code);
            return null;
        }
    }
    
}
