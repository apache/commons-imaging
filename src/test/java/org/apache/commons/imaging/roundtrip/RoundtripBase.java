package org.apache.commons.imaging.roundtrip;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.common.RgbBufferedImageFactory;
import org.apache.commons.imaging.util.Debug;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;

import static org.junit.Assert.assertNotNull;

public class RoundtripBase {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    protected void roundtrip(final FormatInfo formatInfo, final BufferedImage testImage,
                             final String tempPrefix, final boolean imageExact) throws IOException,
            ImageReadException, ImageWriteException {
        final File temp1 = createTempFile(tempPrefix + ".", "."
                + formatInfo.format.getExtension());
        Debug.debug("tempFile: " + temp1.getName());

        final Map<String, Object> params = new HashMap<>();
        Imaging.writeImage(testImage, temp1, formatInfo.format, params);

        final Map<String, Object> readParams = new HashMap<>();
        readParams.put(ImagingConstants.BUFFERED_IMAGE_FACTORY,
                new RgbBufferedImageFactory());
        final BufferedImage image2 = Imaging.getBufferedImage(temp1, readParams);
        assertNotNull(image2);

        if (imageExact) {
            // note tolerance when comparing grayscale images
            // BufferedImages of
            ImageAsserts.assertEquals(testImage, image2);
        }

        if (formatInfo.identicalSecondWrite) {
            final File temp2 = createTempFile(tempPrefix + ".", "."
                    + formatInfo.format.getExtension());
            // Debug.debug("tempFile: " + tempFile.getName());
            Imaging.writeImage(image2, temp2, formatInfo.format, params);

            ImageAsserts.assertEquals(temp1, temp2);
        }
    }

    protected File createTempFile(final String prefix, final String suffix)
            throws IOException {
        return File.createTempFile(prefix, suffix, folder.newFolder());
    }

    protected static BufferedImage createArgbBitmapImage(final int width, final int height) {
        final BufferedImage result = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_ARGB);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                // alternating black and white.
                final int modulator = y + 2; // make sure lines vary.
                final int argb = (x + y) % modulator == 0 ? 0xff000000 : 0xffffffff;
                result.setRGB(x, y, argb);
            }
        }
        return result;
    }

    protected static BufferedImage createBitmapBitmapImage(final int width, final int height) {
        final BufferedImage result = new BufferedImage(width, height,
                BufferedImage.TYPE_BYTE_BINARY);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                // alternating black and white.
                final int modulator = y + 2; // make sure lines vary.
                final int argb = (x + y) % modulator == 0 ? 0xff000000 : 0xffffffff;
                result.setRGB(x, y, argb);
            }
        }
        return result;
    }

    protected static BufferedImage createArgbGrayscaleImage(final int width, final int height) {
        final BufferedImage result = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_ARGB);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                final int value = (256 * (x + y)) / (width + height);
                final int argb = (0xff << 24) | (value << 16) | (value << 8)
                        | (value << 0);

                result.setRGB(x, y, argb);
            }
        }
        return result;
    }

    protected static BufferedImage createGrayscaleGrayscaleImage(final int width, final int height) {
        final BufferedImage result = new BufferedImage(width, height,
                BufferedImage.TYPE_BYTE_GRAY);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                final int value = (256 * (x + y)) / (width + height);
                final int argb = (0xff << 24) | (value << 16) | (value << 8)
                        | (value << 0);

                result.setRGB(x, y, argb);
            }
        }
        return result;
    }

    protected static BufferedImage createLimitedColorImage(final int width, final int height) {
        final int colors[] = {0xffffffff, 0xff000000, 0xfff00000, 0xff0000ff,
                0xff123456, 0xfffefeff, 0xff7f817f,};

        final BufferedImage result = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_ARGB);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                final int argb = colors[(x + y) % colors.length];
                result.setRGB(x, y, argb);
            }
        }
        return result;
    }

    protected static BufferedImage createFullColorImage(final int width, final int height) {
        final BufferedImage result = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_ARGB);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                final int red = (x * 255) / width;
                final int green = (y * 255) / height;
                final int blue = ((x + y) * 255) / (width + height);
                final int argb = (0xff << 24) | (red << 16) | (green << 8)
                        | (blue << 0);
                result.setRGB(x, y, argb);
            }
        }
        return result;
    }

}
