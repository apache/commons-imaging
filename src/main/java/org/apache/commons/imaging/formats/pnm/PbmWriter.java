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
import java.util.Map;

import org.apache.commons.imaging.ImageWriteException;

public class PbmWriter extends PnmWriter implements PnmConstants {
    public PbmWriter(final boolean RAWBITS) {
        super(RAWBITS);
    }

    @Override
    public void writeImage(final BufferedImage src, final OutputStream os, final Map<String,Object> params)
            throws ImageWriteException, IOException {
        os.write(PNM_PREFIX_BYTE);
        os.write(RAWBITS ? PBM_RAW_CODE : PBM_TEXT_CODE);
        os.write(PNM_SEPARATOR);

        final int width = src.getWidth();
        final int height = src.getHeight();

        os.write(("" + width).getBytes("US-ASCII"));
        os.write(PNM_SEPARATOR);

        os.write(("" + height).getBytes("US-ASCII"));
        os.write(PNM_NEWLINE);

        int bitcache = 0;
        int bits_in_cache = 0;

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                final int argb = src.getRGB(x, y);
                final int red = 0xff & (argb >> 16);
                final int green = 0xff & (argb >> 8);
                final int blue = 0xff & (argb >> 0);
                int sample = (red + green + blue) / 3;
                if (sample > 127) {
                    sample = 0;
                } else {
                    sample = 1;
                }

                if (RAWBITS) {
                    bitcache = (bitcache << 1) | (0x1 & sample);
                    bits_in_cache++;

                    if (bits_in_cache >= 8) {
                        os.write((byte) bitcache);
                        bitcache = 0;
                        bits_in_cache = 0;
                    }
                } else {
                    os.write(("" + sample).getBytes("US-ASCII")); // max
                                                                  // component
                                                                  // value
                    os.write(PNM_SEPARATOR);
                }
            }

            if ((RAWBITS) && (bits_in_cache > 0)) {
                bitcache = bitcache << (8 - bits_in_cache);
                os.write((byte) bitcache);
                bitcache = 0;
                bits_in_cache = 0;
            }
        }
    }
}
