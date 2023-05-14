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

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.List;
import java.util.stream.Stream;

import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.formats.jpeg.JpegImageMetadata;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputField;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.opentest4j.TestSkippedException;

/**
 * Read and write EXIF data, and verify that it's identical, and no data corruption occurred.
 */
@Disabled
public class ExifRewriterRoundtripTest extends ExifBaseTest {

    public static Stream<File> data() throws Exception {
        return getImagesWithExifData().stream();
    }

    private final SecureRandom random = new SecureRandom();

    private File duplicateFile;

    private void assertEquals(final TiffOutputSet tiffOutputSet, final TiffOutputSet tiffOutputSet1) {
        final List<TiffOutputDirectory> directories = tiffOutputSet.getDirectories();
        final List<TiffOutputDirectory> directories1 = tiffOutputSet1.getDirectories();
        Assertions.assertEquals(directories.size(), directories1.size(),
                "The TiffOutputSets have different numbers of directories.");

        for (int i = 0; i < directories.size(); i++) {
            final List<TiffOutputField> fields = directories.get(i).getFields();
            final List<TiffOutputField> fields1 = directories1.get(i).getFields();
            Assertions.assertEquals(fields.size(), fields1.size(),
                    "The TiffOutputDirectories have different numbers of fields.");

            for (int j = 0; j < fields.size(); j++) {
                final TiffOutputField field = fields.get(j);
                final TiffOutputField field1 = fields1.get(j);
                Assertions.assertEquals(field.tag, field1.tag, "TiffOutputField tag mismatch.");
                Assertions.assertEquals(field.tagInfo, field1.tagInfo, "TiffOutputField tagInfo mismatch.");
                Assertions.assertEquals(field.fieldType, field1.fieldType, "TiffOutputField fieldType mismatch.");
                Assertions.assertEquals(field.count, field1.count, "TiffOutputField count mismatch.");
            }
        }
    }

    private void copyToDuplicateFile(final File sourceFile, final TiffOutputSet duplicateTiffOutputSet) throws IOException,
            ImagingException, ImagingException {
        final ExifRewriter exifRewriter = new ExifRewriter();
        duplicateFile = createTempFile();
        try (OutputStream duplicateOutputStream = new BufferedOutputStream(new FileOutputStream(duplicateFile))) {
            exifRewriter.updateExifMetadataLossless(sourceFile, duplicateOutputStream, duplicateTiffOutputSet);
        }
    }

    private File createTempFile() {
        final String temp_dir = System.getProperty("java.io.tmpdir");
        final String temp_filename = this.getClass().getName() + "-" + random.nextLong() + ".tmp";
        return new File(temp_dir, temp_filename);
    }

    private TiffOutputSet duplicateTiffOutputSet(final TiffOutputSet sourceTiffOutputSet) throws ImagingException {
        final TiffOutputSet duplicateTiffOutputSet = new TiffOutputSet();
        for (final TiffOutputDirectory tiffOutputDirectory : sourceTiffOutputSet) {
            duplicateTiffOutputSet.addDirectory(tiffOutputDirectory);
        }
        return duplicateTiffOutputSet;
    }

    private JpegImageMetadata getJpegImageMetadata(final File sourceFile) throws ImagingException, IOException {
        final JpegImageMetadata jpegImageMetadata = (JpegImageMetadata) Imaging.getMetadata(sourceFile);
        if (null == jpegImageMetadata) {
            throw new TestSkippedException();
        }
        return jpegImageMetadata;
    }

    private TiffImageMetadata getTiffImageMetadata(final JpegImageMetadata sourceJpegImageMetadata) {
        final TiffImageMetadata tiffImageMetadata = sourceJpegImageMetadata.getExif();
        if (null == tiffImageMetadata) {
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

    @ParameterizedTest
    @MethodSource("data")
    public void updateExifMetadataLossless_copyWithoutChanges_TiffImageMetadataIsIdentical(final File sourceFile)
            throws Exception {
        /*
         * Load EXIF data from source file, skipping over any test images without any EXIF data
         */
        final JpegImageMetadata sourceJpegImageMetadata = getJpegImageMetadata(sourceFile);
        final TiffImageMetadata sourceTiffImageMetadata = getTiffImageMetadata(sourceJpegImageMetadata);
        final TiffOutputSet sourceTiffOutputSet = getTiffOutputSet(sourceTiffImageMetadata);

        /*
         * Copy the TiffOutputSet to a duplicate TiffOutputSet
         */
        final TiffOutputSet duplicateTiffOutputSet = duplicateTiffOutputSet(sourceTiffOutputSet);

        /*
         * Copy the file to a duplicate file, using updateExifMetadataLossless and the duplicate TiffOutputSet
         */
        copyToDuplicateFile(sourceFile, duplicateTiffOutputSet);

        /*
         * Load EXIF data from duplicate file
         */
        final JpegImageMetadata duplicateJpegImageMetadata = getJpegImageMetadata(duplicateFile);
        final TiffImageMetadata duplicateTiffImageMetadata = getTiffImageMetadata(duplicateJpegImageMetadata);

        /*
         * Compare the source TiffImageMetadata to the one loaded from the duplicate file. This fails!
         */
        final List<? extends ImageMetadata.ImageMetadataItem> imageMetadataItems = sourceTiffImageMetadata.getItems();
        final List<? extends ImageMetadata.ImageMetadataItem> imageMetadataItems1 = duplicateTiffImageMetadata.getItems();
        Assertions.assertEquals(imageMetadataItems.size(), imageMetadataItems1.size(),
                "The TiffImageMetadata have different numbers of imageMetadataItems.");

        for (int i = 0; i < imageMetadataItems.size(); i++) {
            final ImageMetadata.ImageMetadataItem imageMetadataItem = imageMetadataItems.get(i);
            final ImageMetadata.ImageMetadataItem imageMetadataItem1 = imageMetadataItems1.get(i);
            Assertions.assertEquals(imageMetadataItem.toString(), imageMetadataItem1.toString(),
                    "ImageMetadataItem toString mismatch.");
        }
    }

    @ParameterizedTest
    @MethodSource("data")
    public void updateExifMetadataLossless_copyWithoutChanges_TiffOutputSetsAreIdentical(final File sourceFile)
            throws Exception {
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
        assertEquals(sourceTiffOutputSet, duplicateTiffOutputSet);

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
        assertEquals(sourceTiffOutputSet, duplicateTiffOutputSet);
    }
}
