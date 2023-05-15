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
package org.apache.commons.imaging.formats.tiff.write;

import java.io.IOException;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.BinaryOutputStream;

abstract class TiffOutputItem {

    public static class Value extends TiffOutputItem {

        static final int SHALLOW_SIZE = 32;
        private final byte[] bytes;
        private final String name;

        Value(final String name, final byte[] bytes) {
            this.name = name;
            this.bytes = bytes;
        }

        @Override
        public String getItemDescription() {
            return name;
        }

        @Override
        public int getItemLength() {
            return bytes.length;
        }

        public void updateValue(final byte[] bytes) throws ImagingException {
            if (this.bytes.length != bytes.length) {
                throw new ImagingException("Updated data size mismatch: "
                        + this.bytes.length + " vs. " + bytes.length);
            }
            System.arraycopy(bytes, 0, this.bytes, 0, bytes.length);
        }

        @Override
        public void writeItem(final BinaryOutputStream bos) throws IOException,
                ImagingException {
            bos.write(bytes);
        }
    }

    public static final long UNDEFINED_VALUE = -1;

    private long offset = UNDEFINED_VALUE;

    public abstract String getItemDescription();

    public abstract int getItemLength();

    protected long getOffset() {
        return offset;
    }

    protected void setOffset(final long offset) {
        this.offset = offset;
    }

    public abstract void writeItem(BinaryOutputStream bos) throws IOException,
            ImagingException;
}
