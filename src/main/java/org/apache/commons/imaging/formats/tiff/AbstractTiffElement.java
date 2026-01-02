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
package org.apache.commons.imaging.formats.tiff;

import java.util.Comparator;

/**
 * Abstract class for TIFF elements.
 */
public abstract class AbstractTiffElement {

    /**
     * Represents a TIFF element that contains data.
     */
    public abstract static class DataElement extends AbstractTiffElement {
        private final byte[] data;

        /**
         * Constructs a new data element.
         *
         * @param offset the offset in the TIFF file.
         * @param length the length of the element.
         * @param data the element data.
         */
        public DataElement(final long offset, final int length, final byte[] data) {
            super(offset, length);

            this.data = data;
        }

        /**
         * Gets a copy of the element data.
         *
         * @return the data.
         */
        public byte[] getData() {
            return data.clone();
        }

        /**
         * Gets the length of the data.
         *
         * @return the data length.
         */
        public int getDataLength() {
            return data.length;
        }
    }

    /**
     * Represents a stub TIFF element with no specific data.
     */
    public static final class Stub extends AbstractTiffElement {
        /**
         * Constructs a new stub element.
         *
         * @param offset the offset in the TIFF file.
         * @param length the length of the element.
         */
        public Stub(final long offset, final int length) {
            super(offset, length);
        }

        @Override
        public String getElementDescription() {
            return "Element, offset: " + offset + ", length: " + length + ", last: " + (offset + length);
        }

    }

    /** Comparator for sorting TIFF elements by offset. */
    public static final Comparator<AbstractTiffElement> COMPARATOR = Comparator.comparingLong(e -> e.offset);

    /** The offset of this element in the TIFF file. */
    public final long offset;

    /** The length of this element. */
    public final int length;

    /**
     * Constructs a new TIFF element.
     *
     * @param offset the offset in the TIFF file.
     * @param length the length of the element.
     */
    public AbstractTiffElement(final long offset, final int length) {
        this.offset = offset;
        this.length = length;
    }

    /**
     * Gets a description of this element.
     *
     * @return the element description.
     */
    public abstract String getElementDescription();
}
