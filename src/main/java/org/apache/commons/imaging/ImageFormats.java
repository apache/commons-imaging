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

import org.apache.commons.imaging.formats.bmp.BmpImagingParameters;
import org.apache.commons.imaging.formats.gif.GifImagingParameters;
import org.apache.commons.imaging.formats.icns.IcnsImagingParameters;
import org.apache.commons.imaging.formats.ico.IcoImagingParameters;
import org.apache.commons.imaging.formats.jpeg.JpegImagingParameters;
import org.apache.commons.imaging.formats.pcx.PcxImagingParameters;
import org.apache.commons.imaging.formats.png.PngImagingParameters;
import org.apache.commons.imaging.formats.pnm.PnmImagingParameters;
import org.apache.commons.imaging.formats.psd.PsdImagingParameters;
import org.apache.commons.imaging.formats.rgbe.RgbeImagingParameters;
import org.apache.commons.imaging.formats.tiff.TiffImagingParameters;
import org.apache.commons.imaging.formats.wbmp.WbmpImagingParameters;
import org.apache.commons.imaging.formats.xbm.XbmImagingParameters;
import org.apache.commons.imaging.formats.xpm.XpmImagingParameters;

import java.util.function.Supplier;

/**
 * Enum of known image formats.
 */
public enum ImageFormats implements ImageFormat {
    UNKNOWN(null),
    BMP(BmpImagingParameters::new, "bmp", "dib"),
    DCX(PcxImagingParameters::new, "dcx"),
    GIF(GifImagingParameters::new, "gif"),
    ICNS(IcnsImagingParameters::new, "icns"),
    ICO(IcoImagingParameters::new, "ico"),
    JBIG2(null),
    JPEG(JpegImagingParameters::new, "jpg", "jpeg"),
    PAM(PnmImagingParameters::new, "pam"),
    PSD(PsdImagingParameters::new, "psd"),
    PBM(PnmImagingParameters::new, "pbm"),
    PGM(PnmImagingParameters::new, "pgm"),
    PNM(PnmImagingParameters::new, "pnm"),
    PPM(PnmImagingParameters::new, "ppm"),
    PCX(PcxImagingParameters::new, "pcx", "pcc"),
    PNG(PngImagingParameters::new, "png"),
    RGBE(RgbeImagingParameters::new, "rgbe"),
    TGA(null),
    TIFF(TiffImagingParameters::new, "tif", "tiff"),
    WBMP(WbmpImagingParameters::new, "wbmp"),
    XBM(XbmImagingParameters::new, "xbm"),
    XPM(XpmImagingParameters::new, "xpm");

    private final Supplier<? extends ImagingParameters> factory;

    private final String[] extensions;

    ImageFormats(Supplier<? extends ImagingParameters> factory, String ...extensions) {
        this.factory = factory;
        this.extensions = extensions;
    }

    @Override
    public String getName() {
        return name();
    }

    @Override
    public String[] getExtensions() {
        return this.extensions.clone();
    }

    @Override
    public String getDefaultExtension() {
        return this.extensions[0];
    }

    @Override
    public ImagingParameters createImagingParameters() {
        return this.factory == null ? null : factory.get();
    }
}
