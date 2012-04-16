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

package org.apache.commons.imaging.formats.jpeg.exif;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.common.IImageMetadata;
import org.apache.commons.imaging.formats.jpeg.JpegImageMetadata;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.formats.tiff.constants.AllTagConstants;
import org.apache.commons.imaging.util.Debug;

public abstract class SpecificExifTagTest extends ExifBaseTest
        implements
            AllTagConstants
{
    //    public SpecificExifTagTest(String name)
    //    {
    //        super(name);
    //    }

    public void testSingleImage() throws Exception
    {
        File imageFile = getImageWithExifData();
        checkImage(imageFile);
    }

    public void testAllImages() throws Exception
    {
        List images = getImagesWithExifData();
        for (int i = 0; i < images.size(); i++)
        {
            if(i%10==0)
            Debug.purgeMemory();

            File imageFile = (File) images.get(i);
            if (imageFile.getParentFile().getName().toLowerCase().equals(
                    "@broken"))
                continue;
            checkImage(imageFile);
        }
    }

    protected abstract void checkField(File imageFile, TiffField field)
            throws IOException, ImageReadException, ImageWriteException;

    private void checkImage(File imageFile) throws IOException,
            ImageReadException, ImageWriteException
    {
        //        Debug.debug("imageFile", imageFile.getAbsoluteFile());

        Map params = new HashMap();
        boolean ignoreImageData = isPhilHarveyTestImage(imageFile);
        params.put(PARAM_KEY_READ_THUMBNAILS, new Boolean(!ignoreImageData));

        // note that metadata might be null if no metadata is found.
        IImageMetadata metadata = Imaging.getMetadata(imageFile, params);
        if (null == metadata)
            return;
        JpegImageMetadata jpegMetadata = (JpegImageMetadata) metadata;

        // note that exif might be null if no Exif metadata is found.
        TiffImageMetadata exif = jpegMetadata.getExif();
        if (null == exif)
            return;

        List fields = exif.getAllFields();
        for (int i = 0; i < fields.size(); i++)
        {
            TiffField field = (TiffField) fields.get(i);
            checkField(imageFile, field);
        }

    }

}
