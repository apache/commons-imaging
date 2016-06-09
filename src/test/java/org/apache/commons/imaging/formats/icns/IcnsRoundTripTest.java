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

package org.apache.commons.imaging.formats.icns;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteOrder;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.util.Debug;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

public class IcnsRoundTripTest extends IcnsBaseTest {
    // 16x16 test image
    private static final int[][] IMAGE = {
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
        {0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0},
        {0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0},
        {0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0},
        {0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0},
        {0,0,0,0,0,1,1,1,0,1,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
    };

    @Test
    public void test1BPPIconMaskVersus8BPPMask() throws Exception {
        final int foreground = 0xff000000;
        final int background = 0xff000000;
        try (final ByteArrayOutputStream baos = new ByteArrayOutputStream();
                final BinaryOutputStream bos = new BinaryOutputStream(baos, ByteOrder.BIG_ENDIAN)) {
            bos.write4Bytes(IcnsImageParser.ICNS_MAGIC);
            bos.write4Bytes(4 + 4 + 4 + 4 + 2 * 16 * 16 / 8 + 4 + 4 + 16 * 16);
            bos.write4Bytes(IcnsType.ICNS_16x16_1BIT_IMAGE_AND_MASK.getType());
            bos.write4Bytes(4 + 4 + 2 * 16 * 16 / 8);
            // 1 BPP image - all black
            for (int y = 0; y < 16; y++) {
                bos.write(0xff);
                bos.write(0xff);
            }
            // 1 BPP mask - all opaque
            for (int y = 0; y < 16; y++) {
                bos.write(0xff);
                bos.write(0xff);
            }
            // 8 BPP alpha mask - partially transparent
            bos.write4Bytes(IcnsType.ICNS_16x16_8BIT_MASK.getType());
            bos.write4Bytes(4 + 4 + 16 * 16);
            for (int y = 0; y < 16; y++) {
                for (int x = 0; x < 16; x++) {
                    if (IMAGE[y][x] != 0) {
                        bos.write(0xff);
                    } else {
                        bos.write(0x00);
                    }
                }
            }
            bos.flush();
            writeAndReadImageData("1bpp-image-mask-versus-8bpp-mask", baos.toByteArray(), foreground, background);
        }
    }

    @Test
    public void test8BPPIcon8BPPMask() throws Exception {
        final int foreground = 0xff000000;
        final int background = 0x00cccccc;
        try (final ByteArrayOutputStream baos = new ByteArrayOutputStream();
                final BinaryOutputStream bos = new BinaryOutputStream(baos, ByteOrder.BIG_ENDIAN)) {
            bos.write4Bytes(IcnsImageParser.ICNS_MAGIC);
            bos.write4Bytes(4 + 4 + 4 + 4 + 16 * 16 + 4 + 4 + 16 * 16);
            bos.write4Bytes(IcnsType.ICNS_16x16_8BIT_IMAGE.getType());
            bos.write4Bytes(4 + 4 + 16 * 16);
            // 8 BPP image
            for (int y = 0; y < 16; y++) {
                for (int x = 0; x < 16; x++) {
                    if (IMAGE[y][x] != 0) {
                        bos.write(0xff);
                    } else {
                        bos.write(43);
                    }
                }
            }
            // 8 BPP alpha mask
            bos.write4Bytes(IcnsType.ICNS_16x16_8BIT_MASK.getType());
            bos.write4Bytes(4 + 4 + 16 * 16);
            for (int y = 0; y < 16; y++) {
                for (int x = 0; x < 16; x++) {
                    if (IMAGE[y][x] != 0) {
                        bos.write(0xff);
                    } else {
                        bos.write(0x00);
                    }
                }
            }
            bos.flush();
            writeAndReadImageData("8bpp-image-8bpp-mask", baos.toByteArray(), foreground, background);
        }
    }

    @Test
    public void test8BPPIcon8BPPMaskVersus1BPPMask() throws Exception {
        final int foreground = 0xff000000;
        final int background = 0x00cccccc;
        try (final ByteArrayOutputStream baos = new ByteArrayOutputStream();
                final BinaryOutputStream bos = new BinaryOutputStream(baos, ByteOrder.BIG_ENDIAN)) {
            bos.write4Bytes(IcnsImageParser.ICNS_MAGIC);
            bos.write4Bytes(4 + 4 + 4 + 4 + 16 * 16 + 4 + 4 + 16 * 16 + 4 + 4 + 2 * 16 * 16 / 8);
            bos.write4Bytes(IcnsType.ICNS_16x16_8BIT_IMAGE.getType());
            bos.write4Bytes(4 + 4 + 16 * 16);
            // 8 BPP image
            for (int y = 0; y < 16; y++) {
                for (int x = 0; x < 16; x++) {
                    if (IMAGE[y][x] != 0) {
                        bos.write(0xff);
                    } else {
                        bos.write(43);
                    }
                }
            }
            // 8 BPP alpha mask, some transparent
            bos.write4Bytes(IcnsType.ICNS_16x16_8BIT_MASK.getType());
            bos.write4Bytes(4 + 4 + 16 * 16);
            for (int y = 0; y < 16; y++) {
                for (int x = 0; x < 16; x++) {
                    if (IMAGE[y][x] != 0) {
                        bos.write(0xff);
                    } else {
                        bos.write(0x00);
                    }
                }
            }
            // 1 BPP mask
            bos.write4Bytes(IcnsType.ICNS_16x16_1BIT_IMAGE_AND_MASK.getType());
            bos.write4Bytes(4 + 4 + 2 * 16 * 16 / 8);
            // 1 bit image
            for (int y = 0; y < 16; y++) {
                for (int x = 0; x < 16; x += 8) {
                    int eightBits = 0;
                    for (int pos = 0; pos < 8; pos++) {
                        if (IMAGE[y][x + pos] != 0) {
                            eightBits |= (1 << (7 - pos));
                        }
                    }
                    bos.write(eightBits);
                }
            }
            // 1 bit mask, all opaque
            for (int y = 0; y < 16; y++) {
                bos.write(0xff);
                bos.write(0xff);
            }
            bos.flush();
            writeAndReadImageData("8bpp-image-8bpp-mask-vs-1bpp-mask", baos.toByteArray(), foreground, background);
        }
    }

    @Test
    public void test8BPPIcon1BPPMaskVersus8BPPMask() throws Exception {
        final int foreground = 0xff000000;
        final int background = 0x00cccccc;
        try (final ByteArrayOutputStream baos = new ByteArrayOutputStream();
                final BinaryOutputStream bos = new BinaryOutputStream(baos, ByteOrder.BIG_ENDIAN)) {
            bos.write4Bytes(IcnsImageParser.ICNS_MAGIC);
            bos.write4Bytes(4 + 4 + 4 + 4 + 16 * 16 + 4 + 4 + 16 * 16 + 4 + 4 + 2 * 16 * 16 / 8);
            bos.write4Bytes(IcnsType.ICNS_16x16_8BIT_IMAGE.getType());
            bos.write4Bytes(4 + 4 + 16 * 16);
            // 8 BPP image
            for (int y = 0; y < 16; y++) {
                for (int x = 0; x < 16; x++) {
                    if (IMAGE[y][x] != 0) {
                        bos.write(0xff);
                    } else {
                        bos.write(43);
                    }
                }
            }
            // 1 BPP mask
            bos.write4Bytes(IcnsType.ICNS_16x16_1BIT_IMAGE_AND_MASK.getType());
            bos.write4Bytes(4 + 4 + 2 * 16 * 16 / 8);
            // 1 bit image
            for (int y = 0; y < 16; y++) {
                for (int x = 0; x < 16; x += 8) {
                    int eightBits = 0;
                    for (int pos = 0; pos < 8; pos++) {
                        if (IMAGE[y][x + pos] != 0) {
                            eightBits |= (1 << (7 - pos));
                        }
                    }
                    bos.write(eightBits);
                }
            }
            // 1 bit mask, all opaque
            for (int y = 0; y < 16; y++) {
                bos.write(0xff);
                bos.write(0xff);
            }
            // 8 BPP alpha mask, some transparent
            bos.write4Bytes(IcnsType.ICNS_16x16_8BIT_MASK.getType());
            bos.write4Bytes(4 + 4 + 16 * 16);
            for (int y = 0; y < 16; y++) {
                for (int x = 0; x < 16; x++) {
                    if (IMAGE[y][x] != 0) {
                        bos.write(0xff);
                    } else {
                        bos.write(0x00);
                    }
                }
            }
            bos.flush();
            writeAndReadImageData("8bpp-image-1bpp-mask-vs-8bpp-mask", baos.toByteArray(), foreground, background);
        }
    }

    @Test
    public void test8BPPIconNoMask() throws Exception {
        final int foreground = 0xff000000;
        final int background = 0xffcccccc;
        try (final ByteArrayOutputStream baos = new ByteArrayOutputStream();
                final BinaryOutputStream bos = new BinaryOutputStream(baos, ByteOrder.BIG_ENDIAN)) {
            bos.write4Bytes(IcnsImageParser.ICNS_MAGIC);
            bos.write4Bytes(4 + 4 + 4 + 4 + 16 * 16);
            bos.write4Bytes(IcnsType.ICNS_16x16_8BIT_IMAGE.getType());
            bos.write4Bytes(4 + 4 + 16 * 16);
            // 8 BPP image
            for (int y = 0; y < 16; y++) {
                for (int x = 0; x < 16; x++) {
                    if (IMAGE[y][x] != 0) {
                        bos.write(0xff);
                    } else {
                        bos.write(43);
                    }
                }
            }
            bos.flush();
            writeAndReadImageData("8bpp-image-no-mask", baos.toByteArray(), foreground, background);
        }}

    @Test
    public void test32BPPMaskedIcon() throws Exception {
        final int foreground = 0xff000000;
        final int background = 0x000000ff;
        try (final ByteArrayOutputStream baos = new ByteArrayOutputStream();
                final BinaryOutputStream bos = new BinaryOutputStream(baos, ByteOrder.BIG_ENDIAN)) {
            bos.write4Bytes(IcnsImageParser.ICNS_MAGIC);
            bos.write4Bytes(4 + 4 + 4 + 4 + 4 * 16 * 16 + 4 + 4 + 2 * 16 * 16 / 8);
            bos.write4Bytes(IcnsType.ICNS_16x16_32BIT_IMAGE.getType());
            bos.write4Bytes(4 + 4 + 4 * 16 * 16);
            for (int y = 0; y < 16; y++) {
                for (int x = 0; x < 16; x++) {
                    // argb, a ignored
                    bos.write(0);
                    final int pixel;
                    if (IMAGE[y][x] != 0) {
                        pixel = foreground;
                    } else {
                        pixel = background;
                    }
                    bos.write(0xff & (pixel >> 16));
                    bos.write(0xff & (pixel >> 8));
                    bos.write(0xff & pixel);
                }
            }
            bos.write4Bytes(IcnsType.ICNS_16x16_1BIT_IMAGE_AND_MASK.getType());
            bos.write4Bytes(4 + 4 + 2 * 16 * 16 / 8);
            // 1 bit image
            for (int y = 0; y < 16; y++) {
                for (int x = 0; x < 16; x += 8) {
                    int eightBits = 0;
                    for (int pos = 0; pos < 8; pos++) {
                        if (IMAGE[y][x + pos] != 0) {
                            eightBits |= (1 << (7 - pos));
                        }
                    }
                    bos.write(eightBits);
                }
            }
            // 1 bit mask
            for (int y = 0; y < 16; y++) {
                for (int x = 0; x < 16; x += 8) {
                    int eightBits = 0;
                    for (int pos = 0; pos < 8; pos++) {
                        if (IMAGE[y][x + pos] != 0) {
                            eightBits |= (1 << (7 - pos));
                        }
                    }
                    bos.write(eightBits);
                }
            }
            bos.flush();
            writeAndReadImageData("32bpp-image-1bpp-mask", baos.toByteArray(), foreground, background);
        }
    }

    @Test
    public void test32BPPHalfMaskedIcon() throws Exception {
        final int foreground = 0xff000000;
        final int background = 0xff0000ff;
        try (final ByteArrayOutputStream baos = new ByteArrayOutputStream();
                final BinaryOutputStream bos = new BinaryOutputStream(baos, ByteOrder.BIG_ENDIAN)) {
            bos.write4Bytes(IcnsImageParser.ICNS_MAGIC);
            bos.write4Bytes(4 + 4 + 4 + 4 + 4 * 16 * 16 + 4 + 4 + 16 * 16 / 8);
            bos.write4Bytes(IcnsType.ICNS_16x16_32BIT_IMAGE.getType());
            bos.write4Bytes(4 + 4 + 4 * 16 * 16);
            for (int y = 0; y < 16; y++) {
                for (int x = 0; x < 16; x++) {
                    // argb, a ignored
                    bos.write(0);
                    final int pixel;
                    if (IMAGE[y][x] != 0) {
                        pixel = foreground;
                    } else {
                        pixel = background;
                    }
                    bos.write(0xff & (pixel >> 16));
                    bos.write(0xff & (pixel >> 8));
                    bos.write(0xff & pixel);
                }
            }
            bos.write4Bytes(IcnsType.ICNS_16x16_1BIT_IMAGE_AND_MASK.getType());
            bos.write4Bytes(4 + 4 + 16 * 16 / 8);
            // 1 bit image
            for (int y = 0; y < 16; y++) {
                for (int x = 0; x < 16; x += 8) {
                    int eightBits = 0;
                    for (int pos = 0; pos < 8; pos++) {
                        if (IMAGE[y][x + pos] != 0) {
                            eightBits |= (1 << (7 - pos));
                        }
                    }
                    bos.write(eightBits);
                }
            }
            // Missing 1 bit mask!!!
            bos.flush();

            boolean threw = false;
            try {
                writeAndReadImageData("32bpp-half-masked-CORRUPT", baos.toByteArray(), foreground, background);
            } catch (final ImageReadException imageReadException) {
                threw = true;
            }
            assertTrue("ICNS file with corrupt mask didn't fail to parse", threw);
        }
    }

    @Test
    public void test32BPPMaskMissingIcon() throws Exception {
        final int foreground = 0xff000000;
        final int background = 0xff0000ff;
        try (final ByteArrayOutputStream baos = new ByteArrayOutputStream();
                final BinaryOutputStream bos = new BinaryOutputStream(baos, ByteOrder.BIG_ENDIAN)) {
            bos.write4Bytes(IcnsImageParser.ICNS_MAGIC);
            bos.write4Bytes(4 + 4 + 4 + 4 + 4 * 16 * 16);
            bos.write4Bytes(IcnsType.ICNS_16x16_32BIT_IMAGE.getType());
            bos.write4Bytes(4 + 4 + 4 * 16 * 16);
            for (int y = 0; y < 16; y++) {
                for (int x = 0; x < 16; x++) {
                    // argb, a ignored
                    bos.write(0);
                    final int pixel;
                    if (IMAGE[y][x] != 0) {
                        pixel = foreground;
                    } else {
                        pixel = background;
                    }
                    bos.write(0xff & (pixel >> 16));
                    bos.write(0xff & (pixel >> 8));
                    bos.write(0xff & pixel);
                }
            }
            bos.flush();
            writeAndReadImageData("32bpp-mask-missing", baos.toByteArray(), foreground, background);
        }
    }

    private void writeAndReadImageData(final String description, final byte[] rawData,
            final int foreground, final int background) throws IOException,
            ImageReadException {
        final File exportFile = createTempFile(description, ".icns");
        FileUtils.writeByteArrayToFile(exportFile, rawData);
        final BufferedImage dstImage = Imaging.getBufferedImage(exportFile);

        assertNotNull(dstImage);
        assertTrue(dstImage.getWidth() == IMAGE[0].length);
        assertTrue(dstImage.getHeight() == IMAGE.length);

        verify(dstImage, foreground, background);
    }

    private void verify(final BufferedImage data, final int foreground, final int background) {
        assertNotNull(data);
        assertTrue(data.getHeight() == IMAGE.length);

        for (int y = 0; y < data.getHeight(); y++) {
            assertTrue(data.getWidth() == IMAGE[y].length);
            for (int x = 0; x < data.getWidth(); x++) {
                final int imageARGB = (IMAGE[y][x] == 1) ? foreground : background;
                final int dataARGB = data.getRGB(x, y);

                if (imageARGB != dataARGB) {
                    Debug.debug("x: " + x + ", y: " + y + ", image: "
                            + imageARGB + " (0x"
                            + Integer.toHexString(imageARGB) + ")" + ", data: "
                            + dataARGB + " (0x" + Integer.toHexString(dataARGB)
                            + ")");
                }
                assertTrue(imageARGB == dataARGB);
            }
        }
    }
}
