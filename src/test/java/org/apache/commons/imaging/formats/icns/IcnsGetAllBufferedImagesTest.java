package org.apache.commons.imaging.formats.icns;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.Imaging;
import org.junit.Test;

/**
 * Created by mw on 15.09.16.
 */
public class IcnsGetAllBufferedImagesTest {

    private static final String ICNS_FILES = "src/test/data/images/icns/2/";
    private static final String DIR_ICONS_CACHE = "src/test/data/images/icns/extractedICNS/";

    @Test
    public void testGetAllBufferedImages() {

        if (!new File(DIR_ICONS_CACHE).exists()) {
            new File(DIR_ICONS_CACHE).mkdir();
        }

        final ImageFormat format = ImageFormats.PNG;
        final Map<String, Object> params = new HashMap<>();

        final File icnsTestFiles = new File(ICNS_FILES);
        final File[] files = icnsTestFiles.listFiles();
        final IcnsImageParser icnsImageParser = new IcnsImageParser();
        for (final File icns : files) {
            try {
                final List<Map<BufferedImage, IcnsType>> bufferedImages = icnsImageParser.getAllBufferedImagesWithType(icns);

                int counter = 0;
                for (final Map<BufferedImage, IcnsType> map : bufferedImages) {
                    final Iterator<BufferedImage> iterator = map.keySet().iterator();
                    while (iterator.hasNext()) {
                        final BufferedImage image = iterator.next();
                        final String name = icns.getName();
                        final String type = map.get(image).getTypeName();
                        final int width = image.getWidth();
                        final int height = image.getHeight();
                        final int pixelSize = image.getColorModel().getPixelSize();
                        System.out.println(name + " -> [" + type + "]" + pixelSize + " | " + width + "x" + height);
                        final File cachedImageFile = new File(DIR_ICONS_CACHE + name + "_[" + type + "]_" + width + "x" + height + "_" + pixelSize + "bit_" + counter + "." + format.getExtension());
                        Imaging.writeImage(image, cachedImageFile, format, params);
                        counter++;
                    }
                }
                System.out.println("------------------- " + counter + " icons -------------------");
            } catch (final Exception e) {
                continue;
            }
        }

    }
}
