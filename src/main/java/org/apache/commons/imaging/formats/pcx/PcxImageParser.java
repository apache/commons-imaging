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
package org.apache.commons.imaging.formats.pcx;

import static org.apache.commons.imaging.common.BinaryFunctions.readBytes;
import static org.apache.commons.imaging.common.BinaryFunctions.skipBytes;
import static org.apache.commons.imaging.common.ByteConversions.toUInt16;

import java.awt.Dimension;
import java.awt.Transparency;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.IndexColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;

import org.apache.commons.imaging.AbstractImageParser;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.common.Allocator;
import org.apache.commons.imaging.common.ImageMetadata;

public class PcxImageParser extends AbstractImageParser<PcxImagingParameters> {
    // ZSoft's official spec is at [BROKEN URL] http://www.qzx.com/pc-gpe/pcx.txt
    // (among other places) but it's pretty thin. The fileformat.fine document
    // at [BROEKN URL] http://www.fileformat.fine/format/pcx/egff.htm is a little better
    // but their gray sample image seems corrupt. PCX files themselves are
    // the ultimate test but pretty hard to find nowadays, so the best
    // test is against other image viewers (Irfanview is pretty good).
    //
    // Open source projects are generally poor at parsing PCX,
    // SDL_Image/gdk-pixbuf/Eye of Gnome/GIMP/F-Spot all only do some formats,
    // don't support uncompressed PCX, and/or don't handle black and white
    // images properly.

    static class PcxHeader {

        public static final int ENCODING_UNCOMPRESSED = 0;
        public static final int ENCODING_RLE = 1;
        public static final int PALETTE_INFO_COLOR = 1;
        public static final int PALETTE_INFO_GRAYSCALE = 2;
        public final int manufacturer; // Always 10 = ZSoft .pcx
        public final int version; // 0 = PC Paintbrush 2.5
                                  // 2 = PC Paintbrush 2.8 with palette
                                  // 3 = PC Paintbrush 2.8 w/o palette
                                  // 4 = PC Paintbrush for Windows
                                  // 5 = PC Paintbrush >= 3.0
        public final int encoding; // 0 = very old uncompressed format, 1 = .pcx
                                   // run length encoding
        public final int bitsPerPixel; // Bits ***PER PLANE*** for each pixel
        public final int xMin; // window
        public final int yMin;
        public final int xMax;
        public final int yMax;
        public final int hDpi; // horizontal dpi
        public final int vDpi; // vertical dpi
        public final int[] colormap; // palette for <= 16 colors
        public final int reserved; // Always 0
        public final int nPlanes; // Number of color planes
        public final int bytesPerLine; // Number of bytes per scanline plane,
                                       // must be an even number.
        public final int paletteInfo; // 1 = Color/BW, 2 = Grayscale, ignored in
                                      // Paintbrush IV/IV+
        public final int hScreenSize; // horizontal screen size, in pixels.
                                      // PaintBrush >= IV only.
        public final int vScreenSize; // vertical screen size, in pixels.
                                      // PaintBrush >= IV only.

        PcxHeader(final int manufacturer, final int version,
                final int encoding, final int bitsPerPixel, final int xMin,
                final int yMin, final int xMax, final int yMax, final int hDpi,
                final int vDpi, final int[] colormap, final int reserved,
                final int nPlanes, final int bytesPerLine,
                final int paletteInfo, final int hScreenSize,
                final int vScreenSize) {
            this.manufacturer = manufacturer;
            this.version = version;
            this.encoding = encoding;
            this.bitsPerPixel = bitsPerPixel;
            this.xMin = xMin;
            this.yMin = yMin;
            this.xMax = xMax;
            this.yMax = yMax;
            this.hDpi = hDpi;
            this.vDpi = vDpi;
            this.colormap = colormap;
            this.reserved = reserved;
            this.nPlanes = nPlanes;
            this.bytesPerLine = bytesPerLine;
            this.paletteInfo = paletteInfo;
            this.hScreenSize = hScreenSize;
            this.vScreenSize = vScreenSize;
        }

        public void dump(final PrintWriter pw) {
            pw.println("PcxHeader");
            pw.println("Manufacturer: " + manufacturer);
            pw.println("Version: " + version);
            pw.println("Encoding: " + encoding);
            pw.println("BitsPerPixel: " + bitsPerPixel);
            pw.println("xMin: " + xMin);
            pw.println("yMin: " + yMin);
            pw.println("xMax: " + xMax);
            pw.println("yMax: " + yMax);
            pw.println("hDpi: " + hDpi);
            pw.println("vDpi: " + vDpi);
            pw.print("ColorMap: ");
            for (int i = 0; i < colormap.length; i++) {
                if (i > 0) {
                    pw.print(",");
                }
                pw.print("(" + (0xff & (colormap[i] >> 16)) + ","
                        + (0xff & (colormap[i] >> 8)) + ","
                        + (0xff & colormap[i]) + ")");
            }
            pw.println();
            pw.println("Reserved: " + reserved);
            pw.println("nPlanes: " + nPlanes);
            pw.println("BytesPerLine: " + bytesPerLine);
            pw.println("PaletteInfo: " + paletteInfo);
            pw.println("hScreenSize: " + hScreenSize);
            pw.println("vScreenSize: " + vScreenSize);
            pw.println();
        }
    }
    private static final String DEFAULT_EXTENSION = ImageFormats.PCX.getDefaultExtension();

    private static final String[] ACCEPTED_EXTENSIONS = ImageFormats.PCX.getExtensions();

    public PcxImageParser() {
        super(ByteOrder.LITTLE_ENDIAN);
    }

    @Override
    public boolean dumpImageFile(final PrintWriter pw, final ByteSource byteSource)
            throws ImagingException, IOException {
        readPcxHeader(byteSource).dump(pw);
        return true;
    }

    @Override
    protected String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS;
    }

    @Override
    protected ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[] { ImageFormats.PCX, //
        };
    }

    @Override
    public final BufferedImage getBufferedImage(final ByteSource byteSource, PcxImagingParameters params) throws ImagingException, IOException {
        if (params == null) {
            params = new PcxImagingParameters();
        }
        try (InputStream is = byteSource.getInputStream()) {
            final PcxHeader pcxHeader = readPcxHeader(is, params.isStrict());
            return readImage(pcxHeader, is, byteSource);
        }
    }

    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Override
    public PcxImagingParameters getDefaultParameters() {
        return new PcxImagingParameters();
    }

    @Override
    public byte[] getIccProfileBytes(final ByteSource byteSource, final PcxImagingParameters params)
            throws ImagingException, IOException {
        return null;
    }

    @Override
    public ImageInfo getImageInfo(final ByteSource byteSource, final PcxImagingParameters params)
            throws ImagingException, IOException {
        final PcxHeader pcxHeader = readPcxHeader(byteSource);
        final Dimension size = getImageSize(byteSource, params);
        return new ImageInfo(
                "PCX",
                pcxHeader.nPlanes * pcxHeader.bitsPerPixel,
                new ArrayList<>(),
                ImageFormats.PCX,
                "ZSoft PCX Image",
                size.height,
                "image/x-pcx",
                1,
                pcxHeader.vDpi,
                Math.round(size.getHeight() / pcxHeader.vDpi),
                pcxHeader.hDpi,
                Math.round(size.getWidth() / pcxHeader.hDpi),
                size.width,
                false,
                false,
                !(pcxHeader.nPlanes == 3 && pcxHeader.bitsPerPixel == 8),
                ImageInfo.ColorType.RGB,
                pcxHeader.encoding == PcxHeader.ENCODING_RLE ? ImageInfo.CompressionAlgorithm.RLE
                        : ImageInfo.CompressionAlgorithm.NONE);
    }

    @Override
    public Dimension getImageSize(final ByteSource byteSource, final PcxImagingParameters params)
            throws ImagingException, IOException {
        final PcxHeader pcxHeader = readPcxHeader(byteSource);
        final int xSize = pcxHeader.xMax - pcxHeader.xMin + 1;
        if (xSize < 0) {
            throw new ImagingException("Image width is negative");
        }
        final int ySize = pcxHeader.yMax - pcxHeader.yMin + 1;
        if (ySize < 0) {
            throw new ImagingException("Image height is negative");
        }
        return new Dimension(xSize, ySize);
    }

    @Override
    public ImageMetadata getMetadata(final ByteSource byteSource, final PcxImagingParameters params)
            throws ImagingException, IOException {
        return null;
    }

    @Override
    public String getName() {
        return "Pcx-Custom";
    }

    private int[] read256ColorPalette(final InputStream stream) throws IOException {
        final byte[] paletteBytes = readBytes("Palette", stream, 769,
                "Error reading palette");
        if (paletteBytes[0] != 12) {
            return null;
        }
        final int[] palette = new int[256];
        for (int i = 0; i < palette.length; i++) {
            palette[i] = ((0xff & paletteBytes[1 + 3 * i]) << 16)
                    | ((0xff & paletteBytes[1 + 3 * i + 1]) << 8)
                    | (0xff & paletteBytes[1 + 3 * i + 2]);
        }
        return palette;
    }

    private int[] read256ColorPaletteFromEndOfFile(final ByteSource byteSource)
            throws IOException {
        try (InputStream stream = byteSource.getInputStream()) {
            final long toSkip = byteSource.size() - 769;
            skipBytes(stream, (int) toSkip);
            return read256ColorPalette(stream);
        }
    }

    private BufferedImage readImage(final PcxHeader pcxHeader, final InputStream is,
            final ByteSource byteSource) throws ImagingException, IOException {
        final int xSize = pcxHeader.xMax - pcxHeader.xMin + 1;
        if (xSize < 0) {
            throw new ImagingException("Image width is negative");
        }
        final int ySize = pcxHeader.yMax - pcxHeader.yMin + 1;
        if (ySize < 0) {
            throw new ImagingException("Image height is negative");
        }
        if (pcxHeader.nPlanes <= 0 || 4 < pcxHeader.nPlanes) {
            throw new ImagingException("Unsupported/invalid image with " + pcxHeader.nPlanes + " planes");
        }
        final RleReader rleReader;
        if (pcxHeader.encoding == PcxHeader.ENCODING_UNCOMPRESSED) {
            rleReader = new RleReader(false);
        } else if (pcxHeader.encoding == PcxHeader.ENCODING_RLE) {
            rleReader = new RleReader(true);
        } else {
            throw new ImagingException("Unsupported/invalid image encoding " + pcxHeader.encoding);
        }
        final int scanlineLength = pcxHeader.bytesPerLine * pcxHeader.nPlanes;
        final byte[] scanline = Allocator.byteArray(scanlineLength);
        if ((pcxHeader.bitsPerPixel == 1 || pcxHeader.bitsPerPixel == 2
                || pcxHeader.bitsPerPixel == 4 || pcxHeader.bitsPerPixel == 8)
                && pcxHeader.nPlanes == 1) {
            final int bytesPerImageRow = (xSize * pcxHeader.bitsPerPixel + 7) / 8;
            final byte[] image = Allocator.byteArray(ySize * bytesPerImageRow);
            for (int y = 0; y < ySize; y++) {
                rleReader.read(is, scanline);
                System.arraycopy(scanline, 0, image, y * bytesPerImageRow,
                        bytesPerImageRow);
            }
            final DataBufferByte dataBuffer = new DataBufferByte(image, image.length);
            int[] palette;
            if (pcxHeader.bitsPerPixel == 1) {
                palette = new int[] { 0x000000, 0xffffff };
            } else if (pcxHeader.bitsPerPixel == 8) {
                // Normally the palette is read 769 bytes from the end of the
                // file.
                // However DCX files have multiple PCX images in one file, so
                // there could be extra data before the end! So try look for the
                // palette
                // immediately after the image data first.
                palette = read256ColorPalette(is);
                if (palette == null) {
                    palette = read256ColorPaletteFromEndOfFile(byteSource);
                }
                if (palette == null) {
                    throw new ImagingException(
                            "No 256 color palette found in image that needs it");
                }
            } else {
                palette = pcxHeader.colormap;
            }
            WritableRaster raster;
            if (pcxHeader.bitsPerPixel == 8) {
                raster = Raster.createInterleavedRaster(dataBuffer,
                        xSize, ySize, bytesPerImageRow, 1, new int[] { 0 },
                        null);
            } else {
                raster = Raster.createPackedRaster(dataBuffer, xSize,
                        ySize, pcxHeader.bitsPerPixel, null);
            }
            final IndexColorModel colorModel = new IndexColorModel(
                    pcxHeader.bitsPerPixel, 1 << pcxHeader.bitsPerPixel,
                    palette, 0, false, -1, DataBuffer.TYPE_BYTE);
            return new BufferedImage(colorModel, raster,
                    colorModel.isAlphaPremultiplied(), new Properties());
        }
        if (pcxHeader.bitsPerPixel == 1 && 2 <= pcxHeader.nPlanes
                && pcxHeader.nPlanes <= 4) {
            final IndexColorModel colorModel = new IndexColorModel(pcxHeader.nPlanes,
                    1 << pcxHeader.nPlanes, pcxHeader.colormap, 0, false, -1,
                    DataBuffer.TYPE_BYTE);
            final BufferedImage image = new BufferedImage(xSize, ySize,
                    BufferedImage.TYPE_BYTE_BINARY, colorModel);
            final byte[] unpacked = Allocator.byteArray(xSize);
            for (int y = 0; y < ySize; y++) {
                rleReader.read(is, scanline);
                int nextByte = 0;
                Arrays.fill(unpacked, (byte) 0);
                for (int plane = 0; plane < pcxHeader.nPlanes; plane++) {
                    for (int i = 0; i < pcxHeader.bytesPerLine; i++) {
                        final int b = 0xff & scanline[nextByte++];
                        for (int j = 0; j < 8 && 8 * i + j < unpacked.length; j++) {
                            unpacked[8 * i + j] |= (byte) (((b >> (7 - j)) & 0x1) << plane);
                        }
                    }
                }
                image.getRaster().setDataElements(0, y, xSize, 1, unpacked);
            }
            return image;
        }
        if (pcxHeader.bitsPerPixel == 8 && pcxHeader.nPlanes == 3) {
            final byte[][] image = new byte[3][];
            final int xySize = xSize * ySize;
            image[0] = Allocator.byteArray(xySize);
            image[1] = Allocator.byteArray(xySize);
            image[2] = Allocator.byteArray(xySize);
            for (int y = 0; y < ySize; y++) {
                rleReader.read(is, scanline);
                System.arraycopy(scanline, 0, image[0], y * xSize, xSize);
                System.arraycopy(scanline, pcxHeader.bytesPerLine, image[1], y
                        * xSize, xSize);
                System.arraycopy(scanline, 2 * pcxHeader.bytesPerLine,
                        image[2], y * xSize, xSize);
            }
            final DataBufferByte dataBuffer = new DataBufferByte(image,
                    image[0].length);
            final WritableRaster raster = Raster.createBandedRaster(
                    dataBuffer, xSize, ySize, xSize, new int[] { 0, 1, 2 },
                    new int[] { 0, 0, 0 }, null);
            final ColorModel colorModel = new ComponentColorModel(
                    ColorSpace.getInstance(ColorSpace.CS_sRGB), false, false,
                    Transparency.OPAQUE, DataBuffer.TYPE_BYTE);
            return new BufferedImage(colorModel, raster,
                    colorModel.isAlphaPremultiplied(), new Properties());
        }
        if (((pcxHeader.bitsPerPixel != 24) || (pcxHeader.nPlanes != 1)) && ((pcxHeader.bitsPerPixel != 32) || (pcxHeader.nPlanes != 1))) {
            throw new ImagingException(
                    "Invalid/unsupported image with bitsPerPixel "
                            + pcxHeader.bitsPerPixel + " and planes "
                            + pcxHeader.nPlanes);
        }
        final int rowLength = 3 * xSize;
        final byte[] image = Allocator.byteArray(rowLength * ySize);
        for (int y = 0; y < ySize; y++) {
            rleReader.read(is, scanline);
            if (pcxHeader.bitsPerPixel == 24) {
                System.arraycopy(scanline, 0, image, y * rowLength,
                        rowLength);
            } else {
                for (int x = 0; x < xSize; x++) {
                    image[y * rowLength + 3 * x] = scanline[4 * x];
                    image[y * rowLength + 3 * x + 1] = scanline[4 * x + 1];
                    image[y * rowLength + 3 * x + 2] = scanline[4 * x + 2];
                }
            }
        }
        final DataBufferByte dataBuffer = new DataBufferByte(image, image.length);
        final WritableRaster raster = Raster.createInterleavedRaster(
                dataBuffer, xSize, ySize, rowLength, 3,
                new int[] { 2, 1, 0 }, null);
        final ColorModel colorModel = new ComponentColorModel(
                ColorSpace.getInstance(ColorSpace.CS_sRGB), false, false,
                Transparency.OPAQUE, DataBuffer.TYPE_BYTE);
        return new BufferedImage(colorModel, raster,
                colorModel.isAlphaPremultiplied(), new Properties());
    }

    private PcxHeader readPcxHeader(final ByteSource byteSource)
            throws ImagingException, IOException {
        try (InputStream is = byteSource.getInputStream()) {
            return readPcxHeader(is, false);
        }
    }

    private PcxHeader readPcxHeader(final InputStream is, final boolean isStrict)
            throws ImagingException, IOException {
        final byte[] pcxHeaderBytes = readBytes("PcxHeader", is, 128,
                "Not a Valid PCX File");
        final int manufacturer = 0xff & pcxHeaderBytes[0];
        final int version = 0xff & pcxHeaderBytes[1];
        final int encoding = 0xff & pcxHeaderBytes[2];
        final int bitsPerPixel = 0xff & pcxHeaderBytes[3];
        final int xMin = toUInt16(pcxHeaderBytes, 4, getByteOrder());
        final int yMin = toUInt16(pcxHeaderBytes, 6, getByteOrder());
        final int xMax = toUInt16(pcxHeaderBytes, 8, getByteOrder());
        final int yMax = toUInt16(pcxHeaderBytes, 10, getByteOrder());
        final int hDpi = toUInt16(pcxHeaderBytes, 12, getByteOrder());
        final int vDpi = toUInt16(pcxHeaderBytes, 14, getByteOrder());
        final int[] colormap = new int[16];
        Arrays.setAll(colormap, i -> 0xff000000
                    | ((0xff & pcxHeaderBytes[16 + 3 * i]) << 16)
                    | ((0xff & pcxHeaderBytes[16 + 3 * i + 1]) << 8)
                    | (0xff & pcxHeaderBytes[16 + 3 * i + 2]));
        final int reserved = 0xff & pcxHeaderBytes[64];
        final int nPlanes = 0xff & pcxHeaderBytes[65];
        final int bytesPerLine = toUInt16(pcxHeaderBytes, 66, getByteOrder());
        final int paletteInfo = toUInt16(pcxHeaderBytes, 68, getByteOrder());
        final int hScreenSize = toUInt16(pcxHeaderBytes, 70, getByteOrder());
        final int vScreenSize = toUInt16(pcxHeaderBytes, 72, getByteOrder());

        if (manufacturer != 10) {
            throw new ImagingException(
                    "Not a Valid PCX File: manufacturer is " + manufacturer);
        }
        if (isStrict) {
            // Note that reserved is sometimes set to a non-zero value
            // by Paintbrush itself, so it shouldn't be enforced.
            if (bytesPerLine % 2 != 0) {
                throw new ImagingException(
                        "Not a Valid PCX File: bytesPerLine is odd");
            }
        }

        return new PcxHeader(manufacturer, version, encoding, bitsPerPixel,
                xMin, yMin, xMax, yMax, hDpi, vDpi, colormap, reserved,
                nPlanes, bytesPerLine, paletteInfo, hScreenSize, vScreenSize);
    }

    @Override
    public void writeImage(final BufferedImage src, final OutputStream os, final PcxImagingParameters params)
            throws ImagingException, IOException {
        new PcxWriter(params).writeImage(src, os);
    }
}
