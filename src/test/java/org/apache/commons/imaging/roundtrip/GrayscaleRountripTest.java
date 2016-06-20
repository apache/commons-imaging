package org.apache.commons.imaging.roundtrip;

import java.awt.image.BufferedImage;

import org.apache.commons.imaging.util.Debug;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class GrayscaleRountripTest extends RoundtripBase {

    @DataPoints
    public static BufferedImage[] images = new BufferedImage[]{
            createArgbBitmapImage(1, 1), // minimal
            createArgbGrayscaleImage(2, 2), //
            createArgbGrayscaleImage(10, 10), // larger than 8
            createArgbGrayscaleImage(300, 300), // larger than 256

            createGrayscaleGrayscaleImage(1, 1), // minimal
            createGrayscaleGrayscaleImage(2, 2), //
            createGrayscaleGrayscaleImage(10, 10), // larger than 8
            createGrayscaleGrayscaleImage(300, 300), // larger than 256
    };

    @DataPoints
    public static FormatInfo[] formatInfos = readableWriteableFormatInfos;

    @Theory
    public void testGrayscaleRoundtrip(final BufferedImage testImage, final FormatInfo formatInfo) throws Exception {
            boolean imageExact = formatInfo.colorSupport != COLOR_BITMAP;

            roundtrip(formatInfo, testImage, "gray", imageExact);
    }
}
