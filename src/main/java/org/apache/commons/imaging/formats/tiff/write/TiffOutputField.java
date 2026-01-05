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
package org.apache.commons.imaging.formats.tiff.write;

import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.ENTRY_MAX_VALUE_LENGTH;

import java.io.IOException;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.AbstractBinaryOutputStream;
import org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;

/**
 * Represents a TIFF output field.
 */
public class TiffOutputField {
    private static final String NEWLINE = System.lineSeparator();

    /**
     * Creates an offset field.
     *
     * @param tagInfo the tag info.
     * @param byteOrder the byte order.
     * @return the offset field.
     * @throws ImagingException if an error occurs.
     */
    protected static TiffOutputField createOffsetField(final TagInfo tagInfo, final ByteOrder byteOrder) throws ImagingException {
        return new TiffOutputField(tagInfo, AbstractFieldType.LONG, 1, AbstractFieldType.LONG.writeData(0, byteOrder));
    }

    /**
     * The tag number.
     */
    public final int tag;

    /**
     * The tag info.
     */
    public final TagInfo tagInfo;

    /**
     * The field type.
     */
    public final AbstractFieldType abstractFieldType;

    /**
     * The value count.
     */
    public final int count;

    private byte[] bytes;
    private final AbstractTiffOutputItem.Value separateValueItem;

    private int sortHint = -1;

    /**
     * Constructs a new instance.
     *
     * @param tag the tag number.
     * @param tagInfo the tag info.
     * @param abstractFieldType the field type.
     * @param count the value count.
     * @param bytes the field data.
     */
    public TiffOutputField(final int tag, final TagInfo tagInfo, final AbstractFieldType abstractFieldType, final int count, final byte[] bytes) {
        this.tag = tag;
        this.tagInfo = tagInfo;
        this.abstractFieldType = abstractFieldType;
        this.count = count;
        this.bytes = bytes;

        if (isLocalValue()) {
            separateValueItem = null;
        } else {
            final String name = "Field Separate value (" + tagInfo.getDescription() + ")";
            separateValueItem = new AbstractTiffOutputItem.Value(name, bytes);
        }
    }

    /**
     * Constructs a new instance.
     *
     * @param tagInfo the tag info.
     * @param abstractFieldType the field type.
     * @param count the value count.
     * @param bytes the field data.
     */
    public TiffOutputField(final TagInfo tagInfo, final AbstractFieldType abstractFieldType, final int count, final byte[] bytes) {
        this(tagInfo.tag, tagInfo, abstractFieldType, count, bytes);
    }

    /**
     * Return a copy of the data in this TIFF output field.
     *
     * @return a copy of the data in this TIFF output field.
     */
    public byte[] getData() {
        return Arrays.copyOf(this.bytes, this.bytes.length);
    }

    /**
     * Gets the separate value item if this field is not a local value.
     *
     * @return the separate value item, or null.
     */
    protected AbstractTiffOutputItem getSeperateValue() {
        return separateValueItem;
    }

    /**
     * Gets the sort hint.
     *
     * @return the sort hint.
     */
    public int getSortHint() {
        return sortHint;
    }

    /**
     * Checks if this field's value fits in the tag entry.
     *
     * @return true if the value is local.
     */
    protected final boolean isLocalValue() {
        return bytes.length <= ENTRY_MAX_VALUE_LENGTH;
    }

    /**
     * Set the data for this TIFF output field.
     *
     * @param bytes TIFF output field data.
     * @throws ImagingException if the length of the bytes array do not match.
     */
    public void setData(final byte[] bytes) throws ImagingException {
        // if (tagInfo.isUnknown())
        // Debug.debug("unknown tag(0x" + Integer.toHexString(tag)
        // + ") setData", bytes);

        if (this.bytes.length != bytes.length) {
            throw new ImagingException("Cannot change size of value.");
        }

        // boolean wasLocalValue = isLocalValue();
        this.bytes = bytes;
        if (separateValueItem != null) {
            separateValueItem.updateValue(bytes);
        }
        // if (isLocalValue() != wasLocalValue)
        // throw new Error("Bug. Locality disrupted! "
        // + tagInfo.getDescription());
    }

    /**
     * Sets the sort hint for this field.
     *
     * @param sortHint the sort hint.
     */
    public void setSortHint(final int sortHint) {
        this.sortHint = sortHint;
    }

    @Override
    public String toString() {
        return toString(null);
    }

    /**
     * Gets a string representation with optional prefix.
     *
     * @param prefix the prefix, or null.
     * @return the string representation.
     */
    public String toString(String prefix) {
        if (prefix == null) {
            prefix = "";
        }
        final StringBuilder result = new StringBuilder();

        result.append(prefix);
        result.append(tagInfo);
        result.append(NEWLINE);

        result.append(prefix);
        result.append("count: ");
        result.append(count);
        result.append(NEWLINE);

        result.append(prefix);
        result.append(abstractFieldType);
        result.append(NEWLINE);

        return result.toString();
    }

    /**
     * Writes this field to the output stream.
     *
     * @param bos the output stream.
     * @throws IOException if an I/O error occurs.
     * @throws ImagingException if an imaging error occurs.
     */
    protected void writeField(final AbstractBinaryOutputStream bos) throws IOException, ImagingException {
        bos.write2Bytes(tag);
        bos.write2Bytes(abstractFieldType.getType());
        bos.write4Bytes(count);

        if (isLocalValue()) {
            if (separateValueItem != null) {
                throw new ImagingException("Unexpected separate value item.");
            }
            if (bytes.length > 4) {
                throw new ImagingException("Local value has invalid length: " + bytes.length);
            }

            bos.write(bytes);
            final int remainder = ENTRY_MAX_VALUE_LENGTH - bytes.length;
            for (int i = 0; i < remainder; i++) {
                bos.write(0);
            }
        } else {
            if (separateValueItem == null) {
                throw new ImagingException("Missing separate value item.");
            }

            bos.write4Bytes((int) separateValueItem.getOffset());
        }
    }
}
