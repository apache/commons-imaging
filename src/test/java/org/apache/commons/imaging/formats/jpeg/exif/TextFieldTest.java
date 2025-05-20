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

package org.apache.commons.imaging.formats.jpeg.exif;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.File;
import java.io.IOException;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.imaging.internal.Debug;

public class TextFieldTest extends AbstractSpecificExifTagTest {

    @Override
    protected void checkField(final File imageFile, final TiffField field) throws IOException, ImagingException, ImagingException {
        if (field.getTag() == ExifTagConstants.EXIF_TAG_USER_COMMENT.tag || field.getTag() == GpsTagConstants.GPS_TAG_GPS_PROCESSING_METHOD.tag
                && field.getDirectoryType() == TiffDirectoryType.EXIF_DIRECTORY_GPS.directoryType) {
            // do nothing
        } else if (field.getTag() == GpsTagConstants.GPS_TAG_GPS_AREA_INFORMATION.tag
                && field.getDirectoryType() == TiffDirectoryType.EXIF_DIRECTORY_GPS.directoryType) {
            // do nothing
        } else {
            return;
        }

        try {
            final Object textFieldValue = field.getValue();
            assertNotNull(textFieldValue);
            // TODO what else to assert?
        } catch (final ImagingException e) {
            Debug.debug("imageFile", imageFile.getAbsoluteFile());
            Debug.debug(e);
            throw e;
        }

    }

}
