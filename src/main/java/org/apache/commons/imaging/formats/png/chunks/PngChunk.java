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
package org.apache.commons.imaging.formats.png.chunks;

import java.io.ByteArrayInputStream;

import org.apache.commons.imaging.common.BinaryFileParser;

public class PngChunk extends BinaryFileParser {
    public final int length;
    public final int chunkType;
    public final int crc;
    private final byte[] bytes;

    private final boolean[] propertyBits;
    public final boolean ancillary;
    public final boolean isPrivate;
    public final boolean reserved;
    public final boolean safeToCopy;

    public PngChunk(final int length, final int chunkType, final int crc, final byte[] bytes) {
        this.length = length;
        this.chunkType = chunkType;
        this.crc = crc;
        this.bytes = bytes; // TODO clone?

        propertyBits = new boolean[4];
        int shift = 24;
        for (int i = 0; i < 4; i++) {
            final int theByte = 0xff & (chunkType >> shift);
            shift -= 8;
            final int theMask = 1 << 5;
            propertyBits[i] = ((theByte & theMask) > 0);
        }

        ancillary = propertyBits[0];
        isPrivate = propertyBits[1];
        reserved = propertyBits[2];
        safeToCopy = propertyBits[3];
    }

    public byte[] getBytes() {
        return bytes; // TODO clone?
    }

    public boolean[] getPropertyBits() {
        return propertyBits.clone();
    }

    protected ByteArrayInputStream getDataStream() {
        return new ByteArrayInputStream(getBytes());
    }

}
