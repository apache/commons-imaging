package org.apache.commons.imaging.roundtrip;

import java.awt.image.BufferedImage;

import org.apache.commons.imaging.ImageFormats;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class BitmapRoundtripTest extends RoundtripBase {

    @DataPoints
    public static BufferedImage[] images = new BufferedImage[] {
            createArgbBitmapImage(1, 1), // minimal
            createArgbBitmapImage(2, 2), //
            createArgbBitmapImage(10, 10), // larger than 8
            createArgbBitmapImage(300, 300), // larger than 256

            createBitmapBitmapImage(1, 1), // minimal
            createBitmapBitmapImage(2, 2), //
            createBitmapBitmapImage(10, 10), // larger than 8
            createBitmapBitmapImage(300, 300), // larger than 256
    };

    @DataPoints
    public static FormatInfo[] formatInfos = new FormatInfo[] {
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

    @Theory
    public void testBitmapRoundtrip(BufferedImage testImage, FormatInfo formatInfo) throws Exception {
        roundtrip(formatInfo, testImage, "bitmap", true);
    }
}
