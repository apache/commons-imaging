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
package org.apache.commons.imaging.common;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.WritableRaster;
import java.util.Properties;

public class ImageBuilder {
    private int[] data;
    private int width;
    private int height;
    private boolean hasAlpha;

    public ImageBuilder(int width, int height, boolean hasAlpha) {
        data = new int[width * height];
        this.width = width;
        this.height = height;
        this.hasAlpha = hasAlpha;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getRGB(int x, int y) {
        final int rowOffset = y * width;
        return data[rowOffset + x];
    }

    public void setRGB(int x, int y, int argb) {
        final int rowOffset = y * width;
        data[rowOffset + x] = argb;
    }

    public BufferedImage getBufferedImage() {
        ColorModel colorModel;
        WritableRaster raster;
        DataBufferInt buffer = new DataBufferInt(data, width * height);
        if (hasAlpha) {
            colorModel = new DirectColorModel(32, 0x00ff0000, 0x0000ff00,
                    0x000000ff, 0xff000000);
            raster = WritableRaster.createPackedRaster(buffer, width, height,
                    width, new int[] { 0x00ff0000, 0x0000ff00, 0x000000ff,
                            0xff000000 }, null);
        } else {
            colorModel = new DirectColorModel(24, 0x00ff0000, 0x0000ff00,
                    0x000000ff);
            raster = WritableRaster.createPackedRaster(buffer, width, height,
                    width, new int[] { 0x00ff0000, 0x0000ff00, 0x000000ff },
                    null);
        }
        return new BufferedImage(colorModel, raster,
                colorModel.isAlphaPremultiplied(), new Properties());
    }
}
