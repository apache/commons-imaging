package org.apache.commons.imaging.roundtrip;

import java.awt.image.BufferedImage;

final class TestImages {

    private TestImages() {
    }

    static BufferedImage createArgbBitmapImage(final int width, final int height) {
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

    static BufferedImage createBitmapBitmapImage(final int width, final int height) {
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

    static BufferedImage createArgbGrayscaleImage(final int width, final int height) {
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

    static BufferedImage createGrayscaleGrayscaleImage(final int width, final int height) {
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

    static BufferedImage createLimitedColorImage(final int width, final int height) {
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

    static BufferedImage createFullColorImage(final int width, final int height) {
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
