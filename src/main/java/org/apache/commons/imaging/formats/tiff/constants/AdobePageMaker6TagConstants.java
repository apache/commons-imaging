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
package org.apache.commons.imaging.formats.tiff.constants;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongOrIFD;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort;

/**
 * TIFF specification supplement 1.
 *
 * @see <a href="https://web.archive.org/web/20180810205521/https://www.adobe.io/content/udp/en/open/standards/TIFF/_jcr_content/contentbody/download_1704706507/file.res/TIFFPM6.pdf">Adobe PageMaker(R) 6.0 TIFF Technical Notes</a>
 */
public final class AdobePageMaker6TagConstants {

    /**
     * SubIFDs.
     *
     * <p>Each value is an offset (from the beginning of the TIFF file, as always) to a child
     * IFD. Child images provide extra information for the parent image—such as a
     * sub-sampled version of the parent image.</p>
     */
    public static final TagInfoLongOrIFD TIFF_TAG_SUB_IFD = new TagInfoLongOrIFD(
            "SubIFDs",  0x014a, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN, true);
    /**
     * ClipPath.
     *
     * <p>A TIFF ClipPath is intended to mirror the essentials of PostScript's path creation
     * functionality, so that the operators listed below can be easily translated into
     * PostScript, and, conversely, any PostScript path can be represented as a TIFF
     * ClipPath.</p>
     */
    public static final TagInfoBytes TIFF_TAG_CLIP_PATH = new TagInfoBytes(
            "ClipPath",  0x0157, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    /**
     * XClipPathUnits.
     *
     * <p>The number of units that span the width of the image, in terms of integer ClipPath
     * coordinates.</p>
     */
    public static final TagInfoLong TIFF_TAG_XCLIP_PATH_UNITS = new TagInfoLong(
            "XClipPathUnits", 0x0158,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    /**
     * YClipPathUnits.
     *
     * <p>The number of units that span the height of the image, in terms of integer ClipPath
     * coordinates.</p>
     */
    public static final TagInfoLong TIFF_TAG_YCLIP_PATH_UNITS = new TagInfoLong(
            "YClipPathUnits", 0x0159,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    /**
     * Indexed.
     *
     * <p>Indexed images are images where the "pixels" do not represent color values, but
     * rather an index (usually 8-bit) into a separate color table, the ColorMap.
     * ColorMap is required for an Indexed image.</p>
     */
    public static final TagInfoShort TIFF_TAG_INDEXED = new TagInfoShort(
            "Indexed", 0x015a,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    /**
     * OPIProxy.
     *
     * <p>OPIProxy gives information concerning whether this image is a low-resolution
     * proxy of a high-resolution image.</p>
     */
    public static final TagInfoShort TIFF_TAG_OPIPROXY = new TagInfoShort(
            "OPIProxy", 0x015f,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    /**
     * ImageID.
     *
     * <p>ImageID is the full pathname of the original, high-resolution image, or any other
     * identifying string that uniquely identifies the original image.</p>
     */
    public static final TagInfoAscii TIFF_TAG_IMAGE_ID = new TagInfoAscii(
            "ImageID", 0x800d, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    /**
     * A list with all the Adobe PageMaker 6 tags.
     */
    public static final List<TagInfo> ALL_ADOBE_PAGEMAKER_6_TAGS =
            Collections.unmodifiableList(Arrays.asList(
                    TIFF_TAG_SUB_IFD,
                    TIFF_TAG_CLIP_PATH,
                    TIFF_TAG_XCLIP_PATH_UNITS,
                    TIFF_TAG_YCLIP_PATH_UNITS,
                    TIFF_TAG_INDEXED,
                    TIFF_TAG_OPIPROXY,
                    TIFF_TAG_IMAGE_ID));

    private AdobePageMaker6TagConstants() {
    }
}
