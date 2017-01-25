package org.apache.commons.imaging.formats.icns;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.*;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.Imaging;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mw on 15.09.16.
 */
public class IcnsGetAllBufferedImagesTest {

    private static final String ICNS_FILES = "src/test/data/images/icns/2/";
    private static final String DIR_ICONS_CACHE = "src/test/data/images/icns/extractedICNS/";

    @Test
    public void testGetAllBufferedImagesWithType_aFewIcnsFiles_containsJpegFormat() {

        if (!new File(DIR_ICONS_CACHE).exists()) {
            new File(DIR_ICONS_CACHE).mkdir();
        }

        final Set<String> imageTypeProofList = new HashSet<>();
        //As of Wikipedia: JPEG 2000 or PNG format
        final List<String> jpegImageTypes = new ArrayList<>(Arrays.asList("icp4", "icp5", "icp6", "ic07", "ic08", "ic09", "ic10", "ic11", "ic12", "ic13", "ic14"));
        final ImageFormat format = ImageFormats.PNG;
        final Map<String, Object> params = new HashMap<>();

        final File icnsTestFiles = new File(ICNS_FILES);
        final File[] files = icnsTestFiles.listFiles();
        final IcnsImageParser icnsImageParser = new IcnsImageParser();
        for (final File icnsFile : files) {
            try {
                final List<Map<BufferedImage, IcnsType>> bufferedImages = icnsImageParser.getAllBufferedImagesWithType(icnsFile);

                int counterExtracted = 0;
                for (final Map<BufferedImage, IcnsType> map : bufferedImages) {
                    final Iterator<BufferedImage> iterator = map.keySet().iterator();
                    while (iterator.hasNext()) {
                        final BufferedImage image = iterator.next();
                        final String name = icnsFile.getName();
                        final String type = map.get(image).getTypeName();
                        final int width = image.getWidth();
                        final int height = image.getHeight();
                        final int pixelSize = image.getColorModel().getPixelSize();

                        //Add imageType to proof list if image type could be of JPEG2000 format
                        for (final String jpegImageType : jpegImageTypes) {
                            if (jpegImageType.equals(type)) {
                                imageTypeProofList.add(type);
                            }
                        }

                        System.out.println(name + " -> [" + type + "] " + pixelSize + " bit | " + width + "x" + height);
                        final File cachedImageFile = new File(DIR_ICONS_CACHE + name + "_[" + type + "]_" + width + "x" + height + "_" + pixelSize + "bit_" + counterExtracted + "." + format.getExtension());
                        Imaging.writeImage(image, cachedImageFile, format, params);
                        counterExtracted++;
                    }
                }

                //Check if JPEG is supported
                Assert.assertEquals(true, imageTypeProofList.size() > 0);
                System.out.println("--------------- " + imageTypeProofList.size() + " potential JPEGs and " + counterExtracted + " images extracted ---------------");

            } catch (final Exception e) {
                continue;
            }
        }
    }
}
