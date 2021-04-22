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

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.stream.Stream;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingParameters;
import org.apache.commons.imaging.formats.jpeg.JpegImagingParameters;
import org.apache.commons.imaging.internal.Debug;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ByteSourceImageTest extends ByteSourceTest {

    public static Stream<File> data() throws Exception {
        return getTestImages().stream();
    }

    @ParameterizedTest
    @MethodSource("data")
    public void test(final File imageFile) throws Exception {
        Debug.debug("imageFile", imageFile);
        assertNotNull(imageFile);

        final byte[] imageFileBytes = FileUtils.readFileToByteArray(imageFile);
        assertNotNull(imageFileBytes);
        assertEquals(imageFileBytes.length, imageFile.length());

        if (imageFile.getName().toLowerCase().endsWith(".ico")
                || imageFile.getName().toLowerCase().endsWith(".tga")
                || imageFile.getName().toLowerCase().endsWith(".jb2")
                || imageFile.getName().toLowerCase().endsWith(".pcx")
                || imageFile.getName().toLowerCase().endsWith(".dcx")
                || imageFile.getName().toLowerCase().endsWith(".psd")
                || imageFile.getName().toLowerCase().endsWith(".wbmp")
                || imageFile.getName().toLowerCase().endsWith(".xbm")
                || imageFile.getName().toLowerCase().endsWith(".xpm")) {
            // these formats can't be parsed without a file name hint.
            // they have ambiguous "magic number" signatures.
            return;
        }

        checkGuessFormat(imageFile, imageFileBytes);

        if (imageFile.getName().toLowerCase().endsWith(".png")
                && imageFile.getParentFile().getName().equalsIgnoreCase("pngsuite")
                && imageFile.getName().toLowerCase().startsWith("x")) {
            return;
        }

        checkGetICCProfileBytes(imageFile, imageFileBytes);

        if (!imageFile.getParentFile().getName().toLowerCase().equals("@broken")) {
            checkGetImageInfo(imageFile, imageFileBytes);
        }

        checkGetImageSize(imageFile, imageFileBytes);

        final ImageFormat imageFormat = Imaging.guessFormat(imageFile);
        if (ImageFormats.JPEG != imageFormat
                && ImageFormats.UNKNOWN != imageFormat) {
            checkGetBufferedImage(imageFile, imageFileBytes);
        }
    }

    public void checkGetBufferedImage(final File file, final byte[] bytes) throws Exception {
        final BufferedImage bufferedImage = Imaging.getBufferedImage(file);
        assertNotNull(bufferedImage);
        assertTrue(bufferedImage.getWidth() > 0);
        assertTrue(bufferedImage.getHeight() > 0);
        final int imageFileWidth = bufferedImage.getWidth();
        final int imageFileHeight = bufferedImage.getHeight();

        final BufferedImage imageBytes = Imaging.getBufferedImage(bytes);
        assertNotNull(imageBytes);
        assertEquals(imageFileWidth, imageBytes.getWidth());
        assertEquals(imageFileHeight, imageBytes.getHeight());
    }

    public void checkGetImageSize(final File imageFile, final byte[] imageFileBytes)
            throws Exception {
        final Dimension imageSizeFile = Imaging.getImageSize(imageFile);
        assertNotNull(imageSizeFile);
        assertTrue(imageSizeFile.width > 0);
        assertTrue(imageSizeFile.height > 0);

        final Dimension imageSizeBytes = Imaging.getImageSize(imageFileBytes);
        assertNotNull(imageSizeBytes);
        assertEquals(imageSizeFile.width, imageSizeBytes.width);
        assertEquals(imageSizeFile.height, imageSizeBytes.height);
    }

    public void checkGuessFormat(final File imageFile, final byte[] imageFileBytes)
            throws Exception {
        // check guessFormat()
        final ImageFormat imageFormatFile = Imaging.guessFormat(imageFile);
        assertNotNull(imageFormatFile);
        assertNotSame(imageFormatFile, ImageFormats.UNKNOWN);
        // Debug.debug("imageFormatFile", imageFormatFile);

        final ImageFormat imageFormatBytes = Imaging.guessFormat(imageFileBytes);
        assertNotNull(imageFormatBytes);
        assertNotSame(imageFormatBytes, ImageFormats.UNKNOWN);
        // Debug.debug("imageFormatBytes", imageFormatBytes);

        assertSame(imageFormatBytes, imageFormatFile);
    }

    public void checkGetICCProfileBytes(final File imageFile, final byte[] imageFileBytes)
            throws Exception {
        // check guessFormat()
        final byte[] iccBytesFile = Imaging.getICCProfileBytes(imageFile);

        final byte[] iccBytesBytes = Imaging.getICCProfileBytes(imageFileBytes);

        assertEquals((iccBytesFile != null), (iccBytesBytes != null));

        if (iccBytesFile == null) {
            return;
        }

        assertArrayEquals(iccBytesFile, iccBytesBytes);
    }

    public void checkGetImageInfo(final File imageFile, final byte[] imageFileBytes)
            throws IOException, ImageReadException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        final ImagingParameters params;
        final boolean ignoreImageData = isPhilHarveyTestImage(imageFile);
        final ImageFormat imageFormat = Imaging.guessFormat(imageFile);
        if (imageFormat.equals(ImageFormats.TIFF)
                || imageFormat.equals(ImageFormats.JPEG)) {
            params = new JpegImagingParameters();
            ((JpegImagingParameters) params).setReadThumbnails(Boolean.valueOf(!ignoreImageData));
        } else {
            params = new ImagingParameters();
        }

        final ImageInfo imageInfoFile = Imaging.getImageInfo(imageFile, params);

        final ImageInfo imageInfoBytes = Imaging.getImageInfo(imageFileBytes, params);

        assertNotNull(imageInfoFile);
        assertNotNull(imageInfoBytes);

        final Method[] methods = ImageInfo.class.getMethods();
        for (final Method method2 : methods) {
            final Method method = method2;
            method.getModifiers();
            if (!Modifier.isPublic(method.getModifiers())) {
                continue;
            }
            if (!method.getName().startsWith("get")) {
                continue;
            }
            if (method.getName().equals("getClass"))
             {
                continue;
            // if (method.getGenericParameterTypes().length > 0)
            // continue;
            }

            final Object valueFile = method.invoke(imageInfoFile, (Object[])null);
            final Object valueBytes = method.invoke(imageInfoBytes, (Object[])null);

            assertEquals(valueFile, valueBytes);
        }

        // only have to test values from imageInfoFile; we already know values
        // match.
        assertTrue(imageInfoFile.getBitsPerPixel() > 0);

        assertNotNull(imageInfoFile.getFormat());
        assertNotSame(imageInfoFile.getFormat(), ImageFormats.UNKNOWN);

        assertNotNull(imageInfoFile.getFormatName());

        assertTrue(imageInfoFile.getWidth() > 0);
        assertTrue(imageInfoFile.getHeight() > 0);

        assertNotNull(imageInfoFile.getMimeType());

        // TODO: not all adapters count images yet.
        // assertTrue(imageInfoFile.getNumberOfImages() > 0);

    }
}
