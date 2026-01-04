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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType;

/**
 * Base class for TIFF tag information.
 */
public class TagInfo {

    /** Constant for unknown length. */
    public static final int LENGTH_UNKNOWN = -1;

    /** Tag name. */
    public final String name;

    /** Tag number. */
    public final int tag;

    /** Data types supported by this tag. */
    public final List<AbstractFieldType> dataTypes;

    /** Expected length of tag data. */
    public final int length;

    /** Directory type where this tag is expected. */
    public final TiffDirectoryType directoryType;

    private final boolean isOffset;

    /**
     * Constructs a new instance.
     *
     * @param name the tag name.
     * @param tag the tag number.
     * @param dataType the data type.
     */
    public TagInfo(final String name, final int tag, final AbstractFieldType dataType) {
        this(name, tag, dataType, LENGTH_UNKNOWN, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    }

    /**
     * Constructs a new instance.
     *
     * @param name the tag name.
     * @param tag the tag number.
     * @param dataType the data type.
     * @param length the length.
     */
    public TagInfo(final String name, final int tag, final AbstractFieldType dataType, final int length) {
        this(name, tag, Arrays.asList(dataType), length, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    }

    /**
     * Constructs a new instance.
     *
     * @param name the tag name.
     * @param tag the tag number.
     * @param dataType the data type.
     * @param length the length.
     * @param exifDirectory the EXIF directory.
     */
    public TagInfo(final String name, final int tag, final AbstractFieldType dataType, final int length, final TiffDirectoryType exifDirectory) {
        this(name, tag, Arrays.asList(dataType), length, exifDirectory);
    }

    /**
     * Constructs a new instance.
     *
     * @param name the tag name.
     * @param tag the tag number.
     * @param dataType the data type.
     * @param length the length.
     * @param exifDirectory the EXIF directory.
     * @param isOffset whether this is an offset tag.
     */
    public TagInfo(final String name, final int tag, final AbstractFieldType dataType, final int length, final TiffDirectoryType exifDirectory,
            final boolean isOffset) {
        this(name, tag, Arrays.asList(dataType), length, exifDirectory, isOffset);
    }

    /**
     * Constructs a new instance.
     *
     * @param name the tag name.
     * @param tag the tag number.
     * @param dataTypes the data types.
     * @param length the length.
     * @param exifDirectory the EXIF directory.
     */
    public TagInfo(final String name, final int tag, final List<AbstractFieldType> dataTypes, final int length, final TiffDirectoryType exifDirectory) {
        this(name, tag, dataTypes, length, exifDirectory, false);
    }

    /**
     * Constructs a new instance.
     *
     * @param name the tag name.
     * @param tag the tag number.
     * @param dataTypes the data types.
     * @param length the length.
     * @param exifDirectory the EXIF directory.
     * @param isOffset whether this is an offset tag.
     */
    public TagInfo(final String name, final int tag, final List<AbstractFieldType> dataTypes, final int length, final TiffDirectoryType exifDirectory,
            final boolean isOffset) {
        this.name = name;
        this.tag = tag;
        this.dataTypes = Collections.unmodifiableList(new ArrayList<>(dataTypes));
        this.length = length;
        this.directoryType = exifDirectory;
        this.isOffset = isOffset;
    }

    /**
     * Encodes a value.
     *
     * @param abstractFieldType the field type.
     * @param value the value.
     * @param byteOrder the byte order.
     * @return the encoded bytes.
     * @throws ImagingException if an imaging error occurs.
     */
    public byte[] encodeValue(final AbstractFieldType abstractFieldType, final Object value, final ByteOrder byteOrder) throws ImagingException {
        return abstractFieldType.writeData(value, byteOrder);
    }

    /**
     * Gets the description.
     *
     * @return the description.
     */
    public String getDescription() {
        return tag + " (0x" + Integer.toHexString(tag) + ": " + name + "): ";
    }

    /**
     * Gets the value from a TIFF field.
     *
     * @param entry the TIFF field whose value to return.
     * @return the value of the TIFF field.
     * @throws ImagingException thrown by subclasses.
     */
    public Object getValue(final TiffField entry) throws ImagingException {
        return entry.getFieldType().getValue(entry);
    }

    /**
     * Checks if this is an offset tag.
     *
     * @return true if this is an offset tag, false otherwise.
     */
    public boolean isOffset() {
        return isOffset;
    }

    /**
     * Checks if this is a text tag.
     *
     * @return true if this is a text tag, false otherwise.
     */
    public boolean isText() {
        return false;
    }

    @Override
    public String toString() {
        return "[TagInfo. tag: " + tag + " (0x" + Integer.toHexString(tag) + ", name: " + name + "]";
    }
}
