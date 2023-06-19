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
package org.apache.commons.imaging.bytesource;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.io.build.AbstractOrigin;
import org.apache.commons.io.build.AbstractOrigin.ByteArrayOrigin;
import org.apache.commons.io.build.AbstractOrigin.FileOrigin;

public class ByteSource {

    public static ByteSource array(final byte[] array) {
        return new ByteSource(new ByteArrayOrigin(array), null);
    }

    public static ByteSource array(final byte[] array, final String name) {
        return new ByteSource(new ByteArrayOrigin(array), name);
    }

    public static ByteSource file(final File file) {
        return new ByteSource(new FileOrigin(file), file.getName());
    }

    public static ByteSource inputStream(final InputStream is, final String name) {
        return new ByteSourceInputStream(is, name);
    }

    private final String fileName;
    private final AbstractOrigin<?, ?> origin;

    public ByteSource(final AbstractOrigin<?, ?> origin, final String fileName) {
        this.fileName = fileName;
        this.origin = origin;
    }

    public byte[] getByteArray(final long position, final int length) throws IOException {
        final byte[] bytes = origin.getByteArray();
        // Checks for int overflow.
        final int start = Math.toIntExact(position);
        if (start < 0 || length < 0 || start + length < 0 || start + length > bytes.length) {
            throw new IllegalArgumentException("Couldn't read array (start: " + start + ", length: " + length + ", data length: " + bytes.length + ").");
        }
        return Arrays.copyOfRange(bytes, start, start + length);
    }

    public final String getFileName() {
        return fileName;
    }

    public InputStream getInputStream() throws IOException {
        return origin.getInputStream();
    }

    public final InputStream getInputStream(final long start) throws IOException {
        InputStream is = null;
        boolean succeeded = false;
        try {
            is = getInputStream();
            BinaryFunctions.skipBytes(is, start);
            succeeded = true;
        } finally {
            if (!succeeded && is != null) {
                is.close();
            }
        }
        return is;
    }

    /**
     * This operation can be VERY expensive; for InputStream byte sources, the entire stream must be drained to determine its length.
     *
     * @return the byte source length
     * @throws IOException if it fails to read the byte source data
     */
    public long size() throws IOException {
        return origin.getByteArray().length;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + getFileName() + "]";
    }

}
