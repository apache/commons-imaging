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
package org.apache.commons.imaging.formats.png;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;

public class PngImageInfo extends ImageInfo {
    private final List<PngText> textChunks;

    public PngImageInfo(final String formatDetails, final int bitsPerPixel,
            final List<String> comments, final ImageFormats format, final String formatName,
            final int height, final String mimeType, final int numberOfImages,
            final int physicalHeightDpi, final float physicalHeightInch,
            final int physicalWidthDpi, final float physicalWidthInch, final int width,
            final boolean isProgressive, final boolean isTransparent, final boolean usesPalette,
            final int colorType, final String compressionAlgorithm,
            final List<PngText> textChunks) {
        super(formatDetails, bitsPerPixel, comments, format, formatName,
                height, mimeType, numberOfImages, physicalHeightDpi,
                physicalHeightInch, physicalWidthDpi, physicalWidthInch, width,
                isProgressive, isTransparent, usesPalette, colorType,
                compressionAlgorithm);

        this.textChunks = textChunks;
    }

    public List<PngText> getTextChunks() {
        return new ArrayList<PngText>(textChunks);
    }

}
