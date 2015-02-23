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
package org.apache.commons.imaging.formats.jpeg.segments;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImagingParameters;
import org.apache.commons.imaging.formats.jpeg.JpegImageParser;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcParser;
import org.apache.commons.imaging.formats.jpeg.iptc.PhotoshopApp13Data;

public class App13Segment extends AppnSegment {
    protected final JpegImageParser parser;

    // public final List elements = new ArrayList();
    // public final boolean isIPTCJpegSegment;

    public App13Segment(final JpegImageParser parser, final int marker, final byte[] segmentData)
            throws IOException {
        this(parser, marker, segmentData.length, new ByteArrayInputStream(
                segmentData));
    }

    public App13Segment(final JpegImageParser parser, final int marker, final int markerLength,
            final InputStream is) throws IOException {
        super(marker, markerLength, is);
        this.parser = parser;

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

    public boolean isPhotoshopJpegSegment() {
        return new IptcParser().isPhotoshopJpegSegment(getSegmentData());
    }

    public PhotoshopApp13Data parsePhotoshopSegment(final ImagingParameters params)
            throws ImageReadException, IOException {
        /*
         * In practice, App13 segments are only used for Photoshop/IPTC
         * metadata. However, we should not treat App13 signatures without
         * Photoshop's signature as Photoshop/IPTC segments.
         */
        if (!isPhotoshopJpegSegment()) {
            return null;
        }

        return new IptcParser().parsePhotoshopSegment(getSegmentData(), params);
    }
}
