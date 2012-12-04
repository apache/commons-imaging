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

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.util.Debug;
import org.apache.commons.imaging.util.IoUtils;

public class ByteSourceImageTest extends ByteSourceTest {

    public void test() throws Exception {
        List<File> imageFiles = getTestImages();
        for (int i = 0; i < imageFiles.size(); i++) {
            if (i % 1 == 0) {
                Debug.purgeMemory();
            }

            File imageFile = imageFiles.get(i);
            Debug.debug("imageFile", imageFile);
            assertNotNull(imageFile);

            byte imageFileBytes[] = IoUtils.getFileBytes(imageFile);
            assertNotNull(imageFileBytes);
            assertTrue(imageFileBytes.length == imageFile.length());

            if (imageFile.getName().toLowerCase().endsWith(".ico")
                    || imageFile.getName().toLowerCase().endsWith(".tga")
                    || imageFile.getName().toLowerCase().endsWith(".jb2")
                    || imageFile.getName().toLowerCase().endsWith(".pcx")
                    || imageFile.getName().toLowerCase().endsWith(".dcx")
                    || imageFile.getName().toLowerCase().endsWith(".psd")
                    || imageFile.getName().toLowerCase().endsWith(".wbmp")
                    || imageFile.getName().toLowerCase().endsWith(".xbm")
                    || imageFile.getName().toLowerCase().endsWith(".xpm")) {
                // these formats can't be parsed without a filename hint.
                // they have ambiguous "magic number" signatures.
                continue;
            }

            checkGuessFormat(imageFile, imageFileBytes);

            if (imageFile.getName().toLowerCase().endsWith(".png")
                    && imageFile.getParentFile().getName()
                            .equalsIgnoreCase("pngsuite")
                    && imageFile.getName().toLowerCase().startsWith("x")) {
                continue;
            }

            checkGetICCProfileBytes(imageFile, imageFileBytes);

            if (!imageFile.getParentFile().getName().toLowerCase()
                    .equals("@broken")) {
                checkGetImageInfo(imageFile, imageFileBytes);
            }

            checkGetImageSize(imageFile, imageFileBytes);

            ImageFormat imageFormat = Imaging.guessFormat(imageFile);
            if (ImageFormat.IMAGE_FORMAT_JPEG != imageFormat
                    && ImageFormat.IMAGE_FORMAT_UNKNOWN != imageFormat) {
                checkGetBufferedImage(imageFile, imageFileBytes);
            }
        }
    }

    public void checkGetBufferedImage(File file, byte[] bytes) throws Exception {
        BufferedImage imageFile = Imaging.getBufferedImage(file);
        assertNotNull(imageFile);
        assertTrue(imageFile.getWidth() > 0);
        assertTrue(imageFile.getHeight() > 0);
        int imageFileWidth = imageFile.getWidth();
        int imageFileHeight = imageFile.getHeight();
        imageFile = null;

        BufferedImage imageBytes = Imaging.getBufferedImage(bytes);
        assertNotNull(imageBytes);
        assertTrue(imageFileWidth == imageBytes.getWidth());
        assertTrue(imageFileHeight == imageBytes.getHeight());
    }

    public void checkGetImageSize(File imageFile, byte[] imageFileBytes)
            throws Exception {
        Dimension imageSizeFile = Imaging.getImageSize(imageFile);
        assertNotNull(imageSizeFile);
        assertTrue(imageSizeFile.width > 0);
        assertTrue(imageSizeFile.height > 0);

        Dimension imageSizeBytes = Imaging.getImageSize(imageFileBytes);
        assertNotNull(imageSizeBytes);
        assertTrue(imageSizeFile.width == imageSizeBytes.width);
        assertTrue(imageSizeFile.height == imageSizeBytes.height);
    }

    public void checkGuessFormat(File imageFile, byte[] imageFileBytes)
            throws Exception {
        // check guessFormat()
        ImageFormat imageFormatFile = Imaging.guessFormat(imageFile);
        assertNotNull(imageFormatFile);
        assertTrue(imageFormatFile != ImageFormat.IMAGE_FORMAT_UNKNOWN);
        // Debug.debug("imageFormatFile", imageFormatFile);

        ImageFormat imageFormatBytes = Imaging.guessFormat(imageFileBytes);
        assertNotNull(imageFormatBytes);
        assertTrue(imageFormatBytes != ImageFormat.IMAGE_FORMAT_UNKNOWN);
        // Debug.debug("imageFormatBytes", imageFormatBytes);

        assertTrue(imageFormatBytes == imageFormatFile);
    }

    public void checkGetICCProfileBytes(File imageFile, byte[] imageFileBytes)
            throws Exception {
        // check guessFormat()
        byte iccBytesFile[] = Imaging.getICCProfileBytes(imageFile);

        byte iccBytesBytes[] = Imaging.getICCProfileBytes(imageFileBytes);

        assertTrue((iccBytesFile != null) == (iccBytesBytes != null));

        if (iccBytesFile == null) {
            return;
        }

        compareByteArrays(iccBytesFile, iccBytesBytes);
    }

    public void checkGetImageInfo(File imageFile, byte[] imageFileBytes)
            throws IOException, ImageReadException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        Map<String,Object> params = new HashMap<String,Object>();
        boolean ignoreImageData = isPhilHarveyTestImage(imageFile);
        ImageFormat imageFormat = Imaging.guessFormat(imageFile);
        if (imageFormat.equals(ImageFormat.IMAGE_FORMAT_TIFF)
                || imageFormat.equals(ImageFormat.IMAGE_FORMAT_JPEG)) {
            params.put(PARAM_KEY_READ_THUMBNAILS, new Boolean(!ignoreImageData));
        }

        ImageInfo imageInfoFile = Imaging.getImageInfo(imageFile, params);

        ImageInfo imageInfoBytes = Imaging.getImageInfo(imageFileBytes, params);

        assertNotNull(imageInfoFile);
        assertNotNull(imageInfoBytes);

        Method methods[] = ImageInfo.class.getMethods();
        for (Method method2 : methods) {
            Method method = method2;
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

            Object valueFile = method.invoke(imageInfoFile, (Object[])null);
            Object valueBytes = method.invoke(imageInfoBytes, (Object[])null);

            assertTrue(valueFile.equals(valueBytes));
        }

        // only have to test values from imageInfoFile; we already know values
        // match.
        assertTrue(imageInfoFile.getBitsPerPixel() > 0);

        assertNotNull(imageInfoFile.getFormat());
        assertTrue(imageInfoFile.getFormat() != ImageFormat.IMAGE_FORMAT_UNKNOWN);

        assertNotNull(imageInfoFile.getFormatName());

        assertTrue(imageInfoFile.getWidth() > 0);
        assertTrue(imageInfoFile.getHeight() > 0);

        assertNotNull(imageInfoFile.getMimeType());

        // TODO: not all adapters count images yet.
        // assertTrue(imageInfoFile.getNumberOfImages() > 0);

    }
}
