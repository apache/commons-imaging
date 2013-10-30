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

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;

import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.common.itu_t4.T4AndT6Compression;
import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;
import org.apache.commons.imaging.util.Debug;

public class TiffCcittTest extends TiffBaseTest {
    public void testAll5x2Compressions() {
        final byte[] uncompressed = new byte[2];
        final int[] combinations = new int[10];
        do {
            for (int x = 0; x < 5; x++) {
                if (combinations[x] != 0) {
                    uncompressed[0] |= (0x80 >>> x);
                }
            }
            for (int x = 0; x < 5; x++) {
                if (combinations[5 + x] != 0) {
                    uncompressed[1] |= (0x80 >>> x);
                }
            }

            try {
                final byte[] compressed = T4AndT6Compression.compressModifiedHuffman(
                        uncompressed, 5, 2);
                final byte[] result = T4AndT6Compression.decompressModifiedHuffman(
                        compressed, 5, 2);
                assertEquals(uncompressed.length, result.length);
                for (int i = 0; i < uncompressed.length; i++) {
                    assertEquals(uncompressed[i], result[i]);
                }
            } catch (final ImageWriteException ex) {
                Debug.debug(ex);
                assertFalse(true);
            } catch (final ImageReadException ex) {
                Debug.debug(ex);
                assertFalse(true);
            }

            try {
                final byte[] compressed = T4AndT6Compression.compressT4_1D(
                        uncompressed, 5, 2, true);
                final byte[] result = T4AndT6Compression.decompressT4_1D(compressed,
                        5, 2, true);
                assertEquals(uncompressed.length, result.length);
                for (int i = 0; i < uncompressed.length; i++) {
                    assertEquals(uncompressed[i], result[i]);
                }
            } catch (final ImageWriteException ex) {
                Debug.debug(ex);
                assertFalse(true);
            } catch (final ImageReadException ex) {
                Debug.debug(ex);
                assertFalse(true);
            }

            try {
                final byte[] compressed = T4AndT6Compression.compressT4_1D(
                        uncompressed, 5, 2, false);
                final byte[] result = T4AndT6Compression.decompressT4_1D(compressed,
                        5, 2, false);
                assertEquals(uncompressed.length, result.length);
                for (int i = 0; i < uncompressed.length; i++) {
                    assertEquals(uncompressed[i], result[i]);
                }
            } catch (final ImageWriteException ex) {
                Debug.debug(ex);
                assertFalse(true);
            } catch (final ImageReadException ex) {
                Debug.debug(ex);
                assertFalse(true);
            }

            try {
                final byte[] compressed = T4AndT6Compression.compressT4_2D(
                        uncompressed, 5, 2, true, 2);
                final byte[] result = T4AndT6Compression.decompressT4_2D(compressed,
                        5, 2, true);
                assertEquals(uncompressed.length, result.length);
                for (int i = 0; i < uncompressed.length; i++) {
                    assertEquals(uncompressed[i], result[i]);
                }
            } catch (final ImageWriteException ex) {
                Debug.debug(ex);
                assertFalse(true);
            } catch (final ImageReadException ex) {
                Debug.debug(ex);
                assertFalse(true);
            }

            try {
                final byte[] compressed = T4AndT6Compression.compressT4_2D(
                        uncompressed, 5, 2, false, 2);
                final byte[] result = T4AndT6Compression.decompressT4_2D(compressed,
                        5, 2, false);
                assertEquals(uncompressed.length, result.length);
                for (int i = 0; i < uncompressed.length; i++) {
                    assertEquals(uncompressed[i], result[i]);
                }
            } catch (final ImageWriteException ex) {
                Debug.debug(ex);
                assertFalse(true);
            } catch (final ImageReadException ex) {
                Debug.debug(ex);
                assertFalse(true);
            }

            try {
                final byte[] compressed = T4AndT6Compression.compressT6(uncompressed,
                        5, 2);
                final byte[] result = T4AndT6Compression.decompressT6(compressed, 5,
                        2);
                assertEquals(uncompressed.length, result.length);
                for (int i = 0; i < uncompressed.length; i++) {
                    assertEquals(uncompressed[i], result[i]);
                }
            } catch (final ImageWriteException ex) {
                Debug.debug(ex);
                assertFalse(true);
            } catch (final ImageReadException ex) {
                Debug.debug(ex);
                assertFalse(true);
            }
        } while (nextCombination(combinations, 1));
    }

    public void testAll5x2Images() {
        final int[] combinations = new int[10];
        final BufferedImage image = new BufferedImage(5, 2,
                BufferedImage.TYPE_INT_RGB);
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
                final HashMap<String,Object> params = new HashMap<String,Object>();
                params.put(ImagingConstants.PARAM_KEY_COMPRESSION,
                        TiffConstants.TIFF_COMPRESSION_CCITT_1D);
                final byte[] compressed = Imaging.writeImageToBytes(image,
                        ImageFormats.TIFF, params);
                final BufferedImage result = Imaging.getBufferedImage(compressed);
                compareImages(image, result);
            } catch (final ImageWriteException ex) {
                Debug.debug(ex);
                assertFalse(true);
            } catch (final ImageReadException ex) {
                Debug.debug(ex);
                assertFalse(true);
            } catch (final IOException ex) {
                Debug.debug(ex);
                assertFalse(true);
            }

            try {
                final HashMap<String,Object> params = new HashMap<String,Object>();
                params.put(ImagingConstants.PARAM_KEY_COMPRESSION,
                        TiffConstants.TIFF_COMPRESSION_CCITT_GROUP_3);
                params.put(TiffConstants.PARAM_KEY_T4_OPTIONS, 0);
                final byte[] compressed = Imaging.writeImageToBytes(image,
                        ImageFormats.TIFF, params);
                final BufferedImage result = Imaging.getBufferedImage(compressed);
                compareImages(image, result);
            } catch (final ImageWriteException ex) {
                Debug.debug(ex);
                assertFalse(true);
            } catch (final ImageReadException ex) {
                Debug.debug(ex);
                assertFalse(true);
            } catch (final IOException ex) {
                Debug.debug(ex);
                assertFalse(true);
            }

            try {
                final HashMap<String,Object> params = new HashMap<String,Object>();
                params.put(ImagingConstants.PARAM_KEY_COMPRESSION,
                        TiffConstants.TIFF_COMPRESSION_CCITT_GROUP_3);
                params.put(TiffConstants.PARAM_KEY_T4_OPTIONS, 4);
                final byte[] compressed = Imaging.writeImageToBytes(image,
                        ImageFormats.TIFF, params);
                final BufferedImage result = Imaging.getBufferedImage(compressed);
                compareImages(image, result);
            } catch (final ImageWriteException ex) {
                Debug.debug(ex);
                assertFalse(true);
            } catch (final ImageReadException ex) {
                Debug.debug(ex);
                assertFalse(true);
            } catch (final IOException ex) {
                Debug.debug(ex);
                assertFalse(true);
            }

            try {
                final HashMap<String,Object> params = new HashMap<String,Object>();
                params.put(ImagingConstants.PARAM_KEY_COMPRESSION,
                        TiffConstants.TIFF_COMPRESSION_CCITT_GROUP_3);
                params.put(TiffConstants.PARAM_KEY_T4_OPTIONS, 1);
                final byte[] compressed = Imaging.writeImageToBytes(image,
                        ImageFormats.TIFF, params);
                final BufferedImage result = Imaging.getBufferedImage(compressed);
                compareImages(image, result);
            } catch (final ImageWriteException ex) {
                Debug.debug(ex);
                assertFalse(true);
            } catch (final ImageReadException ex) {
                Debug.debug(ex);
                assertFalse(true);
            } catch (final IOException ex) {
                Debug.debug(ex);
                assertFalse(true);
            }

            try {
                final HashMap<String,Object> params = new HashMap<String,Object>();
                params.put(ImagingConstants.PARAM_KEY_COMPRESSION,
                        TiffConstants.TIFF_COMPRESSION_CCITT_GROUP_3);
                params.put(TiffConstants.PARAM_KEY_T4_OPTIONS, 5);
                final byte[] compressed = Imaging.writeImageToBytes(image,
                        ImageFormats.TIFF, params);
                final BufferedImage result = Imaging.getBufferedImage(compressed);
                compareImages(image, result);
            } catch (final ImageWriteException ex) {
                Debug.debug(ex);
                assertFalse(true);
            } catch (final ImageReadException ex) {
                Debug.debug(ex);
                assertFalse(true);
            } catch (final IOException ex) {
                Debug.debug(ex);
                assertFalse(true);
            }

            try {
                final HashMap<String,Object> params = new HashMap<String,Object>();
                params.put(ImagingConstants.PARAM_KEY_COMPRESSION,
                        TiffConstants.TIFF_COMPRESSION_CCITT_GROUP_4);
                final byte[] compressed = Imaging.writeImageToBytes(image,
                        ImageFormats.TIFF, params);
                final BufferedImage result = Imaging.getBufferedImage(compressed);
                compareImages(image, result);
            } catch (final ImageWriteException ex) {
                Debug.debug(ex);
                assertFalse(true);
            } catch (final ImageReadException ex) {
                Debug.debug(ex);
                assertFalse(true);
            } catch (final IOException ex) {
                Debug.debug(ex);
                assertFalse(true);
            }
        } while (nextCombination(combinations, 1));
    }

    /**
     * Generates the next combination of elements in the sequence array, with
     * each element having a maximum value of max. Initially, the sequence
     * should be set to minimum values of each element.
     * 
     * @param sequence
     *            the array of elements to update
     * @param max
     *            the maximum value of each element in the sequence
     * @return false if there is no more combinations (ie. nothing was done),
     *         true otherwise
     */
    private static boolean nextCombination(final int[] sequence, final int max) {
        int i;
        for (i = 0; i < sequence.length; i++) {
            if (sequence[i] == max) {
                sequence[i] = 0;
            } else {
                sequence[i]++;
                break;
            }
        }
        return i < sequence.length;
    }

    private void compareImages(final BufferedImage a, final BufferedImage b) {
        assertEquals(a.getWidth(), b.getWidth());
        assertEquals(a.getHeight(), b.getHeight());

        for (int x = 0; x < a.getWidth(); x++) {
            for (int y = 0; y < a.getHeight(); y++) {
                final int a_argb = a.getRGB(x, y);
                final int b_argb = b.getRGB(x, y);
                if (a_argb != b_argb) {
                    Debug.debug("width", a.getWidth());
                    Debug.debug("height", a.getHeight());
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
    }
}
