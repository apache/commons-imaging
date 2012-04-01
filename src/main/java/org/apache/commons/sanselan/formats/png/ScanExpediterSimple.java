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

public class ScanExpediterSimple extends ScanExpediter
{
    public ScanExpediterSimple(int width, int height, InputStream is,
            BufferedImage bi, int color_type, int BitDepth, int bitsPerPixel,
            PngChunkPlte pngChunkPLTE, GammaCorrection gammaCorrection,
            TransparencyFilter transparencyFilter)

    {
        super(width, height, is, bi, color_type, BitDepth, bitsPerPixel,
                pngChunkPLTE, gammaCorrection, transparencyFilter);
    }

    @Override
    public void drive() throws ImageReadException, IOException
    {
        int bitsPerScanLine = bitsPerPixel * width;
        int pixelBytesPerScanLine = getBitsToBytesRoundingUp(bitsPerScanLine);
        byte prev[] = null;

        for (int y = 0; y < height; y++)
        {
            byte unfiltered[] = getNextScanline(is, pixelBytesPerScanLine,
                    prev, bytesPerPixel);

            prev = unfiltered;

            BitParser bitParser = new BitParser(unfiltered, bitsPerPixel,
                    bitDepth);

            for (int x = 0; x < width; x++)
            {
                int rgb = getRGB(bitParser, x);

                bi.setRGB(x, y, rgb);
            }
        }

    }
}