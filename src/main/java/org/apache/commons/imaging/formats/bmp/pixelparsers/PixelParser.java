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
package org.apache.commons.imaging.formats.bmp.pixelparsers;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.BinaryFileParser;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.formats.bmp.BmpHeaderInfo;

public abstract class PixelParser
{
    public final BmpHeaderInfo bhi;
    public final byte colorTable[];
    public final byte imageData[];

    protected final BinaryFileParser bfp;
    protected final ByteArrayInputStream is;

    public PixelParser(BmpHeaderInfo bhi, byte ColorTable[], byte ImageData[])
    {
        this.bhi = bhi;
        this.colorTable = ColorTable;
        this.imageData = ImageData;

        bfp = new BinaryFileParser(BinaryFileParser.BYTE_ORDER_INTEL);
        is = new ByteArrayInputStream(ImageData);
    }

    public abstract void processImage(ImageBuilder imageBuilder)
            throws ImageReadException, IOException;

    protected int getColorTableRGB(int index)
    {
        index *= 4;
        int blue = 0xff & colorTable[index + 0];
        int green = 0xff & colorTable[index + 1];
        int red = 0xff & colorTable[index + 2];
        int alpha = 0xff;

        int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);
        return rgb;
    }

}