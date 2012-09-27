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

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.BinaryFileParser;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.apache.commons.imaging.formats.jpeg.JpegUtils;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcParser;

/**
 * Interface for Exif write/update/remove functionality for Jpeg/JFIF images.
 */
public class JpegRewriter extends BinaryFileParser implements JpegConstants {
    private static final int JPEG_BYTE_ORDER = BYTE_ORDER_NETWORK;

    /**
     * Constructor. to guess whether a file contains an image based on its file
     * extension.
     */
    public JpegRewriter() {
        setByteOrder(JPEG_BYTE_ORDER);
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

    protected abstract static class JFIFPiece {
        protected abstract void write(OutputStream os) throws IOException;

        @Override
        public String toString() {
            return "[" + this.getClass().getName() + "]";
        }
    }

    protected static class JFIFPieceSegment extends JFIFPiece {
        public final int marker;
        public final byte markerBytes[];
        public final byte segmentLengthBytes[];
        public final byte segmentData[];

        public JFIFPieceSegment(final int marker, final byte[] segmentData) {
            this(marker, int2ToByteArray(marker, JPEG_BYTE_ORDER),
                    int2ToByteArray(segmentData.length + 2, JPEG_BYTE_ORDER),
                    segmentData);
        }

        public JFIFPieceSegment(final int marker, final byte[] markerBytes,
                final byte[] segmentLengthBytes, final byte[] segmentData) {
            this.marker = marker;
            this.markerBytes = markerBytes;
            this.segmentLengthBytes = segmentLengthBytes;
            this.segmentData = segmentData;
        }

        @Override
        public String toString() {
            return "[" + this.getClass().getName() + " (0x"
                    + Integer.toHexString(marker) + ")]";
        }

        @Override
        protected void write(OutputStream os) throws IOException {
            os.write(markerBytes);
            os.write(segmentLengthBytes);
            os.write(segmentData);
        }

        public boolean isApp1Segment() {
            return marker == JPEG_APP1_Marker;
        }

        public boolean isAppSegment() {
            return marker >= JPEG_APP0_Marker && marker <= JPEG_APP15_Marker;
        }

        public boolean isExifSegment() {
            if (marker != JPEG_APP1_Marker) {
                return false;
            }
            if (!byteArrayHasPrefix(segmentData, EXIF_IDENTIFIER_CODE)) {
                return false;
            }
            return true;
        }

        public boolean isPhotoshopApp13Segment() {
            if (marker != JPEG_APP13_Marker) {
                return false;
            }
            if (!new IptcParser().isPhotoshopJpegSegment(segmentData)) {
                return false;
            }
            return true;
        }

        public boolean isXmpSegment() {
            if (marker != JPEG_APP1_Marker) {
                return false;
            }
            if (!byteArrayHasPrefix(segmentData, XMP_IDENTIFIER)) {
                return false;
            }
            return true;
        }

    }

    protected static class JFIFPieceImageData extends JFIFPiece {
        public final byte markerBytes[];
        public final byte imageData[];

        public JFIFPieceImageData(final byte[] markerBytes,
                final byte[] imageData) {
            super();
            this.markerBytes = markerBytes;
            this.imageData = imageData;
        }

        @Override
        protected void write(OutputStream os) throws IOException {
            os.write(markerBytes);
            os.write(imageData);
        }
    }

    protected JFIFPieces analyzeJFIF(ByteSource byteSource)
            throws ImageReadException, IOException
    // , ImageWriteException
    {
        final List<JFIFPiece> pieces = new ArrayList<JFIFPiece>();
        final List<JFIFPiece> segmentPieces = new ArrayList<JFIFPiece>();

        JpegUtils.Visitor visitor = new JpegUtils.Visitor() {
            // return false to exit before reading image data.
            public boolean beginSOS() {
                return true;
            }

            public void visitSOS(int marker, byte markerBytes[],
                    byte imageData[]) {
                pieces.add(new JFIFPieceImageData(markerBytes, imageData));
            }

            // return false to exit traversal.
            public boolean visitSegment(int marker, byte markerBytes[],
                    int segmentLength, byte segmentLengthBytes[],
                    byte segmentData[]) throws ImageReadException, IOException {
                JFIFPiece piece = new JFIFPieceSegment(marker, markerBytes,
                        segmentLengthBytes, segmentData);
                pieces.add(piece);
                segmentPieces.add(piece);

                return true;
            }
        };

        new JpegUtils().traverseJFIF(byteSource, visitor);

        return new JFIFPieces(pieces, segmentPieces);
    }

    private static interface SegmentFilter {
        public boolean filter(JFIFPieceSegment segment);
    }

    private static final SegmentFilter EXIF_SEGMENT_FILTER = new SegmentFilter() {
        public boolean filter(JFIFPieceSegment segment) {
            return segment.isExifSegment();
        }
    };

    private static final SegmentFilter XMP_SEGMENT_FILTER = new SegmentFilter() {
        public boolean filter(JFIFPieceSegment segment) {
            return segment.isXmpSegment();
        }
    };

    private static final SegmentFilter PHOTOSHOP_APP13_SEGMENT_FILTER = new SegmentFilter() {
        public boolean filter(JFIFPieceSegment segment) {
            return segment.isPhotoshopApp13Segment();
        }
    };

    protected <T extends JFIFPiece> List<T> removeXmpSegments(List<T> segments) {
        return filterSegments(segments, XMP_SEGMENT_FILTER);
    }

    protected <T extends JFIFPiece> List<T> removePhotoshopApp13Segments(
            List<T> segments) {
        return filterSegments(segments, PHOTOSHOP_APP13_SEGMENT_FILTER);
    }

    protected <T extends JFIFPiece> List<T> findPhotoshopApp13Segments(
            List<T> segments) {
        return filterSegments(segments, PHOTOSHOP_APP13_SEGMENT_FILTER, true);
    }

    protected <T extends JFIFPiece> List<T> removeExifSegments(List<T> segments) {
        return filterSegments(segments, EXIF_SEGMENT_FILTER);
    }

    protected <T extends JFIFPiece> List<T> filterSegments(List<T> segments,
            SegmentFilter filter) {
        return filterSegments(segments, filter, false);
    }

    protected <T extends JFIFPiece> List<T> filterSegments(List<T> segments,
            SegmentFilter filter, boolean reverse) {
        List<T> result = new ArrayList<T>();

        for (int i = 0; i < segments.size(); i++) {
            T piece = segments.get(i);
            if (piece instanceof JFIFPieceSegment) {
                if (filter.filter((JFIFPieceSegment) piece) ^ !reverse) {
                    result.add(piece);
                }
            } else if (!reverse) {
                result.add(piece);
            }
        }

        return result;
    }

    protected <T extends JFIFPiece, U extends JFIFPiece> List<JFIFPiece> insertBeforeFirstAppSegments(
            List<T> segments, List<U> newSegments) throws ImageWriteException {
        int firstAppIndex = -1;
        for (int i = 0; i < segments.size(); i++) {
            JFIFPiece piece = segments.get(i);
            if (!(piece instanceof JFIFPieceSegment)) {
                continue;
            }

            JFIFPieceSegment segment = (JFIFPieceSegment) piece;
            if (segment.isAppSegment()) {
                if (firstAppIndex == -1) {
                    firstAppIndex = i;
                }
            }
        }

        List<JFIFPiece> result = new ArrayList<JFIFPiece>(segments);
        if (firstAppIndex == -1) {
            throw new ImageWriteException("JPEG file has no APP segments.");
        }
        result.addAll(firstAppIndex, newSegments);
        return result;
    }

    protected <T extends JFIFPiece, U extends JFIFPiece> List<JFIFPiece> insertAfterLastAppSegments(
            List<T> segments, List<U> newSegments) throws ImageWriteException {
        int lastAppIndex = -1;
        for (int i = 0; i < segments.size(); i++) {
            JFIFPiece piece = segments.get(i);
            if (!(piece instanceof JFIFPieceSegment)) {
                continue;
            }

            JFIFPieceSegment segment = (JFIFPieceSegment) piece;
            if (segment.isAppSegment()) {
                lastAppIndex = i;
            }
        }

        List<JFIFPiece> result = new ArrayList<JFIFPiece>(segments);
        if (lastAppIndex == -1) {
            if (segments.size() < 1) {
                throw new ImageWriteException("JPEG file has no APP segments.");
            }
            result.addAll(1, newSegments);
        } else {
            result.addAll(lastAppIndex + 1, newSegments);
        }

        return result;
    }

    protected void writeSegments(OutputStream os,
            List<? extends JFIFPiece> segments) throws IOException {
        try {
            SOI.writeTo(os);

            for (int i = 0; i < segments.size(); i++) {
                JFIFPiece piece = segments.get(i);
                piece.write(os);
            }
            os.close();
            os = null;
        } finally {
            try {
                if (os != null) {
                    os.close();
                }
            } catch (Exception e) {
                // swallow exception; already in the context of an exception.
            }
        }
    }

    // private void writeSegment(OutputStream os, JFIFPieceSegment piece)
    // throws ImageWriteException, IOException
    // {
    // byte markerBytes[] = convertShortToByteArray(JPEG_APP1_Marker,
    // JPEG_BYTE_ORDER);
    // if (piece.segmentData.length > 0xffff)
    // throw new JpegSegmentOverflowException("Jpeg segment is too long: "
    // + piece.segmentData.length);
    // int segmentLength = piece.segmentData.length + 2;
    // byte segmentLengthBytes[] = convertShortToByteArray(segmentLength,
    // JPEG_BYTE_ORDER);
    //
    // os.write(markerBytes);
    // os.write(segmentLengthBytes);
    // os.write(piece.segmentData);
    // }

    public static class JpegSegmentOverflowException extends
            ImageWriteException {
        public JpegSegmentOverflowException(String s) {
            super(s);
        }
    }

}
