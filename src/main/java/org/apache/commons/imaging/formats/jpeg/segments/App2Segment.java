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

import static org.apache.commons.imaging.common.BinaryFunctions.readAndVerifyBytes;
import static org.apache.commons.imaging.common.BinaryFunctions.readByte;
import static org.apache.commons.imaging.common.BinaryFunctions.readBytes;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;

/**
 * Represents a JPEG APP2 segment, typically used for ICC color profiles.
 */
public final class App2Segment extends AppnSegment implements Comparable<App2Segment> {
    private final byte[] iccBytes;

    /** The current marker index. */
    public final int curMarker;

    /** The total number of markers. */
    public final int numMarkers;

    /**
     * Constructs an APP2 segment from segment data.
     *
     * @param marker the segment marker.
     * @param segmentData the segment data.
     * @throws ImagingException if the image format is invalid.
     * @throws IOException if an I/O error occurs.
     */
    public App2Segment(final int marker, final byte[] segmentData) throws ImagingException, IOException {
        this(marker, segmentData.length, new ByteArrayInputStream(segmentData));
    }

    /**
     * Constructs an APP2 segment by reading from an input stream.
     *
     * @param marker the segment marker.
     * @param markerLength the marker length.
     * @param is2 the input stream to read from.
     * @throws ImagingException if the image format is invalid.
     * @throws IOException if an I/O error occurs.
     */
    public App2Segment(final int marker, int markerLength, final InputStream is2) throws ImagingException, IOException {
        super(marker, markerLength, is2);

        if (JpegConstants.ICC_PROFILE_LABEL.isStartOf(getSegmentData())) {
            final InputStream is = new ByteArrayInputStream(getSegmentData());

            readAndVerifyBytes(is, JpegConstants.ICC_PROFILE_LABEL, "Not a Valid App2 Segment: missing ICC Profile label");

            curMarker = readByte("curMarker", is, "Not a valid App2 Marker");
            numMarkers = readByte("numMarkers", is, "Not a valid App2 Marker");

            markerLength -= JpegConstants.ICC_PROFILE_LABEL.size();
            markerLength -= 1 + 1;

            iccBytes = readBytes("App2 Data", is, markerLength, "Invalid App2 Segment: insufficient data");
        } else {
            // debugByteArray("Unknown APP2 Segment Type", bytes);
            curMarker = -1;
            numMarkers = -1;
            iccBytes = null;
        }
    }

    @Override
    public int compareTo(final App2Segment other) {
        return curMarker - other.curMarker;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj instanceof App2Segment) {
            final App2Segment other = (App2Segment) obj;
            return curMarker == other.curMarker;
        }
        return false;
    }

    /**
     * Gets the ICC profile bytes.
     *
     * @return the ICC bytes, or {@code null} if not present.
     */
    public byte[] getIccBytes() {
        return iccBytes != null ? iccBytes.clone() : null;
    }

    @Override
    public int hashCode() {
        return curMarker;
    }
}
