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

package org.apache.commons.imaging.roundtrip;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.ImagingTest;
import org.apache.commons.imaging.PixelDensity;
import org.apache.commons.imaging.common.RgbBufferedImageFactory;
import org.apache.commons.imaging.util.Debug;
import org.apache.commons.imaging.util.IoUtils;

public class RoundtripTest extends ImagingTest {
    private static final int COLOR_FULL_RGB = 0;
    private static final int COLOR_LIMITED_INDEX = 1;
    private static final int COLOR_GRAYSCALE = 2;
    private static final int COLOR_BITMAP = 3;

    private static class FormatInfo {

        public final ImageFormat format;
        public final boolean canRead;
        public final boolean canWrite;
        public final int colorSupport;
        public final boolean identicalSecondWrite;
        public final boolean preservesResolution;

        public FormatInfo(ImageFormat format, boolean canRead,
                boolean canWrite, int colorSupport,
                final boolean identicalSecondWrite,
                final boolean preservesResolution) {
            this.canRead = canRead;
            this.canWrite = canWrite;
            this.colorSupport = colorSupport;
            this.format = format;
            this.identicalSecondWrite = identicalSecondWrite;
            this.preservesResolution = preservesResolution;
        }
    }

    private static final FormatInfo FORMAT_INFOS[] = { //
            new FormatInfo(ImageFormat.IMAGE_FORMAT_PNG, true, true,
                    COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormat.IMAGE_FORMAT_GIF, true, true,
                    COLOR_LIMITED_INDEX, true, false), //
            new FormatInfo(ImageFormat.IMAGE_FORMAT_ICO, true, true,
                    COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormat.IMAGE_FORMAT_TIFF, true, true,
                    COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormat.IMAGE_FORMAT_JPEG, true, false,
                    COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormat.IMAGE_FORMAT_BMP, true, true,
                    COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormat.IMAGE_FORMAT_PSD, true, false,
                    COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormat.IMAGE_FORMAT_PBM, true, true,
                    COLOR_BITMAP, true, false), //
            new FormatInfo(ImageFormat.IMAGE_FORMAT_PGM, true, true,
                    COLOR_GRAYSCALE, true, false), //
            new FormatInfo(ImageFormat.IMAGE_FORMAT_PPM, true, true,
                    COLOR_FULL_RGB, true, false), //
            // new FormatInfo(ImageFormat.IMAGE_FORMAT_PNM, true, true,
            // COLOR_FULL_RGB, true), //
            new FormatInfo(ImageFormat.IMAGE_FORMAT_TGA, false, false,
                    COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormat.IMAGE_FORMAT_WBMP, true, true,
                    COLOR_BITMAP, true, false), //
            new FormatInfo(ImageFormat.IMAGE_FORMAT_PCX, true, true,
                    COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormat.IMAGE_FORMAT_DCX, true, true,
                    COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormat.IMAGE_FORMAT_XBM, true, true,
                    COLOR_BITMAP, false, false), //
            new FormatInfo(ImageFormat.IMAGE_FORMAT_XPM, true, true,
                    COLOR_FULL_RGB, false, false), //
    };

    private BufferedImage createArgbBitmapImage(int width, int height) {
        BufferedImage result = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_ARGB);
        for (int x = 0; x < width; x++)
            for (int y = 0; y < height; y++) {
                // alternating black and white.
                int modulator = y + 2; // make sure lines vary.
                int argb = (x + y) % modulator == 0 ? 0xff000000 : 0xffffffff;
                result.setRGB(x, y, argb);
            }
        return result;
    }

    private BufferedImage createBitmapBitmapImage(int width, int height) {
        BufferedImage result = new BufferedImage(width, height,
                BufferedImage.TYPE_BYTE_BINARY);
        for (int x = 0; x < width; x++)
            for (int y = 0; y < height; y++) {
                // alternating black and white.
                int modulator = y + 2; // make sure lines vary.
                int argb = (x + y) % modulator == 0 ? 0xff000000 : 0xffffffff;
                result.setRGB(x, y, argb);
            }
        return result;
    }

    private BufferedImage createArgbGrayscaleImage(int width, int height) {
        BufferedImage result = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_ARGB);
        for (int x = 0; x < width; x++)
            for (int y = 0; y < height; y++) {
                int value = (256 * (x + y)) / (width + height);
                int argb = (0xff << 24) | (value << 16) | (value << 8)
                        | (value << 0);

                result.setRGB(x, y, argb);
            }
        return result;
    }

    private BufferedImage createGrayscaleGrayscaleImage(int width, int height) {
        BufferedImage result = new BufferedImage(width, height,
                BufferedImage.TYPE_BYTE_GRAY);
        for (int x = 0; x < width; x++)
            for (int y = 0; y < height; y++) {
                int value = (256 * (x + y)) / (width + height);
                int argb = (0xff << 24) | (value << 16) | (value << 8)
                        | (value << 0);

                result.setRGB(x, y, argb);
            }
        return result;
    }

    private BufferedImage createLimitedColorImage(int width, int height) {
        int colors[] = { 0xffffffff, 0xff000000, 0xfff00000, 0xff0000ff,
                0xff123456, 0xfffefeff, 0xff7f817f, };

        BufferedImage result = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_ARGB);
        for (int x = 0; x < width; x++)
            for (int y = 0; y < height; y++) {
                int argb = colors[(x + y) % colors.length];
                result.setRGB(x, y, argb);
            }
        return result;
    }

    private BufferedImage createFullColorImage(int width, int height) {
        BufferedImage result = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_ARGB);
        for (int x = 0; x < width; x++)
            for (int y = 0; y < height; y++) {
                int red = (x * 255) / width;
                int green = (y * 255) / height;
                int blue = ((x + y) * 255) / (width + height);
                int argb = (0xff << 24) | (red << 16) | (green << 8)
                        | (blue << 0);
                result.setRGB(x, y, argb);
            }
        return result;
    }

    private void compareImagesExact(BufferedImage a, BufferedImage b) {
        compareImages(a, b, 0);
    }

    // private void compareImagesOffByOne(BufferedImage a, BufferedImage b)
    // {
    // compareImages(a, b, 3); // one bit of rounding error for each channel
    // }

    private void compareImages(BufferedImage a, BufferedImage b, int tolerance) {
        assertEquals(a.getWidth(), b.getWidth());
        assertEquals(a.getHeight(), b.getHeight());

        for (int x = 0; x < a.getWidth(); x++)
            for (int y = 0; y < a.getHeight(); y++) {
                int a_argb = a.getRGB(x, y);
                int b_argb = b.getRGB(x, y);
                if (a_argb != b_argb) {
                    if (calculateARGBDistance(a_argb, b_argb) <= tolerance)
                        continue; // ignore.
                }
                if (a_argb != b_argb) {
                    Debug.debug("width", a.getWidth());
                    Debug.debug("height", a.getHeight());
                    Debug.debug("distance",
                            calculateARGBDistance(a_argb, b_argb));
                    Debug.debug("x", x);
                    Debug.debug("y", y);
                    Debug.debug("a_argb",
                            a_argb + " (0x" + Integer.toHexString(a_argb) + ")");
                    Debug.debug("b_argb",
                            b_argb + " (0x" + Integer.toHexString(b_argb) + ")");
                }
                assertEquals(a_argb, b_argb);
            }
    }

    private int calculateARGBDistance(int a, int b) {
        int aAlpha = 0xff & (a >> 24);
        int aRed = 0xff & (a >> 16);
        int aGreen = 0xff & (a >> 8);
        int aBlue = 0xff & (a >> 0);
        int bAlpha = 0xff & (b >> 24);
        int bRed = 0xff & (b >> 16);
        int bGreen = 0xff & (b >> 8);
        int bBlue = 0xff & (b >> 0);
        int diff = Math.abs(aAlpha - bAlpha) + Math.abs(aRed - bRed)
                + Math.abs(aGreen - bGreen) + Math.abs(aBlue - bBlue);
        return diff;

    }

    private void compareFilesExact(File a, File b) throws IOException {
        assertTrue(a.exists() && a.isFile());
        assertTrue(b.exists() && b.isFile());
        assertEquals(a.length(), b.length());

        byte aData[] = IoUtils.getFileBytes(a);
        byte bData[] = IoUtils.getFileBytes(b);

        for (int i = 0; i < a.length(); i++) {
            int aByte = 0xff & aData[i];
            int bByte = 0xff & bData[i];

            if (aByte != bByte) {
                Debug.debug("a", a);
                Debug.debug("b", b);
                Debug.debug("i", i);
                Debug.debug("aByte",
                        aByte + " (0x" + Integer.toHexString(aByte) + ")");
                Debug.debug("bByte",
                        bByte + " (0x" + Integer.toHexString(bByte) + ")");
            }
            assertEquals(aByte, bByte);
        }
    }

    public void testBitmapRoundtrip() throws Exception {
        BufferedImage testImages[] = { //

        createArgbBitmapImage(1, 1), // minimal
                createArgbBitmapImage(2, 2), //
                createArgbBitmapImage(10, 10), // larger than 8
                createArgbBitmapImage(300, 300), // larger than 256

                createBitmapBitmapImage(1, 1), // minimal
                createBitmapBitmapImage(2, 2), //
                createBitmapBitmapImage(10, 10), // larger than 8
                createBitmapBitmapImage(300, 300), // larger than 256
        };

        for (int j = 0; j < testImages.length; j++) {
            BufferedImage testImage = testImages[j];

            for (int i = 0; i < FORMAT_INFOS.length; i++) {
                FormatInfo formatInfo = FORMAT_INFOS[i];
                if ((!formatInfo.canRead) || (!formatInfo.canWrite))
                    continue;

                Debug.debug("bitmap test: " + formatInfo.format.name);

                roundtrip(formatInfo, testImage, "bitmap", true);
            }
        }
    }

    public void testGrayscaleRoundtrip() throws Exception {
        BufferedImage testImages[] = { //

        createArgbBitmapImage(1, 1), // minimal
                createArgbGrayscaleImage(2, 2), //
                createArgbGrayscaleImage(10, 10), // larger than 8
                createArgbGrayscaleImage(300, 300), // larger than 256

                createGrayscaleGrayscaleImage(1, 1), // minimal
                createGrayscaleGrayscaleImage(2, 2), //
                createGrayscaleGrayscaleImage(10, 10), // larger than 8
                createGrayscaleGrayscaleImage(300, 300), // larger than 256
        };

        for (int j = 0; j < testImages.length; j++) {
            BufferedImage testImage = testImages[j];

            for (int i = 0; i < FORMAT_INFOS.length; i++) {
                FormatInfo formatInfo = FORMAT_INFOS[i];
                if ((!formatInfo.canRead) || (!formatInfo.canWrite))
                    continue;

                Debug.debug("grayscale test: " + formatInfo.format.name);

                boolean imageExact = true;
                if (formatInfo.colorSupport == COLOR_BITMAP)
                    imageExact = false;

                roundtrip(formatInfo, testImage, "gray", imageExact);
            }
        }
    }

    public void testLimitedColorRoundtrip() throws Exception {
        BufferedImage testImages[] = { //

        createLimitedColorImage(1, 1), // minimal
                createLimitedColorImage(2, 2), //
                createLimitedColorImage(10, 10), // larger than 8
                createLimitedColorImage(300, 300), // larger than 256
        };

        for (int j = 0; j < testImages.length; j++) {
            BufferedImage testImage = testImages[j];

            for (int i = 0; i < FORMAT_INFOS.length; i++) {
                FormatInfo formatInfo = FORMAT_INFOS[i];
                if ((!formatInfo.canRead) || (!formatInfo.canWrite))
                    continue;

                Debug.debug("indexable test: " + formatInfo.format.name);

                boolean imageExact = true;
                if (formatInfo.colorSupport == COLOR_BITMAP)
                    imageExact = false;
                if (formatInfo.colorSupport == COLOR_GRAYSCALE)
                    imageExact = false;

                roundtrip(formatInfo, testImage, "indexable", imageExact);
            }
        }
    }

    public void testFullColorRoundtrip() throws Exception {
        BufferedImage testImages[] = { //

        createFullColorImage(1, 1), // minimal
                createFullColorImage(2, 2), //
                createFullColorImage(10, 10), // larger than 8
                createFullColorImage(300, 300), // larger than 256
        };

        for (int j = 0; j < testImages.length; j++) {
            BufferedImage testImage = testImages[j];

            for (int i = 0; i < FORMAT_INFOS.length; i++) {
                FormatInfo formatInfo = FORMAT_INFOS[i];
                if ((!formatInfo.canRead) || (!formatInfo.canWrite))
                    continue;

                Debug.debug("fullColor test: " + formatInfo.format.name);

                boolean imageExact = true;
                if (formatInfo.colorSupport == COLOR_BITMAP)
                    imageExact = false;
                if (formatInfo.colorSupport == COLOR_GRAYSCALE)
                    imageExact = false;
                if (formatInfo.colorSupport == COLOR_LIMITED_INDEX)
                    imageExact = false;

                roundtrip(formatInfo, testImage, "fullColor", imageExact);
            }
        }
    }
    
    public void testPixelDensityRoundtrip() throws IOException,
            ImageReadException, ImageWriteException {
        BufferedImage testImage = createFullColorImage(2, 2);
        for (FormatInfo formatInfo : FORMAT_INFOS) {
            if (!formatInfo.canRead || !formatInfo.canWrite || !formatInfo.preservesResolution)
                continue;
            
            Debug.debug("pixel density test: " + formatInfo.format.name);

            File temp1 = createTempFile("pixeldensity.", "."
                    + formatInfo.format.extension);
            
            Map params = new HashMap();
            PixelDensity pixelDensity = PixelDensity.createFromPixelsPerInch(75, 150);
            params.put(ImagingConstants.PARAM_KEY_PIXEL_DENSITY, pixelDensity);
            Imaging.writeImage(testImage, temp1, formatInfo.format, params);
            
            ImageInfo imageInfo = Imaging.getImageInfo(temp1);
            if (imageInfo == null)
                continue;
            int xReadDPI = imageInfo.getPhysicalWidthDpi();
            int yReadDPI = imageInfo.getPhysicalHeightDpi();
            // allow a 5% margin of error in storage and conversion
            assertTrue("horizontal pixel density stored wrongly for " + formatInfo.format +
                    " in=" + pixelDensity.horizontalDensityInches() + ", out=" + xReadDPI,
                    Math.abs((xReadDPI - pixelDensity.horizontalDensityInches()) /
                    pixelDensity.horizontalDensityInches()) <= 0.05);
            assertTrue("vertical pixel density stored wrongly for " + formatInfo.format +
                    " in=" + pixelDensity.verticalDensityInches() + ", out=" + yReadDPI,
                    Math.abs((yReadDPI - pixelDensity.verticalDensityInches()) /
                    pixelDensity.verticalDensityInches()) <= 0.05);
        }
    }

    private void roundtrip(FormatInfo formatInfo, BufferedImage testImage,
            String tempPrefix, boolean imageExact) throws IOException,
            ImageReadException, ImageWriteException {
        File temp1 = createTempFile(tempPrefix + ".", "."
                + formatInfo.format.extension);
        // Debug.debug("tempFile: " + tempFile.getName());

        Map params = new HashMap();
        Imaging.writeImage(testImage, temp1, formatInfo.format, params);

        Map readParams = new HashMap();
        readParams.put(ImagingConstants.BUFFERED_IMAGE_FACTORY,
                new RgbBufferedImageFactory());
        BufferedImage image2 = Imaging.getBufferedImage(temp1, readParams);
        assertNotNull(image2);

        if (imageExact) {
            // note tolerance when comparing grayscale images
            // BufferedImages of
            compareImagesExact(testImage, image2);
        }

        if (formatInfo.identicalSecondWrite) {
            File temp2 = createTempFile(tempPrefix + ".", "."
                    + formatInfo.format.extension);
            // Debug.debug("tempFile: " + tempFile.getName());
            Imaging.writeImage(image2, temp2, formatInfo.format, params);

            compareFilesExact(temp1, temp2);
        }
    }

}
