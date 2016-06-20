package org.apache.commons.imaging.roundtrip;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.PixelDensity;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

@RunWith(Theories.class)
public class PixelDensityRoundtrip extends RoundtripBase {

    @DataPoints
    public static FormatInfo[] formatInfos = readableWriteablePreservingResolution;

    @Theory
    public void testPixelDensityRoundtrip(final FormatInfo formatInfo) throws Exception {
        final BufferedImage testImage = createFullColorImage(2, 2);

        final File temp1 = createTempFile("pixeldensity.", "."
                + formatInfo.format.getExtension());

        final Map<String, Object> params = new HashMap<>();
        final PixelDensity pixelDensity = PixelDensity.createFromPixelsPerInch(75, 150);
        params.put(ImagingConstants.PARAM_KEY_PIXEL_DENSITY, pixelDensity);
        Imaging.writeImage(testImage, temp1, formatInfo.format, params);

        final ImageInfo imageInfo = Imaging.getImageInfo(temp1);
        if (imageInfo != null) {
            final int xReadDPI = imageInfo.getPhysicalWidthDpi();
            final int yReadDPI = imageInfo.getPhysicalHeightDpi();
            // allow a 5% margin of error in storage and conversion
            assertTrue("horizontal pixel density stored wrongly for " + formatInfo.format +
                            " in=" + pixelDensity.horizontalDensityInches() + ", out=" + xReadDPI,
                    Math.abs((xReadDPI - pixelDensity.horizontalDensityInches()) /
                            pixelDensity.horizontalDensityInches()) <= 0.05);
            assertTrue("vertical pixel density stored wrongly for " + formatInfo.format +
                            " in=" + pixelDensity.verticalDensityInches() + ", out=" + yReadDPI,
                    Math.abs((yReadDPI - pixelDensity.verticalDensityInches()) /
                            pixelDensity.verticalDensityInches()) <= 0.05);
        }
    }

}
