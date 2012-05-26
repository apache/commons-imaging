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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceArray;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.common.bytesource.ByteSourceInputStream;
import org.apache.commons.imaging.formats.jpeg.xmp.JpegRewriter;

/**
 * Interface for Exif write/update/remove functionality for Jpeg/JFIF images.
 */
public class JpegIptcRewriter extends JpegRewriter implements IptcConstants {

    /**
     * Reads a Jpeg image, removes all IPTC data from the App13 segment but
     * leaves the other data in that segment (if present) unchanged and writes
     * the result to a stream.
     * <p>
     * 
     * @param src
     *            Image file.
     * @param os
     *            OutputStream to write the image to.
     * 
     * @see java.io.File
     * @see java.io.OutputStream
     */
    public void removeIPTC(File src, OutputStream os)
            throws ImageReadException, IOException, ImageWriteException {
        ByteSource byteSource = new ByteSourceFile(src);
        removeIPTC(byteSource, os);
    }

    /**
     * Reads a Jpeg image, removes all IPTC data from the App13 segment but
     * leaves the other data in that segment (if present) unchanged and writes
     * the result to a stream.
     * <p>
     * 
     * @param src
     *            Byte array containing Jpeg image data.
     * @param os
     *            OutputStream to write the image to.
     */
    public void removeIPTC(byte src[], OutputStream os)
            throws ImageReadException, IOException, ImageWriteException {
        ByteSource byteSource = new ByteSourceArray(src);
        removeIPTC(byteSource, os);
    }

    /**
     * Reads a Jpeg image, removes all IPTC data from the App13 segment but
     * leaves the other data in that segment (if present) unchanged and writes
     * the result to a stream.
     * <p>
     * 
     * @param src
     *            InputStream containing Jpeg image data.
     * @param os
     *            OutputStream to write the image to.
     */
    public void removeIPTC(InputStream src, OutputStream os)
            throws ImageReadException, IOException, ImageWriteException {
        ByteSource byteSource = new ByteSourceInputStream(src, null);
        removeIPTC(byteSource, os);
    }

    /**
     * Reads a Jpeg image, removes all IPTC data from the App13 segment but
     * leaves the other data in that segment (if present) unchanged and writes
     * the result to a stream.
     * <p>
     * 
     * @param byteSource
     *            ByteSource containing Jpeg image data.
     * @param os
     *            OutputStream to write the image to.
     */
    public void removeIPTC(ByteSource byteSource, OutputStream os)
            throws ImageReadException, IOException, ImageWriteException {
        JFIFPieces jfifPieces = analyzeJFIF(byteSource);
        List<JFIFPiece> oldPieces = jfifPieces.pieces;
        List<JFIFPiece> photoshopApp13Segments = findPhotoshopApp13Segments(oldPieces);

        if (photoshopApp13Segments.size() > 1)
            throw new ImageReadException(
                    "Image contains more than one Photoshop App13 segment.");
        List<JFIFPiece> newPieces = removePhotoshopApp13Segments(oldPieces);
        if (photoshopApp13Segments.size() == 1) {
            JFIFPieceSegment oldSegment = (JFIFPieceSegment) photoshopApp13Segments
                    .get(0);
            Map params = new HashMap();
            PhotoshopApp13Data oldData = new IptcParser()
                    .parsePhotoshopSegment(oldSegment.segmentData, params);
            List<IptcBlock> newBlocks = oldData.getNonIptcBlocks();
            List<IptcRecord> newRecords = new ArrayList<IptcRecord>();
            PhotoshopApp13Data newData = new PhotoshopApp13Data(newRecords,
                    newBlocks);
            byte segmentBytes[] = new IptcParser()
                    .writePhotoshopApp13Segment(newData);
            JFIFPieceSegment newSegment = new JFIFPieceSegment(
                    oldSegment.marker, segmentBytes);
            newPieces.add(oldPieces.indexOf(oldSegment), newSegment);
        }
        writeSegments(os, newPieces);
    }

    /**
     * Reads a Jpeg image, replaces the IPTC data in the App13 segment but
     * leaves the other data in that segment (if present) unchanged and writes
     * the result to a stream.
     * 
     * @param src
     *            Byte array containing Jpeg image data.
     * @param os
     *            OutputStream to write the image to.
     * @param newData
     *            structure containing IPTC data.
     */
    public void writeIPTC(byte src[], OutputStream os,
            PhotoshopApp13Data newData) throws ImageReadException, IOException,
            ImageWriteException {
        ByteSource byteSource = new ByteSourceArray(src);
        writeIPTC(byteSource, os, newData);
    }

    /**
     * Reads a Jpeg image, replaces the IPTC data in the App13 segment but
     * leaves the other data in that segment (if present) unchanged and writes
     * the result to a stream.
     * 
     * @param src
     *            InputStream containing Jpeg image data.
     * @param os
     *            OutputStream to write the image to.
     * @param newData
     *            structure containing IPTC data.
     */
    public void writeIPTC(InputStream src, OutputStream os,
            PhotoshopApp13Data newData) throws ImageReadException, IOException,
            ImageWriteException {
        ByteSource byteSource = new ByteSourceInputStream(src, null);
        writeIPTC(byteSource, os, newData);
    }

    /**
     * Reads a Jpeg image, replaces the IPTC data in the App13 segment but
     * leaves the other data in that segment (if present) unchanged and writes
     * the result to a stream.
     * 
     * @param src
     *            Image file.
     * @param os
     *            OutputStream to write the image to.
     * @param newData
     *            structure containing IPTC data.
     */
    public void writeIPTC(File src, OutputStream os, PhotoshopApp13Data newData)
            throws ImageReadException, IOException, ImageWriteException {
        ByteSource byteSource = new ByteSourceFile(src);
        writeIPTC(byteSource, os, newData);
    }

    /**
     * Reads a Jpeg image, replaces the IPTC data in the App13 segment but
     * leaves the other data in that segment (if present) unchanged and writes
     * the result to a stream.
     * 
     * @param byteSource
     *            ByteSource containing Jpeg image data.
     * @param os
     *            OutputStream to write the image to.
     * @param newData
     *            structure containing IPTC data.
     */
    public void writeIPTC(ByteSource byteSource, OutputStream os,
            PhotoshopApp13Data newData) throws ImageReadException, IOException,
            ImageWriteException {
        JFIFPieces jfifPieces = analyzeJFIF(byteSource);
        List<JFIFPiece> oldPieces = jfifPieces.pieces;
        List<JFIFPiece> photoshopApp13Segments = findPhotoshopApp13Segments(oldPieces);

        if (photoshopApp13Segments.size() > 1)
            throw new ImageReadException(
                    "Image contains more than one Photoshop App13 segment.");
        List<JFIFPiece> newPieces = removePhotoshopApp13Segments(oldPieces);

        {
            // discard old iptc blocks.
            List<IptcBlock> newBlocks = newData.getNonIptcBlocks();
            byte[] newBlockBytes = new IptcParser().writeIPTCBlock(newData
                    .getRecords());

            int blockType = IMAGE_RESOURCE_BLOCK_IPTC_DATA;
            byte[] blockNameBytes = new byte[0];
            IptcBlock newBlock = new IptcBlock(blockType, blockNameBytes,
                    newBlockBytes);
            newBlocks.add(newBlock);

            newData = new PhotoshopApp13Data(newData.getRecords(), newBlocks);

            byte segmentBytes[] = new IptcParser()
                    .writePhotoshopApp13Segment(newData);
            JFIFPieceSegment newSegment = new JFIFPieceSegment(
                    JPEG_APP13_Marker, segmentBytes);

            newPieces = insertAfterLastAppSegments(newPieces,
                    Arrays.asList(new JFIFPieceSegment[] { newSegment, }));
        }

        writeSegments(os, newPieces);
    }

}
