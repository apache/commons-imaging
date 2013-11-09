package org.apache.commons.imaging.formats.tiff;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;

public class TiffSubImageTest extends TiffBaseTest {
    public void testSubImage() throws ImageReadException, ImageWriteException, IOException {
        BufferedImage src = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        byte[] imageBytes = Imaging.writeImageToBytes(src, ImageFormats.TIFF, null);
        
        Map<String,Object> params = new TreeMap<String,Object>();
        params.put(TiffConstants.PARAM_KEY_SUBIMAGE_X, 0);
        params.put(TiffConstants.PARAM_KEY_SUBIMAGE_Y, 0);
        params.put(TiffConstants.PARAM_KEY_SUBIMAGE_WIDTH, 2);
        params.put(TiffConstants.PARAM_KEY_SUBIMAGE_HEIGHT, 3);
        BufferedImage image = Imaging.getBufferedImage(imageBytes, params);
        assertEquals(image.getWidth(), 2);
        assertEquals(image.getHeight(), 3);
    }
}