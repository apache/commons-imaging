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
 * VP8X (descriptions of features used) chunk.
 *
 * <pre>{@code
 *  0                   1                   2                   3
 *  0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1
 * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
 * |                                                               |
 * |                   WebP file header (12 bytes)                 |
 * |                                                               |
 * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
 * |                      ChunkHeader('VP8X')                      |
 * |                                                               |
 * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
 * |Rsv|I|L|E|X|A|R|                   Reserved                    |
 * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
 * |          Canvas Width Minus One               |             ...
 * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
 * ...  Canvas Height Minus One    |
 * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
 * }</pre>
 *
 * @see <a href="https://developers.google.com/speed/webp/docs/riff_container#extended_file_format">Extended File Format</a>
 * @since 1.0-alpha4
 */
public final class WebPChunkVp8x extends WebPChunk {
    private final boolean hasIcc;
    private final boolean hasAlpha;
    private final boolean hasExif;
    private final boolean hasXmp;
    private final boolean hasAnimation;
    private final int canvasWidth;
    private final int canvasHeight;

    /**
     * Create a VP8x chunk.
     *
     * @param type  VP8X chunk type
     * @param size  VP8X chunk size
     * @param bytes VP8X chunk data
     * @throws ImagingException if the chunk data and the size provided do not match, or if the other parameters provided are invalid.
     */
    public WebPChunkVp8x(final int type, final int size, final byte[] bytes) throws ImagingException {
        super(type, size, bytes);

        if (size != 10) {
            throw new ImagingException("VP8X chunk size must be 10");
        }

        final int mark = bytes[0] & 0xFF;
        this.hasIcc = (mark & 0b0010_0000) != 0;
        this.hasAlpha = (mark & 0b0001_0000) != 0;
        this.hasExif = (mark & 0b0000_1000) != 0;
        this.hasXmp = (mark & 0b0000_0100) != 0;
        this.hasAnimation = (mark & 0b0000_0010) != 0;

        this.canvasWidth = (bytes[4] & 0xFF) + ((bytes[5] & 0xFF) << 8) + ((bytes[6] & 0xFF) << 16) + 1;
        this.canvasHeight = (bytes[7] & 0xFF) + ((bytes[8] & 0xFF) << 8) + ((bytes[9] & 0xFF) << 16) + 1;

        if (canvasWidth * canvasHeight < 0) {
            throw new ImagingException("Illegal canvas size");
        }
    }

    @Override
    public void dump(final PrintWriter pw, final int offset) throws ImagingException, IOException {
        super.dump(pw, offset);
        pw.println("  ICCP: " + hasIcc());
        pw.println("  Alpha: " + hasAlpha());
        pw.println("  EXIF: " + hasExif());
        pw.println("  XMP: " + hasXmp());
        pw.println("  Animation: " + hasAnimation());
        pw.println("  Canvas Width: " + getCanvasWidth());
        pw.println("  Canvas Height: " + getCanvasHeight());
    }

    /**
     * @return the canvas height.
     */
    public int getCanvasHeight() {
        return canvasHeight;
    }

    /**
     * @return the canvas width.
     */
    public int getCanvasWidth() {
        return canvasWidth;
    }

    /**
     * @return whether the chunk has alpha enabled.
     */
    public boolean hasAlpha() {
        return hasAlpha;
    }

    /**
     * @return if the chunk contains an animation.
     */
    public boolean hasAnimation() {
        return hasAnimation;
    }

    /**
     * @return whether the chunk has EXIF data.
     */
    public boolean hasExif() {
        return hasExif;
    }

    /**
     * @return whether the chunk has ICC enabled.
     */
    public boolean hasIcc() {
        return hasIcc;
    }

    /**
     * @return whether the chunk has XMP.
     */
    public boolean hasXmp() {
        return hasXmp;
    }
}
