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

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.formats.tiff.constants.AdobePageMaker6TagConstants;
import org.apache.commons.imaging.formats.tiff.constants.AdobePhotoshopTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.AliasSketchbookProTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.DngTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.GdalLibraryTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.GeoTiffTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.HylaFaxTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.MicrosoftTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.MolecularDynamicsGelTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.OceScanjobTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants;
import org.apache.commons.imaging.formats.tiff.constants.Tiff4TagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.WangTagConstants;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;

final class TiffTags {

    private TiffTags() {
    }

    private static final List<TagInfo> ALL_TAGS = makeMergedTagList();
    private static final Map<Integer, List<TagInfo>> ALL_TAG_MAP = makeTagMap(TiffTags.ALL_TAGS);
    private static final Map<Integer, Integer> TAG_COUNTS = countTags(TiffTags.ALL_TAGS);

    private static List<TagInfo> makeMergedTagList() {
        final ArrayList<TagInfo> result = new ArrayList<>();
        result.addAll(AdobePageMaker6TagConstants.ALL_ADOBE_PAGEMAKER_6_TAGS);
        result.addAll(AdobePhotoshopTagConstants.ALL_ADOBE_PHOTOSHOP_TAGS);
        result.addAll(AliasSketchbookProTagConstants.ALL_ALIAS_SKETCHBOOK_PRO_TAGS);
        result.addAll(DcfTagConstants.ALL_DCF_TAGS);
        result.addAll(DngTagConstants.ALL_DNG_TAGS);
        result.addAll(ExifTagConstants.ALL_EXIF_TAGS);
        result.addAll(GeoTiffTagConstants.ALL_GEO_TIFF_TAGS);
        result.addAll(GdalLibraryTagConstants.ALL_GDAL_LIBRARY_TAGS);
        result.addAll(GpsTagConstants.ALL_GPS_TAGS);
        result.addAll(HylaFaxTagConstants.ALL_HYLAFAX_TAGS);
        result.addAll(MicrosoftTagConstants.ALL_MICROSOFT_TAGS);
        result.addAll(MicrosoftHdPhotoTagConstants.ALL_MICROSOFT_HD_PHOTO_TAGS);
        result.addAll(MolecularDynamicsGelTagConstants.ALL_MOLECULAR_DYNAMICS_GEL_TAGS);
        result.addAll(OceScanjobTagConstants.ALL_OCE_SCANJOB_TAGS);
        result.addAll(Rfc2301TagConstants.ALL_RFC_2301_TAGS);
        result.addAll(Tiff4TagConstants.ALL_TIFF_4_TAGS);
        result.addAll(TiffEpTagConstants.ALL_TIFF_EP_TAGS);
        result.addAll(TiffTagConstants.ALL_TIFF_TAGS);
        result.addAll(WangTagConstants.ALL_WANG_TAGS);

        return Collections.unmodifiableList(result);
    }
    
    private static Map<Integer, List<TagInfo>> makeTagMap(
            final List<TagInfo> tags) {
        // make sure to use the thread-safe version; this is shared state.
        final Map<Integer, List<TagInfo>> map = new HashMap<>();

        for (TagInfo tag : tags) {
            List<TagInfo> tagList = map.get(tag.tag);
            if (tagList == null) {
                tagList = new ArrayList<>();
                map.put(tag.tag, tagList);
            }
            tagList.add(tag);
        }

        return map;
    }

    private static Map<Integer, Integer> countTags(final List<TagInfo> tags) {
        final Map<Integer, Integer> map = new HashMap<>();

        for (TagInfo tag : tags) {
            final Integer count = map.get(tag.tag);
            if (count == null) {
                map.put(tag.tag, 1);
            } else {
                map.put(tag.tag, count + 1);
            }
        }

        return map;
    }

    static Integer getTagCount(final int tag) {
        return TAG_COUNTS.get(tag);
    }

    static TagInfo getTag(final int directoryType, final int tag) {
        final List<TagInfo> possibleMatches = ALL_TAG_MAP.get(tag);

        if (null == possibleMatches) {
            return TiffTagConstants.TIFF_TAG_UNKNOWN;
        }

        return getTag(directoryType, possibleMatches);
    }

    private static TagInfo getTag(final int directoryType, final List<TagInfo> possibleMatches) {
        // Please keep this method in sync with TiffImageMetadata's findField()

        if (possibleMatches.size() < 1) {
            return null;
        }

        // first search for exact match.
        for (TagInfo tagInfo : possibleMatches) {
            if (tagInfo.directoryType == TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN) {
                // pass
                continue;
            } else if (directoryType == tagInfo.directoryType.directoryType) {
                return tagInfo;
            }
        }

        // accept an inexact match.
        for (TagInfo tagInfo : possibleMatches) {
            if (tagInfo.directoryType == TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN) {
                // pass
                continue;
            } else if (directoryType >= 0
                    && tagInfo.directoryType.isImageDirectory()) {
                return tagInfo;
            } else if (directoryType < 0
                    && !tagInfo.directoryType.isImageDirectory()) {
                return tagInfo;
            }
        }

        // accept a wildcard match.
        for (TagInfo tagInfo : possibleMatches) {
            if (tagInfo.directoryType == TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN) {
                return tagInfo;
            }
        }

        return TiffTagConstants.TIFF_TAG_UNKNOWN;
    }

}
