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

import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_COMPRESSION_CCITT_1D;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_COMPRESSION_CCITT_GROUP_3;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_COMPRESSION_CCITT_GROUP_4;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_COMPRESSION_LZW;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_COMPRESSION_PACKBITS;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_COMPRESSION_UNCOMPRESSED;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_COMPRESSION_DEFLATE_ADOBE;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_FLAG_T6_OPTIONS_UNCOMPRESSED_MODE;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_HEADER_SIZE;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
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
import org.apache.commons.imaging.common.ZlibDeflate;
import org.apache.commons.imaging.formats.tiff.TiffElement;
import org.apache.commons.imaging.formats.tiff.TiffImageData;
import org.apache.commons.imaging.formats.tiff.TiffImagingParameters;
import org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;

public abstract class TiffImageWriterBase {

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

        final List<Integer> directoryIndices = new ArrayList<>();
        final Map<Integer, TiffOutputDirectory> directoryTypeMap = new HashMap<>();
        for (final TiffOutputDirectory directory : directories) {
            final int dirType = directory.type;
            directoryTypeMap.put(dirType, directory);
            // Debug.debug("validating dirType", dirType + " ("
            // + directory.getFields().size() + " fields)");

            if (dirType < 0) {
                switch (dirType) {
                    case TiffDirectoryConstants.DIRECTORY_TYPE_EXIF:
                        if (exifDirectory != null) {
                            throw new ImageWriteException(
                                    "More than one EXIF directory.");
                        }
                        exifDirectory = directory;
                        break;

                    case TiffDirectoryConstants.DIRECTORY_TYPE_GPS:
                        if (gpsDirectory != null) {
                            throw new ImageWriteException(
                                    "More than one GPS directory.");
                        }
                        gpsDirectory = directory;
                        break;

                    case TiffDirectoryConstants.DIRECTORY_TYPE_INTEROPERABILITY:
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

            final HashSet<Integer> fieldTags = new HashSet<>();
            final List<TiffOutputField> fields = directory.getFields();
            for (final TiffOutputField field : fields) {
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

        final TiffOutputDirectory rootDirectory = directoryTypeMap.get(
                TiffDirectoryConstants.DIRECTORY_TYPE_ROOT);

        // prepare results
        final TiffOutputSummary result = new TiffOutputSummary(byteOrder,
                rootDirectory, directoryTypeMap);

        if (interoperabilityDirectory == null
                && interoperabilityDirectoryOffsetField != null) {
            // perhaps we should just discard field?
            throw new ImageWriteException(
                    "Output set has Interoperability Directory Offset field, but no Interoperability Directory");
        }
        if (interoperabilityDirectory != null) {
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
        }
        if (exifDirectory != null) {
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
        }
        if (gpsDirectory != null) {
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

    private static final int MAX_PIXELS_FOR_RGB = 1024*1024;
    /**
     * Check an image to see if any of its pixels are non-opaque.
     * @param src a valid image
     * @return true if at least one non-opaque pixel is found.
     */
    private boolean checkForActualAlpha(final BufferedImage src){
        // to conserve memory, very large images may be read
        // in pieces.
        final int width = src.getWidth();
        final int height = src.getHeight();
        int nRowsPerRead = MAX_PIXELS_FOR_RGB/width;
        if(nRowsPerRead<1){
            nRowsPerRead = 1;
        }
        final int nReads = (height+nRowsPerRead-1)/nRowsPerRead;
        final int []argb = new int[nRowsPerRead*width];
        for(int iRead=0; iRead<nReads; iRead++){
            final int i0 = iRead*nRowsPerRead;
            final int i1 = i0+nRowsPerRead>height? height: i0+nRowsPerRead;
            src.getRGB(0, i0, width, i1-i0, argb, 0, width);
            final int n = (i1-i0)*width;
            for(int i=0; i<n; i++){
                if((argb[i]&0xff000000)!=0xff000000){
                    return true;
                }
            }
        }
        return false;
    }

    private void applyPredictor(final int width, final int bytesPerSample, final byte[] b) {
        final int nBytesPerRow = bytesPerSample * width;
        final int nRows = b.length / nBytesPerRow;
        for (int iRow = 0; iRow < nRows; iRow++) {
            final int offset = iRow * nBytesPerRow;
            for (int i = nBytesPerRow-1; i >= bytesPerSample; i--) {
                b[offset + i] -= b[offset + i - bytesPerSample];
            }
        }
    }

    public void writeImage(final BufferedImage src, final OutputStream os, TiffImagingParameters params)
            throws ImageWriteException, IOException {
        TiffOutputSet userExif = params.getOutputSet();

        String xmpXml = params.getXmpXml();

        PixelDensity pixelDensity = params.getPixelDensity();
        if (pixelDensity == null) {
            pixelDensity = PixelDensity.createFromPixelsPerInch(72, 72);
        }

        final int width = src.getWidth();
        final int height = src.getHeight();

        // If the source image has a color model that supports alpha,
        // this module performs a call to checkForActualAlpha() to see whether
        // the image that was supplied to the API actually contains
        // non-opaque data in its alpha channel. It is common for applications
        // to create a BufferedImage using TYPE_INT_ARGB, and fill the entire
        // image with opaque pixels. In such a case, the file size of the output
        // can be reduced by 25 percent by storing the image in an 3-byte RGB
        // format. This approach will also make a small reduction in the runtime
        // to read the resulting file when it is accessed by an application.
        final ColorModel cModel = src.getColorModel();
        final boolean hasAlpha = cModel.hasAlpha() && checkForActualAlpha(src);


        // 10/2020: In the case of an image with pre-multiplied alpha
        // (what the TIFF specification calls "associated alpha"), the
        // Java getRGB method adjusts the value to a non-premultiplied
        // alpha state.  However, this class could access the pre-multiplied
        // alpha data by obtaining the underlying raster.  At this time,
        // the value of such a little-used feature does not seem
        // commensurate with the complexity of the extra code it would require.

        int compression = TIFF_COMPRESSION_LZW;
        short predictor = TiffTagConstants.PREDICTOR_VALUE_NONE;

        int stripSizeInBits = 64000; // the default from legacy implementation
        Integer compressionParameter = params.getCompression();
        if (compressionParameter != null) {
            compression = compressionParameter;
            final Integer stripSizeInBytes = params.getLzwCompressionBlockSize();
            if (stripSizeInBytes != null) {
                if (stripSizeInBytes < 8000) {
                    throw new ImageWriteException(
                            "Block size parameter " + stripSizeInBytes
                            + " is less than 8000 minimum");
                }
                stripSizeInBits = stripSizeInBytes * 8;
            }
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
            samplesPerPixel = hasAlpha? 4: 3;
            bitsPerSample = 8;
            photometricInterpretation = 2;
        }

        int rowsPerStrip = stripSizeInBits / (width * bitsPerSample * samplesPerPixel);
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
            final Integer t4Parameter = params.getT4Options();
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
            final Integer t6Parameter = params.getT6Options();
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
            predictor =  TiffTagConstants.PREDICTOR_VALUE_HORIZONTAL_DIFFERENCING;
            for (int i = 0; i < strips.length; i++) {
                final byte[] uncompressed = strips[i];
                this.applyPredictor(width, samplesPerPixel, strips[i]);

                final int LZW_MINIMUM_CODE_SIZE = 8;
                final MyLzwCompressor compressor = new MyLzwCompressor(
                        LZW_MINIMUM_CODE_SIZE, ByteOrder.BIG_ENDIAN, true);
                final byte[] compressed = compressor.compress(uncompressed);
                strips[i] = compressed;
            }
        } else if (compression == TIFF_COMPRESSION_DEFLATE_ADOBE) {
            predictor = TiffTagConstants.PREDICTOR_VALUE_HORIZONTAL_DIFFERENCING;
            for (int i = 0; i < strips.length; i++) {
                this.applyPredictor(width, samplesPerPixel, strips[i]);
                strips[i] = ZlibDeflate.compress(strips[i]);
            }
        } else if (compression == TIFF_COMPRESSION_UNCOMPRESSED) {
            // do nothing.
        } else {
            throw new ImageWriteException(
                    "Invalid compression parameter (Only CCITT 1D/Group 3/Group 4, LZW, Packbits, Zlib Deflate and uncompressed supported).");
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

            switch (samplesPerPixel) {
            case 3:
                directory.add(TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE,
                        (short) bitsPerSample, (short) bitsPerSample,
                        (short) bitsPerSample);
                break;
            case 4:
                directory.add(TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE,
                        (short) bitsPerSample, (short) bitsPerSample,
                        (short) bitsPerSample, (short) bitsPerSample);
                directory.add(TiffTagConstants.TIFF_TAG_EXTRA_SAMPLES,
                    (short)TiffTagConstants.EXTRA_SAMPLE_UNASSOCIATED_ALPHA);
                break;
            case 1:
                directory.add(TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE,
                        (short) bitsPerSample);
                break;
            default:
                break;
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
                final byte[] xmpXmlBytes = xmpXml.getBytes(StandardCharsets.UTF_8);
                directory.add(TiffTagConstants.TIFF_TAG_XMP, xmpXmlBytes);
            }

            if(predictor==TiffTagConstants.PREDICTOR_VALUE_HORIZONTAL_DIFFERENCING){
                directory.add(TiffTagConstants.TIFF_TAG_PREDICTOR, predictor);
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
        final List<TiffOutputDirectory> outputDirectories = outputSet.getDirectories();
        outputDirectories.sort(TiffOutputDirectory.COMPARATOR);
        for (final TiffOutputDirectory userDirectory : userExif.getDirectories()) {
            final int location = Collections.binarySearch(outputDirectories,
                    userDirectory, TiffOutputDirectory.COMPARATOR);
            if (location < 0) {
                outputSet.addDirectory(userDirectory);
            } else {
                final TiffOutputDirectory outputDirectory = outputDirectories.get(location);
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

            int remainingRows = height;

            for (int i = 0; i < stripCount; i++) {
                final int rowsInStrip = Math.min(rowsPerStrip, remainingRows);
                remainingRows -= rowsInStrip;

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
                        } else if(samplesPerPixel==4){
                            uncompressed[counter++] = (byte) red;
                            uncompressed[counter++] = (byte) green;
                            uncompressed[counter++] = (byte) blue;
                            uncompressed[counter++] = (byte) (rgb>>24);
                        }else {
                            // samples per pixel is 3
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
        writeImageFileHeader(bos, TIFF_HEADER_SIZE);
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

        bos.write4Bytes((int) offsetToFirstIFD);
    }

}
