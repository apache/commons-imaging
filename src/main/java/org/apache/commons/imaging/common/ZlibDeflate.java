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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

import org.apache.commons.imaging.ImagingException;

/**
 * <p>
 * Utility class to compress/decompress bytes using the ZLIB deflate/inflate
 * compression.
 * </p>
 *
 * <p>
 * <a href="https://www.ietf.org/rfc/rfc1951.txt">RFC 1951 - DEFLATE Compressed
 * Data Format Specification version 1.3</a>
 * </p>
 */
public class ZlibDeflate {

    /**
     * Compress the byte[] using ZLIB deflate compression.
     *
     * @param bytes The bytes to compress
     *
     * @return The compressed bytes.
     * @throws ImagingException if the bytes could not be compressed.
     * @see DeflaterOutputStream
     */
    public static byte[] compress(final byte[] bytes) throws ImagingException {
        final ByteArrayOutputStream out = new ByteArrayOutputStream(Allocator.checkByteArray(bytes.length / 2));
        try (DeflaterOutputStream compressOut = new DeflaterOutputStream(out)) {
            compressOut.write(bytes);
        } catch (final IOException e) {
            throw new ImagingException("Unable to compress image", e);
        }
        return out.toByteArray();
    }

    /**
     * Compress the byte[] using ZLIB deflate decompression.
     *
     * @param bytes The bytes to decompress
     * @param expectedSize The expected size of the decompressed byte[].
     *
     * @return The decompressed bytes.
     * @throws ImagingException if the bytes could not be decompressed.
     * @see Inflater
     */
    public static byte[] decompress(final byte[] bytes, final int expectedSize) throws ImagingException {
        try {
            final Inflater inflater = new Inflater();
            inflater.setInput(bytes);
            final byte[] result = Allocator.byteArray(expectedSize);
            inflater.inflate(result);
            return result;
        } catch (final DataFormatException e) {
            throw new ImagingException("Unable to decompress image", e);
        }
    }

}
