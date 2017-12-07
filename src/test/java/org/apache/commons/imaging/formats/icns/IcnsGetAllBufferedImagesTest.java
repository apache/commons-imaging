package org.apache.commons.imaging.formats.icns;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.Imaging;
import org.junit.Test;

/**
 * Created by Marco Wagner (dasburo.com) on 15.09.16.
 */
public class IcnsGetAllBufferedImagesTest {

    private static final String ICNS_FILES = "src/test/data/images/icns/2/";
    private static final String DIR_ICONS_EXTRACTED = "src/test/data/images/icns/extractedICNS/";

    @Test
    public void testGetAllBufferedImages() {

        if (!new File(DIR_ICONS_EXTRACTED).exists()) {
            new File(DIR_ICONS_EXTRACTED).mkdir();
        }

        final ImageFormat pngFormat = ImageFormats.PNG;
        final Map<String, Object> params = new HashMap<>();

        final File icnsTestFolder = new File(ICNS_FILES);
        final File[] icnsFiles = icnsTestFolder.listFiles();
        final IcnsImageParser icnsImageParser = new IcnsImageParser();
        for (final File icnsFile : icnsFiles) {
            try {
                final Map<IcnsType, BufferedImage> bufferedImagesByIcnsType = icnsImageParser.getAllBufferedImagesWithType(icnsFile);

                int counter = 0;

                final Set<IcnsType> icnsTypes = bufferedImagesByIcnsType.keySet();

                for (IcnsType icnsType : icnsTypes) {
                    final BufferedImage image = bufferedImagesByIcnsType.get(icnsType);

                    final String name = icnsFile.getName();
                    final int width = image.getWidth();
                    final int height = image.getHeight();
                    final int pixelSize = image.getColorModel().getPixelSize();
                    System.out.println(name + " -> [" + icnsType + "]" + pixelSize + " | " + width + "x" + height);
                    final File cachedImageFile = new File(DIR_ICONS_EXTRACTED + name + "_[" + icnsType + "]_" + width + "x" + height + "_" + pixelSize + "bit_" + counter + "." + pngFormat.getExtension());
                    Imaging.writeImage(image, cachedImageFile, pngFormat, params);
                    counter++;
                }
                System.out.println("------------------- " + counter + " icons -------------------");
            } catch (final Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
