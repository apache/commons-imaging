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
package org.apache.commons.imaging.formats.jpeg.xmp;

import static org.apache.commons.imaging.common.BinaryFunctions.startsWith;

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
    protected abstract static class JFIFPiece {
        @Override
        public String toString() {
            return "[" + this.getClass().getName() + "]";
        }

        protected abstract void write(OutputStream os) throws IOException;
    }
    static class JFIFPieceImageData extends JFIFPiece {
        private final byte[] markerBytes;
        private final byte[] imageData;

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
    protected static class JFIFPieces {
        public final List<JFIFPiece> pieces;
        public final List<JFIFPiece> segmentPieces;

        public JFIFPieces(final List<JFIFPiece> pieces,
                final List<JFIFPiece> segmentPieces) {
            this.pieces = pieces;
            this.segmentPieces = segmentPieces;
        }

    }
    protected static class JFIFPieceSegment extends JFIFPiece {
        public final int marker;
        private final byte[] markerBytes;
        private final byte[] segmentLengthBytes;
        private final byte[] segmentData;

        public JFIFPieceSegment(final int marker, final byte[] segmentData) {
            this(marker,
                    ByteConversions.toBytes((short) marker, JPEG_BYTE_ORDER),
                    ByteConversions.toBytes((short) (segmentData.length + 2), JPEG_BYTE_ORDER),
                    segmentData);
        }

        JFIFPieceSegment(final int marker, final byte[] markerBytes,
                final byte[] segmentLengthBytes, final byte[] segmentData) {
            this.marker = marker;
            this.markerBytes = markerBytes;
            this.segmentLengthBytes = segmentLengthBytes;
            this.segmentData = segmentData.clone();
        }

        public byte[] getSegmentData() {
            return segmentData.clone();
        }

        public boolean isApp1Segment() {
            return marker == JpegConstants.JPEG_APP1_MARKER;
        }

        public boolean isAppSegment() {
            return marker >= JpegConstants.JPEG_APP0_MARKER && marker <= JpegConstants.JPEG_APP15_MARKER;
        }

        public boolean isExifSegment() {
            if (marker != JpegConstants.JPEG_APP1_MARKER) {
                return false;
            }
            if (!startsWith(segmentData, JpegConstants.EXIF_IDENTIFIER_CODE)) {
                return false;
            }
            return true;
        }

        public boolean isPhotoshopApp13Segment() {
            if (marker != JpegConstants.JPEG_APP13_MARKER) {
                return false;
            }
            if (!new IptcParser().isPhotoshopJpegSegment(segmentData)) {
                return false;
            }
            return true;
        }

        public boolean isXmpSegment() {
            if (marker != JpegConstants.JPEG_APP1_MARKER) {
                return false;
            }
            if (!startsWith(segmentData, JpegConstants.XMP_IDENTIFIER)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "[" + this.getClass().getName() + " (0x"
                    + Integer.toHexString(marker) + ")]";
        }

        @Override
        protected void write(final OutputStream os) throws IOException {
            os.write(markerBytes);
            os.write(segmentLengthBytes);
            os.write(segmentData);
        }

    }

    private interface SegmentFilter {
        boolean filter(JFIFPieceSegment segment);
    }

    private static final ByteOrder JPEG_BYTE_ORDER = ByteOrder.BIG_ENDIAN;

    private static final SegmentFilter EXIF_SEGMENT_FILTER = JFIFPieceSegment::isExifSegment;

    private static final SegmentFilter XMP_SEGMENT_FILTER = JFIFPieceSegment::isXmpSegment;

    private static final SegmentFilter PHOTOSHOP_APP13_SEGMENT_FILTER = JFIFPieceSegment::isPhotoshopApp13Segment;

    /**
     * Constructs a new instance. to guess whether a file contains an image based on its file
     * extension.
     */
    public JpegRewriter() {
        super(JPEG_BYTE_ORDER);
    }

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
            public boolean visitSegment(final int marker, final byte[] markerBytes,
                    final int segmentLength, final byte[] segmentLengthBytes,
                    final byte[] segmentData) throws ImagingException, IOException {
                final JFIFPiece piece = new JFIFPieceSegment(marker, markerBytes,
                        segmentLengthBytes, segmentData);
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

    protected <T extends JFIFPiece> List<T> filterSegments(final List<T> segments,
            final SegmentFilter filter) {
        return filterSegments(segments, filter, false);
    }

    protected <T extends JFIFPiece> List<T> filterSegments(final List<T> segments,
            final SegmentFilter filter, final boolean reverse) {
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

    protected <T extends JFIFPiece> List<T> findPhotoshopApp13Segments(
            final List<T> segments) {
        return filterSegments(segments, PHOTOSHOP_APP13_SEGMENT_FILTER, true);
    }

    protected <T extends JFIFPiece, U extends JFIFPiece> List<JFIFPiece> insertAfterLastAppSegments(
            final List<T> segments, final List<U> newSegments) throws ImagingException {
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

    protected <T extends JFIFPiece, U extends JFIFPiece> List<JFIFPiece> insertBeforeFirstAppSegments(
            final List<T> segments, final List<U> newSegments) throws ImagingException {
        int firstAppIndex = -1;
        for (int i = 0; i < segments.size(); i++) {
            final JFIFPiece piece = segments.get(i);
            if (!(piece instanceof JFIFPieceSegment)) {
                continue;
            }

            final JFIFPieceSegment segment = (JFIFPieceSegment) piece;
            if (segment.isAppSegment()) {
                if (firstAppIndex == -1) {
                    firstAppIndex = i;
                }
            }
        }

        final List<JFIFPiece> result = new ArrayList<>(segments);
        if (firstAppIndex == -1) {
            throw new ImagingException("JPEG file has no APP segments.");
        }
        result.addAll(firstAppIndex, newSegments);
        return result;
    }

    protected <T extends JFIFPiece> List<T> removeExifSegments(final List<T> segments) {
        return filterSegments(segments, EXIF_SEGMENT_FILTER);
    }

    protected <T extends JFIFPiece> List<T> removePhotoshopApp13Segments(
            final List<T> segments) {
        return filterSegments(segments, PHOTOSHOP_APP13_SEGMENT_FILTER);
    }

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

    protected void writeSegments(final OutputStream outputStream,
            final List<? extends JFIFPiece> segments) throws IOException {
        try (DataOutputStream os = new DataOutputStream(outputStream)) {
            JpegConstants.SOI.writeTo(os);

            for (final JFIFPiece piece : segments) {
                piece.write(os);
            }
        }
    }

}
