package org.apache.commons.imaging.roundtrip;

import java.awt.image.BufferedImage;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class GrayscaleRountripTest extends RoundtripBase {

    @DataPoints
    public static BufferedImage[] images = new BufferedImage[]{
            TestImages.createArgbBitmapImage(1, 1), // minimal
            TestImages.createArgbGrayscaleImage(2, 2), //
            TestImages.createArgbGrayscaleImage(10, 10), // larger than 8
            TestImages.createArgbGrayscaleImage(300, 300), // larger than 256

            TestImages.createGrayscaleGrayscaleImage(1, 1), // minimal
            TestImages.createGrayscaleGrayscaleImage(2, 2), //
            TestImages.createGrayscaleGrayscaleImage(10, 10), // larger than 8
            TestImages.createGrayscaleGrayscaleImage(300, 300), // larger than 256
    };

    @DataPoints
    public static FormatInfo[] formatInfos = FormatInfo.readableWriteableFormatInfos;

    @Theory
    public void testGrayscaleRoundtrip(final BufferedImage testImage, final FormatInfo formatInfo) throws Exception {
            boolean imageExact = formatInfo.colorSupport != FormatInfo.COLOR_BITMAP;

            roundtrip(formatInfo, testImage, "gray", imageExact);
    }
}
