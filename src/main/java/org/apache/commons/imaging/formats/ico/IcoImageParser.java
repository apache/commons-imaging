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
package org.apache.commons.imaging.formats.ico;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.PixelDensity;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.IImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.formats.bmp.BmpImageParser;
import org.apache.commons.imaging.palette.PaletteFactory;
import org.apache.commons.imaging.palette.SimplePalette;
import org.apache.commons.imaging.util.Debug;

public class IcoImageParser extends ImageParser {

    public IcoImageParser() {
        super.setByteOrder(BYTE_ORDER_LSB);
    }

    @Override
    public String getName() {
        return "ico-Custom";
    }

    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    private static final String DEFAULT_EXTENSION = ".ico";

    private static final String ACCEPTED_EXTENSIONS[] = { ".ico", ".cur", };

    @Override
    protected String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS;
    }

    @Override
    protected ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[] { ImageFormat.IMAGE_FORMAT_ICO, //
        };
    }

    @Override
    public boolean embedICCProfile(File src, File dst, byte profile[]) {
        return false;
    }

    @Override
    public IImageMetadata getMetadata(ByteSource byteSource, Map params)
            throws ImageReadException, IOException {
        return null;
    }

    @Override
    public ImageInfo getImageInfo(ByteSource byteSource, Map params)
            throws ImageReadException, IOException {
        return null;
    }

    @Override
    public Dimension getImageSize(ByteSource byteSource, Map params)
            throws ImageReadException, IOException {
        return null;
    }

    @Override
    public byte[] getICCProfileBytes(ByteSource byteSource, Map params)
            throws ImageReadException, IOException {
        return null;
    }

    private static class FileHeader {
        public final int reserved; // Reserved (2 bytes), always 0
        public final int iconType; // IconType (2 bytes), if the image is an
                                   // icon it?s 1, for cursors the value is 2.
        public final int iconCount; // IconCount (2 bytes), number of icons in
                                    // this file.

        public FileHeader(final int reserved, final int iconType,
                final int iconCount) {
            this.reserved = reserved;
            this.iconType = iconType;
            this.iconCount = iconCount;
        }

        public void dump(PrintWriter pw) {
            pw.println("FileHeader");
            pw.println("Reserved: " + reserved);
            pw.println("IconType: " + iconType);
            pw.println("IconCount: " + iconCount);
            pw.println();
        }
    }

    private FileHeader readFileHeader(InputStream is)
            throws ImageReadException, IOException {
        int Reserved = read2Bytes("Reserved", is, "Not a Valid ICO File");
        int IconType = read2Bytes("IconType", is, "Not a Valid ICO File");
        int IconCount = read2Bytes("IconCount", is, "Not a Valid ICO File");

        if (Reserved != 0)
            throw new ImageReadException("Not a Valid ICO File: reserved is "
                    + Reserved);
        if (IconType != 1 && IconType != 2)
            throw new ImageReadException("Not a Valid ICO File: icon type is "
                    + IconType);

        return new FileHeader(Reserved, IconType, IconCount);

    }

    private static class IconInfo {
        public final byte Width;
        public final byte Height;
        public final byte ColorCount;
        public final byte Reserved;
        public final int Planes;
        public final int BitCount;
        public final int ImageSize;
        public final int ImageOffset;

        public IconInfo(final byte width, final byte height,
                final byte colorCount, final byte reserved, final int planes,
                final int bitCount, final int imageSize, final int imageOffset) {
            Width = width;
            Height = height;
            ColorCount = colorCount;
            Reserved = reserved;
            Planes = planes;
            BitCount = bitCount;
            ImageSize = imageSize;
            ImageOffset = imageOffset;
        }

        public void dump(PrintWriter pw) {
            pw.println("IconInfo");
            pw.println("Width: " + Width);
            pw.println("Height: " + Height);
            pw.println("ColorCount: " + ColorCount);
            pw.println("Reserved: " + Reserved);
            pw.println("Planes: " + Planes);
            pw.println("BitCount: " + BitCount);
            pw.println("ImageSize: " + ImageSize);
            pw.println("ImageOffset: " + ImageOffset);
        }
    }

    private IconInfo readIconInfo(InputStream is) throws ImageReadException,
            IOException {
        byte Width = readByte("Width", is, "Not a Valid ICO File"); // Width (1
                                                                    // byte),
                                                                    // Width of
                                                                    // Icon (1
                                                                    // to 255)
        byte Height = readByte("Height", is, "Not a Valid ICO File"); // Height
                                                                      // (1
                                                                      // byte),
                                                                      // Height
                                                                      // of Icon
                                                                      // (1 to
                                                                      // 255)
        byte ColorCount = readByte("ColorCount", is, "Not a Valid ICO File"); // ColorCount
                                                                              // (1
                                                                              // byte),
                                                                              // Number
                                                                              // of
                                                                              // colors,
                                                                              // either
                                                                              // 0
                                                                              // for
                                                                              // 24
                                                                              // bit
                                                                              // or
                                                                              // higher,
                                                                              // 2
                                                                              // for
                                                                              // monochrome
                                                                              // or
                                                                              // 16
                                                                              // for
                                                                              // 16
                                                                              // color
                                                                              // images.
        byte Reserved = readByte("Reserved", is, "Not a Valid ICO File"); // Reserved
                                                                          // (1
                                                                          // byte),
                                                                          // Not
                                                                          // used
                                                                          // (always
                                                                          // 0)
        int Planes = read2Bytes("Planes", is, "Not a Valid ICO File"); // Planes
                                                                       // (2
                                                                       // bytes),
                                                                       // always
                                                                       // 1
        int BitCount = read2Bytes("BitCount", is, "Not a Valid ICO File"); // BitCount
                                                                           // (2
                                                                           // bytes),
                                                                           // number
                                                                           // of
                                                                           // bits
                                                                           // per
                                                                           // pixel
                                                                           // (1
                                                                           // for
                                                                           // monochrome,
                                                                           // 4
                                                                           // for
                                                                           // 16
                                                                           // colors,
                                                                           // 8
                                                                           // for
                                                                           // 256
                                                                           // colors,
                                                                           // 24
                                                                           // for
                                                                           // true
                                                                           // colors,
                                                                           // 32
                                                                           // for
                                                                           // true
                                                                           // colors
                                                                           // +
                                                                           // alpha
                                                                           // channel)
        int ImageSize = read4Bytes("ImageSize", is, "Not a Valid ICO File"); // ImageSize
                                                                             // (4
                                                                             // bytes),
                                                                             // Length
                                                                             // of
                                                                             // resource
                                                                             // in
                                                                             // bytes
        int ImageOffset = read4Bytes("ImageOffset", is, "Not a Valid ICO File"); // ImageOffset
                                                                                 // (4
                                                                                 // bytes),
                                                                                 // start
                                                                                 // of
                                                                                 // the
                                                                                 // image
                                                                                 // in
                                                                                 // the
                                                                                 // file.

        return new IconInfo(Width, Height, ColorCount, Reserved, Planes,
                BitCount, ImageSize, ImageOffset);
    }

    private static class BitmapHeader {
        public final int Size;
        public final int Width;
        public final int Height;
        public final int Planes;
        public final int BitCount;
        public final int Compression;
        public final int SizeImage;
        public final int XPelsPerMeter;
        public final int YPelsPerMeter;
        public final int ColorsUsed;
        public final int ColorsImportant;

        public BitmapHeader(final int size, final int width, final int height,
                final int planes, final int bitCount, final int compression,
                final int sizeImage, final int pelsPerMeter,
                final int pelsPerMeter2, final int colorsUsed,
                final int colorsImportant) {
            Size = size;
            Width = width;
            Height = height;
            Planes = planes;
            BitCount = bitCount;
            Compression = compression;
            SizeImage = sizeImage;
            XPelsPerMeter = pelsPerMeter;
            YPelsPerMeter = pelsPerMeter2;
            ColorsUsed = colorsUsed;
            ColorsImportant = colorsImportant;
        }

        public void dump(PrintWriter pw) {
            pw.println("BitmapHeader");

            pw.println("Size: " + Size);
            pw.println("Width: " + Width);
            pw.println("Height: " + Height);
            pw.println("Planes: " + Planes);
            pw.println("BitCount: " + BitCount);
            pw.println("Compression: " + Compression);
            pw.println("SizeImage: " + SizeImage);
            pw.println("XPelsPerMeter: " + XPelsPerMeter);
            pw.println("YPelsPerMeter: " + YPelsPerMeter);
            pw.println("ColorsUsed: " + ColorsUsed);
            pw.println("ColorsImportant: " + ColorsImportant);
        }
    }

    private static abstract class IconData {
        public final IconInfo iconInfo;

        public IconData(final IconInfo iconInfo) {
            this.iconInfo = iconInfo;
        }

        public void dump(PrintWriter pw) {
            iconInfo.dump(pw);
            pw.println();
            dumpSubclass(pw);
        }

        protected abstract void dumpSubclass(PrintWriter pw);

        public abstract BufferedImage readBufferedImage()
                throws ImageReadException;
    }

    private static class BitmapIconData extends IconData {
        public final BitmapHeader header;
        public final BufferedImage bufferedImage;

        public BitmapIconData(final IconInfo iconInfo,
                final BitmapHeader header, final BufferedImage bufferedImage) {
            super(iconInfo);
            this.header = header;
            this.bufferedImage = bufferedImage;
        }

        @Override
        public BufferedImage readBufferedImage() throws ImageReadException {
            return bufferedImage;
        }

        @Override
        protected void dumpSubclass(PrintWriter pw) {
            pw.println("BitmapIconData");
            header.dump(pw);
            pw.println();
        }
    }

    private static class PNGIconData extends IconData {
        public final BufferedImage bufferedImage;

        public PNGIconData(final IconInfo iconInfo,
                final BufferedImage bufferedImage) {
            super(iconInfo);
            this.bufferedImage = bufferedImage;
        }

        @Override
        public BufferedImage readBufferedImage() {
            return bufferedImage;
        }

        @Override
        protected void dumpSubclass(PrintWriter pw) {
            pw.println("PNGIconData");
            pw.println();
        }
    }

    private IconData readBitmapIconData(byte[] iconData, IconInfo fIconInfo)
            throws ImageReadException, IOException {
        ByteArrayInputStream is = new ByteArrayInputStream(iconData);
        int Size = read4Bytes("Size", is, "Not a Valid ICO File"); // Size (4
                                                                   // bytes),
                                                                   // size of
                                                                   // this
                                                                   // structure
                                                                   // (always
                                                                   // 40)
        int Width = read4Bytes("Width", is, "Not a Valid ICO File"); // Width (4
                                                                     // bytes),
                                                                     // width of
                                                                     // the
                                                                     // image
                                                                     // (same as
                                                                     // iconinfo.width)
        int Height = read4Bytes("Height", is, "Not a Valid ICO File"); // Height
                                                                       // (4
                                                                       // bytes),
                                                                       // scanlines
                                                                       // in the
                                                                       // color
                                                                       // map +
                                                                       // transparent
                                                                       // map
                                                                       // (iconinfo.height
                                                                       // * 2)
        int Planes = read2Bytes("Planes", is, "Not a Valid ICO File"); // Planes
                                                                       // (2
                                                                       // bytes),
                                                                       // always
                                                                       // 1
        int BitCount = read2Bytes("BitCount", is, "Not a Valid ICO File"); // BitCount
                                                                           // (2
                                                                           // bytes),
                                                                           // 1,4,8,16,24,32
                                                                           // (see
                                                                           // iconinfo
                                                                           // for
                                                                           // details)
        int Compression = read4Bytes("Compression", is, "Not a Valid ICO File"); // Compression
                                                                                 // (4
                                                                                 // bytes),
                                                                                 // we
                                                                                 // don?t
                                                                                 // use
                                                                                 // this
                                                                                 // (0)
        int SizeImage = read4Bytes("SizeImage", is, "Not a Valid ICO File"); // SizeImage
                                                                             // (4
                                                                             // bytes),
                                                                             // we
                                                                             // don?t
                                                                             // use
                                                                             // this
                                                                             // (0)
        int XPelsPerMeter = read4Bytes("XPelsPerMeter", is,
                "Not a Valid ICO File"); // XPelsPerMeter (4 bytes), we don?t
                                         // use this (0)
        int YPelsPerMeter = read4Bytes("YPelsPerMeter", is,
                "Not a Valid ICO File"); // YPelsPerMeter (4 bytes), we don?t
                                         // use this (0)
        int ColorsUsed = read4Bytes("ColorsUsed", is, "Not a Valid ICO File"); // ColorsUsed
                                                                               // (4
                                                                               // bytes),
                                                                               // we
                                                                               // don?t
                                                                               // use
                                                                               // this
                                                                               // (0)
        int ColorsImportant = read4Bytes("ColorsImportant", is,
                "Not a Valid ICO File"); // ColorsImportant (4 bytes), we don?t
                                         // use this (0)
        int RedMask = 0;
        int GreenMask = 0;
        int BlueMask = 0;
        int AlphaMask = 0;
        if (Compression == 3) {
            RedMask = read4Bytes("RedMask", is, "Not a Valid ICO File");
            GreenMask = read4Bytes("GreenMask", is, "Not a Valid ICO File");
            BlueMask = read4Bytes("BlueMask", is, "Not a Valid ICO File");
        }
        byte[] RestOfFile = readByteArray("RestOfFile", is.available(), is);

        if (Size != 40)
            throw new ImageReadException(
                    "Not a Valid ICO File: Wrong bitmap header size " + Size);
        if (Planes != 1)
            throw new ImageReadException(
                    "Not a Valid ICO File: Planes can't be " + Planes);

        if (Compression == 0 && BitCount == 32) {
            // 32 BPP RGB icons need an alpha channel, but BMP files don't have
            // one unless BI_BITFIELDS is used...
            Compression = 3;
            RedMask = 0x00ff0000;
            GreenMask = 0x0000ff00;
            BlueMask = 0x000000ff;
            AlphaMask = 0xff000000;
        }

        BitmapHeader header = new BitmapHeader(Size, Width, Height, Planes,
                BitCount, Compression, SizeImage, XPelsPerMeter, YPelsPerMeter,
                ColorsUsed, ColorsImportant);

        int bitmapPixelsOffset = 14 + 56 + 4 * ((ColorsUsed == 0 && BitCount <= 8) ? (1 << BitCount)
                : ColorsUsed);
        int bitmapSize = 14 + 56 + RestOfFile.length;

        ByteArrayOutputStream baos = new ByteArrayOutputStream(bitmapSize);
        BinaryOutputStream bos = new BinaryOutputStream(baos,
                BinaryOutputStream.BYTE_ORDER_LITTLE_ENDIAN);

        bos.write('B');
        bos.write('M');
        bos.write4Bytes(bitmapSize);
        bos.write4Bytes(0);
        bos.write4Bytes(bitmapPixelsOffset);

        bos.write4Bytes(56);
        bos.write4Bytes(Width);
        bos.write4Bytes(Height / 2);
        bos.write2Bytes(Planes);
        bos.write2Bytes(BitCount);
        bos.write4Bytes(Compression);
        bos.write4Bytes(SizeImage);
        bos.write4Bytes(XPelsPerMeter);
        bos.write4Bytes(YPelsPerMeter);
        bos.write4Bytes(ColorsUsed);
        bos.write4Bytes(ColorsImportant);
        bos.write4Bytes(RedMask);
        bos.write4Bytes(GreenMask);
        bos.write4Bytes(BlueMask);
        bos.write4Bytes(AlphaMask);
        bos.write(RestOfFile);
        bos.flush();

        ByteArrayInputStream bmpInputStream = new ByteArrayInputStream(
                baos.toByteArray());
        BufferedImage bmpImage = new BmpImageParser().getBufferedImage(
                bmpInputStream, null);

        // Transparency map is optional with 32 BPP icons, because they already
        // have
        // an alpha channel, and Windows only uses the transparency map when it
        // has to
        // display the icon on a < 32 BPP screen. But it's still used instead of
        // alpha
        // if the image would be completely transparent with alpha...
        int t_scanline_size = (Width + 7) / 8;
        if ((t_scanline_size % 4) != 0)
            t_scanline_size += 4 - (t_scanline_size % 4); // pad scanline to 4
                                                          // byte size.
        int tcolor_map_size_bytes = t_scanline_size * (Height / 2);
        byte[] transparency_map = null;
        try {
            transparency_map = this.readByteArray("transparency_map",
                    tcolor_map_size_bytes, bmpInputStream,
                    "Not a Valid ICO File");
        } catch (IOException ioEx) {
            if (BitCount != 32)
                throw ioEx;
        }

        boolean allAlphasZero = true;
        if (BitCount == 32) {
            for (int y = 0; allAlphasZero && y < bmpImage.getHeight(); y++) {
                for (int x = 0; x < bmpImage.getWidth(); x++) {
                    if ((bmpImage.getRGB(x, y) & 0xff000000) != 0) {
                        allAlphasZero = false;
                        break;
                    }
                }
            }
        }
        BufferedImage resultImage;
        if (allAlphasZero) {
            resultImage = new BufferedImage(bmpImage.getWidth(),
                    bmpImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
            for (int y = 0; y < resultImage.getHeight(); y++) {
                for (int x = 0; x < resultImage.getWidth(); x++) {
                    int alpha = 0xff;
                    if (transparency_map != null) {
                        int alpha_byte = 0xff & transparency_map[t_scanline_size
                                * (bmpImage.getHeight() - y - 1) + (x / 8)];
                        alpha = 0x01 & (alpha_byte >> (7 - (x % 8)));
                        alpha = (alpha == 0) ? 0xff : 0x00;
                    }
                    resultImage.setRGB(x, y, (alpha << 24)
                            | (0xffffff & bmpImage.getRGB(x, y)));
                }
            }
        } else
            resultImage = bmpImage;
        return new BitmapIconData(fIconInfo, header, resultImage);
    }

    private IconData readIconData(byte[] iconData, IconInfo fIconInfo)
            throws ImageReadException, IOException {
        ImageFormat imageFormat = Imaging.guessFormat(iconData);
        if (imageFormat.equals(ImageFormat.IMAGE_FORMAT_PNG)) {
            BufferedImage bufferedImage = Imaging.getBufferedImage(iconData);
            PNGIconData pngIconData = new PNGIconData(fIconInfo, bufferedImage);
            return pngIconData;
        } else {
            return readBitmapIconData(iconData, fIconInfo);
        }
    }

    private static class ImageContents {
        public final FileHeader fileHeader;
        public final IconData iconDatas[];

        public ImageContents(final FileHeader fileHeader,
                final IconData[] iconDatas) {
            super();
            this.fileHeader = fileHeader;
            this.iconDatas = iconDatas;
        }
    }

    private ImageContents readImage(ByteSource byteSource)
            throws ImageReadException, IOException {
        InputStream is = null;
        try {
            is = byteSource.getInputStream();
            FileHeader fileHeader = readFileHeader(is);

            IconInfo fIconInfos[] = new IconInfo[fileHeader.iconCount];
            for (int i = 0; i < fileHeader.iconCount; i++) {
                fIconInfos[i] = readIconInfo(is);
            }

            IconData fIconDatas[] = new IconData[fileHeader.iconCount];
            for (int i = 0; i < fileHeader.iconCount; i++) {
                byte[] iconData = byteSource.getBlock(
                        fIconInfos[i].ImageOffset, fIconInfos[i].ImageSize);
                fIconDatas[i] = readIconData(iconData, fIconInfos[i]);
            }

            return new ImageContents(fileHeader, fIconDatas);
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (Exception e) {
                Debug.debug(e);
            }

        }
    }

    @Override
    public boolean dumpImageFile(PrintWriter pw, ByteSource byteSource)
            throws ImageReadException, IOException {
        ImageContents contents = readImage(byteSource);
        contents.fileHeader.dump(pw);
        for (int i = 0; i < contents.iconDatas.length; i++)
            contents.iconDatas[i].dump(pw);
        return true;
    }

    @Override
    public final BufferedImage getBufferedImage(ByteSource byteSource,
            Map params) throws ImageReadException, IOException {
        ImageContents contents = readImage(byteSource);
        FileHeader fileHeader = contents.fileHeader;
        if (fileHeader.iconCount > 0)
            return contents.iconDatas[0].readBufferedImage();
        else
            throw new ImageReadException("No icons in ICO file");
    }

    @Override
    public List<BufferedImage> getAllBufferedImages(ByteSource byteSource)
            throws ImageReadException, IOException {
        List<BufferedImage> result = new ArrayList<BufferedImage>();
        ImageContents contents = readImage(byteSource);

        FileHeader fileHeader = contents.fileHeader;
        for (int i = 0; i < fileHeader.iconCount; i++) {
            IconData iconData = contents.iconDatas[i];

            BufferedImage image = iconData.readBufferedImage();

            result.add(image);
        }

        return result;
    }

    // public boolean extractImages(ByteSource byteSource, File dst_dir,
    // String dst_root, ImageParser encoder) throws ImageReadException,
    // IOException, ImageWriteException
    // {
    // ImageContents contents = readImage(byteSource);
    //
    // FileHeader fileHeader = contents.fileHeader;
    // for (int i = 0; i < fileHeader.iconCount; i++)
    // {
    // IconData iconData = contents.iconDatas[i];
    //
    // BufferedImage image = readBufferedImage(iconData);
    //
    // int size = Math.max(iconData.iconInfo.Width,
    // iconData.iconInfo.Height);
    // File file = new File(dst_dir, dst_root + "_" + size + "_"
    // + iconData.iconInfo.BitCount
    // + encoder.getDefaultExtension());
    // encoder.writeImage(image, new FileOutputStream(file), null);
    // }
    //
    // return true;
    // }

    @Override
    public void writeImage(BufferedImage src, OutputStream os, Map params)
            throws ImageWriteException, IOException {
        // make copy of params; we'll clear keys as we consume them.
        params = (params == null) ? new HashMap() : new HashMap(params);

        // clear format key.
        if (params.containsKey(PARAM_KEY_FORMAT))
            params.remove(PARAM_KEY_FORMAT);
        
        PixelDensity pixelDensity = (PixelDensity) params.remove(PARAM_KEY_PIXEL_DENSITY);

        if (params.size() > 0) {
            Object firstKey = params.keySet().iterator().next();
            throw new ImageWriteException("Unknown parameter: " + firstKey);
        }

        final PaletteFactory paletteFactory = new PaletteFactory();
        final SimplePalette palette = paletteFactory
                .makeExactRgbPaletteSimple(src, 256);
        final int bitCount;
        final boolean hasTransparency = paletteFactory.hasTransparency(src);
        if (palette == null) {
            if (hasTransparency)
                bitCount = 32;
            else
                bitCount = 24;
        } else if (palette.length() <= 2)
            bitCount = 1;
        else if (palette.length() <= 16)
            bitCount = 4;
        else
            bitCount = 8;

        BinaryOutputStream bos = new BinaryOutputStream(os, BYTE_ORDER_INTEL);

        int scanline_size = (bitCount * src.getWidth() + 7) / 8;
        if ((scanline_size % 4) != 0)
            scanline_size += 4 - (scanline_size % 4); // pad scanline to 4 byte
                                                      // size.
        int t_scanline_size = (src.getWidth() + 7) / 8;
        if ((t_scanline_size % 4) != 0)
            t_scanline_size += 4 - (t_scanline_size % 4); // pad scanline to 4
                                                          // byte size.
        int imageSize = 40 + 4 * (bitCount <= 8 ? (1 << bitCount) : 0)
                + src.getHeight() * scanline_size + src.getHeight()
                * t_scanline_size;

        // ICONDIR
        bos.write2Bytes(0); // reserved
        bos.write2Bytes(1); // 1=ICO, 2=CUR
        bos.write2Bytes(1); // count

        // ICONDIRENTRY
        int iconDirEntryWidth = src.getWidth();
        int iconDirEntryHeight = src.getHeight();
        if (iconDirEntryWidth > 255 || iconDirEntryHeight > 255) {
            iconDirEntryWidth = 0;
            iconDirEntryHeight = 0;
        }
        bos.write(iconDirEntryWidth);
        bos.write(iconDirEntryHeight);
        bos.write((bitCount >= 8) ? 0 : (1 << bitCount));
        bos.write(0); // reserved
        bos.write2Bytes(1); // color planes
        bos.write2Bytes(bitCount);
        bos.write4Bytes(imageSize);
        bos.write4Bytes(22); // image offset

        // BITMAPINFOHEADER
        bos.write4Bytes(40); // size
        bos.write4Bytes(src.getWidth());
        bos.write4Bytes(2 * src.getHeight());
        bos.write2Bytes(1); // planes
        bos.write2Bytes(bitCount);
        bos.write4Bytes(0); // compression
        bos.write4Bytes(0); // image size
        bos.write4Bytes(pixelDensity == null ? 0 : (int)Math.round(pixelDensity.horizontalDensityMetres())); // x pixels per meter
        bos.write4Bytes(pixelDensity == null ? 0 : (int)Math.round(pixelDensity.horizontalDensityMetres())); // y pixels per meter
        bos.write4Bytes(0); // colors used, 0 = (1 << bitCount) (ignored)
        bos.write4Bytes(0); // colors important

        if (palette != null) {
            for (int i = 0; i < (1 << bitCount); i++) {
                if (i < palette.length()) {
                    int argb = palette.getEntry(i);
                    bos.write(0xff & argb);
                    bos.write(0xff & (argb >> 8));
                    bos.write(0xff & (argb >> 16));
                    bos.write(0);
                } else {
                    bos.write(0);
                    bos.write(0);
                    bos.write(0);
                    bos.write(0);
                }
            }
        }

        int bit_cache = 0;
        int bits_in_cache = 0;
        int row_padding = scanline_size - (bitCount * src.getWidth() + 7) / 8;
        for (int y = src.getHeight() - 1; y >= 0; y--) {
            for (int x = 0; x < src.getWidth(); x++) {
                int argb = src.getRGB(x, y);
                if (bitCount < 8) {
                    int rgb = 0xffffff & argb;
                    int index = palette.getPaletteIndex(rgb);
                    bit_cache <<= bitCount;
                    bit_cache |= index;
                    bits_in_cache += bitCount;
                    if (bits_in_cache >= 8) {
                        bos.write(0xff & bit_cache);
                        bit_cache = 0;
                        bits_in_cache = 0;
                    }
                } else if (bitCount == 8) {
                    int rgb = 0xffffff & argb;
                    int index = palette.getPaletteIndex(rgb);
                    bos.write(0xff & index);
                } else if (bitCount == 24) {
                    bos.write(0xff & argb);
                    bos.write(0xff & (argb >> 8));
                    bos.write(0xff & (argb >> 16));
                } else if (bitCount == 32) {
                    bos.write(0xff & argb);
                    bos.write(0xff & (argb >> 8));
                    bos.write(0xff & (argb >> 16));
                    bos.write(0xff & (argb >> 24));
                }
            }

            if (bits_in_cache > 0) {
                bit_cache <<= (8 - bits_in_cache);
                bos.write(0xff & bit_cache);
                bit_cache = 0;
                bits_in_cache = 0;
            }

            for (int x = 0; x < row_padding; x++)
                bos.write(0);
        }

        int t_row_padding = t_scanline_size - (src.getWidth() + 7) / 8;
        for (int y = src.getHeight() - 1; y >= 0; y--) {
            for (int x = 0; x < src.getWidth(); x++) {
                int argb = src.getRGB(x, y);
                int alpha = 0xff & (argb >> 24);
                bit_cache <<= 1;
                if (alpha == 0)
                    bit_cache |= 1;
                bits_in_cache++;
                if (bits_in_cache >= 8) {
                    bos.write(0xff & bit_cache);
                    bit_cache = 0;
                    bits_in_cache = 0;
                }
            }

            if (bits_in_cache > 0) {
                bit_cache <<= (8 - bits_in_cache);
                bos.write(0xff & bit_cache);
                bit_cache = 0;
                bits_in_cache = 0;
            }

            for (int x = 0; x < t_row_padding; x++)
                bos.write(0);
        }
    }

    /**
     * Extracts embedded XML metadata as XML string.
     * <p>
     * 
     * @param byteSource
     *            File containing image data.
     * @param params
     *            Map of optional parameters, defined in SanselanConstants.
     * @return Xmp Xml as String, if present. Otherwise, returns null.
     */
    @Override
    public String getXmpXml(ByteSource byteSource, Map params)
            throws ImageReadException, IOException {
        return null;
    }
}
