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
import java.util.Objects;

import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.internal.Debug;

/**
 * @since 1.0-alpha6
 */
public class PngImageMetadata implements ImageMetadata {

    private static final String NEWLINE = System.lineSeparator();

    private final ImageMetadata textualInformation;
    private final TiffImageMetadata exif;

    public PngImageMetadata(final ImageMetadata textualInformation) {
        this(textualInformation, null);
    }

    public PngImageMetadata(final ImageMetadata textualInformation, final TiffImageMetadata exif) {
        this.textualInformation = Objects.requireNonNull(textualInformation);
        this.exif = exif;
    }

    public ImageMetadata getTextualInformation() {
        return textualInformation;
    }

    public TiffImageMetadata getExif() {
        return exif;
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

    @Override
    public List<? extends ImageMetadataItem> getItems() {
        if (exif == null) {
            return textualInformation.getItems();
        }

        final ArrayList<ImageMetadataItem> result = new ArrayList<>();
        result.addAll(textualInformation.getItems());
        result.addAll(exif.getItems());
        return result;
    }

    public void dump() {
        Debug.debug(this.toString());
    }
}
