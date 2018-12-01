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

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.DeflaterOutputStream;

import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.PixelDensity;
import org.apache.commons.imaging.formats.png.chunks.PngChunk;
import org.apache.commons.imaging.formats.png.chunks.PngChunkIhdr;
import org.apache.commons.imaging.formats.png.scanline.filters.AdaptiveFilter;
import org.apache.commons.imaging.formats.png.scanline.filters.AdaptiveFilter.FilterType;
import org.apache.commons.imaging.internal.Debug;
import org.apache.commons.imaging.palette.Palette;
import org.apache.commons.imaging.palette.PaletteFactory;
import org.apache.commons.imaging.palette.SimplePalette;

/**
 * Directly writes {@code BufferedImage} objects into an output stream
 * in the PNG format.
 * 
 * PngWriter doesn't use the middle step of converting the BufferedImage
 * into a list of PNG chunks.
 * TODO: Support above for manual manipulation
 * 
 * @author Shukant Pal
 */
class PngWriter {
    
    /**
     * Transforms raw image pixel data into the required PNG IDAT
     * (compressed) form.
     * 
     * {@code DataTransformer} can be used to split compressed pixel
     * data into different chunks.
     */
    static final class ChunkedCompressor {
        
        /**
         * Transformation is done on this pixel data.
         * 
         * Can be set using {@code setInput} or passed during object
         * construction.
         */
        private byte[] pixelInput;
        
        /**
         * Keeps the amount of data that has been transformed already.
         */
        private int transformedTill;
        
        private ByteArrayOutputStream outputStream;
        
        private DeflaterOutputStream deflaterOutputStream;
        
        ChunkedCompressor() {
            this.pixelInput = null;
        }
        
        ChunkedCompressor(byte[] pixelInput) {
            setInput(pixelInput);
        }
        
        void setInput(byte[] pixelInput) {
            this.pixelInput = pixelInput;
            this.transformedTill = 0;
            this.outputStream = new ByteArrayOutputStream();
            this.deflaterOutputStream = new DeflaterOutputStream(outputStream);
        }
        
        /**
         * Returns the index till which input has been transformed
         * into output.
         * 
         * @return size of transformed input minus 1 
         */
        int transformedAmount() {
            return transformedTill;
        }
        
        /**
         * Transforms (at maximum) {@code transformLength} bytes of
         * input into the required output.
         * 
         * See {@code writePixelData} for example usage of this
         * method.
         * 
         * @param transformLength
         * @return 
         */
        byte[] transform(int transformLength) throws IOException, ImageWriteException {
            if(pixelInput == null) {
                throw new ImageWriteException("Couldn't read pixelInput as it is "
                        + "null (it wasn't initialized properly, source bug)");
            }
            
            final int end = Math.min(pixelInput.length,
                    transformedTill + transformLength);
            final int length = end - transformedTill;

            deflaterOutputStream.write(pixelInput, transformedTill, length);
            deflaterOutputStream.flush();
            outputStream.flush();

            final byte[] compressed = outputStream.toByteArray();
            outputStream.reset();
            
            transformedTill += transformLength;
            return compressed;
        }
        
        /**
         * Finishes the transformation and closes the deflation
         * stream.
         * 
         * @return
         * @throws IOException 
         */
        byte[] finish() throws IOException {
            deflaterOutputStream.finish();
            
            byte[] finishCompressed = outputStream.toByteArray();
            outputStream.close();// don't confuse, data-output & not file-output
            
            return finishCompressed;
        }
        
    }

    /*
     1. IHDR: image header, which is the first chunk in a PNG datastream.
     2. PLTE: palette table associated with indexed PNG images.
     3. IDAT: image data chunks.
     4. IEND: image trailer, which is the last chunk in a PNG datastream.

     The remaining 14 chunk types are termed ancillary chunk types, which encoders may generate and decoders may interpret.

     1. Transparency information: tRNS (see 11.3.2: Transparency information).
     2. Colour space information: cHRM, gAMA, iCCP, sBIT, sRGB (see 11.3.3: Colour space information).
     3. Textual information: iTXt, tEXt, zTXt (see 11.3.4: Textual information).
     4. Miscellaneous information: bKGD, hIST, pHYs, sPLT (see 11.3.5: Miscellaneous information).
     5. Time information: tIME (see 11.3.6: Time stamp information).
    
      @deprecated - use a DataOutputStream instead
     */
    private void writeInt(final OutputStream outputStream, final int value) throws IOException {
        outputStream.write(0xff & (value >> 24));
        outputStream.write(0xff & (value >> 16));
        outputStream.write(0xff & (value >> 8));
        outputStream.write(0xff & (value >> 0));
    }

    /**
     * Puts the chunk contents provided into the output-stream with
     * the given arguments.
     *
     * This method doesn't use a {@code Chunk} object, rather the chunk
     * components are provided directly. This is useful for chunk where
     * there are very few fields (like IDAT, whose contents
     * holds the pixel data in one big byte array).
     *
     * This method always calculates the CRC (obviously).
     *
     * @param outputStream stream into which chunk is to be written
     * @param chunkType type of chunk to write
     * @param data contents of the chunk
     * @throws IOException
     */
    private void writeChunkRaw(final OutputStream outputStream, final ChunkType chunkType,
            final byte[] data) throws IOException {
        final int dataLength = data == null ? 0 : data.length;
        writeInt(outputStream, dataLength);
        outputStream.write(chunkType.array);
        if (data != null) {
            outputStream.write(data);
        }

        final PngCrc png_crc = new PngCrc();

        final long crc1 = png_crc.start_partial_crc(chunkType.array, chunkType.array.length);
        final long crc2 = data == null ? crc1 : png_crc.continue_partial_crc(
                crc1, data, data.length);
        final int crc = (int) png_crc.finish_partial_crc(crc2);

        writeInt(outputStream, crc);
    }

    /**
     * Puts the chunk contents (including length, type and CRC) into
     * the output stream provided.
     *
     * Also calculates the CRC if required. (used by writeHeader)
     *
     * @param outputStream stream into which chunk is to be written
     * @param chunk chunk to write
     * @throws IOException
     */
    private void writeChunk(final DataOutputStream outputStream,
            final PngChunk chunk) throws IOException {
        outputStream.writeInt(chunk.contentSize());
        outputStream.writeInt(chunk.chunkType.toCode());

        if (chunk.getBytes() != null) {
            outputStream.write(chunk.getBytes());
        }

        int chunkCRC;

        if (chunk.wasChanged(true)) {
            final PngCrc png_crc = new PngCrc();

            final long crc1 = png_crc.start_partial_crc(chunk.chunkType.array, 4);
            final long crc2 = chunk.getBytes() == null ? crc1 : png_crc.continue_partial_crc(
                    crc1, chunk.getBytes(), chunk.contentSize());
            chunkCRC = (int) png_crc.finish_partial_crc(crc2);
        } else {
            chunkCRC = chunk.crc;
        }

        outputStream.writeInt(chunkCRC);
    }

    // Hooray, ImageHeader and writeChunkIhdr eliminated... (remove this later)
    
    private void writeChunkiTXt(final OutputStream outputStream, final PngText.Itxt text)
            throws IOException, ImageWriteException {
        if (!isValidISO_8859_1(text.keyword)) {
            throw new ImageWriteException("Png tEXt chunk keyword is not ISO-8859-1: " + text.keyword);
        }
        if (!isValidISO_8859_1(text.languageTag)) {
            throw new ImageWriteException("Png tEXt chunk language tag is not ISO-8859-1: " + text.languageTag);
        }

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // keyword
        baos.write(text.keyword.getBytes(StandardCharsets.ISO_8859_1));
        baos.write(0);

        baos.write(1); // compressed flag, true
        baos.write(PngConstants.COMPRESSION_DEFLATE_INFLATE); // compression method

        // language tag
        baos.write(text.languageTag.getBytes(StandardCharsets.ISO_8859_1));
        baos.write(0);

        // translated keyword
        baos.write(text.translatedKeyword.getBytes(StandardCharsets.UTF_8));
        baos.write(0);

        baos.write(deflate(text.text.getBytes(StandardCharsets.UTF_8)));

        writeChunkRaw(outputStream, ChunkType.iTXt, baos.toByteArray());
    }

    private void writeChunkzTXt(final OutputStream outputStream, final PngText.Ztxt text)
            throws IOException, ImageWriteException {
        if (!isValidISO_8859_1(text.keyword)) {
            throw new ImageWriteException("Png zTXt chunk keyword is not ISO-8859-1: " + text.keyword);
        }
        if (!isValidISO_8859_1(text.text)) {
            throw new ImageWriteException("Png zTXt chunk text is not ISO-8859-1: " + text.text);
        }

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // keyword
        baos.write(text.keyword.getBytes(StandardCharsets.ISO_8859_1));
        baos.write(0);

        // compression method
        baos.write(PngConstants.COMPRESSION_DEFLATE_INFLATE);

        // text
        baos.write(deflate(text.text.getBytes(StandardCharsets.ISO_8859_1)));

        writeChunkRaw(outputStream, ChunkType.zTXt, baos.toByteArray());
    }

    private void writeChunktEXt(final OutputStream outputStream, final PngText.Text text)
            throws IOException, ImageWriteException {
        if (!isValidISO_8859_1(text.keyword)) {
            throw new ImageWriteException("Png tEXt chunk keyword is not ISO-8859-1: " + text.keyword);
        }
        if (!isValidISO_8859_1(text.text)) {
            throw new ImageWriteException("Png tEXt chunk text is not ISO-8859-1: " + text.text);
        }

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // keyword
        baos.write(text.keyword.getBytes(StandardCharsets.ISO_8859_1));
        baos.write(0);

        // text
        baos.write(text.text.getBytes(StandardCharsets.ISO_8859_1));

        writeChunkRaw(outputStream, ChunkType.tEXt, baos.toByteArray());
    }

    private byte[] deflate(final byte[] bytes) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            try (DeflaterOutputStream dos = new DeflaterOutputStream(baos)) {
                dos.write(bytes);
                // dos.flush() doesn't work - we must close it before baos.toByteArray()
            }
            return baos.toByteArray();
        }
    }

    private boolean isValidISO_8859_1(final String s) {
        final String roundtrip = new String(s.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.ISO_8859_1);
        return s.equals(roundtrip);
    }

    private void writeChunkXmpiTXt(final OutputStream outputStream, final String xmpXml)
            throws IOException {

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // keyword
        baos.write(PngConstants.XMP_KEYWORD.getBytes(StandardCharsets.ISO_8859_1));
        baos.write(0);

        baos.write(1); // compressed flag, true
        baos.write(PngConstants.COMPRESSION_DEFLATE_INFLATE); // compression method

        baos.write(0); // language tag (ignore). TODO

        // translated keyword
        baos.write(PngConstants.XMP_KEYWORD.getBytes(StandardCharsets.UTF_8));
        baos.write(0);

        baos.write(deflate(xmpXml.getBytes(StandardCharsets.UTF_8)));

        writeChunkRaw(outputStream, ChunkType.iTXt, baos.toByteArray());
    }

    private void writeChunkTRNS(final OutputStream outputStream, final Palette palette) throws IOException {
        final byte[] bytes = new byte[palette.length()];

        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (0xff & (palette.getEntry(i) >> 24));
        }

        writeChunkRaw(outputStream, ChunkType.tRNS, bytes);
    }
/**
     * Puts an IDAT chunk into the output stream with the given image
     * contents.
     * 
     * @param outputStream
     * @param bytes
     * @throws IOException 
     */
    private void writeChunkIDAT(final OutputStream outputStream, final byte[] bytes)
            throws IOException {
        writeChunkRaw(outputStream, ChunkType.IDAT, bytes);
    }
    
    /**
     * Puts an IEND chunk into the output stream, which has no content.
     * 
     * @param outputStream
     * @throws IOException 
     */
    private void writeChunkIEND(final OutputStream outputStream) throws IOException {
        writeChunkRaw(outputStream, ChunkType.IEND, null);
    }

    private void writeChunkPHYS(final OutputStream outputStream, final int xPPU,
            final int yPPU, final byte units)
            throws IOException {
        final byte[] bytes = new byte[9];
        bytes[0] = (byte) (0xff & (xPPU >> 24));
        bytes[1] = (byte) (0xff & (xPPU >> 16));
        bytes[2] = (byte) (0xff & (xPPU >> 8));
        bytes[3] = (byte) (0xff & (xPPU >> 0));
        bytes[4] = (byte) (0xff & (yPPU >> 24));
        bytes[5] = (byte) (0xff & (yPPU >> 16));
        bytes[6] = (byte) (0xff & (yPPU >> 8));
        bytes[7] = (byte) (0xff & (yPPU >> 0));
        bytes[8] = units;
        writeChunkRaw(outputStream, ChunkType.pHYs, bytes);
    }

    private void writeChunkSCAL(final OutputStream outputStream, final double xUPP,
            final double yUPP, final byte units)
            throws IOException {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // unit specifier
        baos.write(units);

        // units per pixel, x-axis
        baos.write(String.valueOf(xUPP).getBytes(StandardCharsets.ISO_8859_1));
        baos.write(0);

        baos.write(String.valueOf(yUPP).getBytes(StandardCharsets.ISO_8859_1));

        writeChunkRaw(outputStream, ChunkType.sCAL, baos.toByteArray());
    }
    
    private byte getBitDepth(final PngColorType pngColorType,
            final Map<String, Object> params) {
        byte depth = 8;

        final Object o = params.get(PngConstants.PARAM_KEY_PNG_BIT_DEPTH);
        if (o instanceof Number) {
            depth = ((Number) o).byteValue();
        }

        return pngColorType.isBitDepthAllowed(depth) ? depth : 8;
    }

    /// Wraps a palette by adding a single transparent entry at index 0.
    private static class TransparentPalette implements Palette {

        private final Palette palette;

        TransparentPalette(final Palette palette) {
            this.palette = palette;
        }

        @Override
        public int getEntry(final int index) {
            if (index == 0) {
                return 0x00000000;
            }
            return palette.getEntry(index - 1);
        }

        @Override
        public int length() {
            return 1 + palette.length();
        }

        @Override
        public int getPaletteIndex(final int rgb) throws ImageWriteException {
            if (rgb == 0x00000000) {
                return 0;
            }
            final int index = palette.getPaletteIndex(rgb);
            if (index >= 0) {
                return 1 + index;
            }
            return index;
        }
    }

   /**
    * Puts the image IHDR chunk into the output stream, with the default values
    * for compressing, filtering, and interlacing methods.
    * 
    * @param width image width in pixels
    * @param height image height in pixels
    * @param bitDepth pixel bit depth
    * @param pngColorType image data color type
    * @param outputStream output stream to write into
    * @throws IOException 
    */
    private void writeHeader(int width, int height, int bitDepth, PngColorType pngColorType,
            DataOutputStream outputStream) throws IOException {
        // Default values for compressing, filtering and interlacing used
        final PngChunkIhdr headerChunk = new PngChunkIhdr(width, height, bitDepth,
                pngColorType, PngConstants.COMPRESSION_TYPE_INFLATE_DEFLATE,
                PngConstants.FILTER_METHOD_ADAPTIVE, InterlaceMethod.NONE);

        writeChunk(outputStream, headerChunk);
    }

    /**
     * Puts the palette into the stream given as the PNG image PLTE chunk.
     *
     * @param outputStream
     * @param palette
     * @throws IOException
     */
    private void writePalette(final OutputStream outputStream, final Palette palette)
            throws IOException {
        final int length = palette.length();
        final byte[] plteContents = new byte[length * 3];

        for (int entryIdx = 0, byteOff = 0; entryIdx < length; entryIdx++) {
            final int rgbEntry = palette.getEntry(entryIdx);
            plteContents[byteOff++] = (byte) (0xFF & (rgbEntry >> 16));
            plteContents[byteOff++] = (byte) (0xFF & (rgbEntry >> 8));
            plteContents[byteOff++] = (byte) (0xFF & (rgbEntry));
        }

        writeChunkRaw(outputStream, ChunkType.PLTE, plteContents);
    }

    /**
     * Puts all the image pixel data into the output stream, in the form
     * of a stream of PNG IDAT chunks.
     * 
     * By default, the IDAT chunk size is limited to 256 kilobytes.
     * TODO: Make PngWriter configurable.
     * 
     * @param outputStream
     * @param refImage
     * @param hasAlpha
     * @param pngColorType
     * @param palette
     * @param isGrayscale
     * @throws ImageWriteException
     * @throws IOException 
     */
    private void writePixelData(final OutputStream outputStream,
            final BufferedImage refImage, final boolean hasAlpha,
            final PngColorType pngColorType, final Palette palette,
            final boolean isGrayscale) throws ImageWriteException, IOException {
        
        // 1. Transform the BufferedImage into an array of pixels (uncompressed)
        // that holds raw image data.
        
        final ByteArrayOutputStream pixelDataBuffer = new ByteArrayOutputStream();
        final ByteArrayOutputStream scanLineBuffer = new ByteArrayOutputStream();
        
        final int width = refImage.getWidth(), height = refImage.getHeight();
        final boolean useAlpha = pngColorType == PngColorType.GREYSCALE_WITH_ALPHA
                || pngColorType == PngColorType.TRUE_COLOR_WITH_ALPHA;
        
        final FilterType filterType = (pngColorType != PngColorType.INDEXED_COLOR) ?
                FilterType.PAETH : FilterType.NONE;
        
        // we only support 8-bit samples (to bad for us :(
        final AdaptiveFilter filterObject = new AdaptiveFilter(pngColorType.getSamplesPerPixel());
        
        final int[] row = new int[width];
        for (int y = 0; y < height; y++) {
            refImage.getRGB(0, y, width, 1, row, 0, width);
            pixelDataBuffer.write(filterType.ordinal());
            
            scanLineBuffer.reset();
            
            for (int x = 0; x < width; x++) {
                final int argb = row[x];

                if (palette != null) {
                    if (hasAlpha && (argb >>> 24) == 0x00) {
                        scanLineBuffer.write(0);
                    } else {
                        final int index = palette.getPaletteIndex(argb);
                        scanLineBuffer.write(0xff & index);
                    }
                } else {
                    final int alpha = 0xff & (argb >> 24);
                    final int red = 0xff & (argb >> 16);
                    final int green = 0xff & (argb >> 8);
                    final int blue = 0xff & (argb);

                    if (isGrayscale) {
                        final int gray = (red + green + blue) / 3;
                        scanLineBuffer.write(gray);
                    } else {
                        scanLineBuffer.write(red);
                        scanLineBuffer.write(green);
                        scanLineBuffer.write(blue);
                    }
                    if (useAlpha) {
                        scanLineBuffer.write(alpha);
                    }
                }
            }
            
            pixelDataBuffer.write(filterObject.filter(filterType, scanLineBuffer.toByteArray()));
        }
        
        // 2. Feed the uncompressed raw pixel data into a DataTransformer and
        // write it into IDAT chunks.
        
        byte[] uncompressed = pixelDataBuffer.toByteArray();
        ChunkedCompressor pixelTrs = new ChunkedCompressor(uncompressed);
        final int idatChunkLength = 256 * 1024;// default length
        
        while(pixelTrs.transformedAmount() < uncompressed.length) {
            writeChunkIDAT(outputStream, pixelTrs.transform(idatChunkLength));
        }
        
        byte[] finishData = pixelTrs.finish();
        if(finishData.length >= 0) {
            writeChunkIDAT(outputStream, finishData);
        } // Hooray, we're done.
    }

    /*
     between two chunk types indicates alternatives.
     Table 5.3 - Chunk ordering rules
     Critical chunks
     (shall appear in this order, except PLTE is optional)
     Chunk name     Multiple allowed    Ordering constraints
     IHDR   No  Shall be first
     PLTE   No  Before first IDAT
     IDAT   Yes Multiple IDAT chunks shall be consecutive
     IEND   No  Shall be last
     Ancillary chunks
     (need not appear in this order)
     Chunk name     Multiple allowed    Ordering constraints
     cHRM   No  Before PLTE and IDAT
     gAMA   No  Before PLTE and IDAT
     iCCP   No  Before PLTE and IDAT. If the iCCP chunk is present, the sRGB chunk should not be present.
     sBIT   No  Before PLTE and IDAT
     sRGB   No  Before PLTE and IDAT. If the sRGB chunk is present, the iCCP chunk should not be present.
     bKGD   No  After PLTE; before IDAT
     hIST   No  After PLTE; before IDAT
     tRNS   No  After PLTE; before IDAT
     pHYs   No  Before IDAT
     sCAL   No  Before IDAT
     sPLT   Yes Before IDAT
     tIME   No  None
     iTXt   Yes None
     tEXt   Yes None
     zTXt   Yes None
     */
    
    /**
     * Writes {@code src} into the output stream in the PNG file format.
     * 
     * @param src
     * @param outputStream
     * @param params
     * @throws ImageWriteException
     * @throws IOException 
     */
    public void writeImage(final BufferedImage src, final OutputStream outputStream, Map<String, Object> params)
            throws ImageWriteException, IOException {
        DataOutputStream dost = new DataOutputStream(outputStream);
        // make copy of params; we'll clear keys as we consume them.
        params = new HashMap<>(params);

        // clear format key.
        if (params.containsKey(ImagingConstants.PARAM_KEY_FORMAT)) {
            params.remove(ImagingConstants.PARAM_KEY_FORMAT);
        }

        final Map<String, Object> rawParams = new HashMap<>(params);
        if (params.containsKey(PngConstants.PARAM_KEY_PNG_FORCE_TRUE_COLOR)) {
            params.remove(PngConstants.PARAM_KEY_PNG_FORCE_TRUE_COLOR);
        }
        if (params.containsKey(PngConstants.PARAM_KEY_PNG_FORCE_INDEXED_COLOR)) {
            params.remove(PngConstants.PARAM_KEY_PNG_FORCE_INDEXED_COLOR);
        }
        if (params.containsKey(PngConstants.PARAM_KEY_PNG_BIT_DEPTH)) {
            params.remove(PngConstants.PARAM_KEY_PNG_BIT_DEPTH);
        }
        if (params.containsKey(ImagingConstants.PARAM_KEY_XMP_XML)) {
            params.remove(ImagingConstants.PARAM_KEY_XMP_XML);
        }
        if (params.containsKey(PngConstants.PARAM_KEY_PNG_TEXT_CHUNKS)) {
            params.remove(PngConstants.PARAM_KEY_PNG_TEXT_CHUNKS);
        }
        params.remove(ImagingConstants.PARAM_KEY_PIXEL_DENSITY);
        params.remove(PngConstants.PARAM_KEY_PHYSICAL_SCALE);
        if (!params.isEmpty()) {
            final Object firstKey = params.keySet().iterator().next();
            throw new ImageWriteException("Unknown parameter: " + firstKey);
        }
        params = rawParams;

        final int width = src.getWidth();
        final int height = src.getHeight();

        final boolean hasAlpha = new PaletteFactory().hasTransparency(src);
        Debug.debug("hasAlpha: " + hasAlpha);
        // int transparency = new PaletteFactory().getTransparency(src);

        boolean isGrayscale = new PaletteFactory().isGrayscale(src);
        Debug.debug("isGrayscale: " + isGrayscale);

        PngColorType pngColorType;
        {
            final boolean forceIndexedColor = Boolean.TRUE.equals(params.get(PngConstants.PARAM_KEY_PNG_FORCE_INDEXED_COLOR));
            final boolean forceTrueColor = Boolean.TRUE.equals(params.get(PngConstants.PARAM_KEY_PNG_FORCE_TRUE_COLOR));

            if (forceIndexedColor && forceTrueColor) {
                throw new ImageWriteException(
                        "Params: Cannot force both indexed and true color modes");
            } else if (forceIndexedColor) {
                pngColorType = PngColorType.INDEXED_COLOR;
            } else if (forceTrueColor) {
                pngColorType = (hasAlpha ? PngColorType.TRUE_COLOR_WITH_ALPHA : PngColorType.TRUE_COLOR);
                isGrayscale = false;
            } else {
                pngColorType = PngColorType.getColorType(hasAlpha, isGrayscale);
            }
            Debug.debug("colorType: " + pngColorType);
        }

        final byte bitDepth = getBitDepth(pngColorType, params);
        Debug.debug("bitDepth: " + bitDepth);

        int sampleDepth;
        if (pngColorType == PngColorType.INDEXED_COLOR) {
            sampleDepth = 8;
        } else {
            sampleDepth = bitDepth;
        }
        Debug.debug("sampleDepth: " + sampleDepth);

        {
            PngConstants.PNG_SIGNATURE.writeTo(outputStream);
        }

        writeHeader(width, height, bitDepth, pngColorType, dost);

        //{
        // sRGB No Before PLTE and IDAT. If the sRGB chunk is present, the
        // iCCP chunk should not be present.
        // charles
        //}
        Palette palette = null;
        if (pngColorType == PngColorType.INDEXED_COLOR) {
            // PLTE No Before first IDAT

            final int maxColors = hasAlpha ? 255 : 256;

            final PaletteFactory paletteFactory = new PaletteFactory();
            palette = paletteFactory.makeQuantizedRgbPalette(src, maxColors);
            // Palette palette2 = new PaletteFactory().makePaletteSimple(src,
            // maxColors);

            // palette.dump();
            if (hasAlpha) {
                palette = new TransparentPalette(palette);
                writePalette(outputStream, palette);
                writeChunkTRNS(outputStream, new SimplePalette(new int[]{0x00000000}));
            } else {
                writePalette(outputStream, palette);
            }
        }

        final Object pixelDensityObj = params.get(ImagingConstants.PARAM_KEY_PIXEL_DENSITY);
        if (pixelDensityObj instanceof PixelDensity) {
            final PixelDensity pixelDensity = (PixelDensity) pixelDensityObj;
            if (pixelDensity.isUnitless()) {
                writeChunkPHYS(outputStream, (int) Math.round(pixelDensity.getRawHorizontalDensity()),
                        (int) Math.round(pixelDensity.getRawVerticalDensity()),
                        (byte) 0);
            } else {
                writeChunkPHYS(outputStream, (int) Math.round(pixelDensity.horizontalDensityMetres()),
                        (int) Math.round(pixelDensity.verticalDensityMetres()),
                        (byte) 1);
            }
        }

        final Object physcialScaleObj = params.get(PngConstants.PARAM_KEY_PHYSICAL_SCALE);
        if (physcialScaleObj instanceof PhysicalScale) {
            final PhysicalScale physicalScale = (PhysicalScale) physcialScaleObj;
            writeChunkSCAL(outputStream, physicalScale.getHorizontalUnitsPerPixel(), physicalScale.getVerticalUnitsPerPixel(),
                    physicalScale.isInMeters() ? (byte) 1 : (byte) 2);
        }

        if (params.containsKey(ImagingConstants.PARAM_KEY_XMP_XML)) {
            final String xmpXml = (String) params.get(ImagingConstants.PARAM_KEY_XMP_XML);
            writeChunkXmpiTXt(outputStream, xmpXml);
        }

        if (params.containsKey(PngConstants.PARAM_KEY_PNG_TEXT_CHUNKS)) {
            final List<?> outputTexts = (List<?>) params.get(PngConstants.PARAM_KEY_PNG_TEXT_CHUNKS);
            for (final Object outputText : outputTexts) {
                final PngText text = (PngText) outputText;
                if (text instanceof PngText.Text) {
                    writeChunktEXt(outputStream, (PngText.Text) text);
                } else if (text instanceof PngText.Ztxt) {
                    writeChunkzTXt(outputStream, (PngText.Ztxt) text);
                } else if (text instanceof PngText.Itxt) {
                    writeChunkiTXt(outputStream, (PngText.Itxt) text);
                } else {
                    throw new ImageWriteException(
                            "Unknown text to embed in PNG: " + text);
                }
            }
        }
        
        this.writePixelData(outputStream, src, hasAlpha,
                pngColorType, palette, isGrayscale);
        this.writeChunkIEND(outputStream);
        
        /*
         Ancillary chunks
         (need not appear in this order)
         Chunk name     Multiple allowed    Ordering constraints
         cHRM           No                  Before PLTE and IDAT
         gAMA           No                  Before PLTE and IDAT
         iCCP           No                  Before PLTE and IDAT. If the iCCP chunk is present, the sRGB chunk should not be present.
         sBIT           No                  Before PLTE and IDAT
         sRGB           No                  Before PLTE and IDAT. If the sRGB chunk is present, the iCCP chunk should not be present.
         bKGD           No                  After PLTE; before IDAT
         hIST           No                  After PLTE; before IDAT
         tRNS           No                  After PLTE; before IDAT
         pHYs           No                  Before IDAT
         sCAL           No                  Before IDAT
         sPLT           Yes                 Before IDAT
         tIME           No                  None
         iTXt           Yes                 None
         tEXt           Yes                 None
         zTXt           Yes                 None
         */
        outputStream.close();
    } // todo: filter types
    // proper colour types
    // srgb, etc.
}
