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
package org.apache.commons.sanselan.common.bytesource;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteSourceInputStream extends ByteSource
{
    private final InputStream is;
    private CacheBlock cacheHead = null;
    private static final int BLOCK_SIZE = 1024;

    public ByteSourceInputStream(InputStream is, String filename)
    {
        super(filename);
        this.is = new BufferedInputStream(is);
    }

    private class CacheBlock
    {
        public final byte bytes[];
        private CacheBlock next = null;
        private boolean triedNext = false;

        public CacheBlock(final byte[] bytes)
        {
            this.bytes = bytes;
        }

        public CacheBlock getNext() throws IOException
        {
            if (null != next)
                return next;
            if (triedNext)
                return null;
            triedNext = true;
            next = readBlock();
            return next;
        }

    }

    private byte readBuffer[] = null;

    private CacheBlock readBlock() throws IOException
    {
        if (null == readBuffer)
            readBuffer = new byte[BLOCK_SIZE];

        int read = is.read(readBuffer);
        if (read < 1)
            return null;
        else if (read < BLOCK_SIZE)
        {
            // return a copy.
            byte result[] = new byte[read];
            System.arraycopy(readBuffer, 0, result, 0, read);
            return new CacheBlock(result);
        }
        else
        {
            // return current buffer.
            byte result[] = readBuffer;
            readBuffer = null;
            return new CacheBlock(result);
        }
    }

    private CacheBlock getFirstBlock() throws IOException
    {
        if (null == cacheHead)
            cacheHead = readBlock();
        return cacheHead;
    }

    private class CacheReadingInputStream extends InputStream
    {
        private CacheBlock block = null;
        private boolean readFirst = false;
        private int blockIndex = 0;

        public int read() throws IOException
        {
            if (null == block)
            {
                if (readFirst)
                    return -1;
                block = getFirstBlock();
                readFirst = true;
            }

            if (block != null && blockIndex >= block.bytes.length)
            {
                block = block.getNext();
                blockIndex = 0;
            }

            if (null == block)
                return -1;

            if (blockIndex >= block.bytes.length)
                return -1;

            return 0xff & block.bytes[blockIndex++];
        }

        public int read(byte b[], int off, int len) throws IOException
        {
            // first section copied verbatim from InputStream
            if (b == null)
                throw new NullPointerException();
            else if ((off < 0) || (off > b.length) || (len < 0)
                    || ((off + len) > b.length) || ((off + len) < 0))
                throw new IndexOutOfBoundsException();
            else if (len == 0)
                return 0;

            // optimized block read

            if (null == block)
            {
                if (readFirst)
                    return -1;
                block = getFirstBlock();
                readFirst = true;
            }

            if (block != null && blockIndex >= block.bytes.length)
            {
                block = block.getNext();
                blockIndex = 0;
            }

            if (null == block)
                return -1;

            if (blockIndex >= block.bytes.length)
                return -1;

            int readSize = Math.min(len, block.bytes.length - blockIndex);
            System.arraycopy(block.bytes, blockIndex, b, off, readSize);
            blockIndex += readSize;
            return readSize;
        }

    }

    public InputStream getInputStream() throws IOException
    {
        return new CacheReadingInputStream();
    }

    public byte[] getBlock(int blockStart, int blockLength) throws IOException
    {
        // We include a separate check for int overflow.
        if ((blockStart < 0)
                || (blockLength < 0)
                || (blockStart + blockLength < 0)
                || (blockStart + blockLength > streamLength.longValue())) {
            throw new IOException("Could not read block (block start: " + blockStart
                    + ", block length: " + blockLength + ", data length: "
                    + streamLength + ").");
        }

        InputStream is = getInputStream();
        is.skip(blockStart);

        byte bytes[] = new byte[blockLength];
        int total = 0;
        while (true)
        {
            int read = is.read(bytes, total, bytes.length - total);
            if (read < 1)
                throw new IOException("Could not read block.");
            total += read;
            if (total >= blockLength)
                return bytes;
        }
    }

    private Long streamLength = null;

    public long getLength() throws IOException
    {
        if (streamLength != null)
            return streamLength.longValue();

        InputStream is = getInputStream();
        long result = 0;
        long skipped;
        while ((skipped = is.skip(1024)) > 0)
            result += skipped;
        streamLength = new Long(result);
        return result;
    }

    public byte[] getAll() throws IOException
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        CacheBlock block = getFirstBlock();
        while (block != null)
        {
            baos.write(block.bytes);
            block = block.getNext();
        }
        return baos.toByteArray();
    }

    public String getDescription()
    {
        return "Inputstream: '" + filename + "'";
    }

}