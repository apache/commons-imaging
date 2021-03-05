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
package org.apache.commons.imaging.formats.tiff;

import java.util.Comparator;

public abstract class TiffElement {
    public final long offset;
    public final int length;
    public static final Comparator<TiffElement> COMPARATOR = (e1, e2) -> {
        if (e1.offset < e2.offset) {
            return -1;
        }
        if (e1.offset > e2.offset) {
            return 1;
        }
        return 0;
    };

    public TiffElement(final long offset, final int length) {
        this.offset = offset;
        this.length = length;
    }

    public abstract String getElementDescription();

    public abstract static class DataElement extends TiffElement {
        private final byte[] data;

        public DataElement(final long offset, final int length, final byte[] data) {
            super(offset, length);

            this.data = data;
        }

        public byte[] getData() {
            return data.clone();
        }

        public int getDataLength() {
            return data.length;
        }
    }

    public static final class Stub extends TiffElement {
        public Stub(final long offset, final int length) {
            super(offset, length);
        }

        @Override
        public String getElementDescription() {
            return "Element, offset: " + offset + ", length: " + length
                    + ", last: " + (offset + length);
        }

    }
}
