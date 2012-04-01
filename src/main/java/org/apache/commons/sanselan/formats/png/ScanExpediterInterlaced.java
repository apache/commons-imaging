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
package org.apache.commons.sanselan.formats.png;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.sanselan.ImageReadException;
import org.apache.commons.sanselan.formats.png.chunks.PngChunkPlte;
import org.apache.commons.sanselan.formats.transparencyfilters.TransparencyFilter;

public class ScanExpediterInterlaced extends ScanExpediter
{
    public ScanExpediterInterlaced(int width, int height, InputStream is,
            BufferedImage bi, int color_type, int BitDepth, int bits_per_pixel,
            PngChunkPlte fPNGChunkPLTE, GammaCorrection fGammaCorrection,
            TransparencyFilter fTransparencyFilter)

    {
        super(width, height, is, bi, color_type, BitDepth, bits_per_pixel,
                fPNGChunkPLTE, fGammaCorrection, fTransparencyFilter);
    }

    private void visit(int x, int y, BufferedImage bi, BitParser fBitParser,
            int color_type, int pixel_index_in_scanline,
            PngChunkPlte fPNGChunkPLTE, GammaCorrection fGammaCorrection)
            throws ImageReadException, IOException
    {
        int rgb = getRGB(fBitParser,
        //                    color_type,
                pixel_index_in_scanline
        //                    ,
        //                    fPNGChunkPLTE, fGammaCorrection
        );

        bi.setRGB(x, y, rgb);

        //                buffer.setElem(y * width +x , rgb);

    }

    private static final int Starting_Row[] = {
            0, 0, 4, 0, 2, 0, 1
    };
    private static final int Starting_Col[] = {
            0, 4, 0, 2, 0, 1, 0
    };
    private static final int Row_Increment[] = {
            8, 8, 8, 4, 4, 2, 2
    };
    private static final int Col_Increment[] = {
            8, 8, 4, 4, 2, 2, 1
    };
    private static final int Block_Height[] = {
            8, 8, 4, 4, 2, 2, 1
    };
    private static final int Block_Width[] = {
            8, 4, 4, 2, 2, 1, 1
    };

    @Override
    public void drive() throws ImageReadException, IOException
    {

        int pass = 1;
        while (pass <= 7)
        {
            byte prev[] = null;

            int y = Starting_Row[pass - 1];
            //                int y_stride = Row_Increment[pass - 1];
            boolean rows_in_pass = (y < height);
            while (y < height)
            {
                int x = Starting_Col[pass - 1];
                int pixel_index_in_scanline = 0;

                if (x < width)
                {
                    //                         only get data if there are pixels in this scanline/pass
                    int ColumnsInRow = 1 + ((width - Starting_Col[pass - 1] - 1) / Col_Increment[pass - 1]);
                    int bitsPerScanLine = bitsPerPixel * ColumnsInRow;
                    int pixel_bytes_per_scan_line = getBitsToBytesRoundingUp(bitsPerScanLine);

                    byte unfiltered[] = getNextScanline(is,
                            pixel_bytes_per_scan_line, prev, bytesPerPixel);

                    prev = unfiltered;

                    BitParser fBitParser = new BitParser(unfiltered,
                            bitsPerPixel, bitDepth);

                    while (x < width)
                    {
                        visit(x, y, bi, fBitParser, colorType,
                                pixel_index_in_scanline, pngChunkPLTE,
                                gammaCorrection);

                        x = x + Col_Increment[pass - 1];
                        pixel_index_in_scanline++;
                    }
                }
                y = y + Row_Increment[pass - 1];
            }
            pass = pass + 1;
        }
    }
}