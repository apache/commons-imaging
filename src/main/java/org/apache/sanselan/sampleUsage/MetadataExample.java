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
package org.apache.sanselan.sampleUsage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.Sanselan;
import org.apache.sanselan.common.IImageMetadata;
import org.apache.sanselan.common.RationalNumber;
import org.apache.sanselan.formats.jpeg.JpegImageMetadata;
import org.apache.sanselan.formats.tiff.TiffField;
import org.apache.sanselan.formats.tiff.TiffImageMetadata;
import org.apache.sanselan.formats.tiff.constants.TagInfo;
import org.apache.sanselan.formats.tiff.constants.TiffConstants;
import org.apache.sanselan.util.Debug;

public class MetadataExample
{
	public static void metadataExample(File file) throws ImageReadException,
			IOException
	{
		//        get all metadata stored in EXIF format (ie. from JPEG or TIFF).
		//            org.w3c.dom.Node node = Sanselan.getMetadataObsolete(imageBytes);
		IImageMetadata metadata = Sanselan.getMetadata(file);

		//System.out.println(metadata);

		if (metadata instanceof JpegImageMetadata)
		{
			JpegImageMetadata jpegMetadata = (JpegImageMetadata) metadata;

			// Jpeg EXIF metadata is stored in a TIFF-based directory structure
			// and is identified with TIFF tags.
			// Here we look for the "x resolution" tag, but
			// we could just as easily search for any other tag.
			//
			// see the TiffConstants file for a list of TIFF tags.

			System.out.println("file: " + file.getPath());

			// print out various interesting EXIF tags.
			printTagValue(jpegMetadata, TiffConstants.TIFF_TAG_XRESOLUTION);
			printTagValue(jpegMetadata, TiffConstants.TIFF_TAG_DATE_TIME);
			printTagValue(jpegMetadata,
					TiffConstants.EXIF_TAG_DATE_TIME_ORIGINAL);
			printTagValue(jpegMetadata, TiffConstants.EXIF_TAG_CREATE_DATE);
			printTagValue(jpegMetadata, TiffConstants.EXIF_TAG_ISO);
			printTagValue(jpegMetadata,
					TiffConstants.EXIF_TAG_SHUTTER_SPEED_VALUE);
			printTagValue(jpegMetadata, TiffConstants.EXIF_TAG_APERTURE_VALUE);
			printTagValue(jpegMetadata, TiffConstants.EXIF_TAG_BRIGHTNESS_VALUE);
			printTagValue(jpegMetadata, TiffConstants.GPS_TAG_GPS_LATITUDE_REF);
			printTagValue(jpegMetadata, TiffConstants.GPS_TAG_GPS_LATITUDE);
			printTagValue(jpegMetadata, TiffConstants.GPS_TAG_GPS_LONGITUDE_REF);
			printTagValue(jpegMetadata, TiffConstants.GPS_TAG_GPS_LONGITUDE);

			System.out.println();

			// simple interface to GPS data
			TiffImageMetadata exifMetadata = jpegMetadata.getExif();
			if (null != exifMetadata)
			{
				TiffImageMetadata.GPSInfo gpsInfo = exifMetadata.getGPS();
				if (null != gpsInfo)
				{
					String gpsDescription = gpsInfo.toString();
					double longitude = gpsInfo.getLongitudeAsDegreesEast();
					double latitude = gpsInfo.getLatitudeAsDegreesNorth();

					System.out.println("	" + "GPS Description: " + gpsInfo);
					System.out.println("	" + "GPS Longitude (Degrees East): " + longitude);
					System.out.println("	" + "GPS Latitude (Degrees North): " + latitude);
				}
			}

			// more specific example of how to manually access GPS values
			TiffField gpsLatitudeRefField = jpegMetadata
					.findEXIFValue(TiffConstants.GPS_TAG_GPS_LATITUDE_REF);
			TiffField gpsLatitudeField = jpegMetadata
					.findEXIFValue(TiffConstants.GPS_TAG_GPS_LATITUDE);
			TiffField gpsLongitudeRefField = jpegMetadata
					.findEXIFValue(TiffConstants.GPS_TAG_GPS_LONGITUDE_REF);
			TiffField gpsLongitudeField = jpegMetadata
					.findEXIFValue(TiffConstants.GPS_TAG_GPS_LONGITUDE);
			if (gpsLatitudeRefField != null && gpsLatitudeField != null
					&& gpsLongitudeRefField != null
					&& gpsLongitudeField != null)
			{
				// all of these values are strings.
				String gpsLatitudeRef = (String) gpsLatitudeRefField.getValue();
				RationalNumber gpsLatitude[] = (RationalNumber[]) (gpsLatitudeField
						.getValue());
				String gpsLongitudeRef = (String) gpsLongitudeRefField
						.getValue();
				RationalNumber gpsLongitude[] = (RationalNumber[]) gpsLongitudeField
						.getValue();

				RationalNumber gpsLatitudeDegrees = gpsLatitude[0];
				RationalNumber gpsLatitudeMinutes = gpsLatitude[1];
				RationalNumber gpsLatitudeSeconds = gpsLatitude[2];

				RationalNumber gpsLongitudeDegrees = gpsLongitude[0];
				RationalNumber gpsLongitudeMinutes = gpsLongitude[1];
				RationalNumber gpsLongitudeSeconds = gpsLongitude[2];

				// This will format the gps info like so:
				//
				// gpsLatitude: 8 degrees, 40 minutes, 42.2 seconds S
				// gpsLongitude: 115 degrees, 26 minutes, 21.8 seconds E

				System.out.println("	" + "GPS Latitude: "
						+ gpsLatitudeDegrees.toDisplayString() + " degrees, "
						+ gpsLatitudeMinutes.toDisplayString() + " minutes, "
						+ gpsLatitudeSeconds.toDisplayString() + " seconds "
						+ gpsLatitudeRef);
				System.out.println("	" + "GPS Longitude: "
						+ gpsLongitudeDegrees.toDisplayString() + " degrees, "
						+ gpsLongitudeMinutes.toDisplayString() + " minutes, "
						+ gpsLongitudeSeconds.toDisplayString() + " seconds "
						+ gpsLongitudeRef);

			}

			System.out.println();

			ArrayList items = jpegMetadata.getItems();
			for (int i = 0; i < items.size(); i++)
			{
				Object item = items.get(i);
				System.out.println("	" + "item: " + item);
			}

			System.out.println();
		}
	}

	private static void printTagValue(JpegImageMetadata jpegMetadata,
			TagInfo tagInfo) throws ImageReadException, IOException
	{
		TiffField field = jpegMetadata.findEXIFValue(tagInfo);
		if (field == null)
			System.out.println(tagInfo.name + ": " + "Not Found.");
		else
			System.out.println(tagInfo.name + ": "
					+ field.getValueDescription());
	}

}
