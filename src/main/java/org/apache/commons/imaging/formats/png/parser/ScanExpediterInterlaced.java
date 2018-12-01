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

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.formats.png.GammaCorrection;
import org.apache.commons.imaging.formats.png.PngColorType;
import org.apache.commons.imaging.formats.png.chunks.PngChunkPlte;
import org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilter;

public class ScanExpediterInterlaced extends ScanExpediter {
    private static final int[] STARTING_ROW = { 0, 0, 4, 0, 2, 0, 1 };
    private static final int[] STARTING_COL = { 0, 4, 0, 2, 0, 1, 0 };
    private static final int[] ROW_INCREMENT = { 8, 8, 8, 4, 4, 2, 2 };
    private static final int[] COL_INCREMENT = { 8, 8, 4, 4, 2, 2, 1 };
//    private static final int Block_Height[] = { 8, 8, 4, 4, 2, 2, 1 };
//    private static final int Block_Width[] = { 8, 4, 4, 2, 2, 1, 1 };

    public ScanExpediterInterlaced(final int width, final int height, final InputStream is,
            final BufferedImage bi,
            final PngColorType pngColorType, final int bitDepth, final int bitsPerPixel,
            final PngChunkPlte fPNGChunkPLTE,
            final GammaCorrection gammaCorrection,
            final TransparencyFilter transparencyFilter) {
        super(width, height, is, bi, pngColorType, bitDepth, bitsPerPixel,
                fPNGChunkPLTE, gammaCorrection, transparencyFilter);
    }

    private void visit(final int x, final int y, final BufferedImage bi, final PixelParser fBitParser,
            final int pixelIndexInScanline)
            throws ImageReadException, IOException {
        final int rgb = getRGB(fBitParser, pixelIndexInScanline);
        bi.setRGB(x, y, rgb);
    }

    @Override
    public void drive() throws ImageReadException, IOException {
        final PixelParser parser = new PixelParser(null, bitsPerPixel, bitDepth);
        
        int pass = 1;
        while (pass <= 7) {

            int y = STARTING_ROW[pass - 1];
            // int y_stride = ROW_INCREMENT[pass - 1];
            //final boolean rows_in_pass = (y < height);
            while (y < height) {
                int x = STARTING_COL[pass - 1];
                int pixelIndexInScanline = 0;

                if (x < width) {
                    // only get data if there are pixels in this scanline/pass
                    final int columnsInRow = 1 + ((width - STARTING_COL[pass - 1] - 1) / COL_INCREMENT[pass - 1]);
                    final int bitsPerScanLine = bitsPerPixel * columnsInRow;
                    final int pixelBytesPerScanLine = getBitsToBytesRoundingUp(bitsPerScanLine);

                    parser.setScanline(scanLine(pixelBytesPerScanLine));

                    while (x < width) {
                        visit(x, y, bi, parser, pixelIndexInScanline);

                        x = x + COL_INCREMENT[pass - 1];
                        pixelIndexInScanline++;
                    }
                }
                y = y + ROW_INCREMENT[pass - 1];
            }
            pass = pass + 1;
        }
    }
}
