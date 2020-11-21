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
package org.apache.commons.imaging.formats.gif;

import static org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT;
import static org.apache.commons.imaging.ImagingConstants.PARAM_KEY_XMP_XML;
import static org.apache.commons.imaging.common.BinaryFunctions.compareBytes;
import static org.apache.commons.imaging.common.BinaryFunctions.printByteBits;
import static org.apache.commons.imaging.common.BinaryFunctions.printCharQuad;
import static org.apache.commons.imaging.common.BinaryFunctions.read2Bytes;
import static org.apache.commons.imaging.common.BinaryFunctions.readByte;
import static org.apache.commons.imaging.common.BinaryFunctions.readBytes;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
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
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.XmpEmbeddable;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.mylzw.MyLzwCompressor;
import org.apache.commons.imaging.common.mylzw.MyLzwDecompressor;
import org.apache.commons.imaging.palette.Palette;
import org.apache.commons.imaging.palette.PaletteFactory;

public class GifImageParser extends ImageParser implements XmpEmbeddable {

    private static final Logger LOGGER = Logger.getLogger(GifImageParser.class.getName());

    private static final String DEFAULT_EXTENSION = ".gif";
    private static final String[] ACCEPTED_EXTENSIONS = { DEFAULT_EXTENSION, };
    private static final byte[] GIF_HEADER_SIGNATURE = { 71, 73, 70 };
    private static final int EXTENSION_CODE = 0x21;
    private static final int IMAGE_SEPARATOR = 0x2C;
    private static final int GRAPHIC_CONTROL_EXTENSION = (EXTENSION_CODE << 8) | 0xf9;
    private static final int COMMENT_EXTENSION = 0xfe;
    private static final int PLAIN_TEXT_EXTENSION = 0x01;
    private static final int XMP_EXTENSION = 0xff;
    private static final int TERMINATOR_BYTE = 0x3b;
    private static final int APPLICATION_EXTENSION_LABEL = 0xff;
    private static final int XMP_COMPLETE_CODE = (EXTENSION_CODE << 8)
            | XMP_EXTENSION;
    private static final int LOCAL_COLOR_TABLE_FLAG_MASK = 1 << 7;
    private static final int INTERLACE_FLAG_MASK = 1 << 6;
    private static final int SORT_FLAG_MASK = 1 << 5;
    private static final byte[] XMP_APPLICATION_ID_AND_AUTH_CODE = {
        0x58, // X
        0x4D, // M
        0x50, // P
        0x20, //
        0x44, // D
        0x61, // a
        0x74, // t
        0x61, // a
        0x58, // X
        0x4D, // M
        0x50, // P
    };

    public GifImageParser() {
        super.setByteOrder(ByteOrder.LITTLE_ENDIAN);
    }

    @Override
    public String getName() {
        return "Graphics Interchange Format";
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
        return new ImageFormat[] { ImageFormats.GIF, //
        };
    }

    private GifHeaderInfo readHeader(final InputStream is,
            final FormatCompliance formatCompliance) throws ImageReadException,
            IOException {
        final byte identifier1 = readByte("identifier1", is, "Not a Valid GIF File");
        final byte identifier2 = readByte("identifier2", is, "Not a Valid GIF File");
        final byte identifier3 = readByte("identifier3", is, "Not a Valid GIF File");

        final byte version1 = readByte("version1", is, "Not a Valid GIF File");
        final byte version2 = readByte("version2", is, "Not a Valid GIF File");
        final byte version3 = readByte("version3", is, "Not a Valid GIF File");

        if (formatCompliance != null) {
            formatCompliance.compareBytes("Signature", GIF_HEADER_SIGNATURE,
                    new byte[]{identifier1, identifier2, identifier3,});
            formatCompliance.compare("version", 56, version1);
            formatCompliance.compare("version", new int[] { 55, 57, }, version2);
            formatCompliance.compare("version", 97, version3);
        }

        if (LOGGER.isLoggable(Level.FINEST)) {
            printCharQuad("identifier: ", ((identifier1 << 16)
                    | (identifier2 << 8) | (identifier3 << 0)));
            printCharQuad("version: ",
                    ((version1 << 16) | (version2 << 8) | (version3 << 0)));
        }

        final int logicalScreenWidth = read2Bytes("Logical Screen Width", is, "Not a Valid GIF File", getByteOrder());
        final int logicalScreenHeight = read2Bytes("Logical Screen Height", is, "Not a Valid GIF File", getByteOrder());

        if (formatCompliance != null) {
            formatCompliance.checkBounds("Width", 1, Integer.MAX_VALUE,
                    logicalScreenWidth);
            formatCompliance.checkBounds("Height", 1, Integer.MAX_VALUE,
                    logicalScreenHeight);
        }

        final byte packedFields = readByte("Packed Fields", is,
                "Not a Valid GIF File");
        final byte backgroundColorIndex = readByte("Background Color Index", is,
                "Not a Valid GIF File");
        final byte pixelAspectRatio = readByte("Pixel Aspect Ratio", is,
                "Not a Valid GIF File");

        if (LOGGER.isLoggable(Level.FINEST)) {
            printByteBits("PackedFields bits", packedFields);
        }

        final boolean globalColorTableFlag = ((packedFields & 128) > 0);
        if (LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.finest("GlobalColorTableFlag: " + globalColorTableFlag);
        }
        final byte colorResolution = (byte) ((packedFields >> 4) & 7);
        if (LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.finest("ColorResolution: " + colorResolution);
        }
        final boolean sortFlag = ((packedFields & 8) > 0);
        if (LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.finest("SortFlag: " + sortFlag);
        }
        final byte sizeofGlobalColorTable = (byte) (packedFields & 7);
        if (LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.finest("SizeofGlobalColorTable: "
                    + sizeofGlobalColorTable);
        }

        if (formatCompliance != null) {
            if (globalColorTableFlag && backgroundColorIndex != -1) {
                formatCompliance.checkBounds("Background Color Index", 0,
                        convertColorTableSize(sizeofGlobalColorTable),
                        backgroundColorIndex);
            }
        }

        return new GifHeaderInfo(identifier1, identifier2, identifier3,
                version1, version2, version3, logicalScreenWidth,
                logicalScreenHeight, packedFields, backgroundColorIndex,
                pixelAspectRatio, globalColorTableFlag, colorResolution,
                sortFlag, sizeofGlobalColorTable);
    }

    private GraphicControlExtension readGraphicControlExtension(final int code,
            final InputStream is) throws IOException {
        readByte("block_size", is, "GIF: corrupt GraphicControlExt");
        final int packed = readByte("packed fields", is,
                "GIF: corrupt GraphicControlExt");

        final int dispose = (packed & 0x1c) >> 2; // disposal method
        final boolean transparency = (packed & 1) != 0;

        final int delay = read2Bytes("delay in milliseconds", is, "GIF: corrupt GraphicControlExt", getByteOrder());
        final int transparentColorIndex = 0xff & readByte("transparent color index",
                is, "GIF: corrupt GraphicControlExt");
        readByte("block terminator", is, "GIF: corrupt GraphicControlExt");

        return new GraphicControlExtension(code, packed, dispose, transparency,
                delay, transparentColorIndex);
    }

    private byte[] readSubBlock(final InputStream is) throws IOException {
        final int blockSize = 0xff & readByte("block_size", is, "GIF: corrupt block");

        return readBytes("block", is, blockSize, "GIF: corrupt block");
    }

    private GenericGifBlock readGenericGIFBlock(final InputStream is, final int code)
            throws IOException {
        return readGenericGIFBlock(is, code, null);
    }

    private GenericGifBlock readGenericGIFBlock(final InputStream is, final int code,
            final byte[] first) throws IOException {
        final List<byte[]> subblocks = new ArrayList<>();

        if (first != null) {
            subblocks.add(first);
        }

        while (true) {
            final byte[] bytes = readSubBlock(is);
            if (bytes.length < 1) {
                break;
            }
            subblocks.add(bytes);
        }

        return new GenericGifBlock(code, subblocks);
    }

    private List<GifBlock> readBlocks(final GifHeaderInfo ghi, final InputStream is,
            final boolean stopBeforeImageData, final FormatCompliance formatCompliance)
            throws ImageReadException, IOException {
        final List<GifBlock> result = new ArrayList<>();

        while (true) {
            final int code = is.read();

            switch (code) {
            case -1:
                throw new ImageReadException("GIF: unexpected end of data");

            case IMAGE_SEPARATOR:
                final ImageDescriptor id = readImageDescriptor(ghi, code, is,
                        stopBeforeImageData, formatCompliance);
                result.add(id);
                // if (stopBeforeImageData)
                // return result;

                break;

            case EXTENSION_CODE: {
                final int extensionCode = is.read();
                final int completeCode = ((0xff & code) << 8)
                        | (0xff & extensionCode);

                switch (extensionCode) {
                case 0xf9:
                    final GraphicControlExtension gce = readGraphicControlExtension(
                            completeCode, is);
                    result.add(gce);
                    break;

                case COMMENT_EXTENSION:
                case PLAIN_TEXT_EXTENSION: {
                    final GenericGifBlock block = readGenericGIFBlock(is,
                            completeCode);
                    result.add(block);
                    break;
                }

                case APPLICATION_EXTENSION_LABEL: {
                    // 255 (hex 0xFF) Application
                    // Extension Label
                    final byte[] label = readSubBlock(is);

                    if (formatCompliance != null) {
                        formatCompliance.addComment(
                                "Unknown Application Extension ("
                                        + new String(label, StandardCharsets.US_ASCII) + ")",
                                completeCode);
                    }

                    // if (label == new String("ICCRGBG1"))
                    //{
                        // GIF's can have embedded ICC Profiles - who knew?
                    //}

                    if ((label != null) && (label.length > 0)) {
                        final GenericGifBlock block = readGenericGIFBlock(is,
                                completeCode, label);
                        result.add(block);
                    }
                    break;
                }

                default: {

                    if (formatCompliance != null) {
                        formatCompliance.addComment("Unknown block",
                                completeCode);
                    }

                    final GenericGifBlock block = readGenericGIFBlock(is,
                            completeCode);
                    result.add(block);
                    break;
                }
                }
            }
                break;

            case TERMINATOR_BYTE:
                return result;

            case 0x00: // bad byte, but keep going and see what happens
                break;

            default:
                throw new ImageReadException("GIF: unknown code: " + code);
            }
        }
    }

    private ImageDescriptor readImageDescriptor(final GifHeaderInfo ghi,
            final int blockCode, final InputStream is, final boolean stopBeforeImageData,
            final FormatCompliance formatCompliance) throws ImageReadException,
            IOException {
        final int imageLeftPosition = read2Bytes("Image Left Position", is, "Not a Valid GIF File", getByteOrder());
        final int imageTopPosition = read2Bytes("Image Top Position", is, "Not a Valid GIF File", getByteOrder());
        final int imageWidth = read2Bytes("Image Width", is, "Not a Valid GIF File", getByteOrder());
        final int imageHeight = read2Bytes("Image Height", is, "Not a Valid GIF File", getByteOrder());
        final byte packedFields = readByte("Packed Fields", is, "Not a Valid GIF File");

        if (formatCompliance != null) {
            formatCompliance.checkBounds("Width", 1, ghi.logicalScreenWidth, imageWidth);
            formatCompliance.checkBounds("Height", 1, ghi.logicalScreenHeight, imageHeight);
            formatCompliance.checkBounds("Left Position", 0, ghi.logicalScreenWidth - imageWidth, imageLeftPosition);
            formatCompliance.checkBounds("Top Position", 0, ghi.logicalScreenHeight - imageHeight, imageTopPosition);
        }

        if (LOGGER.isLoggable(Level.FINEST)) {
            printByteBits("PackedFields bits", packedFields);
        }

        final boolean localColorTableFlag = (((packedFields >> 7) & 1) > 0);
        if (LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.finest("LocalColorTableFlag: " + localColorTableFlag);
        }
        final boolean interlaceFlag = (((packedFields >> 6) & 1) > 0);
        if (LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.finest("Interlace Flag: " + interlaceFlag);
        }
        final boolean sortFlag = (((packedFields >> 5) & 1) > 0);
        if (LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.finest("Sort Flag: " + sortFlag);
        }

        final byte sizeOfLocalColorTable = (byte) (packedFields & 7);
        if (LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.finest("SizeofLocalColorTable: " + sizeOfLocalColorTable);
        }

        byte[] localColorTable = null;
        if (localColorTableFlag) {
            localColorTable = readColorTable(is, sizeOfLocalColorTable);
        }

        byte[] imageData = null;
        if (!stopBeforeImageData) {
            final int lzwMinimumCodeSize = is.read();

            final GenericGifBlock block = readGenericGIFBlock(is, -1);
            final byte[] bytes = block.appendSubBlocks();
            final InputStream bais = new ByteArrayInputStream(bytes);

            final int size = imageWidth * imageHeight;
            final MyLzwDecompressor myLzwDecompressor = new MyLzwDecompressor(
                    lzwMinimumCodeSize, ByteOrder.LITTLE_ENDIAN);
            imageData = myLzwDecompressor.decompress(bais, size);
        } else {
            final int LZWMinimumCodeSize = is.read();
            if (LOGGER.isLoggable(Level.FINEST)) {
                LOGGER.finest("LZWMinimumCodeSize: " + LZWMinimumCodeSize);
            }

            readGenericGIFBlock(is, -1);
        }

        return new ImageDescriptor(blockCode,
                imageLeftPosition, imageTopPosition, imageWidth, imageHeight,
                packedFields, localColorTableFlag, interlaceFlag, sortFlag,
                sizeOfLocalColorTable, localColorTable, imageData);
    }

    private int simplePow(final int base, final int power) {
        int result = 1;

        for (int i = 0; i < power; i++) {
            result *= base;
        }

        return result;
    }

    private int convertColorTableSize(final int tableSize) {
        return 3 * simplePow(2, tableSize + 1);
    }

    private byte[] readColorTable(final InputStream is, final int tableSize) throws IOException {
        final int actualSize = convertColorTableSize(tableSize);

        return readBytes("block", is, actualSize, "GIF: corrupt Color Table");
    }

    private GifBlock findBlock(final List<GifBlock> blocks, final int code) {
        for (final GifBlock gifBlock : blocks) {
            if (gifBlock.blockCode == code) {
                return gifBlock;
            }
        }
        return null;
    }

    /**
     * See {@link GifImageParser#readBlocks} for reference how the blocks are created. They should match
     * the code we are giving here, returning the correct class type. Internal only.
     */
    @SuppressWarnings("unchecked")
    private <T extends GifBlock> List<T> findAllBlocks(final List<GifBlock> blocks, final int code) {
        final List<T> filteredBlocks = new ArrayList<>();
        for (final GifBlock gifBlock : blocks) {
            if (gifBlock.blockCode == code) {
                filteredBlocks.add((T) gifBlock);
            }
        }
        return filteredBlocks;
    }

    private GifImageContents readFile(final ByteSource byteSource,
            final boolean stopBeforeImageData) throws ImageReadException, IOException {
        return readFile(byteSource, stopBeforeImageData,
                FormatCompliance.getDefault());
    }

    private GifImageContents readFile(final ByteSource byteSource,
            final boolean stopBeforeImageData, final FormatCompliance formatCompliance)
            throws ImageReadException, IOException {
        try (InputStream is = byteSource.getInputStream()) {
            final GifHeaderInfo ghi = readHeader(is, formatCompliance);

            byte[] globalColorTable = null;
            if (ghi.globalColorTableFlag) {
                globalColorTable = readColorTable(is,
                        ghi.sizeOfGlobalColorTable);
            }

            final List<GifBlock> blocks = readBlocks(ghi, is, stopBeforeImageData,
                    formatCompliance);

            final GifImageContents result = new GifImageContents(ghi, globalColorTable,
                    blocks);
            return result;
        }
    }

    @Override
    public byte[] getICCProfileBytes(final ByteSource byteSource, final Map<String, Object> params)
            throws ImageReadException, IOException {
        return null;
    }

    @Override
    public Dimension getImageSize(final ByteSource byteSource, final Map<String, Object> params)
            throws ImageReadException, IOException {
        final GifImageContents blocks = readFile(byteSource, false);

        if (blocks == null) {
            throw new ImageReadException("GIF: Couldn't read blocks");
        }

        final GifHeaderInfo bhi = blocks.gifHeaderInfo;
        if (bhi == null) {
            throw new ImageReadException("GIF: Couldn't read Header");
        }

        // The logical screen width and height defines the overall dimensions of the image
        // space from the top left corner. This does not necessarily match the dimensions
        // of any individual image, or even the dimensions created by overlapping all
        // images (since each images might have an offset from the top left corner).
        // Nevertheless, these fields indicate the desired screen dimensions when rendering the GIF.
        return new Dimension(bhi.logicalScreenWidth, bhi.logicalScreenHeight);
    }

    // Made internal for testability.
    static DisposalMethod createDisposalMethodFromIntValue(final int value) throws ImageReadException {
        switch (value) {
            case 0:
                return DisposalMethod.UNSPECIFIED;
            case 1:
                return DisposalMethod.DO_NOT_DISPOSE;
            case 2:
                return DisposalMethod.RESTORE_TO_BACKGROUND;
            case 3:
                return DisposalMethod.RESTORE_TO_PREVIOUS;
            case 4:
                return DisposalMethod.TO_BE_DEFINED_1;
            case 5:
                return DisposalMethod.TO_BE_DEFINED_2;
            case 6:
                return DisposalMethod.TO_BE_DEFINED_3;
            case 7:
                return DisposalMethod.TO_BE_DEFINED_4;
            default:
                throw new ImageReadException("GIF: Invalid parsing of disposal method");
        }
    }

    @Override
    public ImageMetadata getMetadata(final ByteSource byteSource, final Map<String, Object> params)
            throws ImageReadException, IOException {
        final GifImageContents imageContents = readFile(byteSource, false);

        if (imageContents == null) {
            throw new ImageReadException("GIF: Couldn't read blocks");
        }

        final GifHeaderInfo bhi = imageContents.gifHeaderInfo;
        if (bhi == null) {
            throw new ImageReadException("GIF: Couldn't read Header");
        }

        final List<GifImageData> imageData = findAllImageData(imageContents);
        final List<GifImageMetadataItem> metadataItems = new ArrayList<>(imageData.size());
        for(final GifImageData id : imageData) {
            final DisposalMethod disposalMethod = createDisposalMethodFromIntValue(id.gce.dispose);
            metadataItems.add(new GifImageMetadataItem(id.gce.delay, id.descriptor.imageLeftPosition, id.descriptor.imageTopPosition, disposalMethod));
        }
        return new GifImageMetadata(bhi.logicalScreenWidth, bhi.logicalScreenHeight, metadataItems);
    }

    private List<String> getComments(final List<GifBlock> blocks) throws IOException {
        final List<String> result = new ArrayList<>();
        final int code = 0x21fe;

        for (final GifBlock block : blocks) {
            if (block.blockCode == code) {
                final byte[] bytes = ((GenericGifBlock) block).appendSubBlocks();
                result.add(new String(bytes, StandardCharsets.US_ASCII));
            }
        }

        return result;
    }

    @Override
    public ImageInfo getImageInfo(final ByteSource byteSource, final Map<String, Object> params)
            throws ImageReadException, IOException {
        final GifImageContents blocks = readFile(byteSource, false);

        if (blocks == null) {
            throw new ImageReadException("GIF: Couldn't read blocks");
        }

        final GifHeaderInfo bhi = blocks.gifHeaderInfo;
        if (bhi == null) {
            throw new ImageReadException("GIF: Couldn't read Header");
        }

        final ImageDescriptor id = (ImageDescriptor) findBlock(blocks.blocks,
                IMAGE_SEPARATOR);
        if (id == null) {
            throw new ImageReadException("GIF: Couldn't read ImageDescriptor");
        }

        final GraphicControlExtension gce = (GraphicControlExtension) findBlock(
                blocks.blocks, GRAPHIC_CONTROL_EXTENSION);

        final int height = bhi.logicalScreenHeight;
        final int width = bhi.logicalScreenWidth;

        final List<String> comments = getComments(blocks.blocks);
        final int bitsPerPixel = (bhi.colorResolution + 1);
        final ImageFormat format = ImageFormats.GIF;
        final String formatName = "GIF Graphics Interchange Format";
        final String mimeType = "image/gif";

        final int numberOfImages = findAllBlocks(blocks.blocks, IMAGE_SEPARATOR).size();

        final boolean progressive = id.interlaceFlag;

        final int physicalWidthDpi = 72;
        final float physicalWidthInch = (float) ((double) width / (double) physicalWidthDpi);
        final int physicalHeightDpi = 72;
        final float physicalHeightInch = (float) ((double) height / (double) physicalHeightDpi);

        final String formatDetails = "Gif " + ((char) blocks.gifHeaderInfo.version1)
                + ((char) blocks.gifHeaderInfo.version2)
                + ((char) blocks.gifHeaderInfo.version3);

        boolean transparent = false;
        if (gce != null && gce.transparency) {
            transparent = true;
        }

        final boolean usesPalette = true;
        final ImageInfo.ColorType colorType = ImageInfo.ColorType.RGB;
        final ImageInfo.CompressionAlgorithm compressionAlgorithm = ImageInfo.CompressionAlgorithm.LZW;

        return new ImageInfo(formatDetails, bitsPerPixel, comments,
                format, formatName, height, mimeType, numberOfImages,
                physicalHeightDpi, physicalHeightInch, physicalWidthDpi,
                physicalWidthInch, width, progressive, transparent,
                usesPalette, colorType, compressionAlgorithm);
    }

    @Override
    public boolean dumpImageFile(final PrintWriter pw, final ByteSource byteSource)
            throws ImageReadException, IOException {
        pw.println("gif.dumpImageFile");

        final ImageInfo imageData = getImageInfo(byteSource);
        if (imageData == null) {
            return false;
        }

        imageData.toString(pw, "");

        final GifImageContents blocks = readFile(byteSource, false);

        pw.println("gif.blocks: " + blocks.blocks.size());
        for (int i = 0; i < blocks.blocks.size(); i++) {
            final GifBlock gifBlock = blocks.blocks.get(i);
            this.debugNumber(pw, "\t" + i + " ("
                    + gifBlock.getClass().getName() + ")",
                    gifBlock.blockCode, 4);
        }

        pw.println("");

        return true;
    }

    private int[] getColorTable(final byte[] bytes) throws ImageReadException {
        if ((bytes.length % 3) != 0) {
            throw new ImageReadException("Bad Color Table Length: "
                    + bytes.length);
        }
        final int length = bytes.length / 3;

        final int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            final int red = 0xff & bytes[(i * 3) + 0];
            final int green = 0xff & bytes[(i * 3) + 1];
            final int blue = 0xff & bytes[(i * 3) + 2];

            final int alpha = 0xff;

            final int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);
            result[i] = rgb;
        }

        return result;
    }

    @Override
    public FormatCompliance getFormatCompliance(final ByteSource byteSource)
            throws ImageReadException, IOException {
        final FormatCompliance result = new FormatCompliance(
                byteSource.getDescription());

        readFile(byteSource, false, result);

        return result;
    }

    private List<GifImageData> findAllImageData(final GifImageContents imageContents) throws ImageReadException {
        final List<ImageDescriptor> descriptors = findAllBlocks(imageContents.blocks, IMAGE_SEPARATOR);

        if (descriptors.isEmpty()) {
            throw new ImageReadException("GIF: Couldn't read Image Descriptor");
        }

        final List<GraphicControlExtension> gcExtensions = findAllBlocks(imageContents.blocks, GRAPHIC_CONTROL_EXTENSION);

        if (!gcExtensions.isEmpty() && gcExtensions.size() != descriptors.size()) {
            throw new ImageReadException("GIF: Invalid amount of Graphic Control Extensions");
        }

        final List<GifImageData> imageData = new ArrayList<>(descriptors.size());
        for(int i = 0; i < descriptors.size(); i++) {
            final ImageDescriptor descriptor = descriptors.get(i);
            if (descriptor == null) {
                throw new ImageReadException(String.format("GIF: Couldn't read Image Descriptor of image number %d", i));
            }

            final GraphicControlExtension gce = gcExtensions.isEmpty() ? null : gcExtensions.get(i);

            imageData.add(new GifImageData(descriptor, gce));
        }

        return imageData;
    }

    private GifImageData findFirstImageData(final GifImageContents imageContents) throws ImageReadException {
        final ImageDescriptor descriptor = (ImageDescriptor) findBlock(imageContents.blocks,
                IMAGE_SEPARATOR);

        if (descriptor == null) {
            throw new ImageReadException("GIF: Couldn't read Image Descriptor");
        }

        final GraphicControlExtension gce = (GraphicControlExtension) findBlock(
                imageContents.blocks, GRAPHIC_CONTROL_EXTENSION);

        return new GifImageData(descriptor, gce);
    }

    private BufferedImage getBufferedImage(final GifHeaderInfo headerInfo, final GifImageData imageData, final byte[] globalColorTable)
            throws ImageReadException {
        final ImageDescriptor id = imageData.descriptor;
        final GraphicControlExtension gce = imageData.gce;

        final int width = id.imageWidth;
        final int height = id.imageHeight;

        boolean hasAlpha = false;
        if (gce != null && gce.transparency) {
            hasAlpha = true;
        }

        final ImageBuilder imageBuilder = new ImageBuilder(width, height, hasAlpha);

        int[] colorTable;
        if (id.localColorTable != null) {
            colorTable = getColorTable(id.localColorTable);
        } else if (globalColorTable != null) {
            colorTable = getColorTable(globalColorTable);
        } else {
            throw new ImageReadException("Gif: No Color Table");
        }

        int transparentIndex = -1;
        if (gce != null && hasAlpha) {
            transparentIndex = gce.transparentColorIndex;
        }

        int counter = 0;

        final int rowsInPass1 = (height + 7) / 8;
        final int rowsInPass2 = (height + 3) / 8;
        final int rowsInPass3 = (height + 1) / 4;
        final int rowsInPass4 = (height) / 2;

        for (int row = 0; row < height; row++) {
            int y;
            if (id.interlaceFlag) {
                int theRow = row;
                if (theRow < rowsInPass1) {
                    y = theRow * 8;
                } else {
                    theRow -= rowsInPass1;
                    if (theRow < (rowsInPass2)) {
                        y = 4 + (theRow * 8);
                    } else {
                        theRow -= rowsInPass2;
                        if (theRow < (rowsInPass3)) {
                            y = 2 + (theRow * 4);
                        } else {
                            theRow -= rowsInPass3;
                            if (theRow < (rowsInPass4)) {
                                y = 1 + (theRow * 2);
                            } else {
                                throw new ImageReadException("Gif: Strange Row");
                            }
                        }
                    }
                }
            } else {
                y = row;
            }

            for (int x = 0; x < width; x++) {
                final int index = 0xff & id.imageData[counter++];
                int rgb = colorTable[index];

                if (transparentIndex == index) {
                    rgb = 0x00;
                }
                imageBuilder.setRGB(x,y, rgb);
            }
        }

        return imageBuilder.getBufferedImage();
    }

    @Override
    public List<BufferedImage> getAllBufferedImages(final ByteSource byteSource)
            throws ImageReadException, IOException {
        final GifImageContents imageContents = readFile(byteSource, false);

        if (imageContents == null) {
            throw new ImageReadException("GIF: Couldn't read blocks");
        }

        final GifHeaderInfo ghi = imageContents.gifHeaderInfo;
        if (ghi == null) {
            throw new ImageReadException("GIF: Couldn't read Header");
        }

        final List<GifImageData> imageData = findAllImageData(imageContents);
        final List<BufferedImage> result = new ArrayList<>(imageData.size());
        for(final GifImageData id : imageData) {
            result.add(getBufferedImage(ghi, id, imageContents.globalColorTable));
        }
        return result;
    }

    @Override
    public BufferedImage getBufferedImage(final ByteSource byteSource, final Map<String, Object> params)
            throws ImageReadException, IOException {
        final GifImageContents imageContents = readFile(byteSource, false);

        if (imageContents == null) {
            throw new ImageReadException("GIF: Couldn't read blocks");
        }

        final GifHeaderInfo ghi = imageContents.gifHeaderInfo;
        if (ghi == null) {
            throw new ImageReadException("GIF: Couldn't read Header");
        }

        final GifImageData imageData = findFirstImageData(imageContents);

        return getBufferedImage(ghi, imageData, imageContents.globalColorTable);
    }

    private void writeAsSubBlocks(final OutputStream os, final byte[] bytes) throws IOException {
        int index = 0;

        while (index < bytes.length) {
            final int blockSize = Math.min(bytes.length - index, 255);
            os.write(blockSize);
            os.write(bytes, index, blockSize);
            index += blockSize;
        }
        os.write(0); // last block
    }

    @Override
    public void writeImage(final BufferedImage src, final OutputStream os, Map<String, Object> params)
            throws ImageWriteException, IOException {
        // make copy of params; we'll clear keys as we consume them.
        params = new HashMap<>(params);

        // clear format key.
        if (params.containsKey(PARAM_KEY_FORMAT)) {
            params.remove(PARAM_KEY_FORMAT);
        }

        String xmpXml = null;
        if (params.containsKey(PARAM_KEY_XMP_XML)) {
            xmpXml = (String) params.get(PARAM_KEY_XMP_XML);
            params.remove(PARAM_KEY_XMP_XML);
        }

        if (!params.isEmpty()) {
            final Object firstKey = params.keySet().iterator().next();
            throw new ImageWriteException("Unknown parameter: " + firstKey);
        }

        final int width = src.getWidth();
        final int height = src.getHeight();

        final boolean hasAlpha = new PaletteFactory().hasTransparency(src);

        final int maxColors = hasAlpha ? 255 : 256;

        Palette palette2 = new PaletteFactory().makeExactRgbPaletteSimple(src, maxColors);
        // int palette[] = new PaletteFactory().makePaletteSimple(src, 256);
        // Map palette_map = paletteToMap(palette);

        if (palette2 == null) {
            palette2 = new PaletteFactory().makeQuantizedRgbPalette(src, maxColors);
            if (LOGGER.isLoggable(Level.FINE)) {
                LOGGER.fine("quantizing");
            }
        } else if (LOGGER.isLoggable(Level.FINE)) {
            LOGGER.fine("exact palette");
        }

        if (palette2 == null) {
            throw new ImageWriteException("Gif: can't write images with more than 256 colors");
        }
        final int paletteSize = palette2.length() + (hasAlpha ? 1 : 0);

        final BinaryOutputStream bos = new BinaryOutputStream(os, ByteOrder.LITTLE_ENDIAN);

        // write Header
        os.write(0x47); // G magic numbers
        os.write(0x49); // I
        os.write(0x46); // F

        os.write(0x38); // 8 version magic numbers
        os.write(0x39); // 9
        os.write(0x61); // a

        // Logical Screen Descriptor.

        bos.write2Bytes(width);
        bos.write2Bytes(height);

        final int colorTableScaleLessOne = (paletteSize > 128) ? 7
                : (paletteSize > 64) ? 6 : (paletteSize > 32) ? 5
                        : (paletteSize > 16) ? 4 : (paletteSize > 8) ? 3
                                : (paletteSize > 4) ? 2
                                        : (paletteSize > 2) ? 1 : 0;

        final int colorTableSizeInFormat = 1 << (colorTableScaleLessOne + 1);
        {
            final byte colorResolution = (byte) colorTableScaleLessOne; // TODO:
            final int packedFields = (7 & colorResolution) * 16;
            bos.write(packedFields); // one byte
        }
        {
            final byte backgroundColorIndex = 0;
            bos.write(backgroundColorIndex);
        }
        {
            final byte pixelAspectRatio = 0;
            bos.write(pixelAspectRatio);
        }

        //{
            // write Global Color Table.

        //}

        { // ALWAYS write GraphicControlExtension
            bos.write(EXTENSION_CODE);
            bos.write((byte) 0xf9);
            // bos.write(0xff & (kGraphicControlExtension >> 8));
            // bos.write(0xff & (kGraphicControlExtension >> 0));

            bos.write((byte) 4); // block size;
            final int packedFields = hasAlpha ? 1 : 0; // transparency flag
            bos.write((byte) packedFields);
            bos.write((byte) 0); // Delay Time
            bos.write((byte) 0); // Delay Time
            bos.write((byte) (hasAlpha ? palette2.length() : 0)); // Transparent
            // Color
            // Index
            bos.write((byte) 0); // terminator
        }

        if (null != xmpXml) {
            bos.write(EXTENSION_CODE);
            bos.write(APPLICATION_EXTENSION_LABEL);

            bos.write(XMP_APPLICATION_ID_AND_AUTH_CODE.length); // 0x0B
            bos.write(XMP_APPLICATION_ID_AND_AUTH_CODE);

            final byte[] xmpXmlBytes = xmpXml.getBytes(StandardCharsets.UTF_8);
            bos.write(xmpXmlBytes);

            // write "magic trailer"
            for (int magic = 0; magic <= 0xff; magic++) {
                bos.write(0xff - magic);
            }

            bos.write((byte) 0); // terminator

        }

        { // Image Descriptor.
            bos.write(IMAGE_SEPARATOR);
            bos.write2Bytes(0); // Image Left Position
            bos.write2Bytes(0); // Image Top Position
            bos.write2Bytes(width); // Image Width
            bos.write2Bytes(height); // Image Height

            {
                final boolean localColorTableFlag = true;
                // boolean LocalColorTableFlag = false;
                final boolean interlaceFlag = false;
                final boolean sortFlag = false;
                final int sizeOfLocalColorTable = colorTableScaleLessOne;

                // int SizeOfLocalColorTable = 0;

                final int packedFields;
                if (localColorTableFlag) {
                    packedFields = (LOCAL_COLOR_TABLE_FLAG_MASK
                            | (interlaceFlag ? INTERLACE_FLAG_MASK : 0)
                            | (sortFlag ? SORT_FLAG_MASK : 0)
                            | (7 & sizeOfLocalColorTable));
                } else {
                    packedFields = (0
                            | (interlaceFlag ? INTERLACE_FLAG_MASK : 0)
                            | (sortFlag ? SORT_FLAG_MASK : 0)
                            | (7 & sizeOfLocalColorTable));
                }
                bos.write(packedFields); // one byte
            }
        }

        { // write Local Color Table.
            for (int i = 0; i < colorTableSizeInFormat; i++) {
                if (i < palette2.length()) {
                    final int rgb = palette2.getEntry(i);

                    final int red = 0xff & (rgb >> 16);
                    final int green = 0xff & (rgb >> 8);
                    final int blue = 0xff & (rgb >> 0);

                    bos.write(red);
                    bos.write(green);
                    bos.write(blue);
                } else {
                    bos.write(0);
                    bos.write(0);
                    bos.write(0);
                }
            }
        }

        { // get Image Data.
//            int image_data_total = 0;

            int lzwMinimumCodeSize = colorTableScaleLessOne + 1;
            // LZWMinimumCodeSize = Math.max(8, LZWMinimumCodeSize);
            if (lzwMinimumCodeSize < 2) {
                lzwMinimumCodeSize = 2;
            }

            // TODO:
            // make
            // better
            // choice
            // here.
            bos.write(lzwMinimumCodeSize);

            final MyLzwCompressor compressor = new MyLzwCompressor(
                    lzwMinimumCodeSize, ByteOrder.LITTLE_ENDIAN, false); // GIF
            // Mode);

            final byte[] imagedata = new byte[width * height];
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    final int argb = src.getRGB(x, y);
                    final int rgb = 0xffffff & argb;
                    int index;

                    if (hasAlpha) {
                        final int alpha = 0xff & (argb >> 24);
                        final int alphaThreshold = 255;
                        if (alpha < alphaThreshold) {
                            index = palette2.length(); // is transparent
                        } else {
                            index = palette2.getPaletteIndex(rgb);
                        }
                    } else {
                        index = palette2.getPaletteIndex(rgb);
                    }

                    imagedata[y * width + x] = (byte) index;
                }
            }

            final byte[] compressed = compressor.compress(imagedata);
            writeAsSubBlocks(bos, compressed);
//            image_data_total += compressed.length;
        }

        // palette2.dump();

        bos.write(TERMINATOR_BYTE);

        bos.close();
        os.close();
    }

    /**
     * Extracts embedded XML metadata as XML string.
     * <p>
     *
     * @param byteSource
     *            File containing image data.
     * @param params
     *            Map of optional parameters, defined in ImagingConstants.
     * @return Xmp Xml as String, if present. Otherwise, returns null.
     */
    @Override
    public String getXmpXml(final ByteSource byteSource, final Map<String, Object> params)
            throws ImageReadException, IOException {
        try (InputStream is = byteSource.getInputStream()) {
            final FormatCompliance formatCompliance = null;
            final GifHeaderInfo ghi = readHeader(is, formatCompliance);

            if (ghi.globalColorTableFlag) {
                readColorTable(is, ghi.sizeOfGlobalColorTable);
            }

            final List<GifBlock> blocks = readBlocks(ghi, is, true, formatCompliance);

            final List<String> result = new ArrayList<>();
            for (final GifBlock block : blocks) {
                if (block.blockCode != XMP_COMPLETE_CODE) {
                    continue;
                }

                final GenericGifBlock genericBlock = (GenericGifBlock) block;

                final byte[] blockBytes = genericBlock.appendSubBlocks(true);
                if (blockBytes.length < XMP_APPLICATION_ID_AND_AUTH_CODE.length) {
                    continue;
                }

                if (!compareBytes(blockBytes, 0,
                        XMP_APPLICATION_ID_AND_AUTH_CODE, 0,
                        XMP_APPLICATION_ID_AND_AUTH_CODE.length)) {
                    continue;
                }

                final byte[] GIF_MAGIC_TRAILER = new byte[256];
                for (int magic = 0; magic <= 0xff; magic++) {
                    GIF_MAGIC_TRAILER[magic] = (byte) (0xff - magic);
                }

                if (blockBytes.length < XMP_APPLICATION_ID_AND_AUTH_CODE.length
                        + GIF_MAGIC_TRAILER.length) {
                    continue;
                }
                if (!compareBytes(blockBytes, blockBytes.length
                        - GIF_MAGIC_TRAILER.length, GIF_MAGIC_TRAILER, 0,
                        GIF_MAGIC_TRAILER.length)) {
                    throw new ImageReadException(
                            "XMP block in GIF missing magic trailer.");
                }

                // XMP is UTF-8 encoded xml.
                final String xml = new String(
                        blockBytes,
                        XMP_APPLICATION_ID_AND_AUTH_CODE.length,
                        blockBytes.length
                                - (XMP_APPLICATION_ID_AND_AUTH_CODE.length + GIF_MAGIC_TRAILER.length),
                                StandardCharsets.UTF_8);
                result.add(xml);
            }

            if (result.isEmpty()) {
                return null;
            }
            if (result.size() > 1) {
                throw new ImageReadException("More than one XMP Block in GIF.");
            }
            return result.get(0);
        }
    }
}
