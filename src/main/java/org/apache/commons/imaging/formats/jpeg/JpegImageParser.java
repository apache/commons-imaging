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

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.imaging.AbstractImageParser;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.common.Allocator;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.XmpEmbeddable;
import org.apache.commons.imaging.common.XmpImagingParameters;
import org.apache.commons.imaging.formats.jpeg.decoder.JpegDecoder;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcParser;
import org.apache.commons.imaging.formats.jpeg.iptc.PhotoshopApp13Data;
import org.apache.commons.imaging.formats.jpeg.segments.AbstractGenericSegment;
import org.apache.commons.imaging.formats.jpeg.segments.AbstractSegment;
import org.apache.commons.imaging.formats.jpeg.segments.App13Segment;
import org.apache.commons.imaging.formats.jpeg.segments.App14Segment;
import org.apache.commons.imaging.formats.jpeg.segments.App2Segment;
import org.apache.commons.imaging.formats.jpeg.segments.ComSegment;
import org.apache.commons.imaging.formats.jpeg.segments.DqtSegment;
import org.apache.commons.imaging.formats.jpeg.segments.JfifSegment;
import org.apache.commons.imaging.formats.jpeg.segments.SofnSegment;
import org.apache.commons.imaging.formats.jpeg.segments.UnknownSegment;
import org.apache.commons.imaging.formats.jpeg.xmp.JpegXmpParser;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.formats.tiff.TiffImageParser;
import org.apache.commons.imaging.formats.tiff.TiffImagingParameters;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.internal.Debug;
import org.apache.commons.lang3.ArrayUtils;

public class JpegImageParser extends AbstractImageParser<JpegImagingParameters> implements XmpEmbeddable<JpegImagingParameters> {

    private static final Logger LOGGER = Logger.getLogger(JpegImageParser.class.getName());

    private static final String DEFAULT_EXTENSION = ImageFormats.JPEG.getDefaultExtension();
    private static final String[] ACCEPTED_EXTENSIONS = ImageFormats.JPEG.getExtensions();

    public static boolean isExifApp1Segment(final AbstractGenericSegment segment) {
        return JpegConstants.EXIF_IDENTIFIER_CODE.isStartOf(segment.getSegmentData());
    }

    /**
     * Constructs a new instance with the big-endian byte order.
     */
    public JpegImageParser() {
        // empty
    }

    private byte[] assembleSegments(final List<App2Segment> segments) throws ImagingException {
        try {
            return assembleSegments(segments, false);
        } catch (final ImagingException e) {
            return assembleSegments(segments, true);
        }
    }

    private byte[] assembleSegments(final List<App2Segment> segments, final boolean startWithZero) throws ImagingException {
        if (segments.isEmpty()) {
            throw new ImagingException("No App2 Segments Found.");
        }

        final int markerCount = segments.get(0).numMarkers;

        if (segments.size() != markerCount) {
            throw new ImagingException("App2 Segments Missing.  Found: " + segments.size() + ", Expected: " + markerCount + ".");
        }

        Collections.sort(segments);

        final int offset = startWithZero ? 0 : 1;

        int total = 0;
        for (int i = 0; i < segments.size(); i++) {
            final App2Segment segment = segments.get(i);

            if (i + offset != segment.curMarker) {
                dumpSegments(segments);
                throw new ImagingException("Incoherent App2 Segment Ordering.  i: " + i + ", segment[" + i + "].curMarker: " + segment.curMarker + ".");
            }

            if (markerCount != segment.numMarkers) {
                dumpSegments(segments);
                throw new ImagingException(
                        "Inconsistent App2 Segment Count info.  markerCount: " + markerCount + ", segment[" + i + "].numMarkers: " + segment.numMarkers + ".");
            }

            if (segment.getIccBytes() != null) {
                total += segment.getIccBytes().length;
            }
        }

        final byte[] result = Allocator.byteArray(total);
        int progress = 0;

        for (final App2Segment segment : segments) {
            System.arraycopy(segment.getIccBytes(), 0, result, progress, segment.getIccBytes().length);
            progress += segment.getIccBytes().length;
        }

        return result;
    }

    @Override
    public boolean dumpImageFile(final PrintWriter pw, final ByteSource byteSource) throws ImagingException, IOException {
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
            final List<AbstractSegment> abstractSegments = readSegments(byteSource, null, false);

            if (abstractSegments == null) {
                throw new ImagingException("No Segments Found.");
            }

            for (int d = 0; d < abstractSegments.size(); d++) {

                final AbstractSegment abstractSegment = abstractSegments.get(d);

                final NumberFormat nf = NumberFormat.getIntegerInstance();
                // this.debugNumber("found, marker: ", marker, 4);
                pw.println(d + ": marker: " + Integer.toHexString(abstractSegment.marker) + ", " + abstractSegment.getDescription() + " (length: "
                        + nf.format(abstractSegment.length) + ")");
                abstractSegment.dump(pw);
            }

            pw.println("");
        }

        return true;
    }

    private void dumpSegments(final List<? extends AbstractSegment> v) {
        Debug.debug();
        Debug.debug("dumpSegments: " + v.size());

        for (int i = 0; i < v.size(); i++) {
            final App2Segment segment = (App2Segment) v.get(i);

            Debug.debug(i + ": " + segment.curMarker + " / " + segment.numMarkers);
        }
        Debug.debug();
    }

    private List<AbstractSegment> filterApp1Segments(final List<AbstractSegment> abstractSegments) {
        final List<AbstractSegment> result = new ArrayList<>();

        for (final AbstractSegment s : abstractSegments) {
            final AbstractGenericSegment segment = (AbstractGenericSegment) s;
            if (isExifApp1Segment(segment)) {
                result.add(segment);
            }
        }

        return result;
    }

    @Override
    protected String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS;
    }

    @Override
    protected ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[] { ImageFormats.JPEG, //
        };
    }

    @Override
    public final BufferedImage getBufferedImage(final ByteSource byteSource, final JpegImagingParameters params) throws ImagingException, IOException {
        final JpegDecoder jpegDecoder = new JpegDecoder();
        return jpegDecoder.decode(byteSource);
    }

    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Override
    public JpegImagingParameters getDefaultParameters() {
        return new JpegImagingParameters();
    }

    public TiffImageMetadata getExifMetadata(final ByteSource byteSource, TiffImagingParameters params) throws ImagingException, IOException {
        final byte[] bytes = getExifRawData(byteSource);
        if (null == bytes) {
            return null;
        }

        if (params == null) {
            params = new TiffImagingParameters();
        }
        params.setReadThumbnails(Boolean.TRUE);

        return (TiffImageMetadata) new TiffImageParser().getMetadata(bytes, params);
    }

    public byte[] getExifRawData(final ByteSource byteSource) throws ImagingException, IOException {
        final List<AbstractSegment> abstractSegments = readSegments(byteSource, new int[] { JpegConstants.JPEG_APP1_MARKER, }, false);

        if (abstractSegments == null || abstractSegments.isEmpty()) {
            return null;
        }

        final List<AbstractSegment> exifSegments = filterApp1Segments(abstractSegments);
        if (LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.finest("exifSegments.size()" + ": " + exifSegments.size());
        }

        // Debug.debug("segments", segments);
        // Debug.debug("exifSegments", exifSegments);

        // TODO: concatenate if multiple segments, need example.
        if (exifSegments.isEmpty()) {
            return null;
        }
        if (exifSegments.size() > 1) {
            throw new ImagingException(
                    "Imaging currently can't parse EXIF metadata split across multiple APP1 segments.  " + "Please send this image to the Imaging project.");
        }

        final AbstractGenericSegment segment = (AbstractGenericSegment) exifSegments.get(0);
        final byte[] bytes = segment.getSegmentData();

        // byte[] head = readBytearray("exif head", bytes, 0, 6);
        //
        // Debug.debug("head", head);

        return remainingBytes("trimmed exif bytes", bytes, 6);
    }

    @Override
    public byte[] getIccProfileBytes(final ByteSource byteSource, final JpegImagingParameters params) throws ImagingException, IOException {
        final List<AbstractSegment> abstractSegments = readSegments(byteSource, new int[] { JpegConstants.JPEG_APP2_MARKER, }, false);

        final List<App2Segment> filtered = new ArrayList<>();
        if (abstractSegments != null) {
            // throw away non-icc profile app2 segments.
            for (final AbstractSegment s : abstractSegments) {
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
    public ImageInfo getImageInfo(final ByteSource byteSource, final JpegImagingParameters params) throws ImagingException, IOException {
        // List allSegments = readSegments(byteSource, null, false);

        final List<AbstractSegment> SOF_segments = readSegments(byteSource, new int[] {
                // kJFIFMarker,

                JpegConstants.SOF0_MARKER, JpegConstants.SOF1_MARKER, JpegConstants.SOF2_MARKER, JpegConstants.SOF3_MARKER, JpegConstants.SOF5_MARKER,
                JpegConstants.SOF6_MARKER, JpegConstants.SOF7_MARKER, JpegConstants.SOF9_MARKER, JpegConstants.SOF10_MARKER, JpegConstants.SOF11_MARKER,
                JpegConstants.SOF13_MARKER, JpegConstants.SOF14_MARKER, JpegConstants.SOF15_MARKER,

        }, false);

        if (SOF_segments == null) {
            throw new ImagingException("No SOFN Data Found.");
        }

        // if (SOF_segments.size() != 1)
        // System.out.println("Incoherent SOFN Data Found: "
        // + SOF_segments.size());

        final List<AbstractSegment> jfifSegments = readSegments(byteSource, new int[] { JpegConstants.JFIF_MARKER, }, true);

        final SofnSegment fSOFNSegment = (SofnSegment) SOF_segments.get(0);
        // SofnSegment fSOFNSegment = (SofnSegment) findSegment(segments,
        // SOFNmarkers);

        if (fSOFNSegment == null) {
            throw new ImagingException("No SOFN Data Found.");
        }

        final int width = fSOFNSegment.width;
        final int height = fSOFNSegment.height;

        JfifSegment jfifSegment = null;

        if (jfifSegments != null && !jfifSegments.isEmpty()) {
            jfifSegment = (JfifSegment) jfifSegments.get(0);
        }

        final List<AbstractSegment> app14Segments = readSegments(byteSource, new int[] { JpegConstants.JPEG_APP14_MARKER }, true);
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
        final String formatDetails;

        if (jfifSegment != null) {
            xDensity = jfifSegment.xDensity;
            yDensity = jfifSegment.yDensity;
            final int densityUnits = jfifSegment.densityUnits;
            // JFIF_major_version = fTheJFIFSegment.JFIF_major_version;
            // JFIF_minor_version = fTheJFIFSegment.JFIF_minor_version;

            formatDetails = "Jpeg/JFIF v." + jfifSegment.jfifMajorVersion + "." + jfifSegment.jfifMinorVersion;

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
            final JpegImageMetadata metadata = (JpegImageMetadata) getMetadata(byteSource, params);

            if (metadata != null) {
                {
                    final TiffField field = metadata.findExifValue(TiffTagConstants.TIFF_TAG_XRESOLUTION);
                    if (field != null) {
                        xDensity = ((Number) field.getValue()).doubleValue();
                    }
                }
                {
                    final TiffField field = metadata.findExifValue(TiffTagConstants.TIFF_TAG_YRESOLUTION);
                    if (field != null) {
                        yDensity = ((Number) field.getValue()).doubleValue();
                    }
                }
                {
                    final TiffField field = metadata.findExifValue(TiffTagConstants.TIFF_TAG_RESOLUTION_UNIT);
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

        final List<AbstractSegment> commentSegments = readSegments(byteSource, new int[] { JpegConstants.COM_MARKER }, false);
        final List<String> comments = Allocator.arrayList(commentSegments.size());
        for (final AbstractSegment commentSegment : commentSegments) {
            final ComSegment comSegment = (ComSegment) commentSegment;
            comments.add(new String(comSegment.getComment(), StandardCharsets.UTF_8));
        }

        final int numberOfComponents = fSOFNSegment.numberOfComponents;
        final int precision = fSOFNSegment.precision;

        final int bitsPerPixel = numberOfComponents * precision;
        final ImageFormat format = ImageFormats.JPEG;
        final String formatName = "JPEG (Joint Photographic Experts Group) Format";
        final String mimeType = "image/jpeg";
        // TODO: we ought to count images, but don't yet.
        final int numberOfImages = 1;
        // not accurate ... only reflects first
        final boolean progressive = fSOFNSegment.marker == JpegConstants.SOF2_MARKER;

        boolean transparent = false;
        final boolean usesPalette = false; // TODO: inaccurate.

        // See https://docs.oracle.com/javase/8/docs/api/javax/imageio/metadata/doc-files/jpeg_metadata.html#color
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
                    switch (id) {
                    case 1:
                        have1 = true;
                        break;
                    case 2:
                        have2 = true;
                        break;
                    case 3:
                        have3 = true;
                        break;
                    case 4:
                        have4 = true;
                        break;
                    default:
                        haveOther = true;
                        break;
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
                        switch (id) {
                        case 'R':
                            haveR = true;
                            break;
                        case 'G':
                            haveG = true;
                            break;
                        case 'B':
                            haveB = true;
                            break;
                        case 'A':
                            haveA = true;
                            break;
                        case 'C':
                            haveC = true;
                            break;
                        case 'c':
                            havec = true;
                            break;
                        case 'Y':
                            haveY = true;
                            break;
                        default:
                            break;
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
                        final boolean isSubsampled = minHorizontalSamplingFactor != maxHorizontalSmaplingFactor
                                || minVerticalSamplingFactor != maxVerticalSamplingFactor;
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

        return new ImageInfo(formatDetails, bitsPerPixel, comments, format, formatName, height, mimeType, numberOfImages, physicalHeightDpi, physicalHeightInch,
                physicalWidthDpi, physicalWidthInch, width, progressive, transparent, usesPalette, colorType, compressionAlgorithm);
    }

    @Override
    public Dimension getImageSize(final ByteSource byteSource, final JpegImagingParameters params) throws ImagingException, IOException {
        final List<AbstractSegment> abstractSegments = readSegments(byteSource, new int[] {
                // kJFIFMarker,
                JpegConstants.SOF0_MARKER, JpegConstants.SOF1_MARKER, JpegConstants.SOF2_MARKER, JpegConstants.SOF3_MARKER, JpegConstants.SOF5_MARKER,
                JpegConstants.SOF6_MARKER, JpegConstants.SOF7_MARKER, JpegConstants.SOF9_MARKER, JpegConstants.SOF10_MARKER, JpegConstants.SOF11_MARKER,
                JpegConstants.SOF13_MARKER, JpegConstants.SOF14_MARKER, JpegConstants.SOF15_MARKER,

        }, true);

        if (abstractSegments == null || abstractSegments.isEmpty()) {
            throw new ImagingException("No JFIF Data Found.");
        }

        if (abstractSegments.size() > 1) {
            throw new ImagingException("Redundant JFIF Data Found.");
        }

        final SofnSegment fSOFNSegment = (SofnSegment) abstractSegments.get(0);

        return new Dimension(fSOFNSegment.width, fSOFNSegment.height);
    }

    @Override
    public ImageMetadata getMetadata(final ByteSource byteSource, JpegImagingParameters params) throws ImagingException, IOException {
        if (params == null) {
            params = new JpegImagingParameters();
        }
        final TiffImageMetadata exif = getExifMetadata(byteSource, new TiffImagingParameters());

        final JpegPhotoshopMetadata photoshop = getPhotoshopMetadata(byteSource, params);

        if (null == exif && null == photoshop) {
            return null;
        }

        return new JpegImageMetadata(photoshop, exif);
    }

    @Override
    public String getName() {
        return "Jpeg-Custom";
    }

    public JpegPhotoshopMetadata getPhotoshopMetadata(final ByteSource byteSource, final JpegImagingParameters params) throws ImagingException, IOException {
        final List<AbstractSegment> abstractSegments = readSegments(byteSource, new int[] { JpegConstants.JPEG_APP13_MARKER, }, false);

        if (abstractSegments == null || abstractSegments.isEmpty()) {
            return null;
        }

        PhotoshopApp13Data photoshopApp13Data = null;

        for (final AbstractSegment s : abstractSegments) {
            final App13Segment segment = (App13Segment) s;

            final PhotoshopApp13Data data = segment.parsePhotoshopSegment(params);
            if (data != null) {
                if (photoshopApp13Data != null) {
                    throw new ImagingException("JPEG contains more than one Photoshop App13 segment.");
                }
                photoshopApp13Data = data;
            }
        }

        if (null == photoshopApp13Data) {
            return null;
        }
        return new JpegPhotoshopMetadata(photoshopApp13Data);
    }

    /**
     * Extracts embedded XML metadata as XML string.
     * <p>
     *
     * @param byteSource File containing image data.
     * @param params     Map of optional parameters, defined in ImagingConstants.
     * @return Xmp Xml as String, if present. Otherwise, returns null.
     */
    @Override
    public String getXmpXml(final ByteSource byteSource, final XmpImagingParameters<JpegImagingParameters> params) throws ImagingException, IOException {

        final List<String> result = new ArrayList<>();

        final JpegUtils.Visitor visitor = new JpegUtils.Visitor() {
            // return false to exit before reading image data.
            @Override
            public boolean beginSos() {
                return false;
            }

            // return false to exit traversal.
            @Override
            public boolean visitSegment(final int marker, final byte[] markerBytes, final int markerLength, final byte[] markerLengthBytes,
                    final byte[] segmentData) throws ImagingException {
                if (marker == 0xffd9) {
                    return false;
                }

                if (marker == JpegConstants.JPEG_APP1_MARKER && new JpegXmpParser().isXmpJpegSegment(segmentData)) {
                    result.add(new JpegXmpParser().parseXmpJpegSegment(segmentData));
                    return false;
                }

                return true;
            }

            @Override
            public void visitSos(final int marker, final byte[] markerBytes, final byte[] imageData) {
                // don't need image data
            }
        };
        new JpegUtils().traverseJfif(byteSource, visitor);

        if (result.isEmpty()) {
            return null;
        }
        if (result.size() > 1) {
            throw new ImagingException("JPEG file contains more than one XMP segment.");
        }
        return result.get(0);
    }

    public boolean hasExifSegment(final ByteSource byteSource) throws ImagingException, IOException {
        final boolean[] result = { false, };

        final JpegUtils.Visitor visitor = new JpegUtils.Visitor() {
            // return false to exit before reading image data.
            @Override
            public boolean beginSos() {
                return false;
            }

            // return false to exit traversal.
            @Override
            public boolean visitSegment(final int marker, final byte[] markerBytes, final int markerLength, final byte[] markerLengthBytes,
                    final byte[] segmentData) {
                if (marker == 0xffd9) {
                    return false;
                }

                if (marker == JpegConstants.JPEG_APP1_MARKER && JpegConstants.EXIF_IDENTIFIER_CODE.isStartOf(segmentData)) {
                    result[0] = true;
                    return false;
                }

                return true;
            }

            @Override
            public void visitSos(final int marker, final byte[] markerBytes, final byte[] imageData) {
                // don't need image data
            }
        };

        new JpegUtils().traverseJfif(byteSource, visitor);

        return result[0];
    }

    public boolean hasIptcSegment(final ByteSource byteSource) throws ImagingException, IOException {
        final boolean[] result = { false, };

        final JpegUtils.Visitor visitor = new JpegUtils.Visitor() {
            // return false to exit before reading image data.
            @Override
            public boolean beginSos() {
                return false;
            }

            // return false to exit traversal.
            @Override
            public boolean visitSegment(final int marker, final byte[] markerBytes, final int markerLength, final byte[] markerLengthBytes,
                    final byte[] segmentData) {
                if (marker == 0xffd9) {
                    return false;
                }

                if (marker == JpegConstants.JPEG_APP13_MARKER && new IptcParser().isPhotoshopJpegSegment(segmentData)) {
                    result[0] = true;
                    return false;
                }

                return true;
            }

            @Override
            public void visitSos(final int marker, final byte[] markerBytes, final byte[] imageData) {
                // don't need image data
            }
        };

        new JpegUtils().traverseJfif(byteSource, visitor);

        return result[0];
    }

    public boolean hasXmpSegment(final ByteSource byteSource) throws ImagingException, IOException {
        final boolean[] result = { false, };

        final JpegUtils.Visitor visitor = new JpegUtils.Visitor() {
            // return false to exit before reading image data.
            @Override
            public boolean beginSos() {
                return false;
            }

            // return false to exit traversal.
            @Override
            public boolean visitSegment(final int marker, final byte[] markerBytes, final int markerLength, final byte[] markerLengthBytes,
                    final byte[] segmentData) {
                if (marker == 0xffd9) {
                    return false;
                }

                if (marker == JpegConstants.JPEG_APP1_MARKER && new JpegXmpParser().isXmpJpegSegment(segmentData)) {
                    result[0] = true;
                    return false;
                }

                return true;
            }

            @Override
            public void visitSos(final int marker, final byte[] markerBytes, final byte[] imageData) {
                // don't need image data
            }
        };
        new JpegUtils().traverseJfif(byteSource, visitor);

        return result[0];
    }

    private boolean keepMarker(final int marker, final int[] markers) {
        return ArrayUtils.contains(markers, marker);
    }

    public List<AbstractSegment> readSegments(final ByteSource byteSource, final int[] markers, final boolean returnAfterFirst)
            throws ImagingException, IOException {
        final List<AbstractSegment> result = new ArrayList<>();
        final int[] sofnSegments = {
                // kJFIFMarker,
                JpegConstants.SOF0_MARKER, JpegConstants.SOF1_MARKER, JpegConstants.SOF2_MARKER, JpegConstants.SOF3_MARKER, JpegConstants.SOF5_MARKER,
                JpegConstants.SOF6_MARKER, JpegConstants.SOF7_MARKER, JpegConstants.SOF9_MARKER, JpegConstants.SOF10_MARKER, JpegConstants.SOF11_MARKER,
                JpegConstants.SOF13_MARKER, JpegConstants.SOF14_MARKER, JpegConstants.SOF15_MARKER, };

        final JpegUtils.Visitor visitor = new JpegUtils.Visitor() {
            // return false to exit before reading image data.
            @Override
            public boolean beginSos() {
                return false;
            }

            // return false to exit traversal.
            @Override
            public boolean visitSegment(final int marker, final byte[] markerBytes, final int markerLength, final byte[] markerLengthBytes,
                    final byte[] segmentData) throws ImagingException, IOException {
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
                    result.add(new App13Segment(marker, segmentData));
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
                    } else if (marker >= JpegConstants.JPEG_APP1_MARKER && marker <= JpegConstants.JPEG_APP15_MARKER) {
                        result.add(new UnknownSegment(marker, segmentData));
                    } else if (marker == JpegConstants.COM_MARKER) {
                        result.add(new ComSegment(marker, segmentData));
                    }
                    break;
                }

                return !returnAfterFirst;
            }

            @Override
            public void visitSos(final int marker, final byte[] markerBytes, final byte[] imageData) {
                // don't need image data
            }
        };

        new JpegUtils().traverseJfif(byteSource, visitor);

        return result;
    }
}
