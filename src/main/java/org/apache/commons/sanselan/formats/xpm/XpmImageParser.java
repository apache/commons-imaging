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

package org.apache.commons.sanselan.formats.xpm;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DirectColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.WritableRaster;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
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
import org.apache.commons.sanselan.common.bytesource.ByteSource;
import org.apache.commons.sanselan.palette.PaletteFactory;
import org.apache.commons.sanselan.palette.SimplePalette;
import org.apache.commons.sanselan.util.Debug;

public class XpmImageParser extends ImageParser
{
    private static Map<String, Integer> colorNames = null;

    public XpmImageParser()
    {
    }

    private synchronized static boolean loadColorNames()
    {
        if (colorNames != null)
            return true;

        BufferedReader reader = null;
        try
        {
            InputStream rgbTxtStream = XpmImageParser.class.getResourceAsStream(
                    "rgb.txt");
            if (rgbTxtStream == null) {
                return false;
            }
            reader = new BufferedReader(new InputStreamReader(rgbTxtStream,
                    "US-ASCII"));
            Map<String, Integer> colors = new HashMap<String, Integer>();
            String line;
            while ((line = reader.readLine()) != null)
            {
                if (line.startsWith("!"))
                    continue;
                try
                {
                    int red = Integer.parseInt(line.substring(0, 3).trim());
                    int green = Integer.parseInt(line.substring(4, 7).trim());
                    int blue = Integer.parseInt(line.substring(8, 11).trim());
                    String colorName = line.substring(11).trim();
                    colors.put(colorName, 0xff000000 |
                            (red << 16) | (green << 8) | blue);
                }
                catch (NumberFormatException nfe)
                {
                }
            }
            colorNames = colors;
            return true;
        }
        catch (IOException ioException)
        {
            Debug.debug(ioException);
            return false;
        }
        finally
        {
            try
            {
                if (reader != null)
                    reader.close();
            }
            catch (IOException ignored)
            {
            }
        }
    }

    public String getName()
    {
        return "Xpm-Custom";
    }

    public String getDefaultExtension()
    {
        return DEFAULT_EXTENSION;
    }
    private static final String DEFAULT_EXTENSION = ".xpm";
    private static final String ACCEPTED_EXTENSIONS[] =
    {
        ".xpm",
    };

    protected String[] getAcceptedExtensions()
    {
        return ACCEPTED_EXTENSIONS;
    }

    protected ImageFormat[] getAcceptedTypes()
    {
        return new ImageFormat[]
        {
            ImageFormat.IMAGE_FORMAT_XPM, //
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
        XpmHeader xpmHeader = readXpmHeader(byteSource);
        boolean isTransparent = false;
        int colorType = ImageInfo.COLOR_TYPE_BW;
        for (Iterator<Map.Entry<Object,PaletteEntry>> it = xpmHeader.palette.entrySet().iterator(); it.hasNext();)
        {
            Map.Entry<Object, PaletteEntry> entry = it.next();
            PaletteEntry paletteEntry = entry.getValue();
            if ((paletteEntry.getBestARGB() & 0xff000000) != 0xff000000)
                isTransparent = true;
            if (paletteEntry.haveColor)
                colorType = ImageInfo.COLOR_TYPE_RGB;
            else if (colorType != ImageInfo.COLOR_TYPE_RGB &&
                    (paletteEntry.haveGray || paletteEntry.haveGray4Level))
                colorType = ImageInfo.COLOR_TYPE_GRAYSCALE;
        }
        return new ImageInfo("XPM version 3", xpmHeader.numCharsPerPixel * 8,
                new ArrayList<String>(), ImageFormat.IMAGE_FORMAT_XPM,
                "X PixMap",
                xpmHeader.height, "image/x-xpixmap", 1,
                0, 0, 0, 0,
                xpmHeader.width, false, isTransparent, true,
                colorType,
                ImageInfo.COMPRESSION_ALGORITHM_NONE);
    }

    public Dimension getImageSize(ByteSource byteSource,
            Map params)
            throws ImageReadException, IOException
    {
        XpmHeader xpmHeader = readXpmHeader(byteSource);
        return new Dimension(xpmHeader.width, xpmHeader.height);
    }

    public byte[] getICCProfileBytes(ByteSource byteSource,
            Map params)
            throws ImageReadException, IOException
    {
        return null;
    }

    private static class XpmHeader
    {
        int width;
        int height;
        int numColors;
        int numCharsPerPixel;
        int xHotSpot = -1;
        int yHotSpot = -1;
        boolean xpmExt;
        
        Map<Object, PaletteEntry> palette = new HashMap<Object, PaletteEntry>();

        public XpmHeader(int width, int height, int numColors,
                int numCharsPerPixel, int xHotSpot, int yHotSpot,
                boolean xpmExt)
        {
            this.width = width;
            this.height = height;
            this.numColors = numColors;
            this.numCharsPerPixel = numCharsPerPixel;
            this.xHotSpot = xHotSpot;
            this.yHotSpot = yHotSpot;
            this.xpmExt = xpmExt;
        }

        public void dump(PrintWriter pw)
        {
            pw.println("XpmHeader");
            pw.println("Width: " + width);
            pw.println("Height: " + height);
            pw.println("NumColors: " + numColors);
            pw.println("NumCharsPerPixel: " + numCharsPerPixel);
            if (xHotSpot != -1 && yHotSpot != -1)
            {
                pw.println("X hotspot: " + xHotSpot);
                pw.println("Y hotspot: " + yHotSpot);
            }
            pw.println("XpmExt: " + xpmExt);
        }
    }

    private static class PaletteEntry
    {
        int index;
        boolean haveColor = false;
        int colorArgb;
        boolean haveGray = false;
        int grayArgb;
        boolean haveGray4Level = false;
        int gray4LevelArgb;
        boolean haveMono = false;
        int monoArgb;
        String symbolicName = null;

        int getBestARGB()
        {
            if (haveColor)
                return colorArgb;
            else if (haveGray)
                return grayArgb;
            else if (haveGray4Level)
                return gray4LevelArgb;
            else if (haveMono)
                return monoArgb;
            else
                return 0x00000000;
        }
    }

    private static class XpmParseResult
    {
        XpmHeader xpmHeader;
        BasicCParser cParser;
    }

    private XpmHeader readXpmHeader(ByteSource byteSource)
            throws ImageReadException, IOException
    {
        XpmParseResult result = parseXpmHeader(byteSource);
        return result.xpmHeader;
    }

    private XpmParseResult parseXpmHeader(ByteSource byteSource)
            throws ImageReadException, IOException
    {
        InputStream is = null;
        try
        {
            is = byteSource.getInputStream();
            StringBuilder firstComment = new StringBuilder();
            ByteArrayOutputStream preprocessedFile = BasicCParser.preprocess(
                    is, firstComment, null);
            if (!firstComment.toString().trim().equals("XPM"))
                throw new ImageReadException("Parsing XPM file failed, " +
                        "signature isn't '/* XPM */'");

            XpmParseResult xpmParseResult = new XpmParseResult();
            xpmParseResult.cParser = new BasicCParser(
                    new ByteArrayInputStream(preprocessedFile.toByteArray()));
            xpmParseResult.xpmHeader = parseXpmHeader(xpmParseResult.cParser);
            return xpmParseResult;
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

    private boolean parseNextString(BasicCParser cParser, StringBuilder stringBuilder)
            throws IOException, ImageReadException
    {
        stringBuilder.setLength(0);
        String token = cParser.nextToken();
        if (token.charAt(0) != '"')
            throw new ImageReadException("Parsing XPM file failed, " +
                    "no string found where expected");
        BasicCParser.unescapeString(stringBuilder, token);
        for (token = cParser.nextToken(); token.charAt(0) == '"'; token = cParser.nextToken())
        {
            BasicCParser.unescapeString(stringBuilder, token);
        }
        if (token.equals(","))
            return true;
        else if (token.equals("}"))
            return false;
        else
            throw new ImageReadException("Parsing XPM file failed, " +
                    "no ',' or '}' found where expected");
    }

    private XpmHeader parseXpmValuesSection(String row)
            throws ImageReadException
    {
        String[] tokens = BasicCParser.tokenizeRow(row);
        if (tokens.length < 4 && tokens.length > 7)
            throw new ImageReadException("Parsing XPM file failed, " +
                    "<Values> section has incorrect tokens");
        try
        {
            int width = Integer.parseInt(tokens[0]);
            int height = Integer.parseInt(tokens[1]);
            int numColors = Integer.parseInt(tokens[2]);
            int numCharsPerPixel = Integer.parseInt(tokens[3]);
            int xHotSpot = -1;
            int yHotSpot = -1;
            boolean xpmExt = false;
            if (tokens.length >= 6)
            {
                xHotSpot = Integer.parseInt(tokens[4]);
                yHotSpot = Integer.parseInt(tokens[5]);
            }
            if (tokens.length == 5 || tokens.length == 7)
            {
                if (tokens[tokens.length-1].equals("XPMEXT"))
                    xpmExt = true;
                else
                    throw new ImageReadException("Parsing XPM file failed, " +
                            "can't parse <Values> section XPMEXT");
            }
            return new XpmHeader(width, height, numColors, numCharsPerPixel,
                    xHotSpot, yHotSpot, xpmExt);
        }
        catch (NumberFormatException nfe)
        {
            throw new ImageReadException("Parsing XPM file failed, " +
                    "error parsing <Values> section", nfe);
        }
    }

    private int parseColor(String color)
            throws ImageReadException
    {
        if (color.charAt(0) == '#')
        {
            color = color.substring(1);
            if (color.length() == 3)
            {
                int red = Integer.parseInt(color.substring(0, 1), 16);
                int green = Integer.parseInt(color.substring(1, 2), 16);
                int blue = Integer.parseInt(color.substring(2, 3), 16);
                return 0xff000000 | (red << 20) | (green << 12) | (blue << 4);
            }
            else if (color.length() == 6)
                return 0xff000000 | Integer.parseInt(color, 16);
            else if (color.length() == 9)
            {
                int red = Integer.parseInt(color.substring(0, 1), 16);
                int green = Integer.parseInt(color.substring(3, 4), 16);
                int blue = Integer.parseInt(color.substring(6, 7), 16);
                return 0xff000000 | (red << 16) | (green << 8) | blue;
            }
            else if (color.length() == 12)
            {
                int red = Integer.parseInt(color.substring(0, 1), 16);
                int green = Integer.parseInt(color.substring(4, 5), 16);
                int blue = Integer.parseInt(color.substring(8, 9), 16);
                return 0xff000000 | (red << 16) | (green << 8) | blue;
            }
            else
                return 0x00000000;
        }
        else if (color.charAt(0) == '%')
        {
            throw new ImageReadException("HSV colors are not implemented " +
                    "even in the XPM specification!");
        }
        else if (color.equals("None"))
            return 0x00000000;
        else
        {
            if (!loadColorNames())
                return 0x00000000;
            if (colorNames.containsKey(color))
                return (colorNames.get(color)).intValue();
            else
                return 0x00000000;
        }
    }

    private void parsePaletteEntries(XpmHeader xpmHeader, BasicCParser cParser)
            throws IOException, ImageReadException
    {
        StringBuilder row = new StringBuilder();
        for (int i = 0; i < xpmHeader.numColors; i++)
        {
            row.setLength(0);
            boolean hasMore = parseNextString(cParser, row);
            if (!hasMore)
                throw new ImageReadException("Parsing XPM file failed, " +
                        "file ended while reading palette");
            String name = row.substring(0, xpmHeader.numCharsPerPixel);
            String[] tokens = BasicCParser.tokenizeRow(
                    row.substring(xpmHeader.numCharsPerPixel));
            PaletteEntry paletteEntry = new PaletteEntry();
            paletteEntry.index = i;
            int previousKeyIndex = Integer.MIN_VALUE;
            StringBuilder colorBuffer = new StringBuilder();
            for (int j = 0; j < tokens.length; j++)
            {
                String token = tokens[j];
                boolean isKey = false;
                if (previousKeyIndex < (j - 1))
                {
                    if (token.equals("m") || token.equals("g4") ||
                            token.equals("g") || token.equals("c") ||
                            token.equals("s"))
                        isKey = true;
                }
                if (isKey)
                {
                    if (previousKeyIndex >= 0)
                    {
                        String key = tokens[previousKeyIndex];
                        String color = colorBuffer.toString();
                        colorBuffer.setLength(0);
                        if (key.equals("m"))
                        {
                            paletteEntry.monoArgb = parseColor(color);
                            paletteEntry.haveMono = true;
                        }
                        else if (key.equals("g4"))
                        {
                            paletteEntry.gray4LevelArgb = parseColor(color);
                            paletteEntry.haveGray4Level = true;
                        }
                        else if (key.equals("g"))
                        {
                            paletteEntry.grayArgb = parseColor(color);
                            paletteEntry.haveGray = true;
                        }
                        else if (key.equals("s"))
                        {
                            paletteEntry.symbolicName = color;
                            paletteEntry.colorArgb = parseColor(color);
                            paletteEntry.haveColor = true;
                        }
                        else if (key.equals("c"))
                        {
                            paletteEntry.colorArgb = parseColor(color);
                            paletteEntry.haveColor = true;
                        }
                    }
                    previousKeyIndex = j;
                }
                else
                {
                    if (previousKeyIndex < 0)
                        break;
                    if (colorBuffer.length() > 0)
                        colorBuffer.append(' ');
                    colorBuffer.append(token);
                }
            }
            if (previousKeyIndex >= 0 && colorBuffer.length() > 0)
            {
                String key = tokens[previousKeyIndex];
                String color = colorBuffer.toString();
                colorBuffer.setLength(0);
                if (key.equals("m"))
                {
                    paletteEntry.monoArgb = parseColor(color);
                    paletteEntry.haveMono = true;
                }
                else if (key.equals("g4"))
                {
                    paletteEntry.gray4LevelArgb = parseColor(color);
                    paletteEntry.haveGray4Level = true;
                }
                else if (key.equals("g"))
                {
                    paletteEntry.grayArgb = parseColor(color);
                    paletteEntry.haveGray = true;
                }
                else if (key.equals("s"))
                {
                    paletteEntry.symbolicName = color;
                    paletteEntry.colorArgb = parseColor(color);
                    paletteEntry.haveColor = true;
                }
                else if (key.equals("c"))
                {
                    paletteEntry.colorArgb = parseColor(color);
                    paletteEntry.haveColor = true;
                }
            }
            xpmHeader.palette.put(name, paletteEntry);
        }
    }

    private XpmHeader parseXpmHeader(BasicCParser cParser)
            throws ImageReadException, IOException
    {
        String name;
        String token;
        token = cParser.nextToken();
        if (token == null || !token.equals("static"))
            throw new ImageReadException("Parsing XPM file failed, no 'static' token");
        token = cParser.nextToken();
        if (token == null || !token.equals("char"))
            throw new ImageReadException("Parsing XPM file failed, no 'char' token");
        token = cParser.nextToken();
        if (token == null || !token.equals("*"))
            throw new ImageReadException("Parsing XPM file failed, no '*' token");
        name = cParser.nextToken();
        if (name == null)
            throw new ImageReadException("Parsing XPM file failed, no variable name");
        if (name.charAt(0) != '_' && !Character.isLetter(name.charAt(0)))
            throw new ImageReadException("Parsing XPM file failed, variable name " +
                    "doesn't start with letter or underscore");
        for (int i = 0; i < name.length(); i++)
        {
            char c = name.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '_')
                throw new ImageReadException("Parsing XPM file failed, variable name " +
                        "contains non-letter non-digit non-underscore");
        }
        token = cParser.nextToken();
        if (token == null || !token.equals("["))
            throw new ImageReadException("Parsing XPM file failed, no '[' token");
        token = cParser.nextToken();
        if (token == null || !token.equals("]"))
            throw new ImageReadException("Parsing XPM file failed, no ']' token");
        token = cParser.nextToken();
        if (token == null || !token.equals("="))
            throw new ImageReadException("Parsing XPM file failed, no '=' token");
        token = cParser.nextToken();
        if (token == null || !token.equals("{"))
            throw new ImageReadException("Parsing XPM file failed, no '{' token");

        StringBuilder row = new StringBuilder();
        boolean hasMore = parseNextString(cParser, row);
        if (!hasMore)
            throw new ImageReadException("Parsing XPM file failed, " +
                    "file too short");
        XpmHeader xpmHeader = parseXpmValuesSection(row.toString());
        parsePaletteEntries(xpmHeader, cParser);
        return xpmHeader;
    }

    private BufferedImage readXpmImage(XpmHeader xpmHeader, BasicCParser cParser)
            throws ImageReadException, IOException
    {
        ColorModel colorModel;
        WritableRaster raster;
        int bpp;
        if (xpmHeader.palette.size() <= (1 << 8))
        {
            int[] palette = new int[xpmHeader.palette.size()];
            for (Iterator<Map.Entry<Object,PaletteEntry>> it = xpmHeader.palette.entrySet().iterator(); it.hasNext();)
            {
                Map.Entry<Object, PaletteEntry> entry = it.next();
                PaletteEntry paletteEntry = entry.getValue();
                palette[paletteEntry.index] = paletteEntry.getBestARGB();
            }
            colorModel = new IndexColorModel(8, xpmHeader.palette.size(),
                    palette, 0, true, -1, DataBuffer.TYPE_BYTE);
            raster = WritableRaster.createInterleavedRaster(DataBuffer.TYPE_BYTE,
                    xpmHeader.width, xpmHeader.height, 1, null);
            bpp = 8;
        }
        else if (xpmHeader.palette.size() <= (1 << 16))
        {
            int[] palette = new int[xpmHeader.palette.size()];
            for (Iterator<Map.Entry<Object,PaletteEntry>> it = xpmHeader.palette.entrySet().iterator(); it.hasNext();)
            {
                Map.Entry<Object, PaletteEntry> entry = it.next();
                PaletteEntry paletteEntry = entry.getValue();
                palette[paletteEntry.index] = paletteEntry.getBestARGB();
            }
            colorModel = new IndexColorModel(16, xpmHeader.palette.size(),
                    palette, 0, true, -1, DataBuffer.TYPE_USHORT);
            raster = WritableRaster.createInterleavedRaster(DataBuffer.TYPE_USHORT,
                    xpmHeader.width, xpmHeader.height, 1, null);
            bpp = 16;
        }
        else
        {
            colorModel = new DirectColorModel(32, 0x00ff0000, 0x0000ff00,
                    0x000000ff, 0xff000000);
            raster = WritableRaster.createPackedRaster(DataBuffer.TYPE_INT,
                    xpmHeader.width, xpmHeader.height,
                    new int[]{0x00ff0000, 0x0000ff00, 0x000000ff, 0xff000000}, null);
            bpp = 32;
        }

        BufferedImage image = new BufferedImage(colorModel, raster,
                colorModel.isAlphaPremultiplied(), new Properties());
        DataBuffer dataBuffer = raster.getDataBuffer();
        StringBuilder row = new StringBuilder();
        boolean hasMore = true;
        for (int y = 0; y < xpmHeader.height; y++)
        {
            row.setLength(0);
            hasMore = parseNextString(cParser, row);
            if (y < (xpmHeader.height - 1) && !hasMore)
                throw new ImageReadException("Parsing XPM file failed, " +
                        "insufficient image rows in file");
            int rowOffset = y*xpmHeader.width;
            for (int x = 0; x < xpmHeader.width; x++)
            {
                String index = row.substring(x*xpmHeader.numCharsPerPixel,
                        (x + 1)*xpmHeader.numCharsPerPixel);
                PaletteEntry paletteEntry = xpmHeader.palette.get(index);
                if (paletteEntry == null) {
                    throw new ImageReadException("No palette entry was defined " +
                            "for " + index);
                }
                if (bpp <= 16)
                    dataBuffer.setElem(rowOffset + x, paletteEntry.index);
                else
                    dataBuffer.setElem(rowOffset + x, paletteEntry.getBestARGB());
            }
        }

        while (hasMore)
        {
            row.setLength(0);
            hasMore = parseNextString(cParser, row);
        }
        
        String token = cParser.nextToken();
        if (!token.equals(";"))
            throw new ImageReadException("Last token wasn't ';'");
        
        return image;
    }

    public boolean dumpImageFile(PrintWriter pw, ByteSource byteSource)
            throws ImageReadException, IOException
    {
        readXpmHeader(byteSource).dump(pw);
        return true;
    }

    public final BufferedImage getBufferedImage(ByteSource byteSource,
            Map params) throws ImageReadException, IOException
    {
        XpmParseResult result = parseXpmHeader(byteSource);
        return readXpmImage(result.xpmHeader, result.cParser);
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

    private String pixelsForIndex(int index, int charsPerPixel)
    {
        StringBuilder stringBuilder = new StringBuilder();
        int highestPower = 1;
        for (int i = 1; i < charsPerPixel; i++)
            highestPower *= writePalette.length;
        for (int i = 0; i < charsPerPixel; i++)
        {
            int multiple = index / highestPower;
            index  -= (multiple * highestPower);
            highestPower /= writePalette.length;
            stringBuilder.append(writePalette[multiple]);
        }
        return stringBuilder.toString();
    }

    private String toColor(int color)
    {
        String hex = Integer.toHexString(color);
        if (hex.length() < 6)
        {
            char zeroes[] = new char[6 - hex.length()];
            Arrays.fill(zeroes, '0');
            return "#" + new String(zeroes) + hex;
        }
        else
            return "#" + hex;
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

        PaletteFactory paletteFactory = new PaletteFactory();
        boolean hasTransparency = false;
        if (paletteFactory.hasTransparency(src, 1))
            hasTransparency = true;
        SimplePalette palette = null;
        int maxColors = writePalette.length;
        int charsPerPixel = 1;
        for (; palette == null; )
        {
            palette = paletteFactory.makePaletteSimple(src,
                    hasTransparency ? maxColors - 1 : maxColors);
            if (palette == null)
            {
                maxColors *= writePalette.length;
                charsPerPixel++;
            }
        }
        int colors = palette.length();
        if (hasTransparency)
            ++colors;

        String line = "/* XPM */\n";
        os.write(line.getBytes("US-ASCII"));
        line = "static char *" + randomName() + "[] = {\n";
        os.write(line.getBytes("US-ASCII"));
        line = "\"" + src.getWidth() +
                " " + src.getHeight() +
                " " + colors +
                " " + charsPerPixel + "\",\n";
        os.write(line.getBytes("US-ASCII"));

        for (int i = 0; i < colors; i++)
        {
            String color;
            if (i < palette.length())
                color = toColor(palette.getEntry(i));
            else
                color = "None";
            line = "\"" + pixelsForIndex(i, charsPerPixel) +
                    " c " + color + "\",\n";
            os.write(line.getBytes("US-ASCII"));
        }

        String separator = "";
        for (int y = 0; y < src.getHeight(); y++)
        {
            os.write(separator.getBytes("US-ASCII"));
            separator = ",\n";
            line = "\"";
            os.write(line.getBytes("US-ASCII"));
            for (int x = 0; x < src.getWidth(); x++)
            {
                int argb = src.getRGB(x, y);
                if ((argb & 0xff000000) == 0)
                    line = pixelsForIndex(palette.length(), charsPerPixel);
                else
                    line = pixelsForIndex(palette.getPaletteIndex(
                            0xffffff & argb), charsPerPixel);
                os.write(line.getBytes("US-ASCII"));
            }
            line = "\"";
            os.write(line.getBytes("US-ASCII"));
        }

        line = "\n};\n";
        os.write(line.getBytes("US-ASCII"));
    }

    private static final char writePalette[] = {
        ' ',
        '.',
        'X',
        'o',
        'O',
        '+',
        '@',
        '#',
        '$',
        '%',
        '&',
        '*',
        '=',
        '-',
        ';',
        ':',
        '>',
        ',',
        '<',
        '1',
        '2',
        '3',
        '4',
        '5',
        '6',
        '7',
        '8',
        '9',
        '0',
        'q',
        'w',
        'e',
        'r',
        't',
        'y',
        'u',
        'i',
        'p',
        'a',
        's',
        'd',
        'f',
        'g',
        'h',
        'j',
        'k',
        'l',
        'z',
        'x',
        'c',
        'v',
        'b',
        'n',
        'm',
        'M',
        'N',
        'B',
        'V',
        'C',
        'Z',
        'A',
        'S',
        'D',
        'F',
        'G',
        'H',
        'J',
        'K',
        'L',
        'P',
        'I',
        'U',
        'Y',
        'T',
        'R',
        'E',
        'W',
        'Q',
        '!',
        '~',
        '^',
        '/',
        '(',
        ')',
        '_',
        '`',
        '\'',
        ']',
        '[',
        '{',
        '}',
        '|',
    };

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
