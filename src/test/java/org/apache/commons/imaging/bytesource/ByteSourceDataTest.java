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

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ByteSourceDataTest extends AbstractByteSourceTest {

    private interface ByteSourceFactory {
        ByteSource getByteSource(byte[] src) throws IOException;
    }

    private class ByteSourceFileFactory implements ByteSourceFactory {
        @Override
        public ByteSource getByteSource(final byte[] src) throws IOException {
            final File file = createTempFile(src);

            // test that all bytes written to file.
            assertEquals(src.length, file.length());

            return ByteSource.file(file);
        }
    }

    private class ByteSourceInputStreamFileFactory implements ByteSourceFactory {
        @Override
        public ByteSource getByteSource(final byte[] src) throws IOException {
            final File file = createTempFile(src);

            final FileInputStream is = new FileInputStream(file);

            return ByteSource.inputStream(is, null);
        }
    }

    private static final class ByteSourceInputStreamRawFactory implements ByteSourceFactory {
        @Override
        public ByteSource getByteSource(final byte[] src) throws IOException {
            final ByteArrayInputStream is = new ByteArrayInputStream(src);

            return ByteSource.inputStream(is, null);
        }

    }

    private class ByteSourcePathFactory implements ByteSourceFactory {
        @Override
        public ByteSource getByteSource(final byte[] src) throws IOException {
            final Path file = createTempFile(src).toPath();

            // test that all bytes written to file.
            assertEquals(src.length, Files.size(file));

            return ByteSource.path(file);
        }
    }

    public static Stream<byte[]> data() {
        return Arrays.asList(getTestByteArrays()).stream();
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

    @ParameterizedTest
    @MethodSource("data")
    public void testByteSourcePathFactory(final byte[] testByteArray) throws Exception {
        writeAndReadBytes(new ByteSourcePathFactory(), testByteArray);
    }

    protected void writeAndReadBytes(final ByteSourceFactory byteSourceFactory,
            final byte[] src) throws IOException {
        final ByteSource byteSource = byteSourceFactory.getByteSource(src);

        // test cache during interrupted read cache by reading only first N
        // bytes.
        {
            try (InputStream is = byteSource.getInputStream()) {
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
            try (final InputStream is = byteSource.getInputStream()) {
                final byte[] dst = IOUtils.toByteArray(is);

                assertArrayEquals(src, dst);
            }
        }

        if (src.length > 2) {
            // test optional start param to getInputStream()

            final int start = src.length / 2;

            try (InputStream is = byteSource.getInputStream(start)) {
                final byte[] dst = IOUtils.toByteArray(is);

                assertEquals(src.length, dst.length + start);
                for (int i = 0; i < dst.length; i++) {
                    assertEquals(dst[i], src[i + start]);
                }
            }
        }

    }
}
