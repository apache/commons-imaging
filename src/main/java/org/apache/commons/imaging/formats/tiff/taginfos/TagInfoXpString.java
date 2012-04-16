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
package org.apache.commons.imaging.formats.tiff.taginfos;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType;
import org.apache.commons.imaging.util.Debug;

/**
 * Windows XP onwards store some tags using UTF-16LE, but the field type is byte -
 * here we deal with this.
 */
public class TagInfoXpString extends TagInfo {
    public TagInfoXpString(String name, int tag, int length, TiffDirectoryType directoryType) {
        super(name, tag, Arrays.asList(FIELD_TYPE_UNDEFINED), length, directoryType);
    }
    
    @Override
    public byte[] encodeValue(FieldType fieldType, Object value,
            int byteOrder) throws ImageWriteException
    {
        if (!(value instanceof String))
            throw new ImageWriteException("Text value not String: " + value
                    + " (" + Debug.getType(value) + ")");
        String s = (String) value;
        try {
            return s.getBytes("UTF-16LE");
        } catch (UnsupportedEncodingException cannotHappen) {
            return null;
        }
    }
    
    @Override
    public String getValue(TiffField entry) throws ImageReadException {
        if (entry.type != FIELD_TYPE_BYTE.type) {
            throw new ImageReadException("Text field not encoded as bytes.");
        }
        try {
            return new String(entry.getByteArrayValue(), "UTF-16LE");
        } catch (UnsupportedEncodingException cannotHappen) {
            return null;
        }
    }
}
