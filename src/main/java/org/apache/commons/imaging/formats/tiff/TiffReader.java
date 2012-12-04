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
package org.apache.commons.imaging.formats.tiff;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.FormatCompliance;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.BinaryFileParser;
import org.apache.commons.imaging.common.ByteOrder;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement;
import org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong;
import org.apache.commons.imaging.util.Debug;

public class TiffReader extends BinaryFileParser implements TiffConstants {

    private final boolean strict;

    public TiffReader(boolean strict) {
        this.strict = strict;
    }

    private TiffHeader readTiffHeader(ByteSource byteSource,
            FormatCompliance formatCompliance) throws ImageReadException,
            IOException {
        InputStream is = null;
        try {
            is = byteSource.getInputStream();
            return readTiffHeader(is, formatCompliance);
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
    
    private ByteOrder getTiffByteOrder(int byteOrderByte) throws ImageReadException {
        if (byteOrderByte == 'I') {
            return ByteOrder.INTEL;
        } else if (byteOrderByte == 'M') {
            return ByteOrder.MOTOROLA;
        } else {
            throw new ImageReadException("Invalid TIFF byte order " + (0xff & byteOrderByte));
        }
    }

    private TiffHeader readTiffHeader(InputStream is,
            FormatCompliance formatCompliance) throws ImageReadException,
            IOException {
        int BYTE_ORDER_1 = readByte("BYTE_ORDER_1", is, "Not a Valid TIFF File");
        int BYTE_ORDER_2 = readByte("BYTE_ORDER_2", is, "Not a Valid TIFF File");
        if (BYTE_ORDER_1 != BYTE_ORDER_2) {
            throw new ImageReadException("Byte Order bytes don't match (" + BYTE_ORDER_1
                    + ", " + BYTE_ORDER_2 + ").");
        }
        ByteOrder byteOrder = getTiffByteOrder(BYTE_ORDER_1);
        setByteOrder(byteOrder);

        int tiffVersion = read2Bytes("tiffVersion", is, "Not a Valid TIFF File");
        if (tiffVersion != 42) {
            throw new ImageReadException("Unknown Tiff Version: " + tiffVersion);
        }

        int offsetToFirstIFD = read4Bytes("offsetToFirstIFD", is,
                "Not a Valid TIFF File");

        skipBytes(is, offsetToFirstIFD - 8,
                "Not a Valid TIFF File: couldn't find IFDs");

        if (debug) {
            System.out.println("");
        }

        return new TiffHeader(byteOrder, tiffVersion, offsetToFirstIFD);
    }

    private void readDirectories(ByteSource byteSource,
            FormatCompliance formatCompliance, Listener listener)
            throws ImageReadException, IOException {
        TiffHeader tiffHeader = readTiffHeader(byteSource, formatCompliance);
        if (!listener.setTiffHeader(tiffHeader)) {
            return;
        }

        int offset = tiffHeader.offsetToFirstIFD;
        int dirType = TiffDirectory.DIRECTORY_TYPE_ROOT;

        List<Number> visited = new ArrayList<Number>();
        readDirectory(byteSource, offset, dirType, formatCompliance, listener,
                visited);
    }

    private boolean readDirectory(ByteSource byteSource, int offset,
            int dirType, FormatCompliance formatCompliance, Listener listener,
            List<Number> visited) throws ImageReadException, IOException {
        boolean ignoreNextDirectory = false;
        return readDirectory(byteSource, offset, dirType, formatCompliance,
                listener, ignoreNextDirectory, visited);
    }

    private boolean readDirectory(ByteSource byteSource, int offset,
            int dirType, FormatCompliance formatCompliance, Listener listener,
            boolean ignoreNextDirectory, List<Number> visited)
            throws ImageReadException, IOException {

        // Debug.debug();
        // Debug.debug("dir offset", offset + " (0x" +
        // Integer.toHexString(offset)
        // + ")");
        // Debug.debug("dir key", key);
        // Debug.debug("dir visited", visited);
        // Debug.debug("dirType", dirType);
        // Debug.debug();

        if (visited.contains(offset)) {
            return false;
        }
        visited.add(offset);

        InputStream is = null;
        try {
            if (offset >= byteSource.getLength()) {
                // Debug.debug("skipping invalid directory!");
                return true;
            }

            is = byteSource.getInputStream();
            skipBytes(is, offset);

            List<TiffField> fields = new ArrayList<TiffField>();

            int entryCount;
            try {
                entryCount = read2Bytes("DirectoryEntryCount", is,
                        "Not a Valid TIFF File");
            } catch (IOException e) {
                if (strict) {
                    throw e;
                } else {
                    return true;
                }
            }

            // Debug.debug("entryCount", entryCount);

            for (int i = 0; i < entryCount; i++) {
                int tag = read2Bytes("Tag", is, "Not a Valid TIFF File");
                int type = read2Bytes("Type", is, "Not a Valid TIFF File");
                int length = read4Bytes("Length", is, "Not a Valid TIFF File");

                // Debug.debug("tag*", tag + " (0x" + Integer.toHexString(tag)
                // + ")");

                byte valueOffsetBytes[] = readByteArray("ValueOffset", 4, is,
                        "Not a Valid TIFF File");
                int valueOffset = convertByteArrayToInt("ValueOffset",
                        valueOffsetBytes);

                if (tag == 0) {
                    // skip invalid fields.
                    // These are seen very rarely, but can have invalid value
                    // lengths,
                    // which can cause OOM problems.
                    continue;
                }

                // if (keepField(tag, tags))
                // {
                TiffField field = new TiffField(tag, dirType, type, length,
                        valueOffset, valueOffsetBytes, getByteOrder());
                field.setSortHint(i);

                // Debug.debug("tagInfo", field.tagInfo);

                try {
                    field.fillInValue(byteSource);
                } catch (TiffValueOutsideFileBoundsException valueOutsideFileException) {
                    if (strict) {
                        IOException ioEx = new IOException();
                        ioEx.initCause(valueOutsideFileException);
                        throw ioEx;
                    } else {
                        // corrupt field, ignore it
                        continue;
                    }
                }

                // Debug.debug("\t" + "value", field.getValueDescription());

                fields.add(field);

                if (!listener.addField(field)) {
                    return true;
                }
            }

            int nextDirectoryOffset = read4Bytes("nextDirectoryOffset", is,
                    "Not a Valid TIFF File");
            // Debug.debug("nextDirectoryOffset", nextDirectoryOffset);

            TiffDirectory directory = new TiffDirectory(dirType, fields,
                    offset, nextDirectoryOffset);

            if (listener.readImageData()) {
                if (directory.hasTiffImageData()) {
                    TiffImageData rawImageData = getTiffRawImageData(
                            byteSource, directory);
                    directory.setTiffImageData(rawImageData);
                }
                if (directory.hasJpegImageData()) {
                    JpegImageData rawJpegImageData = getJpegRawImageData(
                            byteSource, directory);
                    directory.setJpegImageData(rawJpegImageData);
                }
            }

            if (!listener.addDirectory(directory)) {
                return true;
            }

            if (listener.readOffsetDirectories()) {
                final TagInfoLong[] offsetFields = {
                        EXIF_TAG_EXIF_OFFSET,
                        EXIF_TAG_GPSINFO,
                        EXIF_TAG_INTEROP_OFFSET
                };
                final int[] directoryTypes = {
                        TiffDirectory.DIRECTORY_TYPE_EXIF,
                        TiffDirectory.DIRECTORY_TYPE_GPS,
                        TiffDirectory.DIRECTORY_TYPE_INTEROPERABILITY
                };
                for (int i = 0; i < offsetFields.length; i++) {
                    TagInfoLong offsetField = offsetFields[i];
                    if (directory.findField(offsetField) != null) {
                        int subDirectoryOffset;
                        int subDirectoryType;
                        boolean subDirectoryRead = false;
                        try {
                            subDirectoryOffset = directory.getSingleFieldValue(offsetField);
                            subDirectoryType = directoryTypes[i];
                            subDirectoryRead = readDirectory(byteSource,
                                    subDirectoryOffset, subDirectoryType,
                                    formatCompliance, listener, true, visited);
    
                        } catch (ImageReadException imageReadException) {
                            if (strict) {
                                throw imageReadException;
                            }
                        }
                        if (!subDirectoryRead) {
                            fields.remove(offsetField);
                        }
                    }
                }
            }

            if (!ignoreNextDirectory && directory.nextDirectoryOffset > 0) {
                // Debug.debug("next dir", directory.nextDirectoryOffset );
                readDirectory(byteSource, directory.nextDirectoryOffset,
                        dirType + 1, formatCompliance, listener, visited);
            }

            return true;
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

    public static interface Listener {
        public boolean setTiffHeader(TiffHeader tiffHeader);

        public boolean addDirectory(TiffDirectory directory);

        public boolean addField(TiffField field);

        public boolean readImageData();

        public boolean readOffsetDirectories();
    }

    private static class Collector implements Listener {
        private TiffHeader tiffHeader = null;
        private final List<TiffDirectory> directories = new ArrayList<TiffDirectory>();
        private final List<TiffField> fields = new ArrayList<TiffField>();
        private final boolean readThumbnails;

        public Collector() {
            this(null);
        }

        public Collector(Map<String,Object> params) {
            boolean readThumbnails = true;
            if (params != null && params.containsKey(PARAM_KEY_READ_THUMBNAILS)) {
                readThumbnails = Boolean.TRUE.equals(params
                        .get(PARAM_KEY_READ_THUMBNAILS));
            }
            this.readThumbnails = readThumbnails;
        }

        public boolean setTiffHeader(TiffHeader tiffHeader) {
            this.tiffHeader = tiffHeader;
            return true;
        }

        public boolean addDirectory(TiffDirectory directory) {
            directories.add(directory);
            return true;
        }

        public boolean addField(TiffField field) {
            fields.add(field);
            return true;
        }

        public boolean readImageData() {
            return readThumbnails;
        }

        public boolean readOffsetDirectories() {
            return true;
        }

        public TiffContents getContents() {
            return new TiffContents(tiffHeader, directories);
        }
    }

    private static class FirstDirectoryCollector extends Collector {
        private final boolean readImageData;

        public FirstDirectoryCollector(final boolean readImageData) {
            this.readImageData = readImageData;
        }

        @Override
        public boolean addDirectory(TiffDirectory directory) {
            super.addDirectory(directory);
            return false;
        }

        @Override
        public boolean readImageData() {
            return readImageData;
        }
    }

    private static class DirectoryCollector extends Collector {
        private final boolean readImageData;

        public DirectoryCollector(final boolean readImageData) {
            this.readImageData = readImageData;
        }

        @Override
        public boolean addDirectory(TiffDirectory directory) {
            super.addDirectory(directory);
            return false;
        }

        @Override
        public boolean readImageData() {
            return readImageData;
        }
    }

    public TiffContents readFirstDirectory(ByteSource byteSource, Map<String,Object> params,
            boolean readImageData, FormatCompliance formatCompliance)
            throws ImageReadException, IOException {
        Collector collector = new FirstDirectoryCollector(readImageData);
        read(byteSource, params, formatCompliance, collector);
        TiffContents contents = collector.getContents();
        if (contents.directories.size() < 1) {
            throw new ImageReadException(
                    "Image did not contain any directories.");
        }
        return contents;
    }

    public TiffContents readDirectories(ByteSource byteSource,
            boolean readImageData, FormatCompliance formatCompliance)
            throws ImageReadException, IOException {
        Collector collector = new Collector(null);
        readDirectories(byteSource, formatCompliance, collector);
        TiffContents contents = collector.getContents();
        if (contents.directories.size() < 1) {
            throw new ImageReadException(
                    "Image did not contain any directories.");
        }
        return contents;
    }

    public TiffContents readContents(ByteSource byteSource, Map<String,Object> params,
            FormatCompliance formatCompliance) throws ImageReadException,
            IOException {

        Collector collector = new Collector(params);
        read(byteSource, params, formatCompliance, collector);
        TiffContents contents = collector.getContents();
        return contents;
    }

    public void read(ByteSource byteSource, Map<String,Object> params,
            FormatCompliance formatCompliance, Listener listener)
            throws ImageReadException, IOException {
        // TiffContents contents =
        readDirectories(byteSource, formatCompliance, listener);
    }

    private TiffImageData getTiffRawImageData(ByteSource byteSource,
            TiffDirectory directory) throws ImageReadException, IOException {

        List<ImageDataElement> elements = directory
                .getTiffRawImageDataElements();
        TiffImageData.Data data[] = new TiffImageData.Data[elements.size()];

        if (byteSource instanceof ByteSourceFile) {
            ByteSourceFile bsf = (ByteSourceFile) byteSource;
            for (int i = 0; i < elements.size(); i++) {
                TiffDirectory.ImageDataElement element = elements.get(i);
                data[i] = new TiffImageData.ByteSourceData(element.offset,
                        element.length, bsf);
            }
        } else {
            for (int i = 0; i < elements.size(); i++) {
                TiffDirectory.ImageDataElement element = elements.get(i);
                byte bytes[] = byteSource.getBlock(element.offset,
                        element.length);
                data[i] = new TiffImageData.Data(element.offset,
                        element.length, bytes);
            }
        }

        if (directory.imageDataInStrips()) {
            TiffField rowsPerStripField = directory
                    .findField(TiffTagConstants.TIFF_TAG_ROWS_PER_STRIP);
            int rowsPerStrip;

            if (null != rowsPerStripField) {
                rowsPerStrip = rowsPerStripField.getIntValue();
            } else {
                TiffField imageHeight = directory
                        .findField(TiffTagConstants.TIFF_TAG_IMAGE_LENGTH);
                /**
                 * if rows per strip not present then rowsPerStrip is equal to
                 * imageLength or an infinity value;
                 */
                rowsPerStrip = imageHeight.getIntValue();
            }

            return new TiffImageData.Strips(data, rowsPerStrip);
        } else {
            TiffField tileWidthField = directory
                    .findField(TiffTagConstants.TIFF_TAG_TILE_WIDTH);
            if (null == tileWidthField) {
                throw new ImageReadException("Can't find tile width field.");
            }
            int tileWidth = tileWidthField.getIntValue();

            TiffField tileLengthField = directory
                    .findField(TiffTagConstants.TIFF_TAG_TILE_LENGTH);
            if (null == tileLengthField) {
                throw new ImageReadException("Can't find tile length field.");
            }
            int tileLength = tileLengthField.getIntValue();

            return new TiffImageData.Tiles(data, tileWidth, tileLength);
        }
    }

    private JpegImageData getJpegRawImageData(ByteSource byteSource,
            TiffDirectory directory) throws ImageReadException, IOException {
        ImageDataElement element = directory.getJpegRawImageDataElement();
        int offset = element.offset;
        int length = element.length;
        // In case the length is not correct, adjust it and check if the last read byte actually is the end of the image
        if (offset + length > byteSource.getLength()) {
            length = (int) byteSource.getLength() - offset;
        }
        byte data[] = byteSource.getBlock(offset, length);
        // check if the last read byte is actually the end of the image data
        if (length < 2 ||
                (((data[data.length - 2] & 0xff) << 8) | (data[data.length - 1] & 0xff)) != JpegConstants.EOIMarker) {
            throw new ImageReadException("JPEG EOI marker could not be found at expected location");
        }
        return new JpegImageData(offset, length, data);
    }

}
