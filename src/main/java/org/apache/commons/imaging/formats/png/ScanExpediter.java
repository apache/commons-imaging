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
package org.apache.commons.imaging.formats.png;

import static org.apache.commons.imaging.common.BinaryFunctions.readBytes;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.formats.png.chunks.PngChunkPlte;
import org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilter;
import org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilterAverage;
import org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilterNone;
import org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilterPaeth;
import org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilterSub;
import org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilterUp;
import org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilter;

abstract class ScanExpediter {
    final int width;
    final int height;
    final InputStream is;
    final BufferedImage bi;
    final PngColorType pngColorType;
    final int bitDepth;
    final int bytesPerPixel;
    final int bitsPerPixel;
    final PngChunkPlte pngChunkPLTE;
    final GammaCorrection gammaCorrection;
    final TransparencyFilter transparencyFilter;

    ScanExpediter(final int width, final int height, final InputStream is,
            final BufferedImage bi, final PngColorType pngColorType, final int bitDepth, final int bitsPerPixel,
            final PngChunkPlte pngChunkPLTE, final GammaCorrection gammaCorrection,
            final TransparencyFilter transparencyFilter) {
        this.width = width;
        this.height = height;
        this.is = is;
        this.bi = bi;
        this.pngColorType = pngColorType;
        this.bitDepth = bitDepth;
        this.bytesPerPixel = this.getBitsToBytesRoundingUp(bitsPerPixel);
        this.bitsPerPixel = bitsPerPixel;
        this.pngChunkPLTE = pngChunkPLTE;
        this.gammaCorrection = gammaCorrection;
        this.transparencyFilter = transparencyFilter;
    }

    final int getBitsToBytesRoundingUp(final int bits) {
        return (bits + 7) / 8;
    }

    final int getPixelARGB(final int alpha, final int red, final int green, final int blue) {
        return ((0xff & alpha) << 24)
             | ((0xff & red)   << 16)
             | ((0xff & green) << 8)
             | ((0xff & blue)  << 0);
    }

    final int getPixelRGB(final int red, final int green, final int blue) {
        return getPixelARGB(0xff, red, green, blue);
    }

    public abstract void drive() throws ImageReadException, IOException;

    int getRGB(final BitParser bitParser, final int pixelIndexInScanline)
            throws ImageReadException, IOException {

        switch (pngColorType) {
        case GREYSCALE: {
            // 1,2,4,8,16 Each pixel is a grayscale sample.
            int sample = bitParser.getSampleAsByte(pixelIndexInScanline, 0);

            if (gammaCorrection != null) {
                sample = gammaCorrection.correctSample(sample);
            }

            int rgb = getPixelRGB(sample, sample, sample);

            if (transparencyFilter != null) {
                rgb = transparencyFilter.filter(rgb, sample);
            }

            return rgb;

        }
        case TRUE_COLOR: {
            // 8,16 Each pixel is an R,G,B triple.
            int red = bitParser.getSampleAsByte(pixelIndexInScanline, 0);
            int green = bitParser.getSampleAsByte(pixelIndexInScanline, 1);
            int blue = bitParser.getSampleAsByte(pixelIndexInScanline, 2);

            int rgb = getPixelRGB(red, green, blue);

            if (transparencyFilter != null) {
                rgb = transparencyFilter.filter(rgb, -1);
            }

            if (gammaCorrection != null) {
                final int alpha = (0xff000000 & rgb) >> 24; // make sure to preserve
                // transparency
                red = gammaCorrection.correctSample(red);
                green = gammaCorrection.correctSample(green);
                blue = gammaCorrection.correctSample(blue);
                rgb = getPixelARGB(alpha, red, green, blue);
            }

            return rgb;
        }
        //
        case INDEXED_COLOR: {
            // 1,2,4,8 Each pixel is a palette index;
            // a PLTE chunk must appear.
            final int index = bitParser.getSample(pixelIndexInScanline, 0);

            int rgb = pngChunkPLTE.getRGB(index);

            if (transparencyFilter != null) {
                rgb = transparencyFilter.filter(rgb, index);
            }

            return rgb;
        }
        case GREYSCALE_WITH_ALPHA: {
            // 8,16 Each pixel is a grayscale sample,
            // followed by an alpha sample.
            int sample = bitParser.getSampleAsByte(pixelIndexInScanline, 0);
            final int alpha = bitParser.getSampleAsByte(pixelIndexInScanline, 1);

            if (gammaCorrection != null) {
                sample = gammaCorrection.correctSample(sample);
            }

            return getPixelARGB(alpha, sample, sample, sample);
        }
        case TRUE_COLOR_WITH_ALPHA: {
            // 8,16 Each pixel is an R,G,B triple,
            int red = bitParser.getSampleAsByte(pixelIndexInScanline, 0);
            int green = bitParser.getSampleAsByte(pixelIndexInScanline, 1);
            int blue = bitParser.getSampleAsByte(pixelIndexInScanline, 2);
            final int alpha = bitParser.getSampleAsByte(pixelIndexInScanline, 3);

            if (gammaCorrection != null) {
                red = gammaCorrection.correctSample(red);
                green = gammaCorrection.correctSample(green);
                blue = gammaCorrection.correctSample(blue);
            }

            return getPixelARGB(alpha, red, green, blue);
        }
        default:
            throw new ImageReadException("PNG: unknown color type: " + pngColorType);
        }
    }

    ScanlineFilter getScanlineFilter(final FilterType filterType, final int bytesPerPixel) throws ImageReadException {
        switch (filterType) {
            case NONE:
                return new ScanlineFilterNone();
            case SUB:
                return new ScanlineFilterSub(bytesPerPixel);
            case UP:
                return new ScanlineFilterUp();
            case AVERAGE:
                return new ScanlineFilterAverage(bytesPerPixel);
            case PAETH:
                return new ScanlineFilterPaeth(bytesPerPixel);
        }

        return null;
    }

    byte[] unfilterScanline(final FilterType filterType, final byte[] src, final byte[] prev,
            final int bytesPerPixel) throws ImageReadException, IOException {
        final ScanlineFilter filter = getScanlineFilter(filterType, bytesPerPixel);

        final byte[] dst = new byte[src.length];
        filter.unfilter(src, dst, prev);
        return dst;
    }

    byte[] getNextScanline(final InputStream is, final int length, final byte[] prev,
            final int bytesPerPixel) throws ImageReadException, IOException {
        final int filterType = is.read();
        if (filterType < 0) {
            throw new ImageReadException("PNG: missing filter type");
        }
        if (filterType >= FilterType.values().length) {
            throw new ImageReadException("PNG: unknown filterType: " + filterType);
        }

        final byte[] scanline = readBytes("scanline", is, length, "PNG: missing image data");

        return unfilterScanline(FilterType.values()[filterType], scanline, prev, bytesPerPixel);
    }

}
