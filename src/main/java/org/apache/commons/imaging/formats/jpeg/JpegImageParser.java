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
package org.apache.commons.imaging.formats.jpeg;

import static org.apache.commons.imaging.common.BinaryFunctions.remainingBytes;
import static org.apache.commons.imaging.common.BinaryFunctions.startsWith;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.XmpEmbeddable;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.formats.jpeg.decoder.JpegDecoder;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcParser;
import org.apache.commons.imaging.formats.jpeg.iptc.PhotoshopApp13Data;
import org.apache.commons.imaging.formats.jpeg.segments.App13Segment;
import org.apache.commons.imaging.formats.jpeg.segments.App14Segment;
import org.apache.commons.imaging.formats.jpeg.segments.App2Segment;
import org.apache.commons.imaging.formats.jpeg.segments.ComSegment;
import org.apache.commons.imaging.formats.jpeg.segments.DqtSegment;
import org.apache.commons.imaging.formats.jpeg.segments.GenericSegment;
import org.apache.commons.imaging.formats.jpeg.segments.JfifSegment;
import org.apache.commons.imaging.formats.jpeg.segments.Segment;
import org.apache.commons.imaging.formats.jpeg.segments.SofnSegment;
import org.apache.commons.imaging.formats.jpeg.segments.UnknownSegment;
import org.apache.commons.imaging.formats.jpeg.xmp.JpegXmpParser;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.formats.tiff.TiffImageParser;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.internal.Debug;

public class JpegImageParser extends ImageParser<JpegImagingParameters> implements XmpEmbeddable<JpegImagingParameters> {

    private static final Logger LOGGER = Logger.getLogger(JpegImageParser.class.getName());

    private static final String DEFAULT_EXTENSION = ".jpg";
    private static final String[] ACCEPTED_EXTENSIONS = { ".jpg", ".jpeg", };

    public JpegImageParser() {
        setByteOrder(ByteOrder.BIG_ENDIAN);
    }

    @Override
    protected ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[] { ImageFormats.JPEG, //
        };
    }

    @Override
    public String getName() {
        return "Jpeg-Custom";
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
    public final BufferedImage getBufferedImage(final ByteSource byteSource,
            final JpegImagingParameters params) throws ImageReadException, IOException {
        final JpegDecoder jpegDecoder = new JpegDecoder();
        return jpegDecoder.decode(byteSource);
    }

    private boolean keepMarker(final int marker, final int[] markers) {
        if (markers == null) {
            return true;
        }

        for (final int marker2 : markers) {
            if (marker2 == marker) {
                return true;
            }
        }

        return false;
    }

    public List<Segment> readSegments(final ByteSource byteSource,
            final int[] markers, final boolean returnAfterFirst,
            final boolean readEverything) throws ImageReadException, IOException {
        final List<Segment> result = new ArrayList<>();
        final JpegImageParser parser = this;
        final int[] sofnSegments = {
                // kJFIFMarker,
                JpegConstants.SOF0_MARKER,
                JpegConstants.SOF1_MARKER,
                JpegConstants.SOF2_MARKER,
                JpegConstants.SOF3_MARKER,
                JpegConstants.SOF5_MARKER,
                JpegConstants.SOF6_MARKER,
                JpegConstants.SOF7_MARKER,
                JpegConstants.SOF9_MARKER,
                JpegConstants.SOF10_MARKER,
                JpegConstants.SOF11_MARKER,
                JpegConstants.SOF13_MARKER,
                JpegConstants.SOF14_MARKER,
                JpegConstants.SOF15_MARKER,
        };

        final JpegUtils.Visitor visitor = new JpegUtils.Visitor() {
            // return false to exit before reading image data.
            @Override
            public boolean beginSOS() {
                return false;
            }

            @Override
            public void visitSOS(final int marker, final byte[] markerBytes,
                    final byte[] imageData) {
                // don't need image data
            }

            // return false to exit traversal.
            @Override
            public boolean visitSegment(final int marker, final byte[] markerBytes,
                    final int markerLength, final byte[] markerLengthBytes,
                    final byte[] segmentData) throws ImageReadException, IOException {
                if (marker == JpegConstants.EOI_MARKER) {
                    return false;
                }

                // Debug.debug("visitSegment marker", marker);
                // // Debug.debug("visitSegment keepMarker(marker, markers)",
                // keepMarker(marker, markers));
                // Debug.debug("visitSegment keepMarker(marker, markers)",
                // keepMarker(marker, markers));

                if (!keepMarker(marker, markers)) {
                    return true;
                }

                switch (marker) {
                case JpegConstants.JPEG_APP13_MARKER:
                    // Debug.debug("app 13 segment data", segmentData.length);
                    result.add(new App13Segment(parser, marker, segmentData));
                    break;
                case JpegConstants.JPEG_APP14_MARKER:
                    result.add(new App14Segment(marker, segmentData));
                    break;
                case JpegConstants.JPEG_APP2_MARKER:
                    result.add(new App2Segment(marker, segmentData));
                    break;
                case JpegConstants.JFIF_MARKER:
                    result.add(new JfifSegment(marker, segmentData));
                    break;
                default:
                    if (Arrays.binarySearch(sofnSegments, marker) >= 0) {
                        result.add(new SofnSegment(marker, segmentData));
                    } else if (marker == JpegConstants.DQT_MARKER) {
                        result.add(new DqtSegment(marker, segmentData));
                    } else if ((marker >= JpegConstants.JPEG_APP1_MARKER)
                            && (marker <= JpegConstants.JPEG_APP15_MARKER)) {
                        result.add(new UnknownSegment(marker, segmentData));
                    } else if (marker == JpegConstants.COM_MARKER) {
                        result.add(new ComSegment(marker, segmentData));
                    }
                    break;
                }

                if (returnAfterFirst) {
                    return false;
                }

                return true;
            }
        };

        new JpegUtils().traverseJFIF(byteSource, visitor);

        return result;
    }

    private byte[] assembleSegments(final List<App2Segment> segments) throws ImageReadException {
        try {
            return assembleSegments(segments, false);
        } catch (final ImageReadException e) {
            return assembleSegments(segments, true);
        }
    }

    private byte[] assembleSegments(final List<App2Segment> segments, final boolean startWithZero)
            throws ImageReadException {
        if (segments.isEmpty()) {
            throw new ImageReadException("No App2 Segments Found.");
        }

        final int markerCount = segments.get(0).numMarkers;

        if (segments.size() != markerCount) {
            throw new ImageReadException("App2 Segments Missing.  Found: "
                    + segments.size() + ", Expected: " + markerCount + ".");
        }

        Collections.sort(segments);

        final int offset = startWithZero ? 0 : 1;

        int total = 0;
        for (int i = 0; i < segments.size(); i++) {
            final App2Segment segment = segments.get(i);

            if ((i + offset) != segment.curMarker) {
                dumpSegments(segments);
                throw new ImageReadException(
                        "Incoherent App2 Segment Ordering.  i: " + i
                                + ", segment[" + i + "].curMarker: "
                                + segment.curMarker + ".");
            }

            if (markerCount != segment.numMarkers) {
                dumpSegments(segments);
                throw new ImageReadException(
                        "Inconsistent App2 Segment Count info.  markerCount: "
                                + markerCount + ", segment[" + i
                                + "].numMarkers: " + segment.numMarkers + ".");
            }

            total += segment.getIccBytes().length;
        }

        final byte[] result = new byte[total];
        int progress = 0;

        for (final App2Segment segment : segments) {
            System.arraycopy(segment.getIccBytes(), 0, result, progress, segment.getIccBytes().length);
            progress += segment.getIccBytes().length;
        }

        return result;
    }

    private void dumpSegments(final List<? extends Segment> v) {
        Debug.debug();
        Debug.debug("dumpSegments: " + v.size());

        for (int i = 0; i < v.size(); i++) {
            final App2Segment segment = (App2Segment) v.get(i);

            Debug.debug(i + ": " + segment.curMarker + " / " + segment.numMarkers);
        }
        Debug.debug();
    }

    public List<Segment> readSegments(final ByteSource byteSource, final int[] markers,
            final boolean returnAfterFirst) throws ImageReadException, IOException {
        return readSegments(byteSource, markers, returnAfterFirst, false);
    }

    @Override
    public byte[] getICCProfileBytes(final ByteSource byteSource, final JpegImagingParameters params)
            throws ImageReadException, IOException {
        final List<Segment> segments = readSegments(byteSource,
                new int[] { JpegConstants.JPEG_APP2_MARKER, }, false);

        final List<App2Segment> filtered = new ArrayList<>();
        if (segments != null) {
            // throw away non-icc profile app2 segments.
            for (final Segment s : segments) {
                final App2Segment segment = (App2Segment) s;
                if (segment.getIccBytes() != null) {
                    filtered.add(segment);
                }
            }
        }

        if (filtered.isEmpty()) {
            return null;
        }

        final byte[] bytes = assembleSegments(filtered);

        if (LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.finest("bytes" + ": " + bytes.length);
        }

        return bytes;
    }

    @Override
    public ImageMetadata getMetadata(final ByteSource byteSource, final JpegImagingParameters params)
            throws ImageReadException, IOException {
        final TiffImageMetadata exif = getExifMetadata(byteSource, params);

        final JpegPhotoshopMetadata photoshop = getPhotoshopMetadata(byteSource,
                params);

        if (null == exif && null == photoshop) {
            return null;
        }

        return new JpegImageMetadata(photoshop, exif);
    }

    public static boolean isExifAPP1Segment(final GenericSegment segment) {
        return startsWith(segment.getSegmentData(), JpegConstants.EXIF_IDENTIFIER_CODE);
    }

    private List<Segment> filterAPP1Segments(final List<Segment> segments) {
        final List<Segment> result = new ArrayList<>();

        for (final Segment s : segments) {
            final GenericSegment segment = (GenericSegment) s;
            if (isExifAPP1Segment(segment)) {
                result.add(segment);
            }
        }

        return result;
    }

    public TiffImageMetadata getExifMetadata(final ByteSource byteSource, JpegImagingParameters params)
            throws ImageReadException, IOException {
        final byte[] bytes = getExifRawData(byteSource);
        if (null == bytes) {
            return null;
        }

        params.setReadThumbnails(Boolean.TRUE);

        return (TiffImageMetadata) new TiffImageParser().getMetadata(bytes,
                params);
    }

    public byte[] getExifRawData(final ByteSource byteSource)
            throws ImageReadException, IOException {
        final List<Segment> segments = readSegments(byteSource,
                new int[] { JpegConstants.JPEG_APP1_MARKER, }, false);

        if ((segments == null) || (segments.isEmpty())) {
            return null;
        }

        final List<Segment> exifSegments = filterAPP1Segments(segments);
        if (LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.finest("exif_segments.size" + ": " + exifSegments.size());
        }

        // Debug.debug("segments", segments);
        // Debug.debug("exifSegments", exifSegments);

        // TODO: concatenate if multiple segments, need example.
        if (exifSegments.isEmpty()) {
            return null;
        }
        if (exifSegments.size() > 1) {
            throw new ImageReadException(
                    "Imaging currently can't parse EXIF metadata split across multiple APP1 segments.  "
                            + "Please send this image to the Imaging project.");
        }

        final GenericSegment segment = (GenericSegment) exifSegments.get(0);
        final byte[] bytes = segment.getSegmentData();

        // byte head[] = readBytearray("exif head", bytes, 0, 6);
        //
        // Debug.debug("head", head);

        return remainingBytes("trimmed exif bytes", bytes, 6);
    }

    public boolean hasExifSegment(final ByteSource byteSource)
            throws ImageReadException, IOException {
        final boolean[] result = { false, };

        final JpegUtils.Visitor visitor = new JpegUtils.Visitor() {
            // return false to exit before reading image data.
            @Override
            public boolean beginSOS() {
                return false;
            }

            @Override
            public void visitSOS(final int marker, final byte[] markerBytes,
                    final byte[] imageData) {
                // don't need image data
            }

            // return false to exit traversal.
            @Override
            public boolean visitSegment(final int marker, final byte[] markerBytes,
                    final int markerLength, final byte[] markerLengthBytes,
                    final byte[] segmentData) throws ImageReadException, IOException {
                if (marker == 0xffd9) {
                    return false;
                }

                if (marker == JpegConstants.JPEG_APP1_MARKER) {
                    if (startsWith(segmentData, JpegConstants.EXIF_IDENTIFIER_CODE)) {
                        result[0] = true;
                        return false;
                    }
                }

                return true;
            }
        };

        new JpegUtils().traverseJFIF(byteSource, visitor);

        return result[0];
    }

    public boolean hasIptcSegment(final ByteSource byteSource)
            throws ImageReadException, IOException {
        final boolean[] result = { false, };

        final JpegUtils.Visitor visitor = new JpegUtils.Visitor() {
            // return false to exit before reading image data.
            @Override
            public boolean beginSOS() {
                return false;
            }

            @Override
            public void visitSOS(final int marker, final byte[] markerBytes,
                    final byte[] imageData) {
                // don't need image data
            }

            // return false to exit traversal.
            @Override
            public boolean visitSegment(final int marker, final byte[] markerBytes,
                    final int markerLength, final byte[] markerLengthBytes,
                    final byte[] segmentData) throws ImageReadException, IOException {
                if (marker == 0xffd9) {
                    return false;
                }

                if (marker == JpegConstants.JPEG_APP13_MARKER) {
                    if (new IptcParser().isPhotoshopJpegSegment(segmentData)) {
                        result[0] = true;
                        return false;
                    }
                }

                return true;
            }
        };

        new JpegUtils().traverseJFIF(byteSource, visitor);

        return result[0];
    }

    public boolean hasXmpSegment(final ByteSource byteSource)
            throws ImageReadException, IOException {
        final boolean[] result = { false, };

        final JpegUtils.Visitor visitor = new JpegUtils.Visitor() {
            // return false to exit before reading image data.
            @Override
            public boolean beginSOS() {
                return false;
            }

            @Override
            public void visitSOS(final int marker, final byte[] markerBytes,
                    final byte[] imageData) {
                // don't need image data
            }

            // return false to exit traversal.
            @Override
            public boolean visitSegment(final int marker, final byte[] markerBytes,
                    final int markerLength, final byte[] markerLengthBytes,
                    final byte[] segmentData) throws ImageReadException, IOException {
                if (marker == 0xffd9) {
                    return false;
                }

                if (marker == JpegConstants.JPEG_APP1_MARKER) {
                    if (new JpegXmpParser().isXmpJpegSegment(segmentData)) {
                        result[0] = true;
                        return false;
                    }
                }

                return true;
            }
        };
        new JpegUtils().traverseJFIF(byteSource, visitor);

        return result[0];
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
    public String getXmpXml(final ByteSource byteSource, final JpegImagingParameters params)
            throws ImageReadException, IOException {

        final List<String> result = new ArrayList<>();

        final JpegUtils.Visitor visitor = new JpegUtils.Visitor() {
            // return false to exit before reading image data.
            @Override
            public boolean beginSOS() {
                return false;
            }

            @Override
            public void visitSOS(final int marker, final byte[] markerBytes,
                    final byte[] imageData) {
                // don't need image data
            }

            // return false to exit traversal.
            @Override
            public boolean visitSegment(final int marker, final byte[] markerBytes,
                    final int markerLength, final byte[] markerLengthBytes,
                    final byte[] segmentData) throws ImageReadException, IOException {
                if (marker == 0xffd9) {
                    return false;
                }

                if (marker == JpegConstants.JPEG_APP1_MARKER) {
                    if (new JpegXmpParser().isXmpJpegSegment(segmentData)) {
                        result.add(new JpegXmpParser().parseXmpJpegSegment(segmentData));
                        return false;
                    }
                }

                return true;
            }
        };
        new JpegUtils().traverseJFIF(byteSource, visitor);

        if (result.isEmpty()) {
            return null;
        }
        if (result.size() > 1) {
            throw new ImageReadException(
                    "Jpeg file contains more than one XMP segment.");
        }
        return result.get(0);
    }

    public JpegPhotoshopMetadata getPhotoshopMetadata(final ByteSource byteSource,
            final JpegImagingParameters params) throws ImageReadException, IOException {
        final List<Segment> segments = readSegments(byteSource,
                new int[] { JpegConstants.JPEG_APP13_MARKER, }, false);

        if ((segments == null) || (segments.isEmpty())) {
            return null;
        }

        PhotoshopApp13Data photoshopApp13Data = null;

        for (final Segment s : segments) {
            final App13Segment segment = (App13Segment) s;

            final PhotoshopApp13Data data = segment.parsePhotoshopSegment(params);
            if (data != null) {
                if (photoshopApp13Data != null) {
                    throw new ImageReadException("Jpeg contains more than one Photoshop App13 segment.");
                }
                photoshopApp13Data = data;
            }
        }

        if (null == photoshopApp13Data) {
            return null;
        }
        return new JpegPhotoshopMetadata(photoshopApp13Data);
    }

    @Override
    public Dimension getImageSize(final ByteSource byteSource, final JpegImagingParameters params)
            throws ImageReadException, IOException {
        final List<Segment> segments = readSegments(byteSource, new int[] {
                // kJFIFMarker,
                JpegConstants.SOF0_MARKER,
                JpegConstants.SOF1_MARKER,
                JpegConstants.SOF2_MARKER,
                JpegConstants.SOF3_MARKER,
                JpegConstants.SOF5_MARKER,
                JpegConstants.SOF6_MARKER,
                JpegConstants.SOF7_MARKER,
                JpegConstants.SOF9_MARKER,
                JpegConstants.SOF10_MARKER,
                JpegConstants.SOF11_MARKER,
                JpegConstants.SOF13_MARKER,
                JpegConstants.SOF14_MARKER,
                JpegConstants.SOF15_MARKER,

        }, true);

        if ((segments == null) || (segments.isEmpty())) {
            throw new ImageReadException("No JFIF Data Found.");
        }

        if (segments.size() > 1) {
            throw new ImageReadException("Redundant JFIF Data Found.");
        }

        final SofnSegment fSOFNSegment = (SofnSegment) segments.get(0);

        return new Dimension(fSOFNSegment.width, fSOFNSegment.height);
    }

    @Override
    public ImageInfo getImageInfo(final ByteSource byteSource, final JpegImagingParameters params)
            throws ImageReadException, IOException {
        // List allSegments = readSegments(byteSource, null, false);

        final List<Segment> SOF_segments = readSegments(byteSource, new int[] {
                // kJFIFMarker,

                JpegConstants.SOF0_MARKER,
                JpegConstants.SOF1_MARKER,
                JpegConstants.SOF2_MARKER,
                JpegConstants.SOF3_MARKER,
                JpegConstants.SOF5_MARKER,
                JpegConstants.SOF6_MARKER,
                JpegConstants.SOF7_MARKER,
                JpegConstants.SOF9_MARKER,
                JpegConstants.SOF10_MARKER,
                JpegConstants.SOF11_MARKER,
                JpegConstants.SOF13_MARKER,
                JpegConstants.SOF14_MARKER,
                JpegConstants.SOF15_MARKER,

        }, false);

        if (SOF_segments == null) {
            throw new ImageReadException("No SOFN Data Found.");
        }

        // if (SOF_segments.size() != 1)
        // System.out.println("Incoherent SOFN Data Found: "
        // + SOF_segments.size());

        final List<Segment> jfifSegments = readSegments(byteSource,
                new int[] { JpegConstants.JFIF_MARKER, }, true);

        final SofnSegment fSOFNSegment = (SofnSegment) SOF_segments.get(0);
        // SofnSegment fSOFNSegment = (SofnSegment) findSegment(segments,
        // SOFNmarkers);

        if (fSOFNSegment == null) {
            throw new ImageReadException("No SOFN Data Found.");
        }

        final int width = fSOFNSegment.width;
        final int height = fSOFNSegment.height;

        JfifSegment jfifSegment = null;

        if ((jfifSegments != null) && (!jfifSegments.isEmpty())) {
            jfifSegment = (JfifSegment) jfifSegments.get(0);
        }

        final List<Segment> app14Segments = readSegments(byteSource, new int[] { JpegConstants.JPEG_APP14_MARKER}, true);
        App14Segment app14Segment = null;
        if (app14Segments != null && !app14Segments.isEmpty()) {
            app14Segment = (App14Segment) app14Segments.get(0);
        }

        // JfifSegment fTheJFIFSegment = (JfifSegment) findSegment(segments,
        // kJFIFMarker);

        double xDensity = -1.0;
        double yDensity = -1.0;
        double unitsPerInch = -1.0;
        // int JFIF_major_version;
        // int JFIF_minor_version;
        String formatDetails;

        if (jfifSegment != null) {
            xDensity = jfifSegment.xDensity;
            yDensity = jfifSegment.yDensity;
            final int densityUnits = jfifSegment.densityUnits;
            // JFIF_major_version = fTheJFIFSegment.JFIF_major_version;
            // JFIF_minor_version = fTheJFIFSegment.JFIF_minor_version;

            formatDetails = "Jpeg/JFIF v." + jfifSegment.jfifMajorVersion + "."
                    + jfifSegment.jfifMinorVersion;

            switch (densityUnits) {
            case 0:
                break;
            case 1: // inches
                unitsPerInch = 1.0;
                break;
            case 2: // cms
                unitsPerInch = 2.54;
                break;
            default:
                break;
            }
        } else {
            final JpegImageMetadata metadata = (JpegImageMetadata) getMetadata(
                    byteSource, params);

            if (metadata != null) {
                {
                    final TiffField field = metadata.findEXIFValue(TiffTagConstants.TIFF_TAG_XRESOLUTION);
                    if (field != null) {
                        xDensity = ((Number) field.getValue()).doubleValue();
                    }
                }
                {
                    final TiffField field = metadata.findEXIFValue(TiffTagConstants.TIFF_TAG_YRESOLUTION);
                    if (field != null) {
                        yDensity = ((Number) field.getValue()).doubleValue();
                    }
                }
                {
                    final TiffField field = metadata.findEXIFValue(TiffTagConstants.TIFF_TAG_RESOLUTION_UNIT);
                    if (field != null) {
                        final int densityUnits = ((Number) field.getValue()).intValue();

                        switch (densityUnits) {
                        case 1:
                            break;
                        case 2: // inches
                            unitsPerInch = 1.0;
                            break;
                        case 3: // cms
                            unitsPerInch = 2.54;
                            break;
                        default:
                            break;
                        }
                    }

                }
            }

            formatDetails = "Jpeg/DCM";

        }

        int physicalHeightDpi = -1;
        float physicalHeightInch = -1;
        int physicalWidthDpi = -1;
        float physicalWidthInch = -1;

        if (unitsPerInch > 0) {
            physicalWidthDpi = (int) Math.round(xDensity * unitsPerInch);
            physicalWidthInch = (float) (width / (xDensity * unitsPerInch));
            physicalHeightDpi = (int) Math.round(yDensity * unitsPerInch);
            physicalHeightInch = (float) (height / (yDensity * unitsPerInch));
        }

        final List<Segment> commentSegments = readSegments(byteSource,
                new int[] { JpegConstants.COM_MARKER}, false);
        final List<String> comments = new ArrayList<>(commentSegments.size());
        for (final Segment commentSegment : commentSegments) {
            final ComSegment comSegment = (ComSegment) commentSegment;
            comments.add(new String(comSegment.getComment(), StandardCharsets.UTF_8));
        }

        final int numberOfComponents = fSOFNSegment.numberOfComponents;
        final int precision = fSOFNSegment.precision;

        final int bitsPerPixel = numberOfComponents * precision;
        final ImageFormat format = ImageFormats.JPEG;
        final String formatName = "JPEG (Joint Photographic Experts Group) Format";
        final String mimeType = "image/jpeg";
        // we ought to count images, but don't yet.
        final int numberOfImages = 1;
        // not accurate ... only reflects first
        final boolean progressive = fSOFNSegment.marker == JpegConstants.SOF2_MARKER;

        boolean transparent = false;
        final boolean usesPalette = false; // TODO: inaccurate.

        // See http://docs.oracle.com/javase/6/docs/api/javax/imageio/metadata/doc-files/jpeg_metadata.html#color
        ImageInfo.ColorType colorType = ImageInfo.ColorType.UNKNOWN;
        // Some images have both JFIF/APP0 and APP14.
        // JFIF is meant to win but in them APP14 is clearly right, so make it win.
        if (app14Segment != null && app14Segment.isAdobeJpegSegment()) {
            final int colorTransform = app14Segment.getAdobeColorTransform();
            switch (colorTransform) {
            case App14Segment.ADOBE_COLOR_TRANSFORM_UNKNOWN:
                if (numberOfComponents == 3) {
                    colorType = ImageInfo.ColorType.RGB;
                } else if (numberOfComponents == 4) {
                    colorType = ImageInfo.ColorType.CMYK;
                }
                break;
            case App14Segment.ADOBE_COLOR_TRANSFORM_YCbCr:
                colorType = ImageInfo.ColorType.YCbCr;
                break;
            case App14Segment.ADOBE_COLOR_TRANSFORM_YCCK:
                colorType = ImageInfo.ColorType.YCCK;
                break;
            default:
                break;
            }
        } else if (jfifSegment != null) {
            if (numberOfComponents == 1) {
                colorType = ImageInfo.ColorType.GRAYSCALE;
            } else if (numberOfComponents == 3) {
                colorType = ImageInfo.ColorType.YCbCr;
            }
        } else {
            switch (numberOfComponents) {
            case 1:
                colorType = ImageInfo.ColorType.GRAYSCALE;
                break;
            case 2:
                colorType = ImageInfo.ColorType.GRAYSCALE;
                transparent = true;
                break;
            case 3:
            case 4:
                boolean have1 = false;
                boolean have2 = false;
                boolean have3 = false;
                boolean have4 = false;
                boolean haveOther = false;
                for (final SofnSegment.Component component : fSOFNSegment.getComponents()) {
                    final int id = component.componentIdentifier;
                    if (id == 1) {
                        have1 = true;
                    } else if (id == 2) {
                        have2 = true;
                    } else if (id == 3) {
                        have3 = true;
                    } else if (id == 4) {
                        have4 = true;
                    } else {
                        haveOther = true;
                    }
                }
                if (numberOfComponents == 3 && have1 && have2 && have3 && !have4 && !haveOther) {
                    colorType = ImageInfo.ColorType.YCbCr;
                } else if (numberOfComponents == 4 && have1 && have2 && have3 && have4 && !haveOther) {
                    colorType = ImageInfo.ColorType.YCbCr;
                    transparent = true;
                } else {
                    boolean haveR = false;
                    boolean haveG = false;
                    boolean haveB = false;
                    boolean haveA = false;
                    boolean haveC = false;
                    boolean havec = false;
                    boolean haveY = false;
                    for (final SofnSegment.Component component : fSOFNSegment.getComponents()) {
                        final int id = component.componentIdentifier;
                        if (id == 'R') {
                            haveR = true;
                        } else if (id == 'G') {
                            haveG = true;
                        } else if (id == 'B') {
                            haveB = true;
                        } else if (id == 'A') {
                            haveA = true;
                        } else if (id == 'C') {
                            haveC = true;
                        } else if (id == 'c') {
                            havec = true;
                        } else if (id == 'Y') {
                            haveY = true;
                        }
                    }
                    if (haveR && haveG && haveB && !haveA && !haveC && !havec && !haveY) {
                        colorType = ImageInfo.ColorType.RGB;
                    } else if (haveR && haveG && haveB && haveA && !haveC && !havec && !haveY) {
                        colorType = ImageInfo.ColorType.RGB;
                        transparent = true;
                    } else if (haveY && haveC && havec && !haveR && !haveG && !haveB && !haveA) {
                        colorType = ImageInfo.ColorType.YCC;
                    } else if (haveY && haveC && havec && haveA && !haveR && !haveG && !haveB) {
                        colorType = ImageInfo.ColorType.YCC;
                        transparent = true;
                    } else {
                        int minHorizontalSamplingFactor = Integer.MAX_VALUE;
                        int maxHorizontalSmaplingFactor = Integer.MIN_VALUE;
                        int minVerticalSamplingFactor = Integer.MAX_VALUE;
                        int maxVerticalSamplingFactor = Integer.MIN_VALUE;
                        for (final SofnSegment.Component component : fSOFNSegment.getComponents()) {
                            if (minHorizontalSamplingFactor > component.horizontalSamplingFactor) {
                                minHorizontalSamplingFactor = component.horizontalSamplingFactor;
                            }
                            if (maxHorizontalSmaplingFactor < component.horizontalSamplingFactor) {
                                maxHorizontalSmaplingFactor = component.horizontalSamplingFactor;
                            }
                            if (minVerticalSamplingFactor > component.verticalSamplingFactor) {
                                minVerticalSamplingFactor = component.verticalSamplingFactor;
                            }
                            if (maxVerticalSamplingFactor < component.verticalSamplingFactor) {
                                maxVerticalSamplingFactor = component.verticalSamplingFactor;
                            }
                        }
                        final boolean isSubsampled = (minHorizontalSamplingFactor != maxHorizontalSmaplingFactor)
                                || (minVerticalSamplingFactor != maxVerticalSamplingFactor);
                        if (numberOfComponents == 3) {
                            if (isSubsampled) {
                                colorType = ImageInfo.ColorType.YCbCr;
                            } else {
                                colorType = ImageInfo.ColorType.RGB;
                            }
                        } else if (numberOfComponents == 4) {
                            if (isSubsampled) {
                                colorType = ImageInfo.ColorType.YCCK;
                            } else {
                                colorType = ImageInfo.ColorType.CMYK;
                            }
                        }
                    }
                }
                break;
            default:
                break;
            }
        }

        final ImageInfo.CompressionAlgorithm compressionAlgorithm = ImageInfo.CompressionAlgorithm.JPEG;

        return new ImageInfo(formatDetails, bitsPerPixel, comments,
                format, formatName, height, mimeType, numberOfImages,
                physicalHeightDpi, physicalHeightInch, physicalWidthDpi,
                physicalWidthInch, width, progressive, transparent,
                usesPalette, colorType, compressionAlgorithm);
    }

    @Override
    public boolean dumpImageFile(final PrintWriter pw, final ByteSource byteSource)
            throws ImageReadException, IOException {
        pw.println("jpeg.dumpImageFile");

        {
            final ImageInfo imageInfo = getImageInfo(byteSource);
            if (imageInfo == null) {
                return false;
            }

            imageInfo.toString(pw, "");
        }

        pw.println("");

        {
            final List<Segment> segments = readSegments(byteSource, null, false);

            if (segments == null) {
                throw new ImageReadException("No Segments Found.");
            }

            for (int d = 0; d < segments.size(); d++) {

                final Segment segment = segments.get(d);

                final NumberFormat nf = NumberFormat.getIntegerInstance();
                // this.debugNumber("found, marker: ", marker, 4);
                pw.println(d + ": marker: "
                        + Integer.toHexString(segment.marker) + ", "
                        + segment.getDescription() + " (length: "
                        + nf.format(segment.length) + ")");
                segment.dump(pw);
            }

            pw.println("");
        }

        return true;
    }

}
