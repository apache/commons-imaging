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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.DeflaterOutputStream;

import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.PixelDensity;
import org.apache.commons.imaging.common.ZLibUtils;
import org.apache.commons.imaging.palette.Palette;
import org.apache.commons.imaging.palette.PaletteFactory;
import org.apache.commons.imaging.palette.SimplePalette;
import org.apache.commons.imaging.util.Debug;
import org.apache.commons.imaging.util.ParamMap;
import org.apache.commons.imaging.util.UnicodeUtils;

public class PngWriter {
    private final boolean verbose;

    public PngWriter(final boolean verbose) {
        this.verbose = verbose;
    }

    public PngWriter(final Map<String,Object> params) {
        this.verbose = ParamMap.getParamBoolean(params, ImagingConstants.PARAM_KEY_VERBOSE,
                false);
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
    */
    
    private final void writeInt(final OutputStream os, final int value) throws IOException {
        os.write(0xff & (value >> 24));
        os.write(0xff & (value >> 16));
        os.write(0xff & (value >> 8));
        os.write(0xff & (value >> 0));
    }

    private final void writeChunk(final OutputStream os, final byte chunkType[],
            final byte data[]) throws IOException {
        final int dataLength = data == null ? 0 : data.length;
        writeInt(os, dataLength);
        os.write(chunkType);
        if (data != null) {
            os.write(data);
        }

        final PngCrc png_crc = new PngCrc();

        final long crc1 = png_crc.start_partial_crc(chunkType, chunkType.length);
        final long crc2 = data == null ? crc1 : png_crc.continue_partial_crc(
                crc1, data, data.length);
        final int crc = (int) png_crc.finish_partial_crc(crc2);

        writeInt(os, crc);
    }

    private static class ImageHeader {
        public final int width;
        public final int height;
        public final byte bit_depth;
        public final byte colorType;
        public final byte compressionMethod;
        public final byte filterMethod;
        public final byte interlaceMethod;

        public ImageHeader(final int width, final int height, final byte bit_depth,
                final byte colorType, final byte compressionMethod, final byte filterMethod,
                final byte interlaceMethod) {
            this.width = width;
            this.height = height;
            this.bit_depth = bit_depth;
            this.colorType = colorType;
            this.compressionMethod = compressionMethod;
            this.filterMethod = filterMethod;
            this.interlaceMethod = interlaceMethod;
        }

    }

    private void writeChunkIHDR(final OutputStream os, final ImageHeader value)
            throws IOException {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        writeInt(baos, value.width);
        writeInt(baos, value.height);
        baos.write(0xff & value.bit_depth);
        baos.write(0xff & value.colorType);
        baos.write(0xff & value.compressionMethod);
        baos.write(0xff & value.filterMethod);
        baos.write(0xff & value.interlaceMethod);

        // Debug.debug("baos", baos.toByteArray());

        writeChunk(os, PngConstants.IHDR_CHUNK_TYPE.toByteArray(), baos.toByteArray());
    }

    private void writeChunkiTXt(final OutputStream os, final PngText.Itxt text)
            throws IOException, ImageWriteException {
        if (!UnicodeUtils.isValidISO_8859_1(text.keyword)) {
            throw new ImageWriteException(
                    "Png tEXt chunk keyword is not ISO-8859-1: " + text.keyword);
        }
        if (!UnicodeUtils.isValidISO_8859_1(text.languageTag)) {
            throw new ImageWriteException(
                    "Png tEXt chunk language tag is not ISO-8859-1: "
                            + text.languageTag);
        }

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // keyword
        baos.write(text.keyword.getBytes("ISO-8859-1"));
        baos.write(0);

        baos.write(1); // compressed flag, true
        baos.write(PngConstants.COMPRESSION_DEFLATE_INFLATE); // compression method

        // language tag
        baos.write(text.languageTag.getBytes("ISO-8859-1"));
        baos.write(0);

        // translated keyword
        baos.write(text.translatedKeyword.getBytes("utf-8"));
        baos.write(0);

        baos.write(new ZLibUtils().deflate(text.text.getBytes("utf-8")));

        writeChunk(os, PngConstants.iTXt_CHUNK_TYPE.toByteArray(), baos.toByteArray());
    }

    private void writeChunkzTXt(final OutputStream os, final PngText.Ztxt text)
            throws IOException, ImageWriteException {
        if (!UnicodeUtils.isValidISO_8859_1(text.keyword)) {
            throw new ImageWriteException(
                    "Png zTXt chunk keyword is not ISO-8859-1: " + text.keyword);
        }
        if (!UnicodeUtils.isValidISO_8859_1(text.text)) {
            throw new ImageWriteException(
                    "Png zTXt chunk text is not ISO-8859-1: " + text.text);
        }

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // keyword
        baos.write(text.keyword.getBytes("ISO-8859-1"));
        baos.write(0);

        // compression method
        baos.write(PngConstants.COMPRESSION_DEFLATE_INFLATE);

        // text
        baos.write(new ZLibUtils().deflate(text.text.getBytes("ISO-8859-1")));

        writeChunk(os, PngConstants.zTXt_CHUNK_TYPE.toByteArray(), baos.toByteArray());
    }

    private void writeChunktEXt(final OutputStream os, final PngText.Text text)
            throws IOException, ImageWriteException {
        if (!UnicodeUtils.isValidISO_8859_1(text.keyword)) {
            throw new ImageWriteException(
                    "Png tEXt chunk keyword is not ISO-8859-1: " + text.keyword);
        }
        if (!UnicodeUtils.isValidISO_8859_1(text.text)) {
            throw new ImageWriteException(
                    "Png tEXt chunk text is not ISO-8859-1: " + text.text);
        }

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // keyword
        baos.write(text.keyword.getBytes("ISO-8859-1"));
        baos.write(0);

        // text
        baos.write(text.text.getBytes("ISO-8859-1"));

        writeChunk(os, PngConstants.tEXt_CHUNK_TYPE.toByteArray(), baos.toByteArray());
    }

    private void writeChunkXmpiTXt(final OutputStream os, final String xmpXml)
            throws IOException {

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // keyword
        baos.write(PngConstants.XMP_KEYWORD.getBytes("ISO-8859-1"));
        baos.write(0);

        baos.write(1); // compressed flag, true
        baos.write(PngConstants.COMPRESSION_DEFLATE_INFLATE); // compression method

        baos.write(0); // language tag (ignore). TODO

        // translated keyword
        baos.write(PngConstants.XMP_KEYWORD.getBytes("utf-8"));
        baos.write(0);

        baos.write(new ZLibUtils().deflate(xmpXml.getBytes("utf-8")));

        writeChunk(os, PngConstants.iTXt_CHUNK_TYPE.toByteArray(), baos.toByteArray());
    }

    private void writeChunkPLTE(final OutputStream os, final Palette palette)
            throws IOException {
        final int length = palette.length();
        final byte bytes[] = new byte[length * 3];

        // Debug.debug("length", length);
        for (int i = 0; i < length; i++) {
            final int rgb = palette.getEntry(i);
            final int index = i * 3;
            // Debug.debug("index", index);
            bytes[index + 0] = (byte) (0xff & (rgb >> 16));
            bytes[index + 1] = (byte) (0xff & (rgb >> 8));
            bytes[index + 2] = (byte) (0xff & (rgb >> 0));
        }

        writeChunk(os, PngConstants.PLTE_CHUNK_TYPE.toByteArray(), bytes);
    }

    private void writeChunkTRNS(final OutputStream os, final Palette palette) throws IOException {
        final byte[] bytes = new byte[palette.length()];
        
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (0xff & (palette.getEntry(i) >> 24));
        }
        
        writeChunk(os, PngConstants.TRNS_CHUNK_TYPE.toByteArray(), bytes);
    }

    private void writeChunkIEND(final OutputStream os) throws IOException {
        writeChunk(os, PngConstants.IEND_CHUNK_TYPE.toByteArray(), null);
    }

    private void writeChunkIDAT(final OutputStream os, final byte bytes[])
            throws IOException {
        writeChunk(os, PngConstants.IDAT_CHUNK_TYPE.toByteArray(), bytes);
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
        writeChunk(os, PngConstants.IPHYS_CHUNK_TYPE.toByteArray(), bytes);
    }

    private byte getColourType(final boolean hasAlpha, final boolean isGrayscale) {
        byte result;

        final boolean index = false; // charles

        if (index) {
            result = PngConstants.COLOR_TYPE_INDEXED_COLOR;
        } else if (isGrayscale) {
            if (hasAlpha) {
                result = PngConstants.COLOR_TYPE_GREYSCALE_WITH_ALPHA;
            } else {
                result = PngConstants.COLOR_TYPE_GREYSCALE;
            }
        } else if (hasAlpha) {
            result = PngConstants.COLOR_TYPE_TRUE_COLOR_WITH_ALPHA;
        } else {
            result = PngConstants.COLOR_TYPE_TRUE_COLOR;
        }

        return result;
    }

    private byte getBitDepth(final byte colorType, final Map<String,Object> params) {
        byte result = 8;

        final Object o = params.get(PngConstants.PARAM_KEY_PNG_BIT_DEPTH);
        if (o != null && o instanceof Number) {
            final int value = ((Number) o).intValue();
            switch (value) {
            case 1:
            case 2:
            case 4:
            case 8:
            case 16:
                result = (byte) value;
                break;
            default:
                result = 8;
            }
            switch (colorType) {
            case PngConstants.COLOR_TYPE_GREYSCALE:
                break;
            case PngConstants.COLOR_TYPE_INDEXED_COLOR:
                result = (byte) Math.min(8, result);
                break;
            case PngConstants.COLOR_TYPE_GREYSCALE_WITH_ALPHA:
            case PngConstants.COLOR_TYPE_TRUE_COLOR:
            case PngConstants.COLOR_TYPE_TRUE_COLOR_WITH_ALPHA:
                result = (byte) Math.max(8, result);
                break;
            default:
                result = 8;
            }
        }

        return result;
    }

    /// Wraps a palette by adding a single transparent entry at index 0.
    private static class TransparentPalette extends Palette {
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
     sPLT   Yes Before IDAT
     tIME   No  None
     iTXt   Yes None
     tEXt   Yes None
     zTXt   Yes None
     */
    public void writeImage(final BufferedImage src, final OutputStream os, Map<String,Object> params)
            throws ImageWriteException, IOException {
        // make copy of params; we'll clear keys as we consume them.
        params = new HashMap<String,Object>(params);

        // clear format key.
        if (params.containsKey(ImagingConstants.PARAM_KEY_FORMAT)) {
            params.remove(ImagingConstants.PARAM_KEY_FORMAT);
        }
        // clear verbose key.
        if (params.containsKey(ImagingConstants.PARAM_KEY_VERBOSE)) {
            params.remove(ImagingConstants.PARAM_KEY_VERBOSE);
        }

        final Map<String,Object> rawParams = new HashMap<String,Object>(params);
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
        if (params.size() > 0) {
            final Object firstKey = params.keySet().iterator().next();
            throw new ImageWriteException("Unknown parameter: " + firstKey);
        }
        params = rawParams;

        final int width = src.getWidth();
        final int height = src.getHeight();

        final boolean hasAlpha = new PaletteFactory().hasTransparency(src);
        if (verbose) {
            Debug.debug("hasAlpha", hasAlpha);
        }
        // int transparency = new PaletteFactory().getTransparency(src);

        boolean isGrayscale = new PaletteFactory().isGrayscale(src);
        if (verbose) {
            Debug.debug("isGrayscale", isGrayscale);
        }

        byte colorType;
        {
            final boolean forceIndexedColor = ParamMap.getParamBoolean(params,
                    PngConstants.PARAM_KEY_PNG_FORCE_INDEXED_COLOR, false);
            final boolean forceTrueColor = ParamMap.getParamBoolean(params,
                    PngConstants.PARAM_KEY_PNG_FORCE_TRUE_COLOR, false);

            if (forceIndexedColor && forceTrueColor) {
                throw new ImageWriteException(
                        "Params: Cannot force both indexed and true color modes");
            } else if (forceIndexedColor) {
                colorType = PngConstants.COLOR_TYPE_INDEXED_COLOR;
            } else if (forceTrueColor) {
                colorType = (byte) (hasAlpha ? PngConstants.COLOR_TYPE_TRUE_COLOR_WITH_ALPHA
                        : PngConstants.COLOR_TYPE_TRUE_COLOR);
                isGrayscale = false;
            } else {
                colorType = getColourType(hasAlpha, isGrayscale);
            }
            if (verbose) {
                Debug.debug("colorType", colorType);
            }
        }

        final byte bitDepth = getBitDepth(colorType, params);
        if (verbose) {
            Debug.debug("bit_depth", bitDepth);
        }

        int sampleDepth;
        if (colorType == PngConstants.COLOR_TYPE_INDEXED_COLOR) {
            sampleDepth = 8;
        } else {
            sampleDepth = bitDepth;
        }
        if (verbose) {
            Debug.debug("sample_depth", sampleDepth);
        }

        {
            PngConstants.PNG_Signature.writeTo(os);
        }
        {
            // IHDR must be first

            final byte compressionMethod = PngConstants.COMPRESSION_TYPE_INFLATE_DEFLATE;
            final byte filterMethod = PngConstants.FILTER_METHOD_ADAPTIVE;
            final byte interlaceMethod = PngConstants.INTERLACE_METHOD_NONE;

            final ImageHeader imageHeader = new ImageHeader(width, height, bitDepth,
                    colorType, compressionMethod, filterMethod, interlaceMethod);

            writeChunkIHDR(os, imageHeader);
        }

        {
            // sRGB No Before PLTE and IDAT. If the sRGB chunk is present, the
            // iCCP chunk should not be present.

            // charles
        }

        Palette palette = null;
        if (colorType == PngConstants.COLOR_TYPE_INDEXED_COLOR) {
            // PLTE No Before first IDAT

            final int max_colors = hasAlpha ? 255 : 256;

            final PaletteFactory paletteFactory = new PaletteFactory();
            palette = paletteFactory.makeQuantizedRgbPalette(src, max_colors);
            // Palette palette2 = new PaletteFactory().makePaletteSimple(src,
            // max_colors);

            // palette.dump();

            if (hasAlpha) {
                palette = new TransparentPalette(palette);
                writeChunkPLTE(os, palette);                
                writeChunkTRNS(os, new SimplePalette(new int[] { 0x00000000 }));
            } else {
                writeChunkPLTE(os, palette);
            }
        }

        final Object pixelDensityObj = params.get(ImagingConstants.PARAM_KEY_PIXEL_DENSITY);
        if (pixelDensityObj instanceof PixelDensity) {
            final PixelDensity pixelDensity = (PixelDensity) pixelDensityObj;
            if (pixelDensity.isUnitless()) {
                writeChunkPHYS(os, (int) Math.round(pixelDensity
                        .getRawHorizontalDensity()),
                        (int) Math.round(pixelDensity.getRawVerticalDensity()),
                        (byte) 0);
            } else {
                writeChunkPHYS(os, (int) Math.round(pixelDensity
                        .horizontalDensityMetres()),
                        (int) Math.round(pixelDensity.verticalDensityMetres()),
                        (byte) 1);
            }
        }

        if (params.containsKey(ImagingConstants.PARAM_KEY_XMP_XML)) {
            final String xmpXml = (String) params.get(ImagingConstants.PARAM_KEY_XMP_XML);
            writeChunkXmpiTXt(os, xmpXml);
        }

        if (params.containsKey(PngConstants.PARAM_KEY_PNG_TEXT_CHUNKS)) {
            final List<?> outputTexts = (List<?>) params.get(PngConstants.PARAM_KEY_PNG_TEXT_CHUNKS);
            for (int i = 0; i < outputTexts.size(); i++) {
                final PngText text = (PngText) outputTexts.get(i);
                if (text instanceof PngText.Text) {
                    writeChunktEXt(os, (PngText.Text) text);
                } else if (text instanceof PngText.Ztxt) {
                    writeChunkzTXt(os, (PngText.Ztxt) text);
                } else if (text instanceof PngText.Itxt) {
                    writeChunkiTXt(os, (PngText.Itxt) text);
                } else {
                    throw new ImageWriteException(
                            "Unknown text to embed in PNG: " + text);
                }
            }
        }

        {
            // Debug.debug("writing IDAT");

            // IDAT Yes Multiple IDAT chunks shall be consecutive

            byte uncompressed[];
            {
                final ByteArrayOutputStream baos = new ByteArrayOutputStream();

                final boolean useAlpha = colorType == PngConstants.COLOR_TYPE_GREYSCALE_WITH_ALPHA
                        || colorType == PngConstants.COLOR_TYPE_TRUE_COLOR_WITH_ALPHA;

                final int row[] = new int[width];
                for (int y = 0; y < height; y++) {
                    // Debug.debug("y", y + "/" + height);
                    src.getRGB(0, y, width, 1, row, 0, width);

                    final byte filter_type = PngConstants.FILTER_TYPE_NONE;
                    baos.write(filter_type);
                    for (int x = 0; x < width; x++) {
                        final int argb = row[x];

                        if (palette != null) {
                            if (hasAlpha && (argb >>> 24) == 0x00) {
                                baos.write(0);
                            } else {
                                final int index = palette.getPaletteIndex(argb);
                                baos.write(0xff & index);
                            }
                        } else {
                            final int alpha = 0xff & (argb >> 24);
                            final int red = 0xff & (argb >> 16);
                            final int green = 0xff & (argb >> 8);
                            final int blue = 0xff & (argb >> 0);

                            if (isGrayscale) {
                                final int gray = (red + green + blue) / 3;
                                // if(y==0)
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
            final DeflaterOutputStream dos = new DeflaterOutputStream(baos);
            final int chunk_size = 256 * 1024;
            for (int index = 0; index < uncompressed.length; index += chunk_size) {
                final int end = Math.min(uncompressed.length, index + chunk_size);
                final int length = end - index;

                dos.write(uncompressed, index, length);
                dos.flush();
                baos.flush();

                final byte compressed[] = baos.toByteArray();
                baos.reset();
                if (compressed.length > 0) {
                    // Debug.debug("compressed", compressed.length);
                    writeChunkIDAT(os, compressed);
                }

            }
            {
                dos.finish();
                final byte compressed[] = baos.toByteArray();
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
