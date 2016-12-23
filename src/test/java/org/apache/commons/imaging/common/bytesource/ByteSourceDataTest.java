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

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;

import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ByteSourceDataTest extends ByteSourceTest {

    private final byte[] testByteArray;

    @Parameterized.Parameters
    public static Collection<byte[]> data() {
        return Arrays.asList(getTestByteArrays());
    }

    public ByteSourceDataTest(final byte[] testByteArray) {
        this.testByteArray = testByteArray;
    }

    private interface ByteSourceFactory {
        public ByteSource getByteSource(byte src[]) throws IOException;
    }

    private class ByteSourceFileFactory implements ByteSourceFactory {
        @Override
        public ByteSource getByteSource(final byte src[]) throws IOException {
            final File file = createTempFile(src);

            // test that all bytes written to file.
            assertTrue(src.length == file.length());

            final ByteSource byteSource = new ByteSourceFile(file);
            return byteSource;
        }
    }

    private class ByteSourceInputStreamFileFactory implements ByteSourceFactory {
        @Override
        public ByteSource getByteSource(final byte src[]) throws IOException {
            final File file = createTempFile(src);

            final FileInputStream is = new FileInputStream(file);

            final ByteSource byteSource = new ByteSourceInputStream(is, null);
            return byteSource;
        }
    }

    private static class ByteSourceInputStreamRawFactory implements ByteSourceFactory {
        @Override
        public ByteSource getByteSource(final byte src[]) throws IOException {
            final ByteArrayInputStream is = new ByteArrayInputStream(src);

            final ByteSource byteSource = new ByteSourceInputStream(is, null);
            return byteSource;
        }

    }

    protected void writeAndReadBytes(final ByteSourceFactory byteSourceFactory,
            final byte src[]) throws IOException {
        final ByteSource byteSource = byteSourceFactory.getByteSource(src);

        // test cache during interrupted read cache by reading only first N
        // bytes.
        {
            try (InputStream is = byteSource.getInputStream()) {
                final byte prefix[] = new byte[256];
                final int read = is.read(prefix);

                assertTrue(read <= src.length);
                for (int i = 0; i < read; i++) {
                    assertTrue(src[i] == prefix[i]);
                }
            }
        }

        // test cache by completely reading InputStream N times.
        for (int j = 0; j < 5; j++) {
            final InputStream is = byteSource.getInputStream();
            final byte dst[] = IOUtils.toByteArray(is);

            assertArrayEquals(src, dst);
        }

        {
            // test getAll() method.
            final byte all[] = byteSource.getAll();
            assertArrayEquals(src, all);
        }

        if (src.length > 2) {
            // test optional start param to getInputStream()

            final int start = src.length / 2;

            try (InputStream is = byteSource.getInputStream(start)) {
                final byte dst[] = IOUtils.toByteArray(is);

                assertTrue(src.length == dst.length + start);
                for (int i = 0; i < dst.length; i++) {
                    assertTrue(dst[i] == src[i + start]);
                }
            }
        }

    }

    @Test
    public void testByteSourceFileFactory() throws Exception {
        writeAndReadBytes(new ByteSourceFileFactory(), testByteArray);
    }
    @Test
    public void testByteSourceInputStreamFileFactory() throws Exception {
        writeAndReadBytes(new ByteSourceInputStreamFileFactory(), testByteArray);
    }
    @Test
    public void testByteSourceInputStreamRawFactory() throws Exception {
        writeAndReadBytes(new ByteSourceInputStreamRawFactory(), testByteArray);
    }
}
