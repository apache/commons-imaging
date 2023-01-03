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

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType;

/**
 * Windows XP onwards store some tags using UTF-16LE, but the field type is byte
 * - here we deal with this.
 */
public class TagInfoXpString extends TagInfo {
    public TagInfoXpString(final String name, final int tag, final TiffDirectoryType directoryType) {
        super(name, tag, FieldType.BYTE, LENGTH_UNKNOWN, directoryType);
    }

    @Override
    public byte[] encodeValue(final FieldType fieldType, final Object value, final ByteOrder byteOrder)
            throws ImageWriteException {
        if (!(value instanceof String)) {
            throw new ImageWriteException("Text value not String", value);
        }
        final String s = (String) value;
        final byte[] bytes = s.getBytes(StandardCharsets.UTF_16LE);
        return Arrays.copyOf(bytes, bytes.length + 2);
    }

    @Override
    public String getValue(final TiffField entry) throws ImageReadException {
        if (entry.getFieldType() != FieldType.BYTE) {
            throw new ImageReadException("Text field not encoded as bytes.");
        }
        final byte[] bytes = entry.getByteArrayValue();
        final int length;
        if (bytes.length >= 2 && bytes[bytes.length - 1] == 0 && bytes[bytes.length - 2] == 0) {
            length = bytes.length - 2;
        } else {
            length = bytes.length;
        }
        return new String(bytes, 0, length, StandardCharsets.UTF_16LE);
    }
}
