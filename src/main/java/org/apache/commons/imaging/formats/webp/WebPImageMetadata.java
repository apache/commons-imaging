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
package org.apache.commons.imaging.formats.webp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.imaging.common.GenericImageMetadata;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;

/**
 * WebP image metadata.
 *
 * @since 1.0.0-alpha4
 */
public final class WebPImageMetadata extends GenericImageMetadata {

    /**
     * TIFF Exif metadata.
     */
    private final TiffImageMetadata exif;

    /**
     * Create a new WebP image metadata object.
     *
     * @param exif the Exif metadata.
     */
    public WebPImageMetadata(final TiffImageMetadata exif) {
        this.exif = exif;
    }

    /**
     * Returns the Exif metadata.
     *
     * @return {@code null} if no Exif metadata is available; otherwise, returns the Exif metadata.
     */
    public TiffImageMetadata getExif() {
        return exif;
    }

    @Override
    public List<? extends ImageMetadataItem> getItems() {
        final ArrayList<ImageMetadataItem> items = new ArrayList<>(super.getItems());
        if (exif != null) {
            items.addAll(exif.getItems());
        }
        return Collections.unmodifiableList(items);
    }
}
