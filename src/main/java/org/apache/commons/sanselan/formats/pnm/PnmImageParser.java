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
package org.apache.commons.sanselan.formats.pnm;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.sanselan.ImageFormat;
import org.apache.commons.sanselan.ImageInfo;
import org.apache.commons.sanselan.ImageParser;
import org.apache.commons.sanselan.ImageReadException;
import org.apache.commons.sanselan.ImageWriteException;
import org.apache.commons.sanselan.common.IImageMetadata;
import org.apache.commons.sanselan.common.bytesource.ByteSource;
import org.apache.commons.sanselan.util.Debug;

public class PnmImageParser extends ImageParser implements PnmConstants
{

    public PnmImageParser()
    {
        super.setByteOrder(BYTE_ORDER_LSB);
        // setDebug(true);
    }

    public String getName()
    {
        return "Pbm-Custom";
    }

    public String getDefaultExtension()
    {
        return DEFAULT_EXTENSION;
    }

    private static final String DEFAULT_EXTENSION = ".pnm";

    private static final String ACCEPTED_EXTENSIONS[] = { ".pbm", ".pgm",
            ".ppm", ".pnm", };

    protected String[] getAcceptedExtensions()
    {
        return ACCEPTED_EXTENSIONS;
    }

    protected ImageFormat[] getAcceptedTypes()
    {
        return new ImageFormat[] { ImageFormat.IMAGE_FORMAT_PBM, //
                ImageFormat.IMAGE_FORMAT_PGM, //
                ImageFormat.IMAGE_FORMAT_PPM, //
                ImageFormat.IMAGE_FORMAT_PNM, };
    }

    private FileInfo readHeader(InputStream is) throws ImageReadException,
            IOException
    {
        byte identifier1 = readByte("Identifier1", is, "Not a Valid PNM File");
        byte identifier2 = readByte("Identifier2", is, "Not a Valid PNM File");

        WhiteSpaceReader wsr = new WhiteSpaceReader(is);

        int width = Integer.parseInt(wsr.readtoWhiteSpace());
        int height = Integer.parseInt(wsr.readtoWhiteSpace());

        // System.out.println("width: " + width);
        // System.out.println("height: " + height);
        // System.out.println("width*height: " + width * height);
        // System.out.println("3*width*height: " + 3 * width * height);
        // System.out.println("((width*height+7)/8): "
        // + ((width * height + 7) / 8));

        if (identifier1 != PNM_PREFIX_BYTE)
            throw new ImageReadException("PNM file has invalid header.");

        if (identifier2 == PBM_TEXT_CODE)
            return new PbmFileInfo(width, height, false);
        else if (identifier2 == PBM_RAW_CODE)
            return new PbmFileInfo(width, height, true);
        else if (identifier2 == PGM_TEXT_CODE)
        {
            int maxgray = Integer.parseInt(wsr.readtoWhiteSpace());
            return new PgmFileInfo(width, height, false, maxgray);
        } else if (identifier2 == PGM_RAW_CODE)
        {
            int maxgray = Integer.parseInt(wsr.readtoWhiteSpace());
            return new PgmFileInfo(width, height, true, maxgray);
        } else if (identifier2 == PPM_TEXT_CODE)
        {
            int max = Integer.parseInt(wsr.readtoWhiteSpace());
            return new PpmFileInfo(width, height, false, max);
        } else if (identifier2 == PPM_RAW_CODE)
        {
            int max = Integer.parseInt(wsr.readtoWhiteSpace());
            // System.out.println("max: " + max);
            return new PpmFileInfo(width, height, true, max);
        } else
            throw new ImageReadException("PNM file has invalid header.");
    }

    private FileInfo readHeader(ByteSource byteSource)
            throws ImageReadException, IOException
    {
        InputStream is = null;

        try
        {
            is = byteSource.getInputStream();

            return readHeader(is);
        } finally
        {
            try
            {
                if (is != null) {
                    is.close();
                }
            } catch (Exception e)
            {
                Debug.debug(e);
            }
        }
    }

    public byte[] getICCProfileBytes(ByteSource byteSource, Map params)
            throws ImageReadException, IOException
    {
        return null;
    }

    public Dimension getImageSize(ByteSource byteSource, Map params)
            throws ImageReadException, IOException
    {
        FileInfo info = readHeader(byteSource);

        if (info == null)
            throw new ImageReadException("PNM: Couldn't read Header");

        return new Dimension(info.width, info.height);
    }

    public byte[] embedICCProfile(byte image[], byte profile[])
    {
        return null;
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
        FileInfo info = readHeader(byteSource);

        if (info == null)
            throw new ImageReadException("PNM: Couldn't read Header");

        ArrayList Comments = new ArrayList();

        int BitsPerPixel = info.getBitDepth() * info.getNumComponents();
        ImageFormat Format = info.getImageType();
        String FormatName = info.getImageTypeDescription();
        String MimeType = info.getMIMEType();
        int NumberOfImages = 1;
        boolean isProgressive = false;

        // boolean isProgressive = (fPNGChunkIHDR.InterlaceMethod != 0);
        //
        int PhysicalWidthDpi = 72;
        float PhysicalWidthInch = (float) ((double) info.width / (double) PhysicalWidthDpi);
        int PhysicalHeightDpi = 72;
        float PhysicalHeightInch = (float) ((double) info.height / (double) PhysicalHeightDpi);

        String FormatDetails = info.getImageTypeDescription();

        boolean isTransparent = false;
        boolean usesPalette = false;

        int ColorType = info.getColorType();
        String compressionAlgorithm = ImageInfo.COMPRESSION_ALGORITHM_NONE;

        ImageInfo result = new ImageInfo(FormatDetails, BitsPerPixel, Comments,
                Format, FormatName, info.height, MimeType, NumberOfImages,
                PhysicalHeightDpi, PhysicalHeightInch, PhysicalWidthDpi,
                PhysicalWidthInch, info.width, isProgressive, isTransparent,
                usesPalette, ColorType, compressionAlgorithm);

        return result;
    }

    public boolean dumpImageFile(PrintWriter pw, ByteSource byteSource)
            throws ImageReadException, IOException
    {
        pw.println("pnm.dumpImageFile");

        {
            ImageInfo imageData = getImageInfo(byteSource);
            if (imageData == null)
                return false;

            imageData.toString(pw, "");
        }

        pw.println("");

        return true;
    }

    private int[] getColorTable(byte bytes[]) throws ImageReadException,
            IOException
    {
        if ((bytes.length % 3) != 0)
            throw new ImageReadException("Bad Color Table Length: "
                    + bytes.length);
        int length = bytes.length / 3;

        int result[] = new int[length];

        for (int i = 0; i < length; i++)
        {
            int red = 0xff & bytes[(i * 3) + 0];
            int green = 0xff & bytes[(i * 3) + 1];
            int blue = 0xff & bytes[(i * 3) + 2];

            int alpha = 0xff;

            int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);
            result[i] = rgb;
        }

        return result;
    }

    public BufferedImage getBufferedImage(ByteSource byteSource, Map params)
            throws ImageReadException, IOException
    {
        InputStream is = null;

        try
        {
            is = byteSource.getInputStream();

            FileInfo info = readHeader(is);

            int width = info.width;
            int height = info.height;

            boolean hasAlpha = false;
            BufferedImage result = getBufferedImageFactory(params)
                    .getColorBufferedImage(width, height, hasAlpha);

            info.readImage(result, is);

            return result;
        } finally
        {
            try
            {
                if (is != null) {
                    is.close();
                }
            } catch (Exception e)
            {
                Debug.debug(e);
            }
        }
    }

    public static final String PARAM_KEY_PNM_RAWBITS = "PNM_RAWBITS";
    public static final String PARAM_VALUE_PNM_RAWBITS_YES = "YES";
    public static final String PARAM_VALUE_PNM_RAWBITS_NO = "NO";

    public void writeImage(BufferedImage src, OutputStream os, Map params)
            throws ImageWriteException, IOException
    {
        PnmWriter writer = null;
        boolean useRawbits = true;

        if (params != null)
        {
            Object useRawbitsParam = params.get(PARAM_KEY_PNM_RAWBITS);
            if (useRawbitsParam != null)
            {
                if (useRawbitsParam.equals(PARAM_VALUE_PNM_RAWBITS_NO))
                    useRawbits = false;
            }

            Object subtype = params.get(PARAM_KEY_FORMAT);
            if (subtype != null)
            {
                if (subtype.equals(ImageFormat.IMAGE_FORMAT_PBM))
                    writer = new PbmWriter(useRawbits);
                else if (subtype.equals(ImageFormat.IMAGE_FORMAT_PGM))
                    writer = new PgmWriter(useRawbits);
                else if (subtype.equals(ImageFormat.IMAGE_FORMAT_PPM))
                    writer = new PpmWriter(useRawbits);
            }
        }

        if (writer == null)
            writer = new PpmWriter(useRawbits);

        // make copy of params; we'll clear keys as we consume them.
        params = new HashMap(params);

        // clear format key.
        if (params.containsKey(PARAM_KEY_FORMAT))
            params.remove(PARAM_KEY_FORMAT);

        if (params.size() > 0)
        {
            Object firstKey = params.keySet().iterator().next();
            throw new ImageWriteException("Unknown parameter: " + firstKey);
        }

        writer.writeImage(src, os, params);
    }

    /**
     * Extracts embedded XML metadata as XML string.
     * <p>
     *
     * @param byteSource
     *            File containing image data.
     * @param params
     *            Map of optional parameters, defined in SanselanConstants.
     * @return Xmp Xml as String, if present. Otherwise, returns null.
     */
    public String getXmpXml(ByteSource byteSource, Map params)
            throws ImageReadException, IOException
    {
        return null;
    }
}