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

package org.apache.commons.imaging.util;

import java.io.UnsupportedEncodingException;

import org.apache.commons.imaging.common.BinaryConstants;

public abstract class UnicodeUtils implements BinaryConstants {
    /**
     * This class should never be instantiated.
     */
    private UnicodeUtils() {
    }

    public static final boolean isValidISO_8859_1(String s) {
        try {
            String roundtrip = new String(s.getBytes("ISO-8859-1"),
                    "ISO-8859-1");
            return s.equals(roundtrip);
        } catch (UnsupportedEncodingException e) {
            // should never be thrown.
            throw new RuntimeException("Error parsing string.", e);
        }
    }
}
