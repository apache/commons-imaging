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
package org.apache.commons.sanselan.formats.tiff.taginfos;

import java.io.UnsupportedEncodingException;

import org.apache.commons.sanselan.ImageReadException;
import org.apache.commons.sanselan.ImageWriteException;
import org.apache.commons.sanselan.common.BinaryFileFunctions;
import org.apache.commons.sanselan.formats.tiff.TiffField;
import org.apache.commons.sanselan.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.sanselan.formats.tiff.fieldtypes.FieldType;
import org.apache.commons.sanselan.util.Debug;

public final class TagInfoText extends TagInfo
{
    public TagInfoText(String name, int tag, FieldType dataType, int length,
            TiffDirectoryType exifDirectory)
    {
        super(name, tag, dataType, length, exifDirectory);
    }

    public boolean isText()
    {
        return true;
    }

    private static final class TextEncoding
    {
        public final byte prefix[];
        public final String encodingName;

        public TextEncoding(final byte[] prefix, final String encodingName)
        {
            this.prefix = prefix;
            this.encodingName = encodingName;
        }
    }

    private static final TagInfoText.TextEncoding TEXT_ENCODING_ASCII = new TextEncoding(
            new byte[]{
                    0x41, 0x53, 0x43, 0x49, 0x49, 0x00, 0x00, 0x00,
            }, "US-ASCII"); // ITU-T T.50 IA5
    private static final TagInfoText.TextEncoding TEXT_ENCODING_JIS = new TextEncoding(
            new byte[]{
                    0x4A, 0x49, 0x53, 0x00, 0x00, 0x00, 0x00, 0x00,
            }, "JIS"); // JIS X208-1990
    private static final TagInfoText.TextEncoding TEXT_ENCODING_UNICODE = new TextEncoding(
            new byte[]{
                    0x55, 0x4E, 0x49, 0x43, 0x4F, 0x44, 0x45, 0x00,
            // Which Unicode encoding to use, UTF-8?
            }, "UTF-8"); // Unicode Standard
    private static final TagInfoText.TextEncoding TEXT_ENCODING_UNDEFINED = new TextEncoding(
            new byte[]{
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
            // Try to interpret an undefined text as ISO-8859-1 (Latin)
            }, "ISO-8859-1"); // Undefined
    private static final TagInfoText.TextEncoding TEXT_ENCODINGS[] = {
            TEXT_ENCODING_ASCII, //
            TEXT_ENCODING_JIS, //
            TEXT_ENCODING_UNICODE, //
            TEXT_ENCODING_UNDEFINED, //
    };

    public byte[] encodeValue(FieldType fieldType, Object value,
            int byteOrder) throws ImageWriteException
    {
        if (!(value instanceof String))
            throw new ImageWriteException("Text value not String: " + value
                    + " (" + Debug.getType(value) + ")");
        String s = (String) value;

        try
        {
            // try ASCII, with NO prefix.
            byte asciiBytes[] = s
                    .getBytes(TEXT_ENCODING_ASCII.encodingName);
            String decodedAscii = new String(asciiBytes,
                    TEXT_ENCODING_ASCII.encodingName);
            if (decodedAscii.equals(s))
            {
                // no unicode/non-ascii values.
                byte result[] = new byte[asciiBytes.length
                        + TEXT_ENCODING_ASCII.prefix.length];
                System.arraycopy(TEXT_ENCODING_ASCII.prefix, 0, result, 0,
                        TEXT_ENCODING_ASCII.prefix.length);
                System.arraycopy(asciiBytes, 0, result,
                        TEXT_ENCODING_ASCII.prefix.length,
                        asciiBytes.length);
                return result;
            }
            else
            {
                // use unicode
                byte unicodeBytes[] = s
                        .getBytes(TEXT_ENCODING_UNICODE.encodingName);
                byte result[] = new byte[unicodeBytes.length
                        + TEXT_ENCODING_UNICODE.prefix.length];
                System.arraycopy(TEXT_ENCODING_UNICODE.prefix, 0, result,
                        0, TEXT_ENCODING_UNICODE.prefix.length);
                System.arraycopy(unicodeBytes, 0, result,
                        TEXT_ENCODING_UNICODE.prefix.length,
                        unicodeBytes.length);
                return result;
            }
        }
        catch (UnsupportedEncodingException e)
        {
            throw new ImageWriteException(e.getMessage(), e);
        }
    }

    public Object getValue(TiffField entry) throws ImageReadException
    {
        //            Debug.debug("entry.type", entry.type);
        //            Debug.debug("entry.type", entry.getDescriptionWithoutValue());
        //            Debug.debug("entry.type", entry.fieldType);

        if (entry.type == FIELD_TYPE_ASCII.type)
            return FIELD_TYPE_ASCII.getSimpleValue(entry);
        else if (entry.type == FIELD_TYPE_UNDEFINED.type)
        { /* do nothing */ }
        else if (entry.type == FIELD_TYPE_BYTE.type)
        { /* do nothing */ }
        else
        {
            Debug.debug("entry.type", entry.type);
            Debug.debug("entry.directoryType", entry.directoryType);
            Debug.debug("entry.type", entry.getDescriptionWithoutValue());
            Debug.debug("entry.type", entry.fieldType);
            throw new ImageReadException("Text field not encoded as bytes.");
        }

        byte bytes[] = entry.fieldType.getRawBytes(entry);
        if (bytes.length < 8)
        {
            try
            {
                // try ASCII, with NO prefix.
                return new String(bytes, "US-ASCII");
            }
            catch (UnsupportedEncodingException e)
            {
                throw new ImageReadException(
                        "Text field missing encoding prefix.");
            }
        }

        for (int i = 0; i < TEXT_ENCODINGS.length; i++)
        {
            TagInfoText.TextEncoding encoding = TEXT_ENCODINGS[i];
            if (BinaryFileFunctions.compareBytes(bytes, 0, encoding.prefix,
                    0, encoding.prefix.length))
            {
                try
                {
                    //                        Debug.debug("encodingName", encoding.encodingName);
                    return new String(bytes, encoding.prefix.length,
                            bytes.length - encoding.prefix.length,
                            encoding.encodingName);
                }
                catch (UnsupportedEncodingException e)
                {
                    throw new ImageReadException(e.getMessage(), e);
                }
            }
        }

        //                        Debug.debug("entry.tag", entry.tag + " (0x" + Integer.toHexString(entry.tag ) +")");
        //                        Debug.debug("entry.type", entry.type);
        //                        Debug.debug("bytes", bytes, 10);
        //            throw new ImageReadException(
        //                    "Unknown Text encoding prefix.");

        try
        {
            // try ASCII, with NO prefix.
            return new String(bytes, "US-ASCII");
        }
        catch (UnsupportedEncodingException e)
        {
            throw new ImageReadException("Unknown text encoding prefix.");
        }

    }
}