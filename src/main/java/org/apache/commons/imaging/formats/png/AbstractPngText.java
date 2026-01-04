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

/**
 * Abstract class for PNG text chunks.
 */
public abstract class AbstractPngText {

    /**
     * Represents an international text chunk (iTXt).
     */
    public static class Itxt extends AbstractPngText {

        /*
         * The language tag defined in [RFC-3066] indicates the human language used by the translated keyword and the text. Unlike the keyword, the language tag
         * is case-insensitive. It is an ISO 646.IRV:1991 [ISO 646] string consisting of hyphen-separated words of 1-8 alphanumeric characters each (for example
         * cn, en-uk, no-bok, x-klingon, x-KlInGoN). If the first word is two or three letters long, it is an ISO language code [ISO-639]. If the language tag
         * is empty, the language is unspecified.
         */
        /** The language tag. */
        public final String languageTag;

        /** The translated keyword. */
        public final String translatedKeyword;

        /**
         * Constructs an iTXt chunk.
         *
         * @param keyword the keyword.
         * @param text the text.
         * @param languageTag the language tag.
         * @param translatedKeyword the translated keyword.
         */
        public Itxt(final String keyword, final String text, final String languageTag, final String translatedKeyword) {
            super(keyword, text);
            this.languageTag = languageTag;
            this.translatedKeyword = translatedKeyword;
        }
    }

    /**
     * Represents a simple text chunk (tEXt).
     */
    public static class Text extends AbstractPngText {

        /**
         * Constructs a tEXt chunk.
         *
         * @param keyword the keyword.
         * @param text the text.
         */
        public Text(final String keyword, final String text) {
            super(keyword, text);
        }
    }

    /**
     * Represents a compressed text chunk (zTXt).
     */
    public static class Ztxt extends AbstractPngText {

        /**
         * Constructs a zTXt chunk.
         *
         * @param keyword the keyword.
         * @param text the text.
         */
        public Ztxt(final String keyword, final String text) {
            super(keyword, text);
        }
    }

    /** The keyword. */
    public final String keyword;

    /** The text. */
    public final String text;

    /**
     * Constructs a PNG text chunk.
     *
     * @param keyword the keyword.
     * @param text the text.
     */
    public AbstractPngText(final String keyword, final String text) {
        this.keyword = keyword;
        this.text = text;
    }

}
