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
package org.apache.commons.imaging.common.bytesource;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.imaging.common.BinaryFunctions;

public abstract class ByteSource {
    private final String fileName;

    public ByteSource(final String filename) {
        this.fileName = filename;
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

    public abstract InputStream getInputStream() throws IOException;

    public byte[] getBlock(final int start, final int length) throws IOException {
        return getBlock(0xFFFFffffL & start, length);
    }

    public abstract byte[] getBlock(long start, int length) throws IOException;

    public abstract byte[] getAll() throws IOException;

    /**
     * This operation can be VERY expensive; for inputstream byte sources, the
     * entire stream must be drained to determine its length.
     *
     * @return the byte source length
     * @throws IOException if it fails to read the byte source data
     */
    public abstract long getLength() throws IOException;

    public abstract String getDescription();

    public final String getFileName() {
        return fileName;
    }

}
