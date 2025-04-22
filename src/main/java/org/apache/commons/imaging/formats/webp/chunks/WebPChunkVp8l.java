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
package org.apache.commons.imaging.formats.webp.chunks;

import java.io.IOException;
import java.io.PrintWriter;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.internal.SafeOperations;

/**
 * VP8L (lossless bitstream) chunk.
 *
 * <pre>{@code
 *  0                   1                   2                   3
 *  0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1
 * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
 * |                      ChunkHeader('VP8L')                      |
 * |                                                               |
 * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
 * :                           VP8L data                           :
 * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
 * }</pre>
 *
 * @see <a href="https://developers.google.com/speed/webp/docs/riff_container#simple_file_format_lossless">Simple File Format (Lossless)</a>
 * @since 1.0.0-alpha4
 */
public final class WebPChunkVp8l extends WebPChunk {
    private final int imageWidth;
    private final int imageHeight;
    private final boolean hasAlpha;
    private final int versionNumber;

    /**
     * Create a VP8L chunk.
     *
     * @param type  chunk type.
     * @param size  chunk size.
     * @param bytes chunk data.
     * @throws ImagingException if the chunk data and the size provided do not match.
     */
    public WebPChunkVp8l(final int type, final int size, final byte[] bytes) throws ImagingException {
        super(type, size, bytes);

        if (bytes[0] != 0x2f || size < 5) {
            throw new ImagingException("Invalid VP8L chunk");
        }

        final int b1 = bytes[1] & 0xFF;
        final int b2 = bytes[2] & 0xFF;
        final int b3 = bytes[3] & 0xFF;
        final int b4 = bytes[4] & 0xFF;

        this.imageWidth = b1 + ((b2 & 0b0011_1111) << 8) + 1;
        this.imageHeight = SafeOperations.add((b2 & 0b1100_0000) >> 6, b3 << 2, (b4 & 0b1111) << 8, 1);
        this.hasAlpha = (b4 & 0b0001_0000) != 0;
        this.versionNumber = b4 >> 5;

        if (versionNumber != 0) {
            throw new ImagingException("VP8L version should be 0");
        }
    }

    @Override
    public void dump(final PrintWriter pw, final int offset) throws ImagingException, IOException {
        super.dump(pw, offset);
        pw.println("  Version Number: " + getVersionNumber());
        pw.println("  Image Width: " + getImageWidth());
        pw.println("  Image Height: " + getImageHeight());
        pw.println("  Alpha: " + hasAlpha());
    }

    /**
     * @return the image height.
     */
    public int getImageHeight() {
        return imageHeight;
    }

    /**
     * @return the image width.
     */
    public int getImageWidth() {
        return imageWidth;
    }

    /**
     * @return the version number.
     */
    public int getVersionNumber() {
        return versionNumber;
    }

    /**
     * @return whether the image has an alpha channel or not.
     */
    public boolean hasAlpha() {
        return hasAlpha;
    }
}
