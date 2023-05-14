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

/**
 * Oce Scanjob.
 * <p>
 * http://www.awaresystems.be/imaging/tiff/tifftags/docs/oce.html
 * </p>
 */
public final class OceScanjobTagConstants {

    public static final TagInfoAscii EXIF_TAG_OCE_SCANJOB_DESCRIPTION = new TagInfoAscii(
            "Oce Scanjob Description", 0xc427, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoAscii EXIF_TAG_OCE_APPLICATION_SELECTOR = new TagInfoAscii(
            "Oce Application Selector", 0xc428, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoAscii EXIF_TAG_OCE_IDENTIFICATION_NUMBER = new TagInfoAscii(
            "Oce Identification Number", 0xc429, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoAscii EXIF_TAG_OCE_IMAGE_LOGIC_CHARACTERISTICS = new TagInfoAscii(
            "Oce ImageLogic Characteristics", 0xc42a, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final List<TagInfo> ALL_OCE_SCANJOB_TAGS =
            Collections.unmodifiableList(Arrays.<TagInfo> asList(
                    EXIF_TAG_OCE_SCANJOB_DESCRIPTION,
                    EXIF_TAG_OCE_APPLICATION_SELECTOR,
                    EXIF_TAG_OCE_IDENTIFICATION_NUMBER,
                    EXIF_TAG_OCE_IMAGE_LOGIC_CHARACTERISTICS));

    private OceScanjobTagConstants() {
    }
}
