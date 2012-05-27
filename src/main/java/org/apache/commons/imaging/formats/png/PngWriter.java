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
import org.apache.commons.imaging.PixelDensity;
import org.apache.commons.imaging.common.ZLibUtils;
import org.apache.commons.imaging.palette.MedianCutQuantizer;
import org.apache.commons.imaging.palette.Palette;
import org.apache.commons.imaging.palette.PaletteFactory;
import org.apache.commons.imaging.util.Debug;
import org.apache.commons.imaging.util.ParamMap;
import org.apache.commons.imaging.util.UnicodeUtils;

public class PngWriter implements PngConstants {
    private final boolean verbose;

    public PngWriter(boolean verbose) {
        this.verbose = verbose;
    }

    public PngWriter(Map params) {
        this.verbose = ParamMap.getParamBoolean(params, PARAM_KEY_VERBOSE,
                false);
    }

    /*
     * 1. IHDR: image header, which is the first chunk in a PNG datastream. 2.
     * PLTE: palette table associated with indexed PNG images. 3. IDAT: image
     * data chunks. 4. IEND: image trailer, which is the last chunk in a PNG
     * datastream.
     * 
     * The remaining 14 chunk types are termed ancillary chunk types, which
     * encoders may generate and decoders may interpret.
     * 
     * 1. Transparency information: tRNS (see 11.3.2: Transparency information).
     * 2. Colour space information: cHRM, gAMA, iCCP, sBIT, sRGB (see 11.3.3:
     * Colour space information). 3. Textual information: iTXt, tEXt, zTXt (see
     * 11.3.4: Textual information). 4. Miscellaneous information: bKGD, hIST,
     * pHYs, sPLT (see 11.3.5: Miscellaneous information). 5. Time information:
     * tIME (see 11.3.6: Time stamp information).
     */

    private final void writeInt(OutputStream os, int value) throws IOException {
        os.write(0xff & (value >> 24));
        os.write(0xff & (value >> 16));
        os.write(0xff & (value >> 8));
        os.write(0xff & (value >> 0));
    }

    private final void writeChunk(OutputStream os, byte chunkType[],
            byte data[]) throws IOException {
        int dataLength = data == null ? 0 : data.length;
        writeInt(os, dataLength);
        os.write(chunkType);
        if (data != null)
            os.write(data);

        // Debug.debug("writeChunk chunkType", chunkType);
        // Debug.debug("writeChunk data", data);

        {
            PngCrc png_crc = new PngCrc();

            long crc1 = png_crc.start_partial_crc(chunkType, chunkType.length);
            long crc2 = data == null ? crc1 : png_crc.continue_partial_crc(
                    crc1, data, data.length);
            int crc = (int) png_crc.finish_partial_crc(crc2);

            // Debug.debug("crc1", crc1 + " (" + Long.toHexString(crc1)
            // + ")");
            // Debug.debug("crc2", crc2 + " (" + Long.toHexString(crc2)
            // + ")");
            // Debug.debug("crc3", crc + " (" + Integer.toHexString(crc)
            // + ")");

            writeInt(os, crc);
        }
    }

    private static class ImageHeader {
        public final int width;
        public final int height;
        public final byte bit_depth;
        public final byte colorType;
        public final byte compressionMethod;
        public final byte filterMethod;
        public final byte interlaceMethod;

        public ImageHeader(int width, int height, byte bit_depth,
                byte colorType, byte compressionMethod, byte filterMethod,
                byte interlaceMethod) {
            this.width = width;
            this.height = height;
            this.bit_depth = bit_depth;
            this.colorType = colorType;
            this.compressionMethod = compressionMethod;
            this.filterMethod = filterMethod;
            this.interlaceMethod = interlaceMethod;
        }

    }

    private void writeChunkIHDR(OutputStream os, ImageHeader value)
            throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        writeInt(baos, value.width);
        writeInt(baos, value.height);
        baos.write(0xff & value.bit_depth);
        baos.write(0xff & value.colorType);
        baos.write(0xff & value.compressionMethod);
        baos.write(0xff & value.filterMethod);
        baos.write(0xff & value.interlaceMethod);

        // Debug.debug("baos", baos.toByteArray());

        writeChunk(os, IHDR_CHUNK_TYPE.toByteArray(), baos.toByteArray());
    }

    private void writeChunkiTXt(OutputStream os, PngText.iTXt text)
            throws IOException, ImageWriteException {
        if (!UnicodeUtils.isValidISO_8859_1(text.keyword))
            throw new ImageWriteException(
                    "Png tEXt chunk keyword is not ISO-8859-1: " + text.keyword);
        if (!UnicodeUtils.isValidISO_8859_1(text.languageTag))
            throw new ImageWriteException(
                    "Png tEXt chunk language tag is not ISO-8859-1: "
                            + text.languageTag);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // keyword
        baos.write(text.keyword.getBytes("ISO-8859-1"));
        baos.write(0);

        baos.write(1); // compressed flag, true
        baos.write(COMPRESSION_DEFLATE_INFLATE); // compression method

        // language tag
        baos.write(text.languageTag.getBytes("ISO-8859-1"));
        baos.write(0);

        // translated keyword
        baos.write(text.translatedKeyword.getBytes("utf-8"));
        baos.write(0);

        baos.write(new ZLibUtils().deflate(text.text.getBytes("utf-8")));

        writeChunk(os, iTXt_CHUNK_TYPE.toByteArray(), baos.toByteArray());
    }

    private void writeChunkzTXt(OutputStream os, PngText.zTXt text)
            throws IOException, ImageWriteException {
        if (!UnicodeUtils.isValidISO_8859_1(text.keyword))
            throw new ImageWriteException(
                    "Png zTXt chunk keyword is not ISO-8859-1: " + text.keyword);
        if (!UnicodeUtils.isValidISO_8859_1(text.text))
            throw new ImageWriteException(
                    "Png zTXt chunk text is not ISO-8859-1: " + text.text);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // keyword
        baos.write(text.keyword.getBytes("ISO-8859-1"));
        baos.write(0);

        // compression method
        baos.write(PngConstants.COMPRESSION_DEFLATE_INFLATE);

        // text
        baos.write(new ZLibUtils().deflate(text.text.getBytes("ISO-8859-1")));

        writeChunk(os, zTXt_CHUNK_TYPE.toByteArray(), baos.toByteArray());
    }

    private void writeChunktEXt(OutputStream os, PngText.tEXt text)
            throws IOException, ImageWriteException {
        if (!UnicodeUtils.isValidISO_8859_1(text.keyword))
            throw new ImageWriteException(
                    "Png tEXt chunk keyword is not ISO-8859-1: " + text.keyword);
        if (!UnicodeUtils.isValidISO_8859_1(text.text))
            throw new ImageWriteException(
                    "Png tEXt chunk text is not ISO-8859-1: " + text.text);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // keyword
        baos.write(text.keyword.getBytes("ISO-8859-1"));
        baos.write(0);

        // text
        baos.write(text.text.getBytes("ISO-8859-1"));

        writeChunk(os, tEXt_CHUNK_TYPE.toByteArray(), baos.toByteArray());
    }

    private void writeChunkXmpiTXt(OutputStream os, String xmpXml)
            throws IOException {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // keyword
        baos.write(XMP_KEYWORD.getBytes("ISO-8859-1"));
        baos.write(0);

        baos.write(1); // compressed flag, true
        baos.write(COMPRESSION_DEFLATE_INFLATE); // compression method

        baos.write(0); // language tag (ignore). TODO

        // translated keyword
        baos.write(XMP_KEYWORD.getBytes("utf-8"));
        baos.write(0);

        baos.write(new ZLibUtils().deflate(xmpXml.getBytes("utf-8")));

        writeChunk(os, iTXt_CHUNK_TYPE.toByteArray(), baos.toByteArray());
    }

    private void writeChunkPLTE(OutputStream os, Palette palette)
            throws IOException {
        int length = palette.length();
        byte bytes[] = new byte[length * 3];

        // Debug.debug("length", length);
        for (int i = 0; i < length; i++) {
            int rgb = palette.getEntry(i);
            int index = i * 3;
            // Debug.debug("index", index);
            bytes[index + 0] = (byte) (0xff & (rgb >> 16));
            bytes[index + 1] = (byte) (0xff & (rgb >> 8));
            bytes[index + 2] = (byte) (0xff & (rgb >> 0));
        }

        writeChunk(os, PLTE_CHUNK_TYPE.toByteArray(), bytes);
    }

    private void writeChunkIEND(OutputStream os) throws IOException {
        writeChunk(os, IEND_CHUNK_TYPE.toByteArray(), null);
    }

    private void writeChunkIDAT(OutputStream os, byte bytes[])
            throws IOException {
        writeChunk(os, IDAT_CHUNK_TYPE.toByteArray(), bytes);
    }

    private void writeChunkPHYS(OutputStream os, int xPPU, int yPPU, byte units)
            throws IOException {
        byte[] bytes = new byte[9];
        bytes[0] = (byte) (0xff & (xPPU >> 24));
        bytes[1] = (byte) (0xff & (xPPU >> 16));
        bytes[2] = (byte) (0xff & (xPPU >> 8));
        bytes[3] = (byte) (0xff & (xPPU >> 0));
        bytes[4] = (byte) (0xff & (yPPU >> 24));
        bytes[5] = (byte) (0xff & (yPPU >> 16));
        bytes[6] = (byte) (0xff & (yPPU >> 8));
        bytes[7] = (byte) (0xff & (yPPU >> 0));
        bytes[8] = units;
        writeChunk(os, IPHYS_CHUNK_TYPE.toByteArray(), bytes);
    }

    private byte getColourType(boolean hasAlpha, boolean isGrayscale) {
        byte result;

        boolean index = false; // charles

        if (index)
            result = COLOR_TYPE_INDEXED_COLOR;
        else if (isGrayscale) {
            if (hasAlpha)
                result = COLOR_TYPE_GREYSCALE_WITH_ALPHA;
            else
                result = COLOR_TYPE_GREYSCALE;
        } else if (hasAlpha)
            result = COLOR_TYPE_TRUE_COLOR_WITH_ALPHA;
        else
            result = COLOR_TYPE_TRUE_COLOR;

        return result;
    }

    private byte getBitDepth(final byte colorType, Map params) {
        byte result = 8;

        Object o = params.get(PARAM_KEY_PNG_BIT_DEPTH);
        if (o != null && o instanceof Number) {
            int value = ((Number) o).intValue();
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
            case COLOR_TYPE_GREYSCALE:
                break;
            case COLOR_TYPE_INDEXED_COLOR:
                result = (byte) Math.min(8, result);
                break;
            case COLOR_TYPE_GREYSCALE_WITH_ALPHA:
            case COLOR_TYPE_TRUE_COLOR:
            case COLOR_TYPE_TRUE_COLOR_WITH_ALPHA:
                result = (byte) Math.max(8, result);
                break;
            default:
                result = 8;
            }
        }

        return result;
    }

    /*
     * between two chunk types indicates alternatives. Table 5.3 — Chunk
     * ordering rules Critical chunks (shall appear in this order, except PLTE
     * is optional) Chunk name Multiple allowed Ordering constraints IHDR No
     * Shall be first PLTE No Before first IDAT IDAT Yes Multiple IDAT chunks
     * shall be consecutive IEND No Shall be last Ancillary chunks (need not
     * appear in this order) Chunk name Multiple allowed Ordering constraints
     * cHRM No Before PLTE and IDAT gAMA No Before PLTE and IDAT iCCP No Before
     * PLTE and IDAT. If the iCCP chunk is present, the sRGB chunk should not be
     * present. sBIT No Before PLTE and IDAT sRGB No Before PLTE and IDAT. If
     * the sRGB chunk is present, the iCCP chunk should not be present. bKGD No
     * After PLTE; before IDAT hIST No After PLTE; before IDAT tRNS No After
     * PLTE; before IDAT pHYs No Before IDAT sPLT Yes Before IDAT tIME No None
     * iTXt Yes None tEXt Yes None zTXt Yes None
     */

    public void writeImage(BufferedImage src, OutputStream os, Map params)
            throws ImageWriteException, IOException {
        // make copy of params; we'll clear keys as we consume them.
        params = new HashMap(params);

        // clear format key.
        if (params.containsKey(PARAM_KEY_FORMAT))
            params.remove(PARAM_KEY_FORMAT);
        // clear verbose key.
        if (params.containsKey(PARAM_KEY_VERBOSE))
            params.remove(PARAM_KEY_VERBOSE);

        Map rawParams = new HashMap(params);
        if (params.containsKey(PARAM_KEY_PNG_FORCE_TRUE_COLOR))
            params.remove(PARAM_KEY_PNG_FORCE_TRUE_COLOR);
        if (params.containsKey(PARAM_KEY_PNG_FORCE_INDEXED_COLOR))
            params.remove(PARAM_KEY_PNG_FORCE_INDEXED_COLOR);
        if (params.containsKey(PARAM_KEY_PNG_BIT_DEPTH))
            params.remove(PARAM_KEY_PNG_BIT_DEPTH);
        if (params.containsKey(PARAM_KEY_XMP_XML))
            params.remove(PARAM_KEY_XMP_XML);
        if (params.containsKey(PARAM_KEY_PNG_TEXT_CHUNKS))
            params.remove(PARAM_KEY_PNG_TEXT_CHUNKS);
        params.remove(PARAM_KEY_PIXEL_DENSITY);
        if (params.size() > 0) {
            Object firstKey = params.keySet().iterator().next();
            throw new ImageWriteException("Unknown parameter: " + firstKey);
        }
        params = rawParams;

        int width = src.getWidth();
        int height = src.getHeight();

        boolean hasAlpha = new PaletteFactory().hasTransparency(src);
        if (verbose)
            Debug.debug("hasAlpha", hasAlpha);
        // int transparency = new PaletteFactory().getTransparency(src);

        boolean isGrayscale = new PaletteFactory().isGrayscale(src);
        if (verbose)
            Debug.debug("isGrayscale", isGrayscale);

        byte colorType;
        {
            boolean forceIndexedColor = ParamMap.getParamBoolean(params,
                    PARAM_KEY_PNG_FORCE_INDEXED_COLOR, false);
            boolean forceTrueColor = ParamMap.getParamBoolean(params,
                    PARAM_KEY_PNG_FORCE_TRUE_COLOR, false);

            if (forceIndexedColor && forceTrueColor)
                throw new ImageWriteException(
                        "Params: Cannot force both indexed and true color modes");
            else if (forceIndexedColor) {
                colorType = COLOR_TYPE_INDEXED_COLOR;
            } else if (forceTrueColor) {
                colorType = (byte) (hasAlpha ? COLOR_TYPE_TRUE_COLOR_WITH_ALPHA
                        : COLOR_TYPE_TRUE_COLOR);
                isGrayscale = false;
            } else
                colorType = getColourType(hasAlpha, isGrayscale);
            if (verbose)
                Debug.debug("colorType", colorType);
        }

        byte bitDepth = getBitDepth(colorType, params);
        if (verbose)
            Debug.debug("bit_depth", bitDepth);

        int sampleDepth;
        if (colorType == COLOR_TYPE_INDEXED_COLOR)
            sampleDepth = 8;
        else
            sampleDepth = bitDepth;
        if (verbose)
            Debug.debug("sample_depth", sampleDepth);

        {
            PNG_Signature.writeTo(os);
        }
        {
            // IHDR must be first

            byte compressionMethod = COMPRESSION_TYPE_INFLATE_DEFLATE;
            byte filterMethod = FILTER_METHOD_ADAPTIVE;
            byte interlaceMethod = INTERLACE_METHOD_NONE;

            ImageHeader imageHeader = new ImageHeader(width, height, bitDepth,
                    colorType, compressionMethod, filterMethod, interlaceMethod);

            writeChunkIHDR(os, imageHeader);
        }

        {
            // sRGB No Before PLTE and IDAT. If the sRGB chunk is present, the
            // iCCP chunk should not be present.

            // charles
        }

        Palette palette = null;
        if (colorType == COLOR_TYPE_INDEXED_COLOR) {
            // PLTE No Before first IDAT

            int max_colors = hasAlpha ? 255 : 256;

            palette = new MedianCutQuantizer(true).process(src, max_colors,
                    verbose);
            // Palette palette2 = new PaletteFactory().makePaletteSimple(src,
            // max_colors);

            // palette.dump();

            writeChunkPLTE(os, palette);
        }

        Object pixelDensityObj = params.get(PARAM_KEY_PIXEL_DENSITY);
        if (pixelDensityObj instanceof PixelDensity) {
            PixelDensity pixelDensity = (PixelDensity) pixelDensityObj;
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

        if (params.containsKey(PARAM_KEY_XMP_XML)) {
            String xmpXml = (String) params.get(PARAM_KEY_XMP_XML);
            writeChunkXmpiTXt(os, xmpXml);
        }

        if (params.containsKey(PARAM_KEY_PNG_TEXT_CHUNKS)) {
            List<PngText> outputTexts = (List<PngText>) params
                    .get(PARAM_KEY_PNG_TEXT_CHUNKS);
            for (int i = 0; i < outputTexts.size(); i++) {
                PngText text = outputTexts.get(i);
                if (text instanceof PngText.tEXt)
                    writeChunktEXt(os, (PngText.tEXt) text);
                else if (text instanceof PngText.zTXt)
                    writeChunkzTXt(os, (PngText.zTXt) text);
                else if (text instanceof PngText.iTXt)
                    writeChunkiTXt(os, (PngText.iTXt) text);
                else
                    throw new ImageWriteException(
                            "Unknown text to embed in PNG: " + text);
            }
        }

        {
            // Debug.debug("writing IDAT");

            // IDAT Yes Multiple IDAT chunks shall be consecutive

            byte uncompressed[];
            {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();

                boolean useAlpha = colorType == COLOR_TYPE_GREYSCALE_WITH_ALPHA
                        || colorType == COLOR_TYPE_TRUE_COLOR_WITH_ALPHA;

                int row[] = new int[width];
                for (int y = 0; y < height; y++) {
                    // Debug.debug("y", y + "/" + height);
                    src.getRGB(0, y, width, 1, row, 0, width);

                    byte filter_type = FILTER_TYPE_NONE;
                    baos.write(filter_type);
                    for (int x = 0; x < width; x++) {
                        int argb = row[x];

                        if (palette != null) {
                            int index = palette.getPaletteIndex(argb);
                            baos.write(0xff & index);
                        } else {
                            int alpha = 0xff & (argb >> 24);
                            int red = 0xff & (argb >> 16);
                            int green = 0xff & (argb >> 8);
                            int blue = 0xff & (argb >> 0);

                            if (isGrayscale) {
                                int gray = (red + green + blue) / 3;
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
                            if (useAlpha)
                                baos.write(alpha);
                        }
                    }
                }
                uncompressed = baos.toByteArray();
            }

            // Debug.debug("uncompressed", uncompressed.length);

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            DeflaterOutputStream dos = new DeflaterOutputStream(baos);
            int chunk_size = 256 * 1024;
            for (int index = 0; index < uncompressed.length; index += chunk_size) {
                int end = Math.min(uncompressed.length, index + chunk_size);
                int length = end - index;

                dos.write(uncompressed, index, length);
                dos.flush();
                baos.flush();

                byte compressed[] = baos.toByteArray();
                baos.reset();
                if (compressed.length > 0) {
                    // Debug.debug("compressed", compressed.length);
                    writeChunkIDAT(os, compressed);
                }

            }
            {
                dos.finish();
                byte compressed[] = baos.toByteArray();
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
         * Ancillary chunks (need not appear in this order) Chunk name Multiple
         * allowed Ordering constraints cHRM No Before PLTE and IDAT gAMA No
         * Before PLTE and IDAT iCCP No Before PLTE and IDAT. If the iCCP chunk
         * is present, the sRGB chunk should not be present. sBIT No Before PLTE
         * and IDAT sRGB No Before PLTE and IDAT. If the sRGB chunk is present,
         * the iCCP chunk should not be present. bKGD No After PLTE; before IDAT
         * hIST No After PLTE; before IDAT tRNS No After PLTE; before IDAT pHYs
         * No Before IDAT sPLT Yes Before IDAT tIME No None iTXt Yes None tEXt
         * Yes None zTXt Yes None
         */

        os.close();
    } // todo: filter types
      // proper colour types
      // srgb, etc.
}
