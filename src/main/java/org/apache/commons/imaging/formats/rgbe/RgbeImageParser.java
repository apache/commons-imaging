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
import java.io.File;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Map;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.IImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.util.IoUtils;

/**
 * Parser for Radiance HDR images
 * 
 * @author <a href="mailto:peter@electrotank.com">peter royal</a>
 */
public class RgbeImageParser extends ImageParser {

    public RgbeImageParser() {
        setByteOrder(ByteOrder.BIG_ENDIAN);
    }

    @Override
    public String getName() {
        return "Radiance HDR";
    }

    @Override
    public String getDefaultExtension() {
        return ".hdr";
    }

    @Override
    protected String[] getAcceptedExtensions() {
        return new String[] { ".hdr", ".pic" };
    }

    @Override
    protected ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[] { ImageFormats.RGBE };
    }

    @Override
    public IImageMetadata getMetadata(final ByteSource byteSource, final Map<String,Object> params)
            throws ImageReadException, IOException {
        final RgbeInfo info = new RgbeInfo(byteSource);
        boolean canThrow = false;
        try {
            final IImageMetadata ret = info.getMetadata();
            canThrow = true;
            return ret;
        } finally {
            IoUtils.closeQuietly(canThrow, info);
        }
    }

    @Override
    public ImageInfo getImageInfo(final ByteSource byteSource, final Map<String,Object> params)
            throws ImageReadException, IOException {
        final RgbeInfo info = new RgbeInfo(byteSource);
        boolean canThrow = false;
        try {
            final ImageInfo ret = new ImageInfo(
                    getName(),
                    32, // todo may be 64 if double?
                    new ArrayList<String>(), ImageFormats.RGBE, getName(),
                    info.getHeight(), "image/vnd.radiance", 1, -1, -1, -1, -1,
                    info.getWidth(), false, false, false,
                    ImageInfo.COLOR_TYPE_RGB, "Adaptive RLE");
            canThrow = true;
            return ret;
        } finally {
            IoUtils.closeQuietly(canThrow, info);
        }
    }

    @Override
    public BufferedImage getBufferedImage(final ByteSource byteSource, final Map<String,Object> params)
            throws ImageReadException, IOException {
        final RgbeInfo info = new RgbeInfo(byteSource);
        boolean canThrow = false;
        try {
            // It is necessary to create our own BufferedImage here as the
            // org.apache.commons.imaging.common.IBufferedImageFactory interface does
            // not expose this complexity
            final DataBuffer buffer = new DataBufferFloat(info.getPixelData(),
                    info.getWidth() * info.getHeight());

            final BufferedImage ret = new BufferedImage(new ComponentColorModel(
                    ColorSpace.getInstance(ColorSpace.CS_sRGB), false, false,
                    Transparency.OPAQUE, buffer.getDataType()),
                    Raster.createWritableRaster(
                            new BandedSampleModel(buffer.getDataType(), info
                                    .getWidth(), info.getHeight(), 3), buffer,
                            new Point()), false, null);
            canThrow = true;
            return ret;
        } finally {
            IoUtils.closeQuietly(canThrow, info);
        }
    }

    @Override
    public Dimension getImageSize(final ByteSource byteSource, final Map<String,Object> params)
            throws ImageReadException, IOException {
        final RgbeInfo info = new RgbeInfo(byteSource);
        boolean canThrow = false;
        try {
            final Dimension ret = new Dimension(info.getWidth(), info.getHeight());
            canThrow = true;
            return ret;
        } finally {
            IoUtils.closeQuietly(canThrow, info);
        }
    }

    @Override
    public byte[] getICCProfileBytes(final ByteSource byteSource, final Map<String,Object> params)
            throws ImageReadException, IOException {
        return null;
    }

    @Override
    public boolean embedICCProfile(final File src, final File dst, final byte[] profile) {
        return false;
    }

    @Override
    public String getXmpXml(final ByteSource byteSource, final Map<String,Object> params)
            throws ImageReadException, IOException {
        return null;
    }
}
