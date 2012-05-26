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

import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;

public class TagInfoAscii extends TagInfo {
    public TagInfoAscii(String name, int tag, int length,
            TiffDirectoryType directoryType) {
        super(name, tag, FIELD_TYPE_ASCII, length, directoryType);
    }

    public String[] getValue(int byteOrder, byte[] bytes) {
        int nullCount = 1;
        for (int i = 0; i < bytes.length - 1; i++) {
            if (bytes[i] == 0) {
                nullCount++;
            }
        }
        String[] strings = new String[nullCount + 1];
        int stringsAdded = 0;
        strings[0] = ""; // if we have a 0 length string
        int nextStringPos = 0;
        // According to the Exiftool FAQ, http://www.metadataworkinggroup.org
        // specifies that the TIFF ASCII fields are actually UTF-8.
        // Exiftool however allows you to configure the charset used.
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == 0) {
                try {
                    String string = new String(bytes, nextStringPos, i
                            - nextStringPos, "UTF-8");
                    strings[stringsAdded++] = string;
                } catch (UnsupportedEncodingException unsupportedEncoding) {
                }
                nextStringPos = i + 1;
            }
        }
        if (nextStringPos < bytes.length) {
            // Buggy file, string wasn't null terminated
            try {
                String string = new String(bytes, nextStringPos, bytes.length
                        - nextStringPos, "UTF-8");
                strings[stringsAdded++] = string;
            } catch (UnsupportedEncodingException unsupportedEncoding) {
            }
        }
        return strings;
    }

    public byte[] encodeValue(int byteOrder, String... values)
            throws ImageWriteException {
        return FIELD_TYPE_ASCII.writeData(values, byteOrder);
    }
}
