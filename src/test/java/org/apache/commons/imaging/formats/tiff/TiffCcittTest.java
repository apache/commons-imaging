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
import static org.junit.jupiter.api.Assertions.fail;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;
import org.apache.commons.imaging.formats.tiff.itu_t4.T4AndT6Compression;
import org.apache.commons.imaging.internal.Debug;
import org.junit.jupiter.api.Test;

public class TiffCcittTest extends TiffBaseTest {

    /**
     * Generates the next combination of elements in the sequence array, with each element having a maximum value of max. Initially, the sequence should be set
     * to minimum values of each element.
     *
     * @param sequence the array of elements to update
     * @param max      the maximum value of each element in the sequence
     * @return false if there is no more combinations (ie. nothing was done), true otherwise
     */
    private static boolean nextCombination(final int[] sequence, final int max) {
        int i;
        for (i = 0; i < sequence.length; i++) {
            if (sequence[i] != max) {
                sequence[i]++;
                break;
            }
            sequence[i] = 0;
        }
        return i < sequence.length;
    }

    private void compareImages(final BufferedImage a, final BufferedImage b) {
        assertEquals(a.getWidth(), b.getWidth());
        assertEquals(a.getHeight(), b.getHeight());

        for (int x = 0; x < a.getWidth(); x++) {
            for (int y = 0; y < a.getHeight(); y++) {
                final int aArgb = a.getRGB(x, y);
                final int bArgb = b.getRGB(x, y);
                if (aArgb != bArgb) {
                    Debug.debug("width: " + a.getWidth());
                    Debug.debug("height: " + a.getHeight());
                    Debug.debug("x: " + x);
                    Debug.debug("y: " + y);
                    Debug.debug("aArgb: " + aArgb + " (0x" + Integer.toHexString(aArgb) + ")");
                    Debug.debug("bArgb: " + bArgb + " (0x" + Integer.toHexString(bArgb) + ")");
                }
                assertEquals(aArgb, bArgb);
            }
        }
    }

    @Test
    public void testAll5x2Compressions() {
        final byte[] uncompressed = new byte[2];
        final int[] combinations = new int[10];
        do {
            for (int x = 0; x < 5; x++) {
                if (combinations[x] != 0) {
                    uncompressed[0] |= 0x80 >>> x;
                }
            }
            for (int x = 0; x < 5; x++) {
                if (combinations[5 + x] != 0) {
                    uncompressed[1] |= 0x80 >>> x;
                }
            }

            try {
                final byte[] compressed = T4AndT6Compression.compressModifiedHuffman(uncompressed, 5, 2);
                final byte[] result = T4AndT6Compression.decompressModifiedHuffman(compressed, 5, 2);
                assertEquals(uncompressed.length, result.length);
                for (int i = 0; i < uncompressed.length; i++) {
                    assertEquals(uncompressed[i], result[i]);
                }
            } catch (final ImagingException ex) {
                Debug.debug(ex);
                fail();
            }

            try {
                final byte[] compressed = T4AndT6Compression.compressT4_1D(uncompressed, 5, 2, true);
                final byte[] result = T4AndT6Compression.decompressT4_1D(compressed, 5, 2, true);
                assertEquals(uncompressed.length, result.length);
                for (int i = 0; i < uncompressed.length; i++) {
                    assertEquals(uncompressed[i], result[i]);
                }
            } catch (final ImagingException ex) {
                Debug.debug(ex);
                fail();
            }

            try {
                final byte[] compressed = T4AndT6Compression.compressT4_1D(uncompressed, 5, 2, false);
                final byte[] result = T4AndT6Compression.decompressT4_1D(compressed, 5, 2, false);
                assertEquals(uncompressed.length, result.length);
                for (int i = 0; i < uncompressed.length; i++) {
                    assertEquals(uncompressed[i], result[i]);
                }
            } catch (final ImagingException ex) {
                Debug.debug(ex);
                fail();
            }

            try {
                final byte[] compressed = T4AndT6Compression.compressT4_2D(uncompressed, 5, 2, true, 2);
                final byte[] result = T4AndT6Compression.decompressT4_2D(compressed, 5, 2, true);
                assertEquals(uncompressed.length, result.length);
                for (int i = 0; i < uncompressed.length; i++) {
                    assertEquals(uncompressed[i], result[i]);
                }
            } catch (final ImagingException ex) {
                Debug.debug(ex);
                fail();
            }

            try {
                final byte[] compressed = T4AndT6Compression.compressT4_2D(uncompressed, 5, 2, false, 2);
                final byte[] result = T4AndT6Compression.decompressT4_2D(compressed, 5, 2, false);
                assertEquals(uncompressed.length, result.length);
                for (int i = 0; i < uncompressed.length; i++) {
                    assertEquals(uncompressed[i], result[i]);
                }
            } catch (final ImagingException ex) {
                Debug.debug(ex);
                fail();
            }

            try {
                final byte[] compressed = T4AndT6Compression.compressT6(uncompressed, 5, 2);
                final byte[] result = T4AndT6Compression.decompressT6(compressed, 5, 2);
                assertEquals(uncompressed.length, result.length);
                for (int i = 0; i < uncompressed.length; i++) {
                    assertEquals(uncompressed[i], result[i]);
                }
            } catch (final ImagingException ex) {
                Debug.debug(ex);
                fail();
            }
        } while (nextCombination(combinations, 1));
    }

    @Test
    public void testAll5x2Images() {
        final int[] combinations = new int[10];
        final BufferedImage image = new BufferedImage(5, 2, BufferedImage.TYPE_INT_RGB);
        do {
            for (int x = 0; x < 5; x++) {
                if (combinations[x] == 0) {
                    image.setRGB(x, 0, 0xFFFFFF);
                } else {
                    image.setRGB(x, 0, 0);
                }
            }
            for (int x = 0; x < 5; x++) {
                if (combinations[5 + x] == 0) {
                    image.setRGB(x, 1, 0xFFFFFF);
                } else {
                    image.setRGB(x, 1, 0);
                }
            }

            try {
                final TiffImagingParameters params = new TiffImagingParameters();
                params.setCompression(TiffConstants.COMPRESSION_CCITT_1D);
                final TiffImageParser tiffImageParser = new TiffImageParser();
                final byte[] compressed;
                try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                    tiffImageParser.writeImage(image, baos, params);
                    compressed = baos.toByteArray();
                }
                final BufferedImage result = Imaging.getBufferedImage(compressed);
                compareImages(image, result);
            } catch (final IOException ex) {
                Debug.debug(ex);
                fail();
            }

            final TiffImageParser tiffImageParser = new TiffImageParser();

            try {
                final TiffImagingParameters params = new TiffImagingParameters();
                params.setCompression(TiffConstants.COMPRESSION_CCITT_GROUP_3);
                params.setT4Options(0);
                final byte[] compressed;
                try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                    tiffImageParser.writeImage(image, baos, params);
                    compressed = baos.toByteArray();
                }
                final BufferedImage result = Imaging.getBufferedImage(compressed);
                compareImages(image, result);
            } catch (final IOException ex) {
                Debug.debug(ex);
                fail();
            }

            try {
                final TiffImagingParameters params = new TiffImagingParameters();
                params.setCompression(TiffConstants.COMPRESSION_CCITT_GROUP_3);
                params.setT4Options(4);
                final byte[] compressed;
                try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                    tiffImageParser.writeImage(image, baos, params);
                    compressed = baos.toByteArray();
                }
                final BufferedImage result = Imaging.getBufferedImage(compressed);
                compareImages(image, result);
            } catch (final IOException ex) {
                Debug.debug(ex);
                fail();
            }

            try {
                final TiffImagingParameters params = new TiffImagingParameters();
                params.setCompression(TiffConstants.COMPRESSION_CCITT_GROUP_3);
                params.setT4Options(1);
                final byte[] compressed;
                try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                    tiffImageParser.writeImage(image, baos, params);
                    compressed = baos.toByteArray();
                }
                final BufferedImage result = Imaging.getBufferedImage(compressed);
                compareImages(image, result);
            } catch (final IOException ex) {
                Debug.debug(ex);
                fail();
            }

            try {
                final TiffImagingParameters params = new TiffImagingParameters();
                params.setCompression(TiffConstants.COMPRESSION_CCITT_GROUP_3);
                params.setT4Options(5);
                final byte[] compressed;
                try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                    tiffImageParser.writeImage(image, baos, params);
                    compressed = baos.toByteArray();
                }
                final BufferedImage result = Imaging.getBufferedImage(compressed);
                compareImages(image, result);
            } catch (final IOException ex) {
                Debug.debug(ex);
                fail();
            }

            try {
                final TiffImagingParameters params = new TiffImagingParameters();
                params.setCompression(TiffConstants.COMPRESSION_CCITT_GROUP_4);
                final byte[] compressed;
                try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                    tiffImageParser.writeImage(image, baos, params);
                    compressed = baos.toByteArray();
                }
                final BufferedImage result = Imaging.getBufferedImage(compressed);
                compareImages(image, result);
            } catch (final IOException ex) {
                Debug.debug(ex);
                fail();
            }
        } while (nextCombination(combinations, 1));
    }
}
