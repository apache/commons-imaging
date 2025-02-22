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
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.InflaterInputStream;

import org.apache.commons.imaging.AbstractImageParser;
import org.apache.commons.imaging.ColorTools;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.common.Allocator;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.common.GenericImageMetadata;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.XmpEmbeddable;
import org.apache.commons.imaging.common.XmpImagingParameters;
import org.apache.commons.imaging.formats.png.chunks.AbstractPngTextChunk;
import org.apache.commons.imaging.formats.png.chunks.PngChunk;
import org.apache.commons.imaging.formats.png.chunks.PngChunkGama;
import org.apache.commons.imaging.formats.png.chunks.PngChunkIccp;
import org.apache.commons.imaging.formats.png.chunks.PngChunkIdat;
import org.apache.commons.imaging.formats.png.chunks.PngChunkIhdr;
import org.apache.commons.imaging.formats.png.chunks.PngChunkItxt;
import org.apache.commons.imaging.formats.png.chunks.PngChunkPhys;
import org.apache.commons.imaging.formats.png.chunks.PngChunkPlte;
import org.apache.commons.imaging.formats.png.chunks.PngChunkScal;
import org.apache.commons.imaging.formats.png.chunks.PngChunkText;
import org.apache.commons.imaging.formats.png.chunks.PngChunkZtxt;
import org.apache.commons.imaging.formats.png.transparencyfilters.AbstractTransparencyFilter;
import org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilterGrayscale;
import org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilterIndexedColor;
import org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilterTrueColor;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.formats.tiff.TiffImageParser;
import org.apache.commons.imaging.formats.tiff.TiffImagingParameters;
import org.apache.commons.imaging.icc.IccProfileParser;

public class PngImageParser extends AbstractImageParser<PngImagingParameters> implements XmpEmbeddable<PngImagingParameters> {

    private static final Logger LOGGER = Logger.getLogger(PngImageParser.class.getName());

    private static final String DEFAULT_EXTENSION = ImageFormats.PNG.getDefaultExtension();
    private static final String[] ACCEPTED_EXTENSIONS = ImageFormats.PNG.getExtensions();

    public static String getChunkTypeName(final int chunkType) {
        final StringBuilder result = new StringBuilder();
        result.append((char) (0xff & chunkType >> 24));
        result.append((char) (0xff & chunkType >> 16));
        result.append((char) (0xff & chunkType >> 8));
        result.append((char) (0xff & chunkType >> 0));
        return result.toString();
    }

    /**
     * Constructs a new instance with the big-endian byte order.
     */
    public PngImageParser() {
        // empty
    }

    @Override
    public boolean dumpImageFile(final PrintWriter pw, final ByteSource byteSource) throws ImagingException, IOException {
        final ImageInfo imageInfo = getImageInfo(byteSource);
        if (imageInfo == null) {
            return false;
        }

        imageInfo.toString(pw, "");

        final List<PngChunk> chunks = readChunks(byteSource, null, false);
        final List<PngChunk> IHDRs = filterChunks(chunks, ChunkType.IHDR);
        if (IHDRs.size() != 1) {
            if (LOGGER.isLoggable(Level.FINEST)) {
                LOGGER.finest("PNG contains more than one Header");
            }
            return false;
        }
        final PngChunkIhdr pngChunkIHDR = (PngChunkIhdr) IHDRs.get(0);
        pw.println("Color: " + pngChunkIHDR.getPngColorType().name());

        pw.println("chunks: " + chunks.size());

        if (chunks.isEmpty()) {
            return false;
        }

        for (int i = 0; i < chunks.size(); i++) {
            final PngChunk chunk = chunks.get(i);
            BinaryFunctions.printCharQuad(pw, "\t" + i + ": ", chunk.getChunkType());
        }

        pw.println("");

        pw.flush();

        return true;
    }

    private List<PngChunk> filterChunks(final List<PngChunk> chunks, final ChunkType type) {
        final List<PngChunk> result = new ArrayList<>();

        for (final PngChunk chunk : chunks) {
            if (chunk.getChunkType() == type.value) {
                result.add(chunk);
            }
        }

        return result;
    }

    @Override
    protected String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS.clone();
    }

    @Override
    protected ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[] { ImageFormats.PNG, //
        };
    }

    // private static final int tRNS = CharsToQuad('t', 'R', 'N', 's');

    @Override
    public BufferedImage getBufferedImage(final ByteSource byteSource, final PngImagingParameters params) throws ImagingException, IOException {

        final List<PngChunk> chunks = readChunks(byteSource,
                new ChunkType[] { ChunkType.IHDR, ChunkType.PLTE, ChunkType.IDAT, ChunkType.tRNS, ChunkType.iCCP, ChunkType.gAMA, ChunkType.sRGB, }, false);

        if (chunks.isEmpty()) {
            throw new ImagingException("PNG: no chunks");
        }

        final List<PngChunk> IHDRs = filterChunks(chunks, ChunkType.IHDR);
        if (IHDRs.size() != 1) {
            throw new ImagingException("PNG contains more than one Header");
        }

        final PngChunkIhdr pngChunkIHDR = (PngChunkIhdr) IHDRs.get(0);

        final List<PngChunk> PLTEs = filterChunks(chunks, ChunkType.PLTE);
        if (PLTEs.size() > 1) {
            throw new ImagingException("PNG contains more than one Palette");
        }

        PngChunkPlte pngChunkPLTE = null;
        if (PLTEs.size() == 1) {
            pngChunkPLTE = (PngChunkPlte) PLTEs.get(0);
        }

        final List<PngChunk> IDATs = filterChunks(chunks, ChunkType.IDAT);
        if (IDATs.isEmpty()) {
            throw new ImagingException("PNG missing image data");
        }

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        for (final PngChunk IDAT : IDATs) {
            final PngChunkIdat pngChunkIDAT = (PngChunkIdat) IDAT;
            final byte[] bytes = pngChunkIDAT.getBytes();
            // System.out.println(i + ": bytes: " + bytes.length);
            baos.write(bytes);
        }

        final byte[] compressed = baos.toByteArray();

        baos = null;

        AbstractTransparencyFilter abstractTransparencyFilter = null;

        final List<PngChunk> tRNSs = filterChunks(chunks, ChunkType.tRNS);
        if (!tRNSs.isEmpty()) {
            final PngChunk pngChunktRNS = tRNSs.get(0);
            abstractTransparencyFilter = getTransparencyFilter(pngChunkIHDR.getPngColorType(), pngChunktRNS);
        }

        ICC_Profile iccProfile = null;
        GammaCorrection gammaCorrection = null;
        {
            final List<PngChunk> sRGBs = filterChunks(chunks, ChunkType.sRGB);
            final List<PngChunk> gAMAs = filterChunks(chunks, ChunkType.gAMA);
            final List<PngChunk> iCCPs = filterChunks(chunks, ChunkType.iCCP);
            if (sRGBs.size() > 1) {
                throw new ImagingException("PNG: unexpected sRGB chunk");
            }
            if (gAMAs.size() > 1) {
                throw new ImagingException("PNG: unexpected gAMA chunk");
            }
            if (iCCPs.size() > 1) {
                throw new ImagingException("PNG: unexpected iCCP chunk");
            }

            if (sRGBs.size() == 1) {
                // no color management necessary.
                if (LOGGER.isLoggable(Level.FINEST)) {
                    LOGGER.finest("sRGB, no color management necessary.");
                }
            } else if (iCCPs.size() == 1) {
                if (LOGGER.isLoggable(Level.FINEST)) {
                    LOGGER.finest("iCCP.");
                }

                final PngChunkIccp pngChunkiCCP = (PngChunkIccp) iCCPs.get(0);
                final byte[] bytes = pngChunkiCCP.getUncompressedProfile();

                try {
                    iccProfile = ICC_Profile.getInstance(bytes);
                } catch (final IllegalArgumentException iae) {
                    throw new ImagingException("The image data does not correspond to a valid ICC Profile", iae);
                }
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

                if (gammaCorrection != null && pngChunkPLTE != null) {
                    pngChunkPLTE.correct(gammaCorrection);
                }

            }
        }

        {
            final int width = pngChunkIHDR.getWidth();
            final int height = pngChunkIHDR.getHeight();
            final PngColorType pngColorType = pngChunkIHDR.getPngColorType();
            final int bitDepth = pngChunkIHDR.getBitDepth();

            if (pngChunkIHDR.getFilterMethod() != 0) {
                throw new ImagingException("PNG: unknown FilterMethod: " + pngChunkIHDR.getFilterMethod());
            }

            final int bitsPerPixel = bitDepth * pngColorType.getSamplesPerPixel();

            final boolean hasAlpha = pngColorType.hasAlpha() || abstractTransparencyFilter != null;

            BufferedImage result;
            if (pngColorType.isGreyscale()) {
                result = getBufferedImageFactory(params).getGrayscaleBufferedImage(width, height, hasAlpha);
            } else {
                result = getBufferedImageFactory(params).getColorBufferedImage(width, height, hasAlpha);
            }

            final ByteArrayInputStream bais = new ByteArrayInputStream(compressed);
            final InflaterInputStream iis = new InflaterInputStream(bais);

            final AbstractScanExpediter abstractScanExpediter;

            switch (pngChunkIHDR.getInterlaceMethod()) {
            case NONE:
                abstractScanExpediter = new ScanExpediterSimple(width, height, iis, result, pngColorType, bitDepth, bitsPerPixel, pngChunkPLTE, gammaCorrection,
                        abstractTransparencyFilter);
                break;
            case ADAM7:
                abstractScanExpediter = new ScanExpediterInterlaced(width, height, iis, result, pngColorType, bitDepth, bitsPerPixel, pngChunkPLTE,
                        gammaCorrection, abstractTransparencyFilter);
                break;
            default:
                throw new ImagingException("Unknown InterlaceMethod: " + pngChunkIHDR.getInterlaceMethod());
            }

            abstractScanExpediter.drive();

            if (iccProfile != null) {
                final boolean isSrgb = new IccProfileParser().isSrgb(iccProfile);
                if (!isSrgb) {
                    final ICC_ColorSpace cs = new ICC_ColorSpace(iccProfile);

                    final ColorModel srgbCM = ColorModel.getRGBdefault();
                    final ColorSpace csSrgb = srgbCM.getColorSpace();

                    result = new ColorTools().convertBetweenColorSpaces(result, cs, csSrgb);
                }
            }

            return result;

        }

    }

    /**
     * @param is PNG image input stream
     * @return List of String-formatted chunk types, ie. "tRNs".
     * @throws ImagingException if it fail to read the PNG chunks
     * @throws IOException      if it fails to read the input stream data
     */
    public List<String> getChunkTypes(final InputStream is) throws ImagingException, IOException {
        final List<PngChunk> chunks = readChunks(is, null, false);
        final List<String> chunkTypes = Allocator.arrayList(chunks.size());
        for (final PngChunk chunk : chunks) {
            chunkTypes.add(getChunkTypeName(chunk.getChunkType()));
        }
        return chunkTypes;
    }

    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Override
    public PngImagingParameters getDefaultParameters() {
        return new PngImagingParameters();
    }

    @Override
    public byte[] getIccProfileBytes(final ByteSource byteSource, final PngImagingParameters params) throws ImagingException, IOException {
        final List<PngChunk> chunks = readChunks(byteSource, new ChunkType[] { ChunkType.iCCP }, true);

        if (chunks.isEmpty()) {
            return null;
        }

        if (chunks.size() > 1) {
            throw new ImagingException("PNG contains more than one ICC Profile ");
        }

        final PngChunkIccp pngChunkiCCP = (PngChunkIccp) chunks.get(0);

        return pngChunkiCCP.getUncompressedProfile(); // TODO should this be a clone?
    }

    @Override
    public ImageInfo getImageInfo(final ByteSource byteSource, final PngImagingParameters params) throws ImagingException, IOException {
        final List<PngChunk> chunks = readChunks(byteSource, new ChunkType[] { ChunkType.IHDR, ChunkType.pHYs, ChunkType.sCAL, ChunkType.tEXt, ChunkType.zTXt,
                ChunkType.tRNS, ChunkType.PLTE, ChunkType.iTXt, }, false);

        if (chunks.isEmpty()) {
            throw new ImagingException("PNG: no chunks");
        }

        final List<PngChunk> IHDRs = filterChunks(chunks, ChunkType.IHDR);
        if (IHDRs.size() != 1) {
            throw new ImagingException("PNG contains more than one Header");
        }

        final PngChunkIhdr pngChunkIHDR = (PngChunkIhdr) IHDRs.get(0);

        boolean transparent = false;

        final List<PngChunk> tRNSs = filterChunks(chunks, ChunkType.tRNS);
        if (!tRNSs.isEmpty()) {
            transparent = true;
        } else {
            // CE - Fix Alpha.
            transparent = pngChunkIHDR.getPngColorType().hasAlpha();
            // END FIX
        }

        PngChunkPhys pngChunkpHYs = null;

        final List<PngChunk> pHYss = filterChunks(chunks, ChunkType.pHYs);
        if (pHYss.size() > 1) {
            throw new ImagingException("PNG contains more than one pHYs: " + pHYss.size());
        }
        if (pHYss.size() == 1) {
            pngChunkpHYs = (PngChunkPhys) pHYss.get(0);
        }

        PhysicalScale physicalScale = PhysicalScale.UNDEFINED;

        final List<PngChunk> sCALs = filterChunks(chunks, ChunkType.sCAL);
        if (sCALs.size() > 1) {
            throw new ImagingException("PNG contains more than one sCAL:" + sCALs.size());
        }
        if (sCALs.size() == 1) {
            final PngChunkScal pngChunkScal = (PngChunkScal) sCALs.get(0);
            if (pngChunkScal.getUnitSpecifier() == 1) {
                physicalScale = PhysicalScale.createFromMeters(pngChunkScal.getUnitsPerPixelXAxis(), pngChunkScal.getUnitsPerPixelYAxis());
            } else {
                physicalScale = PhysicalScale.createFromRadians(pngChunkScal.getUnitsPerPixelXAxis(), pngChunkScal.getUnitsPerPixelYAxis());
            }
        }

        final List<PngChunk> tEXts = filterChunks(chunks, ChunkType.tEXt);
        final List<PngChunk> zTXts = filterChunks(chunks, ChunkType.zTXt);
        final List<PngChunk> iTXts = filterChunks(chunks, ChunkType.iTXt);

        final int chunkCount = tEXts.size() + zTXts.size() + iTXts.size();
        final List<String> comments = Allocator.arrayList(chunkCount);
        final List<AbstractPngText> textChunks = Allocator.arrayList(chunkCount);

        for (final PngChunk tEXt : tEXts) {
            final PngChunkText pngChunktEXt = (PngChunkText) tEXt;
            comments.add(pngChunktEXt.getKeyword() + ": " + pngChunktEXt.getText());
            textChunks.add(pngChunktEXt.getContents());
        }
        for (final PngChunk zTXt : zTXts) {
            final PngChunkZtxt pngChunkzTXt = (PngChunkZtxt) zTXt;
            comments.add(pngChunkzTXt.getKeyword() + ": " + pngChunkzTXt.getText());
            textChunks.add(pngChunkzTXt.getContents());
        }
        for (final PngChunk iTXt : iTXts) {
            final PngChunkItxt pngChunkiTXt = (PngChunkItxt) iTXt;
            comments.add(pngChunkiTXt.getKeyword() + ": " + pngChunkiTXt.getText());
            textChunks.add(pngChunkiTXt.getContents());
        }

        final int bitsPerPixel = pngChunkIHDR.getBitDepth() * pngChunkIHDR.getPngColorType().getSamplesPerPixel();
        final ImageFormat format = ImageFormats.PNG;
        final String formatName = "PNG Portable Network Graphics";
        final int height = pngChunkIHDR.getHeight();
        final String mimeType = "image/png";
        final int numberOfImages = 1;
        final int width = pngChunkIHDR.getWidth();
        final boolean progressive = pngChunkIHDR.getInterlaceMethod().isProgressive();

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
        if (pngChunkpHYs != null && pngChunkpHYs.getUnitSpecifier() == 1) { // meters
            final double metersPerInch = 0.0254;

            physicalWidthDpi = (int) Math.round(pngChunkpHYs.getPixelsPerUnitXAxis() * metersPerInch);
            physicalWidthInch = (float) (width / (pngChunkpHYs.getPixelsPerUnitXAxis() * metersPerInch));
            physicalHeightDpi = (int) Math.round(pngChunkpHYs.getPixelsPerUnitYAxis() * metersPerInch);
            physicalHeightInch = (float) (height / (pngChunkpHYs.getPixelsPerUnitYAxis() * metersPerInch));
        }

        boolean usesPalette = false;

        final List<PngChunk> PLTEs = filterChunks(chunks, ChunkType.PLTE);
        if (!PLTEs.isEmpty()) {
            usesPalette = true;
        }

        final ImageInfo.ColorType colorType;
        switch (pngChunkIHDR.getPngColorType()) {
        case GREYSCALE:
        case GREYSCALE_WITH_ALPHA:
            colorType = ImageInfo.ColorType.GRAYSCALE;
            break;
        case TRUE_COLOR:
        case INDEXED_COLOR:
        case TRUE_COLOR_WITH_ALPHA:
            colorType = ImageInfo.ColorType.RGB;
            break;
        default:
            throw new ImagingException("Png: Unknown ColorType: " + pngChunkIHDR.getPngColorType());
        }

        final String formatDetails = "Png";
        final ImageInfo.CompressionAlgorithm compressionAlgorithm = ImageInfo.CompressionAlgorithm.PNG_FILTER;

        return new PngImageInfo(formatDetails, bitsPerPixel, comments, format, formatName, height, mimeType, numberOfImages, physicalHeightDpi,
                physicalHeightInch, physicalWidthDpi, physicalWidthInch, width, progressive, transparent, usesPalette, colorType, compressionAlgorithm,
                textChunks, physicalScale);
    }

    @Override
    public Dimension getImageSize(final ByteSource byteSource, final PngImagingParameters params) throws ImagingException, IOException {
        final List<PngChunk> chunks = readChunks(byteSource, new ChunkType[] { ChunkType.IHDR, }, true);

        if (chunks.isEmpty()) {
            throw new ImagingException("Png: No chunks");
        }

        if (chunks.size() > 1) {
            throw new ImagingException("PNG contains more than one Header");
        }

        final PngChunkIhdr pngChunkIHDR = (PngChunkIhdr) chunks.get(0);

        return new Dimension(pngChunkIHDR.getWidth(), pngChunkIHDR.getHeight());
    }

    @Override
    public ImageMetadata getMetadata(final ByteSource byteSource, final PngImagingParameters params) throws ImagingException, IOException {
        final ChunkType[] chunkTypes = { ChunkType.tEXt, ChunkType.zTXt, ChunkType.iTXt, ChunkType.eXIf };
        final List<PngChunk> chunks = readChunks(byteSource, chunkTypes, false);

        if (chunks.isEmpty()) {
            return null;
        }

        final GenericImageMetadata textual = new GenericImageMetadata();
        TiffImageMetadata exif = null;

        for (final PngChunk chunk : chunks) {
            if (chunk instanceof AbstractPngTextChunk) {
                final AbstractPngTextChunk textChunk = (AbstractPngTextChunk) chunk;
                textual.add(textChunk.getKeyword(), textChunk.getText());
            } else if (chunk.getChunkType() == ChunkType.eXIf.value) {
                if (exif != null) {
                    throw new ImagingException("Duplicate eXIf chunk");
                }
                exif = (TiffImageMetadata) new TiffImageParser().getMetadata(chunk.getBytes());
            } else {
                throw new ImagingException("Unexpected chunk type: " + chunk.getChunkType());
            }
        }

        return new PngImageMetadata(textual, exif);
    }

    /**
     * @since 1.0-alpha6
     */
    public TiffImageMetadata getExifMetadata(final ByteSource byteSource, TiffImagingParameters params)
            throws ImagingException, IOException {
        final byte[] bytes = getExifRawData(byteSource);
        if (null == bytes) {
            return null;
        }

        if (params == null) {
            params = new TiffImagingParameters();
        }

        return (TiffImageMetadata) new TiffImageParser().getMetadata(bytes, params);
    }

    /**
     * @since 1.0-alpha6
     */
    public byte[] getExifRawData(final ByteSource byteSource) throws ImagingException, IOException {
        final List<PngChunk> chunks = readChunks(byteSource, new ChunkType[] { ChunkType.eXIf }, true);

        if (chunks.isEmpty()) {
            return null;
        }

        return chunks.get(0).getBytes();
    }

    @Override
    public String getName() {
        return "Png-Custom";
    }

    private AbstractTransparencyFilter getTransparencyFilter(final PngColorType pngColorType, final PngChunk pngChunktRNS)
            throws ImagingException, IOException {
        switch (pngColorType) {
        case GREYSCALE: // 1,2,4,8,16 Each pixel is a grayscale sample.
            return new TransparencyFilterGrayscale(pngChunktRNS.getBytes());
        case TRUE_COLOR: // 8,16 Each pixel is an R,G,B triple.
            return new TransparencyFilterTrueColor(pngChunktRNS.getBytes());
        case INDEXED_COLOR: // 1,2,4,8 Each pixel is a palette index;
            return new TransparencyFilterIndexedColor(pngChunktRNS.getBytes());
        case GREYSCALE_WITH_ALPHA: // 8,16 Each pixel is a grayscale sample,
        case TRUE_COLOR_WITH_ALPHA: // 8,16 Each pixel is an R,G,B triple,
        default:
            throw new ImagingException("Simple Transparency not compatible with ColorType: " + pngColorType);
        }
    }

    @Override
    public String getXmpXml(final ByteSource byteSource, final XmpImagingParameters<PngImagingParameters> params) throws ImagingException, IOException {

        final List<PngChunk> chunks = readChunks(byteSource, new ChunkType[] { ChunkType.iTXt }, false);

        if (chunks.isEmpty()) {
            return null;
        }

        final List<PngChunkItxt> xmpChunks = new ArrayList<>();
        for (final PngChunk chunk : chunks) {
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
            throw new ImagingException("PNG contains more than one XMP chunk.");
        }

        final PngChunkItxt chunk = xmpChunks.get(0);
        return chunk.getText();
    }

    // TODO: I have been too casual about making inner classes subclass of
    // BinaryFileParser
    // I may not have always preserved byte order correctly.

    public boolean hasChunkType(final ByteSource byteSource, final ChunkType chunkType) throws ImagingException, IOException {
        try (InputStream is = byteSource.getInputStream()) {
            readSignature(is);
            final List<PngChunk> chunks = readChunks(is, new ChunkType[] { chunkType }, true);
            return !chunks.isEmpty();
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

    private List<PngChunk> readChunks(final ByteSource byteSource, final ChunkType[] chunkTypes, final boolean returnAfterFirst)
            throws ImagingException, IOException {
        try (InputStream is = byteSource.getInputStream()) {
            readSignature(is);
            return readChunks(is, chunkTypes, returnAfterFirst);
        }
    }

    private List<PngChunk> readChunks(final InputStream is, final ChunkType[] chunkTypes, final boolean returnAfterFirst) throws ImagingException, IOException {
        final List<PngChunk> result = new ArrayList<>();

        while (true) {
            final int length = BinaryFunctions.read4Bytes("Length", is, "Not a Valid PNG File", getByteOrder());
            if (length < 0) {
                throw new ImagingException("Invalid PNG chunk length: " + length);
            }
            final int chunkType = BinaryFunctions.read4Bytes("ChunkType", is, "Not a Valid PNG File", getByteOrder());

            if (LOGGER.isLoggable(Level.FINEST)) {
                BinaryFunctions.logCharQuad("ChunkType", chunkType);
                debugNumber("Length", length, 4);
            }
            final boolean keep = keepChunk(chunkType, chunkTypes);

            byte[] bytes = null;
            if (keep) {
                bytes = BinaryFunctions.readBytes("Chunk Data", is, length, "Not a Valid PNG File: Couldn't read Chunk Data.");
            } else {
                BinaryFunctions.skipBytes(is, length, "Not a Valid PNG File");
            }

            if (LOGGER.isLoggable(Level.FINEST) && bytes != null) {
                debugNumber("bytes", bytes.length, 4);
            }

            final int crc = BinaryFunctions.read4Bytes("CRC", is, "Not a Valid PNG File", getByteOrder());

            if (keep) {
                result.add(ChunkType.makeChunk(length, chunkType, crc, bytes));

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

    public void readSignature(final InputStream is) throws ImagingException, IOException {
        BinaryFunctions.readAndVerifyBytes(is, PngConstants.PNG_SIGNATURE, "Not a Valid PNG Segment: Incorrect Signature");

    }

    @Override
    public void writeImage(final BufferedImage src, final OutputStream os, final PngImagingParameters params) throws ImagingException, IOException {
        new PngWriter().writeImage(src, os, params, null);
    }

}
