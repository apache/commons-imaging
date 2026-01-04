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
package org.apache.commons.imaging.formats.png;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageInfo;

/**
 * PNG image information.
 */
public class PngImageInfo extends ImageInfo {

    private final List<AbstractPngText> textChunks;
    private final PhysicalScale physicalScale;

    /**
     * Constructs PNG image info.
     *
     * @param formatDetails format details.
     * @param bitsPerPixel bits per pixel.
     * @param comments image comments.
     * @param format image format.
     * @param formatName format name.
     * @param height image height.
     * @param mimeType MIME type.
     * @param numberOfImages number of images.
     * @param physicalHeightDpi physical height DPI.
     * @param physicalHeightInch physical height in inches.
     * @param physicalWidthDpi physical width DPI.
     * @param physicalWidthInch physical width in inches.
     * @param width image width.
     * @param progressive whether progressive.
     * @param transparent whether transparent.
     * @param usesPalette whether uses palette.
     * @param colorType color type.
     * @param compressionAlgorithm compression algorithm.
     * @param textChunks text chunks.
     * @param physicalScale physical scale.
     */
    PngImageInfo(final String formatDetails, final int bitsPerPixel, final List<String> comments, final ImageFormat format, final String formatName,
            final int height, final String mimeType, final int numberOfImages, final int physicalHeightDpi, final float physicalHeightInch,
            final int physicalWidthDpi, final float physicalWidthInch, final int width, final boolean progressive, final boolean transparent,
            final boolean usesPalette, final ColorType colorType, final CompressionAlgorithm compressionAlgorithm, final List<AbstractPngText> textChunks,
            final PhysicalScale physicalScale) {
        super(formatDetails, bitsPerPixel, comments, format, formatName, height, mimeType, numberOfImages, physicalHeightDpi, physicalHeightInch,
                physicalWidthDpi, physicalWidthInch, width, progressive, transparent, usesPalette, colorType, compressionAlgorithm);

        this.textChunks = textChunks;
        this.physicalScale = physicalScale;
    }

    /**
     * Gets the physical scale of Image.
     *
     * @return {@link PhysicalScale}. If undefined then {@link PhysicalScale#UNDEFINED} is returned.
     */
    public PhysicalScale getPhysicalScale() {
        return physicalScale;
    }

    /**
     * Gets the text chunks.
     *
     * @return list of text chunks.
     */
    public List<AbstractPngText> getTextChunks() {
        return new ArrayList<>(textChunks);
    }

}
