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
package org.apache.commons.imaging.formats.icns;

import static org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT;
import static org.apache.commons.imaging.ImagingConstants.PARAM_KEY_VERBOSE;
import static org.apache.commons.imaging.common.BinaryFunctions.read4Bytes;
import static org.apache.commons.imaging.common.BinaryFunctions.readBytes;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.List;

import org.apache.commons.imaging.*;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;

public class IcnsImageParser extends ImageParser {
    static final int ICNS_MAGIC = IcnsType.typeAsInt("icns");
    private static final String DEFAULT_EXTENSION = ".icns";
    private static final String[] ACCEPTED_EXTENSIONS = { ".icns", };

    public IcnsImageParser() {
        super.setByteOrder(ByteOrder.BIG_ENDIAN);
    }

    @Override
    public String getName() {
        return "Apple Icon Image";
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
        return new ImageFormat[] { ImageFormats.ICNS };
    }

    // FIXME should throw UOE
    @Override
    public ImageMetadata getMetadata(final ByteSource byteSource, final Map<String, Object> params) throws ImageReadException, IOException {
        return null;
    }

    @Override
    public ImageInfo getImageInfo(final ByteSource byteSource, Map<String, Object> params) throws ImageReadException, IOException {
        // make copy of params; we'll clear keys as we consume them.
        params = (params == null) ? new HashMap<String, Object>() : new HashMap<>(params);

        if (params.containsKey(PARAM_KEY_VERBOSE)) {
            params.remove(PARAM_KEY_VERBOSE);
        }

        if (!params.isEmpty()) {
            final Object firstKey = params.keySet().iterator().next();
            throw new ImageReadException("Unknown parameter: " + firstKey);
        }

        final IcnsContents contents = readImage(byteSource);
        final List<Map<BufferedImage, IcnsType>> list = IcnsDecoder.decodeAllImages(contents.icnsElements);
        BufferedImage image0 = null;
        if (!list.isEmpty()) {
            for (final Map<BufferedImage, IcnsType> map : list) {
                if (!map.isEmpty()) {
                    final Iterator<BufferedImage> iterator = map.keySet().iterator();
                    if (iterator.hasNext()) {
                        image0 = iterator.next();
                    } else {
                        throw new ImageReadException("No icons in ICNS file");
                    }
                } else {
                    throw new ImageReadException("No icons in ICNS file");
                }
            }
        } else {
            throw new ImageReadException("No icons in ICNS file");
        }

        return new ImageInfo("Icns", 32, new ArrayList<String>(), ImageFormats.ICNS, "ICNS Apple Icon Image", image0.getHeight(), "image/x-icns", list.size(), 0, 0, 0, 0, image0.getWidth(), false, true, false, ImageInfo.ColorType.RGB, ImageInfo.CompressionAlgorithm.UNKNOWN);
    }

    @Override
    public Dimension getImageSize(final ByteSource byteSource, Map<String, Object> params) throws ImageReadException, IOException {
        // make copy of params; we'll clear keys as we consume them.
        params = (params == null) ? new HashMap<String, Object>() : new HashMap<>(params);

        if (params.containsKey(PARAM_KEY_VERBOSE)) {
            params.remove(PARAM_KEY_VERBOSE);
        }

        if (!params.isEmpty()) {
            final Object firstKey = params.keySet().iterator().next();
            throw new ImageReadException("Unknown parameter: " + firstKey);
        }

        final IcnsContents contents = readImage(byteSource);
        final List<Map<BufferedImage, IcnsType>> list = IcnsDecoder.decodeAllImages(contents.icnsElements);
        BufferedImage image0 = null;
        if (!list.isEmpty()) {
            for (final Map<BufferedImage, IcnsType> map : list) {
                if (!map.isEmpty()) {
                    final Iterator<BufferedImage> iterator = map.keySet().iterator();
                    if (iterator.hasNext()) {
                        image0 = iterator.next();
                    } else {
                        throw new ImageReadException("No icons in ICNS file");
                    }
                } else {
                    throw new ImageReadException("No icons in ICNS file");
                }
            }
        } else {
            throw new ImageReadException("No icons in ICNS file");
        }

        return new Dimension(image0.getWidth(), image0.getHeight());
    }

    @Override
    public byte[] getICCProfileBytes(final ByteSource byteSource, final Map<String, Object> params) throws ImageReadException, IOException {
        return null;
    }

    private static class IcnsHeader {
        public final int magic; // Magic literal (4 bytes), always "icns"
        public final int fileSize; // Length of file (4 bytes), in bytes.

        public IcnsHeader(final int magic, final int fileSize) {
            this.magic = magic;
            this.fileSize = fileSize;
        }

        public void dump(final PrintWriter pw) {
            pw.println("IcnsHeader");
            pw.println("Magic: 0x"
                + Integer.toHexString(this.magic)
                + " ("
                + IcnsType.describeType(this.magic)
                + ")");
            pw.println("FileSize: " + this.fileSize);
            pw.println("");
        }
    }

    private IcnsHeader readIcnsHeader(final InputStream is) throws ImageReadException, IOException {
        final int magic = read4Bytes("Magic", is, "Not a Valid ICNS File", getByteOrder());
        final int fileSize = read4Bytes("FileSize", is, "Not a Valid ICNS File", getByteOrder());

        if (magic != ICNS_MAGIC) {
            throw new ImageReadException("Not a Valid ICNS File: " + "magic is 0x" + Integer.toHexString(magic));
        }

        return new IcnsHeader(magic, fileSize);
    }

    static class IcnsElement {
        public final int type;
        public final int elementSize;
        public final byte[] data;

        public IcnsElement(final int type, final int elementSize, final byte[] data) {
            this.type = type;
            this.elementSize = elementSize;
            this.data = data;
        }

        public void dump(final PrintWriter pw) {
            pw.println("IcnsElement");
            final IcnsType icnsType = IcnsType.findAnyType(this.type);
            final String typeDescription;
            if (icnsType == null) {
                typeDescription = "";
            } else {
                typeDescription = " " + icnsType.toString();
            }
            pw.println("Type: 0x"
                + Integer.toHexString(this.type)
                + " ("
                + IcnsType.describeType(this.type)
                + ")"
                + typeDescription);
            pw.println("ElementSize: " + this.elementSize);
            pw.println("");
        }
    }

    private IcnsElement readIcnsElement(final InputStream is) throws IOException {
        final int type = read4Bytes("Type", is, "Not a Valid ICNS File", getByteOrder()); // Icon type
        // (4 bytes)
        final int elementSize = read4Bytes("ElementSize", is, "Not a Valid ICNS File", getByteOrder()); // Length
        // of
        // data
        // (4
        // bytes),
        // in
        // bytes,
        // including
        // this
        // header
        final byte[] data = readBytes("Data", is, elementSize - 8, "Not a Valid ICNS File");

        return new IcnsElement(type, elementSize, data);
    }

    private static class IcnsContents {
        public final IcnsHeader icnsHeader;
        public final IcnsElement[] icnsElements;

        public IcnsContents(final IcnsHeader icnsHeader, final IcnsElement[] icnsElements) {
            super();
            this.icnsHeader = icnsHeader;
            this.icnsElements = icnsElements;
        }
    }

    private IcnsContents readImage(final ByteSource byteSource) throws ImageReadException, IOException {
        try (InputStream is = byteSource.getInputStream()) {
            final IcnsHeader icnsHeader = readIcnsHeader(is);

            final List<IcnsElement> icnsElementList = new ArrayList<>();
            for (int remainingSize = icnsHeader.fileSize - 8; remainingSize > 0;) {
                final IcnsElement icnsElement = readIcnsElement(is);
                icnsElementList.add(icnsElement);
                remainingSize -= icnsElement.elementSize;
            }

            final IcnsElement[] icnsElements = new IcnsElement[icnsElementList.size()];
            for (int i = 0; i < icnsElements.length; i++) {
                icnsElements[i] = icnsElementList.get(i);
            }

            final IcnsContents ret = new IcnsContents(icnsHeader, icnsElements);
            return ret;
        }
    }

    @Override
    public boolean dumpImageFile(final PrintWriter pw, final ByteSource byteSource) throws ImageReadException, IOException {
        final IcnsContents icnsContents = readImage(byteSource);
        icnsContents.icnsHeader.dump(pw);
        for (final IcnsElement icnsElement : icnsContents.icnsElements) {
            icnsElement.dump(pw);
        }
        return true;
    }

    @Override
    public final BufferedImage getBufferedImage(final ByteSource byteSource, final Map<String, Object> params) throws ImageReadException, IOException {
        final IcnsContents icnsContents = readImage(byteSource);
        final List<Map<BufferedImage, IcnsType>> list = IcnsDecoder.decodeAllImages(icnsContents.icnsElements);
        if (!list.isEmpty()) {
            for (final Map<BufferedImage, IcnsType> map : list) {
                if (!map.isEmpty()) {
                    final Iterator<BufferedImage> iterator = map.keySet().iterator();
                    if (iterator.hasNext()) {
                        return iterator.next();
                    }
                }
            }
        }
        throw new ImageReadException("No icons in ICNS file");
    }

    @Override
    public List<BufferedImage> getAllBufferedImages(final ByteSource byteSource) throws ImageReadException, IOException {
        final IcnsContents icnsContents = readImage(byteSource);
        final List<BufferedImage> images = new ArrayList<>();
        final List<Map<BufferedImage, IcnsType>> mapList = IcnsDecoder.decodeAllImages(icnsContents.icnsElements);
        for (final Map<BufferedImage, IcnsType> map : mapList) {
            final Iterator<BufferedImage> iterator = map.keySet().iterator();
            if (iterator.hasNext()) {
                images.add(iterator.next());
                continue;
            }
        }
        return images;
    }

    public List<Map<BufferedImage, IcnsType>> getAllBufferedImagesWithType(final ByteSource byteSource) throws ImageReadException, IOException {
        final IcnsContents icnsContents = readImage(byteSource);
        return IcnsDecoder.decodeAllImages(icnsContents.icnsElements);
    }

    public final List<Map<BufferedImage, IcnsType>> getAllBufferedImagesWithType(final File file) throws ImageReadException, IOException {
        if (!canAcceptExtension(file)) {
            return null;
        }

        return getAllBufferedImagesWithType(new ByteSourceFile(file));
    }

    @Override
    public void writeImage(final BufferedImage src, final OutputStream os, Map<String, Object> params) throws ImageWriteException, IOException {
        // make copy of params; we'll clear keys as we consume them.
        params = (params == null) ? new HashMap<String, Object>() : new HashMap<>(params);

        // clear format key.
        if (params.containsKey(PARAM_KEY_FORMAT)) {
            params.remove(PARAM_KEY_FORMAT);
        }

        if (!params.isEmpty()) {
            final Object firstKey = params.keySet().iterator().next();
            throw new ImageWriteException("Unknown parameter: " + firstKey);
        }

        final IcnsType imageType;
        if (src.getWidth() == 16 && src.getHeight() == 16) {
            imageType = IcnsType.ICNS_16x16_32BIT_IMAGE;
        } else if (src.getWidth() == 32 && src.getHeight() == 32) {
            imageType = IcnsType.ICNS_32x32_32BIT_IMAGE;
        } else if (src.getWidth() == 48 && src.getHeight() == 48) {
            imageType = IcnsType.ICNS_48x48_32BIT_IMAGE;
        } else if (src.getWidth() == 128 && src.getHeight() == 128) {
            imageType = IcnsType.ICNS_128x128_32BIT_IMAGE;
        } else {
            throw new ImageWriteException("Invalid/unsupported source width "
                + src.getWidth()
                + " and height "
                + src.getHeight());
        }

        try (final BinaryOutputStream bos = new BinaryOutputStream(os, ByteOrder.BIG_ENDIAN)) {
            bos.write4Bytes(ICNS_MAGIC);
            bos.write4Bytes(4 + 4 + 4 + 4 + 4
                * imageType.getWidth()
                * imageType.getHeight() + 4 + 4 + imageType.getWidth()
                    * imageType.getHeight());

            bos.write4Bytes(imageType.getType());
            bos.write4Bytes(4 + 4 + 4
                * imageType.getWidth()
                * imageType.getHeight());
            for (int y = 0; y < src.getHeight(); y++) {
                for (int x = 0; x < src.getWidth(); x++) {
                    final int argb = src.getRGB(x, y);
                    bos.write(0);
                    bos.write(argb >> 16);
                    bos.write(argb >> 8);
                    bos.write(argb);
                }
            }

            final IcnsType maskType = IcnsType.find8BPPMaskType(imageType);
            bos.write4Bytes(maskType.getType());
            bos.write4Bytes(4 + 4 + imageType.getWidth() * imageType.getWidth());
            for (int y = 0; y < src.getHeight(); y++) {
                for (int x = 0; x < src.getWidth(); x++) {
                    final int argb = src.getRGB(x, y);
                    bos.write(argb >> 24);
                }
            }
        }
    }

    /**
     * Extracts embedded XML metadata as XML string.
     * <p/>
     *
     * @param byteSource File containing image data.
     * @param params     Map of optional parameters, defined in ImagingConstants.
     * @return Xmp Xml as String, if present. Otherwise, returns null.
     */
    @Override
    public String getXmpXml(final ByteSource byteSource, final Map<String, Object> params) throws ImageReadException, IOException {
        return null;
    }
}
