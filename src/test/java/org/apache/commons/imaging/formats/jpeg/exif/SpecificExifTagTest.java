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
 *
 * Changed 2015 by Michael Gross, mgmechanics@mgmechanics.de
 */

package org.apache.commons.imaging.formats.jpeg.exif;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingParametersJpeg;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.formats.jpeg.JpegImageMetadata;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public abstract class SpecificExifTagTest extends ExifBaseTest {

    private final File imageFile;

    @Parameterized.Parameters
    public static Collection<File> data() throws Exception {
        return getImagesWithExifData();
    }

    public SpecificExifTagTest(File imageFile) {
        this.imageFile = imageFile;
    }

    @Test
    public void testAllImages() throws Exception {
        if (imageFile.getParentFile().getName().toLowerCase()
                .equals("@broken")) {
            return;
        }
        checkImage(imageFile);
    }

    protected abstract void checkField(File imageFile, TiffField field)
            throws IOException, ImageReadException, ImageWriteException;

    private void checkImage(final File imageFile) throws IOException,
            ImageReadException, ImageWriteException {
        // Debug.debug("imageFile", imageFile.getAbsoluteFile());

        final ImagingParametersJpeg params = new ImagingParametersJpeg();
        final boolean ignoreImageData = isPhilHarveyTestImage(imageFile);
        if (ignoreImageData) {
            params.disableReadThumbnails();
        }
        else {
            params.enableReadThumbnails();
        }

        // note that metadata might be null if no metadata is found.
        final ImageMetadata metadata = Imaging.getMetadata(imageFile, params);
        if (null == metadata) {
            return;
        }
        final JpegImageMetadata jpegMetadata = (JpegImageMetadata) metadata;

        // note that exif might be null if no Exif metadata is found.
        final TiffImageMetadata exif = jpegMetadata.getExif();
        if (null == exif) {
            return;
        }

        final List<TiffField> fields = exif.getAllFields();
        for (final TiffField field : fields) {
            checkField(imageFile, field);
        }

    }

}
