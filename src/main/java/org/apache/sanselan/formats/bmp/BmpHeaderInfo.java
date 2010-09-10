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
package org.apache.sanselan.formats.bmp;

public class BmpHeaderInfo
{
    //        ‘BM’ - Windows 3.1x, 95, NT, …
    //        ‘BA’ - OS/2 Bitmap Array
    //        ‘CI’ - OS/2 Color Icon‘
    //        CP’ - OS/2 Color Pointer
    //        ‘IC’ - OS/2 Icon
    //        ‘PT’ - OS/2 Pointer
    public final byte identifier1;
    public final byte identifier2;

    public final int fileSize;
    public final int reserved;
    public final int bitmapDataOffset;

    public final int bitmapHeaderSize;
    public final int width;
    public final int height;
    public final int planes;
    public final int bitsPerPixel;
    public final int compression;
    public final int bitmapDataSize;
    public final int hResolution;
    public final int vResolution;
    public final int colorsUsed;
    public final int colorsImportant;

    public BmpHeaderInfo(byte identifier1, byte identifier2, int fileSize,
            int reserved, int bitmapDataOffset,
            int bitmapHeaderSize, int width, int height, int planes,
            int bitsPerPixel, int compression, int bitmapDataSize,
            int hResolution, int vResolution, int colorsUsed,
            int colorsImportant)
    {
        this.identifier1 = identifier1;
        this.identifier2 = identifier2;
        this.fileSize = fileSize;
        this.reserved = reserved;
        this.bitmapDataOffset = bitmapDataOffset;

        this.bitmapHeaderSize = bitmapHeaderSize;
        this.width = width;
        this.height = height;
        this.planes = planes;
        this.bitsPerPixel = bitsPerPixel;
        this.compression = compression;
        this.bitmapDataSize = bitmapDataSize;
        this.hResolution = hResolution;
        this.vResolution = vResolution;
        this.colorsUsed = colorsUsed;
        this.colorsImportant = colorsImportant;
    }

}