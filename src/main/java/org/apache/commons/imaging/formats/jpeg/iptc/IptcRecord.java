/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.imaging.formats.jpeg.iptc;

import java.util.Comparator;

/**
 * Represents an IPTC record, a single key-value pair of Photoshop IPTC data.
 */
public class IptcRecord {
    /** Comparator for sorting IPTC records by type. */
    public static final Comparator<IptcRecord> COMPARATOR = Comparator.comparingInt(e -> e.iptcType.getType());
    /** The IPTC type. */
    public final IptcType iptcType;
    private final String value;

    /**
     * Constructs a new IPTC record.
     *
     * @param iptcType the IPTC type.
     * @param value the value.
     */
    public IptcRecord(final IptcType iptcType, final String value) {
        this.iptcType = iptcType;
        this.value = value;
    }

    /**
     * Gets the IPTC type name.
     *
     * @return the IPTC type name.
     */
    public String getIptcTypeName() {
        return iptcType.getName();
    }

    /**
     * Gets the value.
     *
     * @return the value.
     */
    public String getValue() {
        return value;
    }
}
