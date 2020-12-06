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
package org.apache.commons.imaging.common;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class BinaryConstant {
    private final byte[] value;

    public BinaryConstant(final byte[] value) {
        this.value = value.clone();
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof BinaryConstant)) {
            return false;
        }
        final BinaryConstant other = (BinaryConstant) obj;
        return equals(other.value);
    }

    public boolean equals(final byte[] bytes) {
        return Arrays.equals(value, bytes);
    }

    public boolean equals(final byte[] bytes, final int offset, final int length) {
        if (value.length != length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (value[i] != bytes[offset + i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(value);
    }

    public byte get(final int i) {
        return value[i];
    }

    public int size() {
        return value.length;
    }

    public byte[] toByteArray() {
        return value.clone();
    }

    public void writeTo(final OutputStream os) throws IOException {
        for (final byte element : value) {
            os.write(element);
        }
    }
}
