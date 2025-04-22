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
package org.apache.commons.imaging.formats.webp;

import java.io.IOException;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.formats.webp.chunks.WebPChunk;
import org.apache.commons.imaging.formats.webp.chunks.WebPChunkAlph;
import org.apache.commons.imaging.formats.webp.chunks.WebPChunkAnim;
import org.apache.commons.imaging.formats.webp.chunks.WebPChunkAnmf;
import org.apache.commons.imaging.formats.webp.chunks.WebPChunkExif;
import org.apache.commons.imaging.formats.webp.chunks.WebPChunkIccp;
import org.apache.commons.imaging.formats.webp.chunks.WebPChunkVp8;
import org.apache.commons.imaging.formats.webp.chunks.WebPChunkVp8l;
import org.apache.commons.imaging.formats.webp.chunks.WebPChunkVp8x;
import org.apache.commons.imaging.formats.webp.chunks.WebPChunkXml;
import org.apache.commons.imaging.formats.webp.chunks.WebPChunkXyzw;

/**
 * WebP chunk type.
 *
 * @since 1.0.0-alpha4
 */
public enum WebPChunkType {

    /**
     * @see WebPChunkAlph
     */
    ALPH(WebPChunkAlph::new),

    /**
     * @see WebPChunkVp8
     */
    VP8(WebPChunkVp8::new),

    /**
     * @see WebPChunkVp8l
     */
    VP8L(WebPChunkVp8l::new),

    /**
     * @see WebPChunkVp8x
     */
    VP8X(WebPChunkVp8x::new),

    /**
     * @see WebPChunkAnim
     */
    ANIM(WebPChunkAnim::new),

    /**
     * @see WebPChunkAnmf
     */
    ANMF(WebPChunkAnmf::new),

    /**
     * @see WebPChunkIccp
     */
    ICCP(WebPChunkIccp::new),

    /**
     * @see WebPChunkExif
     */
    EXIF(WebPChunkExif::new),

    /**
     * @see WebPChunkXml
     */
    XMP(WebPChunkXml::new);

    private interface ChunkConstructor {
        WebPChunk make(int type, int size, byte[] bytes) throws IOException, ImagingException;
    }

    private static final WebPChunkType[] types = values();

    static WebPChunkType findType(final int chunkType) {
        for (final WebPChunkType type : types) {
            if (type.value == chunkType) {
                return type;
            }
        }
        return null;
    }

    static WebPChunk makeChunk(final int chunkType, final int size, final byte[] bytes) throws IOException, ImagingException {
        final WebPChunkType type = findType(chunkType);
        return type != null ? type.constructor.make(chunkType, size, bytes) : new WebPChunkXyzw(chunkType, size, bytes);
    }

    private final ChunkConstructor constructor;
    final int value;

    WebPChunkType(final ChunkConstructor constructor) {
        this.constructor = constructor;
        this.value = BinaryFunctions.charsToQuad(name().length() == 4 ? name().charAt(3) : ' ', name().charAt(2), name().charAt(1), name().charAt(0));
    }
}
