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

import java.io.IOException;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.ZLibUtils;

public class PngChunkIccp extends PngChunk {
    // private final PngImageParser parser;
    public final String ProfileName;
    public final int CompressionMethod;
    public final byte CompressedProfile[];
    public final byte UncompressedProfile[];

    public PngChunkIccp(
    // PngImageParser parser,
            int Length, int ChunkType, int CRC, byte bytes[])
            throws ImageReadException, IOException {
        super(Length, ChunkType, CRC, bytes);
        // this.parser = parser;

        {
            int index = findNull(bytes);
            if (index < 0)
                throw new ImageReadException("PngChunkIccp: No Profile Name");
            byte name_bytes[] = new byte[index];
            System.arraycopy(bytes, 0, name_bytes, 0, index);
            ProfileName = new String(name_bytes, "ISO-8859-1");

            CompressionMethod = bytes[index + 1];

            int CompressedProfileLength = bytes.length - (index + 1 + 1);
            CompressedProfile = new byte[CompressedProfileLength];
            System.arraycopy(bytes, index + 1 + 1, CompressedProfile, 0,
                    CompressedProfileLength);

            if (getDebug()) {
                System.out.println("ProfileName: " + ProfileName);
                System.out.println("ProfileName.length(): "
                        + ProfileName.length());
                System.out.println("CompressionMethod: " + CompressionMethod);
                System.out.println("CompressedProfileLength: "
                        + CompressedProfileLength);
                System.out.println("bytes.length: " + bytes.length);
            }

            UncompressedProfile = new ZLibUtils().inflate(CompressedProfile);

            if (getDebug()) {
                System.out.println("UncompressedProfile: "
                        + ((UncompressedProfile == null) ? "null" : ""
                                + bytes.length));
            }

        }
    }

}
