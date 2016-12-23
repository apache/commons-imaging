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

import org.apache.commons.imaging.examples.WriteExifMetadataExample;
import org.apache.commons.imaging.util.Debug;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class WriteExifMetadataExampleTest extends ExifBaseTest {

    private final File imageFile;

    @Parameterized.Parameters
    public static Collection<File> data() throws Exception {
        return getJpegImages();
    }

    public WriteExifMetadataExampleTest(final File imageFile) {
        this.imageFile = imageFile;
    }

    @Test
    public void testInsert() throws Exception {
        Debug.debug("imageFile", imageFile.getAbsoluteFile());

        final File tempFile = createTempFile("test", ".jpg");
        Debug.debug("tempFile", tempFile.getAbsoluteFile());

        try {
            final boolean ignoreImageData = isPhilHarveyTestImage(imageFile);
            if (ignoreImageData) {
                return;
            }
            new WriteExifMetadataExample().changeExifMetadata(imageFile, tempFile);
            // TODO assert that ExifMetadata has been changed
        } catch (final ExifRewriter.ExifOverflowException e) {
            Debug.debug("Ignoring unavoidable ExifOverflowException: " + e.getMessage());
            Debug.debug("Error image: " + imageFile.getAbsoluteFile());
        }
    }

}
