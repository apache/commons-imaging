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
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.formats.jpeg.JpegImageMetadata;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.util.Debug;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class GpsTest extends ExifBaseTest {

    private File imageFile;

    @Parameterized.Parameters
    public static Collection<File> data() throws Exception {
        return getImagesWithExifData();
    }

    public GpsTest(File imageFile) {
        this.imageFile = imageFile;
    }

    @Test
    public void test() throws Exception {
        if (imageFile.getParentFile().getName().toLowerCase()
                .equals("@broken")) {
            return;
        }

        final Map<String, Object> params = new HashMap<String, Object>();
        final boolean ignoreImageData = isPhilHarveyTestImage(imageFile);
        params.put(ImagingConstants.PARAM_KEY_READ_THUMBNAILS, Boolean.valueOf(!ignoreImageData));

        final JpegImageMetadata metadata = (JpegImageMetadata) Imaging
                .getMetadata(imageFile, params);
        if (null == metadata) {
            return;
        }

        final TiffImageMetadata exifMetadata = metadata.getExif();
        if (null == exifMetadata) {
            return;
        }

        final TiffImageMetadata.GPSInfo gpsInfo = exifMetadata.getGPS();
        if (null == gpsInfo) {
            return;
        }

        // TODO we should assert something here.
        Debug.debug("imageFile " + imageFile);
        Debug.debug("gpsInfo " + gpsInfo);
        Debug.debug("gpsInfo longitude as degrees east " + gpsInfo.getLongitudeAsDegreesEast());
        Debug.debug("gpsInfo latitude as degrees north " + gpsInfo.getLatitudeAsDegreesNorth());
        Debug.debug();

    }
}
