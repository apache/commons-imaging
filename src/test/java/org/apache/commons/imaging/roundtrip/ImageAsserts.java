/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.imaging.roundtrip;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import org.apache.commons.imaging.internal.Debug;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Assertions;

final class ImageAsserts {

    static void assertEquals(final BufferedImage a, final BufferedImage b) {
        assertEquals(a, b, 0);
    }

    static void assertEquals(final BufferedImage a, final BufferedImage b, final int tolerance) {
        Assertions.assertEquals(a.getWidth(), b.getWidth());
        Assertions.assertEquals(a.getHeight(), b.getHeight());

        for (int x = 0; x < a.getWidth(); x++) {
            for (int y = 0; y < a.getHeight(); y++) {
                final int aArgb = a.getRGB(x, y);
                final int bArgb = b.getRGB(x, y);
                if (aArgb != bArgb) {
                    if (calculateARGBDistance(aArgb, bArgb) <= tolerance) {
                        continue; // ignore.
                    }
                }
                if (aArgb != bArgb) {
                    Debug.debug("width: " + a.getWidth());
                    Debug.debug("height: " + a.getHeight());
                    Debug.debug("distance: " + calculateARGBDistance(aArgb, bArgb));
                    Debug.debug("x: " + x);
                    Debug.debug("y: " + y);
                    Debug.debug("aArgb: " + aArgb + " (0x" + Integer.toHexString(aArgb) + ")");
                    Debug.debug("bArgb: " + bArgb + " (0x" + Integer.toHexString(bArgb) + ")");
                }
                Assertions.assertEquals(aArgb, bArgb);
            }
        }
    }

    static void assertEquals(final File a, final File b) throws IOException {
        assertTrue(a.exists() && a.isFile());
        assertTrue(b.exists() && b.isFile());
        Assertions.assertEquals(a.length(), b.length());

        final byte[] aData = FileUtils.readFileToByteArray(a);
        final byte[] bData = FileUtils.readFileToByteArray(b);

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
            Assertions.assertEquals(aByte, bByte);
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
        return Math.abs(aAlpha - bAlpha) + Math.abs(aRed - bRed)
                + Math.abs(aGreen - bGreen) + Math.abs(aBlue - bBlue);

    }

    private ImageAsserts() {
    }
}
