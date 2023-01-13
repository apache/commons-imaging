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

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.formats.png.chunks.PngChunk;
import org.apache.commons.imaging.formats.png.chunks.PngChunkGama;
import org.apache.commons.imaging.formats.png.chunks.PngChunkIccp;
import org.apache.commons.imaging.formats.png.chunks.PngChunkIdat;
import org.apache.commons.imaging.formats.png.chunks.PngChunkIhdr;
import org.apache.commons.imaging.formats.png.chunks.PngChunkItxt;
import org.apache.commons.imaging.formats.png.chunks.PngChunkPhys;
import org.apache.commons.imaging.formats.png.chunks.PngChunkPlte;
import org.apache.commons.imaging.formats.png.chunks.PngChunkScal;
import org.apache.commons.imaging.formats.png.chunks.PngChunkText;
import org.apache.commons.imaging.formats.png.chunks.PngChunkZtxt;

/**
 * Type of PNG chunk.
 *
 * @see <a href="https://www.w3.org/TR/png/#11Chunks">Portable Network Graphics Specification - Chunk specifications</a>
 */
public enum ChunkType {

    /**
     * Image header
     */
    IHDR(PngChunkIhdr::new),

    /**
     * Palette
     */
    PLTE(PngChunkPlte::new),

    /**
     * Image data
     */
    IDAT(PngChunkIdat::new),

    /**
     * Image trailer
     */
    IEND,

    /**
     * Transparency
     */
    tRNS,

    /**
     * Primary chromaticities and white point
     */
    cHRM,

    /**
     * Image gamma
     */
    gAMA(PngChunkGama::new),

    /**
     * Embedded ICC profile
     */
    iCCP(PngChunkIccp::new),

    /**
     * Significant bits
     */
    sBIT,

    /**
     * Standard RGB color space
     */
    sRGB,

    /**
     * Textual data
     */
    tEXt(PngChunkText::new),

    /**
     * Compressed textual data
     */
    zTXt(PngChunkZtxt::new),

    /**
     * International textual data
     */
    iTXt(PngChunkItxt::new),

    /**
     * Background colour
     */
    bKGD,

    /**
     * Image histogram
     */
    hIST,

    /**
     * Physical pixel dimensions
     */
    pHYs(PngChunkPhys::new),

    /**
     * Suggested palette
     */
    sPLT,

    /**
     * Image last-modification time
     */
    tIME,

    /*
     * PNGEXT
     */

    /**
     * Image offset
     *
     * @since 1.0-alpha6
     */
    oFFs(Extension.PNGEXT),

    /**
     * Calibration of pixel values
     *
     * @since 1.0-alpha6
     */
    pCAL(Extension.PNGEXT),

    /**
     * Physical scale
     */
    sCAL(Extension.PNGEXT, PngChunkScal::new),

    /**
     * GIF Graphic Control Extension
     *
     * @since 1.0-alpha6
     */
    gIFg(Extension.PNGEXT),

    /**
     * GIF Application Extension
     *
     * @since 1.0-alpha6
     */
    gIFx(Extension.PNGEXT),

    /**
     * Indicator of Stereo Image
     *
     * @since 1.0-alpha6
     */
    sTER(Extension.PNGEXT),

    /**
     * Exchangeable Image File (Exif) Profile
     *
     * @since 1.0-alpha6
     */
    eXIf(Extension.PNGEXT),

    ;

    @FunctionalInterface
    private interface ChunkConstructor {
        PngChunk make(int length, int chunkType, int crc, byte[] bytes) throws IOException;
    }

    private static final ChunkType[] types = ChunkType.values();

    static ChunkType findType(int chunkType) {
        for (ChunkType type : types) {
            if (type.value == chunkType) {
                return type;
            }
        }
        return null;
    }

    static PngChunk makeChunk(int length, int chunkType, int crc, byte[] bytes) throws IOException {
        ChunkType type = findType(chunkType);
        return type != null && type.constructor != null
                ? type.constructor.make(length, chunkType, crc, bytes)
                : new PngChunk(length, chunkType, crc, bytes);
    }

    final byte[] array;
    final int value;
    final Extension extension;
    final ChunkConstructor constructor;

    ChunkType() {
        this(null, null);
    }

    ChunkType(Extension extension) {
        this(extension, null);
    }

    ChunkType(ChunkConstructor constructor) {
        this(null, constructor);
    }

    ChunkType(Extension extension, ChunkConstructor constructor) {
        final char[] chars = name().toCharArray();
        this.array = name().getBytes(StandardCharsets.UTF_8);
        this.value = BinaryFunctions.charsToQuad(chars[0], chars[1], chars[2], chars[3]);
        this.extension = extension;
        this.constructor = constructor;
    }
}
