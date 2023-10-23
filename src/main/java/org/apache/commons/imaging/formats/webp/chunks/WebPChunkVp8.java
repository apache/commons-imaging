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

/**
 * VP8 (bitstream) chunk.
 *
 * <pre>{@code
 *  0                   1                   2                   3
 *  0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1
 * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
 * |                      ChunkHeader('VP8 ')                      |
 * |                                                               |
 * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
 * :                           VP8 data                            :
 * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
 * }</pre>
 *
 * @see <a href="https://developers.google.com/speed/webp/docs/riff_container#simple_file_format_lossy">Simple File Format (Lossy)</a>
 * @see <a href="https://datatracker.ietf.org/doc/html/rfc6386">VP8 Data Format and Decoding Guide</a>
 * @since 1.0-alpha4
 */
public final class WebPChunkVp8 extends WebPChunk {
    private final int versionNumber;
    private final int width;
    private final int height;
    private final int horizontalScale;
    private final int verticalScale;

    /**
     * Create a VP8 chunk.
     *
     * @param type  chunk type.
     * @param size  chunk size.
     * @param bytes chunk data.
     * @throws ImagingException if the chunk data and the size provided do not match.
     */
    public WebPChunkVp8(int type, int size, byte[] bytes) throws ImagingException {
        super(type, size, bytes);

        if (size < 10) {
            throw new ImagingException("Invalid VP8 chunk");
        }

        /*
         * https://datatracker.ietf.org/doc/html/rfc6386#section-9
         */

        /*
         * Frame Header:
         *
         * 1.  A 1-bit frame type (0 for key frames, 1 for interframes).
         *
         * 2.  A 3-bit version number (0 - 3 are defined as four different
         *     profiles with different decoding complexity; other values may be
         *     defined for future variants of the VP8 data format).
         *
         * 3.  A 1-bit show_frame flag (0 when current frame is not for display,
         *     1 when current frame is for display).
         *
         * 4.  A 19-bit field containing the size of the first data partition in
         *     bytes.
         */

        int b0 = bytes[0] & 0xFF;
        // int b1 = bytes[1] & 0xFF;
        // int b2 = bytes[2] & 0xFF;

        if ((b0 & 0b1) != 0) {
            throw new ImagingException("Invalid VP8 chunk: should be key frame");
        }

        this.versionNumber = (b0 & 0b1110) >> 1;
        if ((b0 & 0b0001_0000) == 0) {
            throw new ImagingException("Invalid VP8 chunk: frame should to be display");
        }

        // int firstDataPartitionSize = (b0 >>> 5) + (b1 << 3) + (b2 << 11);

        /*
         * Key Frame:
         *
         * Start code byte 0     0x9d
         * Start code byte 1     0x01
         * Start code byte 2     0x2a
         *
         * 16 bits      :     (2 bits Horizontal Scale << 14) | Width  (14 bits)
         * 16 bits      :     (2 bits Vertical   Scale << 14) | Height (14 bits)
         */

        int b3 = bytes[3] & 0xFF;
        int b4 = bytes[4] & 0xFF;
        int b5 = bytes[5] & 0xFF;
        int b6 = bytes[6] & 0xFF;
        int b7 = bytes[7] & 0xFF;
        int b8 = bytes[8] & 0xFF;
        int b9 = bytes[9] & 0xFF;

        if (b3 != 0x9D || b4 != 0x01 || b5 != 0x2A) {
            throw new ImagingException("Invalid VP8 chunk: invalid signature");
        }

        this.width = b6 + ((b7 & 0b0011_1111) << 8);
        this.horizontalScale = b7 >> 6;
        this.height = b8 + ((b9 & 0b0011_1111) << 8);
        this.verticalScale = b9 >> 6;
    }

    @Override
    public void dump(PrintWriter pw, int offset) throws ImagingException, IOException {
        super.dump(pw, offset);
        pw.println("  Version Number: " + getVersionNumber());
        pw.println("  Width: " + getWidth());
        pw.println("  Height: " + getHeight());
        pw.println("  Horizontal Scale: " + getHorizontalScale());
        pw.println("  Vertical Scale: " + getVerticalScale());
    }

    /**
     * @return the height.
     */
    public int getHeight() {
        return height;
    }

    /**
     * @return the horizontal scale.
     */
    public int getHorizontalScale() {
        return horizontalScale;
    }

    /**
     * @return the version number.
     */
    public int getVersionNumber() {
        return versionNumber;
    }

    /**
     * @return the vertical scale.
     */
    public int getVerticalScale() {
        return verticalScale;
    }

    /**
     * @return the width.
     */
    public int getWidth() {
        return width;
    }
}
