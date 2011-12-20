/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.sanselan.formats.icns;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.sanselan.ImageFormat;
import org.apache.commons.sanselan.ImageInfo;
import org.apache.commons.sanselan.ImageParser;
import org.apache.commons.sanselan.ImageReadException;
import org.apache.commons.sanselan.ImageWriteException;
import org.apache.commons.sanselan.common.BinaryOutputStream;
import org.apache.commons.sanselan.common.IImageMetadata;
import org.apache.commons.sanselan.common.bytesource.ByteSource;
import org.apache.commons.sanselan.util.Debug;
import org.apache.commons.sanselan.util.ParamMap;

public class IcnsImageParser extends ImageParser
{
    public static final int ICNS_MAGIC = IcnsType.typeAsInt("icns");

    public IcnsImageParser()
    {
        super.setByteOrder(BYTE_ORDER_MSB);
    }

    public String getName()
    {
        return "icns-Custom";
    }

    public String getDefaultExtension()
    {
        return DEFAULT_EXTENSION;
    }

    private static final String DEFAULT_EXTENSION = ".icns";

    private static final String ACCEPTED_EXTENSIONS[] = {
            ".icns",
    };

    protected String[] getAcceptedExtensions()
    {
        return ACCEPTED_EXTENSIONS;
    }

    protected ImageFormat[] getAcceptedTypes()
    {
        return new ImageFormat[]{
            ImageFormat.IMAGE_FORMAT_ICNS
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
        // make copy of params; we'll clear keys as we consume them.
        params = (params == null) ? new HashMap() : new HashMap(params);

        boolean verbose = ParamMap.getParamBoolean(params, PARAM_KEY_VERBOSE,
                false);

        if (params.containsKey(PARAM_KEY_VERBOSE))
            params.remove(PARAM_KEY_VERBOSE);

        if (params.size() > 0)
        {
            Object firstKey = params.keySet().iterator().next();
            throw new ImageReadException("Unknown parameter: " + firstKey);
        }

        IcnsContents contents = readImage(byteSource);
        List<BufferedImage> images = IcnsDecoder.decodeAllImages(contents.icnsElements);
        if (images.isEmpty())
            throw new ImageReadException("No icons in ICNS file");
        BufferedImage image0 = images.get(0);
        return new ImageInfo("Icns", 32, new ArrayList<String>(), ImageFormat.IMAGE_FORMAT_ICNS,
                "ICNS Apple Icon Image", image0.getHeight(), "image/x-icns", images.size(),
                0, 0, 0, 0, image0.getWidth(), false, true, false, ImageInfo.COLOR_TYPE_RGB,
                ImageInfo.COMPRESSION_ALGORITHM_UNKNOWN);
    }

    public Dimension getImageSize(ByteSource byteSource,
            Map params)
            throws ImageReadException, IOException
    {
        // make copy of params; we'll clear keys as we consume them.
        params = (params == null) ? new HashMap() : new HashMap(params);

        boolean verbose = ParamMap.getParamBoolean(params, PARAM_KEY_VERBOSE,
                false);

        if (params.containsKey(PARAM_KEY_VERBOSE))
            params.remove(PARAM_KEY_VERBOSE);

        if (params.size() > 0)
        {
            Object firstKey = params.keySet().iterator().next();
            throw new ImageReadException("Unknown parameter: " + firstKey);
        }

        IcnsContents contents = readImage(byteSource);
        List<BufferedImage> images = IcnsDecoder.decodeAllImages(contents.icnsElements);
        if (images.isEmpty())
            throw new ImageReadException("No icons in ICNS file");
        BufferedImage image0 = images.get(0);
        return new Dimension(image0.getWidth(), image0.getHeight());
    }

    public byte[] getICCProfileBytes(ByteSource byteSource,
            Map params)
            throws ImageReadException, IOException
    {
        return null;
    }

    private static class IcnsHeader
    {
        public final int magic; // Magic literal (4 bytes), always "icns"
        public final int fileSize; // Length of file (4 bytes), in bytes.

        public IcnsHeader(final int magic, final int fileSize)
        {
            this.magic = magic;
            this.fileSize = fileSize;
        }

        public void dump(PrintWriter pw)
        {
            pw.println("IcnsHeader");
            pw.println("Magic: 0x" + Integer.toHexString(magic) +
                    " (" + IcnsType.describeType(magic) + ")");
            pw.println("FileSize: " + fileSize);
            pw.println("");
        }
    }

    private IcnsHeader readIcnsHeader(InputStream is)
            throws ImageReadException, IOException
    {
        int Magic = read4Bytes("Magic", is, "Not a Valid ICNS File");
        int FileSize = read4Bytes("FileSize", is, "Not a Valid ICNS File");

        if (Magic != ICNS_MAGIC)
            throw new ImageReadException("Not a Valid ICNS File: " +
                    "magic is 0x" + Integer.toHexString(Magic));

        return new IcnsHeader(Magic, FileSize);
    }

    public static class IcnsElement
    {
        public final int type;
        public final int elementSize;
        public final byte[] data;

        public IcnsElement(final int type, final int elementSize, byte[] data)
        {
            this.type = type;
            this.elementSize = elementSize;
            this.data = data;
        }

        public void dump(PrintWriter pw)
        {
            pw.println("IcnsElement");
            IcnsType icnsType = IcnsType.findAnyType(type);
            String typeDescription;
            if (icnsType == null)
                typeDescription = "";
            else
                typeDescription = " " + icnsType.toString();
            pw.println("Type: 0x" + Integer.toHexString(type) +
                    " (" + IcnsType.describeType(type) + ")" +
                    typeDescription);
            pw.println("ElementSize: " + elementSize);
            pw.println("");
        }
    }

    private IcnsElement readIcnsElement(InputStream is) throws IOException
    {
        int type = read4Bytes("Type", is, "Not a Valid ICNS File"); // Icon type (4 bytes)
        int elementSize = read4Bytes("ElementSize", is, "Not a Valid ICNS File"); // Length of data (4 bytes), in bytes, including this header
        byte[] data = readByteArray("Data", elementSize - 8, is, "Not a Valid ICNS File");

        return new IcnsElement(type, elementSize, data);
    }

    private static class IcnsContents
    {
        public final IcnsHeader icnsHeader;
        public final IcnsElement icnsElements[];

        public IcnsContents(final IcnsHeader icnsHeader,
                final IcnsElement[] icnsElements)
        {
            super();
            this.icnsHeader = icnsHeader;
            this.icnsElements = icnsElements;
        }
    }

    private IcnsContents readImage(ByteSource byteSource)
            throws ImageReadException, IOException
    {
        InputStream is = null;
        try
        {
            is = byteSource.getInputStream();
            IcnsHeader icnsHeader = readIcnsHeader(is);

            List<IcnsElement> icnsElementList = new ArrayList<IcnsElement>();
            for (int remainingSize = icnsHeader.fileSize - 8;
                remainingSize > 0; )
            {
                IcnsElement icnsElement = readIcnsElement(is);
                icnsElementList.add(icnsElement);
                remainingSize -= icnsElement.elementSize;
            }

            IcnsElement[] icnsElements = new IcnsElement[icnsElementList.size()];
            for (int i = 0; i < icnsElements.length; i++)
                icnsElements[i] = icnsElementList.get(i);

            return new IcnsContents(icnsHeader, icnsElements);
        }
        finally
        {
            try
            {
                is.close();
            }
            catch (Exception e)
            {
                Debug.debug(e);
            }
        }
    }

    public boolean dumpImageFile(PrintWriter pw, ByteSource byteSource)
            throws ImageReadException, IOException
    {
        IcnsContents icnsContents = readImage(byteSource);
        icnsContents.icnsHeader.dump(pw);
        for (int i = 0; i < icnsContents.icnsElements.length; i++)
            icnsContents.icnsElements[i].dump(pw);
        return true;
    }

    public final BufferedImage getBufferedImage(ByteSource byteSource,
            Map params) throws ImageReadException, IOException
    {
        IcnsContents icnsContents = readImage(byteSource);
        List<BufferedImage> result = IcnsDecoder.decodeAllImages(icnsContents.icnsElements);
        if (result.size() > 0)
            return result.get(0);
        else
            throw new ImageReadException("No icons in ICNS file");
    }

    public List<BufferedImage> getAllBufferedImages(ByteSource byteSource)
            throws ImageReadException, IOException
    {
        IcnsContents icnsContents = readImage(byteSource);
        return IcnsDecoder.decodeAllImages(icnsContents.icnsElements);
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

        IcnsType imageType;
        if (src.getWidth() == 16 && src.getHeight() == 16)
            imageType = IcnsType.ICNS_16x16_32BIT_IMAGE;
        else if (src.getWidth() == 32 && src.getHeight() == 32)
            imageType = IcnsType.ICNS_32x32_32BIT_IMAGE;
        else if (src.getWidth() == 48 && src.getHeight() == 48)
            imageType = IcnsType.ICNS_48x48_32BIT_IMAGE;
        else if (src.getWidth() == 128 && src.getHeight() == 128)
            imageType = IcnsType.ICNS_128x128_32BIT_IMAGE;
        else
            throw new ImageWriteException("Invalid/unsupported source width " +
                    src.getWidth() + " and height " + src.getHeight());

        BinaryOutputStream bos = new BinaryOutputStream(os, BYTE_ORDER_BIG_ENDIAN);
        bos.write4Bytes(ICNS_MAGIC);
        bos.write4Bytes(4 + 4 + 4 + 4 + 4*imageType.getWidth()*imageType.getHeight() +
                4 + 4 + imageType.getWidth()*imageType.getHeight());

        bos.write4Bytes(imageType.getType());
        bos.write4Bytes(4 + 4 + 4*imageType.getWidth()*imageType.getHeight());
        for (int y = 0; y < src.getHeight(); y++)
        {
            for (int x = 0; x < src.getWidth(); x++)
            {
                int argb = src.getRGB(x, y);
                bos.write(0);
                bos.write(argb >> 16);
                bos.write(argb >> 8);
                bos.write(argb);
            }
        }

        IcnsType maskType = IcnsType.find8BPPMaskType(imageType);
        bos.write4Bytes(maskType.getType());
        bos.write4Bytes(4 + 4 + imageType.getWidth()*imageType.getWidth());
        for (int y = 0; y < src.getHeight(); y++)
        {
            for (int x = 0; x < src.getWidth(); x++)
            {
                int argb = src.getRGB(x, y);
                bos.write(argb >> 24);
            }
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
