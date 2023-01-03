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
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.formats.tiff.TiffField;

public class FieldTypeAscii extends FieldType {
    public FieldTypeAscii(final int type, final String name) {
        super(type, name, 1);
    }

    @Override
    public Object getValue(final TiffField entry) {
        // According to EXIF specification
        // "2 = ASCII An 8-bit byte containing one 7-bit ASCII code. The final byte is terminated with NULL."
        final byte[] bytes = entry.getByteArrayValue();
        int nullCount = 1;
        for (int i = 0; i < bytes.length - 1; i++) {
            if (bytes[i] == 0) {
                nullCount++;
            }
        }
        final String[] strings = new String[nullCount];
        int stringsAdded = 0;
        strings[0] = ""; // if we have a 0 length string
        int nextStringPos = 0;
        // According to the Exiftool FAQ, http://www.metadataworkinggroup.org
        // specifies that the TIFF ASCII fields are actually UTF-8.
        // Exiftool however allows you to configure the charset used.
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == 0) {
                final String string = new String(bytes, nextStringPos, i
                        - nextStringPos, StandardCharsets.UTF_8);
                strings[stringsAdded++] = string;
                nextStringPos = i + 1;
            }
        }
        if (nextStringPos < bytes.length) {
            // Buggy file, string wasn't null terminated
            final String string = new String(bytes, nextStringPos, bytes.length
                    - nextStringPos, StandardCharsets.UTF_8);
            strings[stringsAdded++] = string;
        }
        if (strings.length == 1) {
            return strings[0];
        }
        return strings;
    }

    @Override
    public byte[] writeData(final Object o, final ByteOrder byteOrder) throws ImageWriteException {
        if (o instanceof byte[]) {
            final byte[] bytes = (byte[]) o;
            final byte[] result = Arrays.copyOf(bytes, bytes.length + 1);
            result[result.length - 1] = 0;
            return result;
        }
        if (o instanceof String) {
            final byte[] bytes = ((String) o).getBytes(StandardCharsets.UTF_8);
            final byte[] result = Arrays.copyOf(bytes, bytes.length + 1);
            result[result.length - 1] = 0;
            return result;
        }
        if (!(o instanceof String[])) {
            throw new ImageWriteException("Unknown data type: " + o);
        }
        final String[] strings = (String[]) o;
        int totalLength = 0;
        for (final String string : strings) {
            final byte[] bytes = string.getBytes(StandardCharsets.UTF_8);
            totalLength += (bytes.length + 1);
        }
        final byte[] result = new byte[totalLength];
        int position = 0;
        for (final String string : strings) {
            final byte[] bytes = string.getBytes(StandardCharsets.UTF_8);
            System.arraycopy(bytes, 0, result, position, bytes.length);
            position += (bytes.length + 1);
        }
        return result;
    }

}
