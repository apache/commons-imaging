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

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;

/**
 * Interface for Exif write/update/remove functionality for Jpeg/JFIF images.
 */
public class JpegXmpRewriter extends JpegRewriter {

    /**
     * Constructs a new instance with the default, big-endian, byte order.
     */
    public JpegXmpRewriter() {
        // empty
    }

    /**
     * Reads a JPEG image, removes all XMP XML (by removing the APP1 segment), and writes the result to a stream.
     *
     * @param src Byte array containing JPEG image data.
     * @param os  OutputStream to write the image to.
     * @throws ImagingException if it fails to read the JFIF segments
     * @throws IOException      if it fails to read or write the data from the segments
     */
    public void removeXmpXml(final byte[] src, final OutputStream os) throws ImagingException, IOException {
        final ByteSource byteSource = ByteSource.array(src);
        removeXmpXml(byteSource, os);
    }

    /**
     * Reads a JPEG image, removes all XMP XML (by removing the APP1 segment), and writes the result to a stream.
     *
     * @param byteSource ByteSource containing JPEG image data.
     * @param os         OutputStream to write the image to.
     * @throws ImagingException if it fails to read the JFIF segments
     * @throws IOException      if it fails to read or write the data from the segments
     */
    public void removeXmpXml(final ByteSource byteSource, final OutputStream os) throws ImagingException, IOException {
        final JFIFPieces jfifPieces = analyzeJfif(byteSource);
        List<JFIFPiece> pieces = jfifPieces.pieces;
        pieces = removeXmpSegments(pieces);
        writeSegments(os, pieces);
    }

    /**
     * Reads a JPEG image, removes all XMP XML (by removing the APP1 segment), and writes the result to a stream.
     *
     * @param src Image file.
     * @param os  OutputStream to write the image to.
     * @see java.io.File
     * @see java.io.OutputStream
     * @throws ImagingException if it fails to read the JFIF segments
     * @throws IOException      if it fails to read or write the data from the segments
     */
    public void removeXmpXml(final File src, final OutputStream os) throws ImagingException, IOException {
        final ByteSource byteSource = ByteSource.file(src);
        removeXmpXml(byteSource, os);
    }

    /**
     * Reads a JPEG image, removes all XMP XML (by removing the APP1 segment), and writes the result to a stream.
     *
     * @param src InputStream containing JPEG image data.
     * @param os  OutputStream to write the image to.
     * @throws ImagingException if it fails to read the JFIF segments
     * @throws IOException      if it fails to read or write the data from the segments
     */
    public void removeXmpXml(final InputStream src, final OutputStream os) throws ImagingException, IOException {
        final ByteSource byteSource = ByteSource.inputStream(src, null);
        removeXmpXml(byteSource, os);
    }

    /**
     * Reads a JPEG image, replaces the XMP XML and writes the result to a stream.
     *
     * @param src    Byte array containing JPEG image data.
     * @param os     OutputStream to write the image to.
     * @param xmpXml String containing XMP XML.
     * @throws ImagingException if it fails to read or write the JFIF segments
     * @throws IOException      if it fails to read or write the data from the segments
     */
    public void updateXmpXml(final byte[] src, final OutputStream os, final String xmpXml) throws ImagingException, IOException {
        final ByteSource byteSource = ByteSource.array(src);
        updateXmpXml(byteSource, os, xmpXml);
    }

    /**
     * Reads a JPEG image, replaces the XMP XML and writes the result to a stream.
     *
     * @param byteSource ByteSource containing JPEG image data.
     * @param os         OutputStream to write the image to.
     * @param xmpXml     String containing XMP XML.
     * @throws ImagingException if it fails to read or write the JFIF segments
     * @throws IOException      if it fails to read or write the data from the segments
     */
    public void updateXmpXml(final ByteSource byteSource, final OutputStream os, final String xmpXml) throws ImagingException, IOException {
        final JFIFPieces jfifPieces = analyzeJfif(byteSource);
        List<JFIFPiece> pieces = jfifPieces.pieces;
        pieces = removeXmpSegments(pieces);

        final List<JFIFPieceSegment> newPieces = new ArrayList<>();
        final byte[] xmpXmlBytes = xmpXml.getBytes(StandardCharsets.UTF_8);
        int index = 0;
        while (index < xmpXmlBytes.length) {
            final int segmentSize = Math.min(xmpXmlBytes.length, JpegConstants.MAX_SEGMENT_SIZE);
            final byte[] segmentData = writeXmpSegment(xmpXmlBytes, index, segmentSize);
            newPieces.add(new JFIFPieceSegment(JpegConstants.JPEG_APP1_MARKER, segmentData));
            index += segmentSize;
        }

        pieces = insertAfterLastAppSegments(pieces, newPieces);

        writeSegments(os, pieces);
    }

    /**
     * Reads a JPEG image, replaces the XMP XML and writes the result to a stream.
     *
     * @param src    Image file.
     * @param os     OutputStream to write the image to.
     * @param xmpXml String containing XMP XML.
     * @throws ImagingException if it fails to read or write the JFIF segments
     * @throws IOException      if it fails to read or write the data from the segments
     */
    public void updateXmpXml(final File src, final OutputStream os, final String xmpXml) throws ImagingException, IOException {
        final ByteSource byteSource = ByteSource.file(src);
        updateXmpXml(byteSource, os, xmpXml);
    }

    /**
     * Reads a JPEG image, replaces the XMP XML and writes the result to a stream.
     *
     * @param src    InputStream containing JPEG image data.
     * @param os     OutputStream to write the image to.
     * @param xmpXml String containing XMP XML.
     * @throws ImagingException if it fails to read or write the JFIF segments
     * @throws IOException      if it fails to read or write the data from the segments
     */
    public void updateXmpXml(final InputStream src, final OutputStream os, final String xmpXml) throws ImagingException, IOException {
        final ByteSource byteSource = ByteSource.inputStream(src, null);
        updateXmpXml(byteSource, os, xmpXml);
    }

    private byte[] writeXmpSegment(final byte[] xmpXmlData, final int start, final int length) throws IOException {
        final ByteArrayOutputStream os = new ByteArrayOutputStream();

        JpegConstants.XMP_IDENTIFIER.writeTo(os);
        os.write(xmpXmlData, start, length);

        return os.toByteArray();
    }

}
