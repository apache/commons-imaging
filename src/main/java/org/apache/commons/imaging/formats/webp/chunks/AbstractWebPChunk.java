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
package org.apache.commons.imaging.formats.webp.chunks;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.BinaryFileParser;
import org.apache.commons.imaging.internal.SafeOperations;

/**
 * A WebP image is composed of several chunks. This is the base class for the chunks, used by the parser.
 *
 * @see <a href="https://developers.google.com/speed/webp/docs/riff_container">WebP Container Specification</a>
 * @since 1.0.0-alpha4
 */
public abstract class AbstractWebPChunk extends BinaryFileParser {

    private static boolean checkArgs(final int size, final byte[] bytes) throws ImagingException {
        if (size != bytes.length) {
            throw new ImagingException("Chunk size must match bytes length");
        }
        return true;
    }

    private final int type;
    private final int size;
    protected final byte[] bytes;
    private final int chunkSize;

    /**
     * Create a new WebP chunk.
     *
     * @param type  chunk type.
     * @param size  chunk size.
     * @param bytes chunk data.
     * @throws ImagingException if the chunk data and the size provided do not match.
     */
    public AbstractWebPChunk(final int type, final int size, final byte[] bytes) throws ImagingException {
        this(type, size, bytes, checkArgs(size, bytes));
    }

    private AbstractWebPChunk(final int type, final int size, final byte[] bytes, final boolean ignored) {
        super(ByteOrder.LITTLE_ENDIAN);
        this.type = type;
        this.size = bytes.length;
        this.bytes = bytes;
        // if chunk size is odd, a single padding byte is added
        final int padding = size % 2 != 0 ? 1 : 0;
        // Chunk FourCC (4 bytes) + Chunk Size (4 bytes) + Chunk Payload (n bytes) + Padding
        this.chunkSize = SafeOperations.add(4, 4, size, padding);
    }

    /**
     * Print the chunk to the given stream.
     *
     * @param pw     a stream to write to.
     * @param offset chunk offset.
     * @throws ImagingException if the image is invalid.
     * @throws IOException      if it fails to write to the given stream.
     */
    public void dump(final PrintWriter pw, final int offset) throws ImagingException, IOException {
        pw.printf("Chunk %s at offset %s, length %d%n, payload size %d%n", getTypeDescription(), offset >= 0 ? String.valueOf(offset) : "unknown",
                getChunkSize(), getPayloadSize());
    }

    /**
     * @return a copy of the chunk data as bytes.
     */
    public byte[] getBytes() {
        return bytes.clone();
    }

    /**
     * @return the chunk size.
     */
    public int getChunkSize() {
        return chunkSize;
    }

    /**
     * @return the payload size.
     */
    public int getPayloadSize() {
        return size;
    }

    /**
     * @return the chunk type.
     */
    public int getType() {
        return type;
    }

    /**
     * @return the description of the chunk type.
     */
    public String getTypeDescription() {
        return new String(new byte[] { (byte) (type & 0xff), (byte) (type >> 8 & 0xff), (byte) (type >> 16 & 0xff), (byte) (type >> 24 & 0xff) },
                StandardCharsets.UTF_8);
    }
}
