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

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.formats.png.ChunkType;
import org.apache.commons.imaging.formats.png.PngText;

public final class PngChunkText extends PngTextChunk {

    private static final Logger LOGGER = Logger.getLogger(PngChunkText.class.getName());

    public final String keyword;
    public final String text;
    
    PngChunkText(ByteBuffer contents) throws ImageReadException {
        super(ChunkType.tEXt, contents);
        final int nullIdx = BinaryFunctions.findNull(contents.array());
        if(nullIdx < 0) {
            throw new ImageReadException("PNG Component: "
                    + "tEXT chunk keyword is not terminated.");
        }
        
        this.keyword = new String(contents.array(), 0, nullIdx, StandardCharsets.ISO_8859_1);
        final int textLength = contentSize() - (nullIdx + 1);
        this.text = new String(contents.array(), nullIdx + 1, textLength,
                StandardCharsets.ISO_8859_1);
        
        if(LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.log(Level.FINEST, "Keyword: {0}", keyword);
            LOGGER.log(Level.FINEST, "Text: {0}", text);
        }
    }

    public PngChunkText(final int length, final int chunkType, final int crc, final byte[] bytes)
            throws ImageReadException, IOException {
        super(length, chunkType, crc, bytes);
        final int index = findNull(bytes);
        if (index < 0) {
            throw new ImageReadException(
                    "PNG tEXt chunk keyword is not terminated.");
        }

        keyword = new String(bytes, 0, index, StandardCharsets.ISO_8859_1);

        final int textLength = bytes.length - (index + 1);
        text = new String(bytes, index + 1, textLength, StandardCharsets.ISO_8859_1);

        if (LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.finest("Keyword: " + keyword);
            LOGGER.finest("Text: " + text);
        }
    }

    @Override
    public String getKeyword() {
        return keyword;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public PngText getContents() {
        return new PngText.Text(keyword, text);
    }

}
