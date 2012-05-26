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
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong;

public interface HylaFaxTagConstants extends TiffFieldTypeConstants {
    public static final TagInfoLong EXIF_TAG_FAX_RECV_PARAMS = new TagInfoLong(
            "Fax Recv Params", 0x885c, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoAscii EXIF_TAG_FAX_SUB_ADDRESS = new TagInfoAscii(
            "Fax Sub Address", 0x885d, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoLong EXIF_TAG_FAX_RECV_TIME = new TagInfoLong(
            "Fax Recv Time", 0x885e, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoAscii EXIF_TAG_FAX_DCS = new TagInfoAscii(
            "Fax DCS", 0x885f, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final List<TagInfo> ALL_HYLAFAX_TAGS =
            Collections.unmodifiableList(Arrays.asList(
                EXIF_TAG_FAX_RECV_PARAMS,
                EXIF_TAG_FAX_SUB_ADDRESS,
                EXIF_TAG_FAX_RECV_TIME,
                EXIF_TAG_FAX_DCS));
}
