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
package org.apache.commons.imaging.common.bytesource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.ImagingTestConstants;
import org.apache.commons.io.FilenameUtils;
import org.junit.jupiter.api.Test;

class ByteSourceInputStreamTest {

    public static final String ICO_IMAGE_FILE = "ico\\1\\Oregon Scientific DS6639 - DSC_0307 - small.ico";
    public static final int ICO_IMAGE_WIDTH = 300;
    public static final int ICO_IMAGE_HEIGHT = 225;

    @Test
    public void testReadFromStream() throws IOException, ImagingException {

        final String imagePath = FilenameUtils.separatorsToSystem(ICO_IMAGE_FILE);
        final File imageFile = new File(ImagingTestConstants.TEST_IMAGE_FOLDER, imagePath);
        try(BufferedInputStream imageStream = new BufferedInputStream(new FileInputStream(imageFile))) {
            // ByteSourceInputStream is created inside of following method
            final BufferedImage bufferedImage = Imaging.getBufferedImage(imageStream, ICO_IMAGE_FILE);

            assertEquals(bufferedImage.getWidth(), ICO_IMAGE_WIDTH);
            assertEquals(bufferedImage.getHeight(), ICO_IMAGE_HEIGHT);
        }
    }

}
