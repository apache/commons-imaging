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

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

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

/**
 * Enum of known image formats.
 */
public enum ImageFormats implements ImageFormat {
    UNKNOWN(ImagingParameters.class),
    BMP(BmpImagingParameters.class, "bmp", "dib"),
    DCX(PcxImagingParameters.class, "dcx"),
    GIF(GifImagingParameters.class, "gif"),
    ICNS(IcnsImagingParameters.class, ""),
    ICO(IcoImagingParameters.class, "ico"),
    JBIG2(ImagingParameters.class),
    JPEG(JpegImagingParameters.class, "jpg", "jpeg", "jpe", "jif", "jfif", "jfi"),
    PAM(PnmImagingParameters.class, "pam"),
    PSD(PsdImagingParameters.class, "psd"),
    PBM(PnmImagingParameters.class, "pbm"),
    PGM(PnmImagingParameters.class, "pgm"),
    PNM(PnmImagingParameters.class, "pnm"),
    PPM(PnmImagingParameters.class, "ppm"),
    PCX(PcxImagingParameters.class, "pcx"),
    PNG(PngImagingParameters.class, "png"),
    RGBE(RgbeImagingParameters.class, "rgbe"),
    TGA(ImagingParameters.class),
    TIFF(TiffImagingParameters.class, "tiff", "tif"), // TODO: Or is it .tif the default one?
    WBMP(WbmpImagingParameters.class, "wbmp"),
    XBM(XbmImagingParameters.class, "xbm"),
    XPM(XpmImagingParameters.class, "xpm");

    private static final Logger LOGGER = Logger.getLogger(ImageFormats.class.getName());

    private String[] extensions;
    private Class<? extends ImagingParameters> parametersClass;

    ImageFormats(Class<? extends ImagingParameters> parametersClass, String ...extensions) {
        this.extensions = extensions;
        this.parametersClass = parametersClass;
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
        if (this.parametersClass != null) {
            Constructor<?> ctor;
            try {
                ctor = this.parametersClass.getConstructor();
                return (ImagingParameters) ctor.newInstance();
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                LOGGER.log(Level.WARNING, "Failed to create imaging parameters: " + e.getMessage(), e);
                return new ImagingParameters();
            }
        }
        return null;
    }
}
