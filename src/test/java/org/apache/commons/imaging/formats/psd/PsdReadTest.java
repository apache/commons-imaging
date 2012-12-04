package org.apache.commons.imaging.formats.psd;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.common.IImageMetadata;
import org.apache.commons.imaging.util.Debug;

public class PsdReadTest extends PsdBaseTest {
    public void test() throws Exception {
        Debug.debug("start");

        List<File> images = getPsdImages();
        for (int i = 0; i < images.size(); i++) {
            if (i % 10 == 0) {
                Debug.purgeMemory();
            }

            File imageFile = images.get(i);
            Debug.debug("imageFile", imageFile);

            IImageMetadata metadata = Imaging.getMetadata(imageFile);
            // assertNotNull(metadata);

            Map<String,Object> params = new HashMap<String,Object>();
            ImageInfo imageInfo = Imaging.getImageInfo(imageFile, params);
            assertNotNull(imageInfo);
            
            Imaging.getICCProfile(imageFile, params);

            BufferedImage image = Imaging.getBufferedImage(imageFile);
            assertNotNull(image);
        }
    }

}
