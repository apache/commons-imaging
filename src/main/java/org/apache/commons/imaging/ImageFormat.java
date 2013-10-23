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
package org.apache.commons.imaging;

/**
 * Enum of known image formats.
 */
//@formatter:off
public enum ImageFormat {
    UNKNOWN(false),
    BMP,
    DCX,
    GIF,
    ICNS,
    ICO,
    JBIG2,
    JPEG,
    PAM,
    PSD,
    PBM,
    PGM,
    PNM,
    PPM,
    PCX,
    PNG,
    RGBE,
    TGA,
    TIFF,
    WBMP,
    XBM,
    XPM;
//@formatter:on

    @Deprecated
    public final boolean actual;

    private ImageFormat(final boolean actual) {
        this.actual = actual;
    }

    private ImageFormat() {
        this(true);
    }

    public String getName() {
        return name();
    }

    public String getExtension() {
        return name();
    }

    @Deprecated
    public static final ImageFormat IMAGE_FORMAT_UNKNOWN = UNKNOWN;
    @Deprecated
    public static final ImageFormat IMAGE_FORMAT_BMP = BMP;
    @Deprecated
    public static final ImageFormat IMAGE_FORMAT_DCX = DCX;
    @Deprecated
    public static final ImageFormat IMAGE_FORMAT_GIF = GIF;
    @Deprecated
    public static final ImageFormat IMAGE_FORMAT_ICNS = ICNS;
    @Deprecated
    public static final ImageFormat IMAGE_FORMAT_ICO = ICO;
    @Deprecated
    public static final ImageFormat IMAGE_FORMAT_JBIG2 = JBIG2;
    @Deprecated
    public static final ImageFormat IMAGE_FORMAT_JPEG = JPEG;
    @Deprecated
    public static final ImageFormat IMAGE_FORMAT_PAM = PAM;
    @Deprecated
    public static final ImageFormat IMAGE_FORMAT_PSD = PSD;
    @Deprecated
    public static final ImageFormat IMAGE_FORMAT_PBM = PBM;
    @Deprecated
    public static final ImageFormat IMAGE_FORMAT_PGM = PGM;
    @Deprecated
    public static final ImageFormat IMAGE_FORMAT_PNM = PNM;
    @Deprecated
    public static final ImageFormat IMAGE_FORMAT_PPM = PPM;
    @Deprecated
    public static final ImageFormat IMAGE_FORMAT_PCX = PCX;
    @Deprecated
    public static final ImageFormat IMAGE_FORMAT_PNG = PNG;
    @Deprecated
    public static final ImageFormat IMAGE_FORMAT_RGBE = RGBE;
    @Deprecated
    public static final ImageFormat IMAGE_FORMAT_TGA = TGA;
    @Deprecated
    public static final ImageFormat IMAGE_FORMAT_TIFF = TIFF;
    @Deprecated
    public static final ImageFormat IMAGE_FORMAT_WBMP = WBMP;
    @Deprecated
    public static final ImageFormat IMAGE_FORMAT_XBM = XBM;
    @Deprecated
    public static final ImageFormat IMAGE_FORMAT_XPM = XPM;

}
