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
package org.apache.commons.imaging.formats.tiff;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import static org.junit.jupiter.api.Assertions.fail;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingException;
import org.junit.jupiter.api.Test;

import org.apache.commons.imaging.formats.tiff.TiffImageParser;
import java.awt.Rectangle;


public class TiffSubImageTest extends TiffBaseTest {
    final List<File> imageFileList;

    TiffSubImageTest() throws IOException, ImagingException {
        imageFileList = getTiffImages();
    }

    private void processBadParams(final File target, final int x, final int y, final int width, final int height, final String comment) throws IOException {
        final TiffImageParser tiffImageParser = new TiffImageParser();
        try {
            final TiffImagingParameters params = new TiffImagingParameters();
            params.setSubImage(x, y, width, height);
            tiffImageParser.getBufferedImage(target, params);
            fail("Reading TIFF sub-image failed to detect bad parameter: " + comment);
        } catch (final ImagingException | IllegalArgumentException ire) {
            // the test passed
        }
    }

    @Test
    public void testBadSubImage() throws ImagingException, IOException {
        final TiffImageParser tiffImageParser = new TiffImageParser();
        final File target = imageFileList.get(0);
        final BufferedImage referenceImage = Imaging.getBufferedImage(target);
        final int width = referenceImage.getWidth();
        final int height = referenceImage.getHeight();

        final TiffImagingParameters params = new TiffImagingParameters();
        params.setSubImage(0, 0, width, height);

        final BufferedImage image = tiffImageParser.getBufferedImage(target, params);
        assertEquals(image.getWidth(), width, "Improper width when sub-imaging entire image");
        assertEquals(image.getHeight(), height, "Improper height when sub-imaging entire image");

        processBadParams(target, -1, 0, width, height, "negative x position");
        processBadParams(target, 0, -1, width, height, "negative y position");
        processBadParams(target, 0, 0, 0, height, "zero width");
        processBadParams(target, 0, 0, width, 0, "zero height");
        processBadParams(target, 1, 0, width, height, "sub-image width extends beyond bounds");
        processBadParams(target, 0, 1, width, height, "sub-image height extends beyond bounds");
    }

    @Test
    public void testSubImage() throws ImagingException, ImagingException, IOException {
        final TiffImageParser tiffImageParser = new TiffImageParser();
        final BufferedImage src = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        final TiffImagingParameters params = new TiffImagingParameters();
        final byte[] imageBytes;
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            tiffImageParser.writeImage(src, baos, params);
            imageBytes = baos.toByteArray();
        }

        params.setSubImage(0, 0, 2, 3);
        final BufferedImage image = tiffImageParser.getBufferedImage(imageBytes, params);
        assertEquals(image.getWidth(), 2);
        assertEquals(image.getHeight(), 3);
    }

    @Test
    public void testSubImageCorrectness() throws ImagingException, IOException {
        final TiffImageParser tiffImageParser = new TiffImageParser();
        for (final File target : imageFileList) {
            final BufferedImage referenceImage = Imaging.getBufferedImage(target);
            final int rW = referenceImage.getWidth();
            final int rH = referenceImage.getHeight();
            if (rW < 3 || rH < 3) {
                continue;
            }
            final int[] rArgb = new int[rW * rH];
            referenceImage.getRGB(0, 0, rW, rH, rArgb, 0, rW);
            final TiffImagingParameters params = new TiffImagingParameters();
            params.setSubImage(1, 1, rW - 2, rH - 2);
            final BufferedImage image = tiffImageParser.getBufferedImage(target, params);
            final int iW = image.getWidth();
            final int iH = image.getHeight();
            assertEquals(iW, rW - 2, "Invalid subimage width");
            assertEquals(iH, rH - 2, "Invalid subimage height");
            final int[] iArgb = new int[iW * iH];
            image.getRGB(0, 0, iW, iH, iArgb, 0, iW);
            for (int i = 0; i < iH; i++) {
                for (int j = 0; j < iW; j++) {
                    final int rTest = rArgb[(i + 1) * rW + j + 1];
                    final int iTest = iArgb[i * iW + j];
                    assertEquals(iTest, rTest, "Invalid pixel lookup for " + target.getName() + " at " + i + ", " + j);
                }
            }
        }
    }
    @Test
    public void testValidateSubImage_ThrowsExceptionForInvalidWidth() {
        Rectangle invalidRect = new Rectangle(0, 0, 0, 10);
        assertThrows(ImagingException.class, 
            () -> TiffImageParser.validateSubImage(invalidRect, 100, 100));
    }

    @Test
    public void testValidateSubImage_ThrowsExceptionForInvalidHeight() {
        Rectangle invalidRect = new Rectangle(0, 0, 10, 0);
        assertThrows(ImagingException.class, 
            () -> TiffImageParser.validateSubImage(invalidRect, 100, 100));
    }

    @Test
    public void testValidateSubImage_ThrowsExceptionForOutOfBoundsX() {
        Rectangle invalidRect = new Rectangle(-1, 0, 10, 10);
        assertThrows(ImagingException.class, 
            () -> TiffImageParser.validateSubImage(invalidRect, 100, 100));

        invalidRect.x = 110;
        assertThrows(ImagingException.class, 
        () -> TiffImageParser.validateSubImage(invalidRect, 100, 100));
    }

    @Test
    public void testValidateSubImage_ThrowsExceptionForOutOfBoundsY() {
        Rectangle invalidRect = new Rectangle(0, -1, 10, 10);
        assertThrows(ImagingException.class, 
            () -> TiffImageParser.validateSubImage(invalidRect, 100, 100));
        
        invalidRect.y = 110;
        assertThrows(ImagingException.class, 
        () -> TiffImageParser.validateSubImage(invalidRect, 100, 100));
    }

}
