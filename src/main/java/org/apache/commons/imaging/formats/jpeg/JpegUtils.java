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
package org.apache.commons.imaging.formats.jpeg;

import static org.apache.commons.imaging.common.BinaryFunctions.getStreamBytes;
import static org.apache.commons.imaging.common.BinaryFunctions.readAndVerifyBytes;
import static org.apache.commons.imaging.common.BinaryFunctions.readByte;
import static org.apache.commons.imaging.common.BinaryFunctions.readBytes;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.BinaryFileParser;
import org.apache.commons.imaging.common.ByteConversions;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.internal.Debug;

public class JpegUtils extends BinaryFileParser {
    public JpegUtils() {
        setByteOrder(ByteOrder.BIG_ENDIAN);
    }

    public interface Visitor {
        // return false to exit before reading image data.
        boolean beginSOS();

        void visitSOS(int marker, byte[] markerBytes, byte[] imageData);

        // return false to exit traversal.
        boolean visitSegment(int marker, byte[] markerBytes,
                int segmentLength, byte[] segmentLengthBytes,
                byte[] segmentData) throws ImageReadException,
                IOException;
    }

    public void traverseJFIF(final ByteSource byteSource, final Visitor visitor)
            throws ImageReadException,
            IOException {
        try (InputStream is = byteSource.getInputStream()) {
            readAndVerifyBytes(is, JpegConstants.SOI,
                    "Not a Valid JPEG File: doesn't begin with 0xffd8");

            int markerCount;
            for (markerCount = 0; true; markerCount++) {
                final byte[] markerBytes = new byte[2];
                do {
                    markerBytes[0] = markerBytes[1];
                    markerBytes[1] = readByte("marker", is,
                            "Could not read marker");
                } while ((0xff & markerBytes[0]) != 0xff
                        || (0xff & markerBytes[1]) == 0xff);
                final int marker = ((0xff & markerBytes[0]) << 8)
                        | (0xff & markerBytes[1]);

                if (marker == JpegConstants.EOI_MARKER || marker == JpegConstants.SOS_MARKER) {
                    if (!visitor.beginSOS()) {
                        return;
                    }

                    final byte[] imageData = getStreamBytes(is);
                    visitor.visitSOS(marker, markerBytes, imageData);
                    break;
                }

                final byte[] segmentLengthBytes = readBytes("segmentLengthBytes", is, 2, "segmentLengthBytes");
                final int segmentLength = ByteConversions.toUInt16(segmentLengthBytes, getByteOrder());
                if (segmentLength < 2) {
                    throw new ImageReadException("Invalid segment size");
                }

                final byte[] segmentData = readBytes("Segment Data",
                        is, segmentLength - 2,
                        "Invalid Segment: insufficient data");

                if (!visitor.visitSegment(marker, markerBytes, segmentLength, segmentLengthBytes, segmentData)) {
                    return;
                }
            }

            Debug.debug(Integer.toString(markerCount) + " markers");
        }
    }

    public static String getMarkerName(final int marker) {
        switch (marker) {
        case JpegConstants.SOS_MARKER:
            return "SOS_MARKER";
            // case JPEG_APP0 :
            // return "JPEG_APP0";
            // case JPEG_APP0_MARKER :
            // return "JPEG_APP0_MARKER";
        case JpegConstants.JPEG_APP1_MARKER:
            return "JPEG_APP1_MARKER";
        case JpegConstants.JPEG_APP2_MARKER:
            return "JPEG_APP2_MARKER";
        case JpegConstants.JPEG_APP13_MARKER:
            return "JPEG_APP13_MARKER";
        case JpegConstants.JPEG_APP14_MARKER:
            return "JPEG_APP14_MARKER";
        case JpegConstants.JPEG_APP15_MARKER:
            return "JPEG_APP15_MARKER";
        case JpegConstants.JFIF_MARKER:
            return "JFIF_MARKER";
        case JpegConstants.SOF0_MARKER:
            return "SOF0_MARKER";
        case JpegConstants.SOF1_MARKER:
            return "SOF1_MARKER";
        case JpegConstants.SOF2_MARKER:
            return "SOF2_MARKER";
        case JpegConstants.SOF3_MARKER:
            return "SOF3_MARKER";
        case JpegConstants.DHT_MARKER:
            return "SOF4_MARKER";
        case JpegConstants.SOF5_MARKER:
            return "SOF5_MARKER";
        case JpegConstants.SOF6_MARKER:
            return "SOF6_MARKER";
        case JpegConstants.SOF7_MARKER:
            return "SOF7_MARKER";
        case JpegConstants.SOF8_MARKER:
            return "SOF8_MARKER";
        case JpegConstants.SOF9_MARKER:
            return "SOF9_MARKER";
        case JpegConstants.SOF10_MARKER:
            return "SOF10_MARKER";
        case JpegConstants.SOF11_MARKER:
            return "SOF11_MARKER";
        case JpegConstants.DAC_MARKER:
            return "DAC_MARKER";
        case JpegConstants.SOF13_MARKER:
            return "SOF13_MARKER";
        case JpegConstants.SOF14_MARKER:
            return "SOF14_MARKER";
        case JpegConstants.SOF15_MARKER:
            return "SOF15_MARKER";
        case JpegConstants.DQT_MARKER:
            return "DQT_MARKER";
        default:
            return "Unknown";
        }
    }

    public void dumpJFIF(final ByteSource byteSource) throws ImageReadException,
            IOException {
        final Visitor visitor = new Visitor() {
            // return false to exit before reading image data.
            @Override
            public boolean beginSOS() {
                return true;
            }

            @Override
            public void visitSOS(final int marker, final byte[] markerBytes, final byte[] imageData) {
                Debug.debug("SOS marker.  " + imageData.length + " bytes of image data.");
                Debug.debug("");
            }

            // return false to exit traversal.
            @Override
            public boolean visitSegment(final int marker, final byte[] markerBytes,
                    final int segmentLength, final byte[] segmentLengthBytes,
                    final byte[] segmentData) {
                Debug.debug("Segment marker: " + Integer.toHexString(marker)
                        + " (" + getMarkerName(marker) + "), "
                        + segmentData.length + " bytes of segment data.");
                return true;
            }
        };

        traverseJFIF(byteSource, visitor);
    }
}
