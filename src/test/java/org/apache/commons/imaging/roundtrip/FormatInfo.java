/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.imaging.roundtrip;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;

final class FormatInfo {

    static final int COLOR_FULL_RGB = 0;
    static final int COLOR_LIMITED_INDEX = 1;
    static final int COLOR_GRAYSCALE = 2;
    static final int COLOR_BITMAP = 3;

    static final FormatInfo[] PRESERVING_RESOLUTION_FORMATS = { new FormatInfo(ImageFormats.PNG, true, true, COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.ICO, true, true, COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.TIFF, true, true, COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.BMP, true, true, COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.PCX, true, true, COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.DCX, true, true, COLOR_FULL_RGB, true, true), //
    };

    static final FormatInfo[] READ_WRITE_FORMATS = { new FormatInfo(ImageFormats.PNG, true, true, COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.GIF, true, true, COLOR_LIMITED_INDEX, true, false), //
            new FormatInfo(ImageFormats.ICO, true, true, COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.TIFF, true, true, COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.BMP, true, true, COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.PBM, true, true, COLOR_BITMAP, true, false), //
            new FormatInfo(ImageFormats.PGM, true, true, COLOR_GRAYSCALE, true, false), //
            new FormatInfo(ImageFormats.PPM, true, true, COLOR_FULL_RGB, true, false), //
            new FormatInfo(ImageFormats.PAM, true, true, COLOR_FULL_RGB, true, false), //
            new FormatInfo(ImageFormats.WBMP, true, true, COLOR_BITMAP, true, false), //
            new FormatInfo(ImageFormats.PCX, true, true, COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.DCX, true, true, COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.XBM, true, true, COLOR_BITMAP, false, false), //
            new FormatInfo(ImageFormats.XPM, true, true, COLOR_FULL_RGB, false, false), //
    };

    static final FormatInfo[] ALL_FORMATS = { //
            new FormatInfo(ImageFormats.PNG, true, true, COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.GIF, true, true, COLOR_LIMITED_INDEX, true, false), //
            new FormatInfo(ImageFormats.ICO, true, true, COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.TIFF, true, true, COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.JPEG, true, false, COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.BMP, true, true, COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.PSD, true, false, COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.PBM, true, true, COLOR_BITMAP, true, false), //
            new FormatInfo(ImageFormats.PGM, true, true, COLOR_GRAYSCALE, true, false), //
            new FormatInfo(ImageFormats.PPM, true, true, COLOR_FULL_RGB, true, false), //
            new FormatInfo(ImageFormats.PAM, true, true, COLOR_FULL_RGB, true, false), //
            new FormatInfo(ImageFormats.PNM, true, true, COLOR_FULL_RGB, true, false), //
            new FormatInfo(ImageFormats.TGA, false, false, COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.WBMP, true, true, COLOR_BITMAP, true, false), //
            new FormatInfo(ImageFormats.PCX, true, true, COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.DCX, true, true, COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.XBM, true, true, COLOR_BITMAP, false, false), //
            new FormatInfo(ImageFormats.XPM, true, true, COLOR_FULL_RGB, false, false), //
    };

    final ImageFormat format;
    final boolean canRead;
    final boolean canWrite;
    final int colorSupport;
    final boolean identicalSecondWrite;
    final boolean preservesResolution;

    FormatInfo(final ImageFormat format, final boolean canRead, final boolean canWrite, final int colorSupport, final boolean identicalSecondWrite,
            final boolean preservesResolution) {
        this.canRead = canRead;
        this.canWrite = canWrite;
        this.colorSupport = colorSupport;
        this.format = format;
        this.identicalSecondWrite = identicalSecondWrite;
        this.preservesResolution = preservesResolution;
    }

    @Override
    public String toString() {
        return "FormatInfo{" + "format=" + format + ", canRead=" + canRead + ", canWrite=" + canWrite + ", colorSupport=" + colorSupport
                + ", identicalSecondWrite=" + identicalSecondWrite + ", preservesResolution=" + preservesResolution + '}';
    }
}
