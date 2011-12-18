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
package org.apache.commons.sanselan.formats.tiff.fieldtypes;

import org.apache.commons.sanselan.ImageWriteException;
import org.apache.commons.sanselan.formats.tiff.TiffField;

public class FieldTypeASCII extends FieldType
{
    public FieldTypeASCII(int type, String name)
    {
        super(type, 1, name);
    }

    public Object getSimpleValue(TiffField entry) {
        // According to EXIF specification "2 = ASCII An 8-bit byte containing one 7-bit ASCII code. The final byte is terminated with NULL."
        byte bytes[] = getRawBytes(entry);
        // Ignore last (should be NULL) byte.
        return new String(bytes, 0, bytes.length-1);
    }

    public byte[] writeData(Object o, int byteOrder) throws ImageWriteException
    {
        if (o instanceof byte[]) {
            byte bytes[] = (byte[]) o;
            byte result[] = new byte[bytes.length + 1];
            System.arraycopy(bytes, 0, result, 0, bytes.length);
            result[result.length - 1] = 0;
            return result;
        } else if (o instanceof String) {
            byte bytes[] = ((String) o).getBytes();
            byte result[] = new byte[bytes.length + 1];
            System.arraycopy(bytes, 0, result, 0, bytes.length);
            result[result.length - 1] = 0;
            return result;
        }
        else
            throw new ImageWriteException("Unknown data type: " + o);
    }

}