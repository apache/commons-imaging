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
package org.apache.commons.imaging.examples.tiff;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Formatter;
import org.apache.commons.imaging.FormatCompliance;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.formats.tiff.TiffContents;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.TiffReader;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_COMPRESSION_CCITT_1D;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_COMPRESSION_CCITT_GROUP_3;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_COMPRESSION_CCITT_GROUP_4;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_COMPRESSION_DEFLATE_ADOBE;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_COMPRESSION_DEFLATE_PKZIP;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_COMPRESSION_LZW;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_COMPRESSION_PACKBITS;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_COMPRESSION_UNCOMPRESSED;
import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.TIFF_COMPRESSION_UNCOMPRESSED_1;
import org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;

/**
 * Provides methods to collect data for a tiff file. This class is intended for
 * use with
 * SurveyTiffFolder, though it could be integrated into other applications.
 */
public class SurveyTiffFile {

    public String surveyFile(File file, boolean csv) throws ImageReadException, IOException {
        String delimiter = "  ";
        if (csv) {
            delimiter = ", ";
        }

        StringBuilder sb = new StringBuilder();
        Formatter fmt = new Formatter(sb);

        // Establish a TiffReader. This is just a simple constructor that
        // does not actually access the file.  So the application cannot
        // obtain the byteOrder, or other details, until the contents have
        // been read.  Then read the directories associated with the
        // file by passing in the byte source and options.
        ByteSourceFile byteSource = new ByteSourceFile(file);
        TiffReader tiffReader = new TiffReader(true);
        TiffContents contents = tiffReader.readDirectories(
            byteSource,
            false, // read image data, if present
            FormatCompliance.getDefault());

        if (contents.directories.isEmpty()) {
            throw new ImageReadException("No Image File Directory (IFD) found");
        }
        TiffDirectory directory = contents.directories.get(0);

        // Get the metadata (Tags) and write them to standard output
        boolean hasTiffImageData = directory.hasTiffImageData();
        if (!hasTiffImageData) {
            throw new ImageReadException("No image data in file");
        }

        final int width = directory.getSingleFieldValue(TiffTagConstants.TIFF_TAG_IMAGE_WIDTH);
        final int height = directory.getSingleFieldValue(TiffTagConstants.TIFF_TAG_IMAGE_LENGTH);

        int samplesPerPixel = 1;
        final TiffField samplesPerPixelField = directory.findField(
            TiffTagConstants.TIFF_TAG_SAMPLES_PER_PIXEL);
        if (samplesPerPixelField != null) {
            samplesPerPixel = samplesPerPixelField.getIntValue();
        }
        int[] bitsPerSample = {1};
        int bitsPerPixel = samplesPerPixel;
        final TiffField bitsPerSampleField = directory.findField(
            TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE);
        if (bitsPerSampleField != null) {
            bitsPerSample = bitsPerSampleField.getIntArrayValue();
            bitsPerPixel = bitsPerSampleField.getIntValueOrArraySum();
        }
        if (samplesPerPixel != bitsPerSample.length) {
            throw new ImageReadException("Tiff: samplesPerPixel ("
                + samplesPerPixel + ")!=fBitsPerSample.length ("
                + bitsPerSample.length + ")");
        }

        int rowsPerStrip = 0;
        int tileWidth = 0;
        int tileHeight = 0;

        boolean imageDataInStrips = directory.imageDataInStrips();
        if (imageDataInStrips) {
            final TiffField rowsPerStripField
                = directory.findField(TiffTagConstants.TIFF_TAG_ROWS_PER_STRIP);
            rowsPerStrip = Integer.MAX_VALUE;
            if (null != rowsPerStripField) {
                rowsPerStrip = rowsPerStripField.getIntValue();
            } else {
                final TiffField imageHeight = directory.findField(TiffTagConstants.TIFF_TAG_IMAGE_LENGTH);
                /*
                 * if rows per strip not present then rowsPerStrip is equal to
                 * imageLength or an infinity value;
                 */
                if (imageHeight != null) {
                    rowsPerStrip = imageHeight.getIntValue();
                }
            }
        } else {
            final TiffField tileWidthField = directory.findField(TiffTagConstants.TIFF_TAG_TILE_WIDTH);
            if (null == tileWidthField) {
                throw new ImageReadException("Can't find tile width field.");
            }
            tileWidth = tileWidthField.getIntValue();
            final TiffField tileLengthField = directory.findField(TiffTagConstants.TIFF_TAG_TILE_LENGTH);
            if (null == tileLengthField) {
                throw new ImageReadException("Can't find tile length field.");
            }
            tileHeight = tileLengthField.getIntValue();
        }

        String compressionString = getCompressionString(directory);
        String predictorString = getPredictorString(directory);
        String planarConfigurationString = getPlanarConfigurationString(directory);
        String bitsPerSampleString = getBitsPerSampleString(bitsPerSample);
        String sampleFmtString = getSampleFormatString(directory);
        String piString = getPhotometricInterpreterString(directory, bitsPerSample);
        String iccString = getIccProfileString(directory);

        fmt.format("%s%4dx%-4d", delimiter, width, height);
        if (imageDataInStrips) {
            fmt.format("%sStrips%s%4dx%-4d", delimiter, delimiter, width, rowsPerStrip);
        } else {
            fmt.format("%sTiles %s%4dx%-4d", delimiter, delimiter, tileWidth, tileHeight);
        }

        fmt.format("%s%s", delimiter, planarConfigurationString);
        fmt.format("%s%-8s", delimiter, compressionString);
        fmt.format("%s%-7s", delimiter, predictorString);
        fmt.format("%s%-8s", delimiter, sampleFmtString);
        fmt.format("%s%3d", delimiter, bitsPerPixel);
        fmt.format("%s%-7s", delimiter, bitsPerSampleString);
        fmt.format("%s%-9s", delimiter, piString);
        fmt.format("%s%-7s", delimiter, iccString);

        if (csv) {
            return trimForCsv(sb);
        }
        return sb.toString();
    }

    private String getCompressionString(TiffDirectory directory) throws ImageReadException {
        final short compressionFieldValue;
        if (directory.findField(TiffTagConstants.TIFF_TAG_COMPRESSION) != null) {
            compressionFieldValue
                = directory.getFieldValue(TiffTagConstants.TIFF_TAG_COMPRESSION);
        } else {
            compressionFieldValue = TIFF_COMPRESSION_UNCOMPRESSED_1;
        }
        final int compression = 0xffff & compressionFieldValue;
        switch (compression) {
            case TIFF_COMPRESSION_UNCOMPRESSED: // None;
                return "None";
            case TIFF_COMPRESSION_CCITT_1D: // CCITT Group 3 1-Dimensional Modified
                // Huffman run-length encoding.
                return "CCITT_1D";
            case TIFF_COMPRESSION_CCITT_GROUP_3:
                return "CCITT_3";
            case TIFF_COMPRESSION_CCITT_GROUP_4:
                return "CCITT_4";
            case TIFF_COMPRESSION_LZW:
                return "LZW";
            case TIFF_COMPRESSION_PACKBITS:
                return "PACKBITS";
            case TIFF_COMPRESSION_DEFLATE_ADOBE:
            case TIFF_COMPRESSION_DEFLATE_PKZIP:
                return "Deflate";
            default:
                return "None";
        }
    }

    String getPredictorString(TiffDirectory directory) throws ImageReadException {
        int predictor = -1;

        final TiffField predictorField = directory.findField(
            TiffTagConstants.TIFF_TAG_PREDICTOR);
        if (null != predictorField) {
            predictor = predictorField.getIntValueOrArraySum();
        }

        switch (predictor) {
            case TiffTagConstants.PREDICTOR_VALUE_HORIZONTAL_DIFFERENCING:
                return "Diff";
            case TiffTagConstants.PREDICTOR_VALUE_FLOATING_POINT_DIFFERENCING:
                return "FP Diff";
            default:
                return "None";

        }
    }

    String getSampleFormatString(TiffDirectory directory) throws ImageReadException {
        short[] sSampleFmt = directory.getFieldValue(
            TiffTagConstants.TIFF_TAG_SAMPLE_FORMAT, false);
        if (sSampleFmt == null || sSampleFmt.length == 0) {
            return "Unknown";
        }
        String heterogeneous = "";
        for (int i = 1; i < sSampleFmt.length; i++) {
            if (sSampleFmt[i] != sSampleFmt[0]) {
                heterogeneous = "*";
                break;
            }
        }
        int test = sSampleFmt[0];
        switch (test) {
            case TiffTagConstants.SAMPLE_FORMAT_VALUE_COMPLEX_INTEGER:
                return "Comp I" + heterogeneous;
            case TiffTagConstants.SAMPLE_FORMAT_VALUE_IEEE_FLOATING_POINT:
            case TiffTagConstants.SAMPLE_FORMAT_VALUE_IEEE_FLOATING_POINT_1:
                return "Float" + heterogeneous;
            case TiffTagConstants.SAMPLE_FORMAT_VALUE_TWOS_COMPLEMENT_SIGNED_INTEGER:
                return "Sgn Int" + heterogeneous;
            case TiffTagConstants.SAMPLE_FORMAT_VALUE_UNSIGNED_INTEGER:
                return "Uns Int" + heterogeneous;
            default:
                return "Unknown" + heterogeneous;
        }
    }

    String getBitsPerSampleString(int[] bitsPerSample) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < bitsPerSample.length; i++) {
            if (i > 0) {
                s.append(".");
            }
            s.append(Integer.toString(bitsPerSample[i], 10));
        }
        return s.toString();
    }

    private String getPhotometricInterpreterString(TiffDirectory directory, int[] bitsPerSample) throws ImageReadException {
        final int photometricInterpretation = 0xffff & directory.getFieldValue(
            TiffTagConstants.TIFF_TAG_PHOTOMETRIC_INTERPRETATION);

        switch (photometricInterpretation) {
            case 0:
                return "BiLev Inv";
            case 1:
                return "BiLevel";
            case 2:
                String a = "RGB";
                if (bitsPerSample.length == 4) {
                    Object o = directory.getFieldValue(TiffTagConstants.TIFF_TAG_EXTRA_SAMPLES);
                    short extraSamples = 0;
                    if (o instanceof Short) {
                        extraSamples = ((Short) o);
                    }
                    if (extraSamples == 1) {
                        a = "RGB Pre-A";
                    } else {
                        a = "RGBA";
                    }
                }

                return a;
            case 3:
                return "Palette";

            case 5: // CMYK
                return "CMYK";
            case 6:
                return "YCbCr";
            case 8:
                return "CieLab";

            case 32844:
            case 32845:
                return "LogLuv";
            default:
                return "Unknown";

        }

    }

    String getIccProfileString(TiffDirectory directory) throws ImageReadException {
        byte[] b = directory.getFieldValue(TiffEpTagConstants.EXIF_TAG_INTER_COLOR_PROFILE,
            false);
        if (b == null || b.length == 0) {
            return "N";
        }
        return "Y";
    }

    String getPlanarConfigurationString(TiffDirectory directory) throws ImageReadException {

        // Obtain the planar configuration
        final TiffField pcField = directory.findField(
            TiffTagConstants.TIFF_TAG_PLANAR_CONFIGURATION);
        final TiffPlanarConfiguration planarConfiguration
            = pcField == null
                ? TiffPlanarConfiguration.CHUNKY
                : TiffPlanarConfiguration.lenientValueOf(pcField.getIntValue());

        if (planarConfiguration == TiffPlanarConfiguration.CHUNKY) {
            return "Chunky";
        } else {
            return "Planar";
        }
    }

    /**
     * Formats a header allowing space for the maximum length of
     * the file paths in the list. If the comma-separated-value option
     * is set, spaces will be suppressed and commas introduced as separators.
     *
     * @param maxPathLen the maximum length of a file path (used if csv
     * option is not set)
     * @param csv true if formatting is configured for comma-separated-value
     * files.
     * @return a valid string.
     */
    String formatHeader(int maxPathLen, boolean csv) {
        // After some false starts, it turned out that the easiest
        // way to do this is just to create a regular header and then
        // search-and-replace spaces with comma as appropriate.
        int n = maxPathLen;
        if (n < 10) {
            n = 10;
        }
        int k0 = (n - 4) / 2;
        int k1 = (n - 4 - k0);

        String header = String.format(
            "%" + k0 + "sPath%" + k1 + "s%s", "", "",
            "    Size     Layout  Blk_sz     P_conf  Compress  "
            + "Predict  Data_Fmt   B/P B/S      Photo     ICC_Pro");
        if (csv) {
            return reformatHeaderForCsv(header);
        } else {
            return header;
        }
    }

    /**
     * Prints the legend information to the output stream
     *
     * @param ps a valid instance
     */
    void printLegend(PrintStream ps) {
        ps.println("Legend:");
        ps.println("  Size      Size of image (width-by-height)");
        ps.println("  Layout    Organization of the image file (strips versus tiles)");
        ps.println("  Blk_sz    Size of internal image blocks (strips versus tiles)");
        ps.println("  P_conf    Planar configuration, Chunky (interleaved samples) versus Planar ");
        ps.println("  Compress  Compression format");
        ps.println("  Predict   Predictor");
        ps.println("  Data_Fmt  Data format");
        ps.println("  B/P       Bits per pixel");
        ps.println("  B/S       Bits per sample");
        ps.println("  Photo     Photometric Interpretation (pixel color type)");
        ps.println("  ICC_Pro   Is ICC color profile supplied");
        ps.println("");
        ps.println("  RGBA       RGB with unassociated alpha (transparency)");
        ps.println("  RGBA_Pre-A RGB with associated (premultiplied) alpha");
        ps.println("");
    }

    /**
     * Reformats the header inserting commas and removing spaces
     *
     * @param s a valid string
     * @return a header suitable for a CSV file.
     */
    private String reformatHeaderForCsv(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        boolean enableComma = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isWhitespace(c)) {
                if (enableComma) {
                    enableComma = false;
                    sb.append(',');
                }
            } else {
                enableComma = true;
                if (Character.isUpperCase(c)) {
                    c = Character.toLowerCase(c);
                }
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * Trims spaces from a range of characters intended for a CSV output
     *
     * @param source the standard source file
     * @return the equivalent string with spaces removed.
     */
    private String trimForCsv(StringBuilder source) {
        int n = source.length();
        StringBuilder sb = new StringBuilder(n);
        boolean spaceEnabled = false;
        boolean spacePending = false;
        for (int i = 0; i < n; i++) {
            char c = source.charAt(i);
            if (Character.isWhitespace(c)) {
                if (spaceEnabled) {
                    spacePending = true;
                    spaceEnabled = false;
                }
            } else {

                if (Character.isLetter(c) || Character.isDigit(c)) {
                    if (spacePending) {
                        sb.append(' ');
                        spacePending = false;
                    }
                    spaceEnabled = true;
                } else {
                    spacePending = false;
                    spaceEnabled = false;
                }
                sb.append(c);
            }
        }
        n = sb.length();
        if (n > 0 && sb.charAt(n - 1) == ' ') {
            sb.setLength(n - 1);
        }
        return sb.toString();
    }
}
