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

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.BinaryFileParser;
import org.apache.commons.imaging.formats.png.chunks.PngChunkPlte;
import org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilter;
import org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilterAverage;
import org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilterNone;
import org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilterPaeth;
import org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilterSub;
import org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilterUp;
import org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilter;

public abstract class ScanExpediter extends BinaryFileParser {
    protected final int width;
    protected final int height;
    protected final InputStream is;
    protected final BufferedImage bi;
    protected final int colorType;
    protected final int bitDepth;
    protected final int bytesPerPixel;
    protected final int bitsPerPixel;
    protected final PngChunkPlte pngChunkPLTE;
    protected final GammaCorrection gammaCorrection;
    protected final TransparencyFilter transparencyFilter;

    public ScanExpediter(final int width, final int height, final InputStream is,
            final BufferedImage bi, final int colorType, final int bitDepth, final int bitsPerPixel,
            final PngChunkPlte pngChunkPLTE, final GammaCorrection gammaCorrection,
            final TransparencyFilter transparencyFilter)

    {
        this.width = width;
        this.height = height;
        this.is = is;
        this.bi = bi;
        this.colorType = colorType;
        this.bitDepth = bitDepth;
        this.bytesPerPixel = this.getBitsToBytesRoundingUp(bitsPerPixel);
        this.bitsPerPixel = bitsPerPixel;
        this.pngChunkPLTE = pngChunkPLTE;
        this.gammaCorrection = gammaCorrection;
        this.transparencyFilter = transparencyFilter;
    }

    protected final int getBitsToBytesRoundingUp(final int bits) {
        return (bits + 7) / 8;
    }

    protected final int getPixelARGB(final int alpha, final int red, final int green, final int blue) {
        return ((0xff & alpha) << 24)
             | ((0xff & red)   << 16)
             | ((0xff & green) << 8)
             | ((0xff & blue)  << 0);
    }

    protected final int getPixelRGB(final int red, final int green, final int blue) {
        return getPixelARGB(0xff, red, green, blue);
    }

    public abstract void drive() throws ImageReadException, IOException;

    protected int getRGB(final BitParser bitParser, final int pixelIndexInScanline)
            throws ImageReadException, IOException {

        switch (colorType) {
        case 0: {
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
        case 2: {
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
        case 3: {
            // 1,2,4,8 Each pixel is a palette index;
            // a PLTE chunk must appear.
            final int index = bitParser.getSample(pixelIndexInScanline, 0);

            int rgb = pngChunkPLTE.getRGB(index);

            if (transparencyFilter != null) {
                rgb = transparencyFilter.filter(rgb, index);
            }

            return rgb;
        }
        case 4: {
            // 8,16 Each pixel is a grayscale sample,
            // followed by an alpha sample.
            int sample = bitParser.getSampleAsByte(pixelIndexInScanline, 0);
            final int alpha = bitParser.getSampleAsByte(pixelIndexInScanline, 1);

            if (gammaCorrection != null) {
                sample = gammaCorrection.correctSample(sample);
            }

            return getPixelARGB(alpha, sample, sample, sample);
        }
        case 6: {
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
            throw new ImageReadException("PNG: unknown color type: "
                    + colorType);
        }
    }

    protected ScanlineFilter getScanlineFilter(int filterType, int bytesPerPixel) throws ImageReadException {
        ScanlineFilter filter;

        switch (filterType) {
            case 0: // None
                filter = new ScanlineFilterNone();
                break;

            case 1: // Sub
                filter = new ScanlineFilterSub(bytesPerPixel);
                break;

            case 2: // Up
                filter = new ScanlineFilterUp();
                break;

            case 3: // Average
                filter = new ScanlineFilterAverage(bytesPerPixel);
                break;

            case 4: // Paeth
                filter = new ScanlineFilterPaeth(bytesPerPixel);
                break;

            default:
                throw new ImageReadException("PNG: unknown filterType: " + filterType);
        }

        return filter;
    }

    protected byte[] unfilterScanline(final int filterType, final byte[] src, final byte[] prev,
            final int bytesPerPixel) throws ImageReadException, IOException {
        final ScanlineFilter filter = getScanlineFilter(filterType, bytesPerPixel);

        final byte[] dst = new byte[src.length];
        filter.unfilter(src, dst, prev);
        return dst;
    }

    protected byte[] getNextScanline(final InputStream is, final int length, final byte[] prev,
            final int bytesPerPixel) throws ImageReadException, IOException {
        final int filterType = is.read();
        if (filterType < 0) {
            throw new ImageReadException("PNG: missing filter type");
        }

        byte[] scanline = this.readBytes("scanline", is, length, "PNG: missing image data");

        return unfilterScanline(filterType, scanline, prev, bytesPerPixel);
    }

}
