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

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.ByteOrder;
import org.apache.commons.imaging.common.IImageMetadata;
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
import org.apache.commons.imaging.util.Debug;

public class JpegImageParser extends ImageParser implements JpegConstants {
    public JpegImageParser() {
        setByteOrder(ByteOrder.BIG_ENDIAN);
        // setDebug(true);
    }

    @Override
    protected ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[] { ImageFormat.JPEG, //
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

    private static final String DEFAULT_EXTENSION = ".jpg";

    private static final String ACCEPTED_EXTENSIONS[] = { ".jpg", ".jpeg", };

    @Override
    protected String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS;
    }

    @Override
    public final BufferedImage getBufferedImage(final ByteSource byteSource,
            final Map<String,Object> params) throws ImageReadException, IOException {
        final JpegDecoder jpegDecoder = new JpegDecoder();
        return jpegDecoder.decode(byteSource);
    }

    private boolean keepMarker(final int marker, final int markers[]) {
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
            final int markers[], final boolean returnAfterFirst,
            final boolean readEverything) throws ImageReadException, IOException {
        final List<Segment> result = new ArrayList<Segment>();
        final JpegImageParser parser = this;
        final int[] sofnSegments = {
                // kJFIFMarker,
                SOF0Marker,

                SOF1Marker, SOF2Marker, SOF3Marker, SOF5Marker, SOF6Marker,
                SOF7Marker, SOF9Marker, SOF10Marker, SOF11Marker, SOF13Marker,
                SOF14Marker, SOF15Marker, };

        final JpegUtils.Visitor visitor = new JpegUtils.Visitor() {
            // return false to exit before reading image data.
            public boolean beginSOS() {
                return false;
            }

            public void visitSOS(final int marker, final byte markerBytes[],
                    final byte imageData[]) {
            }

            // return false to exit traversal.
            public boolean visitSegment(final int marker, final byte markerBytes[],
                    final int markerLength, final byte markerLengthBytes[],
                    final byte segmentData[]) throws ImageReadException, IOException {
                if (marker == EOIMarker) {
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

                if (marker == JPEG_APP13_Marker) {
                    // Debug.debug("app 13 segment data", segmentData.length);
                    result.add(new App13Segment(parser, marker, segmentData));
                } else if (marker == JPEG_APP14_Marker) {
                    result.add(new App14Segment(marker, segmentData));
                } else if (marker == JPEG_APP2_Marker) {
                    result.add(new App2Segment(marker, segmentData));
                } else if (marker == JFIFMarker) {
                    result.add(new JfifSegment(marker, segmentData));
                } else if (Arrays.binarySearch(sofnSegments, marker) >= 0) {
                    result.add(new SofnSegment(marker, segmentData));
                } else if (marker == DQTMarker) {
                    result.add(new DqtSegment(marker, segmentData));
                } else if ((marker >= JPEG_APP1_Marker)
                        && (marker <= JPEG_APP15_Marker)) {
                    result.add(new UnknownSegment(marker, segmentData));
                } else if (marker == COMMarker) {
                    result.add(new ComSegment(marker, segmentData));
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

    public static final boolean permissive = true;

    private byte[] assembleSegments(final List<App2Segment> v)
            throws ImageReadException {
        try {
            return assembleSegments(v, false);
        } catch (final ImageReadException e) {
            return assembleSegments(v, true);
        }
    }

    private byte[] assembleSegments(final List<App2Segment> v, final boolean start_with_zero)
            throws ImageReadException {
        if (v.size() < 1) {
            throw new ImageReadException("No App2 Segments Found.");
        }

        final int markerCount = v.get(0).num_markers;

        // if (permissive && (markerCount == 0))
        // markerCount = v.size();

        if (v.size() != markerCount) {
            throw new ImageReadException("App2 Segments Missing.  Found: "
                    + v.size() + ", Expected: " + markerCount + ".");
        }

        Collections.sort(v);

        final int offset = start_with_zero ? 0 : 1;

        int total = 0;
        for (int i = 0; i < v.size(); i++) {
            final App2Segment segment = v.get(i);

            if ((i + offset) != segment.cur_marker) {
                dumpSegments(v);
                throw new ImageReadException(
                        "Incoherent App2 Segment Ordering.  i: " + i
                                + ", segment[" + i + "].cur_marker: "
                                + segment.cur_marker + ".");
            }

            if (markerCount != segment.num_markers) {
                dumpSegments(v);
                throw new ImageReadException(
                        "Inconsistent App2 Segment Count info.  markerCount: "
                                + markerCount + ", segment[" + i
                                + "].num_markers: " + segment.num_markers + ".");
            }

            total += segment.icc_bytes.length;
        }

        final byte result[] = new byte[total];
        int progress = 0;

        for (int i = 0; i < v.size(); i++) {
            final App2Segment segment = v.get(i);

            System.arraycopy(segment.icc_bytes, 0, result, progress,
                    segment.icc_bytes.length);
            progress += segment.icc_bytes.length;
        }

        return result;
    }

    private void dumpSegments(final List<? extends Segment> v) {
        Debug.debug();
        Debug.debug("dumpSegments", v.size());

        for (int i = 0; i < v.size(); i++) {
            final App2Segment segment = (App2Segment) v.get(i);

            Debug.debug((i) + ": " + segment.cur_marker + " / "
                    + segment.num_markers);
        }
        Debug.debug();
    }

    public List<Segment> readSegments(final ByteSource byteSource, final int markers[],
            final boolean returnAfterFirst) throws ImageReadException, IOException {
        return readSegments(byteSource, markers, returnAfterFirst, false);
    }

    @Override
    public byte[] getICCProfileBytes(final ByteSource byteSource, final Map<String,Object> params)
            throws ImageReadException, IOException {
        final List<Segment> segments = readSegments(byteSource,
                new int[] { JPEG_APP2_Marker, }, false);

        final List<App2Segment> filtered = new ArrayList<App2Segment>();
        if (segments != null) {
            // throw away non-icc profile app2 segments.
            for (int i = 0; i < segments.size(); i++) {
                final App2Segment segment = (App2Segment) segments.get(i);
                if (segment.icc_bytes != null) {
                    filtered.add(segment);
                }
            }
        }

        if (filtered.size() < 1) {
            return null;
        }

        final byte bytes[] = assembleSegments(filtered);

        if (getDebug()) {
            System.out.println("bytes" + ": " + bytes.length);
        }

        if (getDebug()) {
            System.out.println("");
        }

        return (bytes);
    }

    @Override
    public IImageMetadata getMetadata(final ByteSource byteSource, final Map<String,Object> params)
            throws ImageReadException, IOException {
        final TiffImageMetadata exif = getExifMetadata(byteSource, params);

        final JpegPhotoshopMetadata photoshop = getPhotoshopMetadata(byteSource,
                params);

        if (null == exif && null == photoshop) {
            return null;
        }

        final JpegImageMetadata result = new JpegImageMetadata(photoshop, exif);

        return result;
    }

    public static boolean isExifAPP1Segment(final GenericSegment segment) {
        return startsWith(segment.getSegmentData(), EXIF_IDENTIFIER_CODE);
    }

    private List<Segment> filterAPP1Segments(final List<Segment> v) {
        final List<Segment> result = new ArrayList<Segment>();

        for (int i = 0; i < v.size(); i++) {
            final GenericSegment segment = (GenericSegment) v.get(i);
            if (isExifAPP1Segment(segment)) {
                result.add(segment);
            }
        }

        return result;
    }

    public TiffImageMetadata getExifMetadata(final ByteSource byteSource, Map<String,Object> params)
            throws ImageReadException, IOException {
        final byte bytes[] = getExifRawData(byteSource);
        if (null == bytes) {
            return null;
        }

        if (params == null) {
            params = new HashMap<String,Object>();
        }
        if (!params.containsKey(PARAM_KEY_READ_THUMBNAILS)) {
            params.put(PARAM_KEY_READ_THUMBNAILS, Boolean.TRUE);
        }

        return (TiffImageMetadata) new TiffImageParser().getMetadata(bytes,
                params);
    }

    public byte[] getExifRawData(final ByteSource byteSource)
            throws ImageReadException, IOException {
        final List<Segment> segments = readSegments(byteSource,
                new int[] { JPEG_APP1_Marker, }, false);

        if ((segments == null) || (segments.size() < 1)) {
            return null;
        }

        final List<Segment> exifSegments = filterAPP1Segments(segments);
        if (getDebug()) {
            System.out.println("exif_segments.size" + ": "
                    + exifSegments.size());
        }

        // Debug.debug("segments", segments);
        // Debug.debug("exifSegments", exifSegments);

        // TODO: concatenate if multiple segments, need example.
        if (exifSegments.size() < 1) {
            return null;
        }
        if (exifSegments.size() > 1) {
            throw new ImageReadException(
                    "Imaging currently can't parse EXIF metadata split across multiple APP1 segments.  "
                            + "Please send this image to the Imaging project.");
        }

        final GenericSegment segment = (GenericSegment) exifSegments.get(0);
        final byte bytes[] = segment.getSegmentData();

        // byte head[] = readBytearray("exif head", bytes, 0, 6);
        //
        // Debug.debug("head", head);

        return remainingBytes("trimmed exif bytes", bytes, 6);
    }

    public boolean hasExifSegment(final ByteSource byteSource)
            throws ImageReadException, IOException {
        final boolean result[] = { false, };

        final JpegUtils.Visitor visitor = new JpegUtils.Visitor() {
            // return false to exit before reading image data.
            public boolean beginSOS() {
                return false;
            }

            public void visitSOS(final int marker, final byte markerBytes[],
                    final byte imageData[]) {
            }

            // return false to exit traversal.
            public boolean visitSegment(final int marker, final byte markerBytes[],
                    final int markerLength, final byte markerLengthBytes[],
                    final byte segmentData[]) throws ImageReadException, IOException {
                if (marker == 0xffd9) {
                    return false;
                }

                if (marker == JPEG_APP1_Marker) {
                    if (startsWith(segmentData, EXIF_IDENTIFIER_CODE)) {
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
        final boolean result[] = { false, };

        final JpegUtils.Visitor visitor = new JpegUtils.Visitor() {
            // return false to exit before reading image data.
            public boolean beginSOS() {
                return false;
            }

            public void visitSOS(final int marker, final byte markerBytes[],
                    final byte imageData[]) {
            }

            // return false to exit traversal.
            public boolean visitSegment(final int marker, final byte markerBytes[],
                    final int markerLength, final byte markerLengthBytes[],
                    final byte segmentData[]) throws ImageReadException, IOException {
                if (marker == 0xffd9) {
                    return false;
                }

                if (marker == JPEG_APP13_Marker) {
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
        final boolean result[] = { false, };

        final JpegUtils.Visitor visitor = new JpegUtils.Visitor() {
            // return false to exit before reading image data.
            public boolean beginSOS() {
                return false;
            }

            public void visitSOS(final int marker, final byte markerBytes[],
                    final byte imageData[]) {
            }

            // return false to exit traversal.
            public boolean visitSegment(final int marker, final byte markerBytes[],
                    final int markerLength, final byte markerLengthBytes[],
                    final byte segmentData[]) throws ImageReadException, IOException {
                if (marker == 0xffd9) {
                    return false;
                }

                if (marker == JPEG_APP1_Marker) {
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
    public String getXmpXml(final ByteSource byteSource, final Map<String,Object> params)
            throws ImageReadException, IOException {

        final List<String> result = new ArrayList<String>();

        final JpegUtils.Visitor visitor = new JpegUtils.Visitor() {
            // return false to exit before reading image data.
            public boolean beginSOS() {
                return false;
            }

            public void visitSOS(final int marker, final byte markerBytes[],
                    final byte imageData[]) {
            }

            // return false to exit traversal.
            public boolean visitSegment(final int marker, final byte markerBytes[],
                    final int markerLength, final byte markerLengthBytes[],
                    final byte segmentData[]) throws ImageReadException, IOException {
                if (marker == 0xffd9) {
                    return false;
                }

                if (marker == JPEG_APP1_Marker) {
                    if (new JpegXmpParser().isXmpJpegSegment(segmentData)) {
                        result.add(new JpegXmpParser()
                                .parseXmpJpegSegment(segmentData));
                        return false;
                    }
                }

                return true;
            }
        };
        new JpegUtils().traverseJFIF(byteSource, visitor);

        if (result.size() < 1) {
            return null;
        }
        if (result.size() > 1) {
            throw new ImageReadException(
                    "Jpeg file contains more than one XMP segment.");
        }
        return result.get(0);
    }

    public JpegPhotoshopMetadata getPhotoshopMetadata(final ByteSource byteSource,
            final Map<String,Object> params) throws ImageReadException, IOException {
        final List<Segment> segments = readSegments(byteSource,
                new int[] { JPEG_APP13_Marker, }, false);

        if ((segments == null) || (segments.size() < 1)) {
            return null;
        }

        PhotoshopApp13Data photoshopApp13Data = null;

        for (int i = 0; i < segments.size(); i++) {
            final App13Segment segment = (App13Segment) segments.get(i);

            final PhotoshopApp13Data data = segment.parsePhotoshopSegment(params);
            if (data != null && photoshopApp13Data != null) {
                throw new ImageReadException(
                        "Jpeg contains more than one Photoshop App13 segment.");
            }

            photoshopApp13Data = data;
        }

        if (null == photoshopApp13Data) {
            return null;
        }
        return new JpegPhotoshopMetadata(photoshopApp13Data);
    }

    @Override
    public Dimension getImageSize(final ByteSource byteSource, final Map<String,Object> params)
            throws ImageReadException, IOException {
        final List<Segment> segments = readSegments(byteSource, new int[] {
                // kJFIFMarker,
                SOF0Marker,

                SOF1Marker, SOF2Marker, SOF3Marker, SOF5Marker, SOF6Marker,
                SOF7Marker, SOF9Marker, SOF10Marker, SOF11Marker, SOF13Marker,
                SOF14Marker, SOF15Marker,

        }, true);

        if ((segments == null) || (segments.size() < 1)) {
            throw new ImageReadException("No JFIF Data Found.");
        }

        if (segments.size() > 1) {
            throw new ImageReadException("Redundant JFIF Data Found.");
        }

        final SofnSegment fSOFNSegment = (SofnSegment) segments.get(0);

        return new Dimension(fSOFNSegment.width, fSOFNSegment.height);
    }

    public byte[] embedICCProfile(final byte image[], final byte profile[]) {
        return null;
    }

    @Override
    public boolean embedICCProfile(final File src, final File dst, final byte profile[]) {
        return false;
    }

    @Override
    public ImageInfo getImageInfo(final ByteSource byteSource, final Map<String,Object> params)
            throws ImageReadException, IOException {
        // List allSegments = readSegments(byteSource, null, false);

        final List<Segment> SOF_segments = readSegments(byteSource, new int[] {
                // kJFIFMarker,

                SOF0Marker, SOF1Marker, SOF2Marker, SOF3Marker, SOF5Marker,
                SOF6Marker, SOF7Marker, SOF9Marker, SOF10Marker, SOF11Marker,
                SOF13Marker, SOF14Marker, SOF15Marker,

        }, false);

        if (SOF_segments == null) {
            throw new ImageReadException("No SOFN Data Found.");
        }

        // if (SOF_segments.size() != 1)
        // System.out.println("Incoherent SOFN Data Found: "
        // + SOF_segments.size());

        final List<Segment> jfifSegments = readSegments(byteSource,
                new int[] { JFIFMarker, }, true);

        final SofnSegment fSOFNSegment = (SofnSegment) SOF_segments.get(0);
        // SofnSegment fSOFNSegment = (SofnSegment) findSegment(segments,
        // SOFNmarkers);

        if (fSOFNSegment == null) {
            throw new ImageReadException("No SOFN Data Found.");
        }

        final int Width = fSOFNSegment.width;
        final int Height = fSOFNSegment.height;

        JfifSegment jfifSegment = null;

        if ((jfifSegments != null) && (jfifSegments.size() > 0)) {
            jfifSegment = (JfifSegment) jfifSegments.get(0);
        }

        final List<Segment> app14Segments = readSegments(byteSource, new int[] { JPEG_APP14_Marker }, true);
        App14Segment app14Segment = null;
        if (app14Segments != null && !app14Segments.isEmpty()) {
            app14Segment = (App14Segment) app14Segments.get(0);
        }
        
        // JfifSegment fTheJFIFSegment = (JfifSegment) findSegment(segments,
        // kJFIFMarker);

        double x_density = -1.0;
        double y_density = -1.0;
        double units_per_inch = -1.0;
        // int JFIF_major_version;
        // int JFIF_minor_version;
        String FormatDetails;

        if (jfifSegment != null) {
            x_density = jfifSegment.xDensity;
            y_density = jfifSegment.yDensity;
            final int density_units = jfifSegment.densityUnits;
            // JFIF_major_version = fTheJFIFSegment.JFIF_major_version;
            // JFIF_minor_version = fTheJFIFSegment.JFIF_minor_version;

            FormatDetails = "Jpeg/JFIF v." + jfifSegment.jfifMajorVersion + "."
                    + jfifSegment.jfifMinorVersion;

            switch (density_units) {
            case 0:
                break;
            case 1: // inches
                units_per_inch = 1.0;
                break;
            case 2: // cms
                units_per_inch = 2.54;
                break;
            default:
                break;
            }
        } else {
            final JpegImageMetadata metadata = (JpegImageMetadata) getMetadata(
                    byteSource, params);

            if (metadata != null) {
                {
                    final TiffField field = metadata
                            .findEXIFValue(TiffTagConstants.TIFF_TAG_XRESOLUTION);
                    if (field != null) {
                        x_density = ((Number) field.getValue()).doubleValue();
                    }
                }
                {
                    final TiffField field = metadata
                            .findEXIFValue(TiffTagConstants.TIFF_TAG_YRESOLUTION);
                    if (field != null) {
                        y_density = ((Number) field.getValue()).doubleValue();
                    }
                }
                {
                    final TiffField field = metadata
                            .findEXIFValue(TiffTagConstants.TIFF_TAG_RESOLUTION_UNIT);
                    if (field != null) {
                        final int density_units = ((Number) field.getValue())
                                .intValue();

                        switch (density_units) {
                        case 1:
                            break;
                        case 2: // inches
                            units_per_inch = 1.0;
                            break;
                        case 3: // cms
                            units_per_inch = 2.54;
                            break;
                        default:
                            break;
                        }
                    }

                }
            }

            FormatDetails = "Jpeg/DCM";

        }

        int PhysicalHeightDpi = -1;
        float PhysicalHeightInch = -1;
        int PhysicalWidthDpi = -1;
        float PhysicalWidthInch = -1;

        if (units_per_inch > 0) {
            PhysicalWidthDpi = (int) Math.round(x_density * units_per_inch);
            PhysicalWidthInch = (float) (Width / (x_density * units_per_inch));
            PhysicalHeightDpi = (int) Math.round(y_density * units_per_inch);
            PhysicalHeightInch = (float) (Height / (y_density * units_per_inch));
        }

        final List<String> Comments = new ArrayList<String>();
        final List<Segment> commentSegments = readSegments(byteSource,
                new int[] { COMMarker }, false);
        for (int i = 0; i < commentSegments.size(); i++) {
            final ComSegment comSegment = (ComSegment) commentSegments.get(i);
            String comment = "";
            try {
                comment = new String(comSegment.getComment(), "UTF-8");
            } catch (final UnsupportedEncodingException cannotHappen) {
            }
            Comments.add(comment);
        }

        final int Number_of_components = fSOFNSegment.numberOfComponents;
        final int Precision = fSOFNSegment.precision;

        final int BitsPerPixel = Number_of_components * Precision;
        final ImageFormat Format = ImageFormat.JPEG;
        final String FormatName = "JPEG (Joint Photographic Experts Group) Format";
        final String MimeType = "image/jpeg";
        // we ought to count images, but don't yet.
        final int NumberOfImages = 1;
        // not accurate ... only reflects first
        final boolean isProgressive = fSOFNSegment.marker == SOF2Marker;

        boolean isTransparent = false;
        final boolean usesPalette = false; // TODO: inaccurate.
        
        // See http://docs.oracle.com/javase/6/docs/api/javax/imageio/metadata/doc-files/jpeg_metadata.html#color
        int colorType = ImageInfo.COLOR_TYPE_UNKNOWN;
        // Some images have both JFIF/APP0 and APP14.
        // JFIF is meant to win but in them APP14 is clearly right, so make it win.
        if (app14Segment != null && app14Segment.isAdobeJpegSegment()) {
            final int colorTransform = app14Segment.getAdobeColorTransform();
            if (colorTransform == App14Segment.ADOBE_COLOR_TRANSFORM_UNKNOWN) { 
                if (Number_of_components == 3) {
                    colorType = ImageInfo.COLOR_TYPE_RGB;
                } else if (Number_of_components == 4) {
                    colorType = ImageInfo.COLOR_TYPE_CMYK;
                }
            } else if (colorTransform == App14Segment.ADOBE_COLOR_TRANSFORM_YCbCr) {
                colorType = ImageInfo.COLOR_TYPE_YCbCr;
            } else if (colorTransform == App14Segment.ADOBE_COLOR_TRANSFORM_YCCK) {
                colorType = ImageInfo.COLOR_TYPE_YCCK;
            }
        } else if (jfifSegment != null) {
            if (Number_of_components == 1) {
                colorType = ImageInfo.COLOR_TYPE_GRAYSCALE;
            } else if (Number_of_components == 3) {
                colorType = ImageInfo.COLOR_TYPE_YCbCr;
            }
        } else {
            if (Number_of_components == 1) {
                colorType = ImageInfo.COLOR_TYPE_GRAYSCALE;
            } else if (Number_of_components == 2) {
                colorType = ImageInfo.COLOR_TYPE_GRAYSCALE;
                isTransparent = true;
            } else if (Number_of_components == 3 || Number_of_components == 4) {
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
                if (Number_of_components == 3 && have1 && have2 && have3 && !have4 && !haveOther) {
                    colorType = ImageInfo.COLOR_TYPE_YCbCr;
                } else if (Number_of_components == 4 && have1 && have2 && have3 && have4 && !haveOther) {
                    colorType = ImageInfo.COLOR_TYPE_YCbCr;
                    isTransparent = true;
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
                        colorType = ImageInfo.COLOR_TYPE_RGB;
                    } else if (haveR && haveG && haveB && haveA && !haveC && !havec && !haveY) {
                        colorType = ImageInfo.COLOR_TYPE_RGB;
                        isTransparent = true;
                    } else if (haveY && haveC && havec && !haveR && !haveG && !haveB && !haveA) {
                        colorType = ImageInfo.COLOR_TYPE_YCC;
                    } else if (haveY && haveC && havec && haveA && !haveR && !haveG && !haveB) {
                        colorType = ImageInfo.COLOR_TYPE_YCC;
                        isTransparent = true;
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
                        final boolean isSubsampled = (minHorizontalSamplingFactor != maxHorizontalSmaplingFactor) ||
                                (minVerticalSamplingFactor != maxVerticalSamplingFactor);
                        if (Number_of_components == 3) {
                            if (isSubsampled) {
                                colorType = ImageInfo.COLOR_TYPE_YCbCr;
                            } else {
                                colorType = ImageInfo.COLOR_TYPE_RGB;
                            }
                        } else if (Number_of_components == 4) {
                            if (isSubsampled) {
                                colorType = ImageInfo.COLOR_TYPE_YCCK;
                            } else {
                                colorType = ImageInfo.COLOR_TYPE_CMYK;
                            }
                        }
                    }
                }
            }
        }

        final String compressionAlgorithm = ImageInfo.COMPRESSION_ALGORITHM_JPEG;

        final ImageInfo result = new ImageInfo(FormatDetails, BitsPerPixel, Comments,
                Format, FormatName, Height, MimeType, NumberOfImages,
                PhysicalHeightDpi, PhysicalHeightInch, PhysicalWidthDpi,
                PhysicalWidthInch, Width, isProgressive, isTransparent,
                usesPalette, colorType, compressionAlgorithm);

        return result;
    }

    // public ImageInfo getImageInfo(ByteSource byteSource, Map params)
    // throws ImageReadException, IOException
    // {
    //
    // List allSegments = readSegments(byteSource, null, false);
    //
    // final int SOF_MARKERS[] = new int[]{
    // SOF0Marker, SOF1Marker, SOF2Marker, SOF3Marker, SOF5Marker,
    // SOF6Marker, SOF7Marker, SOF9Marker, SOF10Marker, SOF11Marker,
    // SOF13Marker, SOF14Marker, SOF15Marker,
    // };
    //
    // List sofMarkers = new ArrayList();
    // for(int i=0;i<SOF_MARKERS.length;i++)
    // sofMarkers.add(new Integer(SOF_MARKERS[i]));
    // List SOFSegments = filterSegments(allSegments, sofMarkers);
    // if (SOFSegments == null || SOFSegments.size()<1)
    // throw new ImageReadException("No SOFN Data Found.");
    //
    // List jfifMarkers = new ArrayList();
    // jfifMarkers.add(new Integer(JFIFMarker));
    // List jfifSegments = filterSegments(allSegments, jfifMarkers);
    //
    // SofnSegment firstSOFNSegment = (SofnSegment) SOFSegments.get(0);
    //
    // int Width = firstSOFNSegment.width;
    // int Height = firstSOFNSegment.height;
    //
    // JfifSegment jfifSegment = null;
    //
    // if (jfifSegments != null && jfifSegments.size() > 0)
    // jfifSegment = (JfifSegment) jfifSegments.get(0);
    //
    // double x_density = -1.0;
    // double y_density = -1.0;
    // double units_per_inch = -1.0;
    // // int JFIF_major_version;
    // // int JFIF_minor_version;
    // String FormatDetails;
    //
    // if (jfifSegment != null)
    // {
    // x_density = jfifSegment.xDensity;
    // y_density = jfifSegment.yDensity;
    // int density_units = jfifSegment.densityUnits;
    // // JFIF_major_version = fTheJFIFSegment.JFIF_major_version;
    // // JFIF_minor_version = fTheJFIFSegment.JFIF_minor_version;
    //
    // FormatDetails = "Jpeg/JFIF v." + jfifSegment.jfifMajorVersion
    // + "." + jfifSegment.jfifMinorVersion;
    //
    // switch (density_units)
    // {
    // case 0 :
    // break;
    // case 1 : // inches
    // units_per_inch = 1.0;
    // break;
    // case 2 : // cms
    // units_per_inch = 2.54;
    // break;
    // default :
    // break;
    // }
    // }
    // else
    // {
    // JpegImageMetadata metadata = (JpegImageMetadata) getMetadata(byteSource,
    // params);
    //
    // {
    // TiffField field = metadata
    // .findEXIFValue(TiffField.TIFF_TAG_XRESOLUTION);
    // if (field == null)
    // throw new ImageReadException("No XResolution");
    //
    // x_density = ((Number) field.getValue()).doubleValue();
    // }
    // {
    // TiffField field = metadata
    // .findEXIFValue(TiffField.TIFF_TAG_YRESOLUTION);
    // if (field == null)
    // throw new ImageReadException("No YResolution");
    //
    // y_density = ((Number) field.getValue()).doubleValue();
    // }
    // {
    // TiffField field = metadata
    // .findEXIFValue(TiffField.TIFF_TAG_RESOLUTION_UNIT);
    // if (field == null)
    // throw new ImageReadException("No ResolutionUnits");
    //
    // int density_units = ((Number) field.getValue()).intValue();
    //
    // switch (density_units)
    // {
    // case 1 :
    // break;
    // case 2 : // inches
    // units_per_inch = 1.0;
    // break;
    // case 3 : // cms
    // units_per_inch = 2.54;
    // break;
    // default :
    // break;
    // }
    //
    // }
    //
    // FormatDetails = "Jpeg/DCM";
    //
    // }
    //
    // int PhysicalHeightDpi = -1;
    // float PhysicalHeightInch = -1;
    // int PhysicalWidthDpi = -1;
    // float PhysicalWidthInch = -1;
    //
    // if (units_per_inch > 0)
    // {
    // PhysicalWidthDpi = (int) Math.round((double) x_density
    // / units_per_inch);
    // PhysicalWidthInch = (float) ((double) Width / (x_density *
    // units_per_inch));
    // PhysicalHeightDpi = (int) Math.round((double) y_density
    // * units_per_inch);
    // PhysicalHeightInch = (float) ((double) Height / (y_density *
    // units_per_inch));
    // }
    //
    // List Comments = new ArrayList();
    // // TODO: comments...
    //
    // int Number_of_components = firstSOFNSegment.numberOfComponents;
    // int Precision = firstSOFNSegment.precision;
    //
    // int BitsPerPixel = Number_of_components * Precision;
    // ImageFormat Format = ImageFormat.IMAGE_FORMAT_JPEG;
    // String FormatName = "JPEG (Joint Photographic Experts Group) Format";
    // String MimeType = "image/jpeg";
    // // we ought to count images, but don't yet.
    // int NumberOfImages = -1;
    // // not accurate ... only reflects first
    // boolean isProgressive = firstSOFNSegment.marker == SOF2Marker;
    //
    // boolean isTransparent = false; // TODO: inaccurate.
    // boolean usesPalette = false; // TODO: inaccurate.
    // int ColorType;
    // if (Number_of_components == 1)
    // ColorType = ImageInfo.COLOR_TYPE_BW;
    // else if (Number_of_components == 3)
    // ColorType = ImageInfo.COLOR_TYPE_RGB;
    // else if (Number_of_components == 4)
    // ColorType = ImageInfo.COLOR_TYPE_CMYK;
    // else
    // ColorType = ImageInfo.COLOR_TYPE_UNKNOWN;
    //
    // String compressionAlgorithm = ImageInfo.COMPRESSION_ALGORITHM_JPEG;
    //
    // ImageInfo result = new ImageInfo(FormatDetails, BitsPerPixel, Comments,
    // Format, FormatName, Height, MimeType, NumberOfImages,
    // PhysicalHeightDpi, PhysicalHeightInch, PhysicalWidthDpi,
    // PhysicalWidthInch, Width, isProgressive, isTransparent,
    // usesPalette, ColorType, compressionAlgorithm);
    //
    // return result;
    // }

    @Override
    public boolean dumpImageFile(final PrintWriter pw, final ByteSource byteSource)
            throws ImageReadException, IOException {
        pw.println("tiff.dumpImageFile");

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
