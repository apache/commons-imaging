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
package org.apache.commons.imaging.formats.tiff.taginfos;

import java.nio.ByteOrder;
import java.util.List;

import org.apache.commons.imaging.common.ByteConversions;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType;

/**
 * Tag info for long field type.
 */
public class TagInfoLong extends TagInfo {

    /**
     * Constructs a new instance.
     *
     * @param name The tag name.
     * @param tag The tag number.
     * @param dataTypes The data types.
     * @param length The length.
     * @param exifDirectory The EXIF directory.
     * @param isOffset whether this is an offset tag.
     */
    public TagInfoLong(final String name, final int tag, final List<AbstractFieldType> dataTypes, final int length, final TiffDirectoryType exifDirectory,
            final boolean isOffset) {
        super(name, tag, dataTypes, length, exifDirectory, isOffset);
    }

    /**
     * Constructs a new instance.
     *
     * @param name The tag name.
     * @param tag The tag number.
     * @param directoryType The directory type.
     */
    public TagInfoLong(final String name, final int tag, final TiffDirectoryType directoryType) {
        super(name, tag, AbstractFieldType.LONG, 1, directoryType);
    }

    /**
     * Constructs a new instance.
     *
     * @param name The tag name.
     * @param tag The tag number.
     * @param directoryType The directory type.
     * @param isOffset whether this is an offset tag.
     */
    public TagInfoLong(final String name, final int tag, final TiffDirectoryType directoryType, final boolean isOffset) {
        super(name, tag, AbstractFieldType.LONG, 1, directoryType, isOffset);
    }

    /**
     * Encodes a value.
     *
     * @param byteOrder The byte order.
     * @param value The value.
     * @return The encoded bytes.
     */
    public byte[] encodeValue(final ByteOrder byteOrder, final int value) {
        return ByteConversions.toBytes(value, byteOrder);
    }

    /**
     * Gets the value.
     *
     * @param byteOrder The byte order.
     * @param bytes The bytes.
     * @return The integer value.
     */
    public int getValue(final ByteOrder byteOrder, final byte[] bytes) {
        return ByteConversions.toInt(bytes, byteOrder);
    }
}
