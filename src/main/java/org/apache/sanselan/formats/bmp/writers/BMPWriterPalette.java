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
package org.apache.sanselan.formats.bmp.writers;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.sanselan.common.BinaryOutputStream;
import org.apache.sanselan.palette.SimplePalette;

public class BMPWriterPalette extends BMPWriter
{
    private final SimplePalette palette;
    private final int bitsPerSample;

    public BMPWriterPalette(SimplePalette palette)
    {
        this.palette = palette;

        if (palette.length() <= 2)
            bitsPerSample = 1;
        else if (palette.length() <= 16)
            bitsPerSample = 4;
        else
            bitsPerSample = 8;
    }

    public int getPaletteSize()
    {
        return palette.length();
    }

    public int getBitsPerPixel()
    {
        return bitsPerSample;
    }

    public void writePalette(BinaryOutputStream bos) throws IOException
    {
        for (int i = 0; i < palette.length(); i++)
        {
            int rgb = palette.getEntry(i);

            int red = 0xff & (rgb >> 16);
            int green = 0xff & (rgb >> 8);
            int blue = 0xff & (rgb >> 0);

            bos.write(blue);
            bos.write(green);
            bos.write(red);
            bos.write(0);
        }
    }

    public byte[] getImageData(BufferedImage src)
    {
        int width = src.getWidth();
        int height = src.getHeight();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        int bit_cache = 0;
        int bits_in_cache = 0;

        int bytecount = 0;
        for (int y = height - 1; y >= 0; y--)
        {
            for (int x = 0; x < width; x++)
            {
                int argb = src.getRGB(x, y);
                int rgb = 0xffffff & argb;

                int index = palette.getPaletteIndex(rgb);

                if (bitsPerSample == 8)
                {
                    baos.write(0xff & index);
                    bytecount++;
                } else
                // 4 or 1
                {
                    bit_cache = (bit_cache << bitsPerSample) | index;
                    bits_in_cache += bitsPerSample;
                    if (bits_in_cache >= 8)
                    {
                        baos.write(0xff & bit_cache);
                        bytecount++;
                        bit_cache = 0;
                        bits_in_cache = 0;
                    }
                }
            }

            if (bits_in_cache > 0)
            {
                bit_cache = (bit_cache << (8 - bits_in_cache));

                baos.write(0xff & bit_cache);
                bytecount++;
                bit_cache = 0;
                bits_in_cache = 0;
            }

            while ((bytecount % 4) != 0)
            {
                baos.write(0);
                bytecount++;
            }
        }

        return baos.toByteArray();
    }
}