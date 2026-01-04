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

import static org.apache.commons.imaging.common.BinaryFunctions.read4Bytes;
import static org.apache.commons.imaging.common.BinaryFunctions.readByte;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.formats.png.InterlaceMethod;
import org.apache.commons.imaging.formats.png.PngColorType;

/**
 * PNG IHDR chunk with image header.
 */
public final class PngChunkIhdr extends PngChunk {

    private final int width;
    private final int height;
    private final int bitDepth;
    private final PngColorType pngColorType;
    private final int compressionMethod;
    private final int filterMethod;
    private final InterlaceMethod interlaceMethod;

    /**
     * Constructs a PNG IHDR chunk.
     *
     * @param length the chunk length.
     * @param chunkType the chunk type.
     * @param crc the CRC.
     * @param bytes the chunk bytes.
     * @throws ImagingException if the chunk is corrupt.
     * @throws IOException if an I/O error occurs.
     */
    public PngChunkIhdr(final int length, final int chunkType, final int crc, final byte[] bytes) throws ImagingException, IOException {
        super(length, chunkType, crc, bytes);

        final ByteArrayInputStream is = new ByteArrayInputStream(bytes);
        width = read4Bytes("Width", is, "Not a Valid PNG File: IHDR Corrupt", getByteOrder());
        height = read4Bytes("Height", is, "Not a Valid PNG File: IHDR Corrupt", getByteOrder());
        bitDepth = readByte("BitDepth", is, "Not a Valid PNG File: IHDR Corrupt");
        final int type = readByte("ColorType", is, "Not a Valid PNG File: IHDR Corrupt");
        pngColorType = PngColorType.getColorType(type);
        if (getPngColorType() == null) {
            throw new ImagingException("PNG: unknown color type: " + type);
        }
        compressionMethod = readByte("CompressionMethod", is, "Not a Valid PNG File: IHDR Corrupt");
        filterMethod = readByte("FilterMethod", is, "Not a Valid PNG File: IHDR Corrupt");
        final int method = readByte("InterlaceMethod", is, "Not a Valid PNG File: IHDR Corrupt");
        if (method < 0 || method >= InterlaceMethod.values().length) {
            throw new ImagingException("PNG: unknown interlace method: " + method);
        }
        interlaceMethod = InterlaceMethod.values()[method];
    }

    /**
     * Gets the bit depth.
     *
     * @return the bit depth.
     */
    public int getBitDepth() {
        return bitDepth;
    }

    /**
     * Gets the compression method.
     *
     * @return the compression method.
     */
    public int getCompressionMethod() {
        return compressionMethod;
    }

    /**
     * Gets the filter method.
     *
     * @return the filter method.
     */
    public int getFilterMethod() {
        return filterMethod;
    }

    /**
     * Gets the image height.
     *
     * @return the height.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Gets the interlace method.
     *
     * @return the interlace method.
     */
    public InterlaceMethod getInterlaceMethod() {
        return interlaceMethod;
    }

    /**
     * Gets the PNG color type.
     *
     * @return the PNG color type.
     */
    public PngColorType getPngColorType() {
        return pngColorType;
    }

    /**
     * Gets the image width.
     *
     * @return the width.
     */
    public int getWidth() {
        return width;
    }
}
