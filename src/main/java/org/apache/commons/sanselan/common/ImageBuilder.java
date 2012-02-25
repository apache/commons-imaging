package org.apache.commons.sanselan.common;

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
    
    public void setRGB(int x, int y, int argb) {
        final int rowOffset = y * width;
        data[rowOffset + x] = argb;
    }
    
    public BufferedImage getBufferedImage() {
        ColorModel colorModel;
        WritableRaster raster;
        DataBufferInt buffer = new DataBufferInt(data, width * height);
        if (hasAlpha) {
            colorModel = new DirectColorModel(32,
                    0x00ff0000,
                    0x0000ff00,
                    0x000000ff,
                    0xff000000);
            raster = WritableRaster.createPackedRaster(buffer, width, height, width,
                    new int[] { 0x00ff0000, 0x0000ff00, 0x000000ff, 0xff000000 }, null);
        } else {
            colorModel = new DirectColorModel(24,
                    0x00ff0000,
                    0x0000ff00,
                    0x000000ff);
            raster = WritableRaster.createPackedRaster(buffer, width, height, width,
                    new int[] { 0x00ff0000, 0x0000ff00, 0x000000ff }, null);
        }
        return new BufferedImage(colorModel, raster, colorModel.isAlphaPremultiplied(), new Properties());
    }
}
