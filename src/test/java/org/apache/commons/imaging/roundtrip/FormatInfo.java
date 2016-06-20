package org.apache.commons.imaging.roundtrip;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;

class FormatInfo {

    static final int COLOR_FULL_RGB = 0;
    static final int COLOR_LIMITED_INDEX = 1;
    static final int COLOR_GRAYSCALE = 2;
    static final int COLOR_BITMAP = 3;

    static final FormatInfo[] PRESERVING_RESOLUTION_FORMATS = new FormatInfo[] {
            new FormatInfo(ImageFormats.PNG, true, true,
                    COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.ICO, true, true,
                    COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.TIFF, true, true,
                    COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.BMP, true, true,
                    COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.PCX, true, true,
                    COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.DCX, true, true,
                    COLOR_FULL_RGB, true, true), //
    };

    static FormatInfo[] READ_WRITE_FORMATS = new FormatInfo[] {
            new FormatInfo(ImageFormats.PNG, true, true,
                    COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.GIF, true, true,
                    COLOR_LIMITED_INDEX, true, false), //
            new FormatInfo(ImageFormats.ICO, true, true,
                    COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.TIFF, true, true,
                    COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.BMP, true, true,
                    COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.PBM, true, true,
                    COLOR_BITMAP, true, false), //
            new FormatInfo(ImageFormats.PGM, true, true,
                    COLOR_GRAYSCALE, true, false), //
            new FormatInfo(ImageFormats.PPM, true, true,
                    COLOR_FULL_RGB, true, false), //
            new FormatInfo(ImageFormats.PAM, true, true,
                    COLOR_FULL_RGB, true, false),//
            new FormatInfo(ImageFormats.WBMP, true, true,
                    COLOR_BITMAP, true, false), //
            new FormatInfo(ImageFormats.PCX, true, true,
                    COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.DCX, true, true,
                    COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.XBM, true, true,
                    COLOR_BITMAP, false, false), //
            new FormatInfo(ImageFormats.XPM, true, true,
                    COLOR_FULL_RGB, false, false), //
    };

    static final FormatInfo[] ALL_FORMATS = { //
            new FormatInfo(ImageFormats.PNG, true, true,
                    COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.GIF, true, true,
                    COLOR_LIMITED_INDEX, true, false), //
            new FormatInfo(ImageFormats.ICO, true, true,
                    COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.TIFF, true, true,
                    COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.JPEG, true, false,
                    COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.BMP, true, true,
                    COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.PSD, true, false,
                    COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.PBM, true, true,
                    COLOR_BITMAP, true, false), //
            new FormatInfo(ImageFormats.PGM, true, true,
                    COLOR_GRAYSCALE, true, false), //
            new FormatInfo(ImageFormats.PPM, true, true,
                    COLOR_FULL_RGB, true, false), //
            new FormatInfo(ImageFormats.PAM, true, true,
                    COLOR_FULL_RGB, true, false),//
            new FormatInfo(ImageFormats.PNM, true, true,
                    COLOR_FULL_RGB, true, false), //
            new FormatInfo(ImageFormats.TGA, false, false,
                    COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.WBMP, true, true,
                    COLOR_BITMAP, true, false), //
            new FormatInfo(ImageFormats.PCX, true, true,
                    COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.DCX, true, true,
                    COLOR_FULL_RGB, true, true), //
            new FormatInfo(ImageFormats.XBM, true, true,
                    COLOR_BITMAP, false, false), //
            new FormatInfo(ImageFormats.XPM, true, true,
                    COLOR_FULL_RGB, false, false), //
    };

    final ImageFormat format;
    final boolean canRead;
    final boolean canWrite;
    final int colorSupport;
    final boolean identicalSecondWrite;
    final boolean preservesResolution;

    FormatInfo(final ImageFormat format, final boolean canRead,
                      final boolean canWrite, final int colorSupport,
                      final boolean identicalSecondWrite,
                      final boolean preservesResolution) {
        this.canRead = canRead;
        this.canWrite = canWrite;
        this.colorSupport = colorSupport;
        this.format = format;
        this.identicalSecondWrite = identicalSecondWrite;
        this.preservesResolution = preservesResolution;
    }
}
