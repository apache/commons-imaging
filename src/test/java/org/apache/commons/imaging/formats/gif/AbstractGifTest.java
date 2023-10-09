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

package org.apache.commons.imaging.formats.gif;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.imaging.AbstractImagingTest;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingException;

public abstract class AbstractGifTest extends AbstractImagingTest {

    private final static String ANIMATED_FOLDER_NAME = "animated";

    private final static String SINGLE_IMAGE_FOLDER_NAME = "single";

    private static final ImageFilter IMAGE_FILTER = AbstractGifTest::isGif;

    private static final ImageFilter ANIMATED_IMAGE_FILTER = file -> isGif(file) && isAnimated(file);

    private static final ImageFilter SINGLE_IMAGE_FILTER = file -> isGif(file) && isSingleImage(file);

    protected static List<File> getAnimatedGifImages() throws IOException, ImagingException {
        return getTestImages(ANIMATED_IMAGE_FILTER);
    }

    protected static List<File> getGifImages() throws IOException, ImagingException {
        return getTestImages(IMAGE_FILTER);
    }

    protected static List<File> getGifImagesWithSingleImage() throws IOException, ImagingException {
        return getTestImages(SINGLE_IMAGE_FILTER);
    }

    private static boolean isAnimated(final File file) {
        final File index = file.getParentFile();
        final File type = index.getParentFile();
        return type.getName().equals(ANIMATED_FOLDER_NAME);
    }

    private static boolean isGif(final File file) throws IOException {
        final ImageFormat format = Imaging.guessFormat(file);
        return format == ImageFormats.GIF;
    }

    private static boolean isSingleImage(final File file) {
        final File index = file.getParentFile();
        final File type = index.getParentFile();
        return type.getName().equals(SINGLE_IMAGE_FOLDER_NAME);
    }

}
