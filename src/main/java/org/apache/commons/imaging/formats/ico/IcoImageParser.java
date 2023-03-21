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

import static org.apache.commons.imaging.common.BinaryFunctions.read2Bytes;
import static org.apache.commons.imaging.common.BinaryFunctions.read4Bytes;
import static org.apache.commons.imaging.common.BinaryFunctions.readByte;
import static org.apache.commons.imaging.common.BinaryFunctions.readBytes;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.PixelDensity;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.formats.bmp.BmpImageParser;
import org.apache.commons.imaging.palette.PaletteFactory;
import org.apache.commons.imaging.palette.SimplePalette;

public class IcoImageParser extends ImageParser<IcoImagingParameters> {
    private static final String DEFAULT_EXTENSION = ImageFormats.ICO.getDefaultExtension();
    private static final String[] ACCEPTED_EXTENSIONS = ImageFormats.ICO.getExtensions();

    public IcoImageParser() {
        super.setByteOrder(ByteOrder.LITTLE_ENDIAN);
    }

    @Override
    public IcoImagingParameters getDefaultParameters() {
        return new IcoImagingParameters();
    }

    @Override
    public String getName() {
        return "ico-Custom";
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
        return new ImageFormat[] { ImageFormats.ICO, //
        };
    }

    // TODO should throw UOE
    @Override
    public ImageMetadata getMetadata(final ByteSource byteSource, final IcoImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

    // TODO should throw UOE
    @Override
    public ImageInfo getImageInfo(final ByteSource byteSource, final IcoImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

    // TODO should throw UOE
    @Override
    public Dimension getImageSize(final ByteSource byteSource, final IcoImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

    // TODO should throw UOE
    @Override
    public byte[] getICCProfileBytes(final ByteSource byteSource, final IcoImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

    private static class FileHeader {
        public final int reserved; // Reserved (2 bytes), always 0
        public final int iconType; // IconType (2 bytes), if the image is an
                                   // icon it?s 1, for cursors the value is 2.
        public final int iconCount; // IconCount (2 bytes), number of icons in
                                    // this file.

        FileHeader(final int reserved, final int iconType, final int iconCount) {
            this.reserved = reserved;
            this.iconType = iconType;
            this.iconCount = iconCount;
        }

        public void dump(final PrintWriter pw) {
            pw.println("FileHeader");
            pw.println("Reserved: " + reserved);
            pw.println("IconType: " + iconType);
            pw.println("IconCount: " + iconCount);
            pw.println();
        }
    }

    private FileHeader readFileHeader(final InputStream is) throws ImageReadException, IOException {
        final int reserved = read2Bytes("Reserved", is, "Not a Valid ICO File", getByteOrder());
        final int iconType = read2Bytes("IconType", is, "Not a Valid ICO File", getByteOrder());
        final int iconCount = read2Bytes("IconCount", is, "Not a Valid ICO File", getByteOrder());

        if (reserved != 0) {
            throw new ImageReadException("Not a Valid ICO File: reserved is " + reserved);
        }
        if (iconType != 1 && iconType != 2) {
            throw new ImageReadException("Not a Valid ICO File: icon type is " + iconType);
        }

        return new FileHeader(reserved, iconType, iconCount);

    }

    private static class IconInfo {
        public final byte width;
        public final byte height;
        public final byte colorCount;
        public final byte reserved;
        public final int planes;
        public final int bitCount;
        public final int imageSize;
        public final int imageOffset;

        IconInfo(final byte width, final byte height,
                final byte colorCount, final byte reserved, final int planes,
                final int bitCount, final int imageSize, final int imageOffset) {
            this.width = width;
            this.height = height;
            this.colorCount = colorCount;
            this.reserved = reserved;
            this.planes = planes;
            this.bitCount = bitCount;
            this.imageSize = imageSize;
            this.imageOffset = imageOffset;
        }

        public void dump(final PrintWriter pw) {
            pw.println("IconInfo");
            pw.println("Width: " + width);
            pw.println("Height: " + height);
            pw.println("ColorCount: " + colorCount);
            pw.println("Reserved: " + reserved);
            pw.println("Planes: " + planes);
            pw.println("BitCount: " + bitCount);
            pw.println("ImageSize: " + imageSize);
            pw.println("ImageOffset: " + imageOffset);
        }
    }

    private IconInfo readIconInfo(final InputStream is) throws IOException {
        // Width (1 byte), Width of Icon (1 to 255)
        final byte width = readByte("Width", is, "Not a Valid ICO File");
        // Height (1 byte), Height of Icon (1 to 255)
        final byte height = readByte("Height", is, "Not a Valid ICO File");
        // ColorCount (1 byte), Number of colors, either
        // 0 for 24 bit or higher,
        // 2 for monochrome or 16 for 16 color images.
        final byte colorCount = readByte("ColorCount", is, "Not a Valid ICO File");
        // Reserved (1 byte), Not used (always 0)
        final byte reserved = readByte("Reserved", is, "Not a Valid ICO File");
        // Planes (2 bytes), always 1
        final int planes = read2Bytes("Planes", is, "Not a Valid ICO File", getByteOrder());
        // BitCount (2 bytes), number of bits per pixel (1 for monochrome,
        // 4 for 16 colors, 8 for 256 colors, 24 for true colors,
        // 32 for true colors + alpha channel)
        final int bitCount = read2Bytes("BitCount", is, "Not a Valid ICO File", getByteOrder());
        // ImageSize (4 bytes), Length of resource in bytes
        final int imageSize = read4Bytes("ImageSize", is, "Not a Valid ICO File", getByteOrder());
        // ImageOffset (4 bytes), start of the image in the file
        final int imageOffset = read4Bytes("ImageOffset", is, "Not a Valid ICO File", getByteOrder());

        return new IconInfo(width, height, colorCount, reserved, planes, bitCount, imageSize, imageOffset);
    }

    private static class BitmapHeader {
        public final int size;
        public final int width;
        public final int height;
        public final int planes;
        public final int bitCount;
        public final int compression;
        public final int sizeImage;
        public final int xPelsPerMeter;
        public final int yPelsPerMeter;
        public final int colorsUsed;
        public final int colorsImportant;

        BitmapHeader(final int size, final int width, final int height,
                final int planes, final int bitCount, final int compression,
                final int sizeImage, final int pelsPerMeter,
                final int pelsPerMeter2, final int colorsUsed,
                final int colorsImportant) {
            this.size = size;
            this.width = width;
            this.height = height;
            this.planes = planes;
            this.bitCount = bitCount;
            this.compression = compression;
            this.sizeImage = sizeImage;
            xPelsPerMeter = pelsPerMeter;
            yPelsPerMeter = pelsPerMeter2;
            this.colorsUsed = colorsUsed;
            this.colorsImportant = colorsImportant;
        }

        public void dump(final PrintWriter pw) {
            pw.println("BitmapHeader");

            pw.println("Size: " + size);
            pw.println("Width: " + width);
            pw.println("Height: " + height);
            pw.println("Planes: " + planes);
            pw.println("BitCount: " + bitCount);
            pw.println("Compression: " + compression);
            pw.println("SizeImage: " + sizeImage);
            pw.println("XPelsPerMeter: " + xPelsPerMeter);
            pw.println("YPelsPerMeter: " + yPelsPerMeter);
            pw.println("ColorsUsed: " + colorsUsed);
            pw.println("ColorsImportant: " + colorsImportant);
        }
    }

    private abstract static class IconData {
        public final IconInfo iconInfo;

        IconData(final IconInfo iconInfo) {
            this.iconInfo = iconInfo;
        }

        public void dump(final PrintWriter pw) {
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

        BitmapIconData(final IconInfo iconInfo,
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
        protected void dumpSubclass(final PrintWriter pw) {
            pw.println("BitmapIconData");
            header.dump(pw);
            pw.println();
        }
    }

    private static class PNGIconData extends IconData {
        public final BufferedImage bufferedImage;

        PNGIconData(final IconInfo iconInfo,
                final BufferedImage bufferedImage) {
            super(iconInfo);
            this.bufferedImage = bufferedImage;
        }

        @Override
        public BufferedImage readBufferedImage() {
            return bufferedImage;
        }

        @Override
        protected void dumpSubclass(final PrintWriter pw) {
            pw.println("PNGIconData");
            pw.println();
        }
    }

    private IconData readBitmapIconData(final byte[] iconData, final IconInfo fIconInfo)
            throws ImageReadException, IOException {
        final ByteArrayInputStream is = new ByteArrayInputStream(iconData);
        final int size = read4Bytes("size", is, "Not a Valid ICO File", getByteOrder()); // Size (4
                                                                   // bytes),
                                                                   // size of
                                                                   // this
                                                                   // structure
                                                                   // (always
                                                                   // 40)
        final int width = read4Bytes("width", is, "Not a Valid ICO File", getByteOrder()); // Width (4
                                                                     // bytes),
                                                                     // width of
                                                                     // the
                                                                     // image
                                                                     // (same as
                                                                     // iconinfo.width)
        final int height = read4Bytes("height", is, "Not a Valid ICO File", getByteOrder()); // Height
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
        final int planes = read2Bytes("planes", is, "Not a Valid ICO File", getByteOrder()); // Planes
                                                                       // (2
                                                                       // bytes),
                                                                       // always
                                                                       // 1
        final int bitCount = read2Bytes("bitCount", is, "Not a Valid ICO File", getByteOrder()); // BitCount
                                                                           // (2
                                                                           // bytes),
                                                                           // 1,4,8,16,24,32
                                                                           // (see
                                                                           // iconinfo
                                                                           // for
                                                                           // details)
        int compression = read4Bytes("compression", is, "Not a Valid ICO File", getByteOrder()); // Compression
                                                                                 // (4
                                                                                 // bytes),
                                                                                 // we
                                                                                 // don?t
                                                                                 // use
                                                                                 // this
                                                                                 // (0)
        final int sizeImage = read4Bytes("sizeImage", is, "Not a Valid ICO File", getByteOrder()); // SizeImage
                                                                             // (4
                                                                             // bytes),
                                                                             // we
                                                                             // don?t
                                                                             // use
                                                                             // this
                                                                             // (0)
        final int xPelsPerMeter = read4Bytes("xPelsPerMeter", is,
                "Not a Valid ICO File", getByteOrder()); // XPelsPerMeter (4 bytes), we don?t
                                         // use this (0)
        final int yPelsPerMeter = read4Bytes("yPelsPerMeter", is,
                "Not a Valid ICO File", getByteOrder()); // YPelsPerMeter (4 bytes), we don?t
                                         // use this (0)
        final int colorsUsed = read4Bytes("colorsUsed", is, "Not a Valid ICO File", getByteOrder()); // ColorsUsed
                                                                               // (4
                                                                               // bytes),
                                                                               // we
                                                                               // don?t
                                                                               // use
                                                                               // this
                                                                               // (0)
        final int colorsImportant = read4Bytes("ColorsImportant", is,
                "Not a Valid ICO File", getByteOrder()); // ColorsImportant (4 bytes), we don?t
                                         // use this (0)
        int redMask = 0;
        int greenMask = 0;
        int blueMask = 0;
        int alphaMask = 0;
        if (compression == 3) {
            redMask = read4Bytes("redMask", is, "Not a Valid ICO File", getByteOrder());
            greenMask = read4Bytes("greenMask", is, "Not a Valid ICO File", getByteOrder());
            blueMask = read4Bytes("blueMask", is, "Not a Valid ICO File", getByteOrder());
        }
        final byte[] restOfFile = readBytes("RestOfFile", is, is.available());

        if (size != 40) {
            throw new ImageReadException("Not a Valid ICO File: Wrong bitmap header size " + size);
        }
        if (planes != 1) {
            throw new ImageReadException("Not a Valid ICO File: Planes can't be " + planes);
        }

        if (compression == 0 && bitCount == 32) {
            // 32 BPP RGB icons need an alpha channel, but BMP files don't have
            // one unless BI_BITFIELDS is used...
            compression = 3;
            redMask = 0x00ff0000;
            greenMask = 0x0000ff00;
            blueMask = 0x000000ff;
            alphaMask = 0xff000000;
        }

        final BitmapHeader header = new BitmapHeader(size, width, height, planes,
                bitCount, compression, sizeImage, xPelsPerMeter, yPelsPerMeter,
                colorsUsed, colorsImportant);

        final int bitmapPixelsOffset = 14 + 56 + 4 * ((colorsUsed == 0 && bitCount <= 8) ? (1 << bitCount)
                : colorsUsed);
        final int bitmapSize = 14 + 56 + restOfFile.length;

        final ByteArrayOutputStream baos = new ByteArrayOutputStream(bitmapSize);
        try (BinaryOutputStream bos = BinaryOutputStream.littleEndian(baos)) {
            bos.write('B');
            bos.write('M');
            bos.write4Bytes(bitmapSize);
            bos.write4Bytes(0);
            bos.write4Bytes(bitmapPixelsOffset);

            bos.write4Bytes(56);
            bos.write4Bytes(width);
            bos.write4Bytes(height / 2);
            bos.write2Bytes(planes);
            bos.write2Bytes(bitCount);
            bos.write4Bytes(compression);
            bos.write4Bytes(sizeImage);
            bos.write4Bytes(xPelsPerMeter);
            bos.write4Bytes(yPelsPerMeter);
            bos.write4Bytes(colorsUsed);
            bos.write4Bytes(colorsImportant);
            bos.write4Bytes(redMask);
            bos.write4Bytes(greenMask);
            bos.write4Bytes(blueMask);
            bos.write4Bytes(alphaMask);
            bos.write(restOfFile);
            bos.flush();
        }

        final ByteArrayInputStream bmpInputStream = new ByteArrayInputStream(baos.toByteArray());
        final BufferedImage bmpImage = new BmpImageParser().getBufferedImage(bmpInputStream, null);

        // Transparency map is optional with 32 BPP icons, because they already
        // have
        // an alpha channel, and Windows only uses the transparency map when it
        // has to
        // display the icon on a < 32 BPP screen. But it's still used instead of
        // alpha
        // if the image would be completely transparent with alpha...
        int t_scanline_size = (width + 7) / 8;
        if ((t_scanline_size % 4) != 0) {
            t_scanline_size += 4 - (t_scanline_size % 4); // pad scanline to 4
                                                          // byte size.
        }
        final int colorMapSizeBytes = t_scanline_size * (height / 2);
        byte[] transparencyMap = null;
        try {
            transparencyMap = readBytes("transparency_map",
                    bmpInputStream, colorMapSizeBytes,
                    "Not a Valid ICO File");
        } catch (final IOException ioEx) {
            if (bitCount != 32) {
                throw ioEx;
            }
        }

        boolean allAlphasZero = true;
        if (bitCount == 32) {
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
                    if (transparencyMap != null) {
                        final int alphaByte = 0xff & transparencyMap[t_scanline_size
                                * (bmpImage.getHeight() - y - 1) + (x / 8)];
                        alpha = 0x01 & (alphaByte >> (7 - (x % 8)));
                        alpha = (alpha == 0) ? 0xff : 0x00;
                    }
                    resultImage.setRGB(x, y, (alpha << 24)
                            | (0xffffff & bmpImage.getRGB(x, y)));
                }
            }
        } else {
            resultImage = bmpImage;
        }
        return new BitmapIconData(fIconInfo, header, resultImage);
    }

    private IconData readIconData(final byte[] iconData, final IconInfo fIconInfo)
            throws ImageReadException, IOException {
        final ImageFormat imageFormat = Imaging.guessFormat(iconData);
        if (imageFormat.equals(ImageFormats.PNG)) {
            final BufferedImage bufferedImage = Imaging.getBufferedImage(iconData);
            return new PNGIconData(fIconInfo, bufferedImage);
        }
        return readBitmapIconData(iconData, fIconInfo);
    }

    private static class ImageContents {
        public final FileHeader fileHeader;
        public final IconData[] iconDatas;

        ImageContents(final FileHeader fileHeader, final IconData[] iconDatas) {
            this.fileHeader = fileHeader;
            this.iconDatas = iconDatas;
        }
    }

    private ImageContents readImage(final ByteSource byteSource)
            throws ImageReadException, IOException {
        try (InputStream is = byteSource.getInputStream()) {
            final FileHeader fileHeader = readFileHeader(is);

            final IconInfo[] fIconInfos = new IconInfo[fileHeader.iconCount];
            for (int i = 0; i < fileHeader.iconCount; i++) {
                fIconInfos[i] = readIconInfo(is);
            }

            final IconData[] fIconDatas = new IconData[fileHeader.iconCount];
            for (int i = 0; i < fileHeader.iconCount; i++) {
                final byte[] iconData = byteSource.getBlock(
                        fIconInfos[i].imageOffset, fIconInfos[i].imageSize);
                fIconDatas[i] = readIconData(iconData, fIconInfos[i]);
            }

            return new ImageContents(fileHeader, fIconDatas);
        }
    }

    @Override
    public boolean dumpImageFile(final PrintWriter pw, final ByteSource byteSource)
            throws ImageReadException, IOException {
        final ImageContents contents = readImage(byteSource);
        contents.fileHeader.dump(pw);
        for (final IconData iconData : contents.iconDatas) {
            iconData.dump(pw);
        }
        return true;
    }

    @Override
    public final BufferedImage getBufferedImage(final ByteSource byteSource,
            final IcoImagingParameters params) throws ImageReadException, IOException {
        final ImageContents contents = readImage(byteSource);
        final FileHeader fileHeader = contents.fileHeader;
        if (fileHeader.iconCount > 0) {
            return contents.iconDatas[0].readBufferedImage();
        }
        throw new ImageReadException("No icons in ICO file");
    }

    @Override
    public List<BufferedImage> getAllBufferedImages(final ByteSource byteSource)
            throws ImageReadException, IOException {
        final ImageContents contents = readImage(byteSource);

        final FileHeader fileHeader = contents.fileHeader;
        final List<BufferedImage> result = new ArrayList<>(fileHeader.iconCount);
        for (int i = 0; i < fileHeader.iconCount; i++) {
            result.add(contents.iconDatas[i].readBufferedImage());
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
    public void writeImage(final BufferedImage src, final OutputStream os, IcoImagingParameters params) throws ImageWriteException, IOException {
        if (params == null) {
            params = new IcoImagingParameters();
        }
        final PixelDensity pixelDensity = params.getPixelDensity();

        final PaletteFactory paletteFactory = new PaletteFactory();
        final SimplePalette palette = paletteFactory.makeExactRgbPaletteSimple(src, 256);
        final int bitCount;
        // If we can't obtain an exact rgb palette, we set the bit count to either 24 or 32
        // so there is a relation between having a palette and the bit count.
        if (palette == null) {
            final boolean hasTransparency = paletteFactory.hasTransparency(src);
            if (hasTransparency) {
                bitCount = 32;
            } else {
                bitCount = 24;
            }
        } else if (palette.length() <= 2) {
            bitCount = 1;
        } else if (palette.length() <= 16) {
            bitCount = 4;
        } else {
            bitCount = 8;
        }

        final BinaryOutputStream bos = BinaryOutputStream.littleEndian(os);

        int scanline_size = (bitCount * src.getWidth() + 7) / 8;
        if ((scanline_size % 4) != 0) {
            scanline_size += 4 - (scanline_size % 4); // pad scanline to 4 byte
                                                      // size.
        }
        int t_scanline_size = (src.getWidth() + 7) / 8;
        if ((t_scanline_size % 4) != 0) {
            t_scanline_size += 4 - (t_scanline_size % 4); // pad scanline to 4
                                                          // byte size.
        }
        final int imageSize = 40 + 4 * (bitCount <= 8 ? (1 << bitCount) : 0)
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
        bos.write4Bytes(pixelDensity == null ? 0 : (int) Math.round(pixelDensity.horizontalDensityMetres())); // x pixels per meter
        bos.write4Bytes(pixelDensity == null ? 0 : (int) Math.round(pixelDensity.horizontalDensityMetres())); // y pixels per meter
        bos.write4Bytes(0); // colors used, 0 = (1 << bitCount) (ignored)
        bos.write4Bytes(0); // colors important

        if (palette != null) {
            for (int i = 0; i < (1 << bitCount); i++) {
                if (i < palette.length()) {
                    final int argb = palette.getEntry(i);
                    bos.write3Bytes(argb);
                    bos.write(0);
                } else {
                    bos.write4Bytes(0);
                }
            }
        }

        int bitCache = 0;
        int bitsInCache = 0;
        final int rowPadding = scanline_size - (bitCount * src.getWidth() + 7) / 8;
        for (int y = src.getHeight() - 1; y >= 0; y--) {
            for (int x = 0; x < src.getWidth(); x++) {
                final int argb = src.getRGB(x, y);
                // Remember there is a relation between having a rgb palette and the bit count, see above comment
                if (palette == null) {
                    if (bitCount == 24) {
                        bos.write3Bytes(argb);
                    } else if (bitCount == 32) {
                        bos.write4Bytes(argb);
                    }
                } else {
                    if (bitCount < 8) {
                        final int rgb = 0xffffff & argb;
                        final int index = palette.getPaletteIndex(rgb);
                        bitCache <<= bitCount;
                        bitCache |= index;
                        bitsInCache += bitCount;
                        if (bitsInCache >= 8) {
                            bos.write(0xff & bitCache);
                            bitCache = 0;
                            bitsInCache = 0;
                        }
                    } else if (bitCount == 8) {
                        final int rgb = 0xffffff & argb;
                        final int index = palette.getPaletteIndex(rgb);
                        bos.write(0xff & index);
                    }
                }
            }

            if (bitsInCache > 0) {
                bitCache <<= (8 - bitsInCache);
                bos.write(0xff & bitCache);
                bitCache = 0;
                bitsInCache = 0;
            }

            for (int x = 0; x < rowPadding; x++) {
                bos.write(0);
            }
        }

        final int t_row_padding = t_scanline_size - (src.getWidth() + 7) / 8;
        for (int y = src.getHeight() - 1; y >= 0; y--) {
            for (int x = 0; x < src.getWidth(); x++) {
                final int argb = src.getRGB(x, y);
                final int alpha = 0xff & (argb >> 24);
                bitCache <<= 1;
                if (alpha == 0) {
                    bitCache |= 1;
                }
                bitsInCache++;
                if (bitsInCache >= 8) {
                    bos.write(0xff & bitCache);
                    bitCache = 0;
                    bitsInCache = 0;
                }
            }

            if (bitsInCache > 0) {
                bitCache <<= (8 - bitsInCache);
                bos.write(0xff & bitCache);
                bitCache = 0;
                bitsInCache = 0;
            }

            for (int x = 0; x < t_row_padding; x++) {
                bos.write(0);
            }
        }
        bos.close();
    }
}
