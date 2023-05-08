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
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds;

/**
 * TIFF specification supplement 2.
 *
 * See <a href="https://web.archive.org/web/20180810205806/https://www.adobe.io/content/udp/en/open/standards/TIFF/_jcr_content/contentbody/download_1370394226/file.res/TIFFphotoshop.pdf">Adobe Photoshop (R) TIFF Technical Notes</a>
 */
public final class AdobePhotoshopTagConstants {

    /**
     * JPEGTables.
     *
     * <p>JPEGTables provides default JPEG quantization and/or Huffman tables which are used whenever
     * a segment data stream does not contain its own tables, as specified below.</p>
     */
    public static final TagInfoUndefineds EXIF_TAG_JPEGTABLES = new TagInfoUndefineds(
            "JPEGTables", 0x015b, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    /**
     * ImageSourceData.
     *
     * <p>Image source data bytes.</p>
     */
    public static final TagInfoUndefineds EXIF_TAG_IMAGE_SOURCE_DATA = new TagInfoUndefineds(
            "ImageSourceData", 0x935c, -1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    /**
     * A list with all the Adobe Photoshop tags.
     */
    public static final List<TagInfo> ALL_ADOBE_PHOTOSHOP_TAGS =
            Collections.unmodifiableList(Arrays.<TagInfo> asList(
                    EXIF_TAG_JPEGTABLES,
                    EXIF_TAG_IMAGE_SOURCE_DATA
            ));

    private AdobePhotoshopTagConstants() {
    }
}
