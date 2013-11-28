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
package org.apache.commons.imaging.formats.png;

import java.awt.Dimension;
import java.awt.color.ColorSpace;
import java.awt.color.ICC_ColorSpace;
import java.awt.color.ICC_Profile;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.zip.InflaterInputStream;

import org.apache.commons.imaging.ColorTools;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.IImageMetadata;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.formats.png.chunks.PngChunk;
import org.apache.commons.imaging.formats.png.chunks.PngChunkGama;
import org.apache.commons.imaging.formats.png.chunks.PngChunkIccp;
import org.apache.commons.imaging.formats.png.chunks.PngChunkIdat;
import org.apache.commons.imaging.formats.png.chunks.PngChunkIhdr;
import org.apache.commons.imaging.formats.png.chunks.PngChunkItxt;
import org.apache.commons.imaging.formats.png.chunks.PngChunkPhys;
import org.apache.commons.imaging.formats.png.chunks.PngChunkPlte;
import org.apache.commons.imaging.formats.png.chunks.PngChunkText;
import org.apache.commons.imaging.formats.png.chunks.PngChunkZtxt;
import org.apache.commons.imaging.formats.png.chunks.PngTextChunk;
import org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilter;
import org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilterGrayscale;
import org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilterIndexedColor;
import org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilterTrueColor;
import org.apache.commons.imaging.icc.IccProfileParser;
import org.apache.commons.imaging.util.IoUtils;

import static org.apache.commons.imaging.ImagingConstants.*;
import static org.apache.commons.imaging.common.BinaryFunctions.*;

public class PngImageParser extends ImageParser {
    private static final String DEFAULT_EXTENSION = ".png";
    private static final String[] ACCEPTED_EXTENSIONS = { DEFAULT_EXTENSION, };

    @Override
    public String getName() {
        return "Png-Custom";
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
        return new ImageFormat[] { ImageFormats.PNG, //
        };
    }

    // private final static int tRNS = CharsToQuad('t', 'R', 'N', 's');

    public static String getChunkTypeName(final int chunkType) {
        final StringBuilder result = new StringBuilder();
        result.append((char) (0xff & (chunkType >> 24)));
        result.append((char) (0xff & (chunkType >> 16)));
        result.append((char) (0xff & (chunkType >> 8)));
        result.append((char) (0xff & (chunkType >> 0)));
        return result.toString();
    }

    /**
     * @return List of String-formatted chunk types, ie. "tRNs".
     */
    public List<String> getChuckTypes(final InputStream is)
            throws ImageReadException, IOException {
        final List<PngChunk> chunks = readChunks(is, null, false);
        final List<String> chunkTypes = new ArrayList<String>();
        for (PngChunk chunk : chunks) {
            chunkTypes.add(getChunkTypeName(chunk.chunkType));
        }
        return chunkTypes;
    }

    public boolean hasChuckType(final ByteSource byteSource, final ChunkType chunkType) 
            throws ImageReadException, IOException {
        InputStream is = null;
        boolean canThrow = false;
        try {
            is = byteSource.getInputStream();

            readSignature(is);
            final List<PngChunk> chunks = readChunks(is, new ChunkType[] { chunkType }, true);
            canThrow = true;
            return !chunks.isEmpty();
        } finally {
            IoUtils.closeQuietly(canThrow, is);
        }
    }

    private boolean keepChunk(final int chunkType, final ChunkType[] chunkTypes) {
        // System.out.println("keepChunk: ");
        if (chunkTypes == null) {
            return true;
        }

        for (final ChunkType chunkType2 : chunkTypes) {
            if (chunkType2.value == chunkType) {
                return true;
            }
        }
        return false;
    }

    private List<PngChunk> readChunks(final InputStream is, final ChunkType[] chunkTypes,
            final boolean returnAfterFirst) throws ImageReadException, IOException {
        final List<PngChunk> result = new ArrayList<PngChunk>();

        while (true) {
            if (getDebug()) {
                System.out.println("");
            }

            final int length = read4Bytes("Length", is, "Not a Valid PNG File", getByteOrder());
            final int chunkType = read4Bytes("ChunkType", is, "Not a Valid PNG File", getByteOrder());

            if (getDebug()) {
                printCharQuad("ChunkType", chunkType);
                debugNumber("Length", length, 4);
            }
            final boolean keep = keepChunk(chunkType, chunkTypes);

            byte[] bytes = null;
            if (keep) {
                bytes = readBytes("Chunk Data", is, length,
                        "Not a Valid PNG File: Couldn't read Chunk Data.");
            } else {
                skipBytes(is, length, "Not a Valid PNG File");
            }

            if (getDebug()) {
                if (bytes != null) {
                    debugNumber("bytes", bytes.length, 4);
                }
            }

            final int crc = read4Bytes("CRC", is, "Not a Valid PNG File", getByteOrder());

            if (keep) {
                if (chunkType == ChunkType.iCCP.value) {
                    result.add(new PngChunkIccp(length, chunkType, crc, bytes));
                } else if (chunkType == ChunkType.tEXt.value) {
                    result.add(new PngChunkText(length, chunkType, crc, bytes));
                } else if (chunkType == ChunkType.zTXt.value) {
                    result.add(new PngChunkZtxt(length, chunkType, crc, bytes));
                } else if (chunkType == ChunkType.IHDR.value) {
                    result.add(new PngChunkIhdr(length, chunkType, crc, bytes));
                } else if (chunkType == ChunkType.PLTE.value) {
                    result.add(new PngChunkPlte(length, chunkType, crc, bytes));
                } else if (chunkType == ChunkType.pHYs.value) {
                    result.add(new PngChunkPhys(length, chunkType, crc, bytes));
                } else if (chunkType == ChunkType.IDAT.value) {
                    result.add(new PngChunkIdat(length, chunkType, crc, bytes));
                } else if (chunkType == ChunkType.gAMA.value) {
                    result.add(new PngChunkGama(length, chunkType, crc, bytes));
                } else if (chunkType == ChunkType.iTXt.value) {
                    result.add(new PngChunkItxt(length, chunkType, crc, bytes));
                } else { 
                    result.add(new PngChunk(length, chunkType, crc, bytes));
                }

                if (returnAfterFirst) {
                    return result;
                }
            }

            if (chunkType == ChunkType.IEND.value) {
                break;
            }

        }

        return result;

    }

    public void readSignature(final InputStream is) throws ImageReadException,
            IOException {
        readAndVerifyBytes(is, PngConstants.PNG_SIGNATURE,
                "Not a Valid PNG Segment: Incorrect Signature");

    }

    private List<PngChunk> readChunks(final ByteSource byteSource, final ChunkType[] chunkTypes,
            final boolean returnAfterFirst) throws ImageReadException, IOException {
        InputStream is = null;
        boolean canThrow = false;
        try {
            is = byteSource.getInputStream();

            readSignature(is);

            final List<PngChunk> ret = readChunks(is, chunkTypes, returnAfterFirst);
            canThrow = true;
            return ret;
        } finally {
            IoUtils.closeQuietly(canThrow, is);
        }
    }

    @Override
    public byte[] getICCProfileBytes(final ByteSource byteSource, final Map<String, Object> params)
            throws ImageReadException, IOException {
        final List<PngChunk> chunks = readChunks(byteSource, new ChunkType[] { ChunkType.iCCP },
                true);

        if ((chunks == null) || (chunks.isEmpty())) {
            // throw new ImageReadException("Png: No chunks");
            return null;
        }

        if (chunks.size() > 1) {
            throw new ImageReadException(
                    "PNG contains more than one ICC Profile ");
        }

        final PngChunkIccp pngChunkiCCP = (PngChunkIccp) chunks.get(0);
        final byte[] bytes = pngChunkiCCP.uncompressedProfile;

        return (bytes);
    }

    @Override
    public Dimension getImageSize(final ByteSource byteSource, final Map<String, Object> params)
            throws ImageReadException, IOException {
        final List<PngChunk> chunks = readChunks(byteSource, new ChunkType[] { ChunkType.IHDR, }, true);

        if ((chunks == null) || (chunks.isEmpty())) {
            throw new ImageReadException("Png: No chunks");
        }

        if (chunks.size() > 1) {
            throw new ImageReadException("PNG contains more than one Header");
        }

        final PngChunkIhdr pngChunkIHDR = (PngChunkIhdr) chunks.get(0);

        return new Dimension(pngChunkIHDR.width, pngChunkIHDR.height);
    }

    @Override
    public IImageMetadata getMetadata(final ByteSource byteSource, final Map<String, Object> params)
            throws ImageReadException, IOException {
        final List<PngChunk> chunks = readChunks(byteSource, new ChunkType[] { ChunkType.tEXt, ChunkType.zTXt, }, true);

        if ((chunks == null) || (chunks.isEmpty())) {
            return null;
        }

        final ImageMetadata result = new ImageMetadata();

        for (PngChunk chunk : chunks) {
            final PngTextChunk textChunk = (PngTextChunk) chunk;

            result.add(textChunk.getKeyword(), textChunk.getText());
        }

        return result;
    }

    private List<PngChunk> filterChunks(final List<PngChunk> chunks, final ChunkType type) {
        final List<PngChunk> result = new ArrayList<PngChunk>();

        for (PngChunk chunk : chunks) {
            if (chunk.chunkType == type.value) {
                result.add(chunk);
            }
        }

        return result;
    }

    // TODO: I have been too casual about making inner classes subclass of
    // BinaryFileParser
    // I may not have always preserved byte order correctly.

    private TransparencyFilter getTransparencyFilter(ColorType colorType, PngChunk pngChunktRNS)
            throws ImageReadException, IOException {
        switch (colorType) {
            case GREYSCALE: // 1,2,4,8,16 Each pixel is a grayscale sample.
                return new TransparencyFilterGrayscale(pngChunktRNS.getBytes());
            case TRUE_COLOR: // 8,16 Each pixel is an R,G,B triple.
                return new TransparencyFilterTrueColor(pngChunktRNS.getBytes());
            case INDEXED_COLOR: // 1,2,4,8 Each pixel is a palette index;
                return new TransparencyFilterIndexedColor(pngChunktRNS.getBytes());
            case GREYSCALE_WITH_ALPHA: // 8,16 Each pixel is a grayscale sample,
            case TRUE_COLOR_WITH_ALPHA: // 8,16 Each pixel is an R,G,B triple,
            default:
                throw new ImageReadException("Simple Transparency not compatible with ColorType: " + colorType);
        }
    }

    @Override
    public ImageInfo getImageInfo(final ByteSource byteSource, final Map<String, Object> params)
            throws ImageReadException, IOException {
        final List<PngChunk> chunks = readChunks(byteSource, new ChunkType[] {
                ChunkType.IHDR,
                ChunkType.pHYs,
                ChunkType.tEXt,
                ChunkType.zTXt,
                ChunkType.tRNS,
                ChunkType.PLTE,
                ChunkType.iTXt,
            }, false);

        // if(chunks!=null)
        // System.out.println("chunks: " + chunks.size());

        if ((chunks == null) || (chunks.isEmpty())) {
            throw new ImageReadException("PNG: no chunks");
        }

        final List<PngChunk> IHDRs = filterChunks(chunks, ChunkType.IHDR);
        if (IHDRs.size() != 1) {
            throw new ImageReadException("PNG contains more than one Header");
        }

        final PngChunkIhdr pngChunkIHDR = (PngChunkIhdr) IHDRs.get(0);

        boolean transparent = false;

        final List<PngChunk> tRNSs = filterChunks(chunks, ChunkType.tRNS);
        if (!tRNSs.isEmpty()) {
            transparent = true;
        } else {
            // CE - Fix Alpha.
            transparent = pngChunkIHDR.colorType.hasAlpha();
            // END FIX
        }

        PngChunkPhys pngChunkpHYs = null;

        final List<PngChunk> pHYss = filterChunks(chunks, ChunkType.pHYs);
        if (pHYss.size() > 1) {
            throw new ImageReadException("PNG contains more than one pHYs: "
                    + pHYss.size());
        } else if (pHYss.size() == 1) {
            pngChunkpHYs = (PngChunkPhys) pHYss.get(0);
        }

        final List<PngChunk> tEXts = filterChunks(chunks, ChunkType.tEXt);
        final List<PngChunk> zTXts = filterChunks(chunks, ChunkType.zTXt);
        final List<PngChunk> iTXts = filterChunks(chunks, ChunkType.iTXt);

        final List<String> comments = new ArrayList<String>();
        final List<PngText> textChunks = new ArrayList<PngText>();

        for (PngChunk tEXt : tEXts) {
            final PngChunkText pngChunktEXt = (PngChunkText) tEXt;
            comments.add(pngChunktEXt.keyword + ": " + pngChunktEXt.text);
            textChunks.add(pngChunktEXt.getContents());
        }
        for (PngChunk zTXt : zTXts) {
            final PngChunkZtxt pngChunkzTXt = (PngChunkZtxt) zTXt;
            comments.add(pngChunkzTXt.keyword + ": " + pngChunkzTXt.text);
            textChunks.add(pngChunkzTXt.getContents());
        }
        for (PngChunk iTXt : iTXts) {
            final PngChunkItxt pngChunkiTXt = (PngChunkItxt) iTXt;
            comments.add(pngChunkiTXt.keyword + ": " + pngChunkiTXt.text);
            textChunks.add(pngChunkiTXt.getContents());
        }

        final int bitsPerPixel = pngChunkIHDR.bitDepth * pngChunkIHDR.colorType.getSamplesPerPixel();
        final ImageFormat format = ImageFormats.PNG;
        final String formatName = "PNG Portable Network Graphics";
        final int height = pngChunkIHDR.height;
        final String mimeType = "image/png";
        final int numberOfImages = 1;
        final int width = pngChunkIHDR.width;
        final boolean progressive = (pngChunkIHDR.interlaceMethod != 0);

        int physicalHeightDpi = -1;
        float physicalHeightInch = -1;
        int physicalWidthDpi = -1;
        float physicalWidthInch = -1;

        // if (pngChunkpHYs != null)
        // {
        // System.out.println("\t" + "pngChunkpHYs.UnitSpecifier: " +
        // pngChunkpHYs.UnitSpecifier );
        // System.out.println("\t" + "pngChunkpHYs.PixelsPerUnitYAxis: " +
        // pngChunkpHYs.PixelsPerUnitYAxis );
        // System.out.println("\t" + "pngChunkpHYs.PixelsPerUnitXAxis: " +
        // pngChunkpHYs.PixelsPerUnitXAxis );
        // }
        if ((pngChunkpHYs != null) && (pngChunkpHYs.unitSpecifier == 1)) { // meters
            final double metersPerInch = 0.0254;

            physicalWidthDpi = (int) Math.round(pngChunkpHYs.pixelsPerUnitXAxis * metersPerInch);
            physicalWidthInch = (float) (width / (pngChunkpHYs.pixelsPerUnitXAxis * metersPerInch));
            physicalHeightDpi = (int) Math.round(pngChunkpHYs.pixelsPerUnitYAxis * metersPerInch);
            physicalHeightInch = (float) (height / (pngChunkpHYs.pixelsPerUnitYAxis * metersPerInch));
        }

        final String formatDetails = "Png";

        boolean usesPalette = false;

        final List<PngChunk> PLTEs = filterChunks(chunks, ChunkType.PLTE);
        if (PLTEs.size() > 1) {
            usesPalette = true;
        }

        int colorType;
        switch (pngChunkIHDR.colorType) {
            case GREYSCALE:
            case GREYSCALE_WITH_ALPHA:
                colorType = ImageInfo.COLOR_TYPE_GRAYSCALE;
                break;
            case TRUE_COLOR:
            case INDEXED_COLOR:
            case TRUE_COLOR_WITH_ALPHA:
                colorType = ImageInfo.COLOR_TYPE_RGB;
                break;
            default:
                throw new ImageReadException("Png: Unknown ColorType: " + pngChunkIHDR.colorType);
        }

        final String compressionAlgorithm = ImageInfo.COMPRESSION_ALGORITHM_PNG_FILTER;

        return new PngImageInfo(formatDetails, bitsPerPixel, comments,
                format, formatName, height, mimeType, numberOfImages,
                physicalHeightDpi, physicalHeightInch, physicalWidthDpi,
                physicalWidthInch, width, progressive, transparent,
                usesPalette, colorType, compressionAlgorithm, textChunks);
    }

    @Override
    public BufferedImage getBufferedImage(final ByteSource byteSource, final Map<String, Object> params)
            throws ImageReadException, IOException {

        if (params.containsKey(PARAM_KEY_VERBOSE)) {
            params.remove(PARAM_KEY_VERBOSE);
        }

        // if (params.size() > 0) {
        // Object firstKey = params.keySet().iterator().next();
        // throw new ImageWriteException("Unknown parameter: " + firstKey);
        // }

        final List<PngChunk> chunks = readChunks(byteSource, new ChunkType[] {
                ChunkType.IHDR,
                ChunkType.PLTE,
                ChunkType.IDAT,
                ChunkType.tRNS,
                ChunkType.iCCP,
                ChunkType.gAMA,
                ChunkType.sRGB,
            }, false);

        if ((chunks == null) || (chunks.isEmpty())) {
            throw new ImageReadException("PNG: no chunks");
        }

        final List<PngChunk> IHDRs = filterChunks(chunks, ChunkType.IHDR);
        if (IHDRs.size() != 1) {
            throw new ImageReadException("PNG contains more than one Header");
        }

        final PngChunkIhdr pngChunkIHDR = (PngChunkIhdr) IHDRs.get(0);

        final List<PngChunk> PLTEs = filterChunks(chunks, ChunkType.PLTE);
        if (PLTEs.size() > 1) {
            throw new ImageReadException("PNG contains more than one Palette");
        }

        PngChunkPlte pngChunkPLTE = null;
        if (PLTEs.size() == 1) {
            pngChunkPLTE = (PngChunkPlte) PLTEs.get(0);
        }

        // -----

        final List<PngChunk> IDATs = filterChunks(chunks, ChunkType.IDAT);
        if (IDATs.isEmpty()) {
            throw new ImageReadException("PNG missing image data");
        }

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        for (PngChunk IDAT : IDATs) {
            final PngChunkIdat pngChunkIDAT = (PngChunkIdat) IDAT;
            final byte[] bytes = pngChunkIDAT.getBytes();
            // System.out.println(i + ": bytes: " + bytes.length);
            baos.write(bytes);
        }

        final byte[] compressed = baos.toByteArray();

        baos = null;

        TransparencyFilter transparencyFilter = null;

        final List<PngChunk> tRNSs = filterChunks(chunks, ChunkType.tRNS);
        if (!tRNSs.isEmpty()) {
            final PngChunk pngChunktRNS = tRNSs.get(0);
            transparencyFilter = getTransparencyFilter(pngChunkIHDR.colorType, pngChunktRNS);
        }

        ICC_Profile iccProfile = null;
        GammaCorrection gammaCorrection = null;
        {
            final List<PngChunk> sRGBs = filterChunks(chunks, ChunkType.sRGB);
            final List<PngChunk> gAMAs = filterChunks(chunks, ChunkType.gAMA);
            final List<PngChunk> iCCPs = filterChunks(chunks, ChunkType.iCCP);
            if (sRGBs.size() > 1) {
                throw new ImageReadException("PNG: unexpected sRGB chunk");
            }
            if (gAMAs.size() > 1) {
                throw new ImageReadException("PNG: unexpected gAMA chunk");
            }
            if (iCCPs.size() > 1) {
                throw new ImageReadException("PNG: unexpected iCCP chunk");
            }

            if (sRGBs.size() == 1) {
                // no color management neccesary.
                if (getDebug()) {
                    System.out.println("sRGB, no color management neccesary.");
                }
            } else if (iCCPs.size() == 1) {
                if (getDebug()) {
                    System.out.println("iCCP.");
                }

                final PngChunkIccp pngChunkiCCP = (PngChunkIccp) iCCPs.get(0);
                final byte[] bytes = pngChunkiCCP.uncompressedProfile;

                iccProfile = ICC_Profile.getInstance(bytes);
            } else if (gAMAs.size() == 1) {
                final PngChunkGama pngChunkgAMA = (PngChunkGama) gAMAs.get(0);
                final double gamma = pngChunkgAMA.getGamma();

                // charles: what is the correct target value here?
                // double targetGamma = 2.2;
                final double targetGamma = 1.0;
                final double diff = Math.abs(targetGamma - gamma);
                if (diff >= 0.5) {
                    gammaCorrection = new GammaCorrection(gamma, targetGamma);
                }

                if (gammaCorrection != null) {
                    if (pngChunkPLTE != null) {
                        pngChunkPLTE.correct(gammaCorrection);
                    }
                }

            }
        }

        {
            final int width = pngChunkIHDR.width;
            final int height = pngChunkIHDR.height;
            final ColorType colorType = pngChunkIHDR.colorType;
            final int bitDepth = pngChunkIHDR.bitDepth;

            if (pngChunkIHDR.filterMethod != 0) {
                throw new ImageReadException("PNG: unknown FilterMethod: " + pngChunkIHDR.filterMethod);
            }

            final int bitsPerPixel = bitDepth * colorType.getSamplesPerPixel();

            final boolean hasAlpha = colorType.hasAlpha() || transparencyFilter != null;

            BufferedImage result;
            if (colorType.isGreyscale()) {
                result = getBufferedImageFactory(params).getGrayscaleBufferedImage(width, height, hasAlpha);
            } else {
                result = getBufferedImageFactory(params).getColorBufferedImage(width, height, hasAlpha);
            }

            final ByteArrayInputStream bais = new ByteArrayInputStream(compressed);
            final InflaterInputStream iis = new InflaterInputStream(bais);

            ScanExpediter scanExpediter;

            if (pngChunkIHDR.interlaceMethod == 0) {
                scanExpediter = new ScanExpediterSimple(width, height, iis,
                        result, colorType, bitDepth, bitsPerPixel,
                        pngChunkPLTE, gammaCorrection, transparencyFilter);
            } else if (pngChunkIHDR.interlaceMethod == 1) {
                scanExpediter = new ScanExpediterInterlaced(width, height, iis,
                        result, colorType, bitDepth, bitsPerPixel,
                        pngChunkPLTE, gammaCorrection, transparencyFilter);
            } else {
                throw new ImageReadException("Unknown InterlaceMethod: "
                        + pngChunkIHDR.interlaceMethod);
            }

            scanExpediter.drive();

            if (iccProfile != null) {
                final Boolean is_srgb = new IccProfileParser().issRGB(iccProfile);
                if (is_srgb == null || !is_srgb.booleanValue()) {
                    final ICC_ColorSpace cs = new ICC_ColorSpace(iccProfile);

                    final ColorModel srgbCM = ColorModel.getRGBdefault();
                    final ColorSpace cs_sRGB = srgbCM.getColorSpace();

                    result = new ColorTools().convertBetweenColorSpaces(result,
                            cs, cs_sRGB);
                }
            }

            return result;

        }

    }

    @Override
    public boolean dumpImageFile(final PrintWriter pw, final ByteSource byteSource)
            throws ImageReadException, IOException {
        final ImageInfo imageInfo = getImageInfo(byteSource);
        if (imageInfo == null) {
            return false;
        }

        imageInfo.toString(pw, "");

        final List<PngChunk> chunks = readChunks(byteSource, null, false);
        final List<PngChunk> IHDRs = filterChunks(chunks, ChunkType.IHDR);
        if (IHDRs.size() != 1) {
            if (getDebug()) {
                System.out.println("PNG contains more than one Header");
            }
            return false;
        }
        final PngChunkIhdr pngChunkIHDR = (PngChunkIhdr) IHDRs.get(0);
        pw.println("Color: " + pngChunkIHDR.colorType.name());

        pw.println("chunks: " + chunks.size());

        if ((chunks.isEmpty())) {
            return false;
        }

        for (int i = 0; i < chunks.size(); i++) {
            final PngChunk chunk = chunks.get(i);
            printCharQuad(pw, "\t" + i + ": ", chunk.chunkType);
        }

        pw.println("");

        pw.flush();

        return true;
    }

    @Override
    public void writeImage(final BufferedImage src, final OutputStream os, final Map<String, Object> params)
            throws ImageWriteException, IOException {
        new PngWriter(params).writeImage(src, os, params);
    }

    @Override
    public String getXmpXml(final ByteSource byteSource, final Map<String, Object> params)
            throws ImageReadException, IOException {

        final List<PngChunk> chunks = readChunks(byteSource, new ChunkType[] { ChunkType.iTXt }, false);

        if ((chunks == null) || (chunks.isEmpty())) {
            return null;
        }

        final List<PngChunkItxt> xmpChunks = new ArrayList<PngChunkItxt>();
        for (PngChunk chunk : chunks) {
            final PngChunkItxt itxtChunk = (PngChunkItxt) chunk;
            if (!itxtChunk.getKeyword().equals(PngConstants.XMP_KEYWORD)) {
                continue;
            }
            xmpChunks.add(itxtChunk);
        }

        if (xmpChunks.isEmpty()) {
            return null;
        }
        if (xmpChunks.size() > 1) {
            throw new ImageReadException(
                    "PNG contains more than one XMP chunk.");
        }

        final PngChunkItxt chunk = xmpChunks.get(0);
        return chunk.getText();
    }

}
