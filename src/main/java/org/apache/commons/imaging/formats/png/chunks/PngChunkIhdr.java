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

public class PngChunkIhdr extends PngChunk {
    public final int width;
    public final int height;
    public final int bitDepth;
    public final int colorType;
    public final int compressionMethod;
    public final int filterMethod;
    public final int interlaceMethod;

    public PngChunkIhdr(int Length, int ChunkType, int CRC, byte bytes[])
            throws IOException {
        super(Length, ChunkType, CRC, bytes);

        ByteArrayInputStream is = new ByteArrayInputStream(bytes);
        width = read4Bytes("Width", is, "Not a Valid Png File: IHDR Corrupt");
        height = read4Bytes("Height", is, "Not a Valid Png File: IHDR Corrupt");
        bitDepth = readByte("BitDepth", is,
                "Not a Valid Png File: IHDR Corrupt");
        colorType = readByte("ColorType", is,
                "Not a Valid Png File: IHDR Corrupt");
        compressionMethod = readByte("CompressionMethod", is,
                "Not a Valid Png File: IHDR Corrupt");
        filterMethod = readByte("FilterMethod", is,
                "Not a Valid Png File: IHDR Corrupt");
        interlaceMethod = readByte("InterlaceMethod", is,
                "Not a Valid Png File: IHDR Corrupt");
    }
}
