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
package org.apache.commons.imaging.formats.png.chunks;

import static org.apache.commons.imaging.common.BinaryFunctions.readByte;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.formats.png.GammaCorrection;

public class PngChunkPlte extends PngChunk {
    private final int[] rgb;

    public PngChunkPlte(final int length, final int chunkType, final int crc, final byte[] bytes)
            throws ImageReadException, IOException {
        super(length, chunkType, crc, bytes);

        final ByteArrayInputStream is = new ByteArrayInputStream(bytes);

        if ((length % 3) != 0) {
            throw new ImageReadException("PLTE: wrong length: " + length);
        }

        final int count = length / 3;

        rgb = new int[count];

        for (int i = 0; i < count; i++) {
            final int red = readByte("red[" + i + "]", is,
                    "Not a Valid Png File: PLTE Corrupt");
            final int green = readByte("green[" + i + "]", is,
                    "Not a Valid Png File: PLTE Corrupt");
            final int blue = readByte("blue[" + i + "]", is,
                    "Not a Valid Png File: PLTE Corrupt");
            rgb[i] = 0xff000000 | ((0xff & red) << 16) | ((0xff & green) << 8)
                    | ((0xff & blue));
        }
    }

    public int[] getRgb() {
        return rgb.clone();
    }

    public int getRGB(final int index) throws ImageReadException {
        if ((index < 0) || (index >= rgb.length)) {
            throw new ImageReadException("PNG: unknown Palette reference: "
                    + index);
        }
        return rgb[index];
    }

    // public void printPalette() {
    // Debug.debug();
    // Debug.debug("palette");
    // for (int i = 0; i < rgb.length; i++) {
    // Debug.debug("\t" + "palette[" + i + "];", rgb[i] + " (0x"
    // + Integer.toHexString(rgb[i]) + ")");
    //
    // }
    // Debug.debug();
    // }

    public void correct(final GammaCorrection gammaCorrection) {
        for (int i = 0; i < rgb.length; i++) {
            rgb[i] = gammaCorrection.correctARGB(rgb[i]);
        }
    }

}
