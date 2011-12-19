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
package org.apache.commons.sanselan.examples;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.sanselan.ImageReadException;
import org.apache.commons.sanselan.ImageWriteException;
import org.apache.commons.sanselan.Sanselan;
import org.apache.commons.sanselan.common.IImageMetadata;
import org.apache.commons.sanselan.formats.jpeg.JpegImageMetadata;
import org.apache.commons.sanselan.formats.jpeg.exif.ExifRewriter;
import org.apache.commons.sanselan.formats.tiff.TiffImageMetadata;
import org.apache.commons.sanselan.formats.tiff.constants.TiffConstants;
import org.apache.commons.sanselan.formats.tiff.write.TiffOutputDirectory;
import org.apache.commons.sanselan.formats.tiff.write.TiffOutputField;
import org.apache.commons.sanselan.formats.tiff.write.TiffOutputSet;
import org.apache.commons.sanselan.util.IoUtils;

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
        } finally
        {
            if (os != null)
                try
                {
                    os.close();
                } catch (IOException e)
                {

                }
        }
    }

    /**
     * This example illustrates how to add/update EXIF metadata in a JPEG file.
     *
     * @param jpegImageFile
     *            A source image file.
     * @param dst
     *            The output file.
     * @throws IOException
     * @throws ImageReadException
     * @throws ImageWriteException
     */
    public void changeExifMetadata(File jpegImageFile, File dst)
            throws IOException, ImageReadException, ImageWriteException
    {
        OutputStream os = null;
        try
        {
            TiffOutputSet outputSet = null;

            // note that metadata might be null if no metadata is found.
            IImageMetadata metadata = Sanselan.getMetadata(jpegImageFile);
            JpegImageMetadata jpegMetadata = (JpegImageMetadata) metadata;
            if (null != jpegMetadata)
            {
                // note that exif might be null if no Exif metadata is found.
                TiffImageMetadata exif = jpegMetadata.getExif();

                if (null != exif)
                {
                    // TiffImageMetadata class is immutable (read-only).
                    // TiffOutputSet class represents the Exif data to write.
                    //
                    // Usually, we want to update existing Exif metadata by
                    // changing
                    // the values of a few fields, or adding a field.
                    // In these cases, it is easiest to use getOutputSet() to
                    // start with a "copy" of the fields read from the image.
                    outputSet = exif.getOutputSet();
                }
            }

            // if file does not contain any exif metadata, we create an empty
            // set of exif metadata. Otherwise, we keep all of the other
            // existing tags.
            if (null == outputSet)
                outputSet = new TiffOutputSet();

            {
                // Example of how to add a field/tag to the output set.
                //
                // Note that you should first remove the field/tag if it already
                // exists in this directory, or you may end up with duplicate
                // tags. See above.
                //
                // Certain fields/tags are expected in certain Exif directories;
                // Others can occur in more than one directory (and often have a
                // different meaning in different directories).
                //
                // TagInfo constants often contain a description of what
                // directories are associated with a given tag.
                //
                // see
                // org.apache.commons.sanselan.formats.tiff.constants.AllTagConstants
                //
                TiffOutputField aperture = TiffOutputField.create(
                        TiffConstants.EXIF_TAG_APERTURE_VALUE,
                        outputSet.byteOrder, new Double(0.3));
                TiffOutputDirectory exifDirectory = outputSet
                        .getOrCreateExifDirectory();
                // make sure to remove old value if present (this method will
                // not fail if the tag does not exist).
                exifDirectory
                        .removeField(TiffConstants.EXIF_TAG_APERTURE_VALUE);
                exifDirectory.add(aperture);
            }

            {
                // Example of how to add/update GPS info to output set.

                // New York City
                double longitude = -74.0; // 74 degrees W (in Degrees East)
                double latitude = 40 + 43 / 60.0; // 40 degrees N (in Degrees
                // North)

                outputSet.setGPSInDegrees(longitude, latitude);
            }

            // printTagValue(jpegMetadata, TiffConstants.TIFF_TAG_DATE_TIME);

            os = new FileOutputStream(dst);
            os = new BufferedOutputStream(os);

            new ExifRewriter().updateExifMetadataLossless(jpegImageFile, os,
                    outputSet);

            os.close();
            os = null;
        } finally
        {
            if (os != null)
                try
                {
                    os.close();
                } catch (IOException e)
                {

                }
        }
    }

    /**
     * This example illustrates how to remove a tag (if present) from EXIF
     * metadata in a JPEG file.
     *
     * In this case, we remove the "aperture" tag from the EXIF metadata if
     * present.
     *
     * @param jpegImageFile
     *            A source image file.
     * @param dst
     *            The output file.
     * @throws IOException
     * @throws ImageReadException
     * @throws ImageWriteException
     */
    public void removeExifTag(File jpegImageFile, File dst) throws IOException,
            ImageReadException, ImageWriteException
    {
        OutputStream os = null;
        try
        {
            TiffOutputSet outputSet = null;

            // note that metadata might be null if no metadata is found.
            IImageMetadata metadata = Sanselan.getMetadata(jpegImageFile);
            JpegImageMetadata jpegMetadata = (JpegImageMetadata) metadata;
            if (null != jpegMetadata)
            {
                // note that exif might be null if no Exif metadata is found.
                TiffImageMetadata exif = jpegMetadata.getExif();

                if (null != exif)
                {
                    // TiffImageMetadata class is immutable (read-only).
                    // TiffOutputSet class represents the Exif data to write.
                    //
                    // Usually, we want to update existing Exif metadata by
                    // changing
                    // the values of a few fields, or adding a field.
                    // In these cases, it is easiest to use getOutputSet() to
                    // start with a "copy" of the fields read from the image.
                    outputSet = exif.getOutputSet();
                }
            }

            if (null == outputSet)
            {
                // file does not contain any exif metadata. We don't need to
                // update the file; just copy it.
                IoUtils.copyFileNio(jpegImageFile, dst);
                return;
            }

            {
                // Example of how to remove a single tag/field.
                // There are two ways to do this.

                // Option 1: brute force
                // Note that this approach is crude: Exif data is organized in
                // directories. The same tag/field may appear in more than one
                // directory, and have different meanings in each.
                outputSet.removeField(TiffConstants.EXIF_TAG_APERTURE_VALUE);

                // Option 2: precision
                // We know the exact directory the tag should appear in, in this
                // case the "exif" directory.
                // One complicating factor is that in some cases, manufacturers
                // will place the same tag in different directories.
                // To learn which directory a tag appears in, either refer to
                // the constants in ExifTagConstants.java or go to Phil Harvey's
                // EXIF website.
                TiffOutputDirectory exifDirectory = outputSet
                        .getExifDirectory();
                if (null != exifDirectory)
                    exifDirectory
                            .removeField(TiffConstants.EXIF_TAG_APERTURE_VALUE);
            }

            os = new FileOutputStream(dst);
            os = new BufferedOutputStream(os);

            new ExifRewriter().updateExifMetadataLossless(jpegImageFile, os,
                    outputSet);

            os.close();
            os = null;
        } finally
        {
            if (os != null)
                try
                {
                    os.close();
                } catch (IOException e)
                {

                }
        }
    }

    /**
     * This example illustrates how to set the GPS values in JPEG EXIF metadata.
     *
     * @param jpegImageFile
     *            A source image file.
     * @param dst
     *            The output file.
     * @throws IOException
     * @throws ImageReadException
     * @throws ImageWriteException
     */
    public void setExifGPSTag(File jpegImageFile, File dst) throws IOException,
            ImageReadException, ImageWriteException
    {
        OutputStream os = null;
        try
        {
            TiffOutputSet outputSet = null;

            // note that metadata might be null if no metadata is found.
            IImageMetadata metadata = Sanselan.getMetadata(jpegImageFile);
            JpegImageMetadata jpegMetadata = (JpegImageMetadata) metadata;
            if (null != jpegMetadata)
            {
                // note that exif might be null if no Exif metadata is found.
                TiffImageMetadata exif = jpegMetadata.getExif();

                if (null != exif)
                {
                    // TiffImageMetadata class is immutable (read-only).
                    // TiffOutputSet class represents the Exif data to write.
                    //
                    // Usually, we want to update existing Exif metadata by
                    // changing
                    // the values of a few fields, or adding a field.
                    // In these cases, it is easiest to use getOutputSet() to
                    // start with a "copy" of the fields read from the image.
                    outputSet = exif.getOutputSet();
                }
            }

            // if file does not contain any exif metadata, we create an empty
            // set of exif metadata. Otherwise, we keep all of the other
            // existing tags.
            if (null == outputSet)
                outputSet = new TiffOutputSet();

            {
                // Example of how to add/update GPS info to output set.

                // New York City
                double longitude = -74.0; // 74 degrees W (in Degrees East)
                double latitude = 40 + 43 / 60.0; // 40 degrees N (in Degrees
                // North)

                outputSet.setGPSInDegrees(longitude, latitude);
            }

            os = new FileOutputStream(dst);
            os = new BufferedOutputStream(os);

            new ExifRewriter().updateExifMetadataLossless(jpegImageFile, os,
                    outputSet);

            os.close();
            os = null;
        } finally
        {
            if (os != null)
                try
                {
                    os.close();
                } catch (IOException e)
                {

                }
        }
    }

}
