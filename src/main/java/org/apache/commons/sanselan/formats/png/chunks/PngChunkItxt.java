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
package org.apache.commons.sanselan.formats.png.chunks;

import java.io.IOException;

import org.apache.commons.sanselan.ImageReadException;
import org.apache.commons.sanselan.common.ZLibUtils;
import org.apache.commons.sanselan.formats.png.PngConstants;
import org.apache.commons.sanselan.formats.png.PngText;

public class PngChunkItxt extends PngTextChunk
{
    public final String keyword, text;

    /*
     * The language tag defined in [RFC-3066] indicates the human language used
     * by the translated keyword and the text. Unlike the keyword, the language
     * tag is case-insensitive. It is an ISO 646.IRV:1991 [ISO 646] string
     * consisting of hyphen-separated words of 1-8 alphanumeric characters each
     * (for example cn, en-uk, no-bok, x-klingon, x-KlInGoN). If the first word
     * is two or three letters long, it is an ISO language code [ISO-639]. If
     * the language tag is empty, the language is unspecified.
     */
    public final String languageTag;

    public final String translatedKeyword;

    public PngChunkItxt(int length, int chunkType, int crc, byte bytes[])
            throws ImageReadException, IOException
    {
        super(length, chunkType, crc, bytes);
        {
            int terminator = findNull(bytes);
            if (terminator < 0)
                throw new ImageReadException(
                        "PNG iTXt chunk keyword is not terminated.");

            keyword = new String(bytes, 0, terminator, "ISO-8859-1");
            int index = terminator + 1;

            int compressionFlag = bytes[index++];
            if (compressionFlag != 0 && compressionFlag != 1)
                throw new ImageReadException(
                        "PNG iTXt chunk has invalid compression flag: "
                                + compressionFlag);

            boolean compressed = compressionFlag == 1;

            int compressionMethod = bytes[index++];
            if (compressed)
                if (compressionMethod != PngConstants.COMPRESSION_DEFLATE_INFLATE)
                    throw new ImageReadException(
                            "PNG iTXt chunk has unexpected compression method: "
                                    + compressionMethod);
                else if (compressionMethod != 0)
                    throw new ImageReadException(
                            "PNG iTXt chunk has unexpected compression method: "
                                    + compressionMethod);

            terminator = findNull(bytes, index);
            if (terminator < 0)
                throw new ImageReadException(
                        "PNG iTXt chunk language tag is not terminated.");

            languageTag = new String(bytes, index, terminator - index,
                    "ISO-8859-1");
            index = terminator + 1;

            terminator = findNull(bytes, index);
            if (terminator < 0)
                throw new ImageReadException(
                        "PNG iTXt chunk translated keyword is not terminated.");

            translatedKeyword = new String(bytes, index, terminator - index,
                    "utf-8");
            index = terminator + 1;

            if (compressed)
            {
                int compressedTextLength = bytes.length - index;

                byte compressedText[] = new byte[compressedTextLength];
                System.arraycopy(bytes, index, compressedText, 0,
                        compressedTextLength);

                text = new String(new ZLibUtils().inflate(compressedText),
                        "utf-8");

            } else
                text = new String(bytes, index, bytes.length - index, "utf-8");
        }
    }

    /**
     * @return Returns the keyword.
     */
    @Override
    public String getKeyword()
    {
        return keyword;
    }

    /**
     * @return Returns the text.
     */
    @Override
    public String getText()
    {
        return text;
    }

    @Override
    public PngText getContents()
    {
        return new PngText.iTXt(keyword, text, languageTag, translatedKeyword);
    }
}