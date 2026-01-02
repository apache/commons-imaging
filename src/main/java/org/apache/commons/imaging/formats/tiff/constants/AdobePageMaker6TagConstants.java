/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.imaging.formats.tiff.constants;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongOrIfd;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort;

/**
 * TIFF specification supplement 1.
 * <p>
 * Enhancements for Adobe PageMaker(R) 6.0 software
 * </p>
 * <p>
 * [BROKEN URL] http://partners.adobe.com/public/developer/en/tiff/TIFFPM6.pdf
 * </p>
 */
public final class AdobePageMaker6TagConstants {

    /** Sub IFDs tag. */
    public static final TagInfoLongOrIfd TIFF_TAG_SUB_IFD = new TagInfoLongOrIfd("SubIFDs", 0x014a, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN, true);

    /** Clip path tag. */
    public static final TagInfoBytes TIFF_TAG_CLIP_PATH = new TagInfoBytes("ClipPath", 0x0157, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    /** X clip path units tag. */
    public static final TagInfoLong TIFF_TAG_XCLIP_PATH_UNITS = new TagInfoLong("XClipPathUnits", 0x0158, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    /** Y clip path units tag. */
    public static final TagInfoLong TIFF_TAG_YCLIP_PATH_UNITS = new TagInfoLong("YClipPathUnits", 0x0159, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    /** Indexed tag. */
    public static final TagInfoShort TIFF_TAG_INDEXED = new TagInfoShort("Indexed", 0x015a, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    /** Indexed value: not indexed. */
    public static final int INDEXED_VALUE_NOT_INDEXED = 0;

    /** Indexed value: indexed. */
    public static final int INDEXED_VALUE_INDEXED = 1;

    /** OPI proxy tag. */
    public static final TagInfoShort TIFF_TAG_OPIPROXY = new TagInfoShort("OPIProxy", 0x015f, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    /** OPI proxy value: higher resolution image does not exist. */
    public static final int OPIPROXY_VALUE_HIGHER_RESOLUTION_IMAGE_DOES_NOT_EXIST = 0;

    /** OPI proxy value: higher resolution image exists. */
    public static final int OPIPROXY_VALUE_HIGHER_RESOLUTION_IMAGE_EXISTS = 1;

    /** Image ID tag. */
    public static final TagInfoAscii TIFF_TAG_IMAGE_ID = new TagInfoAscii("ImageID", 0x800d, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    /** List of all Adobe PageMaker 6 tags. */
    public static final List<TagInfo> ALL_ADOBE_PAGEMAKER_6_TAGS = Collections.unmodifiableList(Arrays.asList(TIFF_TAG_SUB_IFD, TIFF_TAG_CLIP_PATH,
            TIFF_TAG_XCLIP_PATH_UNITS, TIFF_TAG_YCLIP_PATH_UNITS, TIFF_TAG_INDEXED, TIFF_TAG_OPIPROXY, TIFF_TAG_IMAGE_ID));

    private AdobePageMaker6TagConstants() {
    }
}
