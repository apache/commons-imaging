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
package org.apache.commons.imaging.formats.gif;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.imaging.common.ImageMetadata;

public class GifImageMetadata implements ImageMetadata {
    private static final String NEWLINE = System.getProperty("line.separator");
    private final int width;
    private final int height;
    private final List<GifImageMetadataItem> items;

    GifImageMetadata(final int width, final int height, final List<GifImageMetadataItem> items) {
        this.width = width;
        this.height = height;
        this.items = Collections.unmodifiableList(new ArrayList<>(items));
    }

    @Override
    public String toString(String prefix) {
        prefix = prefix == null ? "" : prefix;
        final StringBuilder result = new StringBuilder();
        result.append(String.format("%sGIF metadata:", prefix));
        result.append(String.format("%sWidth: %d%s", prefix, width, NEWLINE));
        result.append(String.format("%sHeight: %d%s", prefix, height, NEWLINE));
        result.append(NEWLINE);
        result.append(String.format("%sImages:", prefix));
        for (final GifImageMetadataItem item : items) {
            result.append(NEWLINE);
            result.append(item.toString(prefix));
        }
        return result.toString();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public List<GifImageMetadataItem> getItems() {
        return Collections.unmodifiableList(items);
    }
}
