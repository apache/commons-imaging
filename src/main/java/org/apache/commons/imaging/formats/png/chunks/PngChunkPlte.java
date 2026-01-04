/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
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
import java.util.Arrays;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.Allocator;
import org.apache.commons.imaging.formats.png.GammaCorrection;

/**
 * PNG PLTE chunk with palette.
 */
public final class PngChunkPlte extends PngChunk {
    private final int[] rgb;

    /**
     * Constructs a PNG PLTE chunk.
     *
     * @param length the chunk length.
     * @param chunkType the chunk type.
     * @param crc the CRC.
     * @param bytes the chunk bytes.
     * @throws ImagingException if the chunk is corrupt.
     * @throws IOException if an I/O error occurs.
     */
    public PngChunkPlte(final int length, final int chunkType, final int crc, final byte[] bytes) throws ImagingException, IOException {
        super(length, chunkType, crc, bytes);

        final ByteArrayInputStream is = new ByteArrayInputStream(bytes);

        if (length % 3 != 0) {
            throw new ImagingException("PLTE: wrong length: " + length);
        }

        final int count = length / 3;

        rgb = Allocator.intArray(count);

        for (int i = 0; i < count; i++) {
            final int red = readByte("red[" + i + "]", is, "Not a Valid PNG File: PLTE Corrupt");
            final int green = readByte("green[" + i + "]", is, "Not a Valid PNG File: PLTE Corrupt");
            final int blue = readByte("blue[" + i + "]", is, "Not a Valid PNG File: PLTE Corrupt");
            rgb[i] = 0xff000000 | (0xff & red) << 16 | (0xff & green) << 8 | (0xff & blue) << 0;
        }
    }

    /**
     * Applies gamma correction to the palette.
     *
     * @param gammaCorrection the gamma correction to apply.
     */
    public void correct(final GammaCorrection gammaCorrection) {
        Arrays.setAll(rgb, i -> gammaCorrection.correctArgb(rgb[i]));
    }

    /**
     * Gets a copy of the RGB palette.
     *
     * @return the RGB palette.
     */
    public int[] getRgb() {
        return rgb.clone();
    }

    // public void printPalette() {
    // Debug.debug();
    // Debug.debug("palette");
    // for (int i = 0; i < rgb.length; i++) {
    // Debug.debug("\tpalette[" + i + "];", rgb[i] + " (0x"
    // + Integer.toHexString(rgb[i]) + ")");
    //
    // }
    // Debug.debug();
    // }

    /**
     * Gets the RGB value at the specified palette index.
     *
     * @param index the palette index.
     * @return the RGB value.
     * @throws ImagingException if the index is out of bounds.
     */
    public int getRgb(final int index) throws ImagingException {
        if (index < 0 || index >= rgb.length) {
            throw new ImagingException("PNG: unknown Palette reference: " + index);
        }
        return rgb[index];
    }

}
