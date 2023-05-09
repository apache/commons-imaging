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
package org.apache.commons.imaging;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.imaging.ImageInfo.ColorType;
import org.apache.commons.imaging.ImageInfo.CompressionAlgorithm;
import org.junit.jupiter.api.Test;

public class TestImageInfo {

    @Test
    public void testColorType() {
        // ColorType is an enum within ImageInfo. We don't want to test every value
        // of the enum. Just that one has the right values should be enough.
        assertEquals("RGB", ColorType.RGB.toString());
        assertEquals(ColorType.RGB, ColorType.valueOf("RGB"));
    }

    @Test
    public void testCompressionAlgorithm() {
        assertEquals("LZW", CompressionAlgorithm.LZW.toString());
        assertEquals(CompressionAlgorithm.LZW, CompressionAlgorithm.valueOf("LZW"));
    }

    @Test
    public void testImageInfo() {
        final String formatDetails = "image-info-format-details";
        final int bitsPerPixel = 2;
        final List<String> comments = Arrays.asList("a", "b", "c");
        final ImageFormat format = ImageFormats.BMP;
        final String formatName = format.getName();
        final int height = 2;
        final String mimeType = "image-info-mimetype";
        final int numberOfImages = 2;
        final int physicalHeightDpi = 2;
        final float physicalHeightInch = 2.0f;
        final int physicalWidthDpi = 2;
        final float physicalWidthInch = 2.0f;
        final int width = 2;
        final boolean progressive = true;
        final boolean transparent = true;
        final boolean usesPalette = true;
        final ColorType colorType = ColorType.GRAYSCALE;
        final CompressionAlgorithm compressionAlgorithm = CompressionAlgorithm.JPEG;

        final ImageInfo imageInfo = new ImageInfo(formatDetails, bitsPerPixel, comments, format, formatName, height,
                mimeType, numberOfImages, physicalHeightDpi, physicalHeightInch, physicalWidthDpi, physicalWidthInch,
                width, progressive, transparent, usesPalette, colorType, compressionAlgorithm);
        assertEquals(formatDetails, imageInfo.getFormatDetails());
        assertEquals(bitsPerPixel, imageInfo.getBitsPerPixel());
        assertEquals(comments.toString(), imageInfo.getComments()
                .toString());
        assertEquals(format, imageInfo.getFormat());
        assertEquals(formatName, imageInfo.getFormatName());
        assertEquals(height, imageInfo.getHeight());
        assertEquals(mimeType, imageInfo.getMimeType());
        assertEquals(numberOfImages, imageInfo.getNumberOfImages());
        assertEquals(physicalHeightDpi, imageInfo.getPhysicalHeightDpi());
        assertEquals(physicalHeightInch, imageInfo.getPhysicalHeightInch());
        assertEquals(physicalWidthDpi, imageInfo.getPhysicalWidthDpi());
        assertEquals(physicalWidthInch, imageInfo.getPhysicalWidthInch());
        assertEquals(width, imageInfo.getWidth());
        assertEquals(progressive, imageInfo.isProgressive());
        assertEquals(transparent, imageInfo.isTransparent());
        assertEquals(usesPalette, imageInfo.usesPalette());
        assertEquals(colorType, imageInfo.getColorType());
        assertEquals(compressionAlgorithm, imageInfo.getCompressionAlgorithm());
    }

    @Test
    public void testToStringEmptyComments() {
        final ImageInfo imageInfo = new ImageInfo(null, 0, new ArrayList<String>(), ImageFormats.DCX, null, 0, null, 0, 0, 0.0f, 0, 0.0f, 0, false,
                false, false, ColorType.BW, null);
        final String expected = "Format Details: null\n" +
                "Bits Per Pixel: 0\n" +
                "Comments: 0\n" +
                "Format: DCX\n" +
                "Format Name: null\n" +
                "Compression Algorithm: null\n" +
                "Height: 0\n" +
                "MimeType: null\n" +
                "Number Of Images: 0\n" +
                "Physical Height Dpi: 0\n" +
                "Physical Height Inch: 0.0\n" +
                "Physical Width Dpi: 0\n" +
                "Physical Width Inch: 0.0\n" +
                "Width: 0\n" +
                "Is Progressive: false\n" +
                "Is Transparent: false\n" +
                "Color Type: Black and White\n" +
                "Uses Palette: false\n";
        final String testString = imageInfo.toString().replaceAll("\\r", "");
        assertEquals(expected, testString);
    }

    @Test
    public void testToStringErrorWhenColorPaletteIsNull() {
        final ImageInfo imageInfo = new ImageInfo(null, 0, new ArrayList<>(), ImageFormats.DCX, null, 0, null, 0, 0, 0.0f, 0, 0.0f, 0, false,
                false, false, null, null);
        assertEquals("Image Data: Error", imageInfo.toString());
    }

    @Test
    public void testToStringErrorWhenCommentsIsNull() {
        final ImageInfo imageInfo = new ImageInfo(null, 0, null, null, null, 0, null, 0, 0, 0.0f, 0, 0.0f, 0, false,
                false, false, null, null);
        assertEquals("Image Data: Error", imageInfo.toString());
    }

    @Test
    public void testToStringErrorWhenFormatIsNull() {
        final ImageInfo imageInfo = new ImageInfo(null, 0, new ArrayList<>(), null, null, 0, null, 0, 0, 0.0f, 0, 0.0f, 0, false,
                false, false, ColorType.BW, null);
        assertEquals("Image Data: Error", imageInfo.toString());
    }

    @Test
    public void testToStringWithComments() {
        final ImageInfo imageInfo = new ImageInfo(null, 0, Arrays.asList("a", "b"), ImageFormats.DCX, null, 0, null, 0, 0, 0.0f, 0, 0.0f, 0, false,
                false, false, ColorType.BW, null);
        final String expected = "Format Details: null\n" +
                "Bits Per Pixel: 0\n" +
                "Comments: 2\n" +
                "\t0: 'a'\n" +
                "\t1: 'b'\n" +
                "Format: DCX\n" +
                "Format Name: null\n" +
                "Compression Algorithm: null\n" +
                "Height: 0\n" +
                "MimeType: null\n" +
                "Number Of Images: 0\n" +
                "Physical Height Dpi: 0\n" +
                "Physical Height Inch: 0.0\n" +
                "Physical Width Dpi: 0\n" +
                "Physical Width Inch: 0.0\n" +
                "Width: 0\n" +
                "Is Progressive: false\n" +
                "Is Transparent: false\n" +
                "Color Type: Black and White\n" +
                "Uses Palette: false\n";
        final String testString = imageInfo.toString().replaceAll("\\r", "");
        assertEquals(expected, testString);
    }
}
