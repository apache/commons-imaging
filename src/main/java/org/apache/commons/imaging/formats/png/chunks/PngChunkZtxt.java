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
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.InflaterInputStream;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.formats.png.ChunkType;
import org.apache.commons.imaging.formats.png.PngConstants;
import org.apache.commons.imaging.formats.png.PngText;

public final class PngChunkZtxt extends PngTextChunk {

    public final String keyword;
    public final String text;
    
    PngChunkZtxt(ByteBuffer contents) throws ImageReadException {
        super(ChunkType.zTXt, contents);
        byte bytes[] = contents.array();
        
        int index = findNull(bytes);
        if (index < 0) {
            throw new ImageReadException(
                    "PNG zTXt chunk keyword is unterminated.");
        }

        this.keyword = new String(bytes, 0, index, StandardCharsets.ISO_8859_1);
        index++;

        final int compressionMethod = bytes[index++];
        if (compressionMethod != PngConstants.COMPRESSION_DEFLATE_INFLATE) {
            throw new ImageReadException(
                    "PNG zTXt chunk has unexpected compression method: "
                            + compressionMethod);
        }

        final int compressedTextLength = bytes.length - index;
        final byte[] compressedText = new byte[compressedTextLength];
        System.arraycopy(bytes, index, compressedText, 0, compressedTextLength);

        try {
            text = new String(getStreamBytes(
                    new InflaterInputStream(new ByteArrayInputStream(compressedText))),
                    StandardCharsets.ISO_8859_1);
        } catch (IOException ex) {
            throw new ImageReadException("Unresolved IOException while uncompressing "
                    + "zTXt chunk text");
        }
    }
    
    /**
     * @return Returns the keyword.
     */
    @Override
    public String getKeyword() {
        return keyword;
    }

    /**
     * @return Returns the text.
     */
    @Override
    public String getText() {
        return text;
    }

    @Override
    public PngText getContents() {
        return new PngText.Ztxt(keyword, text);
    }

}
