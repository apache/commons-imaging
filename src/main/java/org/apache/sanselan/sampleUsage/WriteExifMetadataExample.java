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

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.Sanselan;
import org.apache.sanselan.common.IImageMetadata;
import org.apache.sanselan.common.RationalNumber;
import org.apache.sanselan.formats.jpeg.JpegImageMetadata;
import org.apache.sanselan.formats.jpeg.exifRewrite.ExifRewriter;
import org.apache.sanselan.formats.tiff.TiffField;
import org.apache.sanselan.formats.tiff.TiffImageMetadata;
import org.apache.sanselan.formats.tiff.constants.TagInfo;
import org.apache.sanselan.formats.tiff.constants.TiffConstants;
import org.apache.sanselan.formats.tiff.write.TiffOutputDirectory;
import org.apache.sanselan.formats.tiff.write.TiffOutputField;
import org.apache.sanselan.formats.tiff.write.TiffOutputSet;

public class WriteExifMetadataExample
{
	public void removeExifMetadata(File jpegImageFile, File dst)
			throws IOException, ImageReadException, ImageWriteException
	{
		OutputStream os = null;
		try
		{
			os = new FileOutputStream(dst);
			os = new BufferedOutputStream(os);

			new ExifRewriter().removeExifMetadata(jpegImageFile, os);
		}
		finally
		{
			if (os != null)
				try
				{
					os.close();
				}
				catch (IOException e)
				{

				}
		}
	}

	public void changeExifMetadata(File jpegImageFile, File dst)
			throws IOException, ImageReadException, ImageWriteException
	{
		OutputStream os = null;
		try
		{
			// note that metadata might be null if no metadata is found.
			IImageMetadata metadata = Sanselan.getMetadata(jpegImageFile);
			JpegImageMetadata jpegMetadata = (JpegImageMetadata) metadata;

			// note that exif might be null if no Exif metadata is found.
			TiffImageMetadata exif = jpegMetadata.getExif();

			// TiffImageMetadata class is immutable (read-only).
			// TiffOutputSet class represents the Exif data to write.
			// 
			// Usually, we want to update existing Exif metadata by changing 
			// the values of a few fields, or adding a field.
			// In these cases, it is easiest to use getOutputSet() to 
			// start with a "copy" of the fields read from the image.
			TiffOutputSet outputSet = exif.getOutputSet();

			{
				// Example of how to remove a single tag/field.
				// 
				// Note that this approach is crude: Exif data is organized in 
				// directories.  The same tag/field may appear in more than one
				// directory.
				TiffOutputField aperture = outputSet
						.findField(TiffConstants.EXIF_TAG_APERTURE_VALUE);
				if (null != aperture)
				{
					// set contains aperture tag/field.
					outputSet
							.removeField(TiffConstants.EXIF_TAG_APERTURE_VALUE);
				}
			}

			{
				// Example of how to add a field/tag to the output set.
				//
				// Note that you should first remove the field/tag if it already exists 
				// in this directory.  See above.
				//
				// Certain fields/tags are expected in certain Exif directories;
				// Others can occur in more than one directory (and often have a different
				// meaning in different directories).
				//
				// TagInfo constants often contain a description of what directories
				// are associated with a given tag.
				// 
				// see org.apache.sanselan.formats.tiff.constants.AllTagConstants
				//
				TiffOutputField aperture = TiffOutputField.create(
						TiffConstants.EXIF_TAG_APERTURE_VALUE,
						outputSet.byteOrder, new Double(0.3));
				TiffOutputDirectory exifDirectory = outputSet
						.getOrCreateExifDirectory();
				exifDirectory.add(aperture);
			}
			
			{
				// Example of how to add/update GPS info to output set.

				// New York City
				double longitude = -74.0; // 74 degrees W (in Degrees East)
				double latitude = 40 + 43/60.0; // 40 degrees N (in Degrees North)

				outputSet.setGPSInDegrees(longitude, latitude);
			}

			//			printTagValue(jpegMetadata, TiffConstants.TIFF_TAG_DATE_TIME);

			os = new FileOutputStream(dst);
			os = new BufferedOutputStream(os);

			new ExifRewriter().updateExifMetadataLossless(jpegImageFile, os,
					outputSet);
		}
		finally
		{
			if (os != null)
				try
				{
					os.close();
				}
				catch (IOException e)
				{

				}
		}
	}


}
