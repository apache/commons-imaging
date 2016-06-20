package org.apache.commons.imaging.roundtrip;

import java.awt.image.BufferedImage;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class FullColorRoundtrip extends RoundtripBase {

    @DataPoints
    public static BufferedImage[] images = new BufferedImage[]{
            createFullColorImage(1, 1), // minimal
            createFullColorImage(2, 2), //
            createFullColorImage(10, 10), // larger than 8
            createFullColorImage(300, 300), // larger than 256
    };

    @DataPoints
    public static FormatInfo[] formatInfos = FormatInfo.readableWriteableFormatInfos;

    @Theory
    public void testFullColorRoundtrip(final BufferedImage testImage, final FormatInfo formatInfo) throws Exception {
        boolean imageExact = true;
        if (formatInfo.colorSupport == FormatInfo.COLOR_BITMAP) {
            imageExact = false;
        }
        if (formatInfo.colorSupport == FormatInfo.COLOR_GRAYSCALE) {
            imageExact = false;
        }
        if (formatInfo.colorSupport == FormatInfo.COLOR_LIMITED_INDEX) {
            imageExact = false;
        }

        roundtrip(formatInfo, testImage, "fullColor", imageExact);
    }
}
