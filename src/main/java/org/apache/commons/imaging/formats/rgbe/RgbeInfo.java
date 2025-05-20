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

package org.apache.commons.imaging.formats.rgbe;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.common.Allocator;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.common.ByteConversions;
import org.apache.commons.imaging.common.GenericImageMetadata;
import org.apache.commons.imaging.common.ImageMetadata;

final class RgbeInfo implements Closeable {

    // #?RADIANCE
    private static final byte[] HEADER = { 0x23, 0x3F, 0x52, 0x41, 0x44, 0x49, 0x41, 0x4E, 0x43, 0x45 };
    private static final Pattern RESOLUTION_STRING = Pattern.compile("-Y (\\d+) \\+X (\\d+)");
    private static final byte[] TWO_TWO = { 0x2, 0x2 };

    private static void decompress(final InputStream in, final byte[] out) throws IOException, ImagingException {
        int position = 0;
        final int total = out.length;
        while (position < total) {
            final int n = in.read();
            if (n < 0) {
                throw new ImagingException("Error decompressing RGBE file");
            }
            if (n > 128) {
                final int value = in.read();
                for (int i = 0; i < (n & 0x7f); i++) {
                    out[position++] = (byte) value;
                }
            } else {
                for (int i = 0; i < n; i++) {
                    out[position++] = (byte) in.read();
                }
            }
        }
    }

    private final InputStream in;
    private GenericImageMetadata metadata;
    private int width = -1;
    private int height = -1;

    RgbeInfo(final ByteSource byteSource) throws IOException {
        this.in = byteSource.getInputStream();
    }

    @Override
    public void close() throws IOException {
        in.close();
    }

    int getHeight() throws IOException, ImagingException {
        if (-1 == height) {
            readDimensions();
        }
        return height;
    }

    ImageMetadata getMetadata() throws IOException, ImagingException {
        if (null == metadata) {
            readMetadata();
        }
        return metadata;
    }

    float[][] getPixelData() throws IOException, ImagingException {
        // Read into local variables to ensure that we have seeked into the file
        // far enough
        final int ht = getHeight();
        final int wd = getWidth();
        if (wd >= 32768) {
            throw new ImagingException("Scan lines must be less than 32768 bytes long");
        }
        final byte[] scanLineBytes = ByteConversions.toBytes((short) wd, ByteOrder.BIG_ENDIAN);
        final byte[] rgbe = Allocator.byteArray(wd * 4);
        final float[][] out = new float[3][Allocator.check(wd * ht)];
        for (int i = 0; i < ht; i++) {
            BinaryFunctions.readAndVerifyBytes(in, TWO_TWO, "Scan line " + i + " expected to start with 0x2 0x2");
            BinaryFunctions.readAndVerifyBytes(in, scanLineBytes, "Scan line " + i + " length expected");
            decompress(in, rgbe);
            for (int channel = 0; channel < 3; channel++) {
                final int channelOffset = channel * wd;
                final int eOffset = 3 * wd;
                for (int p = 0; p < wd; p++) {
                    final int mantissa = rgbe[p + eOffset] & 0xff;
                    final int pos = p + i * wd;
                    if (0 == mantissa) {
                        out[channel][pos] = 0;
                    } else {
                        final float mult = (float) Math.pow(2, mantissa - (128 + 8));
                        out[channel][pos] = ((rgbe[p + channelOffset] & 0xff) + 0.5f) * mult;
                    }
                }
            }
        }
        return out;
    }

    int getWidth() throws IOException, ImagingException {
        if (-1 == width) {
            readDimensions();
        }
        return width;
    }

    private void readDimensions() throws IOException, ImagingException {
        getMetadata(); // Ensure we've read past this
        final InfoHeader header = new InfoHeader(in);
        final String resolution = header.line();
        final Matcher matcher = RESOLUTION_STRING.matcher(resolution);
        if (!matcher.matches()) {
            throw new ImagingException("Invalid HDR resolution string. Only \"-Y N +X M\" is supported. Found \"" + resolution + "\"");
        }
        height = Integer.parseInt(matcher.group(1));
        width = Integer.parseInt(matcher.group(2));
    }

    private void readMetadata() throws IOException, ImagingException {
        BinaryFunctions.readAndVerifyBytes(in, HEADER, "Not a valid HDR: Incorrect Header");
        final InfoHeader reader = new InfoHeader(in);
        if (!reader.line().isEmpty()) {
            throw new ImagingException("Not a valid HDR: Incorrect Header");
        }
        metadata = new GenericImageMetadata();
        String info = reader.line();
        while (!info.isEmpty()) {
            final int equals = info.indexOf('=');
            if (equals > 0) {
                final String variable = info.substring(0, equals);
                final String value = info.substring(equals + 1);
                if ("FORMAT".equals(value) && !"32-bit_rle_rgbe".equals(value)) {
                    throw new ImagingException("Only 32-bit_rle_rgbe images are supported, trying to read " + value);
                }
                metadata.add(variable, value);
            } else {
                metadata.add("<command>", info);
            }
            info = reader.line();
        }
    }
}
