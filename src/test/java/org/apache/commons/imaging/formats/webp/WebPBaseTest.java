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

package org.apache.commons.imaging.formats.webp;

import org.apache.commons.imaging.AbstractImagingTest;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingException;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public abstract class WebPBaseTest extends AbstractImagingTest {

    private static boolean isWebP(final File file) throws IOException {
        final ImageFormat format = Imaging.guessFormat(file);
        return format == ImageFormats.WEBP;
    }

    private static final ImageFilter IMAGE_FILTER = WebPBaseTest::isWebP;

    protected static List<File> getWebPImages() throws IOException, ImagingException {
        return getTestImages(IMAGE_FILTER);
    }

    protected static Stream<File> images() throws IOException {
        final List<File> images = getWebPImages();
        File emptyWebP = new File(WebPReadTest.class.getResource("/images/webp/empty/empty-100x100.webp").getFile());
        File animationWebP = new File(WebPReadTest.class.getResource("/images/webp/animation/example.webp").getFile());
        File exifWebP = new File(WebPReadTest.class.getResource("/images/webp/exif/_DSC6099.webp").getFile());
        return Stream.concat(
                images.stream(),
                Stream.of(emptyWebP, animationWebP, exifWebP)
        );
    }
}
