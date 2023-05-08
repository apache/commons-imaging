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

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.Imaging;
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

import java.io.*;
import java.security.SecureRandom;
import java.util.List;
import java.util.stream.Stream;

/**
 * Read and write EXIF data, and verify that it's identical, and no data corruption occurred.
 */
@Disabled
public class ExifRewriterRoundtripTest extends ExifBaseTest {
    private final SecureRandom random = new SecureRandom();
    private File duplicateFile;

    public static Stream<File> data() throws Exception {
        return getImagesWithExifData().stream();
    }

    @AfterEach
    void tearDown() {
        if (duplicateFile != null && duplicateFile.exists()) {
            duplicateFile.delete();
            duplicateFile.deleteOnExit();
        }
    }

    private File createTempFile() {
        String temp_dir = System.getProperty("java.io.tmpdir");
        String temp_filename = this.getClass().getName() + "-" + random.nextLong() + ".tmp";
        return new File(temp_dir, temp_filename);
    }

    private JpegImageMetadata getJpegImageMetadata(File sourceFile) throws ImageReadException, IOException {
        JpegImageMetadata jpegImageMetadata = (JpegImageMetadata) Imaging.getMetadata(sourceFile);
        if (null == jpegImageMetadata) {
            throw new TestSkippedException();
        }
        return jpegImageMetadata;
    }

    private TiffImageMetadata getTiffImageMetadata(JpegImageMetadata sourceJpegImageMetadata) {
        TiffImageMetadata tiffImageMetadata = sourceJpegImageMetadata.getExif();
        if (null == tiffImageMetadata) {
            throw new TestSkippedException();
        }
        return tiffImageMetadata;
    }

    private TiffOutputSet getTiffOutputSet(TiffImageMetadata sourceTiffImageMetadata) throws ImageWriteException {
        TiffOutputSet tiffOutputSet = sourceTiffImageMetadata.getOutputSet();
        if (tiffOutputSet == null) {
            throw new TestSkippedException();
        }
        return tiffOutputSet;
    }

    private TiffOutputSet duplicateTiffOutputSet(TiffOutputSet sourceTiffOutputSet) throws ImageWriteException {
        TiffOutputSet duplicateTiffOutputSet = new TiffOutputSet();
        for (TiffOutputDirectory tiffOutputDirectory : sourceTiffOutputSet.getDirectories()) {
            duplicateTiffOutputSet.addDirectory(tiffOutputDirectory);
        }
        return duplicateTiffOutputSet;
    }

    private void copyToDuplicateFile(File sourceFile, TiffOutputSet duplicateTiffOutputSet) throws IOException,
            ImageReadException, ImageWriteException {
        ExifRewriter exifRewriter = new ExifRewriter();
        duplicateFile = createTempFile();
        try (OutputStream duplicateOutputStream = new BufferedOutputStream(new FileOutputStream(duplicateFile))) {
            exifRewriter.updateExifMetadataLossless(sourceFile, duplicateOutputStream, duplicateTiffOutputSet);
        }
    }

    @ParameterizedTest
    @MethodSource("data")
    public void updateExifMetadataLossless_copyWithoutChanges_TiffImageMetadataIsIdentical(File sourceFile)
            throws Exception {
        /*
         * Load EXIF data from source file, skipping over any test images without any EXIF data
         */
        JpegImageMetadata sourceJpegImageMetadata = getJpegImageMetadata(sourceFile);
        TiffImageMetadata sourceTiffImageMetadata = getTiffImageMetadata(sourceJpegImageMetadata);
        TiffOutputSet sourceTiffOutputSet = getTiffOutputSet(sourceTiffImageMetadata);

        /*
         * Copy the TiffOutputSet to a duplicate TiffOutputSet
         */
        TiffOutputSet duplicateTiffOutputSet = duplicateTiffOutputSet(sourceTiffOutputSet);

        /*
         * Copy the file to a duplicate file, using updateExifMetadataLossless and the duplicate TiffOutputSet
         */
        copyToDuplicateFile(sourceFile, duplicateTiffOutputSet);

        /*
         * Load EXIF data from duplicate file
         */
        JpegImageMetadata duplicateJpegImageMetadata = getJpegImageMetadata(duplicateFile);
        TiffImageMetadata duplicateTiffImageMetadata = getTiffImageMetadata(duplicateJpegImageMetadata);

        /*
         * Compare the source TiffImageMetadata to the one loaded from the duplicate file. This fails!
         */
        List<? extends ImageMetadata.ImageMetadataItem> imageMetadataItems = sourceTiffImageMetadata.getItems();
        List<? extends ImageMetadata.ImageMetadataItem> imageMetadataItems1 = duplicateTiffImageMetadata.getItems();
        Assertions.assertEquals(imageMetadataItems.size(), imageMetadataItems1.size(),
                "The TiffImageMetadata have different numbers of imageMetadataItems.");

        for (int i = 0; i < imageMetadataItems.size(); i++) {
            ImageMetadata.ImageMetadataItem imageMetadataItem = imageMetadataItems.get(i);
            ImageMetadata.ImageMetadataItem imageMetadataItem1 = imageMetadataItems1.get(i);
            Assertions.assertEquals(imageMetadataItem.toString(), imageMetadataItem1.toString(),
                    "ImageMetadataItem toString mismatch.");
        }
    }

    private void assertEquals(TiffOutputSet tiffOutputSet, TiffOutputSet tiffOutputSet1) {
        List<TiffOutputDirectory> directories = tiffOutputSet.getDirectories();
        List<TiffOutputDirectory> directories1 = tiffOutputSet1.getDirectories();
        Assertions.assertEquals(directories.size(), directories1.size(),
                "The TiffOutputSets have different numbers of directories.");

        for (int i = 0; i < directories.size(); i++) {
            List<TiffOutputField> fields = directories.get(i).getFields();
            List<TiffOutputField> fields1 = directories1.get(i).getFields();
            Assertions.assertEquals(fields.size(), fields1.size(),
                    "The TiffOutputDirectories have different numbers of fields.");

            for (int j = 0; j < fields.size(); j++) {
                TiffOutputField field = fields.get(j);
                TiffOutputField field1 = fields1.get(j);
                Assertions.assertEquals(field.tag, field1.tag, "TiffOutputField tag mismatch.");
                Assertions.assertEquals(field.tagInfo, field1.tagInfo, "TiffOutputField tagInfo mismatch.");
                Assertions.assertEquals(field.fieldType, field1.fieldType, "TiffOutputField fieldType mismatch.");
                Assertions.assertEquals(field.count, field1.count, "TiffOutputField count mismatch.");
            }
        }
    }

    @ParameterizedTest
    @MethodSource("data")
    public void updateExifMetadataLossless_copyWithoutChanges_TiffOutputSetsAreIdentical(File sourceFile)
            throws Exception {
        /*
         * Load EXIF data from source file, skipping over any test images without any EXIF data
         */
        JpegImageMetadata sourceJpegImageMetadata = getJpegImageMetadata(sourceFile);
        TiffImageMetadata sourceTiffImageMetadata = getTiffImageMetadata(sourceJpegImageMetadata);
        TiffOutputSet sourceTiffOutputSet = getTiffOutputSet(sourceTiffImageMetadata);

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
        JpegImageMetadata duplicateJpegImageMetadata = getJpegImageMetadata(duplicateFile);
        TiffImageMetadata duplicateTiffImageMetadata = getTiffImageMetadata(duplicateJpegImageMetadata);
        duplicateTiffOutputSet = duplicateTiffImageMetadata.getOutputSet();

        /*
         * Compare the source TiffOutputSet to the one loaded from the duplicate file. This fails!
         */
        assertEquals(sourceTiffOutputSet, duplicateTiffOutputSet);
    }
}
