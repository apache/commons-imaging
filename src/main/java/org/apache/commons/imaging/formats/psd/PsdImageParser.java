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
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.imaging.AbstractImageParser;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.XmpEmbeddable;
import org.apache.commons.imaging.common.XmpImagingParameters;
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

public class PsdImageParser extends AbstractImageParser<PsdImagingParameters> implements XmpEmbeddable {

    private static final String DEFAULT_EXTENSION = ImageFormats.PSD.getDefaultExtension();
    private static final String[] ACCEPTED_EXTENSIONS = ImageFormats.PSD.getExtensions();
    private static final int PSD_SECTION_HEADER = 0;
    private static final int PSD_SECTION_COLOR_MODE = 1;
    private static final int PSD_SECTION_IMAGE_RESOURCES = 2;
    private static final int PSD_SECTION_LAYER_AND_MASK_DATA = 3;
    private static final int PSD_SECTION_IMAGE_DATA = 4;
    private static final int PSD_HEADER_LENGTH = 26;
    private static final int COLOR_MODE_INDEXED = 2;
    public static final int IMAGE_RESOURCE_ID_ICC_PROFILE = 0x040F;
    public static final int IMAGE_RESOURCE_ID_XMP = 0x0424;
    public static final String BLOCK_NAME_XMP = "XMP";

    @Override
    public boolean dumpImageFile(final PrintWriter pw, final ByteSource byteSource) throws ImagingException, IOException {
        pw.println("gif.dumpImageFile");

        final ImageInfo fImageData = getImageInfo(byteSource);
        if (fImageData == null) {
            return false;
        }

        fImageData.toString(pw, "");
        final PsdImageContents imageContents = readImageContents(byteSource);

        imageContents.dump(pw);
        imageContents.header.dump(pw);

        final List<ImageResourceBlock> blocks = readImageResourceBlocks(byteSource,
                // fImageContents.ImageResources,
                null, -1);

        pw.println("blocks.size(): " + blocks.size());

        // System.out.println("gif.blocks: " + blocks.blocks.size());
        for (int i = 0; i < blocks.size(); i++) {
            final ImageResourceBlock block = blocks.get(i);
            pw.println("\t" + i + " (" + Integer.toHexString(block.id) + ", " + "'" + new String(block.nameData, StandardCharsets.ISO_8859_1) + "' ("
                    + block.nameData.length + "), "
                    // + block.getClass().getName()
                    // + ", "
                    + " data: " + block.data.length + " type: '" + ImageResourceType.getDescription(block.id) + "' " + ")");
        }

        pw.println("");

        return true;
    }

    @Override
    protected String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS.clone();
    }

    @Override
    protected ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[] { ImageFormats.PSD, //
        };
    }

    @Override
    public BufferedImage getBufferedImage(final ByteSource byteSource, final PsdImagingParameters params) throws ImagingException, IOException {
        final PsdImageContents imageContents = readImageContents(byteSource);
        // ImageContents imageContents = readImage(byteSource, false);

        final PsdHeaderInfo header = imageContents.header;
        if (header == null) {
            throw new ImagingException("PSD: Couldn't read Header");
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

        final int width = header.columns;
        final int height = header.rows;
        // int height = header.Columns;

        // int transfer_type;

        // transfer_type = DataBuffer.TYPE_BYTE;

        final boolean hasAlpha = false;
        final BufferedImage result = getBufferedImageFactory(params).getColorBufferedImage(width, height, hasAlpha);

        final DataParser dataParser;
        switch (imageContents.header.mode) {
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
        case COLOR_MODE_INDEXED: {
            // case 2 : // Indexed=2;
            final byte[] ColorModeData = getData(byteSource, PSD_SECTION_COLOR_MODE);

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
            throw new ImagingException("Unknown Mode: " + imageContents.header.mode);
        }
        final DataReader fDataReader;
        switch (imageContents.compression) {
        case 0:
            fDataReader = new UncompressedDataReader(dataParser);
            break;
        case 1:
            fDataReader = new CompressedDataReader(dataParser);
            break;
        default:
            throw new ImagingException("Unknown Compression: " + imageContents.compression);
        }

        try (InputStream is = getInputStream(byteSource, PSD_SECTION_IMAGE_DATA)) {
            fDataReader.readData(is, result, imageContents, this);

            // is.
            // ImageContents imageContents = readImageContents(is);
            // return imageContents;
        }

        return result;

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

    private byte[] getData(final ByteSource byteSource, final int section) throws ImagingException, IOException {
        try (InputStream is = byteSource.getInputStream()) {
            // PsdHeaderInfo header = readHeader(is);
            if (section == PSD_SECTION_HEADER) {
                return BinaryFunctions.readBytes("Header", is, PSD_HEADER_LENGTH, "Not a Valid PSD File");
            }
            BinaryFunctions.skipBytes(is, PSD_HEADER_LENGTH);

            final int colorModeDataLength = BinaryFunctions.read4Bytes("ColorModeDataLength", is, "Not a Valid PSD File", getByteOrder());

            if (section == PSD_SECTION_COLOR_MODE) {
                return BinaryFunctions.readBytes("ColorModeData", is, colorModeDataLength, "Not a Valid PSD File");
            }

            BinaryFunctions.skipBytes(is, colorModeDataLength);
            // byte[] ColorModeData = readByteArray("ColorModeData",
            // ColorModeDataLength, is, "Not a Valid PSD File");

            final int imageResourcesLength = BinaryFunctions.read4Bytes("ImageResourcesLength", is, "Not a Valid PSD File", getByteOrder());

            if (section == PSD_SECTION_IMAGE_RESOURCES) {
                return BinaryFunctions.readBytes("ImageResources", is, imageResourcesLength, "Not a Valid PSD File");
            }

            BinaryFunctions.skipBytes(is, imageResourcesLength);
            // byte[] ImageResources = readByteArray("ImageResources",
            // ImageResourcesLength, is, "Not a Valid PSD File");

            final int layerAndMaskDataLength = BinaryFunctions.read4Bytes("LayerAndMaskDataLength", is, "Not a Valid PSD File", getByteOrder());

            if (section == PSD_SECTION_LAYER_AND_MASK_DATA) {
                return BinaryFunctions.readBytes("LayerAndMaskData", is, layerAndMaskDataLength, "Not a Valid PSD File");
            }

            BinaryFunctions.skipBytes(is, layerAndMaskDataLength);
            // byte[] LayerAndMaskData = readByteArray("LayerAndMaskData",
            // LayerAndMaskDataLength, is, "Not a Valid PSD File");

            BinaryFunctions.read2Bytes("Compression", is, "Not a Valid PSD File", getByteOrder());

            // byte[] ImageData = readByteArray("ImageData",
            // LayerAndMaskDataLength, is, "Not a Valid PSD File");

            // if (section == kPSD_SECTION_IMAGE_DATA)
            // return readByteArray("LayerAndMaskData", LayerAndMaskDataLength,
            // is,
            // "Not a Valid PSD File");
        }
        throw new ImagingException("getInputStream: Unknown Section: " + section);
    }

    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Override
    public PsdImagingParameters getDefaultParameters() {
        return new PsdImagingParameters();
    }

    @Override
    public byte[] getIccProfileBytes(final ByteSource byteSource, final PsdImagingParameters params) throws ImagingException, IOException {
        final List<ImageResourceBlock> blocks = readImageResourceBlocks(byteSource, new int[] { IMAGE_RESOURCE_ID_ICC_PROFILE, }, 1);

        if (blocks.isEmpty()) {
            return null;
        }

        final ImageResourceBlock irb = blocks.get(0);
        final byte[] bytes = irb.data;
        if (bytes == null || bytes.length < 1) {
            return null;
        }
        return bytes.clone();
    }

    @Override
    public ImageInfo getImageInfo(final ByteSource byteSource, final PsdImagingParameters params) throws ImagingException, IOException {
        final PsdImageContents imageContents = readImageContents(byteSource);
        // ImageContents imageContents = readImage(byteSource, false);

        final PsdHeaderInfo header = imageContents.header;
        if (header == null) {
            throw new ImagingException("PSD: Couldn't read Header");
        }

        final int width = header.columns;
        final int height = header.rows;

        final List<String> comments = new ArrayList<>();
        // TODO: comments...

        int bitsPerPixel = header.depth * getChannelsPerMode(header.mode);
        // System.out.println("header.Depth: " + header.Depth);
        // System.out.println("header.Mode: " + header.Mode);
        // System.out.println("getChannelsPerMode(header.Mode): " +
        // getChannelsPerMode(header.Mode));
        if (bitsPerPixel < 0) {
            bitsPerPixel = 0;
        }
        final ImageFormat format = ImageFormats.PSD;
        final String formatName = "Photoshop";
        final String mimeType = "image/x-photoshop";
        // we ought to count images, but don't yet.
        final int numberOfImages = -1;
        // not accurate ... only reflects first
        final boolean progressive = false;

        final int physicalWidthDpi = 72;
        final float physicalWidthInch = (float) ((double) width / (double) physicalWidthDpi);
        final int physicalHeightDpi = 72;
        final float physicalHeightInch = (float) ((double) height / (double) physicalHeightDpi);

        final String formatDetails = "Psd";

        final boolean transparent = false; // TODO: inaccurate.
        final boolean usesPalette = header.mode == COLOR_MODE_INDEXED;
        final ImageInfo.ColorType colorType = ImageInfo.ColorType.UNKNOWN;

        final ImageInfo.CompressionAlgorithm compressionAlgorithm;
        switch (imageContents.compression) {
        case 0:
            compressionAlgorithm = ImageInfo.CompressionAlgorithm.NONE;
            break;
        case 1:
            compressionAlgorithm = ImageInfo.CompressionAlgorithm.PSD;
            break;
        default:
            compressionAlgorithm = ImageInfo.CompressionAlgorithm.UNKNOWN;
        }

        return new ImageInfo(formatDetails, bitsPerPixel, comments, format, formatName, height, mimeType, numberOfImages, physicalHeightDpi, physicalHeightInch,
                physicalWidthDpi, physicalWidthInch, width, progressive, transparent, usesPalette, colorType, compressionAlgorithm);
    }

    @Override
    public Dimension getImageSize(final ByteSource byteSource, final PsdImagingParameters params) throws ImagingException, IOException {
        final PsdHeaderInfo bhi = readHeader(byteSource);

        return new Dimension(bhi.columns, bhi.rows);

    }

    private InputStream getInputStream(final ByteSource byteSource, final int section) throws ImagingException, IOException {
        InputStream is = null;
        boolean notFound = false;
        try {
            is = byteSource.getInputStream();

            if (section == PSD_SECTION_HEADER) {
                return is;
            }

            BinaryFunctions.skipBytes(is, PSD_HEADER_LENGTH);
            // is.skip(kHeaderLength);

            final int colorModeDataLength = BinaryFunctions.read4Bytes("ColorModeDataLength", is, "Not a Valid PSD File", getByteOrder());

            if (section == PSD_SECTION_COLOR_MODE) {
                return is;
            }

            BinaryFunctions.skipBytes(is, colorModeDataLength);
            // byte[] ColorModeData = readByteArray("ColorModeData",
            // ColorModeDataLength, is, "Not a Valid PSD File");

            final int imageResourcesLength = BinaryFunctions.read4Bytes("ImageResourcesLength", is, "Not a Valid PSD File", getByteOrder());

            if (section == PSD_SECTION_IMAGE_RESOURCES) {
                return is;
            }

            BinaryFunctions.skipBytes(is, imageResourcesLength);
            // byte[] ImageResources = readByteArray("ImageResources",
            // ImageResourcesLength, is, "Not a Valid PSD File");

            final int layerAndMaskDataLength = BinaryFunctions.read4Bytes("LayerAndMaskDataLength", is, "Not a Valid PSD File", getByteOrder());

            if (section == PSD_SECTION_LAYER_AND_MASK_DATA) {
                return is;
            }

            BinaryFunctions.skipBytes(is, layerAndMaskDataLength);
            // byte[] LayerAndMaskData = readByteArray("LayerAndMaskData",
            // LayerAndMaskDataLength, is, "Not a Valid PSD File");

            BinaryFunctions.read2Bytes("Compression", is, "Not a Valid PSD File", getByteOrder());

            // byte[] ImageData = readByteArray("ImageData",
            // LayerAndMaskDataLength, is, "Not a Valid PSD File");

            if (section == PSD_SECTION_IMAGE_DATA) {
                return is;
            }
            notFound = true;
        } finally {
            if (notFound && is != null) {
                is.close();
            }
        }
        throw new ImagingException("getInputStream: Unknown Section: " + section);
    }

    @Override
    public ImageMetadata getMetadata(final ByteSource byteSource, final PsdImagingParameters params) throws ImagingException, IOException {
        return null;
    }

    @Override
    public String getName() {
        return "PSD-Custom";
    }

    /**
     * Extracts embedded XML metadata as XML string.
     *
     * @param byteSource File containing image data.
     * @param params     Map of optional parameters, defined in ImagingConstants.
     * @return Xmp Xml as String, if present. Otherwise, returns null.
     */
    @Override
    public String getXmpXml(final ByteSource byteSource, final XmpImagingParameters params) throws ImagingException, IOException {

        final PsdImageContents imageContents = readImageContents(byteSource);

        final PsdHeaderInfo header = imageContents.header;
        if (header == null) {
            throw new ImagingException("PSD: Couldn't read Header");
        }

        final List<ImageResourceBlock> blocks = readImageResourceBlocks(byteSource, new int[] { IMAGE_RESOURCE_ID_XMP, }, -1);

        if (blocks.isEmpty()) {
            return null;
        }

        final List<ImageResourceBlock> xmpBlocks = new ArrayList<>(blocks);
        if (xmpBlocks.isEmpty()) {
            return null;
        }
        if (xmpBlocks.size() > 1) {
            throw new ImagingException("PSD contains more than one XMP block.");
        }

        final ImageResourceBlock block = xmpBlocks.get(0);

        // segment data is UTF-8 encoded xml.
        return new String(block.data, 0, block.data.length, StandardCharsets.UTF_8);
    }

    private boolean keepImageResourceBlock(final int id, final int[] imageResourceIDs) {
        if (imageResourceIDs == null) {
            return true;
        }

        for (final int imageResourceID : imageResourceIDs) {
            if (id == imageResourceID) {
                return true;
            }
        }

        return false;
    }

    private PsdHeaderInfo readHeader(final ByteSource byteSource) throws ImagingException, IOException {
        try (InputStream is = byteSource.getInputStream()) {
            return readHeader(is);
        }
    }

    private PsdHeaderInfo readHeader(final InputStream is) throws ImagingException, IOException {
        BinaryFunctions.readAndVerifyBytes(is, new byte[] { 56, 66, 80, 83 }, "Not a Valid PSD File");

        final int version = BinaryFunctions.read2Bytes("Version", is, "Not a Valid PSD File", getByteOrder());
        final byte[] reserved = BinaryFunctions.readBytes("Reserved", is, 6, "Not a Valid PSD File");
        final int channels = BinaryFunctions.read2Bytes("Channels", is, "Not a Valid PSD File", getByteOrder());
        final int rows = BinaryFunctions.read4Bytes("Rows", is, "Not a Valid PSD File", getByteOrder());
        final int columns = BinaryFunctions.read4Bytes("Columns", is, "Not a Valid PSD File", getByteOrder());
        final int depth = BinaryFunctions.read2Bytes("Depth", is, "Not a Valid PSD File", getByteOrder());
        final int mode = BinaryFunctions.read2Bytes("Mode", is, "Not a Valid PSD File", getByteOrder());

        return new PsdHeaderInfo(version, reserved, channels, rows, columns, depth, mode);
    }

    private PsdImageContents readImageContents(final ByteSource byteSource) throws ImagingException, IOException {
        try (InputStream is = byteSource.getInputStream()) {
            return readImageContents(is);
        }
    }

    private PsdImageContents readImageContents(final InputStream is) throws ImagingException, IOException {
        final PsdHeaderInfo header = readHeader(is);

        final int colorModeDataLength = BinaryFunctions.read4Bytes("ColorModeDataLength", is, "Not a Valid PSD File", getByteOrder());
        BinaryFunctions.skipBytes(is, colorModeDataLength);
        // is.skip(ColorModeDataLength);
        // byte[] ColorModeData = readByteArray("ColorModeData",
        // ColorModeDataLength, is, "Not a Valid PSD File");

        final int imageResourcesLength = BinaryFunctions.read4Bytes("ImageResourcesLength", is, "Not a Valid PSD File", getByteOrder());
        BinaryFunctions.skipBytes(is, imageResourcesLength);
        // long skipped = is.skip(ImageResourcesLength);
        // byte[] ImageResources = readByteArray("ImageResources",
        // ImageResourcesLength, is, "Not a Valid PSD File");

        final int layerAndMaskDataLength = BinaryFunctions.read4Bytes("LayerAndMaskDataLength", is, "Not a Valid PSD File", getByteOrder());
        BinaryFunctions.skipBytes(is, layerAndMaskDataLength);
        // is.skip(LayerAndMaskDataLength);
        // byte[] LayerAndMaskData = readByteArray("LayerAndMaskData",
        // LayerAndMaskDataLength, is, "Not a Valid PSD File");

        final int compression = BinaryFunctions.read2Bytes("Compression", is, "Not a Valid PSD File", getByteOrder());

        // skip_bytes(is, LayerAndMaskDataLength);
        // byte[] ImageData = readByteArray("ImageData", LayerAndMaskDataLength,
        // is, "Not a Valid PSD File");

        // System.out.println("Compression: " + Compression);

        return new PsdImageContents(header, colorModeDataLength,
                // ColorModeData,
                imageResourcesLength,
                // ImageResources,
                layerAndMaskDataLength,
                // LayerAndMaskData,
                compression);
    }

    private List<ImageResourceBlock> readImageResourceBlocks(final byte[] bytes, final int[] imageResourceIDs, final int maxBlocksToRead)
            throws ImagingException, IOException {
        return readImageResourceBlocks(new ByteArrayInputStream(bytes), imageResourceIDs, maxBlocksToRead, bytes.length);
    }

    private List<ImageResourceBlock> readImageResourceBlocks(final ByteSource byteSource, final int[] imageResourceIDs, final int maxBlocksToRead)
            throws ImagingException, IOException {
        try (InputStream imageStream = byteSource.getInputStream();
                InputStream resourceStream = getInputStream(byteSource, PSD_SECTION_IMAGE_RESOURCES)) {
            final PsdImageContents imageContents = readImageContents(imageStream);
            final byte[] ImageResources = BinaryFunctions.readBytes("ImageResources", resourceStream, imageContents.imageResourcesLength,
                    "Not a Valid PSD File");
            return readImageResourceBlocks(ImageResources, imageResourceIDs, maxBlocksToRead);
        }
    }

    private List<ImageResourceBlock> readImageResourceBlocks(final InputStream is, final int[] imageResourceIDs, final int maxBlocksToRead, int available)
            throws ImagingException, IOException {
        final List<ImageResourceBlock> result = new ArrayList<>();

        while (available > 0) {
            BinaryFunctions.readAndVerifyBytes(is, new byte[] { 56, 66, 73, 77 }, "Not a Valid PSD File");
            available -= 4;

            final int id = BinaryFunctions.read2Bytes("ID", is, "Not a Valid PSD File", getByteOrder());
            available -= 2;

            final int nameLength = BinaryFunctions.readByte("NameLength", is, "Not a Valid PSD File");

            available -= 1;
            final byte[] nameBytes = BinaryFunctions.readBytes("NameData", is, nameLength, "Not a Valid PSD File");
            available -= nameLength;
            if ((nameLength + 1) % 2 != 0) {
                // final int NameDiscard =
                BinaryFunctions.readByte("NameDiscard", is, "Not a Valid PSD File");
                available -= 1;
            }
            // String Name = readPString("Name", 6, is, "Not a Valid PSD File");
            final int dataSize = BinaryFunctions.read4Bytes("Size", is, "Not a Valid PSD File", getByteOrder());
            available -= 4;
            // int ActualDataSize = ((DataSize % 2) == 0)
            // ? DataSize
            // : DataSize + 1; // pad to make even

            final byte[] data = BinaryFunctions.readBytes("Data", is, dataSize, "Not a Valid PSD File");
            available -= dataSize;

            if (dataSize % 2 != 0) {
                // final int DataDiscard =
                BinaryFunctions.readByte("DataDiscard", is, "Not a Valid PSD File");
                available -= 1;
            }

            if (keepImageResourceBlock(id, imageResourceIDs)) {
                result.add(new ImageResourceBlock(id, nameBytes, data));

                if (maxBlocksToRead >= 0 && result.size() >= maxBlocksToRead) {
                    return result;
                }
            }
            // debugNumber("ID", ID, 2);

        }

        return result;
    }

}
