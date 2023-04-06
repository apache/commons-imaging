/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */

package org.apache.commons.imaging.formats.pcx;

import java.awt.image.BufferedImage;
import java.io.IOException;

import org.apache.commons.imaging.common.BinaryOutputStream;

class RleWriter {
    private final boolean isCompressed;
    private int previousByte = -1;
    private int repeatCount = 0;

    RleWriter(final boolean isCompressed) {
        this.isCompressed = isCompressed;
    }

    void write(final BinaryOutputStream bos, final byte[] samples)
            throws IOException {
        if (isCompressed) {
            for (final byte element : samples) {
                if ((element & 0xff) == previousByte
                        && repeatCount < 63) {
                    ++repeatCount;
                } else {
                    if (repeatCount > 0) {
                        if (repeatCount == 1
                                && (previousByte & 0xc0) != 0xc0) {
                            bos.write(previousByte);
                        } else {
                            bos.write(0xc0 | repeatCount);
                            bos.write(previousByte);
                        }
                    }
                    previousByte = 0xff & element;
                    repeatCount = 1;
                }
            }
        } else {
            bos.write(samples);
        }
    }

    void flush(final BinaryOutputStream bos) throws IOException {
        if (repeatCount > 0) {
            if (repeatCount == 1 && (previousByte & 0xc0) != 0xc0) {
                bos.write(previousByte);
            } else {
                bos.write(0xc0 | repeatCount);
                bos.write(previousByte);
            }
        }
    }

    //move method
    public void writePixels32(final BufferedImage src, final int bytesPerLine,
                               final BinaryOutputStream bos) throws IOException {

        final int[] rgbs = new int[src.getWidth()];
        final byte[] plane = new byte[4 * bytesPerLine];
        for (int y = 0; y < src.getHeight(); y++) {
            src.getRGB(0, y, src.getWidth(), 1, rgbs, 0, src.getWidth());
            for (int x = 0; x < rgbs.length; x++) {
                plane[4 * x + 0] = (byte) rgbs[x];
                plane[4 * x + 1] = (byte) (rgbs[x] >> 8);
                plane[4 * x + 2] = (byte) (rgbs[x] >> 16);
                plane[4 * x + 3] = 0;
            }
            write(bos, plane);
        }
        flush(bos);
    }
}
