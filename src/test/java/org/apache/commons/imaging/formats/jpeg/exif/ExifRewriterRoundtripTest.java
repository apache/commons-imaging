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
package org.apache.commons.imaging.formats.jpeg.exif;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.formats.jpeg.JpegImageMetadata;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputField;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.opentest4j.TestSkippedException;

/**
 * Reads and write EXIF data, and verify that it's identical, and no data corruption occurred.
 */
public class ExifRewriterRoundtripTest extends AbstractExifTest {

    /**
     * Test data.
     * @return test data.
     * @throws Exception if it fails to read the images with EXIF.
     */
    public static Stream<File> data() throws Exception {
        return getImagesWithExifData().stream();
    }

    private final SecureRandom random = new SecureRandom();

    private File duplicateFile;

    private void assertTiffEquals(final TiffOutputSet sourceTiffOutputSet, final TiffOutputSet duplicateTiffOutputSet) {
        final List<TiffOutputDirectory> sourceDirectories = sourceTiffOutputSet.getDirectories();
        final List<TiffOutputDirectory> duplicatedDirectories = duplicateTiffOutputSet.getDirectories();

        assertEquals(sourceDirectories.size(), duplicatedDirectories.size(), "The TiffOutputSets have different numbers of directories.");

        for (int i = 0; i < sourceDirectories.size(); i++) {
            final TiffOutputDirectory sourceDirectory = sourceDirectories.get(i);
            final TiffOutputDirectory duplicateDirectory = duplicatedDirectories.get(i);

            assertEquals(sourceDirectory.getType(), duplicateDirectory.getType(), "Directory type mismatch.");

            final List<TiffOutputField> sourceFields = sourceDirectory.getFields();
            final List<TiffOutputField> duplicateFields = duplicateDirectory.getFields();

            final boolean fieldCountMatches = sourceFields.size() == duplicateFields.size();

            if (!fieldCountMatches) {
                /*
                 * Note that offset fields are not written again if a re-order makes
                 * them unnecessary. The TiffWriter does not write in the same order,
                 * but tries to optimize it.
                 */
                final List<Integer> sourceTags = new ArrayList<>();
                final List<Integer> duplicatedTags = new ArrayList<>();

                for (final TiffOutputField field : sourceFields) {
                    sourceTags.add(field.tag);
                }

                for (final TiffOutputField field : duplicateFields) {
                    duplicatedTags.add(field.tag);
                }

                final List<Integer> missingTags = new ArrayList<>(sourceTags);
                missingTags.removeAll(duplicatedTags);
                missingTags.remove((Integer) ExifTagConstants.EXIF_TAG_EXIF_OFFSET.tag);
                missingTags.remove((Integer) ExifTagConstants.EXIF_TAG_GPSINFO.tag);
                missingTags.remove((Integer) ExifTagConstants.EXIF_TAG_INTEROP_OFFSET.tag);
                missingTags.remove((Integer) TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT.tag);

                assertTrue(missingTags.isEmpty(), "Missing tags: " + missingTags);
            }

            for (final TiffOutputField sourceField : sourceFields) {
                final boolean isOffsetField =
                        sourceField.tag == ExifTagConstants.EXIF_TAG_EXIF_OFFSET.tag ||
                                sourceField.tag == ExifTagConstants.EXIF_TAG_GPSINFO.tag ||
                                sourceField.tag == ExifTagConstants.EXIF_TAG_INTEROP_OFFSET.tag ||
                                sourceField.tag == TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT.tag;

                /*
                 * Ignore offset fields. They may not be needed after rewrite
                 * and their value changes anyway.
                 */
                if (isOffsetField) {
                    continue;
                }

                final TiffOutputField duplicateField = duplicateDirectory.findField(sourceField.tag);

                assertNotNull(duplicateField, "Field is missing: " + sourceField.tagInfo);

                assertEquals(sourceField.tag, duplicateField.tag, "TiffOutputField tag mismatch.");
                assertEquals(sourceField.abstractFieldType, duplicateField.abstractFieldType, "TiffOutputField fieldType mismatch.");
                assertEquals(sourceField.count, duplicateField.count, "TiffOutputField count mismatch.");

                assertArrayEquals(sourceField.getData(), duplicateField.getData(), "Bytes are different for field: " + sourceField);
            }
        }
    }

    private void copyToDuplicateFile(final File sourceFile, final TiffOutputSet duplicateTiffOutputSet) throws IOException {
        final ExifRewriter exifRewriter = new ExifRewriter();

        duplicateFile = createTempFile();

        try (OutputStream duplicateOutputStream = new BufferedOutputStream(Files.newOutputStream(duplicateFile.toPath()))) {
            exifRewriter.updateExifMetadataLossless(sourceFile, duplicateOutputStream, duplicateTiffOutputSet);
        }
    }

    private File createTempFile() {
        final String tempDir = FileUtils.getTempDirectoryPath();
        final String tempFileName = this.getClass().getName() + "-" + random.nextLong() + ".tmp";

        return new File(tempDir, tempFileName);
    }

    private TiffOutputSet duplicateTiffOutputSet(final TiffOutputSet sourceTiffOutputSet) throws ImagingException {
        final TiffOutputSet duplicateTiffOutputSet = new TiffOutputSet(
                sourceTiffOutputSet.byteOrder
        );

        for (final TiffOutputDirectory tiffOutputDirectory : sourceTiffOutputSet) {
            duplicateTiffOutputSet.addDirectory(tiffOutputDirectory);
        }

        return duplicateTiffOutputSet;
    }

    private JpegImageMetadata getJpegImageMetadata(final File sourceFile) throws IOException {
        final JpegImageMetadata jpegImageMetadata = (JpegImageMetadata) Imaging.getMetadata(sourceFile);

        if (jpegImageMetadata == null) {
            throw new TestSkippedException();
        }

        return jpegImageMetadata;
    }

    private TiffImageMetadata getTiffImageMetadata(final JpegImageMetadata sourceJpegImageMetadata) {
        final TiffImageMetadata tiffImageMetadata = sourceJpegImageMetadata.getExif();

        if (tiffImageMetadata == null) {
            throw new TestSkippedException();
        }

        return tiffImageMetadata;
    }

    private TiffOutputSet getTiffOutputSet(final TiffImageMetadata sourceTiffImageMetadata) throws ImagingException {
        final TiffOutputSet tiffOutputSet = sourceTiffImageMetadata.getOutputSet();

        if (tiffOutputSet == null) {
            throw new TestSkippedException();
        }

        return tiffOutputSet;
    }

    @AfterEach
    void tearDown() {
        if (duplicateFile != null && duplicateFile.exists()) {
            duplicateFile.delete();
            duplicateFile.deleteOnExit();
        }
    }

    /**
     * Does the round-trip test, by loading EXIF data, and comparing it with the
     * data from a duplicated file.
     *
     * @param sourceFile the input file.
     * @throws Exception if it fails to read the test image or create the duplicated file.
     */
    @ParameterizedTest
    @MethodSource("data")
    public void updateExifMetadataLossless_copyWithoutChanges_TiffOutputSetsAreIdentical(final File sourceFile) throws Exception {
        /*
         * Load EXIF data from source file, skipping over any test images without any EXIF data
         */
        final JpegImageMetadata sourceJpegImageMetadata = getJpegImageMetadata(sourceFile);
        final TiffImageMetadata sourceTiffImageMetadata = getTiffImageMetadata(sourceJpegImageMetadata);
        final TiffOutputSet sourceTiffOutputSet = getTiffOutputSet(sourceTiffImageMetadata);

        /*
         * Copy the TiffOutputSet to a duplicate TiffOutputSet
         */
        TiffOutputSet duplicateTiffOutputSet = duplicateTiffOutputSet(sourceTiffOutputSet);

        /*
         * Compare the two TiffOutputSets
         */
        assertTiffEquals(sourceTiffOutputSet, duplicateTiffOutputSet);

        /*
         * Copy the file to a duplicate file, using updateExifMetadataLossless and the duplicate TiffOutputSet
         */
        copyToDuplicateFile(sourceFile, duplicateTiffOutputSet);

        /*
         * Load EXIF data from duplicate file
         */
        final JpegImageMetadata duplicateJpegImageMetadata = getJpegImageMetadata(duplicateFile);
        final TiffImageMetadata duplicateTiffImageMetadata = getTiffImageMetadata(duplicateJpegImageMetadata);
        duplicateTiffOutputSet = duplicateTiffImageMetadata.getOutputSet();

        /*
         * Compare the source TiffOutputSet to the one loaded from the duplicate file. This fails!
         */
        assertTiffEquals(sourceTiffOutputSet, duplicateTiffOutputSet);
    }
}
