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
package org.apache.commons.imaging.formats.jpeg.iptc;

import java.io.UnsupportedEncodingException;
import java.util.Comparator;

/*
 * Represents an IPTC record, a single key-value pair of Photoshop IPTC data.
 */
public class IptcRecord {
    public final IptcType iptcType;
    private final byte[] bytes;
    public final String value;
    public static final Comparator<IptcRecord> COMPARATOR = new Comparator<IptcRecord>() {
        public int compare(final IptcRecord e1, final IptcRecord e2) {
            return e1.iptcType.getType() - e2.iptcType.getType();
        }
    };

    public IptcRecord(final IptcType iptcType, final byte[] bytes, final String value) {
        this.iptcType = iptcType;
        this.bytes = bytes;
        this.value = value;
    }

    public IptcRecord(final IptcType iptcType, final String value, final String charsetName) {
        this.iptcType = iptcType;
        byte[] tempBytes;
        try {
            tempBytes = value.getBytes(charsetName);
        } catch (final UnsupportedEncodingException cannotHappen) {
            tempBytes = null;
        }
        this.bytes = tempBytes;
        this.value = value;
    }

    public IptcRecord(final IptcType iptcType, final String value) {
        this(iptcType, value, "ISO-8859-1");
    }

    public byte[] getRawBytes() {
        return bytes.clone();
    }

    public String getValue() {
        return value;
    }

    public String getIptcTypeName() {
        return iptcType.getName();
    }
}
