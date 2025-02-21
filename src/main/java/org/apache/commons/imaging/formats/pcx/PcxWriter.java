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

import org.apache.commons.imaging.PixelDensity;
import org.apache.commons.imaging.common.Allocator;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.palette.PaletteFactory;
import org.apache.commons.imaging.palette.SimplePalette;

final class PcxWriter {
    private final int encoding;
    private final int bitDepthWanted;
    private final int planesWanted;
    private final PixelDensity pixelDensity;
    private final RleWriter rleWriter;

    PcxWriter(PcxImagingParameters params) {
        // uncompressed PCX files are not even documented in ZSoft's spec,
        // let alone supported by most image viewers
        if (params == null) {
            params = new PcxImagingParameters();
        }
        encoding = params.getCompression() == PcxConstants.PCX_COMPRESSION_UNCOMPRESSED ? PcxImageParser.PcxHeader.ENCODING_UNCOMPRESSED
                : PcxImageParser.PcxHeader.ENCODING_RLE;
        rleWriter = new RleWriter(encoding != PcxImageParser.PcxHeader.ENCODING_UNCOMPRESSED);
        bitDepthWanted = params.getBitDepth();
        planesWanted = params.getPlanes();
        final PixelDensity pixelDensityParam = params.getPixelDensity();
        // DPI is mandatory, so we have to invent something
        pixelDensity = pixelDensityParam != null ? pixelDensityParam : PixelDensity.createFromPixelsPerInch(72, 72);
    }

    public void writeImage(final BufferedImage src, final OutputStream os) throws IOException {
        final PaletteFactory paletteFactory = new PaletteFactory();
        PcxCoverageLogger.logBranch_run(1);
        final SimplePalette palette = paletteFactory.makeExactRgbPaletteSimple(src, 256);
        PcxCoverageLogger.logBranch_run(2);
        final BinaryOutputStream bos = BinaryOutputStream.littleEndian(os);
        PcxCoverageLogger.logBranch_run(3);
        final int bitDepth;
        final int planes;
        if (palette == null || bitDepthWanted == 24 || bitDepthWanted == 32) {
            if (bitDepthWanted == 32) {
                bitDepth = 32;
                planes = 1;
                PcxCoverageLogger.logBranch_run(4);
            } else {
                bitDepth = 8;
                planes = 3;
                PcxCoverageLogger.logBranch_run(5);
            }
        } else if (palette.length() > 16 || bitDepthWanted == 8) {
            bitDepth = 8;
            planes = 1;
            PcxCoverageLogger.logBranch_run(6);
        } else if (palette.length() > 8 || bitDepthWanted == 4) {
            if (planesWanted == 1) {
                bitDepth = 4;
                planes = 1;
                PcxCoverageLogger.logBranch_run(7);
            } else {
                bitDepth = 1;
                planes = 4;
                PcxCoverageLogger.logBranch_run(8);
            }
        } else if (palette.length() > 4 || bitDepthWanted == 3) {
            bitDepth = 1;
            planes = 3;
            PcxCoverageLogger.logBranch_run(9);
        } else if (palette.length() > 2 || bitDepthWanted == 2) {
            if (planesWanted == 2) {
                bitDepth = 1;
                planes = 2;
                PcxCoverageLogger.logBranch_run(10);
            } else {
                bitDepth = 2;
                planes = 1;
                PcxCoverageLogger.logBranch_run(11);
            }
        } else {
            boolean onlyBlackAndWhite = true;
            if (palette.length() >= 1) {
                final int rgb = palette.getEntry(0);
                if (rgb != 0 && rgb != 0xffffff) {
                    onlyBlackAndWhite = false;
                    PcxCoverageLogger.logBranch_run(12);
                }
                else {
                    PcxCoverageLogger.logBranch_run(13);
                }
            }else {
                PcxCoverageLogger.logBranch_run(14);
            }
            if (palette.length() == 2) {
                final int rgb = palette.getEntry(1);
                if (rgb != 0 && rgb != 0xffffff) {
                    onlyBlackAndWhite = false;
                    PcxCoverageLogger.logBranch_run(15);
                }
                else {
                    PcxCoverageLogger.logBranch_run(16);
                }
            }else {
                PcxCoverageLogger.logBranch_run(17);
            }
            if (onlyBlackAndWhite) {
                bitDepth = 1;
                planes = 1;
                PcxCoverageLogger.logBranch_run(18);
            } else {
                bitDepth = 1;
                planes = 2;
                PcxCoverageLogger.logBranch_run(19);
            }
        }

        int bytesPerLine = (bitDepth * src.getWidth() + 7) / 8;
        if (bytesPerLine % 2 != 0) {
            // must be even:
            bytesPerLine++;
            PcxCoverageLogger.logBranch_run(20);
        }else {
            PcxCoverageLogger.logBranch_run(21);
        }

        final byte[] palette16 = new byte[16 * 3];
        // TODO What's the right thing to do here for a null palette?
        final int paletteLen = palette != null ? palette.length() : 0;
        for (int i = 0; i < 16; i++) {
            final int rgb;
            if (i < paletteLen) {
                rgb = palette.getEntry(i);
                PcxCoverageLogger.logBranch_run(22);
            } else {
                rgb = 0;
                PcxCoverageLogger.logBranch_run(23);
            }
            palette16[3 * i + 0] = (byte) (0xff & rgb >> 16);
            palette16[3 * i + 1] = (byte) (0xff & rgb >> 8);
            palette16[3 * i + 2] = (byte) (0xff & rgb);
        }

        // PCX header
        bos.write(10); // manufacturer
        bos.write(bitDepth == 1 && planes == 1 ? 3 : 5); // version. Some apps only open black and white PCX with version=3.
        bos.write(encoding); // encoding
        bos.write(bitDepth); // bits per pixel
        bos.write2Bytes(0); // xMin
        bos.write2Bytes(0); // yMin
        bos.write2Bytes(src.getWidth() - 1); // xMax
        bos.write2Bytes(src.getHeight() - 1); // yMax
        bos.write2Bytes((short) Math.round(pixelDensity.horizontalDensityInches())); // hDpi
        bos.write2Bytes((short) Math.round(pixelDensity.verticalDensityInches())); // vDpi
        bos.write(palette16); // 16 color palette
        bos.write(0); // reserved
        bos.write(planes); // planes
        bos.write2Bytes(bytesPerLine); // bytes per line
        bos.write2Bytes(1); // palette info
        bos.write2Bytes(0); // hScreenSize
        bos.write2Bytes(0); // vScreenSize
        bos.write(new byte[54]);

        if (bitDepth == 32) {
            writePixels32(src, bytesPerLine, bos);
            PcxCoverageLogger.logBranch_run(24);
        } else {
            writePixels(src, bitDepth, planes, bytesPerLine, palette, bos);
            PcxCoverageLogger.logBranch_run(25);
        }

        if (bitDepth == 8 && planes == 1) {
            // 256 color palette
            bos.write(12);
            for (int i = 0; i < 256; i++) {
                final int rgb;
                if (i < palette.length()) {
                    rgb = palette.getEntry(i);
                    PcxCoverageLogger.logBranch_run(26);
                } else {
                    rgb = 0;
                    PcxCoverageLogger.logBranch_run(27);
                }
                bos.write(rgb >> 16 & 0xff);
                bos.write(rgb >> 8 & 0xff);
                bos.write(rgb & 0xff);
            }
        }else {
            PcxCoverageLogger.logBranch_run(28);
        }
    }

    private void writePixels(final BufferedImage src, final int bitDepth, final int planes, final int bytesPerLine, final SimplePalette palette,
            final BinaryOutputStream bos) throws IOException {
        final byte[] plane0 = Allocator.byteArray(bytesPerLine);
        final byte[] plane1 = Allocator.byteArray(bytesPerLine);
        final byte[] plane2 = Allocator.byteArray(bytesPerLine);
        final byte[] plane3 = Allocator.byteArray(bytesPerLine);
        final byte[][] allPlanes = { plane0, plane1, plane2, plane3 };

        for (int y = 0; y < src.getHeight(); y++) {
            for (int i = 0; i < planes; i++) {
                Arrays.fill(allPlanes[i], (byte) 0);
            }

            if (bitDepth == 1 && planes == 1) {
                for (int x = 0; x < src.getWidth(); x++) {
                    final int rgb = 0xffffff & src.getRGB(x, y);
                    final int bit;
                    if (rgb == 0x000000) {
                        bit = 0;
                    } else {
                        bit = 1;
                    }
                    plane0[x >>> 3] |= bit << 7 - (x & 7);
                }
            } else if (bitDepth == 1 && planes == 2) {
                for (int x = 0; x < src.getWidth(); x++) {
                    final int argb = src.getRGB(x, y);
                    final int index = palette.getPaletteIndex(0xffffff & argb);
                    plane0[x >>> 3] |= (index & 1) << 7 - (x & 7);
                    plane1[x >>> 3] |= (index & 2) >> 1 << 7 - (x & 7);
                }
            } else if (bitDepth == 1 && planes == 3) {
                for (int x = 0; x < src.getWidth(); x++) {
                    final int argb = src.getRGB(x, y);
                    final int index = palette.getPaletteIndex(0xffffff & argb);
                    plane0[x >>> 3] |= (index & 1) << 7 - (x & 7);
                    plane1[x >>> 3] |= (index & 2) >> 1 << 7 - (x & 7);
                    plane2[x >>> 3] |= (index & 4) >> 2 << 7 - (x & 7);
                }
            } else if (bitDepth == 1 && planes == 4) {
                for (int x = 0; x < src.getWidth(); x++) {
                    final int argb = src.getRGB(x, y);
                    final int index = palette.getPaletteIndex(0xffffff & argb);
                    plane0[x >>> 3] |= (index & 1) << 7 - (x & 7);
                    plane1[x >>> 3] |= (index & 2) >> 1 << 7 - (x & 7);
                    plane2[x >>> 3] |= (index & 4) >> 2 << 7 - (x & 7);
                    plane3[x >>> 3] |= (index & 8) >> 3 << 7 - (x & 7);
                }
            } else if (bitDepth == 2 && planes == 1) {
                for (int x = 0; x < src.getWidth(); x++) {
                    final int argb = src.getRGB(x, y);
                    final int index = palette.getPaletteIndex(0xffffff & argb);
                    plane0[x >>> 2] |= index << 2 * (3 - (x & 3));
                }
            } else if (bitDepth == 4 && planes == 1) {
                for (int x = 0; x < src.getWidth(); x++) {
                    final int argb = src.getRGB(x, y);
                    final int index = palette.getPaletteIndex(0xffffff & argb);
                    plane0[x >>> 1] |= index << 4 * (1 - (x & 1));
                }
            } else if (bitDepth == 8 && planes == 1) {
                for (int x = 0; x < src.getWidth(); x++) {
                    final int argb = src.getRGB(x, y);
                    final int index = palette.getPaletteIndex(0xffffff & argb);
                    plane0[x] = (byte) index;
                }
            } else if (bitDepth == 8 && planes == 3) {
                for (int x = 0; x < src.getWidth(); x++) {
                    final int argb = src.getRGB(x, y);
                    plane0[x] = (byte) (argb >>> 16);
                    plane1[x] = (byte) (argb >>> 8);
                    plane2[x] = (byte) argb;
                }
            }

            for (int i = 0; i < planes; i++) {
                rleWriter.write(bos, allPlanes[i]);
            }
        }
        rleWriter.flush(bos);
    }

    private void writePixels32(final BufferedImage src, final int bytesPerLine, final BinaryOutputStream bos) throws IOException {

        final int[] rgbs = Allocator.intArray(src.getWidth());
        final byte[] plane = Allocator.byteArray(4 * bytesPerLine);
        for (int y = 0; y < src.getHeight(); y++) {
            src.getRGB(0, y, src.getWidth(), 1, rgbs, 0, src.getWidth());
            for (int x = 0; x < rgbs.length; x++) {
                plane[4 * x + 0] = (byte) rgbs[x];
                plane[4 * x + 1] = (byte) (rgbs[x] >> 8);
                plane[4 * x + 2] = (byte) (rgbs[x] >> 16);
                plane[4 * x + 3] = 0;
            }
            rleWriter.write(bos, plane);
        }
        rleWriter.flush(bos);
    }
}
