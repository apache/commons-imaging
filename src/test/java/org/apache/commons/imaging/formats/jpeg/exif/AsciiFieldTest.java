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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.formats.jpeg.JpegImageMetadata;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.junit.jupiter.api.Test;

public class AsciiFieldTest extends ExifBaseTest {

    @Test
    public void testSingleImage() throws Exception {
        final File imageFile = getTestImageByName("Canon Powershot SD750 - 2007.12.26.n.IMG_3704.JPG");

        final ImageMetadata metadata = Imaging.getMetadata(imageFile);
        assertNotNull(metadata);
        final JpegImageMetadata jpegMetadata = (JpegImageMetadata) metadata;

        // note that exif might be null if no Exif metadata is found.
        final TiffImageMetadata exif = jpegMetadata.getExif();
        final List<TiffField> fields = exif.getAllFields();
        final Map<Integer,TiffField> fieldMap = new HashMap<>();
        // Build a simplified field tag -> field map, ignoring directory
        // structures.
        // Good enough for our purposes, since the image in question is known.
        for (final TiffField field : fields) {
            fieldMap.put(field.getTag(), field);
        }

        final Map<Integer,Object> expectedFieldValues = new HashMap<>();
        expectedFieldValues.put(
                TiffTagConstants.TIFF_TAG_MAKE.tag, "Canon");
        expectedFieldValues.put(
                TiffTagConstants.TIFF_TAG_MODEL.tag,
                "Canon PowerShot SD750");
        expectedFieldValues.put(
                TiffTagConstants.TIFF_TAG_DATE_TIME.tag,
                "2007:12:25 13:34:39");

        for (final Map.Entry<Integer, Object> tag : expectedFieldValues.entrySet()) {
            assertTrue(fieldMap.containsKey(tag.getKey()));
            final TiffField field = fieldMap.get(tag.getKey());
            assertNotNull(field);
            final Object value = field.getValue();
            assertNotNull(value);
            assertEquals(value, tag.getValue());
        }
    }
}
