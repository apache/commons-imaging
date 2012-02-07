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

public enum GpsTagConstants
        implements
            TiffDirectoryConstants,
            TiffFieldTypeConstants,
            TagHolder
{
    GPS_VERSION_ID(new TagInfo(
            "GPS Version ID", 0x0000, FIELD_TYPE_DESCRIPTION_BYTE, 4,
            TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_LATITUDE_REF(new TagInfo(
            "GPS Latitude Ref", 0x0001, FIELD_TYPE_DESCRIPTION_ASCII, 2,
            TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_LATITUDE(new TagInfo(
            "GPS Latitude", 0x0002, FIELD_TYPE_DESCRIPTION_RATIONAL, 3,
            TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_LONGITUDE_REF(new TagInfo(
            "GPS Longitude Ref", 0x0003, FIELD_TYPE_DESCRIPTION_ASCII, 2,
            TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_LONGITUDE(new TagInfo(
            "GPS Longitude", 0x0004, FIELD_TYPE_DESCRIPTION_RATIONAL, 3,
            TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_ALTITUDE_REF(new TagInfo(
            "GPS Altitude Ref", 0x0005, FIELD_TYPE_DESCRIPTION_BYTE, 1,
            TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_ALTITUDE(new TagInfo(
            "GPS Altitude", 0x0006, FIELD_TYPE_DESCRIPTION_RATIONAL, 1,
            TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_TIME_STAMP(new TagInfo(
            "GPS Time Stamp", 0x0007, FIELD_TYPE_DESCRIPTION_RATIONAL, 3,
            TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_SATELLITES(new TagInfo(
            "GPS Satellites", 0x0008, FIELD_TYPE_DESCRIPTION_ASCII, -1,
            TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_STATUS(new TagInfo("GPS Status",
            0x0009, FIELD_TYPE_DESCRIPTION_ASCII, 2, TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_MEASURE_MODE(new TagInfo(
            "GPS Measure Mode", 0x000a, FIELD_TYPE_DESCRIPTION_ASCII, 2,
            TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_DOP(new TagInfo("GPS DOP",
            0x000b, FIELD_TYPE_DESCRIPTION_RATIONAL, 1, TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_SPEED_REF(new TagInfo(
            "GPS Speed Ref", 0x000c, FIELD_TYPE_DESCRIPTION_ASCII, 2,
            TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_SPEED(new TagInfo("GPS Speed",
            0x000d, FIELD_TYPE_DESCRIPTION_RATIONAL, 1, TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_TRACK_REF(new TagInfo(
            "GPS Track Ref", 0x000e, FIELD_TYPE_DESCRIPTION_ASCII, 2,
            TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_TRACK(new TagInfo("GPS Track",
            0x000f, FIELD_TYPE_DESCRIPTION_RATIONAL, 1, TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_IMG_DIRECTION_REF(new TagInfo(
            "GPS Img Direction Ref", 0x0010, FIELD_TYPE_DESCRIPTION_ASCII, 2,
            TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_IMG_DIRECTION(new TagInfo(
            "GPS Img Direction", 0x0011, FIELD_TYPE_DESCRIPTION_RATIONAL, 1,
            TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_MAP_DATUM(new TagInfo(
            "GPS Map Datum", 0x0012, FIELD_TYPE_DESCRIPTION_ASCII, -1,
            TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_DEST_LATITUDE_REF(new TagInfo(
            "GPS Dest Latitude Ref", 0x0013, FIELD_TYPE_DESCRIPTION_ASCII, 2,
            TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_DEST_LATITUDE(new TagInfo(
            "GPS Dest Latitude", 0x0014, FIELD_TYPE_DESCRIPTION_RATIONAL, 3,
            TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_DEST_LONGITUDE_REF(new TagInfo(
            "GPS Dest Longitude Ref", 0x0015, FIELD_TYPE_DESCRIPTION_ASCII, 2,
            TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_DEST_LONGITUDE(new TagInfo(
            "GPS Dest Longitude", 0x0016, FIELD_TYPE_DESCRIPTION_RATIONAL, 3,
            TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_DEST_BEARING_REF(new TagInfo(
            "GPS Dest Bearing Ref", 0x0017, FIELD_TYPE_DESCRIPTION_ASCII, 2,
            TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_DEST_BEARING(new TagInfo(
            "GPS Dest Bearing", 0x0018, FIELD_TYPE_DESCRIPTION_RATIONAL, 1,
            TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_DEST_DISTANCE_REF(new TagInfo(
            "GPS Dest Distance Ref", 0x0019, FIELD_TYPE_DESCRIPTION_ASCII, 2,
            TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_DEST_DISTANCE(new TagInfo(
            "GPS Dest Distance", 0x001a, FIELD_TYPE_DESCRIPTION_RATIONAL, 1,
            TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_PROCESSING_METHOD(new TagInfo.Text(
            "GPS Processing Method", 0x001b, FIELD_TYPE_DESCRIPTION_UNKNOWN,
            -1, TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_AREA_INFORMATION(new TagInfo.Text(
            "GPS Area Information", 0x001c, FIELD_TYPE_DESCRIPTION_UNKNOWN, -1,
            TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_DATE_STAMP(new TagInfo(
            "GPS Date Stamp", 0x001d, FIELD_TYPE_DESCRIPTION_ASCII, 11,
            TiffDirectoryType.EXIF_DIRECTORY_GPS)),

    // ************************************************************
    GPS_DIFFERENTIAL(new TagInfo(
            "GPS Differential", 0x001e, FIELD_TYPE_DESCRIPTION_SHORT, 1,
            TiffDirectoryType.EXIF_DIRECTORY_GPS));
    
    public final TagInfo tagInfo;
    
    GpsTagConstants(TagInfo tagInfo) {
        this.tagInfo = tagInfo;
    }

    public static final int GPS_DIFFERENTIAL_VALUE_NO_CORRECTION = 0;
    public static final int GPS_DIFFERENTIAL_VALUE_DIFFERENTIAL_CORRECTED = 1;
    public static final String GPS_LONGITUDE_REF_VALUE_EAST = "E";
    public static final String GPS_LONGITUDE_REF_VALUE_WEST = "W";
    public static final String GPS_LATITUDE_REF_VALUE_NORTH = "N";
    public static final String GPS_LATITUDE_REF_VALUE_SOUTH = "S";
    public static final int GPS_ALTITUDE_REF_VALUE_ABOVE_SEA_LEVEL = 0;
    public static final int GPS_ALTITUDE_REF_VALUE_BELOW_SEA_LEVEL = 1;
    public static final String GPS_STATUS_VALUE_MEASUREMENT_IN_PROGRESS = "A";
    public static final String GPS_STATUS_VALUE_MEASUREMENT_INTEROPERABILITY = "V";
    public static final int GPS_MEASURE_MODE_VALUE_2_DIMENSIONAL_MEASUREMENT = 2;
    public static final int GPS_MEASURE_MODE_VALUE_3_DIMENSIONAL_MEASUREMENT = 3;
    public static final String GPS_SPEED_REF_VALUE_KMPH = "K";
    public static final String GPS_SPEED_REF_VALUE_MPH = "M";
    public static final String GPS_SPEED_REF_VALUE_KNOTS = "N";
    public static final String GPS_TRACK_REF_VALUE_MAGNETIC_NORTH = "M";
    public static final String GPS_TRACK_REF_VALUE_TRUE_NORTH = "T";
    public static final String GPS_IMG_DIRECTION_REF_VALUE_MAGNETIC_NORTH = "M";
    public static final String GPS_IMG_DIRECTION_REF_VALUE_TRUE_NORTH = "T";
    public static final String GPS_DEST_LATITUDE_REF_VALUE_NORTH = "N";
    public static final String GPS_DEST_LATITUDE_REF_VALUE_SOUTH = "S";
    public static final String GPS_DEST_LONGITUDE_REF_VALUE_EAST = "E";
    public static final String GPS_DEST_LONGITUDE_REF_VALUE_WEST = "W";
    public static final String GPS_DEST_BEARING_REF_VALUE_MAGNETIC_NORTH = "M";
    public static final String GPS_DEST_BEARING_REF_VALUE_TRUE_NORTH = "T";
    public static final String GPS_DEST_DISTANCE_REF_VALUE_KILOMETERS = "K";
    public static final String GPS_DEST_DISTANCE_REF_VALUE_MILES = "M";
    public static final String GPS_DEST_DISTANCE_REF_VALUE_NAUTICAL_MILES = "N";

    // ************************************************************

    public TagInfo getTagInfo() {
        return tagInfo;
    }
    
    public static final List<TagInfo> ALL_GPS_TAGS = Collections.unmodifiableList(
            TagConstantsUtils.mergeTagLists(values()));
}
