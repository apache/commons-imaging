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

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceArray;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.formats.jpeg.JpegImageMetadata;
import org.apache.commons.imaging.formats.jpeg.JpegUtils;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;
import org.apache.commons.imaging.internal.Debug;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExifRewriteTest extends ExifBaseTest {
    // public ExifRewriteTest(String name)
    // {
    // super(name);
    // }

    @Test
    public void testRemove() throws Exception {
        final List<File> images = getImagesWithExifData();
        for (final File imageFile : images) {

            Debug.debug("imageFile", imageFile);

            final boolean ignoreImageData = isPhilHarveyTestImage(imageFile);
            if (ignoreImageData) {
                continue;
            }

            final ByteSource byteSource = new ByteSourceFile(imageFile);
            Debug.debug("Source Segments:");
            new JpegUtils().dumpJFIF(byteSource);

            {
                final JpegImageMetadata metadata = (JpegImageMetadata) Imaging.getMetadata(imageFile);
                Assertions.assertNotNull(metadata);
            }

            {
                final ByteArrayOutputStream baos = new ByteArrayOutputStream();
                new ExifRewriter().removeExifMetadata(byteSource, baos);
                final byte[] bytes = baos.toByteArray();
                final File tempFile = File.createTempFile("test", ".jpg");
                Debug.debug("tempFile", tempFile);
                FileUtils.writeByteArrayToFile(tempFile, bytes);

                Debug.debug("Output Segments:");
                new JpegUtils().dumpJFIF(new ByteSourceArray(bytes));

                assertTrue(!hasExifData(tempFile));
            }
        }
    }

    @Test
    public void testInsert() throws Exception {
        final List<File> images = getImagesWithExifData();
        for (final File imageFile : images) {

            Debug.debug("imageFile", imageFile);

            final boolean ignoreImageData = isPhilHarveyTestImage(imageFile);
            if (ignoreImageData) {
                continue;
            }

            final ByteSource byteSource = new ByteSourceFile(imageFile);
            Debug.debug("Source Segments:");
            new JpegUtils().dumpJFIF(byteSource);

            final JpegImageMetadata originalMetadata = (JpegImageMetadata) Imaging.getMetadata(imageFile);
            assertNotNull(originalMetadata);

            final TiffImageMetadata oldExifMetadata = originalMetadata.getExif();
            assertNotNull(oldExifMetadata);

            ByteSource stripped;
            {
                final ByteArrayOutputStream baos = new ByteArrayOutputStream();
                new ExifRewriter().removeExifMetadata(byteSource, baos);
                final byte[] bytes = baos.toByteArray();
                final File tempFile = File.createTempFile("removed", ".jpg");
                Debug.debug("tempFile", tempFile);
                FileUtils.writeByteArrayToFile(tempFile, bytes);

                Debug.debug("Output Segments:");
                stripped = new ByteSourceArray(bytes);
                new JpegUtils().dumpJFIF(stripped);

                assertTrue(!hasExifData(tempFile));
            }

            {
                final TiffOutputSet outputSet = oldExifMetadata.getOutputSet();
                // outputSet.dump();

                final ByteArrayOutputStream baos = new ByteArrayOutputStream();

                new ExifRewriter().updateExifMetadataLossy(stripped, baos,
                        outputSet);

                final byte[] bytes = baos.toByteArray();
                final File tempFile = File.createTempFile("inserted" + "_", ".jpg");
                Debug.debug("tempFile", tempFile);
                FileUtils.writeByteArrayToFile(tempFile, bytes);

                Debug.debug("Output Segments:");
                new JpegUtils().dumpJFIF(new ByteSourceArray(bytes));

                // assertTrue(!hasExifData(tempFile));

                final JpegImageMetadata newMetadata = (JpegImageMetadata) Imaging.getMetadata(tempFile);
                assertNotNull(newMetadata);
                final TiffImageMetadata newExifMetadata = newMetadata.getExif();
                assertNotNull(newExifMetadata);
                // newMetadata.dump();

                compare(imageFile, oldExifMetadata, newExifMetadata);
            }

        }
    }

    private interface Rewriter {
        void rewrite(ByteSource byteSource, OutputStream os,
                TiffOutputSet outputSet) throws ImageReadException,
                IOException, ImageWriteException;
    }

    private void rewrite(final Rewriter rewriter, final String name) throws IOException,
            ImageReadException {
        final List<File> images = getImagesWithExifData();
        for (final File imageFile : images) {

            try {

                Debug.debug("imageFile", imageFile);

                final boolean ignoreImageData = isPhilHarveyTestImage(imageFile);
                if (ignoreImageData) {
                    continue;
                }

                final ByteSource byteSource = new ByteSourceFile(imageFile);
                Debug.debug("Source Segments:");
                new JpegUtils().dumpJFIF(byteSource);

                final JpegImageMetadata oldMetadata = (JpegImageMetadata) Imaging.getMetadata(imageFile);
                if (null == oldMetadata) {
                    continue;
                }
                assertNotNull(oldMetadata);

                final TiffImageMetadata oldExifMetadata = oldMetadata.getExif();
                if (null == oldExifMetadata) {
                    continue;
                }
                assertNotNull(oldExifMetadata);
                oldMetadata.dump();

                // TiffImageMetadata tiffImageMetadata = metadata.getExif();
                // Photoshop photoshop = metadata.getPhotoshop();

                final TiffOutputSet outputSet = oldExifMetadata.getOutputSet();
                // outputSet.dump();

                final ByteArrayOutputStream baos = new ByteArrayOutputStream();
                rewriter.rewrite(byteSource, baos, outputSet);
                final byte[] bytes = baos.toByteArray();
                final File tempFile = File.createTempFile(name + "_", ".jpg");
                Debug.debug("tempFile", tempFile);
                FileUtils.writeByteArrayToFile(tempFile, bytes);

                Debug.debug("Output Segments:");
                new JpegUtils().dumpJFIF(new ByteSourceArray(bytes));

                // assertTrue(!hasExifData(tempFile));

                final JpegImageMetadata newMetadata = (JpegImageMetadata) Imaging.getMetadata(tempFile);
                assertNotNull(newMetadata);
                final TiffImageMetadata newExifMetadata = newMetadata.getExif();
                assertNotNull(newExifMetadata);
                // newMetadata.dump();

                compare(imageFile, oldExifMetadata, newExifMetadata);
            } catch (final IOException | ImageReadException e) {
                Debug.debug("imageFile", imageFile.getAbsoluteFile());
                Debug.debug(e);
                throw e;
            } catch (final ImageWriteException e) {
                Debug.debug("imageFile", imageFile.getAbsoluteFile());
                Debug.debug(e);
            }

        }
    }

    @Test
    public void testRewriteLossy() throws Exception {
        final Rewriter rewriter = (byteSource, os, outputSet) -> new ExifRewriter().updateExifMetadataLossy(byteSource, os,
                outputSet);

        rewrite(rewriter, "lossy");
    }

    @Test
    public void testRewriteLossless() throws Exception {
        final Rewriter rewriter = (byteSource, os, outputSet) -> new ExifRewriter().updateExifMetadataLossless(byteSource, os,
                outputSet);

        rewrite(rewriter, "lossless");
    }

    private Map<Integer,TiffImageMetadata.Directory> makeDirectoryMap(final List<? extends ImageMetadataItem> directories) {
        final Map<Integer,TiffImageMetadata.Directory> directoryMap = new HashMap<>();
        for (final ImageMetadataItem element : directories) {
            final TiffImageMetadata.Directory directory = (TiffImageMetadata.Directory) element;
            directoryMap.put(directory.type, directory);
        }
        return directoryMap;
    }

    private Map<Integer,TiffField> makeFieldMap(final List<? extends ImageMetadataItem> items) {
        final Map<Integer,TiffField> fieldMap = new HashMap<>();
        for (final ImageMetadataItem item2 : items) {
            final TiffImageMetadata.TiffMetadataItem item = (TiffImageMetadata.TiffMetadataItem) item2;
            final TiffField field = item.getTiffField();
            if (!fieldMap.containsKey(field.getTag())) {
                fieldMap.put(field.getTag(), field);
            }
        }
        return fieldMap;
    }

    private void compare(final File imageFile, final TiffImageMetadata oldExifMetadata,
            final TiffImageMetadata newExifMetadata) throws ImageReadException {
        assertNotNull(oldExifMetadata);
        assertNotNull(newExifMetadata);

        final List<? extends ImageMetadataItem> oldDirectories = oldExifMetadata.getDirectories();
        final List<? extends ImageMetadataItem> newDirectories = newExifMetadata.getDirectories();

        assertTrue(oldDirectories.size() == newDirectories.size());

        final Map<Integer,TiffImageMetadata.Directory> oldDirectoryMap = makeDirectoryMap(oldDirectories);
        final Map<Integer,TiffImageMetadata.Directory> newDirectoryMap = makeDirectoryMap(newDirectories);

        assertEquals(oldDirectories.size(), oldDirectoryMap.size());
        final List<Integer> oldDirectoryTypes = new ArrayList<>(oldDirectoryMap.keySet());
        Collections.sort(oldDirectoryTypes);
        final List<Integer> newDirectoryTypes = new ArrayList<>(newDirectoryMap.keySet());
        Collections.sort(newDirectoryTypes);
        assertEquals(oldDirectoryTypes, newDirectoryTypes);

        for (final Integer dirType : oldDirectoryTypes) {


            // Debug.debug("dirType", dirType);

            final TiffImageMetadata.Directory oldDirectory = oldDirectoryMap.get(dirType);
            final TiffImageMetadata.Directory newDirectory = newDirectoryMap.get(dirType);
            assertNotNull(oldDirectory);
            assertNotNull(newDirectory);

            final List<? extends ImageMetadataItem> oldItems = oldDirectory.getItems();
            final List<? extends ImageMetadataItem> newItems = newDirectory.getItems();

            final Map<Integer,TiffField> oldFieldMap = makeFieldMap(oldItems);
            final Map<Integer,TiffField> newFieldMap = makeFieldMap(newItems);

            final Set<Integer> missingInNew = new HashSet<>(oldFieldMap.keySet());
            missingInNew.removeAll(newFieldMap.keySet());

            final Set<Integer> missingInOld = new HashSet<>(newFieldMap.keySet());
            missingInOld.removeAll(oldFieldMap.keySet());

            assertTrue(missingInNew.isEmpty());
            assertTrue(missingInOld.isEmpty());

            assertEquals(oldItems.size(), oldFieldMap.size());
            assertEquals(oldFieldMap.keySet(), newFieldMap.keySet());
            assertEquals(oldFieldMap.keySet(), newFieldMap.keySet());

            final List<Integer> oldFieldTags = new ArrayList<>(oldFieldMap.keySet());
            Collections.sort(oldFieldTags);
            final List<Integer> newFieldTags = new ArrayList<>(newFieldMap.keySet());
            Collections.sort(newFieldTags);
            assertEquals(oldFieldTags, newFieldTags);

            for (final Integer fieldTag : oldFieldTags) {
                final TiffField oldField = oldFieldMap.get(fieldTag);
                final TiffField newField = newFieldMap.get(fieldTag);

                // fieldTag.
                assertNotNull(oldField);
                assertNotNull(newField);

                assertEquals(oldField.getTag(), newField.getTag());
                assertEquals(dirType.intValue(), newField.getDirectoryType());
                assertEquals(oldField.getDirectoryType(), newField.getDirectoryType());

                if (oldField.getFieldType() == FieldType.ASCII) {
                    // Imaging currently doesn't correctly rewrite
                    // strings if any byte had the highest bit set,
                    // so if the source had that, all bets are off.
                    final byte[] rawBytes = oldField.getByteArrayValue();
                    boolean hasInvalidByte = false;
                    for (final byte rawByte : rawBytes) {
                        if ((rawByte & 0x80) != 0) {
                            hasInvalidByte = true;
                            break;
                        }
                    }
                    if (hasInvalidByte) {
                        continue;
                    }
                }

                assertEquals(oldField.getCount(), newField.getCount());
                assertEquals(oldField.isLocalValue(), newField.isLocalValue());

                if (oldField.getTag() == 0x202) {
                    // ignore "jpg from raw length" value. may have off-by-one
                    // bug in certain cameras.
                    // i.e. Sony DCR-PC110
                    continue;
                }

                if (!oldField.getTagInfo().isOffset()) {
                    if (oldField.getTagInfo().isText()) { /* do nothing */
                    } else if (oldField.isLocalValue()) {
                        if (oldField.getTag() == 0x116 || oldField.getTag() == 0x117) {
                            assertEquals(oldField.getValue(), newField.getValue());
                        } else {
                            assertEquals(oldField.getBytesLength(), newField.getBytesLength());
                            assertArrayEquals(oldField.getByteArrayValue(), newField.getByteArrayValue());
                        }
                    } else {
                        assertArrayEquals(oldField.getByteArrayValue(), newField.getByteArrayValue());
                    }
                }
            }
        }
    }

}
