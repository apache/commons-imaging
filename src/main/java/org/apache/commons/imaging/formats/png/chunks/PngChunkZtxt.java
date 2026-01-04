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
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.zip.InflaterInputStream;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.Allocator;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.formats.png.AbstractPngText;
import org.apache.commons.imaging.formats.png.PngConstants;
import org.apache.commons.io.IOUtils;

/**
 * PNG zTXt chunk with compressed textual data.
 */
public final class PngChunkZtxt extends AbstractPngTextChunk {

    private final String keyword;
    private final String text;

    /**
     * Constructs a PNG zTXt chunk.
     *
     * @param length the chunk length.
     * @param chunkType the chunk type.
     * @param crc the CRC.
     * @param bytes the chunk bytes.
     * @throws ImagingException if the chunk is corrupt.
     * @throws IOException if an I/O error occurs.
     */
    public PngChunkZtxt(final int length, final int chunkType, final int crc, final byte[] bytes) throws ImagingException, IOException {
        super(length, chunkType, crc, bytes);

        int index = BinaryFunctions.indexOf0(bytes, "PNG zTXt chunk keyword is unterminated.");
        keyword = new String(bytes, 0, index, StandardCharsets.ISO_8859_1);
        index++;

        final int compressionMethod = bytes[index++];
        if (compressionMethod != PngConstants.COMPRESSION_DEFLATE_INFLATE) {
            throw new ImagingException("PNG zTXt chunk has unexpected compression method: " + compressionMethod);
        }

        final int compressedTextLength = bytes.length - index;
        final byte[] compressedText = Allocator.byteArray(compressedTextLength);
        System.arraycopy(bytes, index, compressedText, 0, compressedTextLength);

        text = new String(IOUtils.toByteArray(new InflaterInputStream(new ByteArrayInputStream(compressedText))), StandardCharsets.ISO_8859_1);
    }

    @Override
    public AbstractPngText getContents() {
        return new AbstractPngText.Ztxt(keyword, text);
    }

    /**
     * Gets the keyword.
     *
     * @return the keyword.
     */
    @Override
    public String getKeyword() {
        return keyword;
    }

    /**
     * Gets the text.
     *
     * @return the text.
     */
    @Override
    public String getText() {
        return text;
    }

}
