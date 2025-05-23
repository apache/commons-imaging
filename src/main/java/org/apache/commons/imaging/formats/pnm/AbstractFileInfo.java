/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.imaging.formats.pnm;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.ImageBuilder;

abstract class AbstractFileInfo {

    static int readSample(final InputStream is, final int bytesPerSample) throws IOException {
        int sample = 0;
        for (int i = 0; i < bytesPerSample; i++) {
            final int nextByte = is.read();
            if (nextByte < 0) {
                throw new ImagingException("PNM: Unexpected EOF");
            }
            sample <<= 8;
            sample |= nextByte;
        }
        return sample;
    }

    static int scaleSample(int sample, final float scale, final int max) throws ImagingException {
        if (sample < 0) {
            // Even netpbm tools break for files like this
            throw new ImagingException("Negative pixel values are invalid in PNM files");
        }
        if (sample > max) {
            // invalid values -> black
            sample = 0;
        }
        return (int) (sample * scale / max + 0.5f);
    }

    final int width;

    final int height;

    final boolean rawBits;

    AbstractFileInfo(final int width, final int height, final boolean rawBits) {
        this.width = width;
        this.height = height;
        this.rawBits = rawBits;
    }

    abstract int getBitDepth();

    abstract ImageInfo.ColorType getColorType();

    abstract ImageFormat getImageType();

    abstract String getImageTypeDescription();

    abstract String getMimeType();

    abstract int getNumComponents();

    abstract int getRgb(InputStream is) throws IOException;

    abstract int getRgb(WhiteSpaceReader wsr) throws IOException;

    abstract boolean hasAlpha();

    void newline() {
        // do nothing by default.
    }

    void readImage(final ImageBuilder imageBuilder, final InputStream is) throws IOException {
        // is = new BufferedInputStream(is);
        // int count = 0;
        //
        // try
        // {

        if (!rawBits) {
            final WhiteSpaceReader wsr = new WhiteSpaceReader(is);

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    final int rgb = getRgb(wsr);

                    imageBuilder.setRgb(x, y, rgb);
                    // count++;
                }
                newline();
            }
        } else {
            for (int y = 0; y < height; y++) {
                // System.out.println("y: " + y);
                for (int x = 0; x < width; x++) {
                    final int rgb = getRgb(is);
                    imageBuilder.setRgb(x, y, rgb);
                    // count++;
                }
                newline();
            }
        }
        // }
        // finally
        // {
        // System.out.println("count: " + count);
        // dump();
        // }
    }
}
