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

package org.apache.commons.sanselan.common.byteSources;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.sanselan.common.byteSources.ByteSource;
import org.apache.commons.sanselan.common.byteSources.ByteSourceFile;
import org.apache.commons.sanselan.common.byteSources.ByteSourceInputStream;
import org.apache.commons.sanselan.util.IOUtils;

public class ByteSourceDataTest extends ByteSourceTest
{

    private interface ByteSourceFactory
    {
        public ByteSource getByteSource(byte src[]) throws IOException;
    }

    private class ByteSourceFileFactory implements ByteSourceFactory
    {
        public ByteSource getByteSource(byte src[]) throws IOException
        {
            File file = createTempFile(src);

            // test that all bytes written to file.
            assertTrue(src.length == file.length());

            ByteSource byteSource = new ByteSourceFile(file);
            return byteSource;
        }
    }

    private class ByteSourceInputStreamFileFactory implements ByteSourceFactory
    {
        public ByteSource getByteSource(byte src[]) throws IOException
        {
            File file = createTempFile(src);

            FileInputStream is = new FileInputStream(file);

            ByteSource byteSource = new ByteSourceInputStream(is, null);
            return byteSource;
        }
    }

    private class ByteSourceInputStreamRawFactory implements ByteSourceFactory
    {
        public ByteSource getByteSource(byte src[]) throws IOException
        {
            ByteArrayInputStream is = new ByteArrayInputStream(src);

            ByteSource byteSource = new ByteSourceInputStream(is, null);
            return byteSource;
        }

    }

    protected void writeAndReadBytes(ByteSourceFactory byteSourceFactory,
            byte src[]) throws IOException
    {
        ByteSource byteSource = byteSourceFactory.getByteSource(src);

        // test cache during interrupted read cache by reading only first N bytes.
        {
            InputStream is = byteSource.getInputStream();
            byte prefix[] = new byte[256];
            int read = is.read(prefix);

            assertTrue(read <= src.length);
            for (int i = 0; i < read; i++)
                assertTrue(src[i] == prefix[i]);
        }

        // test cache by completely reading InputStream N times.
        for (int j = 0; j < 5; j++)
        {
            InputStream is = byteSource.getInputStream();
            byte dst[] = IOUtils.getInputStreamBytes(is);

            compareByteArrays(src, dst);
        }

        {
            // test getAll() method.
            byte all[] = byteSource.getAll();
            compareByteArrays(src, all);
        }

        if (src.length > 2)
        {
            // test optional start param to getInputStream()

            int start = src.length / 2;

            InputStream is = byteSource.getInputStream(start);
            byte dst[] = IOUtils.getInputStreamBytes(is);

            assertTrue(src.length == dst.length + start);
            for (int i = 0; i < dst.length; i++)
                assertTrue(dst[i] == src[i + start]);
        }

    }

    public void test() throws IOException
    {
        ByteSourceFactory byteSourceFactories[] = {
                new ByteSourceFileFactory(),
                new ByteSourceInputStreamFileFactory(),
                new ByteSourceInputStreamRawFactory(),
        };

        byte testByteArrays[][] = getTestByteArrays();

        for (int i = 0; i < testByteArrays.length; i++)
        {
            byte testByteArray[] = testByteArrays[i];

            for (int j = 0; j < byteSourceFactories.length; j++)
            {
                ByteSourceFactory byteSourceFactory = byteSourceFactories[j];

                writeAndReadBytes(byteSourceFactory, testByteArray);
            }
        }
    }
}
