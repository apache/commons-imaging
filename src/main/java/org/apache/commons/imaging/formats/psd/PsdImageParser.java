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
package org.apache.commons.imaging.formats.psd;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.ByteOrder;
import org.apache.commons.imaging.common.IImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.formats.psd.dataparsers.DataParser;
import org.apache.commons.imaging.formats.psd.dataparsers.DataParserBitmap;
import org.apache.commons.imaging.formats.psd.dataparsers.DataParserCmyk;
import org.apache.commons.imaging.formats.psd.dataparsers.DataParserGrayscale;
import org.apache.commons.imaging.formats.psd.dataparsers.DataParserIndexed;
import org.apache.commons.imaging.formats.psd.dataparsers.DataParserLab;
import org.apache.commons.imaging.formats.psd.dataparsers.DataParserRgb;
import org.apache.commons.imaging.formats.psd.datareaders.CompressedDataReader;
import org.apache.commons.imaging.formats.psd.datareaders.DataReader;
import org.apache.commons.imaging.formats.psd.datareaders.UncompressedDataReader;
import org.apache.commons.imaging.util.Debug;

public class PsdImageParser extends ImageParser {

    public PsdImageParser() {
        super.setByteOrder(ByteOrder.MOTOROLA);
        // setDebug(true);
    }

    @Override
    public String getName() {
        return "PSD-Custom";
    }

    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    private static final String DEFAULT_EXTENSION = ".psd";

    private static final String ACCEPTED_EXTENSIONS[] = { DEFAULT_EXTENSION, };

    @Override
    protected String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS;
    }

    @Override
    protected ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[] { ImageFormat.IMAGE_FORMAT_PSD, //
        };
    }

    private PsdHeaderInfo readHeader(final ByteSource byteSource)
            throws ImageReadException, IOException {
        InputStream is = null;

        try {
            is = byteSource.getInputStream();

            return readHeader(is);
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (final Exception e) {
                Debug.debug(e);
            }

        }
    }

    private PsdHeaderInfo readHeader(final InputStream is) throws ImageReadException,
            IOException {
        readAndVerifyBytes(is, new byte[] { 56, 66, 80, 83 },
                "Not a Valid PSD File");

        final int Version = read2Bytes("Version", is, "Not a Valid PSD File");

        final byte Reserved[] = readBytes("Reserved", is, 6,
                "Not a Valid PSD File");

        final int Channels = read2Bytes("Channels", is, "Not a Valid PSD File");
        final int Rows = read4Bytes("Rows", is, "Not a Valid PSD File");
        final int Columns = read4Bytes("Columns", is, "Not a Valid PSD File");
        final int Depth = read2Bytes("Depth", is, "Not a Valid PSD File");
        final int Mode = read2Bytes("Mode", is, "Not a Valid PSD File");

        final PsdHeaderInfo result = new PsdHeaderInfo(Version, Reserved, Channels,
                Rows, Columns, Depth, Mode);

        return result;
    }

    private ImageContents readImageContents(final InputStream is)
            throws ImageReadException, IOException {
        final PsdHeaderInfo header = readHeader(is);

        final int ColorModeDataLength = read4Bytes("ColorModeDataLength", is,
                "Not a Valid PSD File");
        skipBytes(is, ColorModeDataLength);
        // is.skip(ColorModeDataLength);
        // byte ColorModeData[] = readByteArray("ColorModeData",
        // ColorModeDataLength, is, "Not a Valid PSD File");

        final int ImageResourcesLength = read4Bytes("ImageResourcesLength", is,
                "Not a Valid PSD File");
        skipBytes(is, ImageResourcesLength);
        // long skipped = is.skip(ImageResourcesLength);
        // byte ImageResources[] = readByteArray("ImageResources",
        // ImageResourcesLength, is, "Not a Valid PSD File");

        final int LayerAndMaskDataLength = read4Bytes("LayerAndMaskDataLength", is,
                "Not a Valid PSD File");
        skipBytes(is, LayerAndMaskDataLength);
        // is.skip(LayerAndMaskDataLength);
        // byte LayerAndMaskData[] = readByteArray("LayerAndMaskData",
        // LayerAndMaskDataLength, is, "Not a Valid PSD File");

        final int Compression = read2Bytes("Compression", is, "Not a Valid PSD File");

        // skip_bytes(is, LayerAndMaskDataLength);
        // byte ImageData[] = readByteArray("ImageData", LayerAndMaskDataLength,
        // is, "Not a Valid PSD File");

        // System.out.println("Compression: " + Compression);

        final ImageContents result = new ImageContents(header, ColorModeDataLength,
        // ColorModeData,
                ImageResourcesLength,
                // ImageResources,
                LayerAndMaskDataLength,
                // LayerAndMaskData,
                Compression);

        return result;
    }

    private List<ImageResourceBlock> readImageResourceBlocks(final byte bytes[],
            final int imageResourceIDs[], final int maxBlocksToRead)
            throws ImageReadException, IOException {
        return readImageResourceBlocks(new ByteArrayInputStream(bytes),
                imageResourceIDs, maxBlocksToRead, bytes.length);
    }

    private boolean keepImageResourceBlock(final int ID, final int imageResourceIDs[]) {
        if (imageResourceIDs == null) {
            return true;
        }

        for (final int imageResourceID : imageResourceIDs) {
            if (ID == imageResourceID) {
                return true;
            }
        }

        return false;
    }

    private List<ImageResourceBlock> readImageResourceBlocks(final InputStream is,
            final int imageResourceIDs[], final int maxBlocksToRead, int available)
            throws ImageReadException, IOException {
        final List<ImageResourceBlock> result = new ArrayList<ImageResourceBlock>();

        while (available > 0) {
            readAndVerifyBytes(is, new byte[] { 56, 66, 73, 77 },
                    "Not a Valid PSD File");
            available -= 4;

            final int id = read2Bytes("ID", is, "Not a Valid PSD File");
            available -= 2;

            final int nameLength = readByte("NameLength", is, "Not a Valid PSD File");

            available -= 1;
            final byte nameBytes[] = readBytes("NameData", is, nameLength,
                    "Not a Valid PSD File");
            available -= nameLength;
            if (((nameLength + 1) % 2) != 0) {
                //final int NameDiscard = 
                readByte("NameDiscard", is,
                        "Not a Valid PSD File");
                available -= 1;
            }
            // String Name = readPString("Name", 6, is, "Not a Valid PSD File");
            final int DataSize = read4Bytes("Size", is, "Not a Valid PSD File");
            available -= 4;
            // int ActualDataSize = ((DataSize % 2) == 0)
            // ? DataSize
            // : DataSize + 1; // pad to make even

            final byte Data[] = readBytes("Data", is, DataSize,
                    "Not a Valid PSD File");
            available -= DataSize;

            if ((DataSize % 2) != 0) {
                //final int DataDiscard =
                readByte("DataDiscard", is,
                        "Not a Valid PSD File");
                available -= 1;
            }

            if (keepImageResourceBlock(id, imageResourceIDs)) {
                result.add(new ImageResourceBlock(id, nameBytes, Data));

                if ((maxBlocksToRead >= 0)
                        && (result.size() >= maxBlocksToRead)) {
                    return result;
                }
            }
            // debugNumber("ID", ID, 2);

        }

        return result;
    }

    private List<ImageResourceBlock> readImageResourceBlocks(
            final ByteSource byteSource, final int imageResourceIDs[], final int maxBlocksToRead)
            throws ImageReadException, IOException {
        InputStream is = null;

        try {
            is = byteSource.getInputStream();

            final ImageContents imageContents = readImageContents(is);

            is.close();

            is = this.getInputStream(byteSource, PSD_SECTION_IMAGE_RESOURCES);
            final byte ImageResources[] = readBytes("ImageResources",
                    is, imageContents.ImageResourcesLength,
                    "Not a Valid PSD File");

            return readImageResourceBlocks(ImageResources, imageResourceIDs,
                    maxBlocksToRead);
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (final Exception e) {
                Debug.debug(e);
            }

        }
    }

    private static final int PSD_SECTION_HEADER = 0;
    private static final int PSD_SECTION_COLOR_MODE = 1;
    private static final int PSD_SECTION_IMAGE_RESOURCES = 2;
    private static final int PSD_SECTION_LAYER_AND_MASK_DATA = 3;
    private static final int PSD_SECTION_IMAGE_DATA = 4;

    private static final int PSD_HEADER_LENGTH = 26;

    private InputStream getInputStream(final ByteSource byteSource, final int section)
            throws ImageReadException, IOException {
        InputStream is = null;
        boolean notFound = false;
        try {
            is = byteSource.getInputStream();

            if (section == PSD_SECTION_HEADER) {
                return is;
            }

            skipBytes(is, PSD_HEADER_LENGTH);
            // is.skip(kHeaderLength);

            final int ColorModeDataLength = read4Bytes("ColorModeDataLength", is,
                    "Not a Valid PSD File");

            if (section == PSD_SECTION_COLOR_MODE) {
                return is;
            }

            skipBytes(is, ColorModeDataLength);
            // byte ColorModeData[] = readByteArray("ColorModeData",
            // ColorModeDataLength, is, "Not a Valid PSD File");

            final int ImageResourcesLength = read4Bytes("ImageResourcesLength", is,
                    "Not a Valid PSD File");

            if (section == PSD_SECTION_IMAGE_RESOURCES) {
                return is;
            }

            skipBytes(is, ImageResourcesLength);
            // byte ImageResources[] = readByteArray("ImageResources",
            // ImageResourcesLength, is, "Not a Valid PSD File");

            final int LayerAndMaskDataLength = read4Bytes("LayerAndMaskDataLength",
                    is, "Not a Valid PSD File");

            if (section == PSD_SECTION_LAYER_AND_MASK_DATA) {
                return is;
            }

            skipBytes(is, LayerAndMaskDataLength);
            // byte LayerAndMaskData[] = readByteArray("LayerAndMaskData",
            // LayerAndMaskDataLength, is, "Not a Valid PSD File");

            read2Bytes("Compression", is, "Not a Valid PSD File");

            // byte ImageData[] = readByteArray("ImageData",
            // LayerAndMaskDataLength, is, "Not a Valid PSD File");

            if (section == PSD_SECTION_IMAGE_DATA) {
                return is;
            }
            notFound = true;
        } finally {
            if (notFound && is != null) {
                try {
                    is.close();
                } catch (final IOException ignore) {
                }
            }
        }
        throw new ImageReadException("getInputStream: Unknown Section: "
                + section);
    }

    private byte[] getData(final ByteSource byteSource, final int section)
            throws ImageReadException, IOException {
        InputStream is = null;

        try {
            is = byteSource.getInputStream();

            // PsdHeaderInfo header = readHeader(is);
            if (section == PSD_SECTION_HEADER) {
                return readBytes("Header", is, PSD_HEADER_LENGTH,
                        "Not a Valid PSD File");
            }
            skipBytes(is, PSD_HEADER_LENGTH);

            final int ColorModeDataLength = read4Bytes("ColorModeDataLength", is,
                    "Not a Valid PSD File");

            if (section == PSD_SECTION_COLOR_MODE) {
                return readBytes("ColorModeData", is, ColorModeDataLength,
                        "Not a Valid PSD File");
            }

            skipBytes(is, ColorModeDataLength);
            // byte ColorModeData[] = readByteArray("ColorModeData",
            // ColorModeDataLength, is, "Not a Valid PSD File");

            final int ImageResourcesLength = read4Bytes("ImageResourcesLength", is,
                    "Not a Valid PSD File");

            if (section == PSD_SECTION_IMAGE_RESOURCES) {
                return readBytes("ImageResources", is,
                        ImageResourcesLength, "Not a Valid PSD File");
            }

            skipBytes(is, ImageResourcesLength);
            // byte ImageResources[] = readByteArray("ImageResources",
            // ImageResourcesLength, is, "Not a Valid PSD File");

            final int LayerAndMaskDataLength = read4Bytes("LayerAndMaskDataLength",
                    is, "Not a Valid PSD File");

            if (section == PSD_SECTION_LAYER_AND_MASK_DATA) {
                return readBytes("LayerAndMaskData",
                        is, LayerAndMaskDataLength, "Not a Valid PSD File");
            }

            skipBytes(is, LayerAndMaskDataLength);
            // byte LayerAndMaskData[] = readByteArray("LayerAndMaskData",
            // LayerAndMaskDataLength, is, "Not a Valid PSD File");

            read2Bytes("Compression", is, "Not a Valid PSD File");

            // byte ImageData[] = readByteArray("ImageData",
            // LayerAndMaskDataLength, is, "Not a Valid PSD File");

            // if (section == kPSD_SECTION_IMAGE_DATA)
            // return readByteArray("LayerAndMaskData", LayerAndMaskDataLength,
            // is,
            // "Not a Valid PSD File");

        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (final Exception e) {
                Debug.debug(e);
            }

        }
        throw new ImageReadException("getInputStream: Unknown Section: "
                + section);
    }

    private ImageContents readImageContents(final ByteSource byteSource)
            throws ImageReadException, IOException {
        InputStream is = null;

        try {
            is = byteSource.getInputStream();

            final ImageContents imageContents = readImageContents(is);
            return imageContents;
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (final Exception e) {
                Debug.debug(e);
            }

        }

    }

    public final static int IMAGE_RESOURCE_ID_ICC_PROFILE = 0x040F;

    @Override
    public byte[] getICCProfileBytes(final ByteSource byteSource, final Map<String,Object> params)
            throws ImageReadException, IOException {
        final List<ImageResourceBlock> blocks = readImageResourceBlocks(byteSource,
                new int[] { IMAGE_RESOURCE_ID_ICC_PROFILE, }, 1);

        if ((blocks == null) || (blocks.size() < 1)) {
            return null;
        }

        final ImageResourceBlock irb = blocks.get(0);
        final byte bytes[] = irb.data;
        if ((bytes == null) || (bytes.length < 1)) {
            return null;
        }
        return bytes;
    }

    @Override
    public Dimension getImageSize(final ByteSource byteSource, final Map<String,Object> params)
            throws ImageReadException, IOException {
        final PsdHeaderInfo bhi = readHeader(byteSource);
        if (bhi == null) {
            throw new ImageReadException("PSD: couldn't read header");
        }

        return new Dimension(bhi.Columns, bhi.Rows);

    }

    public byte[] embedICCProfile(final byte image[], final byte profile[]) {
        return null;
    }

    @Override
    public boolean embedICCProfile(final File src, final File dst, final byte profile[]) {
        return false;
    }

    @Override
    public IImageMetadata getMetadata(final ByteSource byteSource, final Map<String,Object> params)
            throws ImageReadException, IOException {
        return null;
    }

    private int getChannelsPerMode(final int mode) {
        switch (mode) {
        case 0: // Bitmap
            return 1;
        case 1: // Grayscale
            return 1;
        case 2: // Indexed
            return -1;
        case 3: // RGB
            return 3;
        case 4: // CMYK
            return 4;
        case 7: // Multichannel
            return -1;
        case 8: // Duotone
            return -1;
        case 9: // Lab
            return 4;
        default:
            return -1;

        }
    }

    @Override
    public ImageInfo getImageInfo(final ByteSource byteSource, final Map<String,Object> params)
            throws ImageReadException, IOException {
        final ImageContents imageContents = readImageContents(byteSource);
        // ImageContents imageContents = readImage(byteSource, false);

        if (imageContents == null) {
            throw new ImageReadException("PSD: Couldn't read blocks");
        }

        final PsdHeaderInfo header = imageContents.header;
        if (header == null) {
            throw new ImageReadException("PSD: Couldn't read Header");
        }

        final int Width = header.Columns;
        final int Height = header.Rows;

        final List<String> Comments = new ArrayList<String>();
        // TODO: comments...

        int BitsPerPixel = header.Depth * getChannelsPerMode(header.Mode);
        // System.out.println("header.Depth: " + header.Depth);
        // System.out.println("header.Mode: " + header.Mode);
        // System.out.println("getChannelsPerMode(header.Mode): " +
        // getChannelsPerMode(header.Mode));
        if (BitsPerPixel < 0) {
            BitsPerPixel = 0;
        }
        final ImageFormat Format = ImageFormat.IMAGE_FORMAT_PSD;
        final String FormatName = "Photoshop";
        final String MimeType = "image/x-photoshop";
        // we ought to count images, but don't yet.
        final int NumberOfImages = -1;
        // not accurate ... only reflects first
        final boolean isProgressive = false;

        final int PhysicalWidthDpi = 72;
        final float PhysicalWidthInch = (float) ((double) Width / (double) PhysicalWidthDpi);
        final int PhysicalHeightDpi = 72;
        final float PhysicalHeightInch = (float) ((double) Height / (double) PhysicalHeightDpi);

        final String FormatDetails = "Psd";

        final boolean isTransparent = false; // TODO: inaccurate.
        final boolean usesPalette = header.Mode == COLOR_MODE_INDEXED;
        final int ColorType = ImageInfo.COLOR_TYPE_UNKNOWN;

        String compressionAlgorithm;
        switch (imageContents.Compression) {
        case 0:
            compressionAlgorithm = ImageInfo.COMPRESSION_ALGORITHM_NONE;
            break;
        case 1:
            compressionAlgorithm = ImageInfo.COMPRESSION_ALGORITHM_PSD;
            break;
        default:
            compressionAlgorithm = ImageInfo.COMPRESSION_ALGORITHM_UNKNOWN;
        }

        final ImageInfo result = new ImageInfo(FormatDetails, BitsPerPixel, Comments,
                Format, FormatName, Height, MimeType, NumberOfImages,
                PhysicalHeightDpi, PhysicalHeightInch, PhysicalWidthDpi,
                PhysicalWidthInch, Width, isProgressive, isTransparent,
                usesPalette, ColorType, compressionAlgorithm);

        return result;
    }

//    // TODO not used
//    private ImageResourceBlock findImageResourceBlock(
//            final List<ImageResourceBlock> blocks, final int ID) {
//        for (int i = 0; i < blocks.size(); i++) {
//            final ImageResourceBlock block = blocks.get(i);
//
//            if (block.id == ID) {
//                return block;
//            }
//        }
//        return null;
//    }

    @Override
    public boolean dumpImageFile(final PrintWriter pw, final ByteSource byteSource)
            throws ImageReadException, IOException {
        pw.println("gif.dumpImageFile");

        final ImageInfo fImageData = getImageInfo(byteSource);
        if (fImageData == null) {
            return false;
        }

        fImageData.toString(pw, "");
        final ImageContents imageContents = readImageContents(byteSource);

        imageContents.dump(pw);
        imageContents.header.dump(pw);

        final List<ImageResourceBlock> blocks = readImageResourceBlocks(
                byteSource,
                // fImageContents.ImageResources,
                null, -1);

        pw.println("blocks.size(): " + blocks.size());

        // System.out.println("gif.blocks: " + blocks.blocks.size());
        for (int i = 0; i < blocks.size(); i++) {
            final ImageResourceBlock block = blocks.get(i);
            pw.println("\t" + i + " (" + Integer.toHexString(block.id)
                    + ", " + "'"
                    + new String(block.nameData, "ISO-8859-1")
                    + "' ("
                    + block.nameData.length
                    + "), "
                    // + block.getClass().getName()
                    // + ", "
                    + " data: " + block.data.length + " type: '"
                    + new PsdConstants().getDescription(block.id) + "' "
                    + ")");

        }

        pw.println("");

        return true;
    }

    private static final int COLOR_MODE_INDEXED = 2;

    @Override
    public BufferedImage getBufferedImage(final ByteSource byteSource, final Map<String,Object> params)
            throws ImageReadException, IOException {
        final ImageContents imageContents = readImageContents(byteSource);
        // ImageContents imageContents = readImage(byteSource, false);

        if (imageContents == null) {
            throw new ImageReadException("PSD: Couldn't read blocks");
        }

        final PsdHeaderInfo header = imageContents.header;
        if (header == null) {
            throw new ImageReadException("PSD: Couldn't read Header");
        }

        // ImageDescriptor id = (ImageDescriptor)
        // findBlock(fImageContents.blocks,
        // kImageSeperator);
        // if (id == null)
        // throw new ImageReadException("PSD: Couldn't read Image Descriptor");
        // GraphicControlExtension gce = (GraphicControlExtension) findBlock(
        // fImageContents.blocks, kGraphicControlExtension);

        readImageResourceBlocks(byteSource,
        // fImageContents.ImageResources,
                null, -1);

        final int width = header.Columns;
        final int height = header.Rows;
        // int height = header.Columns;

        // int transfer_type;

        // transfer_type = DataBuffer.TYPE_BYTE;

        final boolean hasAlpha = false;
        final BufferedImage result = getBufferedImageFactory(params)
                .getColorBufferedImage(width, height, hasAlpha);

        DataParser dataParser;
        switch (imageContents.header.Mode) {
        case 0: // bitmap
            dataParser = new DataParserBitmap();
            break;
        case 1:
        case 8: // Duotone=8;
            dataParser = new DataParserGrayscale();
            break;
        case 3:
            dataParser = new DataParserRgb();
            break;
        case 4:
            dataParser = new DataParserCmyk();
            break;
        case 9:
            dataParser = new DataParserLab();
            break;
        case COLOR_MODE_INDEXED:
        // case 2 : // Indexed=2;
        {

            final byte ColorModeData[] = getData(byteSource, PSD_SECTION_COLOR_MODE);

            // ImageResourceBlock block = findImageResourceBlock(blocks,
            // 0x03EB);
            // if (block == null)
            // throw new ImageReadException(
            // "Missing: Indexed Color Image Resource Block");

            dataParser = new DataParserIndexed(ColorModeData);
            break;
        }
        case 7: // Multichannel=7;
            // fDataParser = new DataParserStub();
            // break;

            // case 1 :
            // fDataReader = new CompressedDataReader();
            // break;
        default:
            throw new ImageReadException("Unknown Mode: "
                    + imageContents.header.Mode);
        }
        DataReader fDataReader;
        switch (imageContents.Compression) {
        case 0:
            fDataReader = new UncompressedDataReader(dataParser);
            break;
        case 1:
            fDataReader = new CompressedDataReader(dataParser);
            break;
        default:
            throw new ImageReadException("Unknown Compression: "
                    + imageContents.Compression);
        }
        
        InputStream is = null;

        try {
            is = getInputStream(byteSource, PSD_SECTION_IMAGE_DATA);
            fDataReader.readData(is, result, imageContents, this);

            fDataReader.dump();
            // is.
            // ImageContents imageContents = readImageContents(is);
            // return imageContents;
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (final Exception e) {
                Debug.debug(e);
            }

        }

        return result;

    }

    public final static int IMAGE_RESOURCE_ID_XMP = 0x0424;

    public final static String BLOCK_NAME_XMP = "XMP";

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
    public String getXmpXml(final ByteSource byteSource, final Map<String,Object> params)
            throws ImageReadException, IOException {

        final ImageContents imageContents = readImageContents(byteSource);

        if (imageContents == null) {
            throw new ImageReadException("PSD: Couldn't read blocks");
        }

        final PsdHeaderInfo header = imageContents.header;
        if (header == null) {
            throw new ImageReadException("PSD: Couldn't read Header");
        }

        final List<ImageResourceBlock> blocks = readImageResourceBlocks(byteSource,
                new int[] { IMAGE_RESOURCE_ID_XMP, }, -1);

        if ((blocks == null) || (blocks.size() < 1)) {
            return null;
        }

        final List<ImageResourceBlock> xmpBlocks = new ArrayList<ImageResourceBlock>();
//        if (false) {
//            // TODO: for PSD 7 and later, verify "XMP" name.
//            for (int i = 0; i < blocks.size(); i++) {
//                final ImageResourceBlock block = blocks.get(i);
//                if (!block.getName().equals(BLOCK_NAME_XMP)) {
//                    continue;
//                }
//                xmpBlocks.add(block);
//            }
//        } else {
            xmpBlocks.addAll(blocks);
//        }

        if (xmpBlocks.size() < 1) {
            return null;
        }
        if (xmpBlocks.size() > 1) {
            throw new ImageReadException(
                    "PSD contains more than one XMP block.");
        }

        final ImageResourceBlock block = xmpBlocks.get(0);

        try {
            // segment data is UTF-8 encoded xml.
            final String xml = new String(block.data, 0, block.data.length, "utf-8");
            return xml;
        } catch (final UnsupportedEncodingException e) {
            throw new ImageReadException("Invalid JPEG XMP Segment.");
        }
    }

}
