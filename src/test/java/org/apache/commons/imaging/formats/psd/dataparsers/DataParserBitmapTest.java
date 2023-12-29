package org.apache.commons.imaging.formats.psd.dataparsers;

import org.apache.commons.imaging.formats.psd.PsdHeaderInfo;
import org.apache.commons.imaging.formats.psd.PsdImageContents;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataParserBitmapTest {

    @Test
    public void testGetBasicChannelsCount() {
        DataParserBitmap dataParserBitmap = new DataParserBitmap();
        Assertions.assertEquals(1, dataParserBitmap.getBasicChannelsCount());
    }

    @Test
    public void testGetRgbWhenSampleIsZero() {
        DataParserBitmap dataParserBitmap = new DataParserBitmap();

        int[][][] data = {{{0}, {0}, {0}}}; // Example data with sample = 0
        int x = 0;
        int y = 0;

        PsdImageContents psdImageContents = mockPsdContentImage();

        //Only make use of `data`!
        int result = dataParserBitmap.getRgb(data, x, y, psdImageContents);
        Assertions.assertEquals(0xFFFFFFFF, result);
    }

    @Test
    public void testGetRgbWhenSampleIsNonZero() {
        DataParserBitmap dataParserBitmap = new DataParserBitmap();

        int[][][] data = {{{255}, {255}, {255}}}; // Example data with sample = 0
        int x = 0;
        int y = 0;

        PsdImageContents psdImageContents = mockPsdContentImage();

        //Only make use of `data`!
        int result = dataParserBitmap.getRgb(data, x, y, psdImageContents);
        Assertions.assertEquals(0xFF000000, result);
    }

    private static PsdImageContents mockPsdContentImage() {
        int version = 1;
        byte[] reserved = new byte[]{1, 2, 3, 4}; // Example reserved array
        int channels = 3;
        int rows = 600;
        int columns = 800;
        int depth = 24;
        int mode = 1;

        // Create an instance of PsdHeaderInfo with the specified parameters
        PsdHeaderInfo psdHeaderInfo = new PsdHeaderInfo(version, reserved, channels, rows, columns, depth, mode);

        // Sample values for PsdImageContents
        int colorModeDataLength = 100;
        int imageResourcesLength = 200;
        int layerAndMaskDataLength = 300;
        int compression = 1; // Sample compression value

        // Create an instance of PsdImageContents with the specified parameters
        PsdImageContents psdImageContents = new PsdImageContents(psdHeaderInfo,
                colorModeDataLength, imageResourcesLength, layerAndMaskDataLength, compression);
        return psdImageContents;
    }
}
