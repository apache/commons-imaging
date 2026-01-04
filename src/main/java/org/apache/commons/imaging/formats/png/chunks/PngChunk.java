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
package org.apache.commons.imaging.formats.png.chunks;

import java.io.ByteArrayInputStream;
import java.util.Objects;

import org.apache.commons.imaging.common.BinaryFileParser;

/**
 * A PNG image is composed of several chunks. This is the base class for the chunks, used by the parser.
 *
 * @see <a href="https://en.wikipedia.org/wiki/Portable_Network_Graphics#%22Chunks%22_within_the_file">Portable_Network_Graphics</a>
 */
public class PngChunk extends BinaryFileParser {

    private final int length;
    private final int chunkType;
    private final int crc;
    private final byte[] bytes;

    private final boolean[] propertyBits;
    private final boolean ancillary;
    private final boolean isPrivate;
    private final boolean reserved;
    private final boolean safeToCopy;

    /**
     * Constructs a new instance.
     *
     * @param length    chunk length.
     * @param chunkType chunk type.
     * @param crc       CRC computed over the chunk type and chunk data (but not the length).
     * @param bytes     chunk data bytes.
     * @throws NullPointerException if {@code bytes} is null.
     */
    public PngChunk(final int length, final int chunkType, final int crc, final byte[] bytes) {
        this.bytes = Objects.requireNonNull(bytes, "bytes").clone();
        this.length = length;
        this.chunkType = chunkType;
        this.crc = crc;

        propertyBits = new boolean[4];
        int shift = 24;
        final int theMask = 1 << 5;
        for (int i = 0; i < propertyBits.length; i++) {
            final int theByte = 0xff & chunkType >> shift;
            shift -= 8;
            propertyBits[i] = (theByte & theMask) > 0;
        }

        ancillary = propertyBits[0];
        isPrivate = propertyBits[1];
        reserved = propertyBits[2];
        safeToCopy = propertyBits[3];
    }

    /**
     * Gets a copy of the chunk bytes.
     *
     * @return the chunk bytes
     */
    public byte[] getBytes() {
        return bytes.clone();
    }

    /**
     * Gets the chunk type.
     *
     * @return the chunk type.
     */
    public int getChunkType() {
        return chunkType;
    }

    /**
     * Gets the CRC value.
     *
     * @return the CRC.
     */
    public int getCrc() {
        return crc;
    }

    /**
     * Gets a new {@link ByteArrayInputStream} for the chunk bytes.
     *
     * <p>
     * The caller is responsible for closing the resource.
     * </p>
     *
     * @return a ByteArrayInputStream for the chunk bytes
     */
    protected ByteArrayInputStream getDataStream() {
        return new ByteArrayInputStream(bytes);
    }

    /**
     * Gets the chunk length.
     *
     * @return the length.
     */
    public int getLength() {
        return length;
    }

    /**
     * Gets a copy of the chunk property bits.
     *
     * @return the chunk property bits
     */
    public boolean[] getPropertyBits() {
        return propertyBits.clone();
    }

    /**
     * Checks if this is an ancillary chunk.
     *
     * @return true if ancillary, false otherwise.
     */
    public boolean isAncillary() {
        return ancillary;
    }

    /**
     * Checks if this is a private chunk.
     *
     * @return true if private, false otherwise.
     */
    public boolean isPrivate() {
        return isPrivate;
    }

    /**
     * Checks if this chunk is reserved.
     *
     * @return true if reserved, false otherwise.
     */
    public boolean isReserved() {
        return reserved;
    }

    /**
     * Checks if this chunk is safe to copy.
     *
     * @return true if safe to copy, false otherwise.
     */
    public boolean isSafeToCopy() {
        return safeToCopy;
    }

}
