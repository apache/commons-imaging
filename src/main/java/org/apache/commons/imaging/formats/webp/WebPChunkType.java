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

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.formats.webp.chunks.WebPChunk;
import org.apache.commons.imaging.formats.webp.chunks.WebPChunkANIM;
import org.apache.commons.imaging.formats.webp.chunks.WebPChunkANMF;
import org.apache.commons.imaging.formats.webp.chunks.WebPChunkEXIF;
import org.apache.commons.imaging.formats.webp.chunks.WebPChunkICCP;
import org.apache.commons.imaging.formats.webp.chunks.WebPChunkVP8;
import org.apache.commons.imaging.formats.webp.chunks.WebPChunkVP8L;
import org.apache.commons.imaging.formats.webp.chunks.WebPChunkVP8X;
import org.apache.commons.imaging.formats.webp.chunks.WebPChunkXMP;
import org.apache.commons.imaging.formats.webp.chunks.WebPChunkXYZW;

import java.io.IOException;

/**
 * @since 1.0-alpha4
 */
public enum WebPChunkType {

    /**
     * @see WebPChunkVP8
     */
    VP8(WebPChunkVP8::new),

    /**
     * @see WebPChunkVP8L
     */
    VP8L(WebPChunkVP8L::new),

    /**
     * @see WebPChunkVP8X
     */
    VP8X(WebPChunkVP8X::new),

    /**
     * @see WebPChunkANIM
     */
    ANIM(WebPChunkANIM::new),

    /**
     * @see WebPChunkANMF
     */
    ANMF(WebPChunkANMF::new),

    /**
     * @see WebPChunkICCP
     */
    ICCP(WebPChunkICCP::new),

    /**
     * @see WebPChunkEXIF
     */
    EXIF(WebPChunkEXIF::new),

    /**
     * @see WebPChunkXMP
     */
    XMP(WebPChunkXMP::new);

    private interface ChunkConstructor {
        WebPChunk make(int type, int size, byte[] bytes) throws IOException, ImagingException;
    }

    private static final WebPChunkType[] types = WebPChunkType.values();

    static WebPChunkType findType(int chunkType) {
        for (WebPChunkType type : types) {
            if (type.value == chunkType) {
                return type;
            }
        }
        return null;
    }

    static WebPChunk makeChunk(int chunkType, int size, byte[] bytes) throws IOException, ImagingException {
        WebPChunkType type = findType(chunkType);
        return type != null
                ? type.constructor.make(chunkType, size, bytes)
                : new WebPChunkXYZW(chunkType, size, bytes);
    }

    private final ChunkConstructor constructor;
    final int value;

    WebPChunkType(ChunkConstructor constructor) {
        this.constructor = constructor;
        this.value = BinaryFunctions.charsToQuad(
                name().length() == 4 ? name().charAt(3) : ' ',
                name().charAt(2), name().charAt(1), name().charAt(0)
        );
    }
}
