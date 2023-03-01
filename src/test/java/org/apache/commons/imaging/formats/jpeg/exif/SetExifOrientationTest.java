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
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingTest;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.formats.jpeg.JpegImageMetadata;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetExifOrientationTest extends ExifBaseTest {
    @Test
    void testSetExifOrientation1() throws IOException, ImageReadException, ImageWriteException {
        final File imageFile = getTestImageByName("Canon Powershot SD750 - 2007.12.26.n.IMG_3704");
        ExifOrientationRewriter eor = new ExifOrientationRewriter(imageFile);
        ExifOrientationRewriter.Orientation eo = ExifOrientationRewriter.Orientation.ROTATE_180;
        eor.SetExifOrientation(eo);

        ByteSource bs = eor.getOutput();
        final JpegImageMetadata newMetadata = (JpegImageMetadata) Imaging.getMetadata(bs.getAll());
        final TiffImageMetadata newExifMetadata = newMetadata.getExif();

        //assertNotNull(newExifMetadata);
        assertNotNull(newExifMetadata, "The new EXIF metadata is null");

        //assertEquals(newExifMetadata.getFieldValue(TiffTagConstants.TIFF_TAG_ORIENTATION), eo.getVal());
        assertEquals(newExifMetadata.getFieldValue(TiffTagConstants.TIFF_TAG_ORIENTATION), Short.valueOf(eo.getVal()), "The orientation field in the EXIF metadata is not set correctly");

    }

}
