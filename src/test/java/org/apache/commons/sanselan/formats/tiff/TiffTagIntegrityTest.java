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
package org.apache.commons.sanselan.formats.tiff;

import java.lang.reflect.Field;
import java.util.List;

import org.apache.commons.sanselan.SanselanTest;
import org.apache.commons.sanselan.formats.tiff.constants.AdobePageMaker6TagConstants;
import org.apache.commons.sanselan.formats.tiff.constants.ExifTagConstants;
import org.apache.commons.sanselan.formats.tiff.constants.GpsTagConstants;
import org.apache.commons.sanselan.formats.tiff.constants.Rfc2301TagConstants;
import org.apache.commons.sanselan.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfo;

public class TiffTagIntegrityTest extends SanselanTest {
    public void testTagIntegrity() {
        verifyFields(TiffTagConstants.class, TiffTagConstants.ALL_TIFF_TAGS);
        verifyFields(GpsTagConstants.class, GpsTagConstants.ALL_GPS_TAGS);
        verifyFields(ExifTagConstants.class, ExifTagConstants.ALL_EXIF_TAGS);
        verifyFields(Rfc2301TagConstants.class, Rfc2301TagConstants.ALL_RFC_2301_TAGS);
        verifyFields(AdobePageMaker6TagConstants.class, AdobePageMaker6TagConstants.ALL_ADOBE_PAGEMAKER_6_TAG_CONSTANTS);
    }
    
    private void verifyFields(Class<?> cls, List<TagInfo> tags) {
        Field[] fields = cls.getFields();
        int tagCount = 0;
        int foundCount = 0;
        for (Field field : fields) {
            field.setAccessible(true);
            if (!(field.getType().isInstance(TagInfo.class))) {
                continue;
            }
            ++tagCount;
            TagInfo src = null;
            try {
                src = (TagInfo) field.get(null);
            } catch (IllegalAccessException illegalAccess) {
            }
            if (src == null) {
                continue;
            }
            for (int i = 0; i < tags.size(); i++) {
                TagInfo tagInfo = tags.get(i);
                if (tagInfo.tag == src.tag) {
                    ++foundCount;
                    break;
                }
            }
        }
        assertEquals(tagCount, foundCount);
    }
}
