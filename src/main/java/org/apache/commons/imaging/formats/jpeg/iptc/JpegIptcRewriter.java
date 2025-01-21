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
package org.apache.commons.imaging.formats.jpeg.iptc;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.apache.commons.imaging.formats.jpeg.JpegImagingParameters;
import org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter;

/**
 * Interface for Exif write/update/remove functionality for Jpeg/JFIF images.
 */
public class JpegIptcRewriter extends JpegRewriter {

    /**
     * Reads a JPEG image, removes all IPTC data from the App13 segment but leaves the other data in that segment (if present) unchanged and writes the result
     * to a stream.
     * <p>
     *
     * @param src Byte array containing JPEG image data.
     * @param os  OutputStream to write the image to.
     * @throws ImagingException if there are more than one Photoshop App13 segment, or if the Photoshop segment cannot be parsed
     * @throws IOException      if it fails to read from the origin byte source, or to write to the target byte source
     * @throws ImagingException if it fails to write the target image
     */
    public void removeIptc(final byte[] src, final OutputStream os) throws ImagingException, IOException, ImagingException {
        removeIptc(src, os, false);
    }

    /**
     * Reads a JPEG image, removes all IPTC data from the App13 segment but leaves the other data in that segment (if present) unchanged (unless removeSegment
     * is true) and writes the result to a stream.
     * <p>
     *
     * @param src           Byte array containing JPEG image data.
     * @param os            OutputStream to write the image to.
     * @param removeSegment Remove the App13 segment.
     * @throws ImagingException if there are more than one Photoshop App13 segment, or if the Photoshop segment cannot be parsed
     * @throws IOException      if it fails to read from the origin byte source, or to write to the target byte source
     * @throws ImagingException if it fails to write the target image
     */
    public void removeIptc(final byte[] src, final OutputStream os, final boolean removeSegment) throws ImagingException, IOException, ImagingException {
        final ByteSource byteSource = ByteSource.array(src);
        removeIptc(byteSource, os, removeSegment);
    }

    /**
     * Reads a JPEG image, removes all IPTC data from the App13 segment but leaves the other data in that segment (if present) unchanged and writes the result
     * to a stream.
     * <p>
     *
     * @param byteSource ByteSource containing JPEG image data.
     * @param os         OutputStream to write the image to.
     * @throws ImagingException if there are more than one Photoshop App13 segment, or if the Photoshop segment cannot be parsed
     * @throws IOException      if it fails to read from the origin byte source, or to write to the target byte source
     * @throws ImagingException if it fails to write the target image
     */
    public void removeIptc(final ByteSource byteSource, final OutputStream os) throws ImagingException, IOException, ImagingException {
        removeIptc(byteSource, os, false);
    }

    /**
     * Reads a JPEG image, removes all IPTC data from the App13 segment but leaves the other data in that segment (if present) unchanged (unless removeSegment
     * is true) and writes the result to a stream.
     * <p>
     *
     * @param byteSource    ByteSource containing JPEG image data.
     * @param os            OutputStream to write the image to.
     * @param removeSegment Remove the App13 segment.
     * @throws ImagingException if there are more than one Photoshop App13 segment, or if the Photoshop segment cannot be parsed
     * @throws IOException      if it fails to read from the origin byte source, or to write to the target byte source
     * @throws ImagingException if it fails to write the target image
     */
    public void removeIptc(final ByteSource byteSource, final OutputStream os, final boolean removeSegment)
            throws ImagingException, IOException, ImagingException {
        final JFIFPieces jfifPieces = analyzeJfif(byteSource);
        final List<JFIFPiece> oldPieces = jfifPieces.pieces;
        final List<JFIFPiece> photoshopApp13Segments = findPhotoshopApp13Segments(oldPieces);

        if (photoshopApp13Segments.size() > 1) {
            throw new ImagingException("Image contains more than one Photoshop App13 segment.");
        }
        final List<JFIFPiece> newPieces = removePhotoshopApp13Segments(oldPieces);
        if (!removeSegment && photoshopApp13Segments.size() == 1) {
            final JFIFPieceSegment oldSegment = (JFIFPieceSegment) photoshopApp13Segments.get(0);
            final JpegImagingParameters params = new JpegImagingParameters();
            final PhotoshopApp13Data oldData = new IptcParser().parsePhotoshopSegment(oldSegment.getSegmentData(), params);
            final List<IptcBlock> newBlocks = oldData.getNonIptcBlocks();
            final List<IptcRecord> newRecords = new ArrayList<>();
            final PhotoshopApp13Data newData = new PhotoshopApp13Data(newRecords, newBlocks);
            final byte[] segmentBytes = new IptcParser().writePhotoshopApp13Segment(newData);
            final JFIFPieceSegment newSegment = new JFIFPieceSegment(oldSegment.marker, segmentBytes);
            newPieces.add(oldPieces.indexOf(oldSegment), newSegment);
        }
        writeSegments(os, newPieces);
    }

    /**
     * Reads a JPEG image, removes all IPTC data from the App13 segment but leaves the other data in that segment (if present) unchanged and writes the result
     * to a stream.
     * <p>
     *
     * @param src Image file.
     * @param os  OutputStream to write the image to.
     * @throws ImagingException if there are more than one Photoshop App13 segment, or if the Photoshop segment cannot be parsed
     * @throws IOException      if it fails to read from the origin byte source, or to write to the target byte source
     * @throws ImagingException if it fails to write the target image
     * @see java.io.File
     * @see java.io.OutputStream
     */
    public void removeIptc(final File src, final OutputStream os) throws ImagingException, IOException, ImagingException {
        removeIptc(src, os, false);
    }

    /**
     * Reads a JPEG image, removes all IPTC data from the App13 segment but leaves the other data in that segment (if present) unchanged (unless removeSegment
     * is true) and writes the result to a stream.
     * <p>
     *
     * @param src           Image file.
     * @param os            OutputStream to write the image to.
     * @param removeSegment Remove the App13 segment.
     * @see java.io.File
     * @see java.io.OutputStream
     * @throws ImagingException if there are more than one Photoshop App13 segment, or if the Photoshop segment cannot be parsed
     * @throws IOException      if it fails to read from the origin byte source, or to write to the target byte source
     * @throws ImagingException if it fails to write the target image
     */
    public void removeIptc(final File src, final OutputStream os, final boolean removeSegment) throws ImagingException, IOException, ImagingException {
        final ByteSource byteSource = ByteSource.file(src);
        removeIptc(byteSource, os, removeSegment);
    }

    /**
     * Reads a JPEG image, removes all IPTC data from the App13 segment but leaves the other data in that segment (if present) unchanged and writes the result
     * to a stream.
     * <p>
     *
     * @param src InputStream containing JPEG image data.
     * @param os  OutputStream to write the image to.
     * @throws ImagingException if there are more than one Photoshop App13 segment, or if the Photoshop segment cannot be parsed
     * @throws IOException      if it fails to read from the origin byte source, or to write to the target byte source
     * @throws ImagingException if it fails to write the target image
     */
    public void removeIptc(final InputStream src, final OutputStream os) throws ImagingException, IOException, ImagingException {
        removeIptc(src, os, false);
    }

    /**
     * Reads a JPEG image, removes all IPTC data from the App13 segment but leaves the other data in that segment (if present) unchanged (unless removeSegment
     * is true) and writes the result to a stream.
     * <p>
     *
     * @param src           InputStream containing JPEG image data.
     * @param os            OutputStream to write the image to.
     * @param removeSegment Remove the App13 segment.
     * @throws ImagingException if there are more than one Photoshop App13 segment, or if the Photoshop segment cannot be parsed
     * @throws IOException      if it fails to read from the origin byte source, or to write to the target byte source
     * @throws ImagingException if it fails to write the target image
     */
    public void removeIptc(final InputStream src, final OutputStream os, final boolean removeSegment) throws ImagingException, IOException, ImagingException {
        final ByteSource byteSource = ByteSource.inputStream(src, null);
        removeIptc(byteSource, os, removeSegment);
    }

    /**
     * Reads a JPEG image, replaces the IPTC data in the App13 segment but leaves the other data in that segment (if present) unchanged and writes the result to
     * a stream.
     *
     * @param src     Byte array containing JPEG image data.
     * @param os      OutputStream to write the image to.
     * @param newData structure containing IPTC data.
     * @throws ImagingException if there are more than one Photoshop App13 segment, or if the Photoshop segment cannot be parsed
     * @throws IOException      if it fails to read from the origin byte source, or to write to the target byte source
     * @throws ImagingException if it fails to write the target image
     */
    public void writeIptc(final byte[] src, final OutputStream os, final PhotoshopApp13Data newData) throws ImagingException, IOException, ImagingException {
        final ByteSource byteSource = ByteSource.array(src);
        writeIptc(byteSource, os, newData);
    }

    /**
     * Reads a JPEG image, replaces the IPTC data in the App13 segment but leaves the other data in that segment (if present) unchanged and writes the result to
     * a stream.
     *
     * @param byteSource ByteSource containing JPEG image data.
     * @param os         OutputStream to write the image to.
     * @param newData    structure containing IPTC data.
     * @throws ImagingException if there are more than one Photoshop App13 segment, or if the Photoshop segment cannot be parsed
     * @throws IOException      if it fails to read from the origin byte source, or to write to the target byte source
     * @throws ImagingException if it fails to write the target image
     */
    public void writeIptc(final ByteSource byteSource, final OutputStream os, PhotoshopApp13Data newData)
            throws ImagingException, IOException, ImagingException {
        final JFIFPieces jfifPieces = analyzeJfif(byteSource);
        final List<JFIFPiece> oldPieces = jfifPieces.pieces;
        final List<JFIFPiece> photoshopApp13Segments = findPhotoshopApp13Segments(oldPieces);

        if (photoshopApp13Segments.size() > 1) {
            throw new ImagingException("Image contains more than one Photoshop App13 segment.");
        }
        List<JFIFPiece> newPieces = removePhotoshopApp13Segments(oldPieces);

        {
            // discard old iptc blocks.
            final List<IptcBlock> newBlocks = newData.getNonIptcBlocks();
            final byte[] newBlockBytes = new IptcParser().writeIptcBlock(newData.getRecords(), newData.isForceUtf8Encoding());

            final int blockType = IptcConstants.IMAGE_RESOURCE_BLOCK_IPTC_DATA;
            final byte[] blockNameBytes = ImagingConstants.EMPTY_BYTE_ARRAY;
            final IptcBlock newBlock = new IptcBlock(blockType, blockNameBytes, newBlockBytes);
            newBlocks.add(newBlock);

            newData = new PhotoshopApp13Data(newData.getRecords(), newBlocks, newData.isForceUtf8Encoding());

            final byte[] segmentBytes = new IptcParser().writePhotoshopApp13Segment(newData);
            final JFIFPieceSegment newSegment = new JFIFPieceSegment(JpegConstants.JPEG_APP13_MARKER, segmentBytes);

            newPieces = insertAfterLastAppSegments(newPieces, Arrays.asList(newSegment));
        }

        writeSegments(os, newPieces);
    }

    /**
     * Reads a JPEG image, replaces the IPTC data in the App13 segment but leaves the other data in that segment (if present) unchanged and writes the result to
     * a stream.
     *
     * @param src     Image file.
     * @param os      OutputStream to write the image to.
     * @param newData structure containing IPTC data.
     * @throws ImagingException if there are more than one Photoshop App13 segment, or if the Photoshop segment cannot be parsed
     * @throws IOException      if it fails to read from the origin byte source, or to write to the target byte source
     * @throws ImagingException if it fails to write the target image
     */
    public void writeIptc(final File src, final OutputStream os, final PhotoshopApp13Data newData) throws ImagingException, IOException, ImagingException {
        final ByteSource byteSource = ByteSource.file(src);
        writeIptc(byteSource, os, newData);
    }

    /**
     * Reads a JPEG image, replaces the IPTC data in the App13 segment but leaves the other data in that segment (if present) unchanged and writes the result to
     * a stream.
     *
     * @param src     InputStream containing JPEG image data.
     * @param os      OutputStream to write the image to.
     * @param newData structure containing IPTC data.
     * @throws ImagingException if there are more than one Photoshop App13 segment, or if the Photoshop segment cannot be parsed
     * @throws IOException      if it fails to read from the origin byte source, or to write to the target byte source
     * @throws ImagingException if it fails to write the target image
     */
    public void writeIptc(final InputStream src, final OutputStream os, final PhotoshopApp13Data newData)
            throws ImagingException, IOException, ImagingException {
        final ByteSource byteSource = ByteSource.inputStream(src, null);
        writeIptc(byteSource, os, newData);
    }

}
