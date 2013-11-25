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
import org.apache.commons.imaging.formats.png.chunks.PngChunkPlte;
import org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilter;

public class ScanExpediterInterlaced extends ScanExpediter {
    private static final int STARTING_ROW[] = { 0, 0, 4, 0, 2, 0, 1 };
    private static final int STARTING_COL[] = { 0, 4, 0, 2, 0, 1, 0 };
    private static final int ROW_INCREMENT[] = { 8, 8, 8, 4, 4, 2, 2 };
    private static final int COL_INCREMENT[] = { 8, 8, 4, 4, 2, 2, 1 };
//    private static final int Block_Height[] = { 8, 8, 4, 4, 2, 2, 1 };
//    private static final int Block_Width[] = { 8, 4, 4, 2, 2, 1, 1 };

    public ScanExpediterInterlaced(final int width, final int height, final InputStream is,
            final BufferedImage bi, final int color_type, final int BitDepth, final int bits_per_pixel,
            final PngChunkPlte fPNGChunkPLTE, final GammaCorrection fGammaCorrection,
            final TransparencyFilter fTransparencyFilter)

    {
        super(width, height, is, bi, color_type, BitDepth, bits_per_pixel,
                fPNGChunkPLTE, fGammaCorrection, fTransparencyFilter);
    }

    private void visit(final int x, final int y, final BufferedImage bi, final BitParser fBitParser,
            final int pixel_index_in_scanline)
            throws ImageReadException, IOException {
        final int rgb = getRGB(fBitParser, pixel_index_in_scanline);
        bi.setRGB(x, y, rgb);
    }

    @Override
    public void drive() throws ImageReadException, IOException {

        int pass = 1;
        while (pass <= 7) {
            byte prev[] = null;

            int y = STARTING_ROW[pass - 1];
            // int y_stride = ROW_INCREMENT[pass - 1];
            //final boolean rows_in_pass = (y < height);
            while (y < height) {
                int x = STARTING_COL[pass - 1];
                int pixel_index_in_scanline = 0;

                if (x < width) {
                    // only get data if there are pixels in this scanline/pass
                    final int ColumnsInRow = 1 + ((width - STARTING_COL[pass - 1] - 1) / COL_INCREMENT[pass - 1]);
                    final int bitsPerScanLine = bitsPerPixel * ColumnsInRow;
                    final int pixel_bytes_per_scan_line = getBitsToBytesRoundingUp(bitsPerScanLine);

                    final byte unfiltered[] = getNextScanline(is,
                            pixel_bytes_per_scan_line, prev, bytesPerPixel);

                    prev = unfiltered;

                    final BitParser fBitParser = new BitParser(unfiltered,
                            bitsPerPixel, bitDepth);

                    while (x < width) {
                        visit(x, y, bi, fBitParser, pixel_index_in_scanline);

                        x = x + COL_INCREMENT[pass - 1];
                        pixel_index_in_scanline++;
                    }
                }
                y = y + ROW_INCREMENT[pass - 1];
            }
            pass = pass + 1;
        }
    }
}
