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
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.PixelDensity;
import org.apache.commons.imaging.internal.Debug;
import org.apache.commons.imaging.palette.Palette;
import org.apache.commons.imaging.palette.PaletteFactory;

class PngWriter {

    /*
     1. IHDR: image header, which is the first chunk in a PNG datastream.
     2. PLTE: palette table associated with indexed PNG images.
     3. IDAT: image data chunks.
     4. IEND: image trailer, which is the last chunk in a PNG datastream.

     The remaining 14 chunk types are termed ancillary chunk types, which encoders may generate and decoders may interpret.

     1. Transparency information: tRNS (see 11.3.2: Transparency information).
     2. Color space information: cHRM, gAMA, iCCP, sBIT, sRGB (see 11.3.3: Color space information).
     3. Textual information: iTXt, tEXt, zTXt (see 11.3.4: Textual information).
     4. Miscellaneous information: bKGD, hIST, pHYs, sPLT (see 11.3.5: Miscellaneous information).
     5. Time information: tIME (see 11.3.6: Time stamp information).
    */

    private void writeInt(final OutputStream os, final int value) throws IOException {
        os.write(0xff & (value >> 24));
        os.write(0xff & (value >> 16));
        os.write(0xff & (value >> 8));
        os.write(0xff & (value >> 0));
    }

    private void writeChunk(final OutputStream os, final ChunkType chunkType,
            final byte[] data) throws IOException {
        final int dataLength = data == null ? 0 : data.length;
        writeInt(os, dataLength);
        os.write(chunkType.array);
        if (data != null) {
            os.write(data);
        }

        final PngCrc png_crc = new PngCrc();

        final long crc1 = png_crc.start_partial_crc(chunkType.array, chunkType.array.length);
        final long crc2 = data == null ? crc1 : png_crc.continue_partial_crc(
                crc1, data, data.length);
        final int crc = (int) png_crc.finish_partial_crc(crc2);

        writeInt(os, crc);
    }

    private static class ImageHeader {
        public final int width;
        public final int height;
        public final byte bitDepth;
        public final PngColorType pngColorType;
        public final byte compressionMethod;
        public final byte filterMethod;
        public final InterlaceMethod interlaceMethod;

        ImageHeader(final int width, final int height, final byte bitDepth,
                final PngColorType pngColorType, final byte compressionMethod, final byte filterMethod,
                final InterlaceMethod interlaceMethod) {
            this.width = width;
            this.height = height;
            this.bitDepth = bitDepth;
            this.pngColorType = pngColorType;
            this.compressionMethod = compressionMethod;
            this.filterMethod = filterMethod;
            this.interlaceMethod = interlaceMethod;
        }

    }

    private void writeChunkIHDR(final OutputStream os, final ImageHeader value) throws IOException {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        writeInt(baos, value.width);
        writeInt(baos, value.height);
        baos.write(0xff & value.bitDepth);
        baos.write(0xff & value.pngColorType.getValue());
        baos.write(0xff & value.compressionMethod);
        baos.write(0xff & value.filterMethod);
        baos.write(0xff & value.interlaceMethod.ordinal());

        writeChunk(os, ChunkType.IHDR, baos.toByteArray());
    }

    private void writeChunkiTXt(final OutputStream os, final PngText.Itxt text)
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

        writeChunk(os, ChunkType.iTXt, baos.toByteArray());
    }

    private void writeChunkzTXt(final OutputStream os, final PngText.Ztxt text)
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

        writeChunk(os, ChunkType.zTXt, baos.toByteArray());
    }

    private void writeChunktEXt(final OutputStream os, final PngText.Text text)
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

        writeChunk(os, ChunkType.tEXt, baos.toByteArray());
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

    private void writeChunkXmpiTXt(final OutputStream os, final String xmpXml)
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

        writeChunk(os, ChunkType.iTXt, baos.toByteArray());
    }

    private void writeChunkPLTE(final OutputStream os, final Palette palette)
            throws IOException {
        final int length = palette.length();
        final byte[] bytes = new byte[length * 3];

        // Debug.debug("length", length);
        for (int i = 0; i < length; i++) {
            final int rgb = palette.getEntry(i);
            final int index = i * 3;
            // Debug.debug("index", index);
            bytes[index + 0] = (byte) (0xff & (rgb >> 16));
            bytes[index + 1] = (byte) (0xff & (rgb >> 8));
            bytes[index + 2] = (byte) (0xff & (rgb >> 0));
        }

        writeChunk(os, ChunkType.PLTE, bytes);
    }

    private void writeChunkTRNS(final OutputStream os, final Palette palette) throws IOException {
        final byte[] bytes = new byte[palette.length()];

        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (0xff & (palette.getEntry(i) >> 24));
        }

        writeChunk(os, ChunkType.tRNS, bytes);
    }

    private void writeChunkIEND(final OutputStream os) throws IOException {
        writeChunk(os, ChunkType.IEND, null);
    }

    private void writeChunkIDAT(final OutputStream os, final byte[] bytes)
            throws IOException {
        writeChunk(os, ChunkType.IDAT, bytes);
    }

    private void writeChunkPHYS(final OutputStream os, final int xPPU, final int yPPU, final byte units)
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
        writeChunk(os, ChunkType.pHYs, bytes);
    }

    private void writeChunkSCAL(final OutputStream os, final double xUPP, final double yUPP, final byte units)
          throws IOException {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // unit specifier
        baos.write(units);

        // units per pixel, x-axis
        baos.write(String.valueOf(xUPP).getBytes(StandardCharsets.ISO_8859_1));
        baos.write(0);

        baos.write(String.valueOf(yUPP).getBytes(StandardCharsets.ISO_8859_1));

        writeChunk(os, ChunkType.sCAL, baos.toByteArray());
    }

    private byte getBitDepth(final PngColorType pngColorType, final PngImagingParameters params) {
        byte depth = params.getBitDepth();

        return pngColorType.isBitDepthAllowed(depth) ? depth : PngImagingParameters.DEFAULT_BIT_DEPTH;
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
    public void writeImage(final BufferedImage src, final OutputStream os, PngImagingParameters params)
            throws ImageWriteException, IOException {
        int compressionLevel = Deflater.DEFAULT_COMPRESSION;

        final int width = src.getWidth();
        final int height = src.getHeight();

        final boolean hasAlpha = new PaletteFactory().hasTransparency(src);
        Debug.debug("hasAlpha: " + hasAlpha);
        // int transparency = new PaletteFactory().getTransparency(src);

        boolean isGrayscale = new PaletteFactory().isGrayscale(src);
        Debug.debug("isGrayscale: " + isGrayscale);

        PngColorType pngColorType;
        {
            final boolean forceIndexedColor =  params.isForceIndexedColor();
            final boolean forceTrueColor = params.isForceTrueColor();

            if (forceIndexedColor && forceTrueColor) {
                throw new ImageWriteException(
                        "Params: Cannot force both indexed and true color modes");
            }
            if (forceIndexedColor) {
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
            PngConstants.PNG_SIGNATURE.writeTo(os);
        }
        {
            // IHDR must be first

            final byte compressionMethod = PngConstants.COMPRESSION_TYPE_INFLATE_DEFLATE;
            final byte filterMethod = PngConstants.FILTER_METHOD_ADAPTIVE;
            final InterlaceMethod interlaceMethod = InterlaceMethod.NONE;

            final ImageHeader imageHeader = new ImageHeader(width, height, bitDepth,
                    pngColorType, compressionMethod, filterMethod, interlaceMethod);

            writeChunkIHDR(os, imageHeader);
        }

        //{
            // sRGB No Before PLTE and IDAT. If the sRGB chunk is present, the
            // iCCP chunk should not be present.

            // charles
        //}

        Palette palette = null;
        if (pngColorType == PngColorType.INDEXED_COLOR) {
            // PLTE No Before first IDAT

            final int maxColors = 256;

            final PaletteFactory paletteFactory = new PaletteFactory();

            if (hasAlpha) {
                palette = paletteFactory.makeQuantizedRgbaPalette(src, hasAlpha, maxColors);
                writeChunkPLTE(os, palette);
                writeChunkTRNS(os, palette);
            } else {
                palette = paletteFactory.makeQuantizedRgbPalette(src, maxColors);
                writeChunkPLTE(os, palette);
            }
        }

        final Object pixelDensityObj = params.getPixelDensity();
        if (pixelDensityObj instanceof PixelDensity) {
            final PixelDensity pixelDensity = (PixelDensity) pixelDensityObj;
            if (pixelDensity.isUnitless()) {
                writeChunkPHYS(os, (int) Math.round(pixelDensity.getRawHorizontalDensity()),
                        (int) Math.round(pixelDensity.getRawVerticalDensity()),
                        (byte) 0);
            } else {
                writeChunkPHYS(os, (int) Math.round(pixelDensity.horizontalDensityMetres()),
                        (int) Math.round(pixelDensity.verticalDensityMetres()),
                        (byte) 1);
            }
        }

        final PhysicalScale physicalScale = params.getPhysicalScale();
        if (physicalScale != null) {
            writeChunkSCAL(
            		os,
            		physicalScale.getHorizontalUnitsPerPixel(),
            		physicalScale.getVerticalUnitsPerPixel(),
                    physicalScale.isInMeters() ? (byte) 1 : (byte) 2);
        }

        final String xmpXml = params.getXmpXml();
        if (xmpXml != null) {
            writeChunkXmpiTXt(os, xmpXml);
        }

        final List<PngText> outputTexts = params.getTextChunks();
        if (outputTexts != null) {
            for (final PngText text : outputTexts) {
                if (text instanceof PngText.Text) {
                    writeChunktEXt(os, (PngText.Text) text);
                } else if (text instanceof PngText.Ztxt) {
                    writeChunkzTXt(os, (PngText.Ztxt) text);
                } else if (text instanceof PngText.Itxt) {
                    writeChunkiTXt(os, (PngText.Itxt) text);
                } else {
                    throw new ImageWriteException("Unknown text to embed in PNG: " + text);
                }
            }
        }

        {
            // Debug.debug("writing IDAT");

            // IDAT Yes Multiple IDAT chunks shall be consecutive

            byte[] uncompressed;
            {
                final ByteArrayOutputStream baos = new ByteArrayOutputStream();

                final boolean useAlpha = pngColorType == PngColorType.GREYSCALE_WITH_ALPHA
                        || pngColorType == PngColorType.TRUE_COLOR_WITH_ALPHA;

                final int[] row = new int[width];
                for (int y = 0; y < height; y++) {
                    // Debug.debug("y", y + "/" + height);
                    src.getRGB(0, y, width, 1, row, 0, width);

                    baos.write(FilterType.NONE.ordinal());
                    for (int x = 0; x < width; x++) {
                        final int argb = row[x];

                        if (palette != null) {
                            final int index = palette.getPaletteIndex(argb);
                            baos.write(0xff & index);
                        } else {
                            final int alpha = 0xff & (argb >> 24);
                            final int red = 0xff & (argb >> 16);
                            final int green = 0xff & (argb >> 8);
                            final int blue = 0xff & (argb >> 0);

                            if (isGrayscale) {
                                final int gray = (red + green + blue) / 3;
                                // if (y == 0)
                                // {
                                // Debug.debug("gray: " + x + ", " + y +
                                // " argb: 0x"
                                // + Integer.toHexString(argb) + " gray: 0x"
                                // + Integer.toHexString(gray));
                                // // Debug.debug(x + ", " + y + " gray", gray);
                                // // Debug.debug(x + ", " + y + " gray", gray);
                                // Debug.debug(x + ", " + y + " gray", gray +
                                // " " + Integer.toHexString(gray));
                                // Debug.debug();
                                // }
                                baos.write(gray);
                            } else {
                                baos.write(red);
                                baos.write(green);
                                baos.write(blue);
                            }
                            if (useAlpha) {
                                baos.write(alpha);
                            }
                        }
                    }
                }
                uncompressed = baos.toByteArray();
            }

            // Debug.debug("uncompressed", uncompressed.length);

            final ByteArrayOutputStream baos = new ByteArrayOutputStream();
            final int chunkSize = 256 * 1024;
            final Deflater deflater = new Deflater(compressionLevel);
            final DeflaterOutputStream dos = new DeflaterOutputStream(baos,deflater,chunkSize);

            for (int index = 0; index < uncompressed.length; index += chunkSize) {
                final int end = Math.min(uncompressed.length, index + chunkSize);
                final int length = end - index;

                dos.write(uncompressed, index, length);
                dos.flush();
                baos.flush();

                final byte[] compressed = baos.toByteArray();
                baos.reset();
                if (compressed.length > 0) {
                    // Debug.debug("compressed", compressed.length);
                    writeChunkIDAT(os, compressed);
                }

            }
            {
                dos.finish();
                final byte[] compressed = baos.toByteArray();
                if (compressed.length > 0) {
                    // Debug.debug("compressed final", compressed.length);
                    writeChunkIDAT(os, compressed);
                }
            }
        }

        {
            // IEND No Shall be last

            writeChunkIEND(os);
        }

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

        os.close();
    } // todo: filter types
      // proper colour types
      // srgb, etc.
}
