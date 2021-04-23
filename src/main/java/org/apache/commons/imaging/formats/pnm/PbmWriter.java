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
package org.apache.commons.imaging.formats.pnm;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import org.apache.commons.imaging.ImageWriteException;

class PbmWriter implements PnmWriter {

    private final boolean rawBits;

    PbmWriter(final boolean rawBits) {
        this.rawBits = rawBits;
    }

    @Override
    public void writeImage(final BufferedImage src, final OutputStream os, final Map<String, Object> params)
            throws ImageWriteException, IOException {
        os.write(PnmConstants.PNM_PREFIX_BYTE);
        os.write(rawBits ? PnmConstants.PBM_RAW_CODE : PnmConstants.PBM_TEXT_CODE);
        os.write(PnmConstants.PNM_SEPARATOR);

        final int width = src.getWidth();
        final int height = src.getHeight();

        os.write(Integer.toString(width).getBytes(StandardCharsets.US_ASCII));
        os.write(PnmConstants.PNM_SEPARATOR);

        os.write(Integer.toString(height).getBytes(StandardCharsets.US_ASCII));
        os.write(PnmConstants.PNM_NEWLINE);

        int bitcache = 0;
        int bitsInCache = 0;

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                final int argb = src.getRGB(x, y);
                final int red = 0xff & (argb >> 16);
                final int green = 0xff & (argb >> 8);
                final int blue = 0xff & (argb);
                int sample = (red + green + blue) / 3;
                if (sample > 127) {
                    sample = 0;
                } else {
                    sample = 1;
                }

                if (rawBits) {
                    bitcache = (bitcache << 1) | (0x1 & sample);
                    bitsInCache++;

                    if (bitsInCache >= 8) {
                        os.write((byte) bitcache);
                        bitcache = 0;
                        bitsInCache = 0;
                    }
                } else {
                    os.write(Integer.toString(sample).getBytes(StandardCharsets.US_ASCII)); // max
                                                                  // component
                                                                  // value
                    os.write(PnmConstants.PNM_SEPARATOR);
                }
            }

            if (rawBits && (bitsInCache > 0)) {
                bitcache = bitcache << (8 - bitsInCache);
                os.write((byte) bitcache);
                bitcache = 0;
                bitsInCache = 0;
            }
        }
    }
}
