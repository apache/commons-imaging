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

import java.io.UnsupportedEncodingException;

import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.formats.tiff.TiffField;

public class FieldTypeAscii extends FieldType {
    public FieldTypeAscii(int type, String name) {
        super(type, 1, name);
    }

    @Override
    public Object getSimpleValue(TiffField entry) {
        // According to EXIF specification
        // "2 = ASCII An 8-bit byte containing one 7-bit ASCII code. The final byte is terminated with NULL."
        byte bytes[] = getRawBytes(entry);
        int nullCount = 1;
        for (int i = 0; i < bytes.length - 1; i++) {
            if (bytes[i] == 0) {
                nullCount++;
            }
        }
        String[] strings = new String[nullCount];
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
        if (strings.length == 1) {
            return strings[0];
        } else {
            return strings;
        }
    }

    @Override
    public byte[] writeData(Object o, int byteOrder) throws ImageWriteException {
        if (o instanceof byte[]) {
            byte bytes[] = (byte[]) o;
            byte result[] = new byte[bytes.length + 1];
            System.arraycopy(bytes, 0, result, 0, bytes.length);
            result[result.length - 1] = 0;
            return result;
        } else if (o instanceof String) {
            byte[] bytes = null;
            try {
                bytes = ((String) o).getBytes("UTF-8");
            } catch (UnsupportedEncodingException cannotHappen) {
            }
            byte result[] = new byte[bytes.length + 1];
            System.arraycopy(bytes, 0, result, 0, bytes.length);
            result[result.length - 1] = 0;
            return result;
        } else if (o instanceof String[]) {
            String[] strings = (String[]) o;
            int totalLength = 0;
            for (int i = 0; i < strings.length; i++) {
                byte[] bytes = null;
                try {
                    bytes = strings[i].getBytes("UTF-8");
                } catch (UnsupportedEncodingException cannotHappen) {
                }
                totalLength += (bytes.length + 1);
            }
            byte[] result = new byte[totalLength];
            int position = 0;
            for (int i = 0; i < strings.length; i++) {
                byte[] bytes = null;
                try {
                    bytes = strings[i].getBytes("UTF-8");
                } catch (UnsupportedEncodingException cannotHappen) {
                }
                System.arraycopy(bytes, 0, result, position, bytes.length);
                position += (bytes.length + 1);
            }
            return result;
        } else
            throw new ImageWriteException("Unknown data type: " + o);
    }

}
