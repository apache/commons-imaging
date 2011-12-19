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
package org.apache.commons.sanselan.common;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.sanselan.ImageReadException;
import org.apache.commons.sanselan.common.mylzw.MyLzwCompressor;
import org.apache.commons.sanselan.common.mylzw.MyLzwDecompressor;

public class Compression
{

    public byte[] decompressLZW(byte compressed[], int LZWMinimumCodeSize,
            int expectedSize, int byteOrder) throws IOException
    {
        InputStream is = new ByteArrayInputStream(compressed);

        MyLzwDecompressor decompressor = new MyLzwDecompressor(
                LZWMinimumCodeSize, byteOrder);
        byte[] result = decompressor.decompress(is, expectedSize);

        return result;
    }

    public byte[] decompressPackBits(byte compressed[], int expectedSize,
            int byteOrder) throws ImageReadException, IOException
    {
        byte unpacked[] = new PackBits().decompress(compressed, expectedSize);
        return unpacked;
    }

    public byte[] compressLZW(byte src[], int LZWMinimumCodeSize,
            int byteOrder, boolean earlyLimit) throws IOException

    {
        MyLzwCompressor compressor = new MyLzwCompressor(LZWMinimumCodeSize,
                byteOrder, earlyLimit);

        byte compressed[] = compressor.compress(src);

        return compressed;
    }

}