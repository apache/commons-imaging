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
import java.nio.charset.StandardCharsets;
import java.util.zip.InflaterInputStream;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.Allocator;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.formats.png.PngConstants;
import org.apache.commons.imaging.formats.png.PngText;

public class PngChunkItxt extends PngTextChunk {

    private final String keyword;
    private final String text;

    /**
     * The language tag defined in [RFC-3066] indicates the human language used
     * by the translated keyword and the text. Unlike the keyword, the language
     * tag is case-insensitive. It is an ISO 646.IRV:1991 [ISO 646] string
     * consisting of hyphen-separated words of 1-8 alphanumeric characters each
     * (for example cn, en-uk, no-bok, x-klingon, x-KlInGoN). If the first word
     * is two or three letters long, it is an ISO language code [ISO-639]. If
     * the language tag is empty, the language is unspecified.
     */
    private final String languageTag;

    private final String translatedKeyword;

    public PngChunkItxt(final int length, final int chunkType, final int crc, final byte[] bytes)
            throws ImagingException, IOException {
        super(length, chunkType, crc, bytes);
        int terminator = BinaryFunctions.findNull(bytes, "PNG iTXt chunk keyword is not terminated.");

        keyword = new String(bytes, 0, terminator, StandardCharsets.ISO_8859_1);
        int index = terminator + 1;

        final int compressionFlag = bytes[index++];
        if (compressionFlag != 0 && compressionFlag != 1) {
            throw new ImagingException("PNG iTXt chunk has invalid compression flag: " + compressionFlag);
        }

        final boolean compressed = compressionFlag == 1;

        final int compressionMethod = bytes[index++];
        if (compressed && compressionMethod != PngConstants.COMPRESSION_DEFLATE_INFLATE) {
            throw new ImagingException("PNG iTXt chunk has unexpected compression method: " + compressionMethod);
        }

        terminator = BinaryFunctions.findNull(bytes, index, "PNG iTXt chunk language tag is not terminated.");
        languageTag = new String(bytes, index, terminator - index, StandardCharsets.ISO_8859_1);
        index = terminator + 1;

        terminator = BinaryFunctions.findNull(bytes, index, "PNG iTXt chunk translated keyword is not terminated.");
        translatedKeyword = new String(bytes, index, terminator - index, StandardCharsets.UTF_8);
        index = terminator + 1;

        if (compressed) {
            final int compressedTextLength = bytes.length - index;

            final byte[] compressedText = Allocator.byteArray(compressedTextLength);
            System.arraycopy(bytes, index, compressedText, 0, compressedTextLength);

            text = new String(BinaryFunctions.toByteArray(new InflaterInputStream(new ByteArrayInputStream(compressedText))), StandardCharsets.UTF_8);

        } else {
            text = new String(bytes, index, bytes.length - index, StandardCharsets.UTF_8);
        }
    }

    @Override
    public PngText getContents() {
        return new PngText.Itxt(keyword, text, languageTag, translatedKeyword);
    }

    /**
     * @return Gets the keyword.
     */
    @Override
    public String getKeyword() {
        return keyword;
    }

    /**
     * @return Gets the text.
     */
    @Override
    public String getText() {
        return text;
    }

    public String getTranslatedKeyword() {
        return translatedKeyword;
    }
}
