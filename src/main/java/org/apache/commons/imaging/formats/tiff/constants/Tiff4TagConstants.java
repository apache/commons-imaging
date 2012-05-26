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
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort;

/**
 * Tags in TIFF4 but NOT in TIFF6.
 * <BR>
 * http://cool.conservation-us.org/bytopic/imaging/std/tiff4.html
 */
public interface Tiff4TagConstants {
    public static final TagInfoShort TIFF_TAG_COLOR_RESPONSE_UNIT = new TagInfoShort(
            "Color Response Unit", 0x12C, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);
    public static final int COLOR_RESPONSE_UNIT_VALUE_0_1 = 1;
    public static final int COLOR_RESPONSE_UNIT_VALUE_0_01 = 2;
    public static final int COLOR_RESPONSE_UNIT_VALUE_0_001 = 3;
    public static final int COLOR_RESPONSE_UNIT_VALUE_0_0001 = 4;
    public static final int COLOR_RESPONSE_UNIT_VALUE_0_00001 = 5;
    
    public static final List<TagInfo> ALL_TIFF_4_TAGS =
            Collections.unmodifiableList(Arrays.asList(
                    new TagInfo[] {TIFF_TAG_COLOR_RESPONSE_UNIT}));
}
