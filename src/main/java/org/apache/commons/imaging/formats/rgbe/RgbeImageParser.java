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
package org.apache.commons.imaging.formats.rgbe;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Transparency;
import java.awt.color.ColorSpace;
import java.awt.image.BandedSampleModel;
import java.awt.image.BufferedImage;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferFloat;
import java.awt.image.Raster;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.common.ImageMetadata;

/**
 * Parser for Radiance HDR images
 */
public class RgbeImageParser extends ImageParser<RgbeImagingParameters> {

    @Override
    protected String[] getAcceptedExtensions() {
        return ImageFormats.RGBE.getExtensions();
    }

    @Override
    protected ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[] { ImageFormats.RGBE };
    }

    @Override
    public BufferedImage getBufferedImage(final ByteSource byteSource, final RgbeImagingParameters params)
            throws ImagingException, IOException {
        try (RgbeInfo info = new RgbeInfo(byteSource)) {
            // It is necessary to create our own BufferedImage here as the
            // org.apache.commons.imaging.common.IBufferedImageFactory interface does
            // not expose this complexity
            final DataBuffer buffer = new DataBufferFloat(info.getPixelData(),
                    info.getWidth() * info.getHeight());

            return new BufferedImage(new ComponentColorModel(
                    ColorSpace.getInstance(ColorSpace.CS_sRGB), false, false,
                    Transparency.OPAQUE, buffer.getDataType()),
                    Raster.createWritableRaster(
                            new BandedSampleModel(buffer.getDataType(),
                                    info.getWidth(), info.getHeight(), 3),
                            buffer,
                            new Point()), false, null);
        }
    }

    @Override
    public String getDefaultExtension() {
        return ImageFormats.RGBE.getDefaultExtension();
    }

    @Override
    public RgbeImagingParameters getDefaultParameters() {
        return new RgbeImagingParameters();
    }

    @Override
    public byte[] getICCProfileBytes(final ByteSource byteSource, final RgbeImagingParameters params)
            throws ImagingException, IOException {
        return null;
    }

    @Override
    public ImageInfo getImageInfo(final ByteSource byteSource, final RgbeImagingParameters params)
            throws ImagingException, IOException {
        try (RgbeInfo info = new RgbeInfo(byteSource)) {
            return new ImageInfo(
                    getName(),
                    32, // todo may be 64 if double?
                    new ArrayList<>(), ImageFormats.RGBE, getName(),
                    info.getHeight(), "image/vnd.radiance", 1, -1, -1, -1, -1,
                    info.getWidth(), false, false, false,
                    ImageInfo.ColorType.RGB, ImageInfo.CompressionAlgorithm.ADAPTIVE_RLE);
        }
    }

    @Override
    public Dimension getImageSize(final ByteSource byteSource, final RgbeImagingParameters params)
            throws ImagingException, IOException {
        try (RgbeInfo info = new RgbeInfo(byteSource)) {
            return new Dimension(info.getWidth(), info.getHeight());
        }
    }

    @Override
    public ImageMetadata getMetadata(final ByteSource byteSource, final RgbeImagingParameters params)
            throws ImagingException, IOException {
        try (RgbeInfo info = new RgbeInfo(byteSource)) {
            return info.getMetadata();
        }
    }

    @Override
    public String getName() {
        return "Radiance HDR";
    }
}
