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

import java.awt.Dimension;
import java.awt.color.ICC_Profile;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.sanselan.FormatCompliance;
import org.apache.sanselan.ImageFormat;
import org.apache.sanselan.ImageInfo;
import org.apache.sanselan.Sanselan;
import org.apache.sanselan.common.IImageMetadata;

public class SampleUsage
{

    public SampleUsage()
    {

        try
        {
            // <b>Code won't work unless these variables are properly initialized.
            //         Sanselan works equally well with File, byte array or InputStream inputs.</b>
            BufferedImage someImage = null;
            byte someBytes[] = null;
            File someFile = null;
            InputStream someInputStream = null;
            OutputStream someOutputStream = null;

            // <b>The Sanselan class provides a simple interface to the library. </b>

            // <b>how to read an image: </b>
            byte imageBytes[] = someBytes;
            BufferedImage image_1 = Sanselan.getBufferedImage(imageBytes);

            // <b>methods of Sanselan usually accept files, byte arrays, or inputstreams as arguments. </b>
            BufferedImage image_2 = Sanselan.getBufferedImage(imageBytes);
            File file = someFile;
            BufferedImage image_3 = Sanselan.getBufferedImage(file);
            InputStream is = someInputStream;
            BufferedImage image_4 = Sanselan.getBufferedImage(is);

            // <b>Write an image. </b>
            BufferedImage image = someImage;
            File dst = someFile;
            ImageFormat format = ImageFormat.IMAGE_FORMAT_PNG;
            Map optional_params = new HashMap();
            Sanselan.writeImage(image, dst, format, optional_params);

            OutputStream os = someOutputStream;
            Sanselan.writeImage(image, os, format, optional_params);

            // <b>get the image's embedded ICC Profile, if it has one. </b>
            byte iccProfileBytes[] = Sanselan.getICCProfileBytes(imageBytes);

            ICC_Profile iccProfile = Sanselan.getICCProfile(imageBytes);

            // <b>get the image's width and height. </b>
            Dimension d = Sanselan.getImageSize(imageBytes);

            // <b>get all of the image's info (ie. bits per pixel, size, transparency, etc.) </b>
            ImageInfo imageInfo = Sanselan.getImageInfo(imageBytes);

            if (imageInfo.getColorType() == ImageInfo.COLOR_TYPE_GRAYSCALE)
                System.out.println("Grayscale image.");
            if (imageInfo.getHeight() > 1000)
                System.out.println("Large image.");

            // <b>try to guess the image's format. </b>
            ImageFormat image_format = Sanselan.guessFormat(imageBytes);
            image_format.equals(ImageFormat.IMAGE_FORMAT_PNG);

            // <b>get all metadata stored in EXIF format (ie. from JPEG or TIFF). </b>
            // <b>org.w3c.dom.Node node = Sanselan.getMetadataObsolete(imageBytes); </b>
            IImageMetadata metdata = Sanselan.getMetadata(imageBytes);

            // <b>print a dump of information about an image to stdout. </b>
            Sanselan.dumpImageFile(imageBytes);

            // <b>get a summary of format errors. </b>
            FormatCompliance formatCompliance = Sanselan
                    .getFormatCompliance(imageBytes);

        }
        catch (Exception e)
        {

        }
    }
}
