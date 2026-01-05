/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.imaging.formats.jpeg.xmp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.common.BinaryFileParser;
import org.apache.commons.imaging.common.ByteConversions;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.apache.commons.imaging.formats.jpeg.JpegUtils;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcParser;

/**
 * Interface for Exif write/update/remove functionality for Jpeg/JFIF images.
 */
public class JpegRewriter extends BinaryFileParser {

    /**
     * Abstracts JFIF pieces.
     */
    protected abstract static class JFIFPiece {

        /**
         * Constructs a new instance.
         */
        protected JFIFPiece() {
            // Default constructor
        }

        @Override
        public String toString() {
            return "[" + this.getClass().getName() + "]";
        }

        /**
         * Writes the piece to output stream.
         *
         * @param os the output stream.
         * @throws IOException if an I/O error occurs.
         */
        protected abstract void write(OutputStream os) throws IOException;
    }

    /**
     * JFIF piece representing image data.
     */
    static class JFIFPieceImageData extends JFIFPiece {
        private final byte[] markerBytes;
        private final byte[] imageData;

        /**
         * Constructs image data piece.
         *
         * @param markerBytes the marker bytes.
         * @param imageData the image data.
         */
        JFIFPieceImageData(final byte[] markerBytes, final byte[] imageData) {
            this.markerBytes = markerBytes;
            this.imageData = imageData;
        }

        @Override
        protected void write(final OutputStream os) throws IOException {
            os.write(markerBytes);
            os.write(imageData);
        }
    }

    /**
     * JFIF pieces collection.
     */
    protected static class JFIFPieces {

        /** All pieces. */
        public final List<JFIFPiece> pieces;

        /** Segment pieces only. */
        public final List<JFIFPiece> segmentPieces;

        /**
         * Constructs JFIF pieces.
         *
         * @param pieces all pieces.
         * @param segmentPieces segment pieces.
         */
        public JFIFPieces(final List<JFIFPiece> pieces, final List<JFIFPiece> segmentPieces) {
            this.pieces = pieces;
            this.segmentPieces = segmentPieces;
        }

    }

    /**
     * JFIF piece representing a segment.
     */
    protected static class JFIFPieceSegment extends JFIFPiece {

        /** Marker value. */
        public final int marker;

        private final byte[] markerBytes;
        private final byte[] segmentLengthBytes;
        private final byte[] segmentData;

        /**
         * Constructs a segment piece.
         *
         * @param marker the marker.
         * @param segmentData the segment data.
         */
        public JFIFPieceSegment(final int marker, final byte[] segmentData) {
            this(marker, ByteConversions.toBytes((short) marker, JPEG_BYTE_ORDER), ByteConversions.toBytes((short) (segmentData.length + 2), JPEG_BYTE_ORDER),
                    segmentData);
        }

        /**
         * Constructs a segment piece.
         *
         * @param marker the marker.
         * @param markerBytes the marker bytes.
         * @param segmentLengthBytes the segment length bytes.
         * @param segmentData the segment data.
         */
        JFIFPieceSegment(final int marker, final byte[] markerBytes, final byte[] segmentLengthBytes, final byte[] segmentData) {
            this.marker = marker;
            this.markerBytes = markerBytes;
            this.segmentLengthBytes = segmentLengthBytes;
            this.segmentData = segmentData.clone();
        }

        /**
         * Gets the segment data.
         *
         * @return the segment data.
         */
        public byte[] getSegmentData() {
            return segmentData.clone();
        }

        /**
         * Checks if this is an APP1 segment.
         *
         * @return true if APP1 segment, false otherwise.
         */
        public boolean isApp1Segment() {
            return marker == JpegConstants.JPEG_APP1_MARKER;
        }

        /**
         * Checks if this is an APP segment.
         *
         * @return true if APP segment, false otherwise.
         */
        public boolean isAppSegment() {
            return marker >= JpegConstants.JPEG_APP0_MARKER && marker <= JpegConstants.JPEG_APP15_MARKER;
        }

        /**
         * Checks if this is an EXIF segment.
         *
         * @return true if EXIF segment, false otherwise.
         */
        public boolean isExifSegment() {
            if (marker != JpegConstants.JPEG_APP1_MARKER) {
                return false;
            }
            if (!JpegConstants.EXIF_IDENTIFIER_CODE.isStartOf(segmentData)) {
                return false;
            }
            return true;
        }

        /**
         * Checks if this is a Photoshop APP13 segment.
         *
         * @return true if Photoshop APP13 segment, false otherwise.
         */
        public boolean isPhotoshopApp13Segment() {
            if (marker != JpegConstants.JPEG_APP13_MARKER) {
                return false;
            }
            if (!new IptcParser().isPhotoshopJpegSegment(segmentData)) {
                return false;
            }
            return true;
        }

        /**
         * Checks if this is an XMP segment.
         *
         * @return true if XMP segment, false otherwise.
         */
        public boolean isXmpSegment() {
            if (marker != JpegConstants.JPEG_APP1_MARKER) {
                return false;
            }
            if (!JpegConstants.XMP_IDENTIFIER.isStartOf(segmentData)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "[" + this.getClass().getName() + " (0x" + Integer.toHexString(marker) + ")]";
        }

        @Override
        protected void write(final OutputStream os) throws IOException {
            os.write(markerBytes);
            os.write(segmentLengthBytes);
            os.write(segmentData);
        }

    }

    /**
     * Segment filter interface.
     */
    private interface SegmentFilter {

        /**
         * Filters a segment.
         *
         * @param segment the segment.
         * @return true to include, false to exclude.
         */
        boolean filter(JFIFPieceSegment segment);
    }

    private static final ByteOrder JPEG_BYTE_ORDER = ByteOrder.BIG_ENDIAN;

    private static final SegmentFilter EXIF_SEGMENT_FILTER = JFIFPieceSegment::isExifSegment;

    private static final SegmentFilter XMP_SEGMENT_FILTER = JFIFPieceSegment::isXmpSegment;

    private static final SegmentFilter PHOTOSHOP_APP13_SEGMENT_FILTER = JFIFPieceSegment::isPhotoshopApp13Segment;

    /**
     * Constructs a new instance.
     */
    public JpegRewriter() {
        // empty
    }

    /**
     * Analyzes JFIF structure.
     *
     * @param byteSource the byte source.
     * @return the JFIF pieces.
     * @throws ImagingException if an imaging error occurs.
     * @throws IOException if an I/O error occurs.
     */
    protected JFIFPieces analyzeJfif(final ByteSource byteSource) throws ImagingException, IOException {
        final List<JFIFPiece> pieces = new ArrayList<>();
        final List<JFIFPiece> segmentPieces = new ArrayList<>();

        final JpegUtils.Visitor visitor = new JpegUtils.Visitor() {
            // return false to exit before reading image data.
            @Override
            public boolean beginSos() {
                return true;
            }

            // return false to exit traversal.
            @Override
            public boolean visitSegment(final int marker, final byte[] markerBytes, final int segmentLength, final byte[] segmentLengthBytes,
                    final byte[] segmentData) throws ImagingException, IOException {
                final JFIFPiece piece = new JFIFPieceSegment(marker, markerBytes, segmentLengthBytes, segmentData);
                pieces.add(piece);
                segmentPieces.add(piece);

                return true;
            }

            @Override
            public void visitSos(final int marker, final byte[] markerBytes, final byte[] imageData) {
                pieces.add(new JFIFPieceImageData(markerBytes, imageData));
            }
        };

        new JpegUtils().traverseJfif(byteSource, visitor);

        return new JFIFPieces(pieces, segmentPieces);
    }

    /**
     * Filters segments using a filter.
     *
     * @param <T> the piece type.
     * @param segments the segments.
     * @param filter the filter.
     * @return the filtered segments.
     */
    protected <T extends JFIFPiece> List<T> filterSegments(final List<T> segments, final SegmentFilter filter) {
        return filterSegments(segments, filter, false);
    }

    /**
     * Filters segments using a filter with optional reverse logic.
     *
     * @param <T> the piece type.
     * @param segments the segments.
     * @param filter the filter.
     * @param reverse whether to reverse the filter logic.
     * @return the filtered segments.
     */
    protected <T extends JFIFPiece> List<T> filterSegments(final List<T> segments, final SegmentFilter filter, final boolean reverse) {
        final List<T> result = new ArrayList<>();

        for (final T piece : segments) {
            if (piece instanceof JFIFPieceSegment) {
                if (filter.filter((JFIFPieceSegment) piece) == reverse) {
                    result.add(piece);
                }
            } else if (!reverse) {
                result.add(piece);
            }
        }

        return result;
    }

    /**
     * Finds Photoshop APP13 segments.
     *
     * @param <T> the piece type.
     * @param segments the segments.
     * @return the filtered segments.
     */
    protected <T extends JFIFPiece> List<T> findPhotoshopApp13Segments(final List<T> segments) {
        return filterSegments(segments, PHOTOSHOP_APP13_SEGMENT_FILTER, true);
    }

    /**
     * Inserts new segments after last APP segment.
     *
     * @param <T> the piece type.
     * @param <U> the new piece type.
     * @param segments the segments.
     * @param newSegments the new segments to insert.
     * @return the combined segments.
     * @throws ImagingException if an imaging error occurs.
     */
    protected <T extends JFIFPiece, U extends JFIFPiece> List<JFIFPiece> insertAfterLastAppSegments(final List<T> segments, final List<U> newSegments)
            throws ImagingException {
        int lastAppIndex = -1;
        for (int i = 0; i < segments.size(); i++) {
            final JFIFPiece piece = segments.get(i);
            if (!(piece instanceof JFIFPieceSegment)) {
                continue;
            }

            final JFIFPieceSegment segment = (JFIFPieceSegment) piece;
            if (segment.isAppSegment()) {
                lastAppIndex = i;
            }
        }

        final List<JFIFPiece> result = new ArrayList<>(segments);
        if (lastAppIndex == -1) {
            if (segments.isEmpty()) {
                throw new ImagingException("JPEG file has no APP segments.");
            }
            result.addAll(1, newSegments);
        } else {
            result.addAll(lastAppIndex + 1, newSegments);
        }

        return result;
    }

    /**
     * Inserts new segments before first APP segment.
     *
     * @param <T> the piece type.
     * @param <U> the new piece type.
     * @param segments the segments.
     * @param newSegments the new segments to insert.
     * @return the combined segments.
     * @throws ImagingException if an imaging error occurs.
     */
    protected <T extends JFIFPiece, U extends JFIFPiece> List<JFIFPiece> insertBeforeFirstAppSegments(final List<T> segments, final List<U> newSegments)
            throws ImagingException {
        int firstAppIndex = -1;
        for (int i = 0; i < segments.size(); i++) {
            final JFIFPiece piece = segments.get(i);
            if (!(piece instanceof JFIFPieceSegment)) {
                continue;
            }

            final JFIFPieceSegment segment = (JFIFPieceSegment) piece;
            if (segment.isAppSegment() && firstAppIndex == -1) {
                firstAppIndex = i;
            }
        }

        final List<JFIFPiece> result = new ArrayList<>(segments);
        if (firstAppIndex == -1) {
            throw new ImagingException("JPEG file has no APP segments.");
        }
        result.addAll(firstAppIndex, newSegments);
        return result;
    }

    /**
     * Removes EXIF segments.
     *
     * @param <T> the piece type.
     * @param segments the segments.
     * @return the filtered segments.
     */
    protected <T extends JFIFPiece> List<T> removeExifSegments(final List<T> segments) {
        return filterSegments(segments, EXIF_SEGMENT_FILTER);
    }

    /**
     * Removes Photoshop APP13 segments.
     *
     * @param <T> the piece type.
     * @param segments the segments.
     * @return the filtered segments.
     */
    protected <T extends JFIFPiece> List<T> removePhotoshopApp13Segments(final List<T> segments) {
        return filterSegments(segments, PHOTOSHOP_APP13_SEGMENT_FILTER);
    }

    /**
     * Removes XMP segments.
     *
     * @param <T> the piece type.
     * @param segments the segments.
     * @return the filtered segments.
     */
    protected <T extends JFIFPiece> List<T> removeXmpSegments(final List<T> segments) {
        return filterSegments(segments, XMP_SEGMENT_FILTER);
    }

    // private void writeSegment(OutputStream os, JFIFPieceSegment piece)
    // throws ImageWriteException, IOException
    // {
    // byte[] markerBytes = convertShortToByteArray(JPEG_APP1_MARKER,
    // JPEG_BYTE_ORDER);
    // if (piece.segmentData.length > 0xffff)
    // throw new JpegSegmentOverflowException("JPEG segment is too long: "
    // + piece.segmentData.length);
    // int segmentLength = piece.segmentData.length + 2;
    // byte[] segmentLengthBytes = convertShortToByteArray(segmentLength,
    // JPEG_BYTE_ORDER);
    //
    // os.write(markerBytes);
    // os.write(segmentLengthBytes);
    // os.write(piece.segmentData);
    // }

    /**
     * Writes segments to output stream.
     *
     * @param outputStream the output stream.
     * @param segments the segments to write.
     * @throws IOException if an I/O error occurs.
     */
    protected void writeSegments(final OutputStream outputStream, final List<? extends JFIFPiece> segments) throws IOException {
        try (DataOutputStream os = new DataOutputStream(outputStream)) {
            JpegConstants.SOI.writeTo(os);

            for (final JFIFPiece piece : segments) {
                piece.write(os);
            }
        }
    }

}
