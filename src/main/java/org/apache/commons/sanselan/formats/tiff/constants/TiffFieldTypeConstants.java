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
package org.apache.commons.sanselan.formats.tiff.constants;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.sanselan.SanselanConstants;
import org.apache.commons.sanselan.formats.tiff.fieldtypes.FieldType;
import org.apache.commons.sanselan.formats.tiff.fieldtypes.FieldTypeAscii;
import org.apache.commons.sanselan.formats.tiff.fieldtypes.FieldTypeByte;
import org.apache.commons.sanselan.formats.tiff.fieldtypes.FieldTypeDouble;
import org.apache.commons.sanselan.formats.tiff.fieldtypes.FieldTypeFloat;
import org.apache.commons.sanselan.formats.tiff.fieldtypes.FieldTypeLong;
import org.apache.commons.sanselan.formats.tiff.fieldtypes.FieldTypeRational;
import org.apache.commons.sanselan.formats.tiff.fieldtypes.FieldTypeShort;
import org.apache.commons.sanselan.formats.tiff.fieldtypes.FieldTypeUnknown;

public interface TiffFieldTypeConstants extends SanselanConstants
{

    public static final FieldTypeByte FIELD_TYPE_BYTE = new FieldTypeByte(1,
            "Byte");

    public static final FieldTypeAscii FIELD_TYPE_ASCII = new FieldTypeAscii(2,
            "ASCII");

    public static final FieldTypeShort FIELD_TYPE_SHORT = new FieldTypeShort(3,
            "Short");

    public static final FieldTypeLong FIELD_TYPE_LONG = new FieldTypeLong(4,
            "Long");

    public static final FieldTypeRational FIELD_TYPE_RATIONAL = new FieldTypeRational(
            5, "Rational");

    public static final FieldType FIELD_TYPE_SBYTE = new FieldTypeByte(6,
            "SByte");
    public static final FieldType FIELD_TYPE_UNDEFINED = new FieldTypeByte(7,
            "Undefined");
    public static final FieldType FIELD_TYPE_SSHORT = new FieldTypeShort(8,
            "SShort");

    public static final FieldType FIELD_TYPE_SLONG = new FieldTypeLong(9,
            "SLong");

    public static final FieldType FIELD_TYPE_SRATIONAL = new FieldTypeRational(
            10, "SRational");

    public static final FieldType FIELD_TYPE_FLOAT = new FieldTypeFloat();

    public static final FieldType FIELD_TYPE_DOUBLE = new FieldTypeDouble();

    public static final FieldType FIELD_TYPE_UNKNOWN = new FieldTypeUnknown();

    public static final List<FieldType> FIELD_TYPES =
            Collections.unmodifiableList(Arrays.asList(
                    FIELD_TYPE_BYTE, FIELD_TYPE_ASCII, FIELD_TYPE_SHORT,
                    FIELD_TYPE_LONG, FIELD_TYPE_RATIONAL, FIELD_TYPE_SBYTE,
                    FIELD_TYPE_UNDEFINED, FIELD_TYPE_SSHORT, FIELD_TYPE_SLONG,
                    FIELD_TYPE_SRATIONAL, FIELD_TYPE_FLOAT, FIELD_TYPE_DOUBLE));

    public static final List<FieldType> FIELD_TYPE_ANY = FIELD_TYPES;

    public static final List<FieldType> FIELD_TYPE_DESCRIPTION_SHORT_OR_LONG =
            Collections.unmodifiableList(Arrays.asList(
                    FIELD_TYPE_SHORT, FIELD_TYPE_LONG));
    
    public static final List<FieldType> FIELD_TYPE_DESCRIPTION_SHORT_OR_RATIONAL =
            Collections.unmodifiableList(Arrays.asList(
                    FIELD_TYPE_SHORT, FIELD_TYPE_RATIONAL));
    
    public static final List<FieldType> FIELD_TYPE_DESCRIPTION_SHORT_OR_LONG_OR_RATIONAL =
            Collections.unmodifiableList(Arrays.asList(
                    FIELD_TYPE_SHORT, FIELD_TYPE_LONG, FIELD_TYPE_RATIONAL));
    
    public static final List<FieldType> FIELD_TYPE_DESCRIPTION_LONG_OR_SHORT =
            Collections.unmodifiableList(Arrays.asList(
                    FIELD_TYPE_SHORT, FIELD_TYPE_LONG));
    
    public static final List<FieldType> FIELD_TYPE_DESCRIPTION_BYTE_OR_SHORT =
            Collections.unmodifiableList(Arrays.asList(
                    FIELD_TYPE_SHORT, FIELD_TYPE_BYTE));
}