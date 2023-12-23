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

final class PgmFileInfo extends AbstractFileInfo {
    private final int max;
    private final float scale;
    private final int bytesPerSample;

    PgmFileInfo(final int width, final int height, final boolean rawbits, final int max) throws ImagingException {
        super(width, height, rawbits);
        if (max <= 0) {
            throw new ImagingException("PGM maxVal " + max + " is out of range [1;65535]");
        }
        if (max <= 255) {
            scale = 255f;
            bytesPerSample = 1;
        } else if (max <= 65535) {
            scale = 65535f;
            bytesPerSample = 2;
        } else {
            throw new ImagingException("PGM maxVal " + max + " is out of range [1;65535]");
        }
        this.max = max;
    }

    @Override
    public int getBitDepth() {
        return max;
    }

    @Override
    public ImageInfo.ColorType getColorType() {
        return ImageInfo.ColorType.GRAYSCALE;
    }

    @Override
    public ImageFormat getImageType() {
        return ImageFormats.PGM;
    }

    @Override
    public String getImageTypeDescription() {
        return "PGM: portable graymap file format";
    }

    @Override
    public String getMimeType() {
        return "image/x-portable-graymap";
    }

    @Override
    public int getNumComponents() {
        return 1;
    }

    @Override
    public int getRgb(final InputStream is) throws IOException {
        int sample = readSample(is, bytesPerSample);

        sample = scaleSample(sample, scale, max);

        final int alpha = 0xff;

        return (0xff & alpha) << 24 | (0xff & sample) << 16 | (0xff & sample) << 8 | (0xff & sample) << 0;
    }

    @Override
    public int getRgb(final WhiteSpaceReader wsr) throws IOException {
        int sample = Integer.parseInt(wsr.readtoWhiteSpace());

        sample = scaleSample(sample, scale, max);

        final int alpha = 0xff;

        return (0xff & alpha) << 24 | (0xff & sample) << 16 | (0xff & sample) << 8 | (0xff & sample) << 0;
    }

    @Override
    public boolean hasAlpha() {
        return false;
    }

}
