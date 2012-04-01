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

package org.apache.commons.sanselan.formats.tiff.taginfos;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.sanselan.ImageReadException;
import org.apache.commons.sanselan.ImageWriteException;
import org.apache.commons.sanselan.formats.tiff.TiffField;
import org.apache.commons.sanselan.formats.tiff.constants.TiffDirectoryConstants;
import org.apache.commons.sanselan.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.sanselan.formats.tiff.constants.TiffFieldTypeConstants;
import org.apache.commons.sanselan.formats.tiff.fieldtypes.FieldType;

public abstract class TagInfo implements TiffDirectoryConstants, TiffFieldTypeConstants
{
    public static final int LENGTH_UNKNOWN = -1;

    public TagInfo(String name, int tag, FieldType dataType, int length,
            TiffDirectoryType exifDirectory)
    {
        this(name, tag, Arrays.asList(dataType), length, exifDirectory);
    }

    public TagInfo(String name, int tag, FieldType dataType, int length,
            TiffDirectoryType exifDirectory, boolean isOffset)
    {
        this(name, tag, Arrays.asList(dataType), length, exifDirectory, isOffset);
    }

    public TagInfo(String name, int tag, FieldType dataType, int length)
    {
        this(name, tag, Arrays.asList(dataType), length, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    }

    public TagInfo(String name, int tag, FieldType dataType)
    {
        this(name, tag, dataType, LENGTH_UNKNOWN, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    }

    public final String name;
    public final int tag;
    public final List<FieldType> dataTypes;
    public final int length;
    public final TiffDirectoryType directoryType;
    private final boolean isOffset;

    public TagInfo(String name, int tag, List<FieldType> dataTypes, int length,
            TiffDirectoryType exifDirectory)
    {
        this(name, tag, dataTypes, length, exifDirectory, false);
    }

    public TagInfo(String name, int tag, List<FieldType> dataTypes, int length,
            TiffDirectoryType exifDirectory, boolean isOffset)
    {
        this.name = name;
        this.tag = tag;
        this.dataTypes = Collections.unmodifiableList(new ArrayList<FieldType>(dataTypes));
        this.length = length;
        this.directoryType = exifDirectory;
        this.isOffset = isOffset;
    }
    
    public Object getValue(TiffField entry) throws ImageReadException
    {
        Object o = entry.fieldType.getSimpleValue(entry);
        return o;
    }

    public byte[] encodeValue(FieldType fieldType, Object value, int byteOrder)
            throws ImageWriteException
    {
        return fieldType.writeData(value, byteOrder);
    }

    public String getDescription()
    {
        return tag + " (0x" + Integer.toHexString(tag) + ": " + name + "): ";
    }

    @Override
    public String toString()
    {
        return "[TagInfo. tag: " + tag + " (0x" + Integer.toHexString(tag)
                + ", name: " + name + "]";
    }

    public boolean isOffset()
    {
        return isOffset;
    }

    public boolean isText()
    {
        return false;
    }
}