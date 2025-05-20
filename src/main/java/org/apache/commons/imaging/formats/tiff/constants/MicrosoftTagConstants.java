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
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString;

/**
 * Largely undocumented and derived by experimentation.
 */
public final class MicrosoftTagConstants {

    public static final TagInfoShort EXIF_TAG_RATING = new TagInfoShort("Rating", 0x4746, TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoShort EXIF_TAG_RATING_PERCENT = new TagInfoShort("RatingPercent", 0x4749, TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoXpString EXIF_TAG_XPTITLE = new TagInfoXpString("XPTitle", 0x9c9b, TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoXpString EXIF_TAG_XPCOMMENT = new TagInfoXpString("XPComment", 0x9c9c, TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoXpString EXIF_TAG_XPAUTHOR = new TagInfoXpString("XPAuthor", 0x9c9d, TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoXpString EXIF_TAG_XPKEYWORDS = new TagInfoXpString("XPKeywords", 0x9c9e, TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoXpString EXIF_TAG_XPSUBJECT = new TagInfoXpString("XPSubject", 0x9c9f, TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final List<TagInfo> ALL_MICROSOFT_TAGS = Collections.unmodifiableList(Arrays.asList(EXIF_TAG_RATING, EXIF_TAG_RATING_PERCENT,
            EXIF_TAG_XPTITLE, EXIF_TAG_XPCOMMENT, EXIF_TAG_XPAUTHOR, EXIF_TAG_XPKEYWORDS, EXIF_TAG_XPSUBJECT));

    private MicrosoftTagConstants() {
    }
}
