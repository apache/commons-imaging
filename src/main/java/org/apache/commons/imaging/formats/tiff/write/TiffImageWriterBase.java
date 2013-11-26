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
package org.apache.commons.imaging.formats.tiff.write;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.PixelDensity;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.PackBits;
import org.apache.commons.imaging.common.RationalNumber;
import org.apache.commons.imaging.common.itu_t4.T4AndT6Compression;
import org.apache.commons.imaging.common.mylzw.MyLzwCompressor;
import org.apache.commons.imaging.formats.tiff.TiffElement;
import org.apache.commons.imaging.formats.tiff.TiffImageData;
import org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;

public abstract class TiffImageWriterBase implements TiffConstants {

    protected final ByteOrder byteOrder;

    public TiffImageWriterBase() {
        this.byteOrder = DEFAULT_TIFF_BYTE_ORDER;
    }

    public TiffImageWriterBase(final ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
    }

    protected static int imageDataPaddingLength(final int dataLength) {
        return (4 - (dataLength % 4)) % 4;
    }

    public abstract void write(OutputStream os, TiffOutputSet outputSet)
            throws IOException, ImageWriteException;

    protected TiffOutputSummary validateDirectories(final TiffOutputSet outputSet)
            throws ImageWriteException {
        final List<TiffOutputDirectory> directories = outputSet.getDirectories();

        if (directories.isEmpty()) { 
            throw new ImageWriteException("No directories.");
        }

        TiffOutputDirectory exifDirectory = null;
        TiffOutputDirectory gpsDirectory = null;
        TiffOutputDirectory interoperabilityDirectory = null;
        TiffOutputField exifDirectoryOffsetField = null;
        TiffOutputField gpsDirectoryOffsetField = null;
        TiffOutputField interoperabilityDirectoryOffsetField = null;

        final List<Integer> directoryIndices = new ArrayList<Integer>();
        final Map<Integer, TiffOutputDirectory> directoryTypeMap = new HashMap<Integer, TiffOutputDirectory>();
        for (TiffOutputDirectory directory : directories) {
            final int dirType = directory.type;
            directoryTypeMap.put(dirType, directory);
            // Debug.debug("validating dirType", dirType + " ("
            // + directory.getFields().size() + " fields)");

            if (dirType < 0) {
                switch (dirType) {
                    case DIRECTORY_TYPE_EXIF:
                        if (exifDirectory != null) {
                            throw new ImageWriteException(
                                    "More than one EXIF directory.");
                        }
                        exifDirectory = directory;
                        break;

                    case DIRECTORY_TYPE_GPS:
                        if (gpsDirectory != null) {
                            throw new ImageWriteException(
                                    "More than one GPS directory.");
                        }
                        gpsDirectory = directory;
                        break;

                    case DIRECTORY_TYPE_INTEROPERABILITY:
                        if (interoperabilityDirectory != null) {
                            throw new ImageWriteException(
                                    "More than one Interoperability directory.");
                        }
                        interoperabilityDirectory = directory;
                        break;
                    default:
                        throw new ImageWriteException("Unknown directory: "
                                + dirType);
                }
            } else {
                if (directoryIndices.contains(dirType)) {
                    throw new ImageWriteException(
                            "More than one directory with index: " + dirType
                                    + ".");
                }
                directoryIndices.add(dirType);
                // dirMap.put(arg0, arg1)
            }

            final HashSet<Integer> fieldTags = new HashSet<Integer>();
            final List<TiffOutputField> fields = directory.getFields();
            for (TiffOutputField field : fields) {
                if (fieldTags.contains(field.tag)) {
                    throw new ImageWriteException("Tag ("
                            + field.tagInfo.getDescription()
                            + ") appears twice in directory.");
                }
                fieldTags.add(field.tag);

                if (field.tag == ExifTagConstants.EXIF_TAG_EXIF_OFFSET.tag) {
                    if (exifDirectoryOffsetField != null) {
                        throw new ImageWriteException(
                                "More than one Exif directory offset field.");
                    }
                    exifDirectoryOffsetField = field;
                } else if (field.tag == ExifTagConstants.EXIF_TAG_INTEROP_OFFSET.tag) {
                    if (interoperabilityDirectoryOffsetField != null) {
                        throw new ImageWriteException(
                                "More than one Interoperability directory offset field.");
                    }
                    interoperabilityDirectoryOffsetField = field;
                } else if (field.tag == ExifTagConstants.EXIF_TAG_GPSINFO.tag) {
                    if (gpsDirectoryOffsetField != null) {
                        throw new ImageWriteException(
                                "More than one GPS directory offset field.");
                    }
                    gpsDirectoryOffsetField = field;
                }
            }
            // directory.
        }

        if (directoryIndices.isEmpty()) {
            throw new ImageWriteException("Missing root directory.");
        }

        // "normal" TIFF directories should have continous indices starting with
        // 0, ie. 0, 1, 2...
        Collections.sort(directoryIndices);

        TiffOutputDirectory previousDirectory = null;
        for (int i = 0; i < directoryIndices.size(); i++) {
            final Integer index = directoryIndices.get(i);
            if (index != i) {
                throw new ImageWriteException("Missing directory: " + i + ".");
            }

            // set up chain of directory references for "normal" directories.
            final TiffOutputDirectory directory = directoryTypeMap.get(index);
            if (null != previousDirectory) {
                previousDirectory.setNextDirectory(directory);
            }
            previousDirectory = directory;
        }

        final TiffOutputDirectory rootDirectory = directoryTypeMap
                .get(DIRECTORY_TYPE_ROOT);

        // prepare results
        final TiffOutputSummary result = new TiffOutputSummary(byteOrder,
                rootDirectory, directoryTypeMap);

        if (interoperabilityDirectory == null
                && interoperabilityDirectoryOffsetField != null) {
            // perhaps we should just discard field?
            throw new ImageWriteException(
                    "Output set has Interoperability Directory Offset field, but no Interoperability Directory");
        } else if (interoperabilityDirectory != null) {
            if (exifDirectory == null) {
                exifDirectory = outputSet.addExifDirectory();
            }

            if (interoperabilityDirectoryOffsetField == null) {
                interoperabilityDirectoryOffsetField =
                        TiffOutputField.createOffsetField(
                                ExifTagConstants.EXIF_TAG_INTEROP_OFFSET,
                                byteOrder);
                exifDirectory.add(interoperabilityDirectoryOffsetField);
            }

            result.add(interoperabilityDirectory,
                    interoperabilityDirectoryOffsetField);
        }

        // make sure offset fields and offset'd directories correspond.
        if (exifDirectory == null && exifDirectoryOffsetField != null) {
            // perhaps we should just discard field?
            throw new ImageWriteException(
                    "Output set has Exif Directory Offset field, but no Exif Directory");
        } else if (exifDirectory != null) {
            if (exifDirectoryOffsetField == null) {
                exifDirectoryOffsetField = TiffOutputField.createOffsetField(
                        ExifTagConstants.EXIF_TAG_EXIF_OFFSET, byteOrder);
                rootDirectory.add(exifDirectoryOffsetField);
            }

            result.add(exifDirectory, exifDirectoryOffsetField);
        }

        if (gpsDirectory == null && gpsDirectoryOffsetField != null) {
            // perhaps we should just discard field?
            throw new ImageWriteException(
                    "Output set has GPS Directory Offset field, but no GPS Directory");
        } else if (gpsDirectory != null) {
            if (gpsDirectoryOffsetField == null) {
                gpsDirectoryOffsetField = TiffOutputField.createOffsetField(
                        ExifTagConstants.EXIF_TAG_GPSINFO, byteOrder);
                rootDirectory.add(gpsDirectoryOffsetField);
            }

            result.add(gpsDirectory, gpsDirectoryOffsetField);
        }

        return result;

        // Debug.debug();
    }

    public void writeImage(final BufferedImage src, final OutputStream os, Map<String,Object> params)
            throws ImageWriteException, IOException {
        // make copy of params; we'll clear keys as we consume them.
        params = new HashMap<String,Object>(params);

        // clear format key.
        if (params.containsKey(PARAM_KEY_FORMAT)) {
            params.remove(PARAM_KEY_FORMAT);
        }

        TiffOutputSet userExif = null;
        if (params.containsKey(PARAM_KEY_EXIF)) {
            userExif = (TiffOutputSet) params.remove(PARAM_KEY_EXIF);
        }

        String xmpXml = null;
        if (params.containsKey(PARAM_KEY_XMP_XML)) {
            xmpXml = (String) params.get(PARAM_KEY_XMP_XML);
            params.remove(PARAM_KEY_XMP_XML);
        }

        PixelDensity pixelDensity = (PixelDensity) params
                .remove(PARAM_KEY_PIXEL_DENSITY);
        if (pixelDensity == null) {
            pixelDensity = PixelDensity.createFromPixelsPerInch(72, 72);
        }

        final int width = src.getWidth();
        final int height = src.getHeight();

        int compression = TIFF_COMPRESSION_LZW; // LZW is default
        if (params.containsKey(PARAM_KEY_COMPRESSION)) {
            final Object value = params.get(PARAM_KEY_COMPRESSION);
            if (value != null) {
                if (!(value instanceof Number)) {
                    throw new ImageWriteException(
                            "Invalid compression parameter: " + value);
                }
                compression = ((Number) value).intValue();
            }
            params.remove(PARAM_KEY_COMPRESSION);
        }
        final HashMap<String,Object> rawParams = new HashMap<String,Object>(params);
        params.remove(PARAM_KEY_T4_OPTIONS);
        params.remove(PARAM_KEY_T6_OPTIONS);
        if (!params.isEmpty()) {
            final Object firstKey = params.keySet().iterator().next();
            throw new ImageWriteException("Unknown parameter: " + firstKey);
        }

        int samplesPerPixel;
        int bitsPerSample;
        int photometricInterpretation;
        if (compression == TIFF_COMPRESSION_CCITT_1D
                || compression == TIFF_COMPRESSION_CCITT_GROUP_3
                || compression == TIFF_COMPRESSION_CCITT_GROUP_4) {
            samplesPerPixel = 1;
            bitsPerSample = 1;
            photometricInterpretation = 0;
        } else {
            samplesPerPixel = 3;
            bitsPerSample = 8;
            photometricInterpretation = 2;
        }

        int rowsPerStrip = 64000 / (width * bitsPerSample * samplesPerPixel); // TODO:
        rowsPerStrip = Math.max(1, rowsPerStrip); // must have at least one.

        final byte[][] strips = getStrips(src, samplesPerPixel, bitsPerSample, rowsPerStrip);

        // System.out.println("width: " + width);
        // System.out.println("height: " + height);
        // System.out.println("fRowsPerStrip: " + fRowsPerStrip);
        // System.out.println("fSamplesPerPixel: " + fSamplesPerPixel);
        // System.out.println("stripCount: " + stripCount);

        int t4Options = 0;
        int t6Options = 0;
        if (compression == TIFF_COMPRESSION_CCITT_1D) {
            for (int i = 0; i < strips.length; i++) {
                strips[i] = T4AndT6Compression.compressModifiedHuffman(
                        strips[i], width, strips[i].length / ((width + 7) / 8));
            }
        } else if (compression == TIFF_COMPRESSION_CCITT_GROUP_3) {
            final Integer t4Parameter = (Integer) rawParams.get(PARAM_KEY_T4_OPTIONS);
            if (t4Parameter != null) {
                t4Options = t4Parameter.intValue();
            }
            t4Options &= 0x7;
            final boolean is2D = (t4Options & 1) != 0;
            final boolean usesUncompressedMode = (t4Options & 2) != 0;
            if (usesUncompressedMode) {
                throw new ImageWriteException(
                        "T.4 compression with the uncompressed mode extension is not yet supported");
            }
            final boolean hasFillBitsBeforeEOL = (t4Options & 4) != 0;
            for (int i = 0; i < strips.length; i++) {
                if (is2D) {
                    strips[i] = T4AndT6Compression.compressT4_2D(strips[i],
                            width, strips[i].length / ((width + 7) / 8),
                            hasFillBitsBeforeEOL, rowsPerStrip);
                } else {
                    strips[i] = T4AndT6Compression.compressT4_1D(strips[i],
                            width, strips[i].length / ((width + 7) / 8),
                            hasFillBitsBeforeEOL);
                }
            }
        } else if (compression == TIFF_COMPRESSION_CCITT_GROUP_4) {
            final Integer t6Parameter = (Integer) rawParams.get(PARAM_KEY_T6_OPTIONS);
            if (t6Parameter != null) {
                t6Options = t6Parameter.intValue();
            }
            t6Options &= 0x4;
            final boolean usesUncompressedMode = (t6Options & TIFF_FLAG_T6_OPTIONS_UNCOMPRESSED_MODE) != 0;
            if (usesUncompressedMode) {
                throw new ImageWriteException(
                        "T.6 compression with the uncompressed mode extension is not yet supported");
            }
            for (int i = 0; i < strips.length; i++) {
                strips[i] = T4AndT6Compression.compressT6(strips[i], width,
                        strips[i].length / ((width + 7) / 8));
            }
        } else if (compression == TIFF_COMPRESSION_PACKBITS) {
            for (int i = 0; i < strips.length; i++) {
                strips[i] = new PackBits().compress(strips[i]);
            }
        } else if (compression == TIFF_COMPRESSION_LZW) {
            for (int i = 0; i < strips.length; i++) {
                final byte[] uncompressed = strips[i];

                final int LZW_MINIMUM_CODE_SIZE = 8;

                final MyLzwCompressor compressor = new MyLzwCompressor(
                        LZW_MINIMUM_CODE_SIZE, ByteOrder.BIG_ENDIAN, true);
                final byte[] compressed = compressor.compress(uncompressed);

                strips[i] = compressed;
            }
        } else if (compression == TIFF_COMPRESSION_UNCOMPRESSED) {
            // do nothing.
        } else {
            throw new ImageWriteException(
                    "Invalid compression parameter (Only CCITT 1D/Group 3/Group 4, LZW, Packbits and uncompressed supported).");
        }

        final TiffElement.DataElement[] imageData = new TiffElement.DataElement[strips.length];
        for (int i = 0; i < strips.length; i++) {
            imageData[i] = new TiffImageData.Data(0, strips[i].length, strips[i]);
        }

        final TiffOutputSet outputSet = new TiffOutputSet(byteOrder);
        final TiffOutputDirectory directory = outputSet.addRootDirectory();

        // WriteField stripOffsetsField;

        {

            directory.add(TiffTagConstants.TIFF_TAG_IMAGE_WIDTH, width);
            directory.add(TiffTagConstants.TIFF_TAG_IMAGE_LENGTH, height);
            directory.add(TiffTagConstants.TIFF_TAG_PHOTOMETRIC_INTERPRETATION,
                    (short) photometricInterpretation);
            directory.add(TiffTagConstants.TIFF_TAG_COMPRESSION,
                    (short) compression);
            directory.add(TiffTagConstants.TIFF_TAG_SAMPLES_PER_PIXEL,
                    (short) samplesPerPixel);

            if (samplesPerPixel == 3) {
                directory.add(TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE,
                        (short) bitsPerSample, (short) bitsPerSample,
                        (short) bitsPerSample);
            } else if (samplesPerPixel == 1) {
                directory.add(TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE,
                        (short) bitsPerSample);
            }
            // {
            // stripOffsetsField = new WriteField(TIFF_TAG_STRIP_OFFSETS,
            // FIELD_TYPE_LONG, stripOffsets.length, FIELD_TYPE_LONG
            // .writeData(stripOffsets, byteOrder));
            // directory.add(stripOffsetsField);
            // }
            // {
            // WriteField field = new WriteField(TIFF_TAG_STRIP_BYTE_COUNTS,
            // FIELD_TYPE_LONG, stripByteCounts.length,
            // FIELD_TYPE_LONG.writeData(stripByteCounts,
            // WRITE_BYTE_ORDER));
            // directory.add(field);
            // }
            directory.add(TiffTagConstants.TIFF_TAG_ROWS_PER_STRIP,
                    rowsPerStrip);
            if (pixelDensity.isUnitless()) {
                directory.add(TiffTagConstants.TIFF_TAG_RESOLUTION_UNIT,
                        (short) 0);
                directory.add(TiffTagConstants.TIFF_TAG_XRESOLUTION,
                        RationalNumber.valueOf(pixelDensity.getRawHorizontalDensity()));
                directory.add(TiffTagConstants.TIFF_TAG_YRESOLUTION, 
                        RationalNumber.valueOf(pixelDensity.getRawVerticalDensity()));
            } else if (pixelDensity.isInInches()) {
                directory.add(TiffTagConstants.TIFF_TAG_RESOLUTION_UNIT,
                        (short) 2);
                directory.add(TiffTagConstants.TIFF_TAG_XRESOLUTION,
                        RationalNumber.valueOf(pixelDensity.horizontalDensityInches()));
                directory.add(TiffTagConstants.TIFF_TAG_YRESOLUTION,
                        RationalNumber.valueOf(pixelDensity.verticalDensityInches()));
            } else {
                directory.add(TiffTagConstants.TIFF_TAG_RESOLUTION_UNIT,
                        (short) 1);
                directory.add(TiffTagConstants.TIFF_TAG_XRESOLUTION,
                        RationalNumber.valueOf(pixelDensity.horizontalDensityCentimetres()));
                directory.add(TiffTagConstants.TIFF_TAG_YRESOLUTION,
                        RationalNumber.valueOf(pixelDensity.verticalDensityCentimetres()));
            }
            if (t4Options != 0) {
                directory.add(TiffTagConstants.TIFF_TAG_T4_OPTIONS, t4Options);
            }
            if (t6Options != 0) {
                directory.add(TiffTagConstants.TIFF_TAG_T6_OPTIONS, t6Options);
            }

            if (null != xmpXml) {
                final byte[] xmpXmlBytes = xmpXml.getBytes("utf-8");
                directory.add(TiffTagConstants.TIFF_TAG_XMP, xmpXmlBytes);
            }

        }

        final TiffImageData tiffImageData = new TiffImageData.Strips(imageData,
                rowsPerStrip);
        directory.setTiffImageData(tiffImageData);

        if (userExif != null) {
            combineUserExifIntoFinalExif(userExif, outputSet);
        }

        write(os, outputSet);
    }

    private void combineUserExifIntoFinalExif(final TiffOutputSet userExif,
            final TiffOutputSet outputSet) throws ImageWriteException {
        final List<TiffOutputDirectory> outputDirectories = outputSet
                .getDirectories();
        Collections.sort(outputDirectories, TiffOutputDirectory.COMPARATOR);
        for (final TiffOutputDirectory userDirectory : userExif.getDirectories()) {
            final int location = Collections.binarySearch(outputDirectories,
                    userDirectory, TiffOutputDirectory.COMPARATOR);
            if (location < 0) {
                outputSet.addDirectory(userDirectory);
            } else {
                final TiffOutputDirectory outputDirectory = outputDirectories
                        .get(location);
                for (final TiffOutputField userField : userDirectory.getFields()) {
                    if (outputDirectory.findField(userField.tagInfo) == null) {
                        outputDirectory.add(userField);
                    }
                }
            }
        }
    }

    private byte[][] getStrips(final BufferedImage src, final int samplesPerPixel,
            final int bitsPerSample, final int rowsPerStrip) {
        final int width = src.getWidth();
        final int height = src.getHeight();

        final int stripCount = (height + rowsPerStrip - 1) / rowsPerStrip;

        byte[][] result;
        { // Write Strips
            result = new byte[stripCount][];

            int remaining_rows = height;

            for (int i = 0; i < stripCount; i++) {
                final int rowsInStrip = Math.min(rowsPerStrip, remaining_rows);
                remaining_rows -= rowsInStrip;

                final int bitsInRow = bitsPerSample * samplesPerPixel * width;
                final int bytesPerRow = (bitsInRow + 7) / 8;
                final int bytesInStrip = rowsInStrip * bytesPerRow;

                final byte[] uncompressed = new byte[bytesInStrip];

                int counter = 0;
                int y = i * rowsPerStrip;
                final int stop = i * rowsPerStrip + rowsPerStrip;

                for (; (y < height) && (y < stop); y++) {
                    int bitCache = 0;
                    int bitsInCache = 0;
                    for (int x = 0; x < width; x++) {
                        final int rgb = src.getRGB(x, y);
                        final int red = 0xff & (rgb >> 16);
                        final int green = 0xff & (rgb >> 8);
                        final int blue = 0xff & (rgb >> 0);

                        if (bitsPerSample == 1) {
                            int sample = (red + green + blue) / 3;
                            if (sample > 127) {
                                sample = 0;
                            } else {
                                sample = 1;
                            }
                            bitCache <<= 1;
                            bitCache |= sample;
                            bitsInCache++;
                            if (bitsInCache == 8) {
                                uncompressed[counter++] = (byte) bitCache;
                                bitCache = 0;
                                bitsInCache = 0;
                            }
                        } else {
                            uncompressed[counter++] = (byte) red;
                            uncompressed[counter++] = (byte) green;
                            uncompressed[counter++] = (byte) blue;
                        }
                    }
                    if (bitsInCache > 0) {
                        bitCache <<= (8 - bitsInCache);
                        uncompressed[counter++] = (byte) bitCache;
                    }
                }

                result[i] = uncompressed;
            }

        }

        return result;
    }

    protected void writeImageFileHeader(final BinaryOutputStream bos)
            throws IOException {
        final int offsetToFirstIFD = TIFF_HEADER_SIZE;

        writeImageFileHeader(bos, offsetToFirstIFD);
    }

    protected void writeImageFileHeader(final BinaryOutputStream bos,
            final long offsetToFirstIFD) throws IOException {
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            bos.write('I');
            bos.write('I');
        } else {
            bos.write('M');
            bos.write('M');
        }

        bos.write2Bytes(42); // tiffVersion

        bos.write4Bytes((int)offsetToFirstIFD);
    }

}
