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
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceArray;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.formats.jpeg.JpegImageMetadata;
import org.apache.commons.imaging.formats.jpeg.exif.ExifOrientationRewriter.Orientation;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

public class ExifOrientationRewriterTest extends ExifBaseTest {

    @Test
    public void originalOrientationMatchesRewriterGet() 
        throws ImageReadException, IOException, ImageWriteException {

        final List<File> images = getImagesWithExifData();
        for (final File imageFile : images) {            
            final JpegImageMetadata originalMetadata = (JpegImageMetadata) Imaging.getMetadata(imageFile);
            assertNotNull(originalMetadata);

            final TiffImageMetadata originalExifMetadata = originalMetadata.getExif();
            assertNotNull(originalExifMetadata);

            short originalOrt = (short) originalExifMetadata.getFieldValue(TiffTagConstants.TIFF_TAG_ORIENTATION);

            ExifOrientationRewriter rewriter = new ExifOrientationRewriter(imageFile);
            short ort = rewriter.getExifOrientation().getVal();

            assertEquals(ort, originalOrt);
        }

    }

    @Test
    public void rewrittenOrientationMatchesRewriterGet()
        throws ImageReadException, IOException, ImageWriteException {
        
        final List<File> images = getImagesWithExifData();
        for (final File imageFile : images) {            
            final ByteSource byteSource = new ByteSourceFile(imageFile);

            final JpegImageMetadata originalMetadata = (JpegImageMetadata) Imaging.getMetadata(imageFile);
            assertNotNull(originalMetadata);

            final TiffImageMetadata originalExifMetadata = originalMetadata.getExif();
            assertNotNull(originalExifMetadata);

            final TiffOutputSet outputSet = originalExifMetadata.getOutputSet();

            outputSet.getOrCreateRootDirectory().removeField(TiffTagConstants.TIFF_TAG_ORIENTATION);
            outputSet.getOrCreateRootDirectory().add(TiffTagConstants.TIFF_TAG_ORIENTATION, (short) TiffTagConstants.ORIENTATION_VALUE_ROTATE_270_CW);

            final ByteArrayOutputStream baos = new ByteArrayOutputStream();

            new ExifRewriter().updateExifMetadataLossy(byteSource.getAll(), baos,
                    outputSet);

            final byte[] bytes = baos.toByteArray();
            final File tempFile = Files.createTempFile("inserted" + "_", ".jpg").toFile();

            FileUtils.writeByteArrayToFile(tempFile, bytes);

            final ExifOrientationRewriter rewriter = new ExifOrientationRewriter(tempFile);
            short ort = rewriter.getExifOrientation().getVal();

            assertEquals(ort, (short) TiffTagConstants.ORIENTATION_VALUE_ROTATE_270_CW);
        }    

    }

    @Test
    public void getWithNullExifReturnsHorizontal() 
        throws ImageReadException, IOException, ImageWriteException {

        final List<File> images = getImagesWithExifData();
        for (final File imageFile : images) {            
            final ByteSource byteSource = new ByteSourceFile(imageFile);
            final JpegImageMetadata originalMetadata = (JpegImageMetadata) Imaging.getMetadata(imageFile);
            assertNotNull(originalMetadata);

            final TiffImageMetadata originalExifMetadata = originalMetadata.getExif();
            assertNotNull(originalExifMetadata);

            final ByteArrayOutputStream baos = new ByteArrayOutputStream();
            new ExifRewriter().removeExifMetadata(byteSource, baos);
            final byte[] bytes = baos.toByteArray();
            final File tempFile = Files.createTempFile("removed", ".jpg").toFile();
            FileUtils.writeByteArrayToFile(tempFile, bytes);

            assertFalse(hasExifData(tempFile));

            final ExifOrientationRewriter rewriter = new ExifOrientationRewriter(tempFile);
            short ort = rewriter.getExifOrientation().getVal();

            assertEquals(ort, Orientation.HORIZONTAL.getVal());
        }

    }


}
