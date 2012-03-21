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
package org.apache.commons.sanselan.formats.tiff.constants;

import java.util.Collections;
import java.util.List;

import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfo;

public interface AllTagConstants extends
        AdobePhotoshopTagConstants,
        AdobePageMaker6TagConstants,
        DcfTagConstants,
        ExifTagConstants,
        GpsTagConstants,
        HylaFaxTagConstants,
        MicrosoftTagConstants,
        Rfc2301TagConstants,
        Tiff4TagConstants,
        TiffEpTagConstants,
        TiffTagConstants,
        WangTagConstants
{
    public static final List<TagInfo> ALL_TAGS = Collections.unmodifiableList(
            TagConstantsUtils.mergeTagLists(
                    AdobePageMaker6TagConstants.ALL_ADOBE_PAGEMAKER_6_TAGS,
                    AdobePhotoshopTagConstants.ALL_ADOBE_PHOTOSHOP_TAGS,
                    DcfTagConstants.ALL_DCF_TAGS,
                    ExifTagConstants.ALL_EXIF_TAGS,
                    GpsTagConstants.ALL_GPS_TAGS,
                    HylaFaxTagConstants.ALL_HYLAFAX_TAGS,
                    MicrosoftTagConstants.ALL_MICROSOFT_TAGS,
                    Rfc2301TagConstants.ALL_RFC_2301_TAGS,
                    Tiff4TagConstants.ALL_TIFF_4_TAGS,
                    TiffEpTagConstants.ALL_TIFF_EP_TAGS,
                    TiffTagConstants.ALL_TIFF_TAGS,
                    WangTagConstants.ALL_WANG_TAGS));
}
