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
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes;

/**
 * Wang/Eastman Software/Kodac/eiStream/Imaging for Windows tags, undocumented and in need of more work.
 */
public final class WangTagConstants {

    public static final TagInfoBytes EXIF_TAG_WANG_ANNOTATION = new TagInfoBytes("WangAnnotation", 0x80a4, -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final List<TagInfo> ALL_WANG_TAGS = Collections.unmodifiableList(Arrays.<TagInfo>asList(EXIF_TAG_WANG_ANNOTATION));

    private WangTagConstants() {
    }
}
