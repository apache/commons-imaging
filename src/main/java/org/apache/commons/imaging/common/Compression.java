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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.mylzw.MyLzwCompressor;
import org.apache.commons.imaging.common.mylzw.MyLzwDecompressor;

public class Compression {

    public byte[] decompressLZW(final byte compressed[], final int LZWMinimumCodeSize,
            final int expectedSize, final ByteOrder byteOrder) throws IOException {
        final InputStream is = new ByteArrayInputStream(compressed);

        final MyLzwDecompressor decompressor = new MyLzwDecompressor(
                LZWMinimumCodeSize, byteOrder);
        final byte[] result = decompressor.decompress(is, expectedSize);

        return result;
    }

    public byte[] decompressPackBits(final byte compressed[], final int expectedSize,
            final ByteOrder byteOrder) throws ImageReadException {
        final byte unpacked[] = new PackBits().decompress(compressed, expectedSize);
        return unpacked;
    }

    public byte[] compressLZW(final byte src[], final int LZWMinimumCodeSize,
            final ByteOrder byteOrder, final boolean earlyLimit) throws IOException

    {
        final MyLzwCompressor compressor = new MyLzwCompressor(LZWMinimumCodeSize,
                byteOrder, earlyLimit);

        final byte compressed[] = compressor.compress(src);

        return compressed;
    }

}
