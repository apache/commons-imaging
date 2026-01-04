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
package org.apache.commons.imaging.formats.tiff.fieldtypes;

import java.nio.ByteOrder;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.Allocator;
import org.apache.commons.imaging.common.ByteConversions;
import org.apache.commons.imaging.formats.tiff.TiffField;

/**
 * Provides an implementation of the 8-byte integer field type specified by the BigTIFF extensions to the TIFF format.
 */
public class FieldTypeLong8 extends AbstractFieldType {

    /**
     * Constructs a new 64-bit long field type.
     *
     * @param type the type number.
     * @param name the type name.
     */
    public FieldTypeLong8(final int type, final String name) {
        super(type, name, 8);
    }

    /**
     * Gets the value(s) for this field in the form of an array of long integers.
     *
     * @param entry the TIFF field as obtained from the source file.
     * @return a valid, potentially empty array of Java long integers.
     */
    @Override
    public Object getValue(final TiffField entry) {
        final byte[] bytes = entry.getByteArrayValue();
        if (entry.getCount() == 1) {
            return ByteConversions.toInt(bytes, entry.getByteOrder());
        }
        return ByteConversions.toLongs(bytes, entry.getByteOrder());
    }

    @Override
    public byte[] writeData(final Object o, final ByteOrder byteOrder) throws ImagingException {
        if (o instanceof Integer) {
            return ByteConversions.toBytes((Integer) o, byteOrder);
        }
        if (o instanceof int[]) {
            final int[] numbers = (int[]) o;
            return ByteConversions.toBytes(numbers, byteOrder);
        }
        if (!(o instanceof Integer[])) {
            throw new ImagingException("Invalid data", o);
        }
        final Integer[] numbers = (Integer[]) o;
        final int[] values = Allocator.intArray(numbers.length);
        System.arraycopy(numbers, 0, values, 0, values.length);
        return ByteConversions.toBytes(values, byteOrder);
    }

}
