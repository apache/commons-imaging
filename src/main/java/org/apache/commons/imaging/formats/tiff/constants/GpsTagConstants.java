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
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort;

public final class GpsTagConstants {

    public static final TagInfoBytes GPS_TAG_GPS_VERSION_ID = new TagInfoBytes("GPSVersionID", 0x0000, 4, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    private static final byte[] GPS_VERSION = { (byte) 2, (byte) 3, (byte) 0, (byte) 0 };

    public static final TagInfoAscii GPS_TAG_GPS_LATITUDE_REF = new TagInfoAscii("GPSLatitudeRef", 0x0001, 2, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final String GPS_TAG_GPS_LATITUDE_REF_VALUE_NORTH = "N";

    public static final String GPS_TAG_GPS_LATITUDE_REF_VALUE_SOUTH = "S";

    public static final TagInfoRationals GPS_TAG_GPS_LATITUDE = new TagInfoRationals("GPSLatitude", 0x0002, 3, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final TagInfoAscii GPS_TAG_GPS_LONGITUDE_REF = new TagInfoAscii("GPSLongitudeRef", 0x0003, 2, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final String GPS_TAG_GPS_LONGITUDE_REF_VALUE_EAST = "E";

    public static final String GPS_TAG_GPS_LONGITUDE_REF_VALUE_WEST = "W";

    public static final TagInfoRationals GPS_TAG_GPS_LONGITUDE = new TagInfoRationals("GPSLongitude", 0x0004, 3, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final TagInfoByte GPS_TAG_GPS_ALTITUDE_REF = new TagInfoByte("GPSAltitudeRef", 0x0005, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final int GPS_TAG_GPS_ALTITUDE_REF_VALUE_ABOVE_SEA_LEVEL = 0;

    public static final int GPS_TAG_GPS_ALTITUDE_REF_VALUE_BELOW_SEA_LEVEL = 1;

    public static final TagInfoRational GPS_TAG_GPS_ALTITUDE = new TagInfoRational("GPSAltitude", 0x0006, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final TagInfoRationals GPS_TAG_GPS_TIME_STAMP = new TagInfoRationals("GPSTimeStamp", 0x0007, 3, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final TagInfoAscii GPS_TAG_GPS_SATELLITES = new TagInfoAscii("GPSSatellites", 0x0008, -1, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final TagInfoAscii GPS_TAG_GPS_STATUS = new TagInfoAscii("GPSStatus", 0x0009, 2, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final String GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_IN_PROGRESS = "A";

    public static final String GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_INTEROPERABILITY = "V";

    public static final TagInfoAscii GPS_TAG_GPS_MEASURE_MODE = new TagInfoAscii("GPSMeasureMode", 0x000a, 2, TiffDirectoryType.EXIF_DIRECTORY_GPS);
    public static final int GPS_TAG_GPS_MEASURE_MODE_VALUE_2_DIMENSIONAL_MEASUREMENT = 2;

    public static final int GPS_TAG_GPS_MEASURE_MODE_VALUE_3_DIMENSIONAL_MEASUREMENT = 3;

    public static final TagInfoRational GPS_TAG_GPS_DOP = new TagInfoRational("GPSDOP", 0x000b, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final TagInfoAscii GPS_TAG_GPS_SPEED_REF = new TagInfoAscii("GPSSpeedRef", 0x000c, 2, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final String GPS_TAG_GPS_SPEED_REF_VALUE_KMPH = "K";

    public static final String GPS_TAG_GPS_SPEED_REF_VALUE_MPH = "M";
    public static final String GPS_TAG_GPS_SPEED_REF_VALUE_KNOTS = "N";

    public static final TagInfoRational GPS_TAG_GPS_SPEED = new TagInfoRational("GPSSpeed", 0x000d, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final TagInfoAscii GPS_TAG_GPS_TRACK_REF = new TagInfoAscii("GPSTrackRef", 0x000e, 2, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final String GPS_TAG_GPS_TRACK_REF_VALUE_MAGNETIC_NORTH = "M";

    public static final String GPS_TAG_GPS_TRACK_REF_VALUE_TRUE_NORTH = "T";

    public static final TagInfoRational GPS_TAG_GPS_TRACK = new TagInfoRational("GPSTrack", 0x000f, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final TagInfoAscii GPS_TAG_GPS_IMG_DIRECTION_REF = new TagInfoAscii("GPSImgDirectionRef", 0x0010, 2, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final String GPS_TAG_GPS_IMG_DIRECTION_REF_VALUE_MAGNETIC_NORTH = "M";

    public static final String GPS_TAG_GPS_IMG_DIRECTION_REF_VALUE_TRUE_NORTH = "T";

    public static final TagInfoRational GPS_TAG_GPS_IMG_DIRECTION = new TagInfoRational("GPSImgDirection", 0x0011, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final TagInfoAscii GPS_TAG_GPS_MAP_DATUM = new TagInfoAscii("GPSMapDatum", 0x0012, -1, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final TagInfoAscii GPS_TAG_GPS_DEST_LATITUDE_REF = new TagInfoAscii("GPSDestLatitudeRef", 0x0013, 2, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final String GPS_TAG_GPS_DEST_LATITUDE_REF_VALUE_NORTH = "N";

    public static final String GPS_TAG_GPS_DEST_LATITUDE_REF_VALUE_SOUTH = "S";

    public static final TagInfoRationals GPS_TAG_GPS_DEST_LATITUDE = new TagInfoRationals("GPSDestLatitude", 0x0014, 3, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final TagInfoAscii GPS_TAG_GPS_DEST_LONGITUDE_REF = new TagInfoAscii("GPSDestLongitudeRef", 0x0015, 2, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final String GPS_TAG_GPS_DEST_LONGITUDE_REF_VALUE_EAST = "E";

    public static final String GPS_TAG_GPS_DEST_LONGITUDE_REF_VALUE_WEST = "W";

    public static final TagInfoRationals GPS_TAG_GPS_DEST_LONGITUDE = new TagInfoRationals("GPSDestLongitude", 0x0016, 3, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final TagInfoAscii GPS_TAG_GPS_DEST_BEARING_REF = new TagInfoAscii("GPSDestBearingRef", 0x0017, 2, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final String GPS_TAG_GPS_DEST_BEARING_REF_VALUE_MAGNETIC_NORTH = "M";

    public static final String GPS_TAG_GPS_DEST_BEARING_REF_VALUE_TRUE_NORTH = "T";

    public static final TagInfoRational GPS_TAG_GPS_DEST_BEARING = new TagInfoRational("GPSDestBearing", 0x0018, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final TagInfoAscii GPS_TAG_GPS_DEST_DISTANCE_REF = new TagInfoAscii("GPSDestDistanceRef", 0x0019, 2, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final String GPS_TAG_GPS_DEST_DISTANCE_REF_VALUE_KILOMETERS = "K";

    public static final String GPS_TAG_GPS_DEST_DISTANCE_REF_VALUE_MILES = "M";
    public static final String GPS_TAG_GPS_DEST_DISTANCE_REF_VALUE_NAUTICAL_MILES = "N";

    public static final TagInfoRational GPS_TAG_GPS_DEST_DISTANCE = new TagInfoRational("GPSDestDistance", 0x001a, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final TagInfoGpsText GPS_TAG_GPS_PROCESSING_METHOD = new TagInfoGpsText("GPSProcessingMethod", 0x001b, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final TagInfoGpsText GPS_TAG_GPS_AREA_INFORMATION = new TagInfoGpsText("GPSAreaInformation", 0x001c, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final TagInfoAscii GPS_TAG_GPS_DATE_STAMP = new TagInfoAscii("GPSDateStamp", 0x001d, 11, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final TagInfoShort GPS_TAG_GPS_DIFFERENTIAL = new TagInfoShort("GPSDifferential", 0x001e, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final int GPS_TAG_GPS_DIFFERENTIAL_VALUE_NO_CORRECTION = 0;

    public static final int GPS_TAG_GPS_DIFFERENTIAL_VALUE_DIFFERENTIAL_CORRECTED = 1;
    
    /**
     * Horizontal positioning errors in meters
     * @since 1.0.0-alpha6
     */
    public static final TagInfoRational GPS_TAG_GPS_HORIZONTAL_POSITIONING_ERROR = new TagInfoRational("GPSHPositioningError", 0x001f, TiffDirectoryType.EXIF_DIRECTORY_GPS);

    public static final List<TagInfo> ALL_GPS_TAGS = Collections.unmodifiableList(Arrays.asList(GPS_TAG_GPS_VERSION_ID, GPS_TAG_GPS_LATITUDE_REF,
            GPS_TAG_GPS_LATITUDE, GPS_TAG_GPS_LONGITUDE_REF, GPS_TAG_GPS_LONGITUDE, GPS_TAG_GPS_ALTITUDE_REF, GPS_TAG_GPS_ALTITUDE, GPS_TAG_GPS_TIME_STAMP,
            GPS_TAG_GPS_SATELLITES, GPS_TAG_GPS_STATUS, GPS_TAG_GPS_MEASURE_MODE, GPS_TAG_GPS_DOP, GPS_TAG_GPS_SPEED_REF, GPS_TAG_GPS_SPEED,
            GPS_TAG_GPS_TRACK_REF, GPS_TAG_GPS_TRACK, GPS_TAG_GPS_IMG_DIRECTION_REF, GPS_TAG_GPS_IMG_DIRECTION, GPS_TAG_GPS_MAP_DATUM,
            GPS_TAG_GPS_DEST_LATITUDE_REF, GPS_TAG_GPS_DEST_LATITUDE, GPS_TAG_GPS_DEST_LONGITUDE_REF, GPS_TAG_GPS_DEST_LONGITUDE, GPS_TAG_GPS_DEST_BEARING_REF,
            GPS_TAG_GPS_DEST_BEARING, GPS_TAG_GPS_DEST_DISTANCE_REF, GPS_TAG_GPS_DEST_DISTANCE, GPS_TAG_GPS_PROCESSING_METHOD, GPS_TAG_GPS_AREA_INFORMATION,
            GPS_TAG_GPS_DATE_STAMP, GPS_TAG_GPS_DIFFERENTIAL, GPS_TAG_GPS_HORIZONTAL_POSITIONING_ERROR));

    public static byte[] gpsVersion() {
        return GPS_VERSION.clone();
    }

    private GpsTagConstants() {
    }
}
