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
package org.apache.commons.imaging.formats.jpeg.exif;

import static org.apache.commons.imaging.common.BinaryFunctions.remainingBytes;
import static org.apache.commons.imaging.common.BinaryFunctions.startsWith;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.ImagingOverflowException;
import org.apache.commons.imaging.common.BinaryFileParser;
import org.apache.commons.imaging.common.ByteConversions;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.apache.commons.imaging.formats.jpeg.JpegUtils;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;

/**
 * Interface for Exif write/update/remove functionality for Jpeg/JFIF images.
 *
 * <p>See the source of the ExifMetadataUpdateExample class for example usage.</p>
 *
 * @see <a
 *      href="https://svn.apache.org/repos/asf/commons/proper/imaging/trunk/src/test/java/org/apache/commons/imaging/examples/WriteExifMetadataExample.java">org.apache.commons.imaging.examples.WriteExifMetadataExample</a>
 */
public class ExifRewriter extends BinaryFileParser {

    private abstract static class JFIFPiece {
        protected abstract void write(OutputStream os) throws IOException;
    }

    private static class JFIFPieceImageData extends JFIFPiece {
        public final byte[] markerBytes;
        public final byte[] imageData;

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

    private static class JFIFPieces {
        public final List<JFIFPiece> pieces;
        public final List<JFIFPiece> exifPieces;

        JFIFPieces(final List<JFIFPiece> pieces,
                final List<JFIFPiece> exifPieces) {
            this.pieces = pieces;
            this.exifPieces = exifPieces;
        }

    }

    private static class JFIFPieceSegment extends JFIFPiece {
        public final int marker;
        public final byte[] markerBytes;
        public final byte[] markerLengthBytes;
        public final byte[] segmentData;

        JFIFPieceSegment(final int marker, final byte[] markerBytes,
                final byte[] markerLengthBytes, final byte[] segmentData) {
            this.marker = marker;
            this.markerBytes = markerBytes;
            this.markerLengthBytes = markerLengthBytes;
            this.segmentData = segmentData;
        }

        @Override
        protected void write(final OutputStream os) throws IOException {
            os.write(markerBytes);
            os.write(markerLengthBytes);
            os.write(segmentData);
        }
    }

    private static class JFIFPieceSegmentExif extends JFIFPieceSegment {

        JFIFPieceSegmentExif(final int marker, final byte[] markerBytes,
                final byte[] markerLengthBytes, final byte[] segmentData) {
            super(marker, markerBytes, markerLengthBytes, segmentData);
        }
    }

    /**
     * Constructor. to guess whether a file contains an image based on its file
     * extension.
     */
    public ExifRewriter() {
        this(ByteOrder.BIG_ENDIAN);
    }

    /**
     * Constructor.
     * <p>
     *
     * @param byteOrder
     *            byte order of EXIF segment.
     */
    public ExifRewriter(final ByteOrder byteOrder) {
        super(byteOrder);
    }

    private JFIFPieces analyzeJFIF(final ByteSource byteSource) throws ImagingException, IOException {
        final List<JFIFPiece> pieces = new ArrayList<>();
        final List<JFIFPiece> exifPieces = new ArrayList<>();

        final JpegUtils.Visitor visitor = new JpegUtils.Visitor() {
            // return false to exit before reading image data.
            @Override
            public boolean beginSOS() {
                return true;
            }

            // return false to exit traversal.
            @Override
            public boolean visitSegment(final int marker, final byte[] markerBytes,
                    final int markerLength, final byte[] markerLengthBytes,
                    final byte[] segmentData) throws
            // ImageWriteException,
                    ImagingException, IOException {
                if (marker != JpegConstants.JPEG_APP1_MARKER) {
                    pieces.add(new JFIFPieceSegment(marker, markerBytes,
                            markerLengthBytes, segmentData));
                } else if (!startsWith(segmentData,
                        JpegConstants.EXIF_IDENTIFIER_CODE)) {
                    pieces.add(new JFIFPieceSegment(marker, markerBytes,
                            markerLengthBytes, segmentData));
                // } else if (exifSegmentArray[0] != null) {
                // // TODO: add support for multiple segments
                // throw new ImageReadException(
                // "More than one APP1 EXIF segment.");
                } else {
                    final JFIFPiece piece = new JFIFPieceSegmentExif(marker,
                            markerBytes, markerLengthBytes, segmentData);
                    pieces.add(piece);
                    exifPieces.add(piece);
                }
                return true;
            }

            @Override
            public void visitSOS(final int marker, final byte[] markerBytes, final byte[] imageData) {
                pieces.add(new JFIFPieceImageData(markerBytes, imageData));
            }
        };

        new JpegUtils().traverseJFIF(byteSource, visitor);

        // GenericSegment exifSegment = exifSegmentArray[0];
        // if (exifSegments.size() < 1)
        // {
        // // TODO: add support for adding, not just replacing.
        // throw new ImageReadException("No APP1 EXIF segment found.");
        // }

        return new JFIFPieces(pieces, exifPieces);
    }

    /**
     * Reads a JPEG image, removes all EXIF metadata (by removing the APP1
     * segment), and writes the result to a stream.
     *
     * @param src
     *            Byte array containing JPEG image data.
     * @param os
     *            OutputStream to write the image to.
     * @throws ImagingException if it fails to read the JFIF segments
     * @throws IOException if it fails to read the image data
     * @throws ImagingException if it fails to write the updated data
     */
    public void removeExifMetadata(final byte[] src, final OutputStream os)
            throws ImagingException, IOException, ImagingException {
        final ByteSource byteSource = ByteSource.array(src);
        removeExifMetadata(byteSource, os);
    }

    /**
     * Reads a JPEG image, removes all EXIF metadata (by removing the APP1
     * segment), and writes the result to a stream.
     *
     * @param byteSource
     *            ByteSource containing JPEG image data.
     * @param os
     *            OutputStream to write the image to.
     * @throws ImagingException if it fails to read the JFIF segments
     * @throws IOException if it fails to read the image data
     * @throws ImagingException if it fails to write the updated data
     */
    public void removeExifMetadata(final ByteSource byteSource, final OutputStream os)
            throws ImagingException, IOException, ImagingException {
        final JFIFPieces jfifPieces = analyzeJFIF(byteSource);
        final List<JFIFPiece> pieces = jfifPieces.pieces;

        // Debug.debug("pieces", pieces);

        // pieces.removeAll(jfifPieces.exifSegments);

        // Debug.debug("pieces", pieces);

        writeSegmentsReplacingExif(os, pieces, null);
    }

    /**
     * Reads a JPEG image, removes all EXIF metadata (by removing the APP1
     * segment), and writes the result to a stream.
     * <p>
     *
     * @param src
     *            Image file.
     * @param os
     *            OutputStream to write the image to.
     *
     * @throws ImagingException if it fails to read the JFIF segments
     * @throws IOException if it fails to read the image data
     * @throws ImagingException if it fails to write the updated data
     * @see java.io.File
     * @see java.io.OutputStream
     * @see java.io.File
     * @see java.io.OutputStream
     */
    public void removeExifMetadata(final File src, final OutputStream os)
            throws ImagingException, IOException, ImagingException {
        final ByteSource byteSource = ByteSource.file(src);
        removeExifMetadata(byteSource, os);
    }

    /**
     * Reads a JPEG image, removes all EXIF metadata (by removing the APP1
     * segment), and writes the result to a stream.
     *
     * @param src
     *            InputStream containing JPEG image data.
     * @param os
     *            OutputStream to write the image to.
     * @throws ImagingException if it fails to read the JFIF segments
     * @throws IOException if it fails to read the image data
     * @throws ImagingException if it fails to write the updated data
     */
    public void removeExifMetadata(final InputStream src, final OutputStream os)
            throws ImagingException, IOException, ImagingException {
        final ByteSource byteSource = ByteSource.inputStream(src, null);
        removeExifMetadata(byteSource, os);
    }

    /**
     * Reads a JPEG image, replaces the EXIF metadata and writes the result to a
     * stream.
     *
     * <p>Note that this uses the "Lossless" approach - in order to preserve data
     * embedded in the EXIF segment that it can't parse (such as Maker Notes),
     * this algorithm avoids overwriting any part of the original segment that
     * it couldn't parse. This can cause the EXIF segment to grow with each
     * update, which is a serious issue, since all EXIF data must fit in a
     * single APP1 segment of the JPEG image.</p>
     *
     * @param src
     *            Byte array containing JPEG image data.
     * @param os
     *            OutputStream to write the image to.
     * @param outputSet
     *            TiffOutputSet containing the EXIF data to write.
     * @throws ImagingException if it fails to read the JFIF segments
     * @throws IOException if it fails to read the image data
     * @throws ImagingException if it fails to write the updated data
     */
    public void updateExifMetadataLossless(final byte[] src, final OutputStream os,
            final TiffOutputSet outputSet) throws ImagingException, IOException,
            ImagingException {
        final ByteSource byteSource = ByteSource.array(src);
        updateExifMetadataLossless(byteSource, os, outputSet);
    }

    /**
     * Reads a JPEG image, replaces the EXIF metadata and writes the result to a
     * stream.
     *
     * <p>Note that this uses the "Lossless" approach - in order to preserve data
     * embedded in the EXIF segment that it can't parse (such as Maker Notes),
     * this algorithm avoids overwriting any part of the original segment that
     * it couldn't parse. This can cause the EXIF segment to grow with each
     * update, which is a serious issue, since all EXIF data must fit in a
     * single APP1 segment of the JPEG image.</p>
     *
     * @param byteSource
     *            ByteSource containing JPEG image data.
     * @param os
     *            OutputStream to write the image to.
     * @param outputSet
     *            TiffOutputSet containing the EXIF data to write.
     * @throws ImagingException if it fails to read the JFIF segments
     * @throws IOException if it fails to read the image data
     * @throws ImagingException if it fails to write the updated data
     */
    public void updateExifMetadataLossless(final ByteSource byteSource,
            final OutputStream os, final TiffOutputSet outputSet)
            throws ImagingException, IOException, ImagingException {
        // List outputDirectories = outputSet.getDirectories();
        final JFIFPieces jfifPieces = analyzeJFIF(byteSource);
        final List<JFIFPiece> pieces = jfifPieces.pieces;

        TiffImageWriterBase writer;
        // Just use first APP1 segment for now.
        // Multiple APP1 segments are rare and poorly supported.
        if (!jfifPieces.exifPieces.isEmpty()) {
            final JFIFPieceSegment exifPiece = (JFIFPieceSegment) jfifPieces.exifPieces.get(0);

            byte[] exifBytes = exifPiece.segmentData;
            exifBytes = remainingBytes("trimmed exif bytes", exifBytes, 6);

            writer = new TiffImageWriterLossless(outputSet.byteOrder, exifBytes);

        } else {
            writer = new TiffImageWriterLossy(outputSet.byteOrder);
        }

        final boolean includeEXIFPrefix = true;
        final byte[] newBytes = writeExifSegment(writer, outputSet, includeEXIFPrefix);

        writeSegmentsReplacingExif(os, pieces, newBytes);
    }

    /**
     * Reads a JPEG image, replaces the EXIF metadata and writes the result to a
     * stream.
     *
     * <p>Note that this uses the "Lossless" approach - in order to preserve data
     * embedded in the EXIF segment that it can't parse (such as Maker Notes),
     * this algorithm avoids overwriting any part of the original segment that
     * it couldn't parse. This can cause the EXIF segment to grow with each
     * update, which is a serious issue, since all EXIF data must fit in a
     * single APP1 segment of the JPEG image.</p>
     *
     * @param src
     *            Image file.
     * @param os
     *            OutputStream to write the image to.
     * @param outputSet
     *            TiffOutputSet containing the EXIF data to write.
     * @throws ImagingException if it fails to read the JFIF segments
     * @throws IOException if it fails to read the image data
     * @throws ImagingException if it fails to write the updated data
     */
    public void updateExifMetadataLossless(final File src, final OutputStream os,
            final TiffOutputSet outputSet) throws ImagingException, IOException,
            ImagingException {
        final ByteSource byteSource = ByteSource.file(src);
        updateExifMetadataLossless(byteSource, os, outputSet);
    }

    /**
     * Reads a JPEG image, replaces the EXIF metadata and writes the result to a
     * stream.
     *
     * <p>Note that this uses the "Lossless" approach - in order to preserve data
     * embedded in the EXIF segment that it can't parse (such as Maker Notes),
     * this algorithm avoids overwriting any part of the original segment that
     * it couldn't parse. This can cause the EXIF segment to grow with each
     * update, which is a serious issue, since all EXIF data must fit in a
     * single APP1 segment of the JPEG image.</p>
     *
     * @param src
     *            InputStream containing JPEG image data.
     * @param os
     *            OutputStream to write the image to.
     * @param outputSet
     *            TiffOutputSet containing the EXIF data to write.
     * @throws ImagingException if it fails to read the JFIF segments
     * @throws IOException if it fails to read the image data
     * @throws ImagingException if it fails to write the updated data
     */
    public void updateExifMetadataLossless(final InputStream src, final OutputStream os,
            final TiffOutputSet outputSet) throws ImagingException, IOException,
            ImagingException {
        final ByteSource byteSource = ByteSource.inputStream(src, null);
        updateExifMetadataLossless(byteSource, os, outputSet);
    }

    /**
     * Reads a JPEG image, replaces the EXIF metadata and writes the result to a
     * stream.
     *
     * <p>Note that this uses the "Lossy" approach - the algorithm overwrites the
     * entire EXIF segment, ignoring the possibility that it may be discarding
     * data it couldn't parse (such as Maker Notes).</p>
     *
     * @param src
     *            Byte array containing JPEG image data.
     * @param os
     *            OutputStream to write the image to.
     * @param outputSet
     *            TiffOutputSet containing the EXIF data to write.
     * @throws ImagingException if it fails to read the JFIF segments
     * @throws IOException if it fails to read the image data
     * @throws ImagingException if it fails to write the updated data
     */
    public void updateExifMetadataLossy(final byte[] src, final OutputStream os,
            final TiffOutputSet outputSet) throws ImagingException, IOException,
            ImagingException {
        final ByteSource byteSource = ByteSource.array(src);
        updateExifMetadataLossy(byteSource, os, outputSet);
    }

    /**
     * Reads a JPEG image, replaces the EXIF metadata and writes the result to a
     * stream.
     *
     * <p>Note that this uses the "Lossy" approach - the algorithm overwrites the
     * entire EXIF segment, ignoring the possibility that it may be discarding
     * data it couldn't parse (such as Maker Notes).</p>
     *
     * @param byteSource
     *            ByteSource containing JPEG image data.
     * @param os
     *            OutputStream to write the image to.
     * @param outputSet
     *            TiffOutputSet containing the EXIF data to write.
     * @throws ImagingException if it fails to read the JFIF segments
     * @throws IOException if it fails to read the image data
     * @throws ImagingException if it fails to write the updated data
     */
    public void updateExifMetadataLossy(final ByteSource byteSource, final OutputStream os,
            final TiffOutputSet outputSet) throws ImagingException, IOException,
            ImagingException {
        final JFIFPieces jfifPieces = analyzeJFIF(byteSource);
        final List<JFIFPiece> pieces = jfifPieces.pieces;

        final TiffImageWriterBase writer = new TiffImageWriterLossy(
                outputSet.byteOrder);

        final boolean includeEXIFPrefix = true;
        final byte[] newBytes = writeExifSegment(writer, outputSet, includeEXIFPrefix);

        writeSegmentsReplacingExif(os, pieces, newBytes);
    }

    /**
     * Reads a JPEG image, replaces the EXIF metadata and writes the result to a
     * stream.
     *
     * <p>Note that this uses the "Lossy" approach - the algorithm overwrites the
     * entire EXIF segment, ignoring the possibility that it may be discarding
     * data it couldn't parse (such as Maker Notes).</p>
     *
     * @param src
     *            Image file.
     * @param os
     *            OutputStream to write the image to.
     * @param outputSet
     *            TiffOutputSet containing the EXIF data to write.
     * @throws ImagingException if it fails to read the JFIF segments
     * @throws IOException if it fails to read the image data
     * @throws ImagingException if it fails to write the updated data
     */
    public void updateExifMetadataLossy(final File src, final OutputStream os,
            final TiffOutputSet outputSet) throws ImagingException, IOException,
            ImagingException {
        final ByteSource byteSource = ByteSource.file(src);
        updateExifMetadataLossy(byteSource, os, outputSet);
    }

    /**
     * Reads a JPEG image, replaces the EXIF metadata and writes the result to a
     * stream.
     *
     * <p>Note that this uses the "Lossy" approach - the algorithm overwrites the
     * entire EXIF segment, ignoring the possibility that it may be discarding
     * data it couldn't parse (such as Maker Notes).</p>
     *
     * @param src
     *            InputStream containing JPEG image data.
     * @param os
     *            OutputStream to write the image to.
     * @param outputSet
     *            TiffOutputSet containing the EXIF data to write.
     * @throws ImagingException if it fails to read the JFIF segments
     * @throws IOException if it fails to read the image data
     * @throws ImagingException if it fails to write the updated data
     */
    public void updateExifMetadataLossy(final InputStream src, final OutputStream os,
            final TiffOutputSet outputSet) throws ImagingException, IOException,
            ImagingException {
        final ByteSource byteSource = ByteSource.inputStream(src, null);
        updateExifMetadataLossy(byteSource, os, outputSet);
    }

    private byte[] writeExifSegment(final TiffImageWriterBase writer,
            final TiffOutputSet outputSet, final boolean includeEXIFPrefix)
            throws IOException, ImagingException {
        final ByteArrayOutputStream os = new ByteArrayOutputStream();

        if (includeEXIFPrefix) {
            JpegConstants.EXIF_IDENTIFIER_CODE.writeTo(os);
            os.write(0);
            os.write(0);
        }

        writer.write(os, outputSet);

        return os.toByteArray();
    }

    private void writeSegmentsReplacingExif(final OutputStream outputStream,
            final List<JFIFPiece> segments, final byte[] newBytes)
            throws ImagingException, IOException {

        try (DataOutputStream os = new DataOutputStream(outputStream)) {
            JpegConstants.SOI.writeTo(os);

            boolean hasExif = false;

            for (final JFIFPiece piece : segments) {
                if (piece instanceof JFIFPieceSegmentExif) {
                    hasExif = true;
                    break;
                }
            }

            if (!hasExif && newBytes != null) {
                final byte[] markerBytes = ByteConversions.toBytes((short) JpegConstants.JPEG_APP1_MARKER, getByteOrder());
                if (newBytes.length > 0xffff) {
                    throw new ImagingOverflowException(
                            "APP1 Segment is too long: " + newBytes.length);
                }
                final int markerLength = newBytes.length + 2;
                final byte[] markerLengthBytes = ByteConversions.toBytes((short) markerLength, getByteOrder());

                int index = 0;
                final JFIFPieceSegment firstSegment = (JFIFPieceSegment) segments.get(index);
                if (firstSegment.marker == JpegConstants.JFIF_MARKER) {
                    index = 1;
                }
                segments.add(index, new JFIFPieceSegmentExif(JpegConstants.JPEG_APP1_MARKER,
                        markerBytes, markerLengthBytes, newBytes));
            }

            boolean APP1Written = false;

            for (final JFIFPiece piece : segments) {
                if (piece instanceof JFIFPieceSegmentExif) {
                    // only replace first APP1 segment; skips others.
                    if (APP1Written) {
                        continue;
                    }
                    APP1Written = true;

                    if (newBytes == null) {
                        continue;
                    }

                    final byte[] markerBytes = ByteConversions.toBytes((short) JpegConstants.JPEG_APP1_MARKER, getByteOrder());
                    if (newBytes.length > 0xffff) {
                        throw new ImagingOverflowException(
                                "APP1 Segment is too long: " + newBytes.length);
                    }
                    final int markerLength = newBytes.length + 2;
                    final byte[] markerLengthBytes = ByteConversions.toBytes((short) markerLength, getByteOrder());

                    os.write(markerBytes);
                    os.write(markerLengthBytes);
                    os.write(newBytes);
                } else {
                    piece.write(os);
                }
            }
        }
    }

}
