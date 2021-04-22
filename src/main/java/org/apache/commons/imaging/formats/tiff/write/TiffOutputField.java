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

import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;

public class TiffOutputField {
    public final int tag;
    public final TagInfo tagInfo;
    public final FieldType fieldType;
    public final int count;
    private byte[] bytes;
    private final TiffOutputItem.Value separateValueItem;
    private int sortHint = -1;
    private static final String NEWLINE = System.getProperty("line.separator");

    public TiffOutputField(final TagInfo tagInfo, final FieldType fieldType, final int count,
            final byte[] bytes) {
        this(tagInfo.tag, tagInfo, fieldType, count, bytes);
    }

    public TiffOutputField(final int tag, final TagInfo tagInfo, final FieldType fieldType,
            final int count, final byte[] bytes) {
        this.tag = tag;
        this.tagInfo = tagInfo;
        this.fieldType = fieldType;
        this.count = count;
        this.bytes = bytes;

        if (isLocalValue()) {
            separateValueItem = null;
        } else {
            final String name = "Field Separate value (" + tagInfo.getDescription()
                    + ")";
            separateValueItem = new TiffOutputItem.Value(name, bytes);
        }
    }

    protected static TiffOutputField createOffsetField(final TagInfo tagInfo,
            final ByteOrder byteOrder) throws ImageWriteException {
        return new TiffOutputField(tagInfo, FieldType.LONG, 1,
                FieldType.LONG.writeData(0, byteOrder));
    }

    protected void writeField(final BinaryOutputStream bos) throws IOException,
            ImageWriteException {
        bos.write2Bytes(tag);
        bos.write2Bytes(fieldType.getType());
        bos.write4Bytes(count);

        if (isLocalValue()) {
            if (separateValueItem != null) {
                throw new ImageWriteException("Unexpected separate value item.");
            }
            if (bytes.length > 4) {
                throw new ImageWriteException(
                        "Local value has invalid length: " + bytes.length);
            }

            bos.write(bytes);
            final int remainder = TIFF_ENTRY_MAX_VALUE_LENGTH - bytes.length;
            for (int i = 0; i < remainder; i++) {
                bos.write(0);
            }
        } else {
            if (separateValueItem == null) {
                throw new ImageWriteException("Missing separate value item.");
            }

            bos.write4Bytes((int) separateValueItem.getOffset());
        }
    }

    protected TiffOutputItem getSeperateValue() {
        return separateValueItem;
    }

    protected final boolean isLocalValue() {
        return bytes.length <= TIFF_ENTRY_MAX_VALUE_LENGTH;
    }

    public boolean bytesEqual(final byte[] data) {
        return Arrays.equals(bytes, data);
    }

    protected void setData(final byte[] bytes) throws ImageWriteException {
        // if(tagInfo.isUnknown())
        // Debug.debug("unknown tag(0x" + Integer.toHexString(tag)
        // + ") setData", bytes);

        if (this.bytes.length != bytes.length) {
            throw new ImageWriteException("Cannot change size of value.");
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
        result.append(fieldType);
        result.append(NEWLINE);

        return result.toString();
    }

    public int getSortHint() {
        return sortHint;
    }

    public void setSortHint(final int sortHint) {
        this.sortHint = sortHint;
    }
}
