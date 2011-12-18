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

package org.apache.commons.sanselan.formats.wbmp;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.IndexColorModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.sanselan.ImageFormat;
import org.apache.commons.sanselan.ImageInfo;
import org.apache.commons.sanselan.ImageParser;
import org.apache.commons.sanselan.ImageReadException;
import org.apache.commons.sanselan.ImageWriteException;
import org.apache.commons.sanselan.common.IImageMetadata;
import org.apache.commons.sanselan.common.byteSources.ByteSource;

public class WbmpImageParser extends ImageParser
{
    public WbmpImageParser()
    {
    }

    public String getName()
    {
        return "Wbmp-Custom";
    }

    public String getDefaultExtension()
    {
        return DEFAULT_EXTENSION;
    }
    private static final String DEFAULT_EXTENSION = ".wbmp";
    private static final String ACCEPTED_EXTENSIONS[] =
    {
        ".wbmp",
    };

    protected String[] getAcceptedExtensions()
    {
        return ACCEPTED_EXTENSIONS;
    }

    protected ImageFormat[] getAcceptedTypes()
    {
        return new ImageFormat[]
        {
            ImageFormat.IMAGE_FORMAT_WBMP, //
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
        WbmpHeader wbmpHeader = readWbmpHeader(byteSource);
        return new ImageInfo("WBMP", 1, new ArrayList(),
                ImageFormat.IMAGE_FORMAT_WBMP,
                "Wireless Application Protocol Bitmap",
                wbmpHeader.height, "image/vnd.wap.wbmp", 1,
                0, 0, 0, 0,
                wbmpHeader.width, false, false, false,
                ImageInfo.COLOR_TYPE_BW,
                ImageInfo.COMPRESSION_ALGORITHM_NONE);
    }

    public Dimension getImageSize(ByteSource byteSource,
            Map params)
            throws ImageReadException, IOException
    {
        WbmpHeader wbmpHeader = readWbmpHeader(byteSource);
        return new Dimension(wbmpHeader.width, wbmpHeader.height);
    }

    public byte[] getICCProfileBytes(ByteSource byteSource,
            Map params)
            throws ImageReadException, IOException
    {
        return null;
    }

    static class WbmpHeader
    {
        int typeField;
        byte fixHeaderField;
        int width;
        int height;

        public WbmpHeader(int typeField, byte fixHeaderField, int width, int height)
        {
            this.typeField = typeField;
            this.fixHeaderField = fixHeaderField;
            this.width = width;
            this.height = height;
        }

        public void dump(PrintWriter pw)
        {
            pw.println("WbmpHeader");
            pw.println("TypeField: " + typeField);
            pw.println("FixHeaderField: 0x" + Integer.toHexString(0xff & fixHeaderField));
            pw.println("Width: " + width);
            pw.println("Height: " + height);
        }
    }

    private int readMultiByteInteger(InputStream is)
            throws ImageReadException, IOException
    {
        int value = 0;
        int nextByte;
        int totalBits = 0;
        do
        {
            nextByte = readByte("Header", is, "Error reading WBMP header");
            value <<= 7;
            value |= nextByte & 0x7f;
            totalBits += 7;
            if (totalBits > 31)
                throw new ImageReadException("Overflow reading WBMP multi-byte field");
        } while ((nextByte & 0x80) != 0);
        return value;
    }

    private void writeMultiByteInteger(OutputStream os, int value)
            throws ImageWriteException, IOException
    {
        boolean wroteYet = false;
        for (int position = 4*7; position > 0; position -= 7)
        {
            int next7Bits = 0x7f & (value >>> position);
            if (next7Bits != 0 || wroteYet)
            {
                os.write(0x80 | next7Bits);
                wroteYet = true;
            }
        }
        os.write(0x7f & value);
    }

    private WbmpHeader readWbmpHeader(ByteSource byteSource)
            throws ImageReadException, IOException
    {
        InputStream is = null;
        try
        {
            is = byteSource.getInputStream();
            return readWbmpHeader(is);
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

    private WbmpHeader readWbmpHeader(InputStream is)
            throws ImageReadException, IOException
    {
        int typeField = readMultiByteInteger(is);
        if (typeField != 0)
            throw new ImageReadException("Invalid/unsupported WBMP type " + typeField);

        byte fixHeaderField = readByte("FixHeaderField", is, "Invalid WBMP File");
        if ((fixHeaderField & 0x9f) != 0)
            throw new ImageReadException("Invalid/unsupported WBMP FixHeaderField 0x" +
                    Integer.toHexString(0xff & fixHeaderField));

        int width = readMultiByteInteger(is);

        int height = readMultiByteInteger(is);

        return new WbmpHeader(typeField, fixHeaderField, width, height);
    }

    public boolean dumpImageFile(PrintWriter pw, ByteSource byteSource)
            throws ImageReadException, IOException
    {
        readWbmpHeader(byteSource).dump(pw);
        return true;
    }

    private BufferedImage readImage(WbmpHeader wbmpHeader, InputStream is)
            throws ImageReadException, IOException
    {
        int rowLength = (wbmpHeader.width + 7) / 8;
        byte[] image = readByteArray("Pixels", rowLength * wbmpHeader.height, is,
                "Error reading image pixels");
        DataBufferByte dataBuffer = new DataBufferByte(image, image.length);
        WritableRaster raster = WritableRaster.createPackedRaster(dataBuffer,
                wbmpHeader.width, wbmpHeader.height, 1, null);
        int[] palette = {0x000000, 0xffffff};
        IndexColorModel colorModel = new IndexColorModel(1, 2, palette, 0,
                false, -1, DataBuffer.TYPE_BYTE);
        return new BufferedImage(colorModel, raster,
                colorModel.isAlphaPremultiplied(), new Properties());
    }

    public final BufferedImage getBufferedImage(ByteSource byteSource,
            Map params) throws ImageReadException, IOException
    {
        InputStream is = null;
        try
        {
            is = byteSource.getInputStream();
            WbmpHeader wbmpHeader = readWbmpHeader(is);
            return readImage(wbmpHeader, is);
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

        writeMultiByteInteger(os, 0); // typeField
        os.write(0); // fixHeaderField
        writeMultiByteInteger(os, src.getWidth());
        writeMultiByteInteger(os, src.getHeight());

        for (int y = 0; y < src.getHeight(); y++)
        {
            int pixel = 0;
            int nextBit = 0x80;
            for (int x = 0; x < src.getWidth(); x++)
            {
                int argb = src.getRGB(x, y);
                int red = 0xff & (argb >> 16);
                int green = 0xff & (argb >> 8);
                int blue = 0xff & (argb >> 0);
                int sample = (red + green + blue) / 3;
                if (sample > 127)
                    pixel |= nextBit;
                nextBit >>>= 1;
                if (nextBit == 0)
                {
                    os.write(pixel);
                    pixel = 0;
                    nextBit = 0x80;
                }
            }
            if (nextBit != 0x80)
                os.write(pixel);
        }
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
