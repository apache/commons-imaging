package org.apache.commons.imaging.roundtrip;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import org.apache.commons.imaging.util.Debug;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class ImageAsserts {

    static void assertEquals(final BufferedImage a, final BufferedImage b) {
        assertEquals(a, b, 0);
    }

    static void assertEquals(final BufferedImage a, final BufferedImage b, final int tolerance) {
        Assert.assertEquals(a.getWidth(), b.getWidth());
        Assert.assertEquals(a.getHeight(), b.getHeight());

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
                Assert.assertEquals(a_argb, b_argb);
            }
        }
    }

    static int calculateARGBDistance(final int a, final int b) {
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

    static void assertEquals(final File a, final File b) throws IOException {
        assertTrue(a.exists() && a.isFile());
        assertTrue(b.exists() && b.isFile());
        Assert.assertEquals(a.length(), b.length());

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
            Assert.assertEquals(aByte, bByte);
        }
    }
}
