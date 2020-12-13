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

import static org.apache.commons.imaging.common.BinaryFunctions.findNull;
import static org.apache.commons.imaging.common.BinaryFunctions.getStreamBytes;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.InflaterInputStream;

import org.apache.commons.imaging.ImageReadException;

/**
 * The PNG iCCP chunk. If "present, the image samples conform to the color space represented by the embedded ICC
 * profile as defined by the International Color Consortium".
 *
 * @see <a href="http://www.libpng.org/pub/png/spec/1.2/PNG-Chunks.html">PNG Specification</a>
 */
public class PngChunkIccp extends PngChunk {

    /*
     * Logger.
     */
    private static final Logger LOGGER = Logger.getLogger(PngChunkIccp.class.getName());

    /**
     * ICC profile name.
     */
    public final String profileName;
    /**
     * Compression method.
     */
    public final int compressionMethod;
    /**
     * Compressed profile data.
     */
    private final byte[] compressedProfile;
    /**
     * Uncompressed profile data.
     */
    private final byte[] uncompressedProfile;

    /**
     * Constructor.
     * @param length chunk length
     * @param chunkType chunk type
     * @param crc CRC computed over the chunk type and chunk data (but not the length)
     * @param bytes chunk data bytes
     * @throws ImageReadException when no profile name is present
     * @throws IOException when an error happens while reading the profile data
     */
    public PngChunkIccp(
            final int length, final int chunkType, final int crc, final byte[] bytes)
            throws ImageReadException, IOException {
        super(length, chunkType, crc, bytes);

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

        if (LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.finest("ProfileName: " + profileName);
            LOGGER.finest("ProfileName.length(): " + profileName.length());
            LOGGER.finest("CompressionMethod: " + compressionMethod);
            LOGGER.finest("CompressedProfileLength: " + compressedProfileLength);
            LOGGER.finest("bytes.length: " + bytes.length);
        }

        uncompressedProfile = getStreamBytes(new InflaterInputStream(new ByteArrayInputStream(compressedProfile)));

        if (LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.finest("UncompressedProfile: " + bytes.length);
        }
    }

    /**
     * Return a copy of the uncompressed profile data.
     * @return the uncompressed profile data
     */
    public byte[] getUncompressedProfile() {
        return uncompressedProfile.clone();
    }

}
