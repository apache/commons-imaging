/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.imaging.bytesource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;

import org.apache.commons.imaging.AbstractImagingTest;
import org.apache.commons.imaging.ImagingConstants;
import org.junit.jupiter.api.Test;

public abstract class AbstractByteSourceTest extends AbstractImagingTest {
    protected static byte[][] getTestByteArrays() {
        final byte[] single = new byte[1];
        for (int i = 0; i < single.length; i++) {
            single[i] = (byte) i;
        }

        final byte[] simple = new byte[256];
        for (int i = 0; i < simple.length; i++) {
            simple[i] = (byte) i;
        }

        final byte[] zeroes = new byte[256];

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        for (int i = 0; i < 256 * 256; i++) {
            baos.write(0xff & i);
            baos.write(0xff & i >> 8);
        }
        final byte[] longArray = baos.toByteArray();

        return new byte[][] { ImagingConstants.EMPTY_BYTE_ARRAY, single, simple, zeroes, longArray, };
    }

    protected File createTempFile(final byte[] src) throws IOException {
        final File file = Files.createTempFile("raw_", ".bin").toFile();

        // write test bytes to file.
        try (FileOutputStream fos = new FileOutputStream(file);
                OutputStream os = new BufferedOutputStream(fos)) {
            os.write(src);
        }

        // test that all bytes written to file.
        assertEquals(src.length, file.length());

        return file;
    }

    @Test
    void testGetInputStreamThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> ByteSource.array(null));
    }

}
