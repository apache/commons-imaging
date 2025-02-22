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

    public boolean equals(final byte[] bytes) {
        return Arrays.equals(value, bytes);
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

    public byte get(final int i) {
        return value[i];
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(value);
    }

    public int size() {
        return value.length;
    }

    /**
     * Tests whether the give buffer starts with this binary constant.
     *
     * @param buffer The buffer to test.
     * @return Whether the give buffer starts with this binary constant.
     */
    public boolean isStartOf(final byte[] buffer) {
        return BinaryFunctions.startsWith(buffer, value);
    }

    public void writeTo(final OutputStream os) throws IOException {
        for (final byte element : value) {
            os.write(element);
        }
    }
}
