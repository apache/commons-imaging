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
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong;

/**
 * Design rule for Camera Filesystem
 * <BR>
 * http://www.exif.org/dcf.PDF
 */
public interface DcfTagConstants {
    public static final TagInfoAscii EXIF_TAG_RELATED_IMAGE_FILE_FORMAT = new TagInfoAscii(
            "RelatedImageFileFormat", 0x1000, -1,
            TiffDirectoryType.EXIF_DIRECTORY_INTEROP_IFD);
    
    public static final TagInfoShortOrLong EXIF_TAG_RELATED_IMAGE_WIDTH = new TagInfoShortOrLong(
            "RelatedImageWidth", 0x1001, 1,
            TiffDirectoryType.EXIF_DIRECTORY_INTEROP_IFD);
    
    public static final TagInfoShortOrLong EXIF_TAG_RELATED_IMAGE_LENGTH = new TagInfoShortOrLong(
            "RelatedImageLength", 0x1002, 1,
            TiffDirectoryType.EXIF_DIRECTORY_INTEROP_IFD);
    
    public static final TagInfoShort EXIF_TAG_COLOR_SPACE = new TagInfoShort(
            "ColorSpace", 0xa001, 1, TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD);
    public static final int COLOR_SPACE_VALUE_SRGB = 1;
    public static final int COLOR_SPACE_VALUE_ADOBE_RGB = 2;
    public static final int COLOR_SPACE_VALUE_UNCALIBRATED = 65535;

    public static final List<TagInfo> ALL_DCF_TAGS =
            Collections.unmodifiableList(Arrays.asList(
                    EXIF_TAG_RELATED_IMAGE_FILE_FORMAT,
                    EXIF_TAG_RELATED_IMAGE_WIDTH,
                    EXIF_TAG_RELATED_IMAGE_LENGTH,
                    EXIF_TAG_COLOR_SPACE));
}
