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
package org.apache.commons.imaging.formats.png.chunks;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.ImagingException;
import org.junit.jupiter.api.Test;

/**
 * Tests for {@link PngChunkIccp}.
 */
class PngChunkIccpTest {

    private static final int chunkType = 1766015824;

    @Test
    void testErrorOnNoProfileName() {
        final byte[] data = ImagingConstants.EMPTY_BYTE_ARRAY;
        assertThrows(ImagingException.class, () -> new PngChunkIccp(0, chunkType, 0, data));
    }

    @Test
    void testParsingIccpChunk() throws ImagingException, IOException {
        final List<Byte> bytes = new ArrayList<>();
        final String profileName = "my-profile-01";
        for (final byte b : profileName.getBytes(StandardCharsets.ISO_8859_1)) {
            bytes.add(b);
        }
        bytes.add((byte) 0); // null
        bytes.add((byte) 0); // 0=deflate compression method

        // generate some 100 bytes of dummy data
        final byte[] uncompressedData = new byte[100];
        IntStream.range(0, 100).forEach(i -> {
            uncompressedData[i] = (byte) (i + 1); // dummy data
        });
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream(100)) {
            // compress the dummy data with deflate
            final Deflater def = new Deflater();
            try (DeflaterOutputStream ios = new DeflaterOutputStream(baos, def)) {
                ios.write(uncompressedData);
            }
            baos.flush();
            final byte[] compressedData = baos.toByteArray();
            final byte[] data = new byte[bytes.size() + compressedData.length];
            // gather everything, except for the compressed data
            for (int i = 0; i < bytes.size(); ++i) {
                data[i] = bytes.get(i).byteValue();
            }
            // gather the compressed data
            IntStream.range(0, compressedData.length).forEach(i -> data[bytes.size() + i] = compressedData[i]);
            // create the chunk
            final PngChunkIccp chunk = new PngChunkIccp(data.length, chunkType, 0, data);
            assertArrayEquals(uncompressedData, chunk.getUncompressedProfile());
        }
    }
}
