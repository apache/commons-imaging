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
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Objects;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.Allocator;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.build.AbstractOrigin.InputStreamOrigin;

final class InputStreamByteSource extends ByteSource {

    /**
     * A block of bytes (a byte array).
     */
    private final class Block {

        final byte[] bytes;
        private Block next;
        private boolean triedNext;

        Block(final byte[] bytes) {
            this.bytes = Objects.requireNonNull(bytes);
        }

        Block getNext() throws IOException {
            if (next != null) {
                return next;
            }
            if (triedNext) {
                return null;
            }
            triedNext = true;
            next = readBlock();
            return next;
        }

        int length() {
            return bytes.length;
        }
    }

    private final class BlockInputStream extends InputStream {

        private Block block;
        private boolean readFirst;
        private int blockIndex;

        @Override
        public int read() throws IOException {
            if (block == null) {
                if (readFirst) {
                    return -1;
                }
                block = getFirstBlock();
                readFirst = true;
            }
            if (block != null && blockIndex >= block.length()) {
                block = block.getNext();
                blockIndex = 0;
            }
            if (block == null) {
                return -1;
            }
            if (blockIndex >= block.length()) {
                return -1;
            }
            return 0xff & block.bytes[blockIndex++];
        }

        @Override
        public int read(final byte[] array, final int off, final int len) throws IOException {
            Objects.requireNonNull(array, "array");
            if (off < 0 || off > array.length || len < 0 || off + len > array.length || off + len < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (len == 0) {
                return 0;
            }
            // optimized block read
            if (block == null) {
                if (readFirst) {
                    return -1;
                }
                block = getFirstBlock();
                readFirst = true;
            }
            if (block != null && blockIndex >= block.length()) {
                block = block.getNext();
                blockIndex = 0;
            }
            if (block == null) {
                return -1;
            }
            if (blockIndex >= block.length()) {
                return -1;
            }
            final int readSize = Math.min(len, block.length() - blockIndex);
            System.arraycopy(block.bytes, blockIndex, array, off, readSize);
            blockIndex += readSize;
            return readSize;
        }

        @Override
        public long skip(final long n) throws IOException {
            long remaining = n;
            if (n <= 0) {
                return 0;
            }
            while (remaining > 0) {
                // read the first block
                if (block == null) {
                    if (readFirst) {
                        return -1;
                    }
                    block = getFirstBlock();
                    readFirst = true;
                }
                // get next block
                if (block != null && blockIndex >= block.length()) {
                    block = block.getNext();
                    blockIndex = 0;
                }
                if (block == null) {
                    break;
                }
                if (blockIndex >= block.length()) {
                    break;
                }
                final int readSize = Math.min((int) Math.min(BLOCK_SIZE, remaining), block.length() - blockIndex);
                blockIndex += readSize;
                remaining -= readSize;
            }
            return n - remaining;
        }
    }

    private static final int BLOCK_SIZE = IOUtils.DEFAULT_BUFFER_SIZE;
    private final InputStream inputStream;
    private Block headBlock;
    private byte[] readBuffer;
    private long streamLength = -1;

    InputStreamByteSource(final InputStream inputStream, final String fileName) {
        super(new InputStreamOrigin(inputStream), fileName);
        this.inputStream = new BufferedInputStream(inputStream);
    }

    @SuppressWarnings("resource") // accesses input stream more than once, don't close here.
    @Override
    public byte[] getByteArray(final long position, final int length) throws IOException {
        // We include a separate check for int overflow.
        if (position < 0 || length < 0 || position + length < 0 || position + length > size()) {
            throw new ImagingException(
                    "Could not read block (block start: " + position + ", block length: " + length + ", data length: " + streamLength + ").");
        }
        final InputStream cis = getInputStream();
        BinaryFunctions.skipBytes(cis, position);
        final byte[] bytes = Allocator.byteArray(length);
        int total = 0;
        while (true) {
            final int read = cis.read(bytes, total, bytes.length - total);
            if (read < 1) {
                throw new ImagingException("Could not read block.");
            }
            total += read;
            if (total >= length) {
                return bytes;
            }
        }
    }

    private Block getFirstBlock() throws IOException {
        if (headBlock == null) {
            headBlock = readBlock();
        }
        return headBlock;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new BlockInputStream();
    }

    private Block readBlock() throws IOException {
        if (readBuffer == null) {
            readBuffer = new byte[BLOCK_SIZE];
        }
        final int read = inputStream.read(readBuffer);
        if (read < 1) {
            return null;
        }
        if (read < BLOCK_SIZE) {
            // return a copy.
            return new Block(Arrays.copyOf(readBuffer, read));
        }
        // return current buffer.
        final byte[] result = readBuffer;
        readBuffer = null;
        return new Block(result);
    }

    @Override
    public long size() throws IOException {
        if (streamLength >= 0) {
            return streamLength;
        }
        try (InputStream cis = getInputStream()) {
            return streamLength = IOUtils.consume(cis);
        }
    }
}
