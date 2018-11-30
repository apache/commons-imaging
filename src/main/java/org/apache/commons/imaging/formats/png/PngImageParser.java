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

import static org.apache.commons.imaging.common.BinaryFunctions.printCharQuad;
import static org.apache.commons.imaging.common.BinaryFunctions.read4Bytes;
import static org.apache.commons.imaging.common.BinaryFunctions.readAndVerifyBytes;
import static org.apache.commons.imaging.common.BinaryFunctions.readBytes;
import static org.apache.commons.imaging.common.BinaryFunctions.skipBytes;

import java.awt.Dimension;
import java.awt.color.ColorSpace;
import java.awt.color.ICC_ColorSpace;
import java.awt.color.ICC_Profile;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.InflaterInputStream;

import org.apache.commons.imaging.ColorTools;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.GenericImageMetadata;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.formats.png.chunks.ChunkLoader;
import org.apache.commons.imaging.formats.png.chunks.ChunkLoader.ChunkSelector;
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
import org.apache.commons.imaging.formats.png.chunks.PngTextChunk;
import org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilter;
import org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilterGrayscale;
import org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilterIndexedColor;
import org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilterTrueColor;
import org.apache.commons.imaging.icc.IccProfileParser;

public class PngImageParser extends ImageParser {

    /*
     * Changes done (ShukantPal): Improved code readability by using ChunkLoader
     * and ChunkLoader.ChunkSelector. Now keepChunk() is removed, instead create
     * a ChunkSelector (see BUFIMG_SEL) and pass that to readChunks
     */
    
    private static final Logger LOGGER = Logger.getLogger(PngImageParser.class.getName());

    private static final String DEFAULT_EXTENSION = ".png";
    private static final String[] ACCEPTED_EXTENSIONS = { DEFAULT_EXTENSION, };
    
    private static final ChunkSelector BUFIMG_SEL = new ChunkSelector(true,
            new ChunkType[] {
                ChunkType.IHDR,
                ChunkType.PLTE,
                ChunkType.IDAT,
                ChunkType.tRNS,
                ChunkType.iCCP,
                ChunkType.gAMA,
                ChunkType.sRGB,
            });
    
    private static final ChunkSelector IMGINFO_SEL = new ChunkSelector(true,
            new ChunkType[]{
                ChunkType.IHDR,
                ChunkType.pHYs,
                ChunkType.sCAL,
                ChunkType.tEXt,
                ChunkType.zTXt,
                ChunkType.tRNS,
                ChunkType.PLTE,
                ChunkType.iTXt,
            });
    
    private static final ChunkSelector IHDR_SEL = new ChunkSelector(true,
            new ChunkType[] {
                ChunkType.IHDR
            });
    
    private static final ChunkSelector ICCP_SEL = new ChunkSelector(true,
            new ChunkType[]{
                ChunkType.iCCP
            });
    
    private static final ChunkSelector TEXT_SEL = new ChunkSelector(true,
            new ChunkType[]{
                ChunkType.tEXt,
                ChunkType.zTXt
            });

    private static final ChunkSelector iTXt_SEL = new ChunkSelector(true,
            new ChunkType[]{
                ChunkType.iTXt
            });
    
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
        return ACCEPTED_EXTENSIONS.clone();
    }

    @Override
    protected ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[] { ImageFormats.PNG, //
        };
    }

    // private final static int tRNS = CharsToQuad('t', 'R', 'N', 's');

    public static String getChunkTypeName(final int chunkTypeCode) {
        return new String(
                ByteBuffer.allocate(4).putInt(chunkTypeCode).array(),
                StandardCharsets.ISO_8859_1);
    }

    /**
     * Extracts all the chunks in the PNG file (in the input stream)
     * and returns a list of their names.
     * 
     * @param is
     * @return List of String-formatted chunk types, ie. "tRNs".
     * @throws ImageReadException
     * @throws IOException
     */
    public List<String> getChunkTypes(final InputStream is)
            throws ImageReadException, IOException {
        final List<PngChunk> chunks = readChunks(is, null, false);
        final List<String> chunkTypes = new ArrayList<>(chunks.size());
        for (final PngChunk chunk : chunks) {
            chunkTypes.add(getChunkTypeName(chunk.chunkType.toCode()));
        }
        return chunkTypes;
    }

    public boolean hasChunkType(final ByteSource byteSource, final ChunkType chunkType)
            throws ImageReadException, IOException {
        try (InputStream is = byteSource.getInputStream()) {
            readSignature(is);
            final List<PngChunk> chunks = readChunks(is, new ChunkSelector(true, 
                    new ChunkType[] { chunkType }), true);
            return !chunks.isEmpty();
        }
    }

    /**
     * Reads all the chunks (satisfying any filters) from the input
     * stream containing a PNG file.
     * 
     * Replaces the readChunks(InputStream, ChunkTypes[], boolean)
     * method. Is clean, and readable now.
     * 
     * @param inputStream
     * @param selector
     * @param returnAfterFirst
     * @return
     * @throws IOException
     * @throws ImageReadException 
     */
    private List<PngChunk> readChunks(final InputStream inputStream,
            final ChunkSelector selector, final boolean returnAfterFirst)
            throws IOException, ImageReadException {
        final List<PngChunk> result = new ArrayList<>();
        final DataInputStream dataInput = new DataInputStream(inputStream);
        
        while(true) {
            final ChunkLoader nextChunkLoaded = ChunkLoader.run(dataInput, selector);
            PngChunk loadedChunk = nextChunkLoaded.loadedChunk();
            
            if(loadedChunk != null) {
                { // (Shukant Pal): I essentially hate how developers
                  // have created a dumb PngCrc object. Couldn't it just be
                  // in one method call. Anyways, CRC checking wasn't
                  // done before. I added this.
                    final PngCrc png_crc = new PngCrc();

                    final long crc1 = png_crc.start_partial_crc(loadedChunk.chunkType.array, 4);
                    final long crc2 = loadedChunk.getBytes() == null ? crc1 :
                           png_crc.continue_partial_crc(
                                crc1, loadedChunk.getBytes(), loadedChunk.contentSize());

                    int chunkCRC = (int) png_crc.finish_partial_crc(crc2);
                    
                    if(chunkCRC != nextChunkLoaded.chunkCrc()) {
                        throw new ImageReadException("Illegal CRC value found" + 
                                "(ChunkType: " + loadedChunk.chunkType +")," +
                                "(CRC VALUE: " + nextChunkLoaded.chunkCrc() + ")," +
                                "(CRC EXPECTED " + chunkCRC + ")");
                    }
                }
                
                result.add(loadedChunk);
                
                if(returnAfterFirst) {
                    break;
                }
            }
            
            if(nextChunkLoaded.isLast()) {
                break;
            } // loadedChunk may be null still
        }
        
        return result;
    }

    public void readSignature(final InputStream is) throws ImageReadException,
            IOException {
        readAndVerifyBytes(is, PngConstants.PNG_SIGNATURE,
                "Not a Valid PNG Segment: Incorrect Signature");

    }
    
    private List<PngChunk> readChunks(final ByteSource byteSource,
            final ChunkSelector selector, final boolean returnAfterFirst)
            throws IOException, ImageReadException {
        try (InputStream inputStream = byteSource.getInputStream()) {
            readSignature(inputStream);
            return readChunks(inputStream, selector, returnAfterFirst);
        }
    }

    @Override
    public byte[] getICCProfileBytes(final ByteSource byteSource, final Map<String, Object> params)
            throws ImageReadException, IOException {
        final List<PngChunk> chunks = PngImageParser.this.readChunks(byteSource,
                ICCP_SEL, true);

        if ((chunks == null) || (chunks.isEmpty())) {
            // throw new ImageReadException("Png: No chunks");
            return null;
        }

        if (chunks.size() > 1) {
            throw new ImageReadException(
                    "PNG contains more than one ICC Profile ");
        }

        final PngChunkIccp pngChunkiCCP = (PngChunkIccp) chunks.get(0);
        final byte[] bytes = pngChunkiCCP.getUncompressedProfile(); // TODO should this be a clone?

        return (bytes);
    }

    @Override
    public Dimension getImageSize(final ByteSource byteSource, final Map<String, Object> params)
            throws ImageReadException, IOException {
        final List<PngChunk> chunks = PngImageParser.this.readChunks(byteSource,
                IHDR_SEL, true);

        if ((chunks == null) || (chunks.isEmpty())) {
            throw new ImageReadException("Png: No chunks");
        }

        if (chunks.size() > 1) {
            throw new ImageReadException("PNG contains more than one Header");
        }

        final PngChunkIhdr pngChunkIHDR = (PngChunkIhdr) chunks.get(0);

        return new Dimension(pngChunkIHDR.getWidth(), pngChunkIHDR.getHeight());
    }

    @Override
    public ImageMetadata getMetadata(final ByteSource byteSource, final Map<String, Object> params)
            throws ImageReadException, IOException {
        final List<PngChunk> chunks = PngImageParser.this.readChunks(byteSource,
                TEXT_SEL, true);

        if ((chunks == null) || (chunks.isEmpty())) {
            return null;
        }

        final GenericImageMetadata result = new GenericImageMetadata();

        for (final PngChunk chunk : chunks) {
            final PngTextChunk textChunk = (PngTextChunk) chunk;

            result.add(textChunk.getKeyword(), textChunk.getText());
        }

        return result;
    }

    private List<PngChunk> filterChunks(final List<PngChunk> chunks, final ChunkType type) {
        final List<PngChunk> result = new ArrayList<>();

        for (final PngChunk chunk : chunks) {
            if (chunk.chunkType == type) {
                result.add(chunk);
            }
        }

        return result;
    }

    // TODO: I have been too casual about making inner classes subclass of
    // BinaryFileParser
    // I may not have always preserved byte order correctly.

    private TransparencyFilter getTransparencyFilter(final PngColorType pngColorType, final PngChunk pngChunktRNS)
            throws ImageReadException, IOException {
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
                throw new ImageReadException("Simple Transparency not compatible with ColorType: " + pngColorType);
        }
    }

    @Override
    public ImageInfo getImageInfo(final ByteSource byteSource, final Map<String, Object> params)
            throws ImageReadException, IOException {
        final List<PngChunk> chunks = PngImageParser.this.readChunks(byteSource, IMGINFO_SEL, false);

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
            transparent = pngChunkIHDR.getPngColorType().hasAlpha();
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

        PhysicalScale physicalScale = PhysicalScale.UNDEFINED;

        final List<PngChunk> sCALs = filterChunks(chunks, ChunkType.sCAL);
        if (sCALs.size() > 1) {
            throw new ImageReadException("PNG contains more than one sCAL:"
                    + sCALs.size());
        } else if (sCALs.size() == 1) {
            final PngChunkScal pngChunkScal = (PngChunkScal) sCALs.get(0);
            if (pngChunkScal.unitSpecifier == 1) {
                physicalScale = PhysicalScale.createFromMeters(pngChunkScal.unitsPerPixelXAxis,
                      pngChunkScal.unitsPerPixelYAxis);
            } else {
                physicalScale = PhysicalScale.createFromRadians(pngChunkScal.unitsPerPixelXAxis,
                      pngChunkScal.unitsPerPixelYAxis);
            }
        }

        final List<PngChunk> tEXts = filterChunks(chunks, ChunkType.tEXt);
        final List<PngChunk> zTXts = filterChunks(chunks, ChunkType.zTXt);
        final List<PngChunk> iTXts = filterChunks(chunks, ChunkType.iTXt);

        int chunkCount = tEXts.size() + zTXts.size() + iTXts.size();
        final List<String> comments = new ArrayList<>(chunkCount);
        final List<PngText> textChunks = new ArrayList<>(chunkCount);

        for (final PngChunk tEXt : tEXts) {
            final PngChunkText pngChunktEXt = (PngChunkText) tEXt;
            comments.add(pngChunktEXt.keyword + ": " + pngChunktEXt.text);
            textChunks.add(pngChunktEXt.getContents());
        }
        for (final PngChunk zTXt : zTXts) {
            final PngChunkZtxt pngChunkzTXt = (PngChunkZtxt) zTXt;
            comments.add(pngChunkzTXt.keyword + ": " + pngChunkzTXt.text);
            textChunks.add(pngChunkzTXt.getContents());
        }
        for (final PngChunk iTXt : iTXts) {
            final PngChunkItxt pngChunkiTXt = (PngChunkItxt) iTXt;
            comments.add(pngChunkiTXt.keyword + ": " + pngChunkiTXt.text);
            textChunks.add(pngChunkiTXt.getContents());
        }

        final int bitsPerPixel = pngChunkIHDR.getBitDepth() *
                pngChunkIHDR.getPngColorType().getSamplesPerPixel();
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
        if ((pngChunkpHYs != null) && (pngChunkpHYs.unitSpecifier == 1)) { // meters
            final double metersPerInch = 0.0254;

            physicalWidthDpi = (int) Math.round(pngChunkpHYs.pixelsPerUnitXAxis * metersPerInch);
            physicalWidthInch = (float) (width / (pngChunkpHYs.pixelsPerUnitXAxis * metersPerInch));
            physicalHeightDpi = (int) Math.round(pngChunkpHYs.pixelsPerUnitYAxis * metersPerInch);
            physicalHeightInch = (float) (height / (pngChunkpHYs.pixelsPerUnitYAxis * metersPerInch));
        }

        boolean usesPalette = false;

        final List<PngChunk> PLTEs = filterChunks(chunks, ChunkType.PLTE);
        if (PLTEs.size() > 1) {
            usesPalette = true;
        }

        ImageInfo.ColorType colorType;
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
                throw new ImageReadException("Png: Unknown ColorType: " +
                        pngChunkIHDR.getPngColorType());
        }

        final String formatDetails = "Png";
        final ImageInfo.CompressionAlgorithm compressionAlgorithm = ImageInfo.CompressionAlgorithm.PNG_FILTER;

        return new PngImageInfo(formatDetails, bitsPerPixel, comments,
                format, formatName, height, mimeType, numberOfImages,
                physicalHeightDpi, physicalHeightInch, physicalWidthDpi,
                physicalWidthInch, width, progressive, transparent,
                usesPalette, colorType, compressionAlgorithm, textChunks,
                physicalScale);
    }

    @Override
    public BufferedImage getBufferedImage(final ByteSource byteSource, Map<String, Object> params)
            throws ImageReadException, IOException {
        params = (params == null) ? new HashMap<String, Object>() : new HashMap<>(params);

        // if (params.size() > 0) {
        // Object firstKey = params.keySet().iterator().next();
        // throw new ImageWriteException("Unknown parameter: " + firstKey);
        // }
        
        final List<PngChunk> chunks = readChunks(byteSource, BUFIMG_SEL, false);

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
        for (final PngChunk IDAT : IDATs) {
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
            transparencyFilter = getTransparencyFilter(
                    pngChunkIHDR.getPngColorType(), pngChunktRNS);
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
                if (LOGGER.isLoggable(Level.FINEST)) {
                    LOGGER.finest("sRGB, no color management neccesary.");
                }
            } else if (iCCPs.size() == 1) {
                if (LOGGER.isLoggable(Level.FINEST)) {
                    LOGGER.finest("iCCP.");
                }

                final PngChunkIccp pngChunkiCCP = (PngChunkIccp) iCCPs.get(0);
                final byte[] bytes = pngChunkiCCP.getUncompressedProfile();

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
            final int width = pngChunkIHDR.getWidth();
            final int height = pngChunkIHDR.getHeight();
            final PngColorType pngColorType = pngChunkIHDR.getPngColorType();
            final int bitDepth = pngChunkIHDR.getBitDepth();

            if (pngChunkIHDR.getFilterMethod() != 0) {
                throw new ImageReadException("PNG: unknown FilterMethod: " +
                        pngChunkIHDR.getFilterMethod());
            }

            final int bitsPerPixel = bitDepth * pngColorType.getSamplesPerPixel();

            final boolean hasAlpha = pngColorType.hasAlpha() || transparencyFilter != null;

            BufferedImage result;
            if (pngColorType.isGreyscale()) {
                result = getBufferedImageFactory(params).getGrayscaleBufferedImage(width, height, hasAlpha);
            } else {
                result = getBufferedImageFactory(params).getColorBufferedImage(width, height, hasAlpha);
            }

            final ByteArrayInputStream bais = new ByteArrayInputStream(compressed);
            final InflaterInputStream iis = new InflaterInputStream(bais);

            ScanExpediter scanExpediter;

            // Note that here we assume the only filter method. Hence, the
            // filtering and interlacing are combined (correct??)
            switch (pngChunkIHDR.getInterlaceMethod()) {
                case NONE:
                    scanExpediter = new ScanExpediterSimple(width, height, iis,
                            result, pngColorType, bitDepth, bitsPerPixel,
                            pngChunkPLTE, gammaCorrection, transparencyFilter);
                    break;
                case ADAM7:
                    scanExpediter = new ScanExpediterInterlaced(width, height, iis,
                            result, pngColorType, bitDepth, bitsPerPixel,
                            pngChunkPLTE, gammaCorrection, transparencyFilter);
                    break;
                default:
                    throw new ImageReadException("Unknown InterlaceMethod: " +
                            pngChunkIHDR.getInterlaceMethod());
            }

            scanExpediter.drive();

            if (iccProfile != null) {
                final Boolean is_srgb = new IccProfileParser().issRGB(iccProfile);
                if (is_srgb == null || !is_srgb.booleanValue()) {
                    final ICC_ColorSpace cs = new ICC_ColorSpace(iccProfile);

                    final ColorModel srgbCM = ColorModel.getRGBdefault();
                    final ColorSpace cs_sRGB = srgbCM.getColorSpace();

                    result = new ColorTools().convertBetweenColorSpaces(result, cs, cs_sRGB);
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

        final List<PngChunk> chunks = PngImageParser.this.readChunks(byteSource, null, false);
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

        if ((chunks.isEmpty())) {
            return false;
        }

        for (int i = 0; i < chunks.size(); i++) {
            final PngChunk chunk = chunks.get(i);
            printCharQuad(pw, "\t" + i + ": ", chunk.chunkType.toCode());
        }

        pw.println("");

        pw.flush();

        return true;
    }

    @Override
    public void writeImage(final BufferedImage src, final OutputStream os, final Map<String, Object> params)
            throws ImageWriteException, IOException {
        new PngWriter().writeImage(src, os, params);
    }

    @Override
    public String getXmpXml(final ByteSource byteSource, final Map<String, Object> params)
            throws ImageReadException, IOException {

        final List<PngChunk> chunks = PngImageParser.this.readChunks(byteSource, iTXt_SEL, false);

        if ((chunks == null) || (chunks.isEmpty())) {
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
            throw new ImageReadException(
                    "PNG contains more than one XMP chunk.");
        }

        final PngChunkItxt chunk = xmpChunks.get(0);
        return chunk.getText();
    }
    
}
