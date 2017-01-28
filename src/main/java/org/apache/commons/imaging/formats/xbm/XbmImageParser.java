/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */

package org.apache.commons.imaging.formats.xbm;

import static org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.IndexColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.UUID;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.BasicCParser;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;

public class XbmImageParser extends ImageParser {
    private static final String DEFAULT_EXTENSION = ".xbm";
    private static final String[] ACCEPTED_EXTENSIONS = { ".xbm", };

    @Override
    public String getName() {
        return "X BitMap";
    }

    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Override
    protected String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS;
    }

    @Override
    protected ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[] { ImageFormats.XBM, //
        };
    }

    @Override
    public ImageMetadata getMetadata(final ByteSource byteSource, final Map<String, Object> params)
            throws ImageReadException, IOException {
        return null;
    }

    @Override
    public ImageInfo getImageInfo(final ByteSource byteSource, final Map<String, Object> params)
            throws ImageReadException, IOException {
        final XbmHeader xbmHeader = readXbmHeader(byteSource);
        return new ImageInfo("XBM", 1, new ArrayList<String>(),
                ImageFormats.XBM, "X BitMap", xbmHeader.height,
                "image/x-xbitmap", 1, 0, 0, 0, 0, xbmHeader.width, false,
                false, false, ImageInfo.ColorType.BW,
                ImageInfo.CompressionAlgorithm.NONE);
    }

    @Override
    public Dimension getImageSize(final ByteSource byteSource, final Map<String, Object> params)
            throws ImageReadException, IOException {
        final XbmHeader xbmHeader = readXbmHeader(byteSource);
        return new Dimension(xbmHeader.width, xbmHeader.height);
    }

    @Override
    public byte[] getICCProfileBytes(final ByteSource byteSource, final Map<String, Object> params)
            throws ImageReadException, IOException {
        return null;
    }

    private static class XbmHeader {
        int width;
        int height;
        int xHot = -1;
        int yHot = -1;

        public XbmHeader(final int width, final int height, final int xHot, final int yHot) {
            this.width = width;
            this.height = height;
            this.xHot = xHot;
            this.yHot = yHot;
        }

        public void dump(final PrintWriter pw) {
            pw.println("XbmHeader");
            pw.println("Width: " + width);
            pw.println("Height: " + height);
            if (xHot != -1 && yHot != -1) {
                pw.println("X hot: " + xHot);
                pw.println("Y hot: " + yHot);
            }
        }
    }

    private static class XbmParseResult {
        XbmHeader xbmHeader;
        BasicCParser cParser;
    }

    private XbmHeader readXbmHeader(final ByteSource byteSource)
            throws ImageReadException, IOException {
        return parseXbmHeader(byteSource).xbmHeader;
    }

    private XbmParseResult parseXbmHeader(final ByteSource byteSource)
            throws ImageReadException, IOException {
        try (InputStream is = byteSource.getInputStream()) {
            final Map<String, String> defines = new HashMap<>();
            final ByteArrayOutputStream preprocessedFile = BasicCParser.preprocess(
                    is, null, defines);
            int width = -1;
            int height = -1;
            int xHot = -1;
            int yHot = -1;
            for (final Entry<String, String> entry : defines.entrySet()) {
                final String name = entry.getKey();
                if (name.endsWith("_width")) {
                    width = Integer.parseInt(entry.getValue());
                } else if (name.endsWith("_height")) {
                    height = Integer.parseInt(entry.getValue());
                } else if (name.endsWith("_x_hot")) {
                    xHot = Integer.parseInt(entry.getValue());
                } else if (name.endsWith("_y_hot")) {
                    yHot = Integer.parseInt(entry.getValue());
                }
             }
            if (width == -1) {
                throw new ImageReadException("width not found");
            }
            if (height == -1) {
                throw new ImageReadException("height not found");
            }

            final XbmParseResult xbmParseResult = new XbmParseResult();
            xbmParseResult.cParser = new BasicCParser(new ByteArrayInputStream(
                    preprocessedFile.toByteArray()));
            xbmParseResult.xbmHeader = new XbmHeader(width, height, xHot, yHot);
            return xbmParseResult;
        }
    }

    private BufferedImage readXbmImage(final XbmHeader xbmHeader, final BasicCParser cParser)
            throws ImageReadException, IOException {
        String token;
        token = cParser.nextToken();
        if (!"static".equals(token)) {
            throw new ImageReadException(
                    "Parsing XBM file failed, no 'static' token");
        }
        token = cParser.nextToken();
        if (token == null) {
            throw new ImageReadException(
                    "Parsing XBM file failed, no 'unsigned' "
                            + "or 'char' token");
        }
        if ("unsigned".equals(token)) {
            token = cParser.nextToken();
        }
        final int inputWidth;
        final int hexWidth;
        if ("char".equals(token)) {
            inputWidth = 8;
            hexWidth = 4; // 0xab
        } else if ("short".equals(token)) {
            inputWidth = 16;
            hexWidth = 6; // 0xabcd
        } else {
            throw new ImageReadException(
                    "Parsing XBM file failed, no 'char' or 'short' token");
        }
        final String name = cParser.nextToken();
        if (name == null) {
            throw new ImageReadException(
                    "Parsing XBM file failed, no variable name");
        }
        if (name.charAt(0) != '_' && !Character.isLetter(name.charAt(0))) {
            throw new ImageReadException(
                    "Parsing XBM file failed, variable name "
                            + "doesn't start with letter or underscore");
        }
        for (int i = 0; i < name.length(); i++) {
            final char c = name.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '_') {
                throw new ImageReadException(
                        "Parsing XBM file failed, variable name "
                                + "contains non-letter non-digit non-underscore");
            }
        }
        token = cParser.nextToken();
        if (!"[".equals(token)) {
            throw new ImageReadException(
                    "Parsing XBM file failed, no '[' token");
        }
        token = cParser.nextToken();
        if (!"]".equals(token)) {
            throw new ImageReadException(
                    "Parsing XBM file failed, no ']' token");
        }
        token = cParser.nextToken();
        if (!"=".equals(token)) {
            throw new ImageReadException(
                    "Parsing XBM file failed, no '=' token");
        }
        token = cParser.nextToken();
        if (!"{".equals(token)) {
            throw new ImageReadException(
                    "Parsing XBM file failed, no '{' token");
        }

        final int rowLength = (xbmHeader.width + 7) / 8;
        final byte[] imageData = new byte[rowLength * xbmHeader.height];
        int i = 0;
        for (int y = 0; y < xbmHeader.height; y++) {
            for (int x = 0; x < xbmHeader.width; x += inputWidth) {
                token = cParser.nextToken();
                if (token == null || !token.startsWith("0x")) {
                    throw new ImageReadException("Parsing XBM file failed, "
                            + "hex value missing");
                }
                if (token.length() > hexWidth) {
                    throw new ImageReadException("Parsing XBM file failed, "
                            + "hex value too long");
                }
                final int value = Integer.parseInt(token.substring(2), 16);
                final int flipped = Integer.reverse(value) >>> (32 - inputWidth);
                if (inputWidth == 16) {
                    if ((x + 8) < xbmHeader.width) {
                        imageData[i++] = (byte) (flipped >>> 8);
                        imageData[i++] = (byte) flipped;
                    } else {
                        imageData[i++] = (byte) flipped;
                    }
                } else {
                    imageData[i++] = (byte) flipped;
                }

                token = cParser.nextToken();
                if (token == null) {
                    throw new ImageReadException("Parsing XBM file failed, "
                            + "premature end of file");
                }
                if (!",".equals(token)
                        && ((i < imageData.length) || !"}".equals(token))) {
                    throw new ImageReadException("Parsing XBM file failed, "
                            + "punctuation error");
                }
            }
        }

        final int[] palette = { 0xffffff, 0x000000 };
        final ColorModel colorModel = new IndexColorModel(1, 2, palette, 0, false, -1, DataBuffer.TYPE_BYTE);
        final DataBufferByte dataBuffer = new DataBufferByte(imageData, imageData.length);
        final WritableRaster raster = Raster.createPackedRaster(dataBuffer, xbmHeader.width, xbmHeader.height, 1, null);
        
        return new BufferedImage(colorModel, raster, colorModel.isAlphaPremultiplied(), new Properties());
    }

    @Override
    public boolean dumpImageFile(final PrintWriter pw, final ByteSource byteSource)
            throws ImageReadException, IOException {
        readXbmHeader(byteSource).dump(pw);
        return true;
    }

    @Override
    public final BufferedImage getBufferedImage(final ByteSource byteSource,
            final Map<String, Object> params) throws ImageReadException, IOException {
        final XbmParseResult result = parseXbmHeader(byteSource);
        return readXbmImage(result.xbmHeader, result.cParser);
    }

    private String randomName() {
        final UUID uuid = UUID.randomUUID();
        final StringBuilder stringBuilder = new StringBuilder("a");
        long bits = uuid.getMostSignificantBits();
        // Long.toHexString() breaks for very big numbers
        for (int i = 64 - 8; i >= 0; i -= 8) {
            stringBuilder.append(Integer.toHexString((int) ((bits >> i) & 0xff)));
        }
        bits = uuid.getLeastSignificantBits();
        for (int i = 64 - 8; i >= 0; i -= 8) {
            stringBuilder.append(Integer.toHexString((int) ((bits >> i) & 0xff)));
        }
        return stringBuilder.toString();
    }

    private String toPrettyHex(final int value) {
        final String s = Integer.toHexString(0xff & value);
        if (s.length() == 2) {
            return "0x" + s;
        }
        return "0x0" + s;
    }

    @Override
    public void writeImage(final BufferedImage src, final OutputStream os, Map<String, Object> params)
            throws ImageWriteException, IOException {
        // make copy of params; we'll clear keys as we consume them.
        params = (params == null) ? new HashMap<String, Object>() : new HashMap<>(params);

        // clear format key.
        if (params.containsKey(PARAM_KEY_FORMAT)) {
            params.remove(PARAM_KEY_FORMAT);
        }

        if (!params.isEmpty()) {
            final Object firstKey = params.keySet().iterator().next();
            throw new ImageWriteException("Unknown parameter: " + firstKey);
        }

        final String name = randomName();

        os.write(("#define " + name + "_width " + src.getWidth() + "\n").getBytes("US-ASCII"));
        os.write(("#define " + name + "_height " + src.getHeight() + "\n").getBytes("US-ASCII"));
        os.write(("static unsigned char " + name + "_bits[] = {").getBytes("US-ASCII"));

        int bitcache = 0;
        int bitsInCache = 0;
        String separator = "\n  ";
        int written = 0;
        for (int y = 0; y < src.getHeight(); y++) {
            for (int x = 0; x < src.getWidth(); x++) {
                final int argb = src.getRGB(x, y);
                final int red = 0xff & (argb >> 16);
                final int green = 0xff & (argb >> 8);
                final int blue = 0xff & (argb >> 0);
                int sample = (red + green + blue) / 3;
                if (sample > 127) {
                    sample = 0;
                } else {
                    sample = 1;
                }
                bitcache |= (sample << bitsInCache);
                ++bitsInCache;
                if (bitsInCache == 8) {
                    os.write(separator.getBytes("US-ASCII"));
                    separator = ",";
                    if (written == 12) {
                        os.write("\n  ".getBytes("US-ASCII"));
                        written = 0;
                    }
                    os.write(toPrettyHex(bitcache).getBytes("US-ASCII"));
                    bitcache = 0;
                    bitsInCache = 0;
                    ++written;
                }
            }
            if (bitsInCache != 0) {
                os.write(separator.getBytes("US-ASCII"));
                separator = ",";
                if (written == 12) {
                    os.write("\n  ".getBytes("US-ASCII"));
                    written = 0;
                }
                os.write(toPrettyHex(bitcache).getBytes("US-ASCII"));
                bitcache = 0;
                bitsInCache = 0;
                ++written;
            }
        }

        os.write("\n};\n".getBytes("US-ASCII"));
    }

    /**
     * Extracts embedded XML metadata as XML string.
     * <p>
     * 
     * @param byteSource
     *            File containing image data.
     * @param params
     *            Map of optional parameters, defined in ImagingConstants.
     * @return Xmp Xml as String, if present. Otherwise, returns null.
     */
    @Override
    public String getXmpXml(final ByteSource byteSource, final Map<String, Object> params)
            throws ImageReadException, IOException {
        return null;
    }
}
