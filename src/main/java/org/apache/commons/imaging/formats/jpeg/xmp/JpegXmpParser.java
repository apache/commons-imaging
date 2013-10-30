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

package org.apache.commons.imaging.formats.jpeg.xmp;

import java.io.UnsupportedEncodingException;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.BinaryFileParser;
import org.apache.commons.imaging.common.ByteOrder;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;

public class JpegXmpParser extends BinaryFileParser implements JpegConstants {

    public JpegXmpParser() {
        setByteOrder(ByteOrder.NETWORK);
    }

    public boolean isXmpJpegSegment(final byte segmentData[]) {
        return BinaryFileParser.startsWith(segmentData, XMP_IDENTIFIER);
    }

    public String parseXmpJpegSegment(final byte segmentData[])
            throws ImageReadException {
        if (!isXmpJpegSegment(segmentData)) {
            throw new ImageReadException("Invalid JPEG XMP Segment.");
        }
        final int index = XMP_IDENTIFIER.size();

        try {
            // segment data is UTF-8 encoded xml.
            final String xml = new String(segmentData, index, segmentData.length
                    - index, "utf-8");
            return xml;
        } catch (final UnsupportedEncodingException e) {
            throw new ImageReadException("Invalid JPEG XMP Segment.");
        }
    }

}
