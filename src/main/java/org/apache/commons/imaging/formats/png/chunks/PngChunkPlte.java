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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.formats.png.ChunkType;
import org.apache.commons.imaging.formats.png.GammaCorrection;

public final class PngChunkPlte extends PngChunk {
    
    private final int[] rgbPaletteEntries;

    PngChunkPlte(final ByteBuffer contents) throws ImageReadException {
        super(ChunkType.PLTE, contents);
        
        if(contentSize() % 3 != 0) {
            throw new ImageReadException("PNG Component: PNG PLTE chunk palette "
                    + "contains illegal length: (should be multiple of 3, RGB) " + contentSize());
        }
        
        final int entryCount = contentSize() / 3;
        this.rgbPaletteEntries = new int[entryCount];
        this.rawContents.position(0);
        
        for (int i = 0; i < entryCount; i++) {
            final int red = rawContents.get();
            final int green = rawContents.get();
            final int blue = rawContents.get();// no need for readByte(), bytes length should be checked
            rgbPaletteEntries[i] = 0xFF000000 | ((0xFF & red) << 16) |
                    ((0xFF & green) << 8) | (0xFF & blue);
        }
    }

    public int[] getRgb() {
        return rgbPaletteEntries; // TODO clone? Is the method used?
    }

    public int getRGB(final int index) throws ImageReadException {
        if ((index < 0) || (index >= rgbPaletteEntries.length)) {
            throw new ImageReadException("PNG Component: Illegal palette "
                    + "reference found: " + index);
        }
        
        return rgbPaletteEntries[index];
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
        for (int i = 0; i < rgbPaletteEntries.length; i++) {
            rgbPaletteEntries[i] = gammaCorrection.correctARGB(rgbPaletteEntries[i]);
        }
    }

}
