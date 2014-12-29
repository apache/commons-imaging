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

package org.apache.commons.imaging.formats.bmp;

import static org.junit.Assert.assertNotNull;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.Imaging;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class BmpReadTest extends BmpBaseTest {

    private File imageFile;

    @Parameterized.Parameters
    public static Collection<File> data() throws Exception {
        return getBmpImages();
    }

    public BmpReadTest(File imageFile) {
        this.imageFile = imageFile;
    }

    @Test
    public void testImageInfo() throws ImageReadException, IOException {
        final Map<String, Object> params = Collections.emptyMap();
        final ImageInfo imageInfo = Imaging.getImageInfo(imageFile, params);
        assertNotNull(imageInfo);
        // TODO assert more
    }

    @Ignore(value = "RoundtripTest has to be fixed befor implementation can throw UnsupportedOperationException")
    @Test(expected = UnsupportedOperationException.class)
    public void testMetaData() throws ImageReadException, IOException {
        Imaging.getMetadata(imageFile);
    }

    @Test
    public void testBufferedImage() throws Exception {
        final BufferedImage image = Imaging.getBufferedImage(imageFile);
        assertNotNull(image);
        // TODO assert more
    }

}
