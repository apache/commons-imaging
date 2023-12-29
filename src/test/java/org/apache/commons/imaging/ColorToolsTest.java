package org.apache.commons.imaging;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.image.*;

import static java.awt.color.ColorSpace.*;

public class ColorToolsTest {

    @Test
    public void testConvertBetweenColorSpaces() {
        final ColorTools colorTools = new ColorTools();

        final ColorSpace sRGBColorSpace = ColorSpace.getInstance(ColorSpace.CS_sRGB);
        final BufferedImage inputImage = createTestImage(sRGBColorSpace);

        final ColorSpace grayColorSpace = ColorSpace.getInstance(CS_GRAY);
        final BufferedImage resultImage = colorTools.convertBetweenColorSpaces(inputImage, sRGBColorSpace, grayColorSpace);

        Assertions.assertEquals(inputImage.getColorModel().getColorSpace().getType(), TYPE_RGB);
        Assertions.assertEquals(resultImage.getColorModel().getColorSpace().getType(), TYPE_GRAY);
    }

    @Test
    public void testConvertToColorSpace() {
        final ColorTools colorTools = new ColorTools();

        final ColorSpace sRGBColorSpace = ColorSpace.getInstance(ColorSpace.CS_sRGB);
        final BufferedImage inputImage = createTestImage(sRGBColorSpace);

        final ColorSpace grayColorSpace = ColorSpace.getInstance(CS_GRAY);
        final BufferedImage resultImage = colorTools.convertToColorSpace(inputImage, grayColorSpace);

        Assertions.assertEquals(inputImage.getColorModel().getColorSpace().getType(), TYPE_RGB);
        Assertions.assertEquals(resultImage.getColorModel().getColorSpace().getType(), TYPE_GRAY);
    }

    @Test
    public void testConvertFromColorSpace() {
        final ColorTools colorTools = new ColorTools();
        final ColorSpace grayColorSpace = ColorSpace.getInstance(CS_GRAY);

        final BufferedImage inputImage = createTestImage(grayColorSpace);
        final BufferedImage resultImage = colorTools.convertFromColorSpace(inputImage, grayColorSpace);

        Assertions.assertEquals(inputImage.getColorModel().getColorSpace().getType(), TYPE_GRAY);
        Assertions.assertEquals(resultImage.getColorModel().getColorSpace().getType(), TYPE_RGB);
    }



    private static BufferedImage createTestImage(ColorSpace colorSpace) {
        final int width = 10;
        final int height = 10;
        // Create a ColorModel using the specified color space
        ColorModel colorModel = new ComponentColorModel(colorSpace, false, false, Transparency.OPAQUE, DataBuffer.TYPE_BYTE);

        // Set the ColorModel for the BufferedImage
        WritableRaster raster = colorModel.createCompatibleWritableRaster(width, height);
        BufferedImage image = new BufferedImage(colorModel, raster, colorModel.isAlphaPremultiplied(), null);

        // Get the Graphics2D object to draw on the image
        Graphics2D g2d = image.createGraphics();

        // Set background color
        g2d.setColor(Color.RED);
        g2d.fillRect(0, 0, width, height);

        // Draw a rectangle with a different color
        g2d.setColor(Color.GREEN);
        g2d.drawRect(0, 0, 5, 5);

        // Draw an ellipse with another color
        g2d.setColor(Color.BLUE);
        g2d.fillOval(7, 7, 3, 3);

        // Dispose of the Graphics2D object
        g2d.dispose();

        return image;
    }
}
