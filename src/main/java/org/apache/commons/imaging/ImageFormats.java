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
package org.apache.commons.imaging;

import java.util.Objects;

/**
 * Enumerates known image formats.
 */
public enum ImageFormats implements ImageFormat {

    // @formatter:off
    UNKNOWN("bin"),
    BMP("bmp", "dib"),
    DCX("dcx"),
    GIF("gif"),
    ICNS("icns"),
    ICO("ico"),
    JBIG2("jbig2"),
    JPEG("jpg", "jpeg"),
    PAM("pam"),
    PSD("psd"),
    PBM("pbm"),
    PGM("pgm"),
    PNM("pnm"),
    PPM("ppm"),
    PCX("pcx", "pcc"),
    PNG("png"),
    RGBE("hdr", "pic"),
    TGA("tga"),
    TIFF("tif", "tiff"),
    WBMP("wbmp"),
    WEBP("webp"),
    XBM("xbm"),
    XPM("xpm");
    // @formatter:on

    private final String[] extensions;

    ImageFormats(final String... extensions) {
        this.extensions = Objects.requireNonNull(extensions);
    }

    @Override
    public String getDefaultExtension() {
        return extensions[0];
    }

    @Override
    public String[] getExtensions() {
        return this.extensions.clone();
    }

    @Override
    public String getName() {
        return name();
    }
}
