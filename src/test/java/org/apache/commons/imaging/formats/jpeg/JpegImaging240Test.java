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

package org.apache.commons.imaging.formats.jpeg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.imaging.FormatCompliance;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.formats.tiff.TiffContents;
import org.apache.commons.imaging.formats.tiff.TiffReader;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants;
import org.apache.commons.imaging.test.TestResources;
import org.junit.jupiter.api.Test;

class JpegImaging240Test {

    private File getImage() {
        return TestResources.resourceToFile("/IMAGING-240/img.jpg");
    }

    @Test
    void testImageInfoWithMissingExifDirectoryFooter() throws Exception {
        final ImageInfo info = Imaging.getImageInfo(getImage());
        assertEquals(731, info.getWidth());
        assertEquals(727, info.getHeight());
    }

    @Test
    void testMetadataPreservesExifDirectory() throws Exception {
        final JpegImageMetadata metadata = (JpegImageMetadata) Imaging.getMetadata(getImage());
        assertNotNull(metadata.getExif());
        final TiffContents contents = metadata.getExif().contents;
        assertEquals(2, contents.directories.size());
        assertEquals(TiffDirectoryConstants.DIRECTORY_TYPE_EXIF, contents.directories.get(1).type);
        assertEquals(3, contents.directories.get(1).getDirectoryEntries().size());
    }

    @Test
    void testStrictReaderRejectsMissingExifDirectoryFooter() throws Exception {
        final byte[] exif = new JpegImageParser().getExifRawData(ByteSource.file(getImage()));
        assertThrows(IOException.class, () -> new TiffReader(true).readDirectories(ByteSource.array(exif), false, FormatCompliance.getDefault()));
    }

    @Test
    void testCompleteExifDirectoryFooter() throws Exception {
        final byte[] exif = new JpegImageParser().getExifRawData(ByteSource.file(getImage()));
        final byte[] complete = Arrays.copyOf(exif, exif.length + 4);
        final TiffContents contents = new TiffReader(true).readDirectories(ByteSource.array(complete), false, FormatCompliance.getDefault());
        assertEquals(2, contents.directories.size());
        assertEquals(3, contents.directories.get(1).getDirectoryEntries().size());
    }

    @Test
    void testNonStrictReaderStillRejectsTruncatedRootDirectoryFooter() {
        final byte[] tiff = { 'I', 'I', 42, 0, 8, 0, 0, 0, 0, 0 };
        assertThrows(IOException.class, () -> new TiffReader(false).readDirectories(ByteSource.array(tiff), false, FormatCompliance.getDefault()));
    }

    @Test
    void testNonStrictReaderAcceptsExifDirectoryFooterWithPartialBytesRemaining() throws Exception {
        final byte[] exif = new JpegImageParser().getExifRawData(ByteSource.file(getImage()));
        for (int remaining = 1; remaining <= 3; remaining++) {
            final byte[] partial = Arrays.copyOf(exif, exif.length + remaining);
            final TiffContents contents = new TiffReader(false).readDirectories(ByteSource.array(partial), false, FormatCompliance.getDefault());
            assertEquals(2, contents.directories.size(), "remaining=" + remaining);
            assertEquals(3, contents.directories.get(1).getDirectoryEntries().size(), "remaining=" + remaining);
        }
    }

    @Test
    void testStrictReaderRejectsExifDirectoryFooterWithPartialBytesRemaining() throws Exception {
        final byte[] exif = new JpegImageParser().getExifRawData(ByteSource.file(getImage()));
        for (int remaining = 1; remaining <= 3; remaining++) {
            final byte[] partial = Arrays.copyOf(exif, exif.length + remaining);
            assertThrows(IOException.class, () -> new TiffReader(true).readDirectories(ByteSource.array(partial), false, FormatCompliance.getDefault()),
                    "remaining=" + remaining);
        }
    }

    @Test
    void testNonStrictReaderAcceptsBigEndianMissingExifDirectoryFooter() throws Exception {
        final byte[] tiff = buildBigEndianTiffWithMissingExifFooter();
        final TiffContents contents = new TiffReader(false).readDirectories(ByteSource.array(tiff), false, FormatCompliance.getDefault());
        assertEquals(2, contents.directories.size());
        assertEquals(TiffDirectoryConstants.DIRECTORY_TYPE_EXIF, contents.directories.get(1).type);
    }

    @Test
    void testStrictReaderRejectsBigEndianMissingExifDirectoryFooter() throws Exception {
        final byte[] tiff = buildBigEndianTiffWithMissingExifFooter();
        assertThrows(IOException.class, () -> new TiffReader(true).readDirectories(ByteSource.array(tiff), false, FormatCompliance.getDefault()));
    }

    /**
     * Builds a minimal big-endian (Motorola byte order) standard TIFF whose single root entry points to an EXIF
     * subdirectory, and whose EXIF subdirectory omits its trailing 4-byte next-directory-offset field, mirroring the
     * real-world condition that IMAGING-240 addresses but in big-endian byte order.
     */
    private static byte[] buildBigEndianTiffWithMissingExifFooter() {
        final int rootEntryCount = 1;
        final long subDirectoryOffset = 8 + 2 + rootEntryCount * 12L + 4;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write('M');
        out.write('M');
        writeShortBE(out, 42);
        writeIntBE(out, 8);
        writeShortBE(out, rootEntryCount);
        writeShortBE(out, 0x8769);
        writeShortBE(out, 4);
        writeIntBE(out, 1);
        writeIntBE(out, subDirectoryOffset);
        writeIntBE(out, 0);
        writeShortBE(out, 1);
        writeShortBE(out, 0x0100);
        writeShortBE(out, 3);
        writeIntBE(out, 1);
        writeShortBE(out, 123);
        writeShortBE(out, 0);
        return out.toByteArray();
    }

    private static void writeShortBE(final ByteArrayOutputStream out, final int value) {
        out.write((value >> 8) & 0xFF);
        out.write(value & 0xFF);
    }

    private static void writeIntBE(final ByteArrayOutputStream out, final long value) {
        out.write((int) ((value >> 24) & 0xFF));
        out.write((int) ((value >> 16) & 0xFF));
        out.write((int) ((value >> 8) & 0xFF));
        out.write((int) (value & 0xFF));
    }
}
