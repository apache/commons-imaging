package org.apache.commons.imaging.roundtrip;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.common.RgbBufferedImageFactory;
import org.apache.commons.imaging.util.Debug;
import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class RoundtripBase {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    private void compareImagesExact(final BufferedImage a, final BufferedImage b) {
        compareImages(a, b, 0);
    }

    private void compareImages(final BufferedImage a, final BufferedImage b, final int tolerance) {
        assertEquals(a.getWidth(), b.getWidth());
        assertEquals(a.getHeight(), b.getHeight());

        for (int x = 0; x < a.getWidth(); x++) {
            for (int y = 0; y < a.getHeight(); y++) {
                final int a_argb = a.getRGB(x, y);
                final int b_argb = b.getRGB(x, y);
                if (a_argb != b_argb) {
                    if (calculateARGBDistance(a_argb, b_argb) <= tolerance) {
                        continue; // ignore.
                    }
                }
                if (a_argb != b_argb) {
                    Debug.debug("width: " + a.getWidth());
                    Debug.debug("height: " + a.getHeight());
                    Debug.debug("distance: " + calculateARGBDistance(a_argb, b_argb));
                    Debug.debug("x: " + x);
                    Debug.debug("y: " + y);
                    Debug.debug("a_argb: " + a_argb + " (0x" + Integer.toHexString(a_argb) + ")");
                    Debug.debug("b_argb: " + b_argb + " (0x" + Integer.toHexString(b_argb) + ")");
                }
                assertEquals(a_argb, b_argb);
            }
        }
    }

    private int calculateARGBDistance(final int a, final int b) {
        final int aAlpha = 0xff & (a >> 24);
        final int aRed = 0xff & (a >> 16);
        final int aGreen = 0xff & (a >> 8);
        final int aBlue = 0xff & (a >> 0);
        final int bAlpha = 0xff & (b >> 24);
        final int bRed = 0xff & (b >> 16);
        final int bGreen = 0xff & (b >> 8);
        final int bBlue = 0xff & (b >> 0);
        final int diff = Math.abs(aAlpha - bAlpha) + Math.abs(aRed - bRed)
                + Math.abs(aGreen - bGreen) + Math.abs(aBlue - bBlue);
        return diff;

    }

    private void compareFilesExact(final File a, final File b) throws IOException {
        assertTrue(a.exists() && a.isFile());
        assertTrue(b.exists() && b.isFile());
        assertEquals(a.length(), b.length());

        final byte aData[] = FileUtils.readFileToByteArray(a);
        final byte bData[] = FileUtils.readFileToByteArray(b);

        for (int i = 0; i < a.length(); i++) {
            final int aByte = 0xff & aData[i];
            final int bByte = 0xff & bData[i];

            if (aByte != bByte) {
                Debug.debug("a: " + a);
                Debug.debug("b: " + b);
                Debug.debug("i: " + i);
                Debug.debug("aByte: " + aByte + " (0x" + Integer.toHexString(aByte) + ")");
                Debug.debug("bByte: " + bByte + " (0x" + Integer.toHexString(bByte) + ")");
            }
            assertEquals(aByte, bByte);
        }
    }

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
            compareImagesExact(testImage, image2);
        }

        if (formatInfo.identicalSecondWrite) {
            final File temp2 = createTempFile(tempPrefix + ".", "."
                    + formatInfo.format.getExtension());
            // Debug.debug("tempFile: " + tempFile.getName());
            Imaging.writeImage(image2, temp2, formatInfo.format, params);

            compareFilesExact(temp1, temp2);
        }
    }

    protected File createTempFile(final String prefix, final String suffix)
            throws IOException {
        return File.createTempFile(prefix, suffix, folder.newFolder());
    }

    protected BufferedImage createArgbBitmapImage(final int width, final int height) {
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

    protected BufferedImage createBitmapBitmapImage(final int width, final int height) {
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

    protected BufferedImage createArgbGrayscaleImage(final int width, final int height) {
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

    protected BufferedImage createGrayscaleGrayscaleImage(final int width, final int height) {
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

    protected BufferedImage createLimitedColorImage(final int width, final int height) {
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

    protected BufferedImage createFullColorImage(final int width, final int height) {
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

    protected static class FormatInfo {

        public final ImageFormat format;
        public final boolean canRead;
        public final boolean canWrite;
        public final int colorSupport;
        public final boolean identicalSecondWrite;
        public final boolean preservesResolution;

        public FormatInfo(final ImageFormat format, final boolean canRead,
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
}
