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
import java.util.ArrayList;
import java.util.Map;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.ByteOrder;
import org.apache.commons.imaging.common.IImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;

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
        return new ImageFormat[] { ImageFormat.IMAGE_FORMAT_RGBE };
    }

    @Override
    public IImageMetadata getMetadata(ByteSource byteSource, Map<String,Object> params)
            throws ImageReadException, IOException {
        RgbeInfo info = new RgbeInfo(byteSource);

        try {
            return info.getMetadata();
        } finally {
            info.close();
        }
    }

    @Override
    public ImageInfo getImageInfo(ByteSource byteSource, Map<String,Object> params)
            throws ImageReadException, IOException {
        RgbeInfo info = new RgbeInfo(byteSource);

        try {
            return new ImageInfo(
                    getName(),
                    32, // todo may be 64 if double?
                    new ArrayList<String>(), ImageFormat.IMAGE_FORMAT_RGBE, getName(),
                    info.getHeight(), "image/vnd.radiance", 1, -1, -1, -1, -1,
                    info.getWidth(), false, false, false,
                    ImageInfo.COLOR_TYPE_RGB, "Adaptive RLE");
        } finally {
            info.close();
        }
    }

    @Override
    public BufferedImage getBufferedImage(ByteSource byteSource, Map<String,Object> params)
            throws ImageReadException, IOException {
        RgbeInfo info = new RgbeInfo(byteSource);

        try {
            // It is necessary to create our own BufferedImage here as the
            // org.apache.sanselan.common.IBufferedImageFactory interface does
            // not expose this complexity
            DataBuffer buffer = new DataBufferFloat(info.getPixelData(),
                    info.getWidth() * info.getHeight());

            return new BufferedImage(new ComponentColorModel(
                    ColorSpace.getInstance(ColorSpace.CS_sRGB), false, false,
                    Transparency.OPAQUE, buffer.getDataType()),
                    Raster.createWritableRaster(
                            new BandedSampleModel(buffer.getDataType(), info
                                    .getWidth(), info.getHeight(), 3), buffer,
                            new Point()), false, null);
        } finally {
            info.close();
        }
    }

    @Override
    public Dimension getImageSize(ByteSource byteSource, Map<String,Object> params)
            throws ImageReadException, IOException {
        RgbeInfo info = new RgbeInfo(byteSource);

        try {
            return new Dimension(info.getWidth(), info.getHeight());
        } finally {
            info.close();
        }
    }

    @Override
    public byte[] getICCProfileBytes(ByteSource byteSource, Map<String,Object> params)
            throws ImageReadException, IOException {
        return null;
    }

    @Override
    public boolean embedICCProfile(File src, File dst, byte[] profile) {
        return false;
    }

    @Override
    public String getXmpXml(ByteSource byteSource, Map<String,Object> params)
            throws ImageReadException, IOException {
        return null;
    }
}
