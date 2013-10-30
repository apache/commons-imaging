/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */

package org.apache.commons.imaging.formats.pcx;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.PixelDensity;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.ByteOrder;
import org.apache.commons.imaging.palette.PaletteFactory;
import org.apache.commons.imaging.palette.SimplePalette;

public class PcxWriter implements PcxConstants {
    private int encoding;
    private int bitDepth = -1;
    private PixelDensity pixelDensity = null;

    public PcxWriter(Map<String,Object> params) throws ImageWriteException {
        // make copy of params; we'll clear keys as we consume them.
        params = (params == null) ? new HashMap<String,Object>() : new HashMap<String,Object>(params);

        // clear format key.
        if (params.containsKey(PARAM_KEY_FORMAT)) {
            params.remove(PARAM_KEY_FORMAT);
        }

        // uncompressed PCX files are not even documented in ZSoft's spec,
        // let alone supported by most image viewers
        encoding = PcxImageParser.PcxHeader.ENCODING_RLE;
        if (params.containsKey(PARAM_KEY_PCX_COMPRESSION)) {
            final Object value = params.remove(PARAM_KEY_PCX_COMPRESSION);
            if (value != null) {
                if (!(value instanceof Number)) {
                    throw new ImageWriteException(
                            "Invalid compression parameter: " + value);
                }
                final int compression = ((Number) value).intValue();
                if (compression == PCX_COMPRESSION_UNCOMPRESSED) {
                    encoding = PcxImageParser.PcxHeader.ENCODING_UNCOMPRESSED;
                }
            }
        }

        if (params.containsKey(PARAM_KEY_PCX_BIT_DEPTH)) {
            final Object value = params.remove(PARAM_KEY_PCX_BIT_DEPTH);
            if (value != null) {
                if (!(value instanceof Number)) {
                    throw new ImageWriteException(
                            "Invalid bit depth parameter: " + value);
                }
                bitDepth = ((Number) value).intValue();
            }
        }

        if (params.containsKey(PARAM_KEY_PIXEL_DENSITY)) {
            final Object value = params.remove(PARAM_KEY_PIXEL_DENSITY);
            if (value != null) {
                if (!(value instanceof PixelDensity)) {
                    throw new ImageWriteException(
                            "Invalid pixel density parameter");
                }
                pixelDensity = (PixelDensity) value;
            }
        }
        if (pixelDensity == null) {
            // DPI is mandatory, so we have to invent something
            pixelDensity = PixelDensity.createFromPixelsPerInch(72, 72);
        }

        if (params.size() > 0) {
            final Object firstKey = params.keySet().iterator().next();
            throw new ImageWriteException("Unknown parameter: " + firstKey);
        }
    }

    private void writeScanLine(final BinaryOutputStream bos, final byte[] scanline)
            throws IOException, ImageWriteException {
        if (encoding == PcxImageParser.PcxHeader.ENCODING_UNCOMPRESSED) {
            bos.write(scanline);
        } else {
            if (encoding == PcxImageParser.PcxHeader.ENCODING_RLE) {
                int previousByte = -1;
                int repeatCount = 0;
                for (final byte element : scanline) {
                    if ((element & 0xff) == previousByte
                            && repeatCount < 63) {
                        ++repeatCount;
                    } else {
                        if (repeatCount > 0) {
                            if (repeatCount == 1
                                    && (previousByte & 0xc0) != 0xc0) {
                                bos.write(previousByte);
                            } else {
                                bos.write(0xc0 | repeatCount);
                                bos.write(previousByte);
                            }
                        }
                        previousByte = 0xff & element;
                        repeatCount = 1;
                    }
                }
                if (repeatCount > 0) {
                    if (repeatCount == 1 && (previousByte & 0xc0) != 0xc0) {
                        bos.write(previousByte);
                    } else {
                        bos.write(0xc0 | repeatCount);
                        bos.write(previousByte);
                    }
                }
            } else {
                throw new ImageWriteException("Invalid PCX encoding "
                        + encoding);
            }
        }
    }

    public void writeImage(final BufferedImage src, final OutputStream os)
            throws ImageWriteException, IOException {
        final PaletteFactory paletteFactory = new PaletteFactory();
        final SimplePalette palette = paletteFactory
                .makeExactRgbPaletteSimple(src, 256);
        final BinaryOutputStream bos = new BinaryOutputStream(os,
                ByteOrder.INTEL);
        if (palette == null || bitDepth == 24 || bitDepth == 32) {
            if (bitDepth == 32) {
                write32BppPCX(src, bos);
            } else {
                write24BppPCX(src, bos);
            }
        } else if (palette.length() > 16 || bitDepth == 8) {
            write256ColorPCX(src, palette, bos);
        } else if (palette.length() > 2 || bitDepth == 4) {
            write16ColorPCX(src, palette, bos);
        } else {
            boolean onlyBlackAndWhite = true;
            if (palette.length() >= 1) {
                final int rgb = palette.getEntry(0);
                if (rgb != 0 && rgb != 0xffffff) {
                    onlyBlackAndWhite = false;
                }
            }
            if (palette.length() == 2) {
                final int rgb = palette.getEntry(1);
                if (rgb != 0 && rgb != 0xffffff) {
                    onlyBlackAndWhite = false;
                }
            }
            if (onlyBlackAndWhite) {
                writeBlackAndWhitePCX(src, palette, bos);
            } else {
                write16ColorPCX(src, palette, bos);
            }
        }
    }

    private void write32BppPCX(final BufferedImage src, final BinaryOutputStream bos)
            throws ImageWriteException, IOException {
        final int bytesPerLine = src.getWidth() % 2 == 0 ? src.getWidth() : src
                .getWidth() + 1;

        // PCX header
        bos.write(10); // manufacturer
        bos.write(5); // version
        bos.write(encoding); // encoding
        bos.write(32); // bits per pixel
        bos.write2Bytes(0); // xMin
        bos.write2Bytes(0); // yMin
        bos.write2Bytes(src.getWidth() - 1); // xMax
        bos.write2Bytes(src.getHeight() - 1); // yMax
        bos.write2Bytes((short) Math.round(pixelDensity
                .horizontalDensityInches())); // hDpi
        bos.write2Bytes((short) Math.round(pixelDensity.verticalDensityInches())); // vDpi
        bos.write(new byte[48]); // 16 color palette
        bos.write(0); // reserved
        bos.write(1); // planes
        bos.write2Bytes(bytesPerLine); // bytes per line
        bos.write2Bytes(1); // palette info
        bos.write2Bytes(0); // hScreenSize
        bos.write2Bytes(0); // vScreenSize
        bos.write(new byte[54]);

        final int rgbs[] = new int[src.getWidth()];
        final byte rgbBytes[] = new byte[4 * bytesPerLine];
        for (int y = 0; y < src.getHeight(); y++) {
            src.getRGB(0, y, src.getWidth(), 1, rgbs, 0, src.getWidth());
            for (int x = 0; x < rgbs.length; x++) {
                rgbBytes[4 * x + 0] = (byte) (rgbs[x] & 0xff);
                rgbBytes[4 * x + 1] = (byte) ((rgbs[x] >> 8) & 0xff);
                rgbBytes[4 * x + 2] = (byte) ((rgbs[x] >> 16) & 0xff);
                rgbBytes[4 * x + 3] = 0;
            }
            writeScanLine(bos, rgbBytes);
        }
    }

    private void write24BppPCX(final BufferedImage src, final BinaryOutputStream bos)
            throws ImageWriteException, IOException {
        final int bytesPerLine = src.getWidth() % 2 == 0 ? src.getWidth() : src
                .getWidth() + 1;

        // PCX header
        bos.write(10); // manufacturer
        bos.write(5); // version
        bos.write(encoding); // encoding
        bos.write(8); // bits per pixel
        bos.write2Bytes(0); // xMin
        bos.write2Bytes(0); // yMin
        bos.write2Bytes(src.getWidth() - 1); // xMax
        bos.write2Bytes(src.getHeight() - 1); // yMax
        bos.write2Bytes((short) Math.round(pixelDensity
                .horizontalDensityInches())); // hDpi
        bos.write2Bytes((short) Math.round(pixelDensity.verticalDensityInches())); // vDpi
        bos.write(new byte[48]); // 16 color palette
        bos.write(0); // reserved
        bos.write(3); // planes
        bos.write2Bytes(bytesPerLine); // bytes per line
        bos.write2Bytes(1); // palette info
        bos.write2Bytes(0); // hScreenSize
        bos.write2Bytes(0); // vScreenSize
        bos.write(new byte[54]);

        final int rgbs[] = new int[src.getWidth()];
        final byte rgbBytes[] = new byte[3 * bytesPerLine];
        for (int y = 0; y < src.getHeight(); y++) {
            src.getRGB(0, y, src.getWidth(), 1, rgbs, 0, src.getWidth());
            for (int x = 0; x < rgbs.length; x++) {
                rgbBytes[x] = (byte) ((rgbs[x] >> 16) & 0xff);
                rgbBytes[bytesPerLine + x] = (byte) ((rgbs[x] >> 8) & 0xff);
                rgbBytes[2 * bytesPerLine + x] = (byte) (rgbs[x] & 0xff);
            }
            writeScanLine(bos, rgbBytes);
        }
    }

    private void writeBlackAndWhitePCX(final BufferedImage src,
            final SimplePalette palette, final BinaryOutputStream bos)
            throws ImageWriteException, IOException {
        int bytesPerLine = (src.getWidth() + 7) / 8;
        if (bytesPerLine % 2 != 0) {
            ++bytesPerLine;
        }

        // PCX header
        bos.write(10); // manufacturer
        bos.write(3); // version - it seems some apps only open
        // black and white files if the version is 3...
        bos.write(encoding); // encoding
        bos.write(1); // bits per pixel
        bos.write2Bytes(0); // xMin
        bos.write2Bytes(0); // yMin
        bos.write2Bytes(src.getWidth() - 1); // xMax
        bos.write2Bytes(src.getHeight() - 1); // yMax
        bos.write2Bytes((short) Math.round(pixelDensity
                .horizontalDensityInches())); // hDpi
        bos.write2Bytes((short) Math.round(pixelDensity.verticalDensityInches())); // vDpi
        bos.write(new byte[48]); // 16 color palette
        bos.write(0); // reserved
        bos.write(1); // planes
        bos.write2Bytes(bytesPerLine); // bytes per line
        bos.write2Bytes(1); // palette info
        bos.write2Bytes(0); // hScreenSize
        bos.write2Bytes(0); // vScreenSize
        bos.write(new byte[54]);

        final byte[] row = new byte[bytesPerLine];
        for (int y = 0; y < src.getHeight(); y++) {
            Arrays.fill(row, (byte) 0);
            for (int x = 0; x < src.getWidth(); x++) {
                final int rgb = 0xffffff & src.getRGB(x, y);
                int bit;
                if (rgb == 0x000000) {
                    bit = 0;
                } else if (rgb == 0xffffff) {
                    bit = 1;
                } else {
                    throw new ImageWriteException(
                            "Pixel neither black nor white");
                }
                row[x / 8] |= (bit << (7 - (x % 8)));
            }
            writeScanLine(bos, row);
        }
    }

    private void write16ColorPCX(final BufferedImage src, final SimplePalette palette,
            final BinaryOutputStream bos) throws ImageWriteException, IOException {
        int bytesPerLine = (src.getWidth() + 1) / 2;
        if (bytesPerLine % 2 != 0) {
            ++bytesPerLine;
        }

        final byte[] palette16 = new byte[16 * 3];
        for (int i = 0; i < 16; i++) {
            int rgb;
            if (i < palette.length()) {
                rgb = palette.getEntry(i);
            } else {
                rgb = 0;
            }
            palette16[3 * i + 0] = (byte) (0xff & (rgb >> 16));
            palette16[3 * i + 1] = (byte) (0xff & (rgb >> 8));
            palette16[3 * i + 2] = (byte) (0xff & rgb);
        }

        // PCX header
        bos.write(10); // manufacturer
        bos.write(5); // version
        bos.write(encoding); // encoding
        bos.write(4); // bits per pixel
        bos.write2Bytes(0); // xMin
        bos.write2Bytes(0); // yMin
        bos.write2Bytes(src.getWidth() - 1); // xMax
        bos.write2Bytes(src.getHeight() - 1); // yMax
        bos.write2Bytes((short) Math.round(pixelDensity
                .horizontalDensityInches())); // hDpi
        bos.write2Bytes((short) Math.round(pixelDensity.verticalDensityInches())); // vDpi
        bos.write(palette16); // 16 color palette
        bos.write(0); // reserved
        bos.write(1); // planes
        bos.write2Bytes(bytesPerLine); // bytes per line
        bos.write2Bytes(1); // palette info
        bos.write2Bytes(0); // hScreenSize
        bos.write2Bytes(0); // vScreenSize
        bos.write(new byte[54]);

        final byte[] indeces = new byte[bytesPerLine];
        for (int y = 0; y < src.getHeight(); y++) {
            Arrays.fill(indeces, (byte) 0);
            for (int x = 0; x < src.getWidth(); x++) {
                final int argb = src.getRGB(x, y);
                final int index = palette.getPaletteIndex(0xffffff & argb);
                indeces[x / 2] |= (index << 4 * (1 - (x % 2)));
            }
            writeScanLine(bos, indeces);
        }
    }

    private void write256ColorPCX(final BufferedImage src, final SimplePalette palette,
            final BinaryOutputStream bos) throws ImageWriteException, IOException {
        final int bytesPerLine = src.getWidth() % 2 == 0 ? src.getWidth() : src
                .getWidth() + 1;

        // PCX header
        bos.write(10); // manufacturer
        bos.write(5); // version
        bos.write(encoding); // encoding
        bos.write(8); // bits per pixel
        bos.write2Bytes(0); // xMin
        bos.write2Bytes(0); // yMin
        bos.write2Bytes(src.getWidth() - 1); // xMax
        bos.write2Bytes(src.getHeight() - 1); // yMax
        bos.write2Bytes((short) Math.round(pixelDensity
                .horizontalDensityInches())); // hDpi
        bos.write2Bytes((short) Math.round(pixelDensity.verticalDensityInches())); // vDpi
        bos.write(new byte[48]); // 16 color palette
        bos.write(0); // reserved
        bos.write(1); // planes
        bos.write2Bytes(bytesPerLine); // bytes per line
        bos.write2Bytes(1); // palette info
        bos.write2Bytes(0); // hScreenSize
        bos.write2Bytes(0); // vScreenSize
        bos.write(new byte[54]);

        final byte[] indeces = new byte[bytesPerLine];
        for (int y = 0; y < src.getHeight(); y++) {
            for (int x = 0; x < src.getWidth(); x++) {
                final int argb = src.getRGB(x, y);
                final int index = palette.getPaletteIndex(0xffffff & argb);
                indeces[x] = (byte) index;
            }
            writeScanLine(bos, indeces);
        }
        // palette
        bos.write(12);
        for (int i = 0; i < 256; i++) {
            int rgb;
            if (i < palette.length()) {
                rgb = palette.getEntry(i);
            } else {
                rgb = 0;
            }
            bos.write((rgb >> 16) & 0xff);
            bos.write((rgb >> 8) & 0xff);
            bos.write(rgb & 0xff);
        }
    }
}
