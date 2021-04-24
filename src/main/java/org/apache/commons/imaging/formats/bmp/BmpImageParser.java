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
package org.apache.commons.imaging.formats.bmp;

import static org.apache.commons.imaging.ImagingConstants.BUFFERED_IMAGE_FACTORY;
import static org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT;
import static org.apache.commons.imaging.ImagingConstants.PARAM_KEY_PIXEL_DENSITY;
import static org.apache.commons.imaging.common.BinaryFunctions.read2Bytes;
import static org.apache.commons.imaging.common.BinaryFunctions.read4Bytes;
import static org.apache.commons.imaging.common.BinaryFunctions.readByte;
import static org.apache.commons.imaging.common.BinaryFunctions.readBytes;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.imaging.FormatCompliance;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.PixelDensity;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.palette.PaletteFactory;
import org.apache.commons.imaging.palette.SimplePalette;

public class BmpImageParser extends ImageParser {

    private static final Logger LOGGER = Logger.getLogger(BmpImageParser.class.getName());

    private static final String DEFAULT_EXTENSION = ".bmp";
    private static final String[] ACCEPTED_EXTENSIONS = { DEFAULT_EXTENSION, };
    private static final byte[] BMP_HEADER_SIGNATURE = { 0x42, 0x4d, };
    private static final int BI_RGB = 0;
    private static final int BI_RLE4 = 2;
    private static final int BI_RLE8 = 1;
    private static final int BI_BITFIELDS = 3;
    private static final int BITMAP_FILE_HEADER_SIZE = 14;
    private static final int BITMAP_INFO_HEADER_SIZE = 40;

    public BmpImageParser() {
        super.setByteOrder(ByteOrder.LITTLE_ENDIAN);
    }

    @Override
    public String getName() {
        return "Bmp-Custom";
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
        return new ImageFormat[] { ImageFormats.BMP, //
        };
    }

    private BmpHeaderInfo readBmpHeaderInfo(final InputStream is,
            final FormatCompliance formatCompliance)
            throws ImageReadException, IOException {
        final byte identifier1 = readByte("Identifier1", is, "Not a Valid BMP File");
        final byte identifier2 = readByte("Identifier2", is, "Not a Valid BMP File");

        if (formatCompliance != null) {
            formatCompliance.compareBytes("Signature", BMP_HEADER_SIGNATURE,
                    new byte[]{identifier1, identifier2,});
        }

        final int fileSize = read4Bytes("File Size", is, "Not a Valid BMP File", getByteOrder());
        final int reserved = read4Bytes("Reserved", is, "Not a Valid BMP File", getByteOrder());
        final int bitmapDataOffset = read4Bytes("Bitmap Data Offset", is, "Not a Valid BMP File", getByteOrder());

        final int bitmapHeaderSize = read4Bytes("Bitmap Header Size", is, "Not a Valid BMP File", getByteOrder());
        int width = 0;
        int height = 0;
        int planes = 0;
        int bitsPerPixel = 0;
        int compression = 0;
        int bitmapDataSize = 0;
        int hResolution = 0;
        int vResolution = 0;
        int colorsUsed = 0;
        int colorsImportant = 0;
        int redMask = 0;
        int greenMask = 0;
        int blueMask = 0;
        int alphaMask = 0;
        int colorSpaceType = 0;
        final BmpHeaderInfo.ColorSpace colorSpace = new BmpHeaderInfo.ColorSpace();
        colorSpace.red = new BmpHeaderInfo.ColorSpaceCoordinate();
        colorSpace.green = new BmpHeaderInfo.ColorSpaceCoordinate();
        colorSpace.blue = new BmpHeaderInfo.ColorSpaceCoordinate();
        int gammaRed = 0;
        int gammaGreen = 0;
        int gammaBlue = 0;
        int intent = 0;
        int profileData = 0;
        int profileSize = 0;
        int reservedV5 = 0;

        if (bitmapHeaderSize < 40) {
            throw new ImageReadException("Invalid/unsupported BMP file");
        }
        // BITMAPINFOHEADER
        width = read4Bytes("Width", is, "Not a Valid BMP File", getByteOrder());
        height = read4Bytes("Height", is, "Not a Valid BMP File", getByteOrder());
        planes = read2Bytes("Planes", is, "Not a Valid BMP File", getByteOrder());
        bitsPerPixel = read2Bytes("Bits Per Pixel", is, "Not a Valid BMP File", getByteOrder());
        compression = read4Bytes("Compression", is, "Not a Valid BMP File", getByteOrder());
        bitmapDataSize = read4Bytes("Bitmap Data Size", is, "Not a Valid BMP File", getByteOrder());
        hResolution = read4Bytes("HResolution", is, "Not a Valid BMP File", getByteOrder());
        vResolution = read4Bytes("VResolution", is, "Not a Valid BMP File", getByteOrder());
        colorsUsed = read4Bytes("ColorsUsed", is, "Not a Valid BMP File", getByteOrder());
        colorsImportant = read4Bytes("ColorsImportant", is, "Not a Valid BMP File", getByteOrder());
        if (bitmapHeaderSize >= 52 || compression == BI_BITFIELDS) {
            // 52 = BITMAPV2INFOHEADER, now undocumented
            // see http://en.wikipedia.org/wiki/BMP_file_format
            redMask = read4Bytes("RedMask", is, "Not a Valid BMP File", getByteOrder());
            greenMask = read4Bytes("GreenMask", is, "Not a Valid BMP File", getByteOrder());
            blueMask = read4Bytes("BlueMask", is, "Not a Valid BMP File", getByteOrder());
        }
        if (bitmapHeaderSize >= 56) {
            // 56 = the now undocumented BITMAPV3HEADER sometimes used by
            // Photoshop
            // see http://forums.adobe.com/thread/751592?tstart=1
            alphaMask = read4Bytes("AlphaMask", is, "Not a Valid BMP File", getByteOrder());
        }
        if (bitmapHeaderSize >= 108) {
            // BITMAPV4HEADER
            colorSpaceType = read4Bytes("ColorSpaceType", is, "Not a Valid BMP File", getByteOrder());
            colorSpace.red.x = read4Bytes("ColorSpaceRedX", is, "Not a Valid BMP File", getByteOrder());
            colorSpace.red.y = read4Bytes("ColorSpaceRedY", is, "Not a Valid BMP File", getByteOrder());
            colorSpace.red.z = read4Bytes("ColorSpaceRedZ", is, "Not a Valid BMP File", getByteOrder());
            colorSpace.green.x = read4Bytes("ColorSpaceGreenX", is, "Not a Valid BMP File", getByteOrder());
            colorSpace.green.y = read4Bytes("ColorSpaceGreenY", is, "Not a Valid BMP File", getByteOrder());
            colorSpace.green.z = read4Bytes("ColorSpaceGreenZ", is, "Not a Valid BMP File", getByteOrder());
            colorSpace.blue.x = read4Bytes("ColorSpaceBlueX", is, "Not a Valid BMP File", getByteOrder());
            colorSpace.blue.y = read4Bytes("ColorSpaceBlueY", is, "Not a Valid BMP File", getByteOrder());
            colorSpace.blue.z = read4Bytes("ColorSpaceBlueZ", is, "Not a Valid BMP File", getByteOrder());
            gammaRed = read4Bytes("GammaRed", is, "Not a Valid BMP File", getByteOrder());
            gammaGreen = read4Bytes("GammaGreen", is, "Not a Valid BMP File", getByteOrder());
            gammaBlue = read4Bytes("GammaBlue", is, "Not a Valid BMP File", getByteOrder());
        }
        if (bitmapHeaderSize >= 124) {
            // BITMAPV5HEADER
            intent = read4Bytes("Intent", is, "Not a Valid BMP File", getByteOrder());
            profileData = read4Bytes("ProfileData", is, "Not a Valid BMP File", getByteOrder());
            profileSize = read4Bytes("ProfileSize", is, "Not a Valid BMP File", getByteOrder());
            reservedV5 = read4Bytes("Reserved", is, "Not a Valid BMP File", getByteOrder());
        }

        if (LOGGER.isLoggable(Level.FINE)) {
            debugNumber("identifier1", identifier1, 1);
            debugNumber("identifier2", identifier2, 1);
            debugNumber("fileSize", fileSize, 4);
            debugNumber("reserved", reserved, 4);
            debugNumber("bitmapDataOffset", bitmapDataOffset, 4);
            debugNumber("bitmapHeaderSize", bitmapHeaderSize, 4);
            debugNumber("width", width, 4);
            debugNumber("height", height, 4);
            debugNumber("planes", planes, 2);
            debugNumber("bitsPerPixel", bitsPerPixel, 2);
            debugNumber("compression", compression, 4);
            debugNumber("bitmapDataSize", bitmapDataSize, 4);
            debugNumber("hResolution", hResolution, 4);
            debugNumber("vResolution", vResolution, 4);
            debugNumber("colorsUsed", colorsUsed, 4);
            debugNumber("colorsImportant", colorsImportant, 4);
            if (bitmapHeaderSize >= 52 || compression == BI_BITFIELDS) {
                debugNumber("redMask", redMask, 4);
                debugNumber("greenMask", greenMask, 4);
                debugNumber("blueMask", blueMask, 4);
            }
            if (bitmapHeaderSize >= 56) {
                debugNumber("alphaMask", alphaMask, 4);
            }
            if (bitmapHeaderSize >= 108) {
                debugNumber("colorSpaceType", colorSpaceType, 4);
                debugNumber("colorSpace.red.x", colorSpace.red.x, 1);
                debugNumber("colorSpace.red.y", colorSpace.red.y, 1);
                debugNumber("colorSpace.red.z", colorSpace.red.z, 1);
                debugNumber("colorSpace.green.x", colorSpace.green.x, 1);
                debugNumber("colorSpace.green.y", colorSpace.green.y, 1);
                debugNumber("colorSpace.green.z", colorSpace.green.z, 1);
                debugNumber("colorSpace.blue.x", colorSpace.blue.x, 1);
                debugNumber("colorSpace.blue.y", colorSpace.blue.y, 1);
                debugNumber("colorSpace.blue.z", colorSpace.blue.z, 1);
                debugNumber("gammaRed", gammaRed, 4);
                debugNumber("gammaGreen", gammaGreen, 4);
                debugNumber("gammaBlue", gammaBlue, 4);
            }
            if (bitmapHeaderSize >= 124) {
                debugNumber("intent", intent, 4);
                debugNumber("profileData", profileData, 4);
                debugNumber("profileSize", profileSize, 4);
                debugNumber("reservedV5", reservedV5, 4);
            }
        }

        return new BmpHeaderInfo(identifier1, identifier2,
                fileSize, reserved, bitmapDataOffset, bitmapHeaderSize, width,
                height, planes, bitsPerPixel, compression, bitmapDataSize,
                hResolution, vResolution, colorsUsed, colorsImportant, redMask,
                greenMask, blueMask, alphaMask, colorSpaceType, colorSpace,
                gammaRed, gammaGreen, gammaBlue, intent, profileData,
                profileSize, reservedV5);
    }

    private byte[] getRLEBytes(final InputStream is, final int rleSamplesPerByte) throws IOException {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // this.setDebug(true);

        boolean done = false;
        while (!done) {
            final int a = 0xff & readByte("RLE a", is, "BMP: Bad RLE");
            baos.write(a);
            final int b = 0xff & readByte("RLE b", is, "BMP: Bad RLE");
            baos.write(b);

            if (a == 0) {
                switch (b) {
                case 0: // EOL
                    break;
                case 1: // EOF
                    // System.out.println("xXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"
                    // );
                    done = true;
                    break;
                case 2: {
                    // System.out.println("xXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"
                    // );
                    final int c = 0xff & readByte("RLE c", is, "BMP: Bad RLE");
                    baos.write(c);
                    final int d = 0xff & readByte("RLE d", is, "BMP: Bad RLE");
                    baos.write(d);

                }
                    break;
                default: {
                    int size = b / rleSamplesPerByte;
                    if ((b % rleSamplesPerByte) > 0) {
                        size++;
                    }
                    if ((size % 2) != 0) {
                        size++;
                    }

                    // System.out.println("b: " + b);
                    // System.out.println("size: " + size);
                    // System.out.println("RLESamplesPerByte: " +
                    // RLESamplesPerByte);
                    // System.out.println("xXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"
                    // );
                    final byte[] bytes = readBytes("bytes", is, size,
                            "RLE: Absolute Mode");
                    baos.write(bytes);
                }
                    break;
                }
            }
        }

        return baos.toByteArray();
    }

    private BmpImageContents readImageContents(final InputStream is,
            final FormatCompliance formatCompliance)
            throws ImageReadException, IOException {
        final BmpHeaderInfo bhi = readBmpHeaderInfo(is, formatCompliance);

        int colorTableSize = bhi.colorsUsed;
        if (colorTableSize == 0) {
            colorTableSize = (1 << bhi.bitsPerPixel);
        }

        if (LOGGER.isLoggable(Level.FINE)) {
            debugNumber("ColorsUsed", bhi.colorsUsed, 4);
            debugNumber("BitsPerPixel", bhi.bitsPerPixel, 4);
            debugNumber("ColorTableSize", colorTableSize, 4);
            debugNumber("bhi.colorsUsed", bhi.colorsUsed, 4);
            debugNumber("Compression", bhi.compression, 4);
        }

        // A palette is always valid, even for images that don't need it
        // (like 32 bpp), it specifies the "optimal color palette" for
        // when the image is displayed on a <= 256 color graphics card.
        int paletteLength;
        int rleSamplesPerByte = 0;
        boolean rle = false;

        switch (bhi.compression) {
        case BI_RGB:
            if (LOGGER.isLoggable(Level.FINE)) {
                LOGGER.fine("Compression: BI_RGB");
            }
            if (bhi.bitsPerPixel <= 8) {
                paletteLength = 4 * colorTableSize;
            } else {
                paletteLength = 0;
            }
            // BytesPerPaletteEntry = 0;
            // System.out.println("Compression: BI_RGBx2: " + bhi.BitsPerPixel);
            // System.out.println("Compression: BI_RGBx2: " + (bhi.BitsPerPixel
            // <= 16));
            break;

        case BI_RLE4:
            if (LOGGER.isLoggable(Level.FINE)) {
                LOGGER.fine("Compression: BI_RLE4");
            }
            paletteLength = 4 * colorTableSize;
            rleSamplesPerByte = 2;
            // ExtraBitsPerPixel = 4;
            rle = true;
            // // BytesPerPixel = 2;
            // // BytesPerPaletteEntry = 0;
            break;
        //
        case BI_RLE8:
            if (LOGGER.isLoggable(Level.FINE)) {
                LOGGER.fine("Compression: BI_RLE8");
            }
            paletteLength = 4 * colorTableSize;
            rleSamplesPerByte = 1;
            // ExtraBitsPerPixel = 8;
            rle = true;
            // BytesPerPixel = 2;
            // BytesPerPaletteEntry = 0;
            break;
        //
        case BI_BITFIELDS:
            if (LOGGER.isLoggable(Level.FINE)) {
                LOGGER.fine("Compression: BI_BITFIELDS");
            }
            if (bhi.bitsPerPixel <= 8) {
                paletteLength = 4 * colorTableSize;
            } else {
                paletteLength = 0;
            }
            // BytesPerPixel = 2;
            // BytesPerPaletteEntry = 4;
            break;

        default:
            throw new ImageReadException("BMP: Unknown Compression: "
                    + bhi.compression);
        }

        byte[] colorTable = null;
        if (paletteLength > 0) {
            colorTable = readBytes("ColorTable", is, paletteLength,
                    "Not a Valid BMP File");
        }

        if (LOGGER.isLoggable(Level.FINE)) {
            debugNumber("paletteLength", paletteLength, 4);
            LOGGER.fine("ColorTable: "
                    + ((colorTable == null) ? "null" : Integer.toString(colorTable.length)));
        }

        int imageLineLength = (((bhi.bitsPerPixel) * bhi.width) + 7) / 8;

        if (LOGGER.isLoggable(Level.FINE)) {
            final int pixelCount = bhi.width * bhi.height;
            // this.debugNumber("Total BitsPerPixel",
            // (ExtraBitsPerPixel + bhi.BitsPerPixel), 4);
            // this.debugNumber("Total Bit Per Line",
            // ((ExtraBitsPerPixel + bhi.BitsPerPixel) * bhi.Width), 4);
            // this.debugNumber("ExtraBitsPerPixel", ExtraBitsPerPixel, 4);
            debugNumber("bhi.Width", bhi.width, 4);
            debugNumber("bhi.Height", bhi.height, 4);
            debugNumber("ImageLineLength", imageLineLength, 4);
            // this.debugNumber("imageDataSize", imageDataSize, 4);
            debugNumber("PixelCount", pixelCount, 4);
        }
        // int ImageLineLength = BytesPerPixel * bhi.Width;
        while ((imageLineLength % 4) != 0) {
            imageLineLength++;
        }

        final int headerSize = BITMAP_FILE_HEADER_SIZE
                + bhi.bitmapHeaderSize
                + (bhi.bitmapHeaderSize == 40
                        && bhi.compression == BI_BITFIELDS ? 3 * 4 : 0);
        final int expectedDataOffset = headerSize + paletteLength;

        if (LOGGER.isLoggable(Level.FINE)) {
            debugNumber("bhi.BitmapDataOffset", bhi.bitmapDataOffset, 4);
            debugNumber("expectedDataOffset", expectedDataOffset, 4);
        }
        final int extraBytes = bhi.bitmapDataOffset - expectedDataOffset;
        if (extraBytes < 0) {
            throw new ImageReadException("BMP has invalid image data offset: "
                    + bhi.bitmapDataOffset + " (expected: "
                    + expectedDataOffset + ", paletteLength: " + paletteLength
                    + ", headerSize: " + headerSize + ")");
        }
        if (extraBytes > 0) {
            readBytes("BitmapDataOffset", is, extraBytes, "Not a Valid BMP File");
        }

        final int imageDataSize = bhi.height * imageLineLength;

        if (LOGGER.isLoggable(Level.FINE)) {
            debugNumber("imageDataSize", imageDataSize, 4);
        }

        byte[] imageData;
        if (rle) {
            imageData = getRLEBytes(is, rleSamplesPerByte);
        } else {
            imageData = readBytes("ImageData", is, imageDataSize,
                    "Not a Valid BMP File");
        }

        if (LOGGER.isLoggable(Level.FINE)) {
            debugNumber("ImageData.length", imageData.length, 4);
        }

        PixelParser pixelParser;

        switch (bhi.compression) {
        case BI_RLE4:
        case BI_RLE8:
            pixelParser = new PixelParserRle(bhi, colorTable, imageData);
            break;
        case BI_RGB:
            pixelParser = new PixelParserRgb(bhi, colorTable, imageData);
            break;
        case BI_BITFIELDS:
            pixelParser = new PixelParserBitFields(bhi, colorTable, imageData);
            break;
        default:
            throw new ImageReadException("BMP: Unknown Compression: "
                    + bhi.compression);
        }

        return new BmpImageContents(bhi, colorTable, imageData, pixelParser);
    }

    private BmpHeaderInfo readBmpHeaderInfo(final ByteSource byteSource) throws ImageReadException, IOException {
        try (InputStream is = byteSource.getInputStream()) {
            // readSignature(is);
            return readBmpHeaderInfo(is, null);
        }
    }

    @Override
    public byte[] getICCProfileBytes(final ByteSource byteSource, final Map<String, Object> params)
            throws ImageReadException, IOException {
        return null;
    }

    @Override
    public Dimension getImageSize(final ByteSource byteSource, Map<String, Object> params)
            throws ImageReadException, IOException {
        // make copy of params; we'll clear keys as we consume them.
        params = (params == null) ? new HashMap<>() : new HashMap<>(params);

        if (!params.isEmpty()) {
            final Object firstKey = params.keySet().iterator().next();
            throw new ImageReadException("Unknown parameter: " + firstKey);
        }

        final BmpHeaderInfo bhi = readBmpHeaderInfo(byteSource);

        if (bhi == null) {
            throw new ImageReadException("BMP: couldn't read header");
        }

        return new Dimension(bhi.width, bhi.height);

    }

    @Override
    public ImageMetadata getMetadata(final ByteSource byteSource, final Map<String, Object> params)
            throws ImageReadException, IOException {
        // TODO this should throw UnsupportedOperationException, but RoundtripTest has to be refactored completely before this can be changed
        return null;
    }

    private String getBmpTypeDescription(final int identifier1, final int identifier2) {
        if ((identifier1 == 'B') && (identifier2 == 'M')) {
            return "Windows 3.1x, 95, NT,";
        }
        if ((identifier1 == 'B') && (identifier2 == 'A')) {
            return "OS/2 Bitmap Array";
        }
        if ((identifier1 == 'C') && (identifier2 == 'I')) {
            return "OS/2 Color Icon";
        }
        if ((identifier1 == 'C') && (identifier2 == 'P')) {
            return "OS/2 Color Pointer";
        }
        if ((identifier1 == 'I') && (identifier2 == 'C')) {
            return "OS/2 Icon";
        }
        if ((identifier1 == 'P') && (identifier2 == 'T')) {
            return "OS/2 Pointer";
        }

        return "Unknown";
    }

    @Override
    public ImageInfo getImageInfo(final ByteSource byteSource, Map<String, Object> params)
            throws ImageReadException, IOException {
        // make copy of params; we'll clear keys as we consume them.
        params = params == null ? new HashMap<>() : new HashMap<>(params);

        if (!params.isEmpty()) {
            final Object firstKey = params.keySet().iterator().next();
            throw new ImageReadException("Unknown parameter: " + firstKey);
        }

        BmpImageContents ic = null;
        try (InputStream is = byteSource.getInputStream()) {
            ic = readImageContents(is, FormatCompliance.getDefault());
        }

        if (ic == null) {
            throw new ImageReadException("Couldn't read BMP Data");
        }

        final BmpHeaderInfo bhi = ic.bhi;
        final byte[] colorTable = ic.colorTable;

        if (bhi == null) {
            throw new ImageReadException("BMP: couldn't read header");
        }

        final int height = bhi.height;
        final int width = bhi.width;

        final List<String> comments = new ArrayList<>();
        // TODO: comments...

        final int bitsPerPixel = bhi.bitsPerPixel;
        final ImageFormat format = ImageFormats.BMP;
        final String name = "BMP Windows Bitmap";
        final String mimeType = "image/x-ms-bmp";
        // we ought to count images, but don't yet.
        final int numberOfImages = -1;
        // not accurate ... only reflects first
        final boolean progressive = false;
        // boolean progressive = (fPNGChunkIHDR.InterlaceMethod != 0);
        //
        // pixels per meter
        final int physicalWidthDpi = (int) Math.round(bhi.hResolution * .0254);
        final float physicalWidthInch = (float) ((double) width / (double) physicalWidthDpi);
        // int physicalHeightDpi = 72;
        final int physicalHeightDpi = (int) Math.round(bhi.vResolution * .0254);
        final float physicalHeightInch = (float) ((double) height / (double) physicalHeightDpi);

        final String formatDetails = "Bmp (" + (char) bhi.identifier1
                + (char) bhi.identifier2 + ": "
                + getBmpTypeDescription(bhi.identifier1, bhi.identifier2) + ")";

        final boolean transparent = false;

        final boolean usesPalette = colorTable != null;
        final ImageInfo.ColorType colorType = ImageInfo.ColorType.RGB;
        final ImageInfo.CompressionAlgorithm compressionAlgorithm = ImageInfo.CompressionAlgorithm.RLE;

        return new ImageInfo(formatDetails, bitsPerPixel, comments,
                format, name, height, mimeType, numberOfImages,
                physicalHeightDpi, physicalHeightInch, physicalWidthDpi,
                physicalWidthInch, width, progressive, transparent,
                usesPalette, colorType, compressionAlgorithm);
    }

    @Override
    public boolean dumpImageFile(final PrintWriter pw, final ByteSource byteSource)
            throws ImageReadException, IOException {
        pw.println("bmp.dumpImageFile");

        final ImageInfo imageData = getImageInfo(byteSource, null);

        imageData.toString(pw, "");

        pw.println("");

        return true;
    }

    @Override
    public FormatCompliance getFormatCompliance(final ByteSource byteSource)
            throws ImageReadException, IOException {
        final FormatCompliance result = new FormatCompliance(
                byteSource.getDescription());

        try (InputStream is = byteSource.getInputStream()) {
            readImageContents(is, result);
        }

        return result;
    }

    @Override
    public BufferedImage getBufferedImage(final ByteSource byteSource, final Map<String, Object> params)
            throws ImageReadException, IOException {
        try (InputStream is = byteSource.getInputStream()) {
            return getBufferedImage(is, params);
        }
    }

    public BufferedImage getBufferedImage(final InputStream inputStream, Map<String, Object> params)
            throws ImageReadException, IOException {
        // make copy of params; we'll clear keys as we consume them.
        params = (params == null) ? new HashMap<>() : new HashMap<>(params);

        if (params.containsKey(BUFFERED_IMAGE_FACTORY)) {
            params.remove(BUFFERED_IMAGE_FACTORY);
        }

        if (!params.isEmpty()) {
            final Object firstKey = params.keySet().iterator().next();
            throw new ImageReadException("Unknown parameter: " + firstKey);
        }

        final BmpImageContents ic = readImageContents(inputStream, FormatCompliance.getDefault());
        if (ic == null) {
            throw new ImageReadException("Couldn't read BMP Data");
        }

        final BmpHeaderInfo bhi = ic.bhi;
        // byte colorTable[] = ic.colorTable;
        // byte imageData[] = ic.imageData;

        final int width = bhi.width;
        final int height = bhi.height;

        if (LOGGER.isLoggable(Level.FINE)) {
            LOGGER.fine("width: " + width);
            LOGGER.fine("height: " + height);
            LOGGER.fine("width*height: " + width * height);
            LOGGER.fine("width*height*4: " + width * height * 4);
        }

        final PixelParser pixelParser = ic.pixelParser;
        final ImageBuilder imageBuilder = new ImageBuilder(width, height, true);
        pixelParser.processImage(imageBuilder);

        return imageBuilder.getBufferedImage();

    }

    @Override
    public void writeImage(final BufferedImage src, final OutputStream os, Map<String, Object> params)
            throws ImageWriteException, IOException {
        // make copy of params; we'll clear keys as we consume them.
        params = (params == null) ? new HashMap<>() : new HashMap<>(params);

        PixelDensity pixelDensity = null;

        // clear format key.
        if (params.containsKey(PARAM_KEY_FORMAT)) {
            params.remove(PARAM_KEY_FORMAT);
        }
        if (params.containsKey(PARAM_KEY_PIXEL_DENSITY)) {
            pixelDensity = (PixelDensity) params.remove(PARAM_KEY_PIXEL_DENSITY);
        }
        if (!params.isEmpty()) {
            final Object firstKey = params.keySet().iterator().next();
            throw new ImageWriteException("Unknown parameter: " + firstKey);
        }

        final SimplePalette palette = new PaletteFactory().makeExactRgbPaletteSimple(
                src, 256);

        BmpWriter writer;
        if (palette == null) {
            writer = new BmpWriterRgb();
        } else {
            writer = new BmpWriterPalette(palette);
        }

        final byte[] imagedata = writer.getImageData(src);
        final BinaryOutputStream bos = new BinaryOutputStream(os, ByteOrder.LITTLE_ENDIAN);

        // write BitmapFileHeader
        os.write(0x42); // B, Windows 3.1x, 95, NT, Bitmap
        os.write(0x4d); // M

        final int filesize = BITMAP_FILE_HEADER_SIZE + BITMAP_INFO_HEADER_SIZE + // header size
                4 * writer.getPaletteSize() + // palette size in bytes
                imagedata.length;
        bos.write4Bytes(filesize);

        bos.write4Bytes(0); // reserved
        bos.write4Bytes(BITMAP_FILE_HEADER_SIZE + BITMAP_INFO_HEADER_SIZE
                + 4 * writer.getPaletteSize()); // Bitmap Data Offset

        final int width = src.getWidth();
        final int height = src.getHeight();

        // write BitmapInfoHeader
        bos.write4Bytes(BITMAP_INFO_HEADER_SIZE); // Bitmap Info Header Size
        bos.write4Bytes(width); // width
        bos.write4Bytes(height); // height
        bos.write2Bytes(1); // Number of Planes
        bos.write2Bytes(writer.getBitsPerPixel()); // Bits Per Pixel

        bos.write4Bytes(BI_RGB); // Compression
        bos.write4Bytes(imagedata.length); // Bitmap Data Size
        bos.write4Bytes(pixelDensity != null ? (int) Math.round(pixelDensity.horizontalDensityMetres()) : 0); // HResolution
        bos.write4Bytes(pixelDensity != null ? (int) Math.round(pixelDensity.verticalDensityMetres()) : 0); // VResolution
        if (palette == null) {
            bos.write4Bytes(0); // Colors
        } else {
            bos.write4Bytes(palette.length()); // Colors
        }
        bos.write4Bytes(0); // Important Colors
        // bos.write_4_bytes(0); // Compression

        // write Palette
        writer.writePalette(bos);
        // write Image Data
        bos.write(imagedata);
    }
}
