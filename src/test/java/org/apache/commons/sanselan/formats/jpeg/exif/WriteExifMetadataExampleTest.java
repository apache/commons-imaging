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

package org.apache.commons.sanselan.formats.jpeg.exif;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.sanselan.ImageReadException;
import org.apache.commons.sanselan.ImageWriteException;
import org.apache.commons.sanselan.formats.jpeg.exif.ExifRewriter;
import org.apache.commons.sanselan.formats.tiff.constants.AllTagConstants;
import org.apache.commons.sanselan.sampleUsage.WriteExifMetadataExample;
import org.apache.commons.sanselan.util.Debug;

public class WriteExifMetadataExampleTest extends ExifBaseTest
        implements
            AllTagConstants
{
    //    public WriteExifMetadataExampleTest(String name)
    //    {
    //        super(name);
    //    }

    public void test() throws IOException, ImageReadException,
            ImageWriteException
    {
        List images = getJpegImages();
        for (int i = 0; i < images.size(); i++)
        {
            if (i % 10 == 0)
                Debug.purgeMemory();

            File imageFile = (File) images.get(i);
            Debug.debug("imageFile", imageFile.getAbsoluteFile());

            File tempFile = createTempFile("test", ".jpg");
            Debug.debug("tempFile", tempFile.getAbsoluteFile());

            try
            {
                boolean ignoreImageData = isPhilHarveyTestImage(imageFile);
                if (ignoreImageData)
                    continue;
                new WriteExifMetadataExample().changeExifMetadata(imageFile,
                        tempFile);
            }
            catch (ExifRewriter.ExifOverflowException e)
            {
                Debug.debug("Error image", imageFile.getAbsoluteFile());
                Debug.debug(e, 4);
            }
        }
    }

    public void testInsert() throws IOException, ImageReadException,
            ImageWriteException
    {
        List images = getJpegImages();
        for (int i = 0; i < images.size(); i++)
        {
            if (i % 10 == 0)
                Debug.purgeMemory();

            File imageFile = (File) images.get(i);
            Debug.debug("imageFile", imageFile.getAbsoluteFile());

            File tempFile = createTempFile("test", ".jpg");
            Debug.debug("tempFile", tempFile.getAbsoluteFile());

            try
            {
                boolean ignoreImageData = isPhilHarveyTestImage(imageFile);
                if (ignoreImageData)
                    continue;
                new WriteExifMetadataExample().changeExifMetadata(imageFile,
                        tempFile);
            }
            catch (ExifRewriter.ExifOverflowException e)
            {
                Debug.debug("Ignoring unavoidable ExifOverflowException", e.getMessage());
                Debug.debug("Error image", imageFile.getAbsoluteFile());
//                Debug.debug(e, 4);
            }
        }
    }

}
