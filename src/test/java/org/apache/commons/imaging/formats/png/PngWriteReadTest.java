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

package org.apache.commons.imaging.formats.png;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.ImagingTest;
import org.apache.commons.imaging.common.GenericImageMetadata;
import org.apache.commons.imaging.common.ImageMetadata;
import org.junit.jupiter.api.Test;

public class PngWriteReadTest extends ImagingTest {

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

    private int[][] getSimpleRawData(final int width, final int height, final int value) {
        final int[][] result = new int[height][width];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                result[y][x] = value;
            }
        }
        return result;
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
    public void test_withMultipletEXt() throws Exception {
        final int[][] smallBlackPixels = getSimpleRawData(256, 256, 0);

        writeAndReadMultipleEXt(smallBlackPixels);
    }

    @Test
    public void testPhysicalScaleMeters() throws Exception {
        final PngImageParser pngImageParser = new PngImageParser();
        final PngImagingParameters optionalParams = new PngImagingParameters();
        optionalParams.setPhysicalScale(PhysicalScale.createFromMeters(0.01, 0.02));

        final int[][] smallAscendingPixels = getAscendingRawData(256, 256);
        final byte[] pngBytes;
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            pngImageParser.writeImage(imageDataToBufferedImage(smallAscendingPixels), baos, optionalParams);
            pngBytes = baos.toByteArray();
        }
        final PngImageInfo imageInfo = (PngImageInfo) Imaging.getImageInfo(pngBytes);
        final PhysicalScale physicalScale = imageInfo.getPhysicalScale();
        assertTrue(physicalScale.isInMeters());
        assertEquals(0.01, physicalScale.getHorizontalUnitsPerPixel(), 0.001);
        assertEquals(0.02, physicalScale.getVerticalUnitsPerPixel(), 0.001);
    }

    @Test
    public void testPhysicalScaleRadians() throws Exception {
        final PngImageParser pngImageParser = new PngImageParser();
        final PngImagingParameters optionalParams = new PngImagingParameters();
        optionalParams.setPhysicalScale(PhysicalScale.createFromRadians(0.01, 0.02));

        final int[][] smallAscendingPixels = getAscendingRawData(256, 256);
        final byte[] pngBytes;
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            pngImageParser.writeImage(imageDataToBufferedImage(smallAscendingPixels), baos, optionalParams);
            pngBytes = baos.toByteArray();
        }
        final PngImageInfo imageInfo = (PngImageInfo) Imaging.getImageInfo(pngBytes);
        final PhysicalScale physicalScale = imageInfo.getPhysicalScale();
        assertTrue(physicalScale.isInRadians());
        assertEquals(0.01, physicalScale.getHorizontalUnitsPerPixel(), 0.001);
        assertEquals(0.02, physicalScale.getVerticalUnitsPerPixel(), 0.001);
    }

    @Test
    public void testTransparency() throws Exception {
        // Test for https://issues.apache.org/jira/browse/SANSELAN-52
        final int[][] smallAscendingPixels = getAscendingRawData(256, 256);
        final byte[] pngBytes = Imaging.writeImageToBytes(imageDataToBufferedImage(smallAscendingPixels), ImageFormats.PNG);
        assertTrue(Imaging.getImageInfo(pngBytes).isTransparent());
    }

    private void writeAndReadImageData(final int[][] rawData) throws IOException,
            ImagingException, ImagingException {
        final BufferedImage srcImage = imageDataToBufferedImage(rawData);

        final byte[] bytes = Imaging.writeImageToBytes(srcImage, ImageFormats.PNG);

        final BufferedImage dstImage = Imaging.getBufferedImage(bytes);

        assertNotNull(dstImage);
        assertEquals(srcImage.getWidth(), dstImage.getWidth());
        assertEquals(srcImage.getHeight(), dstImage.getHeight());

        final int[][] dstData = bufferedImageToImageData(dstImage);
        assertArrayEquals(rawData, dstData);
    }

    private void writeAndReadMultipleEXt(final int[][] rawData) throws IOException,
       ImagingException, ImagingException {
        final BufferedImage srcImage = imageDataToBufferedImage(rawData);

        final List<PngText.Text> textChunks = new LinkedList<>();
        textChunks.add(new PngText.Text("a", "b"));
        textChunks.add(new PngText.Text("c", "d"));
        final PngImagingParameters writeParams = new PngImagingParameters();
        writeParams.setTextChunks(textChunks);

        final PngImageParser pngImageParser = new PngImageParser();
        final byte[] bytes;
        try (ByteArrayOutputStream os = new ByteArrayOutputStream()) {
            pngImageParser.writeImage(srcImage, os, writeParams);
            bytes = os.toByteArray();
        }

        final BufferedImage dstImage = Imaging.getBufferedImage(bytes);

        assertNotNull(dstImage);
        assertEquals(srcImage.getWidth(), dstImage.getWidth());
        assertEquals(srcImage.getHeight(), dstImage.getHeight());

        final int[][] dstData = bufferedImageToImageData(dstImage);
        assertArrayEquals(rawData, dstData);

        final ImageMetadata imageMetadata = Imaging.getMetadata(bytes);
        assertEquals(imageMetadata.getItems().size(), 2);
        final GenericImageMetadata.GenericImageMetadataItem item0
           = (GenericImageMetadata.GenericImageMetadataItem)imageMetadata.getItems().get(0);
        assertEquals(item0.getKeyword(), "a");
        assertEquals(item0.getText(), "b");
        final GenericImageMetadata.GenericImageMetadataItem item1
           = (GenericImageMetadata.GenericImageMetadataItem)imageMetadata.getItems().get(1);
        assertEquals(item1.getKeyword(), "c");
        assertEquals(item1.getText(), "d");
    }
}
