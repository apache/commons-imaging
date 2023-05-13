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
package org.apache.commons.imaging.formats.tiff.fieldtypes;

import java.nio.ByteOrder;
import java.util.Arrays;

import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.Allocator;
import org.apache.commons.imaging.common.ByteConversions;
import org.apache.commons.imaging.common.RationalNumber;
import org.apache.commons.imaging.formats.tiff.TiffField;

public class FieldTypeRational extends FieldType {
    public FieldTypeRational(final int type, final String name) {
        super(type, name, 8);
    }

    @Override
    public Object getValue(final TiffField entry) {
        final byte[] bytes = entry.getByteArrayValue();
        final boolean unsignedType = entry.getFieldType() != SRATIONAL;
        if (entry.getCount() == 1) {
            return ByteConversions.toRational(
                    bytes,
                    entry.getByteOrder(),
                    unsignedType);
        }
        return ByteConversions.toRationals(bytes, entry.getByteOrder(), unsignedType);
    }

    @Override
    public byte[] writeData(final Object o, final ByteOrder byteOrder) throws ImageWriteException {
        if (o instanceof RationalNumber) {
            return ByteConversions.toBytes((RationalNumber) o, byteOrder);
        }
        if (o instanceof RationalNumber[]) {
            return ByteConversions.toBytes((RationalNumber[]) o, byteOrder);
        }
        if (o instanceof Number) {
            final Number number = (Number) o;
            return ByteConversions.toBytes(RationalNumber.valueOf(number.doubleValue()), byteOrder);
        }
        if (o instanceof Number[]) {
            final Number[] numbers = (Number[]) o;
            final RationalNumber[] rationalNumbers = Allocator.array(numbers.length, RationalNumber[]::new);
            Arrays.setAll(rationalNumbers, RationalNumber::valueOf);
            return ByteConversions.toBytes(rationalNumbers, byteOrder);
        }
        if (!(o instanceof double[])) {
            throw new ImageWriteException("Invalid data", o);
        }
        final double[] numbers = (double[]) o;
        final RationalNumber[] rationalNumbers = Allocator.array(numbers.length, RationalNumber[]::new);
        Arrays.setAll(rationalNumbers, RationalNumber::valueOf);
        return ByteConversions.toBytes(rationalNumbers, byteOrder);
    }
}
