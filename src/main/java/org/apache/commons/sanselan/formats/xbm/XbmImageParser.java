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

package org.apache.commons.sanselan.formats.xbm;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.IndexColorModel;
import java.awt.image.WritableRaster;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;

import org.apache.commons.sanselan.ImageFormat;
import org.apache.commons.sanselan.ImageInfo;
import org.apache.commons.sanselan.ImageParser;
import org.apache.commons.sanselan.ImageReadException;
import org.apache.commons.sanselan.ImageWriteException;
import org.apache.commons.sanselan.common.BasicCParser;
import org.apache.commons.sanselan.common.IImageMetadata;
import org.apache.commons.sanselan.common.byteSources.ByteSource;

public class XbmImageParser extends ImageParser
{
    public XbmImageParser()
    {
    }

    public String getName()
    {
        return "Xbm-Custom";
    }

    public String getDefaultExtension()
    {
        return DEFAULT_EXTENSION;
    }
    private static final String DEFAULT_EXTENSION = ".xbm";
    private static final String ACCEPTED_EXTENSIONS[] =
    {
        ".xbm",
    };

    protected String[] getAcceptedExtensions()
    {
        return ACCEPTED_EXTENSIONS;
    }

    protected ImageFormat[] getAcceptedTypes()
    {
        return new ImageFormat[]
        {
            ImageFormat.IMAGE_FORMAT_XBM, //
        };
    }

    public boolean embedICCProfile(File src, File dst, byte profile[])
    {
        return false;
    }

    public IImageMetadata getMetadata(ByteSource byteSource, Map params)
            throws ImageReadException, IOException
    {
        return null;
    }

    public ImageInfo getImageInfo(ByteSource byteSource, Map params)
            throws ImageReadException, IOException
    {
        XbmHeader xbmHeader = readXbmHeader(byteSource);
        return new ImageInfo("XBM", 1,
                new ArrayList(), ImageFormat.IMAGE_FORMAT_XBM,
                "X BitMap",
                xbmHeader.height, "image/x-xbitmap", 1,
                0, 0, 0, 0,
                xbmHeader.width, false, false, false,
                ImageInfo.COLOR_TYPE_BW,
                ImageInfo.COMPRESSION_ALGORITHM_NONE);
    }

    public Dimension getImageSize(ByteSource byteSource,
            Map params)
            throws ImageReadException, IOException
    {
        XbmHeader xbmHeader = readXbmHeader(byteSource);
        return new Dimension(xbmHeader.width, xbmHeader.height);
    }

    public byte[] getICCProfileBytes(ByteSource byteSource,
            Map params)
            throws ImageReadException, IOException
    {
        return null;
    }

    private static class XbmHeader
    {
        int width;
        int height;
        int xHot = -1;
        int yHot = -1;

        public XbmHeader(int width, int height, int xHot, int yHot)
        {
            this.width = width;
            this.height = height;
            this.xHot = xHot;
            this.yHot = yHot;
        }

        public void dump(PrintWriter pw)
        {
            pw.println("XbmHeader");
            pw.println("Width: " + width);
            pw.println("Height: " + height);
            if (xHot != -1 && yHot != -1)
            {
                pw.println("X hot: " + xHot);
                pw.println("Y hot: " + yHot);
            }
        }
    }

    private static class XbmParseResult
    {
        XbmHeader xbmHeader;
        BasicCParser cParser;
    }

    private XbmHeader readXbmHeader(ByteSource byteSource)
            throws ImageReadException, IOException
    {
        XbmParseResult result = parseXbmHeader(byteSource);
        return result.xbmHeader;
    }

    private XbmParseResult parseXbmHeader(ByteSource byteSource)
            throws ImageReadException, IOException
    {
        InputStream is = null;
        try
        {
            is = byteSource.getInputStream();
            Map defines = new HashMap();
            ByteArrayOutputStream preprocessedFile = BasicCParser.preprocess(
                    is, null, defines);
            int width = -1;
            int height = -1;
            int xHot = -1;
            int yHot = -1;
            for (Iterator it = defines.entrySet().iterator(); it.hasNext();)
            {
                Map.Entry entry = (Map.Entry)it.next();
                String name = (String)entry.getKey();
                if (name.endsWith("_width"))
                    width = Integer.parseInt((String)entry.getValue());
                else if (name.endsWith("_height"))
                    height = Integer.parseInt((String)entry.getValue());
                else if (name.endsWith("_x_hot"))
                    xHot = Integer.parseInt((String)entry.getValue());
                else if (name.endsWith("_y_hot"))
                    yHot = Integer.parseInt((String)entry.getValue());
            }
            if (width == -1)
                throw new ImageReadException("width not found");
            if (height == -1)
                throw new ImageReadException("height not found");

            XbmParseResult xbmParseResult = new XbmParseResult();
            xbmParseResult.cParser = new BasicCParser(
                    new ByteArrayInputStream(preprocessedFile.toByteArray()));
            xbmParseResult.xbmHeader = new XbmHeader(width, height, xHot, yHot);
            return xbmParseResult;
        }
        finally
        {
            try
            {
                if (is != null)
                    is.close();
            }
            catch (IOException ignored)
            {
            }
        }
    }

    private BufferedImage readXbmImage(XbmHeader xbmHeader, BasicCParser cParser)
            throws ImageReadException, IOException
    {
        String token;
        token = cParser.nextToken();
        if (token == null || !token.equals("static"))
            throw new ImageReadException("Parsing XBM file failed, no 'static' token");
        token = cParser.nextToken();
        if (token == null)
            throw new ImageReadException("Parsing XBM file failed, no 'unsigned' " +
                    "or 'char' token");
        if (token.equals("unsigned"))
            token = cParser.nextToken();
        if (token == null || !token.equals("char"))
            throw new ImageReadException("Parsing XBM file failed, no 'char' token");
        String name = cParser.nextToken();
        if (name == null)
            throw new ImageReadException("Parsing XBM file failed, no variable name");
        if (name.charAt(0) != '_' && !Character.isLetter(name.charAt(0)))
            throw new ImageReadException("Parsing XBM file failed, variable name " +
                    "doesn't start with letter or underscore");
        for (int i = 0; i < name.length(); i++)
        {
            char c = name.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '_')
                throw new ImageReadException("Parsing XBM file failed, variable name " +
                        "contains non-letter non-digit non-underscore");
        }
        token = cParser.nextToken();
        if (token == null || !token.equals("["))
            throw new ImageReadException("Parsing XBM file failed, no '[' token");
        token = cParser.nextToken();
        if (token == null || !token.equals("]"))
            throw new ImageReadException("Parsing XBM file failed, no ']' token");
        token = cParser.nextToken();
        if (token == null || !token.equals("="))
            throw new ImageReadException("Parsing XBM file failed, no '=' token");
        token = cParser.nextToken();
        if (token == null || !token.equals("{"))
            throw new ImageReadException("Parsing XBM file failed, no '{' token");

        int rowLength = (xbmHeader.width + 7) / 8;
        byte[] imageData = new byte[rowLength * xbmHeader.height];
        for (int i = 0; i < imageData.length; i++)
        {
            token = cParser.nextToken();
            if (token == null || !token.startsWith("0x"))
                throw new ImageReadException("Parsing XBM file failed, " +
                        "hex value missing");
            if (token.length() > 4)
                throw new ImageReadException("Parsing XBM file failed, " +
                        "hex value too long");
            int value = Integer.parseInt(token.substring(2), 16);
            int flipped = 0;
            for (int j = 0; j < 8; j++)
            {
                if ((value & (1 << j)) != 0)
                    flipped |= (0x80 >>> j);
            }
            imageData[i] = (byte) flipped;

            token = cParser.nextToken();
            if (token == null)
                throw new ImageReadException("Parsing XBM file failed, " +
                        "premature end of file");
            if (!token.equals(",") && (i < (imageData.length - 1) || !token.equals("}")))
                throw new ImageReadException("Parsing XBM file failed, " +
                        "punctuation error");
        }

        int[] palette = {0xffffff, 0x000000};
        ColorModel colorModel = new IndexColorModel(1, 2,
                palette, 0, false, -1, DataBuffer.TYPE_BYTE);
        DataBufferByte dataBuffer = new DataBufferByte(imageData, imageData.length);
        WritableRaster raster = WritableRaster.createPackedRaster(dataBuffer,
                xbmHeader.width, xbmHeader.height, 1, null);
        BufferedImage image = new BufferedImage(colorModel, raster,
                colorModel.isAlphaPremultiplied(), new Properties());
        return image;
    }

    public boolean dumpImageFile(PrintWriter pw, ByteSource byteSource)
            throws ImageReadException, IOException
    {
        readXbmHeader(byteSource).dump(pw);
        return true;
    }

    public final BufferedImage getBufferedImage(ByteSource byteSource,
            Map params) throws ImageReadException, IOException
    {
        XbmParseResult result = parseXbmHeader(byteSource);
        return readXbmImage(result.xbmHeader, result.cParser);
    }

    private String randomName()
    {
        UUID uuid = UUID.randomUUID();
        StringBuilder stringBuilder = new StringBuilder("a");
        long bits = uuid.getMostSignificantBits();
        // Long.toHexString() breaks for very big numbers
        for (int i = 64 - 8; i >= 0; i -= 8)
            stringBuilder.append(Integer.toHexString((int)((bits >> i) & 0xff)));
        bits = uuid.getLeastSignificantBits();
        for (int i = 64 - 8; i >= 0; i -= 8)
            stringBuilder.append(Integer.toHexString((int)((bits >> i) & 0xff)));
        return stringBuilder.toString();
    }

    private String toPrettyHex(int value)
    {
        String s = Integer.toHexString(0xff & value);
        if (s.length() == 2)
            return "0x" + s;
        return "0x0" + s;
    }

    public void writeImage(BufferedImage src, OutputStream os, Map params)
            throws ImageWriteException, IOException
    {
        // make copy of params; we'll clear keys as we consume them.
        params = (params == null) ? new HashMap() : new HashMap(params);

        // clear format key.
        if (params.containsKey(PARAM_KEY_FORMAT))
            params.remove(PARAM_KEY_FORMAT);

        if (params.size() > 0)
        {
            Object firstKey = params.keySet().iterator().next();
            throw new ImageWriteException("Unknown parameter: " + firstKey);
        }

        String name = randomName();

        os.write(("#define " + name + "_width " + src.getWidth() + "\n").getBytes("US-ASCII"));
        os.write(("#define " + name + "_height " + src.getHeight() + "\n").getBytes("US-ASCII"));
        os.write(("static unsigned char " + name + "_bits[] = {").getBytes("US-ASCII"));

        int bitcache = 0;
        int bits_in_cache = 0;
        String separator = "\n  ";
        int written = 0;
        for (int y = 0; y < src.getHeight(); y++)
        {
            for (int x = 0; x < src.getWidth(); x++)
            {
                int argb = src.getRGB(x, y);
                int red = 0xff & (argb >> 16);
                int green = 0xff & (argb >> 8);
                int blue = 0xff & (argb >> 0);
                int sample = (red + green + blue) / 3;
                if (sample > 127)
                    sample = 0;
                else
                    sample = 1;
                bitcache |= (sample << bits_in_cache);
                ++bits_in_cache;
                if (bits_in_cache == 8)
                {
                    os.write(separator.getBytes("US-ASCII"));
                    separator = ",";
                    if (written == 12)
                    {
                        os.write("\n  ".getBytes("US-ASCII"));
                        written = 0;
                    }
                    os.write(toPrettyHex(bitcache).getBytes("US-ASCII"));
                    bitcache = 0;
                    bits_in_cache = 0;
                    ++written;
                }
            }
            if (bits_in_cache != 0)
            {
                os.write(separator.getBytes("US-ASCII"));
                separator = ",";
                if (written == 12)
                {
                    os.write("\n  ".getBytes("US-ASCII"));
                    written = 0;
                }
                os.write(toPrettyHex(bitcache).getBytes("US-ASCII"));
                bitcache = 0;
                bits_in_cache = 0;
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
     *            Map of optional parameters, defined in SanselanConstants.
     * @return Xmp Xml as String, if present.  Otherwise, returns null.
     */
    public String getXmpXml(ByteSource byteSource, Map params)
            throws ImageReadException, IOException
    {
        return null;
    }
}
