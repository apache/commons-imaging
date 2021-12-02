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
package org.apache.commons.imaging.internal;

import java.util.function.Predicate;
import java.util.function.Supplier;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImagingParameters;

/**
 * Internal utilities.
 *
 * @since 1.0-alpha3
 */
public class Util {

    private Util() {}

    public static <T extends ImagingParameters> ImageParser<T> getImageParser(ImageFormat format) {
        return getImageParser((parser) -> parser.canAcceptType(format), () -> new RuntimeException("Unknown Format: " + format));
    }

    public static <T extends ImagingParameters> ImageParser<T> getImageParser(String fileExtension) {
        return getImageParser((parser) -> parser.canAcceptExtension(fileExtension), () -> new RuntimeException("Unknown Extension: " + fileExtension));
    }

    // This generics suppression is as good as the predicate given. If the predicate violates a generics design,
    // then there will be an error during runtime.
    @SuppressWarnings("unchecked")
    private static <T extends ImagingParameters> ImageParser<T> getImageParser(Predicate<ImageParser<?>> pred, Supplier<? extends RuntimeException> supl) {
        return (ImageParser<T>) ImageParser
                .getAllImageParsers()
                .stream()
                .filter((parser) -> pred.test(parser))
                .findFirst()
                .orElseThrow(supl);
    }
}
