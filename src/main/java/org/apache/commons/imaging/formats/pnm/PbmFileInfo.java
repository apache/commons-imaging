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
package org.apache.commons.imaging.formats.pnm;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImagingException;

class PbmFileInfo extends AbstractFileInfo {
    private int bitCache;
    private int bitsInCache;

    PbmFileInfo(final int width, final int height, final boolean rawbits) {
        super(width, height, rawbits);
    }

    @Override
    public int getBitDepth() {
        return 1;
    }

    @Override
    public ImageInfo.ColorType getColorType() {
        return ImageInfo.ColorType.BW;
    }

    @Override
    public ImageFormat getImageType() {
        return ImageFormats.PBM;
    }

    @Override
    public String getImageTypeDescription() {
        return "PBM: portable bitmap fileformat";
    }

    @Override
    public String getMimeType() {
        return "image/x-portable-bitmap";
    }

    @Override
    public int getNumComponents() {
        return 1;
    }

    @Override
    public int getRgb(final InputStream is) throws IOException {
        if (bitsInCache < 1) {
            final int bits = is.read();
            if (bits < 0) {
                throw new ImagingException("PBM: Unexpected EOF");
            }
            bitCache = 0xff & bits;
            bitsInCache += 8;
        }

        final int bit = 0x1 & (bitCache >> 7);
        bitCache <<= 1;
        bitsInCache--;

        if (bit == 0) {
            return 0xffffffff;
        }
        if (bit == 1) {
            return 0xff000000;
        }
        throw new ImagingException("PBM: bad bit: " + bit);
    }

    @Override
    public int getRgb(final WhiteSpaceReader wsr) throws IOException {
        final int bit = Integer.parseInt(wsr.readtoWhiteSpace());
        if (bit == 0) {
            return 0xff000000;
        }
        if (bit == 1) {
            return 0xffffffff;
        }
        throw new ImagingException("PBM: bad bit: " + bit);
    }

    @Override
    public boolean hasAlpha() {
        return false;
    }

    @Override
    protected void newline() {
        bitCache = 0;
        bitsInCache = 0;
    }

}
