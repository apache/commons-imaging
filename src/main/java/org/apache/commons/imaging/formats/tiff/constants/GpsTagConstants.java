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
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort;

/** GPS tag constants for EXIF GPS information. */
public final class GpsTagConstants {

    /** GPS version ID tag. */
    public static final TagInfoBytes GPS_TAG_GPS_VERSION_ID = new TagInfoBytes("GPSVersionID", 0x0000, 4, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    private static final byte[] GPS_VERSION = { (byte) 2, (byte) 3, (byte) 0, (byte) 0 };

    /** GPS latitude reference tag. */
    public static final TagInfoAscii GPS_TAG_GPS_LATITUDE_REF = new TagInfoAscii("GPSLatitudeRef", 0x0001, 2, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** GPS latitude reference value: North. */
    public static final String GPS_TAG_GPS_LATITUDE_REF_VALUE_NORTH = "N";

    /** GPS latitude reference value: South. */
    public static final String GPS_TAG_GPS_LATITUDE_REF_VALUE_SOUTH = "S";

    /** GPS latitude tag. */
    public static final TagInfoRationals GPS_TAG_GPS_LATITUDE = new TagInfoRationals("GPSLatitude", 0x0002, 3, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** GPS longitude reference tag. */
    public static final TagInfoAscii GPS_TAG_GPS_LONGITUDE_REF = new TagInfoAscii("GPSLongitudeRef", 0x0003, 2, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** GPS longitude reference value: East. */
    public static final String GPS_TAG_GPS_LONGITUDE_REF_VALUE_EAST = "E";

    /** GPS longitude reference value: West. */
    public static final String GPS_TAG_GPS_LONGITUDE_REF_VALUE_WEST = "W";

    /** GPS longitude tag. */
    public static final TagInfoRationals GPS_TAG_GPS_LONGITUDE = new TagInfoRationals("GPSLongitude", 0x0004, 3, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** GPS altitude reference tag. */
    public static final TagInfoByte GPS_TAG_GPS_ALTITUDE_REF = new TagInfoByte("GPSAltitudeRef", 0x0005, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** GPS altitude reference value: above sea level. */
    public static final int GPS_TAG_GPS_ALTITUDE_REF_VALUE_ABOVE_SEA_LEVEL = 0;

    /** GPS altitude reference value: below sea level. */
    public static final int GPS_TAG_GPS_ALTITUDE_REF_VALUE_BELOW_SEA_LEVEL = 1;

    /** GPS altitude tag. */
    public static final TagInfoRational GPS_TAG_GPS_ALTITUDE = new TagInfoRational("GPSAltitude", 0x0006, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** GPS time stamp tag. */
    public static final TagInfoRationals GPS_TAG_GPS_TIME_STAMP = new TagInfoRationals("GPSTimeStamp", 0x0007, 3, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** GPS satellites tag. */
    public static final TagInfoAscii GPS_TAG_GPS_SATELLITES = new TagInfoAscii("GPSSatellites", 0x0008, -1, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** GPS status tag. */
    public static final TagInfoAscii GPS_TAG_GPS_STATUS = new TagInfoAscii("GPSStatus", 0x0009, 2, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** GPS status value: measurement in progress. */
    public static final String GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_IN_PROGRESS = "A";

    /** GPS status value: measurement interoperability. */
    public static final String GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_INTEROPERABILITY = "V";

    /** GPS measure mode tag. */
    public static final TagInfoAscii GPS_TAG_GPS_MEASURE_MODE = new TagInfoAscii("GPSMeasureMode", 0x000a, 2, TiffDirectoryType.EXIF_DIRECTORY_GPS);
    /** GPS measure mode value: 2-dimensional measurement. */
    public static final int GPS_TAG_GPS_MEASURE_MODE_VALUE_2_DIMENSIONAL_MEASUREMENT = 2;

    /** GPS measure mode value: 3-dimensional measurement. */
    public static final int GPS_TAG_GPS_MEASURE_MODE_VALUE_3_DIMENSIONAL_MEASUREMENT = 3;

    /** GPS DOP (data degree of precision) tag. */
    public static final TagInfoRational GPS_TAG_GPS_DOP = new TagInfoRational("GPSDOP", 0x000b, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** GPS speed reference tag. */
    public static final TagInfoAscii GPS_TAG_GPS_SPEED_REF = new TagInfoAscii("GPSSpeedRef", 0x000c, 2, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** GPS speed reference value: kilometers per hour. */
    public static final String GPS_TAG_GPS_SPEED_REF_VALUE_KMPH = "K";

    /** GPS speed reference value: miles per hour. */
    public static final String GPS_TAG_GPS_SPEED_REF_VALUE_MPH = "M";
    /** GPS speed reference value: knots. */
    public static final String GPS_TAG_GPS_SPEED_REF_VALUE_KNOTS = "N";

    /** GPS speed tag. */
    public static final TagInfoRational GPS_TAG_GPS_SPEED = new TagInfoRational("GPSSpeed", 0x000d, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** GPS track reference tag. */
    public static final TagInfoAscii GPS_TAG_GPS_TRACK_REF = new TagInfoAscii("GPSTrackRef", 0x000e, 2, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** GPS track reference value: magnetic north. */
    public static final String GPS_TAG_GPS_TRACK_REF_VALUE_MAGNETIC_NORTH = "M";

    /** GPS track reference value: true north. */
    public static final String GPS_TAG_GPS_TRACK_REF_VALUE_TRUE_NORTH = "T";

    /** GPS track tag. */
    public static final TagInfoRational GPS_TAG_GPS_TRACK = new TagInfoRational("GPSTrack", 0x000f, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** GPS image direction reference tag. */
    public static final TagInfoAscii GPS_TAG_GPS_IMG_DIRECTION_REF = new TagInfoAscii("GPSImgDirectionRef", 0x0010, 2, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** GPS image direction reference value: magnetic north. */
    public static final String GPS_TAG_GPS_IMG_DIRECTION_REF_VALUE_MAGNETIC_NORTH = "M";

    /** GPS image direction reference value: true north. */
    public static final String GPS_TAG_GPS_IMG_DIRECTION_REF_VALUE_TRUE_NORTH = "T";

    /** GPS image direction tag. */
    public static final TagInfoRational GPS_TAG_GPS_IMG_DIRECTION = new TagInfoRational("GPSImgDirection", 0x0011, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** GPS map datum tag. */
    public static final TagInfoAscii GPS_TAG_GPS_MAP_DATUM = new TagInfoAscii("GPSMapDatum", 0x0012, -1, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** GPS destination latitude reference tag. */
    public static final TagInfoAscii GPS_TAG_GPS_DEST_LATITUDE_REF = new TagInfoAscii("GPSDestLatitudeRef", 0x0013, 2, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** GPS destination latitude reference value: North. */
    public static final String GPS_TAG_GPS_DEST_LATITUDE_REF_VALUE_NORTH = "N";

    /** GPS destination latitude reference value: South. */
    public static final String GPS_TAG_GPS_DEST_LATITUDE_REF_VALUE_SOUTH = "S";

    /** GPS destination latitude tag. */
    public static final TagInfoRationals GPS_TAG_GPS_DEST_LATITUDE = new TagInfoRationals("GPSDestLatitude", 0x0014, 3, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** GPS destination longitude reference tag. */
    public static final TagInfoAscii GPS_TAG_GPS_DEST_LONGITUDE_REF = new TagInfoAscii("GPSDestLongitudeRef", 0x0015, 2, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** GPS destination longitude reference value: East. */
    public static final String GPS_TAG_GPS_DEST_LONGITUDE_REF_VALUE_EAST = "E";

    /** GPS destination longitude reference value: West. */
    public static final String GPS_TAG_GPS_DEST_LONGITUDE_REF_VALUE_WEST = "W";

    /** GPS destination longitude tag. */
    public static final TagInfoRationals GPS_TAG_GPS_DEST_LONGITUDE = new TagInfoRationals("GPSDestLongitude", 0x0016, 3, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** GPS destination bearing reference tag. */
    public static final TagInfoAscii GPS_TAG_GPS_DEST_BEARING_REF = new TagInfoAscii("GPSDestBearingRef", 0x0017, 2, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** GPS destination bearing reference value: magnetic north. */
    public static final String GPS_TAG_GPS_DEST_BEARING_REF_VALUE_MAGNETIC_NORTH = "M";

    /** GPS destination bearing reference value: true north. */
    public static final String GPS_TAG_GPS_DEST_BEARING_REF_VALUE_TRUE_NORTH = "T";

    /** GPS destination bearing tag. */
    public static final TagInfoRational GPS_TAG_GPS_DEST_BEARING = new TagInfoRational("GPSDestBearing", 0x0018, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** GPS destination distance reference tag. */
    public static final TagInfoAscii GPS_TAG_GPS_DEST_DISTANCE_REF = new TagInfoAscii("GPSDestDistanceRef", 0x0019, 2, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** GPS destination distance reference value: kilometers. */
    public static final String GPS_TAG_GPS_DEST_DISTANCE_REF_VALUE_KILOMETERS = "K";

    /** GPS destination distance reference value: miles. */
    public static final String GPS_TAG_GPS_DEST_DISTANCE_REF_VALUE_MILES = "M";
    /** GPS destination distance reference value: nautical miles. */
    public static final String GPS_TAG_GPS_DEST_DISTANCE_REF_VALUE_NAUTICAL_MILES = "N";

    /** GPS destination distance tag. */
    public static final TagInfoRational GPS_TAG_GPS_DEST_DISTANCE = new TagInfoRational("GPSDestDistance", 0x001a, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** GPS processing method tag. */
    public static final TagInfoGpsText GPS_TAG_GPS_PROCESSING_METHOD = new TagInfoGpsText("GPSProcessingMethod", 0x001b, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** GPS area information tag. */
    public static final TagInfoGpsText GPS_TAG_GPS_AREA_INFORMATION = new TagInfoGpsText("GPSAreaInformation", 0x001c, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** GPS date stamp tag. */
    public static final TagInfoAscii GPS_TAG_GPS_DATE_STAMP = new TagInfoAscii("GPSDateStamp", 0x001d, 11, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** GPS differential tag. */
    public static final TagInfoShort GPS_TAG_GPS_DIFFERENTIAL = new TagInfoShort("GPSDifferential", 0x001e, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** GPS differential value: no correction. */
    public static final int GPS_TAG_GPS_DIFFERENTIAL_VALUE_NO_CORRECTION = 0;

    /** GPS differential value: differential corrected. */
    public static final int GPS_TAG_GPS_DIFFERENTIAL_VALUE_DIFFERENTIAL_CORRECTED = 1;

    /**
     * Horizontal positioning errors in meters.
     *
     * @since 1.0.0-alpha6
     */
    public static final TagInfoRational GPS_TAG_GPS_HOR_POSITIONING_ERROR = new TagInfoRational("GPSHPositioningError", 0x001f,
            TiffDirectoryType.EXIF_DIRECTORY_GPS);

    /** List of all GPS tags. */
    public static final List<TagInfo> ALL_GPS_TAGS = Collections.unmodifiableList(Arrays.asList(GPS_TAG_GPS_VERSION_ID, GPS_TAG_GPS_LATITUDE_REF,
            GPS_TAG_GPS_LATITUDE, GPS_TAG_GPS_LONGITUDE_REF, GPS_TAG_GPS_LONGITUDE, GPS_TAG_GPS_ALTITUDE_REF, GPS_TAG_GPS_ALTITUDE, GPS_TAG_GPS_TIME_STAMP,
            GPS_TAG_GPS_SATELLITES, GPS_TAG_GPS_STATUS, GPS_TAG_GPS_MEASURE_MODE, GPS_TAG_GPS_DOP, GPS_TAG_GPS_SPEED_REF, GPS_TAG_GPS_SPEED,
            GPS_TAG_GPS_TRACK_REF, GPS_TAG_GPS_TRACK, GPS_TAG_GPS_IMG_DIRECTION_REF, GPS_TAG_GPS_IMG_DIRECTION, GPS_TAG_GPS_MAP_DATUM,
            GPS_TAG_GPS_DEST_LATITUDE_REF, GPS_TAG_GPS_DEST_LATITUDE, GPS_TAG_GPS_DEST_LONGITUDE_REF, GPS_TAG_GPS_DEST_LONGITUDE, GPS_TAG_GPS_DEST_BEARING_REF,
            GPS_TAG_GPS_DEST_BEARING, GPS_TAG_GPS_DEST_DISTANCE_REF, GPS_TAG_GPS_DEST_DISTANCE, GPS_TAG_GPS_PROCESSING_METHOD, GPS_TAG_GPS_AREA_INFORMATION,
            GPS_TAG_GPS_DATE_STAMP, GPS_TAG_GPS_DIFFERENTIAL, GPS_TAG_GPS_HOR_POSITIONING_ERROR));

    /**
     * Gets the GPS version.
     *
     * @return a copy of the GPS version byte array.
     */
    public static byte[] gpsVersion() {
        return GPS_VERSION.clone();
    }

    private GpsTagConstants() {
    }
}
