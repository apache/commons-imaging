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
package org.apache.commons.imaging.formats.tiff;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.imaging.FormatCompliance;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.RationalNumber;
import org.apache.commons.imaging.common.bytesource.ByteSourceArray;
import org.apache.commons.imaging.formats.tiff.constants.GeoTiffTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;
import org.junit.jupiter.api.Test;

public class TiffReadWriteTagsTest extends TiffBaseTest {

    @Test
    public void testReadWriteTags() throws ImageWriteException, ImageReadException, IOException {
        final String description = "A pretty picture";
        final short page = 1;
        final RationalNumber twoThirds = new RationalNumber(2, 3);
        final int t4Options = 0;
        final int width = 10;
        final short height = 10;
        final String area = "A good area";
        final float widthRes = 2.2f;
        final double geoDoubleParams = -8.4;

        final TiffOutputSet set = new TiffOutputSet();
        final TiffOutputDirectory dir = set.getOrCreateRootDirectory();
        dir.add(TiffTagConstants.TIFF_TAG_IMAGE_DESCRIPTION, description);
        dir.add(TiffTagConstants.TIFF_TAG_PAGE_NUMBER, page, page);
        dir.add(TiffTagConstants.TIFF_TAG_YRESOLUTION, twoThirds);
        dir.add(TiffTagConstants.TIFF_TAG_T4_OPTIONS, t4Options);
        dir.add(TiffTagConstants.TIFF_TAG_IMAGE_WIDTH, width);
        dir.add(TiffTagConstants.TIFF_TAG_IMAGE_LENGTH, height);
        dir.add(GpsTagConstants.GPS_TAG_GPS_AREA_INFORMATION, area);
        dir.add(MicrosoftHdPhotoTagConstants.EXIF_TAG_WIDTH_RESOLUTION, widthRes);
        dir.add(GeoTiffTagConstants.EXIF_TAG_GEO_DOUBLE_PARAMS_TAG, geoDoubleParams);

        final TiffImageWriterLossy writer = new TiffImageWriterLossy();
        final ByteArrayOutputStream tiff = new ByteArrayOutputStream();
        writer.write(tiff, set);

        final TiffReader reader = new TiffReader(true);
        final Map<String, Object> params = new TreeMap<>();
        final FormatCompliance formatCompliance = new FormatCompliance("");
        final TiffContents contents = reader.readFirstDirectory(new ByteSourceArray(tiff.toByteArray()), params, true, formatCompliance);
        final TiffDirectory rootDir = contents.directories.get(0);
        assertEquals(description, rootDir.getSingleFieldValue(TiffTagConstants.TIFF_TAG_IMAGE_DESCRIPTION));
        assertEquals(page, rootDir.getFieldValue(TiffTagConstants.TIFF_TAG_PAGE_NUMBER, true)[0]);
        final RationalNumber yRes = rootDir.getFieldValue(TiffTagConstants.TIFF_TAG_YRESOLUTION);
        assertEquals(twoThirds.numerator, yRes.numerator);
        assertEquals(twoThirds.divisor, yRes.divisor);
        assertEquals(t4Options, rootDir.getFieldValue(TiffTagConstants.TIFF_TAG_T4_OPTIONS));
        assertEquals(width, rootDir.getSingleFieldValue(TiffTagConstants.TIFF_TAG_IMAGE_WIDTH));
        assertEquals(width, rootDir.getSingleFieldValue(TiffTagConstants.TIFF_TAG_IMAGE_LENGTH));
        assertEquals(area, rootDir.getFieldValue(GpsTagConstants.GPS_TAG_GPS_AREA_INFORMATION, true));
        assertEquals(widthRes, rootDir.getFieldValue(MicrosoftHdPhotoTagConstants.EXIF_TAG_WIDTH_RESOLUTION), 0.0);
        assertEquals(geoDoubleParams, rootDir.getFieldValue(GeoTiffTagConstants.EXIF_TAG_GEO_DOUBLE_PARAMS_TAG, true)[0], 0.0);
    }
}
