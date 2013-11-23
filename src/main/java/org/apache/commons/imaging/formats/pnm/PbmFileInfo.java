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

public class PbmFileInfo extends FileInfo {
    private int bitcache = 0;
    private int bits_in_cache = 0;

    public PbmFileInfo(final int width, final int height, final boolean RAWBITS) {
        super(width, height, RAWBITS);
    }
    
    @Override
    public boolean hasAlpha() {
        return false;
    }

    @Override
    public int getNumComponents() {
        return 1;
    }

    @Override
    public int getBitDepth() {
        return 1;
    }

    @Override
    public ImageFormat getImageType() {
        return ImageFormats.PBM;
    }

    @Override
    public int getColorType() {
        return ImageInfo.COLOR_TYPE_BW;
    }

    @Override
    public String getImageTypeDescription() {
        return "PBM: portable bitmap fileformat";
    }

    @Override
    public String getMIMEType() {
        return "image/x-portable-bitmap";
    }

    @Override
    protected void newline() {
        bitcache = 0;
        bits_in_cache = 0;
    }

    @Override
    public int getRGB(final InputStream is) throws IOException {
        if (bits_in_cache < 1) {
            final int bits = is.read();
            if (bits < 0) {
                throw new IOException("PBM: Unexpected EOF");
            }
            bitcache = 0xff & bits;
            bits_in_cache += 8;
        }

        final int bit = 0x1 & (bitcache >> 7);
        bitcache <<= 1;
        bits_in_cache--;

        if (bit == 0) {
            return 0xffffffff;
        }
        if (bit == 1) {
            return 0xff000000;
        }
        throw new IOException("PBM: bad bit: " + bit);
    }

    @Override
    public int getRGB(final WhiteSpaceReader wsr) throws IOException {
        final int bit = Integer.parseInt(wsr.readtoWhiteSpace());
        if (bit == 0) {
            return 0xff000000;
        }
        if (bit == 1) {
            return 0xffffffff;
        }
        throw new IOException("PBM: bad bit: " + bit);
    }

}
