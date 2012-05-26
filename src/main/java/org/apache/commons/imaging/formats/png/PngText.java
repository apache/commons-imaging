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

public abstract class PngText {
    public PngText(String keyword, String text) {
        this.keyword = keyword;
        this.text = text;
    }

    public final String keyword, text;

    public static class tEXt extends PngText {
        public tEXt(String keyword, String text) {
            super(keyword, text);
        }
    }

    public static class zTXt extends PngText {
        public zTXt(String keyword, String text) {
            super(keyword, text);
        }
    }

    public static class iTXt extends PngText {

        /*
         * The language tag defined in [RFC-3066] indicates the human language
         * used by the translated keyword and the text. Unlike the keyword, the
         * language tag is case-insensitive. It is an ISO 646.IRV:1991 [ISO 646]
         * string consisting of hyphen-separated words of 1-8 alphanumeric
         * characters each (for example cn, en-uk, no-bok, x-klingon,
         * x-KlInGoN). If the first word is two or three letters long, it is an
         * ISO language code [ISO-639]. If the language tag is empty, the
         * language is unspecified.
         */
        public final String languageTag;

        public final String translatedKeyword;

        public iTXt(String keyword, String text, String languageTag,
                String translatedKeyword) {
            super(keyword, text);
            this.languageTag = languageTag;
            this.translatedKeyword = translatedKeyword;
        }
    }

}
