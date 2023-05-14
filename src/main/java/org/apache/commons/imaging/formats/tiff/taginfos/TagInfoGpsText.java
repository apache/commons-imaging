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
package org.apache.commons.imaging.formats.tiff.taginfos;

import java.io.UnsupportedEncodingException;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.Allocator;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType;
import org.apache.commons.imaging.internal.Debug;

/**
 * Used by some GPS tags and the EXIF user comment tag,
 * this badly documented value is meant to contain
 * the text encoding in the first 8 bytes followed by
 * the non-null-terminated text in an unknown byte order.
 */
public final class TagInfoGpsText extends TagInfo {
    private static final class TextEncoding {
        final byte[] prefix;
        public final String encodingName;

        TextEncoding(final byte[] prefix, final String encodingName) {
            this.prefix = prefix;
            this.encodingName = encodingName;
        }
    }
    private static final TagInfoGpsText.TextEncoding TEXT_ENCODING_ASCII = new TextEncoding(
            new byte[] { 0x41, 0x53, 0x43, 0x49, 0x49, 0x00, 0x00, 0x00, },
            "US-ASCII"); // ITU-T T.50 IA5
    private static final TagInfoGpsText.TextEncoding TEXT_ENCODING_JIS = new TextEncoding(
            new byte[] { 0x4A, 0x49, 0x53, 0x00, 0x00, 0x00, 0x00, 0x00, },
            "JIS"); // JIS X208-1990
    private static final TagInfoGpsText.TextEncoding TEXT_ENCODING_UNICODE_LE = new TextEncoding(
            new byte[] { 0x55, 0x4E, 0x49, 0x43, 0x4F, 0x44, 0x45, 0x00},
            "UTF-16LE"); // Unicode Standard
    private static final TagInfoGpsText.TextEncoding TEXT_ENCODING_UNICODE_BE = new TextEncoding(
            new byte[] { 0x55, 0x4E, 0x49, 0x43, 0x4F, 0x44, 0x45, 0x00},
            "UTF-16BE"); // Unicode Standard
    private static final TagInfoGpsText.TextEncoding TEXT_ENCODING_UNDEFINED = new TextEncoding(
            new byte[] { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
            // Try to interpret an undefined text as ISO-8859-1 (Latin)
            "ISO-8859-1"); // Undefined

    private static final TagInfoGpsText.TextEncoding[] TEXT_ENCODINGS = {
            TEXT_ENCODING_ASCII, //
            TEXT_ENCODING_JIS, //
            TEXT_ENCODING_UNICODE_LE, //
            TEXT_ENCODING_UNICODE_BE, //
            TEXT_ENCODING_UNDEFINED, //
    };

    public TagInfoGpsText(final String name, final int tag,
            final TiffDirectoryType exifDirectory) {
        super(name, tag, FieldType.UNDEFINED, LENGTH_UNKNOWN, exifDirectory);
    }

    @Override
    public byte[] encodeValue(final FieldType fieldType, final Object value, final ByteOrder byteOrder)
            throws ImagingException {
        if (!(value instanceof String)) {
            throw new ImagingException("GPS text value not String", value);
        }
        final String s = (String) value;

        try {
            // try ASCII, with NO prefix.
            final byte[] asciiBytes = s.getBytes(TEXT_ENCODING_ASCII.encodingName);
            final String decodedAscii = new String(asciiBytes, TEXT_ENCODING_ASCII.encodingName);
            if (decodedAscii.equals(s)) {
                // no unicode/non-ascii values.
                final byte[] result = Allocator.byteArray(asciiBytes.length + TEXT_ENCODING_ASCII.prefix.length);
                System.arraycopy(TEXT_ENCODING_ASCII.prefix, 0, result, 0, TEXT_ENCODING_ASCII.prefix.length);
                System.arraycopy(asciiBytes, 0, result, TEXT_ENCODING_ASCII.prefix.length, asciiBytes.length);
                return result;
            }
            // use Unicode
            final TextEncoding encoding;
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                encoding = TEXT_ENCODING_UNICODE_BE;
            } else {
                encoding = TEXT_ENCODING_UNICODE_LE;
            }
            final byte[] unicodeBytes = s.getBytes(encoding.encodingName);
            final byte[] result = Allocator.byteArray(unicodeBytes.length + encoding.prefix.length);
            System.arraycopy(encoding.prefix, 0, result, 0, encoding.prefix.length);
            System.arraycopy(unicodeBytes, 0, result, encoding.prefix.length, unicodeBytes.length);
            return result;
        } catch (final UnsupportedEncodingException e) {
            throw new ImagingException(e.getMessage(), e);
        }
    }

    @Override
    public String getValue(final TiffField entry) throws ImagingException {
        if (entry.getFieldType() == FieldType.ASCII) {
            final Object object = FieldType.ASCII.getValue(entry);
            if (object instanceof String) {
                return (String) object;
            }
            if (object instanceof String[]) {
                // Use of arrays with the ASCII type
                // should be extremely rare, and use of
                // ASCII type in GPS fields should be
                // forbidden. So assume the 2 never happen
                // together and return incomplete strings if they do.
                return ((String[]) object)[0];
            }
            throw new ImagingException("Unexpected ASCII type decoded");
        }
        if (entry.getFieldType() == FieldType.UNDEFINED) {
            /* later */
        } else if (entry.getFieldType() == FieldType.BYTE) {
            /* later */
        } else {
            Debug.debug("entry.type: " + entry.getFieldType());
            Debug.debug("entry.directoryType: " + entry.getDirectoryType());
            Debug.debug("entry.type: " + entry.getDescriptionWithoutValue());
            Debug.debug("entry.type: " + entry.getFieldType());
            throw new ImagingException("GPS text field not encoded as bytes.");
        }

        final byte[] bytes = entry.getByteArrayValue();
        if (bytes.length < 8) {
            // try ASCII, with NO prefix.
            return new String(bytes, StandardCharsets.US_ASCII);
        }

        for (final TextEncoding encoding : TEXT_ENCODINGS) {
            if (BinaryFunctions.compareBytes(bytes, 0, encoding.prefix, 0,
                    encoding.prefix.length)) {
                try {
                    final String decodedString = new String(
                            bytes, encoding.prefix.length,
                            bytes.length - encoding.prefix.length,
                            encoding.encodingName);
                    final byte[] reEncodedBytes = decodedString.getBytes(
                            encoding.encodingName);
                    if (BinaryFunctions.compareBytes(bytes, encoding.prefix.length,
                            reEncodedBytes, 0,
                            reEncodedBytes.length)) {
                        return decodedString;
                    }
                } catch (final UnsupportedEncodingException e) {
                    throw new ImagingException(e.getMessage(), e);
                }
            }
        }

        // try ASCII, with NO prefix.
        return new String(bytes, StandardCharsets.US_ASCII);
    }

    @Override
    public boolean isText() {
        return true;
    }
}
