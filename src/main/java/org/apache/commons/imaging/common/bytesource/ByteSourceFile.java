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

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.util.IoUtils;

public class ByteSourceFile extends ByteSource {
    private final File file;

    public ByteSourceFile(final File file) {
        super(file.getName());
        this.file = file;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new BufferedInputStream(new FileInputStream(file));
    }

    @Override
    public byte[] getBlock(final long start, final int length) throws IOException {

        RandomAccessFile raf = null;
        boolean canThrow = false;
        try {
            raf = new RandomAccessFile(file, "r");

            // We include a separate check for int overflow.
            if ((start < 0) || (length < 0) || (start + length < 0)
                    || (start + length > raf.length())) {
                throw new IOException("Could not read block (block start: "
                        + start + ", block length: " + length
                        + ", data length: " + raf.length() + ").");
            }

            final byte[] ret = BinaryFunctions.getRAFBytes(raf, start, length,
                    "Could not read value from file");
            canThrow = true;
            return ret;
        } finally {
            IoUtils.closeQuietly(canThrow, raf);
        }
    }

    @Override
    public long getLength() {
        return file.length();
    }

    @Override
    public byte[] getAll() throws IOException {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();

        InputStream is = null;
        boolean canThrow = false;
        try {
            is = new FileInputStream(file);
            is = new BufferedInputStream(is);
            final byte buffer[] = new byte[1024];
            int read;
            while ((read = is.read(buffer)) > 0) {
                baos.write(buffer, 0, read);
            }
            final byte[] ret = baos.toByteArray();
            canThrow = true;
            return ret;
        } finally {
            IoUtils.closeQuietly(canThrow, is);
        }
    }

    @Override
    public String getDescription() {
        return "File: '" + file.getAbsolutePath() + "'";
    }

}
