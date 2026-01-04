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
 * TIFF field type for single-precision floating point values.
 */
public class FieldTypeFloat extends AbstractFieldType {

    /**
     * Constructs a new float field type.
     *
     * @param type the type number.
     * @param name the type name.
     */
    public FieldTypeFloat(final int type, final String name) {
        super(type, name, 4);
    }

    @Override
    public Object getValue(final TiffField entry) {
        final byte[] bytes = entry.getByteArrayValue();
        if (entry.getCount() == 1) {
            return ByteConversions.toFloat(bytes, entry.getByteOrder());
        }
        return ByteConversions.toFloats(bytes, entry.getByteOrder());
    }

    @Override
    public byte[] writeData(final Object o, final ByteOrder byteOrder) throws ImagingException {
        if (o instanceof Float) {
            return ByteConversions.toBytes(((Float) o).floatValue(), byteOrder);
        }
        if (o instanceof float[]) {
            final float[] numbers = (float[]) o;
            return ByteConversions.toBytes(numbers, byteOrder);
        }
        if (!(o instanceof Float[])) {
            throw new ImagingException("Invalid data", o);
        }
        final Float[] numbers = (Float[]) o;
        final float[] values = Allocator.floatArray(numbers.length);
        for (int i = 0; i < values.length; i++) {
            values[i] = numbers[i].floatValue();
        }
        return ByteConversions.toBytes(values, byteOrder);
    }

}
