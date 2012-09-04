package org.apache.commons.imaging.formats.jpeg.segments;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.commons.imaging.common.BinaryFileParser;

/**
 * http://www.aiim.org/documents/standards/PDF-Ref/References/Adobe/5116.DCT_Filter.pdf
 */
public class App14Segment extends AppnSegment {
    private static final byte[] adobePrefix;
    public static final int ADOBE_COLOR_TRANSFORM_UNKNOWN = 0;
    public static final int ADOBE_COLOR_TRANSFORM_YCbCr = 1;
    public static final int ADOBE_COLOR_TRANSFORM_YCCK = 2;
    
    static {
        byte[] adobe = null;
        try {
            adobe = "Adobe".getBytes("US-ASCII");
        } catch (UnsupportedEncodingException cannotHappen) {
        }
        adobePrefix = adobe;
    }

    public App14Segment(int marker, byte segmentData[])
            throws IOException {
        this(marker, segmentData.length, new ByteArrayInputStream(
                segmentData));
    }
    
    public App14Segment(int marker, int marker_length, InputStream is)
            throws IOException {
        super(marker, marker_length, is);
    }

    public boolean isAdobeJpegSegment() {
        return BinaryFileParser.byteArrayHasPrefix(bytes, adobePrefix);
    }

    public int getAdobeColorTransform() {
        return 0xff & bytes[11];
    }
}
