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

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.formats.icns.IcnsImageParser.IcnsElement;

final class IcnsDecoder {
    private static final int[] PALETTE_4BPP = { 0xffffffff, 0xfffcf305,
            0xffff6402, 0xffdd0806, 0xfff20884, 0xff4600a5, 0xff0000d4,
            0xff02abea, 0xff1fb714, 0xff006411, 0xff562c05, 0xff90713a,
            0xffc0c0c0, 0xff808080, 0xff404040, 0xff000000 };

    private static final int[] PALETTE_8BPP = { 0xFFFFFFFF, 0xFFFFFFCC,
            0xFFFFFF99, 0xFFFFFF66, 0xFFFFFF33, 0xFFFFFF00, 0xFFFFCCFF,
            0xFFFFCCCC, 0xFFFFCC99, 0xFFFFCC66, 0xFFFFCC33, 0xFFFFCC00,
            0xFFFF99FF, 0xFFFF99CC, 0xFFFF9999, 0xFFFF9966, 0xFFFF9933,
            0xFFFF9900, 0xFFFF66FF, 0xFFFF66CC, 0xFFFF6699, 0xFFFF6666,
            0xFFFF6633, 0xFFFF6600, 0xFFFF33FF, 0xFFFF33CC, 0xFFFF3399,
            0xFFFF3366, 0xFFFF3333, 0xFFFF3300, 0xFFFF00FF, 0xFFFF00CC,
            0xFFFF0099, 0xFFFF0066, 0xFFFF0033, 0xFFFF0000, 0xFFCCFFFF,
            0xFFCCFFCC, 0xFFCCFF99, 0xFFCCFF66, 0xFFCCFF33, 0xFFCCFF00,
            0xFFCCCCFF, 0xFFCCCCCC, 0xFFCCCC99, 0xFFCCCC66, 0xFFCCCC33,
            0xFFCCCC00, 0xFFCC99FF, 0xFFCC99CC, 0xFFCC9999, 0xFFCC9966,
            0xFFCC9933, 0xFFCC9900, 0xFFCC66FF, 0xFFCC66CC, 0xFFCC6699,
            0xFFCC6666, 0xFFCC6633, 0xFFCC6600, 0xFFCC33FF, 0xFFCC33CC,
            0xFFCC3399, 0xFFCC3366, 0xFFCC3333, 0xFFCC3300, 0xFFCC00FF,
            0xFFCC00CC, 0xFFCC0099, 0xFFCC0066, 0xFFCC0033, 0xFFCC0000,
            0xFF99FFFF, 0xFF99FFCC, 0xFF99FF99, 0xFF99FF66, 0xFF99FF33,
            0xFF99FF00, 0xFF99CCFF, 0xFF99CCCC, 0xFF99CC99, 0xFF99CC66,
            0xFF99CC33, 0xFF99CC00, 0xFF9999FF, 0xFF9999CC, 0xFF999999,
            0xFF999966, 0xFF999933, 0xFF999900, 0xFF9966FF, 0xFF9966CC,
            0xFF996699, 0xFF996666, 0xFF996633, 0xFF996600, 0xFF9933FF,
            0xFF9933CC, 0xFF993399, 0xFF993366, 0xFF993333, 0xFF993300,
            0xFF9900FF, 0xFF9900CC, 0xFF990099, 0xFF990066, 0xFF990033,
            0xFF990000, 0xFF66FFFF, 0xFF66FFCC, 0xFF66FF99, 0xFF66FF66,
            0xFF66FF33, 0xFF66FF00, 0xFF66CCFF, 0xFF66CCCC, 0xFF66CC99,
            0xFF66CC66, 0xFF66CC33, 0xFF66CC00, 0xFF6699FF, 0xFF6699CC,
            0xFF669999, 0xFF669966, 0xFF669933, 0xFF669900, 0xFF6666FF,
            0xFF6666CC, 0xFF666699, 0xFF666666, 0xFF666633, 0xFF666600,
            0xFF6633FF, 0xFF6633CC, 0xFF663399, 0xFF663366, 0xFF663333,
            0xFF663300, 0xFF6600FF, 0xFF6600CC, 0xFF660099, 0xFF660066,
            0xFF660033, 0xFF660000, 0xFF33FFFF, 0xFF33FFCC, 0xFF33FF99,
            0xFF33FF66, 0xFF33FF33, 0xFF33FF00, 0xFF33CCFF, 0xFF33CCCC,
            0xFF33CC99, 0xFF33CC66, 0xFF33CC33, 0xFF33CC00, 0xFF3399FF,
            0xFF3399CC, 0xFF339999, 0xFF339966, 0xFF339933, 0xFF339900,
            0xFF3366FF, 0xFF3366CC, 0xFF336699, 0xFF336666, 0xFF336633,
            0xFF336600, 0xFF3333FF, 0xFF3333CC, 0xFF333399, 0xFF333366,
            0xFF333333, 0xFF333300, 0xFF3300FF, 0xFF3300CC, 0xFF330099,
            0xFF330066, 0xFF330033, 0xFF330000, 0xFF00FFFF, 0xFF00FFCC,
            0xFF00FF99, 0xFF00FF66, 0xFF00FF33, 0xFF00FF00, 0xFF00CCFF,
            0xFF00CCCC, 0xFF00CC99, 0xFF00CC66, 0xFF00CC33, 0xFF00CC00,
            0xFF0099FF, 0xFF0099CC, 0xFF009999, 0xFF009966, 0xFF009933,
            0xFF009900, 0xFF0066FF, 0xFF0066CC, 0xFF006699, 0xFF006666,
            0xFF006633, 0xFF006600, 0xFF0033FF, 0xFF0033CC, 0xFF003399,
            0xFF003366, 0xFF003333, 0xFF003300, 0xFF0000FF, 0xFF0000CC,
            0xFF000099, 0xFF000066, 0xFF000033, 0xFFEE0000, 0xFFDD0000,
            0xFFBB0000, 0xFFAA0000, 0xFF880000, 0xFF770000, 0xFF550000,
            0xFF440000, 0xFF220000, 0xFF110000, 0xFF00EE00, 0xFF00DD00,
            0xFF00BB00, 0xFF00AA00, 0xFF008800, 0xFF007700, 0xFF005500,
            0xFF004400, 0xFF002200, 0xFF001100, 0xFF0000EE, 0xFF0000DD,
            0xFF0000BB, 0xFF0000AA, 0xFF000088, 0xFF000077, 0xFF000055,
            0xFF000044, 0xFF000022, 0xFF000011, 0xFFEEEEEE, 0xFFDDDDDD,
            0xFFBBBBBB, 0xFFAAAAAA, 0xFF888888, 0xFF777777, 0xFF555555,
            0xFF444444, 0xFF222222, 0xFF111111, 0xFF000000 };

    private IcnsDecoder() {
    }

    private static void decode1BPPImage(final IcnsType imageType, final byte[] imageData, final ImageBuilder image) {
        int position = 0;
        int bitsLeft = 0;
        int value = 0;
        for (int y = 0; y < imageType.getHeight(); y++) {
            for (int x = 0; x < imageType.getWidth(); x++) {
                if (bitsLeft == 0) {
                    value = 0xff & imageData[position++];
                    bitsLeft = 8;
                }
                int argb;
                if ((value & 0x80) != 0) {
                    argb = 0xff000000;
                } else {
                    argb = 0xffffffff;
                }
                value <<= 1;
                bitsLeft--;
                image.setRGB(x, y, argb);
            }
        }
    }

    private static void decode4BPPImage(final IcnsType imageType, final byte[] imageData, final ImageBuilder image) {
        int i = 0;
        boolean visited = false;
        for (int y = 0; y < imageType.getHeight(); y++) {
            for (int x = 0; x < imageType.getWidth(); x++) {
                int index;
                if (!visited) {
                    index = 0xf & (imageData[i] >> 4);
                } else {
                    index = 0xf & imageData[i++];
                }
                visited = !visited;
                image.setRGB(x, y, PALETTE_4BPP[index]);
            }
        }
    }

    private static void decode8BPPImage(final IcnsType imageType, final byte[] imageData, final ImageBuilder image) {
        for (int y = 0; y < imageType.getHeight(); y++) {
            for (int x = 0; x < imageType.getWidth(); x++) {
                final int index = 0xff & imageData[y * imageType.getWidth() + x];
                image.setRGB(x, y, PALETTE_8BPP[index]);
            }
        }
    }

    private static void decode32BPPImage(final IcnsType imageType, final byte[] imageData, final ImageBuilder image) {
        for (int y = 0; y < imageType.getHeight(); y++) {
            for (int x = 0; x < imageType.getWidth(); x++) {
                final int argb = 0xff000000 /* the "alpha" is ignored */
                        | ((0xff & imageData[4 * (y * imageType.getWidth() + x) + 1]) << 16)
                        | ((0xff & imageData[4 * (y * imageType.getWidth() + x) + 2]) << 8)
                        | (0xff & imageData[4 * (y * imageType.getWidth() + x) + 3]);
                image.setRGB(x, y, argb);
            }
        }
    }

    private static void apply1BPPMask(final byte[] maskData, final ImageBuilder image) throws ImageReadException {
        int position = 0;
        int bitsLeft = 0;
        int value = 0;

        // 1 bit icon types have image data followed by mask data in the same
        // entry
        final int totalBytes = (image.getWidth() * image.getHeight() + 7) / 8;
        if (maskData.length < 2 * totalBytes) {
            throw new ImageReadException("1 BPP mask underrun parsing ICNS file");
        }
        position = totalBytes;

        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                if (bitsLeft == 0) {
                    value = 0xff & maskData[position++];
                    bitsLeft = 8;
                }
                int alpha;
                if ((value & 0x80) != 0) {
                    alpha = 0xff;
                } else {
                    alpha = 0x00;
                }
                value <<= 1;
                bitsLeft--;
                image.setRGB(x, y, (alpha << 24) | (0xffffff & image.getRGB(x, y)));
            }
        }
    }

    private static void apply8BPPMask(final byte[] maskData, final ImageBuilder image) {
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                final int alpha = 0xff & maskData[y * image.getWidth() + x];
                image.setRGB(x, y,
                        (alpha << 24) | (0xffffff & image.getRGB(x, y)));
            }
        }
    }

    public static List<BufferedImage> decodeAllImages(final IcnsImageParser.IcnsElement[] icnsElements)
      throws ImageReadException {
        final List<BufferedImage> result = new ArrayList<>();
        for (int i = 0; i < icnsElements.length; i++) {
            final BufferedImage image = decodeImage(icnsElements, i);
            if (image != null) {
                result.add(image);
            }
        }
        return result;
    }

    public static BufferedImage decodeImage(final IcnsImageParser.IcnsElement[] icnsElements, final int index)
            throws ImageReadException {
        final IcnsImageParser.IcnsElement imageElement = icnsElements[index];
        final IcnsType imageType = IcnsType.findImageType(imageElement.type);

        //refactored in order to use contains instead of 11 conditions to reduce Cyclomatic complexity
        ArrayList<IcnsType> IcnsTypeList = new ArrayList<>();
        IcnsTypeList.add(IcnsType.ICNS_16x16_32BIT_ARGB_IMAGE);
        IcnsTypeList.add(IcnsType.ICNS_32x32_32BIT_ARGB_IMAGE);
        IcnsTypeList.add(IcnsType.ICNS_64x64_32BIT_ARGB_IMAGE);
        IcnsTypeList.add(IcnsType.ICNS_128x128_32BIT_ARGB_IMAGE);
        IcnsTypeList.add(IcnsType.ICNS_256x256_32BIT_ARGB_IMAGE);
        IcnsTypeList.add(IcnsType.ICNS_512x512_32BIT_ARGB_IMAGE);
        IcnsTypeList.add(IcnsType.ICNS_1024x1024_32BIT_ARGB_IMAGE);
        IcnsTypeList.add(IcnsType.ICNS_32x32_2x_32BIT_ARGB_IMAGE);
        IcnsTypeList.add(IcnsType.ICNS_64x64_2x_32BIT_ARGB_IMAGE);
        IcnsTypeList.add(IcnsType.ICNS_256x256_2x_32BIT_ARGB_IMAGE);
        IcnsTypeList.add(IcnsType.ICNS_512x512_2x_32BIT_ARGB_IMAGE);
        if (imageType == null) {
            return null;
        }
        if(IcnsTypeList.contains(imageType)){
            BufferedImage image = null;
            try {
                image = Imaging.getBufferedImage(imageElement.data);
            } catch (final Exception ex) {
                if (imageType.getWidth() <= 32) {
                    try {
                        image = decodeImageImpl(imageType, imageElement, icnsElements);
                    } catch (final Exception ignored) { }
                }
                if (image == null) {
                    image = new BufferedImage(imageType.getWidth(), imageType.getHeight(), BufferedImage.TYPE_INT_ARGB);
                }
            }
            return image;
        }

        return decodeImageImpl(imageType, imageElement, icnsElements);
    }

    private static BufferedImage decodeImageImpl(final IcnsType imageType,
                                                 final IcnsElement imageElement,
                                                 final IcnsElement[] icnsElements) throws ImageReadException {
        final int expectedSize = (imageType.getWidth() * imageType.getHeight()
                                  * imageType.getBitsPerPixel() + 7) / 8;
        byte[] imageData;
        if (imageElement.data.length < expectedSize) {
            if (imageType.getBitsPerPixel() != 32) {
                throw new ImageReadException("Short image data but not a 32 bit compressed type");
            }
            imageData = Rle24Compression.decompress(
              imageType.getWidth(), imageType.getHeight(),
              imageElement.data);
        } else {
            imageData = imageElement.data;
        }

        final ImageBuilder imageBuilder = new ImageBuilder(imageType.getWidth(),
                                                           imageType.getHeight(), true);
        switch (imageType.getBitsPerPixel()) {
            case 1:
                decode1BPPImage(imageType, imageData, imageBuilder);
                break;
            case 4:
                decode4BPPImage(imageType, imageData, imageBuilder);
                break;
            case 8:
                decode8BPPImage(imageType, imageData, imageBuilder);
                break;
            case 32:
                decode32BPPImage(imageType, imageData, imageBuilder);
                break;
            default:
                throw new ImageReadException("Unsupported bit depth " + imageType.getBitsPerPixel());
        }

        IcnsType maskType;
        IcnsElement maskElement = null;
        if (imageType.hasMask()) {
            maskType = imageType;
            maskElement = imageElement;
        } else {
            maskType = IcnsType.find8BPPMaskType(imageType);
            if (maskType != null) {
                for (final IcnsElement icnsElement : icnsElements) {
                    if (icnsElement.type == maskType.getType()) {
                        maskElement = icnsElement;
                        break;
                    }
                }
            }
            if (maskElement == null) {
                maskType = IcnsType.find1BPPMaskType(imageType);
                if (maskType != null) {
                    for (final IcnsElement icnsElement : icnsElements) {
                        if (icnsElement.type == maskType.getType()) {
                            maskElement = icnsElement;
                            break;
                        }
                    }
                }
            }
        }

        if (maskElement != null) {
            if (maskType.getBitsPerPixel() == 1) {
                apply1BPPMask(maskElement.data, imageBuilder);
            } else if (maskType.getBitsPerPixel() == 8) {
                apply8BPPMask(maskElement.data, imageBuilder);
            } else {
                throw new ImageReadException("Unsupported mask bit depth " + maskType.getBitsPerPixel());
            }
        }

        return imageBuilder.getBufferedImage();
    }
}
