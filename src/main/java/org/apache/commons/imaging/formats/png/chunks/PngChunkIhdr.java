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

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.formats.png.PngColorType;
import org.apache.commons.imaging.formats.png.InterlaceMethod;

import static org.apache.commons.imaging.common.BinaryFunctions.*;

public class PngChunkIhdr extends PngChunk {
    public final int width;
    public final int height;
    public final int bitDepth;
    public final PngColorType pngColorType;
    public final int compressionMethod;
    public final int filterMethod;
    public final InterlaceMethod interlaceMethod;

    public PngChunkIhdr(final int length, final int chunkType, final int crc, final byte[] bytes) throws ImageReadException, IOException {
        super(length, chunkType, crc, bytes);

        final ByteArrayInputStream is = new ByteArrayInputStream(bytes);
        width = read4Bytes("Width", is, "Not a Valid Png File: IHDR Corrupt", getByteOrder());
        height = read4Bytes("Height", is, "Not a Valid Png File: IHDR Corrupt", getByteOrder());
        bitDepth = readByte("BitDepth", is, "Not a Valid Png File: IHDR Corrupt");
        final int type = readByte("ColorType", is, "Not a Valid Png File: IHDR Corrupt");
        pngColorType = PngColorType.getColorType(type);
        if (pngColorType == null) {
            throw new ImageReadException("PNG: unknown color type: " + type);
        }
        compressionMethod = readByte("CompressionMethod", is, "Not a Valid Png File: IHDR Corrupt");
        filterMethod = readByte("FilterMethod", is, "Not a Valid Png File: IHDR Corrupt");
        final int method = readByte("InterlaceMethod", is, "Not a Valid Png File: IHDR Corrupt");
        if (method < 0 && method >= InterlaceMethod.values().length) {
            throw new ImageReadException("PNG: unknown interlace method: " + method);
        }
        interlaceMethod = InterlaceMethod.values()[method];
    }
}
