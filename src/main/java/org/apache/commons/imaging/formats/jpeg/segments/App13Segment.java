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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.ImagingParameters;
import org.apache.commons.imaging.formats.jpeg.JpegImagingParameters;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcParser;
import org.apache.commons.imaging.formats.jpeg.iptc.PhotoshopApp13Data;

/**
 * Represents a JPEG APP13 segment, typically used for Photoshop/IPTC metadata.
 */
public class App13Segment extends AppnSegment {

    /**
     * Constructs an APP13 segment from segment data.
     *
     * @param marker the segment marker.
     * @param segmentData the segment data.
     * @throws IOException if an I/O error occurs.
     */
    public App13Segment(final int marker, final byte[] segmentData) throws IOException {
        this(marker, segmentData.length, new ByteArrayInputStream(segmentData));
    }

    /**
     * Constructs an APP13 segment by reading from an input stream.
     *
     * @param marker the segment marker.
     * @param markerLength the marker length.
     * @param is the input stream to read from.
     * @throws IOException if an I/O error occurs.
     */
    public App13Segment(final int marker, final int markerLength, final InputStream is) throws IOException {
        super(marker, markerLength, is);

        // isIPTCJpegSegment = new IptcParser().isIPTCJpegSegment(bytes);
        // if (isIPTCJpegSegment)
        // {
        // /*
        // * In practice, App13 segments are only used for Photoshop/IPTC
        // * metadata. However, we should not treat App13 signatures without
        // * Photoshop's signature as Photoshop/IPTC segments.
        // */
        // boolean verbose = false;
        // boolean strict = false;
        // elements.addAll(new IptcParser().parseIPTCJPEGSegment(bytes,
        // verbose, strict));
        // }
    }

    /**
     * Checks if this segment is a Photoshop JPEG segment.
     *
     * @return {@code true} if this is a Photoshop segment, {@code false} otherwise.
     */
    public boolean isPhotoshopJpegSegment() {
        return new IptcParser().isPhotoshopJpegSegment(getSegmentData());
    }

    /**
     * Parses the Photoshop segment data.
     *
     * @param params the imaging parameters.
     * @return the parsed Photoshop APP13 data, or {@code null} if not a Photoshop segment.
     * @throws ImagingException if the image format is invalid.
     * @throws IOException if an I/O error occurs.
     */
    public PhotoshopApp13Data parsePhotoshopSegment(final ImagingParameters<JpegImagingParameters> params) throws ImagingException, IOException {
        /*
         * In practice, App13 segments are only used for Photoshop/IPTC metadata. However, we should not treat App13 signatures without Photoshop's signature as
         * Photoshop/IPTC segments.
         */
        if (!isPhotoshopJpegSegment()) {
            return null;
        }

        return new IptcParser().parsePhotoshopSegment(getSegmentData(), params);
    }
}
