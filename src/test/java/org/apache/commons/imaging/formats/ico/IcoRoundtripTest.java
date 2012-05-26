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

package org.apache.commons.imaging.formats.ico;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.util.Debug;
import org.apache.commons.imaging.util.IoUtils;

public class IcoRoundtripTest extends IcoBaseTest {
    // 16x16 test image
    private static final int[][] image = {
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,1,0,0,0,0,0,1,1,0,0,0,0},
        {0,0,0,1,1,0,0,0,0,1,0,0,1,0,0,0},
        {0,0,1,0,1,0,0,0,1,0,0,0,0,1,0,0},
        {0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0},
        {0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0},
        {0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0},
        {0,0,0,0,1,0,0,0,1,0,1,1,1,0,0,0},
        {0,0,0,0,1,0,0,0,1,1,0,0,0,1,0,0},
        {0,0,0,0,1,0,0,0,1,0,0,0,0,1,0,0},
        {0,0,0,0,1,0,0,0,1,0,0,0,0,1,0,0},
        {0,0,0,0,1,0,0,0,0,1,0,0,0,1,0,0},
        {0,0,0,0,1,0,0,0,0,0,1,1,1,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
    };

    private Map generatorMap = new HashMap();

    public IcoRoundtripTest() {
        generatorMap.put(new Integer(1), new GeneratorFor1BitBitmaps());
        generatorMap.put(new Integer(4), new GeneratorFor4BitBitmaps());
        generatorMap.put(new Integer(8), new GeneratorFor8BitBitmaps());
        generatorMap.put(new Integer(16), new GeneratorFor16BitBitmaps());
        generatorMap.put(new Integer(24), new GeneratorFor24BitBitmaps());
        generatorMap.put(new Integer(32), new GeneratorFor32BitBitmaps());
    }

    private static interface BitmapGenerator {
        byte[] generateBitmap(int foreground, int background, int paletteSize)
                throws IOException, ImageWriteException;
    }

    private class GeneratorFor1BitBitmaps implements BitmapGenerator {
        public byte[] generateBitmap(int foreground, int background,
                int paletteSize) throws IOException, ImageWriteException {
            ByteArrayOutputStream byteArrayStream = new ByteArrayOutputStream();
            BinaryOutputStream bos = new BinaryOutputStream(byteArrayStream,
                    BinaryOutputStream.BYTE_ORDER_LITTLE_ENDIAN);
            // Palette
            bos.write3Bytes(background);
            bos.write(0);
            bos.write3Bytes(foreground);
            bos.write(0);
            for (int i = 2; i < paletteSize; i++)
                bos.write4Bytes(0);
            // Image
            for (int y = 15; y >= 0; y--) {
                for (int x = 0; x < 16; x += 8) {
                    bos.write(((0x1 & image[y][x]) << 7)
                            | ((0x1 & image[y][x + 1]) << 6)
                            | ((0x1 & image[y][x + 2]) << 5)
                            | ((0x1 & image[y][x + 3]) << 4)
                            | ((0x1 & image[y][x + 4]) << 3)
                            | ((0x1 & image[y][x + 5]) << 2)
                            | ((0x1 & image[y][x + 6]) << 1)
                            | ((0x1 & image[y][x + 7]) << 0));
                }
                // Pad to multiple of 32 bytes
                bos.write(0);
                bos.write(0);
            }
            // Mask
            for (int y = image.length - 1; y >= 0; y--) {
                bos.write(0);
                bos.write(0);
                // Pad to 4 bytes:
                bos.write(0);
                bos.write(0);
            }
            bos.flush();
            return byteArrayStream.toByteArray();
        }
    }

    private class GeneratorFor4BitBitmaps implements BitmapGenerator {
        public byte[] generateBitmap(int foreground, int background,
                int paletteSize) throws IOException, ImageWriteException {
            ByteArrayOutputStream byteArrayStream = new ByteArrayOutputStream();
            BinaryOutputStream bos = new BinaryOutputStream(byteArrayStream,
                    BinaryOutputStream.BYTE_ORDER_LITTLE_ENDIAN);
            // Palette
            bos.write3Bytes(background);
            bos.write(0);
            bos.write3Bytes(foreground);
            bos.write(0);
            for (int i = 2; i < paletteSize; i++)
                bos.write4Bytes(0);
            // Image
            for (int y = 15; y >= 0; y--) {
                for (int x = 0; x < 16; x += 2) {
                    bos.write(((0xf & image[y][x]) << 4)
                            | (0xf & image[y][x + 1]));
                }
            }
            // Mask
            for (int y = image.length - 1; y >= 0; y--) {
                bos.write(0);
                bos.write(0);
                // Pad to 4 bytes:
                bos.write(0);
                bos.write(0);
            }
            bos.flush();
            return byteArrayStream.toByteArray();
        }
    }

    private class GeneratorFor8BitBitmaps implements BitmapGenerator {
        public byte[] generateBitmap(int foreground, int background,
                int paletteSize) throws IOException, ImageWriteException {
            ByteArrayOutputStream byteArrayStream = new ByteArrayOutputStream();
            BinaryOutputStream bos = new BinaryOutputStream(byteArrayStream,
                    BinaryOutputStream.BYTE_ORDER_LITTLE_ENDIAN);
            // Palette
            bos.write3Bytes(background);
            bos.write(0);
            bos.write3Bytes(foreground);
            bos.write(0);
            for (int i = 2; i < paletteSize; i++)
                bos.write4Bytes(0);
            // Image
            for (int y = 15; y >= 0; y--) {
                for (int x = 0; x < 16; x++) {
                    bos.write(image[y][x]);
                }
            }
            // Mask
            for (int y = image.length - 1; y >= 0; y--) {
                bos.write(0);
                bos.write(0);
                // Pad to 4 bytes:
                bos.write(0);
                bos.write(0);
            }
            bos.flush();
            return byteArrayStream.toByteArray();
        }
    }

    private class GeneratorFor16BitBitmaps implements BitmapGenerator {
        public byte[] generateBitmap(int foreground, int background,
                int paletteSize) throws IOException, ImageWriteException {
            ByteArrayOutputStream byteArrayStream = new ByteArrayOutputStream();
            BinaryOutputStream bos = new BinaryOutputStream(byteArrayStream,
                    BinaryOutputStream.BYTE_ORDER_LITTLE_ENDIAN);
            // Palette
            for (int i = 0; i < paletteSize; i++)
                bos.write4Bytes(0);
            // Image
            for (int y = 15; y >= 0; y--) {
                for (int x = 0; x < 16; x++) {
                    if (image[y][x] == 1)
                        bos.write2Bytes((0x1f & (foreground >> 3))
                                | ((0x1f & (foreground >> 11)) << 5)
                                | ((0x1f & (foreground >> 19)) << 10));
                    else
                        bos.write2Bytes((0x1f & (background >> 3))
                                | ((0x1f & (background >> 11)) << 5)
                                | ((0x1f & (background >> 19)) << 10));
                }
            }
            // Mask
            for (int y = image.length - 1; y >= 0; y--) {
                bos.write(0);
                bos.write(0);
                // Pad to 4 bytes:
                bos.write(0);
                bos.write(0);
            }
            bos.flush();
            return byteArrayStream.toByteArray();
        }
    }

    private class GeneratorFor24BitBitmaps implements BitmapGenerator {
        public byte[] generateBitmap(int foreground, int background,
                int paletteSize) throws IOException, ImageWriteException {
            ByteArrayOutputStream byteArrayStream = new ByteArrayOutputStream();
            BinaryOutputStream bos = new BinaryOutputStream(byteArrayStream,
                    BinaryOutputStream.BYTE_ORDER_LITTLE_ENDIAN);
            // Palette
            for (int i = 0; i < paletteSize; i++)
                bos.write4Bytes(0);
            // Image
            for (int y = 15; y >= 0; y--) {
                for (int x = 0; x < 16; x++) {
                    if (image[y][x] == 1)
                        bos.write3Bytes(0xffffff & foreground);
                    else
                        bos.write3Bytes(0xffffff & background);
                }
            }
            // Mask
            for (int y = image.length - 1; y >= 0; y--) {
                bos.write(0);
                bos.write(0);
                // Pad to 4 bytes:
                bos.write(0);
                bos.write(0);
            }
            bos.flush();
            return byteArrayStream.toByteArray();
        }
    }

    private class GeneratorFor32BitBitmaps implements BitmapGenerator {
        public byte[] generateBitmap(int foreground, int background,
                int paletteSize) throws IOException, ImageWriteException {
            return generate32bitRGBABitmap(foreground, background, paletteSize,
                    true);
        }

        public byte[] generate32bitRGBABitmap(int foreground, int background,
                int paletteSize, boolean writeMask) throws IOException {
            ByteArrayOutputStream byteArrayStream = new ByteArrayOutputStream();
            BinaryOutputStream bos = new BinaryOutputStream(byteArrayStream,
                    BinaryOutputStream.BYTE_ORDER_LITTLE_ENDIAN);
            // Palette
            for (int i = 0; i < paletteSize; i++)
                bos.write4Bytes(0);
            // Image
            for (int y = 15; y >= 0; y--) {
                for (int x = 0; x < 16; x++) {
                    if (image[y][x] == 1)
                        bos.write4Bytes(foreground);
                    else
                        bos.write4Bytes(background);
                }
            }
            // Mask
            if (writeMask) {
                for (int y = image.length - 1; y >= 0; y--) {
                    bos.write(0);
                    bos.write(0);
                    // Pad to 4 bytes:
                    bos.write(0);
                    bos.write(0);
                }
            }
            bos.flush();
            return byteArrayStream.toByteArray();
        }
    }

    private void writeICONDIR(BinaryOutputStream bos, int reserved, int type,
            int count) throws IOException {
        bos.write2Bytes(reserved);
        bos.write2Bytes(type);
        bos.write2Bytes(count);
    }

    private void writeICONDIRENTRY(BinaryOutputStream bos, int width,
            int height, int colorCount, int reserved, int planes, int bitCount,
            int bytesInRes) throws IOException {
        bos.write(width);
        bos.write(height);
        bos.write(colorCount);
        bos.write(reserved);
        bos.write2Bytes(planes);
        bos.write2Bytes(bitCount);
        bos.write4Bytes(bytesInRes);
        bos.write4Bytes(22); // image comes immediately after this
    }

    private void writeBITMAPINFOHEADER(BinaryOutputStream bos, int width,
            int height, int colorPlanes, int bitCount, int compression,
            int colorsUsed, int colorsImportant) throws IOException {
        // BITMAPINFOHEADER
        bos.write4Bytes(40); // biSize, always 40 for BITMAPINFOHEADER
        bos.write4Bytes(width); // biWidth
        bos.write4Bytes(height); // biHeight
        bos.write2Bytes(colorPlanes); // biPlanes
        bos.write2Bytes(bitCount); // bitCount
        bos.write4Bytes(compression); // biCompression
        bos.write4Bytes(0); // biSizeImage, can be 0 for uncompressed
        bos.write4Bytes(0); // X pixels per metre
        bos.write4Bytes(0); // Y pixels per metre
        bos.write4Bytes(colorsUsed); // colors used, ignored
        bos.write4Bytes(colorsImportant); // colors important
    }

    public void testNormalIcons() throws Exception {
        final int foreground = 0xFFF000E0;
        final int background = 0xFF102030;
        for (Iterator it = generatorMap.entrySet().iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            int bitDepth = ((Integer) entry.getKey()).intValue();
            BitmapGenerator bitmapGenerator = (BitmapGenerator) entry
                    .getValue();

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            BinaryOutputStream bos = new BinaryOutputStream(baos,
                    BinaryOutputStream.BYTE_ORDER_LITTLE_ENDIAN);
            byte[] bitmap = bitmapGenerator.generateBitmap(foreground,
                    background, (bitDepth <= 8) ? (1 << bitDepth) : 0);
            writeICONDIR(bos, 0, 1, 1);
            writeICONDIRENTRY(bos, 16, 16, 0, 0, 1, bitDepth,
                    40 + bitmap.length);
            writeBITMAPINFOHEADER(bos, 16, 2 * 16, 1, bitDepth, 0, 0, 0);
            bos.write(bitmap);
            bos.flush();
            writeAndReadImageData("16x16x" + bitDepth, baos.toByteArray(),
                    foreground, background);
        }
    }

    public void testBadICONDIRENTRYIcons() throws Exception {
        final int foreground = 0xFFF000E0;
        final int background = 0xFF102030;
        // Windows ignores the ICONDIRENTRY values when parsing the ICO file.
        for (Iterator it = generatorMap.entrySet().iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            int bitDepth = ((Integer) entry.getKey()).intValue();
            BitmapGenerator bitmapGenerator = (BitmapGenerator) entry
                    .getValue();

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            BinaryOutputStream bos = new BinaryOutputStream(baos,
                    BinaryOutputStream.BYTE_ORDER_LITTLE_ENDIAN);
            byte[] bitmap = bitmapGenerator.generateBitmap(foreground,
                    background, (bitDepth <= 8) ? (1 << bitDepth) : 0);
            writeICONDIR(bos, 0, 1, 1);
            writeICONDIRENTRY(bos, 3 /* width, should be 16 */, 4 /*
                                                                   * height,
                                                                   * should be
                                                                   * 16
                                                                   */, 7 /*
                                                                          * colorCount
                                                                          * ,
                                                                          * should
                                                                          * be 2
                                                                          * or 0
                                                                          */,
                    20 /* reserved, should be 0 */, 11 /*
                                                        * planes, should be 1 or
                                                        * 0
                                                        */, 19 /*
                                                                * bitCount,
                                                                * should be
                                                                * bitDepth
                                                                */,
                    40 + bitmap.length);
            writeBITMAPINFOHEADER(bos, 16, 2 * 16, 1, bitDepth, 0, 0, 0);
            bos.write(bitmap);
            bos.flush();
            writeAndReadImageData(
                    "16x16x" + bitDepth + "-corrupt-icondirentry",
                    baos.toByteArray(), foreground, background);
        }
    }

    public void testColorsUsed() throws Exception {
        final int foreground = 0xFFF000E0;
        final int background = 0xFF102030;
        for (Iterator it = generatorMap.entrySet().iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            int bitDepth = ((Integer) entry.getKey()).intValue();
            BitmapGenerator bitmapGenerator = (BitmapGenerator) entry
                    .getValue();

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            BinaryOutputStream bos = new BinaryOutputStream(baos,
                    BinaryOutputStream.BYTE_ORDER_LITTLE_ENDIAN);
            byte[] bitmap = bitmapGenerator.generateBitmap(foreground,
                    background, 2);
            writeICONDIR(bos, 0, 1, 1);
            writeICONDIRENTRY(bos, 3, 4, 7, 20, 11, 19, 40 + bitmap.length);
            writeBITMAPINFOHEADER(bos, 16, 2 * 16, 1, bitDepth, 0, 2, 0);
            bos.write(bitmap);
            bos.flush();
            writeAndReadImageData("16x16x" + bitDepth + "-custom-palette",
                    baos.toByteArray(), foreground, background);
        }
    }

    public void testZeroColorPlanes() throws Exception {
        final int foreground = 0xFFF000E0;
        final int background = 0xFF102030;
        for (Iterator it = generatorMap.entrySet().iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            int bitDepth = ((Integer) entry.getKey()).intValue();
            BitmapGenerator bitmapGenerator = (BitmapGenerator) entry
                    .getValue();

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            BinaryOutputStream bos = new BinaryOutputStream(baos,
                    BinaryOutputStream.BYTE_ORDER_LITTLE_ENDIAN);
            byte[] bitmap = bitmapGenerator.generateBitmap(foreground,
                    background, (bitDepth <= 8) ? (1 << bitDepth) : 0);
            writeICONDIR(bos, 0, 1, 1);
            writeICONDIRENTRY(bos, 16, 16, 0, 0, 1, bitDepth,
                    40 + bitmap.length);
            writeBITMAPINFOHEADER(bos, 16, 2 * 16, 0 /* should be 1 */,
                    bitDepth, 0, 0, 0);
            bos.write(bitmap);
            bos.flush();

            boolean threw = false;
            try {
                writeAndReadImageData(
                        "16x16x" + bitDepth + "-zero-colorPlanes",
                        baos.toByteArray(), foreground, background);
            } catch (ImageReadException imageReadException) {
                threw = true;
            }
            assertTrue(threw);
        }
    }

    public void testBitfieldCompression() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BinaryOutputStream bos = new BinaryOutputStream(baos,
                BinaryOutputStream.BYTE_ORDER_LITTLE_ENDIAN);
        byte[] bitmap = new GeneratorFor32BitBitmaps().generate32bitRGBABitmap(
                0xFFFF0000, 0xFFFFFFFF, 0, true);
        writeICONDIR(bos, 0, 1, 1);
        writeICONDIRENTRY(bos, 16, 16, 0, 0, 1, 32, 40 + bitmap.length);
        writeBITMAPINFOHEADER(bos, 16, 2 * 16, 1, 32, 3 /* BI_BITFIELDS */, 0,
                0);
        bos.write4Bytes(0x000000FF); // red mask
        bos.write4Bytes(0x0000FF00); // green mask
        bos.write4Bytes(0x00FF0000); // blue mask
        bos.write(bitmap);
        bos.flush();
        writeAndReadImageData("16x16x32-bitfield-compressed",
                baos.toByteArray(), 0xFF0000FF, 0xFFFFFFFF);
    }

    public void test32bitMask() throws Exception {
        final int foreground = 0xFFF000E0;
        final int background = 0xFF102030;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BinaryOutputStream bos = new BinaryOutputStream(baos,
                BinaryOutputStream.BYTE_ORDER_LITTLE_ENDIAN);
        // For 32 bit RGBA, the AND mask can be missing:
        byte[] bitmap = new GeneratorFor32BitBitmaps().generate32bitRGBABitmap(
                foreground, background, 0, false);
        writeICONDIR(bos, 0, 1, 1);
        writeICONDIRENTRY(bos, 16, 16, 0, 0, 1, 32, 40 + bitmap.length);
        writeBITMAPINFOHEADER(bos, 16, 2 * 16, 1, 32, 0, 0, 0);
        bos.write(bitmap);
        bos.flush();
        writeAndReadImageData("16x16x32-no-mask", baos.toByteArray(),
                foreground, background);
    }

    public void testAlphaVersusANDMask() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BinaryOutputStream bos = new BinaryOutputStream(baos,
                BinaryOutputStream.BYTE_ORDER_LITTLE_ENDIAN);
        byte[] bitmap = new GeneratorFor32BitBitmaps().generate32bitRGBABitmap(
                0xFF000000, 0x00000000, 0, true);
        writeICONDIR(bos, 0, 1, 1);
        writeICONDIRENTRY(bos, 16, 16, 0, 0, 1, 32, 40 + bitmap.length);
        writeBITMAPINFOHEADER(bos, 16, 2 * 16, 1, 32, 0, 0, 0);
        bos.write(bitmap);
        bos.flush();
        // The AND mask is fully opaque, yet the fully transparent alpha should
        // win:
        writeAndReadImageData("16x16x32-alpha-vs-mask", baos.toByteArray(),
                0xFF000000, 0x00000000);
    }

    public void testFullyTransparent32bitRGBA() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BinaryOutputStream bos = new BinaryOutputStream(baos,
                BinaryOutputStream.BYTE_ORDER_LITTLE_ENDIAN);
        byte[] bitmap = new GeneratorFor32BitBitmaps().generate32bitRGBABitmap(
                0x00000000, 0x00FFFFFF, 0, true);
        writeICONDIR(bos, 0, 1, 1);
        writeICONDIRENTRY(bos, 16, 16, 0, 0, 1, 32, 40 + bitmap.length);
        writeBITMAPINFOHEADER(bos, 16, 2 * 16, 1, 32, 0, 0, 0);
        bos.write(bitmap);
        bos.flush();
        // Because every pixel is fully trasparent, ***ALPHA GETS IGNORED***:
        writeAndReadImageData("16x16x32-fully-transparent", baos.toByteArray(),
                0xFF000000, 0xFFFFFFFF);
    }

    private void writeAndReadImageData(String description, byte[] rawData,
            int foreground, int background) throws IOException,
            ImageReadException {
        // Uncomment to generate ICO files that can be tested with Windows:
        // File exportFile = new File("/tmp/" + description + ".ico");
        // IoUtils.writeToFile(rawData, exportFile);

        File tempFile = createTempFile("temp", ".ico");
        IoUtils.writeToFile(rawData, tempFile);

        BufferedImage dstImage = Imaging.getBufferedImage(tempFile);

        assertNotNull(dstImage);
        assertTrue(dstImage.getWidth() == image[0].length);
        assertTrue(dstImage.getHeight() == image.length);

        verify(dstImage, foreground, background);
    }

    private void verify(BufferedImage data, int foreground, int background) {
        assertNotNull(data);
        assertTrue(data.getHeight() == image.length);

        for (int y = 0; y < data.getHeight(); y++) {
            assertTrue(data.getWidth() == image[y].length);
            for (int x = 0; x < data.getWidth(); x++) {
                int imageARGB = (image[y][x] == 1) ? foreground : background;
                int dataARGB = data.getRGB(x, y);

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
