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
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts;

/**
 * Geo Tiff.
 * <BR>
 * <a href="http://www.remotesensing.org/geotiff/spec/contents.html">...</a>
 */
public final class GeoTiffTagConstants {

    public static final TagInfoDoubles EXIF_TAG_MODEL_PIXEL_SCALE_TAG = new TagInfoDoubles(
            "ModelPixelScaleTag", 0x830e, 3,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoDoubles EXIF_TAG_INTERGRAPH_MATRIX_TAG = new TagInfoDoubles(
            "IntergraphMatrixTag", 0x8480, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoDoubles EXIF_TAG_MODEL_TIEPOINT_TAG = new TagInfoDoubles(
            "ModelTiepointTag", 0x8482, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoDoubles EXIF_TAG_MODEL_TRANSFORMATION_TAG = new TagInfoDoubles(
            "ModelTransformationTag", 0x85d8, 16,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoShorts EXIF_TAG_GEO_KEY_DIRECTORY_TAG = new TagInfoShorts(
            "GeoKeyDirectoryTag", 0x87af, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoDoubles EXIF_TAG_GEO_DOUBLE_PARAMS_TAG = new TagInfoDoubles(
            "GeoDoubleParamsTag", 0x87b0, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoAscii EXIF_TAG_GEO_ASCII_PARAMS_TAG = new TagInfoAscii(
            "GeoAsciiParamsTag", 0x87b1, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final List<TagInfo> ALL_GEO_TIFF_TAGS =
            Collections.unmodifiableList(Arrays.asList(
                    EXIF_TAG_MODEL_PIXEL_SCALE_TAG,
                    EXIF_TAG_INTERGRAPH_MATRIX_TAG,
                    EXIF_TAG_MODEL_TIEPOINT_TAG,
                    EXIF_TAG_MODEL_TRANSFORMATION_TAG,
                    EXIF_TAG_GEO_KEY_DIRECTORY_TAG,
                    EXIF_TAG_GEO_DOUBLE_PARAMS_TAG,
                    EXIF_TAG_GEO_ASCII_PARAMS_TAG));

    private GeoTiffTagConstants() {
    }

}
