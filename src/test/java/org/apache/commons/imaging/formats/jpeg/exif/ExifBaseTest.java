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

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.ImagingTest;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.formats.jpeg.JpegImageParser;

public abstract class ExifBaseTest extends ImagingTest {

    private static final ImageFilter HAS_EXIF_IMAGE_FILTER = ExifBaseTest::hasExifData;

    private static final ImageFilter JPEG_IMAGE_FILTER = file -> file.getName().toLowerCase().endsWith(".jpg");

    protected static List<File> getImagesWithExifData() throws IOException,
            ImagingException {
        return getTestImages(HAS_EXIF_IMAGE_FILTER);
    }

    protected static List<File> getJpegImages() throws IOException, ImagingException {
        return getTestImages(JPEG_IMAGE_FILTER);
    }

    protected static boolean hasExifData(final File file) {
        if (!file.getName().toLowerCase().endsWith(".jpg")) {
            return false;
        }

        try {
            final ByteSource byteSource = ByteSource.file(file);
            return new JpegImageParser().hasExifSegment(byteSource);
        } catch (final Exception e) {
            return false;
        }
    }

    protected static boolean hasExifData(final String fileName, final byte[] bytes) {
        try {
            final ByteSource byteSource = ByteSource.array(bytes, fileName);
            return new JpegImageParser().hasExifSegment(byteSource);
        } catch (final Exception e) {
            return false;
        }
    }

    protected File getImageWithExifData() throws IOException,
            ImagingException {
        return getTestImage(HAS_EXIF_IMAGE_FILTER);
    }

}
