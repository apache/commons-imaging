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
 *
 * Changed 2015 by Michael Gross, mgmechanics@mgmechanics.de
 */

package org.apache.commons.imaging.formats.png;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingParametersPng;
import org.apache.commons.imaging.ImagingTest;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

public class PngWriteReadTest extends ImagingTest {
    // public PngWriteReadTest(String name)
    // {
    // super(name);
    // }

    private int[][] getSimpleRawData(final int width, final int height, final int value) {
        final int[][] result = new int[height][width];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                result[y][x] = value;
            }
        }
        return result;
    }

    private int[][] getAscendingRawData(final int width, final int height) {
        final int[][] result = new int[height][width];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                final int alpha = (x + y) % 256;
                final int value = (x + y) % 256;
                final int argb = (0xff & alpha) << 24 | (0xff & value) << 16
                        | (0xff & value) << 8 | (0xff & value) << 0;

                result[y][x] = argb;
            }
        }
        return result;
    }

    private int[][] randomRawData(final int width, final int height) {
        final Random random = new Random();
        final int[][] result = new int[height][width];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                final int argb = random.nextInt();
                result[y][x] = argb;
            }
        }
        return result;
    }

    @Test
    public void test() throws Exception {
        final int[][] smallBlackPixels = getSimpleRawData(256, 256, 0);
        final int[][] singleBlackPixel = getSimpleRawData(1, 1, 0);
        final int[][] smallRedPixels = getSimpleRawData(256, 256, 0xffff0000);
        final int[][] singleRedPixel = getSimpleRawData(1, 1, 0xffff0000);
        final int[][] smallAscendingPixels = getAscendingRawData(256, 256);
        final int[][] smallRandomPixels = randomRawData(256, 256);

        final int[][][] testData = { smallBlackPixels, singleBlackPixel,
                smallRedPixels, singleRedPixel, smallAscendingPixels,
                smallRandomPixels, };

        for (final int[][] rawData : testData) {
            writeAndReadImageData(rawData);
        }
    }

    @Test
    public void testTransparency() throws Exception {
        // Test for https://issues.apache.org/jira/browse/SANSELAN-52
        final int[][] smallAscendingPixels = getAscendingRawData(256, 256);
        final byte[] pngBytes = Imaging.writeImageToBytes(
                imageDataToBufferedImage(smallAscendingPixels),
                ImageFormats.PNG, null);
        assertTrue(Imaging.getImageInfo(pngBytes).isTransparent());
    }

    private BufferedImage imageDataToBufferedImage(final int[][] rawData) {
        final int width = rawData[0].length;
        final int height = rawData.length;
        final BufferedImage image = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_ARGB);
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                image.setRGB(x, y, rawData[y][x]);
            }
        }
        return image;
    }

    private int[][] bufferedImageToImageData(final BufferedImage image) {
        final int width = image.getWidth();
        final int height = image.getHeight();
        final int[][] result = new int[height][width];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                result[y][x] = image.getRGB(x, y);
            }
        }
        return result;
    }

    private void writeAndReadImageData(final int[][] rawData) throws IOException,
            ImageReadException, ImageWriteException {
        final BufferedImage srcImage = imageDataToBufferedImage(rawData);

        final ImagingParametersPng writeParams = new ImagingParametersPng();
        // writeParams.setImageFormat(ImageFormats.PNG);
        // writeParams.enableForceTrueColor();

        final byte[] bytes = Imaging.writeImageToBytes(srcImage,
                ImageFormats.PNG, writeParams);

        // Debug.debug("bytes", bytes);

        final File tempFile = createTempFile("temp", ".png");
        FileUtils.writeByteArrayToFile(tempFile, bytes);

        final BufferedImage dstImage = Imaging.getBufferedImage(bytes);

        assertNotNull(dstImage);
        assertTrue(srcImage.getWidth() == dstImage.getWidth());
        assertTrue(srcImage.getHeight() == dstImage.getHeight());

        final int dstData[][] = bufferedImageToImageData(dstImage);
        assertArrayEquals(rawData, dstData);
    }

}
