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
import java.util.Objects;

import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.internal.Debug;

/**
 * Represents metadata information contained in a PNG image.
 *
 * @since 1.0-alpha6
 */
public class PngImageMetadata implements ImageMetadata {

    private static final String NEWLINE = System.lineSeparator();

    private final ImageMetadata textualInformation;
    private final TiffImageMetadata exif;

    /**
     * Constructs PNG image metadata.
     *
     * @param textualInformation textual information.
     */
    public PngImageMetadata(final ImageMetadata textualInformation) {
        this(textualInformation, null);
    }

    /**
     * Constructs PNG image metadata.
     *
     * @param textualInformation textual information.
     * @param exif EXIF metadata.
     */
    public PngImageMetadata(final ImageMetadata textualInformation, final TiffImageMetadata exif) {
        this.textualInformation = Objects.requireNonNull(textualInformation);
        this.exif = exif;
    }

    /**
     * Dumps metadata to debug output.
     */
    public void dump() {
        Debug.debug(this.toString());
    }

    /**
     * Gets EXIF metadata.
     *
     * @return EXIF metadata, or null if none.
     */
    public TiffImageMetadata getExif() {
        return exif;
    }

    @Override
    public List<? extends ImageMetadataItem> getItems() {
        if (exif == null) {
            return textualInformation.getItems();
        }

        final ArrayList<ImageMetadataItem> result = new ArrayList<>(textualInformation.getItems());
        result.addAll(exif.getItems());
        return result;
    }

    /**
     * Gets textual information.
     *
     * @return textual information.
     */
    public ImageMetadata getTextualInformation() {
        return textualInformation;
    }

    @Override
    public String toString() {
        return toString(null);
    }

    @Override
    public String toString(String prefix) {
        if (prefix == null) {
            prefix = "";
        }

        final StringBuilder result = new StringBuilder();

        result.append(prefix);
        result.append("Textual information:");
        result.append(NEWLINE);
        result.append(textualInformation.toString("\t"));

        if (exif != null) {
            result.append(NEWLINE);
            result.append(prefix);
            result.append("Exif metadata:");
            result.append(NEWLINE);
            result.append(exif.toString("\t"));
        }

        return result.toString();
    }
}
