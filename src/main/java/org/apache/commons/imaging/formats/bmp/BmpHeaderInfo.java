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
 *
 * Changed 2015 by Michael Gross, mgmechanics@mgmechanics.de
 */
package org.apache.commons.imaging.formats.bmp;

class BmpHeaderInfo {
    // BM - Windows 3.1x, 95, NT
    // BA - OS/2 Bitmap Array
    // CI - OS/2 Color Icon
    // CP - OS/2 Color Pointer
    // IC - OS/2 Icon
    // PT - OS/2 Pointer
    public final byte identifier1;
    public final byte identifier2;

    public final int fileSize;
    public final int reserved;
    public final int bitmapDataOffset;

    public final int bitmapHeaderSize;
    public final int width;
    /**
     * raw image height, may be negative
     */
    public final int height;
    /**
     * absolute image height
     */
    public final int heightAbsolute;
    public final int planes;
    public final int bitsPerPixel;
    public final int compression;
    public final int bitmapDataSize;
    public final int hResolution;
    public final int vResolution;
    public final int colorsUsed;
    public final int colorsImportant;

    public final int redMask;
    public final int greenMask;
    public final int blueMask;
    public final int alphaMask;

    public final int colorSpaceType;
    public final ColorSpace colorSpace;
    public final int gammaRed;
    public final int gammaGreen;
    public final int gammaBlue;
    public final int intent;
    public final int profileData;
    public final int profileSize;
    public final int reservedV5;

    static class ColorSpaceCoordinate {
        int x;
        int y;
        int z;
    }

    static class ColorSpace {
        ColorSpaceCoordinate red;
        ColorSpaceCoordinate green;
        ColorSpaceCoordinate blue;
    }

    public BmpHeaderInfo(final byte identifier1, final byte identifier2, final int fileSize,
            final int reserved, final int bitmapDataOffset, final int bitmapHeaderSize,
            final int width, final int height, final int planes, final int bitsPerPixel,
            final int compression, final int bitmapDataSize, final int hResolution,
            final int vResolution, final int colorsUsed, final int colorsImportant, final int redMask,
            final int greenMask, final int blueMask, final int alphaMask, final int colorSpaceType,
            final ColorSpace colorSpace, final int gammaRed, final int gammaGreen, final int gammaBlue,
            final int intent, final int profileData, final int profileSize, final int reservedV5) {
        this.identifier1 = identifier1;
        this.identifier2 = identifier2;
        this.fileSize = fileSize;
        this.reserved = reserved;
        this.bitmapDataOffset = bitmapDataOffset;

        this.bitmapHeaderSize = bitmapHeaderSize;
        this.width = width;
        this.height = height;
        this.heightAbsolute = (this.height < 0) ? this.height * -1 : this.height;
        
        this.planes = planes;
        this.bitsPerPixel = bitsPerPixel;
        this.compression = compression;
        this.bitmapDataSize = bitmapDataSize;
        this.hResolution = hResolution;
        this.vResolution = vResolution;
        this.colorsUsed = colorsUsed;
        this.colorsImportant = colorsImportant;

        this.redMask = redMask;
        this.greenMask = greenMask;
        this.blueMask = blueMask;
        this.alphaMask = alphaMask;
        this.colorSpaceType = colorSpaceType;
        this.colorSpace = colorSpace;
        this.gammaRed = gammaRed;
        this.gammaGreen = gammaGreen;
        this.gammaBlue = gammaBlue;
        this.intent = intent;
        this.profileData = profileData;
        this.profileSize = profileSize;
        this.reservedV5 = reservedV5;
    }

}
