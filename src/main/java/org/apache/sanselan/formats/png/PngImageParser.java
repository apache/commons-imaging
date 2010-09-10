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
package org.apache.sanselan.formats.png;

import java.awt.Dimension;
import java.awt.color.ColorSpace;
import java.awt.color.ICC_ColorSpace;
import java.awt.color.ICC_Profile;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.zip.InflaterInputStream;

import org.apache.sanselan.ColorTools;
import org.apache.sanselan.ImageFormat;
import org.apache.sanselan.ImageInfo;
import org.apache.sanselan.ImageParser;
import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.common.IImageMetadata;
import org.apache.sanselan.common.ImageMetadata;
import org.apache.sanselan.common.byteSources.ByteSource;
import org.apache.sanselan.formats.png.chunks.PNGChunk;
import org.apache.sanselan.formats.png.chunks.PNGChunkIDAT;
import org.apache.sanselan.formats.png.chunks.PNGChunkIHDR;
import org.apache.sanselan.formats.png.chunks.PNGChunkPLTE;
import org.apache.sanselan.formats.png.chunks.PNGChunkgAMA;
import org.apache.sanselan.formats.png.chunks.PNGChunkiCCP;
import org.apache.sanselan.formats.png.chunks.PNGChunkiTXt;
import org.apache.sanselan.formats.png.chunks.PNGChunkpHYs;
import org.apache.sanselan.formats.png.chunks.PNGChunktEXt;
import org.apache.sanselan.formats.png.chunks.PNGChunkzTXt;
import org.apache.sanselan.formats.png.chunks.PNGTextChunk;
import org.apache.sanselan.formats.transparencyfilters.TransparencyFilter;
import org.apache.sanselan.formats.transparencyfilters.TransparencyFilterGrayscale;
import org.apache.sanselan.formats.transparencyfilters.TransparencyFilterIndexedColor;
import org.apache.sanselan.formats.transparencyfilters.TransparencyFilterTrueColor;
import org.apache.sanselan.icc.IccProfileParser;
import org.apache.sanselan.util.Debug;
import org.apache.sanselan.util.ParamMap;

public class PngImageParser extends ImageParser implements PngConstants
{

    public PngImageParser()
    {
        // setDebug(true);
    }

    public String getName()
    {
        return "Png-Custom";
    }

    public String getDefaultExtension()
    {
        return DEFAULT_EXTENSION;
    }

    private static final String DEFAULT_EXTENSION = ".png";

    private static final String ACCEPTED_EXTENSIONS[] = { DEFAULT_EXTENSION, };

    protected String[] getAcceptedExtensions()
    {
        return ACCEPTED_EXTENSIONS;
    }

    protected ImageFormat[] getAcceptedTypes()
    {
        return new ImageFormat[] { ImageFormat.IMAGE_FORMAT_PNG, //
        };
    }

    // private final static int tRNS = CharsToQuad('t', 'R', 'N', 's');

    public static final String getChunkTypeName(int chunkType) {
        StringBuffer result = new StringBuffer();
        result.append((char) (0xff & (chunkType >> 24)));
        result.append((char) (0xff & (chunkType >> 16)));
        result.append((char) (0xff & (chunkType >> 8)));
        result.append((char) (0xff & (chunkType >> 0)));
        return result.toString();
    }

    /**
     * @return List of String-formatted chunk types, ie. "tRNs".
     */
    public List getChuckTypes(InputStream is) throws ImageReadException, IOException {
        List chunks = readChunks(is, null, false);
        List chunkTypes = new ArrayList();
        for (int i=0; i<chunks.size(); i++) {
            PNGChunk chunk = (PNGChunk) chunks.get(i);
            chunkTypes.add(getChunkTypeName(chunk.chunkType));
        }
        return chunkTypes;
    }

    public boolean hasChuckType(ByteSource byteSource, int chunkType) throws ImageReadException, IOException
    {
        InputStream is = null;

        try
        {
            is = byteSource.getInputStream();

            ArrayList chunks = null;

            readSignature(is);
            chunks = readChunks(is, new int[] { chunkType, }, true);
            return chunks.size() > 0;
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


    private boolean keepChunk(int ChunkType, int chunkTypes[])
    {
        // System.out.println("keepChunk: ");
        if (chunkTypes == null)
            return true;

        for (int i = 0; i < chunkTypes.length; i++)
        {
            if (chunkTypes[i] == ChunkType)
                return true;
        }
        return false;
    }

    private ArrayList readChunks(InputStream is, int chunkTypes[],
            boolean returnAfterFirst) throws ImageReadException, IOException
    {
        ArrayList result = new ArrayList();

        while (true)
        {
            if (debug)
                System.out.println("");

            int length = read4Bytes("Length", is, "Not a Valid PNG File");
            int chunkType = read4Bytes("ChunkType", is, "Not a Valid PNG File");

            if (debug)
            {
                printCharQuad("ChunkType", chunkType);
                debugNumber("Length", length, 4);
            }
            boolean keep = keepChunk(chunkType, chunkTypes);

            byte bytes[] = null;
            if (keep)
            {
                bytes = readByteArray("Chunk Data", length, is,
                        "Not a Valid PNG File: Couldn't read Chunk Data.");
            } else
                skipBytes(is, length, "Not a Valid PNG File");

            if (debug)
                if (bytes != null)
                    debugNumber("bytes", bytes.length, 4);

            int CRC = read4Bytes("CRC", is, "Not a Valid PNG File");

            if (keep)
            {
                if (chunkType == iCCP)
                    result.add(new PNGChunkiCCP(length, chunkType, CRC, bytes));
                else if (chunkType == tEXt)
                    result.add(new PNGChunktEXt(length, chunkType, CRC, bytes));
                else if (chunkType == zTXt)
                    result.add(new PNGChunkzTXt(length, chunkType, CRC, bytes));
                else if (chunkType == IHDR)
                    result.add(new PNGChunkIHDR(length, chunkType, CRC, bytes));
                else if (chunkType == PLTE)
                    result.add(new PNGChunkPLTE(length, chunkType, CRC, bytes));
                else if (chunkType == pHYs)
                    result.add(new PNGChunkpHYs(length, chunkType, CRC, bytes));
                else if (chunkType == IDAT)
                    result.add(new PNGChunkIDAT(length, chunkType, CRC, bytes));
                else if (chunkType == gAMA)
                    result.add(new PNGChunkgAMA(length, chunkType, CRC, bytes));
                else if (chunkType == iTXt)
                    result.add(new PNGChunkiTXt(length, chunkType, CRC, bytes));
                else
                    result.add(new PNGChunk(length, chunkType, CRC, bytes));

                if (returnAfterFirst)
                    return result;
            }

            if (chunkType == IEND)
                break;

        }

        return result;

    }

    public void readSignature(InputStream is) throws ImageReadException,
            IOException
    {
        readAndVerifyBytes(is, PNG_Signature,
                "Not a Valid PNG Segment: Incorrect Signature");

    }

    private ArrayList readChunks(ByteSource byteSource, int chunkTypes[],
            boolean returnAfterFirst) throws ImageReadException, IOException
    {
        InputStream is = null;

        try
        {
            is = byteSource.getInputStream();

            ArrayList chunks = null;

            readSignature(is);
            chunks = readChunks(is, chunkTypes, returnAfterFirst);
            return chunks;
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
        ArrayList chunks = readChunks(byteSource, new int[] { iCCP, }, true);

        if ((chunks == null) || (chunks.size() < 1))
        {
            // throw new ImageReadException("Png: No chunks");
            return null;
        }

        if (chunks.size() > 1)
            throw new ImageReadException(
                    "PNG contains more than one ICC Profile ");

        PNGChunkiCCP pngChunkiCCP = (PNGChunkiCCP) chunks.get(0);
        byte bytes[] = pngChunkiCCP.UncompressedProfile;

        return (bytes);
    }

    public Dimension getImageSize(ByteSource byteSource, Map params)
            throws ImageReadException, IOException
    {
        ArrayList chunks = readChunks(byteSource, new int[] { IHDR, }, true);

        if ((chunks == null) || (chunks.size() < 1))
            throw new ImageReadException("Png: No chunks");

        if (chunks.size() > 1)
            throw new ImageReadException("PNG contains more than one Header");

        PNGChunkIHDR pngChunkIHDR = (PNGChunkIHDR) chunks.get(0);

        return new Dimension(pngChunkIHDR.width, pngChunkIHDR.height);
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
        ArrayList chunks = readChunks(byteSource, new int[] { tEXt, zTXt, },
                true);

        if ((chunks == null) || (chunks.size() < 1))
            return null;

        ImageMetadata result = new ImageMetadata();

        for (int i = 0; i < chunks.size(); i++)
        {
            PNGTextChunk chunk = (PNGTextChunk) chunks.get(i);

            result.add(chunk.getKeyword(), chunk.getText());
        }

        return result;
    }

    private boolean isGrayscale(int colorType) throws ImageReadException
    {
        // Color type is a single-byte integer that describes the interpretation
        // of the
        // image data. Color type codes represent sums of the following values:
        // 1 (palette used), 2 (color used), and 4 (alpha channel used).
        // Valid values are 0, 2, 3, 4, and 6.
        //
        // Bit depth restrictions for each color type are imposed to simplify
        // implementations
        // and to prohibit combinations that do not compress well. Decoders must
        // support all
        // valid combinations of bit depth and color type. The allowed
        // combinations are:
        //
        // Color Allowed Interpretation
        // Type Bit Depths
        //
        // 0 1,2,4,8,16 Each pixel is a grayscale sample.
        //
        // 2 8,16 Each pixel is an R,G,B triple.
        //
        // 3 1,2,4,8 Each pixel is a palette index;
        // a PLTE chunk must appear.
        //
        // 4 8,16 Each pixel is a grayscale sample,
        // followed by an alpha sample.
        //
        // 6 8,16 Each pixel is an R,G,B triple,
        // followed by an alpha sample.
        switch (colorType)
        {
        case COLOR_TYPE_GREYSCALE:
            return true;
        case COLOR_TYPE_TRUE_COLOR:
            return false;
        case COLOR_TYPE_INDEXED_COLOR:
            return false;
        case COLOR_TYPE_GREYSCALE_WITH_ALPHA:
            return true;
        case COLOR_TYPE_TRUE_COLOR_WITH_ALPHA:
            return false;
        }

        // return -1;
        throw new ImageReadException("PNG: unknown color type: " + colorType);
    }

    private int samplesPerPixel(int colorType) throws ImageReadException
    {
        // Color type is a single-byte integer that describes the interpretation
        // of the
        // image data. Color type codes represent sums of the following values:
        // 1 (palette used), 2 (color used), and 4 (alpha channel used).
        // Valid values are 0, 2, 3, 4, and 6.
        //
        // Bit depth restrictions for each color type are imposed to simplify
        // implementations
        // and to prohibit combinations that do not compress well. Decoders must
        // support all
        // valid combinations of bit depth and color type. The allowed
        // combinations are:
        //
        // Color Allowed Interpretation
        // Type Bit Depths
        //
        // 0 1,2,4,8,16 Each pixel is a grayscale sample.
        //
        // 2 8,16 Each pixel is an R,G,B triple.
        //
        // 3 1,2,4,8 Each pixel is a palette index;
        // a PLTE chunk must appear.
        //
        // 4 8,16 Each pixel is a grayscale sample,
        // followed by an alpha sample.
        //
        // 6 8,16 Each pixel is an R,G,B triple,
        // followed by an alpha sample.
        switch (colorType)
        {
        case COLOR_TYPE_GREYSCALE:
            return 1;
        case COLOR_TYPE_TRUE_COLOR:
            return 3;
        case COLOR_TYPE_INDEXED_COLOR:
            return 1; // is this accurate ? how may bits per index?
        case COLOR_TYPE_GREYSCALE_WITH_ALPHA:
            return 2;
        case COLOR_TYPE_TRUE_COLOR_WITH_ALPHA:
            return 4;
        }

        // return -1;
        throw new ImageReadException("PNG: unknown color type: " + colorType);
    }

    private ArrayList filterChunks(ArrayList v, int type)
    {
        ArrayList result = new ArrayList();

        for (int i = 0; i < v.size(); i++)
        {
            PNGChunk chunk = (PNGChunk) v.get(i);
            if (chunk.chunkType == type)
                result.add(chunk);
        }

        return result;
    }

    private boolean hasAlphaChannel(int ColorType) throws ImageReadException
    {
        switch (ColorType)
        {
        case COLOR_TYPE_GREYSCALE: // 1,2,4,8,16 Each pixel is a grayscale
            // sample.
        case COLOR_TYPE_TRUE_COLOR: // 8,16 Each pixel is an R,G,B triple.
        case COLOR_TYPE_INDEXED_COLOR: // 1,2,4,8 Each pixel is a palette index;
            return false;
        case COLOR_TYPE_GREYSCALE_WITH_ALPHA: // 8,16 Each pixel is a grayscale
            // sample,
            // followed by an alpha sample.
        case COLOR_TYPE_TRUE_COLOR_WITH_ALPHA: // 8,16 Each pixel is an R,G,B
            // triple,
            // followed by an alpha sample.
            return true;
        default:
            throw new ImageReadException("PNG: unknown color type: "
                    + ColorType);
        }
    }

    private String getColorTypeDescription(int ColorType)
    {
        switch (ColorType)
        {
        case COLOR_TYPE_GREYSCALE: // 1,2,4,8,16 Each pixel is a grayscale
            // sample.
            return "grayscale";
        case COLOR_TYPE_TRUE_COLOR: // 8,16 Each pixel is an R,G,B triple.
            return "rgb";
        case COLOR_TYPE_INDEXED_COLOR: // 1,2,4,8 Each pixel is a palette index;
            return "indexed rgb";
        case COLOR_TYPE_GREYSCALE_WITH_ALPHA: // 8,16 Each pixel is a grayscale
            // sample,
            // followed by an alpha sample.
            return "grayscale w/ alpha";
        case COLOR_TYPE_TRUE_COLOR_WITH_ALPHA: // 8,16 Each pixel is an R,G,B
            // triple,
            // followed by an alpha sample.
            return "RGB w/ alpha";
        default:
            return "Unknown Color Type";
        }
    }

    // TODO: I have been too casual about making inner classes subclass of
    // BinaryFileParser
    // I may not have always preserved byte order correctly.

    private TransparencyFilter getTransparencyFilter(int ColorType,
            PNGChunk pngChunktRNS) throws ImageReadException, IOException
    {
        // this.printCharQuad("pngChunktRNS.ChunkType", pngChunktRNS.ChunkType);
        // this.debugNumber("pngChunktRNS.Length", pngChunktRNS.Length);

        switch (ColorType)
        {
        case COLOR_TYPE_GREYSCALE: // 1,2,4,8,16 Each pixel is a grayscale
            // sample.
            return new TransparencyFilterGrayscale(pngChunktRNS.bytes);
        case COLOR_TYPE_TRUE_COLOR: // 8,16 Each pixel is an R,G,B triple.
            return new TransparencyFilterTrueColor(pngChunktRNS.bytes);
        case COLOR_TYPE_INDEXED_COLOR: // 1,2,4,8 Each pixel is a palette index;
            return new TransparencyFilterIndexedColor(pngChunktRNS.bytes);
        case COLOR_TYPE_GREYSCALE_WITH_ALPHA: // 8,16 Each pixel is a grayscale
            // sample,
        case COLOR_TYPE_TRUE_COLOR_WITH_ALPHA: // 8,16 Each pixel is an R,G,B
            // triple,
        default:
            throw new ImageReadException(
                    "Simple Transparency not compatible with ColorType: "
                            + ColorType);
        }
    }

    public ImageInfo getImageInfo(ByteSource byteSource, Map params)
            throws ImageReadException, IOException
    {
        ArrayList chunks = readChunks(byteSource, new int[] { IHDR, pHYs, tEXt,
                zTXt, tRNS, PLTE, iTXt, }, false);

        // if(chunks!=null)
        // System.out.println("chunks: " + chunks.size());

        if ((chunks == null) || (chunks.size() < 1))
            throw new ImageReadException("PNG: no chunks");

        ArrayList IHDRs = filterChunks(chunks, IHDR);
        if (IHDRs.size() != 1)
            throw new ImageReadException("PNG contains more than one Header");

        PNGChunkIHDR pngChunkIHDR = (PNGChunkIHDR) IHDRs.get(0);
        PNGChunk pngChunktRNS = null;

        boolean isTransparent = false;

        ArrayList tRNSs = filterChunks(chunks, tRNS);
        if (tRNSs.size() > 0)
        {
            isTransparent = true;
            pngChunktRNS = (PNGChunk) IHDRs.get(0);
        } else
            hasAlphaChannel(pngChunkIHDR.colorType);

        PNGChunkpHYs pngChunkpHYs = null;

        ArrayList pHYss = filterChunks(chunks, pHYs);
        if (pHYss.size() > 1)
            throw new ImageReadException("PNG contains more than one pHYs: "
                    + pHYss.size());
        else if (pHYss.size() == 1)
            pngChunkpHYs = (PNGChunkpHYs) pHYss.get(0);

        ArrayList tEXts = filterChunks(chunks, tEXt);
        ArrayList zTXts = filterChunks(chunks, zTXt);
        ArrayList iTXts = filterChunks(chunks, iTXt);

        {
            ArrayList comments = new ArrayList();
            List textChunks = new ArrayList();

            for (int i = 0; i < tEXts.size(); i++)
            {
                PNGChunktEXt pngChunktEXt = (PNGChunktEXt) tEXts.get(i);
                comments.add(pngChunktEXt.keyword + ": " + pngChunktEXt.text);
                textChunks.add(pngChunktEXt.getContents());
            }
            for (int i = 0; i < zTXts.size(); i++)
            {
                PNGChunkzTXt pngChunkzTXt = (PNGChunkzTXt) zTXts.get(i);
                comments.add(pngChunkzTXt.keyword + ": " + pngChunkzTXt.text);
                textChunks.add(pngChunkzTXt.getContents());
            }
            for (int i = 0; i < iTXts.size(); i++)
            {
                PNGChunkiTXt pngChunkiTXt = (PNGChunkiTXt) iTXts.get(i);
                comments.add(pngChunkiTXt.keyword + ": " + pngChunkiTXt.text);
                textChunks.add(pngChunkiTXt.getContents());
            }

            int BitsPerPixel = pngChunkIHDR.bitDepth
                    * samplesPerPixel(pngChunkIHDR.colorType);
            ImageFormat Format = ImageFormat.IMAGE_FORMAT_PNG;
            String FormatName = "PNG Portable Network Graphics";
            int Height = pngChunkIHDR.height;
            String MimeType = "image/png";
            int NumberOfImages = 1;
            int Width = pngChunkIHDR.width;
            boolean isProgressive = (pngChunkIHDR.interlaceMethod != 0);

            int PhysicalHeightDpi = -1;
            float PhysicalHeightInch = -1;
            int PhysicalWidthDpi = -1;
            float PhysicalWidthInch = -1;

            // if (pngChunkpHYs != null)
            // {
            // System.out.println("\t" + "pngChunkpHYs.UnitSpecifier: " +
            // pngChunkpHYs.UnitSpecifier );
            // System.out.println("\t" + "pngChunkpHYs.PixelsPerUnitYAxis: " +
            // pngChunkpHYs.PixelsPerUnitYAxis );
            // System.out.println("\t" + "pngChunkpHYs.PixelsPerUnitXAxis: " +
            // pngChunkpHYs.PixelsPerUnitXAxis );
            // }
            if ((pngChunkpHYs != null) && (pngChunkpHYs.UnitSpecifier == 1)) // meters
            {
                double meters_per_inch = 0.0254;

                PhysicalWidthDpi = (int) Math
                        .round(pngChunkpHYs.PixelsPerUnitXAxis
                                * meters_per_inch);
                PhysicalWidthInch = (float) ((double) Width
                        * (double) pngChunkpHYs.PixelsPerUnitXAxis * meters_per_inch);
                PhysicalHeightDpi = (int) Math
                        .round(pngChunkpHYs.PixelsPerUnitYAxis
                                * meters_per_inch);
                PhysicalHeightInch = (float) ((double) Height
                        * (double) pngChunkpHYs.PixelsPerUnitYAxis * meters_per_inch);
            }

            String FormatDetails = "Png";

            boolean usesPalette = false;

            ArrayList PLTEs = filterChunks(chunks, PLTE);
            if (PLTEs.size() > 1)
                usesPalette = true;

            int ColorType;
            switch (pngChunkIHDR.colorType)
            {
            case COLOR_TYPE_GREYSCALE: // 1,2,4,8,16 Each pixel is a grayscale
                // sample.
            case COLOR_TYPE_GREYSCALE_WITH_ALPHA: // 8,16 Each pixel is a
                // grayscale sample,
                // followed by an alpha sample.
                ColorType = ImageInfo.COLOR_TYPE_GRAYSCALE;
                break;
            case COLOR_TYPE_TRUE_COLOR: // 8,16 Each pixel is an R,G,B triple.
            case COLOR_TYPE_INDEXED_COLOR: // 1,2,4,8 Each pixel is a palette
                // index;
            case COLOR_TYPE_TRUE_COLOR_WITH_ALPHA: // 8,16 Each pixel is an
                // R,G,B triple,
                // followed by an alpha sample.
                ColorType = ImageInfo.COLOR_TYPE_RGB;
                break;
            default:
                throw new ImageReadException("Png: Unknown ColorType: "
                        + pngChunkIHDR.colorType);
            }

            String compressionAlgorithm = ImageInfo.COMPRESSION_ALGORITHM_PNG_FILTER;

            ImageInfo result = new PngImageInfo(FormatDetails, BitsPerPixel,
                    comments, Format, FormatName, Height, MimeType,
                    NumberOfImages, PhysicalHeightDpi, PhysicalHeightInch,
                    PhysicalWidthDpi, PhysicalWidthInch, Width, isProgressive,
                    isTransparent, usesPalette, ColorType,
                    compressionAlgorithm, textChunks);

            return result;
        }
    }

    public BufferedImage getBufferedImage(ByteSource byteSource, Map params)
            throws ImageReadException, IOException
    {
        boolean verbose = ParamMap.getParamBoolean(params, PARAM_KEY_VERBOSE,
                false);

        if (params.containsKey(PARAM_KEY_VERBOSE))
            params.remove(PARAM_KEY_VERBOSE);

        // if (params.size() > 0) {
        // Object firstKey = params.keySet().iterator().next();
        // throw new ImageWriteException("Unknown parameter: " + firstKey);
        // }

        ArrayList chunks = readChunks(byteSource, new int[] { IHDR, PLTE, IDAT,
                tRNS, iCCP, gAMA, sRGB, }, false);

        if ((chunks == null) || (chunks.size() < 1))
            throw new ImageReadException("PNG: no chunks");

        ArrayList IHDRs = filterChunks(chunks, IHDR);
        if (IHDRs.size() != 1)
            throw new ImageReadException("PNG contains more than one Header");

        PNGChunkIHDR pngChunkIHDR = (PNGChunkIHDR) IHDRs.get(0);

        ArrayList PLTEs = filterChunks(chunks, PLTE);
        if (PLTEs.size() > 1)
            throw new ImageReadException("PNG contains more than one Palette");

        PNGChunkPLTE pngChunkPLTE = null;
        if (PLTEs.size() == 1)
            pngChunkPLTE = (PNGChunkPLTE) PLTEs.get(0);

        // -----

        ArrayList IDATs = filterChunks(chunks, IDAT);
        if (IDATs.size() < 1)
            throw new ImageReadException("PNG missing image data");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        for (int i = 0; i < IDATs.size(); i++)
        {
            PNGChunkIDAT pngChunkIDAT = (PNGChunkIDAT) IDATs.get(i);
            byte bytes[] = pngChunkIDAT.bytes;
            // System.out.println(i + ": bytes: " + bytes.length);
            baos.write(bytes);
        }

        byte compressed[] = baos.toByteArray();

        baos = null;

        TransparencyFilter transparencyFilter = null;

        ArrayList tRNSs = filterChunks(chunks, tRNS);
        if (tRNSs.size() > 0)
        {
            PNGChunk pngChunktRNS = (PNGChunk) tRNSs.get(0);
            transparencyFilter = getTransparencyFilter(pngChunkIHDR.colorType,
                    pngChunktRNS);
        }

        ICC_Profile icc_profile = null;
        GammaCorrection gammaCorrection = null;
        {
            ArrayList sRGBs = filterChunks(chunks, sRGB);
            ArrayList gAMAs = filterChunks(chunks, gAMA);
            ArrayList iCCPs = filterChunks(chunks, iCCP);
            if (sRGBs.size() > 1)
                throw new ImageReadException("PNG: unexpected sRGB chunk");
            if (gAMAs.size() > 1)
                throw new ImageReadException("PNG: unexpected gAMA chunk");
            if (iCCPs.size() > 1)
                throw new ImageReadException("PNG: unexpected iCCP chunk");

            if (sRGBs.size() == 1)
            {
                // no color management neccesary.
                if (debug)
                    System.out.println("sRGB, no color management neccesary.");
            } else if (iCCPs.size() == 1)
            {
                if (debug)
                    System.out.println("iCCP.");

                PNGChunkiCCP pngChunkiCCP = (PNGChunkiCCP) iCCPs.get(0);
                byte bytes[] = pngChunkiCCP.UncompressedProfile;

                icc_profile = ICC_Profile.getInstance(bytes);
            } else if (gAMAs.size() == 1)
            {
                PNGChunkgAMA pngChunkgAMA = (PNGChunkgAMA) gAMAs.get(0);
                double gamma = pngChunkgAMA.getGamma();

                // charles: what is the correct target value here?
                // double targetGamma = 2.2;
                double targetGamma = 1.0;
                double diff = Math.abs(targetGamma - gamma);
                if (diff >= 0.5)
                    gammaCorrection = new GammaCorrection(gamma, targetGamma);

                if (gammaCorrection != null)
                    if (pngChunkPLTE != null)
                        pngChunkPLTE.correct(gammaCorrection);

            }
        }

        {
            int width = pngChunkIHDR.width;
            int height = pngChunkIHDR.height;
            int colorType = pngChunkIHDR.colorType;
            int bitDepth = pngChunkIHDR.bitDepth;

            int bitsPerSample = bitDepth;

            if (pngChunkIHDR.filterMethod != 0)
                throw new ImageReadException("PNG: unknown FilterMethod: "
                        + pngChunkIHDR.filterMethod);

            int samplesPerPixel = samplesPerPixel(pngChunkIHDR.colorType);
            boolean isGrayscale = isGrayscale(pngChunkIHDR.colorType);

            int bitsPerPixel = bitsPerSample * samplesPerPixel;

            boolean hasAlpha = colorType == COLOR_TYPE_GREYSCALE_WITH_ALPHA
                    || colorType == COLOR_TYPE_TRUE_COLOR_WITH_ALPHA;

            BufferedImage result;
            if (isGrayscale)
                result = getBufferedImageFactory(params)
                        .getGrayscaleBufferedImage(width, height, hasAlpha);
            else
                result = getBufferedImageFactory(params).getColorBufferedImage(
                        width, height, hasAlpha);

            ByteArrayInputStream bais = new ByteArrayInputStream(compressed);
            InflaterInputStream iis = new InflaterInputStream(bais);

            ScanExpediter scanExpediter;

            if (pngChunkIHDR.interlaceMethod == 0)
                scanExpediter = new ScanExpediterSimple(width, height, iis,
                        result, colorType, bitDepth, bitsPerPixel,
                        pngChunkPLTE, gammaCorrection, transparencyFilter);
            else if (pngChunkIHDR.interlaceMethod == 1)
                scanExpediter = new ScanExpediterInterlaced(width, height, iis,
                        result, colorType, bitDepth, bitsPerPixel,
                        pngChunkPLTE, gammaCorrection, transparencyFilter);
            else
                throw new ImageReadException("Unknown InterlaceMethod: "
                        + pngChunkIHDR.interlaceMethod);

            scanExpediter.drive();

            if (icc_profile != null)
            {
                Boolean is_srgb = new IccProfileParser().issRGB(icc_profile);
                if (is_srgb == null || !is_srgb.booleanValue())
                {
                    ICC_ColorSpace cs = new ICC_ColorSpace(icc_profile);

                    ColorModel srgbCM = ColorModel.getRGBdefault();
                    ColorSpace cs_sRGB = srgbCM.getColorSpace();

                    result = new ColorTools().convertBetweenColorSpaces(result,
                            cs, cs_sRGB);
                }
            }

            return result;

        }

    }

    public boolean dumpImageFile(PrintWriter pw, ByteSource byteSource)
            throws ImageReadException, IOException
    {
        ImageInfo imageInfo = getImageInfo(byteSource);
        if (imageInfo == null)
            return false;

        imageInfo.toString(pw, "");

        {
            ArrayList chunks = readChunks(byteSource, null, false);
            {
                ArrayList IHDRs = filterChunks(chunks, IHDR);
                if (IHDRs.size() != 1)
                {
                    if (debug)
                        System.out.println("PNG contains more than one Header");
                    return false;
                }
                PNGChunkIHDR pngChunkIHDR = (PNGChunkIHDR) IHDRs.get(0);
                pw.println("Color: "
                        + getColorTypeDescription(pngChunkIHDR.colorType));
            }

            pw.println("chunks: " + chunks.size());

            if ((chunks.size() < 1))
                return false;

            for (int i = 0; i < chunks.size(); i++)
            {
                PNGChunk chunk = (PNGChunk) chunks.get(i);
                printCharQuad(pw, "\t" + i + ": ", chunk.chunkType);
            }
        }

        pw.println("");

        pw.flush();

        return true;
    }

    public void writeImage(BufferedImage src, OutputStream os, Map params)
            throws ImageWriteException, IOException
    {
        new PngWriter(params).writeImage(src, os, params);
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

        List chunks = readChunks(byteSource, new int[] { iTXt, }, false);

        if ((chunks == null) || (chunks.size() < 1))
            return null;

        List xmpChunks = new ArrayList();
        for (int i = 0; i < chunks.size(); i++)
        {
            PNGChunkiTXt chunk = (PNGChunkiTXt) chunks.get(i);
            if (!chunk.getKeyword().equals(XMP_KEYWORD))
                continue;
            xmpChunks.add(chunk);
        }

        if (xmpChunks.size() < 1)
            return null;
        if (xmpChunks.size() > 1)
            throw new ImageReadException(
                    "PNG contains more than one XMP chunk.");

        PNGChunkiTXt chunk = (PNGChunkiTXt) xmpChunks.get(0);
        return chunk.getText();
    }

}
