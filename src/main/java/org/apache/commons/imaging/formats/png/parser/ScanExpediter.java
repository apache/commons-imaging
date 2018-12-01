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
package org.apache.commons.imaging.formats.png.parser;

import static org.apache.commons.imaging.common.BinaryFunctions.readBytes;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.formats.png.GammaCorrection;
import org.apache.commons.imaging.formats.png.PngColorType;
import org.apache.commons.imaging.formats.png.chunks.PngChunkPlte;
import org.apache.commons.imaging.formats.png.scanline.filters.AdaptiveFilter;
import static org.apache.commons.imaging.formats.png.scanline.filters.AdaptiveFilter.FilterType;
import org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilter;

public abstract class ScanExpediter {
    
    final int width;
    final int height;
    final InputStream is;
    final BufferedImage bi;
    final PngColorType pngColorType;
    
    final int bitDepth;
    final int bytesPerPixel;
    final int bitsPerPixel;
    final int bitsPerLine;
    final int bytesPerLine;
    
    final PngChunkPlte pngChunkPLTE;
    final GammaCorrection gammaCorrection;
    final TransparencyFilter transparencyFilter;
   
    final AdaptiveFilter filterObject;

    public ScanExpediter(final int width, final int height, final InputStream is,
            final BufferedImage bi, final PngColorType pngColorType, final int bitDepth,
            final int bitsPerPixel, final PngChunkPlte pngChunkPLTE,
            final GammaCorrection gammaCorrection, final TransparencyFilter transparencyFilter) {
        this.width = width;
        this.height = height;
        this.is = is;
        this.bi = bi;
        this.pngColorType = pngColorType;
        this.bitDepth = bitDepth;
        this.bytesPerPixel = this.getBitsToBytesRoundingUp(bitsPerPixel);
        this.bitsPerPixel = bitsPerPixel;
        this.bitsPerLine = bitsPerPixel * width;
        this.bytesPerLine = getBitsToBytesRoundingUp(bitsPerLine);
        this.pngChunkPLTE = pngChunkPLTE;
        this.gammaCorrection = gammaCorrection;
        this.transparencyFilter = transparencyFilter;
        
        this.filterObject = new AdaptiveFilter(bytesPerPixel);
    }

    final int getBitsToBytesRoundingUp(final int bits) {
        return (bits + 7) / 8;
    }

    final int getPixelARGB(final int alpha, final int red, final int green, final int blue) {
        return ((0xff & alpha) << 24)
             | ((0xff & red)   << 16)
             | ((0xff & green) << 8)
             | ((0xff & blue));
    }

    final int getPixelRGB(final int red, final int green, final int blue) {
        return getPixelARGB(0xff, red, green, blue);
    }

    public abstract void drive() throws ImageReadException, IOException;

    int getRGB(final PixelParser bitParser, final int pixelIndexInScanline)
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

    protected byte[] scanLine() throws ImageReadException, IOException {
        return scanLine(bytesPerLine);
    }
    
    protected byte[] scanLine(int length) throws ImageReadException, IOException {
        final int filterType = is.read();
        if (filterType < 0) {
            throw new ImageReadException("PNG: missing filter type");
        }
        if (filterType >= FilterType.values().length) {
            throw new ImageReadException("PNG: unknown filterType: " + filterType);
        }

        final byte[] scanline = readBytes("scanline", is, length, "PNG: missing image data");

        return filterObject.unfilter(filterType, scanline);
    }

}
