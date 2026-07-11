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

package org.apache.commons.imaging.formats.jpeg.exif;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;

import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingOverflowException;
import org.apache.commons.imaging.formats.jpeg.JpegImageMetadata;
import org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;
import org.junit.jupiter.api.Test;

public class ExifRewriterTest extends AbstractExifTest {

    @Test
    public void testAddExifToImageWithJfif() throws Exception {
        // Create a minimal JPEG with SOI and JFIF (APP0) and SOS
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(0xFF);
        baos.write(0xD8); // SOI
        baos.write(0xFF);
        baos.write(0xE0); // APP0 (JFIF)
        baos.write(0x00);
        baos.write(0x10); // Length (16)
        baos.write("JFIF".getBytes());
        baos.write(0); // Version
        baos.write(new byte[9]); // Rest of JFIF
        baos.write(0xFF);
        baos.write(0xDA); // SOS
        baos.write(0x00);
        baos.write(0x0C); // Length
        baos.write(new byte[10]); // SOS data
        baos.write(0xFF);
        baos.write(0xD9); // EOI
        final byte[] imageBytes = baos.toByteArray();
        final TiffOutputSet outputSet = new TiffOutputSet();
        outputSet.getOrCreateRootDirectory();
        final ByteArrayOutputStream os = new ByteArrayOutputStream();
        new ExifRewriter().updateExifMetadataLossy(imageBytes, os, outputSet);
        final byte[] outBytes = os.toByteArray();
        assertTrue(hasExifData("test.jpg", outBytes));
        // Check that EXIF (APP1) is AFTER JFIF (APP0)
        // SOI (2) + JFIF (16+2=18) = 20
        // Next marker at index 20 should be APP1 (0xFFE1)
        assertEquals((byte) 0xFF, outBytes[20]);
        assertEquals((byte) 0xE1, outBytes[21]);
    }

    @Test
    public void testAddExifToImageWithoutExif() throws Exception {
        // Find a JPEG image without EXIF
        final File imageFile = getTestImage(file -> file.getName().toLowerCase().endsWith(".jpg") && !hasExifData(file));
        assertNotNull(imageFile);
        final TiffOutputSet outputSet = new TiffOutputSet();
        final TiffOutputDirectory root = outputSet.getOrCreateRootDirectory();
        root.add(ExifTagConstants.EXIF_TAG_EXIF_VERSION, (byte) 1, (byte) 2, (byte) 3, (byte) 4);
        final ByteArrayOutputStream os = new ByteArrayOutputStream();
        new ExifRewriter().updateExifMetadataLossy(imageFile, os, outputSet);
        final byte[] outBytes = os.toByteArray();
        assertTrue(hasExifData("test.jpg", outBytes));
    }

    @Test
    public void testImagingOverflowException() throws Exception {
        final File imageFile = getImageWithExifData();
        final TiffOutputSet outputSet = new TiffOutputSet();
        final TiffOutputDirectory root = outputSet.getOrCreateRootDirectory();
        // Add a very large field to exceed 64KB limit of APP1 segment
        final byte[] largeData = new byte[70000];
        root.add(ExifTagConstants.EXIF_TAG_MAKER_NOTE, largeData);
        final ByteArrayOutputStream os = new ByteArrayOutputStream();
        assertThrows(ImagingOverflowException.class, () -> {
            new ExifRewriter().updateExifMetadataLossy(imageFile, os, outputSet);
        });
    }

    @Test
    public void testRemoveExifMetadata_ByteArray() throws Exception {
        final File imageFile = getImageWithExifData();
        final byte[] imageBytes = Files.readAllBytes(imageFile.toPath());
        final ByteArrayOutputStream os = new ByteArrayOutputStream();
        new ExifRewriter().removeExifMetadata(imageBytes, os);
        final byte[] outBytes = os.toByteArray();
        assertNotNull(outBytes);
        assertTrue(outBytes.length > 0);
        assertFalse(hasExifData("test.jpg", outBytes));
    }

    @Test
    public void testRemoveExifMetadata_File() throws Exception {
        final File imageFile = getImageWithExifData();
        final File tempFile = Files.createTempFile("test", ".jpg").toFile();
        try (OutputStream os = new BufferedOutputStream(new FileOutputStream(tempFile))) {
            new ExifRewriter().removeExifMetadata(imageFile, os);
        }
        assertTrue(tempFile.exists());
        assertFalse(hasExifData(tempFile));
        Files.delete(tempFile.toPath());
    }

    @Test
    public void testRemoveExifMetadata_InputStream() throws Exception {
        final File imageFile = getImageWithExifData();
        try (InputStream is = Files.newInputStream(imageFile.toPath())) {
            final ByteArrayOutputStream os = new ByteArrayOutputStream();
            new ExifRewriter().removeExifMetadata(is, os);
            final byte[] outBytes = os.toByteArray();
            assertNotNull(outBytes);
            assertFalse(hasExifData("test.jpg", outBytes));
        }
    }

    @Test
    public void testUpdateExifMetadataLossless_ByteArray() throws Exception {
        final File imageFile = getImageWithExifData();
        final byte[] imageBytes = Files.readAllBytes(imageFile.toPath());
        final JpegImageMetadata metadata = (JpegImageMetadata) Imaging.getMetadata(imageFile);
        final TiffOutputSet outputSet = metadata.getExif().getOutputSet();
        final ByteArrayOutputStream os = new ByteArrayOutputStream();
        new ExifRewriter().updateExifMetadataLossless(imageBytes, os, outputSet);
        final byte[] outBytes = os.toByteArray();
        assertNotNull(outBytes);
        assertTrue(hasExifData("test.jpg", outBytes));
    }

    @Test
    public void testUpdateExifMetadataLossless_File() throws Exception {
        final File imageFile = getImageWithExifData();
        final JpegImageMetadata metadata = (JpegImageMetadata) Imaging.getMetadata(imageFile);
        final TiffOutputSet outputSet = metadata.getExif().getOutputSet();
        final File tempFile = Files.createTempFile("test", ".jpg").toFile();
        try (OutputStream os = new BufferedOutputStream(new FileOutputStream(tempFile))) {
            new ExifRewriter().updateExifMetadataLossless(imageFile, os, outputSet);
        }
        assertTrue(tempFile.exists());
        assertTrue(hasExifData(tempFile));
        Files.delete(tempFile.toPath());
    }

    @Test
    public void testUpdateExifMetadataLossless_InputStream() throws Exception {
        final File imageFile = getImageWithExifData();
        final JpegImageMetadata metadata = (JpegImageMetadata) Imaging.getMetadata(imageFile);
        final TiffOutputSet outputSet = metadata.getExif().getOutputSet();
        try (InputStream is = Files.newInputStream(imageFile.toPath())) {
            final ByteArrayOutputStream os = new ByteArrayOutputStream();
            new ExifRewriter().updateExifMetadataLossless(is, os, outputSet);
            final byte[] outBytes = os.toByteArray();
            assertNotNull(outBytes);
            assertTrue(hasExifData("test.jpg", outBytes));
        }
    }

    @Test
    public void testUpdateExifMetadataLossy_ByteArray() throws Exception {
        final File imageFile = getImageWithExifData();
        final byte[] imageBytes = Files.readAllBytes(imageFile.toPath());
        final JpegImageMetadata metadata = (JpegImageMetadata) Imaging.getMetadata(imageFile);
        final TiffOutputSet outputSet = metadata.getExif().getOutputSet();
        final ByteArrayOutputStream os = new ByteArrayOutputStream();
        new ExifRewriter().updateExifMetadataLossy(imageBytes, os, outputSet);
        final byte[] outBytes = os.toByteArray();
        assertNotNull(outBytes);
        assertTrue(hasExifData("test.jpg", outBytes));
    }

    @Test
    public void testUpdateExifMetadataLossy_File() throws Exception {
        final File imageFile = getImageWithExifData();
        final JpegImageMetadata metadata = (JpegImageMetadata) Imaging.getMetadata(imageFile);
        final TiffOutputSet outputSet = metadata.getExif().getOutputSet();
        final File tempFile = Files.createTempFile("test", ".jpg").toFile();
        try (OutputStream os = new BufferedOutputStream(new FileOutputStream(tempFile))) {
            new ExifRewriter().updateExifMetadataLossy(imageFile, os, outputSet);
        }
        assertTrue(tempFile.exists());
        assertTrue(hasExifData(tempFile));
        Files.delete(tempFile.toPath());
    }

    @Test
    public void testUpdateExifMetadataLossy_InputStream() throws Exception {
        final File imageFile = getImageWithExifData();
        final JpegImageMetadata metadata = (JpegImageMetadata) Imaging.getMetadata(imageFile);
        final TiffOutputSet outputSet = metadata.getExif().getOutputSet();
        try (InputStream is = Files.newInputStream(imageFile.toPath())) {
            final ByteArrayOutputStream os = new ByteArrayOutputStream();
            new ExifRewriter().updateExifMetadataLossy(is, os, outputSet);
            final byte[] outBytes = os.toByteArray();
            assertNotNull(outBytes);
            assertTrue(hasExifData("test.jpg", outBytes));
        }
    }
}
