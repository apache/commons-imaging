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

import static org.apache.commons.imaging.common.BinaryFunctions.readBytes;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public abstract class GenericSegment extends AbstractSegment {
    private final byte[] segmentData;

    public GenericSegment(final int marker, final byte[] bytes) {
        super(marker, bytes.length);

        this.segmentData = bytes.clone();
    }

    public GenericSegment(final int marker, final int markerLength, final InputStream is) throws IOException {
        super(marker, markerLength);

        segmentData = readBytes("Segment Data", is, markerLength, "Invalid Segment: insufficient data");
    }

    @Override
    public void dump(final PrintWriter pw) {
        dump(pw, 0);
    }

    public void dump(final PrintWriter pw, final int start) {
        for (int i = 0; i < 50 && i + start < segmentData.length; i++) {
            debugNumber(pw, "\t" + (i + start), segmentData[i + start], 1);
        }
    }

    /**
     * Returns a copy of the segment's contents, excluding the marker and length bytes at the beginning.
     *
     * @return the segment's contents
     */
    public byte[] getSegmentData() {
        return segmentData.clone();
    }

    /**
     * Returns a specific byte of the segment's contents, excluding the marker and length bytes at the beginning.
     *
     * @param offset segment offset
     * @see GenericSegment#getSegmentData()
     * @return the bye in the segment's contents
     */
    protected byte getSegmentData(final int offset) {
        return segmentData[offset];
    }

    /**
     * Convert the bytes to a String
     *
     * @param encoding segment encoding
     * @return the encoded bytes
     */
    public String getSegmentDataAsString(final Charset encoding) {
        return new String(segmentData, encoding);
    }

}
