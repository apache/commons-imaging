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

package org.apache.commons.imaging.formats.jpeg.decoder;

import java.util.Arrays;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;

class JpegInputStream {
    // Figure F.18, F.2.2.5, page 111 of ITU-T T.81
    private final int[] interval;
    // next position in the array to read
    private int nextPos;
    private int cnt;
    private int b;
    static final int SHALLOW_SIZE = 32;

    JpegInputStream(final int[] interval) {
        this.interval = Arrays.copyOf(interval, interval.length);
        this.nextPos = 0;
    }

    /**
     * Returns {@code true} as long there are unread fields available, else {@code false}
     * @return {@code true} as long there are unread fields available, else {@code false}
     */
    public boolean hasNext() {
        return nextPos < this.interval.length;
    }

    public int nextBit() throws ImageReadException {
        if (cnt == 0) {
            b = this.read();
            if (b < 0) {
                throw new ImageReadException("Premature End of File");
            }
            cnt = 8;
            if (b == 0xff) {
                final int b2 = this.read();
                if (b2 < 0) {
                    throw new ImageReadException("Premature End of File");
                }
                if (b2 != 0) {
                    if (b2 == (0xff & JpegConstants.DNL_MARKER)) {
                        throw new ImageReadException("DNL not yet supported");
                    }
                    throw new ImageReadException("Invalid marker found "
                        + "in entropy data: 0xFF " + Integer.toHexString(b2));
                }
            }
        }
        final int bit = (b >> 7) & 0x1;
        cnt--;
        b <<= 1;
        return bit;
    }

    /**
     * Returns the value from current field (as {@code InputStream.read()} would do)
     * and set the position of the pointer to the next field to read.
     * @return the value from current field (as {@code InputStream.read()} would do).
     * @throws IllegalStateException if the stream hasn't any other value.
     */
    int read() {
        if (!this.hasNext()) {
            throw new IllegalStateException("This stream hasn't any other value, all values were already read.");
        }
        final int value = this.interval[nextPos];
        this.nextPos++;
        return value;
    }
}
