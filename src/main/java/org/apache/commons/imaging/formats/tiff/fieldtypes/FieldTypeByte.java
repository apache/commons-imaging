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
import org.apache.commons.imaging.formats.tiff.TiffField;

/**
 * TIFF field type for byte values.
 */
public class FieldTypeByte extends AbstractFieldType {
    /**
     * Constructs a new byte field type.
     *
     * @param type the type number.
     * @param name the type name.
     */
    public FieldTypeByte(final int type, final String name) {
        super(type, name, 1);
    }

    @Override
    public Object getValue(final TiffField entry) {
        final byte[] bytes = entry.getByteArrayValue();
        if (entry.getCount() == 1) {
            return bytes[0];
        }
        return bytes;
    }

    @Override
    public byte[] writeData(final Object o, final ByteOrder byteOrder) throws ImagingException {
        if (o instanceof Byte) {
            return new byte[] { ((Byte) o).byteValue() };
        }
        if (o instanceof byte[]) {
            return (byte[]) o;
        }
        throw new ImagingException("Invalid data", o);
    }

}
