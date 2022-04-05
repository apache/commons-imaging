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

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.Stream;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ByteSourceDataTest extends ByteSourceTest {

    public static Stream<byte[]> data() {
        return Arrays.asList(getTestByteArrays()).stream();
    }

    private interface ByteSourceFactory {
        ByteSource getByteSource(byte[] src) throws IOException;
    }

    public class FactoryFinder{
        public ByteSourceFactory getObjinform(String str){
            if(str.equals("BSFF")){
                return new ByteSourceFileFactory();
            }else if(str.equals("BSISFF")){
                return new ByteSourceInputStreamFileFactory();
            }else {
                return null;
            }
        }
    }

    private class ByteSourceFileFactory implements ByteSourceFactory {
        @Override
        public ByteSource getByteSource(final byte[] src) throws IOException {
            final File file = createTempFile(src);

            // test that all bytes written to file.
            assertEquals(src.length, file.length());

            return new ByteSourceFile(file);
        }
    }

    private class ByteSourceInputStreamFileFactory implements ByteSourceFactory {
        @Override
        public ByteSource getByteSource(final byte[] src) throws IOException {
            final File file = createTempFile(src);

            final FileInputStream is = new FileInputStream(file);

            return new ByteSourceInputStream(is, null);
        }
    }

    private static class ByteSourceInputStreamRawFactory implements ByteSourceFactory {
        @Override
        public ByteSource getByteSource(final byte[] src) throws IOException {
            final ByteArrayInputStream is = new ByteArrayInputStream(src);

            return new ByteSourceInputStream(is, null);
        }

    }

    protected void writeAndReadBytes(final ByteSourceFactory byteSourceFactory,
                                     final byte[] src) throws IOException {
        //final ByteSource byteSource = byteSourceFactory.getByteSource(src);
        FactoryFinder tff = new FactoryFinder();
        ByteSourceFactory byteSource = tff.getObjinform("BSFF");

        // test cache during interrupted read cache by reading only first N
        // bytes.
        {
            try (InputStream is = byteSource.getByteSource(src).getInputStream()) {
                final byte[] prefix = new byte[256];
                final int read = is.read(prefix);

                assertTrue(read <= src.length);
                for (int i = 0; i < read; i++) {
                    assertEquals(src[i], prefix[i]);
                }
            }
        }

        // test cache by completely reading InputStream N times.
        for (int j = 0; j < 5; j++) {
            try (final InputStream is = byteSource.getByteSource(src).getInputStream()) {
                final byte[] dst = IOUtils.toByteArray(is);

                assertArrayEquals(src, dst);
            }
        }

        {
            // test getAll() method.
            final byte[] all = byteSource.getByteSource(src).getAll();
            assertArrayEquals(src, all);
        }

        if (src.length > 2) {
            // test optional start param to getInputStream()

            final int start = src.length / 2;

            try (InputStream is = byteSource.getByteSource(src).getInputStream(start)) {
                final byte[] dst = IOUtils.toByteArray(is);

                assertEquals(src.length, dst.length + start);
                for (int i = 0; i < dst.length; i++) {
                    assertEquals(dst[i], src[i + start]);
                }
            }
        }

    }

    @ParameterizedTest
    @MethodSource("data")
    public void testByteSourceFileFactory(final byte[] testByteArray) throws Exception {
        writeAndReadBytes(new ByteSourceFileFactory(), testByteArray);
    }
    @ParameterizedTest
    @MethodSource("data")
    public void testByteSourceInputStreamFileFactory(final byte[] testByteArray) throws Exception {
        writeAndReadBytes(new ByteSourceInputStreamFileFactory(), testByteArray);
    }
    @ParameterizedTest
    @MethodSource("data")
    public void testByteSourceInputStreamRawFactory(final byte[] testByteArray) throws Exception {
        writeAndReadBytes(new ByteSourceInputStreamRawFactory(), testByteArray);
    }
}
