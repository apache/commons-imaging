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
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.common.IImageMetadata;
import org.apache.commons.imaging.formats.jpeg.JpegImageMetadata;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.formats.tiff.constants.AllTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;

public class AsciiFieldTest extends ExifBaseTest implements AllTagConstants {

    public void testSingleImage() throws Exception {
        final File imageFile = getTestImageByName("Canon Powershot SD750 - 2007.12.26.n.IMG_3704.JPG");

        final Map<String,Object> params = new HashMap<String,Object>();

        final IImageMetadata metadata = Imaging.getMetadata(imageFile, params);
        assertNotNull(metadata);
        final JpegImageMetadata jpegMetadata = (JpegImageMetadata) metadata;

        // note that exif might be null if no Exif metadata is found.
        final TiffImageMetadata exif = jpegMetadata.getExif();
        if (null == exif) {
            return;
        }

        final List<TiffField> fields = exif.getAllFields();
        final Map<Integer,TiffField> fieldMap = new Hashtable<Integer,TiffField>();
        // Build a simplified field tag -> field map, ignoring directory
        // structures.
        // Good enough for our purposes, since the image in question is known.
        for (int i = 0; i < fields.size(); i++) {
            final TiffField field = fields.get(i);
            fieldMap.put(field.getTag(), field);
        }

        final Map<Integer,Object> expectedFieldValues = new Hashtable<Integer,Object>();
        expectedFieldValues.put(
                TiffTagConstants.TIFF_TAG_MAKE.tag, "Canon");
        expectedFieldValues.put(
                TiffTagConstants.TIFF_TAG_MODEL.tag,
                "Canon PowerShot SD750");
        expectedFieldValues.put(
                TiffTagConstants.TIFF_TAG_DATE_TIME.tag,
                "2007:12:25 13:34:39");
        final Iterator<Integer> expectedTags = expectedFieldValues.keySet().iterator();
        while (expectedTags.hasNext()) {
            final Integer tag = expectedTags.next();
            final Object expectedValue = expectedFieldValues.get(tag);

            assertTrue(fieldMap.containsKey(tag));
            final TiffField field = fieldMap.get(tag);
            assertNotNull(field);
            final Object value = field.getValue();
            assertNotNull(value);
            assertEquals(value, expectedValue);
        }
    }
}
