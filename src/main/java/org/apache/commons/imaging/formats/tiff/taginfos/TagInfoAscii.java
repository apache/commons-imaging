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

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.Allocator;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType;

public class TagInfoAscii extends TagInfo {
    public TagInfoAscii(final String name, final int tag, final int length,
            final TiffDirectoryType directoryType) {
        super(name, tag, FieldType.ASCII, length, directoryType);
    }

    public byte[] encodeValue(final ByteOrder byteOrder, final String... values)
            throws ImageWriteException {
        return FieldType.ASCII.writeData(values, byteOrder);
    }

    public String[] getValue(final ByteOrder byteOrder, final byte[] bytes) {
        int nullCount = 0;
        for (int i = 0; i < bytes.length - 1; i++) {
            if (bytes[i] == 0) {
                nullCount++;
            }
        }
        final String[] strings = Allocator.array(nullCount + 1, String[]::new, 24);
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
        return strings;
    }
}
