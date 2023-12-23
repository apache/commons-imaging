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

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.formats.png.chunks.PngChunkPlte;
import org.apache.commons.imaging.formats.png.transparencyfilters.AbstractTransparencyFilter;

final class ScanExpediterSimple extends AbstractScanExpediter {
    ScanExpediterSimple(final int width, final int height, final InputStream is, final BufferedImage bi, final PngColorType pngColorType, final int bitDepth,
            final int bitsPerPixel, final PngChunkPlte pngChunkPLTE, final GammaCorrection gammaCorrection,
            final AbstractTransparencyFilter abstractTransparencyFilter) {
        super(width, height, is, bi, pngColorType, bitDepth, bitsPerPixel, pngChunkPLTE, gammaCorrection, abstractTransparencyFilter);
    }

    @Override
    public void drive() throws ImagingException, IOException {
        final int bitsPerScanLine = bitsPerPixel * width;
        final int pixelBytesPerScanLine = getBitsToBytesRoundingUp(bitsPerScanLine);
        byte[] prev = null;

        for (int y = 0; y < height; y++) {
            final byte[] unfiltered = getNextScanline(is, pixelBytesPerScanLine, prev, bytesPerPixel);

            prev = unfiltered;

            final BitParser bitParser = new BitParser(unfiltered, bitsPerPixel, bitDepth);

            for (int x = 0; x < width; x++) {
                final int rgb = getRgb(bitParser, x);

                bi.setRGB(x, y, rgb);
            }
        }

    }
}
