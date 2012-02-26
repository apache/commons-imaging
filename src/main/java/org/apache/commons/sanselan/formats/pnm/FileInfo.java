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
package org.apache.commons.sanselan.formats.pnm;

import java.awt.image.DataBuffer;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.sanselan.ImageFormat;
import org.apache.commons.sanselan.common.ImageBuilder;

public abstract class FileInfo
{
    protected final int width, height;
    protected final boolean RAWBITS;

    public FileInfo(int width, int height, boolean RAWBITS)
    {
        this.width = width;
        this.height = height;
        this.RAWBITS = RAWBITS;
    }

    public abstract int getNumComponents();

    public abstract int getBitDepth();

    public abstract ImageFormat getImageType();

    public abstract String getImageTypeDescription();

    public abstract String getMIMEType();

    public abstract int getColorType();

    public abstract int getRGB(WhiteSpaceReader wsr) throws IOException;

    public abstract int getRGB(InputStream is) throws IOException;

    protected void newline()
    {
        // do nothing by default.
    }

    public void readImage(ImageBuilder imageBuilder, InputStream is) throws IOException
    {
        // is = new BufferedInputStream(is);
        // int count = 0;
        //
        // try
        // {
        
        if (!RAWBITS)
        {
            WhiteSpaceReader wsr = new WhiteSpaceReader(is);

            for (int y = 0; y < height; y++)
            {
                for (int x = 0; x < width; x++)
                {
                    int rgb = getRGB(wsr);

                    imageBuilder.setRGB(x, y, rgb);
                    // count++;
                }
                newline();
            }
        } else
        {
            for (int y = 0; y < height; y++)
            {
                // System.out.println("y: " + y);
                for (int x = 0; x < width; x++)
                {
                    int rgb = getRGB(is);
                    imageBuilder.setRGB(x, y, rgb);
                    // count++;
                }
                newline();
            }
        }
        // }
        // finally
        // {
        // System.out.println("count: " + count);
        // dump();
        // }
    }

    public void dump()
    {

    }
}