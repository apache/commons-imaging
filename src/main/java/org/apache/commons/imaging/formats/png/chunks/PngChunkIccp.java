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
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.InflaterInputStream;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.formats.png.ChunkType;

public final class PngChunkIccp extends PngChunk {

    private static final Logger LOGGER = Logger.getLogger(PngChunkIccp.class.getName());

    public final String profileName;
    public final int compressionMethod;
    private final byte[] compressedProfile;
    private final byte[] uncompressedProfile;

    public byte[] getUncompressedProfile() {
        return uncompressedProfile; // TODO clone?
    }

    PngChunkIccp(ByteBuffer contents) throws ImageReadException {
        super(ChunkType.iCCP, contents);
        
        final int nullIdx = BinaryFunctions.findNull(contents.array());
        if(nullIdx < 0) {
            throw new ImageReadException("PNG Component: iCCP chunk contains "
                    + "illegal (none at all) profile name");
        }
        
        final byte[] nameBytes = new byte[nullIdx];
        System.arraycopy(contents.array(), 0, nameBytes, 0, nullIdx);
        this.profileName = new String(nameBytes, StandardCharsets.ISO_8859_1);
        this.compressionMethod = contents.get(nullIdx + 1);
        
        final int compressedProfileLength = contentSize() - (nullIdx + 1 + 1);
        this.compressedProfile = new byte[compressedProfileLength];
        System.arraycopy(contents.array(), nullIdx + 1 + 1, compressedProfile,
                0, compressedProfileLength);
        
        try {
            uncompressedProfile = BinaryFunctions.getStreamBytes(
                    new InflaterInputStream(new ByteArrayInputStream(compressedProfile)));
        } catch (IOException ex) {
            throw new ImageReadException("Unresolved IOException while uncompressed "
                    + "iCCP chunk profile content");
        }
        
        if (LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.log(Level.FINEST, "ProfileName: {0}", profileName);
            LOGGER.log(Level.FINEST, "ProfileName.length(): {0}", profileName.length());
            LOGGER.log(Level.FINEST, "CompressionMethod: {0}", compressionMethod);
            LOGGER.log(Level.FINEST, "CompressedProfileLength: {0}", compressedProfileLength);
            LOGGER.log(Level.FINEST, "contents.capacity(): {0}", contents.capacity());
            LOGGER.log(Level.FINEST, "UncompressedProfile: {0}",
                    Integer.toString(contents.capacity()));
        }
    }

}
