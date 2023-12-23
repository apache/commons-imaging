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

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.imaging.AbstractImagingTest;
import org.apache.commons.imaging.formats.tiff.constants.AdobePageMaker6TagConstants;
import org.apache.commons.imaging.formats.tiff.constants.AdobePhotoshopTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.AliasSketchbookProTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.DngTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.GdalLibraryTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.GeoTiffTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.MicrosoftTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.MolecularDynamicsGelTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.OceScanjobTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants;
import org.apache.commons.imaging.formats.tiff.constants.Tiff4TagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.WangTagConstants;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.junit.jupiter.api.Test;

public class TiffTagIntegrityTest extends AbstractImagingTest {

    @Test
    public void testTagIntegrity() {
        verifyFields(AdobePageMaker6TagConstants.class, AdobePageMaker6TagConstants.ALL_ADOBE_PAGEMAKER_6_TAGS);
        verifyFields(AdobePhotoshopTagConstants.class, AdobePhotoshopTagConstants.ALL_ADOBE_PHOTOSHOP_TAGS);
        verifyFields(AliasSketchbookProTagConstants.class, AliasSketchbookProTagConstants.ALL_ALIAS_SKETCHBOOK_PRO_TAGS);
        verifyFields(DcfTagConstants.class, DcfTagConstants.ALL_DCF_TAGS);
        verifyFields(DngTagConstants.class, DngTagConstants.ALL_DNG_TAGS);
        verifyFields(ExifTagConstants.class, ExifTagConstants.ALL_EXIF_TAGS);
        verifyFields(GeoTiffTagConstants.class, GeoTiffTagConstants.ALL_GEO_TIFF_TAGS);
        verifyFields(GdalLibraryTagConstants.class, GdalLibraryTagConstants.ALL_GDAL_LIBRARY_TAGS);
        verifyFields(GpsTagConstants.class, GpsTagConstants.ALL_GPS_TAGS);
        verifyFields(MolecularDynamicsGelTagConstants.class, MolecularDynamicsGelTagConstants.ALL_MOLECULAR_DYNAMICS_GEL_TAGS);
        verifyFields(MicrosoftTagConstants.class, MicrosoftTagConstants.ALL_MICROSOFT_TAGS);
        verifyFields(MicrosoftHdPhotoTagConstants.class, MicrosoftHdPhotoTagConstants.ALL_MICROSOFT_HD_PHOTO_TAGS);
        verifyFields(OceScanjobTagConstants.class, OceScanjobTagConstants.ALL_OCE_SCANJOB_TAGS);
        verifyFields(Rfc2301TagConstants.class, Rfc2301TagConstants.ALL_RFC_2301_TAGS);
        verifyFields(Tiff4TagConstants.class, Tiff4TagConstants.ALL_TIFF_4_TAGS);
        verifyFields(TiffEpTagConstants.class, TiffEpTagConstants.ALL_TIFF_EP_TAGS);
        verifyFields(TiffTagConstants.class, TiffTagConstants.ALL_TIFF_TAGS);
        verifyFields(WangTagConstants.class, WangTagConstants.ALL_WANG_TAGS);
    }

    private void verifyFields(final Class<?> cls, final List<TagInfo> allTags) {
        final ArrayList<Integer> fieldTags = new ArrayList<>();
        for (final Field field : cls.getFields()) {
            field.setAccessible(true);
            Object obj = null;
            try {
                obj = field.get(null);
            } catch (final IllegalAccessException illegalAccess) {
            }
            if (obj == null) {
                continue;
            }
            if (!(obj instanceof TagInfo)) {
                continue;
            }
            final TagInfo src = (TagInfo) obj;
            if (src.tag == -1) {
                // Skip TiffTagConstants.TIFF_TAG_UNKNOWN
                continue;
            }
            fieldTags.add(src.tag);
        }
        Collections.sort(fieldTags);
        final Set<Integer> allTagSet = new TreeSet<>();
        for (final TagInfo tagInfo : allTags) {
            assertTrue(Collections.binarySearch(fieldTags, tagInfo.tag) >= 0);
            allTagSet.add(tagInfo.tag);
        }
        for (final Integer tag : fieldTags) {
            assertTrue(allTagSet.contains(tag));
        }
    }
}
