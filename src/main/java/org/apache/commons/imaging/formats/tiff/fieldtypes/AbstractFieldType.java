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
import java.util.Collections;
import java.util.List;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.formats.tiff.TiffField;

/**
 * TIFF field types.
 */
public abstract class AbstractFieldType {

    /**
     * Byte field type.
     */
    public static final FieldTypeByte BYTE = new FieldTypeByte(1, "Byte");

    /**
     * ASCII field type.
     */
    public static final FieldTypeAscii ASCII = new FieldTypeAscii(2, "ASCII");

    /**
     * Short field type.
     */
    public static final FieldTypeShort SHORT = new FieldTypeShort(3, "Short");

    /**
     * Long field type.
     */
    public static final FieldTypeLong LONG = new FieldTypeLong(4, "Long");

    /**
     * Rational field type.
     */
    public static final FieldTypeRational RATIONAL = new FieldTypeRational(5, "Rational");

    /**
     * SByte field type.
     */
    public static final FieldTypeByte SBYTE = new FieldTypeByte(6, "SByte");

    /**
     * Undefined field type.
     */
    public static final FieldTypeByte UNDEFINED = new FieldTypeByte(7, "Undefined");

    /**
     * SShort field type.
     */
    public static final FieldTypeShort SSHORT = new FieldTypeShort(8, "SShort");

    /**
     * SLong field type.
     */
    public static final FieldTypeLong SLONG = new FieldTypeLong(9, "SLong");

    /**
     * SRational field type.
     */
    public static final FieldTypeRational SRATIONAL = new FieldTypeRational(10, "SRational");

    /**
     * Float field type.
     */
    public static final FieldTypeFloat FLOAT = new FieldTypeFloat(11, "Float");

    /**
     * Double field type.
     */
    public static final FieldTypeDouble DOUBLE = new FieldTypeDouble(12, "Double");

    /**
     * IFD field type.
     */
    public static final FieldTypeLong IFD = new FieldTypeLong(13, "IFD");

    /**
     * Long8 field type.
     */
    public static final FieldTypeLong8 LONG8 = new FieldTypeLong8(16, "Long8");

    /**
     * SLong8 field type.
     */
    public static final FieldTypeLong8 SLONG8 = new FieldTypeLong8(17, "Long8");

    /**
     * IFD8 field type.
     */
    public static final FieldTypeLong8 IFD8 = new FieldTypeLong8(18, "Long8");

    /**
     * Unmodifiable List of all field types.
     */
    public static final List<AbstractFieldType> ANY = Collections.unmodifiableList(
            Arrays.asList(BYTE, ASCII, SHORT, LONG, RATIONAL, SBYTE, UNDEFINED, SSHORT, SLONG, SRATIONAL, FLOAT, DOUBLE, IFD, LONG8, SLONG8, IFD8));

    /**
     * Unmodifiable List of SHORT, LONG field types.
     */
    public static final List<AbstractFieldType> SHORT_OR_LONG = Collections.unmodifiableList(Arrays.asList(SHORT, LONG));

    /**
     * Unmodifiable List of SHORT, RATIONAL field types.
     */
    public static final List<AbstractFieldType> SHORT_OR_RATIONAL = Collections.unmodifiableList(Arrays.asList(SHORT, RATIONAL));


    /**
     * Unmodifiable List of SHORT, LONG, RATIONAL field types.
     */
    public static final List<AbstractFieldType> SHORT_OR_LONG_OR_RATIONAL = Collections.unmodifiableList(Arrays.asList(SHORT, LONG, RATIONAL));


    /**
     * Unmodifiable List of SHORT, LONG field types.
     */
    public static final List<AbstractFieldType> LONG_OR_SHORT = Collections.unmodifiableList(Arrays.asList(SHORT, LONG));


    /**
     * Unmodifiable List of SHORT, BYTE field types.
     */
    public static final List<AbstractFieldType> BYTE_OR_SHORT = Collections.unmodifiableList(Arrays.asList(SHORT, BYTE));


    /**
     * Unmodifiable List of LONG, IFD field types.
     */
    public static final List<AbstractFieldType> LONG_OR_IFD = Collections.unmodifiableList(Arrays.asList((AbstractFieldType) LONG, IFD));


    /**
     * Unmodifiable List of ASCII, RATIONAL field types.
     */
    public static final List<AbstractFieldType> ASCII_OR_RATIONAL = Collections.unmodifiableList(Arrays.asList(ASCII, RATIONAL));


    /**
     * Unmodifiable List of ASCII, BYTE field types.
     */
    public static final List<AbstractFieldType> ASCII_OR_BYTE = Collections.unmodifiableList(Arrays.asList(ASCII, BYTE));

    /**
     * Gets a known field type.
     *
     * @param type the type to find.
     * @return the matching field type.
     * @throws ImagingException thrown when not found.
     */
    public static AbstractFieldType getFieldType(final int type) throws ImagingException {
        for (final AbstractFieldType abstractFieldType : ANY) {
            if (abstractFieldType.getType() == type) {
                return abstractFieldType;
            }
        }
        throw new ImagingException("Field type " + type + " is unsupported");
    }

    private final int type;

    private final String name;

    private final int elementSize;

    /**
     * Constructs a new instance.
     *
     * @param type the type.
     * @param name the name.
     * @param elementSize the element size.
     */
    protected AbstractFieldType(final int type, final String name, final int elementSize) {
        this.type = type;
        this.name = name;
        this.elementSize = elementSize;
    }

    /**
     * Gets the name.
     *
     * @return the name.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the size.
     *
     * @return the size.
     */
    public int getSize() {
        return elementSize;
    }

    /**
     * Gets the type.
     *
     * @return the type.
     */
    public int getType() {
        return type;
    }

    /**
     * Gets the value from a TIFF field.
     *
     * @param entry the TIFF field.
     * @return the value.
     */
    public abstract Object getValue(TiffField entry);

    /**
     * Converts the given object to a byte array.
     *
     * @param obj input.
     * @param byteOrder output byte order; not used by all subclasses.
     * @return a byte array.
     * @throws ImagingException Thrown on a bad input.
     */
    public abstract byte[] writeData(Object obj, ByteOrder byteOrder) throws ImagingException;
}
