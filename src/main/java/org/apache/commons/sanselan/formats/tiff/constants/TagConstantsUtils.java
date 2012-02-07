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

import java.util.ArrayList;
import java.util.List;

public class TagConstantsUtils implements TiffDirectoryConstants
{
    private static final TiffDirectoryType[] tiffDirectoryTypes = TiffDirectoryType.values();

    public static List<TagInfo> mergeTagLists(TagHolder[]... tagHolders)
    {
        int count = 0;
        for (int i = 0; i < tagHolders.length; i++) {
            count += tagHolders[i].length;
        }

        ArrayList<TagInfo> result = new ArrayList<TagInfo>(count);

        for (int i = 0; i < tagHolders.length; i++) {
            for (int j = 0; j < tagHolders[i].length; j++) {
                result.add(tagHolders[i][j].getTagInfo());
            }
        }

        return result;
    }

    public static TiffDirectoryType getExifDirectoryType(int type)
    {
        
        for (int i = 0; i < tiffDirectoryTypes.length; i++)
            if (tiffDirectoryTypes[i].directoryType == type)
                return tiffDirectoryTypes[i];
        return TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN;
    }

}