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

import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.formats.png.PngText;

public class PngChunkText extends PngTextChunk {

    private static final Logger LOGGER = Logger.getLogger(PngChunkText.class.getName());

    private final String keyword;
    private final String text;

    public PngChunkText(final int length, final int chunkType, final int crc, final byte[] bytes) throws ImagingException {
        super(length, chunkType, crc, bytes);
        final int index = findNull(bytes);
        if (index < 0) {
            throw new ImagingException("PNG tEXt chunk keyword is not terminated.");
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
    public PngText getContents() {
        return new PngText.Text(keyword, text);
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

}
