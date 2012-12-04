package org.apache.commons.imaging.formats.psd;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingTest;

public abstract class PsdBaseTest extends ImagingTest {
    private static boolean isPsd(final File file) throws IOException,
            ImageReadException {
        final ImageFormat format = Imaging.guessFormat(file);
        return format == ImageFormat.IMAGE_FORMAT_PSD;
    }

    private static final ImageFilter IMAGE_FILTER = new ImageFilter() {
        public boolean accept(final File file) throws IOException, ImageReadException {
            return isPsd(file);
        }
    };

    protected List<File> getPsdImages() throws IOException, ImageReadException {
        return getTestImages(IMAGE_FILTER);
    }

}
