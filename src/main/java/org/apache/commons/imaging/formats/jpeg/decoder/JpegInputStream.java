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

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;

class JpegInputStream {
    // Figure F.18, F.2.2.5, page 111 of ITU-T T.81
    private final InputStream is;
    private int cnt;
    private int b;

    public JpegInputStream(final InputStream is) {
        this.is = is;
    }

    public int nextBit() throws IOException, ImageReadException {
        if (cnt == 0) {
            b = is.read();
            if (b < 0) {
                throw new ImageReadException("Premature End of File");
            }
            cnt = 8;
            if (b == 0xff) {
                final int b2 = is.read();
                if (b2 < 0) {
                    throw new ImageReadException("Premature End of File");
                }
                if (b2 != 0) {
                    if (b2 == (0xff & JpegConstants.DNL_MARKER)) {
                        throw new ImageReadException("DNL not yet supported");
                    }
                    // found one of the RST markers (RST0..RST7)
                    else if (b2 >= (0xff & JpegConstants.RST0_MARKER)
                            && b2 <= (0xff & JpegConstants.RST7_MARKER)) {
                        // TODO: Replace throw... by handling of restart markers
                        throw new ImageReadException(
                                "Image files using Restart Markers are not supported yet. "
                                + "Found RST marker in entropy data: " + String.format("0xFF %X", b2)
                        );
                    }
                    else {
                        throw new ImageReadException(
                                "Invalid marker found in entropy data: " + String.format("0xFF %X", b2)
                        );
                    }
                }
            }
        }
        final int bit = (b >> 7) & 0x1;
        cnt--;
        b <<= 1;
        return bit;
    }
}
