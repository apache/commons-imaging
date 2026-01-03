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

package org.apache.commons.imaging.formats.jpeg.segments;

import static org.apache.commons.imaging.common.BinaryFunctions.read2Bytes;
import static org.apache.commons.imaging.common.BinaryFunctions.readByte;
import static org.apache.commons.imaging.common.BinaryFunctions.readBytes;
import static org.apache.commons.imaging.common.BinaryFunctions.skipBytes;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;

/**
 * A JFIF (JPEG File Interchange Format) segment.
 */
public final class JfifSegment extends AbstractSegment {

    /** JFIF major version number. */
    public final int jfifMajorVersion;

    /** JFIF minor version number. */
    public final int jfifMinorVersion;

    /** Density units (0 = no units, 1 = pixels per inch, 2 = pixels per cm). */
    public final int densityUnits;

    /** Horizontal pixel density. */
    public final int xDensity;

    /** Vertical pixel density. */
    public final int yDensity;

    /** Thumbnail width in pixels. */
    public final int xThumbnail;

    /** Thumbnail height in pixels. */
    public final int yThumbnail;

    /** Thumbnail size in bytes. */
    public final int thumbnailSize;

    /**
     * Constructs a new JFIF segment from segment data.
     *
     * @param marker      the segment marker.
     * @param segmentData the segment data bytes.
     * @throws ImagingException if an imaging error occurs.
     * @throws IOException      if an I/O error occurs.
     */
    public JfifSegment(final int marker, final byte[] segmentData) throws ImagingException, IOException {
        this(marker, segmentData.length, new ByteArrayInputStream(segmentData));
    }

    /**
     * Constructs a new JFIF segment from an input stream.
     *
     * @param marker       the segment marker.
     * @param markerLength the marker length.
     * @param is           the input stream.
     * @throws ImagingException if an imaging error occurs.
     * @throws IOException      if an I/O error occurs.
     */
    public JfifSegment(final int marker, final int markerLength, final InputStream is) throws ImagingException, IOException {
        super(marker, markerLength);
        final byte[] signature = readBytes(is, JpegConstants.JFIF0_SIGNATURE.size());
        if (!JpegConstants.JFIF0_SIGNATURE.equals(signature) && !JpegConstants.JFIF0_SIGNATURE_ALTERNATIVE.equals(signature)) {
            throw new ImagingException("Not a Valid JPEG File: missing JFIF string");
        }
        jfifMajorVersion = readByte("jfifMajorVersion", is, "Not a Valid JPEG File");
        jfifMinorVersion = readByte("jfifMinorVersion", is, "Not a Valid JPEG File");
        densityUnits = readByte("densityUnits", is, "Not a Valid JPEG File");
        xDensity = read2Bytes("xDensity", is, "Not a Valid JPEG File", getByteOrder());
        yDensity = read2Bytes("yDensity", is, "Not a Valid JPEG File", getByteOrder());
        xThumbnail = readByte("xThumbnail", is, "Not a Valid JPEG File");
        yThumbnail = readByte("yThumbnail", is, "Not a Valid JPEG File");
        thumbnailSize = xThumbnail * yThumbnail;
        if (thumbnailSize > 0) {
            skipBytes(is, thumbnailSize, "Not a Valid JPEG File: missing thumbnail");
        }
    }

    @Override
    public String getDescription() {
        return "JFIF (" + getSegmentType() + ")";
    }
}
