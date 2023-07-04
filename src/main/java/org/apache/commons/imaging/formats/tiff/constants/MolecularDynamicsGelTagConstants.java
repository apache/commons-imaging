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
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts;

/**
 * Molecular Dynamics GEL file format.
 * <p>
 * https://www.awaresystems.be/imaging/tiff/tifftags/docs/gel.html
 * </p>
 */
public final class MolecularDynamicsGelTagConstants {

    public static final TagInfoLong EXIF_TAG_MD_FILE_TAG = new TagInfoLong(
            "MD FileTag", 0x82a5,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoRational EXIF_TAG_MD_SCALE_PIXEL = new TagInfoRational(
            "MD ScalePixel", 0x82a6,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoShorts EXIF_TAG_MD_COLOR_TABLE = new TagInfoShorts(
            "MD ColorTable", 0x82a7, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoAscii EXIF_TAG_MD_LAB_NAME = new TagInfoAscii(
            "MD LabName", 0x82a8, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoAscii EXIF_TAG_MD_SAMPLE_INFO = new TagInfoAscii(
            "MD SampleInfo", 0x82a9, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoAscii EXIF_TAG_MD_PREP_DATE = new TagInfoAscii(
            "MD PrepDate", 0x82aa, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoAscii EXIF_TAG_MD_PREP_TIME = new TagInfoAscii(
            "MD PrepTime", 0x82ab, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoAscii EXIF_TAG_MD_FILE_UNITS = new TagInfoAscii(
            "MD FileUnits", 0x82ac, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final List<TagInfo> ALL_MOLECULAR_DYNAMICS_GEL_TAGS =
            Collections.unmodifiableList(Arrays.asList(
                    EXIF_TAG_MD_FILE_TAG,
                    EXIF_TAG_MD_SCALE_PIXEL,
                    EXIF_TAG_MD_COLOR_TABLE,
                    EXIF_TAG_MD_LAB_NAME,
                    EXIF_TAG_MD_SAMPLE_INFO,
                    EXIF_TAG_MD_PREP_DATE,
                    EXIF_TAG_MD_PREP_TIME,
                    EXIF_TAG_MD_FILE_UNITS));

    private MolecularDynamicsGelTagConstants() {
    }
}
