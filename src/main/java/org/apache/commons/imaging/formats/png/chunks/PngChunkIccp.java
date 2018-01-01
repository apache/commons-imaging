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
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.zip.InflaterInputStream;

import org.apache.commons.imaging.ImageReadException;

import static org.apache.commons.imaging.common.BinaryFunctions.*;

public class PngChunkIccp extends PngChunk {
    // private final PngImageParser parser;
    public final String profileName;
    public final int compressionMethod;
    private final byte[] compressedProfile;
    private final byte[] uncompressedProfile;

    public byte[] getUncompressedProfile() {
        return uncompressedProfile; // TODO clone?
    }

    public PngChunkIccp(
    // PngImageParser parser,
            final int length, final int chunkType, final int crc, final byte[] bytes)
            throws ImageReadException, IOException {
        super(length, chunkType, crc, bytes);
        // this.parser = parser;

        final int index = findNull(bytes);
        if (index < 0) {
            throw new ImageReadException("PngChunkIccp: No Profile Name");
        }
        final byte[] nameBytes = new byte[index];
        System.arraycopy(bytes, 0, nameBytes, 0, index);
        profileName = new String(nameBytes, StandardCharsets.ISO_8859_1);

        compressionMethod = bytes[index + 1];

        final int compressedProfileLength = bytes.length - (index + 1 + 1);
        compressedProfile = new byte[compressedProfileLength];
        System.arraycopy(bytes, index + 1 + 1, compressedProfile, 0, compressedProfileLength);

        if (getDebug()) {
            System.out.println("ProfileName: " + profileName);
            System.out.println("ProfileName.length(): " + profileName.length());
            System.out.println("CompressionMethod: " + compressionMethod);
            System.out.println("CompressedProfileLength: " + compressedProfileLength);
            System.out.println("bytes.length: " + bytes.length);
        }

        uncompressedProfile = getStreamBytes(new InflaterInputStream(new ByteArrayInputStream(compressedProfile)));

        if (getDebug()) {
            System.out.println("UncompressedProfile: " + Integer.toString(bytes.length));
        }
    }

}
