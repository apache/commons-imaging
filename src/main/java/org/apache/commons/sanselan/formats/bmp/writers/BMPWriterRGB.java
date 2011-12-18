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
package org.apache.commons.sanselan.formats.bmp.writers;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.commons.sanselan.common.BinaryOutputStream;

public class BMPWriterRGB extends BMPWriter
{
    //        private final boolean alpha;
    //
    //        public BMPWriterRGB(boolean alpha)
    //        {
    //            this.alpha = alpha;
    //        }

    public int getPaletteSize()
    {
        return 0;
    }

    public int getBitsPerPixel()
    {
        //            return alpha ? 32 : 24;
        return 24;
    }

    public void writePalette(BinaryOutputStream bos) throws IOException
    {
    }

    public byte[] getImageData(BufferedImage src)
    {
        int width = src.getWidth();
        int height = src.getHeight();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        //            BinaryOutputStream bos = new BinaryOutputStream(baos, BYTE_ORDER_Network);

        int bytecount = 0;
        for (int y = height - 1; y >= 0; y--)
        {
            //            for (int y = 0; y < height; y++)
            for (int x = 0; x < width; x++)
            {
                int argb = src.getRGB(x, y);
                int rgb = 0xffffff & argb;

                int red = 0xff & (rgb >> 16);
                int green = 0xff & (rgb >> 8);
                int blue = 0xff & (rgb >> 0);

                baos.write(blue);
                baos.write(green);
                baos.write(red);
                bytecount += 3;
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