/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.imaging.formats.pnm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingException;
import org.junit.jupiter.api.Test;

class PnmImageParserTest {

    private static final Charset US_ASCII = StandardCharsets.US_ASCII;

    @Test
    void testGetImageInfo_happyCase() throws ImagingException, IOException {
        final byte[] bytes = "P1\n3 2\n0 1 0\n1 0 1\n".getBytes(US_ASCII);
        final PnmImagingParameters params = new PnmImagingParameters();
        final PnmImageParser underTest = new PnmImageParser();
        final ImageInfo results = underTest.getImageInfo(bytes, params);
        assertEquals(results.getBitsPerPixel(), 1);
        assertEquals(results.getWidth(), 3);
        assertEquals(results.getHeight(), 2);
        assertEquals(results.getNumberOfImages(), 1);
    }

    @Test
    void testGetImageInfo_invalidHeight() {
        final byte[] bytes = "P1\n2 a\n0 0\n0 0\n0 0\n0 0\n0 0\n0 1\n1 1\n1 1\n1 1\n1 1\n1 1\n".getBytes(US_ASCII);
        final PnmImagingParameters params = new PnmImagingParameters();
        final PnmImageParser underTest = new PnmImageParser();
        assertThrows(ImagingException.class, () -> underTest.getImageInfo(bytes, params));
    }

    /**
     * If an invalid width is specified, should throw {@link ImagingException} rather than {@link NumberFormatException}.
     */
    @Test
    void testGetImageInfo_invalidWidth() {
        final byte[] bytes = "P1\na 2\n0 0 0 0 0 0 0 0 0 0 0\n1 1 1 1 1 1 1 1 1 1 1\n".getBytes(US_ASCII);
        final PnmImagingParameters params = new PnmImagingParameters();
        final PnmImageParser underTest = new PnmImageParser();
        assertThrows(ImagingException.class, () -> underTest.getImageInfo(bytes, params));
    }

    @Test
    void testGetImageInfo_missingWidthValue() {
        final byte[] bytes = "P7\nWIDTH \n".getBytes(US_ASCII);
        final PnmImagingParameters params = new PnmImagingParameters();
        final PnmImageParser underTest = new PnmImageParser();
        assertThrows(ImagingException.class, () -> underTest.getImageInfo(bytes, params));
    }

    @Test
    void testWriteImageRaw_happyCase() throws ImagingException, ImagingException, IOException {
        final BufferedImage srcImage = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);

        final byte[] dstBytes = Imaging.writeImageToBytes(srcImage, ImageFormats.PNM);
        final BufferedImage dstImage = Imaging.getBufferedImage(dstBytes);

        assertEquals(srcImage.getWidth(), dstImage.getWidth());
        assertEquals(srcImage.getHeight(), dstImage.getHeight());

        final DataBufferInt srcData = (DataBufferInt) srcImage.getRaster().getDataBuffer();
        final DataBufferInt dstData = (DataBufferInt) dstImage.getRaster().getDataBuffer();

        for (int bank = 0; bank < srcData.getNumBanks(); bank++) {
            final int[] actual = srcData.getData(bank);
            final int[] expected = dstData.getData(bank);

            assertArrayEquals(actual, expected);
        }
    }
}
