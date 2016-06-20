package org.apache.commons.imaging.roundtrip;

import java.awt.image.BufferedImage;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class LimitedColorRoundtripTest extends RoundtripBase {

    @DataPoints
    public static BufferedImage[] images = new BufferedImage[] {
            TestImages.createLimitedColorImage(1, 1), // minimal
            TestImages.createLimitedColorImage(2, 2), //
            TestImages.createLimitedColorImage(10, 10), // larger than 8
            TestImages.createLimitedColorImage(300, 300), // larger than 256
    };

    @DataPoints
    public static FormatInfo[] formatInfos = FormatInfo.readableWriteableFormatInfos;

    @Theory
    public void testLimitedColorRoundtrip(final BufferedImage testImage, final FormatInfo formatInfo) throws Exception {
            boolean imageExact = true;
            if (formatInfo.colorSupport == FormatInfo.COLOR_BITMAP) {
                imageExact = false;
            }
            if (formatInfo.colorSupport == FormatInfo.COLOR_GRAYSCALE) {
                imageExact = false;
            }

            roundtrip(formatInfo, testImage, "indexable", imageExact);
    }

}
