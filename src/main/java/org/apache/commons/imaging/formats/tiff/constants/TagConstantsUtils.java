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

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.imaging.common.BinaryConstant;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;

public final class TagConstantsUtils {
    private static final TiffDirectoryType[] TIFF_DIRECTORY_TYPES = TiffDirectoryType
            .values();

    public static List<TagInfo> mergeTagLists(final List<?>... tagLists) {
        int count = 0;
        for (final List<?> tagList : tagLists) {
            count += tagList.size();
        }

        final ArrayList<TagInfo> result = new ArrayList<TagInfo>(count);

        for (final List<?> tagList : tagLists) {
            for (Object tag : tagList) {
                result.add((TagInfo) tag);
            }
        }

        return result;
    }

    public static TiffDirectoryType getExifDirectoryType(final int type) {

        for (final TiffDirectoryType tiffDirectoryType : TIFF_DIRECTORY_TYPES) {
            if (tiffDirectoryType.directoryType == type) {
                return tiffDirectoryType;
            }
        }
        return TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN;
    }

    public static BinaryConstant createMicrosoftHdPhotoGuidEndingWith(final byte end) {
        return new BinaryConstant(new byte[] { (byte) 0x24, (byte) 0xC3,
                (byte) 0xDD, (byte) 0x6F, (byte) 0x03, (byte) 0x4E,
                (byte) 0xFE, (byte) 0x4B, (byte) 0xB1, (byte) 0x85,
                (byte) 0x3D, (byte) 0x77, (byte) 0x76, (byte) 0x8D,
                (byte) 0xC9, end });
    }

    private TagConstantsUtils() {
    }
}
