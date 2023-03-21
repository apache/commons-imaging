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

import java.io.IOException;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingParameters;
import org.apache.commons.imaging.common.bytesource.ByteSource;

/**
 * Internal utilities.
 *
 * @since 1.0-alpha3
 */
public class Util {

    private Util() {}

    public static <T extends ImagingParameters<T>> ImageParser<T> getImageParser(final ImageFormat format) {
        return getImageParser(parser -> parser.canAcceptType(format), () -> new IllegalArgumentException("Unknown Format: " + format));
    }

    public static <T extends ImagingParameters<T>> ImageParser<T> getImageParser(final String fileExtension) {
        return getImageParser(parser -> parser.canAcceptExtension(fileExtension), () -> new IllegalArgumentException("Unknown Extension: " + fileExtension));
    }

    // This generics suppression is as good as the predicate given. If the predicate violates a generics design,
    // then there will be an error during runtime.
    @SuppressWarnings("unchecked")
    private static <T extends ImagingParameters<T>> ImageParser<T> getImageParser(final Predicate<ImageParser<?>> pred, final Supplier<? extends RuntimeException> supplier) {
        return (ImageParser<T>) ImageParser
                .getAllImageParsers()
                .stream()
                .filter(pred)
                .findFirst()
                .orElseThrow(supplier);
    }

    public static <T extends ImagingParameters<T>> ImageParser<T> getImageParser(final ByteSource byteSource) throws IOException {
        // TODO: circular dependency between Imaging and internal Util class below.
        final ImageFormat format = Imaging.guessFormat(byteSource);
        if (!format.equals(ImageFormats.UNKNOWN)) {
            return Util.getImageParser(format);
        }

        final String fileName = byteSource.getFileName();
        if (fileName != null) {
            return Util.getImageParser(fileName);
        }

        throw new IllegalArgumentException("Can't parse this format.");
    }
}
