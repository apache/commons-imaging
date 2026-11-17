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
package org.apache.commons.imaging.formats.png;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.color.ColorSpace;
import java.awt.color.ICC_Profile;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.zip.CRC32;
import java.util.zip.DeflaterOutputStream;

import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingException;
import org.junit.jupiter.api.Test;

class PngIccProfileTest {

    @Test
    void grayscaleAlphaPngAcceptsGrayProfile() throws IOException {
        final byte[] png = createPng(4, ICC_Profile.getInstance(ColorSpace.CS_GRAY).getData());

        final BufferedImage image = assertDoesNotThrow(() -> Imaging.getBufferedImage(png));

        final int argb = image.getRGB(0, 0);
        assertEquals(0x80, argb >>> 24);
        assertEquals(argb >>> 16 & 0xff, argb >>> 8 & 0xff);
        assertEquals(argb >>> 8 & 0xff, argb & 0xff);
    }

    @Test
    void emptyGrayProfileIsReportedAsImagingException() throws IOException {
        final byte[] png = createPng(0, createEmptyGrayProfile());

        final ImagingException exception = assertThrows(ImagingException.class, () -> Imaging.getBufferedImage(png));
        assertTrue(exception.getCause() instanceof java.awt.color.CMMException);
    }

    private static byte[] createPng(final int colorType, final byte[] profile) throws IOException {
        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        final DataOutputStream png = new DataOutputStream(output);
        png.write(new byte[] {(byte) 137, 80, 78, 71, 13, 10, 26, 10});

        final byte[] header = ByteBuffer.allocate(13).order(ByteOrder.BIG_ENDIAN).putInt(1).putInt(1).put((byte) 8).put((byte) colorType)
                .put((byte) 0).put((byte) 0).put((byte) 0).array();
        writeChunk(png, "IHDR", header);

        final ByteArrayOutputStream profileChunk = new ByteArrayOutputStream();
        profileChunk.write("synthetic-gray".getBytes(StandardCharsets.ISO_8859_1));
        profileChunk.write(0);
        profileChunk.write(0);
        profileChunk.write(deflate(profile));
        writeChunk(png, "iCCP", profileChunk.toByteArray());

        writeChunk(png, "IDAT", deflate(colorType == 4 ? new byte[] {0, 96, (byte) 128} : new byte[] {0, 96}));
        writeChunk(png, "IEND", new byte[0]);
        return output.toByteArray();
    }

    private static byte[] createEmptyGrayProfile() {
        final ByteBuffer profile = ByteBuffer.allocate(132).order(ByteOrder.BIG_ENDIAN);
        profile.putInt(132);
        profile.putInt(0);
        profile.putInt(0x04300000);
        putAscii(profile, "mntr");
        putAscii(profile, "GRAY");
        putAscii(profile, "XYZ ");
        profile.putShort((short) 2026).putShort((short) 1).putShort((short) 1);
        profile.putShort((short) 0).putShort((short) 0).putShort((short) 0);
        putAscii(profile, "acsp");
        putAscii(profile, "APPL");
        profile.putInt(0).putInt(0).putInt(0).putLong(0).putInt(0);
        profile.putInt(0x0000f6d6).putInt(0x00010000).putInt(0x0000d32d);
        putAscii(profile, "TEST");
        profile.put(new byte[44]);
        profile.putInt(0);
        return profile.array();
    }

    private static void putAscii(final ByteBuffer buffer, final String value) {
        buffer.put(value.getBytes(StandardCharsets.ISO_8859_1));
    }

    private static byte[] deflate(final byte[] input) throws IOException {
        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        try (DeflaterOutputStream deflater = new DeflaterOutputStream(output)) {
            deflater.write(input);
        }
        return output.toByteArray();
    }

    private static void writeChunk(final DataOutputStream png, final String type, final byte[] data) throws IOException {
        final byte[] typeBytes = type.getBytes(StandardCharsets.ISO_8859_1);
        png.writeInt(data.length);
        png.write(typeBytes);
        png.write(data);
        final CRC32 crc = new CRC32();
        crc.update(typeBytes);
        crc.update(data);
        png.writeInt((int) crc.getValue());
    }
}
