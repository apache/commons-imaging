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

import org.apache.commons.imaging.ImagingException;

import java.io.IOException;
import java.io.PrintWriter;

/**
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
 *
 * @since 1.0-alpha4
 */
public final class WebPChunkVP8L extends WebPChunk {
    private final int imageWidth;
    private final int imageHeight;
    private final boolean isAlphaUsed;
    private final int versionNumber;

    public WebPChunkVP8L(int type, int size, byte[] bytes) throws ImagingException {
        super(type, size, bytes);

        if (bytes[0] != 0x2f || size < 5) {
            throw new ImagingException("Invalid VP8L chunk");
        }

        int b1 = bytes[1] & 0xFF;
        int b2 = bytes[2] & 0xFF;
        int b3 = bytes[3] & 0xFF;
        int b4 = bytes[4] & 0xFF;

        this.imageWidth = b1 + ((b2 & 0b0011_1111) << 8) + 1;
        this.imageHeight = ((b2 & 0b1100_0000) >> 6) + (b3 << 2) + ((b4 & 0b1111) << 8) + 1;
        this.isAlphaUsed = (b4 & 0b0001_0000) != 0;
        this.versionNumber = b4 >> 5;

        if (versionNumber != 0) {
            throw new ImagingException("VP8L version should be 0");
        }
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public boolean isAlphaUsed() {
        return isAlphaUsed;
    }

    public int getVersionNumber() {
        return versionNumber;
    }

    @Override
    public void dump(PrintWriter pw, int offset) throws ImagingException, IOException {
        super.dump(pw, offset);
        pw.println("  Image Width: " + imageWidth);
        pw.println("  Image Height: " + imageHeight);
        pw.println("  Alpha: " + isAlphaUsed);
    }
}
