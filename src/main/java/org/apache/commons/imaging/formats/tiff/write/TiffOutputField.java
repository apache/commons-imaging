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
package org.apache.commons.imaging.formats.tiff.write;

import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_ENTRY_MAX_VALUE_LENGTH;

import java.io.IOException;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;

public class TiffOutputField {
    private static final String NEWLINE = System.lineSeparator();

    protected static TiffOutputField createOffsetField(final TagInfo tagInfo, final ByteOrder byteOrder) throws ImagingException {
        return new TiffOutputField(tagInfo, AbstractFieldType.LONG, 1, AbstractFieldType.LONG.writeData(0, byteOrder));
    }

    public final int tag;
    public final TagInfo tagInfo;
    public final AbstractFieldType abstractFieldType;
    public final int count;
    private byte[] bytes;
    private final AbstractTiffOutputItem.Value separateValueItem;

    private int sortHint = -1;

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

    public TiffOutputField(final TagInfo tagInfo, final AbstractFieldType abstractFieldType, final int count, final byte[] bytes) {
        this(tagInfo.tag, tagInfo, abstractFieldType, count, bytes);
    }

    protected AbstractTiffOutputItem getSeperateValue() {
        return separateValueItem;
    }

    public int getSortHint() {
        return sortHint;
    }

    protected final boolean isLocalValue() {
        return bytes.length <= TIFF_ENTRY_MAX_VALUE_LENGTH;
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
     * Return a copy of the data in this TIFF output field.
     * @return a copy of the data in this TIFF output field.
     */
    public byte[] getData() {
        return Arrays.copyOf(this.bytes, this.bytes.length);
    }

    public void setSortHint(final int sortHint) {
        this.sortHint = sortHint;
    }

    @Override
    public String toString() {
        return toString(null);
    }

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

    protected void writeField(final BinaryOutputStream bos) throws IOException, ImagingException {
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
            final int remainder = TIFF_ENTRY_MAX_VALUE_LENGTH - bytes.length;
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
