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
package org.apache.commons.imaging.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Generic implementation of image metadata.
 */
public class GenericImageMetadata implements ImageMetadata {

    /**
     * A generic image metadata item consisting of a keyword-text pair.
     */
    public static class GenericImageMetadataItem implements ImageMetadataItem {

        private final String keyword;
        private final String text;

        /**
         * Constructs a new generic image metadata item.
         *
         * @param keyword the metadata keyword.
         * @param text the metadata text value.
         */
        public GenericImageMetadataItem(final String keyword, final String text) {
            this.keyword = keyword;
            this.text = text;
        }

        /**
         * Gets the keyword.
         *
         * @return the keyword.
         */
        public String getKeyword() {
            return keyword;
        }

        /**
         * Gets the text value.
         *
         * @return the text value.
         */
        public String getText() {
            return text;
        }

        @Override
        public String toString() {
            return toString(null);
        }

        @Override
        public String toString(final String prefix) {
            final String result = keyword + ": " + text;
            if (null != prefix) {
                return prefix + result;
            }
            return result;
        }
    }

    private static final String NEWLINE = System.lineSeparator();

    private final List<ImageMetadataItem> items = new ArrayList<>();

    /**
     * Constructs a new GenericImageMetadata instance.
     */
    public GenericImageMetadata() {
        // Default constructor
    }

    /**
     * Adds a metadata item.
     *
     * @param item the metadata item to add.
     */
    public void add(final ImageMetadataItem item) {
        items.add(item);
    }

    /**
     * Adds a metadata item with the specified keyword and text.
     *
     * @param keyword the metadata keyword.
     * @param text the metadata text value.
     */
    public void add(final String keyword, final String text) {
        add(new GenericImageMetadataItem(keyword, text));
    }

    @Override
    public List<? extends ImageMetadataItem> getItems() {
        return new ArrayList<>(items);
    }

    @Override
    public String toString() {
        return toString(null);
    }

    @Override
    public String toString(String prefix) {
        if (null == prefix) {
            prefix = "";
        }

        final StringBuilder result = new StringBuilder();
        for (int i = 0; i < items.size(); i++) {
            if (i > 0) {
                result.append(NEWLINE);
            }
            // if (null != prefix)
            // result.append(prefix);

            final ImageMetadataItem item = items.get(i);
            result.append(item.toString(prefix + "\t"));

            // Debug.debug("prefix", prefix);
            // Debug.debug("item", items.get(i));
            // Debug.debug();
        }
        return result.toString();
    }

}
