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

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

import org.apache.commons.imaging.ImagingConstants;

public class IoUtils implements ImagingConstants {
    public static void closeQuietly(final boolean mayThrow, final Closeable... closeables)
            throws IOException {
        IOException firstException = null;
        for (final Closeable closeable : closeables) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (final IOException ioException) {
                    if (mayThrow && firstException == null) {
                        firstException = ioException;
                    }
                }
            }
        }
        if (firstException != null) {
            throw firstException;
        }
    }
    
    public static final boolean copyFileNio(final File src, final File dst)
            throws IOException {
        FileChannel srcChannel = null, dstChannel = null;
        boolean canThrow = false;
        try {
            // Create channel on the source
            srcChannel = new FileInputStream(src).getChannel();

            // Create channel on the destination
            dstChannel = new FileOutputStream(dst).getChannel();

            // // Copy file contents from source to destination
            // dstChannel.transferFrom(srcChannel, 0, srcChannel.size());

            {
                // long theoretical_max = (64 * 1024 * 1024) - (32 * 1024);
                final int safe_max = (64 * 1024 * 1024) / 4;
                final long size = srcChannel.size();
                long position = 0;
                while (position < size) {
                    position += srcChannel.transferTo(position, safe_max,
                            dstChannel);
                }
            }
            canThrow = true;
            return true;
        } finally {
            IoUtils.closeQuietly(canThrow, srcChannel, dstChannel);
        }
    }

    public static void copyStreamToStream(final InputStream src, final OutputStream dst)
            throws IOException {
        copyStreamToStream(src, dst, true);
    }

    public static void copyStreamToStream(final InputStream src, final OutputStream dst,
            final boolean close_streams) throws IOException {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        boolean canThrow = false;
        try {
            bis = new BufferedInputStream(src);
            bos = new BufferedOutputStream(dst);

            int count;
            final byte[] buffer = new byte[4096];
            while ((count = bis.read(buffer, 0, buffer.length)) > 0) {
                dst.write(buffer, 0, count);
            }
            bos.flush();
            canThrow = true;
        } finally {
            if (close_streams) {
                IoUtils.closeQuietly(canThrow, bis, bos);
            }
        }

    }

    /**
     * Reads a File into memory.
     * <p>
     * 
     * @param file
     *            The File to read.
     * @return A byte array containing the contents of the File
     * @see InputStream
     */
    public static byte[] getFileBytes(final File file) throws IOException {
        InputStream is = null;
        boolean canThrow = false;
        try {
            is = new FileInputStream(file);

            final byte[] ret = getInputStreamBytes(is);
            canThrow = true;
            return ret;
        } finally {
            IoUtils.closeQuietly(canThrow, is);
        }
    }

    /**
     * Reads an InputStream to the end.
     * <p>
     * 
     * @param is
     *            The InputStream to read.
     * @return A byte array containing the contents of the InputStream
     * @see InputStream
     */
    public static byte[] getInputStreamBytes(InputStream is) throws IOException {
        ByteArrayOutputStream os = null;
        boolean canThrow = false;
        try {
            os = new ByteArrayOutputStream(4096);

            is = new BufferedInputStream(is);

            int count;
            final byte[] buffer = new byte[4096];
            while ((count = is.read(buffer, 0, 4096)) > 0) {
                os.write(buffer, 0, count);
            }

            os.flush();

            final byte[] ret = os.toByteArray();
            canThrow = true;
            return ret;
        } finally {
            IoUtils.closeQuietly(canThrow, os);
        }
    }

    public static void putInputStreamToFile(final InputStream src, final File file)
            throws IOException {
        FileOutputStream stream = null;
        boolean canThrow = false;
        try {
            if (file.getParentFile() != null && !file.getParentFile().exists() &&
                !file.getParentFile().mkdirs()) {
                throw new IOException(
                        "Could not create directory for file " + file);
            }
            stream = new FileOutputStream(file);

            copyStreamToStream(src, stream);
            canThrow = true;
        } finally {
            IoUtils.closeQuietly(canThrow, stream);
        }
    }

    public static void writeToFile(final byte[] src, final File file) throws IOException {
        ByteArrayInputStream stream = null;
        boolean canThrow = false;
        try {
            stream = new ByteArrayInputStream(src);

            putInputStreamToFile(stream, file);
            canThrow = true;
        } finally {
            IoUtils.closeQuietly(canThrow, stream);
        }
    }

    /**
     * This class should never be instantiated.
     */
    private IoUtils() {
    }

}
