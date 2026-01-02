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

import static org.apache.commons.imaging.common.BinaryFunctions.startsWith;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * Represents a JPEG APP14 segment, used for Adobe color transform information.
 *
 * @see <a href="http://www.aiim.org/documents/standards/PDF-Ref/References/Adobe/5116.DCT_Filter.pdf">Adobe DCT Filter</a>
 */
public class App14Segment extends AppnSegment {
    private static final byte[] ADOBE_PREFIX;

    /** Adobe color transform unknown. */
    public static final int ADOBE_COLOR_TRANSFORM_UNKNOWN = 0;

    /** Adobe color transform YCbCr. */
    public static final int ADOBE_COLOR_TRANSFORM_YCbCr = 1;

    /** Adobe color transform YCCK. */
    public static final int ADOBE_COLOR_TRANSFORM_YCCK = 2;

    static {
        ADOBE_PREFIX = "Adobe".getBytes(StandardCharsets.US_ASCII);
    }

    /**
     * Constructs an APP14 segment from segment data.
     *
     * @param marker the segment marker.
     * @param segmentData the segment data.
     * @throws IOException if an I/O error occurs.
     */
    public App14Segment(final int marker, final byte[] segmentData) throws IOException {
        this(marker, segmentData.length, new ByteArrayInputStream(segmentData));
    }

    /**
     * Constructs an APP14 segment by reading from an input stream.
     *
     * @param marker the segment marker.
     * @param markerLength the marker length.
     * @param is the input stream to read from.
     * @throws IOException if an I/O error occurs.
     */
    public App14Segment(final int marker, final int markerLength, final InputStream is) throws IOException {
        super(marker, markerLength, is);
    }

    /**
     * Gets the Adobe color transform value.
     *
     * @return the color transform value.
     */
    public int getAdobeColorTransform() {
        return 0xff & getSegmentData(11);
    }

    /**
     * Checks if this segment is an Adobe JPEG segment.
     *
     * @return {@code true} if this is an Adobe segment, {@code false} otherwise.
     */
    public boolean isAdobeJpegSegment() {
        return startsWith(getSegmentData(), ADOBE_PREFIX);
    }
}
