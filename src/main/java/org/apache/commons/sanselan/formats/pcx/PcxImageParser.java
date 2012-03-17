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
package org.apache.commons.sanselan.formats.pcx;

import java.awt.Dimension;
import java.awt.Transparency;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.IndexColorModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.sanselan.ImageFormat;
import org.apache.commons.sanselan.ImageInfo;
import org.apache.commons.sanselan.ImageParser;
import org.apache.commons.sanselan.ImageReadException;
import org.apache.commons.sanselan.ImageWriteException;
import org.apache.commons.sanselan.common.IImageMetadata;
import org.apache.commons.sanselan.common.bytesource.ByteSource;

public class PcxImageParser extends ImageParser implements PcxConstants
{
    // ZSoft's official spec is at http://www.qzx.com/pc-gpe/pcx.txt
    // (among other places) but it's pretty thin. The fileformat.info document
    // at http://www.fileformat.info/format/pcx/egff.htm is a little better
    // but their gray sample image seems corrupt. PCX files themselves are
    // the ultimate test but pretty hard to find nowdays, so the best
    // test is against other image viewers (Irfanview is pretty good).
    //
    // Open source projects are generally poor at parsing PCX,
    // SDL_Image/gdk-pixbuf/Eye of Gnome/GIMP/F-Spot all only do some formats,
    // don't support uncompressed PCX, and/or don't handle black and white
    // images properly.

    public PcxImageParser()
    {
        super.setByteOrder(BYTE_ORDER_LSB);
    }

    public String getName()
    {
        return "Pcx-Custom";
    }

    public String getDefaultExtension()
    {
        return DEFAULT_EXTENSION;
    }
    private static final String DEFAULT_EXTENSION = ".pcx";
    private static final String ACCEPTED_EXTENSIONS[] =
    {
        ".pcx", ".pcc",
    };

    protected String[] getAcceptedExtensions()
    {
        return ACCEPTED_EXTENSIONS;
    }

    protected ImageFormat[] getAcceptedTypes()
    {
        return new ImageFormat[]
        {
            ImageFormat.IMAGE_FORMAT_PCX, //
        };
    }

    public boolean embedICCProfile(File src, File dst, byte profile[])
    {
        return false;
    }

    public IImageMetadata getMetadata(ByteSource byteSource, Map params)
            throws ImageReadException, IOException
    {
        return null;
    }

    public ImageInfo getImageInfo(ByteSource byteSource, Map params)
            throws ImageReadException, IOException
    {
        PcxHeader pcxHeader = readPcxHeader(byteSource);
        Dimension size = getImageSize(byteSource, params);
        int metricHDpi = (int) (pcxHeader.hDpi * 1000.0 / 2.54);
        int metricVDpi = (int) (pcxHeader.vDpi * 1000.0 / 2.54);
        return new ImageInfo("PCX", pcxHeader.nPlanes * pcxHeader.bitsPerPixel, new ArrayList<String>(),
                ImageFormat.IMAGE_FORMAT_PCX, "ZSoft PCX Image", size.height, "image/x-pcx", 1,
                pcxHeader.vDpi, Math.round(size.getHeight() / pcxHeader.vDpi),
                pcxHeader.hDpi, Math.round(size.getWidth() / pcxHeader.hDpi),
                size.width, false, false,
                !(pcxHeader.nPlanes == 3 && pcxHeader.bitsPerPixel == 8),
                ImageInfo.COLOR_TYPE_RGB,
                pcxHeader.encoding == PcxHeader.ENCODING_RLE ?
                    ImageInfo.COMPRESSION_ALGORITHM_RLE : ImageInfo.COMPRESSION_ALGORITHM_NONE);
    }

    public Dimension getImageSize(ByteSource byteSource,
            Map params)
            throws ImageReadException, IOException
    {
        PcxHeader pcxHeader = readPcxHeader(byteSource);
        int xSize = pcxHeader.xMax - pcxHeader.xMin + 1;
        if (xSize < 0)
            throw new ImageReadException("Image width is negative");
        int ySize = pcxHeader.yMax - pcxHeader.yMin + 1;
        if (ySize < 0)
            throw new ImageReadException("Image height is negative");
        return new Dimension(xSize, ySize);
    }

    public byte[] getICCProfileBytes(ByteSource byteSource,
            Map params)
            throws ImageReadException, IOException
    {
        return null;
    }

    static class PcxHeader
    {

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
        public final int encoding; // 0 = very old uncompressed format, 1 = .pcx run length encoding
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
        public final int bytesPerLine; // Number of bytes per scanline plane, must be an even number.
        public final int paletteInfo; // 1 = Color/BW, 2 = Grayscale, ignored in Paintbrush IV/IV+
        public final int hScreenSize; // horizontal screen size, in pixels. PaintBrush >= IV only.
        public final int vScreenSize; // vertical screen size, in pixels. PaintBrush >= IV only.

        public PcxHeader(final int manufacturer, final int version,
                final int encoding, final int bitsPerPixel,
                final int xMin, final int yMin,
                final int xMax, final int yMax,
                final int hDpi, final int vDpi,
                final int[] colormap,
                final int reserved, final int nPlanes,
                final int bytesPerLine, final int paletteInfo,
                final int hScreenSize, final int vScreenSize)
        {
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

        public void dump(PrintWriter pw)
        {
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
            for (int i = 0; i < colormap.length; i++)
            {
                if (i > 0)
                    pw.print(",");
                pw.print("("
                        + (0xff & (colormap[i] >> 16)) + ","
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

    private PcxHeader readPcxHeader(ByteSource byteSource)
            throws ImageReadException, IOException
    {
        InputStream is = null;
        try
        {
            is = byteSource.getInputStream();
            return readPcxHeader(is, false);
        }
        finally
        {
            try
            {
                if (is != null)
                    is.close();
            }
            catch (IOException ignored)
            {
            }
        }
    }

    private PcxHeader readPcxHeader(InputStream is, boolean isStrict)
            throws ImageReadException, IOException
    {
        byte[] pcxHeaderBytes = readByteArray("PcxHeader", 128, is, "Not a Valid PCX File");
        int manufacturer = 0xff & pcxHeaderBytes[0];
        int version = 0xff & pcxHeaderBytes[1];
        int encoding = 0xff & pcxHeaderBytes[2];
        int bitsPerPixel = 0xff & pcxHeaderBytes[3];
        int xMin = convertByteArrayToShort("xMin", 4, pcxHeaderBytes, BYTE_ORDER_LSB);
        int yMin = convertByteArrayToShort("yMin", 6, pcxHeaderBytes, BYTE_ORDER_LSB);
        int xMax = convertByteArrayToShort("xMax", 8, pcxHeaderBytes, BYTE_ORDER_LSB);
        int yMax = convertByteArrayToShort("yMax", 10, pcxHeaderBytes, BYTE_ORDER_LSB);
        int hDpi = convertByteArrayToShort("hDpi", 12, pcxHeaderBytes, BYTE_ORDER_LSB);
        int vDpi = convertByteArrayToShort("vDpi", 14, pcxHeaderBytes, BYTE_ORDER_LSB);
        int[] colormap = new int[16];
        for (int i = 0; i < 16; i++)
        {
            colormap[i] = 0xff000000
                    | ((0xff & pcxHeaderBytes[16 + 3 * i]) << 16)
                    | ((0xff & pcxHeaderBytes[16 + 3 * i + 1]) << 8)
                    | (0xff & pcxHeaderBytes[16 + 3 * i + 2]);
        }
        int reserved = 0xff & pcxHeaderBytes[64];
        int nPlanes = 0xff & pcxHeaderBytes[65];
        int bytesPerLine = convertByteArrayToShort("BytesPerLine", 66, pcxHeaderBytes, BYTE_ORDER_LSB);
        int paletteInfo = convertByteArrayToShort("PaletteInfo", 68, pcxHeaderBytes, BYTE_ORDER_LSB);
        int hScreenSize = convertByteArrayToShort("hScreenSize", 70, pcxHeaderBytes, BYTE_ORDER_LSB);
        int vScreenSize = convertByteArrayToShort("vScreenSize", 72, pcxHeaderBytes, BYTE_ORDER_LSB);

        if (manufacturer != 10)
            throw new ImageReadException("Not a Valid PCX File: manufacturer is " + manufacturer);
        if (isStrict)
        {
            // Note that reserved is sometimes set to a non-zero value
            // by Paintbrush itself, so it shouldn't be enforced.
            if (bytesPerLine % 2 != 0)
                throw new ImageReadException("Not a Valid PCX File: bytesPerLine is odd");
        }

        return new PcxHeader(manufacturer, version, encoding, bitsPerPixel,
                xMin, yMin, xMax, yMax, hDpi, vDpi, colormap, reserved,
                nPlanes, bytesPerLine, paletteInfo, hScreenSize, vScreenSize);
    }

    public boolean dumpImageFile(PrintWriter pw, ByteSource byteSource)
            throws ImageReadException, IOException
    {
        readPcxHeader(byteSource).dump(pw);
        return true;
    }

    private void readScanLine(PcxHeader pcxHeader, InputStream is, byte[] samples)
            throws IOException, ImageReadException
    {
        if (pcxHeader.encoding == PcxHeader.ENCODING_UNCOMPRESSED)
        {
            int r;
            for (int bytesRead = 0; bytesRead < samples.length; bytesRead += r)
            {
                r = is.read(samples, bytesRead, samples.length - bytesRead);
                if (r < 0)
                    throw new ImageReadException("Premature end of file reading image data");
            }
        }
        else
        {
            if (pcxHeader.encoding == PcxHeader.ENCODING_RLE)
            {
                for (int bytesRead = 0; bytesRead < samples.length;)
                {
                    byte b = readByte("Pixel", is, "Error reading image data");
                    int count;
                    byte sample;
                    if ((b & 0xc0) == 0xc0)
                    {
                        count = b & 0x3f;
                        sample = readByte("Pixel", is, "Error reading image data");
                    }
                    else
                    {
                        count = 1;
                        sample = b;
                    }
                    for (int i = 0; i < count && bytesRead + i < samples.length; i++)
                        samples[bytesRead + i] = sample;
                    bytesRead += count;
                }
            }
            else
                throw new ImageReadException("Invalid PCX encoding " + pcxHeader.encoding);
        }
    }

    private int[] read256ColorPalette(InputStream stream)
            throws IOException
    {
        byte[] paletteBytes = readByteArray("Palette", 769, stream, "Error reading palette");
        if (paletteBytes[0] != 12)
            return null;
        int[] palette = new int[256];
        for (int i = 0; i < palette.length; i++)
        {
            palette[i] = ((0xff & paletteBytes[1 + 3*i]) << 16)
                    | ((0xff & paletteBytes[1 + 3*i + 1]) << 8)
                    | (0xff & paletteBytes[1 + 3*i + 2]);
        }
        return palette;
    }

    private int[] read256ColorPaletteFromEndOfFile(ByteSource byteSource)
            throws IOException
    {
        InputStream stream = null;
        try
        {
            stream = byteSource.getInputStream();
            long toSkip = byteSource.getLength() - 769;
            skipBytes(stream, (int)toSkip);
            return read256ColorPalette(stream);
        }
        finally
        {
            try
            {
                if (stream != null)
                    stream.close();
            }
            catch (IOException closeException)
            {
            }
        }
    }

    private BufferedImage readImage(PcxHeader pcxHeader, InputStream is, ByteSource byteSource)
            throws ImageReadException, IOException
    {
        int xSize = pcxHeader.xMax - pcxHeader.xMin + 1;
        if (xSize < 0)
            throw new ImageReadException("Image width is negative");
        int ySize = pcxHeader.yMax - pcxHeader.yMin + 1;
        if (ySize < 0)
            throw new ImageReadException("Image height is negative");

        int scanlineLength = pcxHeader.bytesPerLine * pcxHeader.nPlanes;
        byte[] scanline = new byte[scanlineLength];
        if ((pcxHeader.bitsPerPixel == 1 || pcxHeader.bitsPerPixel == 2
                || pcxHeader.bitsPerPixel == 4 || pcxHeader.bitsPerPixel == 8) &&
                pcxHeader.nPlanes == 1)
        {
            int bytesPerImageRow = (xSize * pcxHeader.bitsPerPixel + 7) / 8;
            byte[] image = new byte[ySize * bytesPerImageRow];
            for (int y = 0; y < ySize; y++)
            {
                readScanLine(pcxHeader, is, scanline);
                System.arraycopy(scanline, 0, image, y*bytesPerImageRow, bytesPerImageRow);
            }
            DataBufferByte dataBuffer = new DataBufferByte(image, image.length);
            int[] palette;
            if (pcxHeader.bitsPerPixel == 1)
                palette = new int[] { 0x000000, 0xffffff };
            else if (pcxHeader.bitsPerPixel == 8)
            {
                // Normally the palette is read 769 bytes from the end of the file.
                // However DCX files have multiple PCX images in one file, so
                // there could be extra data before the end! So try look for the palette
                // immediately after the image data first.
                palette = read256ColorPalette(is);
                if (palette == null)
                    palette = read256ColorPaletteFromEndOfFile(byteSource);
                if (palette == null)
                    throw new ImageReadException(
                            "No 256 color palette found in image that needs it");
            }
            else
                palette = pcxHeader.colormap;
            WritableRaster raster;
            if (pcxHeader.bitsPerPixel == 8)
            {
                raster = WritableRaster.createInterleavedRaster(dataBuffer,
                        xSize, ySize, bytesPerImageRow, 1, new int[]{0}, null);
            }
            else
            {
                raster =  WritableRaster.createPackedRaster(dataBuffer,
                        xSize, ySize, pcxHeader.bitsPerPixel, null);
            }
            IndexColorModel colorModel = new IndexColorModel(pcxHeader.bitsPerPixel,
                    1 << pcxHeader.bitsPerPixel, palette, 0, false, -1, DataBuffer.TYPE_BYTE);
            return new BufferedImage(colorModel, raster,
                    colorModel.isAlphaPremultiplied(), new Properties());
        }
        else if (pcxHeader.bitsPerPixel == 1 && 2 <= pcxHeader.nPlanes
                && pcxHeader.nPlanes <= 4)
        {
            IndexColorModel colorModel = new IndexColorModel(pcxHeader.nPlanes,
                    1 << pcxHeader.nPlanes, pcxHeader.colormap, 0, false, -1, DataBuffer.TYPE_BYTE);
            BufferedImage image = new BufferedImage(xSize, ySize, BufferedImage.TYPE_BYTE_BINARY, colorModel);
            byte[] unpacked = new byte[xSize];
            for (int y = 0; y < ySize; y++)
            {
                readScanLine(pcxHeader, is, scanline);
                int nextByte = 0;
                Arrays.fill(unpacked, (byte) 0);
                for (int plane = 0; plane < pcxHeader.nPlanes; plane++)
                {
                    for (int i = 0; i < pcxHeader.bytesPerLine; i++)
                    {
                        int b = 0xff & scanline[nextByte++];
                        for (int j = 0; j < 8 && 8*i + j < unpacked.length; j++)
                            unpacked[8*i + j] |= (byte) (((b >> (7 - j)) & 0x1) << plane);
                    }
                }
                image.getRaster().setDataElements(0, y, xSize, 1, unpacked);
            }
            return image;
        }
        else if (pcxHeader.bitsPerPixel == 8 && pcxHeader.nPlanes == 3)
        {
            byte[][] image = new byte[3][];
            image[0] = new byte[xSize*ySize];
            image[1] = new byte[xSize*ySize];
            image[2] = new byte[xSize*ySize];
            for (int y = 0; y < ySize; y++)
            {
                readScanLine(pcxHeader, is, scanline);
                System.arraycopy(scanline, 0, image[0], y*xSize, xSize);
                System.arraycopy(scanline, pcxHeader.bytesPerLine,
                        image[1], y*xSize, xSize);
                System.arraycopy(scanline, 2*pcxHeader.bytesPerLine,
                        image[2], y*xSize, xSize);
            }
            DataBufferByte dataBuffer = new DataBufferByte(image, image[0].length);
            WritableRaster raster = WritableRaster.createBandedRaster(dataBuffer,
                    xSize, ySize, xSize, new int[]{0,1,2},
                    new int[]{0,0,0}, null);
            ColorModel colorModel = new ComponentColorModel(
                    ColorSpace.getInstance(ColorSpace.CS_sRGB), false, false,
                    Transparency.OPAQUE, DataBuffer.TYPE_BYTE);
            return new BufferedImage(colorModel, raster,
                    colorModel.isAlphaPremultiplied(), new Properties());
        }
        else if ((pcxHeader.bitsPerPixel == 24 && pcxHeader.nPlanes == 1) ||
                (pcxHeader.bitsPerPixel == 32 && pcxHeader.nPlanes == 1))
        {
            int rowLength = 3 * xSize;
            byte[] image = new byte[rowLength * ySize];
            for (int y = 0; y < ySize; y++)
            {
                readScanLine(pcxHeader, is, scanline);
                if (pcxHeader.bitsPerPixel == 24)
                    System.arraycopy(scanline, 0, image, y*rowLength, rowLength);
                else
                {
                    for (int x = 0; x < xSize; x++)
                    {
                        image[y*rowLength + 3*x] = scanline[4*x];
                        image[y*rowLength + 3*x + 1] = scanline[4*x + 1];
                        image[y*rowLength + 3*x + 2] = scanline[4*x + 2];
                    }
                }
            }
            DataBufferByte dataBuffer = new DataBufferByte(image, image.length);
            WritableRaster raster = WritableRaster.createInterleavedRaster(
                    dataBuffer, xSize, ySize, rowLength, 3,
                    new int[]{2,1,0}, null);
            ColorModel colorModel = new ComponentColorModel(
                    ColorSpace.getInstance(ColorSpace.CS_sRGB), false, false,
                    Transparency.OPAQUE, DataBuffer.TYPE_BYTE);
            return new BufferedImage(colorModel, raster,
                    colorModel.isAlphaPremultiplied(), new Properties());
        }
        else
        {
            throw new ImageReadException("Invalid/unsupported image with bitsPerPixel "
                    + pcxHeader.bitsPerPixel + " and planes " + pcxHeader.nPlanes);
        }
    }

    public final BufferedImage getBufferedImage(ByteSource byteSource,
            Map params) throws ImageReadException, IOException
    {
        params = (params == null) ? new HashMap() : new HashMap(params);
        boolean isStrict = false;
        Object strictness = params.get(PARAM_KEY_STRICT);
        if (strictness != null)
            isStrict = ((Boolean) strictness).booleanValue();

        InputStream is = null;
        try
        {
            is = byteSource.getInputStream();
            PcxHeader pcxHeader = readPcxHeader(is, isStrict);
            return readImage(pcxHeader, is, byteSource);
        }
        finally
        {
            try
            {
                if (is != null)
                    is.close();
            }
            catch (IOException ignored)
            {
            }
        }
    }

    public void writeImage(BufferedImage src, OutputStream os, Map params)
            throws ImageWriteException, IOException
    {
        new PcxWriter(params).writeImage(src, os);
    }

    /**
     * Extracts embedded XML metadata as XML string.
     * <p>
     *
     * @param byteSource
     *            File containing image data.
     * @param params
     *            Map of optional parameters, defined in SanselanConstants.
     * @return Xmp Xml as String, if present.  Otherwise, returns null.
     */
    public String getXmpXml(ByteSource byteSource, Map params)
            throws ImageReadException, IOException
    {
        return null;
    }
}
