package org.apache.commons.imaging.roundtrip;

import java.awt.image.BufferedImage;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class BitmapRoundtripTest extends RoundtripBase {

    @DataPoints
    public static BufferedImage[] images = new BufferedImage[] {
            TestImages.createArgbBitmapImage(1, 1), // minimal
            TestImages.createArgbBitmapImage(2, 2), //
            TestImages.createArgbBitmapImage(10, 10), // larger than 8
            TestImages.createArgbBitmapImage(300, 300), // larger than 256

            TestImages.createBitmapBitmapImage(1, 1), // minimal
            TestImages.createBitmapBitmapImage(2, 2), //
            TestImages.createBitmapBitmapImage(10, 10), // larger than 8
            TestImages.createBitmapBitmapImage(300, 300), // larger than 256
    };

    @DataPoints
    public static FormatInfo[] formatInfos = FormatInfo.readableWriteableFormatInfos;

    @Theory
    public void testBitmapRoundtrip(BufferedImage testImage, FormatInfo formatInfo) throws Exception {
        roundtrip(formatInfo, testImage, "bitmap", true);
    }
}
