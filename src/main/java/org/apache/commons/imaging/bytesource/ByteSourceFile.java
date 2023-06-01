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

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.file.Files;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.io.RandomAccessFileMode;

class ByteSourceFile extends ByteSource {
    private final File file;

    ByteSourceFile(final File file) {
        super(file.getName());
        this.file = file;
    }

    @Override
    public byte[] getBlock(final long from, final int length) throws IOException {
        try (RandomAccessFile raf = RandomAccessFileMode.READ_ONLY.create(file)) {
            // We include a separate check for int overflow.
            if ((from < 0) || (length < 0) || (from + length < 0) || (from + length > raf.length())) {
                throw new ImagingException(
                        "Could not read block (block start: " + from + ", block length: " + length + ", data length: " + raf.length() + ").");
            }

            return BinaryFunctions.getRAFBytes(raf, from, length, "Could not read value from file");
        }
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new BufferedInputStream(Files.newInputStream(file.toPath()));
    }

    @Override
    public long getLength() {
        return file.length();
    }

}
