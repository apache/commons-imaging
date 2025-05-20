/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
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
import java.io.InputStream;
import java.util.Arrays;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.BinaryFunctions;

final class RleReader {
    private final boolean isCompressed;
    private int count;
    private byte sample;

    RleReader(final boolean isCompressed) {
        this.isCompressed = isCompressed;
    }

    void read(final InputStream is, final byte[] samples) throws IOException, ImagingException {
        if (isCompressed) {
            final int prefill = Math.min(count, samples.length);
            Arrays.fill(samples, 0, prefill, sample);
            count -= prefill;

            for (int bytesRead = prefill; bytesRead < samples.length;) {
                final byte b = BinaryFunctions.readByte("RleByte", is, "Error reading image data");
                if ((b & 0xc0) == 0xc0) {
                    count = b & 0x3f;
                    sample = BinaryFunctions.readByte("RleValue", is, "Error reading image data");
                } else {
                    count = 1;
                    sample = b;
                }
                final int samplesToAdd = Math.min(count, samples.length - bytesRead);
                Arrays.fill(samples, bytesRead, bytesRead + samplesToAdd, sample);
                bytesRead += samplesToAdd;
                count -= samplesToAdd;
            }
        } else {
            int r;
            for (int bytesRead = 0; bytesRead < samples.length; bytesRead += r) {
                r = is.read(samples, bytesRead, samples.length - bytesRead);
                if (r < 0) {
                    throw new ImagingException("Premature end of file reading image data");
                }
            }
        }
    }
}
