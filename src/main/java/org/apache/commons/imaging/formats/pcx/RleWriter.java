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

import java.io.IOException;

import org.apache.commons.imaging.common.AbstractBinaryOutputStream;

final class RleWriter {
    private final boolean isCompressed;
    private int previousByte = -1;
    private int repeatCount;

    RleWriter(final boolean isCompressed) {
        this.isCompressed = isCompressed;
    }

    void flush(final AbstractBinaryOutputStream bos) throws IOException {
        if (repeatCount > 0) {
            if (repeatCount != 1 || (previousByte & 0xc0) == 0xc0) {
                bos.write(0xc0 | repeatCount);
            }
            bos.write(previousByte);
        }
    }

    void write(final AbstractBinaryOutputStream bos, final byte[] samples) throws IOException {
        if (isCompressed) {
            for (final byte element : samples) {
                if ((element & 0xff) == previousByte && repeatCount < 63) {
                    ++repeatCount;
                } else {
                    if (repeatCount > 0) {
                        if (repeatCount != 1 || (previousByte & 0xc0) == 0xc0) {
                            bos.write(0xc0 | repeatCount);
                        }
                        bos.write(previousByte);
                    }
                    previousByte = 0xff & element;
                    repeatCount = 1;
                }
            }
        } else {
            bos.write(samples);
        }
    }
}
