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
package org.apache.commons.imaging.formats.bmp;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.ImageBuilder;

abstract class PixelParser {

    final BmpHeaderInfo bhi;
    final byte[] colorTable;
    final byte[] imageData;

    final InputStream is;

    PixelParser(final BmpHeaderInfo bhi, final byte[] colorTable, final byte[] imageData) {
        this.bhi = Objects.requireNonNull(bhi, "BmpHeaderInfo must not be null");
        this.colorTable = Objects.requireNonNull(colorTable, "Color table must not be null");
        this.imageData = Objects.requireNonNull(imageData, "Image data must not be null");

        is = new ByteArrayInputStream(imageData);
    }

    public abstract void processImage(ImageBuilder imageBuilder) throws ImageReadException, IOException;

    int getColorTableRGB(int index) {
        index *= 4;
        final int blue = 0xff & colorTable[index + 0];
        final int green = 0xff & colorTable[index + 1];
        final int red = 0xff & colorTable[index + 2];
        final int alpha = 0xff;

        return (alpha << 24)
                | (red << 16)
                | (green << 8)
                | (blue << 0);
    }

}
