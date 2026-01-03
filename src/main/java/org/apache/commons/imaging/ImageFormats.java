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

    /** Unknown image format. */
    UNKNOWN("bin"),
    /** BMP (Windows Bitmap) image format. */
    BMP("bmp", "dib"),
    /** DCX (ZSoft Multi-page Paintbrush) image format. */
    DCX("dcx"),
    /** GIF (Graphics Interchange Format) image format. */
    GIF("gif"),
    /** ICNS (Apple Icon Image) format. */
    ICNS("icns"),
    /** ICO (Windows Icon) image format. */
    ICO("ico"),
    /** JBIG2 image format. */
    JBIG2("jbig2"),
    /** JPEG (Joint Photographic Experts Group) image format. */
    JPEG("jpg", "jpeg"),
    /** PAM (Portable Arbitrary Map) image format. */
    PAM("pam"),
    /** PSD (Adobe Photoshop Document) image format. */
    PSD("psd"),
    /** PBM (Portable Bitmap) image format. */
    PBM("pbm"),
    /** PGM (Portable Graymap) image format. */
    PGM("pgm"),
    /** PNM (Portable Any Map) image format. */
    PNM("pnm"),
    /** PPM (Portable Pixmap) image format. */
    PPM("ppm"),
    /** PCX (PC Paintbrush) image format. */
    PCX("pcx", "pcc"),
    /** PNG (Portable Network Graphics) image format. */
    PNG("png"),
    /** RGBE (Radiance HDR) image format. */
    RGBE("hdr", "pic"),
    /** TGA (Truevision TGA/TARGA) image format. */
    TGA("tga"),
    /** TIFF (Tagged Image File Format). */
    TIFF("tif", "tiff"),
    /** WBMP (Wireless Bitmap) image format. */
    WBMP("wbmp"),
    /** WebP image format. */
    WEBP("webp"),
    /** XBM (X11 Bitmap) image format. */
    XBM("xbm"),
    /** XPM (X11 Pixmap) image format. */
    XPM("xpm");

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
